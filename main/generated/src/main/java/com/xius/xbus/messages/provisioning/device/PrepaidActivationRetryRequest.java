/**
 * PrepaidActivationRetryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;


/**
 * 1. This api using to retry prepaidActivation
 */
public class PrepaidActivationRetryRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String SNA;

    private com.xius.xbus.messages.provisioning.device.SubcriberAddressInfo addressInfo;

    private java.lang.String billDay;

    private java.lang.String ATPId;

    private java.lang.Boolean isCorp;

    private java.lang.String dealerUserId;

    private java.lang.String eventFlag;

    private java.lang.String initiatedFrom;

    private java.lang.String locationCode;

    private com.xius.xbus.messages.provisioning.device.MSISDNInfo msisdnInfo;

    private java.lang.String networkName;

    private java.lang.String officeCode;

    private java.lang.String orderID;

    private com.xius.xbus.messages.provisioning.device.SubscriberOtherInfo otherInfo;

    private com.xius.xbus.messages.provisioning.device.SubcriberPersonalInfo personalInfo;

    private java.lang.String promoCode;

    private java.lang.Boolean registrationRequired;

    private com.xius.xbus.messages.provisioning.device.RegistrationType registrationType;

    private com.xius.xbus.messages.provisioning.device.SelfcareAccountStatusType subscriberStatus;

    private java.lang.String tariffPackageId;

    private java.lang.String transactionID;

    private java.lang.String failedNode;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    private java.lang.String userDefined3;

    private java.lang.String channel;

    public PrepaidActivationRetryRequest() {
    }

    public PrepaidActivationRetryRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String SNA,
           com.xius.xbus.messages.provisioning.device.SubcriberAddressInfo addressInfo,
           java.lang.String billDay,
           java.lang.String ATPId,
           java.lang.Boolean isCorp,
           java.lang.String dealerUserId,
           java.lang.String eventFlag,
           java.lang.String initiatedFrom,
           java.lang.String locationCode,
           com.xius.xbus.messages.provisioning.device.MSISDNInfo msisdnInfo,
           java.lang.String networkName,
           java.lang.String officeCode,
           java.lang.String orderID,
           com.xius.xbus.messages.provisioning.device.SubscriberOtherInfo otherInfo,
           com.xius.xbus.messages.provisioning.device.SubcriberPersonalInfo personalInfo,
           java.lang.String promoCode,
           java.lang.Boolean registrationRequired,
           com.xius.xbus.messages.provisioning.device.RegistrationType registrationType,
           com.xius.xbus.messages.provisioning.device.SelfcareAccountStatusType subscriberStatus,
           java.lang.String tariffPackageId,
           java.lang.String transactionID,
           java.lang.String failedNode,
           java.lang.String userDefined1,
           java.lang.String userDefined2,
           java.lang.String userDefined3,
           java.lang.String channel) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.SNA = SNA;
        this.addressInfo = addressInfo;
        this.billDay = billDay;
        this.ATPId = ATPId;
        this.isCorp = isCorp;
        this.dealerUserId = dealerUserId;
        this.eventFlag = eventFlag;
        this.initiatedFrom = initiatedFrom;
        this.locationCode = locationCode;
        this.msisdnInfo = msisdnInfo;
        this.networkName = networkName;
        this.officeCode = officeCode;
        this.orderID = orderID;
        this.otherInfo = otherInfo;
        this.personalInfo = personalInfo;
        this.promoCode = promoCode;
        this.registrationRequired = registrationRequired;
        this.registrationType = registrationType;
        this.subscriberStatus = subscriberStatus;
        this.tariffPackageId = tariffPackageId;
        this.transactionID = transactionID;
        this.failedNode = failedNode;
        this.userDefined1 = userDefined1;
        this.userDefined2 = userDefined2;
        this.userDefined3 = userDefined3;
        this.channel = channel;
    }


    /**
     * Gets the SNA value for this PrepaidActivationRetryRequest.
     * 
     * @return SNA
     */
    public java.lang.String getSNA() {
        return SNA;
    }


    /**
     * Sets the SNA value for this PrepaidActivationRetryRequest.
     * 
     * @param SNA
     */
    public void setSNA(java.lang.String SNA) {
        this.SNA = SNA;
    }


    /**
     * Gets the addressInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return addressInfo
     */
    public com.xius.xbus.messages.provisioning.device.SubcriberAddressInfo getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(com.xius.xbus.messages.provisioning.device.SubcriberAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the billDay value for this PrepaidActivationRetryRequest.
     * 
     * @return billDay
     */
    public java.lang.String getBillDay() {
        return billDay;
    }


    /**
     * Sets the billDay value for this PrepaidActivationRetryRequest.
     * 
     * @param billDay
     */
    public void setBillDay(java.lang.String billDay) {
        this.billDay = billDay;
    }


    /**
     * Gets the ATPId value for this PrepaidActivationRetryRequest.
     * 
     * @return ATPId
     */
    public java.lang.String getATPId() {
        return ATPId;
    }


    /**
     * Sets the ATPId value for this PrepaidActivationRetryRequest.
     * 
     * @param ATPId
     */
    public void setATPId(java.lang.String ATPId) {
        this.ATPId = ATPId;
    }


    /**
     * Gets the isCorp value for this PrepaidActivationRetryRequest.
     * 
     * @return isCorp
     */
    public java.lang.Boolean getIsCorp() {
        return isCorp;
    }


    /**
     * Sets the isCorp value for this PrepaidActivationRetryRequest.
     * 
     * @param isCorp
     */
    public void setIsCorp(java.lang.Boolean isCorp) {
        this.isCorp = isCorp;
    }


    /**
     * Gets the dealerUserId value for this PrepaidActivationRetryRequest.
     * 
     * @return dealerUserId
     */
    public java.lang.String getDealerUserId() {
        return dealerUserId;
    }


    /**
     * Sets the dealerUserId value for this PrepaidActivationRetryRequest.
     * 
     * @param dealerUserId
     */
    public void setDealerUserId(java.lang.String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }


    /**
     * Gets the eventFlag value for this PrepaidActivationRetryRequest.
     * 
     * @return eventFlag
     */
    public java.lang.String getEventFlag() {
        return eventFlag;
    }


    /**
     * Sets the eventFlag value for this PrepaidActivationRetryRequest.
     * 
     * @param eventFlag
     */
    public void setEventFlag(java.lang.String eventFlag) {
        this.eventFlag = eventFlag;
    }


    /**
     * Gets the initiatedFrom value for this PrepaidActivationRetryRequest.
     * 
     * @return initiatedFrom
     */
    public java.lang.String getInitiatedFrom() {
        return initiatedFrom;
    }


    /**
     * Sets the initiatedFrom value for this PrepaidActivationRetryRequest.
     * 
     * @param initiatedFrom
     */
    public void setInitiatedFrom(java.lang.String initiatedFrom) {
        this.initiatedFrom = initiatedFrom;
    }


    /**
     * Gets the locationCode value for this PrepaidActivationRetryRequest.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this PrepaidActivationRetryRequest.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the msisdnInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return msisdnInfo
     */
    public com.xius.xbus.messages.provisioning.device.MSISDNInfo getMsisdnInfo() {
        return msisdnInfo;
    }


    /**
     * Sets the msisdnInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param msisdnInfo
     */
    public void setMsisdnInfo(com.xius.xbus.messages.provisioning.device.MSISDNInfo msisdnInfo) {
        this.msisdnInfo = msisdnInfo;
    }


    /**
     * Gets the networkName value for this PrepaidActivationRetryRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this PrepaidActivationRetryRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the officeCode value for this PrepaidActivationRetryRequest.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this PrepaidActivationRetryRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the orderID value for this PrepaidActivationRetryRequest.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this PrepaidActivationRetryRequest.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the otherInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return otherInfo
     */
    public com.xius.xbus.messages.provisioning.device.SubscriberOtherInfo getOtherInfo() {
        return otherInfo;
    }


    /**
     * Sets the otherInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param otherInfo
     */
    public void setOtherInfo(com.xius.xbus.messages.provisioning.device.SubscriberOtherInfo otherInfo) {
        this.otherInfo = otherInfo;
    }


    /**
     * Gets the personalInfo value for this PrepaidActivationRetryRequest.
     * 
     * @return personalInfo
     */
    public com.xius.xbus.messages.provisioning.device.SubcriberPersonalInfo getPersonalInfo() {
        return personalInfo;
    }


    /**
     * Sets the personalInfo value for this PrepaidActivationRetryRequest.
     * 
     * @param personalInfo
     */
    public void setPersonalInfo(com.xius.xbus.messages.provisioning.device.SubcriberPersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }


    /**
     * Gets the promoCode value for this PrepaidActivationRetryRequest.
     * 
     * @return promoCode
     */
    public java.lang.String getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this PrepaidActivationRetryRequest.
     * 
     * @param promoCode
     */
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the registrationRequired value for this PrepaidActivationRetryRequest.
     * 
     * @return registrationRequired
     */
    public java.lang.Boolean getRegistrationRequired() {
        return registrationRequired;
    }


    /**
     * Sets the registrationRequired value for this PrepaidActivationRetryRequest.
     * 
     * @param registrationRequired
     */
    public void setRegistrationRequired(java.lang.Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }


    /**
     * Gets the registrationType value for this PrepaidActivationRetryRequest.
     * 
     * @return registrationType
     */
    public com.xius.xbus.messages.provisioning.device.RegistrationType getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this PrepaidActivationRetryRequest.
     * 
     * @param registrationType
     */
    public void setRegistrationType(com.xius.xbus.messages.provisioning.device.RegistrationType registrationType) {
        this.registrationType = registrationType;
    }


    /**
     * Gets the subscriberStatus value for this PrepaidActivationRetryRequest.
     * 
     * @return subscriberStatus
     */
    public com.xius.xbus.messages.provisioning.device.SelfcareAccountStatusType getSubscriberStatus() {
        return subscriberStatus;
    }


    /**
     * Sets the subscriberStatus value for this PrepaidActivationRetryRequest.
     * 
     * @param subscriberStatus
     */
    public void setSubscriberStatus(com.xius.xbus.messages.provisioning.device.SelfcareAccountStatusType subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }


    /**
     * Gets the tariffPackageId value for this PrepaidActivationRetryRequest.
     * 
     * @return tariffPackageId
     */
    public java.lang.String getTariffPackageId() {
        return tariffPackageId;
    }


    /**
     * Sets the tariffPackageId value for this PrepaidActivationRetryRequest.
     * 
     * @param tariffPackageId
     */
    public void setTariffPackageId(java.lang.String tariffPackageId) {
        this.tariffPackageId = tariffPackageId;
    }


    /**
     * Gets the transactionID value for this PrepaidActivationRetryRequest.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this PrepaidActivationRetryRequest.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the failedNode value for this PrepaidActivationRetryRequest.
     * 
     * @return failedNode
     */
    public java.lang.String getFailedNode() {
        return failedNode;
    }


    /**
     * Sets the failedNode value for this PrepaidActivationRetryRequest.
     * 
     * @param failedNode
     */
    public void setFailedNode(java.lang.String failedNode) {
        this.failedNode = failedNode;
    }


    /**
     * Gets the userDefined1 value for this PrepaidActivationRetryRequest.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this PrepaidActivationRetryRequest.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this PrepaidActivationRetryRequest.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this PrepaidActivationRetryRequest.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }


    /**
     * Gets the userDefined3 value for this PrepaidActivationRetryRequest.
     * 
     * @return userDefined3
     */
    public java.lang.String getUserDefined3() {
        return userDefined3;
    }


    /**
     * Sets the userDefined3 value for this PrepaidActivationRetryRequest.
     * 
     * @param userDefined3
     */
    public void setUserDefined3(java.lang.String userDefined3) {
        this.userDefined3 = userDefined3;
    }


    /**
     * Gets the channel value for this PrepaidActivationRetryRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this PrepaidActivationRetryRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepaidActivationRetryRequest)) return false;
        PrepaidActivationRetryRequest other = (PrepaidActivationRetryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SNA==null && other.getSNA()==null) || 
             (this.SNA!=null &&
              this.SNA.equals(other.getSNA()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.billDay==null && other.getBillDay()==null) || 
             (this.billDay!=null &&
              this.billDay.equals(other.getBillDay()))) &&
            ((this.ATPId==null && other.getATPId()==null) || 
             (this.ATPId!=null &&
              this.ATPId.equals(other.getATPId()))) &&
            ((this.isCorp==null && other.getIsCorp()==null) || 
             (this.isCorp!=null &&
              this.isCorp.equals(other.getIsCorp()))) &&
            ((this.dealerUserId==null && other.getDealerUserId()==null) || 
             (this.dealerUserId!=null &&
              this.dealerUserId.equals(other.getDealerUserId()))) &&
            ((this.eventFlag==null && other.getEventFlag()==null) || 
             (this.eventFlag!=null &&
              this.eventFlag.equals(other.getEventFlag()))) &&
            ((this.initiatedFrom==null && other.getInitiatedFrom()==null) || 
             (this.initiatedFrom!=null &&
              this.initiatedFrom.equals(other.getInitiatedFrom()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.msisdnInfo==null && other.getMsisdnInfo()==null) || 
             (this.msisdnInfo!=null &&
              this.msisdnInfo.equals(other.getMsisdnInfo()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.otherInfo==null && other.getOtherInfo()==null) || 
             (this.otherInfo!=null &&
              this.otherInfo.equals(other.getOtherInfo()))) &&
            ((this.personalInfo==null && other.getPersonalInfo()==null) || 
             (this.personalInfo!=null &&
              this.personalInfo.equals(other.getPersonalInfo()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.registrationRequired==null && other.getRegistrationRequired()==null) || 
             (this.registrationRequired!=null &&
              this.registrationRequired.equals(other.getRegistrationRequired()))) &&
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType()))) &&
            ((this.subscriberStatus==null && other.getSubscriberStatus()==null) || 
             (this.subscriberStatus!=null &&
              this.subscriberStatus.equals(other.getSubscriberStatus()))) &&
            ((this.tariffPackageId==null && other.getTariffPackageId()==null) || 
             (this.tariffPackageId!=null &&
              this.tariffPackageId.equals(other.getTariffPackageId()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.failedNode==null && other.getFailedNode()==null) || 
             (this.failedNode!=null &&
              this.failedNode.equals(other.getFailedNode()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2()))) &&
            ((this.userDefined3==null && other.getUserDefined3()==null) || 
             (this.userDefined3!=null &&
              this.userDefined3.equals(other.getUserDefined3()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        if (getSNA() != null) {
            _hashCode += getSNA().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getBillDay() != null) {
            _hashCode += getBillDay().hashCode();
        }
        if (getATPId() != null) {
            _hashCode += getATPId().hashCode();
        }
        if (getIsCorp() != null) {
            _hashCode += getIsCorp().hashCode();
        }
        if (getDealerUserId() != null) {
            _hashCode += getDealerUserId().hashCode();
        }
        if (getEventFlag() != null) {
            _hashCode += getEventFlag().hashCode();
        }
        if (getInitiatedFrom() != null) {
            _hashCode += getInitiatedFrom().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getMsisdnInfo() != null) {
            _hashCode += getMsisdnInfo().hashCode();
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getOtherInfo() != null) {
            _hashCode += getOtherInfo().hashCode();
        }
        if (getPersonalInfo() != null) {
            _hashCode += getPersonalInfo().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getRegistrationRequired() != null) {
            _hashCode += getRegistrationRequired().hashCode();
        }
        if (getRegistrationType() != null) {
            _hashCode += getRegistrationType().hashCode();
        }
        if (getSubscriberStatus() != null) {
            _hashCode += getSubscriberStatus().hashCode();
        }
        if (getTariffPackageId() != null) {
            _hashCode += getTariffPackageId().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getFailedNode() != null) {
            _hashCode += getFailedNode().hashCode();
        }
        if (getUserDefined1() != null) {
            _hashCode += getUserDefined1().hashCode();
        }
        if (getUserDefined2() != null) {
            _hashCode += getUserDefined2().hashCode();
        }
        if (getUserDefined3() != null) {
            _hashCode += getUserDefined3().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepaidActivationRetryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">prepaidActivationRetryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "SNA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "addressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "subcriberAddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "billDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "ATPId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCorp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "isCorp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "dealerUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "eventFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "initiatedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "msisdnInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "MSISDNInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "otherInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "subscriberOtherInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "personalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "subcriberPersonalInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "registrationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "registrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "RegistrationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "subscriberStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "SelfcareAccountStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "tariffPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "failedNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "userDefined3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "channel"));
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
