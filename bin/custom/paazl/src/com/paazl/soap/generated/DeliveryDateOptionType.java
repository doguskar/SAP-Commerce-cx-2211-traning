/**
 * DeliveryDateOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DeliveryDateOptionType  implements java.io.Serializable {
    private java.util.Calendar pickupDate;

    private java.util.Date deliveryDate;

    private com.paazl.soap.generated.TimeRangeType deliveryTimeRange;

    public DeliveryDateOptionType() {
    }

    public DeliveryDateOptionType(
           java.util.Calendar pickupDate,
           java.util.Date deliveryDate,
           com.paazl.soap.generated.TimeRangeType deliveryTimeRange) {
           this.pickupDate = pickupDate;
           this.deliveryDate = deliveryDate;
           this.deliveryTimeRange = deliveryTimeRange;
    }


    /**
     * Gets the pickupDate value for this DeliveryDateOptionType.
     * 
     * @return pickupDate
     */
    public java.util.Calendar getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this DeliveryDateOptionType.
     * 
     * @param pickupDate
     */
    public void setPickupDate(java.util.Calendar pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the deliveryDate value for this DeliveryDateOptionType.
     * 
     * @return deliveryDate
     */
    public java.util.Date getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this DeliveryDateOptionType.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the deliveryTimeRange value for this DeliveryDateOptionType.
     * 
     * @return deliveryTimeRange
     */
    public com.paazl.soap.generated.TimeRangeType getDeliveryTimeRange() {
        return deliveryTimeRange;
    }


    /**
     * Sets the deliveryTimeRange value for this DeliveryDateOptionType.
     * 
     * @param deliveryTimeRange
     */
    public void setDeliveryTimeRange(com.paazl.soap.generated.TimeRangeType deliveryTimeRange) {
        this.deliveryTimeRange = deliveryTimeRange;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliveryDateOptionType)) return false;
        DeliveryDateOptionType other = (DeliveryDateOptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.deliveryTimeRange==null && other.getDeliveryTimeRange()==null) || 
             (this.deliveryTimeRange!=null &&
              this.deliveryTimeRange.equals(other.getDeliveryTimeRange())));
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
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getDeliveryTimeRange() != null) {
            _hashCode += getDeliveryTimeRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryDateOptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDateOptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryTimeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryTimeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "timeRangeType"));
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
