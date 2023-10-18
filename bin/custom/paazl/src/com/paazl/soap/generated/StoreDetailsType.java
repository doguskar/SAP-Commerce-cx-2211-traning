/**
 * StoreDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class StoreDetailsType  implements java.io.Serializable {
    private String code;

    private String name;

    private com.paazl.soap.generated.AddressType address;

    private com.paazl.soap.generated.CoordinatesType coordinates;

    private com.paazl.soap.generated.BusinessHoursType[] businessHours;

    public StoreDetailsType() {
    }

    public StoreDetailsType(
           String code,
           String name,
           com.paazl.soap.generated.AddressType address,
           com.paazl.soap.generated.CoordinatesType coordinates,
           com.paazl.soap.generated.BusinessHoursType[] businessHours) {
           this.code = code;
           this.name = name;
           this.address = address;
           this.coordinates = coordinates;
           this.businessHours = businessHours;
    }


    /**
     * Gets the code value for this StoreDetailsType.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this StoreDetailsType.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the name value for this StoreDetailsType.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this StoreDetailsType.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the address value for this StoreDetailsType.
     * 
     * @return address
     */
    public com.paazl.soap.generated.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this StoreDetailsType.
     * 
     * @param address
     */
    public void setAddress(com.paazl.soap.generated.AddressType address) {
        this.address = address;
    }


    /**
     * Gets the coordinates value for this StoreDetailsType.
     * 
     * @return coordinates
     */
    public com.paazl.soap.generated.CoordinatesType getCoordinates() {
        return coordinates;
    }


    /**
     * Sets the coordinates value for this StoreDetailsType.
     * 
     * @param coordinates
     */
    public void setCoordinates(com.paazl.soap.generated.CoordinatesType coordinates) {
        this.coordinates = coordinates;
    }


    /**
     * Gets the businessHours value for this StoreDetailsType.
     * 
     * @return businessHours
     */
    public com.paazl.soap.generated.BusinessHoursType[] getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this StoreDetailsType.
     * 
     * @param businessHours
     */
    public void setBusinessHours(com.paazl.soap.generated.BusinessHoursType[] businessHours) {
        this.businessHours = businessHours;
    }

    public com.paazl.soap.generated.BusinessHoursType getBusinessHours(int i) {
        return this.businessHours[i];
    }

    public void setBusinessHours(int i, com.paazl.soap.generated.BusinessHoursType _value) {
        this.businessHours[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StoreDetailsType)) return false;
        StoreDetailsType other = (StoreDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.coordinates==null && other.getCoordinates()==null) || 
             (this.coordinates!=null &&
              this.coordinates.equals(other.getCoordinates()))) &&
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              java.util.Arrays.equals(this.businessHours, other.getBusinessHours())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCoordinates() != null) {
            _hashCode += getCoordinates().hashCode();
        }
        if (getBusinessHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessHours());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBusinessHours(), i);
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
        new org.apache.axis.description.TypeDesc(StoreDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "storeDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "coordinatesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "businessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "businessHoursType"));
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
