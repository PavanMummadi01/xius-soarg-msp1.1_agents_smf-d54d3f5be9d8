/**
 * GetRemainingBktBalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class GetRemainingBktBalResponse  implements java.io.Serializable {
    private java.lang.String[] voiceDetails;

    private java.lang.String[] SMSDetails;

    private java.lang.String[] dataDetails;

    private java.lang.String[] globalDetails;

    public GetRemainingBktBalResponse() {
    }

    public GetRemainingBktBalResponse(
           java.lang.String[] voiceDetails,
           java.lang.String[] SMSDetails,
           java.lang.String[] dataDetails,
           java.lang.String[] globalDetails) {
           this.voiceDetails = voiceDetails;
           this.SMSDetails = SMSDetails;
           this.dataDetails = dataDetails;
           this.globalDetails = globalDetails;
    }


    /**
     * Gets the voiceDetails value for this GetRemainingBktBalResponse.
     * 
     * @return voiceDetails
     */
    public java.lang.String[] getVoiceDetails() {
        return voiceDetails;
    }


    /**
     * Sets the voiceDetails value for this GetRemainingBktBalResponse.
     * 
     * @param voiceDetails
     */
    public void setVoiceDetails(java.lang.String[] voiceDetails) {
        this.voiceDetails = voiceDetails;
    }

    public java.lang.String getVoiceDetails(int i) {
        return this.voiceDetails[i];
    }

    public void setVoiceDetails(int i, java.lang.String _value) {
        this.voiceDetails[i] = _value;
    }


    /**
     * Gets the SMSDetails value for this GetRemainingBktBalResponse.
     * 
     * @return SMSDetails
     */
    public java.lang.String[] getSMSDetails() {
        return SMSDetails;
    }


    /**
     * Sets the SMSDetails value for this GetRemainingBktBalResponse.
     * 
     * @param SMSDetails
     */
    public void setSMSDetails(java.lang.String[] SMSDetails) {
        this.SMSDetails = SMSDetails;
    }

    public java.lang.String getSMSDetails(int i) {
        return this.SMSDetails[i];
    }

    public void setSMSDetails(int i, java.lang.String _value) {
        this.SMSDetails[i] = _value;
    }


    /**
     * Gets the dataDetails value for this GetRemainingBktBalResponse.
     * 
     * @return dataDetails
     */
    public java.lang.String[] getDataDetails() {
        return dataDetails;
    }


    /**
     * Sets the dataDetails value for this GetRemainingBktBalResponse.
     * 
     * @param dataDetails
     */
    public void setDataDetails(java.lang.String[] dataDetails) {
        this.dataDetails = dataDetails;
    }

    public java.lang.String getDataDetails(int i) {
        return this.dataDetails[i];
    }

    public void setDataDetails(int i, java.lang.String _value) {
        this.dataDetails[i] = _value;
    }


    /**
     * Gets the globalDetails value for this GetRemainingBktBalResponse.
     * 
     * @return globalDetails
     */
    public java.lang.String[] getGlobalDetails() {
        return globalDetails;
    }


    /**
     * Sets the globalDetails value for this GetRemainingBktBalResponse.
     * 
     * @param globalDetails
     */
    public void setGlobalDetails(java.lang.String[] globalDetails) {
        this.globalDetails = globalDetails;
    }

    public java.lang.String getGlobalDetails(int i) {
        return this.globalDetails[i];
    }

    public void setGlobalDetails(int i, java.lang.String _value) {
        this.globalDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRemainingBktBalResponse)) return false;
        GetRemainingBktBalResponse other = (GetRemainingBktBalResponse) obj;
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
              java.util.Arrays.equals(this.voiceDetails, other.getVoiceDetails()))) &&
            ((this.SMSDetails==null && other.getSMSDetails()==null) || 
             (this.SMSDetails!=null &&
              java.util.Arrays.equals(this.SMSDetails, other.getSMSDetails()))) &&
            ((this.dataDetails==null && other.getDataDetails()==null) || 
             (this.dataDetails!=null &&
              java.util.Arrays.equals(this.dataDetails, other.getDataDetails()))) &&
            ((this.globalDetails==null && other.getGlobalDetails()==null) || 
             (this.globalDetails!=null &&
              java.util.Arrays.equals(this.globalDetails, other.getGlobalDetails())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoiceDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoiceDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMSDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMSDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMSDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRemainingBktBalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getRemainingBktBalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "voiceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "SMSDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "dataDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "globalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
