package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.GetProductExportCommand;
import com.channeladvisor.rest.command.request.GetProductExportRequest;
import com.channeladvisor.rest.command.response.GetProductExportResponse;
import com.channeladvisor.rest.requestlogs.command.impl.IntegrationJobRequestLogListCommand;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultGetProductExportCommand extends AbstractChanneladvisorRestCommand<GetProductExportRequest, GetProductExportResponse> implements GetProductExportCommand {
    @Override
    public GetProductExportRequest createRequest() {
        return new GetProductExportRequest();
    }

    @Override
    public Class<GetProductExportResponse> getResponseClass() {
        return GetProductExportResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getProductExportPath();
    }

    @Override
    public boolean isCreateRequestLogWhenFailedActive() {
        return true;
    }

    @Override
    public boolean isPersistent(GetProductExportRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return IntegrationJobRequestLogListCommand.class;
    }

}
