/**
 * PickupRequestOptionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class PickupRequestOptionsResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private com.paazl.soap.generated.PickupRequestOptionType[] pickupRequestOption;

    public PickupRequestOptionsResponse() {
    }

    public PickupRequestOptionsResponse(
           com.paazl.soap.generated.ErrorType error,
           com.paazl.soap.generated.PickupRequestOptionType[] pickupRequestOption) {
           this.error = error;
           this.pickupRequestOption = pickupRequestOption;
    }


    /**
     * Gets the error value for this PickupRequestOptionsResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this PickupRequestOptionsResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the pickupRequestOption value for this PickupRequestOptionsResponse.
     * 
     * @return pickupRequestOption
     */
    public com.paazl.soap.generated.PickupRequestOptionType[] getPickupRequestOption() {
        return pickupRequestOption;
    }


    /**
     * Sets the pickupRequestOption value for this PickupRequestOptionsResponse.
     * 
     * @param pickupRequestOption
     */
    public void setPickupRequestOption(com.paazl.soap.generated.PickupRequestOptionType[] pickupRequestOption) {
        this.pickupRequestOption = pickupRequestOption;
    }

    public com.paazl.soap.generated.PickupRequestOptionType getPickupRequestOption(int i) {
        return this.pickupRequestOption[i];
    }

    public void setPickupRequestOption(int i, com.paazl.soap.generated.PickupRequestOptionType _value) {
        this.pickupRequestOption[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PickupRequestOptionsResponse)) return false;
        PickupRequestOptionsResponse other = (PickupRequestOptionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.pickupRequestOption==null && other.getPickupRequestOption()==null) || 
             (this.pickupRequestOption!=null &&
              java.util.Arrays.equals(this.pickupRequestOption, other.getPickupRequestOption())));
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getPickupRequestOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickupRequestOption());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPickupRequestOption(), i);
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
        new org.apache.axis.description.TypeDesc(PickupRequestOptionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestOptionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupRequestOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestOptionType"));
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
