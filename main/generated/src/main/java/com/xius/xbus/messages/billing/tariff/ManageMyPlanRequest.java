/**
 * ManageMyPlanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ManageMyPlanRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String actionFlag;

    private com.xius.xbus.messages.billing.tariff.CategoryType[] services;

    private java.lang.String totalCharge;

    private java.lang.String validityPeriod;

    private java.lang.Boolean rollOver;

    private com.xius.xbus.messages.billing.tariff.AutoRenewalType autoRenewal;

    private java.lang.Boolean midnightExp;

    private java.lang.String extTransId;

    private java.lang.String channel;

    public ManageMyPlanRequest() {
    }

    public ManageMyPlanRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String MSISDN,
           java.lang.String actionFlag,
           com.xius.xbus.messages.billing.tariff.CategoryType[] services,
           java.lang.String totalCharge,
           java.lang.String validityPeriod,
           java.lang.Boolean rollOver,
           com.xius.xbus.messages.billing.tariff.AutoRenewalType autoRenewal,
           java.lang.Boolean midnightExp,
           java.lang.String extTransId,
           java.lang.String channel) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.MSISDN = MSISDN;
        this.actionFlag = actionFlag;
        this.services = services;
        this.totalCharge = totalCharge;
        this.validityPeriod = validityPeriod;
        this.rollOver = rollOver;
        this.autoRenewal = autoRenewal;
        this.midnightExp = midnightExp;
        this.extTransId = extTransId;
        this.channel = channel;
    }


    /**
     * Gets the MSISDN value for this ManageMyPlanRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ManageMyPlanRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the actionFlag value for this ManageMyPlanRequest.
     * 
     * @return actionFlag
     */
    public java.lang.String getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageMyPlanRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(java.lang.String actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the services value for this ManageMyPlanRequest.
     * 
     * @return services
     */
    public com.xius.xbus.messages.billing.tariff.CategoryType[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this ManageMyPlanRequest.
     * 
     * @param services
     */
    public void setServices(com.xius.xbus.messages.billing.tariff.CategoryType[] services) {
        this.services = services;
    }


    /**
     * Gets the totalCharge value for this ManageMyPlanRequest.
     * 
     * @return totalCharge
     */
    public java.lang.String getTotalCharge() {
        return totalCharge;
    }


    /**
     * Sets the totalCharge value for this ManageMyPlanRequest.
     * 
     * @param totalCharge
     */
    public void setTotalCharge(java.lang.String totalCharge) {
        this.totalCharge = totalCharge;
    }


    /**
     * Gets the validityPeriod value for this ManageMyPlanRequest.
     * 
     * @return validityPeriod
     */
    public java.lang.String getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this ManageMyPlanRequest.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(java.lang.String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the rollOver value for this ManageMyPlanRequest.
     * 
     * @return rollOver
     */
    public java.lang.Boolean getRollOver() {
        return rollOver;
    }


    /**
     * Sets the rollOver value for this ManageMyPlanRequest.
     * 
     * @param rollOver
     */
    public void setRollOver(java.lang.Boolean rollOver) {
        this.rollOver = rollOver;
    }


    /**
     * Gets the autoRenewal value for this ManageMyPlanRequest.
     * 
     * @return autoRenewal
     */
    public com.xius.xbus.messages.billing.tariff.AutoRenewalType getAutoRenewal() {
        return autoRenewal;
    }


    /**
     * Sets the autoRenewal value for this ManageMyPlanRequest.
     * 
     * @param autoRenewal
     */
    public void setAutoRenewal(com.xius.xbus.messages.billing.tariff.AutoRenewalType autoRenewal) {
        this.autoRenewal = autoRenewal;
    }


    /**
     * Gets the midnightExp value for this ManageMyPlanRequest.
     * 
     * @return midnightExp
     */
    public java.lang.Boolean getMidnightExp() {
        return midnightExp;
    }


    /**
     * Sets the midnightExp value for this ManageMyPlanRequest.
     * 
     * @param midnightExp
     */
    public void setMidnightExp(java.lang.Boolean midnightExp) {
        this.midnightExp = midnightExp;
    }


    /**
     * Gets the extTransId value for this ManageMyPlanRequest.
     * 
     * @return extTransId
     */
    public java.lang.String getExtTransId() {
        return extTransId;
    }


    /**
     * Sets the extTransId value for this ManageMyPlanRequest.
     * 
     * @param extTransId
     */
    public void setExtTransId(java.lang.String extTransId) {
        this.extTransId = extTransId;
    }


    /**
     * Gets the channel value for this ManageMyPlanRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ManageMyPlanRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageMyPlanRequest)) return false;
        ManageMyPlanRequest other = (ManageMyPlanRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            ((this.totalCharge==null && other.getTotalCharge()==null) || 
             (this.totalCharge!=null &&
              this.totalCharge.equals(other.getTotalCharge()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod()))) &&
            ((this.rollOver==null && other.getRollOver()==null) || 
             (this.rollOver!=null &&
              this.rollOver.equals(other.getRollOver()))) &&
            ((this.autoRenewal==null && other.getAutoRenewal()==null) || 
             (this.autoRenewal!=null &&
              this.autoRenewal.equals(other.getAutoRenewal()))) &&
            ((this.midnightExp==null && other.getMidnightExp()==null) || 
             (this.midnightExp!=null &&
              this.midnightExp.equals(other.getMidnightExp()))) &&
            ((this.extTransId==null && other.getExtTransId()==null) || 
             (this.extTransId!=null &&
              this.extTransId.equals(other.getExtTransId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalCharge() != null) {
            _hashCode += getTotalCharge().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        if (getRollOver() != null) {
            _hashCode += getRollOver().hashCode();
        }
        if (getAutoRenewal() != null) {
            _hashCode += getAutoRenewal().hashCode();
        }
        if (getMidnightExp() != null) {
            _hashCode += getMidnightExp().hashCode();
        }
        if (getExtTransId() != null) {
            _hashCode += getExtTransId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageMyPlanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageMyPlanRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "CategoryType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "category"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "totalCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "validityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollOver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "rollOver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRenewal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "autoRenewal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "AutoRenewalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midnightExp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "midnightExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "extTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "channel"));
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
