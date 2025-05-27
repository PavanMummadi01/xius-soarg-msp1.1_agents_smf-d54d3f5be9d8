/**
 * ChildAcctListsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ChildAcctListsType  implements java.io.Serializable {
    /* Child mobile number */
    private java.lang.String msisdn;

    /* Option to select either to use parent ca balance or not */
    private com.xius.xbus.messages.billing.tariff.UseParentCABalance useParentCABalance;

    /* Option to select either to use parent core balance or not */
    private com.xius.xbus.messages.billing.tariff.UseParentCoreBalance useParentCoreBalance;

    /* Type of service that sharing to child */
    private com.xius.xbus.messages.billing.tariff.ServiceUnitType[] serviceUnit;

    public ChildAcctListsType() {
    }

    public ChildAcctListsType(
           java.lang.String msisdn,
           com.xius.xbus.messages.billing.tariff.UseParentCABalance useParentCABalance,
           com.xius.xbus.messages.billing.tariff.UseParentCoreBalance useParentCoreBalance,
           com.xius.xbus.messages.billing.tariff.ServiceUnitType[] serviceUnit) {
           this.msisdn = msisdn;
           this.useParentCABalance = useParentCABalance;
           this.useParentCoreBalance = useParentCoreBalance;
           this.serviceUnit = serviceUnit;
    }


    /**
     * Gets the msisdn value for this ChildAcctListsType.
     * 
     * @return msisdn   * Child mobile number
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ChildAcctListsType.
     * 
     * @param msisdn   * Child mobile number
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the useParentCABalance value for this ChildAcctListsType.
     * 
     * @return useParentCABalance   * Option to select either to use parent ca balance or not
     */
    public com.xius.xbus.messages.billing.tariff.UseParentCABalance getUseParentCABalance() {
        return useParentCABalance;
    }


    /**
     * Sets the useParentCABalance value for this ChildAcctListsType.
     * 
     * @param useParentCABalance   * Option to select either to use parent ca balance or not
     */
    public void setUseParentCABalance(com.xius.xbus.messages.billing.tariff.UseParentCABalance useParentCABalance) {
        this.useParentCABalance = useParentCABalance;
    }


    /**
     * Gets the useParentCoreBalance value for this ChildAcctListsType.
     * 
     * @return useParentCoreBalance   * Option to select either to use parent core balance or not
     */
    public com.xius.xbus.messages.billing.tariff.UseParentCoreBalance getUseParentCoreBalance() {
        return useParentCoreBalance;
    }


    /**
     * Sets the useParentCoreBalance value for this ChildAcctListsType.
     * 
     * @param useParentCoreBalance   * Option to select either to use parent core balance or not
     */
    public void setUseParentCoreBalance(com.xius.xbus.messages.billing.tariff.UseParentCoreBalance useParentCoreBalance) {
        this.useParentCoreBalance = useParentCoreBalance;
    }


    /**
     * Gets the serviceUnit value for this ChildAcctListsType.
     * 
     * @return serviceUnit   * Type of service that sharing to child
     */
    public com.xius.xbus.messages.billing.tariff.ServiceUnitType[] getServiceUnit() {
        return serviceUnit;
    }


    /**
     * Sets the serviceUnit value for this ChildAcctListsType.
     * 
     * @param serviceUnit   * Type of service that sharing to child
     */
    public void setServiceUnit(com.xius.xbus.messages.billing.tariff.ServiceUnitType[] serviceUnit) {
        this.serviceUnit = serviceUnit;
    }

    public com.xius.xbus.messages.billing.tariff.ServiceUnitType getServiceUnit(int i) {
        return this.serviceUnit[i];
    }

    public void setServiceUnit(int i, com.xius.xbus.messages.billing.tariff.ServiceUnitType _value) {
        this.serviceUnit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChildAcctListsType)) return false;
        ChildAcctListsType other = (ChildAcctListsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.useParentCABalance==null && other.getUseParentCABalance()==null) || 
             (this.useParentCABalance!=null &&
              this.useParentCABalance.equals(other.getUseParentCABalance()))) &&
            ((this.useParentCoreBalance==null && other.getUseParentCoreBalance()==null) || 
             (this.useParentCoreBalance!=null &&
              this.useParentCoreBalance.equals(other.getUseParentCoreBalance()))) &&
            ((this.serviceUnit==null && other.getServiceUnit()==null) || 
             (this.serviceUnit!=null &&
              java.util.Arrays.equals(this.serviceUnit, other.getServiceUnit())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getUseParentCABalance() != null) {
            _hashCode += getUseParentCABalance().hashCode();
        }
        if (getUseParentCoreBalance() != null) {
            _hashCode += getUseParentCoreBalance().hashCode();
        }
        if (getServiceUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceUnit(), i);
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
        new org.apache.axis.description.TypeDesc(ChildAcctListsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ChildAcctListsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParentCABalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "useParentCABalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "UseParentCABalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useParentCoreBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "useParentCoreBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "UseParentCoreBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceUnitType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
