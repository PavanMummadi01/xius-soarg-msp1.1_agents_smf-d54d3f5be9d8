/**
 * CorporateLoginRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class CorporateLoginRequest  implements java.io.Serializable {
    private java.lang.String networkName;

    private java.lang.String adminOfficeName;

    public CorporateLoginRequest() {
    }

    public CorporateLoginRequest(
           java.lang.String networkName,
           java.lang.String adminOfficeName) {
           this.networkName = networkName;
           this.adminOfficeName = adminOfficeName;
    }


    /**
     * Gets the networkName value for this CorporateLoginRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this CorporateLoginRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the adminOfficeName value for this CorporateLoginRequest.
     * 
     * @return adminOfficeName
     */
    public java.lang.String getAdminOfficeName() {
        return adminOfficeName;
    }


    /**
     * Sets the adminOfficeName value for this CorporateLoginRequest.
     * 
     * @param adminOfficeName
     */
    public void setAdminOfficeName(java.lang.String adminOfficeName) {
        this.adminOfficeName = adminOfficeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorporateLoginRequest)) return false;
        CorporateLoginRequest other = (CorporateLoginRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.adminOfficeName==null && other.getAdminOfficeName()==null) || 
             (this.adminOfficeName!=null &&
              this.adminOfficeName.equals(other.getAdminOfficeName())));
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
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getAdminOfficeName() != null) {
            _hashCode += getAdminOfficeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorporateLoginRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "CorporateLoginRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminOfficeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "adminOfficeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
