/**
 * ListOrdersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ListOrdersResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private com.paazl.soap.generated.OrdersType orders;

    public ListOrdersResponse() {
    }

    public ListOrdersResponse(
           com.paazl.soap.generated.ErrorType error,
           com.paazl.soap.generated.OrdersType orders) {
           this.error = error;
           this.orders = orders;
    }


    /**
     * Gets the error value for this ListOrdersResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this ListOrdersResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the orders value for this ListOrdersResponse.
     * 
     * @return orders
     */
    public com.paazl.soap.generated.OrdersType getOrders() {
        return orders;
    }


    /**
     * Sets the orders value for this ListOrdersResponse.
     * 
     * @param orders
     */
    public void setOrders(com.paazl.soap.generated.OrdersType orders) {
        this.orders = orders;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ListOrdersResponse)) return false;
        ListOrdersResponse other = (ListOrdersResponse) obj;
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
            ((this.orders==null && other.getOrders()==null) || 
             (this.orders!=null &&
              this.orders.equals(other.getOrders())));
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
        if (getOrders() != null) {
            _hashCode += getOrders().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListOrdersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOrdersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "ordersType"));
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
