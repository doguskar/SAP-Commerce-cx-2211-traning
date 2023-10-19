package com.paazl.service.impl;

import static org.fest.assertions.Assertions.assertThat;

import com.paazl.command.response.GetCheckoutResponse;
import com.paazl.command.response.PostCheckoutResponse;
import com.paazl.command.response.PostCheckoutTokenResponse;
import com.paazl.command.response.PostOrderResponse;
import com.paazl.data.*;
import com.paazl.model.PaazlConfigurationModel;
import com.paazl.service.PaazlService;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.commerceservices.customer.CustomerService;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.rmi.UnexpectedException;
import java.util.Collection;
import java.util.List;

@IntegrationTest
public class PaazlServiceIntegrationTest extends ServicelayerTest {
    private static final Logger LOG = LoggerFactory.getLogger(PaazlServiceIntegrationTest.class);
    private static final String CUSTOMER_ID = "test@hybris.net";
    private static final String BASE_SITE_UID = "testSite";
    private static final String BASE_STORE_UID = "testBaseStore";

    @Resource
    private PaazlService paazlService;
    @Resource
    private UserService userService;
    @Resource
    private CustomerService customerService;
    @Resource
    private BaseSiteService baseSiteService;
    @Resource
    private BaseStoreService baseStoreService;
    @Resource
    private CartService cartService;

    @Before
    public void setUp() throws Exception {
        importCsv("/paazl/import/test/paazl.impex", "utf-8");
        importCsv("/paazl/import/test/sapProductConfig_promotionDummyTestData.impex", "utf-8");
        CustomerModel customer = customerService.getCustomerByCustomerId(CUSTOMER_ID);
        userService.setCurrentUser(customer);
        Collection<CartModel> cartModels = customer.getCarts();
        cartService.setSessionCart(cartModels.iterator().next());
        baseSiteService.setCurrentBaseSite(BASE_SITE_UID, false);
    }

    @Test
    public void testCheckoutToken() throws Exception {
        if (cartService.hasSessionCart()) {
            PostCheckoutTokenResponse response = paazlService.requestCheckoutToken(cartService.getSessionCart());
            assertThat(response).isNotNull();
            assertThat(response.getToken()).isNotNull();
            assertThat(response.getToken()).isEqualToIgnoringCase("token123");
        } else {
            throw new UnexpectedException("Session cart cannot be null");
        }
    }

    @Test
    public void shouldReturnPaazlConfigurationModel() {
        BaseStoreModel baseStoreModel = baseStoreService.getBaseStoreForUid(BASE_STORE_UID);
        PaazlConfigurationModel paazlConfiguration = paazlService.getPaazlConfiguration(baseStoreModel);
        assertThat(paazlConfiguration).isNotNull();
        paazlConfiguration = paazlService.getPaazlConfiguration();
        assertThat(paazlConfiguration).isNotNull();
    }

    @Test
    public void testGetCheckoutResponseContent() throws Exception {
        if (cartService.hasSessionCart()) {
            GetCheckoutResponse response = paazlService.requestGetCheckout(cartService.getSessionCart());
            assertThat(response).isNotNull();
            assertThat(response.getConsigneeCountryCode()).isNotNull();
            assertThat(response.getConsigneePostalCode()).isNotNull();
            assertThat(response.getDeliveryType()).isNotNull();
            assertThat(response.getNotificationEmailAddress()).isNotNull();
            assertThat(response.getNotificationPhoneNumber()).isNotNull();
            assertThat(response.getPickupDate()).isNotNull();
            PickupLocationData pickupLocationData = response.getPickupLocation();
            assertThat(pickupLocationData).isNotNull();
            AddressData pickupLocationDataAddress = pickupLocationData.getAddress();
            assertThat(pickupLocationDataAddress).isNotNull();
            assertThat(pickupLocationDataAddress.getCity()).isNotNull();
            assertThat(pickupLocationDataAddress.getCountry()).isNotNull();
            assertThat(pickupLocationDataAddress.getPostalCode()).isNotNull();
            assertThat(pickupLocationDataAddress.getProvince()).isNotNull();
            assertThat(pickupLocationDataAddress.getStreet()).isNotNull();
            assertThat(pickupLocationDataAddress.getStreetNumber()).isNotNull();
            assertThat(pickupLocationDataAddress.getStreetNumberSuffix()).isNotNull();
            assertThat(pickupLocationData.getCode()).isNotEmpty();
            CoordinatesData coordinates = pickupLocationData.getCoordinates();
            assertThat(coordinates).isNotNull();
            assertThat(coordinates.getLatitude()).isNotNull();
            assertThat(coordinates.getLongitude()).isNotNull();
            assertThat(pickupLocationData.getDistance()).isNotNull();
            assertThat(pickupLocationData.getName()).isNotNull();
            List<DpeningTimeData> openingTimes = pickupLocationData.getOpeningTimes();
            assertThat(openingTimes).isNotEmpty();
            DpeningTimeData openingTimeData = openingTimes.get(0);
            assertThat(openingTimeData.getAlwaysOpen()).isEqualTo(true);
            assertThat(openingTimeData.getDay()).isNotEmpty();
            List<BusinessHourData> businessHours = openingTimeData.getBusinessHours();
            assertThat(businessHours).isNotEmpty();
            BusinessHourData businessHourData = businessHours.get(0);
            assertThat(businessHourData.getFrom()).isNotNull();
            assertThat(businessHourData.getTo()).isNotNull();
            assertThat(response.getPreferredDeliveryDate()).isNotNull();
            assertThat(response.getReference()).isNotNull();
            ShippingOptionData shippingOption = response.getShippingOption();
            assertThat(shippingOption).isNotNull();
            CarrierData carrierData = shippingOption.getCarrier();
            assertThat(carrierData).isNotNull();
            assertThat(carrierData.getDescription()).isNotNull();
            assertThat(carrierData.getName()).isNotNull();
            List<DeliveryDateData> deliveryDates = shippingOption.getDeliveryDates();
            assertThat(deliveryDates).isNotEmpty();
            DeliveryDateData deliveryDateData = deliveryDates.get(0);
            assertThat(deliveryDateData.getDeliveryDate()).isNotNull();
            assertThat(deliveryDateData.getPickupDate()).isNotNull();
            assertThat(deliveryDateData.getCutoffTime()).isNotNull();
            TimeRangeData timeRangeData = deliveryDateData.getTimeRange();
            assertThat(timeRangeData).isNotNull();
            assertThat(timeRangeData.getEnd()).isNotNull();
            assertThat(timeRangeData.getStart()).isNotNull();
            DeliveryWindowData deliveryWindowData = shippingOption.getDeliveryWindow();
            assertThat(deliveryWindowData).isNotNull();
            assertThat(deliveryWindowData.getEnd()).isNotNull();
            assertThat(deliveryWindowData.getStart()).isNotNull();
            assertThat(shippingOption.getDescription()).isNotNull();
            EstimatedDeliveryRangeData estimatedDeliveryRangeData = shippingOption.getEstimatedDeliveryRange();
            assertThat(estimatedDeliveryRangeData).isNotNull();
            assertThat(estimatedDeliveryRangeData.getEarliestDate()).isNotNull();
            assertThat(estimatedDeliveryRangeData.getLatestDate()).isNotNull();
            assertThat(estimatedDeliveryRangeData.getMax()).isNotNull();
            assertThat(estimatedDeliveryRangeData.getMin()).isNotNull();
            assertThat(shippingOption.getIdentifier()).isNotNull();
            assertThat(shippingOption.getName()).isNotNull();
            assertThat(shippingOption.getRate()).isNotNull();
            List<String> tags = shippingOption.getTags();
            assertThat(tags).isNotEmpty();
            assertThat(response.getToken()).isNotNull();
            assertThat(response.getWebshopId()).isNotNull();
        } else {
            throw new UnexpectedException("Session cart cannot be null");
        }
    }

    @Test
    public void testSaveCart() throws Exception {
        if (cartService.hasSessionCart()) {
            CartModel cartModel = cartService.getSessionCart();
            assertThat(paazlService.saveCheckout(cartModel)).isEqualTo(true);
            GetCheckoutResponse getCheckoutResponse = paazlService.getGetCheckoutResponse(cartModel);
            assertThat(getCheckoutResponse).isNotNull();
            assertThat(cartModel.getCarrier()).isNotEmpty();
            assertThat(cartModel.getPaazlDeliveryCost()).isEqualTo(4.95);
            DeliveryModeModel deliveryModeModel = cartModel.getDeliveryMode();
            assertThat(getCheckoutResponse.getShippingOption().getIdentifier()).isEqualTo(deliveryModeModel.getCode());

        } else {
            throw new UnexpectedException("Session cart cannot be null");
        }
    }

    @Test
    public void testPostCheckout() throws Exception {
        if (cartService.hasSessionCart()) {
            CartModel cartModel = cartService.getSessionCart();
            assertThat(paazlService.saveCheckout(cartModel)).isEqualTo(true);
            GetCheckoutResponse getCheckoutResponse = paazlService.getGetCheckoutResponse(cartModel);
            assertThat(getCheckoutResponse).isNotNull();
            PostCheckoutResponse postCheckoutResponse = paazlService.requestPostCheckout(getCheckoutResponse);
            assertThat(postCheckoutResponse).isNotNull();
        } else {
            throw new UnexpectedException("Session cart cannot be null");
        }
    }

}
