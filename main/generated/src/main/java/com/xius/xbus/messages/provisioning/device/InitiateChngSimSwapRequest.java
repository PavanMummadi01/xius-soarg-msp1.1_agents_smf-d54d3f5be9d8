/**
 * InitiateChngSimSwapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class InitiateChngSimSwapRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.Long oldAccountId;

    private com.xius.xbus.messages.provisioning.device.DeviceType deviceType;

    private java.lang.String oldMSISDN;

    private java.lang.String oldsim;

    private java.lang.String newsim;

    private java.lang.String oldimsi;

    private java.lang.String exTransId;

    private java.lang.String zipCode;

    private java.lang.String idValue;

    public InitiateChngSimSwapRequest() {
    }

    public InitiateChngSimSwapRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.Long oldAccountId,
           com.xius.xbus.messages.provisioning.device.DeviceType deviceType,
           java.lang.String oldMSISDN,
           java.lang.String oldsim,
           java.lang.String newsim,
           java.lang.String oldimsi,
           java.lang.String exTransId,
           java.lang.String zipCode,
           java.lang.String idValue) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.oldAccountId = oldAccountId;
        this.deviceType = deviceType;
        this.oldMSISDN = oldMSISDN;
        this.oldsim = oldsim;
        this.newsim = newsim;
        this.oldimsi = oldimsi;
        this.exTransId = exTransId;
        this.zipCode = zipCode;
        this.idValue = idValue;
    }


    /**
     * Gets the oldAccountId value for this InitiateChngSimSwapRequest.
     * 
     * @return oldAccountId
     */
    public java.lang.Long getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this InitiateChngSimSwapRequest.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(java.lang.Long oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the deviceType value for this InitiateChngSimSwapRequest.
     * 
     * @return deviceType
     */
    public com.xius.xbus.messages.provisioning.device.DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this InitiateChngSimSwapRequest.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.xius.xbus.messages.provisioning.device.DeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the oldMSISDN value for this InitiateChngSimSwapRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this InitiateChngSimSwapRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the oldsim value for this InitiateChngSimSwapRequest.
     * 
     * @return oldsim
     */
    public java.lang.String getOldsim() {
        return oldsim;
    }


    /**
     * Sets the oldsim value for this InitiateChngSimSwapRequest.
     * 
     * @param oldsim
     */
    public void setOldsim(java.lang.String oldsim) {
        this.oldsim = oldsim;
    }


    /**
     * Gets the newsim value for this InitiateChngSimSwapRequest.
     * 
     * @return newsim
     */
    public java.lang.String getNewsim() {
        return newsim;
    }


    /**
     * Sets the newsim value for this InitiateChngSimSwapRequest.
     * 
     * @param newsim
     */
    public void setNewsim(java.lang.String newsim) {
        this.newsim = newsim;
    }


    /**
     * Gets the oldimsi value for this InitiateChngSimSwapRequest.
     * 
     * @return oldimsi
     */
    public java.lang.String getOldimsi() {
        return oldimsi;
    }


    /**
     * Sets the oldimsi value for this InitiateChngSimSwapRequest.
     * 
     * @param oldimsi
     */
    public void setOldimsi(java.lang.String oldimsi) {
        this.oldimsi = oldimsi;
    }


    /**
     * Gets the exTransId value for this InitiateChngSimSwapRequest.
     * 
     * @return exTransId
     */
    public java.lang.String getExTransId() {
        return exTransId;
    }


    /**
     * Sets the exTransId value for this InitiateChngSimSwapRequest.
     * 
     * @param exTransId
     */
    public void setExTransId(java.lang.String exTransId) {
        this.exTransId = exTransId;
    }


    /**
     * Gets the zipCode value for this InitiateChngSimSwapRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this InitiateChngSimSwapRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the idValue value for this InitiateChngSimSwapRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this InitiateChngSimSwapRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiateChngSimSwapRequest)) return false;
        InitiateChngSimSwapRequest other = (InitiateChngSimSwapRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.oldsim==null && other.getOldsim()==null) || 
             (this.oldsim!=null &&
              this.oldsim.equals(other.getOldsim()))) &&
            ((this.newsim==null && other.getNewsim()==null) || 
             (this.newsim!=null &&
              this.newsim.equals(other.getNewsim()))) &&
            ((this.oldimsi==null && other.getOldimsi()==null) || 
             (this.oldimsi!=null &&
              this.oldimsi.equals(other.getOldimsi()))) &&
            ((this.exTransId==null && other.getExTransId()==null) || 
             (this.exTransId!=null &&
              this.exTransId.equals(other.getExTransId()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getOldsim() != null) {
            _hashCode += getOldsim().hashCode();
        }
        if (getNewsim() != null) {
            _hashCode += getNewsim().hashCode();
        }
        if (getOldimsi() != null) {
            _hashCode += getOldimsi().hashCode();
        }
        if (getExTransId() != null) {
            _hashCode += getExTransId().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateChngSimSwapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">initiateChngSimSwapRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "DeviceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldsim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldsim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newsim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldimsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldimsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "exTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "idValue"));
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
