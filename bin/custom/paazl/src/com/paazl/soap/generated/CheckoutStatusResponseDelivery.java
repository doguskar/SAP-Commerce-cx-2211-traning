/**
 * CheckoutStatusResponseDelivery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class CheckoutStatusResponseDelivery  implements java.io.Serializable {
    private com.paazl.soap.generated.DeliveryTypeType deliveryType;

    private String option;

    private String description;

    private java.math.BigDecimal rate;

    private Boolean cod;

    private Boolean insurance;

    private Boolean signatureRequired;

    private Boolean directDeliveryOnly;

    private String servicePointBasePostalCode;

    private String servicePointBaseCity;

    private com.paazl.soap.generated.ServicePointType servicePoint;

    private String servicePointAccountNumber;

    private java.util.Date preferredDeliveryDate;

    private com.paazl.soap.generated.OpenOrClosedTimeRangeType timeFrame;

    private com.paazl.soap.generated.NonNegativeIntegerRangeType transitDaysRange;

    private Boolean preferredDateChosen;

    public CheckoutStatusResponseDelivery() {
    }

    public CheckoutStatusResponseDelivery(
           com.paazl.soap.generated.DeliveryTypeType deliveryType,
           String option,
           String description,
           java.math.BigDecimal rate,
           Boolean cod,
           Boolean insurance,
           Boolean signatureRequired,
           Boolean directDeliveryOnly,
           String servicePointBasePostalCode,
           String servicePointBaseCity,
           com.paazl.soap.generated.ServicePointType servicePoint,
           String servicePointAccountNumber,
           java.util.Date preferredDeliveryDate,
           com.paazl.soap.generated.OpenOrClosedTimeRangeType timeFrame,
           com.paazl.soap.generated.NonNegativeIntegerRangeType transitDaysRange,
           Boolean preferredDateChosen) {
           this.deliveryType = deliveryType;
           this.option = option;
           this.description = description;
           this.rate = rate;
           this.cod = cod;
           this.insurance = insurance;
           this.signatureRequired = signatureRequired;
           this.directDeliveryOnly = directDeliveryOnly;
           this.servicePointBasePostalCode = servicePointBasePostalCode;
           this.servicePointBaseCity = servicePointBaseCity;
           this.servicePoint = servicePoint;
           this.servicePointAccountNumber = servicePointAccountNumber;
           this.preferredDeliveryDate = preferredDeliveryDate;
           this.timeFrame = timeFrame;
           this.transitDaysRange = transitDaysRange;
           this.preferredDateChosen = preferredDateChosen;
    }


    /**
     * Gets the deliveryType value for this CheckoutStatusResponseDelivery.
     * 
     * @return deliveryType
     */
    public com.paazl.soap.generated.DeliveryTypeType getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this CheckoutStatusResponseDelivery.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(com.paazl.soap.generated.DeliveryTypeType deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the option value for this CheckoutStatusResponseDelivery.
     * 
     * @return option
     */
    public String getOption() {
        return option;
    }


    /**
     * Sets the option value for this CheckoutStatusResponseDelivery.
     * 
     * @param option
     */
    public void setOption(String option) {
        this.option = option;
    }


    /**
     * Gets the description value for this CheckoutStatusResponseDelivery.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CheckoutStatusResponseDelivery.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the rate value for this CheckoutStatusResponseDelivery.
     * 
     * @return rate
     */
    public java.math.BigDecimal getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this CheckoutStatusResponseDelivery.
     * 
     * @param rate
     */
    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }


    /**
     * Gets the cod value for this CheckoutStatusResponseDelivery.
     * 
     * @return cod
     */
    public Boolean getCod() {
        return cod;
    }


    /**
     * Sets the cod value for this CheckoutStatusResponseDelivery.
     * 
     * @param cod
     */
    public void setCod(Boolean cod) {
        this.cod = cod;
    }


    /**
     * Gets the insurance value for this CheckoutStatusResponseDelivery.
     * 
     * @return insurance
     */
    public Boolean getInsurance() {
        return insurance;
    }


    /**
     * Sets the insurance value for this CheckoutStatusResponseDelivery.
     * 
     * @param insurance
     */
    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }


    /**
     * Gets the signatureRequired value for this CheckoutStatusResponseDelivery.
     * 
     * @return signatureRequired
     */
    public Boolean getSignatureRequired() {
        return signatureRequired;
    }


    /**
     * Sets the signatureRequired value for this CheckoutStatusResponseDelivery.
     * 
     * @param signatureRequired
     */
    public void setSignatureRequired(Boolean signatureRequired) {
        this.signatureRequired = signatureRequired;
    }


    /**
     * Gets the directDeliveryOnly value for this CheckoutStatusResponseDelivery.
     * 
     * @return directDeliveryOnly
     */
    public Boolean getDirectDeliveryOnly() {
        return directDeliveryOnly;
    }


    /**
     * Sets the directDeliveryOnly value for this CheckoutStatusResponseDelivery.
     * 
     * @param directDeliveryOnly
     */
    public void setDirectDeliveryOnly(Boolean directDeliveryOnly) {
        this.directDeliveryOnly = directDeliveryOnly;
    }


    /**
     * Gets the servicePointBasePostalCode value for this CheckoutStatusResponseDelivery.
     * 
     * @return servicePointBasePostalCode
     */
    public String getServicePointBasePostalCode() {
        return servicePointBasePostalCode;
    }


    /**
     * Sets the servicePointBasePostalCode value for this CheckoutStatusResponseDelivery.
     * 
     * @param servicePointBasePostalCode
     */
    public void setServicePointBasePostalCode(String servicePointBasePostalCode) {
        this.servicePointBasePostalCode = servicePointBasePostalCode;
    }


    /**
     * Gets the servicePointBaseCity value for this CheckoutStatusResponseDelivery.
     * 
     * @return servicePointBaseCity
     */
    public String getServicePointBaseCity() {
        return servicePointBaseCity;
    }


    /**
     * Sets the servicePointBaseCity value for this CheckoutStatusResponseDelivery.
     * 
     * @param servicePointBaseCity
     */
    public void setServicePointBaseCity(String servicePointBaseCity) {
        this.servicePointBaseCity = servicePointBaseCity;
    }


    /**
     * Gets the servicePoint value for this CheckoutStatusResponseDelivery.
     * 
     * @return servicePoint
     */
    public com.paazl.soap.generated.ServicePointType getServicePoint() {
        return servicePoint;
    }


    /**
     * Sets the servicePoint value for this CheckoutStatusResponseDelivery.
     * 
     * @param servicePoint
     */
    public void setServicePoint(com.paazl.soap.generated.ServicePointType servicePoint) {
        this.servicePoint = servicePoint;
    }


    /**
     * Gets the servicePointAccountNumber value for this CheckoutStatusResponseDelivery.
     * 
     * @return servicePointAccountNumber
     */
    public String getServicePointAccountNumber() {
        return servicePointAccountNumber;
    }


    /**
     * Sets the servicePointAccountNumber value for this CheckoutStatusResponseDelivery.
     * 
     * @param servicePointAccountNumber
     */
    public void setServicePointAccountNumber(String servicePointAccountNumber) {
        this.servicePointAccountNumber = servicePointAccountNumber;
    }


    /**
     * Gets the preferredDeliveryDate value for this CheckoutStatusResponseDelivery.
     * 
     * @return preferredDeliveryDate
     */
    public java.util.Date getPreferredDeliveryDate() {
        return preferredDeliveryDate;
    }


    /**
     * Sets the preferredDeliveryDate value for this CheckoutStatusResponseDelivery.
     * 
     * @param preferredDeliveryDate
     */
    public void setPreferredDeliveryDate(java.util.Date preferredDeliveryDate) {
        this.preferredDeliveryDate = preferredDeliveryDate;
    }


    /**
     * Gets the timeFrame value for this CheckoutStatusResponseDelivery.
     * 
     * @return timeFrame
     */
    public com.paazl.soap.generated.OpenOrClosedTimeRangeType getTimeFrame() {
        return timeFrame;
    }


    /**
     * Sets the timeFrame value for this CheckoutStatusResponseDelivery.
     * 
     * @param timeFrame
     */
    public void setTimeFrame(com.paazl.soap.generated.OpenOrClosedTimeRangeType timeFrame) {
        this.timeFrame = timeFrame;
    }


    /**
     * Gets the transitDaysRange value for this CheckoutStatusResponseDelivery.
     * 
     * @return transitDaysRange
     */
    public com.paazl.soap.generated.NonNegativeIntegerRangeType getTransitDaysRange() {
        return transitDaysRange;
    }


    /**
     * Sets the transitDaysRange value for this CheckoutStatusResponseDelivery.
     * 
     * @param transitDaysRange
     */
    public void setTransitDaysRange(com.paazl.soap.generated.NonNegativeIntegerRangeType transitDaysRange) {
        this.transitDaysRange = transitDaysRange;
    }


    /**
     * Gets the preferredDateChosen value for this CheckoutStatusResponseDelivery.
     * 
     * @return preferredDateChosen
     */
    public Boolean getPreferredDateChosen() {
        return preferredDateChosen;
    }


    /**
     * Sets the preferredDateChosen value for this CheckoutStatusResponseDelivery.
     * 
     * @param preferredDateChosen
     */
    public void setPreferredDateChosen(Boolean preferredDateChosen) {
        this.preferredDateChosen = preferredDateChosen;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckoutStatusResponseDelivery)) return false;
        CheckoutStatusResponseDelivery other = (CheckoutStatusResponseDelivery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.cod==null && other.getCod()==null) || 
             (this.cod!=null &&
              this.cod.equals(other.getCod()))) &&
            ((this.insurance==null && other.getInsurance()==null) || 
             (this.insurance!=null &&
              this.insurance.equals(other.getInsurance()))) &&
            ((this.signatureRequired==null && other.getSignatureRequired()==null) || 
             (this.signatureRequired!=null &&
              this.signatureRequired.equals(other.getSignatureRequired()))) &&
            ((this.directDeliveryOnly==null && other.getDirectDeliveryOnly()==null) || 
             (this.directDeliveryOnly!=null &&
              this.directDeliveryOnly.equals(other.getDirectDeliveryOnly()))) &&
            ((this.servicePointBasePostalCode==null && other.getServicePointBasePostalCode()==null) || 
             (this.servicePointBasePostalCode!=null &&
              this.servicePointBasePostalCode.equals(other.getServicePointBasePostalCode()))) &&
            ((this.servicePointBaseCity==null && other.getServicePointBaseCity()==null) || 
             (this.servicePointBaseCity!=null &&
              this.servicePointBaseCity.equals(other.getServicePointBaseCity()))) &&
            ((this.servicePoint==null && other.getServicePoint()==null) || 
             (this.servicePoint!=null &&
              this.servicePoint.equals(other.getServicePoint()))) &&
            ((this.servicePointAccountNumber==null && other.getServicePointAccountNumber()==null) || 
             (this.servicePointAccountNumber!=null &&
              this.servicePointAccountNumber.equals(other.getServicePointAccountNumber()))) &&
            ((this.preferredDeliveryDate==null && other.getPreferredDeliveryDate()==null) || 
             (this.preferredDeliveryDate!=null &&
              this.preferredDeliveryDate.equals(other.getPreferredDeliveryDate()))) &&
            ((this.timeFrame==null && other.getTimeFrame()==null) || 
             (this.timeFrame!=null &&
              this.timeFrame.equals(other.getTimeFrame()))) &&
            ((this.transitDaysRange==null && other.getTransitDaysRange()==null) || 
             (this.transitDaysRange!=null &&
              this.transitDaysRange.equals(other.getTransitDaysRange()))) &&
            ((this.preferredDateChosen==null && other.getPreferredDateChosen()==null) || 
             (this.preferredDateChosen!=null &&
              this.preferredDateChosen.equals(other.getPreferredDateChosen())));
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
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getCod() != null) {
            _hashCode += getCod().hashCode();
        }
        if (getInsurance() != null) {
            _hashCode += getInsurance().hashCode();
        }
        if (getSignatureRequired() != null) {
            _hashCode += getSignatureRequired().hashCode();
        }
        if (getDirectDeliveryOnly() != null) {
            _hashCode += getDirectDeliveryOnly().hashCode();
        }
        if (getServicePointBasePostalCode() != null) {
            _hashCode += getServicePointBasePostalCode().hashCode();
        }
        if (getServicePointBaseCity() != null) {
            _hashCode += getServicePointBaseCity().hashCode();
        }
        if (getServicePoint() != null) {
            _hashCode += getServicePoint().hashCode();
        }
        if (getServicePointAccountNumber() != null) {
            _hashCode += getServicePointAccountNumber().hashCode();
        }
        if (getPreferredDeliveryDate() != null) {
            _hashCode += getPreferredDeliveryDate().hashCode();
        }
        if (getTimeFrame() != null) {
            _hashCode += getTimeFrame().hashCode();
        }
        if (getTransitDaysRange() != null) {
            _hashCode += getTransitDaysRange().hashCode();
        }
        if (getPreferredDateChosen() != null) {
            _hashCode += getPreferredDateChosen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckoutStatusResponseDelivery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>checkoutStatusResponse>delivery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "option"));
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
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("signatureRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "signatureRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDeliveryOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "directDeliveryOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePointBasePostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointBasePostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePointBaseCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointBaseCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePointAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "preferredDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "timeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openOrClosedTimeRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitDaysRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "transitDaysRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nonNegativeIntegerRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredDateChosen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "preferredDateChosen"));
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
