/**
 * UpdateTroubleTktRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class UpdateTroubleTktRequest  implements java.io.Serializable {
    private long tktNumber;

    private int status;

    private java.lang.String assignedTo;

    private int statusReason;

    private int severityId;

    private java.lang.String userText;

    public UpdateTroubleTktRequest() {
    }

    public UpdateTroubleTktRequest(
           long tktNumber,
           int status,
           java.lang.String assignedTo,
           int statusReason,
           int severityId,
           java.lang.String userText) {
           this.tktNumber = tktNumber;
           this.status = status;
           this.assignedTo = assignedTo;
           this.statusReason = statusReason;
           this.severityId = severityId;
           this.userText = userText;
    }


    /**
     * Gets the tktNumber value for this UpdateTroubleTktRequest.
     * 
     * @return tktNumber
     */
    public long getTktNumber() {
        return tktNumber;
    }


    /**
     * Sets the tktNumber value for this UpdateTroubleTktRequest.
     * 
     * @param tktNumber
     */
    public void setTktNumber(long tktNumber) {
        this.tktNumber = tktNumber;
    }


    /**
     * Gets the status value for this UpdateTroubleTktRequest.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UpdateTroubleTktRequest.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the assignedTo value for this UpdateTroubleTktRequest.
     * 
     * @return assignedTo
     */
    public java.lang.String getAssignedTo() {
        return assignedTo;
    }


    /**
     * Sets the assignedTo value for this UpdateTroubleTktRequest.
     * 
     * @param assignedTo
     */
    public void setAssignedTo(java.lang.String assignedTo) {
        this.assignedTo = assignedTo;
    }


    /**
     * Gets the statusReason value for this UpdateTroubleTktRequest.
     * 
     * @return statusReason
     */
    public int getStatusReason() {
        return statusReason;
    }


    /**
     * Sets the statusReason value for this UpdateTroubleTktRequest.
     * 
     * @param statusReason
     */
    public void setStatusReason(int statusReason) {
        this.statusReason = statusReason;
    }


    /**
     * Gets the severityId value for this UpdateTroubleTktRequest.
     * 
     * @return severityId
     */
    public int getSeverityId() {
        return severityId;
    }


    /**
     * Sets the severityId value for this UpdateTroubleTktRequest.
     * 
     * @param severityId
     */
    public void setSeverityId(int severityId) {
        this.severityId = severityId;
    }


    /**
     * Gets the userText value for this UpdateTroubleTktRequest.
     * 
     * @return userText
     */
    public java.lang.String getUserText() {
        return userText;
    }


    /**
     * Sets the userText value for this UpdateTroubleTktRequest.
     * 
     * @param userText
     */
    public void setUserText(java.lang.String userText) {
        this.userText = userText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateTroubleTktRequest)) return false;
        UpdateTroubleTktRequest other = (UpdateTroubleTktRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tktNumber == other.getTktNumber() &&
            this.status == other.getStatus() &&
            ((this.assignedTo==null && other.getAssignedTo()==null) || 
             (this.assignedTo!=null &&
              this.assignedTo.equals(other.getAssignedTo()))) &&
            this.statusReason == other.getStatusReason() &&
            this.severityId == other.getSeverityId() &&
            ((this.userText==null && other.getUserText()==null) || 
             (this.userText!=null &&
              this.userText.equals(other.getUserText())));
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
        _hashCode += new Long(getTktNumber()).hashCode();
        _hashCode += getStatus();
        if (getAssignedTo() != null) {
            _hashCode += getAssignedTo().hashCode();
        }
        _hashCode += getStatusReason();
        _hashCode += getSeverityId();
        if (getUserText() != null) {
            _hashCode += getUserText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateTroubleTktRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateTroubleTktRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "assignedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "statusReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "severityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "userText"));
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
