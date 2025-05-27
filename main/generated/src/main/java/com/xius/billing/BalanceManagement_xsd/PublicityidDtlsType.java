/**
 * PublicityidDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class PublicityidDtlsType  implements java.io.Serializable {
    private java.lang.String publicityid;

    private com.xius.billing.BalanceManagement_xsd.VoiceDetailsType voice;

    private com.xius.billing.BalanceManagement_xsd.SmsDetailsType sms;

    private com.xius.billing.BalanceManagement_xsd.DataDetailsType data;

    private java.lang.String globalamount;

    public PublicityidDtlsType() {
    }

    public PublicityidDtlsType(
           java.lang.String publicityid,
           com.xius.billing.BalanceManagement_xsd.VoiceDetailsType voice,
           com.xius.billing.BalanceManagement_xsd.SmsDetailsType sms,
           com.xius.billing.BalanceManagement_xsd.DataDetailsType data,
           java.lang.String globalamount) {
           this.publicityid = publicityid;
           this.voice = voice;
           this.sms = sms;
           this.data = data;
           this.globalamount = globalamount;
    }


    /**
     * Gets the publicityid value for this PublicityidDtlsType.
     * 
     * @return publicityid
     */
    public java.lang.String getPublicityid() {
        return publicityid;
    }


    /**
     * Sets the publicityid value for this PublicityidDtlsType.
     * 
     * @param publicityid
     */
    public void setPublicityid(java.lang.String publicityid) {
        this.publicityid = publicityid;
    }


    /**
     * Gets the voice value for this PublicityidDtlsType.
     * 
     * @return voice
     */
    public com.xius.billing.BalanceManagement_xsd.VoiceDetailsType getVoice() {
        return voice;
    }


    /**
     * Sets the voice value for this PublicityidDtlsType.
     * 
     * @param voice
     */
    public void setVoice(com.xius.billing.BalanceManagement_xsd.VoiceDetailsType voice) {
        this.voice = voice;
    }


    /**
     * Gets the sms value for this PublicityidDtlsType.
     * 
     * @return sms
     */
    public com.xius.billing.BalanceManagement_xsd.SmsDetailsType getSms() {
        return sms;
    }


    /**
     * Sets the sms value for this PublicityidDtlsType.
     * 
     * @param sms
     */
    public void setSms(com.xius.billing.BalanceManagement_xsd.SmsDetailsType sms) {
        this.sms = sms;
    }


    /**
     * Gets the data value for this PublicityidDtlsType.
     * 
     * @return data
     */
    public com.xius.billing.BalanceManagement_xsd.DataDetailsType getData() {
        return data;
    }


    /**
     * Sets the data value for this PublicityidDtlsType.
     * 
     * @param data
     */
    public void setData(com.xius.billing.BalanceManagement_xsd.DataDetailsType data) {
        this.data = data;
    }


    /**
     * Gets the globalamount value for this PublicityidDtlsType.
     * 
     * @return globalamount
     */
    public java.lang.String getGlobalamount() {
        return globalamount;
    }


    /**
     * Sets the globalamount value for this PublicityidDtlsType.
     * 
     * @param globalamount
     */
    public void setGlobalamount(java.lang.String globalamount) {
        this.globalamount = globalamount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublicityidDtlsType)) return false;
        PublicityidDtlsType other = (PublicityidDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicityid==null && other.getPublicityid()==null) || 
             (this.publicityid!=null &&
              this.publicityid.equals(other.getPublicityid()))) &&
            ((this.voice==null && other.getVoice()==null) || 
             (this.voice!=null &&
              this.voice.equals(other.getVoice()))) &&
            ((this.sms==null && other.getSms()==null) || 
             (this.sms!=null &&
              this.sms.equals(other.getSms()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.globalamount==null && other.getGlobalamount()==null) || 
             (this.globalamount!=null &&
              this.globalamount.equals(other.getGlobalamount())));
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
        if (getPublicityid() != null) {
            _hashCode += getPublicityid().hashCode();
        }
        if (getVoice() != null) {
            _hashCode += getVoice().hashCode();
        }
        if (getSms() != null) {
            _hashCode += getSms().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getGlobalamount() != null) {
            _hashCode += getGlobalamount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublicityidDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityidDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voiceDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "sms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "smsDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "dataDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalamount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "globalamount"));
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
