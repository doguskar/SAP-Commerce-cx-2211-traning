/**
 * StringRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class StringRangeType  implements java.io.Serializable {
    private String lowerBound;

    private String upperBound;

    public StringRangeType() {
    }

    public StringRangeType(
           String lowerBound,
           String upperBound) {
           this.lowerBound = lowerBound;
           this.upperBound = upperBound;
    }


    /**
     * Gets the lowerBound value for this StringRangeType.
     * 
     * @return lowerBound
     */
    public String getLowerBound() {
        return lowerBound;
    }


    /**
     * Sets the lowerBound value for this StringRangeType.
     * 
     * @param lowerBound
     */
    public void setLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
    }


    /**
     * Gets the upperBound value for this StringRangeType.
     * 
     * @return upperBound
     */
    public String getUpperBound() {
        return upperBound;
    }


    /**
     * Sets the upperBound value for this StringRangeType.
     * 
     * @param upperBound
     */
    public void setUpperBound(String upperBound) {
        this.upperBound = upperBound;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StringRangeType)) return false;
        StringRangeType other = (StringRangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lowerBound==null && other.getLowerBound()==null) || 
             (this.lowerBound!=null &&
              this.lowerBound.equals(other.getLowerBound()))) &&
            ((this.upperBound==null && other.getUpperBound()==null) || 
             (this.upperBound!=null &&
              this.upperBound.equals(other.getUpperBound())));
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
        if (getLowerBound() != null) {
            _hashCode += getLowerBound().hashCode();
        }
        if (getUpperBound() != null) {
            _hashCode += getUpperBound().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StringRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "stringRangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowerBound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "lowerBound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperBound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "upperBound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
