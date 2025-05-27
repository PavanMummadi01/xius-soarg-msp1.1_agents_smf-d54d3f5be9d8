/**
 * NotificationDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class NotificationDataType  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.String SIMNo;

    private java.lang.String IMSINo;

    private java.lang.String MSISDN;

    private com.xius.billing.SubscriberManagement_xsd.NotificationData notificationData;

    public NotificationDataType() {
    }

    public NotificationDataType(
           java.lang.Long accountId,
           java.lang.String SIMNo,
           java.lang.String IMSINo,
           java.lang.String MSISDN,
           com.xius.billing.SubscriberManagement_xsd.NotificationData notificationData) {
           this.accountId = accountId;
           this.SIMNo = SIMNo;
           this.IMSINo = IMSINo;
           this.MSISDN = MSISDN;
           this.notificationData = notificationData;
    }


    /**
     * Gets the accountId value for this NotificationDataType.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this NotificationDataType.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the SIMNo value for this NotificationDataType.
     * 
     * @return SIMNo
     */
    public java.lang.String getSIMNo() {
        return SIMNo;
    }


    /**
     * Sets the SIMNo value for this NotificationDataType.
     * 
     * @param SIMNo
     */
    public void setSIMNo(java.lang.String SIMNo) {
        this.SIMNo = SIMNo;
    }


    /**
     * Gets the IMSINo value for this NotificationDataType.
     * 
     * @return IMSINo
     */
    public java.lang.String getIMSINo() {
        return IMSINo;
    }


    /**
     * Sets the IMSINo value for this NotificationDataType.
     * 
     * @param IMSINo
     */
    public void setIMSINo(java.lang.String IMSINo) {
        this.IMSINo = IMSINo;
    }


    /**
     * Gets the MSISDN value for this NotificationDataType.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this NotificationDataType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the notificationData value for this NotificationDataType.
     * 
     * @return notificationData
     */
    public com.xius.billing.SubscriberManagement_xsd.NotificationData getNotificationData() {
        return notificationData;
    }


    /**
     * Sets the notificationData value for this NotificationDataType.
     * 
     * @param notificationData
     */
    public void setNotificationData(com.xius.billing.SubscriberManagement_xsd.NotificationData notificationData) {
        this.notificationData = notificationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationDataType)) return false;
        NotificationDataType other = (NotificationDataType) obj;
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
            ((this.SIMNo==null && other.getSIMNo()==null) || 
             (this.SIMNo!=null &&
              this.SIMNo.equals(other.getSIMNo()))) &&
            ((this.IMSINo==null && other.getIMSINo()==null) || 
             (this.IMSINo!=null &&
              this.IMSINo.equals(other.getIMSINo()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.notificationData==null && other.getNotificationData()==null) || 
             (this.notificationData!=null &&
              this.notificationData.equals(other.getNotificationData())));
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
        if (getSIMNo() != null) {
            _hashCode += getSIMNo().hashCode();
        }
        if (getIMSINo() != null) {
            _hashCode += getIMSINo().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getNotificationData() != null) {
            _hashCode += getNotificationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIMNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSINo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IMSINo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "notificationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationData"));
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
