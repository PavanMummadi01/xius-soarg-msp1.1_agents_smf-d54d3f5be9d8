/**
 * BalanceCategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class BalanceCategoryType  implements java.io.Serializable {
    private java.lang.String voiceAmount;

    private java.lang.String voiceCalls;

    private java.lang.String voiceSeconds;

    private java.lang.String SMSAmount;

    private java.lang.String SMS;

    private java.lang.String dataAmount;

    private java.lang.String dataKbyte;

    private java.lang.String MMSAmount;

    private java.lang.String MMS;

    private java.lang.String globalAmount;

    public BalanceCategoryType() {
    }

    public BalanceCategoryType(
           java.lang.String voiceAmount,
           java.lang.String voiceCalls,
           java.lang.String voiceSeconds,
           java.lang.String SMSAmount,
           java.lang.String SMS,
           java.lang.String dataAmount,
           java.lang.String dataKbyte,
           java.lang.String MMSAmount,
           java.lang.String MMS,
           java.lang.String globalAmount) {
           this.voiceAmount = voiceAmount;
           this.voiceCalls = voiceCalls;
           this.voiceSeconds = voiceSeconds;
           this.SMSAmount = SMSAmount;
           this.SMS = SMS;
           this.dataAmount = dataAmount;
           this.dataKbyte = dataKbyte;
           this.MMSAmount = MMSAmount;
           this.MMS = MMS;
           this.globalAmount = globalAmount;
    }


    /**
     * Gets the voiceAmount value for this BalanceCategoryType.
     * 
     * @return voiceAmount
     */
    public java.lang.String getVoiceAmount() {
        return voiceAmount;
    }


    /**
     * Sets the voiceAmount value for this BalanceCategoryType.
     * 
     * @param voiceAmount
     */
    public void setVoiceAmount(java.lang.String voiceAmount) {
        this.voiceAmount = voiceAmount;
    }


    /**
     * Gets the voiceCalls value for this BalanceCategoryType.
     * 
     * @return voiceCalls
     */
    public java.lang.String getVoiceCalls() {
        return voiceCalls;
    }


    /**
     * Sets the voiceCalls value for this BalanceCategoryType.
     * 
     * @param voiceCalls
     */
    public void setVoiceCalls(java.lang.String voiceCalls) {
        this.voiceCalls = voiceCalls;
    }


    /**
     * Gets the voiceSeconds value for this BalanceCategoryType.
     * 
     * @return voiceSeconds
     */
    public java.lang.String getVoiceSeconds() {
        return voiceSeconds;
    }


    /**
     * Sets the voiceSeconds value for this BalanceCategoryType.
     * 
     * @param voiceSeconds
     */
    public void setVoiceSeconds(java.lang.String voiceSeconds) {
        this.voiceSeconds = voiceSeconds;
    }


    /**
     * Gets the SMSAmount value for this BalanceCategoryType.
     * 
     * @return SMSAmount
     */
    public java.lang.String getSMSAmount() {
        return SMSAmount;
    }


    /**
     * Sets the SMSAmount value for this BalanceCategoryType.
     * 
     * @param SMSAmount
     */
    public void setSMSAmount(java.lang.String SMSAmount) {
        this.SMSAmount = SMSAmount;
    }


    /**
     * Gets the SMS value for this BalanceCategoryType.
     * 
     * @return SMS
     */
    public java.lang.String getSMS() {
        return SMS;
    }


    /**
     * Sets the SMS value for this BalanceCategoryType.
     * 
     * @param SMS
     */
    public void setSMS(java.lang.String SMS) {
        this.SMS = SMS;
    }


    /**
     * Gets the dataAmount value for this BalanceCategoryType.
     * 
     * @return dataAmount
     */
    public java.lang.String getDataAmount() {
        return dataAmount;
    }


    /**
     * Sets the dataAmount value for this BalanceCategoryType.
     * 
     * @param dataAmount
     */
    public void setDataAmount(java.lang.String dataAmount) {
        this.dataAmount = dataAmount;
    }


    /**
     * Gets the dataKbyte value for this BalanceCategoryType.
     * 
     * @return dataKbyte
     */
    public java.lang.String getDataKbyte() {
        return dataKbyte;
    }


    /**
     * Sets the dataKbyte value for this BalanceCategoryType.
     * 
     * @param dataKbyte
     */
    public void setDataKbyte(java.lang.String dataKbyte) {
        this.dataKbyte = dataKbyte;
    }


    /**
     * Gets the MMSAmount value for this BalanceCategoryType.
     * 
     * @return MMSAmount
     */
    public java.lang.String getMMSAmount() {
        return MMSAmount;
    }


    /**
     * Sets the MMSAmount value for this BalanceCategoryType.
     * 
     * @param MMSAmount
     */
    public void setMMSAmount(java.lang.String MMSAmount) {
        this.MMSAmount = MMSAmount;
    }


    /**
     * Gets the MMS value for this BalanceCategoryType.
     * 
     * @return MMS
     */
    public java.lang.String getMMS() {
        return MMS;
    }


    /**
     * Sets the MMS value for this BalanceCategoryType.
     * 
     * @param MMS
     */
    public void setMMS(java.lang.String MMS) {
        this.MMS = MMS;
    }


    /**
     * Gets the globalAmount value for this BalanceCategoryType.
     * 
     * @return globalAmount
     */
    public java.lang.String getGlobalAmount() {
        return globalAmount;
    }


    /**
     * Sets the globalAmount value for this BalanceCategoryType.
     * 
     * @param globalAmount
     */
    public void setGlobalAmount(java.lang.String globalAmount) {
        this.globalAmount = globalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceCategoryType)) return false;
        BalanceCategoryType other = (BalanceCategoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voiceAmount==null && other.getVoiceAmount()==null) || 
             (this.voiceAmount!=null &&
              this.voiceAmount.equals(other.getVoiceAmount()))) &&
            ((this.voiceCalls==null && other.getVoiceCalls()==null) || 
             (this.voiceCalls!=null &&
              this.voiceCalls.equals(other.getVoiceCalls()))) &&
            ((this.voiceSeconds==null && other.getVoiceSeconds()==null) || 
             (this.voiceSeconds!=null &&
              this.voiceSeconds.equals(other.getVoiceSeconds()))) &&
            ((this.SMSAmount==null && other.getSMSAmount()==null) || 
             (this.SMSAmount!=null &&
              this.SMSAmount.equals(other.getSMSAmount()))) &&
            ((this.SMS==null && other.getSMS()==null) || 
             (this.SMS!=null &&
              this.SMS.equals(other.getSMS()))) &&
            ((this.dataAmount==null && other.getDataAmount()==null) || 
             (this.dataAmount!=null &&
              this.dataAmount.equals(other.getDataAmount()))) &&
            ((this.dataKbyte==null && other.getDataKbyte()==null) || 
             (this.dataKbyte!=null &&
              this.dataKbyte.equals(other.getDataKbyte()))) &&
            ((this.MMSAmount==null && other.getMMSAmount()==null) || 
             (this.MMSAmount!=null &&
              this.MMSAmount.equals(other.getMMSAmount()))) &&
            ((this.MMS==null && other.getMMS()==null) || 
             (this.MMS!=null &&
              this.MMS.equals(other.getMMS()))) &&
            ((this.globalAmount==null && other.getGlobalAmount()==null) || 
             (this.globalAmount!=null &&
              this.globalAmount.equals(other.getGlobalAmount())));
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
        if (getVoiceAmount() != null) {
            _hashCode += getVoiceAmount().hashCode();
        }
        if (getVoiceCalls() != null) {
            _hashCode += getVoiceCalls().hashCode();
        }
        if (getVoiceSeconds() != null) {
            _hashCode += getVoiceSeconds().hashCode();
        }
        if (getSMSAmount() != null) {
            _hashCode += getSMSAmount().hashCode();
        }
        if (getSMS() != null) {
            _hashCode += getSMS().hashCode();
        }
        if (getDataAmount() != null) {
            _hashCode += getDataAmount().hashCode();
        }
        if (getDataKbyte() != null) {
            _hashCode += getDataKbyte().hashCode();
        }
        if (getMMSAmount() != null) {
            _hashCode += getMMSAmount().hashCode();
        }
        if (getMMS() != null) {
            _hashCode += getMMS().hashCode();
        }
        if (getGlobalAmount() != null) {
            _hashCode += getGlobalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceCategoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceCategoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VoiceCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VoiceSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SMSAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataKbyte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataKbyte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MMSAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MMSAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GlobalAmount"));
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
