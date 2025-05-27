/**
 * GetTripletDtlsForRegResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetTripletDtlsForRegResponse  implements java.io.Serializable {
    private java.lang.String SIM;

    private java.math.BigInteger isSudo;

    private java.lang.String oldMSISDN;

    private java.lang.String newMSISDN;

    private java.lang.String oldCCMSISDN;

    private java.lang.String newCCMSISDN;

    public GetTripletDtlsForRegResponse() {
    }

    public GetTripletDtlsForRegResponse(
           java.lang.String SIM,
           java.math.BigInteger isSudo,
           java.lang.String oldMSISDN,
           java.lang.String newMSISDN,
           java.lang.String oldCCMSISDN,
           java.lang.String newCCMSISDN) {
           this.SIM = SIM;
           this.isSudo = isSudo;
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.oldCCMSISDN = oldCCMSISDN;
           this.newCCMSISDN = newCCMSISDN;
    }


    /**
     * Gets the SIM value for this GetTripletDtlsForRegResponse.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this GetTripletDtlsForRegResponse.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the isSudo value for this GetTripletDtlsForRegResponse.
     * 
     * @return isSudo
     */
    public java.math.BigInteger getIsSudo() {
        return isSudo;
    }


    /**
     * Sets the isSudo value for this GetTripletDtlsForRegResponse.
     * 
     * @param isSudo
     */
    public void setIsSudo(java.math.BigInteger isSudo) {
        this.isSudo = isSudo;
    }


    /**
     * Gets the oldMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @return newMSISDN
     */
    public java.lang.String getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.String newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the oldCCMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @return oldCCMSISDN
     */
    public java.lang.String getOldCCMSISDN() {
        return oldCCMSISDN;
    }


    /**
     * Sets the oldCCMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @param oldCCMSISDN
     */
    public void setOldCCMSISDN(java.lang.String oldCCMSISDN) {
        this.oldCCMSISDN = oldCCMSISDN;
    }


    /**
     * Gets the newCCMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @return newCCMSISDN
     */
    public java.lang.String getNewCCMSISDN() {
        return newCCMSISDN;
    }


    /**
     * Sets the newCCMSISDN value for this GetTripletDtlsForRegResponse.
     * 
     * @param newCCMSISDN
     */
    public void setNewCCMSISDN(java.lang.String newCCMSISDN) {
        this.newCCMSISDN = newCCMSISDN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTripletDtlsForRegResponse)) return false;
        GetTripletDtlsForRegResponse other = (GetTripletDtlsForRegResponse) obj;
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
            ((this.isSudo==null && other.getIsSudo()==null) || 
             (this.isSudo!=null &&
              this.isSudo.equals(other.getIsSudo()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.oldCCMSISDN==null && other.getOldCCMSISDN()==null) || 
             (this.oldCCMSISDN!=null &&
              this.oldCCMSISDN.equals(other.getOldCCMSISDN()))) &&
            ((this.newCCMSISDN==null && other.getNewCCMSISDN()==null) || 
             (this.newCCMSISDN!=null &&
              this.newCCMSISDN.equals(other.getNewCCMSISDN())));
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
        if (getIsSudo() != null) {
            _hashCode += getIsSudo().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getOldCCMSISDN() != null) {
            _hashCode += getOldCCMSISDN().hashCode();
        }
        if (getNewCCMSISDN() != null) {
            _hashCode += getNewCCMSISDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTripletDtlsForRegResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getTripletDtlsForRegResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSudo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "isSudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCCMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldCCMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCCMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newCCMSISDN"));
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
