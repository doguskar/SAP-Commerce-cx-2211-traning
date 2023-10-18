/**
 * DayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DayType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DayType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _MONDAY = "MONDAY";
    public static final String _TUESDAY = "TUESDAY";
    public static final String _WEDNESDAY = "WEDNESDAY";
    public static final String _THURSDAY = "THURSDAY";
    public static final String _FRIDAY = "FRIDAY";
    public static final String _SATURDAY = "SATURDAY";
    public static final String _SUNDAY = "SUNDAY";
    public static final DayType MONDAY = new DayType(_MONDAY);
    public static final DayType TUESDAY = new DayType(_TUESDAY);
    public static final DayType WEDNESDAY = new DayType(_WEDNESDAY);
    public static final DayType THURSDAY = new DayType(_THURSDAY);
    public static final DayType FRIDAY = new DayType(_FRIDAY);
    public static final DayType SATURDAY = new DayType(_SATURDAY);
    public static final DayType SUNDAY = new DayType(_SUNDAY);
    public String getValue() { return _value_;}
    public static DayType fromValue(String value)
          throws IllegalArgumentException {
        DayType enumeration = (DayType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DayType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DayType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dayType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
