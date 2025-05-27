/**
 * ManageGroupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class ManageGroupRequest  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag;

    private java.lang.String groupName;

    private java.lang.String groupDiscription;

    private long maxSize;

    private java.math.BigInteger officeCode;

    private java.math.BigInteger maxFreeLines;

    private java.math.BigDecimal chargePerLine;

    private java.math.BigDecimal groupCharge;

    public ManageGroupRequest() {
    }

    public ManageGroupRequest(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag,
           java.lang.String groupName,
           java.lang.String groupDiscription,
           long maxSize,
           java.math.BigInteger officeCode,
           java.math.BigInteger maxFreeLines,
           java.math.BigDecimal chargePerLine,
           java.math.BigDecimal groupCharge) {
           this.actionFlag = actionFlag;
           this.groupName = groupName;
           this.groupDiscription = groupDiscription;
           this.maxSize = maxSize;
           this.officeCode = officeCode;
           this.maxFreeLines = maxFreeLines;
           this.chargePerLine = chargePerLine;
           this.groupCharge = groupCharge;
    }


    /**
     * Gets the actionFlag value for this ManageGroupRequest.
     * 
     * @return actionFlag
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageGroupRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the groupName value for this ManageGroupRequest.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this ManageGroupRequest.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupDiscription value for this ManageGroupRequest.
     * 
     * @return groupDiscription
     */
    public java.lang.String getGroupDiscription() {
        return groupDiscription;
    }


    /**
     * Sets the groupDiscription value for this ManageGroupRequest.
     * 
     * @param groupDiscription
     */
    public void setGroupDiscription(java.lang.String groupDiscription) {
        this.groupDiscription = groupDiscription;
    }


    /**
     * Gets the maxSize value for this ManageGroupRequest.
     * 
     * @return maxSize
     */
    public long getMaxSize() {
        return maxSize;
    }


    /**
     * Sets the maxSize value for this ManageGroupRequest.
     * 
     * @param maxSize
     */
    public void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
    }


    /**
     * Gets the officeCode value for this ManageGroupRequest.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this ManageGroupRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the maxFreeLines value for this ManageGroupRequest.
     * 
     * @return maxFreeLines
     */
    public java.math.BigInteger getMaxFreeLines() {
        return maxFreeLines;
    }


    /**
     * Sets the maxFreeLines value for this ManageGroupRequest.
     * 
     * @param maxFreeLines
     */
    public void setMaxFreeLines(java.math.BigInteger maxFreeLines) {
        this.maxFreeLines = maxFreeLines;
    }


    /**
     * Gets the chargePerLine value for this ManageGroupRequest.
     * 
     * @return chargePerLine
     */
    public java.math.BigDecimal getChargePerLine() {
        return chargePerLine;
    }


    /**
     * Sets the chargePerLine value for this ManageGroupRequest.
     * 
     * @param chargePerLine
     */
    public void setChargePerLine(java.math.BigDecimal chargePerLine) {
        this.chargePerLine = chargePerLine;
    }


    /**
     * Gets the groupCharge value for this ManageGroupRequest.
     * 
     * @return groupCharge
     */
    public java.math.BigDecimal getGroupCharge() {
        return groupCharge;
    }


    /**
     * Sets the groupCharge value for this ManageGroupRequest.
     * 
     * @param groupCharge
     */
    public void setGroupCharge(java.math.BigDecimal groupCharge) {
        this.groupCharge = groupCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageGroupRequest)) return false;
        ManageGroupRequest other = (ManageGroupRequest) obj;
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
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupDiscription==null && other.getGroupDiscription()==null) || 
             (this.groupDiscription!=null &&
              this.groupDiscription.equals(other.getGroupDiscription()))) &&
            this.maxSize == other.getMaxSize() &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.maxFreeLines==null && other.getMaxFreeLines()==null) || 
             (this.maxFreeLines!=null &&
              this.maxFreeLines.equals(other.getMaxFreeLines()))) &&
            ((this.chargePerLine==null && other.getChargePerLine()==null) || 
             (this.chargePerLine!=null &&
              this.chargePerLine.equals(other.getChargePerLine()))) &&
            ((this.groupCharge==null && other.getGroupCharge()==null) || 
             (this.groupCharge!=null &&
              this.groupCharge.equals(other.getGroupCharge())));
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
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupDiscription() != null) {
            _hashCode += getGroupDiscription().hashCode();
        }
        _hashCode += new Long(getMaxSize()).hashCode();
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getMaxFreeLines() != null) {
            _hashCode += getMaxFreeLines().hashCode();
        }
        if (getChargePerLine() != null) {
            _hashCode += getChargePerLine().hashCode();
        }
        if (getGroupCharge() != null) {
            _hashCode += getGroupCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageGroupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ManageGroupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupDiscription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "groupDiscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "maxSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFreeLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "maxFreeLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargePerLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "chargePerLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "groupCharge"));
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
