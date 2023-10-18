/**
 * CarrierStatusHistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class CarrierStatusHistoryType  implements java.io.Serializable {
    private com.paazl.soap.generated.CarrierStatusType current;

    private com.paazl.soap.generated.CarrierStatusType[] history;

    public CarrierStatusHistoryType() {
    }

    public CarrierStatusHistoryType(
           com.paazl.soap.generated.CarrierStatusType current,
           com.paazl.soap.generated.CarrierStatusType[] history) {
           this.current = current;
           this.history = history;
    }


    /**
     * Gets the current value for this CarrierStatusHistoryType.
     * 
     * @return current
     */
    public com.paazl.soap.generated.CarrierStatusType getCurrent() {
        return current;
    }


    /**
     * Sets the current value for this CarrierStatusHistoryType.
     * 
     * @param current
     */
    public void setCurrent(com.paazl.soap.generated.CarrierStatusType current) {
        this.current = current;
    }


    /**
     * Gets the history value for this CarrierStatusHistoryType.
     * 
     * @return history
     */
    public com.paazl.soap.generated.CarrierStatusType[] getHistory() {
        return history;
    }


    /**
     * Sets the history value for this CarrierStatusHistoryType.
     * 
     * @param history
     */
    public void setHistory(com.paazl.soap.generated.CarrierStatusType[] history) {
        this.history = history;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CarrierStatusHistoryType)) return false;
        CarrierStatusHistoryType other = (CarrierStatusHistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.current==null && other.getCurrent()==null) || 
             (this.current!=null &&
              this.current.equals(other.getCurrent()))) &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              java.util.Arrays.equals(this.history, other.getHistory())));
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
        if (getCurrent() != null) {
            _hashCode += getCurrent().hashCode();
        }
        if (getHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistory());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getHistory(), i);
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
        new org.apache.axis.description.TypeDesc(CarrierStatusHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatusHistoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "status"));
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
