/**
 * ChangeTPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ChangeTPResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String oldTariffPlanName;

    private java.lang.String newTariffPlan;

    private java.lang.String debitedAmmount;

    private java.lang.String transactionId;

    public ChangeTPResponse() {
    }

    public ChangeTPResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String oldTariffPlanName,
           java.lang.String newTariffPlan,
           java.lang.String debitedAmmount,
           java.lang.String transactionId) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.oldTariffPlanName = oldTariffPlanName;
        this.newTariffPlan = newTariffPlan;
        this.debitedAmmount = debitedAmmount;
        this.transactionId = transactionId;
    }


    /**
     * Gets the oldTariffPlanName value for this ChangeTPResponse.
     * 
     * @return oldTariffPlanName
     */
    public java.lang.String getOldTariffPlanName() {
        return oldTariffPlanName;
    }


    /**
     * Sets the oldTariffPlanName value for this ChangeTPResponse.
     * 
     * @param oldTariffPlanName
     */
    public void setOldTariffPlanName(java.lang.String oldTariffPlanName) {
        this.oldTariffPlanName = oldTariffPlanName;
    }


    /**
     * Gets the newTariffPlan value for this ChangeTPResponse.
     * 
     * @return newTariffPlan
     */
    public java.lang.String getNewTariffPlan() {
        return newTariffPlan;
    }


    /**
     * Sets the newTariffPlan value for this ChangeTPResponse.
     * 
     * @param newTariffPlan
     */
    public void setNewTariffPlan(java.lang.String newTariffPlan) {
        this.newTariffPlan = newTariffPlan;
    }


    /**
     * Gets the debitedAmmount value for this ChangeTPResponse.
     * 
     * @return debitedAmmount
     */
    public java.lang.String getDebitedAmmount() {
        return debitedAmmount;
    }


    /**
     * Sets the debitedAmmount value for this ChangeTPResponse.
     * 
     * @param debitedAmmount
     */
    public void setDebitedAmmount(java.lang.String debitedAmmount) {
        this.debitedAmmount = debitedAmmount;
    }


    /**
     * Gets the transactionId value for this ChangeTPResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ChangeTPResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeTPResponse)) return false;
        ChangeTPResponse other = (ChangeTPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldTariffPlanName==null && other.getOldTariffPlanName()==null) || 
             (this.oldTariffPlanName!=null &&
              this.oldTariffPlanName.equals(other.getOldTariffPlanName()))) &&
            ((this.newTariffPlan==null && other.getNewTariffPlan()==null) || 
             (this.newTariffPlan!=null &&
              this.newTariffPlan.equals(other.getNewTariffPlan()))) &&
            ((this.debitedAmmount==null && other.getDebitedAmmount()==null) || 
             (this.debitedAmmount!=null &&
              this.debitedAmmount.equals(other.getDebitedAmmount()))) &&
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
        int _hashCode = super.hashCode();
        if (getOldTariffPlanName() != null) {
            _hashCode += getOldTariffPlanName().hashCode();
        }
        if (getNewTariffPlan() != null) {
            _hashCode += getNewTariffPlan().hashCode();
        }
        if (getDebitedAmmount() != null) {
            _hashCode += getDebitedAmmount().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeTPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">changeTPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTariffPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "oldTariffPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "newTariffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitedAmmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "debitedAmmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "transactionId"));
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
