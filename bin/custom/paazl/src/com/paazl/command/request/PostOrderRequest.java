package com.paazl.command.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.paazl.data.*;

import java.util.List;

public class PostOrderRequest extends AbstractPaazlRequest {
    private String additionalInstruction; // not implemented
    private ContactData consignee;
    private MoneyValueData customsValue;
    private MoneyValueData insuredValue;
    private MoneyValueData codValue;
    private String description;
    private String requestedDeliveryDate;
    private List<ProductData> products;
    private String invoiceNumber;
    private String invoiceDate;
    @JsonProperty("return")
    private ShopOrderPartyData returnProperty;
    private ShopOrderPartyData sender;
    private ShopOrderShippingData shipping;
    private Double weight;

    public String getAdditionalInstruction() {
        return additionalInstruction;
    }

    public void setAdditionalInstruction(String additionalInstruction) {
        this.additionalInstruction = additionalInstruction;
    }

    public ContactData getConsignee() {
        return consignee;
    }

    public void setConsignee(ContactData consignee) {
        this.consignee = consignee;
    }

    public MoneyValueData getCustomsValue() {
        return customsValue;
    }

    public void setCustomsValue(MoneyValueData customsValue) {
        this.customsValue = customsValue;
    }

    public MoneyValueData getInsuredValue() {
        return insuredValue;
    }

    public void setInsuredValue(MoneyValueData insuredValue) {
        this.insuredValue = insuredValue;
    }

    public MoneyValueData getCodValue() {
        return codValue;
    }

    public void setCodValue(MoneyValueData codValue) {
        this.codValue = codValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public List<ProductData> getProducts() {
        return products;
    }

    public void setProducts(List<ProductData> products) {
        this.products = products;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @JsonProperty("return")
    public ShopOrderPartyData getReturnProperty() {
        return returnProperty;
    }

    @JsonProperty("return")
    public void setReturnProperty(ShopOrderPartyData returnProperty) {
        this.returnProperty = returnProperty;
    }

    public ShopOrderPartyData getSender() {
        return sender;
    }

    public void setSender(ShopOrderPartyData sender) {
        this.sender = sender;
    }

    public ShopOrderShippingData getShipping() {
        return shipping;
    }

    public void setShipping(ShopOrderShippingData shipping) {
        this.shipping = shipping;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
