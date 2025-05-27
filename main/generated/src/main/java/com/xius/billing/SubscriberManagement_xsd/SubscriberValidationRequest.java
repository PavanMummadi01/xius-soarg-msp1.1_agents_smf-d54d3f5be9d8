/**
 * SubscriberValidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class SubscriberValidationRequest  implements java.io.Serializable {
    private java.lang.String activityflag;

    private java.lang.String attributes;

    private java.lang.String iccid;

    private java.lang.String imsi;

    private java.lang.String msisdn;

    private java.lang.String accountid;

    public SubscriberValidationRequest() {
    }

    public SubscriberValidationRequest(
           java.lang.String activityflag,
           java.lang.String attributes,
           java.lang.String iccid,
           java.lang.String imsi,
           java.lang.String msisdn,
           java.lang.String accountid) {
           this.activityflag = activityflag;
           this.attributes = attributes;
           this.iccid = iccid;
           this.imsi = imsi;
           this.msisdn = msisdn;
           this.accountid = accountid;
    }


    /**
     * Gets the activityflag value for this SubscriberValidationRequest.
     * 
     * @return activityflag
     */
    public java.lang.String getActivityflag() {
        return activityflag;
    }


    /**
     * Sets the activityflag value for this SubscriberValidationRequest.
     * 
     * @param activityflag
     */
    public void setActivityflag(java.lang.String activityflag) {
        this.activityflag = activityflag;
    }


    /**
     * Gets the attributes value for this SubscriberValidationRequest.
     * 
     * @return attributes
     */
    public java.lang.String getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this SubscriberValidationRequest.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.String attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the iccid value for this SubscriberValidationRequest.
     * 
     * @return iccid
     */
    public java.lang.String getIccid() {
        return iccid;
    }


    /**
     * Sets the iccid value for this SubscriberValidationRequest.
     * 
     * @param iccid
     */
    public void setIccid(java.lang.String iccid) {
        this.iccid = iccid;
    }


    /**
     * Gets the imsi value for this SubscriberValidationRequest.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this SubscriberValidationRequest.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the msisdn value for this SubscriberValidationRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SubscriberValidationRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the accountid value for this SubscriberValidationRequest.
     * 
     * @return accountid
     */
    public java.lang.String getAccountid() {
        return accountid;
    }


    /**
     * Sets the accountid value for this SubscriberValidationRequest.
     * 
     * @param accountid
     */
    public void setAccountid(java.lang.String accountid) {
        this.accountid = accountid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberValidationRequest)) return false;
        SubscriberValidationRequest other = (SubscriberValidationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityflag==null && other.getActivityflag()==null) || 
             (this.activityflag!=null &&
              this.activityflag.equals(other.getActivityflag()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.iccid==null && other.getIccid()==null) || 
             (this.iccid!=null &&
              this.iccid.equals(other.getIccid()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.accountid==null && other.getAccountid()==null) || 
             (this.accountid!=null &&
              this.accountid.equals(other.getAccountid())));
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
        if (getActivityflag() != null) {
            _hashCode += getActivityflag().hashCode();
        }
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getIccid() != null) {
            _hashCode += getIccid().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAccountid() != null) {
            _hashCode += getAccountid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberValidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberValidationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityflag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activityflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "iccid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
