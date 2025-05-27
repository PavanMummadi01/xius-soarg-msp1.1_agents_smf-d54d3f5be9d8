/**
 * L4AdNotificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class L4AdNotificationRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.Boolean forwardable;

    private java.lang.String fromMSISDN;

    private net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationType l4AdNotificationType;

    private java.lang.String message;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String toMSISDN;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public L4AdNotificationRequest() {
    }

    public L4AdNotificationRequest(
           java.lang.Boolean forwardable,
           java.lang.String fromMSISDN,
           net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationType l4AdNotificationType,
           java.lang.String message,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String toMSISDN,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.forwardable = forwardable;
           this.fromMSISDN = fromMSISDN;
           this.l4AdNotificationType = l4AdNotificationType;
           this.message = message;
           this.messageID = messageID;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.toMSISDN = toMSISDN;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the forwardable value for this L4AdNotificationRequest.
     * 
     * @return forwardable
     */
    public java.lang.Boolean getForwardable() {
        return forwardable;
    }


    /**
     * Sets the forwardable value for this L4AdNotificationRequest.
     * 
     * @param forwardable
     */
    public void setForwardable(java.lang.Boolean forwardable) {
        this.forwardable = forwardable;
    }


    /**
     * Gets the fromMSISDN value for this L4AdNotificationRequest.
     * 
     * @return fromMSISDN
     */
    public java.lang.String getFromMSISDN() {
        return fromMSISDN;
    }


    /**
     * Sets the fromMSISDN value for this L4AdNotificationRequest.
     * 
     * @param fromMSISDN
     */
    public void setFromMSISDN(java.lang.String fromMSISDN) {
        this.fromMSISDN = fromMSISDN;
    }


    /**
     * Gets the l4AdNotificationType value for this L4AdNotificationRequest.
     * 
     * @return l4AdNotificationType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationType getL4AdNotificationType() {
        return l4AdNotificationType;
    }


    /**
     * Sets the l4AdNotificationType value for this L4AdNotificationRequest.
     * 
     * @param l4AdNotificationType
     */
    public void setL4AdNotificationType(net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationType l4AdNotificationType) {
        this.l4AdNotificationType = l4AdNotificationType;
    }


    /**
     * Gets the message value for this L4AdNotificationRequest.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this L4AdNotificationRequest.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the messageID value for this L4AdNotificationRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this L4AdNotificationRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the securityId value for this L4AdNotificationRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this L4AdNotificationRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this L4AdNotificationRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this L4AdNotificationRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the toMSISDN value for this L4AdNotificationRequest.
     * 
     * @return toMSISDN
     */
    public java.lang.String getToMSISDN() {
        return toMSISDN;
    }


    /**
     * Sets the toMSISDN value for this L4AdNotificationRequest.
     * 
     * @param toMSISDN
     */
    public void setToMSISDN(java.lang.String toMSISDN) {
        this.toMSISDN = toMSISDN;
    }


    /**
     * Gets the version value for this L4AdNotificationRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this L4AdNotificationRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this L4AdNotificationRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this L4AdNotificationRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof L4AdNotificationRequest)) return false;
        L4AdNotificationRequest other = (L4AdNotificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forwardable==null && other.getForwardable()==null) || 
             (this.forwardable!=null &&
              this.forwardable.equals(other.getForwardable()))) &&
            ((this.fromMSISDN==null && other.getFromMSISDN()==null) || 
             (this.fromMSISDN!=null &&
              this.fromMSISDN.equals(other.getFromMSISDN()))) &&
            ((this.l4AdNotificationType==null && other.getL4AdNotificationType()==null) || 
             (this.l4AdNotificationType!=null &&
              this.l4AdNotificationType.equals(other.getL4AdNotificationType()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.toMSISDN==null && other.getToMSISDN()==null) || 
             (this.toMSISDN!=null &&
              this.toMSISDN.equals(other.getToMSISDN()))) &&
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
        if (getForwardable() != null) {
            _hashCode += getForwardable().hashCode();
        }
        if (getFromMSISDN() != null) {
            _hashCode += getFromMSISDN().hashCode();
        }
        if (getL4AdNotificationType() != null) {
            _hashCode += getL4AdNotificationType().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getToMSISDN() != null) {
            _hashCode += getToMSISDN().hashCode();
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
        new org.apache.axis.description.TypeDesc(L4AdNotificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "forwardable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "fromMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l4AdNotificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "l4AdNotificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "L4AdNotificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "message"));
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
        elemField.setFieldName("toMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "toMSISDN"));
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
