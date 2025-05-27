/**
 * SpecialTopUpRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class SpecialTopUpRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.math.BigDecimal amountToCredit;

    private java.lang.String reason;

    private java.lang.String newValidityDate;

    private java.lang.String newGracePeriodIEndDate;

    private java.lang.String newExpiryDate;

    private java.lang.String transactionId;

    private java.lang.Long activityId;

    private java.lang.String newGracePeriod2EndDate;

    private java.lang.String newGracePeriod3EndDate;

    private java.lang.String serviceType;

    public SpecialTopUpRequest() {
    }

    public SpecialTopUpRequest(
           java.lang.String MSISDN,
           java.math.BigDecimal amountToCredit,
           java.lang.String reason,
           java.lang.String newValidityDate,
           java.lang.String newGracePeriodIEndDate,
           java.lang.String newExpiryDate,
           java.lang.String transactionId,
           java.lang.Long activityId,
           java.lang.String newGracePeriod2EndDate,
           java.lang.String newGracePeriod3EndDate,
           java.lang.String serviceType) {
           this.MSISDN = MSISDN;
           this.amountToCredit = amountToCredit;
           this.reason = reason;
           this.newValidityDate = newValidityDate;
           this.newGracePeriodIEndDate = newGracePeriodIEndDate;
           this.newExpiryDate = newExpiryDate;
           this.transactionId = transactionId;
           this.activityId = activityId;
           this.newGracePeriod2EndDate = newGracePeriod2EndDate;
           this.newGracePeriod3EndDate = newGracePeriod3EndDate;
           this.serviceType = serviceType;
    }


    /**
     * Gets the MSISDN value for this SpecialTopUpRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this SpecialTopUpRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the amountToCredit value for this SpecialTopUpRequest.
     * 
     * @return amountToCredit
     */
    public java.math.BigDecimal getAmountToCredit() {
        return amountToCredit;
    }


    /**
     * Sets the amountToCredit value for this SpecialTopUpRequest.
     * 
     * @param amountToCredit
     */
    public void setAmountToCredit(java.math.BigDecimal amountToCredit) {
        this.amountToCredit = amountToCredit;
    }


    /**
     * Gets the reason value for this SpecialTopUpRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this SpecialTopUpRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the newValidityDate value for this SpecialTopUpRequest.
     * 
     * @return newValidityDate
     */
    public java.lang.String getNewValidityDate() {
        return newValidityDate;
    }


    /**
     * Sets the newValidityDate value for this SpecialTopUpRequest.
     * 
     * @param newValidityDate
     */
    public void setNewValidityDate(java.lang.String newValidityDate) {
        this.newValidityDate = newValidityDate;
    }


    /**
     * Gets the newGracePeriodIEndDate value for this SpecialTopUpRequest.
     * 
     * @return newGracePeriodIEndDate
     */
    public java.lang.String getNewGracePeriodIEndDate() {
        return newGracePeriodIEndDate;
    }


    /**
     * Sets the newGracePeriodIEndDate value for this SpecialTopUpRequest.
     * 
     * @param newGracePeriodIEndDate
     */
    public void setNewGracePeriodIEndDate(java.lang.String newGracePeriodIEndDate) {
        this.newGracePeriodIEndDate = newGracePeriodIEndDate;
    }


    /**
     * Gets the newExpiryDate value for this SpecialTopUpRequest.
     * 
     * @return newExpiryDate
     */
    public java.lang.String getNewExpiryDate() {
        return newExpiryDate;
    }


    /**
     * Sets the newExpiryDate value for this SpecialTopUpRequest.
     * 
     * @param newExpiryDate
     */
    public void setNewExpiryDate(java.lang.String newExpiryDate) {
        this.newExpiryDate = newExpiryDate;
    }


    /**
     * Gets the transactionId value for this SpecialTopUpRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this SpecialTopUpRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the activityId value for this SpecialTopUpRequest.
     * 
     * @return activityId
     */
    public java.lang.Long getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this SpecialTopUpRequest.
     * 
     * @param activityId
     */
    public void setActivityId(java.lang.Long activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the newGracePeriod2EndDate value for this SpecialTopUpRequest.
     * 
     * @return newGracePeriod2EndDate
     */
    public java.lang.String getNewGracePeriod2EndDate() {
        return newGracePeriod2EndDate;
    }


    /**
     * Sets the newGracePeriod2EndDate value for this SpecialTopUpRequest.
     * 
     * @param newGracePeriod2EndDate
     */
    public void setNewGracePeriod2EndDate(java.lang.String newGracePeriod2EndDate) {
        this.newGracePeriod2EndDate = newGracePeriod2EndDate;
    }


    /**
     * Gets the newGracePeriod3EndDate value for this SpecialTopUpRequest.
     * 
     * @return newGracePeriod3EndDate
     */
    public java.lang.String getNewGracePeriod3EndDate() {
        return newGracePeriod3EndDate;
    }


    /**
     * Sets the newGracePeriod3EndDate value for this SpecialTopUpRequest.
     * 
     * @param newGracePeriod3EndDate
     */
    public void setNewGracePeriod3EndDate(java.lang.String newGracePeriod3EndDate) {
        this.newGracePeriod3EndDate = newGracePeriod3EndDate;
    }


    /**
     * Gets the serviceType value for this SpecialTopUpRequest.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this SpecialTopUpRequest.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecialTopUpRequest)) return false;
        SpecialTopUpRequest other = (SpecialTopUpRequest) obj;
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
            ((this.amountToCredit==null && other.getAmountToCredit()==null) || 
             (this.amountToCredit!=null &&
              this.amountToCredit.equals(other.getAmountToCredit()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.newValidityDate==null && other.getNewValidityDate()==null) || 
             (this.newValidityDate!=null &&
              this.newValidityDate.equals(other.getNewValidityDate()))) &&
            ((this.newGracePeriodIEndDate==null && other.getNewGracePeriodIEndDate()==null) || 
             (this.newGracePeriodIEndDate!=null &&
              this.newGracePeriodIEndDate.equals(other.getNewGracePeriodIEndDate()))) &&
            ((this.newExpiryDate==null && other.getNewExpiryDate()==null) || 
             (this.newExpiryDate!=null &&
              this.newExpiryDate.equals(other.getNewExpiryDate()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.activityId==null && other.getActivityId()==null) || 
             (this.activityId!=null &&
              this.activityId.equals(other.getActivityId()))) &&
            ((this.newGracePeriod2EndDate==null && other.getNewGracePeriod2EndDate()==null) || 
             (this.newGracePeriod2EndDate!=null &&
              this.newGracePeriod2EndDate.equals(other.getNewGracePeriod2EndDate()))) &&
            ((this.newGracePeriod3EndDate==null && other.getNewGracePeriod3EndDate()==null) || 
             (this.newGracePeriod3EndDate!=null &&
              this.newGracePeriod3EndDate.equals(other.getNewGracePeriod3EndDate()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType())));
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
        if (getAmountToCredit() != null) {
            _hashCode += getAmountToCredit().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getNewValidityDate() != null) {
            _hashCode += getNewValidityDate().hashCode();
        }
        if (getNewGracePeriodIEndDate() != null) {
            _hashCode += getNewGracePeriodIEndDate().hashCode();
        }
        if (getNewExpiryDate() != null) {
            _hashCode += getNewExpiryDate().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getActivityId() != null) {
            _hashCode += getActivityId().hashCode();
        }
        if (getNewGracePeriod2EndDate() != null) {
            _hashCode += getNewGracePeriod2EndDate().hashCode();
        }
        if (getNewGracePeriod3EndDate() != null) {
            _hashCode += getNewGracePeriod3EndDate().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialTopUpRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "SpecialTopUpRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountToCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "amountToCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("newValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGracePeriodIEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newGracePeriodIEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "activityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGracePeriod2EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newGracePeriod2EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGracePeriod3EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "newGracePeriod3EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "serviceType"));
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
