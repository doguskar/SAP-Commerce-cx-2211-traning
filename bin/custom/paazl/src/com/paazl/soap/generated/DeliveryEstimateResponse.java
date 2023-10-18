/**
 * DeliveryEstimateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DeliveryEstimateResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private com.paazl.soap.generated.DisambiguationCandidateType[] disambiguationCandidate;

    private com.paazl.soap.generated.DeliveryEstimateType[] deliveryEstimate;

    public DeliveryEstimateResponse() {
    }

    public DeliveryEstimateResponse(
           com.paazl.soap.generated.ErrorType error,
           com.paazl.soap.generated.DisambiguationCandidateType[] disambiguationCandidate,
           com.paazl.soap.generated.DeliveryEstimateType[] deliveryEstimate) {
           this.error = error;
           this.disambiguationCandidate = disambiguationCandidate;
           this.deliveryEstimate = deliveryEstimate;
    }


    /**
     * Gets the error value for this DeliveryEstimateResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this DeliveryEstimateResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the disambiguationCandidate value for this DeliveryEstimateResponse.
     * 
     * @return disambiguationCandidate
     */
    public com.paazl.soap.generated.DisambiguationCandidateType[] getDisambiguationCandidate() {
        return disambiguationCandidate;
    }


    /**
     * Sets the disambiguationCandidate value for this DeliveryEstimateResponse.
     * 
     * @param disambiguationCandidate
     */
    public void setDisambiguationCandidate(com.paazl.soap.generated.DisambiguationCandidateType[] disambiguationCandidate) {
        this.disambiguationCandidate = disambiguationCandidate;
    }

    public com.paazl.soap.generated.DisambiguationCandidateType getDisambiguationCandidate(int i) {
        return this.disambiguationCandidate[i];
    }

    public void setDisambiguationCandidate(int i, com.paazl.soap.generated.DisambiguationCandidateType _value) {
        this.disambiguationCandidate[i] = _value;
    }


    /**
     * Gets the deliveryEstimate value for this DeliveryEstimateResponse.
     * 
     * @return deliveryEstimate
     */
    public com.paazl.soap.generated.DeliveryEstimateType[] getDeliveryEstimate() {
        return deliveryEstimate;
    }


    /**
     * Sets the deliveryEstimate value for this DeliveryEstimateResponse.
     * 
     * @param deliveryEstimate
     */
    public void setDeliveryEstimate(com.paazl.soap.generated.DeliveryEstimateType[] deliveryEstimate) {
        this.deliveryEstimate = deliveryEstimate;
    }

    public com.paazl.soap.generated.DeliveryEstimateType getDeliveryEstimate(int i) {
        return this.deliveryEstimate[i];
    }

    public void setDeliveryEstimate(int i, com.paazl.soap.generated.DeliveryEstimateType _value) {
        this.deliveryEstimate[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliveryEstimateResponse)) return false;
        DeliveryEstimateResponse other = (DeliveryEstimateResponse) obj;
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
            ((this.disambiguationCandidate==null && other.getDisambiguationCandidate()==null) || 
             (this.disambiguationCandidate!=null &&
              java.util.Arrays.equals(this.disambiguationCandidate, other.getDisambiguationCandidate()))) &&
            ((this.deliveryEstimate==null && other.getDeliveryEstimate()==null) || 
             (this.deliveryEstimate!=null &&
              java.util.Arrays.equals(this.deliveryEstimate, other.getDeliveryEstimate())));
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
        if (getDisambiguationCandidate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisambiguationCandidate());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDisambiguationCandidate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryEstimate());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryEstimate(), i);
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
        new org.apache.axis.description.TypeDesc(DeliveryEstimateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deliveryEstimateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disambiguationCandidate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "disambiguationCandidate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "disambiguationCandidateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimateType"));
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
