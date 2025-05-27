/**
 * SIMSwapResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SIMSwapResponse  implements java.io.Serializable {
    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.String oldAccountId;

    private java.lang.String oldMsisdn;

    private java.lang.String newSIM;

    private java.lang.String accountBal;

    private java.lang.String expiryDate;

    private java.lang.String validityDate;

    private java.lang.String gracePeriodDate;

    private java.lang.String splCreditFlag;

    public SIMSwapResponse() {
    }

    public SIMSwapResponse(
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.String oldAccountId,
           java.lang.String oldMsisdn,
           java.lang.String newSIM,
           java.lang.String accountBal,
           java.lang.String expiryDate,
           java.lang.String validityDate,
           java.lang.String gracePeriodDate,
           java.lang.String splCreditFlag) {
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.oldAccountId = oldAccountId;
           this.oldMsisdn = oldMsisdn;
           this.newSIM = newSIM;
           this.accountBal = accountBal;
           this.expiryDate = expiryDate;
           this.validityDate = validityDate;
           this.gracePeriodDate = gracePeriodDate;
           this.splCreditFlag = splCreditFlag;
    }


    /**
     * Gets the oldIMSI value for this SIMSwapResponse.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this SIMSwapResponse.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this SIMSwapResponse.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this SIMSwapResponse.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the oldAccountId value for this SIMSwapResponse.
     * 
     * @return oldAccountId
     */
    public java.lang.String getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this SIMSwapResponse.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(java.lang.String oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the oldMsisdn value for this SIMSwapResponse.
     * 
     * @return oldMsisdn
     */
    public java.lang.String getOldMsisdn() {
        return oldMsisdn;
    }


    /**
     * Sets the oldMsisdn value for this SIMSwapResponse.
     * 
     * @param oldMsisdn
     */
    public void setOldMsisdn(java.lang.String oldMsisdn) {
        this.oldMsisdn = oldMsisdn;
    }


    /**
     * Gets the newSIM value for this SIMSwapResponse.
     * 
     * @return newSIM
     */
    public java.lang.String getNewSIM() {
        return newSIM;
    }


    /**
     * Sets the newSIM value for this SIMSwapResponse.
     * 
     * @param newSIM
     */
    public void setNewSIM(java.lang.String newSIM) {
        this.newSIM = newSIM;
    }


    /**
     * Gets the accountBal value for this SIMSwapResponse.
     * 
     * @return accountBal
     */
    public java.lang.String getAccountBal() {
        return accountBal;
    }


    /**
     * Sets the accountBal value for this SIMSwapResponse.
     * 
     * @param accountBal
     */
    public void setAccountBal(java.lang.String accountBal) {
        this.accountBal = accountBal;
    }


    /**
     * Gets the expiryDate value for this SIMSwapResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this SIMSwapResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the validityDate value for this SIMSwapResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this SIMSwapResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriodDate value for this SIMSwapResponse.
     * 
     * @return gracePeriodDate
     */
    public java.lang.String getGracePeriodDate() {
        return gracePeriodDate;
    }


    /**
     * Sets the gracePeriodDate value for this SIMSwapResponse.
     * 
     * @param gracePeriodDate
     */
    public void setGracePeriodDate(java.lang.String gracePeriodDate) {
        this.gracePeriodDate = gracePeriodDate;
    }


    /**
     * Gets the splCreditFlag value for this SIMSwapResponse.
     * 
     * @return splCreditFlag
     */
    public java.lang.String getSplCreditFlag() {
        return splCreditFlag;
    }


    /**
     * Sets the splCreditFlag value for this SIMSwapResponse.
     * 
     * @param splCreditFlag
     */
    public void setSplCreditFlag(java.lang.String splCreditFlag) {
        this.splCreditFlag = splCreditFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMSwapResponse)) return false;
        SIMSwapResponse other = (SIMSwapResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.oldMsisdn==null && other.getOldMsisdn()==null) || 
             (this.oldMsisdn!=null &&
              this.oldMsisdn.equals(other.getOldMsisdn()))) &&
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
            ((this.splCreditFlag==null && other.getSplCreditFlag()==null) || 
             (this.splCreditFlag!=null &&
              this.splCreditFlag.equals(other.getSplCreditFlag())));
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
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getOldMsisdn() != null) {
            _hashCode += getOldMsisdn().hashCode();
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
        if (getSplCreditFlag() != null) {
            _hashCode += getSplCreditFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIMSwapResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMSwapResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("splCreditFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "splCreditFlag"));
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
