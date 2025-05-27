/**
 * RetryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class RetryRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String activityId;

    private java.lang.String transactionId;

    private java.lang.String reTransId;

    private java.lang.String BAN;

    private java.lang.String oldMsisdn;

    private java.lang.String newMsisdn;

    private java.lang.String oldSim;

    private java.lang.String newSim;

    private java.lang.String oldImsi;

    private java.lang.String newImsi;

    public RetryRequest() {
    }

    public RetryRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String activityId,
           java.lang.String transactionId,
           java.lang.String reTransId,
           java.lang.String BAN,
           java.lang.String oldMsisdn,
           java.lang.String newMsisdn,
           java.lang.String oldSim,
           java.lang.String newSim,
           java.lang.String oldImsi,
           java.lang.String newImsi) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.activityId = activityId;
        this.transactionId = transactionId;
        this.reTransId = reTransId;
        this.BAN = BAN;
        this.oldMsisdn = oldMsisdn;
        this.newMsisdn = newMsisdn;
        this.oldSim = oldSim;
        this.newSim = newSim;
        this.oldImsi = oldImsi;
        this.newImsi = newImsi;
    }


    /**
     * Gets the activityId value for this RetryRequest.
     * 
     * @return activityId
     */
    public java.lang.String getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this RetryRequest.
     * 
     * @param activityId
     */
    public void setActivityId(java.lang.String activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the transactionId value for this RetryRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RetryRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the reTransId value for this RetryRequest.
     * 
     * @return reTransId
     */
    public java.lang.String getReTransId() {
        return reTransId;
    }


    /**
     * Sets the reTransId value for this RetryRequest.
     * 
     * @param reTransId
     */
    public void setReTransId(java.lang.String reTransId) {
        this.reTransId = reTransId;
    }


    /**
     * Gets the BAN value for this RetryRequest.
     * 
     * @return BAN
     */
    public java.lang.String getBAN() {
        return BAN;
    }


    /**
     * Sets the BAN value for this RetryRequest.
     * 
     * @param BAN
     */
    public void setBAN(java.lang.String BAN) {
        this.BAN = BAN;
    }


    /**
     * Gets the oldMsisdn value for this RetryRequest.
     * 
     * @return oldMsisdn
     */
    public java.lang.String getOldMsisdn() {
        return oldMsisdn;
    }


    /**
     * Sets the oldMsisdn value for this RetryRequest.
     * 
     * @param oldMsisdn
     */
    public void setOldMsisdn(java.lang.String oldMsisdn) {
        this.oldMsisdn = oldMsisdn;
    }


    /**
     * Gets the newMsisdn value for this RetryRequest.
     * 
     * @return newMsisdn
     */
    public java.lang.String getNewMsisdn() {
        return newMsisdn;
    }


    /**
     * Sets the newMsisdn value for this RetryRequest.
     * 
     * @param newMsisdn
     */
    public void setNewMsisdn(java.lang.String newMsisdn) {
        this.newMsisdn = newMsisdn;
    }


    /**
     * Gets the oldSim value for this RetryRequest.
     * 
     * @return oldSim
     */
    public java.lang.String getOldSim() {
        return oldSim;
    }


    /**
     * Sets the oldSim value for this RetryRequest.
     * 
     * @param oldSim
     */
    public void setOldSim(java.lang.String oldSim) {
        this.oldSim = oldSim;
    }


    /**
     * Gets the newSim value for this RetryRequest.
     * 
     * @return newSim
     */
    public java.lang.String getNewSim() {
        return newSim;
    }


    /**
     * Sets the newSim value for this RetryRequest.
     * 
     * @param newSim
     */
    public void setNewSim(java.lang.String newSim) {
        this.newSim = newSim;
    }


    /**
     * Gets the oldImsi value for this RetryRequest.
     * 
     * @return oldImsi
     */
    public java.lang.String getOldImsi() {
        return oldImsi;
    }


    /**
     * Sets the oldImsi value for this RetryRequest.
     * 
     * @param oldImsi
     */
    public void setOldImsi(java.lang.String oldImsi) {
        this.oldImsi = oldImsi;
    }


    /**
     * Gets the newImsi value for this RetryRequest.
     * 
     * @return newImsi
     */
    public java.lang.String getNewImsi() {
        return newImsi;
    }


    /**
     * Sets the newImsi value for this RetryRequest.
     * 
     * @param newImsi
     */
    public void setNewImsi(java.lang.String newImsi) {
        this.newImsi = newImsi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetryRequest)) return false;
        RetryRequest other = (RetryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityId==null && other.getActivityId()==null) || 
             (this.activityId!=null &&
              this.activityId.equals(other.getActivityId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.reTransId==null && other.getReTransId()==null) || 
             (this.reTransId!=null &&
              this.reTransId.equals(other.getReTransId()))) &&
            ((this.BAN==null && other.getBAN()==null) || 
             (this.BAN!=null &&
              this.BAN.equals(other.getBAN()))) &&
            ((this.oldMsisdn==null && other.getOldMsisdn()==null) || 
             (this.oldMsisdn!=null &&
              this.oldMsisdn.equals(other.getOldMsisdn()))) &&
            ((this.newMsisdn==null && other.getNewMsisdn()==null) || 
             (this.newMsisdn!=null &&
              this.newMsisdn.equals(other.getNewMsisdn()))) &&
            ((this.oldSim==null && other.getOldSim()==null) || 
             (this.oldSim!=null &&
              this.oldSim.equals(other.getOldSim()))) &&
            ((this.newSim==null && other.getNewSim()==null) || 
             (this.newSim!=null &&
              this.newSim.equals(other.getNewSim()))) &&
            ((this.oldImsi==null && other.getOldImsi()==null) || 
             (this.oldImsi!=null &&
              this.oldImsi.equals(other.getOldImsi()))) &&
            ((this.newImsi==null && other.getNewImsi()==null) || 
             (this.newImsi!=null &&
              this.newImsi.equals(other.getNewImsi())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getActivityId() != null) {
            _hashCode += getActivityId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getReTransId() != null) {
            _hashCode += getReTransId().hashCode();
        }
        if (getBAN() != null) {
            _hashCode += getBAN().hashCode();
        }
        if (getOldMsisdn() != null) {
            _hashCode += getOldMsisdn().hashCode();
        }
        if (getNewMsisdn() != null) {
            _hashCode += getNewMsisdn().hashCode();
        }
        if (getOldSim() != null) {
            _hashCode += getOldSim().hashCode();
        }
        if (getNewSim() != null) {
            _hashCode += getNewSim().hashCode();
        }
        if (getOldImsi() != null) {
            _hashCode += getOldImsi().hashCode();
        }
        if (getNewImsi() != null) {
            _hashCode += getNewImsi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">retryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "activityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "reTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "BAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldSim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newSim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldImsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldImsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newImsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "newImsi"));
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
