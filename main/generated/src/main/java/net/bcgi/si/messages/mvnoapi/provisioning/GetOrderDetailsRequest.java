/**
 * GetOrderDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class GetOrderDetailsRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String messageID;

    private java.lang.String personalIdType;

    private java.lang.String personalIdentity;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public GetOrderDetailsRequest() {
    }

    public GetOrderDetailsRequest(
           java.lang.String messageID,
           java.lang.String personalIdType,
           java.lang.String personalIdentity,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.messageID = messageID;
           this.personalIdType = personalIdType;
           this.personalIdentity = personalIdentity;
           this.personalIdentityType = personalIdentityType;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the messageID value for this GetOrderDetailsRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this GetOrderDetailsRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the personalIdType value for this GetOrderDetailsRequest.
     * 
     * @return personalIdType
     */
    public java.lang.String getPersonalIdType() {
        return personalIdType;
    }


    /**
     * Sets the personalIdType value for this GetOrderDetailsRequest.
     * 
     * @param personalIdType
     */
    public void setPersonalIdType(java.lang.String personalIdType) {
        this.personalIdType = personalIdType;
    }


    /**
     * Gets the personalIdentity value for this GetOrderDetailsRequest.
     * 
     * @return personalIdentity
     */
    public java.lang.String getPersonalIdentity() {
        return personalIdentity;
    }


    /**
     * Sets the personalIdentity value for this GetOrderDetailsRequest.
     * 
     * @param personalIdentity
     */
    public void setPersonalIdentity(java.lang.String personalIdentity) {
        this.personalIdentity = personalIdentity;
    }


    /**
     * Gets the personalIdentityType value for this GetOrderDetailsRequest.
     * 
     * @return personalIdentityType
     */
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getPersonalIdentityType() {
        return personalIdentityType;
    }


    /**
     * Sets the personalIdentityType value for this GetOrderDetailsRequest.
     * 
     * @param personalIdentityType
     */
    public void setPersonalIdentityType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType personalIdentityType) {
        this.personalIdentityType = personalIdentityType;
    }


    /**
     * Gets the securityId value for this GetOrderDetailsRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this GetOrderDetailsRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this GetOrderDetailsRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this GetOrderDetailsRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the version value for this GetOrderDetailsRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetOrderDetailsRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this GetOrderDetailsRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetOrderDetailsRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderDetailsRequest)) return false;
        GetOrderDetailsRequest other = (GetOrderDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.personalIdType==null && other.getPersonalIdType()==null) || 
             (this.personalIdType!=null &&
              this.personalIdType.equals(other.getPersonalIdType()))) &&
            ((this.personalIdentity==null && other.getPersonalIdentity()==null) || 
             (this.personalIdentity!=null &&
              this.personalIdentity.equals(other.getPersonalIdentity()))) &&
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
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getPersonalIdType() != null) {
            _hashCode += getPersonalIdType().hashCode();
        }
        if (getPersonalIdentity() != null) {
            _hashCode += getPersonalIdentity().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetOrderDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "GetOrderDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("personalIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdentity"));
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
