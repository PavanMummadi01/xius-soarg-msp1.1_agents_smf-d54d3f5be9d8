/**
 * BenefitDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class BenefitDtlsType  implements java.io.Serializable {
    private com.xius.billing.ProductManagement_xsd.VoiceDetailsType voiceDetails;

    private com.xius.billing.ProductManagement_xsd.SmsDetailsType smsDetails;

    private com.xius.billing.ProductManagement_xsd.DataDetailsType[] dataDetails;

    private com.xius.billing.ProductManagement_xsd.GlobalDetailsType globalDetails;

    public BenefitDtlsType() {
    }

    public BenefitDtlsType(
           com.xius.billing.ProductManagement_xsd.VoiceDetailsType voiceDetails,
           com.xius.billing.ProductManagement_xsd.SmsDetailsType smsDetails,
           com.xius.billing.ProductManagement_xsd.DataDetailsType[] dataDetails,
           com.xius.billing.ProductManagement_xsd.GlobalDetailsType globalDetails) {
           this.voiceDetails = voiceDetails;
           this.smsDetails = smsDetails;
           this.dataDetails = dataDetails;
           this.globalDetails = globalDetails;
    }


    /**
     * Gets the voiceDetails value for this BenefitDtlsType.
     * 
     * @return voiceDetails
     */
    public com.xius.billing.ProductManagement_xsd.VoiceDetailsType getVoiceDetails() {
        return voiceDetails;
    }


    /**
     * Sets the voiceDetails value for this BenefitDtlsType.
     * 
     * @param voiceDetails
     */
    public void setVoiceDetails(com.xius.billing.ProductManagement_xsd.VoiceDetailsType voiceDetails) {
        this.voiceDetails = voiceDetails;
    }


    /**
     * Gets the smsDetails value for this BenefitDtlsType.
     * 
     * @return smsDetails
     */
    public com.xius.billing.ProductManagement_xsd.SmsDetailsType getSmsDetails() {
        return smsDetails;
    }


    /**
     * Sets the smsDetails value for this BenefitDtlsType.
     * 
     * @param smsDetails
     */
    public void setSmsDetails(com.xius.billing.ProductManagement_xsd.SmsDetailsType smsDetails) {
        this.smsDetails = smsDetails;
    }


    /**
     * Gets the dataDetails value for this BenefitDtlsType.
     * 
     * @return dataDetails
     */
    public com.xius.billing.ProductManagement_xsd.DataDetailsType[] getDataDetails() {
        return dataDetails;
    }


    /**
     * Sets the dataDetails value for this BenefitDtlsType.
     * 
     * @param dataDetails
     */
    public void setDataDetails(com.xius.billing.ProductManagement_xsd.DataDetailsType[] dataDetails) {
        this.dataDetails = dataDetails;
    }

    public com.xius.billing.ProductManagement_xsd.DataDetailsType getDataDetails(int i) {
        return this.dataDetails[i];
    }

    public void setDataDetails(int i, com.xius.billing.ProductManagement_xsd.DataDetailsType _value) {
        this.dataDetails[i] = _value;
    }


    /**
     * Gets the globalDetails value for this BenefitDtlsType.
     * 
     * @return globalDetails
     */
    public com.xius.billing.ProductManagement_xsd.GlobalDetailsType getGlobalDetails() {
        return globalDetails;
    }


    /**
     * Sets the globalDetails value for this BenefitDtlsType.
     * 
     * @param globalDetails
     */
    public void setGlobalDetails(com.xius.billing.ProductManagement_xsd.GlobalDetailsType globalDetails) {
        this.globalDetails = globalDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BenefitDtlsType)) return false;
        BenefitDtlsType other = (BenefitDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voiceDetails==null && other.getVoiceDetails()==null) || 
             (this.voiceDetails!=null &&
              this.voiceDetails.equals(other.getVoiceDetails()))) &&
            ((this.smsDetails==null && other.getSmsDetails()==null) || 
             (this.smsDetails!=null &&
              this.smsDetails.equals(other.getSmsDetails()))) &&
            ((this.dataDetails==null && other.getDataDetails()==null) || 
             (this.dataDetails!=null &&
              java.util.Arrays.equals(this.dataDetails, other.getDataDetails()))) &&
            ((this.globalDetails==null && other.getGlobalDetails()==null) || 
             (this.globalDetails!=null &&
              this.globalDetails.equals(other.getGlobalDetails())));
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
        if (getVoiceDetails() != null) {
            _hashCode += getVoiceDetails().hashCode();
        }
        if (getSmsDetails() != null) {
            _hashCode += getSmsDetails().hashCode();
        }
        if (getDataDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobalDetails() != null) {
            _hashCode += getGlobalDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BenefitDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "BenefitDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "voiceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "voiceDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "smsDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "smsDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "dataDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "dataDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "globalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "globalDetailsType"));
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
