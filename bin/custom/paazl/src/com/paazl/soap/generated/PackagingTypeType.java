/**
 * PackagingTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class PackagingTypeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PackagingTypeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FEDEX_10_KG_BOX = "FEDEX_10_KG_BOX";
    public static final String _FEDEX_25_KG_BOX = "FEDEX_25_KG_BOX";
    public static final String _FEDEX_BOX = "FEDEX_BOX";
    public static final String _FEDEX_ENVELOPE = "FEDEX_ENVELOPE";
    public static final String _FEDEX_PAK = "FEDEX_PAK";
    public static final String _FEDEX_TUBE = "FEDEX_TUBE";
    public static final String _YOUR_PACKAGING = "YOUR_PACKAGING";
    public static final String _UPS_LETTER = "UPS_LETTER";
    public static final String _CUSTOMER_SUPPLIED_PACKAGE = "CUSTOMER_SUPPLIED_PACKAGE";
    public static final String _TUBE = "TUBE";
    public static final String _PAK = "PAK";
    public static final String _UPS_EXPRESS_BOX = "UPS_EXPRESS_BOX";
    public static final String _UPS_25KG_BOX = "UPS_25KG_BOX";
    public static final String _UPS_10KG_BOX = "UPS_10KG_BOX";
    public static final String _SMALL_EXPRESS_BOX = "SMALL_EXPRESS_BOX";
    public static final String _MEDIUM_EXPRESS_BOX = "MEDIUM_EXPRESS_BOX";
    public static final String _LARGE_EXPRESS_BOX = "LARGE_EXPRESS_BOX";
    public static final String _VAN_SPREUWEL_COLLI = "VAN_SPREUWEL_COLLI";
    public static final String _VAN_SPREUWEL_BLOCKPALLET = "VAN_SPREUWEL_BLOCKPALLET";
    public static final String _VAN_SPREUWEL_EUROPALLET = "VAN_SPREUWEL_EUROPALLET";
    public static final String _VAN_SPREUWEL_TROLLEY = "VAN_SPREUWEL_TROLLEY";
    public static final PackagingTypeType FEDEX_10_KG_BOX = new PackagingTypeType(_FEDEX_10_KG_BOX);
    public static final PackagingTypeType FEDEX_25_KG_BOX = new PackagingTypeType(_FEDEX_25_KG_BOX);
    public static final PackagingTypeType FEDEX_BOX = new PackagingTypeType(_FEDEX_BOX);
    public static final PackagingTypeType FEDEX_ENVELOPE = new PackagingTypeType(_FEDEX_ENVELOPE);
    public static final PackagingTypeType FEDEX_PAK = new PackagingTypeType(_FEDEX_PAK);
    public static final PackagingTypeType FEDEX_TUBE = new PackagingTypeType(_FEDEX_TUBE);
    public static final PackagingTypeType YOUR_PACKAGING = new PackagingTypeType(_YOUR_PACKAGING);
    public static final PackagingTypeType UPS_LETTER = new PackagingTypeType(_UPS_LETTER);
    public static final PackagingTypeType CUSTOMER_SUPPLIED_PACKAGE = new PackagingTypeType(_CUSTOMER_SUPPLIED_PACKAGE);
    public static final PackagingTypeType TUBE = new PackagingTypeType(_TUBE);
    public static final PackagingTypeType PAK = new PackagingTypeType(_PAK);
    public static final PackagingTypeType UPS_EXPRESS_BOX = new PackagingTypeType(_UPS_EXPRESS_BOX);
    public static final PackagingTypeType UPS_25KG_BOX = new PackagingTypeType(_UPS_25KG_BOX);
    public static final PackagingTypeType UPS_10KG_BOX = new PackagingTypeType(_UPS_10KG_BOX);
    public static final PackagingTypeType SMALL_EXPRESS_BOX = new PackagingTypeType(_SMALL_EXPRESS_BOX);
    public static final PackagingTypeType MEDIUM_EXPRESS_BOX = new PackagingTypeType(_MEDIUM_EXPRESS_BOX);
    public static final PackagingTypeType LARGE_EXPRESS_BOX = new PackagingTypeType(_LARGE_EXPRESS_BOX);
    public static final PackagingTypeType VAN_SPREUWEL_COLLI = new PackagingTypeType(_VAN_SPREUWEL_COLLI);
    public static final PackagingTypeType VAN_SPREUWEL_BLOCKPALLET = new PackagingTypeType(_VAN_SPREUWEL_BLOCKPALLET);
    public static final PackagingTypeType VAN_SPREUWEL_EUROPALLET = new PackagingTypeType(_VAN_SPREUWEL_EUROPALLET);
    public static final PackagingTypeType VAN_SPREUWEL_TROLLEY = new PackagingTypeType(_VAN_SPREUWEL_TROLLEY);
    public String getValue() { return _value_;}
    public static PackagingTypeType fromValue(String value)
          throws IllegalArgumentException {
        PackagingTypeType enumeration = (PackagingTypeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PackagingTypeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PackagingTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
