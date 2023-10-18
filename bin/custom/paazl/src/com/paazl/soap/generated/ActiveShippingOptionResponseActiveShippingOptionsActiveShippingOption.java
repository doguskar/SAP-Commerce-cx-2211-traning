/**
 * ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption  implements java.io.Serializable {
    private String type;

    private String description;

    private String distributor;

    private String distributorDescription;

    private String[] countries;

    public ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption() {
    }

    public ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption(
           String type,
           String description,
           String distributor,
           String distributorDescription,
           String[] countries) {
           this.type = type;
           this.description = description;
           this.distributor = distributor;
           this.distributorDescription = distributorDescription;
           this.countries = countries;
    }


    /**
     * Gets the type value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the description value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the distributor value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the distributorDescription value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @return distributorDescription
     */
    public String getDistributorDescription() {
        return distributorDescription;
    }


    /**
     * Sets the distributorDescription value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @param distributorDescription
     */
    public void setDistributorDescription(String distributorDescription) {
        this.distributorDescription = distributorDescription;
    }


    /**
     * Gets the countries value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @return countries
     */
    public String[] getCountries() {
        return countries;
    }


    /**
     * Sets the countries value for this ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.
     * 
     * @param countries
     */
    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption)) return false;
        ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption other = (ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.distributorDescription==null && other.getDistributorDescription()==null) || 
             (this.distributorDescription!=null &&
              this.distributorDescription.equals(other.getDistributorDescription()))) &&
            ((this.countries==null && other.getCountries()==null) || 
             (this.countries!=null &&
              java.util.Arrays.equals(this.countries, other.getCountries())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getDistributorDescription() != null) {
            _hashCode += getDistributorDescription().hashCode();
        }
        if (getCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountries());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCountries(), i);
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
        new org.apache.axis.description.TypeDesc(ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>activeShippingOptionResponse>activeShippingOptions>activeShippingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distributorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "country"));
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
