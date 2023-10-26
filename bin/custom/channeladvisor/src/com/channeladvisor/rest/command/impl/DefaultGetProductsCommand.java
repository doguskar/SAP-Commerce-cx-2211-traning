package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.GetProductsCommand;
import com.channeladvisor.rest.command.request.GetProductsRequest;
import com.channeladvisor.rest.command.response.GetProductsResponse;
import com.channeladvisor.rest.requestlogs.command.impl.IntegrationJobRequestLogListCommand;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultGetProductsCommand extends AbstractChanneladvisorRestCommand<GetProductsRequest, GetProductsResponse> implements GetProductsCommand {
    @Override
    public GetProductsRequest createRequest() {
        return new GetProductsRequest();
    }

    @Override
    public Class<GetProductsResponse> getResponseClass() {
        return GetProductsResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getProductsPath(); // + $expand=Attributes,Labels,Images,DCQuantities
    }

    @Override
    public boolean isCreateRequestLogWhenFailedActive() {
        return true;
    }

    @Override
    public boolean isPersistent(GetProductsRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return IntegrationJobRequestLogListCommand.class;
    }
}
