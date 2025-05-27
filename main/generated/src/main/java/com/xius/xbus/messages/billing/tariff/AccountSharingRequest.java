/**
 * AccountSharingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class AccountSharingRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    /* Type of action -( ADD, UPDATE,DELETE_CHILD,DEACTIVATE) */
    private com.xius.xbus.messages.common.GroupActionType actionFlag;

    /* Parent information */
    private com.xius.xbus.messages.billing.tariff.ParentInfoType parentInfo;

    public AccountSharingRequest() {
    }

    public AccountSharingRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.GroupActionType actionFlag,
           com.xius.xbus.messages.billing.tariff.ParentInfoType parentInfo) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.actionFlag = actionFlag;
        this.parentInfo = parentInfo;
    }


    /**
     * Gets the actionFlag value for this AccountSharingRequest.
     * 
     * @return actionFlag   * Type of action -( ADD, UPDATE,DELETE_CHILD,DEACTIVATE)
     */
    public com.xius.xbus.messages.common.GroupActionType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this AccountSharingRequest.
     * 
     * @param actionFlag   * Type of action -( ADD, UPDATE,DELETE_CHILD,DEACTIVATE)
     */
    public void setActionFlag(com.xius.xbus.messages.common.GroupActionType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the parentInfo value for this AccountSharingRequest.
     * 
     * @return parentInfo   * Parent information
     */
    public com.xius.xbus.messages.billing.tariff.ParentInfoType getParentInfo() {
        return parentInfo;
    }


    /**
     * Sets the parentInfo value for this AccountSharingRequest.
     * 
     * @param parentInfo   * Parent information
     */
    public void setParentInfo(com.xius.xbus.messages.billing.tariff.ParentInfoType parentInfo) {
        this.parentInfo = parentInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSharingRequest)) return false;
        AccountSharingRequest other = (AccountSharingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            ((this.parentInfo==null && other.getParentInfo()==null) || 
             (this.parentInfo!=null &&
              this.parentInfo.equals(other.getParentInfo())));
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
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        if (getParentInfo() != null) {
            _hashCode += getParentInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountSharingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">accountSharingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "GroupActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "parentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ParentInfoType"));
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
