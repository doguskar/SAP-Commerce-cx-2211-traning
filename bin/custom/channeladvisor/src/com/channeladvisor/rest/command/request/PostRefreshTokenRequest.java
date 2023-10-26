package com.channeladvisor.rest.command.request;

import com.channeladvisor.constants.ChanneladvisorConstants;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRefreshTokenRequest extends AbstractChanneladvisorRequest {
    @JsonProperty("grant_type")
    private String grantType;
    @JsonProperty("refresh_token")
    private String refreshToken;

    public String getGrantType() {
        return ChanneladvisorConstants.REFRESH_TOKEN;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
