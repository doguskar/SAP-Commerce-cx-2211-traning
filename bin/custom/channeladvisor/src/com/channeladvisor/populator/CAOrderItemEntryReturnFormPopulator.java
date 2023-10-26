package com.channeladvisor.populator;

import com.channeladvisor.data.AdjustmentType;
import com.channeladvisor.data.OrderItemAdjustmentData;
import com.channeladvisor.data.OrderItemData;
import com.channeladvisor.forms.CAOrderEntryReturnForm;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CAOrderItemEntryReturnFormPopulator<SOURCE extends List<OrderItemData>, TARGET extends CAOrderEntryReturnForm> implements Populator<SOURCE, TARGET> {

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        Map<Integer, Integer> returnEntryQuantityMap = new HashMap<>();
        Map<Integer, String> returnEntryReasonMap = new HashMap<>();
        Map<Integer, String> returnCAIdMap = new HashMap<>();
        createCAOrderEntryReturnForm(returnEntryQuantityMap, returnEntryReasonMap, returnCAIdMap, source);
        target.setReturnEntryQuantityMap(returnEntryQuantityMap);
        target.setReturnEntryReasonMap(returnEntryReasonMap);
        target.setReturnCAIdMap(returnCAIdMap);
    }

    private void createCAOrderEntryReturnForm(Map<Integer, Integer> returnEntryQuantityMap, Map<Integer, String> returnEntryReasonMap, Map<Integer, String> returnCAIdMap, List<OrderItemData> orderItemDatas) {
        for(OrderItemData orderItemData: orderItemDatas) {
            int orderItemRefundedQuantity = 0;
            String orderItemRefundedReason = "";
            StringBuilder stringBuilder = new StringBuilder();
            String listingID = orderItemData.getSiteListingID();
            if(StringUtils.isNotEmpty(listingID)) {
                int key = Integer.valueOf(orderItemData.getSiteListingID());
                for(OrderItemAdjustmentData orderItemAdjustmentData : orderItemData.getAdjustments()) {
                    if(AdjustmentType.Refund.equals(orderItemAdjustmentData.getType())) {
                        orderItemRefundedQuantity += orderItemAdjustmentData.getQuantity();
                        orderItemRefundedReason = orderItemAdjustmentData.getReason().toString();
                        stringBuilder.append("-").append(orderItemAdjustmentData.getId().toString());
                    }
                }
                String returneItemAdjustments = stringBuilder.toString().replaceFirst("-","");
                returnEntryQuantityMap.put(key, orderItemRefundedQuantity);
                returnEntryReasonMap.put(key, orderItemRefundedReason);
                returnCAIdMap.put(key, returneItemAdjustments);
            }

        }
    }
}
