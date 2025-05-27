/**
 * InitiateMNPNotificationsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class InitiateMNPNotificationsRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.common.IdData[] bulkIds;

    private java.lang.String companyEmailId;

    private java.lang.String content;

    private java.lang.String[] emailIDs;

    private net.bcgi.si.messages.mvnoapi.provisioning.EmailNotificationType emailNotificationType;

    private net.bcgi.si.messages.mvnoapi.provisioning.IdentityData identityData;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] msisdns;

    private java.lang.String networkID;

    private net.bcgi.si.messages.mvnoapi.provisioning.NotificationPurposeType notificationPurpose;

    private net.bcgi.si.messages.mvnoapi.provisioning.NotificationType notificationType;

    private java.lang.String nprACKReceivedTime;

    private java.lang.String nprSubmittedTime;

    private java.lang.String password;

    private java.lang.String portId;

    private java.lang.String portRequestFormID;

    private net.bcgi.si.messages.mvnoapi.common.RejectData[] rejectData;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String thresholdTime;

    private java.lang.String userName;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public InitiateMNPNotificationsRequest() {
    }

    public InitiateMNPNotificationsRequest(
           net.bcgi.si.messages.mvnoapi.common.IdData[] bulkIds,
           java.lang.String companyEmailId,
           java.lang.String content,
           java.lang.String[] emailIDs,
           net.bcgi.si.messages.mvnoapi.provisioning.EmailNotificationType emailNotificationType,
           net.bcgi.si.messages.mvnoapi.provisioning.IdentityData identityData,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] msisdns,
           java.lang.String networkID,
           net.bcgi.si.messages.mvnoapi.provisioning.NotificationPurposeType notificationPurpose,
           net.bcgi.si.messages.mvnoapi.provisioning.NotificationType notificationType,
           java.lang.String nprACKReceivedTime,
           java.lang.String nprSubmittedTime,
           java.lang.String password,
           java.lang.String portId,
           java.lang.String portRequestFormID,
           net.bcgi.si.messages.mvnoapi.common.RejectData[] rejectData,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String thresholdTime,
           java.lang.String userName,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.bulkIds = bulkIds;
           this.companyEmailId = companyEmailId;
           this.content = content;
           this.emailIDs = emailIDs;
           this.emailNotificationType = emailNotificationType;
           this.identityData = identityData;
           this.messageID = messageID;
           this.msisdns = msisdns;
           this.networkID = networkID;
           this.notificationPurpose = notificationPurpose;
           this.notificationType = notificationType;
           this.nprACKReceivedTime = nprACKReceivedTime;
           this.nprSubmittedTime = nprSubmittedTime;
           this.password = password;
           this.portId = portId;
           this.portRequestFormID = portRequestFormID;
           this.rejectData = rejectData;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.thresholdTime = thresholdTime;
           this.userName = userName;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the bulkIds value for this InitiateMNPNotificationsRequest.
     * 
     * @return bulkIds
     */
    public net.bcgi.si.messages.mvnoapi.common.IdData[] getBulkIds() {
        return bulkIds;
    }


    /**
     * Sets the bulkIds value for this InitiateMNPNotificationsRequest.
     * 
     * @param bulkIds
     */
    public void setBulkIds(net.bcgi.si.messages.mvnoapi.common.IdData[] bulkIds) {
        this.bulkIds = bulkIds;
    }


    /**
     * Gets the companyEmailId value for this InitiateMNPNotificationsRequest.
     * 
     * @return companyEmailId
     */
    public java.lang.String getCompanyEmailId() {
        return companyEmailId;
    }


    /**
     * Sets the companyEmailId value for this InitiateMNPNotificationsRequest.
     * 
     * @param companyEmailId
     */
    public void setCompanyEmailId(java.lang.String companyEmailId) {
        this.companyEmailId = companyEmailId;
    }


    /**
     * Gets the content value for this InitiateMNPNotificationsRequest.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this InitiateMNPNotificationsRequest.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the emailIDs value for this InitiateMNPNotificationsRequest.
     * 
     * @return emailIDs
     */
    public java.lang.String[] getEmailIDs() {
        return emailIDs;
    }


    /**
     * Sets the emailIDs value for this InitiateMNPNotificationsRequest.
     * 
     * @param emailIDs
     */
    public void setEmailIDs(java.lang.String[] emailIDs) {
        this.emailIDs = emailIDs;
    }


    /**
     * Gets the emailNotificationType value for this InitiateMNPNotificationsRequest.
     * 
     * @return emailNotificationType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.EmailNotificationType getEmailNotificationType() {
        return emailNotificationType;
    }


    /**
     * Sets the emailNotificationType value for this InitiateMNPNotificationsRequest.
     * 
     * @param emailNotificationType
     */
    public void setEmailNotificationType(net.bcgi.si.messages.mvnoapi.provisioning.EmailNotificationType emailNotificationType) {
        this.emailNotificationType = emailNotificationType;
    }


    /**
     * Gets the identityData value for this InitiateMNPNotificationsRequest.
     * 
     * @return identityData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.IdentityData getIdentityData() {
        return identityData;
    }


    /**
     * Sets the identityData value for this InitiateMNPNotificationsRequest.
     * 
     * @param identityData
     */
    public void setIdentityData(net.bcgi.si.messages.mvnoapi.provisioning.IdentityData identityData) {
        this.identityData = identityData;
    }


    /**
     * Gets the messageID value for this InitiateMNPNotificationsRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this InitiateMNPNotificationsRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the msisdns value for this InitiateMNPNotificationsRequest.
     * 
     * @return msisdns
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] getMsisdns() {
        return msisdns;
    }


    /**
     * Sets the msisdns value for this InitiateMNPNotificationsRequest.
     * 
     * @param msisdns
     */
    public void setMsisdns(net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] msisdns) {
        this.msisdns = msisdns;
    }


    /**
     * Gets the networkID value for this InitiateMNPNotificationsRequest.
     * 
     * @return networkID
     */
    public java.lang.String getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this InitiateMNPNotificationsRequest.
     * 
     * @param networkID
     */
    public void setNetworkID(java.lang.String networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the notificationPurpose value for this InitiateMNPNotificationsRequest.
     * 
     * @return notificationPurpose
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.NotificationPurposeType getNotificationPurpose() {
        return notificationPurpose;
    }


    /**
     * Sets the notificationPurpose value for this InitiateMNPNotificationsRequest.
     * 
     * @param notificationPurpose
     */
    public void setNotificationPurpose(net.bcgi.si.messages.mvnoapi.provisioning.NotificationPurposeType notificationPurpose) {
        this.notificationPurpose = notificationPurpose;
    }


    /**
     * Gets the notificationType value for this InitiateMNPNotificationsRequest.
     * 
     * @return notificationType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.NotificationType getNotificationType() {
        return notificationType;
    }


    /**
     * Sets the notificationType value for this InitiateMNPNotificationsRequest.
     * 
     * @param notificationType
     */
    public void setNotificationType(net.bcgi.si.messages.mvnoapi.provisioning.NotificationType notificationType) {
        this.notificationType = notificationType;
    }


    /**
     * Gets the nprACKReceivedTime value for this InitiateMNPNotificationsRequest.
     * 
     * @return nprACKReceivedTime
     */
    public java.lang.String getNprACKReceivedTime() {
        return nprACKReceivedTime;
    }


    /**
     * Sets the nprACKReceivedTime value for this InitiateMNPNotificationsRequest.
     * 
     * @param nprACKReceivedTime
     */
    public void setNprACKReceivedTime(java.lang.String nprACKReceivedTime) {
        this.nprACKReceivedTime = nprACKReceivedTime;
    }


    /**
     * Gets the nprSubmittedTime value for this InitiateMNPNotificationsRequest.
     * 
     * @return nprSubmittedTime
     */
    public java.lang.String getNprSubmittedTime() {
        return nprSubmittedTime;
    }


    /**
     * Sets the nprSubmittedTime value for this InitiateMNPNotificationsRequest.
     * 
     * @param nprSubmittedTime
     */
    public void setNprSubmittedTime(java.lang.String nprSubmittedTime) {
        this.nprSubmittedTime = nprSubmittedTime;
    }


    /**
     * Gets the password value for this InitiateMNPNotificationsRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this InitiateMNPNotificationsRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the portId value for this InitiateMNPNotificationsRequest.
     * 
     * @return portId
     */
    public java.lang.String getPortId() {
        return portId;
    }


    /**
     * Sets the portId value for this InitiateMNPNotificationsRequest.
     * 
     * @param portId
     */
    public void setPortId(java.lang.String portId) {
        this.portId = portId;
    }


    /**
     * Gets the portRequestFormID value for this InitiateMNPNotificationsRequest.
     * 
     * @return portRequestFormID
     */
    public java.lang.String getPortRequestFormID() {
        return portRequestFormID;
    }


    /**
     * Sets the portRequestFormID value for this InitiateMNPNotificationsRequest.
     * 
     * @param portRequestFormID
     */
    public void setPortRequestFormID(java.lang.String portRequestFormID) {
        this.portRequestFormID = portRequestFormID;
    }


    /**
     * Gets the rejectData value for this InitiateMNPNotificationsRequest.
     * 
     * @return rejectData
     */
    public net.bcgi.si.messages.mvnoapi.common.RejectData[] getRejectData() {
        return rejectData;
    }


    /**
     * Sets the rejectData value for this InitiateMNPNotificationsRequest.
     * 
     * @param rejectData
     */
    public void setRejectData(net.bcgi.si.messages.mvnoapi.common.RejectData[] rejectData) {
        this.rejectData = rejectData;
    }


    /**
     * Gets the securityId value for this InitiateMNPNotificationsRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this InitiateMNPNotificationsRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this InitiateMNPNotificationsRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this InitiateMNPNotificationsRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the thresholdTime value for this InitiateMNPNotificationsRequest.
     * 
     * @return thresholdTime
     */
    public java.lang.String getThresholdTime() {
        return thresholdTime;
    }


    /**
     * Sets the thresholdTime value for this InitiateMNPNotificationsRequest.
     * 
     * @param thresholdTime
     */
    public void setThresholdTime(java.lang.String thresholdTime) {
        this.thresholdTime = thresholdTime;
    }


    /**
     * Gets the userName value for this InitiateMNPNotificationsRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this InitiateMNPNotificationsRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the version value for this InitiateMNPNotificationsRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this InitiateMNPNotificationsRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this InitiateMNPNotificationsRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this InitiateMNPNotificationsRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiateMNPNotificationsRequest)) return false;
        InitiateMNPNotificationsRequest other = (InitiateMNPNotificationsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkIds==null && other.getBulkIds()==null) || 
             (this.bulkIds!=null &&
              java.util.Arrays.equals(this.bulkIds, other.getBulkIds()))) &&
            ((this.companyEmailId==null && other.getCompanyEmailId()==null) || 
             (this.companyEmailId!=null &&
              this.companyEmailId.equals(other.getCompanyEmailId()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.emailIDs==null && other.getEmailIDs()==null) || 
             (this.emailIDs!=null &&
              java.util.Arrays.equals(this.emailIDs, other.getEmailIDs()))) &&
            ((this.emailNotificationType==null && other.getEmailNotificationType()==null) || 
             (this.emailNotificationType!=null &&
              this.emailNotificationType.equals(other.getEmailNotificationType()))) &&
            ((this.identityData==null && other.getIdentityData()==null) || 
             (this.identityData!=null &&
              this.identityData.equals(other.getIdentityData()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.msisdns==null && other.getMsisdns()==null) || 
             (this.msisdns!=null &&
              java.util.Arrays.equals(this.msisdns, other.getMsisdns()))) &&
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.notificationPurpose==null && other.getNotificationPurpose()==null) || 
             (this.notificationPurpose!=null &&
              this.notificationPurpose.equals(other.getNotificationPurpose()))) &&
            ((this.notificationType==null && other.getNotificationType()==null) || 
             (this.notificationType!=null &&
              this.notificationType.equals(other.getNotificationType()))) &&
            ((this.nprACKReceivedTime==null && other.getNprACKReceivedTime()==null) || 
             (this.nprACKReceivedTime!=null &&
              this.nprACKReceivedTime.equals(other.getNprACKReceivedTime()))) &&
            ((this.nprSubmittedTime==null && other.getNprSubmittedTime()==null) || 
             (this.nprSubmittedTime!=null &&
              this.nprSubmittedTime.equals(other.getNprSubmittedTime()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.portId==null && other.getPortId()==null) || 
             (this.portId!=null &&
              this.portId.equals(other.getPortId()))) &&
            ((this.portRequestFormID==null && other.getPortRequestFormID()==null) || 
             (this.portRequestFormID!=null &&
              this.portRequestFormID.equals(other.getPortRequestFormID()))) &&
            ((this.rejectData==null && other.getRejectData()==null) || 
             (this.rejectData!=null &&
              java.util.Arrays.equals(this.rejectData, other.getRejectData()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.thresholdTime==null && other.getThresholdTime()==null) || 
             (this.thresholdTime!=null &&
              this.thresholdTime.equals(other.getThresholdTime()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
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
        if (getBulkIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBulkIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBulkIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanyEmailId() != null) {
            _hashCode += getCompanyEmailId().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getEmailIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailNotificationType() != null) {
            _hashCode += getEmailNotificationType().hashCode();
        }
        if (getIdentityData() != null) {
            _hashCode += getIdentityData().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getMsisdns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getNotificationPurpose() != null) {
            _hashCode += getNotificationPurpose().hashCode();
        }
        if (getNotificationType() != null) {
            _hashCode += getNotificationType().hashCode();
        }
        if (getNprACKReceivedTime() != null) {
            _hashCode += getNprACKReceivedTime().hashCode();
        }
        if (getNprSubmittedTime() != null) {
            _hashCode += getNprSubmittedTime().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPortId() != null) {
            _hashCode += getPortId().hashCode();
        }
        if (getPortRequestFormID() != null) {
            _hashCode += getPortRequestFormID().hashCode();
        }
        if (getRejectData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRejectData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRejectData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getThresholdTime() != null) {
            _hashCode += getThresholdTime().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
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
        new org.apache.axis.description.TypeDesc(InitiateMNPNotificationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiateMNPNotificationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "bulkIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "IdData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "IdData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyEmailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "companyEmailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "emailIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailNotificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "emailNotificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "EmailNotificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "identityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "IdentityData"));
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
        elemField.setFieldName("msisdns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "msisdns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationPurpose");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "notificationPurpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "NotificationPurposeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "notificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "NotificationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nprACKReceivedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "nprACKReceivedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nprSubmittedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "nprSubmittedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portRequestFormID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portRequestFormID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "rejectData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RejectData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "RejectData"));
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
        elemField.setFieldName("thresholdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "thresholdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
