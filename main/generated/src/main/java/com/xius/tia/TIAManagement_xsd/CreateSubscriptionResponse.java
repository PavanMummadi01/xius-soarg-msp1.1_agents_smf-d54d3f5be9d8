/**
 * CreateSubscriptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class CreateSubscriptionResponse  implements java.io.Serializable {
    private java.lang.Long BAN;

    private java.lang.String identifier;

    private java.lang.String MSISDN;

    private java.math.BigInteger subscriptionType;

    private java.util.Calendar mobileNumberOwnership;

    private com.xius.tia.TIAManagement_xsd.CommonData commonData;

    private com.xius.tia.TIAManagement_xsd.ResponseDataType responseData;

    public CreateSubscriptionResponse() {
    }

    public CreateSubscriptionResponse(
           java.lang.Long BAN,
           java.lang.String identifier,
           java.lang.String MSISDN,
           java.math.BigInteger subscriptionType,
           java.util.Calendar mobileNumberOwnership,
           com.xius.tia.TIAManagement_xsd.CommonData commonData,
           com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
           this.BAN = BAN;
           this.identifier = identifier;
           this.MSISDN = MSISDN;
           this.subscriptionType = subscriptionType;
           this.mobileNumberOwnership = mobileNumberOwnership;
           this.commonData = commonData;
           this.responseData = responseData;
    }


    /**
     * Gets the BAN value for this CreateSubscriptionResponse.
     * 
     * @return BAN
     */
    public java.lang.Long getBAN() {
        return BAN;
    }


    /**
     * Sets the BAN value for this CreateSubscriptionResponse.
     * 
     * @param BAN
     */
    public void setBAN(java.lang.Long BAN) {
        this.BAN = BAN;
    }


    /**
     * Gets the identifier value for this CreateSubscriptionResponse.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CreateSubscriptionResponse.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the MSISDN value for this CreateSubscriptionResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this CreateSubscriptionResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the subscriptionType value for this CreateSubscriptionResponse.
     * 
     * @return subscriptionType
     */
    public java.math.BigInteger getSubscriptionType() {
        return subscriptionType;
    }


    /**
     * Sets the subscriptionType value for this CreateSubscriptionResponse.
     * 
     * @param subscriptionType
     */
    public void setSubscriptionType(java.math.BigInteger subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    /**
     * Gets the mobileNumberOwnership value for this CreateSubscriptionResponse.
     * 
     * @return mobileNumberOwnership
     */
    public java.util.Calendar getMobileNumberOwnership() {
        return mobileNumberOwnership;
    }


    /**
     * Sets the mobileNumberOwnership value for this CreateSubscriptionResponse.
     * 
     * @param mobileNumberOwnership
     */
    public void setMobileNumberOwnership(java.util.Calendar mobileNumberOwnership) {
        this.mobileNumberOwnership = mobileNumberOwnership;
    }


    /**
     * Gets the commonData value for this CreateSubscriptionResponse.
     * 
     * @return commonData
     */
    public com.xius.tia.TIAManagement_xsd.CommonData getCommonData() {
        return commonData;
    }


    /**
     * Sets the commonData value for this CreateSubscriptionResponse.
     * 
     * @param commonData
     */
    public void setCommonData(com.xius.tia.TIAManagement_xsd.CommonData commonData) {
        this.commonData = commonData;
    }


    /**
     * Gets the responseData value for this CreateSubscriptionResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.TIAManagement_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this CreateSubscriptionResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.TIAManagement_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriptionResponse)) return false;
        CreateSubscriptionResponse other = (CreateSubscriptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BAN==null && other.getBAN()==null) || 
             (this.BAN!=null &&
              this.BAN.equals(other.getBAN()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.subscriptionType==null && other.getSubscriptionType()==null) || 
             (this.subscriptionType!=null &&
              this.subscriptionType.equals(other.getSubscriptionType()))) &&
            ((this.mobileNumberOwnership==null && other.getMobileNumberOwnership()==null) || 
             (this.mobileNumberOwnership!=null &&
              this.mobileNumberOwnership.equals(other.getMobileNumberOwnership()))) &&
            ((this.commonData==null && other.getCommonData()==null) || 
             (this.commonData!=null &&
              this.commonData.equals(other.getCommonData()))) &&
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
        if (getBAN() != null) {
            _hashCode += getBAN().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getSubscriptionType() != null) {
            _hashCode += getSubscriptionType().hashCode();
        }
        if (getMobileNumberOwnership() != null) {
            _hashCode += getMobileNumberOwnership().hashCode();
        }
        if (getCommonData() != null) {
            _hashCode += getCommonData().hashCode();
        }
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CreateSubscriptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "BAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumberOwnership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "mobileNumberOwnership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CommonData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "CommonData"));
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
