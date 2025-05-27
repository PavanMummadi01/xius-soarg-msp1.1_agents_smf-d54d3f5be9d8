/**
 * UpdateServicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class UpdateServicesRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.BillingAccountIdKey billingAccount;

    private java.lang.String operator;

    private java.lang.String activityID;

    private java.lang.String ipAddress;

    private com.xius.xbus.messages.billing.tariff.Service[] servicesList;

    public UpdateServicesRequest() {
    }

    public UpdateServicesRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.BillingAccountIdKey billingAccount,
           java.lang.String operator,
           java.lang.String activityID,
           java.lang.String ipAddress,
           com.xius.xbus.messages.billing.tariff.Service[] servicesList) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.billingAccount = billingAccount;
        this.operator = operator;
        this.activityID = activityID;
        this.ipAddress = ipAddress;
        this.servicesList = servicesList;
    }


    /**
     * Gets the billingAccount value for this UpdateServicesRequest.
     * 
     * @return billingAccount
     */
    public com.xius.xbus.messages.common.BillingAccountIdKey getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this UpdateServicesRequest.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.xius.xbus.messages.common.BillingAccountIdKey billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the operator value for this UpdateServicesRequest.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this UpdateServicesRequest.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the activityID value for this UpdateServicesRequest.
     * 
     * @return activityID
     */
    public java.lang.String getActivityID() {
        return activityID;
    }


    /**
     * Sets the activityID value for this UpdateServicesRequest.
     * 
     * @param activityID
     */
    public void setActivityID(java.lang.String activityID) {
        this.activityID = activityID;
    }


    /**
     * Gets the ipAddress value for this UpdateServicesRequest.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this UpdateServicesRequest.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the servicesList value for this UpdateServicesRequest.
     * 
     * @return servicesList
     */
    public com.xius.xbus.messages.billing.tariff.Service[] getServicesList() {
        return servicesList;
    }


    /**
     * Sets the servicesList value for this UpdateServicesRequest.
     * 
     * @param servicesList
     */
    public void setServicesList(com.xius.xbus.messages.billing.tariff.Service[] servicesList) {
        this.servicesList = servicesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateServicesRequest)) return false;
        UpdateServicesRequest other = (UpdateServicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.activityID==null && other.getActivityID()==null) || 
             (this.activityID!=null &&
              this.activityID.equals(other.getActivityID()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.servicesList==null && other.getServicesList()==null) || 
             (this.servicesList!=null &&
              java.util.Arrays.equals(this.servicesList, other.getServicesList())));
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
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getActivityID() != null) {
            _hashCode += getActivityID().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getServicesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicesList(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateServicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">updateServicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAccountIdKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "activityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "servicesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceList"));
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
