/**
 * GetSorianaPointsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.SorianacardIntegration_xsd;

public class GetSorianaPointsResponse  implements java.io.Serializable {
    private com.xius.tia.SorianacardIntegration_xsd.CustomerIDType account;

    private com.xius.tia.SorianacardIntegration_xsd.BalancesheetType balanceSheet;

    private java.lang.String error;

    private com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype;

    public GetSorianaPointsResponse() {
    }

    public GetSorianaPointsResponse(
           com.xius.tia.SorianacardIntegration_xsd.CustomerIDType account,
           com.xius.tia.SorianacardIntegration_xsd.BalancesheetType balanceSheet,
           java.lang.String error,
           com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
           this.account = account;
           this.balanceSheet = balanceSheet;
           this.error = error;
           this.userdefinedtype = userdefinedtype;
    }


    /**
     * Gets the account value for this GetSorianaPointsResponse.
     * 
     * @return account
     */
    public com.xius.tia.SorianacardIntegration_xsd.CustomerIDType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetSorianaPointsResponse.
     * 
     * @param account
     */
    public void setAccount(com.xius.tia.SorianacardIntegration_xsd.CustomerIDType account) {
        this.account = account;
    }


    /**
     * Gets the balanceSheet value for this GetSorianaPointsResponse.
     * 
     * @return balanceSheet
     */
    public com.xius.tia.SorianacardIntegration_xsd.BalancesheetType getBalanceSheet() {
        return balanceSheet;
    }


    /**
     * Sets the balanceSheet value for this GetSorianaPointsResponse.
     * 
     * @param balanceSheet
     */
    public void setBalanceSheet(com.xius.tia.SorianacardIntegration_xsd.BalancesheetType balanceSheet) {
        this.balanceSheet = balanceSheet;
    }


    /**
     * Gets the error value for this GetSorianaPointsResponse.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this GetSorianaPointsResponse.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the userdefinedtype value for this GetSorianaPointsResponse.
     * 
     * @return userdefinedtype
     */
    public com.xius.tia.SorianacardIntegration_xsd.UserDefinedType getUserdefinedtype() {
        return userdefinedtype;
    }


    /**
     * Sets the userdefinedtype value for this GetSorianaPointsResponse.
     * 
     * @param userdefinedtype
     */
    public void setUserdefinedtype(com.xius.tia.SorianacardIntegration_xsd.UserDefinedType userdefinedtype) {
        this.userdefinedtype = userdefinedtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSorianaPointsResponse)) return false;
        GetSorianaPointsResponse other = (GetSorianaPointsResponse) obj;
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
            ((this.balanceSheet==null && other.getBalanceSheet()==null) || 
             (this.balanceSheet!=null &&
              this.balanceSheet.equals(other.getBalanceSheet()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
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
        if (getBalanceSheet() != null) {
            _hashCode += getBalanceSheet().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getUserdefinedtype() != null) {
            _hashCode += getUserdefinedtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSorianaPointsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "GetSorianaPointsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "customerIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceSheet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "BalanceSheet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "BalancesheetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/SorianacardIntegration.xsd", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
