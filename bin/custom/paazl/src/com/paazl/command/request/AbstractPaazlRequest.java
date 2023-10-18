package com.paazl.command.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.rest.integration.util.command.rest.request.AbstractRequest;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class AbstractPaazlRequest extends AbstractRequest {
    private String reference;
    @JsonIgnore
    private String apiKey;
    @JsonIgnore
    private String apiSecret;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }
}
