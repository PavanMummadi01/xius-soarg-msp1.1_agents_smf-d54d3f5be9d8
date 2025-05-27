/**
 * GetPackageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class GetPackageRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.Long packageId;

    private java.lang.String pkgStatus;

    public GetPackageRequest() {
    }

    public GetPackageRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.Long packageId,
           java.lang.String pkgStatus) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.packageId = packageId;
        this.pkgStatus = pkgStatus;
    }


    /**
     * Gets the packageId value for this GetPackageRequest.
     * 
     * @return packageId
     */
    public java.lang.Long getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this GetPackageRequest.
     * 
     * @param packageId
     */
    public void setPackageId(java.lang.Long packageId) {
        this.packageId = packageId;
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
        _equals = super.equals(obj) && 
            ((this.packageId==null && other.getPackageId()==null) || 
             (this.packageId!=null &&
              this.packageId.equals(other.getPackageId()))) &&
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
        int _hashCode = super.hashCode();
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">GetPackageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "packageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgStatus"));
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
