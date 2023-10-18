package com.paazl.command.impl;

import com.paazl.command.PostCheckoutCommand;
import com.paazl.command.request.PostCheckoutRequest;
import com.paazl.command.response.PostCheckoutResponse;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPostCheckoutCommand extends AbstractPaazlRestCommand<PostCheckoutRequest, PostCheckoutResponse> implements PostCheckoutCommand {

    @Override
    public PostCheckoutRequest createRequest() {
        return new PostCheckoutRequest();
    }

    @Override
    public Class<PostCheckoutResponse> getResponseClass() {
        return PostCheckoutResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getCheckoutPath();
    }
}
