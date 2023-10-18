/**
 * ShippingMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ShippingMethod  implements java.io.Serializable {
    private com.paazl.soap.generated.DeliveryTypeType type;

    private String distributor;

    private String contract;

    private String identifier;

    private String option;

    private com.paazl.soap.generated.ReturnContractType returnContract;

    private String servicepointAccountNumber;

    private String servicepointNotificationEmail;

    private String servicepointNotificationMobile;

    private Double price;

    private com.paazl.soap.generated.ShippingPaymentType shippingPaymentType;

    private String billingAccountNumber;

    private String invoiceNumber;

    private java.util.Date invoiceDate;

    private java.math.BigDecimal packagingWeight;

    private java.math.BigDecimal customsValue;

    private String customsValueCurrency;

    private com.paazl.soap.generated.DutiesPaymentType dutiesPaymentType;

    private String dutiesAccountNumber;

    private java.math.BigDecimal orderWeight;

    private Integer assuredAmount;

    private String assuredAmountCurrency;

    private Integer collo;

    private org.apache.axis.types.PositiveInteger packageCount;

    private Integer maxLabels;

    private com.paazl.soap.generated.PackagingTypeType packagingType;

    private java.util.Date preferredDeliveryDate;

    private Boolean preferredDateChosen;

    private String description;

    public ShippingMethod() {
    }

    public ShippingMethod(
           com.paazl.soap.generated.DeliveryTypeType type,
           String distributor,
           String contract,
           String identifier,
           String option,
           com.paazl.soap.generated.ReturnContractType returnContract,
           String servicepointAccountNumber,
           String servicepointNotificationEmail,
           String servicepointNotificationMobile,
           Double price,
           com.paazl.soap.generated.ShippingPaymentType shippingPaymentType,
           String billingAccountNumber,
           String invoiceNumber,
           java.util.Date invoiceDate,
           java.math.BigDecimal packagingWeight,
           java.math.BigDecimal customsValue,
           String customsValueCurrency,
           com.paazl.soap.generated.DutiesPaymentType dutiesPaymentType,
           String dutiesAccountNumber,
           java.math.BigDecimal orderWeight,
           Integer assuredAmount,
           String assuredAmountCurrency,
           Integer collo,
           org.apache.axis.types.PositiveInteger packageCount,
           Integer maxLabels,
           com.paazl.soap.generated.PackagingTypeType packagingType,
           java.util.Date preferredDeliveryDate,
           Boolean preferredDateChosen,
           String description) {
           this.type = type;
           this.distributor = distributor;
           this.contract = contract;
           this.identifier = identifier;
           this.option = option;
           this.returnContract = returnContract;
           this.servicepointAccountNumber = servicepointAccountNumber;
           this.servicepointNotificationEmail = servicepointNotificationEmail;
           this.servicepointNotificationMobile = servicepointNotificationMobile;
           this.price = price;
           this.shippingPaymentType = shippingPaymentType;
           this.billingAccountNumber = billingAccountNumber;
           this.invoiceNumber = invoiceNumber;
           this.invoiceDate = invoiceDate;
           this.packagingWeight = packagingWeight;
           this.customsValue = customsValue;
           this.customsValueCurrency = customsValueCurrency;
           this.dutiesPaymentType = dutiesPaymentType;
           this.dutiesAccountNumber = dutiesAccountNumber;
           this.orderWeight = orderWeight;
           this.assuredAmount = assuredAmount;
           this.assuredAmountCurrency = assuredAmountCurrency;
           this.collo = collo;
           this.packageCount = packageCount;
           this.maxLabels = maxLabels;
           this.packagingType = packagingType;
           this.preferredDeliveryDate = preferredDeliveryDate;
           this.preferredDateChosen = preferredDateChosen;
           this.description = description;
    }


    /**
     * Gets the type value for this ShippingMethod.
     * 
     * @return type
     */
    public com.paazl.soap.generated.DeliveryTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this ShippingMethod.
     * 
     * @param type
     */
    public void setType(com.paazl.soap.generated.DeliveryTypeType type) {
        this.type = type;
    }


    /**
     * Gets the distributor value for this ShippingMethod.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this ShippingMethod.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the contract value for this ShippingMethod.
     * 
     * @return contract
     */
    public String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this ShippingMethod.
     * 
     * @param contract
     */
    public void setContract(String contract) {
        this.contract = contract;
    }


    /**
     * Gets the identifier value for this ShippingMethod.
     * 
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this ShippingMethod.
     * 
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the option value for this ShippingMethod.
     * 
     * @return option
     */
    public String getOption() {
        return option;
    }


    /**
     * Sets the option value for this ShippingMethod.
     * 
     * @param option
     */
    public void setOption(String option) {
        this.option = option;
    }


    /**
     * Gets the returnContract value for this ShippingMethod.
     * 
     * @return returnContract
     */
    public com.paazl.soap.generated.ReturnContractType getReturnContract() {
        return returnContract;
    }


    /**
     * Sets the returnContract value for this ShippingMethod.
     * 
     * @param returnContract
     */
    public void setReturnContract(com.paazl.soap.generated.ReturnContractType returnContract) {
        this.returnContract = returnContract;
    }


    /**
     * Gets the servicepointAccountNumber value for this ShippingMethod.
     * 
     * @return servicepointAccountNumber
     */
    public String getServicepointAccountNumber() {
        return servicepointAccountNumber;
    }


    /**
     * Sets the servicepointAccountNumber value for this ShippingMethod.
     * 
     * @param servicepointAccountNumber
     */
    public void setServicepointAccountNumber(String servicepointAccountNumber) {
        this.servicepointAccountNumber = servicepointAccountNumber;
    }


    /**
     * Gets the servicepointNotificationEmail value for this ShippingMethod.
     * 
     * @return servicepointNotificationEmail
     */
    public String getServicepointNotificationEmail() {
        return servicepointNotificationEmail;
    }


    /**
     * Sets the servicepointNotificationEmail value for this ShippingMethod.
     * 
     * @param servicepointNotificationEmail
     */
    public void setServicepointNotificationEmail(String servicepointNotificationEmail) {
        this.servicepointNotificationEmail = servicepointNotificationEmail;
    }


    /**
     * Gets the servicepointNotificationMobile value for this ShippingMethod.
     * 
     * @return servicepointNotificationMobile
     */
    public String getServicepointNotificationMobile() {
        return servicepointNotificationMobile;
    }


    /**
     * Sets the servicepointNotificationMobile value for this ShippingMethod.
     * 
     * @param servicepointNotificationMobile
     */
    public void setServicepointNotificationMobile(String servicepointNotificationMobile) {
        this.servicepointNotificationMobile = servicepointNotificationMobile;
    }


    /**
     * Gets the price value for this ShippingMethod.
     * 
     * @return price
     */
    public Double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ShippingMethod.
     * 
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }


    /**
     * Gets the shippingPaymentType value for this ShippingMethod.
     * 
     * @return shippingPaymentType
     */
    public com.paazl.soap.generated.ShippingPaymentType getShippingPaymentType() {
        return shippingPaymentType;
    }


    /**
     * Sets the shippingPaymentType value for this ShippingMethod.
     * 
     * @param shippingPaymentType
     */
    public void setShippingPaymentType(com.paazl.soap.generated.ShippingPaymentType shippingPaymentType) {
        this.shippingPaymentType = shippingPaymentType;
    }


    /**
     * Gets the billingAccountNumber value for this ShippingMethod.
     * 
     * @return billingAccountNumber
     */
    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }


    /**
     * Sets the billingAccountNumber value for this ShippingMethod.
     * 
     * @param billingAccountNumber
     */
    public void setBillingAccountNumber(String billingAccountNumber) {
        this.billingAccountNumber = billingAccountNumber;
    }


    /**
     * Gets the invoiceNumber value for this ShippingMethod.
     * 
     * @return invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this ShippingMethod.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the invoiceDate value for this ShippingMethod.
     * 
     * @return invoiceDate
     */
    public java.util.Date getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this ShippingMethod.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.util.Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the packagingWeight value for this ShippingMethod.
     * 
     * @return packagingWeight
     */
    public java.math.BigDecimal getPackagingWeight() {
        return packagingWeight;
    }


    /**
     * Sets the packagingWeight value for this ShippingMethod.
     * 
     * @param packagingWeight
     */
    public void setPackagingWeight(java.math.BigDecimal packagingWeight) {
        this.packagingWeight = packagingWeight;
    }


    /**
     * Gets the customsValue value for this ShippingMethod.
     * 
     * @return customsValue
     */
    public java.math.BigDecimal getCustomsValue() {
        return customsValue;
    }


    /**
     * Sets the customsValue value for this ShippingMethod.
     * 
     * @param customsValue
     */
    public void setCustomsValue(java.math.BigDecimal customsValue) {
        this.customsValue = customsValue;
    }


    /**
     * Gets the customsValueCurrency value for this ShippingMethod.
     * 
     * @return customsValueCurrency
     */
    public String getCustomsValueCurrency() {
        return customsValueCurrency;
    }


    /**
     * Sets the customsValueCurrency value for this ShippingMethod.
     * 
     * @param customsValueCurrency
     */
    public void setCustomsValueCurrency(String customsValueCurrency) {
        this.customsValueCurrency = customsValueCurrency;
    }


    /**
     * Gets the dutiesPaymentType value for this ShippingMethod.
     * 
     * @return dutiesPaymentType
     */
    public com.paazl.soap.generated.DutiesPaymentType getDutiesPaymentType() {
        return dutiesPaymentType;
    }


    /**
     * Sets the dutiesPaymentType value for this ShippingMethod.
     * 
     * @param dutiesPaymentType
     */
    public void setDutiesPaymentType(com.paazl.soap.generated.DutiesPaymentType dutiesPaymentType) {
        this.dutiesPaymentType = dutiesPaymentType;
    }


    /**
     * Gets the dutiesAccountNumber value for this ShippingMethod.
     * 
     * @return dutiesAccountNumber
     */
    public String getDutiesAccountNumber() {
        return dutiesAccountNumber;
    }


    /**
     * Sets the dutiesAccountNumber value for this ShippingMethod.
     * 
     * @param dutiesAccountNumber
     */
    public void setDutiesAccountNumber(String dutiesAccountNumber) {
        this.dutiesAccountNumber = dutiesAccountNumber;
    }


    /**
     * Gets the orderWeight value for this ShippingMethod.
     * 
     * @return orderWeight
     */
    public java.math.BigDecimal getOrderWeight() {
        return orderWeight;
    }


    /**
     * Sets the orderWeight value for this ShippingMethod.
     * 
     * @param orderWeight
     */
    public void setOrderWeight(java.math.BigDecimal orderWeight) {
        this.orderWeight = orderWeight;
    }


    /**
     * Gets the assuredAmount value for this ShippingMethod.
     * 
     * @return assuredAmount
     */
    public Integer getAssuredAmount() {
        return assuredAmount;
    }


    /**
     * Sets the assuredAmount value for this ShippingMethod.
     * 
     * @param assuredAmount
     */
    public void setAssuredAmount(Integer assuredAmount) {
        this.assuredAmount = assuredAmount;
    }


    /**
     * Gets the assuredAmountCurrency value for this ShippingMethod.
     * 
     * @return assuredAmountCurrency
     */
    public String getAssuredAmountCurrency() {
        return assuredAmountCurrency;
    }


    /**
     * Sets the assuredAmountCurrency value for this ShippingMethod.
     * 
     * @param assuredAmountCurrency
     */
    public void setAssuredAmountCurrency(String assuredAmountCurrency) {
        this.assuredAmountCurrency = assuredAmountCurrency;
    }


    /**
     * Gets the collo value for this ShippingMethod.
     * 
     * @return collo
     */
    public Integer getCollo() {
        return collo;
    }


    /**
     * Sets the collo value for this ShippingMethod.
     * 
     * @param collo
     */
    public void setCollo(Integer collo) {
        this.collo = collo;
    }


    /**
     * Gets the packageCount value for this ShippingMethod.
     * 
     * @return packageCount
     */
    public org.apache.axis.types.PositiveInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this ShippingMethod.
     * 
     * @param packageCount
     */
    public void setPackageCount(org.apache.axis.types.PositiveInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the maxLabels value for this ShippingMethod.
     * 
     * @return maxLabels
     */
    public Integer getMaxLabels() {
        return maxLabels;
    }


    /**
     * Sets the maxLabels value for this ShippingMethod.
     * 
     * @param maxLabels
     */
    public void setMaxLabels(Integer maxLabels) {
        this.maxLabels = maxLabels;
    }


    /**
     * Gets the packagingType value for this ShippingMethod.
     * 
     * @return packagingType
     */
    public com.paazl.soap.generated.PackagingTypeType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this ShippingMethod.
     * 
     * @param packagingType
     */
    public void setPackagingType(com.paazl.soap.generated.PackagingTypeType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the preferredDeliveryDate value for this ShippingMethod.
     * 
     * @return preferredDeliveryDate
     */
    public java.util.Date getPreferredDeliveryDate() {
        return preferredDeliveryDate;
    }


    /**
     * Sets the preferredDeliveryDate value for this ShippingMethod.
     * 
     * @param preferredDeliveryDate
     */
    public void setPreferredDeliveryDate(java.util.Date preferredDeliveryDate) {
        this.preferredDeliveryDate = preferredDeliveryDate;
    }


    /**
     * Gets the preferredDateChosen value for this ShippingMethod.
     * 
     * @return preferredDateChosen
     */
    public Boolean getPreferredDateChosen() {
        return preferredDateChosen;
    }


    /**
     * Sets the preferredDateChosen value for this ShippingMethod.
     * 
     * @param preferredDateChosen
     */
    public void setPreferredDateChosen(Boolean preferredDateChosen) {
        this.preferredDateChosen = preferredDateChosen;
    }


    /**
     * Gets the description value for this ShippingMethod.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ShippingMethod.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingMethod)) return false;
        ShippingMethod other = (ShippingMethod) obj;
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
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            ((this.returnContract==null && other.getReturnContract()==null) || 
             (this.returnContract!=null &&
              this.returnContract.equals(other.getReturnContract()))) &&
            ((this.servicepointAccountNumber==null && other.getServicepointAccountNumber()==null) || 
             (this.servicepointAccountNumber!=null &&
              this.servicepointAccountNumber.equals(other.getServicepointAccountNumber()))) &&
            ((this.servicepointNotificationEmail==null && other.getServicepointNotificationEmail()==null) || 
             (this.servicepointNotificationEmail!=null &&
              this.servicepointNotificationEmail.equals(other.getServicepointNotificationEmail()))) &&
            ((this.servicepointNotificationMobile==null && other.getServicepointNotificationMobile()==null) || 
             (this.servicepointNotificationMobile!=null &&
              this.servicepointNotificationMobile.equals(other.getServicepointNotificationMobile()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.shippingPaymentType==null && other.getShippingPaymentType()==null) || 
             (this.shippingPaymentType!=null &&
              this.shippingPaymentType.equals(other.getShippingPaymentType()))) &&
            ((this.billingAccountNumber==null && other.getBillingAccountNumber()==null) || 
             (this.billingAccountNumber!=null &&
              this.billingAccountNumber.equals(other.getBillingAccountNumber()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.packagingWeight==null && other.getPackagingWeight()==null) || 
             (this.packagingWeight!=null &&
              this.packagingWeight.equals(other.getPackagingWeight()))) &&
            ((this.customsValue==null && other.getCustomsValue()==null) || 
             (this.customsValue!=null &&
              this.customsValue.equals(other.getCustomsValue()))) &&
            ((this.customsValueCurrency==null && other.getCustomsValueCurrency()==null) || 
             (this.customsValueCurrency!=null &&
              this.customsValueCurrency.equals(other.getCustomsValueCurrency()))) &&
            ((this.dutiesPaymentType==null && other.getDutiesPaymentType()==null) || 
             (this.dutiesPaymentType!=null &&
              this.dutiesPaymentType.equals(other.getDutiesPaymentType()))) &&
            ((this.dutiesAccountNumber==null && other.getDutiesAccountNumber()==null) || 
             (this.dutiesAccountNumber!=null &&
              this.dutiesAccountNumber.equals(other.getDutiesAccountNumber()))) &&
            ((this.orderWeight==null && other.getOrderWeight()==null) || 
             (this.orderWeight!=null &&
              this.orderWeight.equals(other.getOrderWeight()))) &&
            ((this.assuredAmount==null && other.getAssuredAmount()==null) || 
             (this.assuredAmount!=null &&
              this.assuredAmount.equals(other.getAssuredAmount()))) &&
            ((this.assuredAmountCurrency==null && other.getAssuredAmountCurrency()==null) || 
             (this.assuredAmountCurrency!=null &&
              this.assuredAmountCurrency.equals(other.getAssuredAmountCurrency()))) &&
            ((this.collo==null && other.getCollo()==null) || 
             (this.collo!=null &&
              this.collo.equals(other.getCollo()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.maxLabels==null && other.getMaxLabels()==null) || 
             (this.maxLabels!=null &&
              this.maxLabels.equals(other.getMaxLabels()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.preferredDeliveryDate==null && other.getPreferredDeliveryDate()==null) || 
             (this.preferredDeliveryDate!=null &&
              this.preferredDeliveryDate.equals(other.getPreferredDeliveryDate()))) &&
            ((this.preferredDateChosen==null && other.getPreferredDateChosen()==null) || 
             (this.preferredDateChosen!=null &&
              this.preferredDateChosen.equals(other.getPreferredDateChosen()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        if (getReturnContract() != null) {
            _hashCode += getReturnContract().hashCode();
        }
        if (getServicepointAccountNumber() != null) {
            _hashCode += getServicepointAccountNumber().hashCode();
        }
        if (getServicepointNotificationEmail() != null) {
            _hashCode += getServicepointNotificationEmail().hashCode();
        }
        if (getServicepointNotificationMobile() != null) {
            _hashCode += getServicepointNotificationMobile().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getShippingPaymentType() != null) {
            _hashCode += getShippingPaymentType().hashCode();
        }
        if (getBillingAccountNumber() != null) {
            _hashCode += getBillingAccountNumber().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getPackagingWeight() != null) {
            _hashCode += getPackagingWeight().hashCode();
        }
        if (getCustomsValue() != null) {
            _hashCode += getCustomsValue().hashCode();
        }
        if (getCustomsValueCurrency() != null) {
            _hashCode += getCustomsValueCurrency().hashCode();
        }
        if (getDutiesPaymentType() != null) {
            _hashCode += getDutiesPaymentType().hashCode();
        }
        if (getDutiesAccountNumber() != null) {
            _hashCode += getDutiesAccountNumber().hashCode();
        }
        if (getOrderWeight() != null) {
            _hashCode += getOrderWeight().hashCode();
        }
        if (getAssuredAmount() != null) {
            _hashCode += getAssuredAmount().hashCode();
        }
        if (getAssuredAmountCurrency() != null) {
            _hashCode += getAssuredAmountCurrency().hashCode();
        }
        if (getCollo() != null) {
            _hashCode += getCollo().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getMaxLabels() != null) {
            _hashCode += getMaxLabels().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getPreferredDeliveryDate() != null) {
            _hashCode += getPreferredDeliveryDate().hashCode();
        }
        if (getPreferredDateChosen() != null) {
            _hashCode += getPreferredDateChosen().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnContract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnContractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicepointAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicepointAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicepointNotificationEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicepointNotificationEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicepointNotificationMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicepointNotificationMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("shippingPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingPaymentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "billingAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "invoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "customsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nonNegativeDecimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsValueCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "customsValueCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiesPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dutiesPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dutiesPaymentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiesAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dutiesAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assuredAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "assuredAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assuredAmountCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "assuredAmountCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "collo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "maxLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingTypeType"));
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
        elemField.setFieldName("preferredDateChosen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "preferredDateChosen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
