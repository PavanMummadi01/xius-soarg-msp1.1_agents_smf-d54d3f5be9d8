/**
 * GetPackageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetPackageRequest  implements java.io.Serializable {
    private java.lang.Long pkgId;

    private java.lang.String pkgStatus;

    public GetPackageRequest() {
    }

    public GetPackageRequest(
           java.lang.Long pkgId,
           java.lang.String pkgStatus) {
           this.pkgId = pkgId;
           this.pkgStatus = pkgStatus;
    }


    /**
     * Gets the pkgId value for this GetPackageRequest.
     * 
     * @return pkgId
     */
    public java.lang.Long getPkgId() {
        return pkgId;
    }


    /**
     * Sets the pkgId value for this GetPackageRequest.
     * 
     * @param pkgId
     */
    public void setPkgId(java.lang.Long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * Gets the pkgStatus value for this GetPackageRequest.
     * 
     * @return pkgStatus
     */
    public java.lang.String getPkgStatus() {
        return pkgStatus;
    }


    /**
     * Sets the pkgStatus value for this GetPackageRequest.
     * 
     * @param pkgStatus
     */
    public void setPkgStatus(java.lang.String pkgStatus) {
        this.pkgStatus = pkgStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPackageRequest)) return false;
        GetPackageRequest other = (GetPackageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pkgId==null && other.getPkgId()==null) || 
             (this.pkgId!=null &&
              this.pkgId.equals(other.getPkgId()))) &&
            ((this.pkgStatus==null && other.getPkgStatus()==null) || 
             (this.pkgStatus!=null &&
              this.pkgStatus.equals(other.getPkgStatus())));
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
        if (getPkgId() != null) {
            _hashCode += getPkgId().hashCode();
        }
        if (getPkgStatus() != null) {
            _hashCode += getPkgStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPackageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GetPackageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgStatus"));
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
