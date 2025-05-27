/**
 * UpdateServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class UpdateServicesResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.tariff.UpdateServicesResponseSubscribedServices subscribedServices;

    private com.xius.xbus.messages.billing.tariff.UpdateServicesResponseUnSubscribedServices unSubscribedServices;

    private com.xius.xbus.messages.billing.tariff.UpdateServicesResponseInvalidServices invalidServices;

    public UpdateServicesResponse() {
    }

    public UpdateServicesResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.billing.tariff.UpdateServicesResponseSubscribedServices subscribedServices,
           com.xius.xbus.messages.billing.tariff.UpdateServicesResponseUnSubscribedServices unSubscribedServices,
           com.xius.xbus.messages.billing.tariff.UpdateServicesResponseInvalidServices invalidServices) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.subscribedServices = subscribedServices;
        this.unSubscribedServices = unSubscribedServices;
        this.invalidServices = invalidServices;
    }


    /**
     * Gets the subscribedServices value for this UpdateServicesResponse.
     * 
     * @return subscribedServices
     */
    public com.xius.xbus.messages.billing.tariff.UpdateServicesResponseSubscribedServices getSubscribedServices() {
        return subscribedServices;
    }


    /**
     * Sets the subscribedServices value for this UpdateServicesResponse.
     * 
     * @param subscribedServices
     */
    public void setSubscribedServices(com.xius.xbus.messages.billing.tariff.UpdateServicesResponseSubscribedServices subscribedServices) {
        this.subscribedServices = subscribedServices;
    }


    /**
     * Gets the unSubscribedServices value for this UpdateServicesResponse.
     * 
     * @return unSubscribedServices
     */
    public com.xius.xbus.messages.billing.tariff.UpdateServicesResponseUnSubscribedServices getUnSubscribedServices() {
        return unSubscribedServices;
    }


    /**
     * Sets the unSubscribedServices value for this UpdateServicesResponse.
     * 
     * @param unSubscribedServices
     */
    public void setUnSubscribedServices(com.xius.xbus.messages.billing.tariff.UpdateServicesResponseUnSubscribedServices unSubscribedServices) {
        this.unSubscribedServices = unSubscribedServices;
    }


    /**
     * Gets the invalidServices value for this UpdateServicesResponse.
     * 
     * @return invalidServices
     */
    public com.xius.xbus.messages.billing.tariff.UpdateServicesResponseInvalidServices getInvalidServices() {
        return invalidServices;
    }


    /**
     * Sets the invalidServices value for this UpdateServicesResponse.
     * 
     * @param invalidServices
     */
    public void setInvalidServices(com.xius.xbus.messages.billing.tariff.UpdateServicesResponseInvalidServices invalidServices) {
        this.invalidServices = invalidServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateServicesResponse)) return false;
        UpdateServicesResponse other = (UpdateServicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscribedServices==null && other.getSubscribedServices()==null) || 
             (this.subscribedServices!=null &&
              this.subscribedServices.equals(other.getSubscribedServices()))) &&
            ((this.unSubscribedServices==null && other.getUnSubscribedServices()==null) || 
             (this.unSubscribedServices!=null &&
              this.unSubscribedServices.equals(other.getUnSubscribedServices()))) &&
            ((this.invalidServices==null && other.getInvalidServices()==null) || 
             (this.invalidServices!=null &&
              this.invalidServices.equals(other.getInvalidServices())));
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
        if (getSubscribedServices() != null) {
            _hashCode += getSubscribedServices().hashCode();
        }
        if (getUnSubscribedServices() != null) {
            _hashCode += getUnSubscribedServices().hashCode();
        }
        if (getInvalidServices() != null) {
            _hashCode += getInvalidServices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">updateServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribedServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "subscribedServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>subscribedServices"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSubscribedServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "unSubscribedServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>unSubscribedServices"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "invalidServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">>updateServicesResponse>invalidServices"));
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
