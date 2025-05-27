/**
 * ManageComuniAcctRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class ManageComuniAcctRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.ManageType actionFlag;

    private com.xius.xbus.messages.selfcare.communityaccountservice.CommunityGroupType communityGroup;

    public ManageComuniAcctRequest() {
    }

    public ManageComuniAcctRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.ManageType actionFlag,
           com.xius.xbus.messages.selfcare.communityaccountservice.CommunityGroupType communityGroup) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.actionFlag = actionFlag;
        this.communityGroup = communityGroup;
    }


    /**
     * Gets the actionFlag value for this ManageComuniAcctRequest.
     * 
     * @return actionFlag
     */
    public com.xius.xbus.messages.common.ManageType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageComuniAcctRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xius.xbus.messages.common.ManageType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the communityGroup value for this ManageComuniAcctRequest.
     * 
     * @return communityGroup
     */
    public com.xius.xbus.messages.selfcare.communityaccountservice.CommunityGroupType getCommunityGroup() {
        return communityGroup;
    }


    /**
     * Sets the communityGroup value for this ManageComuniAcctRequest.
     * 
     * @param communityGroup
     */
    public void setCommunityGroup(com.xius.xbus.messages.selfcare.communityaccountservice.CommunityGroupType communityGroup) {
        this.communityGroup = communityGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageComuniAcctRequest)) return false;
        ManageComuniAcctRequest other = (ManageComuniAcctRequest) obj;
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
            ((this.communityGroup==null && other.getCommunityGroup()==null) || 
             (this.communityGroup!=null &&
              this.communityGroup.equals(other.getCommunityGroup())));
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
        if (getCommunityGroup() != null) {
            _hashCode += getCommunityGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageComuniAcctRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", ">ManageComuniAcctRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ManageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "communityGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CommunityGroupType"));
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
