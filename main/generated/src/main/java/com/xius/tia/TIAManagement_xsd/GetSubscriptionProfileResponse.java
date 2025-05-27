/**
 * GetSubscriptionProfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class GetSubscriptionProfileResponse  implements java.io.Serializable {
    private com.xius.tia.TIAManagement_xsd.SubscriptionProfile subscriptionProfile;

    private com.xius.tia.TIAManagement_xsd.SubscriptionStatus subscriptionStatus;

    private com.xius.tia.TIAManagement_xsd.SubscriptionRating subscriptionRating;

    private com.xius.tia.TIAManagement_xsd.SubscriptionBilling subscriptionBilling;

    private com.xius.tia.TIAManagement_xsd.ResponseDataType responseData;

    public GetSubscriptionProfileResponse() {
    }

    public GetSubscriptionProfileResponse(
           com.xius.tia.TIAManagement_xsd.SubscriptionProfile subscriptionProfile,
           com.xius.tia.TIAManagement_xsd.SubscriptionStatus subscriptionStatus,
           com.xius.tia.TIAManagement_xsd.SubscriptionRating subscriptionRating,
           com.xius.tia.TIAManagement_xsd.SubscriptionBilling subscriptionBilling,
           com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
           this.subscriptionProfile = subscriptionProfile;
           this.subscriptionStatus = subscriptionStatus;
           this.subscriptionRating = subscriptionRating;
           this.subscriptionBilling = subscriptionBilling;
           this.responseData = responseData;
    }


    /**
     * Gets the subscriptionProfile value for this GetSubscriptionProfileResponse.
     * 
     * @return subscriptionProfile
     */
    public com.xius.tia.TIAManagement_xsd.SubscriptionProfile getSubscriptionProfile() {
        return subscriptionProfile;
    }


    /**
     * Sets the subscriptionProfile value for this GetSubscriptionProfileResponse.
     * 
     * @param subscriptionProfile
     */
    public void setSubscriptionProfile(com.xius.tia.TIAManagement_xsd.SubscriptionProfile subscriptionProfile) {
        this.subscriptionProfile = subscriptionProfile;
    }


    /**
     * Gets the subscriptionStatus value for this GetSubscriptionProfileResponse.
     * 
     * @return subscriptionStatus
     */
    public com.xius.tia.TIAManagement_xsd.SubscriptionStatus getSubscriptionStatus() {
        return subscriptionStatus;
    }


    /**
     * Sets the subscriptionStatus value for this GetSubscriptionProfileResponse.
     * 
     * @param subscriptionStatus
     */
    public void setSubscriptionStatus(com.xius.tia.TIAManagement_xsd.SubscriptionStatus subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }


    /**
     * Gets the subscriptionRating value for this GetSubscriptionProfileResponse.
     * 
     * @return subscriptionRating
     */
    public com.xius.tia.TIAManagement_xsd.SubscriptionRating getSubscriptionRating() {
        return subscriptionRating;
    }


    /**
     * Sets the subscriptionRating value for this GetSubscriptionProfileResponse.
     * 
     * @param subscriptionRating
     */
    public void setSubscriptionRating(com.xius.tia.TIAManagement_xsd.SubscriptionRating subscriptionRating) {
        this.subscriptionRating = subscriptionRating;
    }


    /**
     * Gets the subscriptionBilling value for this GetSubscriptionProfileResponse.
     * 
     * @return subscriptionBilling
     */
    public com.xius.tia.TIAManagement_xsd.SubscriptionBilling getSubscriptionBilling() {
        return subscriptionBilling;
    }


    /**
     * Sets the subscriptionBilling value for this GetSubscriptionProfileResponse.
     * 
     * @param subscriptionBilling
     */
    public void setSubscriptionBilling(com.xius.tia.TIAManagement_xsd.SubscriptionBilling subscriptionBilling) {
        this.subscriptionBilling = subscriptionBilling;
    }


    /**
     * Gets the responseData value for this GetSubscriptionProfileResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.TIAManagement_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this GetSubscriptionProfileResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriptionProfileResponse)) return false;
        GetSubscriptionProfileResponse other = (GetSubscriptionProfileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriptionProfile==null && other.getSubscriptionProfile()==null) || 
             (this.subscriptionProfile!=null &&
              this.subscriptionProfile.equals(other.getSubscriptionProfile()))) &&
            ((this.subscriptionStatus==null && other.getSubscriptionStatus()==null) || 
             (this.subscriptionStatus!=null &&
              this.subscriptionStatus.equals(other.getSubscriptionStatus()))) &&
            ((this.subscriptionRating==null && other.getSubscriptionRating()==null) || 
             (this.subscriptionRating!=null &&
              this.subscriptionRating.equals(other.getSubscriptionRating()))) &&
            ((this.subscriptionBilling==null && other.getSubscriptionBilling()==null) || 
             (this.subscriptionBilling!=null &&
              this.subscriptionBilling.equals(other.getSubscriptionBilling()))) &&
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData())));
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
        if (getSubscriptionProfile() != null) {
            _hashCode += getSubscriptionProfile().hashCode();
        }
        if (getSubscriptionStatus() != null) {
            _hashCode += getSubscriptionStatus().hashCode();
        }
        if (getSubscriptionRating() != null) {
            _hashCode += getSubscriptionRating().hashCode();
        }
        if (getSubscriptionBilling() != null) {
            _hashCode += getSubscriptionBilling().hashCode();
        }
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubscriptionProfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GetSubscriptionProfileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionBilling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ResponseDataType"));
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
