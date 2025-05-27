/**
 * GetAssociatedMSISDNsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class GetAssociatedMSISDNsRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String idNo;

    private java.lang.String sim;

    private java.math.BigInteger corpOfficeCode;

    public GetAssociatedMSISDNsRequest() {
    }

    public GetAssociatedMSISDNsRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String idNo,
           java.lang.String sim,
           java.math.BigInteger corpOfficeCode) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.idNo = idNo;
        this.sim = sim;
        this.corpOfficeCode = corpOfficeCode;
    }


    /**
     * Gets the idNo value for this GetAssociatedMSISDNsRequest.
     * 
     * @return idNo
     */
    public java.lang.String getIdNo() {
        return idNo;
    }


    /**
     * Sets the idNo value for this GetAssociatedMSISDNsRequest.
     * 
     * @param idNo
     */
    public void setIdNo(java.lang.String idNo) {
        this.idNo = idNo;
    }


    /**
     * Gets the sim value for this GetAssociatedMSISDNsRequest.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this GetAssociatedMSISDNsRequest.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the corpOfficeCode value for this GetAssociatedMSISDNsRequest.
     * 
     * @return corpOfficeCode
     */
    public java.math.BigInteger getCorpOfficeCode() {
        return corpOfficeCode;
    }


    /**
     * Sets the corpOfficeCode value for this GetAssociatedMSISDNsRequest.
     * 
     * @param corpOfficeCode
     */
    public void setCorpOfficeCode(java.math.BigInteger corpOfficeCode) {
        this.corpOfficeCode = corpOfficeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssociatedMSISDNsRequest)) return false;
        GetAssociatedMSISDNsRequest other = (GetAssociatedMSISDNsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.idNo==null && other.getIdNo()==null) || 
             (this.idNo!=null &&
              this.idNo.equals(other.getIdNo()))) &&
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.corpOfficeCode==null && other.getCorpOfficeCode()==null) || 
             (this.corpOfficeCode!=null &&
              this.corpOfficeCode.equals(other.getCorpOfficeCode())));
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
        if (getIdNo() != null) {
            _hashCode += getIdNo().hashCode();
        }
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getCorpOfficeCode() != null) {
            _hashCode += getCorpOfficeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAssociatedMSISDNsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">getAssociatedMSISDNsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "idNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corpOfficeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "corpOfficeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
