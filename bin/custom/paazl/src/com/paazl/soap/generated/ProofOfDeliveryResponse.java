/**
 * ProofOfDeliveryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ProofOfDeliveryResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private String signedBy;

    private com.paazl.soap.generated.ProofOfDeliveryDocumentType proofOfDeliveryDocument;

    public ProofOfDeliveryResponse() {
    }

    public ProofOfDeliveryResponse(
           com.paazl.soap.generated.ErrorType error,
           String signedBy,
           com.paazl.soap.generated.ProofOfDeliveryDocumentType proofOfDeliveryDocument) {
           this.error = error;
           this.signedBy = signedBy;
           this.proofOfDeliveryDocument = proofOfDeliveryDocument;
    }


    /**
     * Gets the error value for this ProofOfDeliveryResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this ProofOfDeliveryResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the signedBy value for this ProofOfDeliveryResponse.
     * 
     * @return signedBy
     */
    public String getSignedBy() {
        return signedBy;
    }


    /**
     * Sets the signedBy value for this ProofOfDeliveryResponse.
     * 
     * @param signedBy
     */
    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }


    /**
     * Gets the proofOfDeliveryDocument value for this ProofOfDeliveryResponse.
     * 
     * @return proofOfDeliveryDocument
     */
    public com.paazl.soap.generated.ProofOfDeliveryDocumentType getProofOfDeliveryDocument() {
        return proofOfDeliveryDocument;
    }


    /**
     * Sets the proofOfDeliveryDocument value for this ProofOfDeliveryResponse.
     * 
     * @param proofOfDeliveryDocument
     */
    public void setProofOfDeliveryDocument(com.paazl.soap.generated.ProofOfDeliveryDocumentType proofOfDeliveryDocument) {
        this.proofOfDeliveryDocument = proofOfDeliveryDocument;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProofOfDeliveryResponse)) return false;
        ProofOfDeliveryResponse other = (ProofOfDeliveryResponse) obj;
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
            ((this.signedBy==null && other.getSignedBy()==null) || 
             (this.signedBy!=null &&
              this.signedBy.equals(other.getSignedBy()))) &&
            ((this.proofOfDeliveryDocument==null && other.getProofOfDeliveryDocument()==null) || 
             (this.proofOfDeliveryDocument!=null &&
              this.proofOfDeliveryDocument.equals(other.getProofOfDeliveryDocument())));
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
        if (getSignedBy() != null) {
            _hashCode += getSignedBy().hashCode();
        }
        if (getProofOfDeliveryDocument() != null) {
            _hashCode += getProofOfDeliveryDocument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProofOfDeliveryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">proofOfDeliveryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "signedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proofOfDeliveryDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "proofOfDeliveryDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "proofOfDeliveryDocumentType"));
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
