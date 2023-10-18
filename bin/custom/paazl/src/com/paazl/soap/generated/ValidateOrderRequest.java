/**
 * ValidateOrderRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ValidateOrderRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String orderReference;

    private String pendingOrderReference;

    private int totalAmount;

    private String totalAmountCurrency;

    private org.apache.axis.types.Language language;

    private String customerEmail;

    private String customerPhoneNumber;

    private com.paazl.soap.generated.ShippingMethod shippingMethod;

    private com.paazl.soap.generated.SenderAddress shipperAddress;

    private com.paazl.soap.generated.SenderAddress returnAddress;

    private com.paazl.soap.generated.ShippingAddress shippingAddress;

    public ValidateOrderRequest() {
    }

    public ValidateOrderRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String orderReference,
           String pendingOrderReference,
           int totalAmount,
           String totalAmountCurrency,
           org.apache.axis.types.Language language,
           String customerEmail,
           String customerPhoneNumber,
           com.paazl.soap.generated.ShippingMethod shippingMethod,
           com.paazl.soap.generated.SenderAddress shipperAddress,
           com.paazl.soap.generated.SenderAddress returnAddress,
           com.paazl.soap.generated.ShippingAddress shippingAddress) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.orderReference = orderReference;
        this.pendingOrderReference = pendingOrderReference;
        this.totalAmount = totalAmount;
        this.totalAmountCurrency = totalAmountCurrency;
        this.language = language;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.shippingMethod = shippingMethod;
        this.shipperAddress = shipperAddress;
        this.returnAddress = returnAddress;
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the hash value for this ValidateOrderRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this ValidateOrderRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this ValidateOrderRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this ValidateOrderRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the orderReference value for this ValidateOrderRequest.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this ValidateOrderRequest.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the pendingOrderReference value for this ValidateOrderRequest.
     * 
     * @return pendingOrderReference
     */
    public String getPendingOrderReference() {
        return pendingOrderReference;
    }


    /**
     * Sets the pendingOrderReference value for this ValidateOrderRequest.
     * 
     * @param pendingOrderReference
     */
    public void setPendingOrderReference(String pendingOrderReference) {
        this.pendingOrderReference = pendingOrderReference;
    }


    /**
     * Gets the totalAmount value for this ValidateOrderRequest.
     * 
     * @return totalAmount
     */
    public int getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ValidateOrderRequest.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the totalAmountCurrency value for this ValidateOrderRequest.
     * 
     * @return totalAmountCurrency
     */
    public String getTotalAmountCurrency() {
        return totalAmountCurrency;
    }


    /**
     * Sets the totalAmountCurrency value for this ValidateOrderRequest.
     * 
     * @param totalAmountCurrency
     */
    public void setTotalAmountCurrency(String totalAmountCurrency) {
        this.totalAmountCurrency = totalAmountCurrency;
    }


    /**
     * Gets the language value for this ValidateOrderRequest.
     * 
     * @return language
     */
    public org.apache.axis.types.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ValidateOrderRequest.
     * 
     * @param language
     */
    public void setLanguage(org.apache.axis.types.Language language) {
        this.language = language;
    }


    /**
     * Gets the customerEmail value for this ValidateOrderRequest.
     * 
     * @return customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this ValidateOrderRequest.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerPhoneNumber value for this ValidateOrderRequest.
     * 
     * @return customerPhoneNumber
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }


    /**
     * Sets the customerPhoneNumber value for this ValidateOrderRequest.
     * 
     * @param customerPhoneNumber
     */
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


    /**
     * Gets the shippingMethod value for this ValidateOrderRequest.
     * 
     * @return shippingMethod
     */
    public com.paazl.soap.generated.ShippingMethod getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this ValidateOrderRequest.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(com.paazl.soap.generated.ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the shipperAddress value for this ValidateOrderRequest.
     * 
     * @return shipperAddress
     */
    public com.paazl.soap.generated.SenderAddress getShipperAddress() {
        return shipperAddress;
    }


    /**
     * Sets the shipperAddress value for this ValidateOrderRequest.
     * 
     * @param shipperAddress
     */
    public void setShipperAddress(com.paazl.soap.generated.SenderAddress shipperAddress) {
        this.shipperAddress = shipperAddress;
    }


    /**
     * Gets the returnAddress value for this ValidateOrderRequest.
     * 
     * @return returnAddress
     */
    public com.paazl.soap.generated.SenderAddress getReturnAddress() {
        return returnAddress;
    }


    /**
     * Sets the returnAddress value for this ValidateOrderRequest.
     * 
     * @param returnAddress
     */
    public void setReturnAddress(com.paazl.soap.generated.SenderAddress returnAddress) {
        this.returnAddress = returnAddress;
    }


    /**
     * Gets the shippingAddress value for this ValidateOrderRequest.
     * 
     * @return shippingAddress
     */
    public com.paazl.soap.generated.ShippingAddress getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this ValidateOrderRequest.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.paazl.soap.generated.ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ValidateOrderRequest)) return false;
        ValidateOrderRequest other = (ValidateOrderRequest) obj;
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
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.pendingOrderReference==null && other.getPendingOrderReference()==null) || 
             (this.pendingOrderReference!=null &&
              this.pendingOrderReference.equals(other.getPendingOrderReference()))) &&
            this.totalAmount == other.getTotalAmount() &&
            ((this.totalAmountCurrency==null && other.getTotalAmountCurrency()==null) || 
             (this.totalAmountCurrency!=null &&
              this.totalAmountCurrency.equals(other.getTotalAmountCurrency()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.customerEmail==null && other.getCustomerEmail()==null) || 
             (this.customerEmail!=null &&
              this.customerEmail.equals(other.getCustomerEmail()))) &&
            ((this.customerPhoneNumber==null && other.getCustomerPhoneNumber()==null) || 
             (this.customerPhoneNumber!=null &&
              this.customerPhoneNumber.equals(other.getCustomerPhoneNumber()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.shipperAddress==null && other.getShipperAddress()==null) || 
             (this.shipperAddress!=null &&
              this.shipperAddress.equals(other.getShipperAddress()))) &&
            ((this.returnAddress==null && other.getReturnAddress()==null) || 
             (this.returnAddress!=null &&
              this.returnAddress.equals(other.getReturnAddress()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress())));
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
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getPendingOrderReference() != null) {
            _hashCode += getPendingOrderReference().hashCode();
        }
        _hashCode += getTotalAmount();
        if (getTotalAmountCurrency() != null) {
            _hashCode += getTotalAmountCurrency().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getCustomerEmail() != null) {
            _hashCode += getCustomerEmail().hashCode();
        }
        if (getCustomerPhoneNumber() != null) {
            _hashCode += getCustomerPhoneNumber().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getShipperAddress() != null) {
            _hashCode += getShipperAddress().hashCode();
        }
        if (getReturnAddress() != null) {
            _hashCode += getReturnAddress().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateOrderRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">validateOrderRequest"));
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
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingOrderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pendingOrderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmountCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "totalAmountCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "customerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "customerPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingAddress"));
        elemField.setNillable(false);
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
