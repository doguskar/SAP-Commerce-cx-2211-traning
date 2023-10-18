/**
 * OrderStatusContainerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrderStatusContainerType  implements java.io.Serializable {
    private com.paazl.soap.generated.OrderStatusType status;

    private com.paazl.soap.generated.OrderStatusContainerTypeShippingLabelsShippingLabel[] shippingLabels;

    public OrderStatusContainerType() {
    }

    public OrderStatusContainerType(
           com.paazl.soap.generated.OrderStatusType status,
           com.paazl.soap.generated.OrderStatusContainerTypeShippingLabelsShippingLabel[] shippingLabels) {
           this.status = status;
           this.shippingLabels = shippingLabels;
    }


    /**
     * Gets the status value for this OrderStatusContainerType.
     * 
     * @return status
     */
    public com.paazl.soap.generated.OrderStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderStatusContainerType.
     * 
     * @param status
     */
    public void setStatus(com.paazl.soap.generated.OrderStatusType status) {
        this.status = status;
    }


    /**
     * Gets the shippingLabels value for this OrderStatusContainerType.
     * 
     * @return shippingLabels
     */
    public com.paazl.soap.generated.OrderStatusContainerTypeShippingLabelsShippingLabel[] getShippingLabels() {
        return shippingLabels;
    }


    /**
     * Sets the shippingLabels value for this OrderStatusContainerType.
     * 
     * @param shippingLabels
     */
    public void setShippingLabels(com.paazl.soap.generated.OrderStatusContainerTypeShippingLabelsShippingLabel[] shippingLabels) {
        this.shippingLabels = shippingLabels;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrderStatusContainerType)) return false;
        OrderStatusContainerType other = (OrderStatusContainerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.shippingLabels==null && other.getShippingLabels()==null) || 
             (this.shippingLabels!=null &&
              java.util.Arrays.equals(this.shippingLabels, other.getShippingLabels())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getShippingLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingLabels());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingLabels(), i);
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
        new org.apache.axis.description.TypeDesc(OrderStatusContainerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusContainerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>orderStatusContainerType>shippingLabels>shippingLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingLabel"));
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
