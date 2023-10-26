package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductExportRequest extends AbstractChanneladvisorRequest {
    @JsonProperty("Token")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
