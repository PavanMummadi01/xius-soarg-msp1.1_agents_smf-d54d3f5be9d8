/**
 * ManageOfficeCodeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.corpcustomerservice;

public class ManageOfficeCodeRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.math.BigInteger officeCode;

    private java.lang.String[] sim;

    public ManageOfficeCodeRequest() {
    }

    public ManageOfficeCodeRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.math.BigInteger officeCode,
           java.lang.String[] sim) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.officeCode = officeCode;
        this.sim = sim;
    }


    /**
     * Gets the officeCode value for this ManageOfficeCodeRequest.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this ManageOfficeCodeRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the sim value for this ManageOfficeCodeRequest.
     * 
     * @return sim
     */
    public java.lang.String[] getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this ManageOfficeCodeRequest.
     * 
     * @param sim
     */
    public void setSim(java.lang.String[] sim) {
        this.sim = sim;
    }

    public java.lang.String getSim(int i) {
        return this.sim[i];
    }

    public void setSim(int i, java.lang.String _value) {
        this.sim[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageOfficeCodeRequest)) return false;
        ManageOfficeCodeRequest other = (ManageOfficeCodeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              java.util.Arrays.equals(this.sim, other.getSim())));
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
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getSim() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSim());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSim(), i);
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
        new org.apache.axis.description.TypeDesc(ManageOfficeCodeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", ">ManageOfficeCodeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/corpcustomerservice", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SimType"));
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
