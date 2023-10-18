/**
 * GenerateExtraPdfLabelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class GenerateExtraPdfLabelRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String orderReference;

    private com.paazl.soap.generated.LabelProductsLabelProduct[] labelProducts;

    private com.paazl.soap.generated.PrinterType printer;

    private String batch;

    private Boolean includeMetaData;

    private Boolean includeTrackingUrl;

    public GenerateExtraPdfLabelRequest() {
    }

    public GenerateExtraPdfLabelRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String orderReference,
           com.paazl.soap.generated.LabelProductsLabelProduct[] labelProducts,
           com.paazl.soap.generated.PrinterType printer,
           String batch,
           Boolean includeMetaData,
           Boolean includeTrackingUrl) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.orderReference = orderReference;
        this.labelProducts = labelProducts;
        this.printer = printer;
        this.batch = batch;
        this.includeMetaData = includeMetaData;
        this.includeTrackingUrl = includeTrackingUrl;
    }


    /**
     * Gets the hash value for this GenerateExtraPdfLabelRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this GenerateExtraPdfLabelRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this GenerateExtraPdfLabelRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this GenerateExtraPdfLabelRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the orderReference value for this GenerateExtraPdfLabelRequest.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this GenerateExtraPdfLabelRequest.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the labelProducts value for this GenerateExtraPdfLabelRequest.
     * 
     * @return labelProducts
     */
    public com.paazl.soap.generated.LabelProductsLabelProduct[] getLabelProducts() {
        return labelProducts;
    }


    /**
     * Sets the labelProducts value for this GenerateExtraPdfLabelRequest.
     * 
     * @param labelProducts
     */
    public void setLabelProducts(com.paazl.soap.generated.LabelProductsLabelProduct[] labelProducts) {
        this.labelProducts = labelProducts;
    }


    /**
     * Gets the printer value for this GenerateExtraPdfLabelRequest.
     * 
     * @return printer
     */
    public com.paazl.soap.generated.PrinterType getPrinter() {
        return printer;
    }


    /**
     * Sets the printer value for this GenerateExtraPdfLabelRequest.
     * 
     * @param printer
     */
    public void setPrinter(com.paazl.soap.generated.PrinterType printer) {
        this.printer = printer;
    }


    /**
     * Gets the batch value for this GenerateExtraPdfLabelRequest.
     * 
     * @return batch
     */
    public String getBatch() {
        return batch;
    }


    /**
     * Sets the batch value for this GenerateExtraPdfLabelRequest.
     * 
     * @param batch
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }


    /**
     * Gets the includeMetaData value for this GenerateExtraPdfLabelRequest.
     * 
     * @return includeMetaData
     */
    public Boolean getIncludeMetaData() {
        return includeMetaData;
    }


    /**
     * Sets the includeMetaData value for this GenerateExtraPdfLabelRequest.
     * 
     * @param includeMetaData
     */
    public void setIncludeMetaData(Boolean includeMetaData) {
        this.includeMetaData = includeMetaData;
    }


    /**
     * Gets the includeTrackingUrl value for this GenerateExtraPdfLabelRequest.
     * 
     * @return includeTrackingUrl
     */
    public Boolean getIncludeTrackingUrl() {
        return includeTrackingUrl;
    }


    /**
     * Sets the includeTrackingUrl value for this GenerateExtraPdfLabelRequest.
     * 
     * @param includeTrackingUrl
     */
    public void setIncludeTrackingUrl(Boolean includeTrackingUrl) {
        this.includeTrackingUrl = includeTrackingUrl;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GenerateExtraPdfLabelRequest)) return false;
        GenerateExtraPdfLabelRequest other = (GenerateExtraPdfLabelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hash==null && other.getHash()==null) || 
             (this.hash!=null &&
              this.hash.equals(other.getHash()))) &&
            ((this.targetWebshop==null && other.getTargetWebshop()==null) || 
             (this.targetWebshop!=null &&
              this.targetWebshop.equals(other.getTargetWebshop()))) &&
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.labelProducts==null && other.getLabelProducts()==null) || 
             (this.labelProducts!=null &&
              java.util.Arrays.equals(this.labelProducts, other.getLabelProducts()))) &&
            ((this.printer==null && other.getPrinter()==null) || 
             (this.printer!=null &&
              this.printer.equals(other.getPrinter()))) &&
            ((this.batch==null && other.getBatch()==null) || 
             (this.batch!=null &&
              this.batch.equals(other.getBatch()))) &&
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
        if (getHash() != null) {
            _hashCode += getHash().hashCode();
        }
        if (getTargetWebshop() != null) {
            _hashCode += getTargetWebshop().hashCode();
        }
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getLabelProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabelProducts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLabelProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrinter() != null) {
            _hashCode += getPrinter().hashCode();
        }
        if (getBatch() != null) {
            _hashCode += getBatch().hashCode();
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
        new org.apache.axis.description.TypeDesc(GenerateExtraPdfLabelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfLabelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWebshop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "targetWebshop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">labelProducts>labelProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelProduct"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "printer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "printerType"));
        elemField.setMinOccurs(0);
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
