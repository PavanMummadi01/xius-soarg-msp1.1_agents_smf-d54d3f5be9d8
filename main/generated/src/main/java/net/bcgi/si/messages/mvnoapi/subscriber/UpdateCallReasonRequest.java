/**
 * UpdateCallReasonRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class UpdateCallReasonRequest  implements java.io.Serializable {
    private net.bcgi.si.messages.mvnoapi.subscriber.AccountId accountId;

    private java.lang.String callReasonCode;

    private java.util.Calendar callReasonDate;

    private java.lang.String callReasonNote;

    private java.lang.String messageID;

    private net.bcgi.si.messages.mvnoapi.subscriber.OperationType operationType;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String version;

    public UpdateCallReasonRequest() {
    }

    public UpdateCallReasonRequest(
           net.bcgi.si.messages.mvnoapi.subscriber.AccountId accountId,
           java.lang.String callReasonCode,
           java.util.Calendar callReasonDate,
           java.lang.String callReasonNote,
           java.lang.String messageID,
           net.bcgi.si.messages.mvnoapi.subscriber.OperationType operationType,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String version) {
           this.accountId = accountId;
           this.callReasonCode = callReasonCode;
           this.callReasonDate = callReasonDate;
           this.callReasonNote = callReasonNote;
           this.messageID = messageID;
           this.operationType = operationType;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.version = version;
    }


    /**
     * Gets the accountId value for this UpdateCallReasonRequest.
     * 
     * @return accountId
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountId getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this UpdateCallReasonRequest.
     * 
     * @param accountId
     */
    public void setAccountId(net.bcgi.si.messages.mvnoapi.subscriber.AccountId accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the callReasonCode value for this UpdateCallReasonRequest.
     * 
     * @return callReasonCode
     */
    public java.lang.String getCallReasonCode() {
        return callReasonCode;
    }


    /**
     * Sets the callReasonCode value for this UpdateCallReasonRequest.
     * 
     * @param callReasonCode
     */
    public void setCallReasonCode(java.lang.String callReasonCode) {
        this.callReasonCode = callReasonCode;
    }


    /**
     * Gets the callReasonDate value for this UpdateCallReasonRequest.
     * 
     * @return callReasonDate
     */
    public java.util.Calendar getCallReasonDate() {
        return callReasonDate;
    }


    /**
     * Sets the callReasonDate value for this UpdateCallReasonRequest.
     * 
     * @param callReasonDate
     */
    public void setCallReasonDate(java.util.Calendar callReasonDate) {
        this.callReasonDate = callReasonDate;
    }


    /**
     * Gets the callReasonNote value for this UpdateCallReasonRequest.
     * 
     * @return callReasonNote
     */
    public java.lang.String getCallReasonNote() {
        return callReasonNote;
    }


    /**
     * Sets the callReasonNote value for this UpdateCallReasonRequest.
     * 
     * @param callReasonNote
     */
    public void setCallReasonNote(java.lang.String callReasonNote) {
        this.callReasonNote = callReasonNote;
    }


    /**
     * Gets the messageID value for this UpdateCallReasonRequest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this UpdateCallReasonRequest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the operationType value for this UpdateCallReasonRequest.
     * 
     * @return operationType
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.OperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this UpdateCallReasonRequest.
     * 
     * @param operationType
     */
    public void setOperationType(net.bcgi.si.messages.mvnoapi.subscriber.OperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the securityId value for this UpdateCallReasonRequest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this UpdateCallReasonRequest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this UpdateCallReasonRequest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this UpdateCallReasonRequest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the version value for this UpdateCallReasonRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this UpdateCallReasonRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCallReasonRequest)) return false;
        UpdateCallReasonRequest other = (UpdateCallReasonRequest) obj;
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
            ((this.callReasonCode==null && other.getCallReasonCode()==null) || 
             (this.callReasonCode!=null &&
              this.callReasonCode.equals(other.getCallReasonCode()))) &&
            ((this.callReasonDate==null && other.getCallReasonDate()==null) || 
             (this.callReasonDate!=null &&
              this.callReasonDate.equals(other.getCallReasonDate()))) &&
            ((this.callReasonNote==null && other.getCallReasonNote()==null) || 
             (this.callReasonNote!=null &&
              this.callReasonNote.equals(other.getCallReasonNote()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getCallReasonCode() != null) {
            _hashCode += getCallReasonCode().hashCode();
        }
        if (getCallReasonDate() != null) {
            _hashCode += getCallReasonDate().hashCode();
        }
        if (getCallReasonNote() != null) {
            _hashCode += getCallReasonNote().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCallReasonRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "UpdateCallReasonRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "callReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callReasonDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "callReasonDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callReasonNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "callReasonNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "OperationType"));
        elemField.setNillable(false);
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
