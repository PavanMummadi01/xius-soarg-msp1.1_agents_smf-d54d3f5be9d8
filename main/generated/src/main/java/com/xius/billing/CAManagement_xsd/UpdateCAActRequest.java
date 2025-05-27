/**
 * UpdateCAActRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class UpdateCAActRequest  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.IDType IDType;

    private com.xius.billing.CAManagement_xsd.StatusFlag statusFlag;

    public UpdateCAActRequest() {
    }

    public UpdateCAActRequest(
           com.xius.billing.CAManagement_xsd.IDType IDType,
           com.xius.billing.CAManagement_xsd.StatusFlag statusFlag) {
           this.IDType = IDType;
           this.statusFlag = statusFlag;
    }


    /**
     * Gets the IDType value for this UpdateCAActRequest.
     * 
     * @return IDType
     */
    public com.xius.billing.CAManagement_xsd.IDType getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this UpdateCAActRequest.
     * 
     * @param IDType
     */
    public void setIDType(com.xius.billing.CAManagement_xsd.IDType IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the statusFlag value for this UpdateCAActRequest.
     * 
     * @return statusFlag
     */
    public com.xius.billing.CAManagement_xsd.StatusFlag getStatusFlag() {
        return statusFlag;
    }


    /**
     * Sets the statusFlag value for this UpdateCAActRequest.
     * 
     * @param statusFlag
     */
    public void setStatusFlag(com.xius.billing.CAManagement_xsd.StatusFlag statusFlag) {
        this.statusFlag = statusFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCAActRequest)) return false;
        UpdateCAActRequest other = (UpdateCAActRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.statusFlag==null && other.getStatusFlag()==null) || 
             (this.statusFlag!=null &&
              this.statusFlag.equals(other.getStatusFlag())));
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
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getStatusFlag() != null) {
            _hashCode += getStatusFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCAActRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "UpdateCAActRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "IDType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "StatusFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "StatusFlag"));
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
