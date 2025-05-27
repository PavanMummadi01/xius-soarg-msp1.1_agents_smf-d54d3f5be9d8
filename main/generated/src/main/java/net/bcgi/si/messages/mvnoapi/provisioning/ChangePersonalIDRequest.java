/**
 * ChangePersonalIDRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class ChangePersonalIDRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private java.lang.String destPersonalID;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType destPersonalIDType;

    private java.lang.String messageID;

    private java.lang.String personalIdType;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String sourcePersonalID;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType srcPersonalIDType;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public ChangePersonalIDRequest() {
    }

    public ChangePersonalIDRequest(
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           java.lang.String destPersonalID,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType destPersonalIDType,
           java.lang.String messageID,
           java.lang.String personalIdType,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String sourcePersonalID,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType srcPersonalIDType,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountId = accountId;
           this.destPersonalID = destPersonalID;
           this.destPersonalIDType = destPersonalIDType;
           this.messageID = messageID;
           this.personalIdType = personalIdType;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.sourcePersonalID = sourcePersonalID;
           this.srcPersonalIDType = srcPersonalIDType;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the accountId value for this ChangePersonalIDRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ChangePersonalIDRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the destPersonalID value for this ChangePersonalIDRequest.
     * 
     * @return destPersonalID
     */
    public java.lang.String getDestPersonalID() {
        return destPersonalID;
    }


    /**
     * Sets the destPersonalID value for this ChangePersonalIDRequest.
     * 
     * @param destPersonalID
     */
    public void setDestPersonalID(java.lang.String destPersonalID) {
        this.destPersonalID = destPersonalID;
    }


    /**
     * Gets the destPersonalIDType value for this ChangePersonalIDRequest.
     * 
     * @return destPersonalIDType
     */
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getDestPersonalIDType() {
        return destPersonalIDType;
    }


    /**
     * Sets the destPersonalIDType value for this ChangePersonalIDRequest.
     * 
     * @param destPersonalIDType
     */
    public void setDestPersonalIDType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType destPersonalIDType) {
        this.destPersonalIDType = destPersonalIDType;
    }


    /**
     * Gets the messageID value for this ChangePersonalIDRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this ChangePersonalIDRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the personalIdType value for this ChangePersonalIDRequest.
     * 
     * @return personalIdType
     */
    public java.lang.String getPersonalIdType() {
        return personalIdType;
    }


    /**
     * Sets the personalIdType value for this ChangePersonalIDRequest.
     * 
     * @param personalIdType
     */
    public void setPersonalIdType(java.lang.String personalIdType) {
        this.personalIdType = personalIdType;
    }


    /**
     * Gets the securityId value for this ChangePersonalIDRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this ChangePersonalIDRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this ChangePersonalIDRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this ChangePersonalIDRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the sourcePersonalID value for this ChangePersonalIDRequest.
     * 
     * @return sourcePersonalID
     */
    public java.lang.String getSourcePersonalID() {
        return sourcePersonalID;
    }


    /**
     * Sets the sourcePersonalID value for this ChangePersonalIDRequest.
     * 
     * @param sourcePersonalID
     */
    public void setSourcePersonalID(java.lang.String sourcePersonalID) {
        this.sourcePersonalID = sourcePersonalID;
    }


    /**
     * Gets the srcPersonalIDType value for this ChangePersonalIDRequest.
     * 
     * @return srcPersonalIDType
     */
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getSrcPersonalIDType() {
        return srcPersonalIDType;
    }


    /**
     * Sets the srcPersonalIDType value for this ChangePersonalIDRequest.
     * 
     * @param srcPersonalIDType
     */
    public void setSrcPersonalIDType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType srcPersonalIDType) {
        this.srcPersonalIDType = srcPersonalIDType;
    }


    /**
     * Gets the version value for this ChangePersonalIDRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ChangePersonalIDRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this ChangePersonalIDRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ChangePersonalIDRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePersonalIDRequest)) return false;
        ChangePersonalIDRequest other = (ChangePersonalIDRequest) obj;
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
            ((this.destPersonalID==null && other.getDestPersonalID()==null) || 
             (this.destPersonalID!=null &&
              this.destPersonalID.equals(other.getDestPersonalID()))) &&
            ((this.destPersonalIDType==null && other.getDestPersonalIDType()==null) || 
             (this.destPersonalIDType!=null &&
              this.destPersonalIDType.equals(other.getDestPersonalIDType()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.personalIdType==null && other.getPersonalIdType()==null) || 
             (this.personalIdType!=null &&
              this.personalIdType.equals(other.getPersonalIdType()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.sourcePersonalID==null && other.getSourcePersonalID()==null) || 
             (this.sourcePersonalID!=null &&
              this.sourcePersonalID.equals(other.getSourcePersonalID()))) &&
            ((this.srcPersonalIDType==null && other.getSrcPersonalIDType()==null) || 
             (this.srcPersonalIDType!=null &&
              this.srcPersonalIDType.equals(other.getSrcPersonalIDType()))) &&
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
        if (getDestPersonalID() != null) {
            _hashCode += getDestPersonalID().hashCode();
        }
        if (getDestPersonalIDType() != null) {
            _hashCode += getDestPersonalIDType().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getPersonalIdType() != null) {
            _hashCode += getPersonalIdType().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getSourcePersonalID() != null) {
            _hashCode += getSourcePersonalID().hashCode();
        }
        if (getSrcPersonalIDType() != null) {
            _hashCode += getSrcPersonalIDType().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangePersonalIDRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangePersonalIDRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destPersonalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "destPersonalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destPersonalIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "destPersonalIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("sourcePersonalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "sourcePersonalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcPersonalIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "srcPersonalIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType"));
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
