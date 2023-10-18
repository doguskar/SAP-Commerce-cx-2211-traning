/**
 * OrdersTypeOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrdersTypeOrder  implements java.io.Serializable {
    private java.util.Calendar createDate;

    private java.util.Calendar lastModificationDate;

    private String orderReference;

    private com.paazl.soap.generated.OrderStatusType status;

    private String distributor;

    private String shippingOption;

    private String companyName;

    private String vatNumber;

    private String name;

    private String nameOther;

    private com.paazl.soap.generated.AddressType shipToAddress;

    private com.paazl.soap.generated.ServicePointDetailsType servicePointDetails;

    private String emailAddress;

    private String phoneNumber;

    private java.util.Calendar expectedDeliveryDate;

    private com.paazl.soap.generated.TimeRangeType expectedDeliveryTimeFrame;

    private java.util.Date preferredDeliveryDate;

    private Boolean preferredDateChosen;

    private com.paazl.soap.generated.OrdersTypeOrderLabel[] label;

    public OrdersTypeOrder() {
    }

    public OrdersTypeOrder(
           java.util.Calendar createDate,
           java.util.Calendar lastModificationDate,
           String orderReference,
           com.paazl.soap.generated.OrderStatusType status,
           String distributor,
           String shippingOption,
           String companyName,
           String vatNumber,
           String name,
           String nameOther,
           com.paazl.soap.generated.AddressType shipToAddress,
           com.paazl.soap.generated.ServicePointDetailsType servicePointDetails,
           String emailAddress,
           String phoneNumber,
           java.util.Calendar expectedDeliveryDate,
           com.paazl.soap.generated.TimeRangeType expectedDeliveryTimeFrame,
           java.util.Date preferredDeliveryDate,
           Boolean preferredDateChosen,
           com.paazl.soap.generated.OrdersTypeOrderLabel[] label) {
           this.createDate = createDate;
           this.lastModificationDate = lastModificationDate;
           this.orderReference = orderReference;
           this.status = status;
           this.distributor = distributor;
           this.shippingOption = shippingOption;
           this.companyName = companyName;
           this.vatNumber = vatNumber;
           this.name = name;
           this.nameOther = nameOther;
           this.shipToAddress = shipToAddress;
           this.servicePointDetails = servicePointDetails;
           this.emailAddress = emailAddress;
           this.phoneNumber = phoneNumber;
           this.expectedDeliveryDate = expectedDeliveryDate;
           this.expectedDeliveryTimeFrame = expectedDeliveryTimeFrame;
           this.preferredDeliveryDate = preferredDeliveryDate;
           this.preferredDateChosen = preferredDateChosen;
           this.label = label;
    }


    /**
     * Gets the createDate value for this OrdersTypeOrder.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this OrdersTypeOrder.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the lastModificationDate value for this OrdersTypeOrder.
     * 
     * @return lastModificationDate
     */
    public java.util.Calendar getLastModificationDate() {
        return lastModificationDate;
    }


    /**
     * Sets the lastModificationDate value for this OrdersTypeOrder.
     * 
     * @param lastModificationDate
     */
    public void setLastModificationDate(java.util.Calendar lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }


    /**
     * Gets the orderReference value for this OrdersTypeOrder.
     * 
     * @return orderReference
     */
    public String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this OrdersTypeOrder.
     * 
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the status value for this OrdersTypeOrder.
     * 
     * @return status
     */
    public com.paazl.soap.generated.OrderStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrdersTypeOrder.
     * 
     * @param status
     */
    public void setStatus(com.paazl.soap.generated.OrderStatusType status) {
        this.status = status;
    }


    /**
     * Gets the distributor value for this OrdersTypeOrder.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this OrdersTypeOrder.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the shippingOption value for this OrdersTypeOrder.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this OrdersTypeOrder.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the companyName value for this OrdersTypeOrder.
     * 
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this OrdersTypeOrder.
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the vatNumber value for this OrdersTypeOrder.
     * 
     * @return vatNumber
     */
    public String getVatNumber() {
        return vatNumber;
    }


    /**
     * Sets the vatNumber value for this OrdersTypeOrder.
     * 
     * @param vatNumber
     */
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }


    /**
     * Gets the name value for this OrdersTypeOrder.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this OrdersTypeOrder.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the nameOther value for this OrdersTypeOrder.
     * 
     * @return nameOther
     */
    public String getNameOther() {
        return nameOther;
    }


    /**
     * Sets the nameOther value for this OrdersTypeOrder.
     * 
     * @param nameOther
     */
    public void setNameOther(String nameOther) {
        this.nameOther = nameOther;
    }


    /**
     * Gets the shipToAddress value for this OrdersTypeOrder.
     * 
     * @return shipToAddress
     */
    public com.paazl.soap.generated.AddressType getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this OrdersTypeOrder.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(com.paazl.soap.generated.AddressType shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the servicePointDetails value for this OrdersTypeOrder.
     * 
     * @return servicePointDetails
     */
    public com.paazl.soap.generated.ServicePointDetailsType getServicePointDetails() {
        return servicePointDetails;
    }


    /**
     * Sets the servicePointDetails value for this OrdersTypeOrder.
     * 
     * @param servicePointDetails
     */
    public void setServicePointDetails(com.paazl.soap.generated.ServicePointDetailsType servicePointDetails) {
        this.servicePointDetails = servicePointDetails;
    }


    /**
     * Gets the emailAddress value for this OrdersTypeOrder.
     * 
     * @return emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this OrdersTypeOrder.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the phoneNumber value for this OrdersTypeOrder.
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this OrdersTypeOrder.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the expectedDeliveryDate value for this OrdersTypeOrder.
     * 
     * @return expectedDeliveryDate
     */
    public java.util.Calendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }


    /**
     * Sets the expectedDeliveryDate value for this OrdersTypeOrder.
     * 
     * @param expectedDeliveryDate
     */
    public void setExpectedDeliveryDate(java.util.Calendar expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    /**
     * Gets the expectedDeliveryTimeFrame value for this OrdersTypeOrder.
     * 
     * @return expectedDeliveryTimeFrame
     */
    public com.paazl.soap.generated.TimeRangeType getExpectedDeliveryTimeFrame() {
        return expectedDeliveryTimeFrame;
    }


    /**
     * Sets the expectedDeliveryTimeFrame value for this OrdersTypeOrder.
     * 
     * @param expectedDeliveryTimeFrame
     */
    public void setExpectedDeliveryTimeFrame(com.paazl.soap.generated.TimeRangeType expectedDeliveryTimeFrame) {
        this.expectedDeliveryTimeFrame = expectedDeliveryTimeFrame;
    }


    /**
     * Gets the preferredDeliveryDate value for this OrdersTypeOrder.
     * 
     * @return preferredDeliveryDate
     */
    public java.util.Date getPreferredDeliveryDate() {
        return preferredDeliveryDate;
    }


    /**
     * Sets the preferredDeliveryDate value for this OrdersTypeOrder.
     * 
     * @param preferredDeliveryDate
     */
    public void setPreferredDeliveryDate(java.util.Date preferredDeliveryDate) {
        this.preferredDeliveryDate = preferredDeliveryDate;
    }


    /**
     * Gets the preferredDateChosen value for this OrdersTypeOrder.
     * 
     * @return preferredDateChosen
     */
    public Boolean getPreferredDateChosen() {
        return preferredDateChosen;
    }


    /**
     * Sets the preferredDateChosen value for this OrdersTypeOrder.
     * 
     * @param preferredDateChosen
     */
    public void setPreferredDateChosen(Boolean preferredDateChosen) {
        this.preferredDateChosen = preferredDateChosen;
    }


    /**
     * Gets the label value for this OrdersTypeOrder.
     * 
     * @return label
     */
    public com.paazl.soap.generated.OrdersTypeOrderLabel[] getLabel() {
        return label;
    }


    /**
     * Sets the label value for this OrdersTypeOrder.
     * 
     * @param label
     */
    public void setLabel(com.paazl.soap.generated.OrdersTypeOrderLabel[] label) {
        this.label = label;
    }

    public com.paazl.soap.generated.OrdersTypeOrderLabel getLabel(int i) {
        return this.label[i];
    }

    public void setLabel(int i, com.paazl.soap.generated.OrdersTypeOrderLabel _value) {
        this.label[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrdersTypeOrder)) return false;
        OrdersTypeOrder other = (OrdersTypeOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.lastModificationDate==null && other.getLastModificationDate()==null) || 
             (this.lastModificationDate!=null &&
              this.lastModificationDate.equals(other.getLastModificationDate()))) &&
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.vatNumber==null && other.getVatNumber()==null) || 
             (this.vatNumber!=null &&
              this.vatNumber.equals(other.getVatNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameOther==null && other.getNameOther()==null) || 
             (this.nameOther!=null &&
              this.nameOther.equals(other.getNameOther()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.servicePointDetails==null && other.getServicePointDetails()==null) || 
             (this.servicePointDetails!=null &&
              this.servicePointDetails.equals(other.getServicePointDetails()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.expectedDeliveryDate==null && other.getExpectedDeliveryDate()==null) || 
             (this.expectedDeliveryDate!=null &&
              this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate()))) &&
            ((this.expectedDeliveryTimeFrame==null && other.getExpectedDeliveryTimeFrame()==null) || 
             (this.expectedDeliveryTimeFrame!=null &&
              this.expectedDeliveryTimeFrame.equals(other.getExpectedDeliveryTimeFrame()))) &&
            ((this.preferredDeliveryDate==null && other.getPreferredDeliveryDate()==null) || 
             (this.preferredDeliveryDate!=null &&
              this.preferredDeliveryDate.equals(other.getPreferredDeliveryDate()))) &&
            ((this.preferredDateChosen==null && other.getPreferredDateChosen()==null) || 
             (this.preferredDateChosen!=null &&
              this.preferredDateChosen.equals(other.getPreferredDateChosen()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              java.util.Arrays.equals(this.label, other.getLabel())));
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getLastModificationDate() != null) {
            _hashCode += getLastModificationDate().hashCode();
        }
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getVatNumber() != null) {
            _hashCode += getVatNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameOther() != null) {
            _hashCode += getNameOther().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getServicePointDetails() != null) {
            _hashCode += getServicePointDetails().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getExpectedDeliveryDate() != null) {
            _hashCode += getExpectedDeliveryDate().hashCode();
        }
        if (getExpectedDeliveryTimeFrame() != null) {
            _hashCode += getExpectedDeliveryTimeFrame().hashCode();
        }
        if (getPreferredDeliveryDate() != null) {
            _hashCode += getPreferredDeliveryDate().hashCode();
        }
        if (getPreferredDateChosen() != null) {
            _hashCode += getPreferredDateChosen().hashCode();
        }
        if (getLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLabel(), i);
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
        new org.apache.axis.description.TypeDesc(OrdersTypeOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersType>order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "lastModificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distributor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "vatNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOther");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nameOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePointDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "expectedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "expectedDeliveryTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "timeRangeType"));
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
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>ordersType>order>label"));
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
