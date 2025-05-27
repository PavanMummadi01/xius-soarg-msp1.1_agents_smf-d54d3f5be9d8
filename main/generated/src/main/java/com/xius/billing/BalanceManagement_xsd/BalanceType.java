/**
 * BalanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class BalanceType  implements java.io.Serializable {
    private java.lang.String mainbalance;

    private java.lang.String initialbalance;

    private java.lang.String promobalance;

    public BalanceType() {
    }

    public BalanceType(
           java.lang.String mainbalance,
           java.lang.String initialbalance,
           java.lang.String promobalance) {
           this.mainbalance = mainbalance;
           this.initialbalance = initialbalance;
           this.promobalance = promobalance;
    }


    /**
     * Gets the mainbalance value for this BalanceType.
     * 
     * @return mainbalance
     */
    public java.lang.String getMainbalance() {
        return mainbalance;
    }


    /**
     * Sets the mainbalance value for this BalanceType.
     * 
     * @param mainbalance
     */
    public void setMainbalance(java.lang.String mainbalance) {
        this.mainbalance = mainbalance;
    }


    /**
     * Gets the initialbalance value for this BalanceType.
     * 
     * @return initialbalance
     */
    public java.lang.String getInitialbalance() {
        return initialbalance;
    }


    /**
     * Sets the initialbalance value for this BalanceType.
     * 
     * @param initialbalance
     */
    public void setInitialbalance(java.lang.String initialbalance) {
        this.initialbalance = initialbalance;
    }


    /**
     * Gets the promobalance value for this BalanceType.
     * 
     * @return promobalance
     */
    public java.lang.String getPromobalance() {
        return promobalance;
    }


    /**
     * Sets the promobalance value for this BalanceType.
     * 
     * @param promobalance
     */
    public void setPromobalance(java.lang.String promobalance) {
        this.promobalance = promobalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceType)) return false;
        BalanceType other = (BalanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainbalance==null && other.getMainbalance()==null) || 
             (this.mainbalance!=null &&
              this.mainbalance.equals(other.getMainbalance()))) &&
            ((this.initialbalance==null && other.getInitialbalance()==null) || 
             (this.initialbalance!=null &&
              this.initialbalance.equals(other.getInitialbalance()))) &&
            ((this.promobalance==null && other.getPromobalance()==null) || 
             (this.promobalance!=null &&
              this.promobalance.equals(other.getPromobalance())));
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
        if (getMainbalance() != null) {
            _hashCode += getMainbalance().hashCode();
        }
        if (getInitialbalance() != null) {
            _hashCode += getInitialbalance().hashCode();
        }
        if (getPromobalance() != null) {
            _hashCode += getPromobalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "balanceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "mainbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "initialbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promobalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "promobalance"));
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
