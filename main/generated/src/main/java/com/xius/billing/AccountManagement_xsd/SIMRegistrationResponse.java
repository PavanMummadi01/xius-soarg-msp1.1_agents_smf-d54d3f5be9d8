/**
 * SIMRegistrationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class SIMRegistrationResponse  implements java.io.Serializable {
    private java.math.BigInteger isSudo;

    private java.lang.String MSISDN;

    private java.lang.Long FRTransNo;

    private java.lang.String oldIMSI;

    private java.lang.String serviceType;

    private java.lang.String oldCCNDC;

    private java.lang.String newCCNDC;

    private java.lang.String actualMsisdn;

    private java.lang.String blockedMsisdn;

    private java.lang.String IMSI;

    private java.lang.Long accountId;

    private java.math.BigDecimal creditLimit;

    private java.lang.Long tariffPackageId;

    public SIMRegistrationResponse() {
    }

    public SIMRegistrationResponse(
           java.math.BigInteger isSudo,
           java.lang.String MSISDN,
           java.lang.Long FRTransNo,
           java.lang.String oldIMSI,
           java.lang.String serviceType,
           java.lang.String oldCCNDC,
           java.lang.String newCCNDC,
           java.lang.String actualMsisdn,
           java.lang.String blockedMsisdn,
           java.lang.String IMSI,
           java.lang.Long accountId,
           java.math.BigDecimal creditLimit,
           java.lang.Long tariffPackageId) {
           this.isSudo = isSudo;
           this.MSISDN = MSISDN;
           this.FRTransNo = FRTransNo;
           this.oldIMSI = oldIMSI;
           this.serviceType = serviceType;
           this.oldCCNDC = oldCCNDC;
           this.newCCNDC = newCCNDC;
           this.actualMsisdn = actualMsisdn;
           this.blockedMsisdn = blockedMsisdn;
           this.IMSI = IMSI;
           this.accountId = accountId;
           this.creditLimit = creditLimit;
           this.tariffPackageId = tariffPackageId;
    }


    /**
     * Gets the isSudo value for this SIMRegistrationResponse.
     * 
     * @return isSudo
     */
    public java.math.BigInteger getIsSudo() {
        return isSudo;
    }


    /**
     * Sets the isSudo value for this SIMRegistrationResponse.
     * 
     * @param isSudo
     */
    public void setIsSudo(java.math.BigInteger isSudo) {
        this.isSudo = isSudo;
    }


    /**
     * Gets the MSISDN value for this SIMRegistrationResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this SIMRegistrationResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the FRTransNo value for this SIMRegistrationResponse.
     * 
     * @return FRTransNo
     */
    public java.lang.Long getFRTransNo() {
        return FRTransNo;
    }


    /**
     * Sets the FRTransNo value for this SIMRegistrationResponse.
     * 
     * @param FRTransNo
     */
    public void setFRTransNo(java.lang.Long FRTransNo) {
        this.FRTransNo = FRTransNo;
    }


    /**
     * Gets the oldIMSI value for this SIMRegistrationResponse.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this SIMRegistrationResponse.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the serviceType value for this SIMRegistrationResponse.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this SIMRegistrationResponse.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the oldCCNDC value for this SIMRegistrationResponse.
     * 
     * @return oldCCNDC
     */
    public java.lang.String getOldCCNDC() {
        return oldCCNDC;
    }


    /**
     * Sets the oldCCNDC value for this SIMRegistrationResponse.
     * 
     * @param oldCCNDC
     */
    public void setOldCCNDC(java.lang.String oldCCNDC) {
        this.oldCCNDC = oldCCNDC;
    }


    /**
     * Gets the newCCNDC value for this SIMRegistrationResponse.
     * 
     * @return newCCNDC
     */
    public java.lang.String getNewCCNDC() {
        return newCCNDC;
    }


    /**
     * Sets the newCCNDC value for this SIMRegistrationResponse.
     * 
     * @param newCCNDC
     */
    public void setNewCCNDC(java.lang.String newCCNDC) {
        this.newCCNDC = newCCNDC;
    }


    /**
     * Gets the actualMsisdn value for this SIMRegistrationResponse.
     * 
     * @return actualMsisdn
     */
    public java.lang.String getActualMsisdn() {
        return actualMsisdn;
    }


    /**
     * Sets the actualMsisdn value for this SIMRegistrationResponse.
     * 
     * @param actualMsisdn
     */
    public void setActualMsisdn(java.lang.String actualMsisdn) {
        this.actualMsisdn = actualMsisdn;
    }


    /**
     * Gets the blockedMsisdn value for this SIMRegistrationResponse.
     * 
     * @return blockedMsisdn
     */
    public java.lang.String getBlockedMsisdn() {
        return blockedMsisdn;
    }


    /**
     * Sets the blockedMsisdn value for this SIMRegistrationResponse.
     * 
     * @param blockedMsisdn
     */
    public void setBlockedMsisdn(java.lang.String blockedMsisdn) {
        this.blockedMsisdn = blockedMsisdn;
    }


    /**
     * Gets the IMSI value for this SIMRegistrationResponse.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this SIMRegistrationResponse.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the accountId value for this SIMRegistrationResponse.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SIMRegistrationResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the creditLimit value for this SIMRegistrationResponse.
     * 
     * @return creditLimit
     */
    public java.math.BigDecimal getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this SIMRegistrationResponse.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.math.BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the tariffPackageId value for this SIMRegistrationResponse.
     * 
     * @return tariffPackageId
     */
    public java.lang.Long getTariffPackageId() {
        return tariffPackageId;
    }


    /**
     * Sets the tariffPackageId value for this SIMRegistrationResponse.
     * 
     * @param tariffPackageId
     */
    public void setTariffPackageId(java.lang.Long tariffPackageId) {
        this.tariffPackageId = tariffPackageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMRegistrationResponse)) return false;
        SIMRegistrationResponse other = (SIMRegistrationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isSudo==null && other.getIsSudo()==null) || 
             (this.isSudo!=null &&
              this.isSudo.equals(other.getIsSudo()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.FRTransNo==null && other.getFRTransNo()==null) || 
             (this.FRTransNo!=null &&
              this.FRTransNo.equals(other.getFRTransNo()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.oldCCNDC==null && other.getOldCCNDC()==null) || 
             (this.oldCCNDC!=null &&
              this.oldCCNDC.equals(other.getOldCCNDC()))) &&
            ((this.newCCNDC==null && other.getNewCCNDC()==null) || 
             (this.newCCNDC!=null &&
              this.newCCNDC.equals(other.getNewCCNDC()))) &&
            ((this.actualMsisdn==null && other.getActualMsisdn()==null) || 
             (this.actualMsisdn!=null &&
              this.actualMsisdn.equals(other.getActualMsisdn()))) &&
            ((this.blockedMsisdn==null && other.getBlockedMsisdn()==null) || 
             (this.blockedMsisdn!=null &&
              this.blockedMsisdn.equals(other.getBlockedMsisdn()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.tariffPackageId==null && other.getTariffPackageId()==null) || 
             (this.tariffPackageId!=null &&
              this.tariffPackageId.equals(other.getTariffPackageId())));
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
        if (getIsSudo() != null) {
            _hashCode += getIsSudo().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getFRTransNo() != null) {
            _hashCode += getFRTransNo().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getOldCCNDC() != null) {
            _hashCode += getOldCCNDC().hashCode();
        }
        if (getNewCCNDC() != null) {
            _hashCode += getNewCCNDC().hashCode();
        }
        if (getActualMsisdn() != null) {
            _hashCode += getActualMsisdn().hashCode();
        }
        if (getBlockedMsisdn() != null) {
            _hashCode += getBlockedMsisdn().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getTariffPackageId() != null) {
            _hashCode += getTariffPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIMRegistrationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SIMRegistrationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSudo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "isSudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FRTransNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "FRTransNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCCNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldCCNDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCCNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newCCNDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "actualMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "blockedMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "IMSI"));
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
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tariffPackageId"));
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
