/**
 * ChangeStoresRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ChangeStoresRequestType  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private Long targetWebshop;

    private com.paazl.soap.generated.ChangeStoreDetailsType[] store;

    public ChangeStoresRequestType() {
    }

    public ChangeStoresRequestType(
           long webshop,
           Long targetWebshop,
           com.paazl.soap.generated.ChangeStoreDetailsType[] store) {
        super(
            webshop);
        this.targetWebshop = targetWebshop;
        this.store = store;
    }


    /**
     * Gets the targetWebshop value for this ChangeStoresRequestType.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this ChangeStoresRequestType.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the store value for this ChangeStoresRequestType.
     * 
     * @return store
     */
    public com.paazl.soap.generated.ChangeStoreDetailsType[] getStore() {
        return store;
    }


    /**
     * Sets the store value for this ChangeStoresRequestType.
     * 
     * @param store
     */
    public void setStore(com.paazl.soap.generated.ChangeStoreDetailsType[] store) {
        this.store = store;
    }

    public com.paazl.soap.generated.ChangeStoreDetailsType getStore(int i) {
        return this.store[i];
    }

    public void setStore(int i, com.paazl.soap.generated.ChangeStoreDetailsType _value) {
        this.store[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangeStoresRequestType)) return false;
        ChangeStoresRequestType other = (ChangeStoresRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetWebshop==null && other.getTargetWebshop()==null) || 
             (this.targetWebshop!=null &&
              this.targetWebshop.equals(other.getTargetWebshop()))) &&
            ((this.store==null && other.getStore()==null) || 
             (this.store!=null &&
              java.util.Arrays.equals(this.store, other.getStore())));
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
        if (getTargetWebshop() != null) {
            _hashCode += getTargetWebshop().hashCode();
        }
        if (getStore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStore());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStore(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeStoresRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoresRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWebshop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "targetWebshop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "store"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoreDetailsType"));
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
