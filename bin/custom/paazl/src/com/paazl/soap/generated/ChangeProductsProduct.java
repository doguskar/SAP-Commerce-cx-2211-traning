/**
 * ChangeProductsProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ChangeProductsProduct  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger quantity;

    private org.apache.axis.types.PositiveInteger packagesPerUnit;

    private java.math.BigDecimal weight;

    private org.apache.axis.types.NonNegativeInteger width;

    private org.apache.axis.types.NonNegativeInteger height;

    private org.apache.axis.types.NonNegativeInteger length;

    private java.math.BigDecimal volume;

    private String code;

    private String description;

    private String countryOfManufacture;

    private java.math.BigDecimal unitPrice;

    private String unitPriceCurrency;

    private String hsTariffCode;

    private com.paazl.soap.generated.DirectionType direction;

    public ChangeProductsProduct() {
    }

    public ChangeProductsProduct(
           org.apache.axis.types.PositiveInteger quantity,
           org.apache.axis.types.PositiveInteger packagesPerUnit,
           java.math.BigDecimal weight,
           org.apache.axis.types.NonNegativeInteger width,
           org.apache.axis.types.NonNegativeInteger height,
           org.apache.axis.types.NonNegativeInteger length,
           java.math.BigDecimal volume,
           String code,
           String description,
           String countryOfManufacture,
           java.math.BigDecimal unitPrice,
           String unitPriceCurrency,
           String hsTariffCode,
           com.paazl.soap.generated.DirectionType direction) {
           this.quantity = quantity;
           this.packagesPerUnit = packagesPerUnit;
           this.weight = weight;
           this.width = width;
           this.height = height;
           this.length = length;
           this.volume = volume;
           this.code = code;
           this.description = description;
           this.countryOfManufacture = countryOfManufacture;
           this.unitPrice = unitPrice;
           this.unitPriceCurrency = unitPriceCurrency;
           this.hsTariffCode = hsTariffCode;
           this.direction = direction;
    }


    /**
     * Gets the quantity value for this ChangeProductsProduct.
     * 
     * @return quantity
     */
    public org.apache.axis.types.PositiveInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ChangeProductsProduct.
     * 
     * @param quantity
     */
    public void setQuantity(org.apache.axis.types.PositiveInteger quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the packagesPerUnit value for this ChangeProductsProduct.
     * 
     * @return packagesPerUnit
     */
    public org.apache.axis.types.PositiveInteger getPackagesPerUnit() {
        return packagesPerUnit;
    }


    /**
     * Sets the packagesPerUnit value for this ChangeProductsProduct.
     * 
     * @param packagesPerUnit
     */
    public void setPackagesPerUnit(org.apache.axis.types.PositiveInteger packagesPerUnit) {
        this.packagesPerUnit = packagesPerUnit;
    }


    /**
     * Gets the weight value for this ChangeProductsProduct.
     * 
     * @return weight
     */
    public java.math.BigDecimal getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ChangeProductsProduct.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }


    /**
     * Gets the width value for this ChangeProductsProduct.
     * 
     * @return width
     */
    public org.apache.axis.types.NonNegativeInteger getWidth() {
        return width;
    }


    /**
     * Sets the width value for this ChangeProductsProduct.
     * 
     * @param width
     */
    public void setWidth(org.apache.axis.types.NonNegativeInteger width) {
        this.width = width;
    }


    /**
     * Gets the height value for this ChangeProductsProduct.
     * 
     * @return height
     */
    public org.apache.axis.types.NonNegativeInteger getHeight() {
        return height;
    }


    /**
     * Sets the height value for this ChangeProductsProduct.
     * 
     * @param height
     */
    public void setHeight(org.apache.axis.types.NonNegativeInteger height) {
        this.height = height;
    }


    /**
     * Gets the length value for this ChangeProductsProduct.
     * 
     * @return length
     */
    public org.apache.axis.types.NonNegativeInteger getLength() {
        return length;
    }


    /**
     * Sets the length value for this ChangeProductsProduct.
     * 
     * @param length
     */
    public void setLength(org.apache.axis.types.NonNegativeInteger length) {
        this.length = length;
    }


    /**
     * Gets the volume value for this ChangeProductsProduct.
     * 
     * @return volume
     */
    public java.math.BigDecimal getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this ChangeProductsProduct.
     * 
     * @param volume
     */
    public void setVolume(java.math.BigDecimal volume) {
        this.volume = volume;
    }


    /**
     * Gets the code value for this ChangeProductsProduct.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ChangeProductsProduct.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this ChangeProductsProduct.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ChangeProductsProduct.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the countryOfManufacture value for this ChangeProductsProduct.
     * 
     * @return countryOfManufacture
     */
    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this ChangeProductsProduct.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the unitPrice value for this ChangeProductsProduct.
     * 
     * @return unitPrice
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ChangeProductsProduct.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the unitPriceCurrency value for this ChangeProductsProduct.
     * 
     * @return unitPriceCurrency
     */
    public String getUnitPriceCurrency() {
        return unitPriceCurrency;
    }


    /**
     * Sets the unitPriceCurrency value for this ChangeProductsProduct.
     * 
     * @param unitPriceCurrency
     */
    public void setUnitPriceCurrency(String unitPriceCurrency) {
        this.unitPriceCurrency = unitPriceCurrency;
    }


    /**
     * Gets the hsTariffCode value for this ChangeProductsProduct.
     * 
     * @return hsTariffCode
     */
    public String getHsTariffCode() {
        return hsTariffCode;
    }


    /**
     * Sets the hsTariffCode value for this ChangeProductsProduct.
     * 
     * @param hsTariffCode
     */
    public void setHsTariffCode(String hsTariffCode) {
        this.hsTariffCode = hsTariffCode;
    }


    /**
     * Gets the direction value for this ChangeProductsProduct.
     * 
     * @return direction
     */
    public com.paazl.soap.generated.DirectionType getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this ChangeProductsProduct.
     * 
     * @param direction
     */
    public void setDirection(com.paazl.soap.generated.DirectionType direction) {
        this.direction = direction;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangeProductsProduct)) return false;
        ChangeProductsProduct other = (ChangeProductsProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.packagesPerUnit==null && other.getPackagesPerUnit()==null) || 
             (this.packagesPerUnit!=null &&
              this.packagesPerUnit.equals(other.getPackagesPerUnit()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
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
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.unitPriceCurrency==null && other.getUnitPriceCurrency()==null) || 
             (this.unitPriceCurrency!=null &&
              this.unitPriceCurrency.equals(other.getUnitPriceCurrency()))) &&
            ((this.hsTariffCode==null && other.getHsTariffCode()==null) || 
             (this.hsTariffCode!=null &&
              this.hsTariffCode.equals(other.getHsTariffCode()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getPackagesPerUnit() != null) {
            _hashCode += getPackagesPerUnit().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
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
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getUnitPriceCurrency() != null) {
            _hashCode += getUnitPriceCurrency().hashCode();
        }
        if (getHsTariffCode() != null) {
            _hashCode += getHsTariffCode().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeProductsProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeProducts>product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagesPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagesPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("hsTariffCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "hsTariffCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "directionType"));
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
