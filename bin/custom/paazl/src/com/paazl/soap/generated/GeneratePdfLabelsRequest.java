/**
 * GeneratePdfLabelsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class GeneratePdfLabelsRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private com.paazl.soap.generated.PrinterType printer;

    private com.paazl.soap.generated.OrderType[] order;

    private Boolean includeMetaData;

    private Boolean includeTrackingUrl;

    public GeneratePdfLabelsRequest() {
    }

    public GeneratePdfLabelsRequest(
           long webshop,
           com.paazl.soap.generated.PrinterType printer,
           com.paazl.soap.generated.OrderType[] order,
           Boolean includeMetaData,
           Boolean includeTrackingUrl) {
        super(
            webshop);
        this.printer = printer;
        this.order = order;
        this.includeMetaData = includeMetaData;
        this.includeTrackingUrl = includeTrackingUrl;
    }


    /**
     * Gets the printer value for this GeneratePdfLabelsRequest.
     * 
     * @return printer
     */
    public com.paazl.soap.generated.PrinterType getPrinter() {
        return printer;
    }


    /**
     * Sets the printer value for this GeneratePdfLabelsRequest.
     * 
     * @param printer
     */
    public void setPrinter(com.paazl.soap.generated.PrinterType printer) {
        this.printer = printer;
    }


    /**
     * Gets the order value for this GeneratePdfLabelsRequest.
     * 
     * @return order
     */
    public com.paazl.soap.generated.OrderType[] getOrder() {
        return order;
    }


    /**
     * Sets the order value for this GeneratePdfLabelsRequest.
     * 
     * @param order
     */
    public void setOrder(com.paazl.soap.generated.OrderType[] order) {
        this.order = order;
    }

    public com.paazl.soap.generated.OrderType getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, com.paazl.soap.generated.OrderType _value) {
        this.order[i] = _value;
    }


    /**
     * Gets the includeMetaData value for this GeneratePdfLabelsRequest.
     * 
     * @return includeMetaData
     */
    public Boolean getIncludeMetaData() {
        return includeMetaData;
    }


    /**
     * Sets the includeMetaData value for this GeneratePdfLabelsRequest.
     * 
     * @param includeMetaData
     */
    public void setIncludeMetaData(Boolean includeMetaData) {
        this.includeMetaData = includeMetaData;
    }


    /**
     * Gets the includeTrackingUrl value for this GeneratePdfLabelsRequest.
     * 
     * @return includeTrackingUrl
     */
    public Boolean getIncludeTrackingUrl() {
        return includeTrackingUrl;
    }


    /**
     * Sets the includeTrackingUrl value for this GeneratePdfLabelsRequest.
     * 
     * @param includeTrackingUrl
     */
    public void setIncludeTrackingUrl(Boolean includeTrackingUrl) {
        this.includeTrackingUrl = includeTrackingUrl;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeneratePdfLabelsRequest)) return false;
        GeneratePdfLabelsRequest other = (GeneratePdfLabelsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.printer==null && other.getPrinter()==null) || 
             (this.printer!=null &&
              this.printer.equals(other.getPrinter()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              java.util.Arrays.equals(this.order, other.getOrder()))) &&
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
        if (getPrinter() != null) {
            _hashCode += getPrinter().hashCode();
        }
        if (getOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrder());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOrder(), i);
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
        new org.apache.axis.description.TypeDesc(GeneratePdfLabelsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfLabelsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "printer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "printerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderType"));
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
