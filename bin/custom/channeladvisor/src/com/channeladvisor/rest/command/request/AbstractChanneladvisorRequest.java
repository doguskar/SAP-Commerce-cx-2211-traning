package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.rest.integration.util.command.rest.request.AbstractRequest;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class AbstractChanneladvisorRequest extends AbstractRequest implements ChannelAdvisorIRequest {
    @JsonIgnore
    private String accessToken;
    @JsonIgnore
    private String applicationId;
    @JsonIgnore
    private String sharedSecret;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getSharedSecret() {
        return sharedSecret;
    }

    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }
}
