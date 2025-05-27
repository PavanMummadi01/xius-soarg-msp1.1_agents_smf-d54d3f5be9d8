/**
 * GetAssocMsisdnByOfficeV1Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetAssocMsisdnByOfficeV1Request  implements java.io.Serializable {
    private java.math.BigInteger officeCode;

    private int maxRecords;

    private int rowIndex;

    public GetAssocMsisdnByOfficeV1Request() {
    }

    public GetAssocMsisdnByOfficeV1Request(
           java.math.BigInteger officeCode,
           int maxRecords,
           int rowIndex) {
           this.officeCode = officeCode;
           this.maxRecords = maxRecords;
           this.rowIndex = rowIndex;
    }


    /**
     * Gets the officeCode value for this GetAssocMsisdnByOfficeV1Request.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this GetAssocMsisdnByOfficeV1Request.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the maxRecords value for this GetAssocMsisdnByOfficeV1Request.
     * 
     * @return maxRecords
     */
    public int getMaxRecords() {
        return maxRecords;
    }


    /**
     * Sets the maxRecords value for this GetAssocMsisdnByOfficeV1Request.
     * 
     * @param maxRecords
     */
    public void setMaxRecords(int maxRecords) {
        this.maxRecords = maxRecords;
    }


    /**
     * Gets the rowIndex value for this GetAssocMsisdnByOfficeV1Request.
     * 
     * @return rowIndex
     */
    public int getRowIndex() {
        return rowIndex;
    }


    /**
     * Sets the rowIndex value for this GetAssocMsisdnByOfficeV1Request.
     * 
     * @param rowIndex
     */
    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssocMsisdnByOfficeV1Request)) return false;
        GetAssocMsisdnByOfficeV1Request other = (GetAssocMsisdnByOfficeV1Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            this.maxRecords == other.getMaxRecords() &&
            this.rowIndex == other.getRowIndex();
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
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        _hashCode += getMaxRecords();
        _hashCode += getRowIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAssocMsisdnByOfficeV1Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetAssocMsisdnByOfficeV1Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "maxRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "rowIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
