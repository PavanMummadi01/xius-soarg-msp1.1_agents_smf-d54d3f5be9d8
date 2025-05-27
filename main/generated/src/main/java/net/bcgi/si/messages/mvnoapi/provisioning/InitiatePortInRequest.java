/**
 * InitiatePortInRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class InitiatePortInRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String donorId;

    private net.bcgi.si.messages.mvnoapi.common.IdData[] idsDataList;

    private java.lang.String loginId;

    private java.lang.String messageID;

    private java.lang.String networkId;

    private net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] portInMSISDNs;

    private java.lang.String portReqFormID;

    private java.lang.String portingFee;

    private java.lang.String recipientId;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private net.bcgi.si.messages.mvnoapi.provisioning.SubscriberDetails subscriberDetails;

    private java.lang.Integer transId;

    private java.lang.String transactionTime;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public InitiatePortInRequest() {
    }

    public InitiatePortInRequest(
           java.lang.String donorId,
           net.bcgi.si.messages.mvnoapi.common.IdData[] idsDataList,
           java.lang.String loginId,
           java.lang.String messageID,
           java.lang.String networkId,
           net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] portInMSISDNs,
           java.lang.String portReqFormID,
           java.lang.String portingFee,
           java.lang.String recipientId,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           net.bcgi.si.messages.mvnoapi.provisioning.SubscriberDetails subscriberDetails,
           java.lang.Integer transId,
           java.lang.String transactionTime,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.donorId = donorId;
           this.idsDataList = idsDataList;
           this.loginId = loginId;
           this.messageID = messageID;
           this.networkId = networkId;
           this.portInMSISDNs = portInMSISDNs;
           this.portReqFormID = portReqFormID;
           this.portingFee = portingFee;
           this.recipientId = recipientId;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.subscriberDetails = subscriberDetails;
           this.transId = transId;
           this.transactionTime = transactionTime;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the donorId value for this InitiatePortInRequest.
     * 
     * @return donorId
     */
    public java.lang.String getDonorId() {
        return donorId;
    }


    /**
     * Sets the donorId value for this InitiatePortInRequest.
     * 
     * @param donorId
     */
    public void setDonorId(java.lang.String donorId) {
        this.donorId = donorId;
    }


    /**
     * Gets the idsDataList value for this InitiatePortInRequest.
     * 
     * @return idsDataList
     */
    public net.bcgi.si.messages.mvnoapi.common.IdData[] getIdsDataList() {
        return idsDataList;
    }


    /**
     * Sets the idsDataList value for this InitiatePortInRequest.
     * 
     * @param idsDataList
     */
    public void setIdsDataList(net.bcgi.si.messages.mvnoapi.common.IdData[] idsDataList) {
        this.idsDataList = idsDataList;
    }


    /**
     * Gets the loginId value for this InitiatePortInRequest.
     * 
     * @return loginId
     */
    public java.lang.String getLoginId() {
        return loginId;
    }


    /**
     * Sets the loginId value for this InitiatePortInRequest.
     * 
     * @param loginId
     */
    public void setLoginId(java.lang.String loginId) {
        this.loginId = loginId;
    }


    /**
     * Gets the messageID value for this InitiatePortInRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this InitiatePortInRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the networkId value for this InitiatePortInRequest.
     * 
     * @return networkId
     */
    public java.lang.String getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this InitiatePortInRequest.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.String networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the portInMSISDNs value for this InitiatePortInRequest.
     * 
     * @return portInMSISDNs
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] getPortInMSISDNs() {
        return portInMSISDNs;
    }


    /**
     * Sets the portInMSISDNs value for this InitiatePortInRequest.
     * 
     * @param portInMSISDNs
     */
    public void setPortInMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] portInMSISDNs) {
        this.portInMSISDNs = portInMSISDNs;
    }


    /**
     * Gets the portReqFormID value for this InitiatePortInRequest.
     * 
     * @return portReqFormID
     */
    public java.lang.String getPortReqFormID() {
        return portReqFormID;
    }


    /**
     * Sets the portReqFormID value for this InitiatePortInRequest.
     * 
     * @param portReqFormID
     */
    public void setPortReqFormID(java.lang.String portReqFormID) {
        this.portReqFormID = portReqFormID;
    }


    /**
     * Gets the portingFee value for this InitiatePortInRequest.
     * 
     * @return portingFee
     */
    public java.lang.String getPortingFee() {
        return portingFee;
    }


    /**
     * Sets the portingFee value for this InitiatePortInRequest.
     * 
     * @param portingFee
     */
    public void setPortingFee(java.lang.String portingFee) {
        this.portingFee = portingFee;
    }


    /**
     * Gets the recipientId value for this InitiatePortInRequest.
     * 
     * @return recipientId
     */
    public java.lang.String getRecipientId() {
        return recipientId;
    }


    /**
     * Sets the recipientId value for this InitiatePortInRequest.
     * 
     * @param recipientId
     */
    public void setRecipientId(java.lang.String recipientId) {
        this.recipientId = recipientId;
    }


    /**
     * Gets the securityId value for this InitiatePortInRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this InitiatePortInRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this InitiatePortInRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this InitiatePortInRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the subscriberDetails value for this InitiatePortInRequest.
     * 
     * @return subscriberDetails
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.SubscriberDetails getSubscriberDetails() {
        return subscriberDetails;
    }


    /**
     * Sets the subscriberDetails value for this InitiatePortInRequest.
     * 
     * @param subscriberDetails
     */
    public void setSubscriberDetails(net.bcgi.si.messages.mvnoapi.provisioning.SubscriberDetails subscriberDetails) {
        this.subscriberDetails = subscriberDetails;
    }


    /**
     * Gets the transId value for this InitiatePortInRequest.
     * 
     * @return transId
     */
    public java.lang.Integer getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this InitiatePortInRequest.
     * 
     * @param transId
     */
    public void setTransId(java.lang.Integer transId) {
        this.transId = transId;
    }


    /**
     * Gets the transactionTime value for this InitiatePortInRequest.
     * 
     * @return transactionTime
     */
    public java.lang.String getTransactionTime() {
        return transactionTime;
    }


    /**
     * Sets the transactionTime value for this InitiatePortInRequest.
     * 
     * @param transactionTime
     */
    public void setTransactionTime(java.lang.String transactionTime) {
        this.transactionTime = transactionTime;
    }


    /**
     * Gets the version value for this InitiatePortInRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this InitiatePortInRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this InitiatePortInRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this InitiatePortInRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiatePortInRequest)) return false;
        InitiatePortInRequest other = (InitiatePortInRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.donorId==null && other.getDonorId()==null) || 
             (this.donorId!=null &&
              this.donorId.equals(other.getDonorId()))) &&
            ((this.idsDataList==null && other.getIdsDataList()==null) || 
             (this.idsDataList!=null &&
              java.util.Arrays.equals(this.idsDataList, other.getIdsDataList()))) &&
            ((this.loginId==null && other.getLoginId()==null) || 
             (this.loginId!=null &&
              this.loginId.equals(other.getLoginId()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.portInMSISDNs==null && other.getPortInMSISDNs()==null) || 
             (this.portInMSISDNs!=null &&
              java.util.Arrays.equals(this.portInMSISDNs, other.getPortInMSISDNs()))) &&
            ((this.portReqFormID==null && other.getPortReqFormID()==null) || 
             (this.portReqFormID!=null &&
              this.portReqFormID.equals(other.getPortReqFormID()))) &&
            ((this.portingFee==null && other.getPortingFee()==null) || 
             (this.portingFee!=null &&
              this.portingFee.equals(other.getPortingFee()))) &&
            ((this.recipientId==null && other.getRecipientId()==null) || 
             (this.recipientId!=null &&
              this.recipientId.equals(other.getRecipientId()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.subscriberDetails==null && other.getSubscriberDetails()==null) || 
             (this.subscriberDetails!=null &&
              this.subscriberDetails.equals(other.getSubscriberDetails()))) &&
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId()))) &&
            ((this.transactionTime==null && other.getTransactionTime()==null) || 
             (this.transactionTime!=null &&
              this.transactionTime.equals(other.getTransactionTime()))) &&
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
        if (getDonorId() != null) {
            _hashCode += getDonorId().hashCode();
        }
        if (getIdsDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdsDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdsDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoginId() != null) {
            _hashCode += getLoginId().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getPortInMSISDNs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortInMSISDNs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortInMSISDNs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortReqFormID() != null) {
            _hashCode += getPortReqFormID().hashCode();
        }
        if (getPortingFee() != null) {
            _hashCode += getPortingFee().hashCode();
        }
        if (getRecipientId() != null) {
            _hashCode += getRecipientId().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getSubscriberDetails() != null) {
            _hashCode += getSubscriberDetails().hashCode();
        }
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        if (getTransactionTime() != null) {
            _hashCode += getTransactionTime().hashCode();
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
        new org.apache.axis.description.TypeDesc(InitiatePortInRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "InitiatePortInRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "donorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idsDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "idsDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "IdData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "IdData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "loginId"));
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
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInMSISDNs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDNs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portInMSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portReqFormID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portReqFormID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "recipientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("subscriberDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SubscriberDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transactionTime"));
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
