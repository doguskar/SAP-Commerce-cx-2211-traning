package com.paazl.command.impl;

import com.paazl.command.PostOrderCommand;
import com.paazl.command.request.PostOrderRequest;
import com.paazl.command.requestlog.impl.PaazlOrderRequestLogsSaveCommand;
import com.paazl.command.response.PostOrderResponse;
import com.paazl.model.PaazlConfigurationModel;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPostOrderCommand extends AbstractPaazlRestCommand<PostOrderRequest, PostOrderResponse> implements PostOrderCommand {

    @Override
    public PostOrderRequest createRequest() {
        return new PostOrderRequest();
    }

    @Override
    public Class<PostOrderResponse> getResponseClass() {
        return PostOrderResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrderPath();
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return PaazlOrderRequestLogsSaveCommand.class;
    }

    @Override
    public boolean isPersistent(PostOrderRequest request) {
        return true;
    }

    @Override
    public boolean isCreateRequestLogActive(PostOrderRequest request, boolean isFailed) {
        return true;
    }
}
