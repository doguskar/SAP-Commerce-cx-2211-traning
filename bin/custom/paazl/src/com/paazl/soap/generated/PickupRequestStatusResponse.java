/**
 * PickupRequestStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class PickupRequestStatusResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private String internalReference;

    private long webshop;

    private com.paazl.soap.generated.PickupRequestStatusType status;

    private java.util.Calendar date;

    private com.paazl.soap.generated.PickupRequestStatusEntryType[] statusHistory;

    public PickupRequestStatusResponse() {
    }

    public PickupRequestStatusResponse(
           com.paazl.soap.generated.ErrorType error,
           String internalReference,
           long webshop,
           com.paazl.soap.generated.PickupRequestStatusType status,
           java.util.Calendar date,
           com.paazl.soap.generated.PickupRequestStatusEntryType[] statusHistory) {
           this.error = error;
           this.internalReference = internalReference;
           this.webshop = webshop;
           this.status = status;
           this.date = date;
           this.statusHistory = statusHistory;
    }


    /**
     * Gets the error value for this PickupRequestStatusResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this PickupRequestStatusResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the internalReference value for this PickupRequestStatusResponse.
     * 
     * @return internalReference
     */
    public String getInternalReference() {
        return internalReference;
    }


    /**
     * Sets the internalReference value for this PickupRequestStatusResponse.
     * 
     * @param internalReference
     */
    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }


    /**
     * Gets the webshop value for this PickupRequestStatusResponse.
     * 
     * @return webshop
     */
    public long getWebshop() {
        return webshop;
    }


    /**
     * Sets the webshop value for this PickupRequestStatusResponse.
     * 
     * @param webshop
     */
    public void setWebshop(long webshop) {
        this.webshop = webshop;
    }


    /**
     * Gets the status value for this PickupRequestStatusResponse.
     * 
     * @return status
     */
    public com.paazl.soap.generated.PickupRequestStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PickupRequestStatusResponse.
     * 
     * @param status
     */
    public void setStatus(com.paazl.soap.generated.PickupRequestStatusType status) {
        this.status = status;
    }


    /**
     * Gets the date value for this PickupRequestStatusResponse.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this PickupRequestStatusResponse.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the statusHistory value for this PickupRequestStatusResponse.
     * 
     * @return statusHistory
     */
    public com.paazl.soap.generated.PickupRequestStatusEntryType[] getStatusHistory() {
        return statusHistory;
    }


    /**
     * Sets the statusHistory value for this PickupRequestStatusResponse.
     * 
     * @param statusHistory
     */
    public void setStatusHistory(com.paazl.soap.generated.PickupRequestStatusEntryType[] statusHistory) {
        this.statusHistory = statusHistory;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PickupRequestStatusResponse)) return false;
        PickupRequestStatusResponse other = (PickupRequestStatusResponse) obj;
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
            ((this.internalReference==null && other.getInternalReference()==null) || 
             (this.internalReference!=null &&
              this.internalReference.equals(other.getInternalReference()))) &&
            this.webshop == other.getWebshop() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.statusHistory==null && other.getStatusHistory()==null) || 
             (this.statusHistory!=null &&
              java.util.Arrays.equals(this.statusHistory, other.getStatusHistory())));
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
        if (getInternalReference() != null) {
            _hashCode += getInternalReference().hashCode();
        }
        _hashCode += new Long(getWebshop()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getStatusHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusHistory());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStatusHistory(), i);
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
        new org.apache.axis.description.TypeDesc(PickupRequestStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "internalReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webshop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "webshop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "statusHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusEntryType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "statusEntry"));
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
