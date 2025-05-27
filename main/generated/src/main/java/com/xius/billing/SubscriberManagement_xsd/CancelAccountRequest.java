/**
 * CancelAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class CancelAccountRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String accountid;

    private java.lang.String additionalInput1;

    private java.lang.String additionalInput2;

    public CancelAccountRequest() {
    }

    public CancelAccountRequest(
           java.lang.String msisdn,
           java.lang.String accountid,
           java.lang.String additionalInput1,
           java.lang.String additionalInput2) {
           this.msisdn = msisdn;
           this.accountid = accountid;
           this.additionalInput1 = additionalInput1;
           this.additionalInput2 = additionalInput2;
    }


    /**
     * Gets the msisdn value for this CancelAccountRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this CancelAccountRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the accountid value for this CancelAccountRequest.
     * 
     * @return accountid
     */
    public java.lang.String getAccountid() {
        return accountid;
    }


    /**
     * Sets the accountid value for this CancelAccountRequest.
     * 
     * @param accountid
     */
    public void setAccountid(java.lang.String accountid) {
        this.accountid = accountid;
    }


    /**
     * Gets the additionalInput1 value for this CancelAccountRequest.
     * 
     * @return additionalInput1
     */
    public java.lang.String getAdditionalInput1() {
        return additionalInput1;
    }


    /**
     * Sets the additionalInput1 value for this CancelAccountRequest.
     * 
     * @param additionalInput1
     */
    public void setAdditionalInput1(java.lang.String additionalInput1) {
        this.additionalInput1 = additionalInput1;
    }


    /**
     * Gets the additionalInput2 value for this CancelAccountRequest.
     * 
     * @return additionalInput2
     */
    public java.lang.String getAdditionalInput2() {
        return additionalInput2;
    }


    /**
     * Sets the additionalInput2 value for this CancelAccountRequest.
     * 
     * @param additionalInput2
     */
    public void setAdditionalInput2(java.lang.String additionalInput2) {
        this.additionalInput2 = additionalInput2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelAccountRequest)) return false;
        CancelAccountRequest other = (CancelAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.accountid==null && other.getAccountid()==null) || 
             (this.accountid!=null &&
              this.accountid.equals(other.getAccountid()))) &&
            ((this.additionalInput1==null && other.getAdditionalInput1()==null) || 
             (this.additionalInput1!=null &&
              this.additionalInput1.equals(other.getAdditionalInput1()))) &&
            ((this.additionalInput2==null && other.getAdditionalInput2()==null) || 
             (this.additionalInput2!=null &&
              this.additionalInput2.equals(other.getAdditionalInput2())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAccountid() != null) {
            _hashCode += getAccountid().hashCode();
        }
        if (getAdditionalInput1() != null) {
            _hashCode += getAdditionalInput1().hashCode();
        }
        if (getAdditionalInput2() != null) {
            _hashCode += getAdditionalInput2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "additionalInput1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "additionalInput2"));
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
