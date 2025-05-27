/**
 * NotificationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class NotificationData  implements java.io.Serializable {
    private java.lang.String emailId;

    private java.lang.Integer emailNotifPref;

    private java.lang.Integer SMSNotifPref;

    private java.lang.Integer USSDNotifPref;

    private java.lang.Integer IVRNotifPref;

    public NotificationData() {
    }

    public NotificationData(
           java.lang.String emailId,
           java.lang.Integer emailNotifPref,
           java.lang.Integer SMSNotifPref,
           java.lang.Integer USSDNotifPref,
           java.lang.Integer IVRNotifPref) {
           this.emailId = emailId;
           this.emailNotifPref = emailNotifPref;
           this.SMSNotifPref = SMSNotifPref;
           this.USSDNotifPref = USSDNotifPref;
           this.IVRNotifPref = IVRNotifPref;
    }


    /**
     * Gets the emailId value for this NotificationData.
     * 
     * @return emailId
     */
    public java.lang.String getEmailId() {
        return emailId;
    }


    /**
     * Sets the emailId value for this NotificationData.
     * 
     * @param emailId
     */
    public void setEmailId(java.lang.String emailId) {
        this.emailId = emailId;
    }


    /**
     * Gets the emailNotifPref value for this NotificationData.
     * 
     * @return emailNotifPref
     */
    public java.lang.Integer getEmailNotifPref() {
        return emailNotifPref;
    }


    /**
     * Sets the emailNotifPref value for this NotificationData.
     * 
     * @param emailNotifPref
     */
    public void setEmailNotifPref(java.lang.Integer emailNotifPref) {
        this.emailNotifPref = emailNotifPref;
    }


    /**
     * Gets the SMSNotifPref value for this NotificationData.
     * 
     * @return SMSNotifPref
     */
    public java.lang.Integer getSMSNotifPref() {
        return SMSNotifPref;
    }


    /**
     * Sets the SMSNotifPref value for this NotificationData.
     * 
     * @param SMSNotifPref
     */
    public void setSMSNotifPref(java.lang.Integer SMSNotifPref) {
        this.SMSNotifPref = SMSNotifPref;
    }


    /**
     * Gets the USSDNotifPref value for this NotificationData.
     * 
     * @return USSDNotifPref
     */
    public java.lang.Integer getUSSDNotifPref() {
        return USSDNotifPref;
    }


    /**
     * Sets the USSDNotifPref value for this NotificationData.
     * 
     * @param USSDNotifPref
     */
    public void setUSSDNotifPref(java.lang.Integer USSDNotifPref) {
        this.USSDNotifPref = USSDNotifPref;
    }


    /**
     * Gets the IVRNotifPref value for this NotificationData.
     * 
     * @return IVRNotifPref
     */
    public java.lang.Integer getIVRNotifPref() {
        return IVRNotifPref;
    }


    /**
     * Sets the IVRNotifPref value for this NotificationData.
     * 
     * @param IVRNotifPref
     */
    public void setIVRNotifPref(java.lang.Integer IVRNotifPref) {
        this.IVRNotifPref = IVRNotifPref;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationData)) return false;
        NotificationData other = (NotificationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailId==null && other.getEmailId()==null) || 
             (this.emailId!=null &&
              this.emailId.equals(other.getEmailId()))) &&
            ((this.emailNotifPref==null && other.getEmailNotifPref()==null) || 
             (this.emailNotifPref!=null &&
              this.emailNotifPref.equals(other.getEmailNotifPref()))) &&
            ((this.SMSNotifPref==null && other.getSMSNotifPref()==null) || 
             (this.SMSNotifPref!=null &&
              this.SMSNotifPref.equals(other.getSMSNotifPref()))) &&
            ((this.USSDNotifPref==null && other.getUSSDNotifPref()==null) || 
             (this.USSDNotifPref!=null &&
              this.USSDNotifPref.equals(other.getUSSDNotifPref()))) &&
            ((this.IVRNotifPref==null && other.getIVRNotifPref()==null) || 
             (this.IVRNotifPref!=null &&
              this.IVRNotifPref.equals(other.getIVRNotifPref())));
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
        if (getEmailId() != null) {
            _hashCode += getEmailId().hashCode();
        }
        if (getEmailNotifPref() != null) {
            _hashCode += getEmailNotifPref().hashCode();
        }
        if (getSMSNotifPref() != null) {
            _hashCode += getSMSNotifPref().hashCode();
        }
        if (getUSSDNotifPref() != null) {
            _hashCode += getUSSDNotifPref().hashCode();
        }
        if (getIVRNotifPref() != null) {
            _hashCode += getIVRNotifPref().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "emailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailNotifPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "emailNotifPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSNotifPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SMSNotifPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USSDNotifPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "USSDNotifPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRNotifPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IVRNotifPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
