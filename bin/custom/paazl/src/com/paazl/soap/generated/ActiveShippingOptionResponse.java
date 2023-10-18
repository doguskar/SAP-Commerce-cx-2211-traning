/**
 * ActiveShippingOptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ActiveShippingOptionResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private com.paazl.soap.generated.ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption[] activeShippingOptions;

    public ActiveShippingOptionResponse() {
    }

    public ActiveShippingOptionResponse(
           com.paazl.soap.generated.ErrorType error,
           com.paazl.soap.generated.ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption[] activeShippingOptions) {
           this.error = error;
           this.activeShippingOptions = activeShippingOptions;
    }


    /**
     * Gets the error value for this ActiveShippingOptionResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this ActiveShippingOptionResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the activeShippingOptions value for this ActiveShippingOptionResponse.
     * 
     * @return activeShippingOptions
     */
    public com.paazl.soap.generated.ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption[] getActiveShippingOptions() {
        return activeShippingOptions;
    }


    /**
     * Sets the activeShippingOptions value for this ActiveShippingOptionResponse.
     * 
     * @param activeShippingOptions
     */
    public void setActiveShippingOptions(com.paazl.soap.generated.ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption[] activeShippingOptions) {
        this.activeShippingOptions = activeShippingOptions;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ActiveShippingOptionResponse)) return false;
        ActiveShippingOptionResponse other = (ActiveShippingOptionResponse) obj;
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
            ((this.activeShippingOptions==null && other.getActiveShippingOptions()==null) || 
             (this.activeShippingOptions!=null &&
              java.util.Arrays.equals(this.activeShippingOptions, other.getActiveShippingOptions())));
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
        if (getActiveShippingOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActiveShippingOptions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getActiveShippingOptions(), i);
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
        new org.apache.axis.description.TypeDesc(ActiveShippingOptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">activeShippingOptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeShippingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "activeShippingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>activeShippingOptionResponse>activeShippingOptions>activeShippingOption"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "activeShippingOption"));
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
