/**
 * ChangeTariffPlanResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ChangeTariffPlanResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String oldTariffPlanName;

    private java.lang.String newTariffPlan;

    public ChangeTariffPlanResponse() {
    }

    public ChangeTariffPlanResponse(
           java.lang.String message,
           java.lang.String oldTariffPlanName,
           java.lang.String newTariffPlan) {
           this.message = message;
           this.oldTariffPlanName = oldTariffPlanName;
           this.newTariffPlan = newTariffPlan;
    }


    /**
     * Gets the message value for this ChangeTariffPlanResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ChangeTariffPlanResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the oldTariffPlanName value for this ChangeTariffPlanResponse.
     * 
     * @return oldTariffPlanName
     */
    public java.lang.String getOldTariffPlanName() {
        return oldTariffPlanName;
    }


    /**
     * Sets the oldTariffPlanName value for this ChangeTariffPlanResponse.
     * 
     * @param oldTariffPlanName
     */
    public void setOldTariffPlanName(java.lang.String oldTariffPlanName) {
        this.oldTariffPlanName = oldTariffPlanName;
    }


    /**
     * Gets the newTariffPlan value for this ChangeTariffPlanResponse.
     * 
     * @return newTariffPlan
     */
    public java.lang.String getNewTariffPlan() {
        return newTariffPlan;
    }


    /**
     * Sets the newTariffPlan value for this ChangeTariffPlanResponse.
     * 
     * @param newTariffPlan
     */
    public void setNewTariffPlan(java.lang.String newTariffPlan) {
        this.newTariffPlan = newTariffPlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeTariffPlanResponse)) return false;
        ChangeTariffPlanResponse other = (ChangeTariffPlanResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.oldTariffPlanName==null && other.getOldTariffPlanName()==null) || 
             (this.oldTariffPlanName!=null &&
              this.oldTariffPlanName.equals(other.getOldTariffPlanName()))) &&
            ((this.newTariffPlan==null && other.getNewTariffPlan()==null) || 
             (this.newTariffPlan!=null &&
              this.newTariffPlan.equals(other.getNewTariffPlan())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getOldTariffPlanName() != null) {
            _hashCode += getOldTariffPlanName().hashCode();
        }
        if (getNewTariffPlan() != null) {
            _hashCode += getNewTariffPlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeTariffPlanResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTariffPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "oldTariffPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "newTariffPlan"));
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
