package com.channeladvisor.rest.command.impl;

import com.channeladvisor.constants.ChanneladvisorConstants;
import com.channeladvisor.rest.command.PatchOrderCommand;
import com.channeladvisor.rest.command.request.PatchOrderRequest;
import com.channeladvisor.rest.command.response.PatchOrderResponse;
import com.channeladvisor.rest.requestlogs.command.impl.OrderCARequestLogsCommand;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPatchOrderCommand extends AbstractChanneladvisorRestCommand<PatchOrderRequest, PatchOrderResponse> implements PatchOrderCommand {
    @Override
    public PatchOrderRequest createRequest() {
        return new PatchOrderRequest();
    }

    @Override
    public Class<PatchOrderResponse> getResponseClass() {
        return PatchOrderResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.PATCH;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrdersPath() + ChanneladvisorConstants.PATH_ORDER_ID;
    }

    @Override
    public boolean isCreateRequestLogActive(PatchOrderRequest request, boolean isFailed) {
        return true;
    }

    @Override
    public boolean isPersistent(PatchOrderRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return OrderCARequestLogsCommand.class;
    }
}
