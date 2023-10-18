/**
 * TriggerResponseStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class TriggerResponseStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TriggerResponseStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _QUEUED = "QUEUED";
    public static final String _ALREADY_PROCESSED = "ALREADY_PROCESSED";
    public static final String _NOT_ALLOWED = "NOT_ALLOWED";
    public static final String _UNKNOWN = "UNKNOWN";
    public static final TriggerResponseStatus QUEUED = new TriggerResponseStatus(_QUEUED);
    public static final TriggerResponseStatus ALREADY_PROCESSED = new TriggerResponseStatus(_ALREADY_PROCESSED);
    public static final TriggerResponseStatus NOT_ALLOWED = new TriggerResponseStatus(_NOT_ALLOWED);
    public static final TriggerResponseStatus UNKNOWN = new TriggerResponseStatus(_UNKNOWN);
    public String getValue() { return _value_;}
    public static TriggerResponseStatus fromValue(String value)
          throws IllegalArgumentException {
        TriggerResponseStatus enumeration = (TriggerResponseStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TriggerResponseStatus fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TriggerResponseStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "triggerResponseStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
