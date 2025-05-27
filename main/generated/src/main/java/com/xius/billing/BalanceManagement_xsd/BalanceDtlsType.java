/**
 * BalanceDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class BalanceDtlsType  implements java.io.Serializable {
    private com.xius.billing.BalanceManagement_xsd.BalanceType balance;

    private com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] ATPBalance;

    private com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] modulesBalance;

    public BalanceDtlsType() {
    }

    public BalanceDtlsType(
           com.xius.billing.BalanceManagement_xsd.BalanceType balance,
           com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] ATPBalance,
           com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] modulesBalance) {
           this.balance = balance;
           this.ATPBalance = ATPBalance;
           this.modulesBalance = modulesBalance;
    }


    /**
     * Gets the balance value for this BalanceDtlsType.
     * 
     * @return balance
     */
    public com.xius.billing.BalanceManagement_xsd.BalanceType getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this BalanceDtlsType.
     * 
     * @param balance
     */
    public void setBalance(com.xius.billing.BalanceManagement_xsd.BalanceType balance) {
        this.balance = balance;
    }


    /**
     * Gets the ATPBalance value for this BalanceDtlsType.
     * 
     * @return ATPBalance
     */
    public com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] getATPBalance() {
        return ATPBalance;
    }


    /**
     * Sets the ATPBalance value for this BalanceDtlsType.
     * 
     * @param ATPBalance
     */
    public void setATPBalance(com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] ATPBalance) {
        this.ATPBalance = ATPBalance;
    }


    /**
     * Gets the modulesBalance value for this BalanceDtlsType.
     * 
     * @return modulesBalance
     */
    public com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] getModulesBalance() {
        return modulesBalance;
    }


    /**
     * Sets the modulesBalance value for this BalanceDtlsType.
     * 
     * @param modulesBalance
     */
    public void setModulesBalance(com.xius.billing.BalanceManagement_xsd.PublicityidDtlsType[] modulesBalance) {
        this.modulesBalance = modulesBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceDtlsType)) return false;
        BalanceDtlsType other = (BalanceDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.ATPBalance==null && other.getATPBalance()==null) || 
             (this.ATPBalance!=null &&
              java.util.Arrays.equals(this.ATPBalance, other.getATPBalance()))) &&
            ((this.modulesBalance==null && other.getModulesBalance()==null) || 
             (this.modulesBalance!=null &&
              java.util.Arrays.equals(this.modulesBalance, other.getModulesBalance())));
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getATPBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getATPBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getATPBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModulesBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModulesBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModulesBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "balanceDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "balanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "ATPBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityidDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulesBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "modulesBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityidDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityid"));
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
