package com.channeladvisor.service.impl;

//import com.adyen.v6.constants.Adyenv6coreConstants;

import com.customcore.model.BaseStoreConfigurationModel;
import com.customcore.util.DateUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.ltb.cargo.model.CityModel;
import com.channeladvisor.data.FulfillmentData;
import com.channeladvisor.data.OrderData;
import com.channeladvisor.data.ProductData;
import com.channeladvisor.data.ShippingStatus;
import com.channeladvisor.forms.CAOrderEntryReturnForm;
import com.channeladvisor.model.*;
import com.channeladvisor.models.OrderPair;
import com.channeladvisor.models.ProductPair;
import com.channeladvisor.rest.command.response.*;
import com.channeladvisor.service.ChannelAdvisorService;
import com.channeladvisor.service.DeliveryStatusMappingService;
import com.channeladvisor.service.IntegrationService;
/*
import com.ltb.core.model.BaseStoreConfigurationModel;
import com.ltb.core.model.IntegrationCronJobModel;
import com.ltb.core.model.LtbSizeAndLengthVariantProductModel;
import com.ltb.core.model.RequestLogModel;
import com.ltb.core.service.LtbProductService;
import com.ltb.core.services.LtbOrderService;
import com.ltb.core.services.LtbStockService;
import com.ltb.core.util.DateUtil;
*/
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.basecommerce.enums.ConsignmentStatus;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.ordersplitting.model.ConsignmentProcessModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.processengine.BusinessProcessEvent;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.processengine.enums.ProcessState;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

public class DefaultChannelAdvisorService implements ChannelAdvisorService {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultChannelAdvisorService.class);
    @Resource
    private BaseStoreService baseStoreService;
    /*@Resource
    private LtbProductService productService;*/
    @Resource
    private ModelService modelService;
    /*@Resource
    private LtbStockService stockService;*/
    /*@Resource(name = "ltbOrderService")
    private LtbOrderService orderService;*/
    @Resource
    private IntegrationService integrationService;
    @Resource
    private DeliveryStatusMappingService deliveryStatusMappingService;
    @Resource
    private BusinessProcessService businessProcessService;
    @Resource(name = "restCommandObjectMapper")
    private ObjectMapper mapper;

    @Override
    public CAConfigurationModel getCAConfiguration() {
        return getCAConfiguration(baseStoreService.getCurrentBaseStore());
    }

    @Override
    public CAConfigurationModel getCAConfiguration(BaseStoreModel baseStore) {
        return Optional.ofNullable(baseStore)
                .map(BaseStoreModel::getConfiguration)
                .map(BaseStoreConfigurationModel::getCAConfiguration)
                .orElse(null);
    }

    @Override
    public String getAccessToken(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, boolean force) {
        final Date now = new Date();
        final Date expirationDate = account.getAccessTokenExpirationDate();
        final String accessToken = account.getAccessToken();
        if (force || StringUtils.isBlank(accessToken)
                || Objects.isNull(expirationDate)
                || now.after(expirationDate)) {
            final PostRefreshTokenResponse response = integrationService.requestRefreshToken(baseStore, account);
            if (Objects.nonNull(response) && StringUtils.isNotBlank(response.getAccessToken())) {
                account.setAccessToken(response.getAccessToken());
                if (Objects.nonNull(response.getExpiresIn())) {
                    account.setAccessTokenExpirationDate(DateUtil.addSecondToDate(now, response.getExpiresIn()));
                }
                modelService.save(account);
                return response.getAccessToken();
            }
        }
        return accessToken;
    }

    @Override
    public String getAccessToken(BaseStoreModel baseStore, ChannelAdvisorAccountModel account) {
        return getAccessToken(baseStore, account, false);
    }

    @Override
    public String getAccessToken(BaseStoreModel baseStore) {
        final ChannelAdvisorAccountModel account = getChannelAdvisorAccount(baseStore);
        if (Objects.nonNull(account)) {
            return getAccessToken(baseStore, account, false);
        }
        return StringUtils.EMPTY;
    }

    @Override
    public ChannelAdvisorAccountModel getChannelAdvisorAccount(BaseStoreModel baseStore) {
        return Optional.ofNullable(getCAConfiguration(baseStore)).map(CAConfigurationModel::getAccount).orElse(null);
    }

    @Override
    public GetProductsResponse getProductsForPartialStockUpdate(final BaseStoreModel baseStore, final ChannelAdvisorAccountModel account,
                                                                final Date filterDate, final Integer skip, final CAPartialStockUpdateJobModel jobModel) {
        final String filter = "QuantityUpdateDateUtc ge " + DateUtil.formatDate(filterDate, DateUtil.CA_DATE_FORMAT);
        final String select = "ID,QuantityUpdateDateUtc,EAN,TotalAvailableQuantity";
        return integrationService.requestGetProducts(baseStore, account, filter, select, skip, jobModel);
    }

    @Override
    public void updateStockOfProducts(final List<? extends ProductData> productDataList, final BaseStoreModel baseStore, boolean partition) {
        if (CollectionUtils.isNotEmpty(productDataList)) {
            if (partition) {
                List<? extends List<? extends ProductData>> partitionList = ListUtils.partition(productDataList, 100);
                partitionList.stream().forEach(partitionOfProductDataList -> updateStockOfProducts(partitionOfProductDataList, baseStore));
            } else {
                updateStockOfProducts(productDataList, baseStore);
            }
        }
    }

    @Override
    public void updateStockOfProducts(final List<? extends ProductData> productDataList, final BaseStoreModel baseStore) {
        if (CollectionUtils.isNotEmpty(productDataList)) {
            final WarehouseModel warehouseModel = baseStore.getWarehouses().stream().findFirst().orElse(null);
            ;
            if (Objects.nonNull(warehouseModel)) {
                final Set<String> eanSet = productDataList.stream().map(ProductData::getEan).collect(Collectors.toSet());
                //final List<LtbSizeAndLengthVariantProductModel> productModelList = productService.findByEan(eanSet);
                final List<ProductModel> productModelList = Collections.EMPTY_LIST;
                final Collection<ProductPair> productPairs = matchProducts(productModelList, productDataList);
                productPairs.stream().forEach(productPair -> {
                    final ProductData productData = productPair.getProductData();
                    //final LtbSizeAndLengthVariantProductModel productModel = productPair.getProductModel();
                    final ProductModel productModel = productPair.getProductModel();
                    if (Objects.nonNull(productModel) && productData.getTotalAvailableQuantity() >= 0) {
                        //stockService.updateActualStockAndInventoryEvents(productModel, warehouseModel, productData.getTotalAvailableQuantity());
                    } else {
                        LOG.warn("CHANNEL-ADVISOR-STOCK-UPDATE LtbSizeAndLengthVariantProductModel is missing. ean: {}", productData.getEan());
                    }
                });
            } else {
                LOG.error("CHANNEL-ADVISOR-STOCK-UPDATE WarehouseModel is null. baseStore: {}", baseStore.getUid());
            }
        }
    }

    @Override
    public GetOrdersResponse getOrdersForPartialUpdate(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, Date filterDate, Integer skip, IntegrationCronJobModel jobModel,
                                                       Collection<BaseSiteModel> sites) {
        final StringBuilder filterBuilder = new StringBuilder();
        filterBuilder.append("UpdatedDateUtc ge ").append(DateUtil.formatDate(filterDate, DateUtil.CA_DATE_FORMAT));
        final String siteNameCondition = getSiteNameCondition(sites);
        if (StringUtils.isNotBlank(siteNameCondition)) {
            filterBuilder.append(" and ").append(siteNameCondition);
        }
        final String select = "ID,SiteOrderID,PublicNotes,ShippingStatus";
        final String expand = "Fulfillments($select=TrackingNumber)";
        return integrationService.requestGetOrders(baseStore, account, filterBuilder.toString(), select, skip, expand, jobModel);
    }

    @Override
    public String getSiteNameCondition(Collection<BaseSiteModel> sites) {
        if (CollectionUtils.isNotEmpty(sites)) {
            StringBuilder siteNameConditionBuilder = new StringBuilder();
            final Iterator<BaseSiteModel> siteIterator = sites.iterator();
            while (siteIterator.hasNext()) {
                final BaseSiteModel currentBaseStore = siteIterator.next();
                final String siteName = currentBaseStore.getName(Locale.ENGLISH);
                if (StringUtils.isNotBlank(siteName)) {
                    if (siteNameConditionBuilder.length() == 0) {
                        siteNameConditionBuilder.append("(");
                    } else if (siteNameConditionBuilder.length() > 1) {
                        siteNameConditionBuilder.append(" or ");
                    }
                    siteNameConditionBuilder.append("SiteName eq '").append(siteName).append("'");
                }
            }
            if (siteNameConditionBuilder.length() > 0) {
                siteNameConditionBuilder.append(")");
                return siteNameConditionBuilder.toString();
            }
        }
        return StringUtils.EMPTY;
    }

    @Override
    public void updateOrdersFromCA(List<OrderData> orderDataList) {
        if (CollectionUtils.isNotEmpty(orderDataList)) {
            final Set<String> orderCodeSet = orderDataList.stream().map(OrderData::getSiteOrderID).collect(Collectors.toSet());
            final List<OrderModel> orderModelList = Collections.EMPTY_LIST;//orderService.findByCode(orderCodeSet);
            final Collection<OrderPair> orderPairs = matchOrders(orderModelList, orderDataList);
            final Set<ItemModel> updatedItems = new HashSet<>();
            orderPairs.stream().forEach(orderPair -> {
                final OrderData orderData = orderPair.getOrderData();
                final OrderModel orderModel = orderPair.getOrderModel();
                if (Objects.nonNull(orderModel)) {
                    updateOrder(orderModel, orderData, updatedItems);
                } else {
                    LOG.warn("CHANNEL-ADVISOR-ORDER-UPDATE OrderModel is missing. siteOrderID: {}", orderData.getSiteOrderID());
                }
            });
            modelService.saveAll(updatedItems);
        }
    }

    private void updateOrder(OrderModel orderModel, OrderData orderData, Set<ItemModel> updatedItems) {
        final Set<ConsignmentModel> consignments = orderModel.getConsignments();
        if (Objects.nonNull(consignments)) {
            ConsignmentModel consignment = consignments.stream()
                    .filter(consignmentModel -> !ConsignmentStatus.CANCELLED.equals(consignmentModel.getStatus()))
                    .findFirst().orElse(null);
            if (Objects.nonNull(consignment)) {
                updateConsignmentAndOrderStatus(orderModel, consignment, orderData, updatedItems);
                updateTrackingNumber(consignment, orderData, updatedItems);
            } else {
                LOG.warn("CHANNEL-ADVISOR-ORDER-UPDATE the order({}) don't have active consignment.", orderModel.getPk());
            }
        } else {
            LOG.warn("CHANNEL-ADVISOR-ORDER-UPDATE Consignments list is empty for the order({}).", orderModel.getPk());
        }
    }

    private void updateConsignmentAndOrderStatus(OrderModel order, ConsignmentModel consignment, OrderData orderData, Set<ItemModel> updatedItems) {
        final List<DeliveryStatusHistoryModel> deliveryStatusHistories = new ArrayList<>(consignment.getDeliveryStatusHistories());
        final DeliveryStatusHistoryModel lastDeliveryStatusHistory = CollectionUtils.isNotEmpty(deliveryStatusHistories) ? deliveryStatusHistories.get(0) : null;
        String publicNotes = orderData.getPublicNotes(); // the format be like Delivered,10-01-2023 15:10:50
        final ShippingStatus shippingStatus = orderData.getShippingStatus();
        if (StringUtils.isBlank(publicNotes) && ShippingStatus.Shipped.equals(shippingStatus)) {
            publicNotes = ShippingStatus.Shipped.getValue() + "," + DateUtil.formatDate(new Date(), DateUtil.CA_DATE_FORMAT);
        } else if (ShippingStatus.Canceled.equals(shippingStatus)) {
            publicNotes = ShippingStatus.Canceled.getValue() + "," + DateUtil.formatDate(new Date(), DateUtil.CA_DATE_FORMAT);
        }
        if (StringUtils.isNotBlank(publicNotes)) {
            String[] splittedPublicNotes = publicNotes.split(",");
            if (splittedPublicNotes.length == 2) {
                final String receivedStatus = splittedPublicNotes[0];
                if (Objects.isNull(lastDeliveryStatusHistory) || !receivedStatus.equals(lastDeliveryStatusHistory.getReceivedStatus())) {
                    DeliveryStatusMappingModel deliveryStatusMapping = deliveryStatusMappingService.findByCode(receivedStatus);
                    if (Objects.nonNull(deliveryStatusMapping)) {
                        // update consignment status
                        ConsignmentStatus newStatus = deliveryStatusMapping.getConsignmentStatus();
                        consignment.setStatus(newStatus);
                        DeliveryStatusHistoryModel historyModel = createDeliveryStatusHistroy(receivedStatus, newStatus, splittedPublicNotes[1]);
                        deliveryStatusHistories.add(0, historyModel);
                        consignment.setDeliveryStatusHistories(deliveryStatusHistories);
                        updatedItems.add(historyModel);
                        updatedItems.add(consignment);
                        // update order status
                        order.setStatus(deliveryStatusMapping.getOrderStatus());
                        updatedItems.add(order);
                        // update consignment-process
                        final ConsignmentProcessModel consignmentProcess = consignment.getConsignmentProcesses().stream().filter(x -> x.getProcessState() == ProcessState.WAITING).findAny()
                                .orElse(null);
                        if (Objects.nonNull(consignmentProcess)) {
                            final BusinessProcessEvent event = BusinessProcessEvent
                                    .builder(consignmentProcess.getCode() + "Adyenv6coreConstants.WAIT_FOR_CHANNEL_ADVISOR")
                                    .withChoice(deliveryStatusMapping.getConsignmentProcessWaitChoice())
                                    .build();
                            businessProcessService.triggerEvent(event);
                        }
                    } else {
                        LOG.warn("CHANNEL-ADVISOR-ORDER-UPDATE there is no ConsignmentStatus for received status: {}.", receivedStatus);
                    }
                }
            } else {
                LOG.warn("CHANNEL-ADVISOR-ORDER-UPDATE there is a problem about publicNotes field: {}", publicNotes);
            }
        }
    }

    private void updateTrackingNumber(ConsignmentModel consignment, OrderData orderData, Set<ItemModel> updatedItems) {
        final String trackingNumber = consignment.getTrackingID();
        if (StringUtils.isBlank(trackingNumber)) {
            final FulfillmentData fulfillmentData = CollectionUtils.isNotEmpty(orderData.getFulfillments()) ? orderData.getFulfillments().get(0) : null;
            if (Objects.nonNull(fulfillmentData) && StringUtils.isNotBlank(fulfillmentData.getTrackingNumber())) {
                consignment.setTrackingID(fulfillmentData.getTrackingNumber());
                updatedItems.add(consignment);
            }
        }
    }

    private DeliveryStatusHistoryModel createDeliveryStatusHistroy(String receivedStatus, ConsignmentStatus newStatus, String date) {
        DeliveryStatusHistoryModel history = modelService.create(DeliveryStatusHistoryModel.class);
        history.setReceivedStatus(receivedStatus);
        history.setUpdatedAs(newStatus);
        history.setDate(DateUtil.parseDate(date, DateUtil.CA_DATE_FORMAT));
        history.setDateStr(date);
        return history;
    }

    @Override
    public OrderResponse createOrUpdateOrder(OrderModel order) {
        OrderResponse response = Objects.nonNull(getSuccessCreateOrderRequestLog(order)) ? integrationService.requestPatchOrder(order)
                : integrationService.requestCreateOrder(order);
        return response;
    }

    @Override
    public Integer getCAOrderId(OrderModel order) {
        RequestLogModel response = getSuccessCreateOrderRequestLog(order);
        if (Objects.nonNull(response)) {
            PostCreateOrderResponse responseClass = (PostCreateOrderResponse) getResponseClass(response.getResponseBody(), PostCreateOrderResponse.class);
            if (Objects.nonNull(responseClass)) {
                return responseClass.getId();
            }
        }
        return null;
    }

    @Override
    public Object getResponseClass(String responseBody, Class responseClass) {
        if (StringUtils.isNotBlank(responseBody)) {
            try {
                return mapper.readValue(responseBody, responseClass);
            } catch (JsonProcessingException e) {
                LOG.error("getResponseClass - Deserialization error. Content: {}, Class: {}", responseBody, responseClass);
            }
        }
        return null;
    }

    private RequestLogModel getSuccessCreateOrderRequestLog(OrderModel order) {
        return order.getCaOrderRequestLogs().stream()
                .filter(requestLog -> requestLog.getIsSuccess() && RequestMethod.POST.name().equals(requestLog.getMethod()))
                .findFirst().orElse(null);
    }

    private Collection<OrderPair> matchOrders(List<OrderModel> modelList, List<OrderData> dataList) {
        final Map<String, OrderPair> map = new HashMap<>();
        dataList.stream().forEach(data -> {
            final String code = data.getSiteOrderID();
            OrderPair pair = map.getOrDefault(code, new OrderPair());
            pair.setOrderData(data);
            map.put(code, pair);
        });
        modelList.stream().forEach(model -> {
            final String code = model.getCode();
            OrderPair pair = map.getOrDefault(code, new OrderPair());
            pair.setOrderModel(model);
            map.put(code, pair);
        });
        return map.values();
    }

    //private Collection<ProductPair> matchProducts(final List<LtbSizeAndLengthVariantProductModel> productModelList, final List<? extends ProductData> productDataList) {
    private Collection<ProductPair> matchProducts(final List<ProductModel> productModelList, final List<? extends ProductData> productDataList) {
        final Map<String, ProductPair> productMap = new HashMap<>();
        productDataList.stream().forEach(productData -> {
            final String ean = productData.getEan();
            ProductPair productPair = productMap.getOrDefault(ean, new ProductPair());
            productPair.setProductData(productData);
            productMap.put(ean, productPair);
        });
        productModelList.stream().forEach(productModel -> {
            final String ean = productModel.getEan();
            ProductPair productPair = productMap.getOrDefault(ean, new ProductPair());
            productPair.setProductModel(productModel);
            productMap.put(ean, productPair);
        });
        return productMap.values();
    }


    @Override
    public PostCreateFullOrderCancelResponse createFullOrderCancel(OrderModel order) {
        return integrationService.requestPostFullOrderCancel(order);
    }

    @Override
    public GetOrderItemsResponse getOrderItemsForPartialRefund(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, String expand, Integer skip, IntegrationCronJobModel jobModel) {
        return integrationService.requestGetOrderItems(baseStore, account, filter, select, expand, skip, jobModel);
    }

    @Override
    public GetOrdersResponse getOrderForFullRefund(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, String expand, Integer skip, IntegrationCronJobModel jobModel) {
        return integrationService.requestGetOrders(baseStore, account, filter, select, skip, expand, jobModel);
    }

    @Override
    public PutOrderItemAdjustmentsResponse updateOrderItemAdjustments(String orderItemAdjustmentId, String entryId, OrderModel order) {
        return integrationService.requestUpdateOrderItemAdjustments(orderItemAdjustmentId, entryId, order);
    }

    @Override
    public void setShippingAddressDetails(OrderModel source, OrderData target) {
        AddressModel deliveryAddress = source.getDeliveryAddress();
        if (Objects.nonNull(deliveryAddress)) {
            target.setShippingFirstName(deliveryAddress.getFirstname());
            target.setShippingLastName(deliveryAddress.getLastname());
            final StringBuilder phoneBuilder = new StringBuilder();
            /*CountryModel phoneCountry = deliveryAddress.getPhoneCountry();
            if (Objects.nonNull(phoneCountry)) {
                phoneBuilder.append(phoneCountry.getPhonePrefix());
            }*/
            final String phone1 = deliveryAddress.getPhone1();
            if (StringUtils.isNotBlank(phone1)) {
                phoneBuilder.append(phone1);
            }
            target.setShippingDaytimePhone(phoneBuilder.toString());
            final StringBuilder line1Builder = new StringBuilder();
            line1Builder.append(deliveryAddress.getLine1());
            final String streetNumber = deliveryAddress.getStreetnumber();
            if (StringUtils.isNotBlank(streetNumber)) {
                boolean suffixAvailable = StringUtils.contains(streetNumber, "-");
                line1Builder.append(" ").append(suffixAvailable ?
                        StringUtils.substringBefore(streetNumber, "-") : streetNumber);
                if (suffixAvailable) {
                    target.setShippingAddressLine2(StringUtils.substringAfter(streetNumber, "-"));
                }
            }
            target.setShippingAddressLine1(line1Builder.toString());
            /*final CityModel city = deliveryAddress.getCity();
            target.setShippingCity(Objects.nonNull(city) ? city.getName() : deliveryAddress.getCityName());*/
            target.setShippingCity("deliveryAddress.getCity()");
            target.setShippingStateOrProvinceName("deliveryAddress.getState()");
            target.setShippingPostalCode(deliveryAddress.getPostalcode());
            CountryModel country = deliveryAddress.getCountry();
            if (Objects.nonNull(country)) {
                target.setShippingCountry(country.getName());
            }
            /*final String companyName = deliveryAddress.getCompanyName();
            if (StringUtils.isNotBlank(companyName)) {
                target.setShippingCompanyName(companyName);
            }*/
        }
    }
}
