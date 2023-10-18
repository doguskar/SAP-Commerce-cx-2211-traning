/**
 * BusinessHoursType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class BusinessHoursType  implements java.io.Serializable {
    private com.paazl.soap.generated.DayType day;

    private org.apache.axis.types.Time from;

    private org.apache.axis.types.Time until;

    public BusinessHoursType() {
    }

    public BusinessHoursType(
           com.paazl.soap.generated.DayType day,
           org.apache.axis.types.Time from,
           org.apache.axis.types.Time until) {
           this.day = day;
           this.from = from;
           this.until = until;
    }


    /**
     * Gets the day value for this BusinessHoursType.
     * 
     * @return day
     */
    public com.paazl.soap.generated.DayType getDay() {
        return day;
    }


    /**
     * Sets the day value for this BusinessHoursType.
     * 
     * @param day
     */
    public void setDay(com.paazl.soap.generated.DayType day) {
        this.day = day;
    }


    /**
     * Gets the from value for this BusinessHoursType.
     * 
     * @return from
     */
    public org.apache.axis.types.Time getFrom() {
        return from;
    }


    /**
     * Sets the from value for this BusinessHoursType.
     * 
     * @param from
     */
    public void setFrom(org.apache.axis.types.Time from) {
        this.from = from;
    }


    /**
     * Gets the until value for this BusinessHoursType.
     * 
     * @return until
     */
    public org.apache.axis.types.Time getUntil() {
        return until;
    }


    /**
     * Sets the until value for this BusinessHoursType.
     * 
     * @param until
     */
    public void setUntil(org.apache.axis.types.Time until) {
        this.until = until;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BusinessHoursType)) return false;
        BusinessHoursType other = (BusinessHoursType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.until==null && other.getUntil()==null) || 
             (this.until!=null &&
              this.until.equals(other.getUntil())));
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
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getUntil() != null) {
            _hashCode += getUntil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessHoursType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "businessHoursType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dayType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("until");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "until"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
