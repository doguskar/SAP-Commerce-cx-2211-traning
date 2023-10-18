/**
 * OrdersTypeOrderLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrdersTypeOrderLabel  implements java.io.Serializable {
    private java.util.Calendar createDate;

    private java.util.Calendar deliveryDate;

    private com.paazl.soap.generated.LabelStatusType status;

    private String barcode;

    private String trackingNumber;

    private java.util.Calendar expectedDeliveryDate;

    private com.paazl.soap.generated.TimeRangeType expectedDeliveryTimeFrame;

    private com.paazl.soap.generated.CarrierStatusHistoryType carrierStatus;

    private String deliveryInformation;

    public OrdersTypeOrderLabel() {
    }

    public OrdersTypeOrderLabel(
           java.util.Calendar createDate,
           java.util.Calendar deliveryDate,
           com.paazl.soap.generated.LabelStatusType status,
           String barcode,
           String trackingNumber,
           java.util.Calendar expectedDeliveryDate,
           com.paazl.soap.generated.TimeRangeType expectedDeliveryTimeFrame,
           com.paazl.soap.generated.CarrierStatusHistoryType carrierStatus,
           String deliveryInformation) {
           this.createDate = createDate;
           this.deliveryDate = deliveryDate;
           this.status = status;
           this.barcode = barcode;
           this.trackingNumber = trackingNumber;
           this.expectedDeliveryDate = expectedDeliveryDate;
           this.expectedDeliveryTimeFrame = expectedDeliveryTimeFrame;
           this.carrierStatus = carrierStatus;
           this.deliveryInformation = deliveryInformation;
    }


    /**
     * Gets the createDate value for this OrdersTypeOrderLabel.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this OrdersTypeOrderLabel.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the deliveryDate value for this OrdersTypeOrderLabel.
     * 
     * @return deliveryDate
     */
    public java.util.Calendar getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this OrdersTypeOrderLabel.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Calendar deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the status value for this OrdersTypeOrderLabel.
     * 
     * @return status
     */
    public com.paazl.soap.generated.LabelStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrdersTypeOrderLabel.
     * 
     * @param status
     */
    public void setStatus(com.paazl.soap.generated.LabelStatusType status) {
        this.status = status;
    }


    /**
     * Gets the barcode value for this OrdersTypeOrderLabel.
     * 
     * @return barcode
     */
    public String getBarcode() {
        return barcode;
    }


    /**
     * Sets the barcode value for this OrdersTypeOrderLabel.
     * 
     * @param barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }


    /**
     * Gets the trackingNumber value for this OrdersTypeOrderLabel.
     * 
     * @return trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this OrdersTypeOrderLabel.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the expectedDeliveryDate value for this OrdersTypeOrderLabel.
     * 
     * @return expectedDeliveryDate
     */
    public java.util.Calendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }


    /**
     * Sets the expectedDeliveryDate value for this OrdersTypeOrderLabel.
     * 
     * @param expectedDeliveryDate
     */
    public void setExpectedDeliveryDate(java.util.Calendar expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    /**
     * Gets the expectedDeliveryTimeFrame value for this OrdersTypeOrderLabel.
     * 
     * @return expectedDeliveryTimeFrame
     */
    public com.paazl.soap.generated.TimeRangeType getExpectedDeliveryTimeFrame() {
        return expectedDeliveryTimeFrame;
    }


    /**
     * Sets the expectedDeliveryTimeFrame value for this OrdersTypeOrderLabel.
     * 
     * @param expectedDeliveryTimeFrame
     */
    public void setExpectedDeliveryTimeFrame(com.paazl.soap.generated.TimeRangeType expectedDeliveryTimeFrame) {
        this.expectedDeliveryTimeFrame = expectedDeliveryTimeFrame;
    }


    /**
     * Gets the carrierStatus value for this OrdersTypeOrderLabel.
     * 
     * @return carrierStatus
     */
    public com.paazl.soap.generated.CarrierStatusHistoryType getCarrierStatus() {
        return carrierStatus;
    }


    /**
     * Sets the carrierStatus value for this OrdersTypeOrderLabel.
     * 
     * @param carrierStatus
     */
    public void setCarrierStatus(com.paazl.soap.generated.CarrierStatusHistoryType carrierStatus) {
        this.carrierStatus = carrierStatus;
    }


    /**
     * Gets the deliveryInformation value for this OrdersTypeOrderLabel.
     * 
     * @return deliveryInformation
     */
    public String getDeliveryInformation() {
        return deliveryInformation;
    }


    /**
     * Sets the deliveryInformation value for this OrdersTypeOrderLabel.
     * 
     * @param deliveryInformation
     */
    public void setDeliveryInformation(String deliveryInformation) {
        this.deliveryInformation = deliveryInformation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrdersTypeOrderLabel)) return false;
        OrdersTypeOrderLabel other = (OrdersTypeOrderLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.barcode==null && other.getBarcode()==null) || 
             (this.barcode!=null &&
              this.barcode.equals(other.getBarcode()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.expectedDeliveryDate==null && other.getExpectedDeliveryDate()==null) || 
             (this.expectedDeliveryDate!=null &&
              this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate()))) &&
            ((this.expectedDeliveryTimeFrame==null && other.getExpectedDeliveryTimeFrame()==null) || 
             (this.expectedDeliveryTimeFrame!=null &&
              this.expectedDeliveryTimeFrame.equals(other.getExpectedDeliveryTimeFrame()))) &&
            ((this.carrierStatus==null && other.getCarrierStatus()==null) || 
             (this.carrierStatus!=null &&
              this.carrierStatus.equals(other.getCarrierStatus()))) &&
            ((this.deliveryInformation==null && other.getDeliveryInformation()==null) || 
             (this.deliveryInformation!=null &&
              this.deliveryInformation.equals(other.getDeliveryInformation())));
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBarcode() != null) {
            _hashCode += getBarcode().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getExpectedDeliveryDate() != null) {
            _hashCode += getExpectedDeliveryDate().hashCode();
        }
        if (getExpectedDeliveryTimeFrame() != null) {
            _hashCode += getExpectedDeliveryTimeFrame().hashCode();
        }
        if (getCarrierStatus() != null) {
            _hashCode += getCarrierStatus().hashCode();
        }
        if (getDeliveryInformation() != null) {
            _hashCode += getDeliveryInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrdersTypeOrderLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>ordersType>order>label"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelStatusType"));
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
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "expectedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "expectedDeliveryTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "timeRangeType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
