package com.rest.integration.util.service.impl;

import com.rest.integration.util.command.rest.request.MockGetCustomerRequest;
import com.rest.integration.util.command.rest.response.MockGetCustomerResponse;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

@IntegrationTest
public class DefaultIntegrationServiceTest extends ServicelayerTest {


    @Test
    public void shouldReturnCustomers() {
        /*MockGetCustomerRequest request = new MockGetCustomerRequest();
        MockGetCustomerResponse response = (MockGetCustomerResponse) integrationService.request(request, MockGetCustomerResponse.class);
        System.out.println("response is null " + response == null);
        Assert.assertNotNull(response);*/
    }
}
