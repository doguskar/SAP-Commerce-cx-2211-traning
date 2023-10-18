/**
 * ProductsProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ProductsProduct  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger quantity;

    private org.apache.axis.types.PositiveInteger packagesPerUnit;

    private String matrix;

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

    private org.apache.axis.types.NonNegativeInteger processingDays;

    private Boolean promotionAbsolute;

    private java.math.BigDecimal promotion;

    private com.paazl.soap.generated.AvailableStoresStore[] availableStores;

    public ProductsProduct() {
    }

    public ProductsProduct(
           org.apache.axis.types.PositiveInteger quantity,
           org.apache.axis.types.PositiveInteger packagesPerUnit,
           String matrix,
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
           com.paazl.soap.generated.DirectionType direction,
           org.apache.axis.types.NonNegativeInteger processingDays,
           Boolean promotionAbsolute,
           java.math.BigDecimal promotion,
           com.paazl.soap.generated.AvailableStoresStore[] availableStores) {
           this.quantity = quantity;
           this.packagesPerUnit = packagesPerUnit;
           this.matrix = matrix;
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
           this.processingDays = processingDays;
           this.promotionAbsolute = promotionAbsolute;
           this.promotion = promotion;
           this.availableStores = availableStores;
    }


    /**
     * Gets the quantity value for this ProductsProduct.
     * 
     * @return quantity
     */
    public org.apache.axis.types.PositiveInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ProductsProduct.
     * 
     * @param quantity
     */
    public void setQuantity(org.apache.axis.types.PositiveInteger quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the packagesPerUnit value for this ProductsProduct.
     * 
     * @return packagesPerUnit
     */
    public org.apache.axis.types.PositiveInteger getPackagesPerUnit() {
        return packagesPerUnit;
    }


    /**
     * Sets the packagesPerUnit value for this ProductsProduct.
     * 
     * @param packagesPerUnit
     */
    public void setPackagesPerUnit(org.apache.axis.types.PositiveInteger packagesPerUnit) {
        this.packagesPerUnit = packagesPerUnit;
    }


    /**
     * Gets the matrix value for this ProductsProduct.
     * 
     * @return matrix
     */
    public String getMatrix() {
        return matrix;
    }


    /**
     * Sets the matrix value for this ProductsProduct.
     * 
     * @param matrix
     */
    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }


    /**
     * Gets the weight value for this ProductsProduct.
     * 
     * @return weight
     */
    public java.math.BigDecimal getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ProductsProduct.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }


    /**
     * Gets the width value for this ProductsProduct.
     * 
     * @return width
     */
    public org.apache.axis.types.NonNegativeInteger getWidth() {
        return width;
    }


    /**
     * Sets the width value for this ProductsProduct.
     * 
     * @param width
     */
    public void setWidth(org.apache.axis.types.NonNegativeInteger width) {
        this.width = width;
    }


    /**
     * Gets the height value for this ProductsProduct.
     * 
     * @return height
     */
    public org.apache.axis.types.NonNegativeInteger getHeight() {
        return height;
    }


    /**
     * Sets the height value for this ProductsProduct.
     * 
     * @param height
     */
    public void setHeight(org.apache.axis.types.NonNegativeInteger height) {
        this.height = height;
    }


    /**
     * Gets the length value for this ProductsProduct.
     * 
     * @return length
     */
    public org.apache.axis.types.NonNegativeInteger getLength() {
        return length;
    }


    /**
     * Sets the length value for this ProductsProduct.
     * 
     * @param length
     */
    public void setLength(org.apache.axis.types.NonNegativeInteger length) {
        this.length = length;
    }


    /**
     * Gets the volume value for this ProductsProduct.
     * 
     * @return volume
     */
    public java.math.BigDecimal getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this ProductsProduct.
     * 
     * @param volume
     */
    public void setVolume(java.math.BigDecimal volume) {
        this.volume = volume;
    }


    /**
     * Gets the code value for this ProductsProduct.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ProductsProduct.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this ProductsProduct.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductsProduct.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the countryOfManufacture value for this ProductsProduct.
     * 
     * @return countryOfManufacture
     */
    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this ProductsProduct.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the unitPrice value for this ProductsProduct.
     * 
     * @return unitPrice
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ProductsProduct.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the unitPriceCurrency value for this ProductsProduct.
     * 
     * @return unitPriceCurrency
     */
    public String getUnitPriceCurrency() {
        return unitPriceCurrency;
    }


    /**
     * Sets the unitPriceCurrency value for this ProductsProduct.
     * 
     * @param unitPriceCurrency
     */
    public void setUnitPriceCurrency(String unitPriceCurrency) {
        this.unitPriceCurrency = unitPriceCurrency;
    }


    /**
     * Gets the hsTariffCode value for this ProductsProduct.
     * 
     * @return hsTariffCode
     */
    public String getHsTariffCode() {
        return hsTariffCode;
    }


    /**
     * Sets the hsTariffCode value for this ProductsProduct.
     * 
     * @param hsTariffCode
     */
    public void setHsTariffCode(String hsTariffCode) {
        this.hsTariffCode = hsTariffCode;
    }


    /**
     * Gets the direction value for this ProductsProduct.
     * 
     * @return direction
     */
    public com.paazl.soap.generated.DirectionType getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this ProductsProduct.
     * 
     * @param direction
     */
    public void setDirection(com.paazl.soap.generated.DirectionType direction) {
        this.direction = direction;
    }


    /**
     * Gets the processingDays value for this ProductsProduct.
     * 
     * @return processingDays
     */
    public org.apache.axis.types.NonNegativeInteger getProcessingDays() {
        return processingDays;
    }


    /**
     * Sets the processingDays value for this ProductsProduct.
     * 
     * @param processingDays
     */
    public void setProcessingDays(org.apache.axis.types.NonNegativeInteger processingDays) {
        this.processingDays = processingDays;
    }


    /**
     * Gets the promotionAbsolute value for this ProductsProduct.
     * 
     * @return promotionAbsolute
     */
    public Boolean getPromotionAbsolute() {
        return promotionAbsolute;
    }


    /**
     * Sets the promotionAbsolute value for this ProductsProduct.
     * 
     * @param promotionAbsolute
     */
    public void setPromotionAbsolute(Boolean promotionAbsolute) {
        this.promotionAbsolute = promotionAbsolute;
    }


    /**
     * Gets the promotion value for this ProductsProduct.
     * 
     * @return promotion
     */
    public java.math.BigDecimal getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this ProductsProduct.
     * 
     * @param promotion
     */
    public void setPromotion(java.math.BigDecimal promotion) {
        this.promotion = promotion;
    }


    /**
     * Gets the availableStores value for this ProductsProduct.
     * 
     * @return availableStores
     */
    public com.paazl.soap.generated.AvailableStoresStore[] getAvailableStores() {
        return availableStores;
    }


    /**
     * Sets the availableStores value for this ProductsProduct.
     * 
     * @param availableStores
     */
    public void setAvailableStores(com.paazl.soap.generated.AvailableStoresStore[] availableStores) {
        this.availableStores = availableStores;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProductsProduct)) return false;
        ProductsProduct other = (ProductsProduct) obj;
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
            ((this.matrix==null && other.getMatrix()==null) || 
             (this.matrix!=null &&
              this.matrix.equals(other.getMatrix()))) &&
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
              this.direction.equals(other.getDirection()))) &&
            ((this.processingDays==null && other.getProcessingDays()==null) || 
             (this.processingDays!=null &&
              this.processingDays.equals(other.getProcessingDays()))) &&
            ((this.promotionAbsolute==null && other.getPromotionAbsolute()==null) || 
             (this.promotionAbsolute!=null &&
              this.promotionAbsolute.equals(other.getPromotionAbsolute()))) &&
            ((this.promotion==null && other.getPromotion()==null) || 
             (this.promotion!=null &&
              this.promotion.equals(other.getPromotion()))) &&
            ((this.availableStores==null && other.getAvailableStores()==null) || 
             (this.availableStores!=null &&
              java.util.Arrays.equals(this.availableStores, other.getAvailableStores())));
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
        if (getMatrix() != null) {
            _hashCode += getMatrix().hashCode();
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
        if (getProcessingDays() != null) {
            _hashCode += getProcessingDays().hashCode();
        }
        if (getPromotionAbsolute() != null) {
            _hashCode += getPromotionAbsolute().hashCode();
        }
        if (getPromotion() != null) {
            _hashCode += getPromotion().hashCode();
        }
        if (getAvailableStores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableStores());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAvailableStores(), i);
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
        new org.apache.axis.description.TypeDesc(ProductsProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>products>product"));
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
        elemField.setFieldName("matrix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "processingDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionAbsolute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "promotionAbsolute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableStores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "availableStores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">availableStores"));
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
