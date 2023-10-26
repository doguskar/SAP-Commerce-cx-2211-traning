package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.PostRefreshTokenCommand;
import com.channeladvisor.rest.command.request.PostRefreshTokenRequest;
import com.channeladvisor.rest.command.response.PostRefreshTokenResponse;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

public class DefaultPostRefreshTokenCommand extends AbstractChanneladvisorRestCommand<PostRefreshTokenRequest, PostRefreshTokenResponse> implements PostRefreshTokenCommand {
    @Override
    public PostRefreshTokenRequest createRequest() {
        return new PostRefreshTokenRequest();
    }

    @Override
    public Class<PostRefreshTokenResponse> getResponseClass() {
        return PostRefreshTokenResponse.class;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getTokenPath();
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getContentType() {
        return MediaType.APPLICATION_FORM_URLENCODED_VALUE;
    }
}
