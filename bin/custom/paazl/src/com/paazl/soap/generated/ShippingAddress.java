/**
 * ShippingAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ShippingAddress  implements java.io.Serializable {
    private String accountNumber;

    private String customerName;

    private String companyName;

    private String vatNumber;

    private String nameOther;

    private String street;

    private String housenumber;

    private String addition;

    private String[] additionalAddressLine;

    private String zipcode;

    private String city;

    private String province;

    private String country;

    private Boolean localAddressValidation;

    private String additionalInstruction;

    public ShippingAddress() {
    }

    public ShippingAddress(
           String accountNumber,
           String customerName,
           String companyName,
           String vatNumber,
           String nameOther,
           String street,
           String housenumber,
           String addition,
           String[] additionalAddressLine,
           String zipcode,
           String city,
           String province,
           String country,
           Boolean localAddressValidation,
           String additionalInstruction) {
           this.accountNumber = accountNumber;
           this.customerName = customerName;
           this.companyName = companyName;
           this.vatNumber = vatNumber;
           this.nameOther = nameOther;
           this.street = street;
           this.housenumber = housenumber;
           this.addition = addition;
           this.additionalAddressLine = additionalAddressLine;
           this.zipcode = zipcode;
           this.city = city;
           this.province = province;
           this.country = country;
           this.localAddressValidation = localAddressValidation;
           this.additionalInstruction = additionalInstruction;
    }


    /**
     * Gets the accountNumber value for this ShippingAddress.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this ShippingAddress.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the customerName value for this ShippingAddress.
     * 
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this ShippingAddress.
     * 
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the companyName value for this ShippingAddress.
     * 
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this ShippingAddress.
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the vatNumber value for this ShippingAddress.
     * 
     * @return vatNumber
     */
    public String getVatNumber() {
        return vatNumber;
    }


    /**
     * Sets the vatNumber value for this ShippingAddress.
     * 
     * @param vatNumber
     */
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }


    /**
     * Gets the nameOther value for this ShippingAddress.
     * 
     * @return nameOther
     */
    public String getNameOther() {
        return nameOther;
    }


    /**
     * Sets the nameOther value for this ShippingAddress.
     * 
     * @param nameOther
     */
    public void setNameOther(String nameOther) {
        this.nameOther = nameOther;
    }


    /**
     * Gets the street value for this ShippingAddress.
     * 
     * @return street
     */
    public String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this ShippingAddress.
     * 
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }


    /**
     * Gets the housenumber value for this ShippingAddress.
     * 
     * @return housenumber
     */
    public String getHousenumber() {
        return housenumber;
    }


    /**
     * Sets the housenumber value for this ShippingAddress.
     * 
     * @param housenumber
     */
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }


    /**
     * Gets the addition value for this ShippingAddress.
     * 
     * @return addition
     */
    public String getAddition() {
        return addition;
    }


    /**
     * Sets the addition value for this ShippingAddress.
     * 
     * @param addition
     */
    public void setAddition(String addition) {
        this.addition = addition;
    }


    /**
     * Gets the additionalAddressLine value for this ShippingAddress.
     * 
     * @return additionalAddressLine
     */
    public String[] getAdditionalAddressLine() {
        return additionalAddressLine;
    }


    /**
     * Sets the additionalAddressLine value for this ShippingAddress.
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


    /**
     * Gets the zipcode value for this ShippingAddress.
     * 
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this ShippingAddress.
     * 
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the city value for this ShippingAddress.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ShippingAddress.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the province value for this ShippingAddress.
     * 
     * @return province
     */
    public String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this ShippingAddress.
     * 
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }


    /**
     * Gets the country value for this ShippingAddress.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ShippingAddress.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the localAddressValidation value for this ShippingAddress.
     * 
     * @return localAddressValidation
     */
    public Boolean getLocalAddressValidation() {
        return localAddressValidation;
    }


    /**
     * Sets the localAddressValidation value for this ShippingAddress.
     * 
     * @param localAddressValidation
     */
    public void setLocalAddressValidation(Boolean localAddressValidation) {
        this.localAddressValidation = localAddressValidation;
    }


    /**
     * Gets the additionalInstruction value for this ShippingAddress.
     * 
     * @return additionalInstruction
     */
    public String getAdditionalInstruction() {
        return additionalInstruction;
    }


    /**
     * Sets the additionalInstruction value for this ShippingAddress.
     * 
     * @param additionalInstruction
     */
    public void setAdditionalInstruction(String additionalInstruction) {
        this.additionalInstruction = additionalInstruction;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingAddress)) return false;
        ShippingAddress other = (ShippingAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.vatNumber==null && other.getVatNumber()==null) || 
             (this.vatNumber!=null &&
              this.vatNumber.equals(other.getVatNumber()))) &&
            ((this.nameOther==null && other.getNameOther()==null) || 
             (this.nameOther!=null &&
              this.nameOther.equals(other.getNameOther()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.housenumber==null && other.getHousenumber()==null) || 
             (this.housenumber!=null &&
              this.housenumber.equals(other.getHousenumber()))) &&
            ((this.addition==null && other.getAddition()==null) || 
             (this.addition!=null &&
              this.addition.equals(other.getAddition()))) &&
            ((this.additionalAddressLine==null && other.getAdditionalAddressLine()==null) || 
             (this.additionalAddressLine!=null &&
              java.util.Arrays.equals(this.additionalAddressLine, other.getAdditionalAddressLine()))) &&
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
            ((this.localAddressValidation==null && other.getLocalAddressValidation()==null) || 
             (this.localAddressValidation!=null &&
              this.localAddressValidation.equals(other.getLocalAddressValidation()))) &&
            ((this.additionalInstruction==null && other.getAdditionalInstruction()==null) || 
             (this.additionalInstruction!=null &&
              this.additionalInstruction.equals(other.getAdditionalInstruction())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getVatNumber() != null) {
            _hashCode += getVatNumber().hashCode();
        }
        if (getNameOther() != null) {
            _hashCode += getNameOther().hashCode();
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
        if (getLocalAddressValidation() != null) {
            _hashCode += getLocalAddressValidation().hashCode();
        }
        if (getAdditionalInstruction() != null) {
            _hashCode += getAdditionalInstruction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("nameOther");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nameOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("additionalAddressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalAddressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("localAddressValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "localAddressValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
