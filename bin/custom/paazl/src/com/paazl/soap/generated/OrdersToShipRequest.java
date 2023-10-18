/**
 * OrdersToShipRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrdersToShipRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private java.util.Date date;

    public OrdersToShipRequest() {
    }

    public OrdersToShipRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           java.util.Date date) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.date = date;
    }


    /**
     * Gets the hash value for this OrdersToShipRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this OrdersToShipRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this OrdersToShipRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this OrdersToShipRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the date value for this OrdersToShipRequest.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this OrdersToShipRequest.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrdersToShipRequest)) return false;
        OrdersToShipRequest other = (OrdersToShipRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hash==null && other.getHash()==null) || 
             (this.hash!=null &&
              this.hash.equals(other.getHash()))) &&
            ((this.targetWebshop==null && other.getTargetWebshop()==null) || 
             (this.targetWebshop!=null &&
              this.targetWebshop.equals(other.getTargetWebshop()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getHash() != null) {
            _hashCode += getHash().hashCode();
        }
        if (getTargetWebshop() != null) {
            _hashCode += getTargetWebshop().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrdersToShipRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersToShipRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWebshop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "targetWebshop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
