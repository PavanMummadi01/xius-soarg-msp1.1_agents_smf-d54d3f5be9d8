/**
 * ChangeLanguagePreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ChangeLanguagePreInfoResponse  implements java.io.Serializable {
    private java.lang.String currentLanguage;

    private java.lang.String[] availableLanguagesList;

    public ChangeLanguagePreInfoResponse() {
    }

    public ChangeLanguagePreInfoResponse(
           java.lang.String currentLanguage,
           java.lang.String[] availableLanguagesList) {
           this.currentLanguage = currentLanguage;
           this.availableLanguagesList = availableLanguagesList;
    }


    /**
     * Gets the currentLanguage value for this ChangeLanguagePreInfoResponse.
     * 
     * @return currentLanguage
     */
    public java.lang.String getCurrentLanguage() {
        return currentLanguage;
    }


    /**
     * Sets the currentLanguage value for this ChangeLanguagePreInfoResponse.
     * 
     * @param currentLanguage
     */
    public void setCurrentLanguage(java.lang.String currentLanguage) {
        this.currentLanguage = currentLanguage;
    }


    /**
     * Gets the availableLanguagesList value for this ChangeLanguagePreInfoResponse.
     * 
     * @return availableLanguagesList
     */
    public java.lang.String[] getAvailableLanguagesList() {
        return availableLanguagesList;
    }


    /**
     * Sets the availableLanguagesList value for this ChangeLanguagePreInfoResponse.
     * 
     * @param availableLanguagesList
     */
    public void setAvailableLanguagesList(java.lang.String[] availableLanguagesList) {
        this.availableLanguagesList = availableLanguagesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeLanguagePreInfoResponse)) return false;
        ChangeLanguagePreInfoResponse other = (ChangeLanguagePreInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentLanguage==null && other.getCurrentLanguage()==null) || 
             (this.currentLanguage!=null &&
              this.currentLanguage.equals(other.getCurrentLanguage()))) &&
            ((this.availableLanguagesList==null && other.getAvailableLanguagesList()==null) || 
             (this.availableLanguagesList!=null &&
              java.util.Arrays.equals(this.availableLanguagesList, other.getAvailableLanguagesList())));
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
        if (getCurrentLanguage() != null) {
            _hashCode += getCurrentLanguage().hashCode();
        }
        if (getAvailableLanguagesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableLanguagesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableLanguagesList(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeLanguagePreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguagePreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "currentLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableLanguagesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availableLanguagesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LanguageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availableLanguages"));
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
