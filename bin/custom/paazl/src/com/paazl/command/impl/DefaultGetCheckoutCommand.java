package com.paazl.command.impl;

import com.paazl.command.GetCheckoutCommand;
import com.paazl.command.request.GetCheckoutRequest;
import com.paazl.command.requestlog.impl.PaazlGetCheckoutRequestLogSaveCommand;
import com.paazl.command.response.GetCheckoutResponse;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultGetCheckoutCommand extends AbstractPaazlRestCommand<GetCheckoutRequest, GetCheckoutResponse> implements GetCheckoutCommand {

    @Override
    public GetCheckoutRequest createRequest() {
        return new GetCheckoutRequest();
    }

    @Override
    public Class<GetCheckoutResponse> getResponseClass() {
        return GetCheckoutResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getCheckoutPath();
    }

    @Override
    public boolean isCreateRequestLogActive(GetCheckoutRequest request, boolean isFailed) {
        return true;
    }

    @Override
    public boolean isPersistent(GetCheckoutRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return PaazlGetCheckoutRequestLogSaveCommand.class;
    }
}
