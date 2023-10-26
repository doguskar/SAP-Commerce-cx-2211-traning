package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.GetOrdersCommand;
import com.channeladvisor.rest.command.request.GetOrdersRequest;
import com.channeladvisor.rest.command.response.GetOrdersResponse;
import com.channeladvisor.rest.requestlogs.command.impl.IntegrationJobRequestLogListCommand;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultGetOrdersCommand extends AbstractChanneladvisorRestCommand<GetOrdersRequest, GetOrdersResponse> implements GetOrdersCommand {
    @Override
    public GetOrdersRequest createRequest() {
        return new GetOrdersRequest ();
    }

    @Override
    public Class<GetOrdersResponse> getResponseClass() {
        return GetOrdersResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrdersPath();
    }

    @Override
    public boolean isCreateRequestLogWhenFailedActive() {
        return true;
    }

    @Override
    public boolean isPersistent(GetOrdersRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return IntegrationJobRequestLogListCommand.class;
    }
}
