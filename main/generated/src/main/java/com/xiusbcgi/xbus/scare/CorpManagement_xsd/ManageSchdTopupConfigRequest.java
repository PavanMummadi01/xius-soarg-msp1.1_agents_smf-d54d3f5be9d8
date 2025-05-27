/**
 * ManageSchdTopupConfigRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class ManageSchdTopupConfigRequest  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag;

    private java.lang.String usageType;

    private java.lang.String baseType;

    public ManageSchdTopupConfigRequest() {
    }

    public ManageSchdTopupConfigRequest(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag,
           java.lang.String usageType,
           java.lang.String baseType) {
           this.actionFlag = actionFlag;
           this.usageType = usageType;
           this.baseType = baseType;
    }


    /**
     * Gets the actionFlag value for this ManageSchdTopupConfigRequest.
     * 
     * @return actionFlag
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageSchdTopupConfigRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the usageType value for this ManageSchdTopupConfigRequest.
     * 
     * @return usageType
     */
    public java.lang.String getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this ManageSchdTopupConfigRequest.
     * 
     * @param usageType
     */
    public void setUsageType(java.lang.String usageType) {
        this.usageType = usageType;
    }


    /**
     * Gets the baseType value for this ManageSchdTopupConfigRequest.
     * 
     * @return baseType
     */
    public java.lang.String getBaseType() {
        return baseType;
    }


    /**
     * Sets the baseType value for this ManageSchdTopupConfigRequest.
     * 
     * @param baseType
     */
    public void setBaseType(java.lang.String baseType) {
        this.baseType = baseType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageSchdTopupConfigRequest)) return false;
        ManageSchdTopupConfigRequest other = (ManageSchdTopupConfigRequest) obj;
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
            ((this.usageType==null && other.getUsageType()==null) || 
             (this.usageType!=null &&
              this.usageType.equals(other.getUsageType()))) &&
            ((this.baseType==null && other.getBaseType()==null) || 
             (this.baseType!=null &&
              this.baseType.equals(other.getBaseType())));
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
        if (getUsageType() != null) {
            _hashCode += getUsageType().hashCode();
        }
        if (getBaseType() != null) {
            _hashCode += getBaseType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageSchdTopupConfigRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ManageSchdTopupConfigRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "usageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "baseType"));
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
