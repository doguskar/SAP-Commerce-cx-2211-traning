/**
 * OrdersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrdersType  extends com.paazl.soap.generated.BaseWebshopElement  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger page;

    private boolean hasNextPage;

    private String webshopName;

    private com.paazl.soap.generated.OrdersTypeOrder[] order;

    public OrdersType() {
    }

    public OrdersType(
           long webshop,
           org.apache.axis.types.NonNegativeInteger page,
           boolean hasNextPage,
           String webshopName,
           com.paazl.soap.generated.OrdersTypeOrder[] order) {
        super(
            webshop);
        this.page = page;
        this.hasNextPage = hasNextPage;
        this.webshopName = webshopName;
        this.order = order;
    }


    /**
     * Gets the page value for this OrdersType.
     * 
     * @return page
     */
    public org.apache.axis.types.NonNegativeInteger getPage() {
        return page;
    }


    /**
     * Sets the page value for this OrdersType.
     * 
     * @param page
     */
    public void setPage(org.apache.axis.types.NonNegativeInteger page) {
        this.page = page;
    }


    /**
     * Gets the hasNextPage value for this OrdersType.
     * 
     * @return hasNextPage
     */
    public boolean isHasNextPage() {
        return hasNextPage;
    }


    /**
     * Sets the hasNextPage value for this OrdersType.
     * 
     * @param hasNextPage
     */
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }


    /**
     * Gets the webshopName value for this OrdersType.
     * 
     * @return webshopName
     */
    public String getWebshopName() {
        return webshopName;
    }


    /**
     * Sets the webshopName value for this OrdersType.
     * 
     * @param webshopName
     */
    public void setWebshopName(String webshopName) {
        this.webshopName = webshopName;
    }


    /**
     * Gets the order value for this OrdersType.
     * 
     * @return order
     */
    public com.paazl.soap.generated.OrdersTypeOrder[] getOrder() {
        return order;
    }


    /**
     * Sets the order value for this OrdersType.
     * 
     * @param order
     */
    public void setOrder(com.paazl.soap.generated.OrdersTypeOrder[] order) {
        this.order = order;
    }

    public com.paazl.soap.generated.OrdersTypeOrder getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, com.paazl.soap.generated.OrdersTypeOrder _value) {
        this.order[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrdersType)) return false;
        OrdersType other = (OrdersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            this.hasNextPage == other.isHasNextPage() &&
            ((this.webshopName==null && other.getWebshopName()==null) || 
             (this.webshopName!=null &&
              this.webshopName.equals(other.getWebshopName()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              java.util.Arrays.equals(this.order, other.getOrder())));
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
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        _hashCode += (isHasNextPage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWebshopName() != null) {
            _hashCode += getWebshopName().hashCode();
        }
        if (getOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrder());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOrder(), i);
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
        new org.apache.axis.description.TypeDesc(OrdersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "ordersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNextPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "hasNextPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webshopName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "webshopName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersType>order"));
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
