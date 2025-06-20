/**
 * DataPlanInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class DataPlanInfoType  implements java.io.Serializable {
    private java.lang.String publicityId;

    private java.lang.Long planId;

    private java.lang.String planName;

    private java.math.BigDecimal planCharge;

    private java.lang.String planPeriod;

    private java.lang.String expiryDate;

    private java.lang.String remaingBalance;

    private java.lang.String usedBalance;

    private java.lang.String actualBalance;

    private java.math.BigDecimal activationFee;

    public DataPlanInfoType() {
    }

    public DataPlanInfoType(
           java.lang.String publicityId,
           java.lang.Long planId,
           java.lang.String planName,
           java.math.BigDecimal planCharge,
           java.lang.String planPeriod,
           java.lang.String expiryDate,
           java.lang.String remaingBalance,
           java.lang.String usedBalance,
           java.lang.String actualBalance,
           java.math.BigDecimal activationFee) {
           this.publicityId = publicityId;
           this.planId = planId;
           this.planName = planName;
           this.planCharge = planCharge;
           this.planPeriod = planPeriod;
           this.expiryDate = expiryDate;
           this.remaingBalance = remaingBalance;
           this.usedBalance = usedBalance;
           this.actualBalance = actualBalance;
           this.activationFee = activationFee;
    }


    /**
     * Gets the publicityId value for this DataPlanInfoType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this DataPlanInfoType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the planId value for this DataPlanInfoType.
     * 
     * @return planId
     */
    public java.lang.Long getPlanId() {
        return planId;
    }


    /**
     * Sets the planId value for this DataPlanInfoType.
     * 
     * @param planId
     */
    public void setPlanId(java.lang.Long planId) {
        this.planId = planId;
    }


    /**
     * Gets the planName value for this DataPlanInfoType.
     * 
     * @return planName
     */
    public java.lang.String getPlanName() {
        return planName;
    }


    /**
     * Sets the planName value for this DataPlanInfoType.
     * 
     * @param planName
     */
    public void setPlanName(java.lang.String planName) {
        this.planName = planName;
    }


    /**
     * Gets the planCharge value for this DataPlanInfoType.
     * 
     * @return planCharge
     */
    public java.math.BigDecimal getPlanCharge() {
        return planCharge;
    }


    /**
     * Sets the planCharge value for this DataPlanInfoType.
     * 
     * @param planCharge
     */
    public void setPlanCharge(java.math.BigDecimal planCharge) {
        this.planCharge = planCharge;
    }


    /**
     * Gets the planPeriod value for this DataPlanInfoType.
     * 
     * @return planPeriod
     */
    public java.lang.String getPlanPeriod() {
        return planPeriod;
    }


    /**
     * Sets the planPeriod value for this DataPlanInfoType.
     * 
     * @param planPeriod
     */
    public void setPlanPeriod(java.lang.String planPeriod) {
        this.planPeriod = planPeriod;
    }


    /**
     * Gets the expiryDate value for this DataPlanInfoType.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this DataPlanInfoType.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the remaingBalance value for this DataPlanInfoType.
     * 
     * @return remaingBalance
     */
    public java.lang.String getRemaingBalance() {
        return remaingBalance;
    }


    /**
     * Sets the remaingBalance value for this DataPlanInfoType.
     * 
     * @param remaingBalance
     */
    public void setRemaingBalance(java.lang.String remaingBalance) {
        this.remaingBalance = remaingBalance;
    }


    /**
     * Gets the usedBalance value for this DataPlanInfoType.
     * 
     * @return usedBalance
     */
    public java.lang.String getUsedBalance() {
        return usedBalance;
    }


    /**
     * Sets the usedBalance value for this DataPlanInfoType.
     * 
     * @param usedBalance
     */
    public void setUsedBalance(java.lang.String usedBalance) {
        this.usedBalance = usedBalance;
    }


    /**
     * Gets the actualBalance value for this DataPlanInfoType.
     * 
     * @return actualBalance
     */
    public java.lang.String getActualBalance() {
        return actualBalance;
    }


    /**
     * Sets the actualBalance value for this DataPlanInfoType.
     * 
     * @param actualBalance
     */
    public void setActualBalance(java.lang.String actualBalance) {
        this.actualBalance = actualBalance;
    }


    /**
     * Gets the activationFee value for this DataPlanInfoType.
     * 
     * @return activationFee
     */
    public java.math.BigDecimal getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this DataPlanInfoType.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.math.BigDecimal activationFee) {
        this.activationFee = activationFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataPlanInfoType)) return false;
        DataPlanInfoType other = (DataPlanInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.planId==null && other.getPlanId()==null) || 
             (this.planId!=null &&
              this.planId.equals(other.getPlanId()))) &&
            ((this.planName==null && other.getPlanName()==null) || 
             (this.planName!=null &&
              this.planName.equals(other.getPlanName()))) &&
            ((this.planCharge==null && other.getPlanCharge()==null) || 
             (this.planCharge!=null &&
              this.planCharge.equals(other.getPlanCharge()))) &&
            ((this.planPeriod==null && other.getPlanPeriod()==null) || 
             (this.planPeriod!=null &&
              this.planPeriod.equals(other.getPlanPeriod()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.remaingBalance==null && other.getRemaingBalance()==null) || 
             (this.remaingBalance!=null &&
              this.remaingBalance.equals(other.getRemaingBalance()))) &&
            ((this.usedBalance==null && other.getUsedBalance()==null) || 
             (this.usedBalance!=null &&
              this.usedBalance.equals(other.getUsedBalance()))) &&
            ((this.actualBalance==null && other.getActualBalance()==null) || 
             (this.actualBalance!=null &&
              this.actualBalance.equals(other.getActualBalance()))) &&
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee())));
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
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getPlanId() != null) {
            _hashCode += getPlanId().hashCode();
        }
        if (getPlanName() != null) {
            _hashCode += getPlanName().hashCode();
        }
        if (getPlanCharge() != null) {
            _hashCode += getPlanCharge().hashCode();
        }
        if (getPlanPeriod() != null) {
            _hashCode += getPlanPeriod().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getRemaingBalance() != null) {
            _hashCode += getRemaingBalance().hashCode();
        }
        if (getUsedBalance() != null) {
            _hashCode += getUsedBalance().hashCode();
        }
        if (getActualBalance() != null) {
            _hashCode += getActualBalance().hashCode();
        }
        if (getActivationFee() != null) {
            _hashCode += getActivationFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataPlanInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "planId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "planName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "planCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "planPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "remaingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "usedBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "actualBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activationFee"));
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
