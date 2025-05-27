/**
 * ChangeSimMdnAuditRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChangeSimMdnAuditRequest  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String status;

    private java.lang.String status_code;

    private java.lang.String status_messages;

    private java.lang.String msisdn;

    private java.lang.String new_msisdn;

    private java.lang.String imsi;

    private java.lang.String iccid;

    private java.lang.String newiccid;

    public ChangeSimMdnAuditRequest() {
    }

    public ChangeSimMdnAuditRequest(
           java.lang.String action,
           java.lang.String status,
           java.lang.String status_code,
           java.lang.String status_messages,
           java.lang.String msisdn,
           java.lang.String new_msisdn,
           java.lang.String imsi,
           java.lang.String iccid,
           java.lang.String newiccid) {
           this.action = action;
           this.status = status;
           this.status_code = status_code;
           this.status_messages = status_messages;
           this.msisdn = msisdn;
           this.new_msisdn = new_msisdn;
           this.imsi = imsi;
           this.iccid = iccid;
           this.newiccid = newiccid;
    }


    /**
     * Gets the action value for this ChangeSimMdnAuditRequest.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ChangeSimMdnAuditRequest.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the status value for this ChangeSimMdnAuditRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ChangeSimMdnAuditRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the status_code value for this ChangeSimMdnAuditRequest.
     * 
     * @return status_code
     */
    public java.lang.String getStatus_code() {
        return status_code;
    }


    /**
     * Sets the status_code value for this ChangeSimMdnAuditRequest.
     * 
     * @param status_code
     */
    public void setStatus_code(java.lang.String status_code) {
        this.status_code = status_code;
    }


    /**
     * Gets the status_messages value for this ChangeSimMdnAuditRequest.
     * 
     * @return status_messages
     */
    public java.lang.String getStatus_messages() {
        return status_messages;
    }


    /**
     * Sets the status_messages value for this ChangeSimMdnAuditRequest.
     * 
     * @param status_messages
     */
    public void setStatus_messages(java.lang.String status_messages) {
        this.status_messages = status_messages;
    }


    /**
     * Gets the msisdn value for this ChangeSimMdnAuditRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ChangeSimMdnAuditRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the new_msisdn value for this ChangeSimMdnAuditRequest.
     * 
     * @return new_msisdn
     */
    public java.lang.String getNew_msisdn() {
        return new_msisdn;
    }


    /**
     * Sets the new_msisdn value for this ChangeSimMdnAuditRequest.
     * 
     * @param new_msisdn
     */
    public void setNew_msisdn(java.lang.String new_msisdn) {
        this.new_msisdn = new_msisdn;
    }


    /**
     * Gets the imsi value for this ChangeSimMdnAuditRequest.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this ChangeSimMdnAuditRequest.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the iccid value for this ChangeSimMdnAuditRequest.
     * 
     * @return iccid
     */
    public java.lang.String getIccid() {
        return iccid;
    }


    /**
     * Sets the iccid value for this ChangeSimMdnAuditRequest.
     * 
     * @param iccid
     */
    public void setIccid(java.lang.String iccid) {
        this.iccid = iccid;
    }


    /**
     * Gets the newiccid value for this ChangeSimMdnAuditRequest.
     * 
     * @return newiccid
     */
    public java.lang.String getNewiccid() {
        return newiccid;
    }


    /**
     * Sets the newiccid value for this ChangeSimMdnAuditRequest.
     * 
     * @param newiccid
     */
    public void setNewiccid(java.lang.String newiccid) {
        this.newiccid = newiccid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSimMdnAuditRequest)) return false;
        ChangeSimMdnAuditRequest other = (ChangeSimMdnAuditRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.status_code==null && other.getStatus_code()==null) || 
             (this.status_code!=null &&
              this.status_code.equals(other.getStatus_code()))) &&
            ((this.status_messages==null && other.getStatus_messages()==null) || 
             (this.status_messages!=null &&
              this.status_messages.equals(other.getStatus_messages()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.new_msisdn==null && other.getNew_msisdn()==null) || 
             (this.new_msisdn!=null &&
              this.new_msisdn.equals(other.getNew_msisdn()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.iccid==null && other.getIccid()==null) || 
             (this.iccid!=null &&
              this.iccid.equals(other.getIccid()))) &&
            ((this.newiccid==null && other.getNewiccid()==null) || 
             (this.newiccid!=null &&
              this.newiccid.equals(other.getNewiccid())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatus_code() != null) {
            _hashCode += getStatus_code().hashCode();
        }
        if (getStatus_messages() != null) {
            _hashCode += getStatus_messages().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getNew_msisdn() != null) {
            _hashCode += getNew_msisdn().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getIccid() != null) {
            _hashCode += getIccid().hashCode();
        }
        if (getNewiccid() != null) {
            _hashCode += getNewiccid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSimMdnAuditRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "changeSimMdnAuditRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "status_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "status_messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "new_msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "iccid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newiccid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newiccid"));
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
