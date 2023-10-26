package com.channeladvisor.rest.command.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.channeladvisor.data.ProductData;

import java.util.List;

public class GetProductsResponse {
    private List<ProductData> value;
    @JsonProperty("@odata.context")
    private String context;
    @JsonProperty("@odata.nextLink")
    private String nextLink;

    public List<ProductData> getValue() {
        return value;
    }

    public void setValue(List<ProductData> value) {
        this.value = value;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getNextLink() {
        return nextLink;
    }

    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }
}
