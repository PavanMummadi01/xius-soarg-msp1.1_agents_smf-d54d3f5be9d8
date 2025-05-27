/**
 * RegisterAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class RegisterAccountRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.subscriber.RegisterAccountBillingData mAccountBillingData;

    private net.bcgi.si.messages.mvnoapi.provisioning.AccountChallengeData accountChallengeData;

    private net.bcgi.si.messages.mvnoapi.provisioning.AccountConfigInfo accountConfigInfo;

    private net.bcgi.si.messages.mvnoapi.provisioning.AccountInfo accountInfo;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData alternateAddressData;

    private net.bcgi.si.messages.mvnoapi.provisioning.PersonalData alternatePersonalData;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo paymentInfo;

    private net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData;

    private net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo;

    private net.bcgi.si.messages.mvnoapi.provisioning.UserType userType;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public RegisterAccountRequest() {
    }

    public RegisterAccountRequest(
           net.bcgi.si.messages.mvnoapi.subscriber.RegisterAccountBillingData mAccountBillingData,
           net.bcgi.si.messages.mvnoapi.provisioning.AccountChallengeData accountChallengeData,
           net.bcgi.si.messages.mvnoapi.provisioning.AccountConfigInfo accountConfigInfo,
           net.bcgi.si.messages.mvnoapi.provisioning.AccountInfo accountInfo,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData alternateAddressData,
           net.bcgi.si.messages.mvnoapi.provisioning.PersonalData alternatePersonalData,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo paymentInfo,
           net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData,
           net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo,
           net.bcgi.si.messages.mvnoapi.provisioning.UserType userType,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.mAccountBillingData = mAccountBillingData;
           this.accountChallengeData = accountChallengeData;
           this.accountConfigInfo = accountConfigInfo;
           this.accountInfo = accountInfo;
           this.addressData = addressData;
           this.alternateAddressData = alternateAddressData;
           this.alternatePersonalData = alternatePersonalData;
           this.messageID = messageID;
           this.paymentInfo = paymentInfo;
           this.personalData = personalData;
           this.registrationType = registrationType;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.userDefinedInfo = userDefinedInfo;
           this.userType = userType;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the mAccountBillingData value for this RegisterAccountRequest.
     * 
     * @return mAccountBillingData
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.RegisterAccountBillingData getMAccountBillingData() {
        return mAccountBillingData;
    }


    /**
     * Sets the mAccountBillingData value for this RegisterAccountRequest.
     * 
     * @param mAccountBillingData
     */
    public void setMAccountBillingData(net.bcgi.si.messages.mvnoapi.subscriber.RegisterAccountBillingData mAccountBillingData) {
        this.mAccountBillingData = mAccountBillingData;
    }


    /**
     * Gets the accountChallengeData value for this RegisterAccountRequest.
     * 
     * @return accountChallengeData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountChallengeData getAccountChallengeData() {
        return accountChallengeData;
    }


    /**
     * Sets the accountChallengeData value for this RegisterAccountRequest.
     * 
     * @param accountChallengeData
     */
    public void setAccountChallengeData(net.bcgi.si.messages.mvnoapi.provisioning.AccountChallengeData accountChallengeData) {
        this.accountChallengeData = accountChallengeData;
    }


    /**
     * Gets the accountConfigInfo value for this RegisterAccountRequest.
     * 
     * @return accountConfigInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountConfigInfo getAccountConfigInfo() {
        return accountConfigInfo;
    }


    /**
     * Sets the accountConfigInfo value for this RegisterAccountRequest.
     * 
     * @param accountConfigInfo
     */
    public void setAccountConfigInfo(net.bcgi.si.messages.mvnoapi.provisioning.AccountConfigInfo accountConfigInfo) {
        this.accountConfigInfo = accountConfigInfo;
    }


    /**
     * Gets the accountInfo value for this RegisterAccountRequest.
     * 
     * @return accountInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountInfo getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this RegisterAccountRequest.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(net.bcgi.si.messages.mvnoapi.provisioning.AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }


    /**
     * Gets the addressData value for this RegisterAccountRequest.
     * 
     * @return addressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getAddressData() {
        return addressData;
    }


    /**
     * Sets the addressData value for this RegisterAccountRequest.
     * 
     * @param addressData
     */
    public void setAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData addressData) {
        this.addressData = addressData;
    }


    /**
     * Gets the alternateAddressData value for this RegisterAccountRequest.
     * 
     * @return alternateAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getAlternateAddressData() {
        return alternateAddressData;
    }


    /**
     * Sets the alternateAddressData value for this RegisterAccountRequest.
     * 
     * @param alternateAddressData
     */
    public void setAlternateAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData alternateAddressData) {
        this.alternateAddressData = alternateAddressData;
    }


    /**
     * Gets the alternatePersonalData value for this RegisterAccountRequest.
     * 
     * @return alternatePersonalData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PersonalData getAlternatePersonalData() {
        return alternatePersonalData;
    }


    /**
     * Sets the alternatePersonalData value for this RegisterAccountRequest.
     * 
     * @param alternatePersonalData
     */
    public void setAlternatePersonalData(net.bcgi.si.messages.mvnoapi.provisioning.PersonalData alternatePersonalData) {
        this.alternatePersonalData = alternatePersonalData;
    }


    /**
     * Gets the messageID value for this RegisterAccountRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this RegisterAccountRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the paymentInfo value for this RegisterAccountRequest.
     * 
     * @return paymentInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this RegisterAccountRequest.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(net.bcgi.si.messages.mvnoapi.provisioning.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the personalData value for this RegisterAccountRequest.
     * 
     * @return personalData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this RegisterAccountRequest.
     * 
     * @param personalData
     */
    public void setPersonalData(net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData) {
        this.personalData = personalData;
    }


    /**
     * Gets the registrationType value for this RegisterAccountRequest.
     * 
     * @return registrationType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this RegisterAccountRequest.
     * 
     * @param registrationType
     */
    public void setRegistrationType(net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType) {
        this.registrationType = registrationType;
    }


    /**
     * Gets the securityId value for this RegisterAccountRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this RegisterAccountRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this RegisterAccountRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this RegisterAccountRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the userDefinedInfo value for this RegisterAccountRequest.
     * 
     * @return userDefinedInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo getUserDefinedInfo() {
        return userDefinedInfo;
    }


    /**
     * Sets the userDefinedInfo value for this RegisterAccountRequest.
     * 
     * @param userDefinedInfo
     */
    public void setUserDefinedInfo(net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo) {
        this.userDefinedInfo = userDefinedInfo;
    }


    /**
     * Gets the userType value for this RegisterAccountRequest.
     * 
     * @return userType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this RegisterAccountRequest.
     * 
     * @param userType
     */
    public void setUserType(net.bcgi.si.messages.mvnoapi.provisioning.UserType userType) {
        this.userType = userType;
    }


    /**
     * Gets the version value for this RegisterAccountRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RegisterAccountRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this RegisterAccountRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this RegisterAccountRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
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
        _equals = true && 
            ((this.mAccountBillingData==null && other.getMAccountBillingData()==null) || 
             (this.mAccountBillingData!=null &&
              this.mAccountBillingData.equals(other.getMAccountBillingData()))) &&
            ((this.accountChallengeData==null && other.getAccountChallengeData()==null) || 
             (this.accountChallengeData!=null &&
              this.accountChallengeData.equals(other.getAccountChallengeData()))) &&
            ((this.accountConfigInfo==null && other.getAccountConfigInfo()==null) || 
             (this.accountConfigInfo!=null &&
              this.accountConfigInfo.equals(other.getAccountConfigInfo()))) &&
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              this.accountInfo.equals(other.getAccountInfo()))) &&
            ((this.addressData==null && other.getAddressData()==null) || 
             (this.addressData!=null &&
              this.addressData.equals(other.getAddressData()))) &&
            ((this.alternateAddressData==null && other.getAlternateAddressData()==null) || 
             (this.alternateAddressData!=null &&
              this.alternateAddressData.equals(other.getAlternateAddressData()))) &&
            ((this.alternatePersonalData==null && other.getAlternatePersonalData()==null) || 
             (this.alternatePersonalData!=null &&
              this.alternatePersonalData.equals(other.getAlternatePersonalData()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
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
        if (getMAccountBillingData() != null) {
            _hashCode += getMAccountBillingData().hashCode();
        }
        if (getAccountChallengeData() != null) {
            _hashCode += getAccountChallengeData().hashCode();
        }
        if (getAccountConfigInfo() != null) {
            _hashCode += getAccountConfigInfo().hashCode();
        }
        if (getAccountInfo() != null) {
            _hashCode += getAccountInfo().hashCode();
        }
        if (getAddressData() != null) {
            _hashCode += getAddressData().hashCode();
        }
        if (getAlternateAddressData() != null) {
            _hashCode += getAlternateAddressData().hashCode();
        }
        if (getAlternatePersonalData() != null) {
            _hashCode += getAlternatePersonalData().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getPersonalData() != null) {
            _hashCode += getPersonalData().hashCode();
        }
        if (getRegistrationType() != null) {
            _hashCode += getRegistrationType().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
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
        new org.apache.axis.description.TypeDesc(RegisterAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegisterAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAccountBillingData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "mAccountBillingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "RegisterAccountBillingData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountChallengeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountChallengeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountChallengeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "addressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "alternateAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatePersonalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "alternatePersonalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "paymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PaymentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "registrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "securityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "serviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userDefinedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserDefinedInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "version"));
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
