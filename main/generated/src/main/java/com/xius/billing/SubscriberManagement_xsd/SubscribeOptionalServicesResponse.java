/**
 * SubscribeOptionalServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class SubscribeOptionalServicesResponse  implements java.io.Serializable {
    private java.lang.Long networkId;

    private java.lang.Long acctId;

    private java.lang.Long msisdn;

    private com.xius.billing.SubscriberManagement_xsd.SubscribedType subscribed;

    private com.xius.billing.SubscriberManagement_xsd.UnSubscribedType unSubscribed;

    private com.xius.billing.SubscriberManagement_xsd.InvalidServicesType invalidServices;

    private java.lang.String VMSNumber;

    private com.xius.billing.SubscriberManagement_xsd.ServicesInfoType[] servicesInfo;

    private java.lang.String serv_sub_fail_act_fee;

    public SubscribeOptionalServicesResponse() {
    }

    public SubscribeOptionalServicesResponse(
           java.lang.Long networkId,
           java.lang.Long acctId,
           java.lang.Long msisdn,
           com.xius.billing.SubscriberManagement_xsd.SubscribedType subscribed,
           com.xius.billing.SubscriberManagement_xsd.UnSubscribedType unSubscribed,
           com.xius.billing.SubscriberManagement_xsd.InvalidServicesType invalidServices,
           java.lang.String VMSNumber,
           com.xius.billing.SubscriberManagement_xsd.ServicesInfoType[] servicesInfo,
           java.lang.String serv_sub_fail_act_fee) {
           this.networkId = networkId;
           this.acctId = acctId;
           this.msisdn = msisdn;
           this.subscribed = subscribed;
           this.unSubscribed = unSubscribed;
           this.invalidServices = invalidServices;
           this.VMSNumber = VMSNumber;
           this.servicesInfo = servicesInfo;
           this.serv_sub_fail_act_fee = serv_sub_fail_act_fee;
    }


    /**
     * Gets the networkId value for this SubscribeOptionalServicesResponse.
     * 
     * @return networkId
     */
    public java.lang.Long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this SubscribeOptionalServicesResponse.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.Long networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the acctId value for this SubscribeOptionalServicesResponse.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SubscribeOptionalServicesResponse.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the msisdn value for this SubscribeOptionalServicesResponse.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SubscribeOptionalServicesResponse.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the subscribed value for this SubscribeOptionalServicesResponse.
     * 
     * @return subscribed
     */
    public com.xius.billing.SubscriberManagement_xsd.SubscribedType getSubscribed() {
        return subscribed;
    }


    /**
     * Sets the subscribed value for this SubscribeOptionalServicesResponse.
     * 
     * @param subscribed
     */
    public void setSubscribed(com.xius.billing.SubscriberManagement_xsd.SubscribedType subscribed) {
        this.subscribed = subscribed;
    }


    /**
     * Gets the unSubscribed value for this SubscribeOptionalServicesResponse.
     * 
     * @return unSubscribed
     */
    public com.xius.billing.SubscriberManagement_xsd.UnSubscribedType getUnSubscribed() {
        return unSubscribed;
    }


    /**
     * Sets the unSubscribed value for this SubscribeOptionalServicesResponse.
     * 
     * @param unSubscribed
     */
    public void setUnSubscribed(com.xius.billing.SubscriberManagement_xsd.UnSubscribedType unSubscribed) {
        this.unSubscribed = unSubscribed;
    }


    /**
     * Gets the invalidServices value for this SubscribeOptionalServicesResponse.
     * 
     * @return invalidServices
     */
    public com.xius.billing.SubscriberManagement_xsd.InvalidServicesType getInvalidServices() {
        return invalidServices;
    }


    /**
     * Sets the invalidServices value for this SubscribeOptionalServicesResponse.
     * 
     * @param invalidServices
     */
    public void setInvalidServices(com.xius.billing.SubscriberManagement_xsd.InvalidServicesType invalidServices) {
        this.invalidServices = invalidServices;
    }


    /**
     * Gets the VMSNumber value for this SubscribeOptionalServicesResponse.
     * 
     * @return VMSNumber
     */
    public java.lang.String getVMSNumber() {
        return VMSNumber;
    }


    /**
     * Sets the VMSNumber value for this SubscribeOptionalServicesResponse.
     * 
     * @param VMSNumber
     */
    public void setVMSNumber(java.lang.String VMSNumber) {
        this.VMSNumber = VMSNumber;
    }


    /**
     * Gets the servicesInfo value for this SubscribeOptionalServicesResponse.
     * 
     * @return servicesInfo
     */
    public com.xius.billing.SubscriberManagement_xsd.ServicesInfoType[] getServicesInfo() {
        return servicesInfo;
    }


    /**
     * Sets the servicesInfo value for this SubscribeOptionalServicesResponse.
     * 
     * @param servicesInfo
     */
    public void setServicesInfo(com.xius.billing.SubscriberManagement_xsd.ServicesInfoType[] servicesInfo) {
        this.servicesInfo = servicesInfo;
    }

    public com.xius.billing.SubscriberManagement_xsd.ServicesInfoType getServicesInfo(int i) {
        return this.servicesInfo[i];
    }

    public void setServicesInfo(int i, com.xius.billing.SubscriberManagement_xsd.ServicesInfoType _value) {
        this.servicesInfo[i] = _value;
    }


    /**
     * Gets the serv_sub_fail_act_fee value for this SubscribeOptionalServicesResponse.
     * 
     * @return serv_sub_fail_act_fee
     */
    public java.lang.String getServ_sub_fail_act_fee() {
        return serv_sub_fail_act_fee;
    }


    /**
     * Sets the serv_sub_fail_act_fee value for this SubscribeOptionalServicesResponse.
     * 
     * @param serv_sub_fail_act_fee
     */
    public void setServ_sub_fail_act_fee(java.lang.String serv_sub_fail_act_fee) {
        this.serv_sub_fail_act_fee = serv_sub_fail_act_fee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribeOptionalServicesResponse)) return false;
        SubscribeOptionalServicesResponse other = (SubscribeOptionalServicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.subscribed==null && other.getSubscribed()==null) || 
             (this.subscribed!=null &&
              this.subscribed.equals(other.getSubscribed()))) &&
            ((this.unSubscribed==null && other.getUnSubscribed()==null) || 
             (this.unSubscribed!=null &&
              this.unSubscribed.equals(other.getUnSubscribed()))) &&
            ((this.invalidServices==null && other.getInvalidServices()==null) || 
             (this.invalidServices!=null &&
              this.invalidServices.equals(other.getInvalidServices()))) &&
            ((this.VMSNumber==null && other.getVMSNumber()==null) || 
             (this.VMSNumber!=null &&
              this.VMSNumber.equals(other.getVMSNumber()))) &&
            ((this.servicesInfo==null && other.getServicesInfo()==null) || 
             (this.servicesInfo!=null &&
              java.util.Arrays.equals(this.servicesInfo, other.getServicesInfo()))) &&
            ((this.serv_sub_fail_act_fee==null && other.getServ_sub_fail_act_fee()==null) || 
             (this.serv_sub_fail_act_fee!=null &&
              this.serv_sub_fail_act_fee.equals(other.getServ_sub_fail_act_fee())));
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
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getSubscribed() != null) {
            _hashCode += getSubscribed().hashCode();
        }
        if (getUnSubscribed() != null) {
            _hashCode += getUnSubscribed().hashCode();
        }
        if (getInvalidServices() != null) {
            _hashCode += getInvalidServices().hashCode();
        }
        if (getVMSNumber() != null) {
            _hashCode += getVMSNumber().hashCode();
        }
        if (getServicesInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicesInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicesInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServ_sub_fail_act_fee() != null) {
            _hashCode += getServ_sub_fail_act_fee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribeOptionalServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeOptionalServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Subscribed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubscribed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubscribedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "InvalidServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "InvalidServicesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMSNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VMSNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicesInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serv_sub_fail_act_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "serv_sub_fail_act_fee"));
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
