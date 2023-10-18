/**
 * PickupRequestStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class PickupRequestStatusType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupRequestStatusType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _created = "created";
    public static final String _registered = "registered";
    public static final String _temporaryFailure = "temporaryFailure";
    public static final String _permanentFailure = "permanentFailure";
    public static final String _pickedup = "pickedup";
    public static final String _canceled = "canceled";
    public static final PickupRequestStatusType created = new PickupRequestStatusType(_created);
    public static final PickupRequestStatusType registered = new PickupRequestStatusType(_registered);
    public static final PickupRequestStatusType temporaryFailure = new PickupRequestStatusType(_temporaryFailure);
    public static final PickupRequestStatusType permanentFailure = new PickupRequestStatusType(_permanentFailure);
    public static final PickupRequestStatusType pickedup = new PickupRequestStatusType(_pickedup);
    public static final PickupRequestStatusType canceled = new PickupRequestStatusType(_canceled);
    public String getValue() { return _value_;}
    public static PickupRequestStatusType fromValue(String value)
          throws IllegalArgumentException {
        PickupRequestStatusType enumeration = (PickupRequestStatusType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PickupRequestStatusType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PickupRequestStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
