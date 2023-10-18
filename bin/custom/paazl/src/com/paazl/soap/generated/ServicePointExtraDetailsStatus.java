/**
 * ServicePointExtraDetailsStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ServicePointExtraDetailsStatus  implements java.io.Serializable {
    private Boolean available;

    private String code;

    private String value;

    private java.util.Date referenceDate;

    private java.util.Date referenceStartDate;

    private java.util.Date referenceEndDate;

    public ServicePointExtraDetailsStatus() {
    }

    public ServicePointExtraDetailsStatus(
           Boolean available,
           String code,
           String value,
           java.util.Date referenceDate,
           java.util.Date referenceStartDate,
           java.util.Date referenceEndDate) {
           this.available = available;
           this.code = code;
           this.value = value;
           this.referenceDate = referenceDate;
           this.referenceStartDate = referenceStartDate;
           this.referenceEndDate = referenceEndDate;
    }


    /**
     * Gets the available value for this ServicePointExtraDetailsStatus.
     * 
     * @return available
     */
    public Boolean getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this ServicePointExtraDetailsStatus.
     * 
     * @param available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }


    /**
     * Gets the code value for this ServicePointExtraDetailsStatus.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ServicePointExtraDetailsStatus.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the value value for this ServicePointExtraDetailsStatus.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ServicePointExtraDetailsStatus.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Gets the referenceDate value for this ServicePointExtraDetailsStatus.
     * 
     * @return referenceDate
     */
    public java.util.Date getReferenceDate() {
        return referenceDate;
    }


    /**
     * Sets the referenceDate value for this ServicePointExtraDetailsStatus.
     * 
     * @param referenceDate
     */
    public void setReferenceDate(java.util.Date referenceDate) {
        this.referenceDate = referenceDate;
    }


    /**
     * Gets the referenceStartDate value for this ServicePointExtraDetailsStatus.
     * 
     * @return referenceStartDate
     */
    public java.util.Date getReferenceStartDate() {
        return referenceStartDate;
    }


    /**
     * Sets the referenceStartDate value for this ServicePointExtraDetailsStatus.
     * 
     * @param referenceStartDate
     */
    public void setReferenceStartDate(java.util.Date referenceStartDate) {
        this.referenceStartDate = referenceStartDate;
    }


    /**
     * Gets the referenceEndDate value for this ServicePointExtraDetailsStatus.
     * 
     * @return referenceEndDate
     */
    public java.util.Date getReferenceEndDate() {
        return referenceEndDate;
    }


    /**
     * Sets the referenceEndDate value for this ServicePointExtraDetailsStatus.
     * 
     * @param referenceEndDate
     */
    public void setReferenceEndDate(java.util.Date referenceEndDate) {
        this.referenceEndDate = referenceEndDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServicePointExtraDetailsStatus)) return false;
        ServicePointExtraDetailsStatus other = (ServicePointExtraDetailsStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.available==null && other.getAvailable()==null) || 
             (this.available!=null &&
              this.available.equals(other.getAvailable()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.referenceDate==null && other.getReferenceDate()==null) || 
             (this.referenceDate!=null &&
              this.referenceDate.equals(other.getReferenceDate()))) &&
            ((this.referenceStartDate==null && other.getReferenceStartDate()==null) || 
             (this.referenceStartDate!=null &&
              this.referenceStartDate.equals(other.getReferenceStartDate()))) &&
            ((this.referenceEndDate==null && other.getReferenceEndDate()==null) || 
             (this.referenceEndDate!=null &&
              this.referenceEndDate.equals(other.getReferenceEndDate())));
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
        if (getAvailable() != null) {
            _hashCode += getAvailable().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getReferenceDate() != null) {
            _hashCode += getReferenceDate().hashCode();
        }
        if (getReferenceStartDate() != null) {
            _hashCode += getReferenceStartDate().hashCode();
        }
        if (getReferenceEndDate() != null) {
            _hashCode += getReferenceEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePointExtraDetailsStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointExtraDetailsStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "referenceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "referenceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "referenceEndDate"));
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
