/**
 * ManageFnFSMSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ManageFnFSMSRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.AccountType account;

    private com.xius.billing.SubscriberManagement_xsd.ProvisionType provisionType;

    private java.lang.String actionType;

    private java.lang.String[] numberList;

    private java.lang.String newNumber;

    public ManageFnFSMSRequest() {
    }

    public ManageFnFSMSRequest(
           com.xius.billing.SubscriberManagement_xsd.AccountType account,
           com.xius.billing.SubscriberManagement_xsd.ProvisionType provisionType,
           java.lang.String actionType,
           java.lang.String[] numberList,
           java.lang.String newNumber) {
           this.account = account;
           this.provisionType = provisionType;
           this.actionType = actionType;
           this.numberList = numberList;
           this.newNumber = newNumber;
    }


    /**
     * Gets the account value for this ManageFnFSMSRequest.
     * 
     * @return account
     */
    public com.xius.billing.SubscriberManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ManageFnFSMSRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.SubscriberManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the provisionType value for this ManageFnFSMSRequest.
     * 
     * @return provisionType
     */
    public com.xius.billing.SubscriberManagement_xsd.ProvisionType getProvisionType() {
        return provisionType;
    }


    /**
     * Sets the provisionType value for this ManageFnFSMSRequest.
     * 
     * @param provisionType
     */
    public void setProvisionType(com.xius.billing.SubscriberManagement_xsd.ProvisionType provisionType) {
        this.provisionType = provisionType;
    }


    /**
     * Gets the actionType value for this ManageFnFSMSRequest.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this ManageFnFSMSRequest.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the numberList value for this ManageFnFSMSRequest.
     * 
     * @return numberList
     */
    public java.lang.String[] getNumberList() {
        return numberList;
    }


    /**
     * Sets the numberList value for this ManageFnFSMSRequest.
     * 
     * @param numberList
     */
    public void setNumberList(java.lang.String[] numberList) {
        this.numberList = numberList;
    }


    /**
     * Gets the newNumber value for this ManageFnFSMSRequest.
     * 
     * @return newNumber
     */
    public java.lang.String getNewNumber() {
        return newNumber;
    }


    /**
     * Sets the newNumber value for this ManageFnFSMSRequest.
     * 
     * @param newNumber
     */
    public void setNewNumber(java.lang.String newNumber) {
        this.newNumber = newNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageFnFSMSRequest)) return false;
        ManageFnFSMSRequest other = (ManageFnFSMSRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.provisionType==null && other.getProvisionType()==null) || 
             (this.provisionType!=null &&
              this.provisionType.equals(other.getProvisionType()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.numberList==null && other.getNumberList()==null) || 
             (this.numberList!=null &&
              java.util.Arrays.equals(this.numberList, other.getNumberList()))) &&
            ((this.newNumber==null && other.getNewNumber()==null) || 
             (this.newNumber!=null &&
              this.newNumber.equals(other.getNewNumber())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getProvisionType() != null) {
            _hashCode += getProvisionType().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getNumberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewNumber() != null) {
            _hashCode += getNewNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageFnFSMSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageFnFSMSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ProvisionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ProvisionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ActionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Number"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NewNumber"));
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
