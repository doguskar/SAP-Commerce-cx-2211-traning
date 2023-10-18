/**
 * ServicePointsTypeServicePointOpeningTimesTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ServicePointsTypeServicePointOpeningTimesTime  implements java.io.Serializable {
    private com.paazl.soap.generated.DayType day;

    private Boolean alwaysOpen;

    private String openFromAfternoon;

    private String openFromMorning;

    private String openTillAfternoon;

    private String openTillMorning;

    public ServicePointsTypeServicePointOpeningTimesTime() {
    }

    public ServicePointsTypeServicePointOpeningTimesTime(
           com.paazl.soap.generated.DayType day,
           Boolean alwaysOpen,
           String openFromAfternoon,
           String openFromMorning,
           String openTillAfternoon,
           String openTillMorning) {
           this.day = day;
           this.alwaysOpen = alwaysOpen;
           this.openFromAfternoon = openFromAfternoon;
           this.openFromMorning = openFromMorning;
           this.openTillAfternoon = openTillAfternoon;
           this.openTillMorning = openTillMorning;
    }


    /**
     * Gets the day value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @return day
     */
    public com.paazl.soap.generated.DayType getDay() {
        return day;
    }


    /**
     * Sets the day value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @param day
     */
    public void setDay(com.paazl.soap.generated.DayType day) {
        this.day = day;
    }


    /**
     * Gets the alwaysOpen value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @return alwaysOpen
     */
    public Boolean getAlwaysOpen() {
        return alwaysOpen;
    }


    /**
     * Sets the alwaysOpen value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @param alwaysOpen
     */
    public void setAlwaysOpen(Boolean alwaysOpen) {
        this.alwaysOpen = alwaysOpen;
    }


    /**
     * Gets the openFromAfternoon value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @return openFromAfternoon
     */
    public String getOpenFromAfternoon() {
        return openFromAfternoon;
    }


    /**
     * Sets the openFromAfternoon value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @param openFromAfternoon
     */
    public void setOpenFromAfternoon(String openFromAfternoon) {
        this.openFromAfternoon = openFromAfternoon;
    }


    /**
     * Gets the openFromMorning value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @return openFromMorning
     */
    public String getOpenFromMorning() {
        return openFromMorning;
    }


    /**
     * Sets the openFromMorning value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @param openFromMorning
     */
    public void setOpenFromMorning(String openFromMorning) {
        this.openFromMorning = openFromMorning;
    }


    /**
     * Gets the openTillAfternoon value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @return openTillAfternoon
     */
    public String getOpenTillAfternoon() {
        return openTillAfternoon;
    }


    /**
     * Sets the openTillAfternoon value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @param openTillAfternoon
     */
    public void setOpenTillAfternoon(String openTillAfternoon) {
        this.openTillAfternoon = openTillAfternoon;
    }


    /**
     * Gets the openTillMorning value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @return openTillMorning
     */
    public String getOpenTillMorning() {
        return openTillMorning;
    }


    /**
     * Sets the openTillMorning value for this ServicePointsTypeServicePointOpeningTimesTime.
     * 
     * @param openTillMorning
     */
    public void setOpenTillMorning(String openTillMorning) {
        this.openTillMorning = openTillMorning;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServicePointsTypeServicePointOpeningTimesTime)) return false;
        ServicePointsTypeServicePointOpeningTimesTime other = (ServicePointsTypeServicePointOpeningTimesTime) obj;
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
            ((this.alwaysOpen==null && other.getAlwaysOpen()==null) || 
             (this.alwaysOpen!=null &&
              this.alwaysOpen.equals(other.getAlwaysOpen()))) &&
            ((this.openFromAfternoon==null && other.getOpenFromAfternoon()==null) || 
             (this.openFromAfternoon!=null &&
              this.openFromAfternoon.equals(other.getOpenFromAfternoon()))) &&
            ((this.openFromMorning==null && other.getOpenFromMorning()==null) || 
             (this.openFromMorning!=null &&
              this.openFromMorning.equals(other.getOpenFromMorning()))) &&
            ((this.openTillAfternoon==null && other.getOpenTillAfternoon()==null) || 
             (this.openTillAfternoon!=null &&
              this.openTillAfternoon.equals(other.getOpenTillAfternoon()))) &&
            ((this.openTillMorning==null && other.getOpenTillMorning()==null) || 
             (this.openTillMorning!=null &&
              this.openTillMorning.equals(other.getOpenTillMorning())));
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
        if (getAlwaysOpen() != null) {
            _hashCode += getAlwaysOpen().hashCode();
        }
        if (getOpenFromAfternoon() != null) {
            _hashCode += getOpenFromAfternoon().hashCode();
        }
        if (getOpenFromMorning() != null) {
            _hashCode += getOpenFromMorning().hashCode();
        }
        if (getOpenTillAfternoon() != null) {
            _hashCode += getOpenTillAfternoon().hashCode();
        }
        if (getOpenTillMorning() != null) {
            _hashCode += getOpenTillMorning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePointsTypeServicePointOpeningTimesTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>servicePointsType>servicePoint>openingTimes>time"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dayType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alwaysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "alwaysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openFromAfternoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openFromAfternoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openFromMorning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openFromMorning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTillAfternoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openTillAfternoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTillMorning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openTillMorning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
