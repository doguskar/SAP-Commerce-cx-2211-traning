/**
 * GetExistingPdfLabelsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class GetExistingPdfLabelsRequest  extends com.paazl.soap.generated.GetExistingLabelsType  implements java.io.Serializable {
    private com.paazl.soap.generated.PrinterType printer;

    public GetExistingPdfLabelsRequest() {
    }

    public GetExistingPdfLabelsRequest(
           long webshop,
           com.paazl.soap.generated.ExistingLabelType[] label,
           Boolean includeMetaData,
           Boolean includeTrackingUrl,
           com.paazl.soap.generated.PrinterType printer) {
        super(
            webshop,
            label,
            includeMetaData,
            includeTrackingUrl);
        this.printer = printer;
    }


    /**
     * Gets the printer value for this GetExistingPdfLabelsRequest.
     * 
     * @return printer
     */
    public com.paazl.soap.generated.PrinterType getPrinter() {
        return printer;
    }


    /**
     * Sets the printer value for this GetExistingPdfLabelsRequest.
     * 
     * @param printer
     */
    public void setPrinter(com.paazl.soap.generated.PrinterType printer) {
        this.printer = printer;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExistingPdfLabelsRequest)) return false;
        GetExistingPdfLabelsRequest other = (GetExistingPdfLabelsRequest) obj;
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
              this.printer.equals(other.getPrinter())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExistingPdfLabelsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "printer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "printerType"));
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
