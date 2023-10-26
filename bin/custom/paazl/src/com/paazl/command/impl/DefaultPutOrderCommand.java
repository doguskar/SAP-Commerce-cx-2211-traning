package com.paazl.command.impl;

import com.paazl.command.PutOrderCommand;
import com.paazl.command.request.PostOrderRequest;
import com.paazl.command.request.PutOrderRequest;
import com.paazl.command.requestlog.impl.PaazlOrderRequestLogsSaveCommand;
import com.paazl.command.response.PutOrderResponse;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPutOrderCommand extends AbstractPaazlRestCommand<PutOrderRequest, PutOrderResponse> implements PutOrderCommand {

    @Override
    public PutOrderRequest createRequest() {
        return new PutOrderRequest();
    }

    @Override
    public Class<PutOrderResponse> getResponseClass() {
        return PutOrderResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.PUT;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrderPath();
    }
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return PaazlOrderRequestLogsSaveCommand.class;
    }

    @Override
    public boolean isPersistent(PutOrderRequest request) {
        return true;
    }

    @Override
    public boolean isCreateRequestLogActive(PutOrderRequest request, boolean isFailed) {
        return true;
    }

}
