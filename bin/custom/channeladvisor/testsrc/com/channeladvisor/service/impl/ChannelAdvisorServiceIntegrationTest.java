package com.channeladvisor.service.impl;

import com.channeladvisor.data.OrderData;
import com.channeladvisor.data.ProductData;
import com.channeladvisor.model.CAConfigurationModel;
import com.channeladvisor.model.CAPartialStockUpdateJobModel;
import com.channeladvisor.model.ChannelAdvisorAccountModel;
import com.channeladvisor.model.IntegrationCronJobModel;
import com.channeladvisor.rest.command.response.GetOrdersResponse;
import com.channeladvisor.rest.command.response.GetProductsResponse;
import com.channeladvisor.rest.command.response.PostRefreshTokenResponse;
import com.channeladvisor.service.ChannelAdvisorService;
import com.channeladvisor.service.IntegrationService;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.cronjob.CronJobService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

@IntegrationTest
public class ChannelAdvisorServiceIntegrationTest extends ServicelayerTest {
    private static final Logger LOG = LoggerFactory.getLogger(ChannelAdvisorServiceIntegrationTest.class);
    private static final String BASE_SITE_UID = "testSite";
    private static final String BASE_STORE_UID = "testBaseStore";

    @Resource
    private ChannelAdvisorService channelAdvisorService;
    @Resource
    private BaseSiteService baseSiteService;
    @Resource
    private BaseStoreService baseStoreService;
    @Resource
    private IntegrationService integrationService;
    @Resource
    private CronJobService cronJobService;

    @Before
    public void setUp() throws Exception {
        importCsv("/channeladvisordata/test/channelAdvisor-test.impex", "utf-8");
        baseSiteService.setCurrentBaseSite(BASE_SITE_UID, false);
    }

    @Test
    public void shouldReturnCAConfigurationModel() {
        BaseStoreModel baseStoreModel = baseStoreService.getBaseStoreForUid(BASE_STORE_UID);
        CAConfigurationModel configurationModel = channelAdvisorService.getCAConfiguration(baseStoreModel);
        assertThat(configurationModel).isNotNull();
        configurationModel = channelAdvisorService.getCAConfiguration();
        assertThat(configurationModel).isNotNull();
    }

    @Test
    public void shouldReturnCAAccountModel() {
        ChannelAdvisorAccountModel account = channelAdvisorService.getChannelAdvisorAccount(baseStoreService.getCurrentBaseStore());
        assertThat(account).isNotNull();
    }

    @Test
    public void testRequestAccessToken() throws Exception {
        BaseStoreModel baseStore = baseStoreService.getCurrentBaseStore();
        ChannelAdvisorAccountModel account = channelAdvisorService.getChannelAdvisorAccount(baseStore);
        final PostRefreshTokenResponse response = integrationService.requestRefreshToken(baseStore, account);
        assertThat(response).isNotNull();
        assertThat(response.getAccessToken()).isNotEmpty();
        assertThat(response.getExpiresIn()).isNotNull();
        assertThat(response.getTokenType())
                .isNotEmpty()
                .isEqualTo("bearer");
    }

    @Test
    public void testGetAccessToken() throws Exception {
        BaseStoreModel baseStoreModel = baseStoreService.getCurrentBaseStore();
        String access_token = channelAdvisorService.getAccessToken(baseStoreModel);
        assertThat(access_token)
                .isNotEmpty()
                .isEqualTo("access_token");
        ChannelAdvisorAccountModel advisorAccountModel = channelAdvisorService.getChannelAdvisorAccount(baseStoreModel);
        assertThat(advisorAccountModel.getAccessToken())
                .isNotEmpty()
                .isEqualTo(access_token);
    }

    @Test
    public void testRequestGetProducts() throws Exception {
        BaseStoreModel baseStore = baseStoreService.getCurrentBaseStore();
        ChannelAdvisorAccountModel account = channelAdvisorService.getChannelAdvisorAccount(baseStore);
        IntegrationCronJobModel jobModel = (IntegrationCronJobModel) cronJobService.getCronJob("caPartialStockUpdateCronJob");
        GetProductsResponse response = integrationService.requestGetProducts(baseStore, account, null, null, 0, jobModel);
        assertThat(response).isNotNull();
        List<ProductData> productDataList = response.getValue();
        assertThat(productDataList).isNotEmpty();
        ProductData productData = productDataList.get(0);
        assertThat(productData.getId()).isNotNull();
        assertThat(productData.getQuantityUpdateDateUtc()).isNotNull();
        assertThat(productData.getTotalAvailableQuantity()).isNotNull();
        assertThat(productData.getEan()).isNotNull();
        assertThat(productData.getProfileId()).isNotNull();
        assertThat(productData.getCreateDateUtc()).isNotNull();
        assertThat(productData.getSku()).isNotNull();
    }

    @Test
    public void testGetProductsForPartialStockUpdate() throws Exception {
        BaseStoreModel baseStore = baseStoreService.getCurrentBaseStore();
        ChannelAdvisorAccountModel account = channelAdvisorService.getChannelAdvisorAccount(baseStore);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, 10, 29, 10, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        CAPartialStockUpdateJobModel jobModel = (CAPartialStockUpdateJobModel) cronJobService.getCronJob("caPartialStockUpdateCronJob");
        GetProductsResponse response = channelAdvisorService.getProductsForPartialStockUpdate(baseStore, account, calendar.getTime(), 0, jobModel);
        assertThat(response).isNotNull();
        List<ProductData> productDataList = response.getValue();
        assertThat(productDataList).isNotEmpty();
        ProductData productData = productDataList.get(0);
        assertThat(productData.getId()).isNotNull();
        assertThat(productData.getQuantityUpdateDateUtc()).isNotNull();
        assertThat(productData.getTotalAvailableQuantity()).isNotNull();
        assertThat(productData.getEan()).isNotNull();
        assertThat(productData.getProfileId()).isNull();
        assertThat(productData.getCreateDateUtc()).isNull();
        assertThat(jobModel.getRequestLogList()).isEmpty();
    }

    @Test
    public void testRequestGetOrders() throws Exception {
        BaseStoreModel baseStore = baseStoreService.getCurrentBaseStore();
        ChannelAdvisorAccountModel account = channelAdvisorService.getChannelAdvisorAccount(baseStore);
        CAPartialStockUpdateJobModel jobModel = (CAPartialStockUpdateJobModel) cronJobService.getCronJob("caPartialStockUpdateCronJob");
        GetOrdersResponse response = integrationService.requestGetOrders(baseStore, account, null, null , 0, null, jobModel);
        assertThat(response).isNotNull();
        List<OrderData> orderDataList = response.getValue();
        assertThat(orderDataList).isNotEmpty();
        OrderData orderData = orderDataList.get(0);
        assertThat(orderData.getId()).isNotNull();
        assertThat(orderData.getSiteOrderID()).isNotNull();
        assertThat(orderData.getPublicNotes()).isNotNull();
        assertThat(orderData.getSiteName()).isNotNull();
    }

}
