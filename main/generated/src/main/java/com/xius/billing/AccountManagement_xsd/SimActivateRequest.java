/**
 * SimActivateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SimActivateRequest  implements java.io.Serializable {
    private java.lang.String SIM;

    private java.lang.String psudeoMSISDN;

    private java.lang.String sellerID;

    private java.lang.String idValue;

    public SimActivateRequest() {
    }

    public SimActivateRequest(
           java.lang.String SIM,
           java.lang.String psudeoMSISDN,
           java.lang.String sellerID,
           java.lang.String idValue) {
           this.SIM = SIM;
           this.psudeoMSISDN = psudeoMSISDN;
           this.sellerID = sellerID;
           this.idValue = idValue;
    }


    /**
     * Gets the SIM value for this SimActivateRequest.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this SimActivateRequest.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the psudeoMSISDN value for this SimActivateRequest.
     * 
     * @return psudeoMSISDN
     */
    public java.lang.String getPsudeoMSISDN() {
        return psudeoMSISDN;
    }


    /**
     * Sets the psudeoMSISDN value for this SimActivateRequest.
     * 
     * @param psudeoMSISDN
     */
    public void setPsudeoMSISDN(java.lang.String psudeoMSISDN) {
        this.psudeoMSISDN = psudeoMSISDN;
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
     * Gets the idValue value for this SimActivateRequest.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this SimActivateRequest.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
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
        _equals = true && 
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.psudeoMSISDN==null && other.getPsudeoMSISDN()==null) || 
             (this.psudeoMSISDN!=null &&
              this.psudeoMSISDN.equals(other.getPsudeoMSISDN()))) &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue())));
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
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getPsudeoMSISDN() != null) {
            _hashCode += getPsudeoMSISDN().hashCode();
        }
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimActivateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "simActivateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psudeoMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "psudeoMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "sellerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "idValue"));
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
