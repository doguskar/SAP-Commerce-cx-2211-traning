/**
 * CancelShipmentsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class CancelShipmentsRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private com.paazl.soap.generated.ExistingLabelType[] label;

    public CancelShipmentsRequest() {
    }

    public CancelShipmentsRequest(
           long webshop,
           com.paazl.soap.generated.ExistingLabelType[] label) {
        super(
            webshop);
        this.label = label;
    }


    /**
     * Gets the label value for this CancelShipmentsRequest.
     * 
     * @return label
     */
    public com.paazl.soap.generated.ExistingLabelType[] getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CancelShipmentsRequest.
     * 
     * @param label
     */
    public void setLabel(com.paazl.soap.generated.ExistingLabelType[] label) {
        this.label = label;
    }

    public com.paazl.soap.generated.ExistingLabelType getLabel(int i) {
        return this.label[i];
    }

    public void setLabel(int i, com.paazl.soap.generated.ExistingLabelType _value) {
        this.label[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CancelShipmentsRequest)) return false;
        CancelShipmentsRequest other = (CancelShipmentsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              java.util.Arrays.equals(this.label, other.getLabel())));
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
        if (getLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLabel(), i);
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
        new org.apache.axis.description.TypeDesc(CancelShipmentsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">cancelShipmentsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "existingLabelType"));
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
