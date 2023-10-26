package com.channeladvisor.rest.command.request;

import com.rest.integration.util.command.rest.request.IRequest;

public interface ChannelAdvisorIRequest extends IRequest {
    String getAccessToken();

    void setAccessToken(String accessToken);

    String getApplicationId();

    void setApplicationId(String applicationId);

    String getSharedSecret();

    void setSharedSecret(String sharedSecret);
}
