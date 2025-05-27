/**
 * BascDrvdIdHLRcodeGetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class BascDrvdIdHLRcodeGetRequest  implements java.io.Serializable {
    private java.lang.String channel;

    private java.lang.Long msisdn;

    private long[] basicSrvsId;

    private long[] drvdSrvsId;

    private java.lang.String[] subUnsubFlag;

    private java.lang.String reason;

    public BascDrvdIdHLRcodeGetRequest() {
    }

    public BascDrvdIdHLRcodeGetRequest(
           java.lang.String channel,
           java.lang.Long msisdn,
           long[] basicSrvsId,
           long[] drvdSrvsId,
           java.lang.String[] subUnsubFlag,
           java.lang.String reason) {
           this.channel = channel;
           this.msisdn = msisdn;
           this.basicSrvsId = basicSrvsId;
           this.drvdSrvsId = drvdSrvsId;
           this.subUnsubFlag = subUnsubFlag;
           this.reason = reason;
    }


    /**
     * Gets the channel value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the msisdn value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the basicSrvsId value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @return basicSrvsId
     */
    public long[] getBasicSrvsId() {
        return basicSrvsId;
    }


    /**
     * Sets the basicSrvsId value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @param basicSrvsId
     */
    public void setBasicSrvsId(long[] basicSrvsId) {
        this.basicSrvsId = basicSrvsId;
    }

    public long getBasicSrvsId(int i) {
        return this.basicSrvsId[i];
    }

    public void setBasicSrvsId(int i, long _value) {
        this.basicSrvsId[i] = _value;
    }


    /**
     * Gets the drvdSrvsId value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @return drvdSrvsId
     */
    public long[] getDrvdSrvsId() {
        return drvdSrvsId;
    }


    /**
     * Sets the drvdSrvsId value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @param drvdSrvsId
     */
    public void setDrvdSrvsId(long[] drvdSrvsId) {
        this.drvdSrvsId = drvdSrvsId;
    }

    public long getDrvdSrvsId(int i) {
        return this.drvdSrvsId[i];
    }

    public void setDrvdSrvsId(int i, long _value) {
        this.drvdSrvsId[i] = _value;
    }


    /**
     * Gets the subUnsubFlag value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @return subUnsubFlag
     */
    public java.lang.String[] getSubUnsubFlag() {
        return subUnsubFlag;
    }


    /**
     * Sets the subUnsubFlag value for this BascDrvdIdHLRcodeGetRequest.
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
     * Gets the reason value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this BascDrvdIdHLRcodeGetRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BascDrvdIdHLRcodeGetRequest)) return false;
        BascDrvdIdHLRcodeGetRequest other = (BascDrvdIdHLRcodeGetRequest) obj;
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
            ((this.basicSrvsId==null && other.getBasicSrvsId()==null) || 
             (this.basicSrvsId!=null &&
              java.util.Arrays.equals(this.basicSrvsId, other.getBasicSrvsId()))) &&
            ((this.drvdSrvsId==null && other.getDrvdSrvsId()==null) || 
             (this.drvdSrvsId!=null &&
              java.util.Arrays.equals(this.drvdSrvsId, other.getDrvdSrvsId()))) &&
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
        if (getBasicSrvsId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBasicSrvsId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBasicSrvsId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrvdSrvsId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrvdSrvsId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrvdSrvsId(), i);
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
        new org.apache.axis.description.TypeDesc(BascDrvdIdHLRcodeGetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "bascDrvdIdHLRcodeGetRequest"));
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
        elemField.setFieldName("basicSrvsId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "basicSrvsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drvdSrvsId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "drvdSrvsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
