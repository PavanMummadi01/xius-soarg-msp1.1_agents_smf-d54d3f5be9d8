/**
 * SimSwapCrdtRptUpdtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SimSwapCrdtRptUpdtRequest  implements java.io.Serializable {
    private java.lang.Long oldAccountId;

    private java.lang.Long oldMSISDN;

    private java.lang.String newSIM;

    private java.lang.String accountBal;

    private java.lang.String expiryDate;

    private java.lang.String validityDate;

    private java.lang.String gracePeriodDate;

    private java.lang.String status;

    private java.lang.String remarks;

    public SimSwapCrdtRptUpdtRequest() {
    }

    public SimSwapCrdtRptUpdtRequest(
           java.lang.Long oldAccountId,
           java.lang.Long oldMSISDN,
           java.lang.String newSIM,
           java.lang.String accountBal,
           java.lang.String expiryDate,
           java.lang.String validityDate,
           java.lang.String gracePeriodDate,
           java.lang.String status,
           java.lang.String remarks) {
           this.oldAccountId = oldAccountId;
           this.oldMSISDN = oldMSISDN;
           this.newSIM = newSIM;
           this.accountBal = accountBal;
           this.expiryDate = expiryDate;
           this.validityDate = validityDate;
           this.gracePeriodDate = gracePeriodDate;
           this.status = status;
           this.remarks = remarks;
    }


    /**
     * Gets the oldAccountId value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return oldAccountId
     */
    public java.lang.Long getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(java.lang.Long oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the oldMSISDN value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.Long getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.Long oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newSIM value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return newSIM
     */
    public java.lang.String getNewSIM() {
        return newSIM;
    }


    /**
     * Sets the newSIM value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param newSIM
     */
    public void setNewSIM(java.lang.String newSIM) {
        this.newSIM = newSIM;
    }


    /**
     * Gets the accountBal value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return accountBal
     */
    public java.lang.String getAccountBal() {
        return accountBal;
    }


    /**
     * Sets the accountBal value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param accountBal
     */
    public void setAccountBal(java.lang.String accountBal) {
        this.accountBal = accountBal;
    }


    /**
     * Gets the expiryDate value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the validityDate value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriodDate value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return gracePeriodDate
     */
    public java.lang.String getGracePeriodDate() {
        return gracePeriodDate;
    }


    /**
     * Sets the gracePeriodDate value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param gracePeriodDate
     */
    public void setGracePeriodDate(java.lang.String gracePeriodDate) {
        this.gracePeriodDate = gracePeriodDate;
    }


    /**
     * Gets the status value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the remarks value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this SimSwapCrdtRptUpdtRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimSwapCrdtRptUpdtRequest)) return false;
        SimSwapCrdtRptUpdtRequest other = (SimSwapCrdtRptUpdtRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newSIM==null && other.getNewSIM()==null) || 
             (this.newSIM!=null &&
              this.newSIM.equals(other.getNewSIM()))) &&
            ((this.accountBal==null && other.getAccountBal()==null) || 
             (this.accountBal!=null &&
              this.accountBal.equals(other.getAccountBal()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.gracePeriodDate==null && other.getGracePeriodDate()==null) || 
             (this.gracePeriodDate!=null &&
              this.gracePeriodDate.equals(other.getGracePeriodDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks())));
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
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewSIM() != null) {
            _hashCode += getNewSIM().hashCode();
        }
        if (getAccountBal() != null) {
            _hashCode += getAccountBal().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getGracePeriodDate() != null) {
            _hashCode += getGracePeriodDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimSwapCrdtRptUpdtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SimSwapCrdtRptUpdtRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriodDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "gracePeriodDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "remarks"));
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
