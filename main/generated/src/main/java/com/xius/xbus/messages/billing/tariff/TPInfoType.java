/**
 * TPInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;


/**
 * This will hold customer's tarrif plan
 * 				information
 */
public class TPInfoType  implements java.io.Serializable {
    private java.lang.String tariffPlanId;

    private java.lang.String tariffPlanName;

    private java.lang.String SMSBundleInfoName;

    private java.lang.String GPRServiceStatus;

    private com.xius.xbus.messages.billing.tariff.ServiceListType[] services;

    private java.lang.String rentalPeriod;

    private java.math.BigDecimal rentalAmount;

    private java.math.BigDecimal activationFee;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Long svcPackId;

    private java.lang.String svcPackName;

    public TPInfoType() {
    }

    public TPInfoType(
           java.lang.String tariffPlanId,
           java.lang.String tariffPlanName,
           java.lang.String SMSBundleInfoName,
           java.lang.String GPRServiceStatus,
           com.xius.xbus.messages.billing.tariff.ServiceListType[] services,
           java.lang.String rentalPeriod,
           java.math.BigDecimal rentalAmount,
           java.math.BigDecimal activationFee,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Long svcPackId,
           java.lang.String svcPackName) {
           this.tariffPlanId = tariffPlanId;
           this.tariffPlanName = tariffPlanName;
           this.SMSBundleInfoName = SMSBundleInfoName;
           this.GPRServiceStatus = GPRServiceStatus;
           this.services = services;
           this.rentalPeriod = rentalPeriod;
           this.rentalAmount = rentalAmount;
           this.activationFee = activationFee;
           this.startDate = startDate;
           this.endDate = endDate;
           this.svcPackId = svcPackId;
           this.svcPackName = svcPackName;
    }


    /**
     * Gets the tariffPlanId value for this TPInfoType.
     * 
     * @return tariffPlanId
     */
    public java.lang.String getTariffPlanId() {
        return tariffPlanId;
    }


    /**
     * Sets the tariffPlanId value for this TPInfoType.
     * 
     * @param tariffPlanId
     */
    public void setTariffPlanId(java.lang.String tariffPlanId) {
        this.tariffPlanId = tariffPlanId;
    }


    /**
     * Gets the tariffPlanName value for this TPInfoType.
     * 
     * @return tariffPlanName
     */
    public java.lang.String getTariffPlanName() {
        return tariffPlanName;
    }


    /**
     * Sets the tariffPlanName value for this TPInfoType.
     * 
     * @param tariffPlanName
     */
    public void setTariffPlanName(java.lang.String tariffPlanName) {
        this.tariffPlanName = tariffPlanName;
    }


    /**
     * Gets the SMSBundleInfoName value for this TPInfoType.
     * 
     * @return SMSBundleInfoName
     */
    public java.lang.String getSMSBundleInfoName() {
        return SMSBundleInfoName;
    }


    /**
     * Sets the SMSBundleInfoName value for this TPInfoType.
     * 
     * @param SMSBundleInfoName
     */
    public void setSMSBundleInfoName(java.lang.String SMSBundleInfoName) {
        this.SMSBundleInfoName = SMSBundleInfoName;
    }


    /**
     * Gets the GPRServiceStatus value for this TPInfoType.
     * 
     * @return GPRServiceStatus
     */
    public java.lang.String getGPRServiceStatus() {
        return GPRServiceStatus;
    }


    /**
     * Sets the GPRServiceStatus value for this TPInfoType.
     * 
     * @param GPRServiceStatus
     */
    public void setGPRServiceStatus(java.lang.String GPRServiceStatus) {
        this.GPRServiceStatus = GPRServiceStatus;
    }


    /**
     * Gets the services value for this TPInfoType.
     * 
     * @return services
     */
    public com.xius.xbus.messages.billing.tariff.ServiceListType[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this TPInfoType.
     * 
     * @param services
     */
    public void setServices(com.xius.xbus.messages.billing.tariff.ServiceListType[] services) {
        this.services = services;
    }


    /**
     * Gets the rentalPeriod value for this TPInfoType.
     * 
     * @return rentalPeriod
     */
    public java.lang.String getRentalPeriod() {
        return rentalPeriod;
    }


    /**
     * Sets the rentalPeriod value for this TPInfoType.
     * 
     * @param rentalPeriod
     */
    public void setRentalPeriod(java.lang.String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }


    /**
     * Gets the rentalAmount value for this TPInfoType.
     * 
     * @return rentalAmount
     */
    public java.math.BigDecimal getRentalAmount() {
        return rentalAmount;
    }


    /**
     * Sets the rentalAmount value for this TPInfoType.
     * 
     * @param rentalAmount
     */
    public void setRentalAmount(java.math.BigDecimal rentalAmount) {
        this.rentalAmount = rentalAmount;
    }


    /**
     * Gets the activationFee value for this TPInfoType.
     * 
     * @return activationFee
     */
    public java.math.BigDecimal getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this TPInfoType.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.math.BigDecimal activationFee) {
        this.activationFee = activationFee;
    }


    /**
     * Gets the startDate value for this TPInfoType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TPInfoType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TPInfoType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TPInfoType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the svcPackId value for this TPInfoType.
     * 
     * @return svcPackId
     */
    public java.lang.Long getSvcPackId() {
        return svcPackId;
    }


    /**
     * Sets the svcPackId value for this TPInfoType.
     * 
     * @param svcPackId
     */
    public void setSvcPackId(java.lang.Long svcPackId) {
        this.svcPackId = svcPackId;
    }


    /**
     * Gets the svcPackName value for this TPInfoType.
     * 
     * @return svcPackName
     */
    public java.lang.String getSvcPackName() {
        return svcPackName;
    }


    /**
     * Sets the svcPackName value for this TPInfoType.
     * 
     * @param svcPackName
     */
    public void setSvcPackName(java.lang.String svcPackName) {
        this.svcPackName = svcPackName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPInfoType)) return false;
        TPInfoType other = (TPInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tariffPlanId==null && other.getTariffPlanId()==null) || 
             (this.tariffPlanId!=null &&
              this.tariffPlanId.equals(other.getTariffPlanId()))) &&
            ((this.tariffPlanName==null && other.getTariffPlanName()==null) || 
             (this.tariffPlanName!=null &&
              this.tariffPlanName.equals(other.getTariffPlanName()))) &&
            ((this.SMSBundleInfoName==null && other.getSMSBundleInfoName()==null) || 
             (this.SMSBundleInfoName!=null &&
              this.SMSBundleInfoName.equals(other.getSMSBundleInfoName()))) &&
            ((this.GPRServiceStatus==null && other.getGPRServiceStatus()==null) || 
             (this.GPRServiceStatus!=null &&
              this.GPRServiceStatus.equals(other.getGPRServiceStatus()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            ((this.rentalPeriod==null && other.getRentalPeriod()==null) || 
             (this.rentalPeriod!=null &&
              this.rentalPeriod.equals(other.getRentalPeriod()))) &&
            ((this.rentalAmount==null && other.getRentalAmount()==null) || 
             (this.rentalAmount!=null &&
              this.rentalAmount.equals(other.getRentalAmount()))) &&
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.svcPackId==null && other.getSvcPackId()==null) || 
             (this.svcPackId!=null &&
              this.svcPackId.equals(other.getSvcPackId()))) &&
            ((this.svcPackName==null && other.getSvcPackName()==null) || 
             (this.svcPackName!=null &&
              this.svcPackName.equals(other.getSvcPackName())));
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
        if (getTariffPlanId() != null) {
            _hashCode += getTariffPlanId().hashCode();
        }
        if (getTariffPlanName() != null) {
            _hashCode += getTariffPlanName().hashCode();
        }
        if (getSMSBundleInfoName() != null) {
            _hashCode += getSMSBundleInfoName().hashCode();
        }
        if (getGPRServiceStatus() != null) {
            _hashCode += getGPRServiceStatus().hashCode();
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
        if (getRentalPeriod() != null) {
            _hashCode += getRentalPeriod().hashCode();
        }
        if (getRentalAmount() != null) {
            _hashCode += getRentalAmount().hashCode();
        }
        if (getActivationFee() != null) {
            _hashCode += getActivationFee().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getSvcPackId() != null) {
            _hashCode += getSvcPackId().hashCode();
        }
        if (getSvcPackName() != null) {
            _hashCode += getSvcPackName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TPInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "TPInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "tariffPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "tariffPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSBundleInfoName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SMSBundleInfoName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPRServiceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "GPRServiceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "service"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "rentalPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "activationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
