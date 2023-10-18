/**
 * RateResponseRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class RateResponseRate  implements java.io.Serializable {
    private com.paazl.soap.generated.DeliveryTypeType type;

    private String distributor;

    private String shippingOption;

    private String description;

    private java.math.BigDecimal rate;

    private Double rateDiscount;

    private com.paazl.soap.generated.NonNegativeIntegerRangeType transitDaysRange;

    public RateResponseRate() {
    }

    public RateResponseRate(
           com.paazl.soap.generated.DeliveryTypeType type,
           String distributor,
           String shippingOption,
           String description,
           java.math.BigDecimal rate,
           Double rateDiscount,
           com.paazl.soap.generated.NonNegativeIntegerRangeType transitDaysRange) {
           this.type = type;
           this.distributor = distributor;
           this.shippingOption = shippingOption;
           this.description = description;
           this.rate = rate;
           this.rateDiscount = rateDiscount;
           this.transitDaysRange = transitDaysRange;
    }


    /**
     * Gets the type value for this RateResponseRate.
     * 
     * @return type
     */
    public com.paazl.soap.generated.DeliveryTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this RateResponseRate.
     * 
     * @param type
     */
    public void setType(com.paazl.soap.generated.DeliveryTypeType type) {
        this.type = type;
    }


    /**
     * Gets the distributor value for this RateResponseRate.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this RateResponseRate.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the shippingOption value for this RateResponseRate.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this RateResponseRate.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the description value for this RateResponseRate.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RateResponseRate.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the rate value for this RateResponseRate.
     * 
     * @return rate
     */
    public java.math.BigDecimal getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this RateResponseRate.
     * 
     * @param rate
     */
    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }


    /**
     * Gets the rateDiscount value for this RateResponseRate.
     * 
     * @return rateDiscount
     */
    public Double getRateDiscount() {
        return rateDiscount;
    }


    /**
     * Sets the rateDiscount value for this RateResponseRate.
     * 
     * @param rateDiscount
     */
    public void setRateDiscount(Double rateDiscount) {
        this.rateDiscount = rateDiscount;
    }


    /**
     * Gets the transitDaysRange value for this RateResponseRate.
     * 
     * @return transitDaysRange
     */
    public com.paazl.soap.generated.NonNegativeIntegerRangeType getTransitDaysRange() {
        return transitDaysRange;
    }


    /**
     * Sets the transitDaysRange value for this RateResponseRate.
     * 
     * @param transitDaysRange
     */
    public void setTransitDaysRange(com.paazl.soap.generated.NonNegativeIntegerRangeType transitDaysRange) {
        this.transitDaysRange = transitDaysRange;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RateResponseRate)) return false;
        RateResponseRate other = (RateResponseRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.rateDiscount==null && other.getRateDiscount()==null) || 
             (this.rateDiscount!=null &&
              this.rateDiscount.equals(other.getRateDiscount()))) &&
            ((this.transitDaysRange==null && other.getTransitDaysRange()==null) || 
             (this.transitDaysRange!=null &&
              this.transitDaysRange.equals(other.getTransitDaysRange())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getRateDiscount() != null) {
            _hashCode += getRateDiscount().hashCode();
        }
        if (getTransitDaysRange() != null) {
            _hashCode += getTransitDaysRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateResponseRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>rateResponse>rate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "rateDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitDaysRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "transitDaysRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nonNegativeIntegerRangeType"));
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
