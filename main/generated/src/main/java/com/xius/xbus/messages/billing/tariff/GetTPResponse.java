/**
 * GetTPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetTPResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String accountID;

    private java.lang.String currentTariffPlanName;

    private com.xius.xbus.messages.billing.tariff.TPInfoType currentTariffPlan;

    private com.xius.xbus.messages.billing.tariff.TPInfoType[] availableTariffPlans;

    private java.math.BigDecimal charge;

    public GetTPResponse() {
    }

    public GetTPResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String accountID,
           java.lang.String currentTariffPlanName,
           com.xius.xbus.messages.billing.tariff.TPInfoType currentTariffPlan,
           com.xius.xbus.messages.billing.tariff.TPInfoType[] availableTariffPlans,
           java.math.BigDecimal charge) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.accountID = accountID;
        this.currentTariffPlanName = currentTariffPlanName;
        this.currentTariffPlan = currentTariffPlan;
        this.availableTariffPlans = availableTariffPlans;
        this.charge = charge;
    }


    /**
     * Gets the accountID value for this GetTPResponse.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this GetTPResponse.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the currentTariffPlanName value for this GetTPResponse.
     * 
     * @return currentTariffPlanName
     */
    public java.lang.String getCurrentTariffPlanName() {
        return currentTariffPlanName;
    }


    /**
     * Sets the currentTariffPlanName value for this GetTPResponse.
     * 
     * @param currentTariffPlanName
     */
    public void setCurrentTariffPlanName(java.lang.String currentTariffPlanName) {
        this.currentTariffPlanName = currentTariffPlanName;
    }


    /**
     * Gets the currentTariffPlan value for this GetTPResponse.
     * 
     * @return currentTariffPlan
     */
    public com.xius.xbus.messages.billing.tariff.TPInfoType getCurrentTariffPlan() {
        return currentTariffPlan;
    }


    /**
     * Sets the currentTariffPlan value for this GetTPResponse.
     * 
     * @param currentTariffPlan
     */
    public void setCurrentTariffPlan(com.xius.xbus.messages.billing.tariff.TPInfoType currentTariffPlan) {
        this.currentTariffPlan = currentTariffPlan;
    }


    /**
     * Gets the availableTariffPlans value for this GetTPResponse.
     * 
     * @return availableTariffPlans
     */
    public com.xius.xbus.messages.billing.tariff.TPInfoType[] getAvailableTariffPlans() {
        return availableTariffPlans;
    }


    /**
     * Sets the availableTariffPlans value for this GetTPResponse.
     * 
     * @param availableTariffPlans
     */
    public void setAvailableTariffPlans(com.xius.xbus.messages.billing.tariff.TPInfoType[] availableTariffPlans) {
        this.availableTariffPlans = availableTariffPlans;
    }

    public com.xius.xbus.messages.billing.tariff.TPInfoType getAvailableTariffPlans(int i) {
        return this.availableTariffPlans[i];
    }

    public void setAvailableTariffPlans(int i, com.xius.xbus.messages.billing.tariff.TPInfoType _value) {
        this.availableTariffPlans[i] = _value;
    }


    /**
     * Gets the charge value for this GetTPResponse.
     * 
     * @return charge
     */
    public java.math.BigDecimal getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this GetTPResponse.
     * 
     * @param charge
     */
    public void setCharge(java.math.BigDecimal charge) {
        this.charge = charge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTPResponse)) return false;
        GetTPResponse other = (GetTPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.currentTariffPlanName==null && other.getCurrentTariffPlanName()==null) || 
             (this.currentTariffPlanName!=null &&
              this.currentTariffPlanName.equals(other.getCurrentTariffPlanName()))) &&
            ((this.currentTariffPlan==null && other.getCurrentTariffPlan()==null) || 
             (this.currentTariffPlan!=null &&
              this.currentTariffPlan.equals(other.getCurrentTariffPlan()))) &&
            ((this.availableTariffPlans==null && other.getAvailableTariffPlans()==null) || 
             (this.availableTariffPlans!=null &&
              java.util.Arrays.equals(this.availableTariffPlans, other.getAvailableTariffPlans()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getCurrentTariffPlanName() != null) {
            _hashCode += getCurrentTariffPlanName().hashCode();
        }
        if (getCurrentTariffPlan() != null) {
            _hashCode += getCurrentTariffPlan().hashCode();
        }
        if (getAvailableTariffPlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableTariffPlans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableTariffPlans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getTPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTariffPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "currentTariffPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "currentTariffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "TPInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableTariffPlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "availableTariffPlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "TPInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "charge"));
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
