/**
 * AddnlServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class AddnlServiceType  implements java.io.Serializable {
    private java.lang.Long svcPlanId;

    private java.lang.Long typeOfService;

    private java.lang.String chargeId;

    private java.lang.String svcStartDate;

    private java.lang.String svcEndDate;

    private java.lang.String actDeactFlag;

    private java.lang.String serviceFlag;

    private java.lang.Long atpUniqueId;

    public AddnlServiceType() {
    }

    public AddnlServiceType(
           java.lang.Long svcPlanId,
           java.lang.Long typeOfService,
           java.lang.String chargeId,
           java.lang.String svcStartDate,
           java.lang.String svcEndDate,
           java.lang.String actDeactFlag,
           java.lang.String serviceFlag,
           java.lang.Long atpUniqueId) {
           this.svcPlanId = svcPlanId;
           this.typeOfService = typeOfService;
           this.chargeId = chargeId;
           this.svcStartDate = svcStartDate;
           this.svcEndDate = svcEndDate;
           this.actDeactFlag = actDeactFlag;
           this.serviceFlag = serviceFlag;
           this.atpUniqueId = atpUniqueId;
    }


    /**
     * Gets the svcPlanId value for this AddnlServiceType.
     * 
     * @return svcPlanId
     */
    public java.lang.Long getSvcPlanId() {
        return svcPlanId;
    }


    /**
     * Sets the svcPlanId value for this AddnlServiceType.
     * 
     * @param svcPlanId
     */
    public void setSvcPlanId(java.lang.Long svcPlanId) {
        this.svcPlanId = svcPlanId;
    }


    /**
     * Gets the typeOfService value for this AddnlServiceType.
     * 
     * @return typeOfService
     */
    public java.lang.Long getTypeOfService() {
        return typeOfService;
    }


    /**
     * Sets the typeOfService value for this AddnlServiceType.
     * 
     * @param typeOfService
     */
    public void setTypeOfService(java.lang.Long typeOfService) {
        this.typeOfService = typeOfService;
    }


    /**
     * Gets the chargeId value for this AddnlServiceType.
     * 
     * @return chargeId
     */
    public java.lang.String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this AddnlServiceType.
     * 
     * @param chargeId
     */
    public void setChargeId(java.lang.String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the svcStartDate value for this AddnlServiceType.
     * 
     * @return svcStartDate
     */
    public java.lang.String getSvcStartDate() {
        return svcStartDate;
    }


    /**
     * Sets the svcStartDate value for this AddnlServiceType.
     * 
     * @param svcStartDate
     */
    public void setSvcStartDate(java.lang.String svcStartDate) {
        this.svcStartDate = svcStartDate;
    }


    /**
     * Gets the svcEndDate value for this AddnlServiceType.
     * 
     * @return svcEndDate
     */
    public java.lang.String getSvcEndDate() {
        return svcEndDate;
    }


    /**
     * Sets the svcEndDate value for this AddnlServiceType.
     * 
     * @param svcEndDate
     */
    public void setSvcEndDate(java.lang.String svcEndDate) {
        this.svcEndDate = svcEndDate;
    }


    /**
     * Gets the actDeactFlag value for this AddnlServiceType.
     * 
     * @return actDeactFlag
     */
    public java.lang.String getActDeactFlag() {
        return actDeactFlag;
    }


    /**
     * Sets the actDeactFlag value for this AddnlServiceType.
     * 
     * @param actDeactFlag
     */
    public void setActDeactFlag(java.lang.String actDeactFlag) {
        this.actDeactFlag = actDeactFlag;
    }


    /**
     * Gets the serviceFlag value for this AddnlServiceType.
     * 
     * @return serviceFlag
     */
    public java.lang.String getServiceFlag() {
        return serviceFlag;
    }


    /**
     * Sets the serviceFlag value for this AddnlServiceType.
     * 
     * @param serviceFlag
     */
    public void setServiceFlag(java.lang.String serviceFlag) {
        this.serviceFlag = serviceFlag;
    }


    /**
     * Gets the atpUniqueId value for this AddnlServiceType.
     * 
     * @return atpUniqueId
     */
    public java.lang.Long getAtpUniqueId() {
        return atpUniqueId;
    }


    /**
     * Sets the atpUniqueId value for this AddnlServiceType.
     * 
     * @param atpUniqueId
     */
    public void setAtpUniqueId(java.lang.Long atpUniqueId) {
        this.atpUniqueId = atpUniqueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddnlServiceType)) return false;
        AddnlServiceType other = (AddnlServiceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.svcPlanId==null && other.getSvcPlanId()==null) || 
             (this.svcPlanId!=null &&
              this.svcPlanId.equals(other.getSvcPlanId()))) &&
            ((this.typeOfService==null && other.getTypeOfService()==null) || 
             (this.typeOfService!=null &&
              this.typeOfService.equals(other.getTypeOfService()))) &&
            ((this.chargeId==null && other.getChargeId()==null) || 
             (this.chargeId!=null &&
              this.chargeId.equals(other.getChargeId()))) &&
            ((this.svcStartDate==null && other.getSvcStartDate()==null) || 
             (this.svcStartDate!=null &&
              this.svcStartDate.equals(other.getSvcStartDate()))) &&
            ((this.svcEndDate==null && other.getSvcEndDate()==null) || 
             (this.svcEndDate!=null &&
              this.svcEndDate.equals(other.getSvcEndDate()))) &&
            ((this.actDeactFlag==null && other.getActDeactFlag()==null) || 
             (this.actDeactFlag!=null &&
              this.actDeactFlag.equals(other.getActDeactFlag()))) &&
            ((this.serviceFlag==null && other.getServiceFlag()==null) || 
             (this.serviceFlag!=null &&
              this.serviceFlag.equals(other.getServiceFlag()))) &&
            ((this.atpUniqueId==null && other.getAtpUniqueId()==null) || 
             (this.atpUniqueId!=null &&
              this.atpUniqueId.equals(other.getAtpUniqueId())));
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
        if (getSvcPlanId() != null) {
            _hashCode += getSvcPlanId().hashCode();
        }
        if (getTypeOfService() != null) {
            _hashCode += getTypeOfService().hashCode();
        }
        if (getChargeId() != null) {
            _hashCode += getChargeId().hashCode();
        }
        if (getSvcStartDate() != null) {
            _hashCode += getSvcStartDate().hashCode();
        }
        if (getSvcEndDate() != null) {
            _hashCode += getSvcEndDate().hashCode();
        }
        if (getActDeactFlag() != null) {
            _hashCode += getActDeactFlag().hashCode();
        }
        if (getServiceFlag() != null) {
            _hashCode += getServiceFlag().hashCode();
        }
        if (getAtpUniqueId() != null) {
            _hashCode += getAtpUniqueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddnlServiceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addnlServiceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "svcPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "typeOfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "chargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "svcStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "svcEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actDeactFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "actDeactFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "serviceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpUniqueId"));
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
