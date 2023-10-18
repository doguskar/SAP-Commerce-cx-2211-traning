/**
 * ShippingOptionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ShippingOptionRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String orderReference;

    private String postcode;

    private String country;

    private Boolean evening;

    private Boolean weekend;

    private Boolean extendedDeliveryDateDetails;

    private String shippingOption;

    private Boolean deliveryEstimate;

    private com.paazl.soap.generated.DateRangeType deliveryDateRange;

    private com.paazl.soap.generated.Source[] sources;

    public ShippingOptionRequest() {
    }

    public ShippingOptionRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String orderReference,
           String postcode,
           String country,
           Boolean evening,
           Boolean weekend,
           Boolean extendedDeliveryDateDetails,
           String shippingOption,
           Boolean deliveryEstimate,
           com.paazl.soap.generated.DateRangeType deliveryDateRange,
           com.paazl.soap.generated.Source[] sources) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.orderReference = orderReference;
        this.postcode = postcode;
        this.country = country;
        this.evening = evening;
        this.weekend = weekend;
        this.extendedDeliveryDateDetails = extendedDeliveryDateDetails;
        this.shippingOption = shippingOption;
        this.deliveryEstimate = deliveryEstimate;
        this.deliveryDateRange = deliveryDateRange;
        this.sources = sources;
    }


    /**
     * Gets the hash value for this ShippingOptionRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this ShippingOptionRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this ShippingOptionRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this ShippingOptionRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the orderReference value for this ShippingOptionRequest.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this ShippingOptionRequest.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the postcode value for this ShippingOptionRequest.
     * 
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this ShippingOptionRequest.
     * 
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the country value for this ShippingOptionRequest.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ShippingOptionRequest.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the evening value for this ShippingOptionRequest.
     * 
     * @return evening
     */
    public Boolean getEvening() {
        return evening;
    }


    /**
     * Sets the evening value for this ShippingOptionRequest.
     * 
     * @param evening
     */
    public void setEvening(Boolean evening) {
        this.evening = evening;
    }


    /**
     * Gets the weekend value for this ShippingOptionRequest.
     * 
     * @return weekend
     */
    public Boolean getWeekend() {
        return weekend;
    }


    /**
     * Sets the weekend value for this ShippingOptionRequest.
     * 
     * @param weekend
     */
    public void setWeekend(Boolean weekend) {
        this.weekend = weekend;
    }


    /**
     * Gets the extendedDeliveryDateDetails value for this ShippingOptionRequest.
     * 
     * @return extendedDeliveryDateDetails
     */
    public Boolean getExtendedDeliveryDateDetails() {
        return extendedDeliveryDateDetails;
    }


    /**
     * Sets the extendedDeliveryDateDetails value for this ShippingOptionRequest.
     * 
     * @param extendedDeliveryDateDetails
     */
    public void setExtendedDeliveryDateDetails(Boolean extendedDeliveryDateDetails) {
        this.extendedDeliveryDateDetails = extendedDeliveryDateDetails;
    }


    /**
     * Gets the shippingOption value for this ShippingOptionRequest.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this ShippingOptionRequest.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the deliveryEstimate value for this ShippingOptionRequest.
     * 
     * @return deliveryEstimate
     */
    public Boolean getDeliveryEstimate() {
        return deliveryEstimate;
    }


    /**
     * Sets the deliveryEstimate value for this ShippingOptionRequest.
     * 
     * @param deliveryEstimate
     */
    public void setDeliveryEstimate(Boolean deliveryEstimate) {
        this.deliveryEstimate = deliveryEstimate;
    }


    /**
     * Gets the deliveryDateRange value for this ShippingOptionRequest.
     * 
     * @return deliveryDateRange
     */
    public com.paazl.soap.generated.DateRangeType getDeliveryDateRange() {
        return deliveryDateRange;
    }


    /**
     * Sets the deliveryDateRange value for this ShippingOptionRequest.
     * 
     * @param deliveryDateRange
     */
    public void setDeliveryDateRange(com.paazl.soap.generated.DateRangeType deliveryDateRange) {
        this.deliveryDateRange = deliveryDateRange;
    }


    /**
     * Gets the sources value for this ShippingOptionRequest.
     * 
     * @return sources
     */
    public com.paazl.soap.generated.Source[] getSources() {
        return sources;
    }


    /**
     * Sets the sources value for this ShippingOptionRequest.
     * 
     * @param sources
     */
    public void setSources(com.paazl.soap.generated.Source[] sources) {
        this.sources = sources;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingOptionRequest)) return false;
        ShippingOptionRequest other = (ShippingOptionRequest) obj;
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
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.evening==null && other.getEvening()==null) || 
             (this.evening!=null &&
              this.evening.equals(other.getEvening()))) &&
            ((this.weekend==null && other.getWeekend()==null) || 
             (this.weekend!=null &&
              this.weekend.equals(other.getWeekend()))) &&
            ((this.extendedDeliveryDateDetails==null && other.getExtendedDeliveryDateDetails()==null) || 
             (this.extendedDeliveryDateDetails!=null &&
              this.extendedDeliveryDateDetails.equals(other.getExtendedDeliveryDateDetails()))) &&
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.deliveryEstimate==null && other.getDeliveryEstimate()==null) || 
             (this.deliveryEstimate!=null &&
              this.deliveryEstimate.equals(other.getDeliveryEstimate()))) &&
            ((this.deliveryDateRange==null && other.getDeliveryDateRange()==null) || 
             (this.deliveryDateRange!=null &&
              this.deliveryDateRange.equals(other.getDeliveryDateRange()))) &&
            ((this.sources==null && other.getSources()==null) || 
             (this.sources!=null &&
              java.util.Arrays.equals(this.sources, other.getSources())));
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
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getEvening() != null) {
            _hashCode += getEvening().hashCode();
        }
        if (getWeekend() != null) {
            _hashCode += getWeekend().hashCode();
        }
        if (getExtendedDeliveryDateDetails() != null) {
            _hashCode += getExtendedDeliveryDateDetails().hashCode();
        }
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getDeliveryEstimate() != null) {
            _hashCode += getDeliveryEstimate().hashCode();
        }
        if (getDeliveryDateRange() != null) {
            _hashCode += getDeliveryDateRange().hashCode();
        }
        if (getSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSources());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSources(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingOptionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingOptionRequest"));
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
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evening");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "evening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "weekend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedDeliveryDateDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "extendedDeliveryDateDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("deliveryEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dateRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "sources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source"));
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
