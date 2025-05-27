/**
 * UpdateAccountDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class UpdateAccountDetailsRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String MDN;

    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType accountStatus;

    private net.bcgi.si.messages.mvnoapi.common.AccountType accoutType;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData;

    private java.lang.Long postpaidAcctId;

    private net.bcgi.si.messages.mvnoapi.common.PostpaidDetails postpaidDetails;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.Boolean updateAccountStatus;

    private net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo;

    private net.bcgi.si.messages.mvnoapi.subscriber.UserType userType;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public UpdateAccountDetailsRequest() {
    }

    public UpdateAccountDetailsRequest(
           java.lang.String MDN,
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType accountStatus,
           net.bcgi.si.messages.mvnoapi.common.AccountType accoutType,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData,
           java.lang.Long postpaidAcctId,
           net.bcgi.si.messages.mvnoapi.common.PostpaidDetails postpaidDetails,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.Boolean updateAccountStatus,
           net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo,
           net.bcgi.si.messages.mvnoapi.subscriber.UserType userType,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.MDN = MDN;
           this.accountId = accountId;
           this.accountStatus = accountStatus;
           this.accoutType = accoutType;
           this.billingAddressData = billingAddressData;
           this.messageID = messageID;
           this.personalData = personalData;
           this.postpaidAcctId = postpaidAcctId;
           this.postpaidDetails = postpaidDetails;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.updateAccountStatus = updateAccountStatus;
           this.userDefinedInfo = userDefinedInfo;
           this.userType = userType;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the MDN value for this UpdateAccountDetailsRequest.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this UpdateAccountDetailsRequest.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the accountId value for this UpdateAccountDetailsRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this UpdateAccountDetailsRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountStatus value for this UpdateAccountDetailsRequest.
     * 
     * @return accountStatus
     */
    public net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this UpdateAccountDetailsRequest.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the accoutType value for this UpdateAccountDetailsRequest.
     * 
     * @return accoutType
     */
    public net.bcgi.si.messages.mvnoapi.common.AccountType getAccoutType() {
        return accoutType;
    }


    /**
     * Sets the accoutType value for this UpdateAccountDetailsRequest.
     * 
     * @param accoutType
     */
    public void setAccoutType(net.bcgi.si.messages.mvnoapi.common.AccountType accoutType) {
        this.accoutType = accoutType;
    }


    /**
     * Gets the billingAddressData value for this UpdateAccountDetailsRequest.
     * 
     * @return billingAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getBillingAddressData() {
        return billingAddressData;
    }


    /**
     * Sets the billingAddressData value for this UpdateAccountDetailsRequest.
     * 
     * @param billingAddressData
     */
    public void setBillingAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData) {
        this.billingAddressData = billingAddressData;
    }


    /**
     * Gets the messageID value for this UpdateAccountDetailsRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this UpdateAccountDetailsRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the personalData value for this UpdateAccountDetailsRequest.
     * 
     * @return personalData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this UpdateAccountDetailsRequest.
     * 
     * @param personalData
     */
    public void setPersonalData(net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData) {
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
    public net.bcgi.si.messages.mvnoapi.common.PostpaidDetails getPostpaidDetails() {
        return postpaidDetails;
    }


    /**
     * Sets the postpaidDetails value for this UpdateAccountDetailsRequest.
     * 
     * @param postpaidDetails
     */
    public void setPostpaidDetails(net.bcgi.si.messages.mvnoapi.common.PostpaidDetails postpaidDetails) {
        this.postpaidDetails = postpaidDetails;
    }


    /**
     * Gets the securityId value for this UpdateAccountDetailsRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this UpdateAccountDetailsRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this UpdateAccountDetailsRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this UpdateAccountDetailsRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
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
    public net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo getUserDefinedInfo() {
        return userDefinedInfo;
    }


    /**
     * Sets the userDefinedInfo value for this UpdateAccountDetailsRequest.
     * 
     * @param userDefinedInfo
     */
    public void setUserDefinedInfo(net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo) {
        this.userDefinedInfo = userDefinedInfo;
    }


    /**
     * Gets the userType value for this UpdateAccountDetailsRequest.
     * 
     * @return userType
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this UpdateAccountDetailsRequest.
     * 
     * @param userType
     */
    public void setUserType(net.bcgi.si.messages.mvnoapi.subscriber.UserType userType) {
        this.userType = userType;
    }


    /**
     * Gets the version value for this UpdateAccountDetailsRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this UpdateAccountDetailsRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this UpdateAccountDetailsRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this UpdateAccountDetailsRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
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
        _equals = true && 
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.accoutType==null && other.getAccoutType()==null) || 
             (this.accoutType!=null &&
              this.accoutType.equals(other.getAccoutType()))) &&
            ((this.billingAddressData==null && other.getBillingAddressData()==null) || 
             (this.billingAddressData!=null &&
              this.billingAddressData.equals(other.getBillingAddressData()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
            ((this.postpaidAcctId==null && other.getPostpaidAcctId()==null) || 
             (this.postpaidAcctId!=null &&
              this.postpaidAcctId.equals(other.getPostpaidAcctId()))) &&
            ((this.postpaidDetails==null && other.getPostpaidDetails()==null) || 
             (this.postpaidDetails!=null &&
              this.postpaidDetails.equals(other.getPostpaidDetails()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.updateAccountStatus==null && other.getUpdateAccountStatus()==null) || 
             (this.updateAccountStatus!=null &&
              this.updateAccountStatus.equals(other.getUpdateAccountStatus()))) &&
            ((this.userDefinedInfo==null && other.getUserDefinedInfo()==null) || 
             (this.userDefinedInfo!=null &&
              this.userDefinedInfo.equals(other.getUserDefinedInfo()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
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
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
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
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getUpdateAccountStatus() != null) {
            _hashCode += getUpdateAccountStatus().hashCode();
        }
        if (getUserDefinedInfo() != null) {
            _hashCode += getUserDefinedInfo().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateAccountDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateAccountDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SelfcareAccountStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billingAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "personalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "postpaidAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "postpaidDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PostpaidDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "securityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "serviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAccountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "updateAccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userDefinedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserDefinedInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UserType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
