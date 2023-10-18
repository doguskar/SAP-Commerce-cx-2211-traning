/**
 * LabelMetaDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class LabelMetaDataType  implements java.io.Serializable {
    private String orderReference;

    private String barcode;

    private String trackingNumber;

    private String batch;

    private com.paazl.soap.generated.AdditionalDocumentType[] additionalDocument;

    private org.apache.axis.types.URI trackingUrl;

    public LabelMetaDataType() {
    }

    public LabelMetaDataType(
           String orderReference,
           String barcode,
           String trackingNumber,
           String batch,
           com.paazl.soap.generated.AdditionalDocumentType[] additionalDocument,
           org.apache.axis.types.URI trackingUrl) {
           this.orderReference = orderReference;
           this.barcode = barcode;
           this.trackingNumber = trackingNumber;
           this.batch = batch;
           this.additionalDocument = additionalDocument;
           this.trackingUrl = trackingUrl;
    }


    /**
     * Gets the orderReference value for this LabelMetaDataType.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this LabelMetaDataType.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the barcode value for this LabelMetaDataType.
     * 
     * @return barcode
     */
    public String getBarcode() {
        return barcode;
    }


    /**
     * Sets the barcode value for this LabelMetaDataType.
     * 
     * @param barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }


    /**
     * Gets the trackingNumber value for this LabelMetaDataType.
     * 
     * @return trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this LabelMetaDataType.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the batch value for this LabelMetaDataType.
     * 
     * @return batch
     */
    public String getBatch() {
        return batch;
    }


    /**
     * Sets the batch value for this LabelMetaDataType.
     * 
     * @param batch
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }


    /**
     * Gets the additionalDocument value for this LabelMetaDataType.
     * 
     * @return additionalDocument
     */
    public com.paazl.soap.generated.AdditionalDocumentType[] getAdditionalDocument() {
        return additionalDocument;
    }


    /**
     * Sets the additionalDocument value for this LabelMetaDataType.
     * 
     * @param additionalDocument
     */
    public void setAdditionalDocument(com.paazl.soap.generated.AdditionalDocumentType[] additionalDocument) {
        this.additionalDocument = additionalDocument;
    }

    public com.paazl.soap.generated.AdditionalDocumentType getAdditionalDocument(int i) {
        return this.additionalDocument[i];
    }

    public void setAdditionalDocument(int i, com.paazl.soap.generated.AdditionalDocumentType _value) {
        this.additionalDocument[i] = _value;
    }


    /**
     * Gets the trackingUrl value for this LabelMetaDataType.
     * 
     * @return trackingUrl
     */
    public org.apache.axis.types.URI getTrackingUrl() {
        return trackingUrl;
    }


    /**
     * Sets the trackingUrl value for this LabelMetaDataType.
     * 
     * @param trackingUrl
     */
    public void setTrackingUrl(org.apache.axis.types.URI trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LabelMetaDataType)) return false;
        LabelMetaDataType other = (LabelMetaDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.barcode==null && other.getBarcode()==null) || 
             (this.barcode!=null &&
              this.barcode.equals(other.getBarcode()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.batch==null && other.getBatch()==null) || 
             (this.batch!=null &&
              this.batch.equals(other.getBatch()))) &&
            ((this.additionalDocument==null && other.getAdditionalDocument()==null) || 
             (this.additionalDocument!=null &&
              java.util.Arrays.equals(this.additionalDocument, other.getAdditionalDocument()))) &&
            ((this.trackingUrl==null && other.getTrackingUrl()==null) || 
             (this.trackingUrl!=null &&
              this.trackingUrl.equals(other.getTrackingUrl())));
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
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getBarcode() != null) {
            _hashCode += getBarcode().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getBatch() != null) {
            _hashCode += getBatch().hashCode();
        }
        if (getAdditionalDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalDocument());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingUrl() != null) {
            _hashCode += getTrackingUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabelMetaDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelMetaDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "barcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "trackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "trackingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
