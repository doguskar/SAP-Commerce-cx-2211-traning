/**
 * ReturnLabelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ReturnLabelType  extends com.paazl.soap.generated.LabelType  implements java.io.Serializable {
    private String returnOrderReference;  // attribute

    public ReturnLabelType() {
    }

    // Simple Types must have a String constructor
    public ReturnLabelType(byte[] _value) {
        super(_value);
    }


    /**
     * Gets the returnOrderReference value for this ReturnLabelType.
     * 
     * @return returnOrderReference
     */
    public String getReturnOrderReference() {
        return returnOrderReference;
    }


    /**
     * Sets the returnOrderReference value for this ReturnLabelType.
     * 
     * @param returnOrderReference
     */
    public void setReturnOrderReference(String returnOrderReference) {
        this.returnOrderReference = returnOrderReference;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReturnLabelType)) return false;
        ReturnLabelType other = (ReturnLabelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.returnOrderReference==null && other.getReturnOrderReference()==null) || 
             (this.returnOrderReference!=null &&
              this.returnOrderReference.equals(other.getReturnOrderReference())));
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
        if (getReturnOrderReference() != null) {
            _hashCode += getReturnOrderReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnLabelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnLabelType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnOrderReference");
        attrField.setXmlName(new javax.xml.namespace.QName("", "returnOrderReference"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
