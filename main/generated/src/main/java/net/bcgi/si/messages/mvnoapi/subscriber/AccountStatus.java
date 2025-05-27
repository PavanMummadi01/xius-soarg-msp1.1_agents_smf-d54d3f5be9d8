/**
 * AccountStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AccountStatus  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.util.Calendar cancelDate;

    private java.util.Calendar effectiveDate;

    private java.util.Calendar expirationDate;

    private net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType selfcareAccountStatus;

    private net.bcgi.si.messages.mvnoapi.subscriber.AccountStatusType status;

    private net.bcgi.si.messages.mvnoapi.subscriber.SubscriberStatusType subscriberStatus;

    private org.apache.axis.message.MessageElement [] _any;

    public AccountStatus() {
    }

    public AccountStatus(
           java.util.Calendar cancelDate,
           java.util.Calendar effectiveDate,
           java.util.Calendar expirationDate,
           net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType selfcareAccountStatus,
           net.bcgi.si.messages.mvnoapi.subscriber.AccountStatusType status,
           net.bcgi.si.messages.mvnoapi.subscriber.SubscriberStatusType subscriberStatus,
           org.apache.axis.message.MessageElement [] _any) {
           this.cancelDate = cancelDate;
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
           this.selfcareAccountStatus = selfcareAccountStatus;
           this.status = status;
           this.subscriberStatus = subscriberStatus;
           this._any = _any;
    }


    /**
     * Gets the cancelDate value for this AccountStatus.
     * 
     * @return cancelDate
     */
    public java.util.Calendar getCancelDate() {
        return cancelDate;
    }


    /**
     * Sets the cancelDate value for this AccountStatus.
     * 
     * @param cancelDate
     */
    public void setCancelDate(java.util.Calendar cancelDate) {
        this.cancelDate = cancelDate;
    }


    /**
     * Gets the effectiveDate value for this AccountStatus.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this AccountStatus.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this AccountStatus.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this AccountStatus.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the selfcareAccountStatus value for this AccountStatus.
     * 
     * @return selfcareAccountStatus
     */
    public net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType getSelfcareAccountStatus() {
        return selfcareAccountStatus;
    }


    /**
     * Sets the selfcareAccountStatus value for this AccountStatus.
     * 
     * @param selfcareAccountStatus
     */
    public void setSelfcareAccountStatus(net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType selfcareAccountStatus) {
        this.selfcareAccountStatus = selfcareAccountStatus;
    }


    /**
     * Gets the status value for this AccountStatus.
     * 
     * @return status
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AccountStatus.
     * 
     * @param status
     */
    public void setStatus(net.bcgi.si.messages.mvnoapi.subscriber.AccountStatusType status) {
        this.status = status;
    }


    /**
     * Gets the subscriberStatus value for this AccountStatus.
     * 
     * @return subscriberStatus
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.SubscriberStatusType getSubscriberStatus() {
        return subscriberStatus;
    }


    /**
     * Sets the subscriberStatus value for this AccountStatus.
     * 
     * @param subscriberStatus
     */
    public void setSubscriberStatus(net.bcgi.si.messages.mvnoapi.subscriber.SubscriberStatusType subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }


    /**
     * Gets the _any value for this AccountStatus.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountStatus.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountStatus)) return false;
        AccountStatus other = (AccountStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelDate==null && other.getCancelDate()==null) || 
             (this.cancelDate!=null &&
              this.cancelDate.equals(other.getCancelDate()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.selfcareAccountStatus==null && other.getSelfcareAccountStatus()==null) || 
             (this.selfcareAccountStatus!=null &&
              this.selfcareAccountStatus.equals(other.getSelfcareAccountStatus()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscriberStatus==null && other.getSubscriberStatus()==null) || 
             (this.subscriberStatus!=null &&
              this.subscriberStatus.equals(other.getSubscriberStatus()))) &&
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
        if (getCancelDate() != null) {
            _hashCode += getCancelDate().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getSelfcareAccountStatus() != null) {
            _hashCode += getSelfcareAccountStatus().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscriberStatus() != null) {
            _hashCode += getSubscriberStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "cancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfcareAccountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "selfcareAccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SelfcareAccountStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "subscriberStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberStatusType"));
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
