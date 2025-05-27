/**
 * ResultDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.ccard.CreditCardManagment_xsd;

public class ResultDataType  implements java.io.Serializable {
    private java.lang.Integer respStatus;

    private java.lang.String respcode;

    private java.lang.String respdescription;

    public ResultDataType() {
    }

    public ResultDataType(
           java.lang.Integer respStatus,
           java.lang.String respcode,
           java.lang.String respdescription) {
           this.respStatus = respStatus;
           this.respcode = respcode;
           this.respdescription = respdescription;
    }


    /**
     * Gets the respStatus value for this ResultDataType.
     * 
     * @return respStatus
     */
    public java.lang.Integer getRespStatus() {
        return respStatus;
    }


    /**
     * Sets the respStatus value for this ResultDataType.
     * 
     * @param respStatus
     */
    public void setRespStatus(java.lang.Integer respStatus) {
        this.respStatus = respStatus;
    }


    /**
     * Gets the respcode value for this ResultDataType.
     * 
     * @return respcode
     */
    public java.lang.String getRespcode() {
        return respcode;
    }


    /**
     * Sets the respcode value for this ResultDataType.
     * 
     * @param respcode
     */
    public void setRespcode(java.lang.String respcode) {
        this.respcode = respcode;
    }


    /**
     * Gets the respdescription value for this ResultDataType.
     * 
     * @return respdescription
     */
    public java.lang.String getRespdescription() {
        return respdescription;
    }


    /**
     * Sets the respdescription value for this ResultDataType.
     * 
     * @param respdescription
     */
    public void setRespdescription(java.lang.String respdescription) {
        this.respdescription = respdescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultDataType)) return false;
        ResultDataType other = (ResultDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respStatus==null && other.getRespStatus()==null) || 
             (this.respStatus!=null &&
              this.respStatus.equals(other.getRespStatus()))) &&
            ((this.respcode==null && other.getRespcode()==null) || 
             (this.respcode!=null &&
              this.respcode.equals(other.getRespcode()))) &&
            ((this.respdescription==null && other.getRespdescription()==null) || 
             (this.respdescription!=null &&
              this.respdescription.equals(other.getRespdescription())));
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
        if (getRespStatus() != null) {
            _hashCode += getRespStatus().hashCode();
        }
        if (getRespcode() != null) {
            _hashCode += getRespcode().hashCode();
        }
        if (getRespdescription() != null) {
            _hashCode += getRespdescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "ResultDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "respStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "respcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respdescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ccard.tia.xius.com/CreditCardManagment.xsd", "respdescription"));
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
