package com.rest.integration.util.command.rest;

import com.rest.integration.util.command.rest.request.MockGetCustomerRequest;
import com.rest.integration.util.command.rest.response.MockGetCustomerResponse;

public interface MockGetCustomerCommand extends IRestCommand<MockGetCustomerRequest, MockGetCustomerResponse[]> {
}
