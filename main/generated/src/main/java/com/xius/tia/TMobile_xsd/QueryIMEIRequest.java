/**
 * QueryIMEIRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class QueryIMEIRequest  implements java.io.Serializable {
    private java.lang.String partnerTransactionID;

    private java.lang.String MSISDN;

    private java.lang.String IMEI;

    private java.lang.String isCallBackUrlRequired;

    public QueryIMEIRequest() {
    }

    public QueryIMEIRequest(
           java.lang.String partnerTransactionID,
           java.lang.String MSISDN,
           java.lang.String IMEI,
           java.lang.String isCallBackUrlRequired) {
           this.partnerTransactionID = partnerTransactionID;
           this.MSISDN = MSISDN;
           this.IMEI = IMEI;
           this.isCallBackUrlRequired = isCallBackUrlRequired;
    }


    /**
     * Gets the partnerTransactionID value for this QueryIMEIRequest.
     * 
     * @return partnerTransactionID
     */
    public java.lang.String getPartnerTransactionID() {
        return partnerTransactionID;
    }


    /**
     * Sets the partnerTransactionID value for this QueryIMEIRequest.
     * 
     * @param partnerTransactionID
     */
    public void setPartnerTransactionID(java.lang.String partnerTransactionID) {
        this.partnerTransactionID = partnerTransactionID;
    }


    /**
     * Gets the MSISDN value for this QueryIMEIRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this QueryIMEIRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the IMEI value for this QueryIMEIRequest.
     * 
     * @return IMEI
     */
    public java.lang.String getIMEI() {
        return IMEI;
    }


    /**
     * Sets the IMEI value for this QueryIMEIRequest.
     * 
     * @param IMEI
     */
    public void setIMEI(java.lang.String IMEI) {
        this.IMEI = IMEI;
    }


    /**
     * Gets the isCallBackUrlRequired value for this QueryIMEIRequest.
     * 
     * @return isCallBackUrlRequired
     */
    public java.lang.String getIsCallBackUrlRequired() {
        return isCallBackUrlRequired;
    }


    /**
     * Sets the isCallBackUrlRequired value for this QueryIMEIRequest.
     * 
     * @param isCallBackUrlRequired
     */
    public void setIsCallBackUrlRequired(java.lang.String isCallBackUrlRequired) {
        this.isCallBackUrlRequired = isCallBackUrlRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryIMEIRequest)) return false;
        QueryIMEIRequest other = (QueryIMEIRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partnerTransactionID==null && other.getPartnerTransactionID()==null) || 
             (this.partnerTransactionID!=null &&
              this.partnerTransactionID.equals(other.getPartnerTransactionID()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.IMEI==null && other.getIMEI()==null) || 
             (this.IMEI!=null &&
              this.IMEI.equals(other.getIMEI()))) &&
            ((this.isCallBackUrlRequired==null && other.getIsCallBackUrlRequired()==null) || 
             (this.isCallBackUrlRequired!=null &&
              this.isCallBackUrlRequired.equals(other.getIsCallBackUrlRequired())));
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
        if (getPartnerTransactionID() != null) {
            _hashCode += getPartnerTransactionID().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getIsCallBackUrlRequired() != null) {
            _hashCode += getIsCallBackUrlRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryIMEIRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "QueryIMEIRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "partnerTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "IMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCallBackUrlRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "isCallBackUrlRequired"));
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
