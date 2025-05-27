/**
 * GetDeviceInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetDeviceInfoResponse  implements java.io.Serializable {
    private java.lang.String SIM;

    private java.lang.String IMSI;

    private java.lang.String status;

    private java.lang.String cancelDate;

    private java.lang.String expiryDate;

    private java.math.BigInteger gracePeriod;

    private java.lang.String passcode;

    private java.lang.String intialAllowed;

    private java.lang.String VRULanguage;

    private java.lang.String messageLevel;

    public GetDeviceInfoResponse() {
    }

    public GetDeviceInfoResponse(
           java.lang.String SIM,
           java.lang.String IMSI,
           java.lang.String status,
           java.lang.String cancelDate,
           java.lang.String expiryDate,
           java.math.BigInteger gracePeriod,
           java.lang.String passcode,
           java.lang.String intialAllowed,
           java.lang.String VRULanguage,
           java.lang.String messageLevel) {
           this.SIM = SIM;
           this.IMSI = IMSI;
           this.status = status;
           this.cancelDate = cancelDate;
           this.expiryDate = expiryDate;
           this.gracePeriod = gracePeriod;
           this.passcode = passcode;
           this.intialAllowed = intialAllowed;
           this.VRULanguage = VRULanguage;
           this.messageLevel = messageLevel;
    }


    /**
     * Gets the SIM value for this GetDeviceInfoResponse.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this GetDeviceInfoResponse.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the IMSI value for this GetDeviceInfoResponse.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this GetDeviceInfoResponse.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the status value for this GetDeviceInfoResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetDeviceInfoResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the cancelDate value for this GetDeviceInfoResponse.
     * 
     * @return cancelDate
     */
    public java.lang.String getCancelDate() {
        return cancelDate;
    }


    /**
     * Sets the cancelDate value for this GetDeviceInfoResponse.
     * 
     * @param cancelDate
     */
    public void setCancelDate(java.lang.String cancelDate) {
        this.cancelDate = cancelDate;
    }


    /**
     * Gets the expiryDate value for this GetDeviceInfoResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetDeviceInfoResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the gracePeriod value for this GetDeviceInfoResponse.
     * 
     * @return gracePeriod
     */
    public java.math.BigInteger getGracePeriod() {
        return gracePeriod;
    }


    /**
     * Sets the gracePeriod value for this GetDeviceInfoResponse.
     * 
     * @param gracePeriod
     */
    public void setGracePeriod(java.math.BigInteger gracePeriod) {
        this.gracePeriod = gracePeriod;
    }


    /**
     * Gets the passcode value for this GetDeviceInfoResponse.
     * 
     * @return passcode
     */
    public java.lang.String getPasscode() {
        return passcode;
    }


    /**
     * Sets the passcode value for this GetDeviceInfoResponse.
     * 
     * @param passcode
     */
    public void setPasscode(java.lang.String passcode) {
        this.passcode = passcode;
    }


    /**
     * Gets the intialAllowed value for this GetDeviceInfoResponse.
     * 
     * @return intialAllowed
     */
    public java.lang.String getIntialAllowed() {
        return intialAllowed;
    }


    /**
     * Sets the intialAllowed value for this GetDeviceInfoResponse.
     * 
     * @param intialAllowed
     */
    public void setIntialAllowed(java.lang.String intialAllowed) {
        this.intialAllowed = intialAllowed;
    }


    /**
     * Gets the VRULanguage value for this GetDeviceInfoResponse.
     * 
     * @return VRULanguage
     */
    public java.lang.String getVRULanguage() {
        return VRULanguage;
    }


    /**
     * Sets the VRULanguage value for this GetDeviceInfoResponse.
     * 
     * @param VRULanguage
     */
    public void setVRULanguage(java.lang.String VRULanguage) {
        this.VRULanguage = VRULanguage;
    }


    /**
     * Gets the messageLevel value for this GetDeviceInfoResponse.
     * 
     * @return messageLevel
     */
    public java.lang.String getMessageLevel() {
        return messageLevel;
    }


    /**
     * Sets the messageLevel value for this GetDeviceInfoResponse.
     * 
     * @param messageLevel
     */
    public void setMessageLevel(java.lang.String messageLevel) {
        this.messageLevel = messageLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeviceInfoResponse)) return false;
        GetDeviceInfoResponse other = (GetDeviceInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cancelDate==null && other.getCancelDate()==null) || 
             (this.cancelDate!=null &&
              this.cancelDate.equals(other.getCancelDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.gracePeriod==null && other.getGracePeriod()==null) || 
             (this.gracePeriod!=null &&
              this.gracePeriod.equals(other.getGracePeriod()))) &&
            ((this.passcode==null && other.getPasscode()==null) || 
             (this.passcode!=null &&
              this.passcode.equals(other.getPasscode()))) &&
            ((this.intialAllowed==null && other.getIntialAllowed()==null) || 
             (this.intialAllowed!=null &&
              this.intialAllowed.equals(other.getIntialAllowed()))) &&
            ((this.VRULanguage==null && other.getVRULanguage()==null) || 
             (this.VRULanguage!=null &&
              this.VRULanguage.equals(other.getVRULanguage()))) &&
            ((this.messageLevel==null && other.getMessageLevel()==null) || 
             (this.messageLevel!=null &&
              this.messageLevel.equals(other.getMessageLevel())));
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
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCancelDate() != null) {
            _hashCode += getCancelDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getGracePeriod() != null) {
            _hashCode += getGracePeriod().hashCode();
        }
        if (getPasscode() != null) {
            _hashCode += getPasscode().hashCode();
        }
        if (getIntialAllowed() != null) {
            _hashCode += getIntialAllowed().hashCode();
        }
        if (getVRULanguage() != null) {
            _hashCode += getVRULanguage().hashCode();
        }
        if (getMessageLevel() != null) {
            _hashCode += getMessageLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeviceInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDeviceInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "gracePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "passcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intialAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "intialAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VRULanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VRULanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "messageLevel"));
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
