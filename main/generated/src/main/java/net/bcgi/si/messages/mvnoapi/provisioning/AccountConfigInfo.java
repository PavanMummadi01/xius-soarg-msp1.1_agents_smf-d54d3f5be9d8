/**
 * AccountConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class AccountConfigInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType accountStatus;

    private net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType billingMethodType;

    private net.bcgi.si.messages.mvnoapi.provisioning.CustomerType customerType;

    private org.apache.axis.message.MessageElement [] _any;

    public AccountConfigInfo() {
    }

    public AccountConfigInfo(
           net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType accountStatus,
           net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType billingMethodType,
           net.bcgi.si.messages.mvnoapi.provisioning.CustomerType customerType,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountStatus = accountStatus;
           this.billingMethodType = billingMethodType;
           this.customerType = customerType;
           this._any = _any;
    }


    /**
     * Gets the accountStatus value for this AccountConfigInfo.
     * 
     * @return accountStatus
     */
    public net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this AccountConfigInfo.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(net.bcgi.si.messages.mvnoapi.common.SelfcareAccountStatusType accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the billingMethodType value for this AccountConfigInfo.
     * 
     * @return billingMethodType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType getBillingMethodType() {
        return billingMethodType;
    }


    /**
     * Sets the billingMethodType value for this AccountConfigInfo.
     * 
     * @param billingMethodType
     */
    public void setBillingMethodType(net.bcgi.si.messages.mvnoapi.provisioning.BillingMethodType billingMethodType) {
        this.billingMethodType = billingMethodType;
    }


    /**
     * Gets the customerType value for this AccountConfigInfo.
     * 
     * @return customerType
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.CustomerType getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this AccountConfigInfo.
     * 
     * @param customerType
     */
    public void setCustomerType(net.bcgi.si.messages.mvnoapi.provisioning.CustomerType customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the _any value for this AccountConfigInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountConfigInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountConfigInfo)) return false;
        AccountConfigInfo other = (AccountConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.billingMethodType==null && other.getBillingMethodType()==null) || 
             (this.billingMethodType!=null &&
              this.billingMethodType.equals(other.getBillingMethodType()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getBillingMethodType() != null) {
            _hashCode += getBillingMethodType().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(AccountConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SelfcareAccountStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingMethodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "billingMethodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "BillingMethodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "customerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "CustomerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
