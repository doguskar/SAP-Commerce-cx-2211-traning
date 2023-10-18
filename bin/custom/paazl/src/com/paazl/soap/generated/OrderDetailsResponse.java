/**
 * OrderDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrderDetailsResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private String webshopId;

    private String matrixCode;

    private java.util.Calendar createDate;

    private String companyName;

    private String vatNumber;

    private String name;

    private String nameOther;

    private com.paazl.soap.generated.AddressType shipToAddress;

    private String emailAddress;

    private String phoneNumber;

    private String senderName;

    private com.paazl.soap.generated.AddressType senderAddress;

    private String returnName;

    private com.paazl.soap.generated.AddressType returnAddress;

    private com.paazl.soap.generated.ShippingOptionDetailsType shippingOption;

    private com.paazl.soap.generated.ServicePointDetailsType servicePointDetails;

    private int numberOfArticles;

    private com.paazl.soap.generated.ShippingPaymentType shippingPaymentType;

    private String billingAccountNumber;

    private String invoiceNumber;

    private java.util.Date invoiceDate;

    private java.math.BigDecimal packagingWeight;

    private java.math.BigDecimal customsValue;

    private String customsValueCurrency;

    private com.paazl.soap.generated.DutiesPaymentType dutiesPaymentType;

    private String dutiesAccountNumber;

    private java.math.BigDecimal orderWeight;

    private Integer maxLabels;

    private boolean collo;

    private java.math.BigDecimal codValue;

    private String codValueCurrency;

    private Integer insuredValue;

    private String insuredValueCurrency;

    private com.paazl.soap.generated.PackagingTypeType packagingType;

    private java.util.Date pickupDate;

    private java.util.Date preferredDeliveryDate;

    private Boolean preferredDateChosen;

    private String description;

    private String additionalInstruction;

    private com.paazl.soap.generated.ShipperNotificationTypeType shipperNotificationType;

    private String shipperNotificationTarget;

    private com.paazl.soap.generated.ShipperNotificationTypeType additionalShipperNotificationType;

    private String additionalShipperNotificationTarget;

    private org.apache.axis.types.Time deliveryWindowStart;

    private org.apache.axis.types.Time deliveryWindowEnd;

    private com.paazl.soap.generated.ProductType[] products;

    public OrderDetailsResponse() {
    }

    public OrderDetailsResponse(
           com.paazl.soap.generated.ErrorType error,
           String webshopId,
           String matrixCode,
           java.util.Calendar createDate,
           String companyName,
           String vatNumber,
           String name,
           String nameOther,
           com.paazl.soap.generated.AddressType shipToAddress,
           String emailAddress,
           String phoneNumber,
           String senderName,
           com.paazl.soap.generated.AddressType senderAddress,
           String returnName,
           com.paazl.soap.generated.AddressType returnAddress,
           com.paazl.soap.generated.ShippingOptionDetailsType shippingOption,
           com.paazl.soap.generated.ServicePointDetailsType servicePointDetails,
           int numberOfArticles,
           com.paazl.soap.generated.ShippingPaymentType shippingPaymentType,
           String billingAccountNumber,
           String invoiceNumber,
           java.util.Date invoiceDate,
           java.math.BigDecimal packagingWeight,
           java.math.BigDecimal customsValue,
           String customsValueCurrency,
           com.paazl.soap.generated.DutiesPaymentType dutiesPaymentType,
           String dutiesAccountNumber,
           java.math.BigDecimal orderWeight,
           Integer maxLabels,
           boolean collo,
           java.math.BigDecimal codValue,
           String codValueCurrency,
           Integer insuredValue,
           String insuredValueCurrency,
           com.paazl.soap.generated.PackagingTypeType packagingType,
           java.util.Date pickupDate,
           java.util.Date preferredDeliveryDate,
           Boolean preferredDateChosen,
           String description,
           String additionalInstruction,
           com.paazl.soap.generated.ShipperNotificationTypeType shipperNotificationType,
           String shipperNotificationTarget,
           com.paazl.soap.generated.ShipperNotificationTypeType additionalShipperNotificationType,
           String additionalShipperNotificationTarget,
           org.apache.axis.types.Time deliveryWindowStart,
           org.apache.axis.types.Time deliveryWindowEnd,
           com.paazl.soap.generated.ProductType[] products) {
           this.error = error;
           this.webshopId = webshopId;
           this.matrixCode = matrixCode;
           this.createDate = createDate;
           this.companyName = companyName;
           this.vatNumber = vatNumber;
           this.name = name;
           this.nameOther = nameOther;
           this.shipToAddress = shipToAddress;
           this.emailAddress = emailAddress;
           this.phoneNumber = phoneNumber;
           this.senderName = senderName;
           this.senderAddress = senderAddress;
           this.returnName = returnName;
           this.returnAddress = returnAddress;
           this.shippingOption = shippingOption;
           this.servicePointDetails = servicePointDetails;
           this.numberOfArticles = numberOfArticles;
           this.shippingPaymentType = shippingPaymentType;
           this.billingAccountNumber = billingAccountNumber;
           this.invoiceNumber = invoiceNumber;
           this.invoiceDate = invoiceDate;
           this.packagingWeight = packagingWeight;
           this.customsValue = customsValue;
           this.customsValueCurrency = customsValueCurrency;
           this.dutiesPaymentType = dutiesPaymentType;
           this.dutiesAccountNumber = dutiesAccountNumber;
           this.orderWeight = orderWeight;
           this.maxLabels = maxLabels;
           this.collo = collo;
           this.codValue = codValue;
           this.codValueCurrency = codValueCurrency;
           this.insuredValue = insuredValue;
           this.insuredValueCurrency = insuredValueCurrency;
           this.packagingType = packagingType;
           this.pickupDate = pickupDate;
           this.preferredDeliveryDate = preferredDeliveryDate;
           this.preferredDateChosen = preferredDateChosen;
           this.description = description;
           this.additionalInstruction = additionalInstruction;
           this.shipperNotificationType = shipperNotificationType;
           this.shipperNotificationTarget = shipperNotificationTarget;
           this.additionalShipperNotificationType = additionalShipperNotificationType;
           this.additionalShipperNotificationTarget = additionalShipperNotificationTarget;
           this.deliveryWindowStart = deliveryWindowStart;
           this.deliveryWindowEnd = deliveryWindowEnd;
           this.products = products;
    }


    /**
     * Gets the error value for this OrderDetailsResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this OrderDetailsResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the webshopId value for this OrderDetailsResponse.
     * 
     * @return webshopId
     */
    public String getWebshopId() {
        return webshopId;
    }


    /**
     * Sets the webshopId value for this OrderDetailsResponse.
     * 
     * @param webshopId
     */
    public void setWebshopId(String webshopId) {
        this.webshopId = webshopId;
    }


    /**
     * Gets the matrixCode value for this OrderDetailsResponse.
     * 
     * @return matrixCode
     */
    public String getMatrixCode() {
        return matrixCode;
    }


    /**
     * Sets the matrixCode value for this OrderDetailsResponse.
     * 
     * @param matrixCode
     */
    public void setMatrixCode(String matrixCode) {
        this.matrixCode = matrixCode;
    }


    /**
     * Gets the createDate value for this OrderDetailsResponse.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this OrderDetailsResponse.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the companyName value for this OrderDetailsResponse.
     * 
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this OrderDetailsResponse.
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the vatNumber value for this OrderDetailsResponse.
     * 
     * @return vatNumber
     */
    public String getVatNumber() {
        return vatNumber;
    }


    /**
     * Sets the vatNumber value for this OrderDetailsResponse.
     * 
     * @param vatNumber
     */
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }


    /**
     * Gets the name value for this OrderDetailsResponse.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this OrderDetailsResponse.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the nameOther value for this OrderDetailsResponse.
     * 
     * @return nameOther
     */
    public String getNameOther() {
        return nameOther;
    }


    /**
     * Sets the nameOther value for this OrderDetailsResponse.
     * 
     * @param nameOther
     */
    public void setNameOther(String nameOther) {
        this.nameOther = nameOther;
    }


    /**
     * Gets the shipToAddress value for this OrderDetailsResponse.
     * 
     * @return shipToAddress
     */
    public com.paazl.soap.generated.AddressType getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this OrderDetailsResponse.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(com.paazl.soap.generated.AddressType shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the emailAddress value for this OrderDetailsResponse.
     * 
     * @return emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this OrderDetailsResponse.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the phoneNumber value for this OrderDetailsResponse.
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this OrderDetailsResponse.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the senderName value for this OrderDetailsResponse.
     * 
     * @return senderName
     */
    public String getSenderName() {
        return senderName;
    }


    /**
     * Sets the senderName value for this OrderDetailsResponse.
     * 
     * @param senderName
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }


    /**
     * Gets the senderAddress value for this OrderDetailsResponse.
     * 
     * @return senderAddress
     */
    public com.paazl.soap.generated.AddressType getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this OrderDetailsResponse.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(com.paazl.soap.generated.AddressType senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the returnName value for this OrderDetailsResponse.
     * 
     * @return returnName
     */
    public String getReturnName() {
        return returnName;
    }


    /**
     * Sets the returnName value for this OrderDetailsResponse.
     * 
     * @param returnName
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }


    /**
     * Gets the returnAddress value for this OrderDetailsResponse.
     * 
     * @return returnAddress
     */
    public com.paazl.soap.generated.AddressType getReturnAddress() {
        return returnAddress;
    }


    /**
     * Sets the returnAddress value for this OrderDetailsResponse.
     * 
     * @param returnAddress
     */
    public void setReturnAddress(com.paazl.soap.generated.AddressType returnAddress) {
        this.returnAddress = returnAddress;
    }


    /**
     * Gets the shippingOption value for this OrderDetailsResponse.
     * 
     * @return shippingOption
     */
    public com.paazl.soap.generated.ShippingOptionDetailsType getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this OrderDetailsResponse.
     * 
     * @param shippingOption
     */
    public void setShippingOption(com.paazl.soap.generated.ShippingOptionDetailsType shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the servicePointDetails value for this OrderDetailsResponse.
     * 
     * @return servicePointDetails
     */
    public com.paazl.soap.generated.ServicePointDetailsType getServicePointDetails() {
        return servicePointDetails;
    }


    /**
     * Sets the servicePointDetails value for this OrderDetailsResponse.
     * 
     * @param servicePointDetails
     */
    public void setServicePointDetails(com.paazl.soap.generated.ServicePointDetailsType servicePointDetails) {
        this.servicePointDetails = servicePointDetails;
    }


    /**
     * Gets the numberOfArticles value for this OrderDetailsResponse.
     * 
     * @return numberOfArticles
     */
    public int getNumberOfArticles() {
        return numberOfArticles;
    }


    /**
     * Sets the numberOfArticles value for this OrderDetailsResponse.
     * 
     * @param numberOfArticles
     */
    public void setNumberOfArticles(int numberOfArticles) {
        this.numberOfArticles = numberOfArticles;
    }


    /**
     * Gets the shippingPaymentType value for this OrderDetailsResponse.
     * 
     * @return shippingPaymentType
     */
    public com.paazl.soap.generated.ShippingPaymentType getShippingPaymentType() {
        return shippingPaymentType;
    }


    /**
     * Sets the shippingPaymentType value for this OrderDetailsResponse.
     * 
     * @param shippingPaymentType
     */
    public void setShippingPaymentType(com.paazl.soap.generated.ShippingPaymentType shippingPaymentType) {
        this.shippingPaymentType = shippingPaymentType;
    }


    /**
     * Gets the billingAccountNumber value for this OrderDetailsResponse.
     * 
     * @return billingAccountNumber
     */
    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }


    /**
     * Sets the billingAccountNumber value for this OrderDetailsResponse.
     * 
     * @param billingAccountNumber
     */
    public void setBillingAccountNumber(String billingAccountNumber) {
        this.billingAccountNumber = billingAccountNumber;
    }


    /**
     * Gets the invoiceNumber value for this OrderDetailsResponse.
     * 
     * @return invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this OrderDetailsResponse.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the invoiceDate value for this OrderDetailsResponse.
     * 
     * @return invoiceDate
     */
    public java.util.Date getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this OrderDetailsResponse.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.util.Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the packagingWeight value for this OrderDetailsResponse.
     * 
     * @return packagingWeight
     */
    public java.math.BigDecimal getPackagingWeight() {
        return packagingWeight;
    }


    /**
     * Sets the packagingWeight value for this OrderDetailsResponse.
     * 
     * @param packagingWeight
     */
    public void setPackagingWeight(java.math.BigDecimal packagingWeight) {
        this.packagingWeight = packagingWeight;
    }


    /**
     * Gets the customsValue value for this OrderDetailsResponse.
     * 
     * @return customsValue
     */
    public java.math.BigDecimal getCustomsValue() {
        return customsValue;
    }


    /**
     * Sets the customsValue value for this OrderDetailsResponse.
     * 
     * @param customsValue
     */
    public void setCustomsValue(java.math.BigDecimal customsValue) {
        this.customsValue = customsValue;
    }


    /**
     * Gets the customsValueCurrency value for this OrderDetailsResponse.
     * 
     * @return customsValueCurrency
     */
    public String getCustomsValueCurrency() {
        return customsValueCurrency;
    }


    /**
     * Sets the customsValueCurrency value for this OrderDetailsResponse.
     * 
     * @param customsValueCurrency
     */
    public void setCustomsValueCurrency(String customsValueCurrency) {
        this.customsValueCurrency = customsValueCurrency;
    }


    /**
     * Gets the dutiesPaymentType value for this OrderDetailsResponse.
     * 
     * @return dutiesPaymentType
     */
    public com.paazl.soap.generated.DutiesPaymentType getDutiesPaymentType() {
        return dutiesPaymentType;
    }


    /**
     * Sets the dutiesPaymentType value for this OrderDetailsResponse.
     * 
     * @param dutiesPaymentType
     */
    public void setDutiesPaymentType(com.paazl.soap.generated.DutiesPaymentType dutiesPaymentType) {
        this.dutiesPaymentType = dutiesPaymentType;
    }


    /**
     * Gets the dutiesAccountNumber value for this OrderDetailsResponse.
     * 
     * @return dutiesAccountNumber
     */
    public String getDutiesAccountNumber() {
        return dutiesAccountNumber;
    }


    /**
     * Sets the dutiesAccountNumber value for this OrderDetailsResponse.
     * 
     * @param dutiesAccountNumber
     */
    public void setDutiesAccountNumber(String dutiesAccountNumber) {
        this.dutiesAccountNumber = dutiesAccountNumber;
    }


    /**
     * Gets the orderWeight value for this OrderDetailsResponse.
     * 
     * @return orderWeight
     */
    public java.math.BigDecimal getOrderWeight() {
        return orderWeight;
    }


    /**
     * Sets the orderWeight value for this OrderDetailsResponse.
     * 
     * @param orderWeight
     */
    public void setOrderWeight(java.math.BigDecimal orderWeight) {
        this.orderWeight = orderWeight;
    }


    /**
     * Gets the maxLabels value for this OrderDetailsResponse.
     * 
     * @return maxLabels
     */
    public Integer getMaxLabels() {
        return maxLabels;
    }


    /**
     * Sets the maxLabels value for this OrderDetailsResponse.
     * 
     * @param maxLabels
     */
    public void setMaxLabels(Integer maxLabels) {
        this.maxLabels = maxLabels;
    }


    /**
     * Gets the collo value for this OrderDetailsResponse.
     * 
     * @return collo
     */
    public boolean isCollo() {
        return collo;
    }


    /**
     * Sets the collo value for this OrderDetailsResponse.
     * 
     * @param collo
     */
    public void setCollo(boolean collo) {
        this.collo = collo;
    }


    /**
     * Gets the codValue value for this OrderDetailsResponse.
     * 
     * @return codValue
     */
    public java.math.BigDecimal getCodValue() {
        return codValue;
    }


    /**
     * Sets the codValue value for this OrderDetailsResponse.
     * 
     * @param codValue
     */
    public void setCodValue(java.math.BigDecimal codValue) {
        this.codValue = codValue;
    }


    /**
     * Gets the codValueCurrency value for this OrderDetailsResponse.
     * 
     * @return codValueCurrency
     */
    public String getCodValueCurrency() {
        return codValueCurrency;
    }


    /**
     * Sets the codValueCurrency value for this OrderDetailsResponse.
     * 
     * @param codValueCurrency
     */
    public void setCodValueCurrency(String codValueCurrency) {
        this.codValueCurrency = codValueCurrency;
    }


    /**
     * Gets the insuredValue value for this OrderDetailsResponse.
     * 
     * @return insuredValue
     */
    public Integer getInsuredValue() {
        return insuredValue;
    }


    /**
     * Sets the insuredValue value for this OrderDetailsResponse.
     * 
     * @param insuredValue
     */
    public void setInsuredValue(Integer insuredValue) {
        this.insuredValue = insuredValue;
    }


    /**
     * Gets the insuredValueCurrency value for this OrderDetailsResponse.
     * 
     * @return insuredValueCurrency
     */
    public String getInsuredValueCurrency() {
        return insuredValueCurrency;
    }


    /**
     * Sets the insuredValueCurrency value for this OrderDetailsResponse.
     * 
     * @param insuredValueCurrency
     */
    public void setInsuredValueCurrency(String insuredValueCurrency) {
        this.insuredValueCurrency = insuredValueCurrency;
    }


    /**
     * Gets the packagingType value for this OrderDetailsResponse.
     * 
     * @return packagingType
     */
    public com.paazl.soap.generated.PackagingTypeType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this OrderDetailsResponse.
     * 
     * @param packagingType
     */
    public void setPackagingType(com.paazl.soap.generated.PackagingTypeType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the pickupDate value for this OrderDetailsResponse.
     * 
     * @return pickupDate
     */
    public java.util.Date getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this OrderDetailsResponse.
     * 
     * @param pickupDate
     */
    public void setPickupDate(java.util.Date pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the preferredDeliveryDate value for this OrderDetailsResponse.
     * 
     * @return preferredDeliveryDate
     */
    public java.util.Date getPreferredDeliveryDate() {
        return preferredDeliveryDate;
    }


    /**
     * Sets the preferredDeliveryDate value for this OrderDetailsResponse.
     * 
     * @param preferredDeliveryDate
     */
    public void setPreferredDeliveryDate(java.util.Date preferredDeliveryDate) {
        this.preferredDeliveryDate = preferredDeliveryDate;
    }


    /**
     * Gets the preferredDateChosen value for this OrderDetailsResponse.
     * 
     * @return preferredDateChosen
     */
    public Boolean getPreferredDateChosen() {
        return preferredDateChosen;
    }


    /**
     * Sets the preferredDateChosen value for this OrderDetailsResponse.
     * 
     * @param preferredDateChosen
     */
    public void setPreferredDateChosen(Boolean preferredDateChosen) {
        this.preferredDateChosen = preferredDateChosen;
    }


    /**
     * Gets the description value for this OrderDetailsResponse.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OrderDetailsResponse.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the additionalInstruction value for this OrderDetailsResponse.
     * 
     * @return additionalInstruction
     */
    public String getAdditionalInstruction() {
        return additionalInstruction;
    }


    /**
     * Sets the additionalInstruction value for this OrderDetailsResponse.
     * 
     * @param additionalInstruction
     */
    public void setAdditionalInstruction(String additionalInstruction) {
        this.additionalInstruction = additionalInstruction;
    }


    /**
     * Gets the shipperNotificationType value for this OrderDetailsResponse.
     * 
     * @return shipperNotificationType
     */
    public com.paazl.soap.generated.ShipperNotificationTypeType getShipperNotificationType() {
        return shipperNotificationType;
    }


    /**
     * Sets the shipperNotificationType value for this OrderDetailsResponse.
     * 
     * @param shipperNotificationType
     */
    public void setShipperNotificationType(com.paazl.soap.generated.ShipperNotificationTypeType shipperNotificationType) {
        this.shipperNotificationType = shipperNotificationType;
    }


    /**
     * Gets the shipperNotificationTarget value for this OrderDetailsResponse.
     * 
     * @return shipperNotificationTarget
     */
    public String getShipperNotificationTarget() {
        return shipperNotificationTarget;
    }


    /**
     * Sets the shipperNotificationTarget value for this OrderDetailsResponse.
     * 
     * @param shipperNotificationTarget
     */
    public void setShipperNotificationTarget(String shipperNotificationTarget) {
        this.shipperNotificationTarget = shipperNotificationTarget;
    }


    /**
     * Gets the additionalShipperNotificationType value for this OrderDetailsResponse.
     * 
     * @return additionalShipperNotificationType
     */
    public com.paazl.soap.generated.ShipperNotificationTypeType getAdditionalShipperNotificationType() {
        return additionalShipperNotificationType;
    }


    /**
     * Sets the additionalShipperNotificationType value for this OrderDetailsResponse.
     * 
     * @param additionalShipperNotificationType
     */
    public void setAdditionalShipperNotificationType(com.paazl.soap.generated.ShipperNotificationTypeType additionalShipperNotificationType) {
        this.additionalShipperNotificationType = additionalShipperNotificationType;
    }


    /**
     * Gets the additionalShipperNotificationTarget value for this OrderDetailsResponse.
     * 
     * @return additionalShipperNotificationTarget
     */
    public String getAdditionalShipperNotificationTarget() {
        return additionalShipperNotificationTarget;
    }


    /**
     * Sets the additionalShipperNotificationTarget value for this OrderDetailsResponse.
     * 
     * @param additionalShipperNotificationTarget
     */
    public void setAdditionalShipperNotificationTarget(String additionalShipperNotificationTarget) {
        this.additionalShipperNotificationTarget = additionalShipperNotificationTarget;
    }


    /**
     * Gets the deliveryWindowStart value for this OrderDetailsResponse.
     * 
     * @return deliveryWindowStart
     */
    public org.apache.axis.types.Time getDeliveryWindowStart() {
        return deliveryWindowStart;
    }


    /**
     * Sets the deliveryWindowStart value for this OrderDetailsResponse.
     * 
     * @param deliveryWindowStart
     */
    public void setDeliveryWindowStart(org.apache.axis.types.Time deliveryWindowStart) {
        this.deliveryWindowStart = deliveryWindowStart;
    }


    /**
     * Gets the deliveryWindowEnd value for this OrderDetailsResponse.
     * 
     * @return deliveryWindowEnd
     */
    public org.apache.axis.types.Time getDeliveryWindowEnd() {
        return deliveryWindowEnd;
    }


    /**
     * Sets the deliveryWindowEnd value for this OrderDetailsResponse.
     * 
     * @param deliveryWindowEnd
     */
    public void setDeliveryWindowEnd(org.apache.axis.types.Time deliveryWindowEnd) {
        this.deliveryWindowEnd = deliveryWindowEnd;
    }


    /**
     * Gets the products value for this OrderDetailsResponse.
     * 
     * @return products
     */
    public com.paazl.soap.generated.ProductType[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this OrderDetailsResponse.
     * 
     * @param products
     */
    public void setProducts(com.paazl.soap.generated.ProductType[] products) {
        this.products = products;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrderDetailsResponse)) return false;
        OrderDetailsResponse other = (OrderDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.webshopId==null && other.getWebshopId()==null) || 
             (this.webshopId!=null &&
              this.webshopId.equals(other.getWebshopId()))) &&
            ((this.matrixCode==null && other.getMatrixCode()==null) || 
             (this.matrixCode!=null &&
              this.matrixCode.equals(other.getMatrixCode()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.vatNumber==null && other.getVatNumber()==null) || 
             (this.vatNumber!=null &&
              this.vatNumber.equals(other.getVatNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameOther==null && other.getNameOther()==null) || 
             (this.nameOther!=null &&
              this.nameOther.equals(other.getNameOther()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.senderName==null && other.getSenderName()==null) || 
             (this.senderName!=null &&
              this.senderName.equals(other.getSenderName()))) &&
            ((this.senderAddress==null && other.getSenderAddress()==null) || 
             (this.senderAddress!=null &&
              this.senderAddress.equals(other.getSenderAddress()))) &&
            ((this.returnName==null && other.getReturnName()==null) || 
             (this.returnName!=null &&
              this.returnName.equals(other.getReturnName()))) &&
            ((this.returnAddress==null && other.getReturnAddress()==null) || 
             (this.returnAddress!=null &&
              this.returnAddress.equals(other.getReturnAddress()))) &&
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.servicePointDetails==null && other.getServicePointDetails()==null) || 
             (this.servicePointDetails!=null &&
              this.servicePointDetails.equals(other.getServicePointDetails()))) &&
            this.numberOfArticles == other.getNumberOfArticles() &&
            ((this.shippingPaymentType==null && other.getShippingPaymentType()==null) || 
             (this.shippingPaymentType!=null &&
              this.shippingPaymentType.equals(other.getShippingPaymentType()))) &&
            ((this.billingAccountNumber==null && other.getBillingAccountNumber()==null) || 
             (this.billingAccountNumber!=null &&
              this.billingAccountNumber.equals(other.getBillingAccountNumber()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.packagingWeight==null && other.getPackagingWeight()==null) || 
             (this.packagingWeight!=null &&
              this.packagingWeight.equals(other.getPackagingWeight()))) &&
            ((this.customsValue==null && other.getCustomsValue()==null) || 
             (this.customsValue!=null &&
              this.customsValue.equals(other.getCustomsValue()))) &&
            ((this.customsValueCurrency==null && other.getCustomsValueCurrency()==null) || 
             (this.customsValueCurrency!=null &&
              this.customsValueCurrency.equals(other.getCustomsValueCurrency()))) &&
            ((this.dutiesPaymentType==null && other.getDutiesPaymentType()==null) || 
             (this.dutiesPaymentType!=null &&
              this.dutiesPaymentType.equals(other.getDutiesPaymentType()))) &&
            ((this.dutiesAccountNumber==null && other.getDutiesAccountNumber()==null) || 
             (this.dutiesAccountNumber!=null &&
              this.dutiesAccountNumber.equals(other.getDutiesAccountNumber()))) &&
            ((this.orderWeight==null && other.getOrderWeight()==null) || 
             (this.orderWeight!=null &&
              this.orderWeight.equals(other.getOrderWeight()))) &&
            ((this.maxLabels==null && other.getMaxLabels()==null) || 
             (this.maxLabels!=null &&
              this.maxLabels.equals(other.getMaxLabels()))) &&
            this.collo == other.isCollo() &&
            ((this.codValue==null && other.getCodValue()==null) || 
             (this.codValue!=null &&
              this.codValue.equals(other.getCodValue()))) &&
            ((this.codValueCurrency==null && other.getCodValueCurrency()==null) || 
             (this.codValueCurrency!=null &&
              this.codValueCurrency.equals(other.getCodValueCurrency()))) &&
            ((this.insuredValue==null && other.getInsuredValue()==null) || 
             (this.insuredValue!=null &&
              this.insuredValue.equals(other.getInsuredValue()))) &&
            ((this.insuredValueCurrency==null && other.getInsuredValueCurrency()==null) || 
             (this.insuredValueCurrency!=null &&
              this.insuredValueCurrency.equals(other.getInsuredValueCurrency()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.preferredDeliveryDate==null && other.getPreferredDeliveryDate()==null) || 
             (this.preferredDeliveryDate!=null &&
              this.preferredDeliveryDate.equals(other.getPreferredDeliveryDate()))) &&
            ((this.preferredDateChosen==null && other.getPreferredDateChosen()==null) || 
             (this.preferredDateChosen!=null &&
              this.preferredDateChosen.equals(other.getPreferredDateChosen()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.additionalInstruction==null && other.getAdditionalInstruction()==null) || 
             (this.additionalInstruction!=null &&
              this.additionalInstruction.equals(other.getAdditionalInstruction()))) &&
            ((this.shipperNotificationType==null && other.getShipperNotificationType()==null) || 
             (this.shipperNotificationType!=null &&
              this.shipperNotificationType.equals(other.getShipperNotificationType()))) &&
            ((this.shipperNotificationTarget==null && other.getShipperNotificationTarget()==null) || 
             (this.shipperNotificationTarget!=null &&
              this.shipperNotificationTarget.equals(other.getShipperNotificationTarget()))) &&
            ((this.additionalShipperNotificationType==null && other.getAdditionalShipperNotificationType()==null) || 
             (this.additionalShipperNotificationType!=null &&
              this.additionalShipperNotificationType.equals(other.getAdditionalShipperNotificationType()))) &&
            ((this.additionalShipperNotificationTarget==null && other.getAdditionalShipperNotificationTarget()==null) || 
             (this.additionalShipperNotificationTarget!=null &&
              this.additionalShipperNotificationTarget.equals(other.getAdditionalShipperNotificationTarget()))) &&
            ((this.deliveryWindowStart==null && other.getDeliveryWindowStart()==null) || 
             (this.deliveryWindowStart!=null &&
              this.deliveryWindowStart.equals(other.getDeliveryWindowStart()))) &&
            ((this.deliveryWindowEnd==null && other.getDeliveryWindowEnd()==null) || 
             (this.deliveryWindowEnd!=null &&
              this.deliveryWindowEnd.equals(other.getDeliveryWindowEnd()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getWebshopId() != null) {
            _hashCode += getWebshopId().hashCode();
        }
        if (getMatrixCode() != null) {
            _hashCode += getMatrixCode().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getVatNumber() != null) {
            _hashCode += getVatNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameOther() != null) {
            _hashCode += getNameOther().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getSenderName() != null) {
            _hashCode += getSenderName().hashCode();
        }
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getReturnName() != null) {
            _hashCode += getReturnName().hashCode();
        }
        if (getReturnAddress() != null) {
            _hashCode += getReturnAddress().hashCode();
        }
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getServicePointDetails() != null) {
            _hashCode += getServicePointDetails().hashCode();
        }
        _hashCode += getNumberOfArticles();
        if (getShippingPaymentType() != null) {
            _hashCode += getShippingPaymentType().hashCode();
        }
        if (getBillingAccountNumber() != null) {
            _hashCode += getBillingAccountNumber().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getPackagingWeight() != null) {
            _hashCode += getPackagingWeight().hashCode();
        }
        if (getCustomsValue() != null) {
            _hashCode += getCustomsValue().hashCode();
        }
        if (getCustomsValueCurrency() != null) {
            _hashCode += getCustomsValueCurrency().hashCode();
        }
        if (getDutiesPaymentType() != null) {
            _hashCode += getDutiesPaymentType().hashCode();
        }
        if (getDutiesAccountNumber() != null) {
            _hashCode += getDutiesAccountNumber().hashCode();
        }
        if (getOrderWeight() != null) {
            _hashCode += getOrderWeight().hashCode();
        }
        if (getMaxLabels() != null) {
            _hashCode += getMaxLabels().hashCode();
        }
        _hashCode += (isCollo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCodValue() != null) {
            _hashCode += getCodValue().hashCode();
        }
        if (getCodValueCurrency() != null) {
            _hashCode += getCodValueCurrency().hashCode();
        }
        if (getInsuredValue() != null) {
            _hashCode += getInsuredValue().hashCode();
        }
        if (getInsuredValueCurrency() != null) {
            _hashCode += getInsuredValueCurrency().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getPreferredDeliveryDate() != null) {
            _hashCode += getPreferredDeliveryDate().hashCode();
        }
        if (getPreferredDateChosen() != null) {
            _hashCode += getPreferredDateChosen().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAdditionalInstruction() != null) {
            _hashCode += getAdditionalInstruction().hashCode();
        }
        if (getShipperNotificationType() != null) {
            _hashCode += getShipperNotificationType().hashCode();
        }
        if (getShipperNotificationTarget() != null) {
            _hashCode += getShipperNotificationTarget().hashCode();
        }
        if (getAdditionalShipperNotificationType() != null) {
            _hashCode += getAdditionalShipperNotificationType().hashCode();
        }
        if (getAdditionalShipperNotificationTarget() != null) {
            _hashCode += getAdditionalShipperNotificationTarget().hashCode();
        }
        if (getDeliveryWindowStart() != null) {
            _hashCode += getDeliveryWindowStart().hashCode();
        }
        if (getDeliveryWindowEnd() != null) {
            _hashCode += getDeliveryWindowEnd().hashCode();
        }
        if (getProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webshopId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "webshopId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "matrixCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "vatNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOther");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nameOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOptionDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePointDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfArticles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "numberOfArticles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingPaymentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "billingAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "invoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "customsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsValueCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "customsValueCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiesPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dutiesPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dutiesPaymentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiesAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dutiesAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "maxLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "collo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "codValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codValueCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "codValueCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "insuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredValueCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "insuredValueCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "preferredDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredDateChosen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "preferredDateChosen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalInstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperNotificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotificationTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperNotificationTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotificationTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalShipperNotificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalShipperNotificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotificationTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalShipperNotificationTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalShipperNotificationTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryWindowStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryWindowStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryWindowEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryWindowEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "productType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "product"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
