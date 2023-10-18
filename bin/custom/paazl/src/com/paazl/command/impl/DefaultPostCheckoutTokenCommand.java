package com.paazl.command.impl;

import com.paazl.command.PostCheckoutTokenCommand;
import com.paazl.command.request.PostCheckoutTokenRequest;
import com.paazl.command.response.PostCheckoutTokenResponse;
import com.paazl.model.PaazlConfigurationModel;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPostCheckoutTokenCommand extends AbstractPaazlRestCommand<PostCheckoutTokenRequest, PostCheckoutTokenResponse> implements PostCheckoutTokenCommand {

    @Override
    public PostCheckoutTokenRequest createRequest() {
        return new PostCheckoutTokenRequest();
    }

    @Override
    public Class<PostCheckoutTokenResponse> getResponseClass() {
        return PostCheckoutTokenResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getCheckoutTokenPath();
    }
}
