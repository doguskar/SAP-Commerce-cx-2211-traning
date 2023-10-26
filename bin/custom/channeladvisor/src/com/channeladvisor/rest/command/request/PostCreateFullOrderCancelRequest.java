package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostCreateFullOrderCancelRequest extends AbstractChanneladvisorRequest {
    @JsonProperty("OrderID")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
