/**
 * ChangeOrderRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ChangeOrderRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String orderReference;

    private String newOrderReference;

    private Integer totalAmount;

    private String totalAmountCurrency;

    private org.apache.axis.types.Language language;

    private String customerEmail;

    private String customerPhoneNumber;

    private com.paazl.soap.generated.ChangeShippingMethod shippingMethod;

    private com.paazl.soap.generated.ChangeSenderAddress shipperAddress;

    private com.paazl.soap.generated.ChangeSenderAddress returnAddress;

    private com.paazl.soap.generated.ChangeShippingAddress shippingAddress;

    private com.paazl.soap.generated.ChangeProductsProduct[] products;

    public ChangeOrderRequest() {
    }

    public ChangeOrderRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String orderReference,
           String newOrderReference,
           Integer totalAmount,
           String totalAmountCurrency,
           org.apache.axis.types.Language language,
           String customerEmail,
           String customerPhoneNumber,
           com.paazl.soap.generated.ChangeShippingMethod shippingMethod,
           com.paazl.soap.generated.ChangeSenderAddress shipperAddress,
           com.paazl.soap.generated.ChangeSenderAddress returnAddress,
           com.paazl.soap.generated.ChangeShippingAddress shippingAddress,
           com.paazl.soap.generated.ChangeProductsProduct[] products) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.orderReference = orderReference;
        this.newOrderReference = newOrderReference;
        this.totalAmount = totalAmount;
        this.totalAmountCurrency = totalAmountCurrency;
        this.language = language;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.shippingMethod = shippingMethod;
        this.shipperAddress = shipperAddress;
        this.returnAddress = returnAddress;
        this.shippingAddress = shippingAddress;
        this.products = products;
    }


    /**
     * Gets the hash value for this ChangeOrderRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this ChangeOrderRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this ChangeOrderRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this ChangeOrderRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the orderReference value for this ChangeOrderRequest.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this ChangeOrderRequest.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the newOrderReference value for this ChangeOrderRequest.
     * 
     * @return newOrderReference
     */
    public String getNewOrderReference() {
        return newOrderReference;
    }


    /**
     * Sets the newOrderReference value for this ChangeOrderRequest.
     * 
     * @param newOrderReference
     */
    public void setNewOrderReference(String newOrderReference) {
        this.newOrderReference = newOrderReference;
    }


    /**
     * Gets the totalAmount value for this ChangeOrderRequest.
     * 
     * @return totalAmount
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ChangeOrderRequest.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the totalAmountCurrency value for this ChangeOrderRequest.
     * 
     * @return totalAmountCurrency
     */
    public String getTotalAmountCurrency() {
        return totalAmountCurrency;
    }


    /**
     * Sets the totalAmountCurrency value for this ChangeOrderRequest.
     * 
     * @param totalAmountCurrency
     */
    public void setTotalAmountCurrency(String totalAmountCurrency) {
        this.totalAmountCurrency = totalAmountCurrency;
    }


    /**
     * Gets the language value for this ChangeOrderRequest.
     * 
     * @return language
     */
    public org.apache.axis.types.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ChangeOrderRequest.
     * 
     * @param language
     */
    public void setLanguage(org.apache.axis.types.Language language) {
        this.language = language;
    }


    /**
     * Gets the customerEmail value for this ChangeOrderRequest.
     * 
     * @return customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this ChangeOrderRequest.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerPhoneNumber value for this ChangeOrderRequest.
     * 
     * @return customerPhoneNumber
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }


    /**
     * Sets the customerPhoneNumber value for this ChangeOrderRequest.
     * 
     * @param customerPhoneNumber
     */
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


    /**
     * Gets the shippingMethod value for this ChangeOrderRequest.
     * 
     * @return shippingMethod
     */
    public com.paazl.soap.generated.ChangeShippingMethod getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this ChangeOrderRequest.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(com.paazl.soap.generated.ChangeShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the shipperAddress value for this ChangeOrderRequest.
     * 
     * @return shipperAddress
     */
    public com.paazl.soap.generated.ChangeSenderAddress getShipperAddress() {
        return shipperAddress;
    }


    /**
     * Sets the shipperAddress value for this ChangeOrderRequest.
     * 
     * @param shipperAddress
     */
    public void setShipperAddress(com.paazl.soap.generated.ChangeSenderAddress shipperAddress) {
        this.shipperAddress = shipperAddress;
    }


    /**
     * Gets the returnAddress value for this ChangeOrderRequest.
     * 
     * @return returnAddress
     */
    public com.paazl.soap.generated.ChangeSenderAddress getReturnAddress() {
        return returnAddress;
    }


    /**
     * Sets the returnAddress value for this ChangeOrderRequest.
     * 
     * @param returnAddress
     */
    public void setReturnAddress(com.paazl.soap.generated.ChangeSenderAddress returnAddress) {
        this.returnAddress = returnAddress;
    }


    /**
     * Gets the shippingAddress value for this ChangeOrderRequest.
     * 
     * @return shippingAddress
     */
    public com.paazl.soap.generated.ChangeShippingAddress getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this ChangeOrderRequest.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.paazl.soap.generated.ChangeShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the products value for this ChangeOrderRequest.
     * 
     * @return products
     */
    public com.paazl.soap.generated.ChangeProductsProduct[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this ChangeOrderRequest.
     * 
     * @param products
     */
    public void setProducts(com.paazl.soap.generated.ChangeProductsProduct[] products) {
        this.products = products;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangeOrderRequest)) return false;
        ChangeOrderRequest other = (ChangeOrderRequest) obj;
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
            ((this.newOrderReference==null && other.getNewOrderReference()==null) || 
             (this.newOrderReference!=null &&
              this.newOrderReference.equals(other.getNewOrderReference()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
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
              this.shippingAddress.equals(other.getShippingAddress()))) &&
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
        if (getNewOrderReference() != null) {
            _hashCode += getNewOrderReference().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(ChangeOrderRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeOrderRequest"));
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
        elemField.setFieldName("newOrderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "newOrderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeShippingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeSenderAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeSenderAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeShippingAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeProducts>product"));
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
