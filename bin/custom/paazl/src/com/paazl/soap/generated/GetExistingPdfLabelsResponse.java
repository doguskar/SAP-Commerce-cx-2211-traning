/**
 * GetExistingPdfLabelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class GetExistingPdfLabelsResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private byte[] labels;

    private com.paazl.soap.generated.LabelMetaDataType[] metaData;

    public GetExistingPdfLabelsResponse() {
    }

    public GetExistingPdfLabelsResponse(
           com.paazl.soap.generated.ErrorType error,
           byte[] labels,
           com.paazl.soap.generated.LabelMetaDataType[] metaData) {
           this.error = error;
           this.labels = labels;
           this.metaData = metaData;
    }


    /**
     * Gets the error value for this GetExistingPdfLabelsResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this GetExistingPdfLabelsResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the labels value for this GetExistingPdfLabelsResponse.
     * 
     * @return labels
     */
    public byte[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this GetExistingPdfLabelsResponse.
     * 
     * @param labels
     */
    public void setLabels(byte[] labels) {
        this.labels = labels;
    }


    /**
     * Gets the metaData value for this GetExistingPdfLabelsResponse.
     * 
     * @return metaData
     */
    public com.paazl.soap.generated.LabelMetaDataType[] getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this GetExistingPdfLabelsResponse.
     * 
     * @param metaData
     */
    public void setMetaData(com.paazl.soap.generated.LabelMetaDataType[] metaData) {
        this.metaData = metaData;
    }

    public com.paazl.soap.generated.LabelMetaDataType getMetaData(int i) {
        return this.metaData[i];
    }

    public void setMetaData(int i, com.paazl.soap.generated.LabelMetaDataType _value) {
        this.metaData[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExistingPdfLabelsResponse)) return false;
        GetExistingPdfLabelsResponse other = (GetExistingPdfLabelsResponse) obj;
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
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              java.util.Arrays.equals(this.metaData, other.getMetaData())));
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
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetaData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaData());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMetaData(), i);
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
        new org.apache.axis.description.TypeDesc(GetExistingPdfLabelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "metaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelMetaDataType"));
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
