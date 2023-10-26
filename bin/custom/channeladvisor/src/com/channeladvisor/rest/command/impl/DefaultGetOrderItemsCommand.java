package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.GetOrderItemsCommand;
import com.channeladvisor.rest.command.request.GetOrderItemsRequest;
import com.channeladvisor.rest.command.response.GetOrderItemsResponse;
import com.channeladvisor.rest.requestlogs.command.impl.IntegrationJobRequestLogListCommand;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultGetOrderItemsCommand extends AbstractChanneladvisorRestCommand<GetOrderItemsRequest, GetOrderItemsResponse> implements GetOrderItemsCommand {
    @Override
    public GetOrderItemsRequest createRequest() {
        return new GetOrderItemsRequest();
    }

    @Override
    public Class<GetOrderItemsResponse> getResponseClass() {
        return GetOrderItemsResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrderItemsPath();
    }

    @Override
    public boolean isCreateRequestLogWhenFailedActive() {
        return true;
    }

    @Override
    public boolean isPersistent(GetOrderItemsRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return IntegrationJobRequestLogListCommand.class;
    }
}
