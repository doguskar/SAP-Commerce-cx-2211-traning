/**
 * CheckoutStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class CheckoutStatusResponse  implements java.io.Serializable {
    private com.paazl.soap.generated.ErrorType error;

    private org.apache.axis.types.Language locale;

    private org.apache.axis.types.URI callbackUrl;

    private com.paazl.soap.generated.CheckoutStatusResponseConsignee consignee;

    private com.paazl.soap.generated.CheckoutStatusResponseDelivery delivery;

    private com.paazl.soap.generated.CheckoutStatusResponseNotification notification;

    public CheckoutStatusResponse() {
    }

    public CheckoutStatusResponse(
           com.paazl.soap.generated.ErrorType error,
           org.apache.axis.types.Language locale,
           org.apache.axis.types.URI callbackUrl,
           com.paazl.soap.generated.CheckoutStatusResponseConsignee consignee,
           com.paazl.soap.generated.CheckoutStatusResponseDelivery delivery,
           com.paazl.soap.generated.CheckoutStatusResponseNotification notification) {
           this.error = error;
           this.locale = locale;
           this.callbackUrl = callbackUrl;
           this.consignee = consignee;
           this.delivery = delivery;
           this.notification = notification;
    }


    /**
     * Gets the error value for this CheckoutStatusResponse.
     * 
     * @return error
     */
    public com.paazl.soap.generated.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this CheckoutStatusResponse.
     * 
     * @param error
     */
    public void setError(com.paazl.soap.generated.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the locale value for this CheckoutStatusResponse.
     * 
     * @return locale
     */
    public org.apache.axis.types.Language getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this CheckoutStatusResponse.
     * 
     * @param locale
     */
    public void setLocale(org.apache.axis.types.Language locale) {
        this.locale = locale;
    }


    /**
     * Gets the callbackUrl value for this CheckoutStatusResponse.
     * 
     * @return callbackUrl
     */
    public org.apache.axis.types.URI getCallbackUrl() {
        return callbackUrl;
    }


    /**
     * Sets the callbackUrl value for this CheckoutStatusResponse.
     * 
     * @param callbackUrl
     */
    public void setCallbackUrl(org.apache.axis.types.URI callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


    /**
     * Gets the consignee value for this CheckoutStatusResponse.
     * 
     * @return consignee
     */
    public com.paazl.soap.generated.CheckoutStatusResponseConsignee getConsignee() {
        return consignee;
    }


    /**
     * Sets the consignee value for this CheckoutStatusResponse.
     * 
     * @param consignee
     */
    public void setConsignee(com.paazl.soap.generated.CheckoutStatusResponseConsignee consignee) {
        this.consignee = consignee;
    }


    /**
     * Gets the delivery value for this CheckoutStatusResponse.
     * 
     * @return delivery
     */
    public com.paazl.soap.generated.CheckoutStatusResponseDelivery getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this CheckoutStatusResponse.
     * 
     * @param delivery
     */
    public void setDelivery(com.paazl.soap.generated.CheckoutStatusResponseDelivery delivery) {
        this.delivery = delivery;
    }


    /**
     * Gets the notification value for this CheckoutStatusResponse.
     * 
     * @return notification
     */
    public com.paazl.soap.generated.CheckoutStatusResponseNotification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this CheckoutStatusResponse.
     * 
     * @param notification
     */
    public void setNotification(com.paazl.soap.generated.CheckoutStatusResponseNotification notification) {
        this.notification = notification;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckoutStatusResponse)) return false;
        CheckoutStatusResponse other = (CheckoutStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.callbackUrl==null && other.getCallbackUrl()==null) || 
             (this.callbackUrl!=null &&
              this.callbackUrl.equals(other.getCallbackUrl()))) &&
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee()))) &&
            ((this.delivery==null && other.getDelivery()==null) || 
             (this.delivery!=null &&
              this.delivery.equals(other.getDelivery()))) &&
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification())));
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getCallbackUrl() != null) {
            _hashCode += getCallbackUrl().hashCode();
        }
        if (getConsignee() != null) {
            _hashCode += getConsignee().hashCode();
        }
        if (getDelivery() != null) {
            _hashCode += getDelivery().hashCode();
        }
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckoutStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">checkoutStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "callbackUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "consignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>checkoutStatusResponse>consignee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "delivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>checkoutStatusResponse>delivery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>checkoutStatusResponse>notification"));
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
