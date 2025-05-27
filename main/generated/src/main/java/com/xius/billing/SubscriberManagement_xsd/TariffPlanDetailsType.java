/**
 * TariffPlanDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class TariffPlanDetailsType  implements java.io.Serializable {
    private java.lang.String tariffPlanId;

    private java.lang.String tariffPlanName;

    private java.math.BigDecimal price;

    private com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] servicePlansList;

    private java.math.BigDecimal activationFee;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String rentalPeriod;

    public TariffPlanDetailsType() {
    }

    public TariffPlanDetailsType(
           java.lang.String tariffPlanId,
           java.lang.String tariffPlanName,
           java.math.BigDecimal price,
           com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] servicePlansList,
           java.math.BigDecimal activationFee,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String rentalPeriod) {
           this.tariffPlanId = tariffPlanId;
           this.tariffPlanName = tariffPlanName;
           this.price = price;
           this.servicePlansList = servicePlansList;
           this.activationFee = activationFee;
           this.startDate = startDate;
           this.endDate = endDate;
           this.rentalPeriod = rentalPeriod;
    }


    /**
     * Gets the tariffPlanId value for this TariffPlanDetailsType.
     * 
     * @return tariffPlanId
     */
    public java.lang.String getTariffPlanId() {
        return tariffPlanId;
    }


    /**
     * Sets the tariffPlanId value for this TariffPlanDetailsType.
     * 
     * @param tariffPlanId
     */
    public void setTariffPlanId(java.lang.String tariffPlanId) {
        this.tariffPlanId = tariffPlanId;
    }


    /**
     * Gets the tariffPlanName value for this TariffPlanDetailsType.
     * 
     * @return tariffPlanName
     */
    public java.lang.String getTariffPlanName() {
        return tariffPlanName;
    }


    /**
     * Sets the tariffPlanName value for this TariffPlanDetailsType.
     * 
     * @param tariffPlanName
     */
    public void setTariffPlanName(java.lang.String tariffPlanName) {
        this.tariffPlanName = tariffPlanName;
    }


    /**
     * Gets the price value for this TariffPlanDetailsType.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this TariffPlanDetailsType.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the servicePlansList value for this TariffPlanDetailsType.
     * 
     * @return servicePlansList
     */
    public com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] getServicePlansList() {
        return servicePlansList;
    }


    /**
     * Sets the servicePlansList value for this TariffPlanDetailsType.
     * 
     * @param servicePlansList
     */
    public void setServicePlansList(com.xius.billing.SubscriberManagement_xsd.ServicePlanType[] servicePlansList) {
        this.servicePlansList = servicePlansList;
    }


    /**
     * Gets the activationFee value for this TariffPlanDetailsType.
     * 
     * @return activationFee
     */
    public java.math.BigDecimal getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this TariffPlanDetailsType.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.math.BigDecimal activationFee) {
        this.activationFee = activationFee;
    }


    /**
     * Gets the startDate value for this TariffPlanDetailsType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TariffPlanDetailsType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TariffPlanDetailsType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TariffPlanDetailsType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the rentalPeriod value for this TariffPlanDetailsType.
     * 
     * @return rentalPeriod
     */
    public java.lang.String getRentalPeriod() {
        return rentalPeriod;
    }


    /**
     * Sets the rentalPeriod value for this TariffPlanDetailsType.
     * 
     * @param rentalPeriod
     */
    public void setRentalPeriod(java.lang.String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TariffPlanDetailsType)) return false;
        TariffPlanDetailsType other = (TariffPlanDetailsType) obj;
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
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.servicePlansList==null && other.getServicePlansList()==null) || 
             (this.servicePlansList!=null &&
              java.util.Arrays.equals(this.servicePlansList, other.getServicePlansList()))) &&
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.rentalPeriod==null && other.getRentalPeriod()==null) || 
             (this.rentalPeriod!=null &&
              this.rentalPeriod.equals(other.getRentalPeriod())));
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
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getServicePlansList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicePlansList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicePlansList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getRentalPeriod() != null) {
            _hashCode += getRentalPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TariffPlanDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TariffPlanDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePlansList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePlansList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicePlanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePlan"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "rentalPeriod"));
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
