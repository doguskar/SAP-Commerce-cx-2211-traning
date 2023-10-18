package com.paazl.populator;

import com.paazl.data.ShopOrderAddressData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Arrays;
import java.util.Objects;

public class PaazlShopOrderAddressPopulator<SOURCE extends AddressModel, TARGET extends ShopOrderAddressData> implements Populator<SOURCE, TARGET> {
    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        //final CityModel city = source.getCity();
        //if (Objects.nonNull(city)) {
            target.setCity("city.getName()");
        //}
        final CountryModel country = source.getCountry();
        if (Objects.nonNull(country)){
            target.setCountry(country.getIsocode());
        }
        target.setPostalCode(source.getPostalcode());
        // province not implemented
        // street not implemented - Note If you provide "street" with a value, "houseNumber" is required.
        target.setStreetLines(Arrays.asList(source.getLine1()));
        // houseNumber not implemented
        // houseNumberExtension not implemented
    }
}
