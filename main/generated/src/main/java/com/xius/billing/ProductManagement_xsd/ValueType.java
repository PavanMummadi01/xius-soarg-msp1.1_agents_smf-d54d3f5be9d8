/**
 * ValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class ValueType  implements java.io.Serializable {
    private java.math.BigDecimal rate;

    private java.lang.String pulse;

    private java.lang.String rategroup;

    private java.lang.String bucketUnitType;

    public ValueType() {
    }

    public ValueType(
           java.math.BigDecimal rate,
           java.lang.String pulse,
           java.lang.String rategroup,
           java.lang.String bucketUnitType) {
           this.rate = rate;
           this.pulse = pulse;
           this.rategroup = rategroup;
           this.bucketUnitType = bucketUnitType;
    }


    /**
     * Gets the rate value for this ValueType.
     * 
     * @return rate
     */
    public java.math.BigDecimal getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ValueType.
     * 
     * @param rate
     */
    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }


    /**
     * Gets the pulse value for this ValueType.
     * 
     * @return pulse
     */
    public java.lang.String getPulse() {
        return pulse;
    }


    /**
     * Sets the pulse value for this ValueType.
     * 
     * @param pulse
     */
    public void setPulse(java.lang.String pulse) {
        this.pulse = pulse;
    }


    /**
     * Gets the rategroup value for this ValueType.
     * 
     * @return rategroup
     */
    public java.lang.String getRategroup() {
        return rategroup;
    }


    /**
     * Sets the rategroup value for this ValueType.
     * 
     * @param rategroup
     */
    public void setRategroup(java.lang.String rategroup) {
        this.rategroup = rategroup;
    }


    /**
     * Gets the bucketUnitType value for this ValueType.
     * 
     * @return bucketUnitType
     */
    public java.lang.String getBucketUnitType() {
        return bucketUnitType;
    }


    /**
     * Sets the bucketUnitType value for this ValueType.
     * 
     * @param bucketUnitType
     */
    public void setBucketUnitType(java.lang.String bucketUnitType) {
        this.bucketUnitType = bucketUnitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueType)) return false;
        ValueType other = (ValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.pulse==null && other.getPulse()==null) || 
             (this.pulse!=null &&
              this.pulse.equals(other.getPulse()))) &&
            ((this.rategroup==null && other.getRategroup()==null) || 
             (this.rategroup!=null &&
              this.rategroup.equals(other.getRategroup()))) &&
            ((this.bucketUnitType==null && other.getBucketUnitType()==null) || 
             (this.bucketUnitType!=null &&
              this.bucketUnitType.equals(other.getBucketUnitType())));
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
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getPulse() != null) {
            _hashCode += getPulse().hashCode();
        }
        if (getRategroup() != null) {
            _hashCode += getRategroup().hashCode();
        }
        if (getBucketUnitType() != null) {
            _hashCode += getBucketUnitType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "valueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pulse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Pulse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rategroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Rategroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BucketUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
