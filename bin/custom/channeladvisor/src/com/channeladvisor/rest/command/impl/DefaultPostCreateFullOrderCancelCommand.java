package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.PostCreateFullOrderCancelCommand;
import com.channeladvisor.rest.command.request.PostCreateFullOrderCancelRequest;
import com.channeladvisor.rest.command.response.PostCreateFullOrderCancelResponse;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPostCreateFullOrderCancelCommand extends AbstractChanneladvisorRestCommand<PostCreateFullOrderCancelRequest, PostCreateFullOrderCancelResponse> implements PostCreateFullOrderCancelCommand {
    @Override
    public PostCreateFullOrderCancelRequest createRequest() {
        return new PostCreateFullOrderCancelRequest();
    }

    @Override
    public Class<PostCreateFullOrderCancelResponse> getResponseClass() {
        return PostCreateFullOrderCancelResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getOrderCancelPath();
    }
}
