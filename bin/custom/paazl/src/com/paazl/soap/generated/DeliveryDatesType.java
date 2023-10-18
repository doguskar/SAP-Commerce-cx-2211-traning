/**
 * DeliveryDatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DeliveryDatesType  implements java.io.Serializable {
    private java.util.Date[] deliveryDate;

    private com.paazl.soap.generated.DeliveryDateOptionType[] deliveryDateOption;

    public DeliveryDatesType() {
    }

    public DeliveryDatesType(
           java.util.Date[] deliveryDate,
           com.paazl.soap.generated.DeliveryDateOptionType[] deliveryDateOption) {
           this.deliveryDate = deliveryDate;
           this.deliveryDateOption = deliveryDateOption;
    }


    /**
     * Gets the deliveryDate value for this DeliveryDatesType.
     * 
     * @return deliveryDate
     */
    public java.util.Date[] getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this DeliveryDatesType.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Date[] deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public java.util.Date getDeliveryDate(int i) {
        return this.deliveryDate[i];
    }

    public void setDeliveryDate(int i, java.util.Date _value) {
        this.deliveryDate[i] = _value;
    }


    /**
     * Gets the deliveryDateOption value for this DeliveryDatesType.
     * 
     * @return deliveryDateOption
     */
    public com.paazl.soap.generated.DeliveryDateOptionType[] getDeliveryDateOption() {
        return deliveryDateOption;
    }


    /**
     * Sets the deliveryDateOption value for this DeliveryDatesType.
     * 
     * @param deliveryDateOption
     */
    public void setDeliveryDateOption(com.paazl.soap.generated.DeliveryDateOptionType[] deliveryDateOption) {
        this.deliveryDateOption = deliveryDateOption;
    }

    public com.paazl.soap.generated.DeliveryDateOptionType getDeliveryDateOption(int i) {
        return this.deliveryDateOption[i];
    }

    public void setDeliveryDateOption(int i, com.paazl.soap.generated.DeliveryDateOptionType _value) {
        this.deliveryDateOption[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliveryDatesType)) return false;
        DeliveryDatesType other = (DeliveryDatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              java.util.Arrays.equals(this.deliveryDate, other.getDeliveryDate()))) &&
            ((this.deliveryDateOption==null && other.getDeliveryDateOption()==null) || 
             (this.deliveryDateOption!=null &&
              java.util.Arrays.equals(this.deliveryDateOption, other.getDeliveryDateOption())));
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
        if (getDeliveryDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryDate());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryDateOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryDateOption());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryDateOption(), i);
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
        new org.apache.axis.description.TypeDesc(DeliveryDatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDateOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDateOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDateOptionType"));
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
