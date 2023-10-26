package com.paazl.facede.impl;

import com.paazl.command.response.PostCheckoutTokenResponse;
import com.paazl.data.PaazlCheckoutInitializationData;
import com.paazl.data.ShipmentParametersData;
import com.paazl.facede.PaazlFacade;
import com.paazl.model.PaazlConfigurationModel;
import com.paazl.model.PaazlWidgetParametersModel;
import com.paazl.service.PaazlService;
import com.customcore.util.DateUtil;
import de.hybris.platform.commerceservices.order.CommerceCheckoutService;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Objects;

public class DefaultPaazlFacade implements PaazlFacade {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultPaazlFacade.class);
    private static final String TOKEN_EXPIRATION_DAY = "paazl.token.expiration.day";

    @Resource
    private PaazlService paazlService;
    @Resource
    private CartService cartService;
    @Resource
    private Converter<PaazlWidgetParametersModel, PaazlCheckoutInitializationData> paazlCheckoutInitializationConverter;
    @Resource
    private CommonI18NService commonI18NService;
    @Resource
    private ModelService modelService;
    @Resource
    private CommerceCheckoutService commerceCheckoutService;
    @Resource
    private ConfigurationService configurationService;
    /*@Resource
    private DefaultFindDeliveryCostDao findDeliveryCostDao;*/

    @Override
    public PaazlCheckoutInitializationData getPaazlCheckoutInitializationData() {
        if (cartService.hasSessionCart()) {
            final CartModel cart = cartService.getSessionCart();
            final AddressModel deliveryAddress = cart.getDeliveryAddress();
            if (Objects.nonNull(deliveryAddress)) {
                final PaazlConfigurationModel paazlConfiguration = paazlService.getPaazlConfiguration();
                final PaazlWidgetParametersModel widgetParameters = paazlConfiguration.getPaazlWidgetParameters();
                final PaazlCheckoutInitializationData initializationData = Objects.nonNull(widgetParameters) ?
                        paazlCheckoutInitializationConverter.convert(widgetParameters) :
                        new PaazlCheckoutInitializationData();
                //Set required data to initializationData
                final String paazlToken = getPaazlToken(cart);
                if (StringUtils.isNotBlank(paazlToken)) {
                    initializationData.setToken(paazlToken);
                    initializationData.setApiKey(paazlConfiguration.getApiKey());
                    final CountryModel country = deliveryAddress.getCountry();
                    if (Objects.nonNull(country)) {
                        initializationData.setConsigneeCountryCode(country.getIsocode()); //"NL"
                        final String postalCode = deliveryAddress.getPostalcode(); //"1019HD";
                        if (StringUtils.isNotBlank(postalCode)) {
                            initializationData.setConsigneePostalCode(postalCode);
                            setOptionalDataToInitializationData(initializationData, paazlConfiguration, cart);
                            return initializationData;
                        } else {
                            LOG.error("PAAZL initialization error. data postal code is null for the address({})", deliveryAddress.getPk());
                        }
                    } else {
                        LOG.error("PAAZL initialization error. country is null for the address({})", deliveryAddress.getPk());
                    }
                } else {
                    LOG.error("PAAZL initialization error. token is null");
                }
            }
        }
        return null;
    }

    private String getPaazlToken(CartModel cart) {
        String paazlToken = cart.getPaazlToken();
        final Date paazlTokenExpirationDate = cart.getPaazlTokenExpirationDate();
        final Date now = new Date();
        if (StringUtils.isNotBlank(paazlToken) && Objects.nonNull(paazlTokenExpirationDate) && now.before(paazlTokenExpirationDate)) {
            return paazlToken;
        }
        final PostCheckoutTokenResponse response = paazlService.requestCheckoutToken(cart);
        if (Objects.nonNull(response) && StringUtils.isNotBlank(response.getToken())) {
            paazlToken = response.getToken();
            cart.setPaazlToken(paazlToken);
            cart.setPaazlTokenExpirationDate(DateUtil.addDayToDate(now, configurationService.getConfiguration().getInt(TOKEN_EXPIRATION_DAY, 30)));
            modelService.save(cart);
        }
        return paazlToken;
    }

    private void setOptionalDataToInitializationData(final PaazlCheckoutInitializationData initializationData, final PaazlConfigurationModel paazlConfiguration, final CartModel cart) {
        // Lang
        final LanguageModel language = commonI18NService.getCurrentLanguage();
        if (Objects.nonNull(language) && paazlConfiguration.getSupportedLanguages().contains(language.getIsocode())){
            // default value en
            initializationData.setLanguage(language.getIsocode());
        }
        // ShipmentParameters
        ShipmentParametersData shipmentParameters = new ShipmentParametersData();
        shipmentParameters.setTotalPrice(-1d);//findDeliveryCostDao.getAmountForDeliveryCostCalculation(cart)
        initializationData.setShipmentParameters(shipmentParameters);

        initializationData.setCurrency(cart.getCurrency().getIsocode());
    }

    @Override
    public void configureDeliveryStep(Model model) {
        PaazlConfigurationModel paazlConfiguration = paazlService.getPaazlConfiguration();
        boolean isPaazlActive = Objects.nonNull(paazlConfiguration);
        model.addAttribute("isPaazlActive", isPaazlActive);
        if (isPaazlActive) {
            model.addAttribute("paazlCheckoutJsSrc", paazlConfiguration.getCheckoutJsSrc());
        }
    }

    @Override
    public boolean saveCheckout() {
        return cartService.hasSessionCart() ? paazlService.saveCheckout(cartService.getSessionCart()) : false;
    }

    @Override
    public boolean setDeliveryCost() {
        return cartService.hasSessionCart() ? paazlService.setDeliveryCost(cartService.getSessionCart()) : false;
    }
}
