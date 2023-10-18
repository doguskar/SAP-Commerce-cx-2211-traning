/**
 * GetExistingLabelsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class GetExistingLabelsType  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private com.paazl.soap.generated.ExistingLabelType[] label;

    private Boolean includeMetaData;

    private Boolean includeTrackingUrl;

    public GetExistingLabelsType() {
    }

    public GetExistingLabelsType(
           long webshop,
           com.paazl.soap.generated.ExistingLabelType[] label,
           Boolean includeMetaData,
           Boolean includeTrackingUrl) {
        super(
            webshop);
        this.label = label;
        this.includeMetaData = includeMetaData;
        this.includeTrackingUrl = includeTrackingUrl;
    }


    /**
     * Gets the label value for this GetExistingLabelsType.
     * 
     * @return label
     */
    public com.paazl.soap.generated.ExistingLabelType[] getLabel() {
        return label;
    }


    /**
     * Sets the label value for this GetExistingLabelsType.
     * 
     * @param label
     */
    public void setLabel(com.paazl.soap.generated.ExistingLabelType[] label) {
        this.label = label;
    }

    public com.paazl.soap.generated.ExistingLabelType getLabel(int i) {
        return this.label[i];
    }

    public void setLabel(int i, com.paazl.soap.generated.ExistingLabelType _value) {
        this.label[i] = _value;
    }


    /**
     * Gets the includeMetaData value for this GetExistingLabelsType.
     * 
     * @return includeMetaData
     */
    public Boolean getIncludeMetaData() {
        return includeMetaData;
    }


    /**
     * Sets the includeMetaData value for this GetExistingLabelsType.
     * 
     * @param includeMetaData
     */
    public void setIncludeMetaData(Boolean includeMetaData) {
        this.includeMetaData = includeMetaData;
    }


    /**
     * Gets the includeTrackingUrl value for this GetExistingLabelsType.
     * 
     * @return includeTrackingUrl
     */
    public Boolean getIncludeTrackingUrl() {
        return includeTrackingUrl;
    }


    /**
     * Sets the includeTrackingUrl value for this GetExistingLabelsType.
     * 
     * @param includeTrackingUrl
     */
    public void setIncludeTrackingUrl(Boolean includeTrackingUrl) {
        this.includeTrackingUrl = includeTrackingUrl;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExistingLabelsType)) return false;
        GetExistingLabelsType other = (GetExistingLabelsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              java.util.Arrays.equals(this.label, other.getLabel()))) &&
            ((this.includeMetaData==null && other.getIncludeMetaData()==null) || 
             (this.includeMetaData!=null &&
              this.includeMetaData.equals(other.getIncludeMetaData()))) &&
            ((this.includeTrackingUrl==null && other.getIncludeTrackingUrl()==null) || 
             (this.includeTrackingUrl!=null &&
              this.includeTrackingUrl.equals(other.getIncludeTrackingUrl())));
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
        if (getLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeMetaData() != null) {
            _hashCode += getIncludeMetaData().hashCode();
        }
        if (getIncludeTrackingUrl() != null) {
            _hashCode += getIncludeTrackingUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExistingLabelsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingLabelsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "existingLabelType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeMetaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "includeMetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTrackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "includeTrackingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
