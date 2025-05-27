/**
 * CARenewalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class CARenewalRequest  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.UserType userType;

    private long grpId;

    private long pkgId;

    private java.lang.String status;

    public CARenewalRequest() {
    }

    public CARenewalRequest(
           com.xius.billing.CAManagement_xsd.UserType userType,
           long grpId,
           long pkgId,
           java.lang.String status) {
           this.userType = userType;
           this.grpId = grpId;
           this.pkgId = pkgId;
           this.status = status;
    }


    /**
     * Gets the userType value for this CARenewalRequest.
     * 
     * @return userType
     */
    public com.xius.billing.CAManagement_xsd.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this CARenewalRequest.
     * 
     * @param userType
     */
    public void setUserType(com.xius.billing.CAManagement_xsd.UserType userType) {
        this.userType = userType;
    }


    /**
     * Gets the grpId value for this CARenewalRequest.
     * 
     * @return grpId
     */
    public long getGrpId() {
        return grpId;
    }


    /**
     * Sets the grpId value for this CARenewalRequest.
     * 
     * @param grpId
     */
    public void setGrpId(long grpId) {
        this.grpId = grpId;
    }


    /**
     * Gets the pkgId value for this CARenewalRequest.
     * 
     * @return pkgId
     */
    public long getPkgId() {
        return pkgId;
    }


    /**
     * Sets the pkgId value for this CARenewalRequest.
     * 
     * @param pkgId
     */
    public void setPkgId(long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * Gets the status value for this CARenewalRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CARenewalRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CARenewalRequest)) return false;
        CARenewalRequest other = (CARenewalRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            this.grpId == other.getGrpId() &&
            this.pkgId == other.getPkgId() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        _hashCode += new Long(getGrpId()).hashCode();
        _hashCode += new Long(getPkgId()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CARenewalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "CARenewalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "UserType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "status"));
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
