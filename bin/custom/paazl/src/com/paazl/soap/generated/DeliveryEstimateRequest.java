/**
 * DeliveryEstimateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DeliveryEstimateRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String orderReference;

    private String shippingOption;

    private java.math.BigDecimal weight;

    private java.math.BigDecimal value;

    private String valueCurrency;

    private String senderCountry;

    private String senderCity;

    private String senderPostcode;

    private String consigneeCountry;

    private String consigneeCity;

    private String consigneePostcode;

    public DeliveryEstimateRequest() {
    }

    public DeliveryEstimateRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String orderReference,
           String shippingOption,
           java.math.BigDecimal weight,
           java.math.BigDecimal value,
           String valueCurrency,
           String senderCountry,
           String senderCity,
           String senderPostcode,
           String consigneeCountry,
           String consigneeCity,
           String consigneePostcode) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.orderReference = orderReference;
        this.shippingOption = shippingOption;
        this.weight = weight;
        this.value = value;
        this.valueCurrency = valueCurrency;
        this.senderCountry = senderCountry;
        this.senderCity = senderCity;
        this.senderPostcode = senderPostcode;
        this.consigneeCountry = consigneeCountry;
        this.consigneeCity = consigneeCity;
        this.consigneePostcode = consigneePostcode;
    }


    /**
     * Gets the hash value for this DeliveryEstimateRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this DeliveryEstimateRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this DeliveryEstimateRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this DeliveryEstimateRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the orderReference value for this DeliveryEstimateRequest.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this DeliveryEstimateRequest.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the shippingOption value for this DeliveryEstimateRequest.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this DeliveryEstimateRequest.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the weight value for this DeliveryEstimateRequest.
     * 
     * @return weight
     */
    public java.math.BigDecimal getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this DeliveryEstimateRequest.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }


    /**
     * Gets the value value for this DeliveryEstimateRequest.
     * 
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }


    /**
     * Sets the value value for this DeliveryEstimateRequest.
     * 
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }


    /**
     * Gets the valueCurrency value for this DeliveryEstimateRequest.
     * 
     * @return valueCurrency
     */
    public String getValueCurrency() {
        return valueCurrency;
    }


    /**
     * Sets the valueCurrency value for this DeliveryEstimateRequest.
     * 
     * @param valueCurrency
     */
    public void setValueCurrency(String valueCurrency) {
        this.valueCurrency = valueCurrency;
    }


    /**
     * Gets the senderCountry value for this DeliveryEstimateRequest.
     * 
     * @return senderCountry
     */
    public String getSenderCountry() {
        return senderCountry;
    }


    /**
     * Sets the senderCountry value for this DeliveryEstimateRequest.
     * 
     * @param senderCountry
     */
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }


    /**
     * Gets the senderCity value for this DeliveryEstimateRequest.
     * 
     * @return senderCity
     */
    public String getSenderCity() {
        return senderCity;
    }


    /**
     * Sets the senderCity value for this DeliveryEstimateRequest.
     * 
     * @param senderCity
     */
    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }


    /**
     * Gets the senderPostcode value for this DeliveryEstimateRequest.
     * 
     * @return senderPostcode
     */
    public String getSenderPostcode() {
        return senderPostcode;
    }


    /**
     * Sets the senderPostcode value for this DeliveryEstimateRequest.
     * 
     * @param senderPostcode
     */
    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }


    /**
     * Gets the consigneeCountry value for this DeliveryEstimateRequest.
     * 
     * @return consigneeCountry
     */
    public String getConsigneeCountry() {
        return consigneeCountry;
    }


    /**
     * Sets the consigneeCountry value for this DeliveryEstimateRequest.
     * 
     * @param consigneeCountry
     */
    public void setConsigneeCountry(String consigneeCountry) {
        this.consigneeCountry = consigneeCountry;
    }


    /**
     * Gets the consigneeCity value for this DeliveryEstimateRequest.
     * 
     * @return consigneeCity
     */
    public String getConsigneeCity() {
        return consigneeCity;
    }


    /**
     * Sets the consigneeCity value for this DeliveryEstimateRequest.
     * 
     * @param consigneeCity
     */
    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }


    /**
     * Gets the consigneePostcode value for this DeliveryEstimateRequest.
     * 
     * @return consigneePostcode
     */
    public String getConsigneePostcode() {
        return consigneePostcode;
    }


    /**
     * Sets the consigneePostcode value for this DeliveryEstimateRequest.
     * 
     * @param consigneePostcode
     */
    public void setConsigneePostcode(String consigneePostcode) {
        this.consigneePostcode = consigneePostcode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliveryEstimateRequest)) return false;
        DeliveryEstimateRequest other = (DeliveryEstimateRequest) obj;
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
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueCurrency==null && other.getValueCurrency()==null) || 
             (this.valueCurrency!=null &&
              this.valueCurrency.equals(other.getValueCurrency()))) &&
            ((this.senderCountry==null && other.getSenderCountry()==null) || 
             (this.senderCountry!=null &&
              this.senderCountry.equals(other.getSenderCountry()))) &&
            ((this.senderCity==null && other.getSenderCity()==null) || 
             (this.senderCity!=null &&
              this.senderCity.equals(other.getSenderCity()))) &&
            ((this.senderPostcode==null && other.getSenderPostcode()==null) || 
             (this.senderPostcode!=null &&
              this.senderPostcode.equals(other.getSenderPostcode()))) &&
            ((this.consigneeCountry==null && other.getConsigneeCountry()==null) || 
             (this.consigneeCountry!=null &&
              this.consigneeCountry.equals(other.getConsigneeCountry()))) &&
            ((this.consigneeCity==null && other.getConsigneeCity()==null) || 
             (this.consigneeCity!=null &&
              this.consigneeCity.equals(other.getConsigneeCity()))) &&
            ((this.consigneePostcode==null && other.getConsigneePostcode()==null) || 
             (this.consigneePostcode!=null &&
              this.consigneePostcode.equals(other.getConsigneePostcode())));
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
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueCurrency() != null) {
            _hashCode += getValueCurrency().hashCode();
        }
        if (getSenderCountry() != null) {
            _hashCode += getSenderCountry().hashCode();
        }
        if (getSenderCity() != null) {
            _hashCode += getSenderCity().hashCode();
        }
        if (getSenderPostcode() != null) {
            _hashCode += getSenderPostcode().hashCode();
        }
        if (getConsigneeCountry() != null) {
            _hashCode += getConsigneeCountry().hashCode();
        }
        if (getConsigneeCity() != null) {
            _hashCode += getConsigneeCity().hashCode();
        }
        if (getConsigneePostcode() != null) {
            _hashCode += getConsigneePostcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryEstimateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deliveryEstimateRequest"));
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
        elemField.setFieldName("shippingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "valueCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderPostcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "consigneeCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "consigneeCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneePostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "consigneePostcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
