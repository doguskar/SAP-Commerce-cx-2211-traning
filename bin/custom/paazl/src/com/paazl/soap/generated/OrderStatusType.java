/**
 * OrderStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrderStatusType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrderStatusType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _LABELS_NOT_CREATED = "LABELS_NOT_CREATED";
    public static final String _LABELS_CREATED = "LABELS_CREATED";
    public static final String _PREREGISTERED = "PREREGISTERED";
    public static final String _READY_TO_POST = "READY_TO_POST";
    public static final String _SCANNED = "SCANNED";
    public static final String _DELIVERED = "DELIVERED";
    public static final String _DELIVEREDBB = "DELIVEREDBB";
    public static final String _PICKEDUP = "PICKEDUP";
    public static final OrderStatusType LABELS_NOT_CREATED = new OrderStatusType(_LABELS_NOT_CREATED);
    public static final OrderStatusType LABELS_CREATED = new OrderStatusType(_LABELS_CREATED);
    public static final OrderStatusType PREREGISTERED = new OrderStatusType(_PREREGISTERED);
    public static final OrderStatusType READY_TO_POST = new OrderStatusType(_READY_TO_POST);
    public static final OrderStatusType SCANNED = new OrderStatusType(_SCANNED);
    public static final OrderStatusType DELIVERED = new OrderStatusType(_DELIVERED);
    public static final OrderStatusType DELIVEREDBB = new OrderStatusType(_DELIVEREDBB);
    public static final OrderStatusType PICKEDUP = new OrderStatusType(_PICKEDUP);
    public String getValue() { return _value_;}
    public static OrderStatusType fromValue(String value)
          throws IllegalArgumentException {
        OrderStatusType enumeration = (OrderStatusType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static OrderStatusType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
