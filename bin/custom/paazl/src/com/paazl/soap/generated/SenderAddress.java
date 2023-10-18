/**
 * SenderAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class SenderAddress  implements java.io.Serializable {
    private String addresseeLine;

    private String street;

    private String housenumber;

    private String addition;

    private String zipcode;

    private String city;

    private String province;

    private String country;

    private String[] additionalAddressLine;

    public SenderAddress() {
    }

    public SenderAddress(
           String addresseeLine,
           String street,
           String housenumber,
           String addition,
           String zipcode,
           String city,
           String province,
           String country,
           String[] additionalAddressLine) {
           this.addresseeLine = addresseeLine;
           this.street = street;
           this.housenumber = housenumber;
           this.addition = addition;
           this.zipcode = zipcode;
           this.city = city;
           this.province = province;
           this.country = country;
           this.additionalAddressLine = additionalAddressLine;
    }


    /**
     * Gets the addresseeLine value for this SenderAddress.
     * 
     * @return addresseeLine
     */
    public String getAddresseeLine() {
        return addresseeLine;
    }


    /**
     * Sets the addresseeLine value for this SenderAddress.
     * 
     * @param addresseeLine
     */
    public void setAddresseeLine(String addresseeLine) {
        this.addresseeLine = addresseeLine;
    }


    /**
     * Gets the street value for this SenderAddress.
     * 
     * @return street
     */
    public String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this SenderAddress.
     * 
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }


    /**
     * Gets the housenumber value for this SenderAddress.
     * 
     * @return housenumber
     */
    public String getHousenumber() {
        return housenumber;
    }


    /**
     * Sets the housenumber value for this SenderAddress.
     * 
     * @param housenumber
     */
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }


    /**
     * Gets the addition value for this SenderAddress.
     * 
     * @return addition
     */
    public String getAddition() {
        return addition;
    }


    /**
     * Sets the addition value for this SenderAddress.
     * 
     * @param addition
     */
    public void setAddition(String addition) {
        this.addition = addition;
    }


    /**
     * Gets the zipcode value for this SenderAddress.
     * 
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this SenderAddress.
     * 
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the city value for this SenderAddress.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this SenderAddress.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the province value for this SenderAddress.
     * 
     * @return province
     */
    public String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this SenderAddress.
     * 
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }


    /**
     * Gets the country value for this SenderAddress.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this SenderAddress.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the additionalAddressLine value for this SenderAddress.
     * 
     * @return additionalAddressLine
     */
    public String[] getAdditionalAddressLine() {
        return additionalAddressLine;
    }


    /**
     * Sets the additionalAddressLine value for this SenderAddress.
     * 
     * @param additionalAddressLine
     */
    public void setAdditionalAddressLine(String[] additionalAddressLine) {
        this.additionalAddressLine = additionalAddressLine;
    }

    public String getAdditionalAddressLine(int i) {
        return this.additionalAddressLine[i];
    }

    public void setAdditionalAddressLine(int i, String _value) {
        this.additionalAddressLine[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SenderAddress)) return false;
        SenderAddress other = (SenderAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addresseeLine==null && other.getAddresseeLine()==null) || 
             (this.addresseeLine!=null &&
              this.addresseeLine.equals(other.getAddresseeLine()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.housenumber==null && other.getHousenumber()==null) || 
             (this.housenumber!=null &&
              this.housenumber.equals(other.getHousenumber()))) &&
            ((this.addition==null && other.getAddition()==null) || 
             (this.addition!=null &&
              this.addition.equals(other.getAddition()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.additionalAddressLine==null && other.getAdditionalAddressLine()==null) || 
             (this.additionalAddressLine!=null &&
              java.util.Arrays.equals(this.additionalAddressLine, other.getAdditionalAddressLine())));
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
        if (getAddresseeLine() != null) {
            _hashCode += getAddresseeLine().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHousenumber() != null) {
            _hashCode += getHousenumber().hashCode();
        }
        if (getAddition() != null) {
            _hashCode += getAddition().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getAdditionalAddressLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalAddressLine());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalAddressLine(), i);
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
        new org.apache.axis.description.TypeDesc(SenderAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresseeLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addresseeLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("housenumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "housenumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "zipcode"));
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
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("additionalAddressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalAddressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
