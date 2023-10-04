package com.rest.integration.util.command.rest.impl;

import com.rest.integration.util.command.rest.request.MockGetCustomerRequest;
import com.rest.integration.util.command.rest.response.MockGetCustomerResponse;
import org.springframework.http.HttpMethod;

public class DefaultMockGetCustomerCommand extends AbstractMockRestCommand<MockGetCustomerRequest, MockGetCustomerResponse> {

    @Override
    public Class<MockGetCustomerResponse> getResponseClass() {
        return MockGetCustomerResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public String getPath() {
        return "/customer";
    }
}
