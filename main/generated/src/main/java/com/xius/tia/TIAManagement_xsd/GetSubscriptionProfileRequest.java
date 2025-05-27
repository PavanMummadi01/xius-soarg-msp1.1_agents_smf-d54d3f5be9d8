/**
 * GetSubscriptionProfileRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class GetSubscriptionProfileRequest  implements java.io.Serializable {
    private java.lang.String subscriptionID;

    private java.lang.String MSISDN;

    private java.lang.String userdefinedtype1;

    private java.lang.String userdefinedtype2;

    private java.lang.String userdefinedtype3;

    private java.lang.String userdefinedtype4;

    private java.lang.String userdefinedtype5;

    public GetSubscriptionProfileRequest() {
    }

    public GetSubscriptionProfileRequest(
           java.lang.String subscriptionID,
           java.lang.String MSISDN,
           java.lang.String userdefinedtype1,
           java.lang.String userdefinedtype2,
           java.lang.String userdefinedtype3,
           java.lang.String userdefinedtype4,
           java.lang.String userdefinedtype5) {
           this.subscriptionID = subscriptionID;
           this.MSISDN = MSISDN;
           this.userdefinedtype1 = userdefinedtype1;
           this.userdefinedtype2 = userdefinedtype2;
           this.userdefinedtype3 = userdefinedtype3;
           this.userdefinedtype4 = userdefinedtype4;
           this.userdefinedtype5 = userdefinedtype5;
    }


    /**
     * Gets the subscriptionID value for this GetSubscriptionProfileRequest.
     * 
     * @return subscriptionID
     */
    public java.lang.String getSubscriptionID() {
        return subscriptionID;
    }


    /**
     * Sets the subscriptionID value for this GetSubscriptionProfileRequest.
     * 
     * @param subscriptionID
     */
    public void setSubscriptionID(java.lang.String subscriptionID) {
        this.subscriptionID = subscriptionID;
    }


    /**
     * Gets the MSISDN value for this GetSubscriptionProfileRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetSubscriptionProfileRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the userdefinedtype1 value for this GetSubscriptionProfileRequest.
     * 
     * @return userdefinedtype1
     */
    public java.lang.String getUserdefinedtype1() {
        return userdefinedtype1;
    }


    /**
     * Sets the userdefinedtype1 value for this GetSubscriptionProfileRequest.
     * 
     * @param userdefinedtype1
     */
    public void setUserdefinedtype1(java.lang.String userdefinedtype1) {
        this.userdefinedtype1 = userdefinedtype1;
    }


    /**
     * Gets the userdefinedtype2 value for this GetSubscriptionProfileRequest.
     * 
     * @return userdefinedtype2
     */
    public java.lang.String getUserdefinedtype2() {
        return userdefinedtype2;
    }


    /**
     * Sets the userdefinedtype2 value for this GetSubscriptionProfileRequest.
     * 
     * @param userdefinedtype2
     */
    public void setUserdefinedtype2(java.lang.String userdefinedtype2) {
        this.userdefinedtype2 = userdefinedtype2;
    }


    /**
     * Gets the userdefinedtype3 value for this GetSubscriptionProfileRequest.
     * 
     * @return userdefinedtype3
     */
    public java.lang.String getUserdefinedtype3() {
        return userdefinedtype3;
    }


    /**
     * Sets the userdefinedtype3 value for this GetSubscriptionProfileRequest.
     * 
     * @param userdefinedtype3
     */
    public void setUserdefinedtype3(java.lang.String userdefinedtype3) {
        this.userdefinedtype3 = userdefinedtype3;
    }


    /**
     * Gets the userdefinedtype4 value for this GetSubscriptionProfileRequest.
     * 
     * @return userdefinedtype4
     */
    public java.lang.String getUserdefinedtype4() {
        return userdefinedtype4;
    }


    /**
     * Sets the userdefinedtype4 value for this GetSubscriptionProfileRequest.
     * 
     * @param userdefinedtype4
     */
    public void setUserdefinedtype4(java.lang.String userdefinedtype4) {
        this.userdefinedtype4 = userdefinedtype4;
    }


    /**
     * Gets the userdefinedtype5 value for this GetSubscriptionProfileRequest.
     * 
     * @return userdefinedtype5
     */
    public java.lang.String getUserdefinedtype5() {
        return userdefinedtype5;
    }


    /**
     * Sets the userdefinedtype5 value for this GetSubscriptionProfileRequest.
     * 
     * @param userdefinedtype5
     */
    public void setUserdefinedtype5(java.lang.String userdefinedtype5) {
        this.userdefinedtype5 = userdefinedtype5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriptionProfileRequest)) return false;
        GetSubscriptionProfileRequest other = (GetSubscriptionProfileRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriptionID==null && other.getSubscriptionID()==null) || 
             (this.subscriptionID!=null &&
              this.subscriptionID.equals(other.getSubscriptionID()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.userdefinedtype1==null && other.getUserdefinedtype1()==null) || 
             (this.userdefinedtype1!=null &&
              this.userdefinedtype1.equals(other.getUserdefinedtype1()))) &&
            ((this.userdefinedtype2==null && other.getUserdefinedtype2()==null) || 
             (this.userdefinedtype2!=null &&
              this.userdefinedtype2.equals(other.getUserdefinedtype2()))) &&
            ((this.userdefinedtype3==null && other.getUserdefinedtype3()==null) || 
             (this.userdefinedtype3!=null &&
              this.userdefinedtype3.equals(other.getUserdefinedtype3()))) &&
            ((this.userdefinedtype4==null && other.getUserdefinedtype4()==null) || 
             (this.userdefinedtype4!=null &&
              this.userdefinedtype4.equals(other.getUserdefinedtype4()))) &&
            ((this.userdefinedtype5==null && other.getUserdefinedtype5()==null) || 
             (this.userdefinedtype5!=null &&
              this.userdefinedtype5.equals(other.getUserdefinedtype5())));
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
        if (getSubscriptionID() != null) {
            _hashCode += getSubscriptionID().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getUserdefinedtype1() != null) {
            _hashCode += getUserdefinedtype1().hashCode();
        }
        if (getUserdefinedtype2() != null) {
            _hashCode += getUserdefinedtype2().hashCode();
        }
        if (getUserdefinedtype3() != null) {
            _hashCode += getUserdefinedtype3().hashCode();
        }
        if (getUserdefinedtype4() != null) {
            _hashCode += getUserdefinedtype4().hashCode();
        }
        if (getUserdefinedtype5() != null) {
            _hashCode += getUserdefinedtype5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubscriptionProfileRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "GetSubscriptionProfileRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionID"));
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
        elemField.setFieldName("userdefinedtype1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype5"));
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
