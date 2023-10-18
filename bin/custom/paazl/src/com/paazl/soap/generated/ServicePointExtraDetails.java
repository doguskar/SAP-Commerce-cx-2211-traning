/**
 * ServicePointExtraDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ServicePointExtraDetails  implements java.io.Serializable {
    private String pictureUrl;

    private String[] locationHints;

    private String[] remarks;

    private com.paazl.soap.generated.ServicePointExtraDetailsStatus status;

    public ServicePointExtraDetails() {
    }

    public ServicePointExtraDetails(
           String pictureUrl,
           String[] locationHints,
           String[] remarks,
           com.paazl.soap.generated.ServicePointExtraDetailsStatus status) {
           this.pictureUrl = pictureUrl;
           this.locationHints = locationHints;
           this.remarks = remarks;
           this.status = status;
    }


    /**
     * Gets the pictureUrl value for this ServicePointExtraDetails.
     * 
     * @return pictureUrl
     */
    public String getPictureUrl() {
        return pictureUrl;
    }


    /**
     * Sets the pictureUrl value for this ServicePointExtraDetails.
     * 
     * @param pictureUrl
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }


    /**
     * Gets the locationHints value for this ServicePointExtraDetails.
     * 
     * @return locationHints
     */
    public String[] getLocationHints() {
        return locationHints;
    }


    /**
     * Sets the locationHints value for this ServicePointExtraDetails.
     * 
     * @param locationHints
     */
    public void setLocationHints(String[] locationHints) {
        this.locationHints = locationHints;
    }

    public String getLocationHints(int i) {
        return this.locationHints[i];
    }

    public void setLocationHints(int i, String _value) {
        this.locationHints[i] = _value;
    }


    /**
     * Gets the remarks value for this ServicePointExtraDetails.
     * 
     * @return remarks
     */
    public String[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this ServicePointExtraDetails.
     * 
     * @param remarks
     */
    public void setRemarks(String[] remarks) {
        this.remarks = remarks;
    }

    public String getRemarks(int i) {
        return this.remarks[i];
    }

    public void setRemarks(int i, String _value) {
        this.remarks[i] = _value;
    }


    /**
     * Gets the status value for this ServicePointExtraDetails.
     * 
     * @return status
     */
    public com.paazl.soap.generated.ServicePointExtraDetailsStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ServicePointExtraDetails.
     * 
     * @param status
     */
    public void setStatus(com.paazl.soap.generated.ServicePointExtraDetailsStatus status) {
        this.status = status;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServicePointExtraDetails)) return false;
        ServicePointExtraDetails other = (ServicePointExtraDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pictureUrl==null && other.getPictureUrl()==null) || 
             (this.pictureUrl!=null &&
              this.pictureUrl.equals(other.getPictureUrl()))) &&
            ((this.locationHints==null && other.getLocationHints()==null) || 
             (this.locationHints!=null &&
              java.util.Arrays.equals(this.locationHints, other.getLocationHints()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getPictureUrl() != null) {
            _hashCode += getPictureUrl().hashCode();
        }
        if (getLocationHints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationHints());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLocationHints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePointExtraDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointExtraDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pictureUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationHints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "locationHints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointExtraDetailsStatus"));
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
