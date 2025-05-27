/**
 * ChangeMDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class ChangeMDNRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String SIM;

    private net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId;

    private net.bcgi.si.messages.mvnoapi.common.AlternateAccountId alternateAccountId;

    private java.lang.String initiatedFrom;

    private java.lang.String messageID;

    private java.lang.String newMDN;

    private java.lang.String oldMDN;

    private java.lang.String personalIdType;

    private java.lang.String personalIdentityNumber;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public ChangeMDNRequest() {
    }

    public ChangeMDNRequest(
           java.lang.String SIM,
           net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId,
           net.bcgi.si.messages.mvnoapi.common.AlternateAccountId alternateAccountId,
           java.lang.String initiatedFrom,
           java.lang.String messageID,
           java.lang.String newMDN,
           java.lang.String oldMDN,
           java.lang.String personalIdType,
           java.lang.String personalIdentityNumber,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.SIM = SIM;
           this.accountId = accountId;
           this.alternateAccountId = alternateAccountId;
           this.initiatedFrom = initiatedFrom;
           this.messageID = messageID;
           this.newMDN = newMDN;
           this.oldMDN = oldMDN;
           this.personalIdType = personalIdType;
           this.personalIdentityNumber = personalIdentityNumber;
           this.personalIdentityType = personalIdentityType;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the SIM value for this ChangeMDNRequest.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this ChangeMDNRequest.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the accountId value for this ChangeMDNRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ChangeMDNRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.provisioning.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the alternateAccountId value for this ChangeMDNRequest.
     * 
     * @return alternateAccountId
     */
    public net.bcgi.si.messages.mvnoapi.common.AlternateAccountId getAlternateAccountId() {
        return alternateAccountId;
    }


    /**
     * Sets the alternateAccountId value for this ChangeMDNRequest.
     * 
     * @param alternateAccountId
     */
    public void setAlternateAccountId(net.bcgi.si.messages.mvnoapi.common.AlternateAccountId alternateAccountId) {
        this.alternateAccountId = alternateAccountId;
    }


    /**
     * Gets the initiatedFrom value for this ChangeMDNRequest.
     * 
     * @return initiatedFrom
     */
    public java.lang.String getInitiatedFrom() {
        return initiatedFrom;
    }


    /**
     * Sets the initiatedFrom value for this ChangeMDNRequest.
     * 
     * @param initiatedFrom
     */
    public void setInitiatedFrom(java.lang.String initiatedFrom) {
        this.initiatedFrom = initiatedFrom;
    }


    /**
     * Gets the messageID value for this ChangeMDNRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this ChangeMDNRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the newMDN value for this ChangeMDNRequest.
     * 
     * @return newMDN
     */
    public java.lang.String getNewMDN() {
        return newMDN;
    }


    /**
     * Sets the newMDN value for this ChangeMDNRequest.
     * 
     * @param newMDN
     */
    public void setNewMDN(java.lang.String newMDN) {
        this.newMDN = newMDN;
    }


    /**
     * Gets the oldMDN value for this ChangeMDNRequest.
     * 
     * @return oldMDN
     */
    public java.lang.String getOldMDN() {
        return oldMDN;
    }


    /**
     * Sets the oldMDN value for this ChangeMDNRequest.
     * 
     * @param oldMDN
     */
    public void setOldMDN(java.lang.String oldMDN) {
        this.oldMDN = oldMDN;
    }


    /**
     * Gets the personalIdType value for this ChangeMDNRequest.
     * 
     * @return personalIdType
     */
    public java.lang.String getPersonalIdType() {
        return personalIdType;
    }


    /**
     * Sets the personalIdType value for this ChangeMDNRequest.
     * 
     * @param personalIdType
     */
    public void setPersonalIdType(java.lang.String personalIdType) {
        this.personalIdType = personalIdType;
    }


    /**
     * Gets the personalIdentityNumber value for this ChangeMDNRequest.
     * 
     * @return personalIdentityNumber
     */
    public java.lang.String getPersonalIdentityNumber() {
        return personalIdentityNumber;
    }


    /**
     * Sets the personalIdentityNumber value for this ChangeMDNRequest.
     * 
     * @param personalIdentityNumber
     */
    public void setPersonalIdentityNumber(java.lang.String personalIdentityNumber) {
        this.personalIdentityNumber = personalIdentityNumber;
    }


    /**
     * Gets the personalIdentityType value for this ChangeMDNRequest.
     * 
     * @return personalIdentityType
     */
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getPersonalIdentityType() {
        return personalIdentityType;
    }


    /**
     * Sets the personalIdentityType value for this ChangeMDNRequest.
     * 
     * @param personalIdentityType
     */
    public void setPersonalIdentityType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType) {
        this.personalIdentityType = personalIdentityType;
    }


    /**
     * Gets the securityId value for this ChangeMDNRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this ChangeMDNRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this ChangeMDNRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this ChangeMDNRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the version value for this ChangeMDNRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ChangeMDNRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this ChangeMDNRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this ChangeMDNRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMDNRequest)) return false;
        ChangeMDNRequest other = (ChangeMDNRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.alternateAccountId==null && other.getAlternateAccountId()==null) || 
             (this.alternateAccountId!=null &&
              this.alternateAccountId.equals(other.getAlternateAccountId()))) &&
            ((this.initiatedFrom==null && other.getInitiatedFrom()==null) || 
             (this.initiatedFrom!=null &&
              this.initiatedFrom.equals(other.getInitiatedFrom()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.newMDN==null && other.getNewMDN()==null) || 
             (this.newMDN!=null &&
              this.newMDN.equals(other.getNewMDN()))) &&
            ((this.oldMDN==null && other.getOldMDN()==null) || 
             (this.oldMDN!=null &&
              this.oldMDN.equals(other.getOldMDN()))) &&
            ((this.personalIdType==null && other.getPersonalIdType()==null) || 
             (this.personalIdType!=null &&
              this.personalIdType.equals(other.getPersonalIdType()))) &&
            ((this.personalIdentityNumber==null && other.getPersonalIdentityNumber()==null) || 
             (this.personalIdentityNumber!=null &&
              this.personalIdentityNumber.equals(other.getPersonalIdentityNumber()))) &&
            ((this.personalIdentityType==null && other.getPersonalIdentityType()==null) || 
             (this.personalIdentityType!=null &&
              this.personalIdentityType.equals(other.getPersonalIdentityType()))) &&
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
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAlternateAccountId() != null) {
            _hashCode += getAlternateAccountId().hashCode();
        }
        if (getInitiatedFrom() != null) {
            _hashCode += getInitiatedFrom().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getNewMDN() != null) {
            _hashCode += getNewMDN().hashCode();
        }
        if (getOldMDN() != null) {
            _hashCode += getOldMDN().hashCode();
        }
        if (getPersonalIdType() != null) {
            _hashCode += getPersonalIdType().hashCode();
        }
        if (getPersonalIdentityNumber() != null) {
            _hashCode += getPersonalIdentityNumber().hashCode();
        }
        if (getPersonalIdentityType() != null) {
            _hashCode += getPersonalIdentityType().hashCode();
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
        new org.apache.axis.description.TypeDesc(ChangeMDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ChangeMDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "alternateAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "AlternateAccountId"));
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
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "newMDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "oldMDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdentityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdentityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType"));
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
