/**
 * CancelDeviceLocResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class CancelDeviceLocResponse  implements java.io.Serializable {
    private java.lang.String partnerTransactionID;

    private java.lang.String partnerID;

    private java.lang.String status;

    private java.lang.String action;

    private java.lang.String MSISDN;

    private java.lang.String ICCID;

    private java.lang.String result;

    private java.lang.String resultStatus;

    private java.lang.String resultMessage;

    private java.lang.String responseCount;

    public CancelDeviceLocResponse() {
    }

    public CancelDeviceLocResponse(
           java.lang.String partnerTransactionID,
           java.lang.String partnerID,
           java.lang.String status,
           java.lang.String action,
           java.lang.String MSISDN,
           java.lang.String ICCID,
           java.lang.String result,
           java.lang.String resultStatus,
           java.lang.String resultMessage,
           java.lang.String responseCount) {
           this.partnerTransactionID = partnerTransactionID;
           this.partnerID = partnerID;
           this.status = status;
           this.action = action;
           this.MSISDN = MSISDN;
           this.ICCID = ICCID;
           this.result = result;
           this.resultStatus = resultStatus;
           this.resultMessage = resultMessage;
           this.responseCount = responseCount;
    }


    /**
     * Gets the partnerTransactionID value for this CancelDeviceLocResponse.
     * 
     * @return partnerTransactionID
     */
    public java.lang.String getPartnerTransactionID() {
        return partnerTransactionID;
    }


    /**
     * Sets the partnerTransactionID value for this CancelDeviceLocResponse.
     * 
     * @param partnerTransactionID
     */
    public void setPartnerTransactionID(java.lang.String partnerTransactionID) {
        this.partnerTransactionID = partnerTransactionID;
    }


    /**
     * Gets the partnerID value for this CancelDeviceLocResponse.
     * 
     * @return partnerID
     */
    public java.lang.String getPartnerID() {
        return partnerID;
    }


    /**
     * Sets the partnerID value for this CancelDeviceLocResponse.
     * 
     * @param partnerID
     */
    public void setPartnerID(java.lang.String partnerID) {
        this.partnerID = partnerID;
    }


    /**
     * Gets the status value for this CancelDeviceLocResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CancelDeviceLocResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the action value for this CancelDeviceLocResponse.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CancelDeviceLocResponse.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the MSISDN value for this CancelDeviceLocResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this CancelDeviceLocResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the ICCID value for this CancelDeviceLocResponse.
     * 
     * @return ICCID
     */
    public java.lang.String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this CancelDeviceLocResponse.
     * 
     * @param ICCID
     */
    public void setICCID(java.lang.String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the result value for this CancelDeviceLocResponse.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this CancelDeviceLocResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the resultStatus value for this CancelDeviceLocResponse.
     * 
     * @return resultStatus
     */
    public java.lang.String getResultStatus() {
        return resultStatus;
    }


    /**
     * Sets the resultStatus value for this CancelDeviceLocResponse.
     * 
     * @param resultStatus
     */
    public void setResultStatus(java.lang.String resultStatus) {
        this.resultStatus = resultStatus;
    }


    /**
     * Gets the resultMessage value for this CancelDeviceLocResponse.
     * 
     * @return resultMessage
     */
    public java.lang.String getResultMessage() {
        return resultMessage;
    }


    /**
     * Sets the resultMessage value for this CancelDeviceLocResponse.
     * 
     * @param resultMessage
     */
    public void setResultMessage(java.lang.String resultMessage) {
        this.resultMessage = resultMessage;
    }


    /**
     * Gets the responseCount value for this CancelDeviceLocResponse.
     * 
     * @return responseCount
     */
    public java.lang.String getResponseCount() {
        return responseCount;
    }


    /**
     * Sets the responseCount value for this CancelDeviceLocResponse.
     * 
     * @param responseCount
     */
    public void setResponseCount(java.lang.String responseCount) {
        this.responseCount = responseCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelDeviceLocResponse)) return false;
        CancelDeviceLocResponse other = (CancelDeviceLocResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partnerTransactionID==null && other.getPartnerTransactionID()==null) || 
             (this.partnerTransactionID!=null &&
              this.partnerTransactionID.equals(other.getPartnerTransactionID()))) &&
            ((this.partnerID==null && other.getPartnerID()==null) || 
             (this.partnerID!=null &&
              this.partnerID.equals(other.getPartnerID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.resultStatus==null && other.getResultStatus()==null) || 
             (this.resultStatus!=null &&
              this.resultStatus.equals(other.getResultStatus()))) &&
            ((this.resultMessage==null && other.getResultMessage()==null) || 
             (this.resultMessage!=null &&
              this.resultMessage.equals(other.getResultMessage()))) &&
            ((this.responseCount==null && other.getResponseCount()==null) || 
             (this.responseCount!=null &&
              this.responseCount.equals(other.getResponseCount())));
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
        if (getPartnerTransactionID() != null) {
            _hashCode += getPartnerTransactionID().hashCode();
        }
        if (getPartnerID() != null) {
            _hashCode += getPartnerID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getResultStatus() != null) {
            _hashCode += getResultStatus().hashCode();
        }
        if (getResultMessage() != null) {
            _hashCode += getResultMessage().hashCode();
        }
        if (getResponseCount() != null) {
            _hashCode += getResponseCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelDeviceLocResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "CancelDeviceLocResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "partnerTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "partnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ICCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "resultStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "resultMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "responseCount"));
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
