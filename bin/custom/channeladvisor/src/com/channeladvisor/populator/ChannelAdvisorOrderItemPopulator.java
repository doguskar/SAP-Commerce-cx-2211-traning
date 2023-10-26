package com.channeladvisor.populator;

import com.channeladvisor.data.OrderItemData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class ChannelAdvisorOrderItemPopulator <SOURCE extends AbstractOrderEntryModel, TARGET extends OrderItemData> implements Populator<SOURCE, TARGET> {

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        ProductModel product = source.getProduct();
        if(Objects.nonNull(product)) {
            target.setSku("source.getEan()");
            target.setTitle(product.getName());
        }
        target.setSiteOrderItemID(source.getOrder().getCode());
        target.setSiteListingID(source.getEntryNumber().toString());
        final BigDecimal quantity = BigDecimal.valueOf(source.getQuantity());
        final BigDecimal totalTax = BigDecimal.ZERO;//BigDecimal.valueOf(source.getTotalTax());
        target.setUnitPrice(source.getBasePrice());
        target.setTaxPrice(totalTax.setScale(2, RoundingMode.HALF_EVEN).doubleValue());
        target.setQuantity(quantity.intValue());
    }
}
