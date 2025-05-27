/**
 * SubOptServicesPreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class SubOptServicesPreInfoResponse  implements java.io.Serializable {
    private java.math.BigInteger accountID;

    private java.lang.String tariffPlanName;

    private com.xius.billing.SubscriberManagement_xsd.SubscribeServiceSuccessType[] subOptServicesPreInfoSuccessService;

    public SubOptServicesPreInfoResponse() {
    }

    public SubOptServicesPreInfoResponse(
           java.math.BigInteger accountID,
           java.lang.String tariffPlanName,
           com.xius.billing.SubscriberManagement_xsd.SubscribeServiceSuccessType[] subOptServicesPreInfoSuccessService) {
           this.accountID = accountID;
           this.tariffPlanName = tariffPlanName;
           this.subOptServicesPreInfoSuccessService = subOptServicesPreInfoSuccessService;
    }


    /**
     * Gets the accountID value for this SubOptServicesPreInfoResponse.
     * 
     * @return accountID
     */
    public java.math.BigInteger getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this SubOptServicesPreInfoResponse.
     * 
     * @param accountID
     */
    public void setAccountID(java.math.BigInteger accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the tariffPlanName value for this SubOptServicesPreInfoResponse.
     * 
     * @return tariffPlanName
     */
    public java.lang.String getTariffPlanName() {
        return tariffPlanName;
    }


    /**
     * Sets the tariffPlanName value for this SubOptServicesPreInfoResponse.
     * 
     * @param tariffPlanName
     */
    public void setTariffPlanName(java.lang.String tariffPlanName) {
        this.tariffPlanName = tariffPlanName;
    }


    /**
     * Gets the subOptServicesPreInfoSuccessService value for this SubOptServicesPreInfoResponse.
     * 
     * @return subOptServicesPreInfoSuccessService
     */
    public com.xius.billing.SubscriberManagement_xsd.SubscribeServiceSuccessType[] getSubOptServicesPreInfoSuccessService() {
        return subOptServicesPreInfoSuccessService;
    }


    /**
     * Sets the subOptServicesPreInfoSuccessService value for this SubOptServicesPreInfoResponse.
     * 
     * @param subOptServicesPreInfoSuccessService
     */
    public void setSubOptServicesPreInfoSuccessService(com.xius.billing.SubscriberManagement_xsd.SubscribeServiceSuccessType[] subOptServicesPreInfoSuccessService) {
        this.subOptServicesPreInfoSuccessService = subOptServicesPreInfoSuccessService;
    }

    public com.xius.billing.SubscriberManagement_xsd.SubscribeServiceSuccessType getSubOptServicesPreInfoSuccessService(int i) {
        return this.subOptServicesPreInfoSuccessService[i];
    }

    public void setSubOptServicesPreInfoSuccessService(int i, com.xius.billing.SubscriberManagement_xsd.SubscribeServiceSuccessType _value) {
        this.subOptServicesPreInfoSuccessService[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubOptServicesPreInfoResponse)) return false;
        SubOptServicesPreInfoResponse other = (SubOptServicesPreInfoResponse) obj;
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
            ((this.tariffPlanName==null && other.getTariffPlanName()==null) || 
             (this.tariffPlanName!=null &&
              this.tariffPlanName.equals(other.getTariffPlanName()))) &&
            ((this.subOptServicesPreInfoSuccessService==null && other.getSubOptServicesPreInfoSuccessService()==null) || 
             (this.subOptServicesPreInfoSuccessService!=null &&
              java.util.Arrays.equals(this.subOptServicesPreInfoSuccessService, other.getSubOptServicesPreInfoSuccessService())));
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
        if (getTariffPlanName() != null) {
            _hashCode += getTariffPlanName().hashCode();
        }
        if (getSubOptServicesPreInfoSuccessService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubOptServicesPreInfoSuccessService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubOptServicesPreInfoSuccessService(), i);
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
        new org.apache.axis.description.TypeDesc(SubOptServicesPreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptServicesPreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("subOptServicesPreInfoSuccessService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptServicesPreInfoSuccessService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeServiceSuccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
