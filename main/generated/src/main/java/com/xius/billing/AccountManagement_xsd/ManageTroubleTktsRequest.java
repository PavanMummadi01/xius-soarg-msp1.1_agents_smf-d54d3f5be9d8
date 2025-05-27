/**
 * ManageTroubleTktsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ManageTroubleTktsRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.ActionFlagType actionFlag;

    private long acctId;

    private java.lang.String msisdn;

    private java.lang.String heading;

    private int status;

    private int severity;

    private java.lang.String userTxt;

    public ManageTroubleTktsRequest() {
    }

    public ManageTroubleTktsRequest(
           com.xius.billing.AccountManagement_xsd.ActionFlagType actionFlag,
           long acctId,
           java.lang.String msisdn,
           java.lang.String heading,
           int status,
           int severity,
           java.lang.String userTxt) {
           this.actionFlag = actionFlag;
           this.acctId = acctId;
           this.msisdn = msisdn;
           this.heading = heading;
           this.status = status;
           this.severity = severity;
           this.userTxt = userTxt;
    }


    /**
     * Gets the actionFlag value for this ManageTroubleTktsRequest.
     * 
     * @return actionFlag
     */
    public com.xius.billing.AccountManagement_xsd.ActionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageTroubleTktsRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xius.billing.AccountManagement_xsd.ActionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the acctId value for this ManageTroubleTktsRequest.
     * 
     * @return acctId
     */
    public long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this ManageTroubleTktsRequest.
     * 
     * @param acctId
     */
    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the msisdn value for this ManageTroubleTktsRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ManageTroubleTktsRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the heading value for this ManageTroubleTktsRequest.
     * 
     * @return heading
     */
    public java.lang.String getHeading() {
        return heading;
    }


    /**
     * Sets the heading value for this ManageTroubleTktsRequest.
     * 
     * @param heading
     */
    public void setHeading(java.lang.String heading) {
        this.heading = heading;
    }


    /**
     * Gets the status value for this ManageTroubleTktsRequest.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ManageTroubleTktsRequest.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the severity value for this ManageTroubleTktsRequest.
     * 
     * @return severity
     */
    public int getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this ManageTroubleTktsRequest.
     * 
     * @param severity
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }


    /**
     * Gets the userTxt value for this ManageTroubleTktsRequest.
     * 
     * @return userTxt
     */
    public java.lang.String getUserTxt() {
        return userTxt;
    }


    /**
     * Sets the userTxt value for this ManageTroubleTktsRequest.
     * 
     * @param userTxt
     */
    public void setUserTxt(java.lang.String userTxt) {
        this.userTxt = userTxt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageTroubleTktsRequest)) return false;
        ManageTroubleTktsRequest other = (ManageTroubleTktsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            this.acctId == other.getAcctId() &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.heading==null && other.getHeading()==null) || 
             (this.heading!=null &&
              this.heading.equals(other.getHeading()))) &&
            this.status == other.getStatus() &&
            this.severity == other.getSeverity() &&
            ((this.userTxt==null && other.getUserTxt()==null) || 
             (this.userTxt!=null &&
              this.userTxt.equals(other.getUserTxt())));
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
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        _hashCode += new Long(getAcctId()).hashCode();
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getHeading() != null) {
            _hashCode += getHeading().hashCode();
        }
        _hashCode += getStatus();
        _hashCode += getSeverity();
        if (getUserTxt() != null) {
            _hashCode += getUserTxt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageTroubleTktsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ManageTroubleTktsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "heading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "userTxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
