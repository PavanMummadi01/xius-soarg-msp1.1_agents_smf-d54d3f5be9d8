/**
 * SimActivateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;


/**
 * SIMActivaitonRequest
 */
public class SimActivateRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String IDType;

    private java.lang.String IDValue;

    private java.lang.String networkID;

    private java.lang.String pseudoMsisdn;

    private java.lang.String sellerID;

    private java.lang.String simNumber;

    private java.lang.String channel;

    public SimActivateRequest() {
    }

    public SimActivateRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String IDType,
           java.lang.String IDValue,
           java.lang.String networkID,
           java.lang.String pseudoMsisdn,
           java.lang.String sellerID,
           java.lang.String simNumber,
           java.lang.String channel) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.IDType = IDType;
        this.IDValue = IDValue;
        this.networkID = networkID;
        this.pseudoMsisdn = pseudoMsisdn;
        this.sellerID = sellerID;
        this.simNumber = simNumber;
        this.channel = channel;
    }


    /**
     * Gets the IDType value for this SimActivateRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this SimActivateRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the IDValue value for this SimActivateRequest.
     * 
     * @return IDValue
     */
    public java.lang.String getIDValue() {
        return IDValue;
    }


    /**
     * Sets the IDValue value for this SimActivateRequest.
     * 
     * @param IDValue
     */
    public void setIDValue(java.lang.String IDValue) {
        this.IDValue = IDValue;
    }


    /**
     * Gets the networkID value for this SimActivateRequest.
     * 
     * @return networkID
     */
    public java.lang.String getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this SimActivateRequest.
     * 
     * @param networkID
     */
    public void setNetworkID(java.lang.String networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the pseudoMsisdn value for this SimActivateRequest.
     * 
     * @return pseudoMsisdn
     */
    public java.lang.String getPseudoMsisdn() {
        return pseudoMsisdn;
    }


    /**
     * Sets the pseudoMsisdn value for this SimActivateRequest.
     * 
     * @param pseudoMsisdn
     */
    public void setPseudoMsisdn(java.lang.String pseudoMsisdn) {
        this.pseudoMsisdn = pseudoMsisdn;
    }


    /**
     * Gets the sellerID value for this SimActivateRequest.
     * 
     * @return sellerID
     */
    public java.lang.String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this SimActivateRequest.
     * 
     * @param sellerID
     */
    public void setSellerID(java.lang.String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the simNumber value for this SimActivateRequest.
     * 
     * @return simNumber
     */
    public java.lang.String getSimNumber() {
        return simNumber;
    }


    /**
     * Sets the simNumber value for this SimActivateRequest.
     * 
     * @param simNumber
     */
    public void setSimNumber(java.lang.String simNumber) {
        this.simNumber = simNumber;
    }


    /**
     * Gets the channel value for this SimActivateRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this SimActivateRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimActivateRequest)) return false;
        SimActivateRequest other = (SimActivateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.IDValue==null && other.getIDValue()==null) || 
             (this.IDValue!=null &&
              this.IDValue.equals(other.getIDValue()))) &&
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.pseudoMsisdn==null && other.getPseudoMsisdn()==null) || 
             (this.pseudoMsisdn!=null &&
              this.pseudoMsisdn.equals(other.getPseudoMsisdn()))) &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            ((this.simNumber==null && other.getSimNumber()==null) || 
             (this.simNumber!=null &&
              this.simNumber.equals(other.getSimNumber()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getIDValue() != null) {
            _hashCode += getIDValue().hashCode();
        }
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getPseudoMsisdn() != null) {
            _hashCode += getPseudoMsisdn().hashCode();
        }
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        if (getSimNumber() != null) {
            _hashCode += getSimNumber().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimActivateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">SimActivateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "IDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pseudoMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "PseudoMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "SellerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "SimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "channel"));
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
