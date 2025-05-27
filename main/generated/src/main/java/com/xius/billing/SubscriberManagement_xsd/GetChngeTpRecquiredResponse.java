/**
 * GetChngeTpRecquiredResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetChngeTpRecquiredResponse  implements java.io.Serializable {
    private java.lang.String changeFlag;

    private java.lang.String tpId;

    public GetChngeTpRecquiredResponse() {
    }

    public GetChngeTpRecquiredResponse(
           java.lang.String changeFlag,
           java.lang.String tpId) {
           this.changeFlag = changeFlag;
           this.tpId = tpId;
    }


    /**
     * Gets the changeFlag value for this GetChngeTpRecquiredResponse.
     * 
     * @return changeFlag
     */
    public java.lang.String getChangeFlag() {
        return changeFlag;
    }


    /**
     * Sets the changeFlag value for this GetChngeTpRecquiredResponse.
     * 
     * @param changeFlag
     */
    public void setChangeFlag(java.lang.String changeFlag) {
        this.changeFlag = changeFlag;
    }


    /**
     * Gets the tpId value for this GetChngeTpRecquiredResponse.
     * 
     * @return tpId
     */
    public java.lang.String getTpId() {
        return tpId;
    }


    /**
     * Sets the tpId value for this GetChngeTpRecquiredResponse.
     * 
     * @param tpId
     */
    public void setTpId(java.lang.String tpId) {
        this.tpId = tpId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChngeTpRecquiredResponse)) return false;
        GetChngeTpRecquiredResponse other = (GetChngeTpRecquiredResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeFlag==null && other.getChangeFlag()==null) || 
             (this.changeFlag!=null &&
              this.changeFlag.equals(other.getChangeFlag()))) &&
            ((this.tpId==null && other.getTpId()==null) || 
             (this.tpId!=null &&
              this.tpId.equals(other.getTpId())));
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
        if (getChangeFlag() != null) {
            _hashCode += getChangeFlag().hashCode();
        }
        if (getTpId() != null) {
            _hashCode += getTpId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetChngeTpRecquiredResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetChngeTpRecquiredResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tpId"));
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
