/**
 * FirstLUActivationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.provisioning.device;

public class FirstLUActivationRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String sim;

    private java.lang.String imsi;

    private java.lang.String msisdn;

    private java.lang.Long charges;

    private java.lang.String zipCode;

    private java.lang.String channel;

    private java.lang.String nir;

    private java.lang.String sna;

    private java.lang.String tpID;

    private java.lang.String transactionID;

    private java.lang.String billDay;

    public FirstLUActivationRequest() {
    }

    public FirstLUActivationRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String sim,
           java.lang.String imsi,
           java.lang.String msisdn,
           java.lang.Long charges,
           java.lang.String zipCode,
           java.lang.String channel,
           java.lang.String nir,
           java.lang.String sna,
           java.lang.String tpID,
           java.lang.String transactionID,
           java.lang.String billDay) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.sim = sim;
        this.imsi = imsi;
        this.msisdn = msisdn;
        this.charges = charges;
        this.zipCode = zipCode;
        this.channel = channel;
        this.nir = nir;
        this.sna = sna;
        this.tpID = tpID;
        this.transactionID = transactionID;
        this.billDay = billDay;
    }


    /**
     * Gets the sim value for this FirstLUActivationRequest.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this FirstLUActivationRequest.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the imsi value for this FirstLUActivationRequest.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this FirstLUActivationRequest.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the msisdn value for this FirstLUActivationRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this FirstLUActivationRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the charges value for this FirstLUActivationRequest.
     * 
     * @return charges
     */
    public java.lang.Long getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this FirstLUActivationRequest.
     * 
     * @param charges
     */
    public void setCharges(java.lang.Long charges) {
        this.charges = charges;
    }


    /**
     * Gets the zipCode value for this FirstLUActivationRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this FirstLUActivationRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the channel value for this FirstLUActivationRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this FirstLUActivationRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the nir value for this FirstLUActivationRequest.
     * 
     * @return nir
     */
    public java.lang.String getNir() {
        return nir;
    }


    /**
     * Sets the nir value for this FirstLUActivationRequest.
     * 
     * @param nir
     */
    public void setNir(java.lang.String nir) {
        this.nir = nir;
    }


    /**
     * Gets the sna value for this FirstLUActivationRequest.
     * 
     * @return sna
     */
    public java.lang.String getSna() {
        return sna;
    }


    /**
     * Sets the sna value for this FirstLUActivationRequest.
     * 
     * @param sna
     */
    public void setSna(java.lang.String sna) {
        this.sna = sna;
    }


    /**
     * Gets the tpID value for this FirstLUActivationRequest.
     * 
     * @return tpID
     */
    public java.lang.String getTpID() {
        return tpID;
    }


    /**
     * Sets the tpID value for this FirstLUActivationRequest.
     * 
     * @param tpID
     */
    public void setTpID(java.lang.String tpID) {
        this.tpID = tpID;
    }


    /**
     * Gets the transactionID value for this FirstLUActivationRequest.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this FirstLUActivationRequest.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the billDay value for this FirstLUActivationRequest.
     * 
     * @return billDay
     */
    public java.lang.String getBillDay() {
        return billDay;
    }


    /**
     * Sets the billDay value for this FirstLUActivationRequest.
     * 
     * @param billDay
     */
    public void setBillDay(java.lang.String billDay) {
        this.billDay = billDay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirstLUActivationRequest)) return false;
        FirstLUActivationRequest other = (FirstLUActivationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.charges==null && other.getCharges()==null) || 
             (this.charges!=null &&
              this.charges.equals(other.getCharges()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.nir==null && other.getNir()==null) || 
             (this.nir!=null &&
              this.nir.equals(other.getNir()))) &&
            ((this.sna==null && other.getSna()==null) || 
             (this.sna!=null &&
              this.sna.equals(other.getSna()))) &&
            ((this.tpID==null && other.getTpID()==null) || 
             (this.tpID!=null &&
              this.tpID.equals(other.getTpID()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.billDay==null && other.getBillDay()==null) || 
             (this.billDay!=null &&
              this.billDay.equals(other.getBillDay())));
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
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getCharges() != null) {
            _hashCode += getCharges().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getNir() != null) {
            _hashCode += getNir().hashCode();
        }
        if (getSna() != null) {
            _hashCode += getSna().hashCode();
        }
        if (getTpID() != null) {
            _hashCode += getTpID().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getBillDay() != null) {
            _hashCode += getBillDay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirstLUActivationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", ">firstLUActivationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "nir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "sna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "tpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/provisioning/device", "billDay"));
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
