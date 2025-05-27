/**
 * TarrifPlanInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;


/**
 * This will hold customer's tarrif plan
 * 				information for tunetalk only
 */
public class TarrifPlanInfoType  implements java.io.Serializable {
    private java.lang.String tariffPlanId;

    private java.lang.String tariffPlanName;

    private java.lang.String SMSBundleInfoName;

    private java.lang.String GPRServiceStatus;

    private com.xius.xbus.messages.billing.tariff.ServiceType[] services;

    private java.lang.String rentalPeriod;

    private java.math.BigDecimal rentalAmount;

    public TarrifPlanInfoType() {
    }

    public TarrifPlanInfoType(
           java.lang.String tariffPlanId,
           java.lang.String tariffPlanName,
           java.lang.String SMSBundleInfoName,
           java.lang.String GPRServiceStatus,
           com.xius.xbus.messages.billing.tariff.ServiceType[] services,
           java.lang.String rentalPeriod,
           java.math.BigDecimal rentalAmount) {
           this.tariffPlanId = tariffPlanId;
           this.tariffPlanName = tariffPlanName;
           this.SMSBundleInfoName = SMSBundleInfoName;
           this.GPRServiceStatus = GPRServiceStatus;
           this.services = services;
           this.rentalPeriod = rentalPeriod;
           this.rentalAmount = rentalAmount;
    }


    /**
     * Gets the tariffPlanId value for this TarrifPlanInfoType.
     * 
     * @return tariffPlanId
     */
    public java.lang.String getTariffPlanId() {
        return tariffPlanId;
    }


    /**
     * Sets the tariffPlanId value for this TarrifPlanInfoType.
     * 
     * @param tariffPlanId
     */
    public void setTariffPlanId(java.lang.String tariffPlanId) {
        this.tariffPlanId = tariffPlanId;
    }


    /**
     * Gets the tariffPlanName value for this TarrifPlanInfoType.
     * 
     * @return tariffPlanName
     */
    public java.lang.String getTariffPlanName() {
        return tariffPlanName;
    }


    /**
     * Sets the tariffPlanName value for this TarrifPlanInfoType.
     * 
     * @param tariffPlanName
     */
    public void setTariffPlanName(java.lang.String tariffPlanName) {
        this.tariffPlanName = tariffPlanName;
    }


    /**
     * Gets the SMSBundleInfoName value for this TarrifPlanInfoType.
     * 
     * @return SMSBundleInfoName
     */
    public java.lang.String getSMSBundleInfoName() {
        return SMSBundleInfoName;
    }


    /**
     * Sets the SMSBundleInfoName value for this TarrifPlanInfoType.
     * 
     * @param SMSBundleInfoName
     */
    public void setSMSBundleInfoName(java.lang.String SMSBundleInfoName) {
        this.SMSBundleInfoName = SMSBundleInfoName;
    }


    /**
     * Gets the GPRServiceStatus value for this TarrifPlanInfoType.
     * 
     * @return GPRServiceStatus
     */
    public java.lang.String getGPRServiceStatus() {
        return GPRServiceStatus;
    }


    /**
     * Sets the GPRServiceStatus value for this TarrifPlanInfoType.
     * 
     * @param GPRServiceStatus
     */
    public void setGPRServiceStatus(java.lang.String GPRServiceStatus) {
        this.GPRServiceStatus = GPRServiceStatus;
    }


    /**
     * Gets the services value for this TarrifPlanInfoType.
     * 
     * @return services
     */
    public com.xius.xbus.messages.billing.tariff.ServiceType[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this TarrifPlanInfoType.
     * 
     * @param services
     */
    public void setServices(com.xius.xbus.messages.billing.tariff.ServiceType[] services) {
        this.services = services;
    }


    /**
     * Gets the rentalPeriod value for this TarrifPlanInfoType.
     * 
     * @return rentalPeriod
     */
    public java.lang.String getRentalPeriod() {
        return rentalPeriod;
    }


    /**
     * Sets the rentalPeriod value for this TarrifPlanInfoType.
     * 
     * @param rentalPeriod
     */
    public void setRentalPeriod(java.lang.String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }


    /**
     * Gets the rentalAmount value for this TarrifPlanInfoType.
     * 
     * @return rentalAmount
     */
    public java.math.BigDecimal getRentalAmount() {
        return rentalAmount;
    }


    /**
     * Sets the rentalAmount value for this TarrifPlanInfoType.
     * 
     * @param rentalAmount
     */
    public void setRentalAmount(java.math.BigDecimal rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TarrifPlanInfoType)) return false;
        TarrifPlanInfoType other = (TarrifPlanInfoType) obj;
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
              this.rentalAmount.equals(other.getRentalAmount())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TarrifPlanInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "TarrifPlanInfoType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "ServiceType"));
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
