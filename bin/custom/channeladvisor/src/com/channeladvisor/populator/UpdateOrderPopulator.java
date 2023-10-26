package com.channeladvisor.populator;

import com.channeladvisor.rest.command.request.PatchOrderRequest;
import com.channeladvisor.service.ChannelAdvisorService;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Objects;

public class UpdateOrderPopulator<SOURCE extends OrderModel, TARGET extends PatchOrderRequest> implements Populator<SOURCE, TARGET> {
    private static final Logger LOG = LoggerFactory.getLogger(UpdateOrderPopulator.class);

    @Resource
    private ChannelAdvisorService channelAdvisorService;

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        /***
         * https://knowledge.channeladvisor.com/kc?id=kb_article_view&sysparm_article=KB0018091
         * Implementable attributes; PublicNotes, SpecialInstructions, EstimatedShipDateUtc, DeliverByDateUtc, FlagID, FlagDescription, CheckoutStatus, ShippingStatus, CheckoutDateUtc, PaymentMethod, PaymentTransactionID, PaymentCreditCardLast4, PaymentMerchantReferenceNumber, ShippingTitle, ShippingSuffix, ShippingCompanyName, ShippingCompanyJobTitle, ShippingEveningPhone, PaymentStatus, PaymentDateUtc
         *  SiteOrderID is not updatable
         *  Billing information may not be updated for paid orders. (All orders sent to CA have been paid.)
         *  */
        target.setPrivateNotes(getPrivateNotes(source));
        channelAdvisorService.setShippingAddressDetails(source, target);
    }

    private String getPrivateNotes(SOURCE source) {
        LanguageModel language = source.getUser().getSessionLanguage();
        if (Objects.nonNull(language)) {
            return "Language: " + language.getIsocode();
        }
        return null;
    }

}