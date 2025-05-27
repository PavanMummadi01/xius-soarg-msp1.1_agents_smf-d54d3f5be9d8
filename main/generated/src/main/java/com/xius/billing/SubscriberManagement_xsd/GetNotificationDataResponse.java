/**
 * GetNotificationDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetNotificationDataResponse  implements java.io.Serializable {
    private java.lang.String IDNo;

    private com.xius.billing.SubscriberManagement_xsd.NotificationDataType[] notificationDataList;

    private com.xius.billing.SubscriberManagement_xsd.LanguageDataType[] availableLanguages;

    private com.xius.billing.SubscriberManagement_xsd.LanguageDataType defaultLanguage;

    public GetNotificationDataResponse() {
    }

    public GetNotificationDataResponse(
           java.lang.String IDNo,
           com.xius.billing.SubscriberManagement_xsd.NotificationDataType[] notificationDataList,
           com.xius.billing.SubscriberManagement_xsd.LanguageDataType[] availableLanguages,
           com.xius.billing.SubscriberManagement_xsd.LanguageDataType defaultLanguage) {
           this.IDNo = IDNo;
           this.notificationDataList = notificationDataList;
           this.availableLanguages = availableLanguages;
           this.defaultLanguage = defaultLanguage;
    }


    /**
     * Gets the IDNo value for this GetNotificationDataResponse.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this GetNotificationDataResponse.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the notificationDataList value for this GetNotificationDataResponse.
     * 
     * @return notificationDataList
     */
    public com.xius.billing.SubscriberManagement_xsd.NotificationDataType[] getNotificationDataList() {
        return notificationDataList;
    }


    /**
     * Sets the notificationDataList value for this GetNotificationDataResponse.
     * 
     * @param notificationDataList
     */
    public void setNotificationDataList(com.xius.billing.SubscriberManagement_xsd.NotificationDataType[] notificationDataList) {
        this.notificationDataList = notificationDataList;
    }


    /**
     * Gets the availableLanguages value for this GetNotificationDataResponse.
     * 
     * @return availableLanguages
     */
    public com.xius.billing.SubscriberManagement_xsd.LanguageDataType[] getAvailableLanguages() {
        return availableLanguages;
    }


    /**
     * Sets the availableLanguages value for this GetNotificationDataResponse.
     * 
     * @param availableLanguages
     */
    public void setAvailableLanguages(com.xius.billing.SubscriberManagement_xsd.LanguageDataType[] availableLanguages) {
        this.availableLanguages = availableLanguages;
    }


    /**
     * Gets the defaultLanguage value for this GetNotificationDataResponse.
     * 
     * @return defaultLanguage
     */
    public com.xius.billing.SubscriberManagement_xsd.LanguageDataType getDefaultLanguage() {
        return defaultLanguage;
    }


    /**
     * Sets the defaultLanguage value for this GetNotificationDataResponse.
     * 
     * @param defaultLanguage
     */
    public void setDefaultLanguage(com.xius.billing.SubscriberManagement_xsd.LanguageDataType defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNotificationDataResponse)) return false;
        GetNotificationDataResponse other = (GetNotificationDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.notificationDataList==null && other.getNotificationDataList()==null) || 
             (this.notificationDataList!=null &&
              java.util.Arrays.equals(this.notificationDataList, other.getNotificationDataList()))) &&
            ((this.availableLanguages==null && other.getAvailableLanguages()==null) || 
             (this.availableLanguages!=null &&
              java.util.Arrays.equals(this.availableLanguages, other.getAvailableLanguages()))) &&
            ((this.defaultLanguage==null && other.getDefaultLanguage()==null) || 
             (this.defaultLanguage!=null &&
              this.defaultLanguage.equals(other.getDefaultLanguage())));
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
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getNotificationDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificationDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableLanguages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultLanguage() != null) {
            _hashCode += getDefaultLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNotificationDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotificationDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "notificationDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "notificationData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableLanguages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availableLanguages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LanguageDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "language"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "defaultLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LanguageDataType"));
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
