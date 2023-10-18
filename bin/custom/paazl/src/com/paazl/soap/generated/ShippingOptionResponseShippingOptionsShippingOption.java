/**
 * ShippingOptionResponseShippingOptionsShippingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ShippingOptionResponseShippingOptionsShippingOption  implements java.io.Serializable {
    private String type;

    private String description;

    private long deliverySchemeLineId;

    private String distributor;

    private com.paazl.soap.generated.PartOfDayType partOfDay;

    private Double price;

    private Double priceDiscount;

    private com.paazl.soap.generated.DayOfWeekRangeType deliveryDayOfWeekRange;

    private org.apache.axis.types.Time deliveryWindowStart;

    private org.apache.axis.types.Time deliveryWindowEnd;

    private Boolean datePreference;

    private Boolean cod;

    private Boolean insurance;

    private Boolean needsServicePointAccountNumber;

    private Boolean shipperNotification;

    private Boolean needsAdditionalShipperNotification;

    private Boolean allowsAdditionalShipperNotification;

    private com.paazl.soap.generated.ServicePointsTypeServicePoint[] servicePoints;

    private com.paazl.soap.generated.DeliveryDatesType deliveryDates;

    private com.paazl.soap.generated.DeliveryDatesBySourceType[] deliveryDatesBySource;

    private String type2;  // attribute

    public ShippingOptionResponseShippingOptionsShippingOption() {
    }

    public ShippingOptionResponseShippingOptionsShippingOption(
           String type,
           String description,
           long deliverySchemeLineId,
           String distributor,
           com.paazl.soap.generated.PartOfDayType partOfDay,
           Double price,
           Double priceDiscount,
           com.paazl.soap.generated.DayOfWeekRangeType deliveryDayOfWeekRange,
           org.apache.axis.types.Time deliveryWindowStart,
           org.apache.axis.types.Time deliveryWindowEnd,
           Boolean datePreference,
           Boolean cod,
           Boolean insurance,
           Boolean needsServicePointAccountNumber,
           Boolean shipperNotification,
           Boolean needsAdditionalShipperNotification,
           Boolean allowsAdditionalShipperNotification,
           com.paazl.soap.generated.ServicePointsTypeServicePoint[] servicePoints,
           com.paazl.soap.generated.DeliveryDatesType deliveryDates,
           com.paazl.soap.generated.DeliveryDatesBySourceType[] deliveryDatesBySource,
           String type2) {
           this.type = type;
           this.description = description;
           this.deliverySchemeLineId = deliverySchemeLineId;
           this.distributor = distributor;
           this.partOfDay = partOfDay;
           this.price = price;
           this.priceDiscount = priceDiscount;
           this.deliveryDayOfWeekRange = deliveryDayOfWeekRange;
           this.deliveryWindowStart = deliveryWindowStart;
           this.deliveryWindowEnd = deliveryWindowEnd;
           this.datePreference = datePreference;
           this.cod = cod;
           this.insurance = insurance;
           this.needsServicePointAccountNumber = needsServicePointAccountNumber;
           this.shipperNotification = shipperNotification;
           this.needsAdditionalShipperNotification = needsAdditionalShipperNotification;
           this.allowsAdditionalShipperNotification = allowsAdditionalShipperNotification;
           this.servicePoints = servicePoints;
           this.deliveryDates = deliveryDates;
           this.deliveryDatesBySource = deliveryDatesBySource;
           this.type2 = type2;
    }


    /**
     * Gets the type value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the description value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the deliverySchemeLineId value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return deliverySchemeLineId
     */
    public long getDeliverySchemeLineId() {
        return deliverySchemeLineId;
    }


    /**
     * Sets the deliverySchemeLineId value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param deliverySchemeLineId
     */
    public void setDeliverySchemeLineId(long deliverySchemeLineId) {
        this.deliverySchemeLineId = deliverySchemeLineId;
    }


    /**
     * Gets the distributor value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the partOfDay value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return partOfDay
     */
    public com.paazl.soap.generated.PartOfDayType getPartOfDay() {
        return partOfDay;
    }


    /**
     * Sets the partOfDay value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param partOfDay
     */
    public void setPartOfDay(com.paazl.soap.generated.PartOfDayType partOfDay) {
        this.partOfDay = partOfDay;
    }


    /**
     * Gets the price value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return price
     */
    public Double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }


    /**
     * Gets the priceDiscount value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return priceDiscount
     */
    public Double getPriceDiscount() {
        return priceDiscount;
    }


    /**
     * Sets the priceDiscount value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param priceDiscount
     */
    public void setPriceDiscount(Double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }


    /**
     * Gets the deliveryDayOfWeekRange value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return deliveryDayOfWeekRange
     */
    public com.paazl.soap.generated.DayOfWeekRangeType getDeliveryDayOfWeekRange() {
        return deliveryDayOfWeekRange;
    }


    /**
     * Sets the deliveryDayOfWeekRange value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param deliveryDayOfWeekRange
     */
    public void setDeliveryDayOfWeekRange(com.paazl.soap.generated.DayOfWeekRangeType deliveryDayOfWeekRange) {
        this.deliveryDayOfWeekRange = deliveryDayOfWeekRange;
    }


    /**
     * Gets the deliveryWindowStart value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return deliveryWindowStart
     */
    public org.apache.axis.types.Time getDeliveryWindowStart() {
        return deliveryWindowStart;
    }


    /**
     * Sets the deliveryWindowStart value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param deliveryWindowStart
     */
    public void setDeliveryWindowStart(org.apache.axis.types.Time deliveryWindowStart) {
        this.deliveryWindowStart = deliveryWindowStart;
    }


    /**
     * Gets the deliveryWindowEnd value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return deliveryWindowEnd
     */
    public org.apache.axis.types.Time getDeliveryWindowEnd() {
        return deliveryWindowEnd;
    }


    /**
     * Sets the deliveryWindowEnd value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param deliveryWindowEnd
     */
    public void setDeliveryWindowEnd(org.apache.axis.types.Time deliveryWindowEnd) {
        this.deliveryWindowEnd = deliveryWindowEnd;
    }


    /**
     * Gets the datePreference value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return datePreference
     */
    public Boolean getDatePreference() {
        return datePreference;
    }


    /**
     * Sets the datePreference value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param datePreference
     */
    public void setDatePreference(Boolean datePreference) {
        this.datePreference = datePreference;
    }


    /**
     * Gets the cod value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return cod
     */
    public Boolean getCod() {
        return cod;
    }


    /**
     * Sets the cod value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param cod
     */
    public void setCod(Boolean cod) {
        this.cod = cod;
    }


    /**
     * Gets the insurance value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return insurance
     */
    public Boolean getInsurance() {
        return insurance;
    }


    /**
     * Sets the insurance value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param insurance
     */
    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }


    /**
     * Gets the needsServicePointAccountNumber value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return needsServicePointAccountNumber
     */
    public Boolean getNeedsServicePointAccountNumber() {
        return needsServicePointAccountNumber;
    }


    /**
     * Sets the needsServicePointAccountNumber value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param needsServicePointAccountNumber
     */
    public void setNeedsServicePointAccountNumber(Boolean needsServicePointAccountNumber) {
        this.needsServicePointAccountNumber = needsServicePointAccountNumber;
    }


    /**
     * Gets the shipperNotification value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return shipperNotification
     */
    public Boolean getShipperNotification() {
        return shipperNotification;
    }


    /**
     * Sets the shipperNotification value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param shipperNotification
     */
    public void setShipperNotification(Boolean shipperNotification) {
        this.shipperNotification = shipperNotification;
    }


    /**
     * Gets the needsAdditionalShipperNotification value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return needsAdditionalShipperNotification
     */
    public Boolean getNeedsAdditionalShipperNotification() {
        return needsAdditionalShipperNotification;
    }


    /**
     * Sets the needsAdditionalShipperNotification value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param needsAdditionalShipperNotification
     */
    public void setNeedsAdditionalShipperNotification(Boolean needsAdditionalShipperNotification) {
        this.needsAdditionalShipperNotification = needsAdditionalShipperNotification;
    }


    /**
     * Gets the allowsAdditionalShipperNotification value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return allowsAdditionalShipperNotification
     */
    public Boolean getAllowsAdditionalShipperNotification() {
        return allowsAdditionalShipperNotification;
    }


    /**
     * Sets the allowsAdditionalShipperNotification value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param allowsAdditionalShipperNotification
     */
    public void setAllowsAdditionalShipperNotification(Boolean allowsAdditionalShipperNotification) {
        this.allowsAdditionalShipperNotification = allowsAdditionalShipperNotification;
    }


    /**
     * Gets the servicePoints value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return servicePoints
     */
    public com.paazl.soap.generated.ServicePointsTypeServicePoint[] getServicePoints() {
        return servicePoints;
    }


    /**
     * Sets the servicePoints value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param servicePoints
     */
    public void setServicePoints(com.paazl.soap.generated.ServicePointsTypeServicePoint[] servicePoints) {
        this.servicePoints = servicePoints;
    }


    /**
     * Gets the deliveryDates value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return deliveryDates
     */
    public com.paazl.soap.generated.DeliveryDatesType getDeliveryDates() {
        return deliveryDates;
    }


    /**
     * Sets the deliveryDates value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param deliveryDates
     */
    public void setDeliveryDates(com.paazl.soap.generated.DeliveryDatesType deliveryDates) {
        this.deliveryDates = deliveryDates;
    }


    /**
     * Gets the deliveryDatesBySource value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return deliveryDatesBySource
     */
    public com.paazl.soap.generated.DeliveryDatesBySourceType[] getDeliveryDatesBySource() {
        return deliveryDatesBySource;
    }


    /**
     * Sets the deliveryDatesBySource value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param deliveryDatesBySource
     */
    public void setDeliveryDatesBySource(com.paazl.soap.generated.DeliveryDatesBySourceType[] deliveryDatesBySource) {
        this.deliveryDatesBySource = deliveryDatesBySource;
    }

    public com.paazl.soap.generated.DeliveryDatesBySourceType getDeliveryDatesBySource(int i) {
        return this.deliveryDatesBySource[i];
    }

    public void setDeliveryDatesBySource(int i, com.paazl.soap.generated.DeliveryDatesBySourceType _value) {
        this.deliveryDatesBySource[i] = _value;
    }


    /**
     * Gets the type2 value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @return type2
     */
    public String getType2() {
        return type2;
    }


    /**
     * Sets the type2 value for this ShippingOptionResponseShippingOptionsShippingOption.
     * 
     * @param type2
     */
    public void setType2(String type2) {
        this.type2 = type2;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingOptionResponseShippingOptionsShippingOption)) return false;
        ShippingOptionResponseShippingOptionsShippingOption other = (ShippingOptionResponseShippingOptionsShippingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.deliverySchemeLineId == other.getDeliverySchemeLineId() &&
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.partOfDay==null && other.getPartOfDay()==null) || 
             (this.partOfDay!=null &&
              this.partOfDay.equals(other.getPartOfDay()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceDiscount==null && other.getPriceDiscount()==null) || 
             (this.priceDiscount!=null &&
              this.priceDiscount.equals(other.getPriceDiscount()))) &&
            ((this.deliveryDayOfWeekRange==null && other.getDeliveryDayOfWeekRange()==null) || 
             (this.deliveryDayOfWeekRange!=null &&
              this.deliveryDayOfWeekRange.equals(other.getDeliveryDayOfWeekRange()))) &&
            ((this.deliveryWindowStart==null && other.getDeliveryWindowStart()==null) || 
             (this.deliveryWindowStart!=null &&
              this.deliveryWindowStart.equals(other.getDeliveryWindowStart()))) &&
            ((this.deliveryWindowEnd==null && other.getDeliveryWindowEnd()==null) || 
             (this.deliveryWindowEnd!=null &&
              this.deliveryWindowEnd.equals(other.getDeliveryWindowEnd()))) &&
            ((this.datePreference==null && other.getDatePreference()==null) || 
             (this.datePreference!=null &&
              this.datePreference.equals(other.getDatePreference()))) &&
            ((this.cod==null && other.getCod()==null) || 
             (this.cod!=null &&
              this.cod.equals(other.getCod()))) &&
            ((this.insurance==null && other.getInsurance()==null) || 
             (this.insurance!=null &&
              this.insurance.equals(other.getInsurance()))) &&
            ((this.needsServicePointAccountNumber==null && other.getNeedsServicePointAccountNumber()==null) || 
             (this.needsServicePointAccountNumber!=null &&
              this.needsServicePointAccountNumber.equals(other.getNeedsServicePointAccountNumber()))) &&
            ((this.shipperNotification==null && other.getShipperNotification()==null) || 
             (this.shipperNotification!=null &&
              this.shipperNotification.equals(other.getShipperNotification()))) &&
            ((this.needsAdditionalShipperNotification==null && other.getNeedsAdditionalShipperNotification()==null) || 
             (this.needsAdditionalShipperNotification!=null &&
              this.needsAdditionalShipperNotification.equals(other.getNeedsAdditionalShipperNotification()))) &&
            ((this.allowsAdditionalShipperNotification==null && other.getAllowsAdditionalShipperNotification()==null) || 
             (this.allowsAdditionalShipperNotification!=null &&
              this.allowsAdditionalShipperNotification.equals(other.getAllowsAdditionalShipperNotification()))) &&
            ((this.servicePoints==null && other.getServicePoints()==null) || 
             (this.servicePoints!=null &&
              java.util.Arrays.equals(this.servicePoints, other.getServicePoints()))) &&
            ((this.deliveryDates==null && other.getDeliveryDates()==null) || 
             (this.deliveryDates!=null &&
              this.deliveryDates.equals(other.getDeliveryDates()))) &&
            ((this.deliveryDatesBySource==null && other.getDeliveryDatesBySource()==null) || 
             (this.deliveryDatesBySource!=null &&
              java.util.Arrays.equals(this.deliveryDatesBySource, other.getDeliveryDatesBySource()))) &&
            ((this.type2==null && other.getType2()==null) || 
             (this.type2!=null &&
              this.type2.equals(other.getType2())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Long(getDeliverySchemeLineId()).hashCode();
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getPartOfDay() != null) {
            _hashCode += getPartOfDay().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceDiscount() != null) {
            _hashCode += getPriceDiscount().hashCode();
        }
        if (getDeliveryDayOfWeekRange() != null) {
            _hashCode += getDeliveryDayOfWeekRange().hashCode();
        }
        if (getDeliveryWindowStart() != null) {
            _hashCode += getDeliveryWindowStart().hashCode();
        }
        if (getDeliveryWindowEnd() != null) {
            _hashCode += getDeliveryWindowEnd().hashCode();
        }
        if (getDatePreference() != null) {
            _hashCode += getDatePreference().hashCode();
        }
        if (getCod() != null) {
            _hashCode += getCod().hashCode();
        }
        if (getInsurance() != null) {
            _hashCode += getInsurance().hashCode();
        }
        if (getNeedsServicePointAccountNumber() != null) {
            _hashCode += getNeedsServicePointAccountNumber().hashCode();
        }
        if (getShipperNotification() != null) {
            _hashCode += getShipperNotification().hashCode();
        }
        if (getNeedsAdditionalShipperNotification() != null) {
            _hashCode += getNeedsAdditionalShipperNotification().hashCode();
        }
        if (getAllowsAdditionalShipperNotification() != null) {
            _hashCode += getAllowsAdditionalShipperNotification().hashCode();
        }
        if (getServicePoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicePoints());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServicePoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryDates() != null) {
            _hashCode += getDeliveryDates().hashCode();
        }
        if (getDeliveryDatesBySource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryDatesBySource());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryDatesBySource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType2() != null) {
            _hashCode += getType2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingOptionResponseShippingOptionsShippingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>shippingOptionResponse>shippingOptions>shippingOption"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverySchemeLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliverySchemeLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partOfDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "partOfDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "partOfDayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "priceDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDayOfWeekRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDayOfWeekRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dayOfWeekRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryWindowStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryWindowStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryWindowEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryWindowEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "datePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "cod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "insurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needsServicePointAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "needsServicePointAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needsAdditionalShipperNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "needsAdditionalShipperNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowsAdditionalShipperNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "allowsAdditionalShipperNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsType>servicePoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePoint"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDatesBySource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesBySource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesBySourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
