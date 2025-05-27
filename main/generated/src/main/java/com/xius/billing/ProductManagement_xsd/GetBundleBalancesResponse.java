/**
 * GetBundleBalancesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class GetBundleBalancesResponse  implements java.io.Serializable {
    private com.xius.billing.ProductManagement_xsd.Types[] voice;

    private com.xius.billing.ProductManagement_xsd.Types[] SMS;

    private com.xius.billing.ProductManagement_xsd.Types[] DATA;

    private com.xius.billing.ProductManagement_xsd.Types[] global;

    public GetBundleBalancesResponse() {
    }

    public GetBundleBalancesResponse(
           com.xius.billing.ProductManagement_xsd.Types[] voice,
           com.xius.billing.ProductManagement_xsd.Types[] SMS,
           com.xius.billing.ProductManagement_xsd.Types[] DATA,
           com.xius.billing.ProductManagement_xsd.Types[] global) {
           this.voice = voice;
           this.SMS = SMS;
           this.DATA = DATA;
           this.global = global;
    }


    /**
     * Gets the voice value for this GetBundleBalancesResponse.
     * 
     * @return voice
     */
    public com.xius.billing.ProductManagement_xsd.Types[] getVoice() {
        return voice;
    }


    /**
     * Sets the voice value for this GetBundleBalancesResponse.
     * 
     * @param voice
     */
    public void setVoice(com.xius.billing.ProductManagement_xsd.Types[] voice) {
        this.voice = voice;
    }

    public com.xius.billing.ProductManagement_xsd.Types getVoice(int i) {
        return this.voice[i];
    }

    public void setVoice(int i, com.xius.billing.ProductManagement_xsd.Types _value) {
        this.voice[i] = _value;
    }


    /**
     * Gets the SMS value for this GetBundleBalancesResponse.
     * 
     * @return SMS
     */
    public com.xius.billing.ProductManagement_xsd.Types[] getSMS() {
        return SMS;
    }


    /**
     * Sets the SMS value for this GetBundleBalancesResponse.
     * 
     * @param SMS
     */
    public void setSMS(com.xius.billing.ProductManagement_xsd.Types[] SMS) {
        this.SMS = SMS;
    }

    public com.xius.billing.ProductManagement_xsd.Types getSMS(int i) {
        return this.SMS[i];
    }

    public void setSMS(int i, com.xius.billing.ProductManagement_xsd.Types _value) {
        this.SMS[i] = _value;
    }


    /**
     * Gets the DATA value for this GetBundleBalancesResponse.
     * 
     * @return DATA
     */
    public com.xius.billing.ProductManagement_xsd.Types[] getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this GetBundleBalancesResponse.
     * 
     * @param DATA
     */
    public void setDATA(com.xius.billing.ProductManagement_xsd.Types[] DATA) {
        this.DATA = DATA;
    }

    public com.xius.billing.ProductManagement_xsd.Types getDATA(int i) {
        return this.DATA[i];
    }

    public void setDATA(int i, com.xius.billing.ProductManagement_xsd.Types _value) {
        this.DATA[i] = _value;
    }


    /**
     * Gets the global value for this GetBundleBalancesResponse.
     * 
     * @return global
     */
    public com.xius.billing.ProductManagement_xsd.Types[] getGlobal() {
        return global;
    }


    /**
     * Sets the global value for this GetBundleBalancesResponse.
     * 
     * @param global
     */
    public void setGlobal(com.xius.billing.ProductManagement_xsd.Types[] global) {
        this.global = global;
    }

    public com.xius.billing.ProductManagement_xsd.Types getGlobal(int i) {
        return this.global[i];
    }

    public void setGlobal(int i, com.xius.billing.ProductManagement_xsd.Types _value) {
        this.global[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBundleBalancesResponse)) return false;
        GetBundleBalancesResponse other = (GetBundleBalancesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voice==null && other.getVoice()==null) || 
             (this.voice!=null &&
              java.util.Arrays.equals(this.voice, other.getVoice()))) &&
            ((this.SMS==null && other.getSMS()==null) || 
             (this.SMS!=null &&
              java.util.Arrays.equals(this.SMS, other.getSMS()))) &&
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              java.util.Arrays.equals(this.DATA, other.getDATA()))) &&
            ((this.global==null && other.getGlobal()==null) || 
             (this.global!=null &&
              java.util.Arrays.equals(this.global, other.getGlobal())));
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
        if (getVoice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDATA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDATA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDATA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobal(), i);
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
        new org.apache.axis.description.TypeDesc(GetBundleBalancesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getBundleBalancesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Voice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Types"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "SMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Types"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Types"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Global"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "Types"));
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
