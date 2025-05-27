/**
 * InitiateRoamingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class InitiateRoamingRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String activityFlag;

    private java.lang.String oldSim;

    private java.lang.String oldimsi;

    private java.lang.String idValue;

    private java.lang.String service;

    private java.lang.String baseIdsDrvdIds;

    private java.lang.String ATPids;

    private java.lang.String chargeIds;

    private java.lang.String publicityIds;

    private java.lang.String activationfee;

    private java.lang.String ATPUniqueID;

    private java.lang.String detachATP;

    public InitiateRoamingRequest() {
    }

    public InitiateRoamingRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String msisdn,
           java.lang.String activityFlag,
           java.lang.String oldSim,
           java.lang.String oldimsi,
           java.lang.String idValue,
           java.lang.String service,
           java.lang.String baseIdsDrvdIds,
           java.lang.String ATPids,
           java.lang.String chargeIds,
           java.lang.String publicityIds,
           java.lang.String activationfee,
           java.lang.String ATPUniqueID,
           java.lang.String detachATP) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.msisdn = msisdn;
        this.activityFlag = activityFlag;
        this.oldSim = oldSim;
        this.oldimsi = oldimsi;
        this.idValue = idValue;
        this.service = service;
        this.baseIdsDrvdIds = baseIdsDrvdIds;
        this.ATPids = ATPids;
        this.chargeIds = chargeIds;
        this.publicityIds = publicityIds;
        this.activationfee = activationfee;
        this.ATPUniqueID = ATPUniqueID;
        this.detachATP = detachATP;
    }


    /**
     * Gets the msisdn value for this InitiateRoamingRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this InitiateRoamingRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the activityFlag value for this InitiateRoamingRequest.
     * 
     * @return activityFlag
     */
    public java.lang.String getActivityFlag() {
        return activityFlag;
    }


    /**
     * Sets the activityFlag value for this InitiateRoamingRequest.
     * 
     * @param activityFlag
     */
    public void setActivityFlag(java.lang.String activityFlag) {
        this.activityFlag = activityFlag;
    }


    /**
     * Gets the oldSim value for this InitiateRoamingRequest.
     * 
     * @return oldSim
     */
    public java.lang.String getOldSim() {
        return oldSim;
    }


    /**
     * Sets the oldSim value for this InitiateRoamingRequest.
     * 
     * @param oldSim
     */
    public void setOldSim(java.lang.String oldSim) {
        this.oldSim = oldSim;
    }


    /**
     * Gets the oldimsi value for this InitiateRoamingRequest.
     * 
     * @return oldimsi
     */
    public java.lang.String getOldimsi() {
        return oldimsi;
    }


    /**
     * Sets the oldimsi value for this InitiateRoamingRequest.
     * 
     * @param oldimsi
     */
    public void setOldimsi(java.lang.String oldimsi) {
        this.oldimsi = oldimsi;
    }


    /**
     * Gets the idValue value for this InitiateRoamingRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this InitiateRoamingRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the service value for this InitiateRoamingRequest.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this InitiateRoamingRequest.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the baseIdsDrvdIds value for this InitiateRoamingRequest.
     * 
     * @return baseIdsDrvdIds
     */
    public java.lang.String getBaseIdsDrvdIds() {
        return baseIdsDrvdIds;
    }


    /**
     * Sets the baseIdsDrvdIds value for this InitiateRoamingRequest.
     * 
     * @param baseIdsDrvdIds
     */
    public void setBaseIdsDrvdIds(java.lang.String baseIdsDrvdIds) {
        this.baseIdsDrvdIds = baseIdsDrvdIds;
    }


    /**
     * Gets the ATPids value for this InitiateRoamingRequest.
     * 
     * @return ATPids
     */
    public java.lang.String getATPids() {
        return ATPids;
    }


    /**
     * Sets the ATPids value for this InitiateRoamingRequest.
     * 
     * @param ATPids
     */
    public void setATPids(java.lang.String ATPids) {
        this.ATPids = ATPids;
    }


    /**
     * Gets the chargeIds value for this InitiateRoamingRequest.
     * 
     * @return chargeIds
     */
    public java.lang.String getChargeIds() {
        return chargeIds;
    }


    /**
     * Sets the chargeIds value for this InitiateRoamingRequest.
     * 
     * @param chargeIds
     */
    public void setChargeIds(java.lang.String chargeIds) {
        this.chargeIds = chargeIds;
    }


    /**
     * Gets the publicityIds value for this InitiateRoamingRequest.
     * 
     * @return publicityIds
     */
    public java.lang.String getPublicityIds() {
        return publicityIds;
    }


    /**
     * Sets the publicityIds value for this InitiateRoamingRequest.
     * 
     * @param publicityIds
     */
    public void setPublicityIds(java.lang.String publicityIds) {
        this.publicityIds = publicityIds;
    }


    /**
     * Gets the activationfee value for this InitiateRoamingRequest.
     * 
     * @return activationfee
     */
    public java.lang.String getActivationfee() {
        return activationfee;
    }


    /**
     * Sets the activationfee value for this InitiateRoamingRequest.
     * 
     * @param activationfee
     */
    public void setActivationfee(java.lang.String activationfee) {
        this.activationfee = activationfee;
    }


    /**
     * Gets the ATPUniqueID value for this InitiateRoamingRequest.
     * 
     * @return ATPUniqueID
     */
    public java.lang.String getATPUniqueID() {
        return ATPUniqueID;
    }


    /**
     * Sets the ATPUniqueID value for this InitiateRoamingRequest.
     * 
     * @param ATPUniqueID
     */
    public void setATPUniqueID(java.lang.String ATPUniqueID) {
        this.ATPUniqueID = ATPUniqueID;
    }


    /**
     * Gets the detachATP value for this InitiateRoamingRequest.
     * 
     * @return detachATP
     */
    public java.lang.String getDetachATP() {
        return detachATP;
    }


    /**
     * Sets the detachATP value for this InitiateRoamingRequest.
     * 
     * @param detachATP
     */
    public void setDetachATP(java.lang.String detachATP) {
        this.detachATP = detachATP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiateRoamingRequest)) return false;
        InitiateRoamingRequest other = (InitiateRoamingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.activityFlag==null && other.getActivityFlag()==null) || 
             (this.activityFlag!=null &&
              this.activityFlag.equals(other.getActivityFlag()))) &&
            ((this.oldSim==null && other.getOldSim()==null) || 
             (this.oldSim!=null &&
              this.oldSim.equals(other.getOldSim()))) &&
            ((this.oldimsi==null && other.getOldimsi()==null) || 
             (this.oldimsi!=null &&
              this.oldimsi.equals(other.getOldimsi()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.baseIdsDrvdIds==null && other.getBaseIdsDrvdIds()==null) || 
             (this.baseIdsDrvdIds!=null &&
              this.baseIdsDrvdIds.equals(other.getBaseIdsDrvdIds()))) &&
            ((this.ATPids==null && other.getATPids()==null) || 
             (this.ATPids!=null &&
              this.ATPids.equals(other.getATPids()))) &&
            ((this.chargeIds==null && other.getChargeIds()==null) || 
             (this.chargeIds!=null &&
              this.chargeIds.equals(other.getChargeIds()))) &&
            ((this.publicityIds==null && other.getPublicityIds()==null) || 
             (this.publicityIds!=null &&
              this.publicityIds.equals(other.getPublicityIds()))) &&
            ((this.activationfee==null && other.getActivationfee()==null) || 
             (this.activationfee!=null &&
              this.activationfee.equals(other.getActivationfee()))) &&
            ((this.ATPUniqueID==null && other.getATPUniqueID()==null) || 
             (this.ATPUniqueID!=null &&
              this.ATPUniqueID.equals(other.getATPUniqueID()))) &&
            ((this.detachATP==null && other.getDetachATP()==null) || 
             (this.detachATP!=null &&
              this.detachATP.equals(other.getDetachATP())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getActivityFlag() != null) {
            _hashCode += getActivityFlag().hashCode();
        }
        if (getOldSim() != null) {
            _hashCode += getOldSim().hashCode();
        }
        if (getOldimsi() != null) {
            _hashCode += getOldimsi().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getBaseIdsDrvdIds() != null) {
            _hashCode += getBaseIdsDrvdIds().hashCode();
        }
        if (getATPids() != null) {
            _hashCode += getATPids().hashCode();
        }
        if (getChargeIds() != null) {
            _hashCode += getChargeIds().hashCode();
        }
        if (getPublicityIds() != null) {
            _hashCode += getPublicityIds().hashCode();
        }
        if (getActivationfee() != null) {
            _hashCode += getActivationfee().hashCode();
        }
        if (getATPUniqueID() != null) {
            _hashCode += getATPUniqueID().hashCode();
        }
        if (getDetachATP() != null) {
            _hashCode += getDetachATP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateRoamingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">initiateRoamingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "activityFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldSim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldimsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "oldimsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "idValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseIdsDrvdIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "baseIdsDrvdIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "ATPids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "chargeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "publicityIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationfee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "activationfee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPUniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "ATPUniqueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detachATP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "detachATP"));
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
