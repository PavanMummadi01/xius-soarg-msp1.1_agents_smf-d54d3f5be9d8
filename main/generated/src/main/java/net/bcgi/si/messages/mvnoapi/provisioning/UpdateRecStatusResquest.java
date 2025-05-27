/**
 * UpdateRecStatusResquest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class UpdateRecStatusResquest  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String dummyId;

    private java.lang.String idNo;

    private net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType idType;

    private java.lang.String messageID;

    private java.lang.String msisdn;

    private java.lang.String transStatus;

    private java.lang.String personalIdType;

    private net.bcgi.si.messages.mvnoapi.common.SecurityId securityId;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext;

    private java.lang.String sim;

    private java.lang.String simStatus;

    private java.lang.String transId;

    private java.lang.String transStatus2;

    private net.bcgi.si.messages.mvnoapi.common.UploadType uploadType;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public UpdateRecStatusResquest() {
    }

    public UpdateRecStatusResquest(
           java.lang.String dummyId,
           java.lang.String idNo,
           net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType idType,
           java.lang.String messageID,
           java.lang.String msisdn,
           java.lang.String transStatus,
           java.lang.String personalIdType,
           net.bcgi.si.messages.mvnoapi.common.SecurityId securityId,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext,
           java.lang.String sim,
           java.lang.String simStatus,
           java.lang.String transId,
           java.lang.String transStatus2,
           net.bcgi.si.messages.mvnoapi.common.UploadType uploadType,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.dummyId = dummyId;
           this.idNo = idNo;
           this.idType = idType;
           this.messageID = messageID;
           this.msisdn = msisdn;
           this.transStatus = transStatus;
           this.personalIdType = personalIdType;
           this.securityId = securityId;
           this.serviceContext = serviceContext;
           this.sim = sim;
           this.simStatus = simStatus;
           this.transId = transId;
           this.transStatus2 = transStatus2;
           this.uploadType = uploadType;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the dummyId value for this UpdateRecStatusResquest.
     * 
     * @return dummyId
     */
    public java.lang.String getDummyId() {
        return dummyId;
    }


    /**
     * Sets the dummyId value for this UpdateRecStatusResquest.
     * 
     * @param dummyId
     */
    public void setDummyId(java.lang.String dummyId) {
        this.dummyId = dummyId;
    }


    /**
     * Gets the idNo value for this UpdateRecStatusResquest.
     * 
     * @return idNo
     */
    public java.lang.String getIdNo() {
        return idNo;
    }


    /**
     * Sets the idNo value for this UpdateRecStatusResquest.
     * 
     * @param idNo
     */
    public void setIdNo(java.lang.String idNo) {
        this.idNo = idNo;
    }


    /**
     * Gets the idType value for this UpdateRecStatusResquest.
     * 
     * @return idType
     */
    public net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this UpdateRecStatusResquest.
     * 
     * @param idType
     */
    public void setIdType(net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType idType) {
        this.idType = idType;
    }


    /**
     * Gets the messageID value for this UpdateRecStatusResquest.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this UpdateRecStatusResquest.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the msisdn value for this UpdateRecStatusResquest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this UpdateRecStatusResquest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the transStatus value for this UpdateRecStatusResquest.
     * 
     * @return transStatus
     */
    public java.lang.String getTransStatus() {
        return transStatus;
    }


    /**
     * Sets the transStatus value for this UpdateRecStatusResquest.
     * 
     * @param transStatus
     */
    public void setTransStatus(java.lang.String transStatus) {
        this.transStatus = transStatus;
    }


    /**
     * Gets the personalIdType value for this UpdateRecStatusResquest.
     * 
     * @return personalIdType
     */
    public java.lang.String getPersonalIdType() {
        return personalIdType;
    }


    /**
     * Sets the personalIdType value for this UpdateRecStatusResquest.
     * 
     * @param personalIdType
     */
    public void setPersonalIdType(java.lang.String personalIdType) {
        this.personalIdType = personalIdType;
    }


    /**
     * Gets the securityId value for this UpdateRecStatusResquest.
     * 
     * @return securityId
     */
    public net.bcgi.si.messages.mvnoapi.common.SecurityId getSecurityId() {
        return securityId;
    }


    /**
     * Sets the securityId value for this UpdateRecStatusResquest.
     * 
     * @param securityId
     */
    public void setSecurityId(net.bcgi.si.messages.mvnoapi.common.SecurityId securityId) {
        this.securityId = securityId;
    }


    /**
     * Gets the serviceContext value for this UpdateRecStatusResquest.
     * 
     * @return serviceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getServiceContext() {
        return serviceContext;
    }


    /**
     * Sets the serviceContext value for this UpdateRecStatusResquest.
     * 
     * @param serviceContext
     */
    public void setServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext serviceContext) {
        this.serviceContext = serviceContext;
    }


    /**
     * Gets the sim value for this UpdateRecStatusResquest.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this UpdateRecStatusResquest.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the simStatus value for this UpdateRecStatusResquest.
     * 
     * @return simStatus
     */
    public java.lang.String getSimStatus() {
        return simStatus;
    }


    /**
     * Sets the simStatus value for this UpdateRecStatusResquest.
     * 
     * @param simStatus
     */
    public void setSimStatus(java.lang.String simStatus) {
        this.simStatus = simStatus;
    }


    /**
     * Gets the transId value for this UpdateRecStatusResquest.
     * 
     * @return transId
     */
    public java.lang.String getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this UpdateRecStatusResquest.
     * 
     * @param transId
     */
    public void setTransId(java.lang.String transId) {
        this.transId = transId;
    }


    /**
     * Gets the transStatus2 value for this UpdateRecStatusResquest.
     * 
     * @return transStatus2
     */
    public java.lang.String getTransStatus2() {
        return transStatus2;
    }


    /**
     * Sets the transStatus2 value for this UpdateRecStatusResquest.
     * 
     * @param transStatus2
     */
    public void setTransStatus2(java.lang.String transStatus2) {
        this.transStatus2 = transStatus2;
    }


    /**
     * Gets the uploadType value for this UpdateRecStatusResquest.
     * 
     * @return uploadType
     */
    public net.bcgi.si.messages.mvnoapi.common.UploadType getUploadType() {
        return uploadType;
    }


    /**
     * Sets the uploadType value for this UpdateRecStatusResquest.
     * 
     * @param uploadType
     */
    public void setUploadType(net.bcgi.si.messages.mvnoapi.common.UploadType uploadType) {
        this.uploadType = uploadType;
    }


    /**
     * Gets the version value for this UpdateRecStatusResquest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this UpdateRecStatusResquest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this UpdateRecStatusResquest.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this UpdateRecStatusResquest.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateRecStatusResquest)) return false;
        UpdateRecStatusResquest other = (UpdateRecStatusResquest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dummyId==null && other.getDummyId()==null) || 
             (this.dummyId!=null &&
              this.dummyId.equals(other.getDummyId()))) &&
            ((this.idNo==null && other.getIdNo()==null) || 
             (this.idNo!=null &&
              this.idNo.equals(other.getIdNo()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.transStatus==null && other.getTransStatus()==null) || 
             (this.transStatus!=null &&
              this.transStatus.equals(other.getTransStatus()))) &&
            ((this.personalIdType==null && other.getPersonalIdType()==null) || 
             (this.personalIdType!=null &&
              this.personalIdType.equals(other.getPersonalIdType()))) &&
            ((this.securityId==null && other.getSecurityId()==null) || 
             (this.securityId!=null &&
              this.securityId.equals(other.getSecurityId()))) &&
            ((this.serviceContext==null && other.getServiceContext()==null) || 
             (this.serviceContext!=null &&
              this.serviceContext.equals(other.getServiceContext()))) &&
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.simStatus==null && other.getSimStatus()==null) || 
             (this.simStatus!=null &&
              this.simStatus.equals(other.getSimStatus()))) &&
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId()))) &&
            ((this.transStatus2==null && other.getTransStatus2()==null) || 
             (this.transStatus2!=null &&
              this.transStatus2.equals(other.getTransStatus2()))) &&
            ((this.uploadType==null && other.getUploadType()==null) || 
             (this.uploadType!=null &&
              this.uploadType.equals(other.getUploadType()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getDummyId() != null) {
            _hashCode += getDummyId().hashCode();
        }
        if (getIdNo() != null) {
            _hashCode += getIdNo().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getTransStatus() != null) {
            _hashCode += getTransStatus().hashCode();
        }
        if (getPersonalIdType() != null) {
            _hashCode += getPersonalIdType().hashCode();
        }
        if (getSecurityId() != null) {
            _hashCode += getSecurityId().hashCode();
        }
        if (getServiceContext() != null) {
            _hashCode += getServiceContext().hashCode();
        }
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getSimStatus() != null) {
            _hashCode += getSimStatus().hashCode();
        }
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        if (getTransStatus2() != null) {
            _hashCode += getTransStatus2().hashCode();
        }
        if (getUploadType() != null) {
            _hashCode += getUploadType().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateRecStatusResquest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "UpdateRecStatusResquest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dummyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dummyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "idNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "PersonalIdentityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "personalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "securityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "SecurityId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "serviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "simStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "uploadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "UploadType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
