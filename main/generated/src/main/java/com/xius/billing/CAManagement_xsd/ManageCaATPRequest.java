/**
 * ManageCaATPRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class ManageCaATPRequest  implements java.io.Serializable {
    private com.xius.billing.CAManagement_xsd.CAGroupType caGroup;

    private java.lang.String caUserType;

    private java.lang.Long svcPlanId;

    private java.lang.Long typeOfservice;

    private java.lang.String chargeId;

    private java.lang.String svcStartDate;

    private java.lang.String svcEndDate;

    private java.lang.String actDeactFlag;

    private java.lang.String serviceFlag;

    public ManageCaATPRequest() {
    }

    public ManageCaATPRequest(
           com.xius.billing.CAManagement_xsd.CAGroupType caGroup,
           java.lang.String caUserType,
           java.lang.Long svcPlanId,
           java.lang.Long typeOfservice,
           java.lang.String chargeId,
           java.lang.String svcStartDate,
           java.lang.String svcEndDate,
           java.lang.String actDeactFlag,
           java.lang.String serviceFlag) {
           this.caGroup = caGroup;
           this.caUserType = caUserType;
           this.svcPlanId = svcPlanId;
           this.typeOfservice = typeOfservice;
           this.chargeId = chargeId;
           this.svcStartDate = svcStartDate;
           this.svcEndDate = svcEndDate;
           this.actDeactFlag = actDeactFlag;
           this.serviceFlag = serviceFlag;
    }


    /**
     * Gets the caGroup value for this ManageCaATPRequest.
     * 
     * @return caGroup
     */
    public com.xius.billing.CAManagement_xsd.CAGroupType getCaGroup() {
        return caGroup;
    }


    /**
     * Sets the caGroup value for this ManageCaATPRequest.
     * 
     * @param caGroup
     */
    public void setCaGroup(com.xius.billing.CAManagement_xsd.CAGroupType caGroup) {
        this.caGroup = caGroup;
    }


    /**
     * Gets the caUserType value for this ManageCaATPRequest.
     * 
     * @return caUserType
     */
    public java.lang.String getCaUserType() {
        return caUserType;
    }


    /**
     * Sets the caUserType value for this ManageCaATPRequest.
     * 
     * @param caUserType
     */
    public void setCaUserType(java.lang.String caUserType) {
        this.caUserType = caUserType;
    }


    /**
     * Gets the svcPlanId value for this ManageCaATPRequest.
     * 
     * @return svcPlanId
     */
    public java.lang.Long getSvcPlanId() {
        return svcPlanId;
    }


    /**
     * Sets the svcPlanId value for this ManageCaATPRequest.
     * 
     * @param svcPlanId
     */
    public void setSvcPlanId(java.lang.Long svcPlanId) {
        this.svcPlanId = svcPlanId;
    }


    /**
     * Gets the typeOfservice value for this ManageCaATPRequest.
     * 
     * @return typeOfservice
     */
    public java.lang.Long getTypeOfservice() {
        return typeOfservice;
    }


    /**
     * Sets the typeOfservice value for this ManageCaATPRequest.
     * 
     * @param typeOfservice
     */
    public void setTypeOfservice(java.lang.Long typeOfservice) {
        this.typeOfservice = typeOfservice;
    }


    /**
     * Gets the chargeId value for this ManageCaATPRequest.
     * 
     * @return chargeId
     */
    public java.lang.String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this ManageCaATPRequest.
     * 
     * @param chargeId
     */
    public void setChargeId(java.lang.String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the svcStartDate value for this ManageCaATPRequest.
     * 
     * @return svcStartDate
     */
    public java.lang.String getSvcStartDate() {
        return svcStartDate;
    }


    /**
     * Sets the svcStartDate value for this ManageCaATPRequest.
     * 
     * @param svcStartDate
     */
    public void setSvcStartDate(java.lang.String svcStartDate) {
        this.svcStartDate = svcStartDate;
    }


    /**
     * Gets the svcEndDate value for this ManageCaATPRequest.
     * 
     * @return svcEndDate
     */
    public java.lang.String getSvcEndDate() {
        return svcEndDate;
    }


    /**
     * Sets the svcEndDate value for this ManageCaATPRequest.
     * 
     * @param svcEndDate
     */
    public void setSvcEndDate(java.lang.String svcEndDate) {
        this.svcEndDate = svcEndDate;
    }


    /**
     * Gets the actDeactFlag value for this ManageCaATPRequest.
     * 
     * @return actDeactFlag
     */
    public java.lang.String getActDeactFlag() {
        return actDeactFlag;
    }


    /**
     * Sets the actDeactFlag value for this ManageCaATPRequest.
     * 
     * @param actDeactFlag
     */
    public void setActDeactFlag(java.lang.String actDeactFlag) {
        this.actDeactFlag = actDeactFlag;
    }


    /**
     * Gets the serviceFlag value for this ManageCaATPRequest.
     * 
     * @return serviceFlag
     */
    public java.lang.String getServiceFlag() {
        return serviceFlag;
    }


    /**
     * Sets the serviceFlag value for this ManageCaATPRequest.
     * 
     * @param serviceFlag
     */
    public void setServiceFlag(java.lang.String serviceFlag) {
        this.serviceFlag = serviceFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageCaATPRequest)) return false;
        ManageCaATPRequest other = (ManageCaATPRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caGroup==null && other.getCaGroup()==null) || 
             (this.caGroup!=null &&
              this.caGroup.equals(other.getCaGroup()))) &&
            ((this.caUserType==null && other.getCaUserType()==null) || 
             (this.caUserType!=null &&
              this.caUserType.equals(other.getCaUserType()))) &&
            ((this.svcPlanId==null && other.getSvcPlanId()==null) || 
             (this.svcPlanId!=null &&
              this.svcPlanId.equals(other.getSvcPlanId()))) &&
            ((this.typeOfservice==null && other.getTypeOfservice()==null) || 
             (this.typeOfservice!=null &&
              this.typeOfservice.equals(other.getTypeOfservice()))) &&
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
              this.serviceFlag.equals(other.getServiceFlag())));
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
        if (getCaGroup() != null) {
            _hashCode += getCaGroup().hashCode();
        }
        if (getCaUserType() != null) {
            _hashCode += getCaUserType().hashCode();
        }
        if (getSvcPlanId() != null) {
            _hashCode += getSvcPlanId().hashCode();
        }
        if (getTypeOfservice() != null) {
            _hashCode += getTypeOfservice().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageCaATPRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "ManageCaATPRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "CAGroupType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caUserType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "caUserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "svcPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfservice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "typeOfservice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "chargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "svcStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "svcEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actDeactFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "actDeactFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "serviceFlag"));
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
