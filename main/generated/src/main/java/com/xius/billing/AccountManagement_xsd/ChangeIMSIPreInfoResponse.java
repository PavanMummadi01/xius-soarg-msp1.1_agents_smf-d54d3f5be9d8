/**
 * ChangeIMSIPreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChangeIMSIPreInfoResponse  implements java.io.Serializable {
    private java.lang.String currentIMSI;

    private java.lang.String currSerialNo;

    private java.math.BigDecimal currentBalance;

    public ChangeIMSIPreInfoResponse() {
    }

    public ChangeIMSIPreInfoResponse(
           java.lang.String currentIMSI,
           java.lang.String currSerialNo,
           java.math.BigDecimal currentBalance) {
           this.currentIMSI = currentIMSI;
           this.currSerialNo = currSerialNo;
           this.currentBalance = currentBalance;
    }


    /**
     * Gets the currentIMSI value for this ChangeIMSIPreInfoResponse.
     * 
     * @return currentIMSI
     */
    public java.lang.String getCurrentIMSI() {
        return currentIMSI;
    }


    /**
     * Sets the currentIMSI value for this ChangeIMSIPreInfoResponse.
     * 
     * @param currentIMSI
     */
    public void setCurrentIMSI(java.lang.String currentIMSI) {
        this.currentIMSI = currentIMSI;
    }


    /**
     * Gets the currSerialNo value for this ChangeIMSIPreInfoResponse.
     * 
     * @return currSerialNo
     */
    public java.lang.String getCurrSerialNo() {
        return currSerialNo;
    }


    /**
     * Sets the currSerialNo value for this ChangeIMSIPreInfoResponse.
     * 
     * @param currSerialNo
     */
    public void setCurrSerialNo(java.lang.String currSerialNo) {
        this.currSerialNo = currSerialNo;
    }


    /**
     * Gets the currentBalance value for this ChangeIMSIPreInfoResponse.
     * 
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this ChangeIMSIPreInfoResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeIMSIPreInfoResponse)) return false;
        ChangeIMSIPreInfoResponse other = (ChangeIMSIPreInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentIMSI==null && other.getCurrentIMSI()==null) || 
             (this.currentIMSI!=null &&
              this.currentIMSI.equals(other.getCurrentIMSI()))) &&
            ((this.currSerialNo==null && other.getCurrSerialNo()==null) || 
             (this.currSerialNo!=null &&
              this.currSerialNo.equals(other.getCurrSerialNo()))) &&
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance())));
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
        if (getCurrentIMSI() != null) {
            _hashCode += getCurrentIMSI().hashCode();
        }
        if (getCurrSerialNo() != null) {
            _hashCode += getCurrSerialNo().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeIMSIPreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIPreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "currentIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "currSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
