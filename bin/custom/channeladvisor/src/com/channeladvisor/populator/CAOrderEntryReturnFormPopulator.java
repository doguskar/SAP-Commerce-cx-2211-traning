package com.channeladvisor.populator;

import com.channeladvisor.data.AdjustmentType;
import com.channeladvisor.data.OrderData;
import com.channeladvisor.data.OrderItemData;
import com.channeladvisor.forms.CAOrderEntryReturnForm;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.commons.collections.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

public class CAOrderEntryReturnFormPopulator <SOURCE extends OrderData, TARGET extends CAOrderEntryReturnForm> implements Populator<SOURCE, TARGET> {

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        Map<Integer, Integer> returnEntryQuantityMap = new HashMap<>();
        Map<Integer, String> returnEntryReasonMap = new HashMap<>();
        createCAOrderEntryReturnForm(returnEntryQuantityMap, returnEntryReasonMap, source);
        target.setReturnEntryQuantityMap(returnEntryQuantityMap);
        target.setReturnEntryReasonMap(returnEntryReasonMap);
    }

    private void createCAOrderEntryReturnForm(Map<Integer, Integer> returnEntryQuantityMap, Map<Integer, String> returnEntryReasonMap, OrderData orderData) {
        int key = 0;
        if(CollectionUtils.isNotEmpty(orderData.getAdjustments()) && AdjustmentType.Refund.equals(orderData.getAdjustments().get(0).getType())) {
            for(OrderItemData orderItemData : orderData.getItems()) {
                returnEntryQuantityMap.put(key, orderItemData.getQuantity());
                returnEntryReasonMap.put(key, orderData.getAdjustments().get(0).getReason().toString());
                key++;
            }
        }
    }
}
