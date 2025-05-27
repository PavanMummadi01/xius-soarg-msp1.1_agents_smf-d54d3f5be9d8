/**
 * ManageCUGTopUpConfigRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class ManageCUGTopUpConfigRequest  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag;

    private java.lang.Integer grpId;

    private java.math.BigInteger parentMSISDN;

    private java.math.BigDecimal transferAmount;

    private java.lang.String dayOfMonth;

    public ManageCUGTopUpConfigRequest() {
    }

    public ManageCUGTopUpConfigRequest(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag,
           java.lang.Integer grpId,
           java.math.BigInteger parentMSISDN,
           java.math.BigDecimal transferAmount,
           java.lang.String dayOfMonth) {
           this.actionFlag = actionFlag;
           this.grpId = grpId;
           this.parentMSISDN = parentMSISDN;
           this.transferAmount = transferAmount;
           this.dayOfMonth = dayOfMonth;
    }


    /**
     * Gets the actionFlag value for this ManageCUGTopUpConfigRequest.
     * 
     * @return actionFlag
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageCUGTopUpConfigRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the grpId value for this ManageCUGTopUpConfigRequest.
     * 
     * @return grpId
     */
    public java.lang.Integer getGrpId() {
        return grpId;
    }


    /**
     * Sets the grpId value for this ManageCUGTopUpConfigRequest.
     * 
     * @param grpId
     */
    public void setGrpId(java.lang.Integer grpId) {
        this.grpId = grpId;
    }


    /**
     * Gets the parentMSISDN value for this ManageCUGTopUpConfigRequest.
     * 
     * @return parentMSISDN
     */
    public java.math.BigInteger getParentMSISDN() {
        return parentMSISDN;
    }


    /**
     * Sets the parentMSISDN value for this ManageCUGTopUpConfigRequest.
     * 
     * @param parentMSISDN
     */
    public void setParentMSISDN(java.math.BigInteger parentMSISDN) {
        this.parentMSISDN = parentMSISDN;
    }


    /**
     * Gets the transferAmount value for this ManageCUGTopUpConfigRequest.
     * 
     * @return transferAmount
     */
    public java.math.BigDecimal getTransferAmount() {
        return transferAmount;
    }


    /**
     * Sets the transferAmount value for this ManageCUGTopUpConfigRequest.
     * 
     * @param transferAmount
     */
    public void setTransferAmount(java.math.BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }


    /**
     * Gets the dayOfMonth value for this ManageCUGTopUpConfigRequest.
     * 
     * @return dayOfMonth
     */
    public java.lang.String getDayOfMonth() {
        return dayOfMonth;
    }


    /**
     * Sets the dayOfMonth value for this ManageCUGTopUpConfigRequest.
     * 
     * @param dayOfMonth
     */
    public void setDayOfMonth(java.lang.String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageCUGTopUpConfigRequest)) return false;
        ManageCUGTopUpConfigRequest other = (ManageCUGTopUpConfigRequest) obj;
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
            ((this.grpId==null && other.getGrpId()==null) || 
             (this.grpId!=null &&
              this.grpId.equals(other.getGrpId()))) &&
            ((this.parentMSISDN==null && other.getParentMSISDN()==null) || 
             (this.parentMSISDN!=null &&
              this.parentMSISDN.equals(other.getParentMSISDN()))) &&
            ((this.transferAmount==null && other.getTransferAmount()==null) || 
             (this.transferAmount!=null &&
              this.transferAmount.equals(other.getTransferAmount()))) &&
            ((this.dayOfMonth==null && other.getDayOfMonth()==null) || 
             (this.dayOfMonth!=null &&
              this.dayOfMonth.equals(other.getDayOfMonth())));
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
        if (getGrpId() != null) {
            _hashCode += getGrpId().hashCode();
        }
        if (getParentMSISDN() != null) {
            _hashCode += getParentMSISDN().hashCode();
        }
        if (getTransferAmount() != null) {
            _hashCode += getTransferAmount().hashCode();
        }
        if (getDayOfMonth() != null) {
            _hashCode += getDayOfMonth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageCUGTopUpConfigRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ManageCUGTopUpConfigRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "grpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "parentMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "transferAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "dayOfMonth"));
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
