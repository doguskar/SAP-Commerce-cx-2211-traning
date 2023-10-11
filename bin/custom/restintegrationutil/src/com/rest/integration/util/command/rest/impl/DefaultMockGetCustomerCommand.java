package com.rest.integration.util.command.rest.impl;

import com.rest.integration.util.command.rest.MockGetCustomerCommand;
import com.rest.integration.util.command.rest.request.MockGetCustomerRequest;
import com.rest.integration.util.command.rest.response.MockGetCustomerResponse;
import org.springframework.http.HttpMethod;

public class DefaultMockGetCustomerCommand extends AbstractMockRestCommand<MockGetCustomerRequest, MockGetCustomerResponse[]> implements MockGetCustomerCommand {

    @Override
    public MockGetCustomerRequest createRequest() {
        return new MockGetCustomerRequest();
    }

    @Override
    public Class getResponseClass() {
        return MockGetCustomerResponse[].class;
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
