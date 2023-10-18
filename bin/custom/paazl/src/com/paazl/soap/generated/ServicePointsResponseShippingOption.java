/**
 * ServicePointsResponseShippingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ServicePointsResponseShippingOption  implements java.io.Serializable {
    private String distributor;

    private String shippingOption;

    private com.paazl.soap.generated.ServicePointType[] servicePoint;

    public ServicePointsResponseShippingOption() {
    }

    public ServicePointsResponseShippingOption(
           String distributor,
           String shippingOption,
           com.paazl.soap.generated.ServicePointType[] servicePoint) {
           this.distributor = distributor;
           this.shippingOption = shippingOption;
           this.servicePoint = servicePoint;
    }


    /**
     * Gets the distributor value for this ServicePointsResponseShippingOption.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this ServicePointsResponseShippingOption.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the shippingOption value for this ServicePointsResponseShippingOption.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this ServicePointsResponseShippingOption.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the servicePoint value for this ServicePointsResponseShippingOption.
     * 
     * @return servicePoint
     */
    public com.paazl.soap.generated.ServicePointType[] getServicePoint() {
        return servicePoint;
    }


    /**
     * Sets the servicePoint value for this ServicePointsResponseShippingOption.
     * 
     * @param servicePoint
     */
    public void setServicePoint(com.paazl.soap.generated.ServicePointType[] servicePoint) {
        this.servicePoint = servicePoint;
    }

    public com.paazl.soap.generated.ServicePointType getServicePoint(int i) {
        return this.servicePoint[i];
    }

    public void setServicePoint(int i, com.paazl.soap.generated.ServicePointType _value) {
        this.servicePoint[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServicePointsResponseShippingOption)) return false;
        ServicePointsResponseShippingOption other = (ServicePointsResponseShippingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributor==null && other.getDistributor()==null) || 
             (this.distributor!=null &&
              this.distributor.equals(other.getDistributor()))) &&
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.servicePoint==null && other.getServicePoint()==null) || 
             (this.servicePoint!=null &&
              java.util.Arrays.equals(this.servicePoint, other.getServicePoint())));
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
        if (getDistributor() != null) {
            _hashCode += getDistributor().hashCode();
        }
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getServicePoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicePoint());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServicePoint(), i);
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
        new org.apache.axis.description.TypeDesc(ServicePointsResponseShippingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>servicePointsResponse>shippingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("servicePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointType"));
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
