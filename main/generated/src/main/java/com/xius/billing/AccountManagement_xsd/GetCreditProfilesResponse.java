/**
 * GetCreditProfilesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetCreditProfilesResponse  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.CreditProfilesType creditProfiles;

    private com.xius.billing.AccountManagement_xsd.CardProfilesType cardProfiles;

    public GetCreditProfilesResponse() {
    }

    public GetCreditProfilesResponse(
           com.xius.billing.AccountManagement_xsd.CreditProfilesType creditProfiles,
           com.xius.billing.AccountManagement_xsd.CardProfilesType cardProfiles) {
           this.creditProfiles = creditProfiles;
           this.cardProfiles = cardProfiles;
    }


    /**
     * Gets the creditProfiles value for this GetCreditProfilesResponse.
     * 
     * @return creditProfiles
     */
    public com.xius.billing.AccountManagement_xsd.CreditProfilesType getCreditProfiles() {
        return creditProfiles;
    }


    /**
     * Sets the creditProfiles value for this GetCreditProfilesResponse.
     * 
     * @param creditProfiles
     */
    public void setCreditProfiles(com.xius.billing.AccountManagement_xsd.CreditProfilesType creditProfiles) {
        this.creditProfiles = creditProfiles;
    }


    /**
     * Gets the cardProfiles value for this GetCreditProfilesResponse.
     * 
     * @return cardProfiles
     */
    public com.xius.billing.AccountManagement_xsd.CardProfilesType getCardProfiles() {
        return cardProfiles;
    }


    /**
     * Sets the cardProfiles value for this GetCreditProfilesResponse.
     * 
     * @param cardProfiles
     */
    public void setCardProfiles(com.xius.billing.AccountManagement_xsd.CardProfilesType cardProfiles) {
        this.cardProfiles = cardProfiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditProfilesResponse)) return false;
        GetCreditProfilesResponse other = (GetCreditProfilesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditProfiles==null && other.getCreditProfiles()==null) || 
             (this.creditProfiles!=null &&
              this.creditProfiles.equals(other.getCreditProfiles()))) &&
            ((this.cardProfiles==null && other.getCardProfiles()==null) || 
             (this.cardProfiles!=null &&
              this.cardProfiles.equals(other.getCardProfiles())));
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
        if (getCreditProfiles() != null) {
            _hashCode += getCreditProfiles().hashCode();
        }
        if (getCardProfiles() != null) {
            _hashCode += getCardProfiles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditProfilesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetCreditProfilesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditProfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "creditProfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CreditProfilesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardProfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "cardProfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "CardProfilesType"));
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
