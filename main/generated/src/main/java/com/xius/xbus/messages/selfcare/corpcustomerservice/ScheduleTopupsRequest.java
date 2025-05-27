/**
 * ScheduleTopupsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.corpcustomerservice;

public class ScheduleTopupsRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.math.BigInteger officeCode;

    private com.xius.xbus.messages.common.ManageType flag;

    private com.xius.xbus.messages.selfcare.corpcustomerservice.ToupDetailsType[] topupDetails;

    public ScheduleTopupsRequest() {
    }

    public ScheduleTopupsRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.math.BigInteger officeCode,
           com.xius.xbus.messages.common.ManageType flag,
           com.xius.xbus.messages.selfcare.corpcustomerservice.ToupDetailsType[] topupDetails) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.officeCode = officeCode;
        this.flag = flag;
        this.topupDetails = topupDetails;
    }


    /**
     * Gets the officeCode value for this ScheduleTopupsRequest.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this ScheduleTopupsRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the flag value for this ScheduleTopupsRequest.
     * 
     * @return flag
     */
    public com.xius.xbus.messages.common.ManageType getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this ScheduleTopupsRequest.
     * 
     * @param flag
     */
    public void setFlag(com.xius.xbus.messages.common.ManageType flag) {
        this.flag = flag;
    }


    /**
     * Gets the topupDetails value for this ScheduleTopupsRequest.
     * 
     * @return topupDetails
     */
    public com.xius.xbus.messages.selfcare.corpcustomerservice.ToupDetailsType[] getTopupDetails() {
        return topupDetails;
    }


    /**
     * Sets the topupDetails value for this ScheduleTopupsRequest.
     * 
     * @param topupDetails
     */
    public void setTopupDetails(com.xius.xbus.messages.selfcare.corpcustomerservice.ToupDetailsType[] topupDetails) {
        this.topupDetails = topupDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleTopupsRequest)) return false;
        ScheduleTopupsRequest other = (ScheduleTopupsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.topupDetails==null && other.getTopupDetails()==null) || 
             (this.topupDetails!=null &&
              java.util.Arrays.equals(this.topupDetails, other.getTopupDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getTopupDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopupDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopupDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleTopupsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", ">ScheduleTopupsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ManageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topupDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "topupDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "ToupDetailsType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "topupDetailsList"));
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
