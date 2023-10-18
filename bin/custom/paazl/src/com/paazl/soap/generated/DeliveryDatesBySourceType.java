/**
 * DeliveryDatesBySourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DeliveryDatesBySourceType  implements java.io.Serializable {
    private com.paazl.soap.generated.Source source;

    private com.paazl.soap.generated.DeliveryDatesType deliveryDates;

    public DeliveryDatesBySourceType() {
    }

    public DeliveryDatesBySourceType(
           com.paazl.soap.generated.Source source,
           com.paazl.soap.generated.DeliveryDatesType deliveryDates) {
           this.source = source;
           this.deliveryDates = deliveryDates;
    }


    /**
     * Gets the source value for this DeliveryDatesBySourceType.
     * 
     * @return source
     */
    public com.paazl.soap.generated.Source getSource() {
        return source;
    }


    /**
     * Sets the source value for this DeliveryDatesBySourceType.
     * 
     * @param source
     */
    public void setSource(com.paazl.soap.generated.Source source) {
        this.source = source;
    }


    /**
     * Gets the deliveryDates value for this DeliveryDatesBySourceType.
     * 
     * @return deliveryDates
     */
    public com.paazl.soap.generated.DeliveryDatesType getDeliveryDates() {
        return deliveryDates;
    }


    /**
     * Sets the deliveryDates value for this DeliveryDatesBySourceType.
     * 
     * @param deliveryDates
     */
    public void setDeliveryDates(com.paazl.soap.generated.DeliveryDatesType deliveryDates) {
        this.deliveryDates = deliveryDates;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliveryDatesBySourceType)) return false;
        DeliveryDatesBySourceType other = (DeliveryDatesBySourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.deliveryDates==null && other.getDeliveryDates()==null) || 
             (this.deliveryDates!=null &&
              this.deliveryDates.equals(other.getDeliveryDates())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getDeliveryDates() != null) {
            _hashCode += getDeliveryDates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryDatesBySourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesBySourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesType"));
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
