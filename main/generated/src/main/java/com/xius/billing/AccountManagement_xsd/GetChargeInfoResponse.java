/**
 * GetChargeInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetChargeInfoResponse  implements java.io.Serializable {
    private java.lang.String currentBalance;

    private java.lang.String charge;

    private java.lang.Long debitActivityId;

    private java.lang.Long creditActivityId;

    private java.lang.String debitActivityReason;

    private java.lang.String creditActivityReason;

    private java.lang.String transactionId;

    public GetChargeInfoResponse() {
    }

    public GetChargeInfoResponse(
           java.lang.String currentBalance,
           java.lang.String charge,
           java.lang.Long debitActivityId,
           java.lang.Long creditActivityId,
           java.lang.String debitActivityReason,
           java.lang.String creditActivityReason,
           java.lang.String transactionId) {
           this.currentBalance = currentBalance;
           this.charge = charge;
           this.debitActivityId = debitActivityId;
           this.creditActivityId = creditActivityId;
           this.debitActivityReason = debitActivityReason;
           this.creditActivityReason = creditActivityReason;
           this.transactionId = transactionId;
    }


    /**
     * Gets the currentBalance value for this GetChargeInfoResponse.
     * 
     * @return currentBalance
     */
    public java.lang.String getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this GetChargeInfoResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.lang.String currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the charge value for this GetChargeInfoResponse.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this GetChargeInfoResponse.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the debitActivityId value for this GetChargeInfoResponse.
     * 
     * @return debitActivityId
     */
    public java.lang.Long getDebitActivityId() {
        return debitActivityId;
    }


    /**
     * Sets the debitActivityId value for this GetChargeInfoResponse.
     * 
     * @param debitActivityId
     */
    public void setDebitActivityId(java.lang.Long debitActivityId) {
        this.debitActivityId = debitActivityId;
    }


    /**
     * Gets the creditActivityId value for this GetChargeInfoResponse.
     * 
     * @return creditActivityId
     */
    public java.lang.Long getCreditActivityId() {
        return creditActivityId;
    }


    /**
     * Sets the creditActivityId value for this GetChargeInfoResponse.
     * 
     * @param creditActivityId
     */
    public void setCreditActivityId(java.lang.Long creditActivityId) {
        this.creditActivityId = creditActivityId;
    }


    /**
     * Gets the debitActivityReason value for this GetChargeInfoResponse.
     * 
     * @return debitActivityReason
     */
    public java.lang.String getDebitActivityReason() {
        return debitActivityReason;
    }


    /**
     * Sets the debitActivityReason value for this GetChargeInfoResponse.
     * 
     * @param debitActivityReason
     */
    public void setDebitActivityReason(java.lang.String debitActivityReason) {
        this.debitActivityReason = debitActivityReason;
    }


    /**
     * Gets the creditActivityReason value for this GetChargeInfoResponse.
     * 
     * @return creditActivityReason
     */
    public java.lang.String getCreditActivityReason() {
        return creditActivityReason;
    }


    /**
     * Sets the creditActivityReason value for this GetChargeInfoResponse.
     * 
     * @param creditActivityReason
     */
    public void setCreditActivityReason(java.lang.String creditActivityReason) {
        this.creditActivityReason = creditActivityReason;
    }


    /**
     * Gets the transactionId value for this GetChargeInfoResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GetChargeInfoResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetChargeInfoResponse)) return false;
        GetChargeInfoResponse other = (GetChargeInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.debitActivityId==null && other.getDebitActivityId()==null) || 
             (this.debitActivityId!=null &&
              this.debitActivityId.equals(other.getDebitActivityId()))) &&
            ((this.creditActivityId==null && other.getCreditActivityId()==null) || 
             (this.creditActivityId!=null &&
              this.creditActivityId.equals(other.getCreditActivityId()))) &&
            ((this.debitActivityReason==null && other.getDebitActivityReason()==null) || 
             (this.debitActivityReason!=null &&
              this.debitActivityReason.equals(other.getDebitActivityReason()))) &&
            ((this.creditActivityReason==null && other.getCreditActivityReason()==null) || 
             (this.creditActivityReason!=null &&
              this.creditActivityReason.equals(other.getCreditActivityReason()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getDebitActivityId() != null) {
            _hashCode += getDebitActivityId().hashCode();
        }
        if (getCreditActivityId() != null) {
            _hashCode += getCreditActivityId().hashCode();
        }
        if (getDebitActivityReason() != null) {
            _hashCode += getDebitActivityReason().hashCode();
        }
        if (getCreditActivityReason() != null) {
            _hashCode += getCreditActivityReason().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetChargeInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetChargeInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "debitActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "creditActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitActivityReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "debitActivityReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditActivityReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "creditActivityReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "transactionId"));
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
