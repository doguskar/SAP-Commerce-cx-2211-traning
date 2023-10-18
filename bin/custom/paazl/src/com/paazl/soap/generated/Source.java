/**
 * Source.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class Source  implements java.io.Serializable {
    /* Name is either user-defined or will be constructed using the
     * provided source fields. */
    private String name;

    /* Postal code is a mandatory field and refers the sender address
     * postal code. */
    private String postCode;

    /* City is a mandatory field and should be the full name of a
     * city.
     *                         It refers to the city of the sender address. */
    private String city;

    /* Country is a mandatory field and refers to the ISO Alpha-2
     * country code of a country.
     *                         It refers to the country code of the sender
     * address. */
    private String country;

    /* Time zone Id is an optional field and should be provided as
     * one of the
     *                         AvailableZoneIds in the ZoneId class. It refers
     * to the time zone of the sender.
     *                         For more detail, see: https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html */
    private String timeZoneId;

    public Source() {
    }

    public Source(
           String name,
           String postCode,
           String city,
           String country,
           String timeZoneId) {
           this.name = name;
           this.postCode = postCode;
           this.city = city;
           this.country = country;
           this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the name value for this Source.
     * 
     * @return name   * Name is either user-defined or will be constructed using the
     * provided source fields.
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this Source.
     * 
     * @param name   * Name is either user-defined or will be constructed using the
     * provided source fields.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the postCode value for this Source.
     * 
     * @return postCode   * Postal code is a mandatory field and refers the sender address
     * postal code.
     */
    public String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this Source.
     * 
     * @param postCode   * Postal code is a mandatory field and refers the sender address
     * postal code.
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the city value for this Source.
     * 
     * @return city   * City is a mandatory field and should be the full name of a
     * city.
     *                         It refers to the city of the sender address.
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Source.
     * 
     * @param city   * City is a mandatory field and should be the full name of a
     * city.
     *                         It refers to the city of the sender address.
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this Source.
     * 
     * @return country   * Country is a mandatory field and refers to the ISO Alpha-2
     * country code of a country.
     *                         It refers to the country code of the sender
     * address.
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Source.
     * 
     * @param country   * Country is a mandatory field and refers to the ISO Alpha-2
     * country code of a country.
     *                         It refers to the country code of the sender
     * address.
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the timeZoneId value for this Source.
     * 
     * @return timeZoneId   * Time zone Id is an optional field and should be provided as
     * one of the
     *                         AvailableZoneIds in the ZoneId class. It refers
     * to the time zone of the sender.
     *                         For more detail, see: https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this Source.
     * 
     * @param timeZoneId   * Time zone Id is an optional field and should be provided as
     * one of the
     *                         AvailableZoneIds in the ZoneId class. It refers
     * to the time zone of the sender.
     *                         For more detail, see: https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
     */
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Source)) return false;
        Source other = (Source) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.timeZoneId==null && other.getTimeZoneId()==null) || 
             (this.timeZoneId!=null &&
              this.timeZoneId.equals(other.getTimeZoneId())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getTimeZoneId() != null) {
            _hashCode += getTimeZoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Source.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "postCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "timeZoneId"));
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
