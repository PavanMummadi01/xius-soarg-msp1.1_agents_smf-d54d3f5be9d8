/**
 * GetTTPCRFintimateDtlsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetTTPCRFintimateDtlsRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String publicityId;

    private java.lang.String atpId;

    private java.lang.String subUnsubFlag;

    public GetTTPCRFintimateDtlsRequest() {
    }

    public GetTTPCRFintimateDtlsRequest(
           java.lang.String msisdn,
           java.lang.String publicityId,
           java.lang.String atpId,
           java.lang.String subUnsubFlag) {
           this.msisdn = msisdn;
           this.publicityId = publicityId;
           this.atpId = atpId;
           this.subUnsubFlag = subUnsubFlag;
    }


    /**
     * Gets the msisdn value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the publicityId value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the atpId value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @return atpId
     */
    public java.lang.String getAtpId() {
        return atpId;
    }


    /**
     * Sets the atpId value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @param atpId
     */
    public void setAtpId(java.lang.String atpId) {
        this.atpId = atpId;
    }


    /**
     * Gets the subUnsubFlag value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @return subUnsubFlag
     */
    public java.lang.String getSubUnsubFlag() {
        return subUnsubFlag;
    }


    /**
     * Sets the subUnsubFlag value for this GetTTPCRFintimateDtlsRequest.
     * 
     * @param subUnsubFlag
     */
    public void setSubUnsubFlag(java.lang.String subUnsubFlag) {
        this.subUnsubFlag = subUnsubFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTTPCRFintimateDtlsRequest)) return false;
        GetTTPCRFintimateDtlsRequest other = (GetTTPCRFintimateDtlsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.atpId==null && other.getAtpId()==null) || 
             (this.atpId!=null &&
              this.atpId.equals(other.getAtpId()))) &&
            ((this.subUnsubFlag==null && other.getSubUnsubFlag()==null) || 
             (this.subUnsubFlag!=null &&
              this.subUnsubFlag.equals(other.getSubUnsubFlag())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getAtpId() != null) {
            _hashCode += getAtpId().hashCode();
        }
        if (getSubUnsubFlag() != null) {
            _hashCode += getSubUnsubFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTTPCRFintimateDtlsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTTPCRFintimateDtlsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "atpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subUnsubFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subUnsubFlag"));
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
