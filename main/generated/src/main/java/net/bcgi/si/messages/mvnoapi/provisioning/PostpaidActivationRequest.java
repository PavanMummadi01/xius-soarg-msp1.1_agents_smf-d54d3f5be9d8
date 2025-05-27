/**
 * PostpaidActivationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class PostpaidActivationRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo addressInfo;

    private net.bcgi.si.messages.mvnoapi.provisioning.ChildAddAccType lineInfo;

    private java.lang.Boolean isCorp;

    private java.lang.String dealerUserId;

    private java.lang.String initiatedFrom;

    private java.lang.String locationCode;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo msisdnInfo;

    private java.lang.String networkName;

    private java.lang.String isMainLine;

    private java.lang.String isSubLine;

    private java.lang.String officeCode;

    private java.lang.String orderID;

    private net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo otherInfo;

    private net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo personalInfo;

    private net.bcgi.si.messages.mvnoapi.common.PostpaidDetails postpaidDetails;

    private java.lang.String promoCode;

    private java.lang.Boolean registrationRequired;

    private net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType subscriberStatus;

    private net.bcgi.si.messages.mvnoapi.common.UserType userType;

    private java.lang.String version;

    private java.lang.String tariffPackageId;

    private org.apache.axis.message.MessageElement [] _any;

    public PostpaidActivationRequest() {
    }

    public PostpaidActivationRequest(
           net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo addressInfo,
           net.bcgi.si.messages.mvnoapi.provisioning.ChildAddAccType lineInfo,
           java.lang.Boolean isCorp,
           java.lang.String dealerUserId,
           java.lang.String initiatedFrom,
           java.lang.String locationCode,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo msisdnInfo,
           java.lang.String networkName,
           java.lang.String isMainLine,
           java.lang.String isSubLine,
           java.lang.String officeCode,
           java.lang.String orderID,
           net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo otherInfo,
           net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo personalInfo,
           net.bcgi.si.messages.mvnoapi.common.PostpaidDetails postpaidDetails,
           java.lang.String promoCode,
           java.lang.Boolean registrationRequired,
           net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType subscriberStatus,
           net.bcgi.si.messages.mvnoapi.common.UserType userType,
           java.lang.String version,
           java.lang.String tariffPackageId,
           org.apache.axis.message.MessageElement [] _any) {
           this.addressInfo = addressInfo;
           this.lineInfo = lineInfo;
           this.isCorp = isCorp;
           this.dealerUserId = dealerUserId;
           this.initiatedFrom = initiatedFrom;
           this.locationCode = locationCode;
           this.messageID = messageID;
           this.msisdnInfo = msisdnInfo;
           this.networkName = networkName;
           this.isMainLine = isMainLine;
           this.isSubLine = isSubLine;
           this.officeCode = officeCode;
           this.orderID = orderID;
           this.otherInfo = otherInfo;
           this.personalInfo = personalInfo;
           this.postpaidDetails = postpaidDetails;
           this.promoCode = promoCode;
           this.registrationRequired = registrationRequired;
           this.registrationType = registrationType;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.subscriberStatus = subscriberStatus;
           this.userType = userType;
           this.version = version;
           this.tariffPackageId = tariffPackageId;
           this._any = _any;
    }


    /**
     * Gets the addressInfo value for this PostpaidActivationRequest.
     * 
     * @return addressInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this PostpaidActivationRequest.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the lineInfo value for this PostpaidActivationRequest.
     * 
     * @return lineInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.ChildAddAccType getLineInfo() {
        return lineInfo;
    }


    /**
     * Sets the lineInfo value for this PostpaidActivationRequest.
     * 
     * @param lineInfo
     */
    public void setLineInfo(net.bcgi.si.messages.mvnoapi.provisioning.ChildAddAccType lineInfo) {
        this.lineInfo = lineInfo;
    }


    /**
     * Gets the isCorp value for this PostpaidActivationRequest.
     * 
     * @return isCorp
     */
    public java.lang.Boolean getIsCorp() {
        return isCorp;
    }


    /**
     * Sets the isCorp value for this PostpaidActivationRequest.
     * 
     * @param isCorp
     */
    public void setIsCorp(java.lang.Boolean isCorp) {
        this.isCorp = isCorp;
    }


    /**
     * Gets the dealerUserId value for this PostpaidActivationRequest.
     * 
     * @return dealerUserId
     */
    public java.lang.String getDealerUserId() {
        return dealerUserId;
    }


    /**
     * Sets the dealerUserId value for this PostpaidActivationRequest.
     * 
     * @param dealerUserId
     */
    public void setDealerUserId(java.lang.String dealerUserId) {
        this.dealerUserId = dealerUserId;
    }


    /**
     * Gets the initiatedFrom value for this PostpaidActivationRequest.
     * 
     * @return initiatedFrom
     */
    public java.lang.String getInitiatedFrom() {
        return initiatedFrom;
    }


    /**
     * Sets the initiatedFrom value for this PostpaidActivationRequest.
     * 
     * @param initiatedFrom
     */
    public void setInitiatedFrom(java.lang.String initiatedFrom) {
        this.initiatedFrom = initiatedFrom;
    }


    /**
     * Gets the locationCode value for this PostpaidActivationRequest.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this PostpaidActivationRequest.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the messageID value for this PostpaidActivationRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this PostpaidActivationRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the msisdnInfo value for this PostpaidActivationRequest.
     * 
     * @return msisdnInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo getMsisdnInfo() {
        return msisdnInfo;
    }


    /**
     * Sets the msisdnInfo value for this PostpaidActivationRequest.
     * 
     * @param msisdnInfo
     */
    public void setMsisdnInfo(net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo msisdnInfo) {
        this.msisdnInfo = msisdnInfo;
    }


    /**
     * Gets the networkName value for this PostpaidActivationRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this PostpaidActivationRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the isMainLine value for this PostpaidActivationRequest.
     * 
     * @return isMainLine
     */
    public java.lang.String getIsMainLine() {
        return isMainLine;
    }


    /**
     * Sets the isMainLine value for this PostpaidActivationRequest.
     * 
     * @param isMainLine
     */
    public void setIsMainLine(java.lang.String isMainLine) {
        this.isMainLine = isMainLine;
    }


    /**
     * Gets the isSubLine value for this PostpaidActivationRequest.
     * 
     * @return isSubLine
     */
    public java.lang.String getIsSubLine() {
        return isSubLine;
    }


    /**
     * Sets the isSubLine value for this PostpaidActivationRequest.
     * 
     * @param isSubLine
     */
    public void setIsSubLine(java.lang.String isSubLine) {
        this.isSubLine = isSubLine;
    }


    /**
     * Gets the officeCode value for this PostpaidActivationRequest.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this PostpaidActivationRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the orderID value for this PostpaidActivationRequest.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this PostpaidActivationRequest.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the otherInfo value for this PostpaidActivationRequest.
     * 
     * @return otherInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo getOtherInfo() {
        return otherInfo;
    }


    /**
     * Sets the otherInfo value for this PostpaidActivationRequest.
     * 
     * @param otherInfo
     */
    public void setOtherInfo(net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo otherInfo) {
        this.otherInfo = otherInfo;
    }


    /**
     * Gets the personalInfo value for this PostpaidActivationRequest.
     * 
     * @return personalInfo
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo getPersonalInfo() {
        return personalInfo;
    }


    /**
     * Sets the personalInfo value for this PostpaidActivationRequest.
     * 
     * @param personalInfo
     */
    public void setPersonalInfo(net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }


    /**
     * Gets the postpaidDetails value for this PostpaidActivationRequest.
     * 
     * @return postpaidDetails
     */
    public net.bcgi.si.messages.mvnoapi.common.PostpaidDetails getPostpaidDetails() {
        return postpaidDetails;
    }


    /**
     * Sets the postpaidDetails value for this PostpaidActivationRequest.
     * 
     * @param postpaidDetails
     */
    public void setPostpaidDetails(net.bcgi.si.messages.mvnoapi.common.PostpaidDetails postpaidDetails) {
        this.postpaidDetails = postpaidDetails;
    }


    /**
     * Gets the promoCode value for this PostpaidActivationRequest.
     * 
     * @return promoCode
     */
    public java.lang.String getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this PostpaidActivationRequest.
     * 
     * @param promoCode
     */
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the registrationRequired value for this PostpaidActivationRequest.
     * 
     * @return registrationRequired
     */
    public java.lang.Boolean getRegistrationRequired() {
        return registrationRequired;
    }


    /**
     * Sets the registrationRequired value for this PostpaidActivationRequest.
     * 
     * @param registrationRequired
     */
    public void setRegistrationRequired(java.lang.Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }


    /**
     * Gets the registrationType value for this PostpaidActivationRequest.
     * 
     * @return registrationType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this PostpaidActivationRequest.
     * 
     * @param registrationType
     */
    public void setRegistrationType(net.bcgi.si.messages.mvnoapi.provisioning.RegistrationType registrationType) {
        this.registrationType = registrationType;
    }


    /**
     * Gets the securityId value for this PostpaidActivationRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this PostpaidActivationRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this PostpaidActivationRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this PostpaidActivationRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the subscriberStatus value for this PostpaidActivationRequest.
     * 
     * @return subscriberStatus
     */
    public net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType getSubscriberStatus() {
        return subscriberStatus;
    }


    /**
     * Sets the subscriberStatus value for this PostpaidActivationRequest.
     * 
     * @param subscriberStatus
     */
    public void setSubscriberStatus(net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }


    /**
     * Gets the userType value for this PostpaidActivationRequest.
     * 
     * @return userType
     */
    public net.bcgi.si.messages.mvnoapi.common.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this PostpaidActivationRequest.
     * 
     * @param userType
     */
    public void setUserType(net.bcgi.si.messages.mvnoapi.common.UserType userType) {
        this.userType = userType;
    }


    /**
     * Gets the version value for this PostpaidActivationRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PostpaidActivationRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the tariffPackageId value for this PostpaidActivationRequest.
     * 
     * @return tariffPackageId
     */
    public java.lang.String getTariffPackageId() {
        return tariffPackageId;
    }


    /**
     * Sets the tariffPackageId value for this PostpaidActivationRequest.
     * 
     * @param tariffPackageId
     */
    public void setTariffPackageId(java.lang.String tariffPackageId) {
        this.tariffPackageId = tariffPackageId;
    }


    /**
     * Gets the _any value for this PostpaidActivationRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PostpaidActivationRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostpaidActivationRequest)) return false;
        PostpaidActivationRequest other = (PostpaidActivationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.lineInfo==null && other.getLineInfo()==null) || 
             (this.lineInfo!=null &&
              this.lineInfo.equals(other.getLineInfo()))) &&
            ((this.isCorp==null && other.getIsCorp()==null) || 
             (this.isCorp!=null &&
              this.isCorp.equals(other.getIsCorp()))) &&
            ((this.dealerUserId==null && other.getDealerUserId()==null) || 
             (this.dealerUserId!=null &&
              this.dealerUserId.equals(other.getDealerUserId()))) &&
            ((this.initiatedFrom==null && other.getInitiatedFrom()==null) || 
             (this.initiatedFrom!=null &&
              this.initiatedFrom.equals(other.getInitiatedFrom()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.msisdnInfo==null && other.getMsisdnInfo()==null) || 
             (this.msisdnInfo!=null &&
              this.msisdnInfo.equals(other.getMsisdnInfo()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.isMainLine==null && other.getIsMainLine()==null) || 
             (this.isMainLine!=null &&
              this.isMainLine.equals(other.getIsMainLine()))) &&
            ((this.isSubLine==null && other.getIsSubLine()==null) || 
             (this.isSubLine!=null &&
              this.isSubLine.equals(other.getIsSubLine()))) &&
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
            ((this.postpaidDetails==null && other.getPostpaidDetails()==null) || 
             (this.postpaidDetails!=null &&
              this.postpaidDetails.equals(other.getPostpaidDetails()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.registrationRequired==null && other.getRegistrationRequired()==null) || 
             (this.registrationRequired!=null &&
              this.registrationRequired.equals(other.getRegistrationRequired()))) &&
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.subscriberStatus==null && other.getSubscriberStatus()==null) || 
             (this.subscriberStatus!=null &&
              this.subscriberStatus.equals(other.getSubscriberStatus()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.tariffPackageId==null && other.getTariffPackageId()==null) || 
             (this.tariffPackageId!=null &&
              this.tariffPackageId.equals(other.getTariffPackageId()))) &&
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
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getLineInfo() != null) {
            _hashCode += getLineInfo().hashCode();
        }
        if (getIsCorp() != null) {
            _hashCode += getIsCorp().hashCode();
        }
        if (getDealerUserId() != null) {
            _hashCode += getDealerUserId().hashCode();
        }
        if (getInitiatedFrom() != null) {
            _hashCode += getInitiatedFrom().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getMsisdnInfo() != null) {
            _hashCode += getMsisdnInfo().hashCode();
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getIsMainLine() != null) {
            _hashCode += getIsMainLine().hashCode();
        }
        if (getIsSubLine() != null) {
            _hashCode += getIsSubLine().hashCode();
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
        if (getPostpaidDetails() != null) {
            _hashCode += getPostpaidDetails().hashCode();
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
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getSubscriberStatus() != null) {
            _hashCode += getSubscriberStatus().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getTariffPackageId() != null) {
            _hashCode += getTariffPackageId().hashCode();
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
        new org.apache.axis.description.TypeDesc(PostpaidActivationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidActivationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "addressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subcriberAddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "lineInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "childAddAccType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCorp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "isCorp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dealerUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "initiatedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("msisdnInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "msisdnInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "MSISDNInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMainLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "isMainLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSubLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "isSubLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "otherInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberOtherInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subcriberPersonalInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "postpaidDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PostpaidDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "registrationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "registrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "RegistrationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("subscriberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SelfcareAccountStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "UserType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "tariffPackageId"));
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
