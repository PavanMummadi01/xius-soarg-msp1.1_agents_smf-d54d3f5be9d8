/**
 * VoiceDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class VoiceDetailsType  implements java.io.Serializable {
    private java.lang.String voiceAmt;

    private java.lang.String voiceMin;

    private java.lang.String numOfCalls;

    public VoiceDetailsType() {
    }

    public VoiceDetailsType(
           java.lang.String voiceAmt,
           java.lang.String voiceMin,
           java.lang.String numOfCalls) {
           this.voiceAmt = voiceAmt;
           this.voiceMin = voiceMin;
           this.numOfCalls = numOfCalls;
    }


    /**
     * Gets the voiceAmt value for this VoiceDetailsType.
     * 
     * @return voiceAmt
     */
    public java.lang.String getVoiceAmt() {
        return voiceAmt;
    }


    /**
     * Sets the voiceAmt value for this VoiceDetailsType.
     * 
     * @param voiceAmt
     */
    public void setVoiceAmt(java.lang.String voiceAmt) {
        this.voiceAmt = voiceAmt;
    }


    /**
     * Gets the voiceMin value for this VoiceDetailsType.
     * 
     * @return voiceMin
     */
    public java.lang.String getVoiceMin() {
        return voiceMin;
    }


    /**
     * Sets the voiceMin value for this VoiceDetailsType.
     * 
     * @param voiceMin
     */
    public void setVoiceMin(java.lang.String voiceMin) {
        this.voiceMin = voiceMin;
    }


    /**
     * Gets the numOfCalls value for this VoiceDetailsType.
     * 
     * @return numOfCalls
     */
    public java.lang.String getNumOfCalls() {
        return numOfCalls;
    }


    /**
     * Sets the numOfCalls value for this VoiceDetailsType.
     * 
     * @param numOfCalls
     */
    public void setNumOfCalls(java.lang.String numOfCalls) {
        this.numOfCalls = numOfCalls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoiceDetailsType)) return false;
        VoiceDetailsType other = (VoiceDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voiceAmt==null && other.getVoiceAmt()==null) || 
             (this.voiceAmt!=null &&
              this.voiceAmt.equals(other.getVoiceAmt()))) &&
            ((this.voiceMin==null && other.getVoiceMin()==null) || 
             (this.voiceMin!=null &&
              this.voiceMin.equals(other.getVoiceMin()))) &&
            ((this.numOfCalls==null && other.getNumOfCalls()==null) || 
             (this.numOfCalls!=null &&
              this.numOfCalls.equals(other.getNumOfCalls())));
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
        if (getVoiceAmt() != null) {
            _hashCode += getVoiceAmt().hashCode();
        }
        if (getVoiceMin() != null) {
            _hashCode += getVoiceMin().hashCode();
        }
        if (getNumOfCalls() != null) {
            _hashCode += getNumOfCalls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoiceDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voiceDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voiceAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceMin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "voiceMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "numOfCalls"));
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
