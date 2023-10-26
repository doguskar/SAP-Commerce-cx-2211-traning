package com.channeladvisor.service;

import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.model.IntegrationCronJobModel;
import com.channeladvisor.rest.command.request.PatchOrderRequest;
import com.channeladvisor.rest.command.response.*;
//import com.ltb.core.model.IntegrationCronJobModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.store.BaseStoreModel;

public interface IntegrationService {
    PostRefreshTokenResponse requestRefreshToken(BaseStoreModel baseStore, ChannelAdvisorAccountModel account);
    GetProductsResponse requestGetProducts(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, Integer skip, IntegrationCronJobModel jobModel);
    PostProductExportResponse requestPostExportProduct(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, Integer profileId, String select, IntegrationCronJobModel jobModel);
    GetProductExportResponse requestGetExportProduct(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String token, IntegrationCronJobModel jobModel);
    GetOrdersResponse requestGetOrders(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, Integer skip, String expand, IntegrationCronJobModel jobModel);
    PostCreateOrderResponse requestCreateOrder(OrderModel order);
    PatchOrderResponse requestPatchOrder(OrderModel order, PatchOrderRequest request);
    PatchOrderResponse requestPatchOrder(OrderModel order);
    PostCreateFullOrderCancelResponse requestPostFullOrderCancel(OrderModel order);
    GetOrderItemsResponse requestGetOrderItems(BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter, String select, String expand, Integer skip, IntegrationCronJobModel jobModel);
    PutOrderItemAdjustmentsResponse requestUpdateOrderItemAdjustments(String orderItemAdjustmentId, String entryId, OrderModel order);
}
