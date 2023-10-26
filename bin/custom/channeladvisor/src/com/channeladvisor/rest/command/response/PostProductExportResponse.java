package com.channeladvisor.rest.command.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostProductExportResponse {
    @JsonProperty("$id")
    private String id;
    @JsonProperty("Token")
    private String token;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("StartedOnUtc")
    private String startedOnUtc;
    @JsonProperty("ResponseFileUrl")
    private String responseFileUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartedOnUtc() {
        return startedOnUtc;
    }

    public void setStartedOnUtc(String startedOnUtc) {
        this.startedOnUtc = startedOnUtc;
    }

    public String getResponseFileUrl() {
        return responseFileUrl;
    }

    public void setResponseFileUrl(String responseFileUrl) {
        this.responseFileUrl = responseFileUrl;
    }
}
