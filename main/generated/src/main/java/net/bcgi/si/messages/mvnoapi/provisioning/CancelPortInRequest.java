/**
 * CancelPortInRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class CancelPortInRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private java.lang.String action;

    private java.lang.String ban;

    private java.lang.String loginID;

    private java.lang.String messageID;

    private java.lang.String msgcode;

    private java.lang.String msgtext;

    private java.lang.String networkID;

    private java.lang.String portReqFormID;

    private java.lang.String portid;

    private java.lang.String reqno;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public CancelPortInRequest() {
    }

    public CancelPortInRequest(
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           java.lang.String action,
           java.lang.String ban,
           java.lang.String loginID,
           java.lang.String messageID,
           java.lang.String msgcode,
           java.lang.String msgtext,
           java.lang.String networkID,
           java.lang.String portReqFormID,
           java.lang.String portid,
           java.lang.String reqno,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountId = accountId;
           this.action = action;
           this.ban = ban;
           this.loginID = loginID;
           this.messageID = messageID;
           this.msgcode = msgcode;
           this.msgtext = msgtext;
           this.networkID = networkID;
           this.portReqFormID = portReqFormID;
           this.portid = portid;
           this.reqno = reqno;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the accountId value for this CancelPortInRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CancelPortInRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the action value for this CancelPortInRequest.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CancelPortInRequest.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the ban value for this CancelPortInRequest.
     * 
     * @return ban
     */
    public java.lang.String getBan() {
        return ban;
    }


    /**
     * Sets the ban value for this CancelPortInRequest.
     * 
     * @param ban
     */
    public void setBan(java.lang.String ban) {
        this.ban = ban;
    }


    /**
     * Gets the loginID value for this CancelPortInRequest.
     * 
     * @return loginID
     */
    public java.lang.String getLoginID() {
        return loginID;
    }


    /**
     * Sets the loginID value for this CancelPortInRequest.
     * 
     * @param loginID
     */
    public void setLoginID(java.lang.String loginID) {
        this.loginID = loginID;
    }


    /**
     * Gets the messageID value for this CancelPortInRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this CancelPortInRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the msgcode value for this CancelPortInRequest.
     * 
     * @return msgcode
     */
    public java.lang.String getMsgcode() {
        return msgcode;
    }


    /**
     * Sets the msgcode value for this CancelPortInRequest.
     * 
     * @param msgcode
     */
    public void setMsgcode(java.lang.String msgcode) {
        this.msgcode = msgcode;
    }


    /**
     * Gets the msgtext value for this CancelPortInRequest.
     * 
     * @return msgtext
     */
    public java.lang.String getMsgtext() {
        return msgtext;
    }


    /**
     * Sets the msgtext value for this CancelPortInRequest.
     * 
     * @param msgtext
     */
    public void setMsgtext(java.lang.String msgtext) {
        this.msgtext = msgtext;
    }


    /**
     * Gets the networkID value for this CancelPortInRequest.
     * 
     * @return networkID
     */
    public java.lang.String getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this CancelPortInRequest.
     * 
     * @param networkID
     */
    public void setNetworkID(java.lang.String networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the portReqFormID value for this CancelPortInRequest.
     * 
     * @return portReqFormID
     */
    public java.lang.String getPortReqFormID() {
        return portReqFormID;
    }


    /**
     * Sets the portReqFormID value for this CancelPortInRequest.
     * 
     * @param portReqFormID
     */
    public void setPortReqFormID(java.lang.String portReqFormID) {
        this.portReqFormID = portReqFormID;
    }


    /**
     * Gets the portid value for this CancelPortInRequest.
     * 
     * @return portid
     */
    public java.lang.String getPortid() {
        return portid;
    }


    /**
     * Sets the portid value for this CancelPortInRequest.
     * 
     * @param portid
     */
    public void setPortid(java.lang.String portid) {
        this.portid = portid;
    }


    /**
     * Gets the reqno value for this CancelPortInRequest.
     * 
     * @return reqno
     */
    public java.lang.String getReqno() {
        return reqno;
    }


    /**
     * Sets the reqno value for this CancelPortInRequest.
     * 
     * @param reqno
     */
    public void setReqno(java.lang.String reqno) {
        this.reqno = reqno;
    }


    /**
     * Gets the securityId value for this CancelPortInRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this CancelPortInRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this CancelPortInRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this CancelPortInRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the version value for this CancelPortInRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CancelPortInRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this CancelPortInRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this CancelPortInRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelPortInRequest)) return false;
        CancelPortInRequest other = (CancelPortInRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.ban==null && other.getBan()==null) || 
             (this.ban!=null &&
              this.ban.equals(other.getBan()))) &&
            ((this.loginID==null && other.getLoginID()==null) || 
             (this.loginID!=null &&
              this.loginID.equals(other.getLoginID()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.msgcode==null && other.getMsgcode()==null) || 
             (this.msgcode!=null &&
              this.msgcode.equals(other.getMsgcode()))) &&
            ((this.msgtext==null && other.getMsgtext()==null) || 
             (this.msgtext!=null &&
              this.msgtext.equals(other.getMsgtext()))) &&
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.portReqFormID==null && other.getPortReqFormID()==null) || 
             (this.portReqFormID!=null &&
              this.portReqFormID.equals(other.getPortReqFormID()))) &&
            ((this.portid==null && other.getPortid()==null) || 
             (this.portid!=null &&
              this.portid.equals(other.getPortid()))) &&
            ((this.reqno==null && other.getReqno()==null) || 
             (this.reqno!=null &&
              this.reqno.equals(other.getReqno()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getBan() != null) {
            _hashCode += getBan().hashCode();
        }
        if (getLoginID() != null) {
            _hashCode += getLoginID().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getMsgcode() != null) {
            _hashCode += getMsgcode().hashCode();
        }
        if (getMsgtext() != null) {
            _hashCode += getMsgtext().hashCode();
        }
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getPortReqFormID() != null) {
            _hashCode += getPortReqFormID().hashCode();
        }
        if (getPortid() != null) {
            _hashCode += getPortid().hashCode();
        }
        if (getReqno() != null) {
            _hashCode += getReqno().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
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
        new org.apache.axis.description.TypeDesc(CancelPortInRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CancelPortInRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ban");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ban"));
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
        elemField.setFieldName("msgcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "msgcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgtext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "msgtext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portReqFormID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portReqFormID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "portid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "reqno"));
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
