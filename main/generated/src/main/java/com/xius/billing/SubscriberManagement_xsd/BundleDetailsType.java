/**
 * BundleDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class BundleDetailsType  implements java.io.Serializable {
    private java.lang.String planName;

    private java.lang.String validity;

    private com.xius.billing.SubscriberManagement_xsd.BalanceCategoryType balances;

    public BundleDetailsType() {
    }

    public BundleDetailsType(
           java.lang.String planName,
           java.lang.String validity,
           com.xius.billing.SubscriberManagement_xsd.BalanceCategoryType balances) {
           this.planName = planName;
           this.validity = validity;
           this.balances = balances;
    }


    /**
     * Gets the planName value for this BundleDetailsType.
     * 
     * @return planName
     */
    public java.lang.String getPlanName() {
        return planName;
    }


    /**
     * Sets the planName value for this BundleDetailsType.
     * 
     * @param planName
     */
    public void setPlanName(java.lang.String planName) {
        this.planName = planName;
    }


    /**
     * Gets the validity value for this BundleDetailsType.
     * 
     * @return validity
     */
    public java.lang.String getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this BundleDetailsType.
     * 
     * @param validity
     */
    public void setValidity(java.lang.String validity) {
        this.validity = validity;
    }


    /**
     * Gets the balances value for this BundleDetailsType.
     * 
     * @return balances
     */
    public com.xius.billing.SubscriberManagement_xsd.BalanceCategoryType getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this BundleDetailsType.
     * 
     * @param balances
     */
    public void setBalances(com.xius.billing.SubscriberManagement_xsd.BalanceCategoryType balances) {
        this.balances = balances;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BundleDetailsType)) return false;
        BundleDetailsType other = (BundleDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.planName==null && other.getPlanName()==null) || 
             (this.planName!=null &&
              this.planName.equals(other.getPlanName()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              this.balances.equals(other.getBalances())));
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
        if (getPlanName() != null) {
            _hashCode += getPlanName().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        if (getBalances() != null) {
            _hashCode += getBalances().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BundleDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "planName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "balances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceCategoryType"));
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
