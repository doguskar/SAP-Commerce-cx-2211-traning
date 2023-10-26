package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.PutOrderItemAdjustmentsCommand;
import com.channeladvisor.rest.command.request.PutOrderItemAdjustmentsRequest;
import com.channeladvisor.rest.command.response.PutOrderItemAdjustmentsResponse;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

public class DefaultPutOrderItemAdjustmentsCommand extends AbstractChanneladvisorRestCommand<PutOrderItemAdjustmentsRequest, PutOrderItemAdjustmentsResponse> implements PutOrderItemAdjustmentsCommand {
    @Override
    public PutOrderItemAdjustmentsRequest createRequest() {
        return new PutOrderItemAdjustmentsRequest();
    }

    @Override
    public Class<PutOrderItemAdjustmentsResponse> getResponseClass() {
        return PutOrderItemAdjustmentsResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.PUT;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrderItemAdjustmentsPath();
    }

    @Override
    public String getContentType() {
        return MediaType.APPLICATION_JSON_VALUE;
    }
}
