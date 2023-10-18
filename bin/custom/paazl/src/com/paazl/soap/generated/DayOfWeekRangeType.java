/**
 * DayOfWeekRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class DayOfWeekRangeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DayOfWeekRangeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _MONDAY = "MONDAY";
    public static final String _MONDAY_FRIDAY = "MONDAY_FRIDAY";
    public static final String _MONDAY_SATURDAY = "MONDAY_SATURDAY";
    public static final String _MONDAY_SUNDAY = "MONDAY_SUNDAY";
    public static final String _TUESDAY_FRIDAY = "TUESDAY_FRIDAY";
    public static final String _TUESDAY_SATURDAY = "TUESDAY_SATURDAY";
    public static final String _SATURDAY = "SATURDAY";
    public static final String _SUNDAY = "SUNDAY";
    public static final String _TUESDAY_AND_THURSDAY = "TUESDAY_AND_THURSDAY";
    public static final DayOfWeekRangeType MONDAY = new DayOfWeekRangeType(_MONDAY);
    public static final DayOfWeekRangeType MONDAY_FRIDAY = new DayOfWeekRangeType(_MONDAY_FRIDAY);
    public static final DayOfWeekRangeType MONDAY_SATURDAY = new DayOfWeekRangeType(_MONDAY_SATURDAY);
    public static final DayOfWeekRangeType MONDAY_SUNDAY = new DayOfWeekRangeType(_MONDAY_SUNDAY);
    public static final DayOfWeekRangeType TUESDAY_FRIDAY = new DayOfWeekRangeType(_TUESDAY_FRIDAY);
    public static final DayOfWeekRangeType TUESDAY_SATURDAY = new DayOfWeekRangeType(_TUESDAY_SATURDAY);
    public static final DayOfWeekRangeType SATURDAY = new DayOfWeekRangeType(_SATURDAY);
    public static final DayOfWeekRangeType SUNDAY = new DayOfWeekRangeType(_SUNDAY);
    public static final DayOfWeekRangeType TUESDAY_AND_THURSDAY = new DayOfWeekRangeType(_TUESDAY_AND_THURSDAY);
    public String getValue() { return _value_;}
    public static DayOfWeekRangeType fromValue(String value)
          throws IllegalArgumentException {
        DayOfWeekRangeType enumeration = (DayOfWeekRangeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DayOfWeekRangeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DayOfWeekRangeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dayOfWeekRangeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
