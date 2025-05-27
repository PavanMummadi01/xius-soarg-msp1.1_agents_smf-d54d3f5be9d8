/**
 * GetChangeIMSIChargesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class GetChangeIMSIChargesResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String currentIMSI;

    private java.lang.String currentSerialNo;

    private java.math.BigDecimal currentBalance;

    public GetChangeIMSIChargesResponse() {
    }

    public GetChangeIMSIChargesResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String currentIMSI,
           java.lang.String currentSerialNo,
           java.math.BigDecimal currentBalance) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.currentIMSI = currentIMSI;
        this.currentSerialNo = currentSerialNo;
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the currentIMSI value for this GetChangeIMSIChargesResponse.
     * 
     * @return currentIMSI
     */
    public java.lang.String getCurrentIMSI() {
        return currentIMSI;
    }


    /**
     * Sets the currentIMSI value for this GetChangeIMSIChargesResponse.
     * 
     * @param currentIMSI
     */
    public void setCurrentIMSI(java.lang.String currentIMSI) {
        this.currentIMSI = currentIMSI;
    }


    /**
     * Gets the currentSerialNo value for this GetChangeIMSIChargesResponse.
     * 
     * @return currentSerialNo
     */
    public java.lang.String getCurrentSerialNo() {
        return currentSerialNo;
    }


    /**
     * Sets the currentSerialNo value for this GetChangeIMSIChargesResponse.
     * 
     * @param currentSerialNo
     */
    public void setCurrentSerialNo(java.lang.String currentSerialNo) {
        this.currentSerialNo = currentSerialNo;
    }


    /**
     * Gets the currentBalance value for this GetChangeIMSIChargesResponse.
     * 
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this GetChangeIMSIChargesResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChangeIMSIChargesResponse)) return false;
        GetChangeIMSIChargesResponse other = (GetChangeIMSIChargesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currentIMSI==null && other.getCurrentIMSI()==null) || 
             (this.currentIMSI!=null &&
              this.currentIMSI.equals(other.getCurrentIMSI()))) &&
            ((this.currentSerialNo==null && other.getCurrentSerialNo()==null) || 
             (this.currentSerialNo!=null &&
              this.currentSerialNo.equals(other.getCurrentSerialNo()))) &&
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
        int _hashCode = super.hashCode();
        if (getCurrentIMSI() != null) {
            _hashCode += getCurrentIMSI().hashCode();
        }
        if (getCurrentSerialNo() != null) {
            _hashCode += getCurrentSerialNo().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetChangeIMSIChargesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">getChangeIMSIChargesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "currentIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "currentSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "currentBalance"));
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
