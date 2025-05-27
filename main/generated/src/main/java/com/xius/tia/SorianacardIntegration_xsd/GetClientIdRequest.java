/**
 * GetClientIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_xsd;

public class GetClientIdRequest  implements java.io.Serializable {
    private com.xius.tia.SorianacardIntegration_xsd.AccountDetailType account;

    private com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype;

    public GetClientIdRequest() {
    }

    public GetClientIdRequest(
           com.xius.tia.SorianacardIntegration_xsd.AccountDetailType account,
           com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
           this.account = account;
           this.userdefinedtype = userdefinedtype;
    }


    /**
     * Gets the account value for this GetClientIdRequest.
     * 
     * @return account
     */
    public com.xius.tia.SorianacardIntegration_xsd.AccountDetailType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetClientIdRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.tia.SorianacardIntegration_xsd.AccountDetailType account) {
        this.account = account;
    }


    /**
     * Gets the userdefinedtype value for this GetClientIdRequest.
     * 
     * @return userdefinedtype
     */
    public com.xius.tia.SorianacardIntegration_xsd.UserDefinedType getUserdefinedtype() {
        return userdefinedtype;
    }


    /**
     * Sets the userdefinedtype value for this GetClientIdRequest.
     * 
     * @param userdefinedtype
     */
    public void setUserdefinedtype(com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
        this.userdefinedtype = userdefinedtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClientIdRequest)) return false;
        GetClientIdRequest other = (GetClientIdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.userdefinedtype==null && other.getUserdefinedtype()==null) || 
             (this.userdefinedtype!=null &&
              this.userdefinedtype.equals(other.getUserdefinedtype())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getUserdefinedtype() != null) {
            _hashCode += getUserdefinedtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClientIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "GetClientIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "AccountDetailType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "userdefinedtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "UserDefinedType"));
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
