/**
 * ToupDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.corpcustomerservice;

public class ToupDetailsType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private com.xius.xbus.messages.selfcare.corpcustomerservice.ScheduleType scheduleType;

    private java.lang.String lowBalValue;

    private java.lang.String dayOfMonthValue;

    private java.math.BigDecimal amout;

    public ToupDetailsType() {
    }

    public ToupDetailsType(
           java.lang.String msisdn,
           com.xius.xbus.messages.selfcare.corpcustomerservice.ScheduleType scheduleType,
           java.lang.String lowBalValue,
           java.lang.String dayOfMonthValue,
           java.math.BigDecimal amout) {
           this.msisdn = msisdn;
           this.scheduleType = scheduleType;
           this.lowBalValue = lowBalValue;
           this.dayOfMonthValue = dayOfMonthValue;
           this.amout = amout;
    }


    /**
     * Gets the msisdn value for this ToupDetailsType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ToupDetailsType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the scheduleType value for this ToupDetailsType.
     * 
     * @return scheduleType
     */
    public com.xius.xbus.messages.selfcare.corpcustomerservice.ScheduleType getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this ToupDetailsType.
     * 
     * @param scheduleType
     */
    public void setScheduleType(com.xius.xbus.messages.selfcare.corpcustomerservice.ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the lowBalValue value for this ToupDetailsType.
     * 
     * @return lowBalValue
     */
    public java.lang.String getLowBalValue() {
        return lowBalValue;
    }


    /**
     * Sets the lowBalValue value for this ToupDetailsType.
     * 
     * @param lowBalValue
     */
    public void setLowBalValue(java.lang.String lowBalValue) {
        this.lowBalValue = lowBalValue;
    }


    /**
     * Gets the dayOfMonthValue value for this ToupDetailsType.
     * 
     * @return dayOfMonthValue
     */
    public java.lang.String getDayOfMonthValue() {
        return dayOfMonthValue;
    }


    /**
     * Sets the dayOfMonthValue value for this ToupDetailsType.
     * 
     * @param dayOfMonthValue
     */
    public void setDayOfMonthValue(java.lang.String dayOfMonthValue) {
        this.dayOfMonthValue = dayOfMonthValue;
    }


    /**
     * Gets the amout value for this ToupDetailsType.
     * 
     * @return amout
     */
    public java.math.BigDecimal getAmout() {
        return amout;
    }


    /**
     * Sets the amout value for this ToupDetailsType.
     * 
     * @param amout
     */
    public void setAmout(java.math.BigDecimal amout) {
        this.amout = amout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ToupDetailsType)) return false;
        ToupDetailsType other = (ToupDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.scheduleType==null && other.getScheduleType()==null) || 
             (this.scheduleType!=null &&
              this.scheduleType.equals(other.getScheduleType()))) &&
            ((this.lowBalValue==null && other.getLowBalValue()==null) || 
             (this.lowBalValue!=null &&
              this.lowBalValue.equals(other.getLowBalValue()))) &&
            ((this.dayOfMonthValue==null && other.getDayOfMonthValue()==null) || 
             (this.dayOfMonthValue!=null &&
              this.dayOfMonthValue.equals(other.getDayOfMonthValue()))) &&
            ((this.amout==null && other.getAmout()==null) || 
             (this.amout!=null &&
              this.amout.equals(other.getAmout())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getScheduleType() != null) {
            _hashCode += getScheduleType().hashCode();
        }
        if (getLowBalValue() != null) {
            _hashCode += getLowBalValue().hashCode();
        }
        if (getDayOfMonthValue() != null) {
            _hashCode += getDayOfMonthValue().hashCode();
        }
        if (getAmout() != null) {
            _hashCode += getAmout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ToupDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "ToupDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "scheduleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "ScheduleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowBalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "lowBalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonthValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "dayOfMonthValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "amout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
