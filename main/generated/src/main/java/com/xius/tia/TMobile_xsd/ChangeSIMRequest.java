/**
 * ChangeSIMRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class ChangeSIMRequest  implements java.io.Serializable {
    private java.lang.String partnerTransactionID;

    private java.lang.String MSISDN;

    private java.lang.String ICCID;

    private java.lang.String newICCID;

    private java.lang.String isCallBackUrlRequired;

    public ChangeSIMRequest() {
    }

    public ChangeSIMRequest(
           java.lang.String partnerTransactionID,
           java.lang.String MSISDN,
           java.lang.String ICCID,
           java.lang.String newICCID,
           java.lang.String isCallBackUrlRequired) {
           this.partnerTransactionID = partnerTransactionID;
           this.MSISDN = MSISDN;
           this.ICCID = ICCID;
           this.newICCID = newICCID;
           this.isCallBackUrlRequired = isCallBackUrlRequired;
    }


    /**
     * Gets the partnerTransactionID value for this ChangeSIMRequest.
     * 
     * @return partnerTransactionID
     */
    public java.lang.String getPartnerTransactionID() {
        return partnerTransactionID;
    }


    /**
     * Sets the partnerTransactionID value for this ChangeSIMRequest.
     * 
     * @param partnerTransactionID
     */
    public void setPartnerTransactionID(java.lang.String partnerTransactionID) {
        this.partnerTransactionID = partnerTransactionID;
    }


    /**
     * Gets the MSISDN value for this ChangeSIMRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ChangeSIMRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the ICCID value for this ChangeSIMRequest.
     * 
     * @return ICCID
     */
    public java.lang.String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this ChangeSIMRequest.
     * 
     * @param ICCID
     */
    public void setICCID(java.lang.String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the newICCID value for this ChangeSIMRequest.
     * 
     * @return newICCID
     */
    public java.lang.String getNewICCID() {
        return newICCID;
    }


    /**
     * Sets the newICCID value for this ChangeSIMRequest.
     * 
     * @param newICCID
     */
    public void setNewICCID(java.lang.String newICCID) {
        this.newICCID = newICCID;
    }


    /**
     * Gets the isCallBackUrlRequired value for this ChangeSIMRequest.
     * 
     * @return isCallBackUrlRequired
     */
    public java.lang.String getIsCallBackUrlRequired() {
        return isCallBackUrlRequired;
    }


    /**
     * Sets the isCallBackUrlRequired value for this ChangeSIMRequest.
     * 
     * @param isCallBackUrlRequired
     */
    public void setIsCallBackUrlRequired(java.lang.String isCallBackUrlRequired) {
        this.isCallBackUrlRequired = isCallBackUrlRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSIMRequest)) return false;
        ChangeSIMRequest other = (ChangeSIMRequest) obj;
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
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.newICCID==null && other.getNewICCID()==null) || 
             (this.newICCID!=null &&
              this.newICCID.equals(other.getNewICCID()))) &&
            ((this.isCallBackUrlRequired==null && other.getIsCallBackUrlRequired()==null) || 
             (this.isCallBackUrlRequired!=null &&
              this.isCallBackUrlRequired.equals(other.getIsCallBackUrlRequired())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
        }
        if (getNewICCID() != null) {
            _hashCode += getNewICCID().hashCode();
        }
        if (getIsCallBackUrlRequired() != null) {
            _hashCode += getIsCallBackUrlRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSIMRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ChangeSIMRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "partnerTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("newICCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "newICCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCallBackUrlRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "isCallBackUrlRequired"));
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
