package com.channeladvisor.models;

import com.channeladvisor.data.OrderData;
import de.hybris.platform.core.model.order.OrderModel;

public class OrderPair {
    private OrderData orderData;
    private OrderModel orderModel;

    public OrderData getOrderData() {
        return orderData;
    }

    public void setOrderData(OrderData orderData) {
        this.orderData = orderData;
    }

    public OrderModel getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(OrderModel orderModel) {
        this.orderModel = orderModel;
    }
}
