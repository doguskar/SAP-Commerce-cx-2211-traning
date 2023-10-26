package com.channeladvisor.populator;

/*
import com.ltb.cargo.enums.CargoType;
import com.ltb.cargo.model.CityModel;
*/
import com.channeladvisor.data.*;
import com.channeladvisor.model.CAConfigurationModel;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.service.ChannelAdvisorService;
/*import com.ltb.core.constants.LtbCoreConstants;
import com.ltb.core.model.BaseStoreConfigurationModel;
import com.ltb.core.util.LtbDateUtil;*/
/*
import com.ltb.paazl.command.response.GetCheckoutResponse;
import com.ltb.paazl.data.EstimatedDeliveryRangeData;
import com.ltb.paazl.data.PickupLocationData;
import com.ltb.paazl.data.ShippingOptionData;
import com.ltb.paazl.service.PaazlService;
*/
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.util.TaxValue;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChannelAdvisorOrderPopulator<SOURCE extends OrderModel, TARGET extends OrderData> implements Populator<SOURCE, TARGET> {
    private static final Logger LOG = LoggerFactory.getLogger(ChannelAdvisorOrderPopulator.class);
    @Resource
    private Converter<AbstractOrderEntryModel, OrderItemData> channelAdvisorOrderItemConverter;
    /*@Resource
    private PaazlService paazlService;*/
    @Resource
    private ChannelAdvisorService channelAdvisorService;

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        target.setProfileId(getProfileId(source));
        target.setSiteOrderID(source.getCode());
        final String contactEmail = ((CustomerModel) source.getUser()).getContactEmail();
        target.setBuyerEmailAddress(contactEmail);
        target.setCurrency(source.getCurrency().getIsocode());
        target.setPaymentStatus(PaymentStatus.Cleared);
        target.setCheckoutStatus(CheckoutStatus.Completed);
        target.setSiteName(source.getSite().getName(Locale.ENGLISH));
        setPriceAndTaxes(source, target);
        target.setItems(channelAdvisorOrderItemConverter.convertAll(source.getEntries()));
        channelAdvisorService.setShippingAddressDetails(source, target);
        setBillingAddressDetails(source, target);
        setShippingDetails(source, target);
        target.setPrivateNotes(getPrivateNotes(source));
        target.setBuyerUserId(contactEmail);
        target.setOrderTaxType(TaxType.InclusiveVat);
        target.setGiftOptionsTaxType(TaxType.InclusiveVat);
        target.setShippingTaxType(TaxType.InclusiveVat);
        if (source.getTotalDiscounts() != null && source.getTotalDiscounts() > 0) {
            target.setPromotionAmount(source.getTotalDiscounts() * -1);
            String discountCodes = "";//source.getDiscountList().stream().map(o -> o.getDiscountCode()).collect(Collectors.joining("-"));
            if (StringUtils.isNotEmpty(discountCodes)) {
                target.setPromotionCode(discountCodes);
            }
        }
    }

    private String getPrivateNotes(SOURCE source) {
        LanguageModel language = source.getUser().getSessionLanguage();
        if (Objects.nonNull(language)) {
            return "Language: " + language.getIsocode();
        }
        return null;
    }

    private Integer getProfileId(SOURCE source) {
        /*Integer profileId = Optional.of(source)
                .map(OrderModel::getStore)
                .map(BaseStoreModel::getConfiguration)
                .map(BaseStoreConfigurationModel::getCAConfiguration)
                .map(CAConfigurationModel::getAccount)
                .map(ChannelAdvisorAccountModel::getProfileId)
                .orElse(null);
        if (Objects.isNull(profileId)) {
            LOG.warn("profilId is null for the order({})", source.getPk());
        }
        return profileId;*/
        return 0;
    }

    private void setShippingDetails(SOURCE source, TARGET target) {
        /*final DeliveryModeModel deliveryMode = source.getDeliveryMode();
        if (Objects.nonNull(deliveryMode) && CargoType.PAAZL.equals(deliveryMode.getCargoType())) {
            final GetCheckoutResponse getCheckoutResponse = paazlService.getGetCheckoutResponse(source);
            if (Objects.nonNull(getCheckoutResponse)) {
                final ShippingOptionData shippingOption = getCheckoutResponse.getShippingOption();
                if (Objects.nonNull(shippingOption)) {
                    final String carrier = source.getCarrier();
                    if (StringUtils.isNotBlank(carrier)) {
                        target.setRequestedShippingCarrier(carrier);
                        StringBuilder shippingClass = new StringBuilder();
                        shippingClass.append(shippingOption.getIdentifier());
                        if (StringUtils.isNotBlank(shippingOption.getName())) {
                            shippingClass.append(" - ").append(shippingOption.getName());
                        }
                        final PickupLocationData pickupLocation = getCheckoutResponse.getPickupLocation();
                        if (Objects.nonNull(pickupLocation)){
                            shippingClass.append(" - ").append(pickupLocation.getCode());
                        }
                        target.setRequestedShippingClass(shippingClass.toString());
                    }
                    final EstimatedDeliveryRangeData estimatedDeliveryRange = shippingOption.getEstimatedDeliveryRange();
                    if (Objects.nonNull(estimatedDeliveryRange) && Objects.nonNull(estimatedDeliveryRange.getMax())){
                        Date estimatedMaxDeliveryDate = LtbDateUtil.addDayToDate(source.getCreationtime(), estimatedDeliveryRange.getMax());
                        target.setEstimatedShipDateUtc(LtbDateUtil.formatDate(estimatedMaxDeliveryDate, LtbDateUtil.CA_DATE_FORMAT));
                    }
                }
            }
        }*/
    }

    private void setBillingAddressDetails(SOURCE source, TARGET target) {
        AddressModel paymentAddress = source.getPaymentAddress();
        if (Objects.nonNull(paymentAddress)) {
            target.setBillingFirstName(paymentAddress.getFirstname());
            target.setBillingLastName(paymentAddress.getLastname());
            final StringBuilder phoneBuilder = new StringBuilder();
            /*CountryModel phoneCountry = paymentAddress.getPhoneCountry();
            if (Objects.nonNull(phoneCountry)) {
                phoneBuilder.append(phoneCountry.getPhonePrefix());
            }*/
            phoneBuilder.append(paymentAddress.getPhone1());
            target.setBillingDaytimePhone(phoneBuilder.toString());
            final StringBuilder line1Builder = new StringBuilder();
            line1Builder.append(paymentAddress.getLine1());
            final String streetNumber = paymentAddress.getStreetnumber();
            if (StringUtils.isNotBlank(streetNumber)) {
                boolean suffixAvailable = StringUtils.contains(streetNumber, "-");
                line1Builder.append(" ").append(suffixAvailable ?
                        StringUtils.substringBefore(streetNumber, "-") : streetNumber);
                if (suffixAvailable) {
                    target.setBillingAddressLine2(StringUtils.substringAfter(streetNumber, "-"));
                }
            }
            target.setBillingAddressLine1(line1Builder.toString());
            /*CityModel city = paymentAddress.getCity();
            target.setBillingCity(Objects.nonNull(city) ? city.getName() : paymentAddress.getCityName());*/
            target.setBillingCity("paymentAddress.getCity()");
            target.setBillingStateOrProvinceName(paymentAddress.getRegion().getName());
            target.setBillingPostalCode(paymentAddress.getPostalcode());
            final CountryModel country = paymentAddress.getCountry();
            if (Objects.nonNull(country)) {
                target.setBillingCountry(country.getName());
            }
        }
    }

    private void setPriceAndTaxes(SOURCE source, TARGET target) {
        target.setTotalPrice(source.getTotalPrice());
        target.setTotalTaxPrice(source.getTotalTax());
        TaxValue deliveryCostTax = source.getTotalTaxValues().stream()
                .filter(taxValue -> "LtbCoreConstants.DELIVERY_COST_TAX".equals(taxValue.getCode()))
                .findFirst().orElse(null);
        final BigDecimal deliveryCostTaxValue = Objects.nonNull(deliveryCostTax) ?
                BigDecimal.valueOf(deliveryCostTax.getAppliedValue()).setScale(2, RoundingMode.HALF_EVEN) :
                BigDecimal.ZERO;
        target.setTotalShippingPrice(source.getDeliveryCost());
        target.setTotalShippingTaxPrice(deliveryCostTaxValue.doubleValue());
    }
}
