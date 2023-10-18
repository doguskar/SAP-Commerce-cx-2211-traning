/**
 * ServicePointDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ServicePointDetailsType  implements java.io.Serializable {
    private String code;

    private String name;

    private String notificationEmail;

    private String notificationMobile;

    private com.paazl.soap.generated.AddressType address;

    public ServicePointDetailsType() {
    }

    public ServicePointDetailsType(
           String code,
           String name,
           String notificationEmail,
           String notificationMobile,
           com.paazl.soap.generated.AddressType address) {
           this.code = code;
           this.name = name;
           this.notificationEmail = notificationEmail;
           this.notificationMobile = notificationMobile;
           this.address = address;
    }


    /**
     * Gets the code value for this ServicePointDetailsType.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ServicePointDetailsType.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the name value for this ServicePointDetailsType.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this ServicePointDetailsType.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the notificationEmail value for this ServicePointDetailsType.
     * 
     * @return notificationEmail
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }


    /**
     * Sets the notificationEmail value for this ServicePointDetailsType.
     * 
     * @param notificationEmail
     */
    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }


    /**
     * Gets the notificationMobile value for this ServicePointDetailsType.
     * 
     * @return notificationMobile
     */
    public String getNotificationMobile() {
        return notificationMobile;
    }


    /**
     * Sets the notificationMobile value for this ServicePointDetailsType.
     * 
     * @param notificationMobile
     */
    public void setNotificationMobile(String notificationMobile) {
        this.notificationMobile = notificationMobile;
    }


    /**
     * Gets the address value for this ServicePointDetailsType.
     * 
     * @return address
     */
    public com.paazl.soap.generated.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ServicePointDetailsType.
     * 
     * @param address
     */
    public void setAddress(com.paazl.soap.generated.AddressType address) {
        this.address = address;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServicePointDetailsType)) return false;
        ServicePointDetailsType other = (ServicePointDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notificationEmail==null && other.getNotificationEmail()==null) || 
             (this.notificationEmail!=null &&
              this.notificationEmail.equals(other.getNotificationEmail()))) &&
            ((this.notificationMobile==null && other.getNotificationMobile()==null) || 
             (this.notificationMobile!=null &&
              this.notificationMobile.equals(other.getNotificationMobile()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotificationEmail() != null) {
            _hashCode += getNotificationEmail().hashCode();
        }
        if (getNotificationMobile() != null) {
            _hashCode += getNotificationMobile().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePointDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "notificationEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "notificationMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType"));
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
