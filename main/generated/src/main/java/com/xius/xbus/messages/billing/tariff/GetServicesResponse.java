/**
 * GetServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetServicesResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.math.BigInteger accountID;

    private java.lang.String tariffPlanName;

    private com.xius.xbus.messages.billing.tariff.SubscribeServiceSuccessType[] servicePlan;

    public GetServicesResponse() {
    }

    public GetServicesResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.math.BigInteger accountID,
           java.lang.String tariffPlanName,
           com.xius.xbus.messages.billing.tariff.SubscribeServiceSuccessType[] servicePlan) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.accountID = accountID;
        this.tariffPlanName = tariffPlanName;
        this.servicePlan = servicePlan;
    }


    /**
     * Gets the accountID value for this GetServicesResponse.
     * 
     * @return accountID
     */
    public java.math.BigInteger getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this GetServicesResponse.
     * 
     * @param accountID
     */
    public void setAccountID(java.math.BigInteger accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the tariffPlanName value for this GetServicesResponse.
     * 
     * @return tariffPlanName
     */
    public java.lang.String getTariffPlanName() {
        return tariffPlanName;
    }


    /**
     * Sets the tariffPlanName value for this GetServicesResponse.
     * 
     * @param tariffPlanName
     */
    public void setTariffPlanName(java.lang.String tariffPlanName) {
        this.tariffPlanName = tariffPlanName;
    }


    /**
     * Gets the servicePlan value for this GetServicesResponse.
     * 
     * @return servicePlan
     */
    public com.xius.xbus.messages.billing.tariff.SubscribeServiceSuccessType[] getServicePlan() {
        return servicePlan;
    }


    /**
     * Sets the servicePlan value for this GetServicesResponse.
     * 
     * @param servicePlan
     */
    public void setServicePlan(com.xius.xbus.messages.billing.tariff.SubscribeServiceSuccessType[] servicePlan) {
        this.servicePlan = servicePlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServicesResponse)) return false;
        GetServicesResponse other = (GetServicesResponse) obj;
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
            ((this.tariffPlanName==null && other.getTariffPlanName()==null) || 
             (this.tariffPlanName!=null &&
              this.tariffPlanName.equals(other.getTariffPlanName()))) &&
            ((this.servicePlan==null && other.getServicePlan()==null) || 
             (this.servicePlan!=null &&
              java.util.Arrays.equals(this.servicePlan, other.getServicePlan())));
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
        if (getTariffPlanName() != null) {
            _hashCode += getTariffPlanName().hashCode();
        }
        if (getServicePlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicePlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicePlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("servicePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "servicePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "SubscribeServiceSuccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "availableServicePlans"));
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
