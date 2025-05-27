/**
 * ServicePackInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;


/**
 * This will hold service pack information
 * 				information
 */
public class ServicePackInfoType  implements java.io.Serializable {
    private java.lang.Long svcPackId;

    private java.lang.String svcPackName;

    private java.lang.String svcPackStatus;

    private java.lang.Integer rentalPeriod;

    private java.math.BigDecimal rentalAmount;

    private java.lang.String chargeId;

    private java.lang.String serviceFlag;

    private java.lang.String typeOfService;

    private java.lang.String subUnsubFlag;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.math.BigDecimal activationFee;

    private java.lang.Long svcPlanId;

    private java.lang.String svcPlanName;

    private java.lang.String caSvcpkgFlag;

    private java.lang.String publicityId;

    private java.lang.String atpUniqueId;

    public ServicePackInfoType() {
    }

    public ServicePackInfoType(
           java.lang.Long svcPackId,
           java.lang.String svcPackName,
           java.lang.String svcPackStatus,
           java.lang.Integer rentalPeriod,
           java.math.BigDecimal rentalAmount,
           java.lang.String chargeId,
           java.lang.String serviceFlag,
           java.lang.String typeOfService,
           java.lang.String subUnsubFlag,
           java.lang.String startDate,
           java.lang.String endDate,
           java.math.BigDecimal activationFee,
           java.lang.Long svcPlanId,
           java.lang.String svcPlanName,
           java.lang.String caSvcpkgFlag,
           java.lang.String publicityId,
           java.lang.String atpUniqueId) {
           this.svcPackId = svcPackId;
           this.svcPackName = svcPackName;
           this.svcPackStatus = svcPackStatus;
           this.rentalPeriod = rentalPeriod;
           this.rentalAmount = rentalAmount;
           this.chargeId = chargeId;
           this.serviceFlag = serviceFlag;
           this.typeOfService = typeOfService;
           this.subUnsubFlag = subUnsubFlag;
           this.startDate = startDate;
           this.endDate = endDate;
           this.activationFee = activationFee;
           this.svcPlanId = svcPlanId;
           this.svcPlanName = svcPlanName;
           this.caSvcpkgFlag = caSvcpkgFlag;
           this.publicityId = publicityId;
           this.atpUniqueId = atpUniqueId;
    }


    /**
     * Gets the svcPackId value for this ServicePackInfoType.
     * 
     * @return svcPackId
     */
    public java.lang.Long getSvcPackId() {
        return svcPackId;
    }


    /**
     * Sets the svcPackId value for this ServicePackInfoType.
     * 
     * @param svcPackId
     */
    public void setSvcPackId(java.lang.Long svcPackId) {
        this.svcPackId = svcPackId;
    }


    /**
     * Gets the svcPackName value for this ServicePackInfoType.
     * 
     * @return svcPackName
     */
    public java.lang.String getSvcPackName() {
        return svcPackName;
    }


    /**
     * Sets the svcPackName value for this ServicePackInfoType.
     * 
     * @param svcPackName
     */
    public void setSvcPackName(java.lang.String svcPackName) {
        this.svcPackName = svcPackName;
    }


    /**
     * Gets the svcPackStatus value for this ServicePackInfoType.
     * 
     * @return svcPackStatus
     */
    public java.lang.String getSvcPackStatus() {
        return svcPackStatus;
    }


    /**
     * Sets the svcPackStatus value for this ServicePackInfoType.
     * 
     * @param svcPackStatus
     */
    public void setSvcPackStatus(java.lang.String svcPackStatus) {
        this.svcPackStatus = svcPackStatus;
    }


    /**
     * Gets the rentalPeriod value for this ServicePackInfoType.
     * 
     * @return rentalPeriod
     */
    public java.lang.Integer getRentalPeriod() {
        return rentalPeriod;
    }


    /**
     * Sets the rentalPeriod value for this ServicePackInfoType.
     * 
     * @param rentalPeriod
     */
    public void setRentalPeriod(java.lang.Integer rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }


    /**
     * Gets the rentalAmount value for this ServicePackInfoType.
     * 
     * @return rentalAmount
     */
    public java.math.BigDecimal getRentalAmount() {
        return rentalAmount;
    }


    /**
     * Sets the rentalAmount value for this ServicePackInfoType.
     * 
     * @param rentalAmount
     */
    public void setRentalAmount(java.math.BigDecimal rentalAmount) {
        this.rentalAmount = rentalAmount;
    }


    /**
     * Gets the chargeId value for this ServicePackInfoType.
     * 
     * @return chargeId
     */
    public java.lang.String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this ServicePackInfoType.
     * 
     * @param chargeId
     */
    public void setChargeId(java.lang.String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the serviceFlag value for this ServicePackInfoType.
     * 
     * @return serviceFlag
     */
    public java.lang.String getServiceFlag() {
        return serviceFlag;
    }


    /**
     * Sets the serviceFlag value for this ServicePackInfoType.
     * 
     * @param serviceFlag
     */
    public void setServiceFlag(java.lang.String serviceFlag) {
        this.serviceFlag = serviceFlag;
    }


    /**
     * Gets the typeOfService value for this ServicePackInfoType.
     * 
     * @return typeOfService
     */
    public java.lang.String getTypeOfService() {
        return typeOfService;
    }


    /**
     * Sets the typeOfService value for this ServicePackInfoType.
     * 
     * @param typeOfService
     */
    public void setTypeOfService(java.lang.String typeOfService) {
        this.typeOfService = typeOfService;
    }


    /**
     * Gets the subUnsubFlag value for this ServicePackInfoType.
     * 
     * @return subUnsubFlag
     */
    public java.lang.String getSubUnsubFlag() {
        return subUnsubFlag;
    }


    /**
     * Sets the subUnsubFlag value for this ServicePackInfoType.
     * 
     * @param subUnsubFlag
     */
    public void setSubUnsubFlag(java.lang.String subUnsubFlag) {
        this.subUnsubFlag = subUnsubFlag;
    }


    /**
     * Gets the startDate value for this ServicePackInfoType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ServicePackInfoType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ServicePackInfoType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ServicePackInfoType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the activationFee value for this ServicePackInfoType.
     * 
     * @return activationFee
     */
    public java.math.BigDecimal getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this ServicePackInfoType.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.math.BigDecimal activationFee) {
        this.activationFee = activationFee;
    }


    /**
     * Gets the svcPlanId value for this ServicePackInfoType.
     * 
     * @return svcPlanId
     */
    public java.lang.Long getSvcPlanId() {
        return svcPlanId;
    }


    /**
     * Sets the svcPlanId value for this ServicePackInfoType.
     * 
     * @param svcPlanId
     */
    public void setSvcPlanId(java.lang.Long svcPlanId) {
        this.svcPlanId = svcPlanId;
    }


    /**
     * Gets the svcPlanName value for this ServicePackInfoType.
     * 
     * @return svcPlanName
     */
    public java.lang.String getSvcPlanName() {
        return svcPlanName;
    }


    /**
     * Sets the svcPlanName value for this ServicePackInfoType.
     * 
     * @param svcPlanName
     */
    public void setSvcPlanName(java.lang.String svcPlanName) {
        this.svcPlanName = svcPlanName;
    }


    /**
     * Gets the caSvcpkgFlag value for this ServicePackInfoType.
     * 
     * @return caSvcpkgFlag
     */
    public java.lang.String getCaSvcpkgFlag() {
        return caSvcpkgFlag;
    }


    /**
     * Sets the caSvcpkgFlag value for this ServicePackInfoType.
     * 
     * @param caSvcpkgFlag
     */
    public void setCaSvcpkgFlag(java.lang.String caSvcpkgFlag) {
        this.caSvcpkgFlag = caSvcpkgFlag;
    }


    /**
     * Gets the publicityId value for this ServicePackInfoType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this ServicePackInfoType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the atpUniqueId value for this ServicePackInfoType.
     * 
     * @return atpUniqueId
     */
    public java.lang.String getAtpUniqueId() {
        return atpUniqueId;
    }


    /**
     * Sets the atpUniqueId value for this ServicePackInfoType.
     * 
     * @param atpUniqueId
     */
    public void setAtpUniqueId(java.lang.String atpUniqueId) {
        this.atpUniqueId = atpUniqueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicePackInfoType)) return false;
        ServicePackInfoType other = (ServicePackInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.svcPackId==null && other.getSvcPackId()==null) || 
             (this.svcPackId!=null &&
              this.svcPackId.equals(other.getSvcPackId()))) &&
            ((this.svcPackName==null && other.getSvcPackName()==null) || 
             (this.svcPackName!=null &&
              this.svcPackName.equals(other.getSvcPackName()))) &&
            ((this.svcPackStatus==null && other.getSvcPackStatus()==null) || 
             (this.svcPackStatus!=null &&
              this.svcPackStatus.equals(other.getSvcPackStatus()))) &&
            ((this.rentalPeriod==null && other.getRentalPeriod()==null) || 
             (this.rentalPeriod!=null &&
              this.rentalPeriod.equals(other.getRentalPeriod()))) &&
            ((this.rentalAmount==null && other.getRentalAmount()==null) || 
             (this.rentalAmount!=null &&
              this.rentalAmount.equals(other.getRentalAmount()))) &&
            ((this.chargeId==null && other.getChargeId()==null) || 
             (this.chargeId!=null &&
              this.chargeId.equals(other.getChargeId()))) &&
            ((this.serviceFlag==null && other.getServiceFlag()==null) || 
             (this.serviceFlag!=null &&
              this.serviceFlag.equals(other.getServiceFlag()))) &&
            ((this.typeOfService==null && other.getTypeOfService()==null) || 
             (this.typeOfService!=null &&
              this.typeOfService.equals(other.getTypeOfService()))) &&
            ((this.subUnsubFlag==null && other.getSubUnsubFlag()==null) || 
             (this.subUnsubFlag!=null &&
              this.subUnsubFlag.equals(other.getSubUnsubFlag()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee()))) &&
            ((this.svcPlanId==null && other.getSvcPlanId()==null) || 
             (this.svcPlanId!=null &&
              this.svcPlanId.equals(other.getSvcPlanId()))) &&
            ((this.svcPlanName==null && other.getSvcPlanName()==null) || 
             (this.svcPlanName!=null &&
              this.svcPlanName.equals(other.getSvcPlanName()))) &&
            ((this.caSvcpkgFlag==null && other.getCaSvcpkgFlag()==null) || 
             (this.caSvcpkgFlag!=null &&
              this.caSvcpkgFlag.equals(other.getCaSvcpkgFlag()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
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
        if (getSvcPackId() != null) {
            _hashCode += getSvcPackId().hashCode();
        }
        if (getSvcPackName() != null) {
            _hashCode += getSvcPackName().hashCode();
        }
        if (getSvcPackStatus() != null) {
            _hashCode += getSvcPackStatus().hashCode();
        }
        if (getRentalPeriod() != null) {
            _hashCode += getRentalPeriod().hashCode();
        }
        if (getRentalAmount() != null) {
            _hashCode += getRentalAmount().hashCode();
        }
        if (getChargeId() != null) {
            _hashCode += getChargeId().hashCode();
        }
        if (getServiceFlag() != null) {
            _hashCode += getServiceFlag().hashCode();
        }
        if (getTypeOfService() != null) {
            _hashCode += getTypeOfService().hashCode();
        }
        if (getSubUnsubFlag() != null) {
            _hashCode += getSubUnsubFlag().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getActivationFee() != null) {
            _hashCode += getActivationFee().hashCode();
        }
        if (getSvcPlanId() != null) {
            _hashCode += getSvcPlanId().hashCode();
        }
        if (getSvcPlanName() != null) {
            _hashCode += getSvcPlanName().hashCode();
        }
        if (getCaSvcpkgFlag() != null) {
            _hashCode += getCaSvcpkgFlag().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getAtpUniqueId() != null) {
            _hashCode += getAtpUniqueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePackInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServicePackInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcPackId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "svcPackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcPackName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "svcPackName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcPackStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "svcPackStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "rentalPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "rentalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "chargeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "serviceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "typeOfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subUnsubFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subUnsubFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "activationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "svcPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "svcPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caSvcpkgFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "caSvcpkgFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "atpUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
