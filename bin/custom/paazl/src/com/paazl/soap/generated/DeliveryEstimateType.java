/**
 * DeliveryEstimateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DeliveryEstimateType  implements java.io.Serializable {
    private String shippingOption;

    private String distributor;

    private com.paazl.soap.generated.DeliveryEstimateDestination destination;

    private java.util.Calendar expectedDeliveryDateFrom;

    private java.util.Calendar expectedDeliveryDate;

    private org.apache.axis.types.NonNegativeInteger transitDays;

    private boolean guarantee;

    public DeliveryEstimateType() {
    }

    public DeliveryEstimateType(
           String shippingOption,
           String distributor,
           com.paazl.soap.generated.DeliveryEstimateDestination destination,
           java.util.Calendar expectedDeliveryDateFrom,
           java.util.Calendar expectedDeliveryDate,
           org.apache.axis.types.NonNegativeInteger transitDays,
           boolean guarantee) {
           this.shippingOption = shippingOption;
           this.distributor = distributor;
           this.destination = destination;
           this.expectedDeliveryDateFrom = expectedDeliveryDateFrom;
           this.expectedDeliveryDate = expectedDeliveryDate;
           this.transitDays = transitDays;
           this.guarantee = guarantee;
    }


    /**
     * Gets the shippingOption value for this DeliveryEstimateType.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this DeliveryEstimateType.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the distributor value for this DeliveryEstimateType.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this DeliveryEstimateType.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the destination value for this DeliveryEstimateType.
     * 
     * @return destination
     */
    public com.paazl.soap.generated.DeliveryEstimateDestination getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this DeliveryEstimateType.
     * 
     * @param destination
     */
    public void setDestination(com.paazl.soap.generated.DeliveryEstimateDestination destination) {
        this.destination = destination;
    }


    /**
     * Gets the expectedDeliveryDateFrom value for this DeliveryEstimateType.
     * 
     * @return expectedDeliveryDateFrom
     */
    public java.util.Calendar getExpectedDeliveryDateFrom() {
        return expectedDeliveryDateFrom;
    }


    /**
     * Sets the expectedDeliveryDateFrom value for this DeliveryEstimateType.
     * 
     * @param expectedDeliveryDateFrom
     */
    public void setExpectedDeliveryDateFrom(java.util.Calendar expectedDeliveryDateFrom) {
        this.expectedDeliveryDateFrom = expectedDeliveryDateFrom;
    }


    /**
     * Gets the expectedDeliveryDate value for this DeliveryEstimateType.
     * 
     * @return expectedDeliveryDate
     */
    public java.util.Calendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }


    /**
     * Sets the expectedDeliveryDate value for this DeliveryEstimateType.
     * 
     * @param expectedDeliveryDate
     */
    public void setExpectedDeliveryDate(java.util.Calendar expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    /**
     * Gets the transitDays value for this DeliveryEstimateType.
     * 
     * @return transitDays
     */
    public org.apache.axis.types.NonNegativeInteger getTransitDays() {
        return transitDays;
    }


    /**
     * Sets the transitDays value for this DeliveryEstimateType.
     * 
     * @param transitDays
     */
    public void setTransitDays(org.apache.axis.types.NonNegativeInteger transitDays) {
        this.transitDays = transitDays;
    }


    /**
     * Gets the guarantee value for this DeliveryEstimateType.
     * 
     * @return guarantee
     */
    public boolean isGuarantee() {
        return guarantee;
    }


    /**
     * Sets the guarantee value for this DeliveryEstimateType.
     * 
     * @param guarantee
     */
    public void setGuarantee(boolean guarantee) {
        this.guarantee = guarantee;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeliveryEstimateType)) return false;
        DeliveryEstimateType other = (DeliveryEstimateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.expectedDeliveryDateFrom==null && other.getExpectedDeliveryDateFrom()==null) || 
             (this.expectedDeliveryDateFrom!=null &&
              this.expectedDeliveryDateFrom.equals(other.getExpectedDeliveryDateFrom()))) &&
            ((this.expectedDeliveryDate==null && other.getExpectedDeliveryDate()==null) || 
             (this.expectedDeliveryDate!=null &&
              this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate()))) &&
            ((this.transitDays==null && other.getTransitDays()==null) || 
             (this.transitDays!=null &&
              this.transitDays.equals(other.getTransitDays()))) &&
            this.guarantee == other.isGuarantee();
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
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getExpectedDeliveryDateFrom() != null) {
            _hashCode += getExpectedDeliveryDateFrom().hashCode();
        }
        if (getExpectedDeliveryDate() != null) {
            _hashCode += getExpectedDeliveryDate().hashCode();
        }
        if (getTransitDays() != null) {
            _hashCode += getTransitDays().hashCode();
        }
        _hashCode += (isGuarantee() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryEstimateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimateDestination"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "expectedDeliveryDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "expectedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "transitDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guarantee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "guarantee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
