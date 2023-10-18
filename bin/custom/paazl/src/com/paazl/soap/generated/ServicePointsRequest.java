/**
 * ServicePointsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ServicePointsRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String shippingOption;

    private Boolean evening;

    private Boolean weekend;

    private String country;

    private String postcode;

    private Boolean domestic;

    private org.apache.axis.types.NonNegativeInteger limit;

    private com.paazl.soap.generated.CoordinatesType southWest;

    private com.paazl.soap.generated.CoordinatesType northEast;

    public ServicePointsRequest() {
    }

    public ServicePointsRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String shippingOption,
           Boolean evening,
           Boolean weekend,
           String country,
           String postcode,
           Boolean domestic,
           org.apache.axis.types.NonNegativeInteger limit,
           com.paazl.soap.generated.CoordinatesType southWest,
           com.paazl.soap.generated.CoordinatesType northEast) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.shippingOption = shippingOption;
        this.evening = evening;
        this.weekend = weekend;
        this.country = country;
        this.postcode = postcode;
        this.domestic = domestic;
        this.limit = limit;
        this.southWest = southWest;
        this.northEast = northEast;
    }


    /**
     * Gets the hash value for this ServicePointsRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this ServicePointsRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this ServicePointsRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this ServicePointsRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the shippingOption value for this ServicePointsRequest.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this ServicePointsRequest.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the evening value for this ServicePointsRequest.
     * 
     * @return evening
     */
    public Boolean getEvening() {
        return evening;
    }


    /**
     * Sets the evening value for this ServicePointsRequest.
     * 
     * @param evening
     */
    public void setEvening(Boolean evening) {
        this.evening = evening;
    }


    /**
     * Gets the weekend value for this ServicePointsRequest.
     * 
     * @return weekend
     */
    public Boolean getWeekend() {
        return weekend;
    }


    /**
     * Sets the weekend value for this ServicePointsRequest.
     * 
     * @param weekend
     */
    public void setWeekend(Boolean weekend) {
        this.weekend = weekend;
    }


    /**
     * Gets the country value for this ServicePointsRequest.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ServicePointsRequest.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the postcode value for this ServicePointsRequest.
     * 
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this ServicePointsRequest.
     * 
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the domestic value for this ServicePointsRequest.
     * 
     * @return domestic
     */
    public Boolean getDomestic() {
        return domestic;
    }


    /**
     * Sets the domestic value for this ServicePointsRequest.
     * 
     * @param domestic
     */
    public void setDomestic(Boolean domestic) {
        this.domestic = domestic;
    }


    /**
     * Gets the limit value for this ServicePointsRequest.
     * 
     * @return limit
     */
    public org.apache.axis.types.NonNegativeInteger getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this ServicePointsRequest.
     * 
     * @param limit
     */
    public void setLimit(org.apache.axis.types.NonNegativeInteger limit) {
        this.limit = limit;
    }


    /**
     * Gets the southWest value for this ServicePointsRequest.
     * 
     * @return southWest
     */
    public com.paazl.soap.generated.CoordinatesType getSouthWest() {
        return southWest;
    }


    /**
     * Sets the southWest value for this ServicePointsRequest.
     * 
     * @param southWest
     */
    public void setSouthWest(com.paazl.soap.generated.CoordinatesType southWest) {
        this.southWest = southWest;
    }


    /**
     * Gets the northEast value for this ServicePointsRequest.
     * 
     * @return northEast
     */
    public com.paazl.soap.generated.CoordinatesType getNorthEast() {
        return northEast;
    }


    /**
     * Sets the northEast value for this ServicePointsRequest.
     * 
     * @param northEast
     */
    public void setNorthEast(com.paazl.soap.generated.CoordinatesType northEast) {
        this.northEast = northEast;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServicePointsRequest)) return false;
        ServicePointsRequest other = (ServicePointsRequest) obj;
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
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.evening==null && other.getEvening()==null) || 
             (this.evening!=null &&
              this.evening.equals(other.getEvening()))) &&
            ((this.weekend==null && other.getWeekend()==null) || 
             (this.weekend!=null &&
              this.weekend.equals(other.getWeekend()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.domestic==null && other.getDomestic()==null) || 
             (this.domestic!=null &&
              this.domestic.equals(other.getDomestic()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.southWest==null && other.getSouthWest()==null) || 
             (this.southWest!=null &&
              this.southWest.equals(other.getSouthWest()))) &&
            ((this.northEast==null && other.getNorthEast()==null) || 
             (this.northEast!=null &&
              this.northEast.equals(other.getNorthEast())));
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
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getEvening() != null) {
            _hashCode += getEvening().hashCode();
        }
        if (getWeekend() != null) {
            _hashCode += getWeekend().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getDomestic() != null) {
            _hashCode += getDomestic().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getSouthWest() != null) {
            _hashCode += getSouthWest().hashCode();
        }
        if (getNorthEast() != null) {
            _hashCode += getNorthEast().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePointsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsRequest"));
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
        elemField.setFieldName("shippingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domestic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "domestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("southWest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "southWest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "coordinatesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("northEast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "northEast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "coordinatesType"));
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
