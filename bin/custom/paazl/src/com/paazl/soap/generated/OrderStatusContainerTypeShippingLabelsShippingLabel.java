/**
 * OrderStatusContainerTypeShippingLabelsShippingLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrderStatusContainerTypeShippingLabelsShippingLabel  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar scannedDate;

    private java.util.Calendar deliveredDate;

    private java.util.Calendar deliveredbbDate;

    private com.paazl.soap.generated.LabelStatusType currentStatus;

    private String labelCode;

    private String trackingNumber;

    private org.apache.axis.types.URI trackTraceUrl;

    private String batch;

    private com.paazl.soap.generated.CarrierStatusHistoryType carrierStatus;

    public OrderStatusContainerTypeShippingLabelsShippingLabel() {
    }

    public OrderStatusContainerTypeShippingLabelsShippingLabel(
           java.util.Calendar createdDate,
           java.util.Calendar scannedDate,
           java.util.Calendar deliveredDate,
           java.util.Calendar deliveredbbDate,
           com.paazl.soap.generated.LabelStatusType currentStatus,
           String labelCode,
           String trackingNumber,
           org.apache.axis.types.URI trackTraceUrl,
           String batch,
           com.paazl.soap.generated.CarrierStatusHistoryType carrierStatus) {
           this.createdDate = createdDate;
           this.scannedDate = scannedDate;
           this.deliveredDate = deliveredDate;
           this.deliveredbbDate = deliveredbbDate;
           this.currentStatus = currentStatus;
           this.labelCode = labelCode;
           this.trackingNumber = trackingNumber;
           this.trackTraceUrl = trackTraceUrl;
           this.batch = batch;
           this.carrierStatus = carrierStatus;
    }


    /**
     * Gets the createdDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the scannedDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return scannedDate
     */
    public java.util.Calendar getScannedDate() {
        return scannedDate;
    }


    /**
     * Sets the scannedDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param scannedDate
     */
    public void setScannedDate(java.util.Calendar scannedDate) {
        this.scannedDate = scannedDate;
    }


    /**
     * Gets the deliveredDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return deliveredDate
     */
    public java.util.Calendar getDeliveredDate() {
        return deliveredDate;
    }


    /**
     * Sets the deliveredDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param deliveredDate
     */
    public void setDeliveredDate(java.util.Calendar deliveredDate) {
        this.deliveredDate = deliveredDate;
    }


    /**
     * Gets the deliveredbbDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return deliveredbbDate
     */
    public java.util.Calendar getDeliveredbbDate() {
        return deliveredbbDate;
    }


    /**
     * Sets the deliveredbbDate value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param deliveredbbDate
     */
    public void setDeliveredbbDate(java.util.Calendar deliveredbbDate) {
        this.deliveredbbDate = deliveredbbDate;
    }


    /**
     * Gets the currentStatus value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return currentStatus
     */
    public com.paazl.soap.generated.LabelStatusType getCurrentStatus() {
        return currentStatus;
    }


    /**
     * Sets the currentStatus value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param currentStatus
     */
    public void setCurrentStatus(com.paazl.soap.generated.LabelStatusType currentStatus) {
        this.currentStatus = currentStatus;
    }


    /**
     * Gets the labelCode value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return labelCode
     */
    public String getLabelCode() {
        return labelCode;
    }


    /**
     * Sets the labelCode value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param labelCode
     */
    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode;
    }


    /**
     * Gets the trackingNumber value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the trackTraceUrl value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return trackTraceUrl
     */
    public org.apache.axis.types.URI getTrackTraceUrl() {
        return trackTraceUrl;
    }


    /**
     * Sets the trackTraceUrl value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param trackTraceUrl
     */
    public void setTrackTraceUrl(org.apache.axis.types.URI trackTraceUrl) {
        this.trackTraceUrl = trackTraceUrl;
    }


    /**
     * Gets the batch value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return batch
     */
    public String getBatch() {
        return batch;
    }


    /**
     * Sets the batch value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param batch
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }


    /**
     * Gets the carrierStatus value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @return carrierStatus
     */
    public com.paazl.soap.generated.CarrierStatusHistoryType getCarrierStatus() {
        return carrierStatus;
    }


    /**
     * Sets the carrierStatus value for this OrderStatusContainerTypeShippingLabelsShippingLabel.
     * 
     * @param carrierStatus
     */
    public void setCarrierStatus(com.paazl.soap.generated.CarrierStatusHistoryType carrierStatus) {
        this.carrierStatus = carrierStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrderStatusContainerTypeShippingLabelsShippingLabel)) return false;
        OrderStatusContainerTypeShippingLabelsShippingLabel other = (OrderStatusContainerTypeShippingLabelsShippingLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.scannedDate==null && other.getScannedDate()==null) || 
             (this.scannedDate!=null &&
              this.scannedDate.equals(other.getScannedDate()))) &&
            ((this.deliveredDate==null && other.getDeliveredDate()==null) || 
             (this.deliveredDate!=null &&
              this.deliveredDate.equals(other.getDeliveredDate()))) &&
            ((this.deliveredbbDate==null && other.getDeliveredbbDate()==null) || 
             (this.deliveredbbDate!=null &&
              this.deliveredbbDate.equals(other.getDeliveredbbDate()))) &&
            ((this.currentStatus==null && other.getCurrentStatus()==null) || 
             (this.currentStatus!=null &&
              this.currentStatus.equals(other.getCurrentStatus()))) &&
            ((this.labelCode==null && other.getLabelCode()==null) || 
             (this.labelCode!=null &&
              this.labelCode.equals(other.getLabelCode()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.trackTraceUrl==null && other.getTrackTraceUrl()==null) || 
             (this.trackTraceUrl!=null &&
              this.trackTraceUrl.equals(other.getTrackTraceUrl()))) &&
            ((this.batch==null && other.getBatch()==null) || 
             (this.batch!=null &&
              this.batch.equals(other.getBatch()))) &&
            ((this.carrierStatus==null && other.getCarrierStatus()==null) || 
             (this.carrierStatus!=null &&
              this.carrierStatus.equals(other.getCarrierStatus())));
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getScannedDate() != null) {
            _hashCode += getScannedDate().hashCode();
        }
        if (getDeliveredDate() != null) {
            _hashCode += getDeliveredDate().hashCode();
        }
        if (getDeliveredbbDate() != null) {
            _hashCode += getDeliveredbbDate().hashCode();
        }
        if (getCurrentStatus() != null) {
            _hashCode += getCurrentStatus().hashCode();
        }
        if (getLabelCode() != null) {
            _hashCode += getLabelCode().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getTrackTraceUrl() != null) {
            _hashCode += getTrackTraceUrl().hashCode();
        }
        if (getBatch() != null) {
            _hashCode += getBatch().hashCode();
        }
        if (getCarrierStatus() != null) {
            _hashCode += getCarrierStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderStatusContainerTypeShippingLabelsShippingLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>orderStatusContainerType>shippingLabels>shippingLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scannedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "scannedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredbbDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveredbbDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "currentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelCode"));
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
        elemField.setFieldName("trackTraceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "trackTraceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
        elemField.setFieldName("carrierStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatusHistoryType"));
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
