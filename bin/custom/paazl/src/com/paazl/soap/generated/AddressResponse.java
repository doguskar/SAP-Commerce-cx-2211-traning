/**
 * AddressResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class AddressResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private com.paazl.soap.generated.AddressResponseAddress address;

    public AddressResponse() {
    }

    public AddressResponse(
           com.paazl.soap.generated.ErrorType error,
           com.paazl.soap.generated.AddressResponseAddress address) {
           this.error = error;
           this.address = address;
    }


    /**
     * Gets the error value for this AddressResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this AddressResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the address value for this AddressResponse.
     * 
     * @return address
     */
    public com.paazl.soap.generated.AddressResponseAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AddressResponse.
     * 
     * @param address
     */
    public void setAddress(com.paazl.soap.generated.AddressResponseAddress address) {
        this.address = address;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddressResponse)) return false;
        AddressResponse other = (AddressResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addressResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>addressResponse>address"));
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
