/**
 * SimDealerValidationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SimDealerValidationResponse  implements java.io.Serializable {
    private java.lang.Long officeCode;

    private java.lang.String status;

    public SimDealerValidationResponse() {
    }

    public SimDealerValidationResponse(
           java.lang.Long officeCode,
           java.lang.String status) {
           this.officeCode = officeCode;
           this.status = status;
    }


    /**
     * Gets the officeCode value for this SimDealerValidationResponse.
     * 
     * @return officeCode
     */
    public java.lang.Long getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this SimDealerValidationResponse.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.Long officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the status value for this SimDealerValidationResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SimDealerValidationResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimDealerValidationResponse)) return false;
        SimDealerValidationResponse other = (SimDealerValidationResponse) obj;
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
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimDealerValidationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimDealerValidationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "status"));
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
