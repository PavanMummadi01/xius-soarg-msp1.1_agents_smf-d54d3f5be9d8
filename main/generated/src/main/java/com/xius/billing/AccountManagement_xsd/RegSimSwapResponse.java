/**
 * RegSimSwapResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class RegSimSwapResponse  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.Long accountId;

    private java.lang.String oldCCMsisdn;

    private java.lang.String newCCMsisdn;

    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.Long msisdnType;

    public RegSimSwapResponse() {
    }

    public RegSimSwapResponse(
           java.lang.String MSISDN,
           java.lang.Long accountId,
           java.lang.String oldCCMsisdn,
           java.lang.String newCCMsisdn,
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.Long msisdnType) {
           this.MSISDN = MSISDN;
           this.accountId = accountId;
           this.oldCCMsisdn = oldCCMsisdn;
           this.newCCMsisdn = newCCMsisdn;
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.msisdnType = msisdnType;
    }


    /**
     * Gets the MSISDN value for this RegSimSwapResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this RegSimSwapResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the accountId value for this RegSimSwapResponse.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this RegSimSwapResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the oldCCMsisdn value for this RegSimSwapResponse.
     * 
     * @return oldCCMsisdn
     */
    public java.lang.String getOldCCMsisdn() {
        return oldCCMsisdn;
    }


    /**
     * Sets the oldCCMsisdn value for this RegSimSwapResponse.
     * 
     * @param oldCCMsisdn
     */
    public void setOldCCMsisdn(java.lang.String oldCCMsisdn) {
        this.oldCCMsisdn = oldCCMsisdn;
    }


    /**
     * Gets the newCCMsisdn value for this RegSimSwapResponse.
     * 
     * @return newCCMsisdn
     */
    public java.lang.String getNewCCMsisdn() {
        return newCCMsisdn;
    }


    /**
     * Sets the newCCMsisdn value for this RegSimSwapResponse.
     * 
     * @param newCCMsisdn
     */
    public void setNewCCMsisdn(java.lang.String newCCMsisdn) {
        this.newCCMsisdn = newCCMsisdn;
    }


    /**
     * Gets the oldIMSI value for this RegSimSwapResponse.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this RegSimSwapResponse.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this RegSimSwapResponse.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this RegSimSwapResponse.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the msisdnType value for this RegSimSwapResponse.
     * 
     * @return msisdnType
     */
    public java.lang.Long getMsisdnType() {
        return msisdnType;
    }


    /**
     * Sets the msisdnType value for this RegSimSwapResponse.
     * 
     * @param msisdnType
     */
    public void setMsisdnType(java.lang.Long msisdnType) {
        this.msisdnType = msisdnType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegSimSwapResponse)) return false;
        RegSimSwapResponse other = (RegSimSwapResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.oldCCMsisdn==null && other.getOldCCMsisdn()==null) || 
             (this.oldCCMsisdn!=null &&
              this.oldCCMsisdn.equals(other.getOldCCMsisdn()))) &&
            ((this.newCCMsisdn==null && other.getNewCCMsisdn()==null) || 
             (this.newCCMsisdn!=null &&
              this.newCCMsisdn.equals(other.getNewCCMsisdn()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.msisdnType==null && other.getMsisdnType()==null) || 
             (this.msisdnType!=null &&
              this.msisdnType.equals(other.getMsisdnType())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getOldCCMsisdn() != null) {
            _hashCode += getOldCCMsisdn().hashCode();
        }
        if (getNewCCMsisdn() != null) {
            _hashCode += getNewCCMsisdn().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getMsisdnType() != null) {
            _hashCode += getMsisdnType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegSimSwapResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RegSimSwapResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCCMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldCCMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCCMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newCCMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "msisdnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
