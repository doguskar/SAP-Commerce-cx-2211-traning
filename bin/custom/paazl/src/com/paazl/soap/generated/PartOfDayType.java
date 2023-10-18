/**
 * PartOfDayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class PartOfDayType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PartOfDayType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _value1 = "ochtend";
    public static final String _value2 = "middag";
    public static final String _value3 = "avond";
    public static final String _value4 = "hele dag";
    public static final PartOfDayType value1 = new PartOfDayType(_value1);
    public static final PartOfDayType value2 = new PartOfDayType(_value2);
    public static final PartOfDayType value3 = new PartOfDayType(_value3);
    public static final PartOfDayType value4 = new PartOfDayType(_value4);
    public String getValue() { return _value_;}
    public static PartOfDayType fromValue(String value)
          throws IllegalArgumentException {
        PartOfDayType enumeration = (PartOfDayType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PartOfDayType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PartOfDayType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "partOfDayType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
