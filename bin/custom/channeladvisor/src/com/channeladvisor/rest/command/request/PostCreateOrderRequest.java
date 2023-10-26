package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.channeladvisor.data.OrderData;

public class PostCreateOrderRequest extends AbstractChanneladvisorRequest {
    @JsonProperty("Order")
    private OrderData order;

    public OrderData getOrder() {
        return order;
    }

    public void setOrder(OrderData order) {
        this.order = order;
    }
}
