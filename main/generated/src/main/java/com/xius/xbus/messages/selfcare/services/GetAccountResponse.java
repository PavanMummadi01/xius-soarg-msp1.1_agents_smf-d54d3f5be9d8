/**
 * GetAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class GetAccountResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.selfcare.services.BillingAddressData billingAddressData;

    private com.xius.xbus.messages.selfcare.services.PersonalData personalData;

    private com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefined;

    private com.xius.xbus.messages.selfcare.services.SubscriberDetailsInfo subscriberInfo;

    private java.lang.String mdn;

    private java.lang.String accountStatus;

    public GetAccountResponse() {
    }

    public GetAccountResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.selfcare.services.BillingAddressData billingAddressData,
           com.xius.xbus.messages.selfcare.services.PersonalData personalData,
           com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefined,
           com.xius.xbus.messages.selfcare.services.SubscriberDetailsInfo subscriberInfo,
           java.lang.String mdn,
           java.lang.String accountStatus) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.billingAddressData = billingAddressData;
        this.personalData = personalData;
        this.userDefined = userDefined;
        this.subscriberInfo = subscriberInfo;
        this.mdn = mdn;
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the billingAddressData value for this GetAccountResponse.
     * 
     * @return billingAddressData
     */
    public com.xius.xbus.messages.selfcare.services.BillingAddressData getBillingAddressData() {
        return billingAddressData;
    }


    /**
     * Sets the billingAddressData value for this GetAccountResponse.
     * 
     * @param billingAddressData
     */
    public void setBillingAddressData(com.xius.xbus.messages.selfcare.services.BillingAddressData billingAddressData) {
        this.billingAddressData = billingAddressData;
    }


    /**
     * Gets the personalData value for this GetAccountResponse.
     * 
     * @return personalData
     */
    public com.xius.xbus.messages.selfcare.services.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this GetAccountResponse.
     * 
     * @param personalData
     */
    public void setPersonalData(com.xius.xbus.messages.selfcare.services.PersonalData personalData) {
        this.personalData = personalData;
    }


    /**
     * Gets the userDefined value for this GetAccountResponse.
     * 
     * @return userDefined
     */
    public com.xius.xbus.messages.selfcare.services.UserDefinedInfo getUserDefined() {
        return userDefined;
    }


    /**
     * Sets the userDefined value for this GetAccountResponse.
     * 
     * @param userDefined
     */
    public void setUserDefined(com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefined) {
        this.userDefined = userDefined;
    }


    /**
     * Gets the subscriberInfo value for this GetAccountResponse.
     * 
     * @return subscriberInfo
     */
    public com.xius.xbus.messages.selfcare.services.SubscriberDetailsInfo getSubscriberInfo() {
        return subscriberInfo;
    }


    /**
     * Sets the subscriberInfo value for this GetAccountResponse.
     * 
     * @param subscriberInfo
     */
    public void setSubscriberInfo(com.xius.xbus.messages.selfcare.services.SubscriberDetailsInfo subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }


    /**
     * Gets the mdn value for this GetAccountResponse.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this GetAccountResponse.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the accountStatus value for this GetAccountResponse.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this GetAccountResponse.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountResponse)) return false;
        GetAccountResponse other = (GetAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billingAddressData==null && other.getBillingAddressData()==null) || 
             (this.billingAddressData!=null &&
              this.billingAddressData.equals(other.getBillingAddressData()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
            ((this.userDefined==null && other.getUserDefined()==null) || 
             (this.userDefined!=null &&
              this.userDefined.equals(other.getUserDefined()))) &&
            ((this.subscriberInfo==null && other.getSubscriberInfo()==null) || 
             (this.subscriberInfo!=null &&
              this.subscriberInfo.equals(other.getSubscriberInfo()))) &&
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus())));
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
        if (getBillingAddressData() != null) {
            _hashCode += getBillingAddressData().hashCode();
        }
        if (getPersonalData() != null) {
            _hashCode += getPersonalData().hashCode();
        }
        if (getUserDefined() != null) {
            _hashCode += getUserDefined().hashCode();
        }
        if (getSubscriberInfo() != null) {
            _hashCode += getSubscriberInfo().hashCode();
        }
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAccountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "billingAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PersonalData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserDefinedInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "subscriberInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "SubscriberDetailsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "accountStatus"));
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
