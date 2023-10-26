package com.paazl.command.impl;

import com.paazl.command.PostOrderShipmentsCommand;
import com.paazl.command.request.PostOrderShipmentsRequest;
import com.paazl.command.requestlog.impl.PaazlOrderShipmentsRequestLogsSaveCommand;
import com.paazl.command.response.PostOrderShipmentsResponse;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPostOrderShipmentsCommand extends AbstractPaazlRestCommand<PostOrderShipmentsRequest, PostOrderShipmentsResponse> implements PostOrderShipmentsCommand {
    @Override
    public PostOrderShipmentsRequest createRequest() {
        return new PostOrderShipmentsRequest();
    }

    @Override
    public Class<PostOrderShipmentsResponse> getResponseClass() {
        return PostOrderShipmentsResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrderShipmentsPath();
    }

    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return PaazlOrderShipmentsRequestLogsSaveCommand.class;
    }

    @Override
    public boolean isPersistent(PostOrderShipmentsRequest request) {
        return true;
    }

    @Override
    public boolean isCreateRequestLogActive(PostOrderShipmentsRequest request, boolean isFailed) {
        return true;
    }
}
