/**
 * ShippingOptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ShippingOptionResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private String deliveryMatrix;

    private com.paazl.soap.generated.ShippingOptionResponseShippingOptionsShippingOption[] shippingOptions;

    public ShippingOptionResponse() {
    }

    public ShippingOptionResponse(
           com.paazl.soap.generated.ErrorType error,
           String deliveryMatrix,
           com.paazl.soap.generated.ShippingOptionResponseShippingOptionsShippingOption[] shippingOptions) {
           this.error = error;
           this.deliveryMatrix = deliveryMatrix;
           this.shippingOptions = shippingOptions;
    }


    /**
     * Gets the error value for this ShippingOptionResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this ShippingOptionResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the deliveryMatrix value for this ShippingOptionResponse.
     * 
     * @return deliveryMatrix
     */
    public String getDeliveryMatrix() {
        return deliveryMatrix;
    }


    /**
     * Sets the deliveryMatrix value for this ShippingOptionResponse.
     * 
     * @param deliveryMatrix
     */
    public void setDeliveryMatrix(String deliveryMatrix) {
        this.deliveryMatrix = deliveryMatrix;
    }


    /**
     * Gets the shippingOptions value for this ShippingOptionResponse.
     * 
     * @return shippingOptions
     */
    public com.paazl.soap.generated.ShippingOptionResponseShippingOptionsShippingOption[] getShippingOptions() {
        return shippingOptions;
    }


    /**
     * Sets the shippingOptions value for this ShippingOptionResponse.
     * 
     * @param shippingOptions
     */
    public void setShippingOptions(com.paazl.soap.generated.ShippingOptionResponseShippingOptionsShippingOption[] shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingOptionResponse)) return false;
        ShippingOptionResponse other = (ShippingOptionResponse) obj;
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
            ((this.deliveryMatrix==null && other.getDeliveryMatrix()==null) || 
             (this.deliveryMatrix!=null &&
              this.deliveryMatrix.equals(other.getDeliveryMatrix()))) &&
            ((this.shippingOptions==null && other.getShippingOptions()==null) || 
             (this.shippingOptions!=null &&
              java.util.Arrays.equals(this.shippingOptions, other.getShippingOptions())));
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
        if (getDeliveryMatrix() != null) {
            _hashCode += getDeliveryMatrix().hashCode();
        }
        if (getShippingOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingOptions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingOptions(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingOptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingOptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryMatrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>shippingOptionResponse>shippingOptions>shippingOption"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption"));
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
