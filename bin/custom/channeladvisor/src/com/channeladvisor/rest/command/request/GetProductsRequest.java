package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class GetProductsRequest extends AbstractChanneladvisorRequest {
    @JsonProperty("$filter")
    private String filter;
    @JsonProperty("$select")
    private String select;
    @JsonProperty("$skip")
    private Integer skip;

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public Integer getSkip() {
        return Objects.nonNull(skip) && skip <= 0 ? null : skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }
}
