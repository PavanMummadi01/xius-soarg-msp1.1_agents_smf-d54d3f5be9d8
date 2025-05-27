/**
 * ChangeTariffPlanPreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ChangeTariffPlanPreInfoResponse  implements java.io.Serializable {
    private java.lang.Long accountID;

    private com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType currentTariffPlan;

    private com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType[] availableTariffPlan;

    private java.math.BigDecimal administrativeCharges;

    public ChangeTariffPlanPreInfoResponse() {
    }

    public ChangeTariffPlanPreInfoResponse(
           java.lang.Long accountID,
           com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType currentTariffPlan,
           com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType[] availableTariffPlan,
           java.math.BigDecimal administrativeCharges) {
           this.accountID = accountID;
           this.currentTariffPlan = currentTariffPlan;
           this.availableTariffPlan = availableTariffPlan;
           this.administrativeCharges = administrativeCharges;
    }


    /**
     * Gets the accountID value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @return accountID
     */
    public java.lang.Long getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Long accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the currentTariffPlan value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @return currentTariffPlan
     */
    public com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType getCurrentTariffPlan() {
        return currentTariffPlan;
    }


    /**
     * Sets the currentTariffPlan value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @param currentTariffPlan
     */
    public void setCurrentTariffPlan(com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType currentTariffPlan) {
        this.currentTariffPlan = currentTariffPlan;
    }


    /**
     * Gets the availableTariffPlan value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @return availableTariffPlan
     */
    public com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType[] getAvailableTariffPlan() {
        return availableTariffPlan;
    }


    /**
     * Sets the availableTariffPlan value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @param availableTariffPlan
     */
    public void setAvailableTariffPlan(com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType[] availableTariffPlan) {
        this.availableTariffPlan = availableTariffPlan;
    }

    public com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType getAvailableTariffPlan(int i) {
        return this.availableTariffPlan[i];
    }

    public void setAvailableTariffPlan(int i, com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType _value) {
        this.availableTariffPlan[i] = _value;
    }


    /**
     * Gets the administrativeCharges value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @return administrativeCharges
     */
    public java.math.BigDecimal getAdministrativeCharges() {
        return administrativeCharges;
    }


    /**
     * Sets the administrativeCharges value for this ChangeTariffPlanPreInfoResponse.
     * 
     * @param administrativeCharges
     */
    public void setAdministrativeCharges(java.math.BigDecimal administrativeCharges) {
        this.administrativeCharges = administrativeCharges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeTariffPlanPreInfoResponse)) return false;
        ChangeTariffPlanPreInfoResponse other = (ChangeTariffPlanPreInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.currentTariffPlan==null && other.getCurrentTariffPlan()==null) || 
             (this.currentTariffPlan!=null &&
              this.currentTariffPlan.equals(other.getCurrentTariffPlan()))) &&
            ((this.availableTariffPlan==null && other.getAvailableTariffPlan()==null) || 
             (this.availableTariffPlan!=null &&
              java.util.Arrays.equals(this.availableTariffPlan, other.getAvailableTariffPlan()))) &&
            ((this.administrativeCharges==null && other.getAdministrativeCharges()==null) || 
             (this.administrativeCharges!=null &&
              this.administrativeCharges.equals(other.getAdministrativeCharges())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getCurrentTariffPlan() != null) {
            _hashCode += getCurrentTariffPlan().hashCode();
        }
        if (getAvailableTariffPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableTariffPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableTariffPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdministrativeCharges() != null) {
            _hashCode += getAdministrativeCharges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeTariffPlanPreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanPreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "currentTariffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TariffPlanDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availableTariffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TariffPlanDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrativeCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "administrativeCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
