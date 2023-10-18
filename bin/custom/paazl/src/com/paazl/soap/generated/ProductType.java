/**
 * ProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ProductType  implements java.io.Serializable {
    private int quantity;

    private Integer packagesPerUnit;

    private double unitPrice;

    private String unitPriceCurrency;

    private double weight;

    private Integer length;

    private Integer width;

    private Integer height;

    private Double volume;

    private String code;

    private String description;

    private String countryOfManufacture;

    private String hsTariffCode;

    public ProductType() {
    }

    public ProductType(
           int quantity,
           Integer packagesPerUnit,
           double unitPrice,
           String unitPriceCurrency,
           double weight,
           Integer length,
           Integer width,
           Integer height,
           Double volume,
           String code,
           String description,
           String countryOfManufacture,
           String hsTariffCode) {
           this.quantity = quantity;
           this.packagesPerUnit = packagesPerUnit;
           this.unitPrice = unitPrice;
           this.unitPriceCurrency = unitPriceCurrency;
           this.weight = weight;
           this.length = length;
           this.width = width;
           this.height = height;
           this.volume = volume;
           this.code = code;
           this.description = description;
           this.countryOfManufacture = countryOfManufacture;
           this.hsTariffCode = hsTariffCode;
    }


    /**
     * Gets the quantity value for this ProductType.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ProductType.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the packagesPerUnit value for this ProductType.
     * 
     * @return packagesPerUnit
     */
    public Integer getPackagesPerUnit() {
        return packagesPerUnit;
    }


    /**
     * Sets the packagesPerUnit value for this ProductType.
     * 
     * @param packagesPerUnit
     */
    public void setPackagesPerUnit(Integer packagesPerUnit) {
        this.packagesPerUnit = packagesPerUnit;
    }


    /**
     * Gets the unitPrice value for this ProductType.
     * 
     * @return unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ProductType.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the unitPriceCurrency value for this ProductType.
     * 
     * @return unitPriceCurrency
     */
    public String getUnitPriceCurrency() {
        return unitPriceCurrency;
    }


    /**
     * Sets the unitPriceCurrency value for this ProductType.
     * 
     * @param unitPriceCurrency
     */
    public void setUnitPriceCurrency(String unitPriceCurrency) {
        this.unitPriceCurrency = unitPriceCurrency;
    }


    /**
     * Gets the weight value for this ProductType.
     * 
     * @return weight
     */
    public double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ProductType.
     * 
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }


    /**
     * Gets the length value for this ProductType.
     * 
     * @return length
     */
    public Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this ProductType.
     * 
     * @param length
     */
    public void setLength(Integer length) {
        this.length = length;
    }


    /**
     * Gets the width value for this ProductType.
     * 
     * @return width
     */
    public Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this ProductType.
     * 
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }


    /**
     * Gets the height value for this ProductType.
     * 
     * @return height
     */
    public Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this ProductType.
     * 
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }


    /**
     * Gets the volume value for this ProductType.
     * 
     * @return volume
     */
    public Double getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this ProductType.
     * 
     * @param volume
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }


    /**
     * Gets the code value for this ProductType.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ProductType.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this ProductType.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductType.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the countryOfManufacture value for this ProductType.
     * 
     * @return countryOfManufacture
     */
    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this ProductType.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the hsTariffCode value for this ProductType.
     * 
     * @return hsTariffCode
     */
    public String getHsTariffCode() {
        return hsTariffCode;
    }


    /**
     * Sets the hsTariffCode value for this ProductType.
     * 
     * @param hsTariffCode
     */
    public void setHsTariffCode(String hsTariffCode) {
        this.hsTariffCode = hsTariffCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProductType)) return false;
        ProductType other = (ProductType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.quantity == other.getQuantity() &&
            ((this.packagesPerUnit==null && other.getPackagesPerUnit()==null) || 
             (this.packagesPerUnit!=null &&
              this.packagesPerUnit.equals(other.getPackagesPerUnit()))) &&
            this.unitPrice == other.getUnitPrice() &&
            ((this.unitPriceCurrency==null && other.getUnitPriceCurrency()==null) || 
             (this.unitPriceCurrency!=null &&
              this.unitPriceCurrency.equals(other.getUnitPriceCurrency()))) &&
            this.weight == other.getWeight() &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              this.countryOfManufacture.equals(other.getCountryOfManufacture()))) &&
            ((this.hsTariffCode==null && other.getHsTariffCode()==null) || 
             (this.hsTariffCode!=null &&
              this.hsTariffCode.equals(other.getHsTariffCode())));
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
        _hashCode += getQuantity();
        if (getPackagesPerUnit() != null) {
            _hashCode += getPackagesPerUnit().hashCode();
        }
        _hashCode += new Double(getUnitPrice()).hashCode();
        if (getUnitPriceCurrency() != null) {
            _hashCode += getUnitPriceCurrency().hashCode();
        }
        _hashCode += new Double(getWeight()).hashCode();
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCountryOfManufacture() != null) {
            _hashCode += getCountryOfManufacture().hashCode();
        }
        if (getHsTariffCode() != null) {
            _hashCode += getHsTariffCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "productType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagesPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagesPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPriceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "unitPriceCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hsTariffCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "hsTariffCode"));
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
