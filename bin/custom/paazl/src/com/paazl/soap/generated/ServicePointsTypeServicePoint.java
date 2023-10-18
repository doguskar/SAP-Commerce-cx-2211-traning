/**
 * ServicePointsTypeServicePoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class ServicePointsTypeServicePoint  implements java.io.Serializable {
    private String distributor;

    private String shippingOption;

    private String name;

    private String postcode;

    private String address;

    private String city;

    private String province;

    private com.paazl.soap.generated.CoordinatesType coordinates;

    private String distance;

    private String code;

    private Double price;

    private com.paazl.soap.generated.ServicePointsTypeServicePointOpeningTimesTime[] openingTimes;

    private com.paazl.soap.generated.ServicePointExtraDetails extraDetails;

    public ServicePointsTypeServicePoint() {
    }

    public ServicePointsTypeServicePoint(
           String distributor,
           String shippingOption,
           String name,
           String postcode,
           String address,
           String city,
           String province,
           com.paazl.soap.generated.CoordinatesType coordinates,
           String distance,
           String code,
           Double price,
           com.paazl.soap.generated.ServicePointsTypeServicePointOpeningTimesTime[] openingTimes,
           com.paazl.soap.generated.ServicePointExtraDetails extraDetails) {
           this.distributor = distributor;
           this.shippingOption = shippingOption;
           this.name = name;
           this.postcode = postcode;
           this.address = address;
           this.city = city;
           this.province = province;
           this.coordinates = coordinates;
           this.distance = distance;
           this.code = code;
           this.price = price;
           this.openingTimes = openingTimes;
           this.extraDetails = extraDetails;
    }


    /**
     * Gets the distributor value for this ServicePointsTypeServicePoint.
     * 
     * @return distributor
     */
    public String getDistributor() {
        return distributor;
    }


    /**
     * Sets the distributor value for this ServicePointsTypeServicePoint.
     * 
     * @param distributor
     */
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }


    /**
     * Gets the shippingOption value for this ServicePointsTypeServicePoint.
     * 
     * @return shippingOption
     */
    public String getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this ServicePointsTypeServicePoint.
     * 
     * @param shippingOption
     */
    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the name value for this ServicePointsTypeServicePoint.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this ServicePointsTypeServicePoint.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the postcode value for this ServicePointsTypeServicePoint.
     * 
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this ServicePointsTypeServicePoint.
     * 
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the address value for this ServicePointsTypeServicePoint.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ServicePointsTypeServicePoint.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this ServicePointsTypeServicePoint.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ServicePointsTypeServicePoint.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the province value for this ServicePointsTypeServicePoint.
     * 
     * @return province
     */
    public String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this ServicePointsTypeServicePoint.
     * 
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }


    /**
     * Gets the coordinates value for this ServicePointsTypeServicePoint.
     * 
     * @return coordinates
     */
    public com.paazl.soap.generated.CoordinatesType getCoordinates() {
        return coordinates;
    }


    /**
     * Sets the coordinates value for this ServicePointsTypeServicePoint.
     * 
     * @param coordinates
     */
    public void setCoordinates(com.paazl.soap.generated.CoordinatesType coordinates) {
        this.coordinates = coordinates;
    }


    /**
     * Gets the distance value for this ServicePointsTypeServicePoint.
     * 
     * @return distance
     */
    public String getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this ServicePointsTypeServicePoint.
     * 
     * @param distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }


    /**
     * Gets the code value for this ServicePointsTypeServicePoint.
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ServicePointsTypeServicePoint.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets the price value for this ServicePointsTypeServicePoint.
     * 
     * @return price
     */
    public Double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ServicePointsTypeServicePoint.
     * 
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }


    /**
     * Gets the openingTimes value for this ServicePointsTypeServicePoint.
     * 
     * @return openingTimes
     */
    public com.paazl.soap.generated.ServicePointsTypeServicePointOpeningTimesTime[] getOpeningTimes() {
        return openingTimes;
    }


    /**
     * Sets the openingTimes value for this ServicePointsTypeServicePoint.
     * 
     * @param openingTimes
     */
    public void setOpeningTimes(com.paazl.soap.generated.ServicePointsTypeServicePointOpeningTimesTime[] openingTimes) {
        this.openingTimes = openingTimes;
    }


    /**
     * Gets the extraDetails value for this ServicePointsTypeServicePoint.
     * 
     * @return extraDetails
     */
    public com.paazl.soap.generated.ServicePointExtraDetails getExtraDetails() {
        return extraDetails;
    }


    /**
     * Sets the extraDetails value for this ServicePointsTypeServicePoint.
     * 
     * @param extraDetails
     */
    public void setExtraDetails(com.paazl.soap.generated.ServicePointExtraDetails extraDetails) {
        this.extraDetails = extraDetails;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ServicePointsTypeServicePoint)) return false;
        ServicePointsTypeServicePoint other = (ServicePointsTypeServicePoint) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.coordinates==null && other.getCoordinates()==null) || 
             (this.coordinates!=null &&
              this.coordinates.equals(other.getCoordinates()))) &&
            ((this.distance==null && other.getDistance()==null) || 
             (this.distance!=null &&
              this.distance.equals(other.getDistance()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.openingTimes==null && other.getOpeningTimes()==null) || 
             (this.openingTimes!=null &&
              java.util.Arrays.equals(this.openingTimes, other.getOpeningTimes()))) &&
            ((this.extraDetails==null && other.getExtraDetails()==null) || 
             (this.extraDetails!=null &&
              this.extraDetails.equals(other.getExtraDetails())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getCoordinates() != null) {
            _hashCode += getCoordinates().hashCode();
        }
        if (getDistance() != null) {
            _hashCode += getDistance().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getOpeningTimes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpeningTimes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOpeningTimes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtraDetails() != null) {
            _hashCode += getExtraDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePointsTypeServicePoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsType>servicePoint"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "coordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "coordinatesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openingTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>servicePointsType>servicePoint>openingTimes>time"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "time"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "extraDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointExtraDetails"));
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
