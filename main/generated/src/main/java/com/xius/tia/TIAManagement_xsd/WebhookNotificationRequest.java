/**
 * WebhookNotificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class WebhookNotificationRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String eventType;

    private java.lang.String transactionRefNum;

    private java.lang.String offeringId;

    private java.lang.String effectiveDate;

    private java.lang.String notificationDate;

    private java.lang.String be;

    private java.lang.String userdefinedtype1;

    private java.lang.String userdefinedtype2;

    private java.lang.String userdefinedtype3;

    public WebhookNotificationRequest() {
    }

    public WebhookNotificationRequest(
           java.lang.String MSISDN,
           java.lang.String eventType,
           java.lang.String transactionRefNum,
           java.lang.String offeringId,
           java.lang.String effectiveDate,
           java.lang.String notificationDate,
           java.lang.String be,
           java.lang.String userdefinedtype1,
           java.lang.String userdefinedtype2,
           java.lang.String userdefinedtype3) {
           this.MSISDN = MSISDN;
           this.eventType = eventType;
           this.transactionRefNum = transactionRefNum;
           this.offeringId = offeringId;
           this.effectiveDate = effectiveDate;
           this.notificationDate = notificationDate;
           this.be = be;
           this.userdefinedtype1 = userdefinedtype1;
           this.userdefinedtype2 = userdefinedtype2;
           this.userdefinedtype3 = userdefinedtype3;
    }


    /**
     * Gets the MSISDN value for this WebhookNotificationRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this WebhookNotificationRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the eventType value for this WebhookNotificationRequest.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this WebhookNotificationRequest.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the transactionRefNum value for this WebhookNotificationRequest.
     * 
     * @return transactionRefNum
     */
    public java.lang.String getTransactionRefNum() {
        return transactionRefNum;
    }


    /**
     * Sets the transactionRefNum value for this WebhookNotificationRequest.
     * 
     * @param transactionRefNum
     */
    public void setTransactionRefNum(java.lang.String transactionRefNum) {
        this.transactionRefNum = transactionRefNum;
    }


    /**
     * Gets the offeringId value for this WebhookNotificationRequest.
     * 
     * @return offeringId
     */
    public java.lang.String getOfferingId() {
        return offeringId;
    }


    /**
     * Sets the offeringId value for this WebhookNotificationRequest.
     * 
     * @param offeringId
     */
    public void setOfferingId(java.lang.String offeringId) {
        this.offeringId = offeringId;
    }


    /**
     * Gets the effectiveDate value for this WebhookNotificationRequest.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this WebhookNotificationRequest.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the notificationDate value for this WebhookNotificationRequest.
     * 
     * @return notificationDate
     */
    public java.lang.String getNotificationDate() {
        return notificationDate;
    }


    /**
     * Sets the notificationDate value for this WebhookNotificationRequest.
     * 
     * @param notificationDate
     */
    public void setNotificationDate(java.lang.String notificationDate) {
        this.notificationDate = notificationDate;
    }


    /**
     * Gets the be value for this WebhookNotificationRequest.
     * 
     * @return be
     */
    public java.lang.String getBe() {
        return be;
    }


    /**
     * Sets the be value for this WebhookNotificationRequest.
     * 
     * @param be
     */
    public void setBe(java.lang.String be) {
        this.be = be;
    }


    /**
     * Gets the userdefinedtype1 value for this WebhookNotificationRequest.
     * 
     * @return userdefinedtype1
     */
    public java.lang.String getUserdefinedtype1() {
        return userdefinedtype1;
    }


    /**
     * Sets the userdefinedtype1 value for this WebhookNotificationRequest.
     * 
     * @param userdefinedtype1
     */
    public void setUserdefinedtype1(java.lang.String userdefinedtype1) {
        this.userdefinedtype1 = userdefinedtype1;
    }


    /**
     * Gets the userdefinedtype2 value for this WebhookNotificationRequest.
     * 
     * @return userdefinedtype2
     */
    public java.lang.String getUserdefinedtype2() {
        return userdefinedtype2;
    }


    /**
     * Sets the userdefinedtype2 value for this WebhookNotificationRequest.
     * 
     * @param userdefinedtype2
     */
    public void setUserdefinedtype2(java.lang.String userdefinedtype2) {
        this.userdefinedtype2 = userdefinedtype2;
    }


    /**
     * Gets the userdefinedtype3 value for this WebhookNotificationRequest.
     * 
     * @return userdefinedtype3
     */
    public java.lang.String getUserdefinedtype3() {
        return userdefinedtype3;
    }


    /**
     * Sets the userdefinedtype3 value for this WebhookNotificationRequest.
     * 
     * @param userdefinedtype3
     */
    public void setUserdefinedtype3(java.lang.String userdefinedtype3) {
        this.userdefinedtype3 = userdefinedtype3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebhookNotificationRequest)) return false;
        WebhookNotificationRequest other = (WebhookNotificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.transactionRefNum==null && other.getTransactionRefNum()==null) || 
             (this.transactionRefNum!=null &&
              this.transactionRefNum.equals(other.getTransactionRefNum()))) &&
            ((this.offeringId==null && other.getOfferingId()==null) || 
             (this.offeringId!=null &&
              this.offeringId.equals(other.getOfferingId()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.notificationDate==null && other.getNotificationDate()==null) || 
             (this.notificationDate!=null &&
              this.notificationDate.equals(other.getNotificationDate()))) &&
            ((this.be==null && other.getBe()==null) || 
             (this.be!=null &&
              this.be.equals(other.getBe()))) &&
            ((this.userdefinedtype1==null && other.getUserdefinedtype1()==null) || 
             (this.userdefinedtype1!=null &&
              this.userdefinedtype1.equals(other.getUserdefinedtype1()))) &&
            ((this.userdefinedtype2==null && other.getUserdefinedtype2()==null) || 
             (this.userdefinedtype2!=null &&
              this.userdefinedtype2.equals(other.getUserdefinedtype2()))) &&
            ((this.userdefinedtype3==null && other.getUserdefinedtype3()==null) || 
             (this.userdefinedtype3!=null &&
              this.userdefinedtype3.equals(other.getUserdefinedtype3())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getTransactionRefNum() != null) {
            _hashCode += getTransactionRefNum().hashCode();
        }
        if (getOfferingId() != null) {
            _hashCode += getOfferingId().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getNotificationDate() != null) {
            _hashCode += getNotificationDate().hashCode();
        }
        if (getBe() != null) {
            _hashCode += getBe().hashCode();
        }
        if (getUserdefinedtype1() != null) {
            _hashCode += getUserdefinedtype1().hashCode();
        }
        if (getUserdefinedtype2() != null) {
            _hashCode += getUserdefinedtype2().hashCode();
        }
        if (getUserdefinedtype3() != null) {
            _hashCode += getUserdefinedtype3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebhookNotificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "webhookNotificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "transactionRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "offeringId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "notificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("be");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "be"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
