/**
 * ActiveBucketSummaryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ActiveBucketSummaryResponse  implements java.io.Serializable {
    private java.lang.String voiceAmount;

    private java.lang.String voiceSeconds;

    private java.lang.String voiceCalls;

    private java.lang.String SMSAmount;

    private java.lang.String SMSMsgs;

    private java.lang.String dataAmount;

    private java.lang.String dataByte;

    private java.lang.String globalAmount;

    public ActiveBucketSummaryResponse() {
    }

    public ActiveBucketSummaryResponse(
           java.lang.String voiceAmount,
           java.lang.String voiceSeconds,
           java.lang.String voiceCalls,
           java.lang.String SMSAmount,
           java.lang.String SMSMsgs,
           java.lang.String dataAmount,
           java.lang.String dataByte,
           java.lang.String globalAmount) {
           this.voiceAmount = voiceAmount;
           this.voiceSeconds = voiceSeconds;
           this.voiceCalls = voiceCalls;
           this.SMSAmount = SMSAmount;
           this.SMSMsgs = SMSMsgs;
           this.dataAmount = dataAmount;
           this.dataByte = dataByte;
           this.globalAmount = globalAmount;
    }


    /**
     * Gets the voiceAmount value for this ActiveBucketSummaryResponse.
     * 
     * @return voiceAmount
     */
    public java.lang.String getVoiceAmount() {
        return voiceAmount;
    }


    /**
     * Sets the voiceAmount value for this ActiveBucketSummaryResponse.
     * 
     * @param voiceAmount
     */
    public void setVoiceAmount(java.lang.String voiceAmount) {
        this.voiceAmount = voiceAmount;
    }


    /**
     * Gets the voiceSeconds value for this ActiveBucketSummaryResponse.
     * 
     * @return voiceSeconds
     */
    public java.lang.String getVoiceSeconds() {
        return voiceSeconds;
    }


    /**
     * Sets the voiceSeconds value for this ActiveBucketSummaryResponse.
     * 
     * @param voiceSeconds
     */
    public void setVoiceSeconds(java.lang.String voiceSeconds) {
        this.voiceSeconds = voiceSeconds;
    }


    /**
     * Gets the voiceCalls value for this ActiveBucketSummaryResponse.
     * 
     * @return voiceCalls
     */
    public java.lang.String getVoiceCalls() {
        return voiceCalls;
    }


    /**
     * Sets the voiceCalls value for this ActiveBucketSummaryResponse.
     * 
     * @param voiceCalls
     */
    public void setVoiceCalls(java.lang.String voiceCalls) {
        this.voiceCalls = voiceCalls;
    }


    /**
     * Gets the SMSAmount value for this ActiveBucketSummaryResponse.
     * 
     * @return SMSAmount
     */
    public java.lang.String getSMSAmount() {
        return SMSAmount;
    }


    /**
     * Sets the SMSAmount value for this ActiveBucketSummaryResponse.
     * 
     * @param SMSAmount
     */
    public void setSMSAmount(java.lang.String SMSAmount) {
        this.SMSAmount = SMSAmount;
    }


    /**
     * Gets the SMSMsgs value for this ActiveBucketSummaryResponse.
     * 
     * @return SMSMsgs
     */
    public java.lang.String getSMSMsgs() {
        return SMSMsgs;
    }


    /**
     * Sets the SMSMsgs value for this ActiveBucketSummaryResponse.
     * 
     * @param SMSMsgs
     */
    public void setSMSMsgs(java.lang.String SMSMsgs) {
        this.SMSMsgs = SMSMsgs;
    }


    /**
     * Gets the dataAmount value for this ActiveBucketSummaryResponse.
     * 
     * @return dataAmount
     */
    public java.lang.String getDataAmount() {
        return dataAmount;
    }


    /**
     * Sets the dataAmount value for this ActiveBucketSummaryResponse.
     * 
     * @param dataAmount
     */
    public void setDataAmount(java.lang.String dataAmount) {
        this.dataAmount = dataAmount;
    }


    /**
     * Gets the dataByte value for this ActiveBucketSummaryResponse.
     * 
     * @return dataByte
     */
    public java.lang.String getDataByte() {
        return dataByte;
    }


    /**
     * Sets the dataByte value for this ActiveBucketSummaryResponse.
     * 
     * @param dataByte
     */
    public void setDataByte(java.lang.String dataByte) {
        this.dataByte = dataByte;
    }


    /**
     * Gets the globalAmount value for this ActiveBucketSummaryResponse.
     * 
     * @return globalAmount
     */
    public java.lang.String getGlobalAmount() {
        return globalAmount;
    }


    /**
     * Sets the globalAmount value for this ActiveBucketSummaryResponse.
     * 
     * @param globalAmount
     */
    public void setGlobalAmount(java.lang.String globalAmount) {
        this.globalAmount = globalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActiveBucketSummaryResponse)) return false;
        ActiveBucketSummaryResponse other = (ActiveBucketSummaryResponse) obj;
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
            ((this.voiceSeconds==null && other.getVoiceSeconds()==null) || 
             (this.voiceSeconds!=null &&
              this.voiceSeconds.equals(other.getVoiceSeconds()))) &&
            ((this.voiceCalls==null && other.getVoiceCalls()==null) || 
             (this.voiceCalls!=null &&
              this.voiceCalls.equals(other.getVoiceCalls()))) &&
            ((this.SMSAmount==null && other.getSMSAmount()==null) || 
             (this.SMSAmount!=null &&
              this.SMSAmount.equals(other.getSMSAmount()))) &&
            ((this.SMSMsgs==null && other.getSMSMsgs()==null) || 
             (this.SMSMsgs!=null &&
              this.SMSMsgs.equals(other.getSMSMsgs()))) &&
            ((this.dataAmount==null && other.getDataAmount()==null) || 
             (this.dataAmount!=null &&
              this.dataAmount.equals(other.getDataAmount()))) &&
            ((this.dataByte==null && other.getDataByte()==null) || 
             (this.dataByte!=null &&
              this.dataByte.equals(other.getDataByte()))) &&
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
        if (getVoiceSeconds() != null) {
            _hashCode += getVoiceSeconds().hashCode();
        }
        if (getVoiceCalls() != null) {
            _hashCode += getVoiceCalls().hashCode();
        }
        if (getSMSAmount() != null) {
            _hashCode += getSMSAmount().hashCode();
        }
        if (getSMSMsgs() != null) {
            _hashCode += getSMSMsgs().hashCode();
        }
        if (getDataAmount() != null) {
            _hashCode += getDataAmount().hashCode();
        }
        if (getDataByte() != null) {
            _hashCode += getDataByte().hashCode();
        }
        if (getGlobalAmount() != null) {
            _hashCode += getGlobalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActiveBucketSummaryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activeBucketSummaryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VoiceAmount"));
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
        elemField.setFieldName("voiceCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VoiceCalls"));
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
        elemField.setFieldName("SMSMsgs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SMSMsgs"));
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
        elemField.setFieldName("dataByte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataByte"));
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
