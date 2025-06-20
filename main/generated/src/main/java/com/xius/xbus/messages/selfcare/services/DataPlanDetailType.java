/**
 * DataPlanDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class DataPlanDetailType  implements java.io.Serializable {
    private java.lang.String publicityId;

    private java.lang.Long planId;

    private java.lang.String planName;

    private java.math.BigDecimal planCharge;

    private java.lang.String planPeriod;

    public DataPlanDetailType() {
    }

    public DataPlanDetailType(
           java.lang.String publicityId,
           java.lang.Long planId,
           java.lang.String planName,
           java.math.BigDecimal planCharge,
           java.lang.String planPeriod) {
           this.publicityId = publicityId;
           this.planId = planId;
           this.planName = planName;
           this.planCharge = planCharge;
           this.planPeriod = planPeriod;
    }


    /**
     * Gets the publicityId value for this DataPlanDetailType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this DataPlanDetailType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the planId value for this DataPlanDetailType.
     * 
     * @return planId
     */
    public java.lang.Long getPlanId() {
        return planId;
    }


    /**
     * Sets the planId value for this DataPlanDetailType.
     * 
     * @param planId
     */
    public void setPlanId(java.lang.Long planId) {
        this.planId = planId;
    }


    /**
     * Gets the planName value for this DataPlanDetailType.
     * 
     * @return planName
     */
    public java.lang.String getPlanName() {
        return planName;
    }


    /**
     * Sets the planName value for this DataPlanDetailType.
     * 
     * @param planName
     */
    public void setPlanName(java.lang.String planName) {
        this.planName = planName;
    }


    /**
     * Gets the planCharge value for this DataPlanDetailType.
     * 
     * @return planCharge
     */
    public java.math.BigDecimal getPlanCharge() {
        return planCharge;
    }


    /**
     * Sets the planCharge value for this DataPlanDetailType.
     * 
     * @param planCharge
     */
    public void setPlanCharge(java.math.BigDecimal planCharge) {
        this.planCharge = planCharge;
    }


    /**
     * Gets the planPeriod value for this DataPlanDetailType.
     * 
     * @return planPeriod
     */
    public java.lang.String getPlanPeriod() {
        return planPeriod;
    }


    /**
     * Sets the planPeriod value for this DataPlanDetailType.
     * 
     * @param planPeriod
     */
    public void setPlanPeriod(java.lang.String planPeriod) {
        this.planPeriod = planPeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataPlanDetailType)) return false;
        DataPlanDetailType other = (DataPlanDetailType) obj;
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
              this.planPeriod.equals(other.getPlanPeriod())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataPlanDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "DataPlanDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "planId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "planName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "planCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "planPeriod"));
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
