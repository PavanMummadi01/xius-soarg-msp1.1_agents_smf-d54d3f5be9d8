/**
 * ManageUploadMSISDNGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class ManageUploadMSISDNGroupRequest  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag;

    private java.math.BigInteger officeCode;

    private java.lang.String[] MSISDN;

    private java.lang.String groupName;

    public ManageUploadMSISDNGroupRequest() {
    }

    public ManageUploadMSISDNGroupRequest(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag,
           java.math.BigInteger officeCode,
           java.lang.String[] MSISDN,
           java.lang.String groupName) {
           this.actionFlag = actionFlag;
           this.officeCode = officeCode;
           this.MSISDN = MSISDN;
           this.groupName = groupName;
    }


    /**
     * Gets the actionFlag value for this ManageUploadMSISDNGroupRequest.
     * 
     * @return actionFlag
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageUploadMSISDNGroupRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the officeCode value for this ManageUploadMSISDNGroupRequest.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this ManageUploadMSISDNGroupRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the MSISDN value for this ManageUploadMSISDNGroupRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String[] getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ManageUploadMSISDNGroupRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String[] MSISDN) {
        this.MSISDN = MSISDN;
    }

    public java.lang.String getMSISDN(int i) {
        return this.MSISDN[i];
    }

    public void setMSISDN(int i, java.lang.String _value) {
        this.MSISDN[i] = _value;
    }


    /**
     * Gets the groupName value for this ManageUploadMSISDNGroupRequest.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this ManageUploadMSISDNGroupRequest.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageUploadMSISDNGroupRequest)) return false;
        ManageUploadMSISDNGroupRequest other = (ManageUploadMSISDNGroupRequest) obj;
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
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              java.util.Arrays.equals(this.MSISDN, other.getMSISDN()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName())));
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
        if (getMSISDN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSISDN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSISDN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageUploadMSISDNGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ManageUploadMSISDNGroupRequest"));
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
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "MSISDNType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "groupName"));
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
