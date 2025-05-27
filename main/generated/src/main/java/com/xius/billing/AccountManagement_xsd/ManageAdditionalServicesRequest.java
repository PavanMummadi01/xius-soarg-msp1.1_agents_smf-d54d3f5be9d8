/**
 * ManageAdditionalServicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ManageAdditionalServicesRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.ActionFlagType actionFlag;

    private java.lang.Long serviceId;

    private java.lang.String serviceName;

    private java.lang.Long airtimeCalId;

    private java.lang.Long pstnCalId;

    public ManageAdditionalServicesRequest() {
    }

    public ManageAdditionalServicesRequest(
           com.xius.billing.AccountManagement_xsd.ActionFlagType actionFlag,
           java.lang.Long serviceId,
           java.lang.String serviceName,
           java.lang.Long airtimeCalId,
           java.lang.Long pstnCalId) {
           this.actionFlag = actionFlag;
           this.serviceId = serviceId;
           this.serviceName = serviceName;
           this.airtimeCalId = airtimeCalId;
           this.pstnCalId = pstnCalId;
    }


    /**
     * Gets the actionFlag value for this ManageAdditionalServicesRequest.
     * 
     * @return actionFlag
     */
    public com.xius.billing.AccountManagement_xsd.ActionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageAdditionalServicesRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xius.billing.AccountManagement_xsd.ActionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the serviceId value for this ManageAdditionalServicesRequest.
     * 
     * @return serviceId
     */
    public java.lang.Long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ManageAdditionalServicesRequest.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceName value for this ManageAdditionalServicesRequest.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ManageAdditionalServicesRequest.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the airtimeCalId value for this ManageAdditionalServicesRequest.
     * 
     * @return airtimeCalId
     */
    public java.lang.Long getAirtimeCalId() {
        return airtimeCalId;
    }


    /**
     * Sets the airtimeCalId value for this ManageAdditionalServicesRequest.
     * 
     * @param airtimeCalId
     */
    public void setAirtimeCalId(java.lang.Long airtimeCalId) {
        this.airtimeCalId = airtimeCalId;
    }


    /**
     * Gets the pstnCalId value for this ManageAdditionalServicesRequest.
     * 
     * @return pstnCalId
     */
    public java.lang.Long getPstnCalId() {
        return pstnCalId;
    }


    /**
     * Sets the pstnCalId value for this ManageAdditionalServicesRequest.
     * 
     * @param pstnCalId
     */
    public void setPstnCalId(java.lang.Long pstnCalId) {
        this.pstnCalId = pstnCalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageAdditionalServicesRequest)) return false;
        ManageAdditionalServicesRequest other = (ManageAdditionalServicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.airtimeCalId==null && other.getAirtimeCalId()==null) || 
             (this.airtimeCalId!=null &&
              this.airtimeCalId.equals(other.getAirtimeCalId()))) &&
            ((this.pstnCalId==null && other.getPstnCalId()==null) || 
             (this.pstnCalId!=null &&
              this.pstnCalId.equals(other.getPstnCalId())));
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
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getAirtimeCalId() != null) {
            _hashCode += getAirtimeCalId().hashCode();
        }
        if (getPstnCalId() != null) {
            _hashCode += getPstnCalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageAdditionalServicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageAdditionalServicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeCalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "airtimeCalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstnCalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "pstnCalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
