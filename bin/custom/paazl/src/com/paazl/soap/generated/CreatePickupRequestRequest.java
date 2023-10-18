/**
 * CreatePickupRequestRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class CreatePickupRequestRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String internalReference;

    private String contract;

    private String pickupRequestOption;

    private String orderReference;

    private Integer pieceCount;

    private com.paazl.soap.generated.PickupRequestParcelType[] parcel;

    private java.util.Date pickupDate;

    private org.apache.axis.types.Time pickupWindowStart;

    private org.apache.axis.types.Time pickupWindowEnd;

    private String pickupTimeZone;

    private String pickupAccountNumber;

    private String pickupCompanyName;

    private String pickupContactName;

    private String pickupName;

    private String pickupNameOther;

    private com.paazl.soap.generated.AddressType pickupAddress;

    private String pickupPhoneNumber;

    private String pickupEmailAddress;

    private String deliveryAccountNumber;

    private String deliveryCompanyName;

    private String deliveryContactName;

    private com.paazl.soap.generated.AddressType deliveryAddress;

    private String deliveryPhoneNumber;

    private String deliveryEmailAddress;

    private String thirdPartyShippingPaymentAccountNumber;

    private String thirdPartyShippingPaymentCompanyName;

    private String thirdPartyShippingPaymentContactName;

    private com.paazl.soap.generated.AddressType thirdPartyShippingPaymentAddress;

    private String thirdPartyShippingPaymentPhoneNumber;

    private String thirdPartyShippingPaymentEmailAddress;

    private com.paazl.soap.generated.ShippingPaymentType shippingPaymentType;

    private String additionalInstruction;

    private com.paazl.soap.generated.ShipperNotificationType[] shipperNotification;

    public CreatePickupRequestRequest() {
    }

    public CreatePickupRequestRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String internalReference,
           String contract,
           String pickupRequestOption,
           String orderReference,
           Integer pieceCount,
           com.paazl.soap.generated.PickupRequestParcelType[] parcel,
           java.util.Date pickupDate,
           org.apache.axis.types.Time pickupWindowStart,
           org.apache.axis.types.Time pickupWindowEnd,
           String pickupTimeZone,
           String pickupAccountNumber,
           String pickupCompanyName,
           String pickupContactName,
           String pickupName,
           String pickupNameOther,
           com.paazl.soap.generated.AddressType pickupAddress,
           String pickupPhoneNumber,
           String pickupEmailAddress,
           String deliveryAccountNumber,
           String deliveryCompanyName,
           String deliveryContactName,
           com.paazl.soap.generated.AddressType deliveryAddress,
           String deliveryPhoneNumber,
           String deliveryEmailAddress,
           String thirdPartyShippingPaymentAccountNumber,
           String thirdPartyShippingPaymentCompanyName,
           String thirdPartyShippingPaymentContactName,
           com.paazl.soap.generated.AddressType thirdPartyShippingPaymentAddress,
           String thirdPartyShippingPaymentPhoneNumber,
           String thirdPartyShippingPaymentEmailAddress,
           com.paazl.soap.generated.ShippingPaymentType shippingPaymentType,
           String additionalInstruction,
           com.paazl.soap.generated.ShipperNotificationType[] shipperNotification) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.internalReference = internalReference;
        this.contract = contract;
        this.pickupRequestOption = pickupRequestOption;
        this.orderReference = orderReference;
        this.pieceCount = pieceCount;
        this.parcel = parcel;
        this.pickupDate = pickupDate;
        this.pickupWindowStart = pickupWindowStart;
        this.pickupWindowEnd = pickupWindowEnd;
        this.pickupTimeZone = pickupTimeZone;
        this.pickupAccountNumber = pickupAccountNumber;
        this.pickupCompanyName = pickupCompanyName;
        this.pickupContactName = pickupContactName;
        this.pickupName = pickupName;
        this.pickupNameOther = pickupNameOther;
        this.pickupAddress = pickupAddress;
        this.pickupPhoneNumber = pickupPhoneNumber;
        this.pickupEmailAddress = pickupEmailAddress;
        this.deliveryAccountNumber = deliveryAccountNumber;
        this.deliveryCompanyName = deliveryCompanyName;
        this.deliveryContactName = deliveryContactName;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPhoneNumber = deliveryPhoneNumber;
        this.deliveryEmailAddress = deliveryEmailAddress;
        this.thirdPartyShippingPaymentAccountNumber = thirdPartyShippingPaymentAccountNumber;
        this.thirdPartyShippingPaymentCompanyName = thirdPartyShippingPaymentCompanyName;
        this.thirdPartyShippingPaymentContactName = thirdPartyShippingPaymentContactName;
        this.thirdPartyShippingPaymentAddress = thirdPartyShippingPaymentAddress;
        this.thirdPartyShippingPaymentPhoneNumber = thirdPartyShippingPaymentPhoneNumber;
        this.thirdPartyShippingPaymentEmailAddress = thirdPartyShippingPaymentEmailAddress;
        this.shippingPaymentType = shippingPaymentType;
        this.additionalInstruction = additionalInstruction;
        this.shipperNotification = shipperNotification;
    }


    /**
     * Gets the hash value for this CreatePickupRequestRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this CreatePickupRequestRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this CreatePickupRequestRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this CreatePickupRequestRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the internalReference value for this CreatePickupRequestRequest.
     * 
     * @return internalReference
     */
    public String getInternalReference() {
        return internalReference;
    }


    /**
     * Sets the internalReference value for this CreatePickupRequestRequest.
     * 
     * @param internalReference
     */
    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }


    /**
     * Gets the contract value for this CreatePickupRequestRequest.
     * 
     * @return contract
     */
    public String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this CreatePickupRequestRequest.
     * 
     * @param contract
     */
    public void setContract(String contract) {
        this.contract = contract;
    }


    /**
     * Gets the pickupRequestOption value for this CreatePickupRequestRequest.
     * 
     * @return pickupRequestOption
     */
    public String getPickupRequestOption() {
        return pickupRequestOption;
    }


    /**
     * Sets the pickupRequestOption value for this CreatePickupRequestRequest.
     * 
     * @param pickupRequestOption
     */
    public void setPickupRequestOption(String pickupRequestOption) {
        this.pickupRequestOption = pickupRequestOption;
    }


    /**
     * Gets the orderReference value for this CreatePickupRequestRequest.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this CreatePickupRequestRequest.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the pieceCount value for this CreatePickupRequestRequest.
     * 
     * @return pieceCount
     */
    public Integer getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this CreatePickupRequestRequest.
     * 
     * @param pieceCount
     */
    public void setPieceCount(Integer pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the parcel value for this CreatePickupRequestRequest.
     * 
     * @return parcel
     */
    public com.paazl.soap.generated.PickupRequestParcelType[] getParcel() {
        return parcel;
    }


    /**
     * Sets the parcel value for this CreatePickupRequestRequest.
     * 
     * @param parcel
     */
    public void setParcel(com.paazl.soap.generated.PickupRequestParcelType[] parcel) {
        this.parcel = parcel;
    }

    public com.paazl.soap.generated.PickupRequestParcelType getParcel(int i) {
        return this.parcel[i];
    }

    public void setParcel(int i, com.paazl.soap.generated.PickupRequestParcelType _value) {
        this.parcel[i] = _value;
    }


    /**
     * Gets the pickupDate value for this CreatePickupRequestRequest.
     * 
     * @return pickupDate
     */
    public java.util.Date getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this CreatePickupRequestRequest.
     * 
     * @param pickupDate
     */
    public void setPickupDate(java.util.Date pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the pickupWindowStart value for this CreatePickupRequestRequest.
     * 
     * @return pickupWindowStart
     */
    public org.apache.axis.types.Time getPickupWindowStart() {
        return pickupWindowStart;
    }


    /**
     * Sets the pickupWindowStart value for this CreatePickupRequestRequest.
     * 
     * @param pickupWindowStart
     */
    public void setPickupWindowStart(org.apache.axis.types.Time pickupWindowStart) {
        this.pickupWindowStart = pickupWindowStart;
    }


    /**
     * Gets the pickupWindowEnd value for this CreatePickupRequestRequest.
     * 
     * @return pickupWindowEnd
     */
    public org.apache.axis.types.Time getPickupWindowEnd() {
        return pickupWindowEnd;
    }


    /**
     * Sets the pickupWindowEnd value for this CreatePickupRequestRequest.
     * 
     * @param pickupWindowEnd
     */
    public void setPickupWindowEnd(org.apache.axis.types.Time pickupWindowEnd) {
        this.pickupWindowEnd = pickupWindowEnd;
    }


    /**
     * Gets the pickupTimeZone value for this CreatePickupRequestRequest.
     * 
     * @return pickupTimeZone
     */
    public String getPickupTimeZone() {
        return pickupTimeZone;
    }


    /**
     * Sets the pickupTimeZone value for this CreatePickupRequestRequest.
     * 
     * @param pickupTimeZone
     */
    public void setPickupTimeZone(String pickupTimeZone) {
        this.pickupTimeZone = pickupTimeZone;
    }


    /**
     * Gets the pickupAccountNumber value for this CreatePickupRequestRequest.
     * 
     * @return pickupAccountNumber
     */
    public String getPickupAccountNumber() {
        return pickupAccountNumber;
    }


    /**
     * Sets the pickupAccountNumber value for this CreatePickupRequestRequest.
     * 
     * @param pickupAccountNumber
     */
    public void setPickupAccountNumber(String pickupAccountNumber) {
        this.pickupAccountNumber = pickupAccountNumber;
    }


    /**
     * Gets the pickupCompanyName value for this CreatePickupRequestRequest.
     * 
     * @return pickupCompanyName
     */
    public String getPickupCompanyName() {
        return pickupCompanyName;
    }


    /**
     * Sets the pickupCompanyName value for this CreatePickupRequestRequest.
     * 
     * @param pickupCompanyName
     */
    public void setPickupCompanyName(String pickupCompanyName) {
        this.pickupCompanyName = pickupCompanyName;
    }


    /**
     * Gets the pickupContactName value for this CreatePickupRequestRequest.
     * 
     * @return pickupContactName
     */
    public String getPickupContactName() {
        return pickupContactName;
    }


    /**
     * Sets the pickupContactName value for this CreatePickupRequestRequest.
     * 
     * @param pickupContactName
     */
    public void setPickupContactName(String pickupContactName) {
        this.pickupContactName = pickupContactName;
    }


    /**
     * Gets the pickupName value for this CreatePickupRequestRequest.
     * 
     * @return pickupName
     */
    public String getPickupName() {
        return pickupName;
    }


    /**
     * Sets the pickupName value for this CreatePickupRequestRequest.
     * 
     * @param pickupName
     */
    public void setPickupName(String pickupName) {
        this.pickupName = pickupName;
    }


    /**
     * Gets the pickupNameOther value for this CreatePickupRequestRequest.
     * 
     * @return pickupNameOther
     */
    public String getPickupNameOther() {
        return pickupNameOther;
    }


    /**
     * Sets the pickupNameOther value for this CreatePickupRequestRequest.
     * 
     * @param pickupNameOther
     */
    public void setPickupNameOther(String pickupNameOther) {
        this.pickupNameOther = pickupNameOther;
    }


    /**
     * Gets the pickupAddress value for this CreatePickupRequestRequest.
     * 
     * @return pickupAddress
     */
    public com.paazl.soap.generated.AddressType getPickupAddress() {
        return pickupAddress;
    }


    /**
     * Sets the pickupAddress value for this CreatePickupRequestRequest.
     * 
     * @param pickupAddress
     */
    public void setPickupAddress(com.paazl.soap.generated.AddressType pickupAddress) {
        this.pickupAddress = pickupAddress;
    }


    /**
     * Gets the pickupPhoneNumber value for this CreatePickupRequestRequest.
     * 
     * @return pickupPhoneNumber
     */
    public String getPickupPhoneNumber() {
        return pickupPhoneNumber;
    }


    /**
     * Sets the pickupPhoneNumber value for this CreatePickupRequestRequest.
     * 
     * @param pickupPhoneNumber
     */
    public void setPickupPhoneNumber(String pickupPhoneNumber) {
        this.pickupPhoneNumber = pickupPhoneNumber;
    }


    /**
     * Gets the pickupEmailAddress value for this CreatePickupRequestRequest.
     * 
     * @return pickupEmailAddress
     */
    public String getPickupEmailAddress() {
        return pickupEmailAddress;
    }


    /**
     * Sets the pickupEmailAddress value for this CreatePickupRequestRequest.
     * 
     * @param pickupEmailAddress
     */
    public void setPickupEmailAddress(String pickupEmailAddress) {
        this.pickupEmailAddress = pickupEmailAddress;
    }


    /**
     * Gets the deliveryAccountNumber value for this CreatePickupRequestRequest.
     * 
     * @return deliveryAccountNumber
     */
    public String getDeliveryAccountNumber() {
        return deliveryAccountNumber;
    }


    /**
     * Sets the deliveryAccountNumber value for this CreatePickupRequestRequest.
     * 
     * @param deliveryAccountNumber
     */
    public void setDeliveryAccountNumber(String deliveryAccountNumber) {
        this.deliveryAccountNumber = deliveryAccountNumber;
    }


    /**
     * Gets the deliveryCompanyName value for this CreatePickupRequestRequest.
     * 
     * @return deliveryCompanyName
     */
    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }


    /**
     * Sets the deliveryCompanyName value for this CreatePickupRequestRequest.
     * 
     * @param deliveryCompanyName
     */
    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }


    /**
     * Gets the deliveryContactName value for this CreatePickupRequestRequest.
     * 
     * @return deliveryContactName
     */
    public String getDeliveryContactName() {
        return deliveryContactName;
    }


    /**
     * Sets the deliveryContactName value for this CreatePickupRequestRequest.
     * 
     * @param deliveryContactName
     */
    public void setDeliveryContactName(String deliveryContactName) {
        this.deliveryContactName = deliveryContactName;
    }


    /**
     * Gets the deliveryAddress value for this CreatePickupRequestRequest.
     * 
     * @return deliveryAddress
     */
    public com.paazl.soap.generated.AddressType getDeliveryAddress() {
        return deliveryAddress;
    }


    /**
     * Sets the deliveryAddress value for this CreatePickupRequestRequest.
     * 
     * @param deliveryAddress
     */
    public void setDeliveryAddress(com.paazl.soap.generated.AddressType deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    /**
     * Gets the deliveryPhoneNumber value for this CreatePickupRequestRequest.
     * 
     * @return deliveryPhoneNumber
     */
    public String getDeliveryPhoneNumber() {
        return deliveryPhoneNumber;
    }


    /**
     * Sets the deliveryPhoneNumber value for this CreatePickupRequestRequest.
     * 
     * @param deliveryPhoneNumber
     */
    public void setDeliveryPhoneNumber(String deliveryPhoneNumber) {
        this.deliveryPhoneNumber = deliveryPhoneNumber;
    }


    /**
     * Gets the deliveryEmailAddress value for this CreatePickupRequestRequest.
     * 
     * @return deliveryEmailAddress
     */
    public String getDeliveryEmailAddress() {
        return deliveryEmailAddress;
    }


    /**
     * Sets the deliveryEmailAddress value for this CreatePickupRequestRequest.
     * 
     * @param deliveryEmailAddress
     */
    public void setDeliveryEmailAddress(String deliveryEmailAddress) {
        this.deliveryEmailAddress = deliveryEmailAddress;
    }


    /**
     * Gets the thirdPartyShippingPaymentAccountNumber value for this CreatePickupRequestRequest.
     * 
     * @return thirdPartyShippingPaymentAccountNumber
     */
    public String getThirdPartyShippingPaymentAccountNumber() {
        return thirdPartyShippingPaymentAccountNumber;
    }


    /**
     * Sets the thirdPartyShippingPaymentAccountNumber value for this CreatePickupRequestRequest.
     * 
     * @param thirdPartyShippingPaymentAccountNumber
     */
    public void setThirdPartyShippingPaymentAccountNumber(String thirdPartyShippingPaymentAccountNumber) {
        this.thirdPartyShippingPaymentAccountNumber = thirdPartyShippingPaymentAccountNumber;
    }


    /**
     * Gets the thirdPartyShippingPaymentCompanyName value for this CreatePickupRequestRequest.
     * 
     * @return thirdPartyShippingPaymentCompanyName
     */
    public String getThirdPartyShippingPaymentCompanyName() {
        return thirdPartyShippingPaymentCompanyName;
    }


    /**
     * Sets the thirdPartyShippingPaymentCompanyName value for this CreatePickupRequestRequest.
     * 
     * @param thirdPartyShippingPaymentCompanyName
     */
    public void setThirdPartyShippingPaymentCompanyName(String thirdPartyShippingPaymentCompanyName) {
        this.thirdPartyShippingPaymentCompanyName = thirdPartyShippingPaymentCompanyName;
    }


    /**
     * Gets the thirdPartyShippingPaymentContactName value for this CreatePickupRequestRequest.
     * 
     * @return thirdPartyShippingPaymentContactName
     */
    public String getThirdPartyShippingPaymentContactName() {
        return thirdPartyShippingPaymentContactName;
    }


    /**
     * Sets the thirdPartyShippingPaymentContactName value for this CreatePickupRequestRequest.
     * 
     * @param thirdPartyShippingPaymentContactName
     */
    public void setThirdPartyShippingPaymentContactName(String thirdPartyShippingPaymentContactName) {
        this.thirdPartyShippingPaymentContactName = thirdPartyShippingPaymentContactName;
    }


    /**
     * Gets the thirdPartyShippingPaymentAddress value for this CreatePickupRequestRequest.
     * 
     * @return thirdPartyShippingPaymentAddress
     */
    public com.paazl.soap.generated.AddressType getThirdPartyShippingPaymentAddress() {
        return thirdPartyShippingPaymentAddress;
    }


    /**
     * Sets the thirdPartyShippingPaymentAddress value for this CreatePickupRequestRequest.
     * 
     * @param thirdPartyShippingPaymentAddress
     */
    public void setThirdPartyShippingPaymentAddress(com.paazl.soap.generated.AddressType thirdPartyShippingPaymentAddress) {
        this.thirdPartyShippingPaymentAddress = thirdPartyShippingPaymentAddress;
    }


    /**
     * Gets the thirdPartyShippingPaymentPhoneNumber value for this CreatePickupRequestRequest.
     * 
     * @return thirdPartyShippingPaymentPhoneNumber
     */
    public String getThirdPartyShippingPaymentPhoneNumber() {
        return thirdPartyShippingPaymentPhoneNumber;
    }


    /**
     * Sets the thirdPartyShippingPaymentPhoneNumber value for this CreatePickupRequestRequest.
     * 
     * @param thirdPartyShippingPaymentPhoneNumber
     */
    public void setThirdPartyShippingPaymentPhoneNumber(String thirdPartyShippingPaymentPhoneNumber) {
        this.thirdPartyShippingPaymentPhoneNumber = thirdPartyShippingPaymentPhoneNumber;
    }


    /**
     * Gets the thirdPartyShippingPaymentEmailAddress value for this CreatePickupRequestRequest.
     * 
     * @return thirdPartyShippingPaymentEmailAddress
     */
    public String getThirdPartyShippingPaymentEmailAddress() {
        return thirdPartyShippingPaymentEmailAddress;
    }


    /**
     * Sets the thirdPartyShippingPaymentEmailAddress value for this CreatePickupRequestRequest.
     * 
     * @param thirdPartyShippingPaymentEmailAddress
     */
    public void setThirdPartyShippingPaymentEmailAddress(String thirdPartyShippingPaymentEmailAddress) {
        this.thirdPartyShippingPaymentEmailAddress = thirdPartyShippingPaymentEmailAddress;
    }


    /**
     * Gets the shippingPaymentType value for this CreatePickupRequestRequest.
     * 
     * @return shippingPaymentType
     */
    public com.paazl.soap.generated.ShippingPaymentType getShippingPaymentType() {
        return shippingPaymentType;
    }


    /**
     * Sets the shippingPaymentType value for this CreatePickupRequestRequest.
     * 
     * @param shippingPaymentType
     */
    public void setShippingPaymentType(com.paazl.soap.generated.ShippingPaymentType shippingPaymentType) {
        this.shippingPaymentType = shippingPaymentType;
    }


    /**
     * Gets the additionalInstruction value for this CreatePickupRequestRequest.
     * 
     * @return additionalInstruction
     */
    public String getAdditionalInstruction() {
        return additionalInstruction;
    }


    /**
     * Sets the additionalInstruction value for this CreatePickupRequestRequest.
     * 
     * @param additionalInstruction
     */
    public void setAdditionalInstruction(String additionalInstruction) {
        this.additionalInstruction = additionalInstruction;
    }


    /**
     * Gets the shipperNotification value for this CreatePickupRequestRequest.
     * 
     * @return shipperNotification
     */
    public com.paazl.soap.generated.ShipperNotificationType[] getShipperNotification() {
        return shipperNotification;
    }


    /**
     * Sets the shipperNotification value for this CreatePickupRequestRequest.
     * 
     * @param shipperNotification
     */
    public void setShipperNotification(com.paazl.soap.generated.ShipperNotificationType[] shipperNotification) {
        this.shipperNotification = shipperNotification;
    }

    public com.paazl.soap.generated.ShipperNotificationType getShipperNotification(int i) {
        return this.shipperNotification[i];
    }

    public void setShipperNotification(int i, com.paazl.soap.generated.ShipperNotificationType _value) {
        this.shipperNotification[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreatePickupRequestRequest)) return false;
        CreatePickupRequestRequest other = (CreatePickupRequestRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hash==null && other.getHash()==null) || 
             (this.hash!=null &&
              this.hash.equals(other.getHash()))) &&
            ((this.targetWebshop==null && other.getTargetWebshop()==null) || 
             (this.targetWebshop!=null &&
              this.targetWebshop.equals(other.getTargetWebshop()))) &&
            ((this.internalReference==null && other.getInternalReference()==null) || 
             (this.internalReference!=null &&
              this.internalReference.equals(other.getInternalReference()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.pickupRequestOption==null && other.getPickupRequestOption()==null) || 
             (this.pickupRequestOption!=null &&
              this.pickupRequestOption.equals(other.getPickupRequestOption()))) &&
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.pieceCount==null && other.getPieceCount()==null) || 
             (this.pieceCount!=null &&
              this.pieceCount.equals(other.getPieceCount()))) &&
            ((this.parcel==null && other.getParcel()==null) || 
             (this.parcel!=null &&
              java.util.Arrays.equals(this.parcel, other.getParcel()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.pickupWindowStart==null && other.getPickupWindowStart()==null) || 
             (this.pickupWindowStart!=null &&
              this.pickupWindowStart.equals(other.getPickupWindowStart()))) &&
            ((this.pickupWindowEnd==null && other.getPickupWindowEnd()==null) || 
             (this.pickupWindowEnd!=null &&
              this.pickupWindowEnd.equals(other.getPickupWindowEnd()))) &&
            ((this.pickupTimeZone==null && other.getPickupTimeZone()==null) || 
             (this.pickupTimeZone!=null &&
              this.pickupTimeZone.equals(other.getPickupTimeZone()))) &&
            ((this.pickupAccountNumber==null && other.getPickupAccountNumber()==null) || 
             (this.pickupAccountNumber!=null &&
              this.pickupAccountNumber.equals(other.getPickupAccountNumber()))) &&
            ((this.pickupCompanyName==null && other.getPickupCompanyName()==null) || 
             (this.pickupCompanyName!=null &&
              this.pickupCompanyName.equals(other.getPickupCompanyName()))) &&
            ((this.pickupContactName==null && other.getPickupContactName()==null) || 
             (this.pickupContactName!=null &&
              this.pickupContactName.equals(other.getPickupContactName()))) &&
            ((this.pickupName==null && other.getPickupName()==null) || 
             (this.pickupName!=null &&
              this.pickupName.equals(other.getPickupName()))) &&
            ((this.pickupNameOther==null && other.getPickupNameOther()==null) || 
             (this.pickupNameOther!=null &&
              this.pickupNameOther.equals(other.getPickupNameOther()))) &&
            ((this.pickupAddress==null && other.getPickupAddress()==null) || 
             (this.pickupAddress!=null &&
              this.pickupAddress.equals(other.getPickupAddress()))) &&
            ((this.pickupPhoneNumber==null && other.getPickupPhoneNumber()==null) || 
             (this.pickupPhoneNumber!=null &&
              this.pickupPhoneNumber.equals(other.getPickupPhoneNumber()))) &&
            ((this.pickupEmailAddress==null && other.getPickupEmailAddress()==null) || 
             (this.pickupEmailAddress!=null &&
              this.pickupEmailAddress.equals(other.getPickupEmailAddress()))) &&
            ((this.deliveryAccountNumber==null && other.getDeliveryAccountNumber()==null) || 
             (this.deliveryAccountNumber!=null &&
              this.deliveryAccountNumber.equals(other.getDeliveryAccountNumber()))) &&
            ((this.deliveryCompanyName==null && other.getDeliveryCompanyName()==null) || 
             (this.deliveryCompanyName!=null &&
              this.deliveryCompanyName.equals(other.getDeliveryCompanyName()))) &&
            ((this.deliveryContactName==null && other.getDeliveryContactName()==null) || 
             (this.deliveryContactName!=null &&
              this.deliveryContactName.equals(other.getDeliveryContactName()))) &&
            ((this.deliveryAddress==null && other.getDeliveryAddress()==null) || 
             (this.deliveryAddress!=null &&
              this.deliveryAddress.equals(other.getDeliveryAddress()))) &&
            ((this.deliveryPhoneNumber==null && other.getDeliveryPhoneNumber()==null) || 
             (this.deliveryPhoneNumber!=null &&
              this.deliveryPhoneNumber.equals(other.getDeliveryPhoneNumber()))) &&
            ((this.deliveryEmailAddress==null && other.getDeliveryEmailAddress()==null) || 
             (this.deliveryEmailAddress!=null &&
              this.deliveryEmailAddress.equals(other.getDeliveryEmailAddress()))) &&
            ((this.thirdPartyShippingPaymentAccountNumber==null && other.getThirdPartyShippingPaymentAccountNumber()==null) || 
             (this.thirdPartyShippingPaymentAccountNumber!=null &&
              this.thirdPartyShippingPaymentAccountNumber.equals(other.getThirdPartyShippingPaymentAccountNumber()))) &&
            ((this.thirdPartyShippingPaymentCompanyName==null && other.getThirdPartyShippingPaymentCompanyName()==null) || 
             (this.thirdPartyShippingPaymentCompanyName!=null &&
              this.thirdPartyShippingPaymentCompanyName.equals(other.getThirdPartyShippingPaymentCompanyName()))) &&
            ((this.thirdPartyShippingPaymentContactName==null && other.getThirdPartyShippingPaymentContactName()==null) || 
             (this.thirdPartyShippingPaymentContactName!=null &&
              this.thirdPartyShippingPaymentContactName.equals(other.getThirdPartyShippingPaymentContactName()))) &&
            ((this.thirdPartyShippingPaymentAddress==null && other.getThirdPartyShippingPaymentAddress()==null) || 
             (this.thirdPartyShippingPaymentAddress!=null &&
              this.thirdPartyShippingPaymentAddress.equals(other.getThirdPartyShippingPaymentAddress()))) &&
            ((this.thirdPartyShippingPaymentPhoneNumber==null && other.getThirdPartyShippingPaymentPhoneNumber()==null) || 
             (this.thirdPartyShippingPaymentPhoneNumber!=null &&
              this.thirdPartyShippingPaymentPhoneNumber.equals(other.getThirdPartyShippingPaymentPhoneNumber()))) &&
            ((this.thirdPartyShippingPaymentEmailAddress==null && other.getThirdPartyShippingPaymentEmailAddress()==null) || 
             (this.thirdPartyShippingPaymentEmailAddress!=null &&
              this.thirdPartyShippingPaymentEmailAddress.equals(other.getThirdPartyShippingPaymentEmailAddress()))) &&
            ((this.shippingPaymentType==null && other.getShippingPaymentType()==null) || 
             (this.shippingPaymentType!=null &&
              this.shippingPaymentType.equals(other.getShippingPaymentType()))) &&
            ((this.additionalInstruction==null && other.getAdditionalInstruction()==null) || 
             (this.additionalInstruction!=null &&
              this.additionalInstruction.equals(other.getAdditionalInstruction()))) &&
            ((this.shipperNotification==null && other.getShipperNotification()==null) || 
             (this.shipperNotification!=null &&
              java.util.Arrays.equals(this.shipperNotification, other.getShipperNotification())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getHash() != null) {
            _hashCode += getHash().hashCode();
        }
        if (getTargetWebshop() != null) {
            _hashCode += getTargetWebshop().hashCode();
        }
        if (getInternalReference() != null) {
            _hashCode += getInternalReference().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getPickupRequestOption() != null) {
            _hashCode += getPickupRequestOption().hashCode();
        }
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getPieceCount() != null) {
            _hashCode += getPieceCount().hashCode();
        }
        if (getParcel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParcel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getPickupWindowStart() != null) {
            _hashCode += getPickupWindowStart().hashCode();
        }
        if (getPickupWindowEnd() != null) {
            _hashCode += getPickupWindowEnd().hashCode();
        }
        if (getPickupTimeZone() != null) {
            _hashCode += getPickupTimeZone().hashCode();
        }
        if (getPickupAccountNumber() != null) {
            _hashCode += getPickupAccountNumber().hashCode();
        }
        if (getPickupCompanyName() != null) {
            _hashCode += getPickupCompanyName().hashCode();
        }
        if (getPickupContactName() != null) {
            _hashCode += getPickupContactName().hashCode();
        }
        if (getPickupName() != null) {
            _hashCode += getPickupName().hashCode();
        }
        if (getPickupNameOther() != null) {
            _hashCode += getPickupNameOther().hashCode();
        }
        if (getPickupAddress() != null) {
            _hashCode += getPickupAddress().hashCode();
        }
        if (getPickupPhoneNumber() != null) {
            _hashCode += getPickupPhoneNumber().hashCode();
        }
        if (getPickupEmailAddress() != null) {
            _hashCode += getPickupEmailAddress().hashCode();
        }
        if (getDeliveryAccountNumber() != null) {
            _hashCode += getDeliveryAccountNumber().hashCode();
        }
        if (getDeliveryCompanyName() != null) {
            _hashCode += getDeliveryCompanyName().hashCode();
        }
        if (getDeliveryContactName() != null) {
            _hashCode += getDeliveryContactName().hashCode();
        }
        if (getDeliveryAddress() != null) {
            _hashCode += getDeliveryAddress().hashCode();
        }
        if (getDeliveryPhoneNumber() != null) {
            _hashCode += getDeliveryPhoneNumber().hashCode();
        }
        if (getDeliveryEmailAddress() != null) {
            _hashCode += getDeliveryEmailAddress().hashCode();
        }
        if (getThirdPartyShippingPaymentAccountNumber() != null) {
            _hashCode += getThirdPartyShippingPaymentAccountNumber().hashCode();
        }
        if (getThirdPartyShippingPaymentCompanyName() != null) {
            _hashCode += getThirdPartyShippingPaymentCompanyName().hashCode();
        }
        if (getThirdPartyShippingPaymentContactName() != null) {
            _hashCode += getThirdPartyShippingPaymentContactName().hashCode();
        }
        if (getThirdPartyShippingPaymentAddress() != null) {
            _hashCode += getThirdPartyShippingPaymentAddress().hashCode();
        }
        if (getThirdPartyShippingPaymentPhoneNumber() != null) {
            _hashCode += getThirdPartyShippingPaymentPhoneNumber().hashCode();
        }
        if (getThirdPartyShippingPaymentEmailAddress() != null) {
            _hashCode += getThirdPartyShippingPaymentEmailAddress().hashCode();
        }
        if (getShippingPaymentType() != null) {
            _hashCode += getShippingPaymentType().hashCode();
        }
        if (getAdditionalInstruction() != null) {
            _hashCode += getAdditionalInstruction().hashCode();
        }
        if (getShipperNotification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipperNotification());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShipperNotification(), i);
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
        new org.apache.axis.description.TypeDesc(CreatePickupRequestRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">createPickupRequestRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWebshop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "targetWebshop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "internalReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupRequestOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pieceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestParcelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupWindowStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupWindowStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupWindowEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupWindowEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupNameOther");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupNameOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyShippingPaymentAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "thirdPartyShippingPaymentAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyShippingPaymentCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "thirdPartyShippingPaymentCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyShippingPaymentContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "thirdPartyShippingPaymentContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyShippingPaymentAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "thirdPartyShippingPaymentAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyShippingPaymentPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "thirdPartyShippingPaymentPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyShippingPaymentEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "thirdPartyShippingPaymentEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("additionalInstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalInstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
