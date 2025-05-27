/**
 * RegisterAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class RegisterAccountRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private com.xius.xbus.messages.selfcare.services.BillingAddressData addressData;

    private com.xius.xbus.messages.selfcare.services.PersonalData personalData;

    private com.xius.xbus.messages.common.RegistrationType registrationType;

    private com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefinedInfo;

    private java.lang.String networkname;

    private com.xius.xbus.messages.common.SelfcareAccountStatusType selfcareAccountStatue;

    public RegisterAccountRequest() {
    }

    public RegisterAccountRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String msisdn,
           com.xius.xbus.messages.selfcare.services.BillingAddressData addressData,
           com.xius.xbus.messages.selfcare.services.PersonalData personalData,
           com.xius.xbus.messages.common.RegistrationType registrationType,
           com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefinedInfo,
           java.lang.String networkname,
           com.xius.xbus.messages.common.SelfcareAccountStatusType selfcareAccountStatue) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.msisdn = msisdn;
        this.addressData = addressData;
        this.personalData = personalData;
        this.registrationType = registrationType;
        this.userDefinedInfo = userDefinedInfo;
        this.networkname = networkname;
        this.selfcareAccountStatue = selfcareAccountStatue;
    }


    /**
     * Gets the msisdn value for this RegisterAccountRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this RegisterAccountRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the addressData value for this RegisterAccountRequest.
     * 
     * @return addressData
     */
    public com.xius.xbus.messages.selfcare.services.BillingAddressData getAddressData() {
        return addressData;
    }


    /**
     * Sets the addressData value for this RegisterAccountRequest.
     * 
     * @param addressData
     */
    public void setAddressData(com.xius.xbus.messages.selfcare.services.BillingAddressData addressData) {
        this.addressData = addressData;
    }


    /**
     * Gets the personalData value for this RegisterAccountRequest.
     * 
     * @return personalData
     */
    public com.xius.xbus.messages.selfcare.services.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this RegisterAccountRequest.
     * 
     * @param personalData
     */
    public void setPersonalData(com.xius.xbus.messages.selfcare.services.PersonalData personalData) {
        this.personalData = personalData;
    }


    /**
     * Gets the registrationType value for this RegisterAccountRequest.
     * 
     * @return registrationType
     */
    public com.xius.xbus.messages.common.RegistrationType getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this RegisterAccountRequest.
     * 
     * @param registrationType
     */
    public void setRegistrationType(com.xius.xbus.messages.common.RegistrationType registrationType) {
        this.registrationType = registrationType;
    }


    /**
     * Gets the userDefinedInfo value for this RegisterAccountRequest.
     * 
     * @return userDefinedInfo
     */
    public com.xius.xbus.messages.selfcare.services.UserDefinedInfo getUserDefinedInfo() {
        return userDefinedInfo;
    }


    /**
     * Sets the userDefinedInfo value for this RegisterAccountRequest.
     * 
     * @param userDefinedInfo
     */
    public void setUserDefinedInfo(com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefinedInfo) {
        this.userDefinedInfo = userDefinedInfo;
    }


    /**
     * Gets the networkname value for this RegisterAccountRequest.
     * 
     * @return networkname
     */
    public java.lang.String getNetworkname() {
        return networkname;
    }


    /**
     * Sets the networkname value for this RegisterAccountRequest.
     * 
     * @param networkname
     */
    public void setNetworkname(java.lang.String networkname) {
        this.networkname = networkname;
    }


    /**
     * Gets the selfcareAccountStatue value for this RegisterAccountRequest.
     * 
     * @return selfcareAccountStatue
     */
    public com.xius.xbus.messages.common.SelfcareAccountStatusType getSelfcareAccountStatue() {
        return selfcareAccountStatue;
    }


    /**
     * Sets the selfcareAccountStatue value for this RegisterAccountRequest.
     * 
     * @param selfcareAccountStatue
     */
    public void setSelfcareAccountStatue(com.xius.xbus.messages.common.SelfcareAccountStatusType selfcareAccountStatue) {
        this.selfcareAccountStatue = selfcareAccountStatue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterAccountRequest)) return false;
        RegisterAccountRequest other = (RegisterAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.addressData==null && other.getAddressData()==null) || 
             (this.addressData!=null &&
              this.addressData.equals(other.getAddressData()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType()))) &&
            ((this.userDefinedInfo==null && other.getUserDefinedInfo()==null) || 
             (this.userDefinedInfo!=null &&
              this.userDefinedInfo.equals(other.getUserDefinedInfo()))) &&
            ((this.networkname==null && other.getNetworkname()==null) || 
             (this.networkname!=null &&
              this.networkname.equals(other.getNetworkname()))) &&
            ((this.selfcareAccountStatue==null && other.getSelfcareAccountStatue()==null) || 
             (this.selfcareAccountStatue!=null &&
              this.selfcareAccountStatue.equals(other.getSelfcareAccountStatue())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAddressData() != null) {
            _hashCode += getAddressData().hashCode();
        }
        if (getPersonalData() != null) {
            _hashCode += getPersonalData().hashCode();
        }
        if (getRegistrationType() != null) {
            _hashCode += getRegistrationType().hashCode();
        }
        if (getUserDefinedInfo() != null) {
            _hashCode += getUserDefinedInfo().hashCode();
        }
        if (getNetworkname() != null) {
            _hashCode += getNetworkname().hashCode();
        }
        if (getSelfcareAccountStatue() != null) {
            _hashCode += getSelfcareAccountStatue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">registerAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "addressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PersonalData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "registrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "RegistrationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userDefinedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserDefinedInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "networkname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfcareAccountStatue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "selfcareAccountStatue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SelfcareAccountStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
