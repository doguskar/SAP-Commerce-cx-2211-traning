/**
 * LabelStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class LabelStatusType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelStatusType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CREATED = "CREATED";
    public static final String _DELETED = "DELETED";
    public static final String _READY_TO_POST = "READY_TO_POST";
    public static final String _SCANNED = "SCANNED";
    public static final String _AVAILABLE_AT_PICKUP_POINT = "AVAILABLE_AT_PICKUP_POINT";
    public static final String _DELIVERED = "DELIVERED";
    public static final String _DELIVEREDBB = "DELIVEREDBB";
    public static final String _RETOUR = "RETOUR";
    public static final String _PICKEDUP = "PICKEDUP";
    public static final String _UITLEVERING = "UITLEVERING";
    public static final String _UNKNOWN = "UNKNOWN";
    public static final String _MANCO = "MANCO";
    public static final String _NOT_AT_HOME = "NOT_AT_HOME";
    public static final String _DELAYED = "DELAYED";
    public static final LabelStatusType CREATED = new LabelStatusType(_CREATED);
    public static final LabelStatusType DELETED = new LabelStatusType(_DELETED);
    public static final LabelStatusType READY_TO_POST = new LabelStatusType(_READY_TO_POST);
    public static final LabelStatusType SCANNED = new LabelStatusType(_SCANNED);
    public static final LabelStatusType AVAILABLE_AT_PICKUP_POINT = new LabelStatusType(_AVAILABLE_AT_PICKUP_POINT);
    public static final LabelStatusType DELIVERED = new LabelStatusType(_DELIVERED);
    public static final LabelStatusType DELIVEREDBB = new LabelStatusType(_DELIVEREDBB);
    public static final LabelStatusType RETOUR = new LabelStatusType(_RETOUR);
    public static final LabelStatusType PICKEDUP = new LabelStatusType(_PICKEDUP);
    public static final LabelStatusType UITLEVERING = new LabelStatusType(_UITLEVERING);
    public static final LabelStatusType UNKNOWN = new LabelStatusType(_UNKNOWN);
    public static final LabelStatusType MANCO = new LabelStatusType(_MANCO);
    public static final LabelStatusType NOT_AT_HOME = new LabelStatusType(_NOT_AT_HOME);
    public static final LabelStatusType DELAYED = new LabelStatusType(_DELAYED);
    public String getValue() { return _value_;}
    public static LabelStatusType fromValue(String value)
          throws IllegalArgumentException {
        LabelStatusType enumeration = (LabelStatusType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static LabelStatusType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(LabelStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
