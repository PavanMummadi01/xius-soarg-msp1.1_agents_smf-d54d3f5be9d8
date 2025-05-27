/**
 * AcceptPortInRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class AcceptPortInRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String emailID;

    private java.lang.String loginID;

    private java.lang.String messageID;

    private java.lang.String networkID;

    private net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] portInMSISDNs;

    private java.lang.String portReqFormID;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private java.lang.Boolean sendNotification;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private net.bcgi.si.messages.mvnoapi.provisioning.IdentityData subscriberIdentity;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public AcceptPortInRequest() {
    }

    public AcceptPortInRequest(
           java.lang.String emailID,
           java.lang.String loginID,
           java.lang.String messageID,
           java.lang.String networkID,
           net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] portInMSISDNs,
           java.lang.String portReqFormID,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           java.lang.Boolean sendNotification,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           net.bcgi.si.messages.mvnoapi.provisioning.IdentityData subscriberIdentity,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.emailID = emailID;
           this.loginID = loginID;
           this.messageID = messageID;
           this.networkID = networkID;
           this.portInMSISDNs = portInMSISDNs;
           this.portReqFormID = portReqFormID;
           this.securityId = securityId;
           this.sendNotification = sendNotification;
           this.serviceContext = serviceContext;
           this.subscriberIdentity = subscriberIdentity;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the emailID value for this AcceptPortInRequest.
     * 
     * @return emailID
     */
    public java.lang.String getEmailID() {
        return emailID;
    }


    /**
     * Sets the emailID value for this AcceptPortInRequest.
     * 
     * @param emailID
     */
    public void setEmailID(java.lang.String emailID) {
        this.emailID = emailID;
    }


    /**
     * Gets the loginID value for this AcceptPortInRequest.
     * 
     * @return loginID
     */
    public java.lang.String getLoginID() {
        return loginID;
    }


    /**
     * Sets the loginID value for this AcceptPortInRequest.
     * 
     * @param loginID
     */
    public void setLoginID(java.lang.String loginID) {
        this.loginID = loginID;
    }


    /**
     * Gets the messageID value for this AcceptPortInRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this AcceptPortInRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the networkID value for this AcceptPortInRequest.
     * 
     * @return networkID
     */
    public java.lang.String getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this AcceptPortInRequest.
     * 
     * @param networkID
     */
    public void setNetworkID(java.lang.String networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the portInMSISDNs value for this AcceptPortInRequest.
     * 
     * @return portInMSISDNs
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] getPortInMSISDNs() {
        return portInMSISDNs;
    }


    /**
     * Sets the portInMSISDNs value for this AcceptPortInRequest.
     * 
     * @param portInMSISDNs
     */
    public void setPortInMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.PortInMSISDN[] portInMSISDNs) {
        this.portInMSISDNs = portInMSISDNs;
    }


    /**
     * Gets the portReqFormID value for this AcceptPortInRequest.
     * 
     * @return portReqFormID
     */
    public java.lang.String getPortReqFormID() {
        return portReqFormID;
    }


    /**
     * Sets the portReqFormID value for this AcceptPortInRequest.
     * 
     * @param portReqFormID
     */
    public void setPortReqFormID(java.lang.String portReqFormID) {
        this.portReqFormID = portReqFormID;
    }


    /**
     * Gets the securityId value for this AcceptPortInRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this AcceptPortInRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the sendNotification value for this AcceptPortInRequest.
     * 
     * @return sendNotification
     */
    public java.lang.Boolean getSendNotification() {
        return sendNotification;
    }


    /**
     * Sets the sendNotification value for this AcceptPortInRequest.
     * 
     * @param sendNotification
     */
    public void setSendNotification(java.lang.Boolean sendNotification) {
        this.sendNotification = sendNotification;
    }


    /**
     * Gets the serviceContext value for this AcceptPortInRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this AcceptPortInRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the subscriberIdentity value for this AcceptPortInRequest.
     * 
     * @return subscriberIdentity
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.IdentityData getSubscriberIdentity() {
        return subscriberIdentity;
    }


    /**
     * Sets the subscriberIdentity value for this AcceptPortInRequest.
     * 
     * @param subscriberIdentity
     */
    public void setSubscriberIdentity(net.bcgi.si.messages.mvnoapi.provisioning.IdentityData subscriberIdentity) {
        this.subscriberIdentity = subscriberIdentity;
    }


    /**
     * Gets the version value for this AcceptPortInRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AcceptPortInRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this AcceptPortInRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AcceptPortInRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcceptPortInRequest)) return false;
        AcceptPortInRequest other = (AcceptPortInRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailID==null && other.getEmailID()==null) || 
             (this.emailID!=null &&
              this.emailID.equals(other.getEmailID()))) &&
            ((this.loginID==null && other.getLoginID()==null) || 
             (this.loginID!=null &&
              this.loginID.equals(other.getLoginID()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.portInMSISDNs==null && other.getPortInMSISDNs()==null) || 
             (this.portInMSISDNs!=null &&
              java.util.Arrays.equals(this.portInMSISDNs, other.getPortInMSISDNs()))) &&
            ((this.portReqFormID==null && other.getPortReqFormID()==null) || 
             (this.portReqFormID!=null &&
              this.portReqFormID.equals(other.getPortReqFormID()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.sendNotification==null && other.getSendNotification()==null) || 
             (this.sendNotification!=null &&
              this.sendNotification.equals(other.getSendNotification()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.subscriberIdentity==null && other.getSubscriberIdentity()==null) || 
             (this.subscriberIdentity!=null &&
              this.subscriberIdentity.equals(other.getSubscriberIdentity()))) &&
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
        if (getEmailID() != null) {
            _hashCode += getEmailID().hashCode();
        }
        if (getLoginID() != null) {
            _hashCode += getLoginID().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
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
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getSendNotification() != null) {
            _hashCode += getSendNotification().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getSubscriberIdentity() != null) {
            _hashCode += getSubscriberIdentity().hashCode();
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
        new org.apache.axis.description.TypeDesc(AcceptPortInRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AcceptPortInRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "emailID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "loginID"));
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
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "networkID"));
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
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "securityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "sendNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "serviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "IdentityData"));
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
