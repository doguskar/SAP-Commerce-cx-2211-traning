package com.channeladvisor.service;

import com.channeladvisor.data.OrderData;
import com.channeladvisor.data.ProductData;
import com.channeladvisor.model.*;
import com.channeladvisor.rest.command.response.*;
//import com.ltb.core.model.IntegrationCronJobModel;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.store.BaseStoreModel;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface ChannelAdvisorService {
    CAConfigurationModel getCAConfiguration();
    CAConfigurationModel getCAConfiguration(BaseStoreModel baseStore);
    String getAccessToken(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, boolean force);
    String getAccessToken(BaseStoreModel baseStore, ChannelAdvisorAccountModel account);
    String getAccessToken(BaseStoreModel baseStore);
    ChannelAdvisorAccountModel getChannelAdvisorAccount(BaseStoreModel baseStore);
    GetProductsResponse getProductsForPartialStockUpdate(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, Date filterDate, Integer skip, CAPartialStockUpdateJobModel jobModel);
    void updateStockOfProducts(final List<? extends ProductData> productDataList, BaseStoreModel baseStore, boolean partition);
    void updateStockOfProducts(final List<? extends ProductData> productDataList, BaseStoreModel baseStore);
    GetOrdersResponse getOrdersForPartialUpdate(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, Date filterDate, Integer skip, IntegrationCronJobModel jobModel, Collection<BaseSiteModel> sites);
    String getSiteNameCondition(Collection<BaseSiteModel> sites);
    void updateOrdersFromCA(final List<OrderData> orderDataList);
    OrderResponse createOrUpdateOrder(OrderModel order);
    Integer getCAOrderId(OrderModel order);
    Object getResponseClass(String responseBody, Class responseClass);
    void setShippingAddressDetails(OrderModel source, OrderData target);
    PostCreateFullOrderCancelResponse createFullOrderCancel(OrderModel order);
    GetOrdersResponse getOrderForFullRefund(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, String expand, Integer skip, IntegrationCronJobModel jobModel);
    GetOrderItemsResponse getOrderItemsForPartialRefund(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, String expand, Integer skip, IntegrationCronJobModel jobModel);
    PutOrderItemAdjustmentsResponse updateOrderItemAdjustments(String orderItemAdjustmentId, String entryId, OrderModel order);
}
