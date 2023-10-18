package com.paazl.populator;

import com.paazl.data.ContactData;
import com.paazl.data.ShopOrderAddressData;
import de.hybris.platform.commerceservices.strategies.CustomerNameStrategy;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;
import java.util.Objects;

public class PaazlContactPopulator<SOURCE extends AddressModel, TARGET extends ContactData> implements Populator<SOURCE, TARGET> {
    final static public String PHONE_SEPARATOR = "-";

    @Resource
    private CustomerNameStrategy customerNameStrategy;
    @Resource
    private Converter<AddressModel, ShopOrderAddressData> paazlShopOrderAddressConverter;

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        /*if (StringUtils.isNotBlank(source.getCompanyName())){
            target.setCompanyName(source.getCompanyName());
        }*/
        // vatNumber not implemented
        target.setEmail(source.getEmail());
        target.setName(customerNameStrategy.getName(source.getFirstname(), source.getLastname()));
        // other not implemented
        final CountryModel country = source.getCountry();
        target.setPhone(getFormatedPhone(source.getPhone1(), country));
        LanguageModel language = null;
        final ItemModel owner = source.getOwner();
        if (Objects.nonNull(owner) && owner instanceof AbstractOrderModel) {
            UserModel user = ((AbstractOrderModel) owner).getUser();
            if (Objects.nonNull(user)) {
                language = user.getSessionLanguage();
            }
        }
        if (Objects.nonNull(country) && Objects.nonNull(language)){
            target.setLocale(language.getIsocode() + "_" + country.getIsocode());
        }
        target.setAddress(paazlShopOrderAddressConverter.convert(source));
    }

    private String getFormatedPhone(String phone1, CountryModel country) {
        if (Objects.nonNull(country) && StringUtils.isNotBlank(country.getPhonePrefix())) {
            StringBuilder phoneBuilder = new StringBuilder(country.getPhonePrefix());
            phoneBuilder.append(PHONE_SEPARATOR).append(phone1.replaceAll("[()\\s]", ""));
            if (phoneBuilder.length() > 7) {
                phoneBuilder.insert(phoneBuilder.length() - 7, PHONE_SEPARATOR);
                return phoneBuilder.toString();
            }
        }
        return phone1;
    }
}
