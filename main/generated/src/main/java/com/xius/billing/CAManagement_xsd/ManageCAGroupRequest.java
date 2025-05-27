/**
 * ManageCAGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ManageCAGroupRequest  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.UserType userType;

    private com.xius.billing.CAManagement_xsd.OptionFlagType actionFlag;

    private com.xius.billing.CAManagement_xsd.CAGroupType caGroup;

    public ManageCAGroupRequest() {
    }

    public ManageCAGroupRequest(
           com.xius.billing.CAManagement_xsd.UserType userType,
           com.xius.billing.CAManagement_xsd.OptionFlagType actionFlag,
           com.xius.billing.CAManagement_xsd.CAGroupType caGroup) {
           this.userType = userType;
           this.actionFlag = actionFlag;
           this.caGroup = caGroup;
    }


    /**
     * Gets the userType value for this ManageCAGroupRequest.
     * 
     * @return userType
     */
    public com.xius.billing.CAManagement_xsd.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this ManageCAGroupRequest.
     * 
     * @param userType
     */
    public void setUserType(com.xius.billing.CAManagement_xsd.UserType userType) {
        this.userType = userType;
    }


    /**
     * Gets the actionFlag value for this ManageCAGroupRequest.
     * 
     * @return actionFlag
     */
    public com.xius.billing.CAManagement_xsd.OptionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageCAGroupRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xius.billing.CAManagement_xsd.OptionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the caGroup value for this ManageCAGroupRequest.
     * 
     * @return caGroup
     */
    public com.xius.billing.CAManagement_xsd.CAGroupType getCaGroup() {
        return caGroup;
    }


    /**
     * Sets the caGroup value for this ManageCAGroupRequest.
     * 
     * @param caGroup
     */
    public void setCaGroup(com.xius.billing.CAManagement_xsd.CAGroupType caGroup) {
        this.caGroup = caGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageCAGroupRequest)) return false;
        ManageCAGroupRequest other = (ManageCAGroupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            ((this.caGroup==null && other.getCaGroup()==null) || 
             (this.caGroup!=null &&
              this.caGroup.equals(other.getCaGroup())));
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
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        if (getCaGroup() != null) {
            _hashCode += getCaGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageCAGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ManageCAGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "UserType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "OptionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "CAGroupType"));
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
