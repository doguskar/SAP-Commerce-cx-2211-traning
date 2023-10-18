package com.paazl.command.request;

import com.paazl.data.PickupLocationData;
import com.paazl.data.ShippingOptionData;

public class PostCheckoutRequest extends AbstractPaazlRequest {
    private PickupLocationData pickupLocation;
    private String preferredDeliveryDate;
    private ShippingOptionData shippingOption;
    private String token;

    public PickupLocationData getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(PickupLocationData pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getPreferredDeliveryDate() {
        return preferredDeliveryDate;
    }

    public void setPreferredDeliveryDate(String preferredDeliveryDate) {
        this.preferredDeliveryDate = preferredDeliveryDate;
    }

    public ShippingOptionData getShippingOption() {
        return shippingOption;
    }

    public void setShippingOption(ShippingOptionData shippingOption) {
        this.shippingOption = shippingOption;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
