package com.channeladvisor.helper.impl;

import com.channeladvisor.data.OrderData;
import com.channeladvisor.data.OrderItemData;
import com.channeladvisor.helper.CAReturnServiceHelper;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.model.ChannelAdvisorCronJobModel;
import com.channeladvisor.rest.command.response.GetOrderItemsResponse;
import com.channeladvisor.rest.command.response.GetOrdersResponse;
import com.channeladvisor.service.ChannelAdvisorService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.util.Utilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DefaultCAReturnServiceHelper implements CAReturnServiceHelper {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultCAReturnServiceHelper.class);
    @Resource
    private ChannelAdvisorService channelAdvisorService;

    private static final int RESPONSE_LIMIT = 100;

    @Override
    public List<OrderData> getOrderAdjustmentsOrders(ChannelAdvisorCronJobModel job, BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter) {
        List<OrderData> orderFullRefunds = new ArrayList<>();
        String expand = "Adjustments,Items";
        String select = "ID,SiteOrderID,Adjustments,Items";
        int skip = 0;
        String nextLink = null;
        try {
            do {
                final GetOrdersResponse response = channelAdvisorService.getOrderForFullRefund(baseStore, account, filter, select, expand, skip, job);
                if (Objects.nonNull(response)) {
                    orderFullRefunds.addAll(response.getValue());
                    nextLink = response.getNextLink();
                    skip += RESPONSE_LIMIT;
                }
            } while (Objects.nonNull(nextLink));
        }
        catch (Exception e) {
            LOG.error("EUReturnFromCashOnDeliveryJob getOrderAdjustmentsOrders failed({})", Utilities.getStackTraceAsString(e));
        }
        return orderFullRefunds;
    }

    @Override
    public List<OrderItemData> getOrderItemAdjustmentsOrders(ChannelAdvisorCronJobModel job, BaseStoreModel baseStore, ChannelAdvisorAccountModel account, String filter) {
        List<OrderItemData> orderPartialRefunds = new ArrayList<>();
        String expand = "Adjustments";
        String select = "ID,SiteOrderItemID,Adjustments,SiteListingID";
        int skip = 0;
        String nextLink = null;
        try {
            do {
                final GetOrderItemsResponse response = channelAdvisorService.getOrderItemsForPartialRefund(baseStore, account, filter, select, expand, skip, job);
                if (Objects.nonNull(response)) {
                    orderPartialRefunds.addAll(response.getValue());
                    nextLink = response.getNextLink();
                    skip += RESPONSE_LIMIT;
                }
            } while (Objects.nonNull(nextLink));
        }
        catch (Exception e) {
            LOG.error("EUReturnFromCashOnDeliveryJob getOrderItemAdjustmentsOrders failed({})", Utilities.getStackTraceAsString(e));
        }
        return orderPartialRefunds;
    }
}
