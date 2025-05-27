/**
 * RenewalInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class RenewalInfoType  implements java.io.Serializable {
    private java.lang.String autoRenewal;

    private java.lang.String periodType;

    private java.lang.String periodValue;

    private java.lang.String renewalDay;

    public RenewalInfoType() {
    }

    public RenewalInfoType(
           java.lang.String autoRenewal,
           java.lang.String periodType,
           java.lang.String periodValue,
           java.lang.String renewalDay) {
           this.autoRenewal = autoRenewal;
           this.periodType = periodType;
           this.periodValue = periodValue;
           this.renewalDay = renewalDay;
    }


    /**
     * Gets the autoRenewal value for this RenewalInfoType.
     * 
     * @return autoRenewal
     */
    public java.lang.String getAutoRenewal() {
        return autoRenewal;
    }


    /**
     * Sets the autoRenewal value for this RenewalInfoType.
     * 
     * @param autoRenewal
     */
    public void setAutoRenewal(java.lang.String autoRenewal) {
        this.autoRenewal = autoRenewal;
    }


    /**
     * Gets the periodType value for this RenewalInfoType.
     * 
     * @return periodType
     */
    public java.lang.String getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this RenewalInfoType.
     * 
     * @param periodType
     */
    public void setPeriodType(java.lang.String periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the periodValue value for this RenewalInfoType.
     * 
     * @return periodValue
     */
    public java.lang.String getPeriodValue() {
        return periodValue;
    }


    /**
     * Sets the periodValue value for this RenewalInfoType.
     * 
     * @param periodValue
     */
    public void setPeriodValue(java.lang.String periodValue) {
        this.periodValue = periodValue;
    }


    /**
     * Gets the renewalDay value for this RenewalInfoType.
     * 
     * @return renewalDay
     */
    public java.lang.String getRenewalDay() {
        return renewalDay;
    }


    /**
     * Sets the renewalDay value for this RenewalInfoType.
     * 
     * @param renewalDay
     */
    public void setRenewalDay(java.lang.String renewalDay) {
        this.renewalDay = renewalDay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenewalInfoType)) return false;
        RenewalInfoType other = (RenewalInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoRenewal==null && other.getAutoRenewal()==null) || 
             (this.autoRenewal!=null &&
              this.autoRenewal.equals(other.getAutoRenewal()))) &&
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType()))) &&
            ((this.periodValue==null && other.getPeriodValue()==null) || 
             (this.periodValue!=null &&
              this.periodValue.equals(other.getPeriodValue()))) &&
            ((this.renewalDay==null && other.getRenewalDay()==null) || 
             (this.renewalDay!=null &&
              this.renewalDay.equals(other.getRenewalDay())));
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
        if (getAutoRenewal() != null) {
            _hashCode += getAutoRenewal().hashCode();
        }
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        if (getPeriodValue() != null) {
            _hashCode += getPeriodValue().hashCode();
        }
        if (getRenewalDay() != null) {
            _hashCode += getRenewalDay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenewalInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "renewalInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRenewal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "autoRenewal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "periodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "periodValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "renewalDay"));
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
