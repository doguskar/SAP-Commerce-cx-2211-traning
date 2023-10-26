package com.paazl.service.impl;

import com.customcore.model.BaseStoreConfigurationModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paazl.command.*;
import com.paazl.command.request.*;
import com.paazl.command.response.*;
import com.paazl.constants.PaazlConstants;
import com.paazl.data.*;
import com.paazl.model.PaazlConfigurationModel;
import com.paazl.model.PaazlShipmentRequestParametersModel;
import com.paazl.service.PaazlService;
import com.paazl.soap.generated.*;
import com.customcore.util.DateUtil;
import com.rest.integration.util.exception.NotSupportedException;
import com.rest.integration.util.exception.RestCommandException;
import com.rest.integration.util.factory.IFactory;
import com.rest.integration.util.factory.IFactoryRegistry;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commerceservices.delivery.DeliveryService;
import de.hybris.platform.commerceservices.order.CommerceCartCalculationStrategy;
import de.hybris.platform.commerceservices.order.CommerceCheckoutService;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.commerceservices.service.data.CommerceCheckoutParameter;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.*;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.deliveryzone.model.ZoneDeliveryModeModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.AddressService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.hybris.platform.commercefacades.user.data.AddressData;

import javax.annotation.Resource;
import javax.xml.rpc.ServiceException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.*;


public class DefaultPaazlService implements PaazlService {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultPaazlService.class);

    @Resource
    private BaseStoreService baseStoreService;
    @Resource
    private Converter<AddressModel, ContactData> paazlContactConverter;
    @Resource
    private Converter<AbstractOrderEntryModel, ProductData> paazlProductConverter;
    @Resource
    private ModelService modelService;
    @Resource
    private OrderService paazlOrderService;
    @Resource
    private CommerceCartCalculationStrategy commerceCartCalculationStrategy;
    @Resource
    private AddressService addressService;
    @Resource
    private Populator<AddressData, AddressModel> addressReversePopulator;
    @Resource
    private DeliveryService deliveryService;
    @Resource
    private CommerceCheckoutService commerceCheckoutService;
    @Resource
    private IFactoryRegistry iFactoryRegistry;
    @Resource(name = "restCommandObjectMapper")
    private ObjectMapper mapper;

    @Override
    public PostCheckoutTokenResponse requestCheckoutToken(final AbstractOrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final PaazlConfigurationModel paazlConfiguration = getPaazlConfiguration(baseStore);
        if (Objects.nonNull(paazlConfiguration)) {
            try {
                IFactory<PostCheckoutTokenCommand> commandIFactory = iFactoryRegistry.getFactory(PaazlConstants.PAAZL_REST_COMMAND_FACTORY_KEY);
                PostCheckoutTokenCommand command = commandIFactory.create(PostCheckoutTokenCommand.class);
                command.setBaseStore(baseStore);
                final PostCheckoutTokenRequest request = command.createRequest();
                request.setReference(order.getCode());
                request.setApiKey(paazlConfiguration.getApiKey());
                request.setApiSecret(paazlConfiguration.getApiSecret());
                return command.perform(request);
            } catch (NotSupportedException | RestCommandException e) {
            }
        } else {
            LOG.error("PaazlConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    @Override
    public PaazlConfigurationModel getPaazlConfiguration() {
        return getPaazlConfiguration(baseStoreService.getCurrentBaseStore());
    }

    @Override
    public PaazlConfigurationModel getPaazlConfiguration(BaseStoreModel baseStore) {
        return Optional.ofNullable(baseStore)
                .map(BaseStoreModel::getConfiguration)
                .map(BaseStoreConfigurationModel::getPaazlConfiguration)
                .orElse(null);
    }

    @Override
    public GetCheckoutResponse requestGetCheckout(AbstractOrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final PaazlConfigurationModel paazlConfiguration = getPaazlConfiguration(baseStore);
        if (Objects.nonNull(paazlConfiguration)) {
            try {
                IFactory<GetCheckoutCommand> commandIFactory = iFactoryRegistry.getFactory(PaazlConstants.PAAZL_REST_COMMAND_FACTORY_KEY);
                GetCheckoutCommand command = commandIFactory.create(GetCheckoutCommand.class);
                command.setBaseStore(baseStore);
                final GetCheckoutRequest request = command.createRequest();
                request.setReference(order.getCode());
                request.setApiKey(paazlConfiguration.getApiKey());
                request.setApiSecret(paazlConfiguration.getApiSecret());
                request.setSaveRequestLogCommandItem(order);
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("PaazlConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    @Override
    public PostCheckoutResponse requestPostCheckout(final GetCheckoutResponse getCheckoutResponse) {
        final BaseStoreModel baseStore = baseStoreService.getCurrentBaseStore();
        final PaazlConfigurationModel paazlConfiguration = getPaazlConfiguration(baseStore);
        if (Objects.nonNull(paazlConfiguration)) {
            try {
                IFactory<PostCheckoutCommand> commandIFactory = iFactoryRegistry.getFactory(PaazlConstants.PAAZL_REST_COMMAND_FACTORY_KEY);
                PostCheckoutCommand command = commandIFactory.create(PostCheckoutCommand.class);
                command.setBaseStore(baseStore);
                final PostCheckoutRequest request = command.createRequest();
                request.setApiKey(paazlConfiguration.getApiKey());
                request.setToken(getCheckoutResponse.getToken());
                final ShippingOptionData shippingOption = getCheckoutResponse.getShippingOption();
                if (Objects.nonNull(shippingOption)) {
                    final ShippingOptionData shippingOptionSelection = new ShippingOptionData();
                    shippingOptionSelection.setIdentifier(shippingOption.getIdentifier());
                    request.setShippingOption(shippingOptionSelection);
                }
                final PickupLocationData pickupLocation = getCheckoutResponse.getPickupLocation();
                if (Objects.nonNull(pickupLocation)) {
                    final PickupLocationData pickupLocationSelection = new PickupLocationData();
                    pickupLocationSelection.setAccountNumber(pickupLocation.getAccountNumber());
                    pickupLocationSelection.setCode(pickupLocation.getCode());
                    request.setPickupLocation(pickupLocationSelection);
                }
                request.setPreferredDeliveryDate(getCheckoutResponse.getPreferredDeliveryDate());
                return command.perform(request);
            } catch (RestCommandException | NotSupportedException e) {
            }
        } else {
            LOG.error("PaazlConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    @Override
    public boolean saveCheckout(CartModel cart) {
        final GetCheckoutResponse getCheckoutResponse = requestGetCheckout(cart);
        return Objects.nonNull(getCheckoutResponse) && Objects.nonNull(getCheckoutResponse.getShippingOption())
                && saveShipmentInfos(cart, getCheckoutResponse)
                && StringUtils.isNotBlank(getCheckoutResponse.getToken());
    }

    @Override
    public PostOrderResponse requestPostOrder(OrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final PaazlConfigurationModel paazlConfiguration = getPaazlConfiguration(baseStore);
        if (Objects.nonNull(paazlConfiguration)) {
            final GetCheckoutResponse getCheckoutResponse = getGetCheckoutResponse(order);
            if (Objects.nonNull(getCheckoutResponse)) {
                try {
                    IFactory<PostOrderCommand> commandIFactory = iFactoryRegistry.getFactory(PaazlConstants.PAAZL_REST_COMMAND_FACTORY_KEY);
                    PostOrderCommand command = commandIFactory.create(PostOrderCommand.class);
                    final PostOrderRequest request = populatePostOrderRequest(command.createRequest(), order, paazlConfiguration, getCheckoutResponse);
                    return command.perform(request);
                } catch (RestCommandException | NotSupportedException e) {
                }
            } else {
                LOG.error("GetCheckoutResponse is null for the order({})", order.getPk());
            }
        } else {
            LOG.error("PaazlConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    private PostOrderRequest populatePostOrderRequest(PostOrderRequest request, OrderModel order, PaazlConfigurationModel paazlConfiguration, GetCheckoutResponse getCheckoutResponse) {
        request.setReference(order.getCode());
        request.setApiKey(paazlConfiguration.getApiKey());
        request.setApiSecret(paazlConfiguration.getApiSecret());
        // additionalInstruction not implemented
        request.setConsignee(paazlContactConverter.convert(order.getDeliveryAddress()));
        // customsValue not implemented
        // insuredValue not implemented
        request.setCodValue(getCodValue(order, paazlConfiguration));
        // description not implemented
        request.setRequestedDeliveryDate(getCheckoutResponse.getPreferredDeliveryDate());
        request.setProducts(paazlProductConverter.convertAll(order.getEntries()));
        // invoiceNumber not implemented
        // invoiceDate not implemented
        // return not implemented
        // sender not implemented
        request.setShipping(getShopOrderShippingData(getCheckoutResponse, paazlConfiguration));
        // weight not implemented
        request.setSaveRequestLogCommandItem(order);
        return request;
    }

    private ShopOrderShippingData getShopOrderShippingData(GetCheckoutResponse getCheckoutResponse, PaazlConfigurationModel paazlConfiguration) {
        final ShopOrderShippingData shopOrderShippingData = new ShopOrderShippingData();
        shopOrderShippingData.setOption(getCheckoutResponse.getShippingOption().getIdentifier());
        final PickupLocationData pickupLocationData = getCheckoutResponse.getPickupLocation();
        if (Objects.nonNull(pickupLocationData)) {
            ShopOrderPickupLocationData selectedPickupLocationData = new ShopOrderPickupLocationData();
            selectedPickupLocationData.setAccountNumber(pickupLocationData.getAccountNumber());
            selectedPickupLocationData.setCode(pickupLocationData.getCode());
            shopOrderShippingData.setPickupLocation(selectedPickupLocationData);
        }
        shopOrderShippingData.setContract(paazlConfiguration.getContract());
        shopOrderShippingData.setReturnContract(paazlConfiguration.getReturnContract());
        //packageCount not implemented
        shopOrderShippingData.setMultiPackageShipment(paazlConfiguration.getMultiPackageShipment());
        return shopOrderShippingData;
    }

    @Override
    public GetCheckoutResponse getGetCheckoutResponse(AbstractOrderModel order) {
        final RequestLogModel getCheckoutRequestLog = order.getPaazlGetCheckoutRequestLog();
        if (Objects.nonNull(getCheckoutRequestLog) && StringUtils.isNotBlank(getCheckoutRequestLog.getResponseBody())) {
            try {
                return mapper.readValue(getCheckoutRequestLog.getResponseBody(), GetCheckoutResponse.class);
            } catch (IOException e) {
                LOG.error("IOException is occured during response unwrapping:" + e, e);
            }
        }
        return null;
    }

    @Override
    public boolean setDeliveryCost(CartModel cart) {
        final GetCheckoutResponse getCheckoutResponse = requestGetCheckout(cart);
        if (Objects.nonNull(getCheckoutResponse)) {
            return setDeliveryModeAndRecalculate(cart, getCheckoutResponse.getShippingOption());
        } else {
            LOG.warn("PAAZL getCheckoutResponse is null for the abstract order({})", cart.getPk());
        }
        return false;
    }

    @Override
    public boolean afterPlaceOrder(AbstractOrderModel order) {
        final GetCheckoutResponse getCheckoutResponse = getGetCheckoutResponse(order);
        if (Objects.nonNull(getCheckoutResponse)) {
            if (DeliveryType.PICKUP_LOCATION.name().equals(getCheckoutResponse.getDeliveryType())) {
                return setPickupLocationAsDeliveryAddress(order, getCheckoutResponse);
            }
        }
        return true;
    }

    private MoneyValueData getCodValue(final OrderModel order, final PaazlConfigurationModel paazlConfiguration) {
        final PaymentModeModel paymentMode = order.getPaymentMode();
        if (paazlConfiguration.getCodPaymentModes().contains(paymentMode)) {
            final MoneyValueData codValue = new MoneyValueData();
            codValue.setCurrency(order.getCurrency().getIsocode());
            codValue.setValue(order.getTotalPrice());
            return codValue;
        }
        return null;
    }

    private boolean saveShipmentInfos(CartModel cart, GetCheckoutResponse getCheckoutResponse) {
        final ShippingOptionData shippingOption = getCheckoutResponse.getShippingOption();
        final CarrierData carrierData = shippingOption.getCarrier();
        if (Objects.nonNull(carrierData) && StringUtils.isNotBlank(carrierData.getName())) {
            final String carrier = StringUtils.isNotBlank(carrierData.getDescription()) ? carrierData.getName() + " - " + carrierData.getDescription() :
                    carrierData.getName();
            cart.setCarrier(carrier);
        }
        boolean setDeliveryModeAndRecalculate = setDeliveryModeAndRecalculate(cart, shippingOption);
        if (!modelService.isUpToDate(cart)) {
            modelService.save(cart);
        }
        return setDeliveryModeAndRecalculate;
    }

    @Override
    public boolean checkOrder(OrderModel order) {
        final GetCheckoutResponse getCheckoutResponse = getGetCheckoutResponse(order);
        if (Objects.nonNull(getCheckoutResponse)) {
            return true;
        }
        order.setStatusInfo("Delivery mode is paazl but getCheckoutResponse is null");
        return false;
    }

    @Override
    public PutOrderResponse requestPutOrder(OrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final PaazlConfigurationModel paazlConfiguration = getPaazlConfiguration(baseStore);
        if (Objects.nonNull(paazlConfiguration)) {
            final GetCheckoutResponse getCheckoutResponse = getGetCheckoutResponse(order);
            if (Objects.nonNull(getCheckoutResponse)) {
                try {
                    IFactory<PutOrderCommand> commandIFactory = iFactoryRegistry.getFactory(PaazlConstants.PAAZL_REST_COMMAND_FACTORY_KEY);
                    PutOrderCommand command = commandIFactory.create(PutOrderCommand.class);
                    command.setBaseStore(baseStore);
                    final PutOrderRequest request = (PutOrderRequest) populatePostOrderRequest(command.createRequest(), order, paazlConfiguration, getCheckoutResponse);
                    return command.perform(request);
                } catch (RestCommandException | NotSupportedException e) {
                }
            } else {
                LOG.error("GetCheckoutResponse is null for the order({})", order.getPk());
            }
        } else {
            LOG.error("PaazlConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    @Override
    public PostOrderShipmentsResponse requestPostOrderShipments(OrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final PaazlConfigurationModel paazlConfiguration = getPaazlConfiguration(baseStore);
        if (Objects.nonNull(paazlConfiguration)) {
            final PaazlShipmentRequestParametersModel shipmentRequestParameters = paazlConfiguration.getShipmentRequestParameters();
            if (Objects.nonNull(shipmentRequestParameters)) {
                try {
                    IFactory<PostOrderShipmentsCommand> commandIFactory = iFactoryRegistry.getFactory(PaazlConstants.PAAZL_REST_COMMAND_FACTORY_KEY);
                    PostOrderShipmentsCommand command = commandIFactory.create(PostOrderShipmentsCommand.class);
                    command.setBaseStore(baseStore);
                    final PostOrderShipmentsRequest request = command.createRequest();
                    Map<String, String> pathVariables = new HashMap<>();
                    pathVariables.put(PaazlConstants.ORDER_REFERENCE_VARIABLE, order.getCode());
                    request.setPathVariables(pathVariables);
                    request.setApiKey(paazlConfiguration.getApiKey());
                    request.setApiSecret(paazlConfiguration.getApiSecret());
                    request.setSize(shipmentRequestParameters.getSize());
                    request.setType(shipmentRequestParameters.getType());
                    request.setQuantity(shipmentRequestParameters.getQuantity());
                    request.setSaveRequestLogCommandItem(order);
                    return command.perform(request);
                } catch (RestCommandException | NotSupportedException e) {
                }
            } else {
                LOG.error("PaazlShipmentRequestParameters is null for the PaazlConfiguration({})", paazlConfiguration.getPk());
            }
        } else {
            LOG.error("PaazlConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    @Override
    public AddExistingShipmentResponse requestAddExistingShipment(OrderModel order) {
        final BaseStoreModel baseStore = order.getStore();
        final PaazlConfigurationModel paazlConfiguration = getPaazlConfiguration(baseStore);
        if (Objects.nonNull(paazlConfiguration)) {
            AddExistingShipmentRequest request = null;
            AddExistingShipmentResponse response = null;
            Exception exception = null;
            try {
                Order orderProxy = paazlOrderService.getOrderSoap11();
                request = new AddExistingShipmentRequest();
                request.setHash(getHashType1(paazlConfiguration));
                request.setWebshop(paazlConfiguration.getWebshopId());
                request.setShipments(createShipments(order));
                response = orderProxy.addExistingShipment(request);
            } catch (ServiceException e) {
                LOG.error("PAAZL ServiceException {}", e.getMessage(), e);
                exception = e;
            } catch (RemoteException e) {
                LOG.error("PAAZL RemoteException {}", e.getMessage(), e);
                exception = e;
            } finally {
                requestAddExistingShipmentSaveLog(request, response, order, exception);
                return response;
            }
        } else {
            LOG.error("PaazlConfiguration is null for {}", Objects.nonNull(baseStore) ? baseStore.getUid() : "null baseStore");
        }
        return null;
    }

    private void requestAddExistingShipmentSaveLog(AddExistingShipmentRequest request, AddExistingShipmentResponse response, OrderModel order, Exception exception) {
        /*final ExclusionStrategy strategy = new GsonExclusionStrategy();
        final Gson gson = new GsonBuilder().addSerializationExclusionStrategy(strategy).addDeserializationExclusionStrategy(strategy).create();
        final RequestLogModel requestLog = requestLogService.createRequestLog(gson.toJson(request),
                "addExistingShipment",
                gson.toJson(response),
                "SOAP",
                Objects.nonNull(response) ? LtbpaazlConstants.SOAP_SUCCESS_MESSAGE.equalsIgnoreCase(response.getMessage()) : false,
                exception);
        Set<RequestLogModel> requestLogs = new HashSet<>(order.getPaazlOrderShipmentsRequestLogs());
        requestLogs.add(requestLog);
        order.setPaazlOrderShipmentsRequestLogs(requestLogs);
        modelService.saveAll(requestLog, order);*/
    }

    private ShipmentRequestType[] createShipments(OrderModel order) {
        final Set<ConsignmentModel> consignments = order.getConsignments();
        if (CollectionUtils.isNotEmpty(consignments)) {
            final ShipmentRequestType[] shipmentRequestTypes = new ShipmentRequestType[consignments.size()];
            final String orderCode = order.getCode();
            int i = 0;
            for (ConsignmentModel consignment : consignments) {
                ShipmentRequestType shipmentRequestType = new ShipmentRequestType();
                shipmentRequestType.setReference(orderCode);
                shipmentRequestType.setTrackingNumber(consignment.getTrackingID());
                shipmentRequestType.setDispatchNumber("TODO"); // TODO

                // TODO START
                ParcelRequestType[] parcelRequestTypes = new ParcelRequestType[1];
                ParcelRequestType parcelRequestType = new ParcelRequestType();
                parcelRequestType.setBarcode("Parcel001");
                parcelRequestType.setTrackingUrl("track@myshop.com");
                parcelRequestTypes[0] = parcelRequestType;
                // TODO END

                shipmentRequestType.setParcels(parcelRequestTypes);
                shipmentRequestTypes[i] = shipmentRequestType;
                i++;
            }
            return shipmentRequestTypes;
        }
        LOG.error("Consignments are null for the order({})", order.getPk());
        return null;
    }

    private String getHashType1(PaazlConfigurationModel paazlConfiguration) {
        final Integer webshopId = paazlConfiguration.getWebshopId();
        final String integrationPassword = paazlConfiguration.getIntegrationPassword();
        if (Objects.nonNull(webshopId) && StringUtils.isNotBlank(integrationPassword)) {
            StringBuilder hashBuilder = new StringBuilder();
            hashBuilder.append(webshopId)
                    .append(integrationPassword)
                    .append(DateUtil.formatDate(new Date(), PaazlConstants.HASH_DATE_FORMAT));
            return DigestUtils.sha1Hex(hashBuilder.toString());
        }
        LOG.error("PAAZL getHashType1 webshopId or integrationPassword or both is null");
        return StringUtils.EMPTY;
    }

    private boolean recalculateCart(CartModel cart) {
        cart.setCalculated(false);
        final CommerceCartParameter commerceCartParameter = new CommerceCartParameter();
        commerceCartParameter.setEnableHooks(true);
        commerceCartParameter.setCart(cart);
        boolean recalculate = commerceCartCalculationStrategy.calculateCart(commerceCartParameter);
        if (!recalculate) {
            LOG.error("PAAZL cart recalculate failed for the cart({})", cart.getPk());
        }
        return recalculate;
    }

    private boolean setPickupLocationAsDeliveryAddress(AbstractOrderModel order, GetCheckoutResponse getCheckoutResponse) {
        PickupLocationData pickupLocation = getCheckoutResponse.getPickupLocation();
        if (Objects.nonNull(pickupLocation)) {
            com.paazl.data.AddressData pickupLocationAddress = pickupLocation.getAddress();
            if (Objects.nonNull(pickupLocationAddress)) {
                final AddressData addressData = new AddressData();
                addressData.setPostalCode(pickupLocationAddress.getPostalCode());
                CountryData countryData = new CountryData();
                countryData.setIsocode(pickupLocationAddress.getCountry());
                addressData.setCountry(countryData);
                addressData.setLine1(pickupLocationAddress.getStreet());
                StringBuilder line2 = new StringBuilder();
                final Integer streetNumber = pickupLocationAddress.getStreetNumber();
                if (Objects.nonNull(streetNumber)) {
                    line2.append(streetNumber);
                    final String streetNumberSuffix = pickupLocationAddress.getStreetNumberSuffix();
                    if (StringUtils.isNotBlank(streetNumberSuffix)) {
                        line2.append("-").append(streetNumberSuffix);
                    }
                }
                addressData.setLine2(line2.toString());
                //addressData.setCityName(pickupLocationAddress.getCity());
                addressData.setCompanyName(pickupLocation.getName());
                final AddressModel oldDeliveryAddress = order.getDeliveryAddress();
                addressData.setFirstName(oldDeliveryAddress.getFirstname());
                addressData.setLastName(oldDeliveryAddress.getLastname());
                final AddressModel pickupAddressModel = addressService.createAddressForOwner(order);
                addressReversePopulator.populate(addressData, pickupAddressModel);
                order.setDeliveryAddress(pickupAddressModel);
                modelService.saveAll(pickupAddressModel, order);
                modelService.remove(oldDeliveryAddress);
                return true;
            } else {
                order.setStatusInfo("PAAZL pickup location address is null");
                LOG.warn("PAAZL Pickup location selected but pickup location address is null for the order({})", order.getPk());
            }
        } else {
            order.setStatusInfo("PAAZL pickup location is null");
            LOG.warn("PAAZL Pickup location selected but pickup location is null for the order({})", order.getPk());
        }
        return false;
    }

    private boolean setDeliveryModeAndRecalculate(CartModel cart, ShippingOptionData shippingOption) {
        if (Objects.nonNull(shippingOption)) {
            final String identifier = shippingOption.getIdentifier();
            final DeliveryModeModel currentDeliveryMode = cart.getDeliveryMode();
            if (Objects.nonNull(currentDeliveryMode) && currentDeliveryMode.getCode().equals(identifier)) {
                return true;
            }
            ZoneDeliveryModeModel deliveryMode = (ZoneDeliveryModeModel) deliveryService.getDeliveryModeForCode(identifier);
            if (Objects.isNull(deliveryMode)) {
                deliveryMode = createDeliveryMode(cart, shippingOption);
            }
            if (setDeliveryMode(cart, deliveryMode)) {
                final Double rate = shippingOption.getRate();
                if (Objects.nonNull(rate)) {
                    cart.setPaazlDeliveryCost(rate);
                    return recalculateCart(cart);
                } else {
                    LOG.warn("PAAZL Delivery cost is null for the abstract order({})", cart.getPk());
                }
            } else {
                LOG.warn("PAAZL setDeliveryMode failed for the abstract order({})", cart.getPk());
            }
        } else {
            LOG.warn("PAAZL shippingOption is null for the abstract order({})", cart.getPk());
        }
        return false;
    }

    private ZoneDeliveryModeModel createDeliveryMode(CartModel cart, ShippingOptionData shippingOption) {
        final String identifier = shippingOption.getIdentifier();
        ZoneDeliveryModeModel paazlDeliveryMode = getPaazlConfiguration().getDeliveryMode();
        if (Objects.nonNull(paazlDeliveryMode)) {
            ZoneDeliveryModeModel deliveryMode;
            if (StringUtils.isNotBlank(identifier)) {
                deliveryMode = modelService.create(ZoneDeliveryModeModel.class);
                deliveryMode.setCode(identifier);
                deliveryMode.setName(shippingOption.getName());
                deliveryMode.setActive(true);
                deliveryMode.setNet(paazlDeliveryMode.getNet());
                /*deliveryMode.setIsBase(paazlDeliveryMode.getIsBase());
                deliveryMode.setCargoType(paazlDeliveryMode.getCargoType());
                deliveryMode.setPaymentModes(paazlDeliveryMode.getPaymentModes());*/
                modelService.save(deliveryMode);
                return deliveryMode;
            } else {
                LOG.warn("PAAZL setDeliveryMode error. shippingOption.identifier is null for the cart({})", cart.getPk());
                return paazlDeliveryMode;
            }
        } else {
            LOG.error("PAAZL setDeliveryMode error. PaazlConfiguration.deliveryMode is null.");
        }
        return null;
    }

    private boolean setDeliveryMode(CartModel cart, ZoneDeliveryModeModel deliveryMode) {
        if (Objects.nonNull(deliveryMode)) {
            final CommerceCheckoutParameter parameter = new CommerceCheckoutParameter();
            parameter.setEnableHooks(true);
            parameter.setCart(cart);
            parameter.setDeliveryMode(deliveryMode);
            return commerceCheckoutService.setDeliveryMode(parameter);
        }
        return false;
    }
}
