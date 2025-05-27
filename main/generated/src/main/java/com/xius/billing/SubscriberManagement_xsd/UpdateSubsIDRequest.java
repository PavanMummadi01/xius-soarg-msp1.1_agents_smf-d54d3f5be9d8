/**
 * UpdateSubsIDRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class UpdateSubsIDRequest  implements java.io.Serializable {
    private java.lang.String idType;

    private java.lang.String idValue;

    private java.lang.String newIdType;

    private java.lang.String newIdValue;

    private java.lang.String emailId;

    private java.lang.Long accountId;

    public UpdateSubsIDRequest() {
    }

    public UpdateSubsIDRequest(
           java.lang.String idType,
           java.lang.String idValue,
           java.lang.String newIdType,
           java.lang.String newIdValue,
           java.lang.String emailId,
           java.lang.Long accountId) {
           this.idType = idType;
           this.idValue = idValue;
           this.newIdType = newIdType;
           this.newIdValue = newIdValue;
           this.emailId = emailId;
           this.accountId = accountId;
    }


    /**
     * Gets the idType value for this UpdateSubsIDRequest.
     * 
     * @return idType
     */
    public java.lang.String getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this UpdateSubsIDRequest.
     * 
     * @param idType
     */
    public void setIdType(java.lang.String idType) {
        this.idType = idType;
    }


    /**
     * Gets the idValue value for this UpdateSubsIDRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this UpdateSubsIDRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the newIdType value for this UpdateSubsIDRequest.
     * 
     * @return newIdType
     */
    public java.lang.String getNewIdType() {
        return newIdType;
    }


    /**
     * Sets the newIdType value for this UpdateSubsIDRequest.
     * 
     * @param newIdType
     */
    public void setNewIdType(java.lang.String newIdType) {
        this.newIdType = newIdType;
    }


    /**
     * Gets the newIdValue value for this UpdateSubsIDRequest.
     * 
     * @return newIdValue
     */
    public java.lang.String getNewIdValue() {
        return newIdValue;
    }


    /**
     * Sets the newIdValue value for this UpdateSubsIDRequest.
     * 
     * @param newIdValue
     */
    public void setNewIdValue(java.lang.String newIdValue) {
        this.newIdValue = newIdValue;
    }


    /**
     * Gets the emailId value for this UpdateSubsIDRequest.
     * 
     * @return emailId
     */
    public java.lang.String getEmailId() {
        return emailId;
    }


    /**
     * Sets the emailId value for this UpdateSubsIDRequest.
     * 
     * @param emailId
     */
    public void setEmailId(java.lang.String emailId) {
        this.emailId = emailId;
    }


    /**
     * Gets the accountId value for this UpdateSubsIDRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this UpdateSubsIDRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSubsIDRequest)) return false;
        UpdateSubsIDRequest other = (UpdateSubsIDRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.newIdType==null && other.getNewIdType()==null) || 
             (this.newIdType!=null &&
              this.newIdType.equals(other.getNewIdType()))) &&
            ((this.newIdValue==null && other.getNewIdValue()==null) || 
             (this.newIdValue!=null &&
              this.newIdValue.equals(other.getNewIdValue()))) &&
            ((this.emailId==null && other.getEmailId()==null) || 
             (this.emailId!=null &&
              this.emailId.equals(other.getEmailId()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId())));
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
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getNewIdType() != null) {
            _hashCode += getNewIdType().hashCode();
        }
        if (getNewIdValue() != null) {
            _hashCode += getNewIdValue().hashCode();
        }
        if (getEmailId() != null) {
            _hashCode += getEmailId().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSubsIDRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateSubsIDRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "idValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "newIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIdValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "newIdValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "emailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
