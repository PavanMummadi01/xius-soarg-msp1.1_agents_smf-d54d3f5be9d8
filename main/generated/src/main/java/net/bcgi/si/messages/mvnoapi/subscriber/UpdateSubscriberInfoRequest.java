/**
 * UpdateSubscriberInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class UpdateSubscriberInfoRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData;

    private java.lang.String messageID;

    private java.lang.String networkName;

    private net.bcgi.si.messages.mvnoapi.subscriber.AccountId newAccountId;

    private net.bcgi.si.messages.mvnoapi.subscriber.AccountId oldAccountId;

    private net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String simNumber;

    private net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public UpdateSubscriberInfoRequest() {
    }

    public UpdateSubscriberInfoRequest(
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData,
           java.lang.String messageID,
           java.lang.String networkName,
           net.bcgi.si.messages.mvnoapi.subscriber.AccountId newAccountId,
           net.bcgi.si.messages.mvnoapi.subscriber.AccountId oldAccountId,
           net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String simNumber,
           net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.billingAddressData = billingAddressData;
           this.messageID = messageID;
           this.networkName = networkName;
           this.newAccountId = newAccountId;
           this.oldAccountId = oldAccountId;
           this.personalData = personalData;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.simNumber = simNumber;
           this.userDefinedInfo = userDefinedInfo;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the billingAddressData value for this UpdateSubscriberInfoRequest.
     * 
     * @return billingAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getBillingAddressData() {
        return billingAddressData;
    }


    /**
     * Sets the billingAddressData value for this UpdateSubscriberInfoRequest.
     * 
     * @param billingAddressData
     */
    public void setBillingAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData) {
        this.billingAddressData = billingAddressData;
    }


    /**
     * Gets the messageID value for this UpdateSubscriberInfoRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this UpdateSubscriberInfoRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the networkName value for this UpdateSubscriberInfoRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this UpdateSubscriberInfoRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the newAccountId value for this UpdateSubscriberInfoRequest.
     * 
     * @return newAccountId
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountId getNewAccountId() {
        return newAccountId;
    }


    /**
     * Sets the newAccountId value for this UpdateSubscriberInfoRequest.
     * 
     * @param newAccountId
     */
    public void setNewAccountId(net.bcgi.si.messages.mvnoapi.subscriber.AccountId newAccountId) {
        this.newAccountId = newAccountId;
    }


    /**
     * Gets the oldAccountId value for this UpdateSubscriberInfoRequest.
     * 
     * @return oldAccountId
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountId getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this UpdateSubscriberInfoRequest.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(net.bcgi.si.messages.mvnoapi.subscriber.AccountId oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the personalData value for this UpdateSubscriberInfoRequest.
     * 
     * @return personalData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this UpdateSubscriberInfoRequest.
     * 
     * @param personalData
     */
    public void setPersonalData(net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData) {
        this.personalData = personalData;
    }


    /**
     * Gets the securityId value for this UpdateSubscriberInfoRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this UpdateSubscriberInfoRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this UpdateSubscriberInfoRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this UpdateSubscriberInfoRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the simNumber value for this UpdateSubscriberInfoRequest.
     * 
     * @return simNumber
     */
    public java.lang.String getSimNumber() {
        return simNumber;
    }


    /**
     * Sets the simNumber value for this UpdateSubscriberInfoRequest.
     * 
     * @param simNumber
     */
    public void setSimNumber(java.lang.String simNumber) {
        this.simNumber = simNumber;
    }


    /**
     * Gets the userDefinedInfo value for this UpdateSubscriberInfoRequest.
     * 
     * @return userDefinedInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo getUserDefinedInfo() {
        return userDefinedInfo;
    }


    /**
     * Sets the userDefinedInfo value for this UpdateSubscriberInfoRequest.
     * 
     * @param userDefinedInfo
     */
    public void setUserDefinedInfo(net.bcgi.si.messages.mvnoapi.provisioning.UserDefinedInfo userDefinedInfo) {
        this.userDefinedInfo = userDefinedInfo;
    }


    /**
     * Gets the version value for this UpdateSubscriberInfoRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this UpdateSubscriberInfoRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this UpdateSubscriberInfoRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this UpdateSubscriberInfoRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSubscriberInfoRequest)) return false;
        UpdateSubscriberInfoRequest other = (UpdateSubscriberInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAddressData==null && other.getBillingAddressData()==null) || 
             (this.billingAddressData!=null &&
              this.billingAddressData.equals(other.getBillingAddressData()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.newAccountId==null && other.getNewAccountId()==null) || 
             (this.newAccountId!=null &&
              this.newAccountId.equals(other.getNewAccountId()))) &&
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.simNumber==null && other.getSimNumber()==null) || 
             (this.simNumber!=null &&
              this.simNumber.equals(other.getSimNumber()))) &&
            ((this.userDefinedInfo==null && other.getUserDefinedInfo()==null) || 
             (this.userDefinedInfo!=null &&
              this.userDefinedInfo.equals(other.getUserDefinedInfo()))) &&
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
        if (getBillingAddressData() != null) {
            _hashCode += getBillingAddressData().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getNewAccountId() != null) {
            _hashCode += getNewAccountId().hashCode();
        }
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getPersonalData() != null) {
            _hashCode += getPersonalData().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getSimNumber() != null) {
            _hashCode += getSimNumber().hashCode();
        }
        if (getUserDefinedInfo() != null) {
            _hashCode += getUserDefinedInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateSubscriberInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateSubscriberInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "newAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "oldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountId"));
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
        elemField.setFieldName("simNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "simNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userDefinedInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UserDefinedInfo"));
        elemField.setMinOccurs(0);
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
