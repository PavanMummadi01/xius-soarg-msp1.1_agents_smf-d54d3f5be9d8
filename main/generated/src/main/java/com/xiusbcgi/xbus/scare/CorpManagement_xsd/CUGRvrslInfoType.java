/**
 * CUGRvrslInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class CUGRvrslInfoType  implements java.io.Serializable {
    private java.lang.String groupName;

    private java.lang.Long parentMSISDN;

    private java.lang.String childMSISDN;

    private java.math.BigDecimal debitAmount;

    private java.math.BigDecimal unDisbursedAmount;

    private java.lang.String topUpAmount;

    private java.lang.Long tranxNumber;

    private java.lang.String tranxDate;

    private java.lang.String status;

    private java.lang.Integer configRetryCnt;

    private java.lang.Integer currentRetryCnt;

    public CUGRvrslInfoType() {
    }

    public CUGRvrslInfoType(
           java.lang.String groupName,
           java.lang.Long parentMSISDN,
           java.lang.String childMSISDN,
           java.math.BigDecimal debitAmount,
           java.math.BigDecimal unDisbursedAmount,
           java.lang.String topUpAmount,
           java.lang.Long tranxNumber,
           java.lang.String tranxDate,
           java.lang.String status,
           java.lang.Integer configRetryCnt,
           java.lang.Integer currentRetryCnt) {
           this.groupName = groupName;
           this.parentMSISDN = parentMSISDN;
           this.childMSISDN = childMSISDN;
           this.debitAmount = debitAmount;
           this.unDisbursedAmount = unDisbursedAmount;
           this.topUpAmount = topUpAmount;
           this.tranxNumber = tranxNumber;
           this.tranxDate = tranxDate;
           this.status = status;
           this.configRetryCnt = configRetryCnt;
           this.currentRetryCnt = currentRetryCnt;
    }


    /**
     * Gets the groupName value for this CUGRvrslInfoType.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this CUGRvrslInfoType.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the parentMSISDN value for this CUGRvrslInfoType.
     * 
     * @return parentMSISDN
     */
    public java.lang.Long getParentMSISDN() {
        return parentMSISDN;
    }


    /**
     * Sets the parentMSISDN value for this CUGRvrslInfoType.
     * 
     * @param parentMSISDN
     */
    public void setParentMSISDN(java.lang.Long parentMSISDN) {
        this.parentMSISDN = parentMSISDN;
    }


    /**
     * Gets the childMSISDN value for this CUGRvrslInfoType.
     * 
     * @return childMSISDN
     */
    public java.lang.String getChildMSISDN() {
        return childMSISDN;
    }


    /**
     * Sets the childMSISDN value for this CUGRvrslInfoType.
     * 
     * @param childMSISDN
     */
    public void setChildMSISDN(java.lang.String childMSISDN) {
        this.childMSISDN = childMSISDN;
    }


    /**
     * Gets the debitAmount value for this CUGRvrslInfoType.
     * 
     * @return debitAmount
     */
    public java.math.BigDecimal getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this CUGRvrslInfoType.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(java.math.BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }


    /**
     * Gets the unDisbursedAmount value for this CUGRvrslInfoType.
     * 
     * @return unDisbursedAmount
     */
    public java.math.BigDecimal getUnDisbursedAmount() {
        return unDisbursedAmount;
    }


    /**
     * Sets the unDisbursedAmount value for this CUGRvrslInfoType.
     * 
     * @param unDisbursedAmount
     */
    public void setUnDisbursedAmount(java.math.BigDecimal unDisbursedAmount) {
        this.unDisbursedAmount = unDisbursedAmount;
    }


    /**
     * Gets the topUpAmount value for this CUGRvrslInfoType.
     * 
     * @return topUpAmount
     */
    public java.lang.String getTopUpAmount() {
        return topUpAmount;
    }


    /**
     * Sets the topUpAmount value for this CUGRvrslInfoType.
     * 
     * @param topUpAmount
     */
    public void setTopUpAmount(java.lang.String topUpAmount) {
        this.topUpAmount = topUpAmount;
    }


    /**
     * Gets the tranxNumber value for this CUGRvrslInfoType.
     * 
     * @return tranxNumber
     */
    public java.lang.Long getTranxNumber() {
        return tranxNumber;
    }


    /**
     * Sets the tranxNumber value for this CUGRvrslInfoType.
     * 
     * @param tranxNumber
     */
    public void setTranxNumber(java.lang.Long tranxNumber) {
        this.tranxNumber = tranxNumber;
    }


    /**
     * Gets the tranxDate value for this CUGRvrslInfoType.
     * 
     * @return tranxDate
     */
    public java.lang.String getTranxDate() {
        return tranxDate;
    }


    /**
     * Sets the tranxDate value for this CUGRvrslInfoType.
     * 
     * @param tranxDate
     */
    public void setTranxDate(java.lang.String tranxDate) {
        this.tranxDate = tranxDate;
    }


    /**
     * Gets the status value for this CUGRvrslInfoType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CUGRvrslInfoType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the configRetryCnt value for this CUGRvrslInfoType.
     * 
     * @return configRetryCnt
     */
    public java.lang.Integer getConfigRetryCnt() {
        return configRetryCnt;
    }


    /**
     * Sets the configRetryCnt value for this CUGRvrslInfoType.
     * 
     * @param configRetryCnt
     */
    public void setConfigRetryCnt(java.lang.Integer configRetryCnt) {
        this.configRetryCnt = configRetryCnt;
    }


    /**
     * Gets the currentRetryCnt value for this CUGRvrslInfoType.
     * 
     * @return currentRetryCnt
     */
    public java.lang.Integer getCurrentRetryCnt() {
        return currentRetryCnt;
    }


    /**
     * Sets the currentRetryCnt value for this CUGRvrslInfoType.
     * 
     * @param currentRetryCnt
     */
    public void setCurrentRetryCnt(java.lang.Integer currentRetryCnt) {
        this.currentRetryCnt = currentRetryCnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUGRvrslInfoType)) return false;
        CUGRvrslInfoType other = (CUGRvrslInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.parentMSISDN==null && other.getParentMSISDN()==null) || 
             (this.parentMSISDN!=null &&
              this.parentMSISDN.equals(other.getParentMSISDN()))) &&
            ((this.childMSISDN==null && other.getChildMSISDN()==null) || 
             (this.childMSISDN!=null &&
              this.childMSISDN.equals(other.getChildMSISDN()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              this.debitAmount.equals(other.getDebitAmount()))) &&
            ((this.unDisbursedAmount==null && other.getUnDisbursedAmount()==null) || 
             (this.unDisbursedAmount!=null &&
              this.unDisbursedAmount.equals(other.getUnDisbursedAmount()))) &&
            ((this.topUpAmount==null && other.getTopUpAmount()==null) || 
             (this.topUpAmount!=null &&
              this.topUpAmount.equals(other.getTopUpAmount()))) &&
            ((this.tranxNumber==null && other.getTranxNumber()==null) || 
             (this.tranxNumber!=null &&
              this.tranxNumber.equals(other.getTranxNumber()))) &&
            ((this.tranxDate==null && other.getTranxDate()==null) || 
             (this.tranxDate!=null &&
              this.tranxDate.equals(other.getTranxDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.configRetryCnt==null && other.getConfigRetryCnt()==null) || 
             (this.configRetryCnt!=null &&
              this.configRetryCnt.equals(other.getConfigRetryCnt()))) &&
            ((this.currentRetryCnt==null && other.getCurrentRetryCnt()==null) || 
             (this.currentRetryCnt!=null &&
              this.currentRetryCnt.equals(other.getCurrentRetryCnt())));
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
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getParentMSISDN() != null) {
            _hashCode += getParentMSISDN().hashCode();
        }
        if (getChildMSISDN() != null) {
            _hashCode += getChildMSISDN().hashCode();
        }
        if (getDebitAmount() != null) {
            _hashCode += getDebitAmount().hashCode();
        }
        if (getUnDisbursedAmount() != null) {
            _hashCode += getUnDisbursedAmount().hashCode();
        }
        if (getTopUpAmount() != null) {
            _hashCode += getTopUpAmount().hashCode();
        }
        if (getTranxNumber() != null) {
            _hashCode += getTranxNumber().hashCode();
        }
        if (getTranxDate() != null) {
            _hashCode += getTranxDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getConfigRetryCnt() != null) {
            _hashCode += getConfigRetryCnt().hashCode();
        }
        if (getCurrentRetryCnt() != null) {
            _hashCode += getCurrentRetryCnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUGRvrslInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "CUGRvrslInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "parentMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "childMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unDisbursedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "unDisbursedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "topUpAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "tranxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "tranxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configRetryCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "configRetryCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentRetryCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "currentRetryCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
