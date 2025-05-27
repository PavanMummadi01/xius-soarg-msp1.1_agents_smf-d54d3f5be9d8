/**
 * SpecialDebitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class SpecialDebitRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String reason;

    private java.math.BigDecimal amountToDebit;

    private java.lang.String newValidityDate;

    private java.lang.String newGracePeriodEndDate;

    private java.lang.String newExpiryDate;

    public SpecialDebitRequest() {
    }

    public SpecialDebitRequest(
           java.lang.String MSISDN,
           java.lang.String reason,
           java.math.BigDecimal amountToDebit,
           java.lang.String newValidityDate,
           java.lang.String newGracePeriodEndDate,
           java.lang.String newExpiryDate) {
           this.MSISDN = MSISDN;
           this.reason = reason;
           this.amountToDebit = amountToDebit;
           this.newValidityDate = newValidityDate;
           this.newGracePeriodEndDate = newGracePeriodEndDate;
           this.newExpiryDate = newExpiryDate;
    }


    /**
     * Gets the MSISDN value for this SpecialDebitRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this SpecialDebitRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the reason value for this SpecialDebitRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this SpecialDebitRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the amountToDebit value for this SpecialDebitRequest.
     * 
     * @return amountToDebit
     */
    public java.math.BigDecimal getAmountToDebit() {
        return amountToDebit;
    }


    /**
     * Sets the amountToDebit value for this SpecialDebitRequest.
     * 
     * @param amountToDebit
     */
    public void setAmountToDebit(java.math.BigDecimal amountToDebit) {
        this.amountToDebit = amountToDebit;
    }


    /**
     * Gets the newValidityDate value for this SpecialDebitRequest.
     * 
     * @return newValidityDate
     */
    public java.lang.String getNewValidityDate() {
        return newValidityDate;
    }


    /**
     * Sets the newValidityDate value for this SpecialDebitRequest.
     * 
     * @param newValidityDate
     */
    public void setNewValidityDate(java.lang.String newValidityDate) {
        this.newValidityDate = newValidityDate;
    }


    /**
     * Gets the newGracePeriodEndDate value for this SpecialDebitRequest.
     * 
     * @return newGracePeriodEndDate
     */
    public java.lang.String getNewGracePeriodEndDate() {
        return newGracePeriodEndDate;
    }


    /**
     * Sets the newGracePeriodEndDate value for this SpecialDebitRequest.
     * 
     * @param newGracePeriodEndDate
     */
    public void setNewGracePeriodEndDate(java.lang.String newGracePeriodEndDate) {
        this.newGracePeriodEndDate = newGracePeriodEndDate;
    }


    /**
     * Gets the newExpiryDate value for this SpecialDebitRequest.
     * 
     * @return newExpiryDate
     */
    public java.lang.String getNewExpiryDate() {
        return newExpiryDate;
    }


    /**
     * Sets the newExpiryDate value for this SpecialDebitRequest.
     * 
     * @param newExpiryDate
     */
    public void setNewExpiryDate(java.lang.String newExpiryDate) {
        this.newExpiryDate = newExpiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecialDebitRequest)) return false;
        SpecialDebitRequest other = (SpecialDebitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.amountToDebit==null && other.getAmountToDebit()==null) || 
             (this.amountToDebit!=null &&
              this.amountToDebit.equals(other.getAmountToDebit()))) &&
            ((this.newValidityDate==null && other.getNewValidityDate()==null) || 
             (this.newValidityDate!=null &&
              this.newValidityDate.equals(other.getNewValidityDate()))) &&
            ((this.newGracePeriodEndDate==null && other.getNewGracePeriodEndDate()==null) || 
             (this.newGracePeriodEndDate!=null &&
              this.newGracePeriodEndDate.equals(other.getNewGracePeriodEndDate()))) &&
            ((this.newExpiryDate==null && other.getNewExpiryDate()==null) || 
             (this.newExpiryDate!=null &&
              this.newExpiryDate.equals(other.getNewExpiryDate())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getAmountToDebit() != null) {
            _hashCode += getAmountToDebit().hashCode();
        }
        if (getNewValidityDate() != null) {
            _hashCode += getNewValidityDate().hashCode();
        }
        if (getNewGracePeriodEndDate() != null) {
            _hashCode += getNewGracePeriodEndDate().hashCode();
        }
        if (getNewExpiryDate() != null) {
            _hashCode += getNewExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialDebitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "SpecialDebitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountToDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "amountToDebit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGracePeriodEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newGracePeriodEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newExpiryDate"));
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
