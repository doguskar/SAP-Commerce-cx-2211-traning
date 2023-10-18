/**
 * PickupRequestOptionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class PickupRequestOptionsRequest  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private String hash;

    private Long targetWebshop;

    private String internalReference;

    private String pickupCountry;

    private String deliveryCountry;

    public PickupRequestOptionsRequest() {
    }

    public PickupRequestOptionsRequest(
           long webshop,
           String hash,
           Long targetWebshop,
           String internalReference,
           String pickupCountry,
           String deliveryCountry) {
        super(
            webshop);
        this.hash = hash;
        this.targetWebshop = targetWebshop;
        this.internalReference = internalReference;
        this.pickupCountry = pickupCountry;
        this.deliveryCountry = deliveryCountry;
    }


    /**
     * Gets the hash value for this PickupRequestOptionsRequest.
     * 
     * @return hash
     */
    public String getHash() {
        return hash;
    }


    /**
     * Sets the hash value for this PickupRequestOptionsRequest.
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }


    /**
     * Gets the targetWebshop value for this PickupRequestOptionsRequest.
     * 
     * @return targetWebshop
     */
    public Long getTargetWebshop() {
        return targetWebshop;
    }


    /**
     * Sets the targetWebshop value for this PickupRequestOptionsRequest.
     * 
     * @param targetWebshop
     */
    public void setTargetWebshop(Long targetWebshop) {
        this.targetWebshop = targetWebshop;
    }


    /**
     * Gets the internalReference value for this PickupRequestOptionsRequest.
     * 
     * @return internalReference
     */
    public String getInternalReference() {
        return internalReference;
    }


    /**
     * Sets the internalReference value for this PickupRequestOptionsRequest.
     * 
     * @param internalReference
     */
    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }


    /**
     * Gets the pickupCountry value for this PickupRequestOptionsRequest.
     * 
     * @return pickupCountry
     */
    public String getPickupCountry() {
        return pickupCountry;
    }


    /**
     * Sets the pickupCountry value for this PickupRequestOptionsRequest.
     * 
     * @param pickupCountry
     */
    public void setPickupCountry(String pickupCountry) {
        this.pickupCountry = pickupCountry;
    }


    /**
     * Gets the deliveryCountry value for this PickupRequestOptionsRequest.
     * 
     * @return deliveryCountry
     */
    public String getDeliveryCountry() {
        return deliveryCountry;
    }


    /**
     * Sets the deliveryCountry value for this PickupRequestOptionsRequest.
     * 
     * @param deliveryCountry
     */
    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PickupRequestOptionsRequest)) return false;
        PickupRequestOptionsRequest other = (PickupRequestOptionsRequest) obj;
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
            ((this.internalReference==null && other.getInternalReference()==null) || 
             (this.internalReference!=null &&
              this.internalReference.equals(other.getInternalReference()))) &&
            ((this.pickupCountry==null && other.getPickupCountry()==null) || 
             (this.pickupCountry!=null &&
              this.pickupCountry.equals(other.getPickupCountry()))) &&
            ((this.deliveryCountry==null && other.getDeliveryCountry()==null) || 
             (this.deliveryCountry!=null &&
              this.deliveryCountry.equals(other.getDeliveryCountry())));
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
        if (getInternalReference() != null) {
            _hashCode += getInternalReference().hashCode();
        }
        if (getPickupCountry() != null) {
            _hashCode += getPickupCountry().hashCode();
        }
        if (getDeliveryCountry() != null) {
            _hashCode += getDeliveryCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupRequestOptionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestOptionsRequest"));
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
        elemField.setFieldName("internalReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "internalReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryCountry"));
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
