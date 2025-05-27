/**
 * ManageProductRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class ManageProductRequest  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag;

    private java.math.BigInteger officeCode;

    private java.lang.String productType;

    public ManageProductRequest() {
    }

    public ManageProductRequest(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag,
           java.math.BigInteger officeCode,
           java.lang.String productType) {
           this.actionFlag = actionFlag;
           this.officeCode = officeCode;
           this.productType = productType;
    }


    /**
     * Gets the actionFlag value for this ManageProductRequest.
     * 
     * @return actionFlag
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageProductRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the officeCode value for this ManageProductRequest.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this ManageProductRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the productType value for this ManageProductRequest.
     * 
     * @return productType
     */
    public java.lang.String getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this ManageProductRequest.
     * 
     * @param productType
     */
    public void setProductType(java.lang.String productType) {
        this.productType = productType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageProductRequest)) return false;
        ManageProductRequest other = (ManageProductRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType())));
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
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageProductRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ManageProductRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
