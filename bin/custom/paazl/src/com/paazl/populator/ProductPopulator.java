package com.paazl.populator;

import com.paazl.data.MoneyValueData;
import com.paazl.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class ProductPopulator<SOURCE extends AbstractOrderEntryModel, TARGET extends ProductData> implements Populator<SOURCE, TARGET> {
    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        ProductModel product = source.getProduct();
        // height not implemented
        // length not implemented
        target.setUnitPrice(getUnitPrice(source));
        target.setQuantity(source.getQuantity().intValue());
        // volume not implemented
        // weight not implemented
        // width not implemented
        // countryOfManufacture not implemented
        // description not implemented
        // hsTariffCode not implemented
        target.setSkuCode(product.getCode());
    }

    private MoneyValueData getUnitPrice(SOURCE source) {
        final MoneyValueData unitPrice = new MoneyValueData();
        unitPrice.setValue(source.getBasePrice());//source.getLastBasePriceAfterDistributeDiscount()
        unitPrice.setCurrency(source.getOrder().getCurrency().getIsocode());
        return unitPrice;
    }
}
