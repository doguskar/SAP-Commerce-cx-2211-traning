package com.paazl.command.response;

import com.paazl.data.ShipmentData;

import java.util.List;

public class PostOrderShipmentsResponse {
    private List<ShipmentData> shipments;

    public List<ShipmentData> getShipments() {
        return shipments;
    }

    public void setShipments(List<ShipmentData> shipments) {
        this.shipments = shipments;
    }
}
