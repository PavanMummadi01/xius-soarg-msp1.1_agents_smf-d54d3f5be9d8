/**
 * UpdateAccountDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class UpdateAccountDetailsRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String mdn;

    private com.xius.xbus.messages.common.AccountRetrievalIdType idType;

    private java.lang.String idValue;

    private com.xius.xbus.messages.common.SelfcareAccountStatusType accountStatus;

    private com.xius.xbus.messages.common.BillingAccountType accoutType;

    private com.xius.xbus.messages.selfcare.services.BillingAddressData billingAddressData;

    private com.xius.xbus.messages.selfcare.services.PersonalData personalData;

    private java.lang.Long postpaidAcctId;

    private com.xius.xbus.messages.common.PostPaidDetails postpaidDetails;

    private java.lang.Boolean updateAccountStatus;

    private com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefinedInfo;

    public UpdateAccountDetailsRequest() {
    }

    public UpdateAccountDetailsRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String mdn,
           com.xius.xbus.messages.common.AccountRetrievalIdType idType,
           java.lang.String idValue,
           com.xius.xbus.messages.common.SelfcareAccountStatusType accountStatus,
           com.xius.xbus.messages.common.BillingAccountType accoutType,
           com.xius.xbus.messages.selfcare.services.BillingAddressData billingAddressData,
           com.xius.xbus.messages.selfcare.services.PersonalData personalData,
           java.lang.Long postpaidAcctId,
           com.xius.xbus.messages.common.PostPaidDetails postpaidDetails,
           java.lang.Boolean updateAccountStatus,
           com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefinedInfo) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.mdn = mdn;
        this.idType = idType;
        this.idValue = idValue;
        this.accountStatus = accountStatus;
        this.accoutType = accoutType;
        this.billingAddressData = billingAddressData;
        this.personalData = personalData;
        this.postpaidAcctId = postpaidAcctId;
        this.postpaidDetails = postpaidDetails;
        this.updateAccountStatus = updateAccountStatus;
        this.userDefinedInfo = userDefinedInfo;
    }


    /**
     * Gets the mdn value for this UpdateAccountDetailsRequest.
     * 
     * @return mdn
     */
    public java.lang.String getMdn() {
        return mdn;
    }


    /**
     * Sets the mdn value for this UpdateAccountDetailsRequest.
     * 
     * @param mdn
     */
    public void setMdn(java.lang.String mdn) {
        this.mdn = mdn;
    }


    /**
     * Gets the idType value for this UpdateAccountDetailsRequest.
     * 
     * @return idType
     */
    public com.xius.xbus.messages.common.AccountRetrievalIdType getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this UpdateAccountDetailsRequest.
     * 
     * @param idType
     */
    public void setIdType(com.xius.xbus.messages.common.AccountRetrievalIdType idType) {
        this.idType = idType;
    }


    /**
     * Gets the idValue value for this UpdateAccountDetailsRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this UpdateAccountDetailsRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the accountStatus value for this UpdateAccountDetailsRequest.
     * 
     * @return accountStatus
     */
    public com.xius.xbus.messages.common.SelfcareAccountStatusType getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this UpdateAccountDetailsRequest.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(com.xius.xbus.messages.common.SelfcareAccountStatusType accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the accoutType value for this UpdateAccountDetailsRequest.
     * 
     * @return accoutType
     */
    public com.xius.xbus.messages.common.BillingAccountType getAccoutType() {
        return accoutType;
    }


    /**
     * Sets the accoutType value for this UpdateAccountDetailsRequest.
     * 
     * @param accoutType
     */
    public void setAccoutType(com.xius.xbus.messages.common.BillingAccountType accoutType) {
        this.accoutType = accoutType;
    }


    /**
     * Gets the billingAddressData value for this UpdateAccountDetailsRequest.
     * 
     * @return billingAddressData
     */
    public com.xius.xbus.messages.selfcare.services.BillingAddressData getBillingAddressData() {
        return billingAddressData;
    }


    /**
     * Sets the billingAddressData value for this UpdateAccountDetailsRequest.
     * 
     * @param billingAddressData
     */
    public void setBillingAddressData(com.xius.xbus.messages.selfcare.services.BillingAddressData billingAddressData) {
        this.billingAddressData = billingAddressData;
    }


    /**
     * Gets the personalData value for this UpdateAccountDetailsRequest.
     * 
     * @return personalData
     */
    public com.xius.xbus.messages.selfcare.services.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this UpdateAccountDetailsRequest.
     * 
     * @param personalData
     */
    public void setPersonalData(com.xius.xbus.messages.selfcare.services.PersonalData personalData) {
        this.personalData = personalData;
    }


    /**
     * Gets the postpaidAcctId value for this UpdateAccountDetailsRequest.
     * 
     * @return postpaidAcctId
     */
    public java.lang.Long getPostpaidAcctId() {
        return postpaidAcctId;
    }


    /**
     * Sets the postpaidAcctId value for this UpdateAccountDetailsRequest.
     * 
     * @param postpaidAcctId
     */
    public void setPostpaidAcctId(java.lang.Long postpaidAcctId) {
        this.postpaidAcctId = postpaidAcctId;
    }


    /**
     * Gets the postpaidDetails value for this UpdateAccountDetailsRequest.
     * 
     * @return postpaidDetails
     */
    public com.xius.xbus.messages.common.PostPaidDetails getPostpaidDetails() {
        return postpaidDetails;
    }


    /**
     * Sets the postpaidDetails value for this UpdateAccountDetailsRequest.
     * 
     * @param postpaidDetails
     */
    public void setPostpaidDetails(com.xius.xbus.messages.common.PostPaidDetails postpaidDetails) {
        this.postpaidDetails = postpaidDetails;
    }


    /**
     * Gets the updateAccountStatus value for this UpdateAccountDetailsRequest.
     * 
     * @return updateAccountStatus
     */
    public java.lang.Boolean getUpdateAccountStatus() {
        return updateAccountStatus;
    }


    /**
     * Sets the updateAccountStatus value for this UpdateAccountDetailsRequest.
     * 
     * @param updateAccountStatus
     */
    public void setUpdateAccountStatus(java.lang.Boolean updateAccountStatus) {
        this.updateAccountStatus = updateAccountStatus;
    }


    /**
     * Gets the userDefinedInfo value for this UpdateAccountDetailsRequest.
     * 
     * @return userDefinedInfo
     */
    public com.xius.xbus.messages.selfcare.services.UserDefinedInfo getUserDefinedInfo() {
        return userDefinedInfo;
    }


    /**
     * Sets the userDefinedInfo value for this UpdateAccountDetailsRequest.
     * 
     * @param userDefinedInfo
     */
    public void setUserDefinedInfo(com.xius.xbus.messages.selfcare.services.UserDefinedInfo userDefinedInfo) {
        this.userDefinedInfo = userDefinedInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAccountDetailsRequest)) return false;
        UpdateAccountDetailsRequest other = (UpdateAccountDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mdn==null && other.getMdn()==null) || 
             (this.mdn!=null &&
              this.mdn.equals(other.getMdn()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.accoutType==null && other.getAccoutType()==null) || 
             (this.accoutType!=null &&
              this.accoutType.equals(other.getAccoutType()))) &&
            ((this.billingAddressData==null && other.getBillingAddressData()==null) || 
             (this.billingAddressData!=null &&
              this.billingAddressData.equals(other.getBillingAddressData()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
            ((this.postpaidAcctId==null && other.getPostpaidAcctId()==null) || 
             (this.postpaidAcctId!=null &&
              this.postpaidAcctId.equals(other.getPostpaidAcctId()))) &&
            ((this.postpaidDetails==null && other.getPostpaidDetails()==null) || 
             (this.postpaidDetails!=null &&
              this.postpaidDetails.equals(other.getPostpaidDetails()))) &&
            ((this.updateAccountStatus==null && other.getUpdateAccountStatus()==null) || 
             (this.updateAccountStatus!=null &&
              this.updateAccountStatus.equals(other.getUpdateAccountStatus()))) &&
            ((this.userDefinedInfo==null && other.getUserDefinedInfo()==null) || 
             (this.userDefinedInfo!=null &&
              this.userDefinedInfo.equals(other.getUserDefinedInfo())));
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
        if (getMdn() != null) {
            _hashCode += getMdn().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getAccoutType() != null) {
            _hashCode += getAccoutType().hashCode();
        }
        if (getBillingAddressData() != null) {
            _hashCode += getBillingAddressData().hashCode();
        }
        if (getPersonalData() != null) {
            _hashCode += getPersonalData().hashCode();
        }
        if (getPostpaidAcctId() != null) {
            _hashCode += getPostpaidAcctId().hashCode();
        }
        if (getPostpaidDetails() != null) {
            _hashCode += getPostpaidDetails().hashCode();
        }
        if (getUpdateAccountStatus() != null) {
            _hashCode += getUpdateAccountStatus().hashCode();
        }
        if (getUserDefinedInfo() != null) {
            _hashCode += getUserDefinedInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAccountDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">updateAccountDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "mdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRetrievalIdType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "idValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SelfcareAccountStatusType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "accoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAccountType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "billingAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "BillingAddressData"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "personalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "PersonalData"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "postpaidAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "postpaidDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PostPaidDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAccountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "updateAccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userDefinedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserDefinedInfo"));
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
