/**
 * GetSubscriberInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class GetSubscriberInfoRequest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.common.BillingAccountIdKey billingAccountId;

    private java.lang.Boolean ivrRequired;

    private java.lang.String messageID;

    private java.lang.String requestFrom;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String version;

    private java.lang.Boolean vmsRequired;

    private org.apache.axis.message.MessageElement [] _any;

    public GetSubscriberInfoRequest() {
    }

    public GetSubscriberInfoRequest(
           net.bcgi.si.messages.mvnoapi.common.BillingAccountIdKey billingAccountId,
           java.lang.Boolean ivrRequired,
           java.lang.String messageID,
           java.lang.String requestFrom,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.Boolean vmsRequired,
           org.apache.axis.message.MessageElement [] _any) {
           this.billingAccountId = billingAccountId;
           this.ivrRequired = ivrRequired;
           this.messageID = messageID;
           this.requestFrom = requestFrom;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.version = version;
           this.vmsRequired = vmsRequired;
           this._any = _any;
    }


    /**
     * Gets the billingAccountId value for this GetSubscriberInfoRequest.
     * 
     * @return billingAccountId
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAccountIdKey getBillingAccountId() {
        return billingAccountId;
    }


    /**
     * Sets the billingAccountId value for this GetSubscriberInfoRequest.
     * 
     * @param billingAccountId
     */
    public void setBillingAccountId(net.bcgi.si.messages.mvnoapi.common.BillingAccountIdKey billingAccountId) {
        this.billingAccountId = billingAccountId;
    }


    /**
     * Gets the ivrRequired value for this GetSubscriberInfoRequest.
     * 
     * @return ivrRequired
     */
    public java.lang.Boolean getIvrRequired() {
        return ivrRequired;
    }


    /**
     * Sets the ivrRequired value for this GetSubscriberInfoRequest.
     * 
     * @param ivrRequired
     */
    public void setIvrRequired(java.lang.Boolean ivrRequired) {
        this.ivrRequired = ivrRequired;
    }


    /**
     * Gets the messageID value for this GetSubscriberInfoRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this GetSubscriberInfoRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the requestFrom value for this GetSubscriberInfoRequest.
     * 
     * @return requestFrom
     */
    public java.lang.String getRequestFrom() {
        return requestFrom;
    }


    /**
     * Sets the requestFrom value for this GetSubscriberInfoRequest.
     * 
     * @param requestFrom
     */
    public void setRequestFrom(java.lang.String requestFrom) {
        this.requestFrom = requestFrom;
    }


    /**
     * Gets the securityId value for this GetSubscriberInfoRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this GetSubscriberInfoRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this GetSubscriberInfoRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this GetSubscriberInfoRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the version value for this GetSubscriberInfoRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetSubscriberInfoRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the vmsRequired value for this GetSubscriberInfoRequest.
     * 
     * @return vmsRequired
     */
    public java.lang.Boolean getVmsRequired() {
        return vmsRequired;
    }


    /**
     * Sets the vmsRequired value for this GetSubscriberInfoRequest.
     * 
     * @param vmsRequired
     */
    public void setVmsRequired(java.lang.Boolean vmsRequired) {
        this.vmsRequired = vmsRequired;
    }


    /**
     * Gets the _any value for this GetSubscriberInfoRequest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GetSubscriberInfoRequest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriberInfoRequest)) return false;
        GetSubscriberInfoRequest other = (GetSubscriberInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAccountId==null && other.getBillingAccountId()==null) || 
             (this.billingAccountId!=null &&
              this.billingAccountId.equals(other.getBillingAccountId()))) &&
            ((this.ivrRequired==null && other.getIvrRequired()==null) || 
             (this.ivrRequired!=null &&
              this.ivrRequired.equals(other.getIvrRequired()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.requestFrom==null && other.getRequestFrom()==null) || 
             (this.requestFrom!=null &&
              this.requestFrom.equals(other.getRequestFrom()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.vmsRequired==null && other.getVmsRequired()==null) || 
             (this.vmsRequired!=null &&
              this.vmsRequired.equals(other.getVmsRequired()))) &&
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
        if (getBillingAccountId() != null) {
            _hashCode += getBillingAccountId().hashCode();
        }
        if (getIvrRequired() != null) {
            _hashCode += getIvrRequired().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getRequestFrom() != null) {
            _hashCode += getRequestFrom().hashCode();
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
        if (getVmsRequired() != null) {
            _hashCode += getVmsRequired().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetSubscriberInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "GetSubscriberInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billingAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAccountIdKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivrRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ivrRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "requestFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "securityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "serviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmsRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "vmsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
