package com.paazl.command.response;

import com.paazl.data.PickupLocationData;
import com.paazl.data.ShippingOptionData;

public class GetCheckoutResponse {
    private String consigneeCountryCode;
    private String consigneePostalCode;
    private String deliveryType;
    private String notificationEmailAddress;
    private String notificationPhoneNumber;
    private String pickupDate;
    private PickupLocationData pickupLocation;
    private String preferredDeliveryDate;
    private String reference;
    private ShippingOptionData shippingOption;
    private String token;
    private Integer webshopId;

    public String getConsigneeCountryCode() {
        return consigneeCountryCode;
    }

    public void setConsigneeCountryCode(String consigneeCountryCode) {
        this.consigneeCountryCode = consigneeCountryCode;
    }

    public String getConsigneePostalCode() {
        return consigneePostalCode;
    }

    public void setConsigneePostalCode(String consigneePostalCode) {
        this.consigneePostalCode = consigneePostalCode;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getNotificationEmailAddress() {
        return notificationEmailAddress;
    }

    public void setNotificationEmailAddress(String notificationEmailAddress) {
        this.notificationEmailAddress = notificationEmailAddress;
    }

    public String getNotificationPhoneNumber() {
        return notificationPhoneNumber;
    }

    public void setNotificationPhoneNumber(String notificationPhoneNumber) {
        this.notificationPhoneNumber = notificationPhoneNumber;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public Integer getWebshopId() {
        return webshopId;
    }

    public void setWebshopId(Integer webshopId) {
        this.webshopId = webshopId;
    }
}
