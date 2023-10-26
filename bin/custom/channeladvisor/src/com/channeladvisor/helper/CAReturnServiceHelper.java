package com.channeladvisor.helper;

import com.channeladvisor.data.OrderData;
import com.channeladvisor.data.OrderItemData;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.model.ChannelAdvisorCronJobModel;
import de.hybris.platform.store.BaseStoreModel;

import java.util.List;

public interface CAReturnServiceHelper {
    List<OrderData> getOrderAdjustmentsOrders(ChannelAdvisorCronJobModel job, BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter);

    List<OrderItemData> getOrderItemAdjustmentsOrders(ChannelAdvisorCronJobModel job, BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter);
}
