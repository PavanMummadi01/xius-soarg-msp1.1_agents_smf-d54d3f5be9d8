/**
 * GetAccountSummaryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetAccountSummaryResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.SubscriberInfoType subscriberInfoType;

    private com.xius.billing.SubscriberManagement_xsd.AccountInfoType accountInfo;

    private com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType tariffPlanDetails;

    public GetAccountSummaryResponse() {
    }

    public GetAccountSummaryResponse(
           com.xius.billing.SubscriberManagement_xsd.SubscriberInfoType subscriberInfoType,
           com.xius.billing.SubscriberManagement_xsd.AccountInfoType accountInfo,
           com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType tariffPlanDetails) {
           this.subscriberInfoType = subscriberInfoType;
           this.accountInfo = accountInfo;
           this.tariffPlanDetails = tariffPlanDetails;
    }


    /**
     * Gets the subscriberInfoType value for this GetAccountSummaryResponse.
     * 
     * @return subscriberInfoType
     */
    public com.xius.billing.SubscriberManagement_xsd.SubscriberInfoType getSubscriberInfoType() {
        return subscriberInfoType;
    }


    /**
     * Sets the subscriberInfoType value for this GetAccountSummaryResponse.
     * 
     * @param subscriberInfoType
     */
    public void setSubscriberInfoType(com.xius.billing.SubscriberManagement_xsd.SubscriberInfoType subscriberInfoType) {
        this.subscriberInfoType = subscriberInfoType;
    }


    /**
     * Gets the accountInfo value for this GetAccountSummaryResponse.
     * 
     * @return accountInfo
     */
    public com.xius.billing.SubscriberManagement_xsd.AccountInfoType getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this GetAccountSummaryResponse.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(com.xius.billing.SubscriberManagement_xsd.AccountInfoType accountInfo) {
        this.accountInfo = accountInfo;
    }


    /**
     * Gets the tariffPlanDetails value for this GetAccountSummaryResponse.
     * 
     * @return tariffPlanDetails
     */
    public com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType getTariffPlanDetails() {
        return tariffPlanDetails;
    }


    /**
     * Sets the tariffPlanDetails value for this GetAccountSummaryResponse.
     * 
     * @param tariffPlanDetails
     */
    public void setTariffPlanDetails(com.xius.billing.SubscriberManagement_xsd.TariffPlanDetailsType tariffPlanDetails) {
        this.tariffPlanDetails = tariffPlanDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountSummaryResponse)) return false;
        GetAccountSummaryResponse other = (GetAccountSummaryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberInfoType==null && other.getSubscriberInfoType()==null) || 
             (this.subscriberInfoType!=null &&
              this.subscriberInfoType.equals(other.getSubscriberInfoType()))) &&
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              this.accountInfo.equals(other.getAccountInfo()))) &&
            ((this.tariffPlanDetails==null && other.getTariffPlanDetails()==null) || 
             (this.tariffPlanDetails!=null &&
              this.tariffPlanDetails.equals(other.getTariffPlanDetails())));
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
        if (getSubscriberInfoType() != null) {
            _hashCode += getSubscriberInfoType().hashCode();
        }
        if (getAccountInfo() != null) {
            _hashCode += getAccountInfo().hashCode();
        }
        if (getTariffPlanDetails() != null) {
            _hashCode += getTariffPlanDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountSummaryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccountSummaryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberInfoType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscriberInfoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPlanDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPlanDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TariffPlanDetailsType"));
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
