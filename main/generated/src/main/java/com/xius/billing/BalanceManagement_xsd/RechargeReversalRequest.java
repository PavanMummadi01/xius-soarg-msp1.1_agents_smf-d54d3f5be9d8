/**
 * RechargeReversalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class RechargeReversalRequest  implements java.io.Serializable {
    private java.lang.String orgTransRefNumber;

    private java.math.BigDecimal amount;

    private java.lang.String transRefNumber;

    private java.lang.String transactionID;

    private java.lang.String reason;

    private java.lang.String additionalInput1;

    private java.lang.String additionalInput2;

    public RechargeReversalRequest() {
    }

    public RechargeReversalRequest(
           java.lang.String orgTransRefNumber,
           java.math.BigDecimal amount,
           java.lang.String transRefNumber,
           java.lang.String transactionID,
           java.lang.String reason,
           java.lang.String additionalInput1,
           java.lang.String additionalInput2) {
           this.orgTransRefNumber = orgTransRefNumber;
           this.amount = amount;
           this.transRefNumber = transRefNumber;
           this.transactionID = transactionID;
           this.reason = reason;
           this.additionalInput1 = additionalInput1;
           this.additionalInput2 = additionalInput2;
    }


    /**
     * Gets the orgTransRefNumber value for this RechargeReversalRequest.
     * 
     * @return orgTransRefNumber
     */
    public java.lang.String getOrgTransRefNumber() {
        return orgTransRefNumber;
    }


    /**
     * Sets the orgTransRefNumber value for this RechargeReversalRequest.
     * 
     * @param orgTransRefNumber
     */
    public void setOrgTransRefNumber(java.lang.String orgTransRefNumber) {
        this.orgTransRefNumber = orgTransRefNumber;
    }


    /**
     * Gets the amount value for this RechargeReversalRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RechargeReversalRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the transRefNumber value for this RechargeReversalRequest.
     * 
     * @return transRefNumber
     */
    public java.lang.String getTransRefNumber() {
        return transRefNumber;
    }


    /**
     * Sets the transRefNumber value for this RechargeReversalRequest.
     * 
     * @param transRefNumber
     */
    public void setTransRefNumber(java.lang.String transRefNumber) {
        this.transRefNumber = transRefNumber;
    }


    /**
     * Gets the transactionID value for this RechargeReversalRequest.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this RechargeReversalRequest.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the reason value for this RechargeReversalRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this RechargeReversalRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the additionalInput1 value for this RechargeReversalRequest.
     * 
     * @return additionalInput1
     */
    public java.lang.String getAdditionalInput1() {
        return additionalInput1;
    }


    /**
     * Sets the additionalInput1 value for this RechargeReversalRequest.
     * 
     * @param additionalInput1
     */
    public void setAdditionalInput1(java.lang.String additionalInput1) {
        this.additionalInput1 = additionalInput1;
    }


    /**
     * Gets the additionalInput2 value for this RechargeReversalRequest.
     * 
     * @return additionalInput2
     */
    public java.lang.String getAdditionalInput2() {
        return additionalInput2;
    }


    /**
     * Sets the additionalInput2 value for this RechargeReversalRequest.
     * 
     * @param additionalInput2
     */
    public void setAdditionalInput2(java.lang.String additionalInput2) {
        this.additionalInput2 = additionalInput2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeReversalRequest)) return false;
        RechargeReversalRequest other = (RechargeReversalRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgTransRefNumber==null && other.getOrgTransRefNumber()==null) || 
             (this.orgTransRefNumber!=null &&
              this.orgTransRefNumber.equals(other.getOrgTransRefNumber()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.transRefNumber==null && other.getTransRefNumber()==null) || 
             (this.transRefNumber!=null &&
              this.transRefNumber.equals(other.getTransRefNumber()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.additionalInput1==null && other.getAdditionalInput1()==null) || 
             (this.additionalInput1!=null &&
              this.additionalInput1.equals(other.getAdditionalInput1()))) &&
            ((this.additionalInput2==null && other.getAdditionalInput2()==null) || 
             (this.additionalInput2!=null &&
              this.additionalInput2.equals(other.getAdditionalInput2())));
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
        if (getOrgTransRefNumber() != null) {
            _hashCode += getOrgTransRefNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTransRefNumber() != null) {
            _hashCode += getTransRefNumber().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getAdditionalInput1() != null) {
            _hashCode += getAdditionalInput1().hashCode();
        }
        if (getAdditionalInput2() != null) {
            _hashCode += getAdditionalInput2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeReversalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", ">rechargeReversalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgTransRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "OrgTransRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "transRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("additionalInput1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "additionalInput1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "additionalInput2"));
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
