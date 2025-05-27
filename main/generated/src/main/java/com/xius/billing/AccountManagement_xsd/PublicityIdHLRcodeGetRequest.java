/**
 * PublicityIdHLRcodeGetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class PublicityIdHLRcodeGetRequest  implements java.io.Serializable {
    private java.lang.String channel;

    private java.lang.Long msisdn;

    private long[] atpId;

    private java.lang.String[] publicityId;

    private java.lang.String[] subUnsubFlag;

    private java.lang.String reason;

    public PublicityIdHLRcodeGetRequest() {
    }

    public PublicityIdHLRcodeGetRequest(
           java.lang.String channel,
           java.lang.Long msisdn,
           long[] atpId,
           java.lang.String[] publicityId,
           java.lang.String[] subUnsubFlag,
           java.lang.String reason) {
           this.channel = channel;
           this.msisdn = msisdn;
           this.atpId = atpId;
           this.publicityId = publicityId;
           this.subUnsubFlag = subUnsubFlag;
           this.reason = reason;
    }


    /**
     * Gets the channel value for this PublicityIdHLRcodeGetRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this PublicityIdHLRcodeGetRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the msisdn value for this PublicityIdHLRcodeGetRequest.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PublicityIdHLRcodeGetRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the atpId value for this PublicityIdHLRcodeGetRequest.
     * 
     * @return atpId
     */
    public long[] getAtpId() {
        return atpId;
    }


    /**
     * Sets the atpId value for this PublicityIdHLRcodeGetRequest.
     * 
     * @param atpId
     */
    public void setAtpId(long[] atpId) {
        this.atpId = atpId;
    }

    public long getAtpId(int i) {
        return this.atpId[i];
    }

    public void setAtpId(int i, long _value) {
        this.atpId[i] = _value;
    }


    /**
     * Gets the publicityId value for this PublicityIdHLRcodeGetRequest.
     * 
     * @return publicityId
     */
    public java.lang.String[] getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this PublicityIdHLRcodeGetRequest.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String[] publicityId) {
        this.publicityId = publicityId;
    }

    public java.lang.String getPublicityId(int i) {
        return this.publicityId[i];
    }

    public void setPublicityId(int i, java.lang.String _value) {
        this.publicityId[i] = _value;
    }


    /**
     * Gets the subUnsubFlag value for this PublicityIdHLRcodeGetRequest.
     * 
     * @return subUnsubFlag
     */
    public java.lang.String[] getSubUnsubFlag() {
        return subUnsubFlag;
    }


    /**
     * Sets the subUnsubFlag value for this PublicityIdHLRcodeGetRequest.
     * 
     * @param subUnsubFlag
     */
    public void setSubUnsubFlag(java.lang.String[] subUnsubFlag) {
        this.subUnsubFlag = subUnsubFlag;
    }

    public java.lang.String getSubUnsubFlag(int i) {
        return this.subUnsubFlag[i];
    }

    public void setSubUnsubFlag(int i, java.lang.String _value) {
        this.subUnsubFlag[i] = _value;
    }


    /**
     * Gets the reason value for this PublicityIdHLRcodeGetRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this PublicityIdHLRcodeGetRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublicityIdHLRcodeGetRequest)) return false;
        PublicityIdHLRcodeGetRequest other = (PublicityIdHLRcodeGetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.atpId==null && other.getAtpId()==null) || 
             (this.atpId!=null &&
              java.util.Arrays.equals(this.atpId, other.getAtpId()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              java.util.Arrays.equals(this.publicityId, other.getPublicityId()))) &&
            ((this.subUnsubFlag==null && other.getSubUnsubFlag()==null) || 
             (this.subUnsubFlag!=null &&
              java.util.Arrays.equals(this.subUnsubFlag, other.getSubUnsubFlag()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAtpId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtpId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtpId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublicityId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublicityId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublicityId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubUnsubFlag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubUnsubFlag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubUnsubFlag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublicityIdHLRcodeGetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityIdHLRcodeGetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "atpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subUnsubFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subUnsubFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "reason"));
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
