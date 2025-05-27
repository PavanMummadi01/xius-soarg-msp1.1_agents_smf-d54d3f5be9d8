/**
 * SubDataPlanDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class SubDataPlanDetailType  implements java.io.Serializable {
    private java.lang.String publicityId;

    private java.lang.String planName;

    private java.lang.String expiryDate;

    private java.lang.String remaingBalance;

    private java.lang.String usedBalance;

    private java.lang.String planVolume;

    public SubDataPlanDetailType() {
    }

    public SubDataPlanDetailType(
           java.lang.String publicityId,
           java.lang.String planName,
           java.lang.String expiryDate,
           java.lang.String remaingBalance,
           java.lang.String usedBalance,
           java.lang.String planVolume) {
           this.publicityId = publicityId;
           this.planName = planName;
           this.expiryDate = expiryDate;
           this.remaingBalance = remaingBalance;
           this.usedBalance = usedBalance;
           this.planVolume = planVolume;
    }


    /**
     * Gets the publicityId value for this SubDataPlanDetailType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this SubDataPlanDetailType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the planName value for this SubDataPlanDetailType.
     * 
     * @return planName
     */
    public java.lang.String getPlanName() {
        return planName;
    }


    /**
     * Sets the planName value for this SubDataPlanDetailType.
     * 
     * @param planName
     */
    public void setPlanName(java.lang.String planName) {
        this.planName = planName;
    }


    /**
     * Gets the expiryDate value for this SubDataPlanDetailType.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this SubDataPlanDetailType.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the remaingBalance value for this SubDataPlanDetailType.
     * 
     * @return remaingBalance
     */
    public java.lang.String getRemaingBalance() {
        return remaingBalance;
    }


    /**
     * Sets the remaingBalance value for this SubDataPlanDetailType.
     * 
     * @param remaingBalance
     */
    public void setRemaingBalance(java.lang.String remaingBalance) {
        this.remaingBalance = remaingBalance;
    }


    /**
     * Gets the usedBalance value for this SubDataPlanDetailType.
     * 
     * @return usedBalance
     */
    public java.lang.String getUsedBalance() {
        return usedBalance;
    }


    /**
     * Sets the usedBalance value for this SubDataPlanDetailType.
     * 
     * @param usedBalance
     */
    public void setUsedBalance(java.lang.String usedBalance) {
        this.usedBalance = usedBalance;
    }


    /**
     * Gets the planVolume value for this SubDataPlanDetailType.
     * 
     * @return planVolume
     */
    public java.lang.String getPlanVolume() {
        return planVolume;
    }


    /**
     * Sets the planVolume value for this SubDataPlanDetailType.
     * 
     * @param planVolume
     */
    public void setPlanVolume(java.lang.String planVolume) {
        this.planVolume = planVolume;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubDataPlanDetailType)) return false;
        SubDataPlanDetailType other = (SubDataPlanDetailType) obj;
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
            ((this.planName==null && other.getPlanName()==null) || 
             (this.planName!=null &&
              this.planName.equals(other.getPlanName()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.remaingBalance==null && other.getRemaingBalance()==null) || 
             (this.remaingBalance!=null &&
              this.remaingBalance.equals(other.getRemaingBalance()))) &&
            ((this.usedBalance==null && other.getUsedBalance()==null) || 
             (this.usedBalance!=null &&
              this.usedBalance.equals(other.getUsedBalance()))) &&
            ((this.planVolume==null && other.getPlanVolume()==null) || 
             (this.planVolume!=null &&
              this.planVolume.equals(other.getPlanVolume())));
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
        if (getPlanName() != null) {
            _hashCode += getPlanName().hashCode();
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
        if (getPlanVolume() != null) {
            _hashCode += getPlanVolume().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubDataPlanDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubDataPlanDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "planName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "remaingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "usedBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "planVolume"));
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
