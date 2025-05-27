/**
 * ChangeMSISDNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChangeMSISDNResponse  implements java.io.Serializable {
    private java.lang.String oldMSISDN;

    private java.lang.String newMSISDN;

    private java.lang.String oldIMSI;

    private com.xius.billing.AccountManagement_xsd.NAMType NAMType;

    private java.lang.String oldmsisdnCCNDC;

    private java.lang.String newMSISDNCCNDC;

    private java.lang.Long accountId;

    private java.lang.String accountType;

    public ChangeMSISDNResponse() {
    }

    public ChangeMSISDNResponse(
           java.lang.String oldMSISDN,
           java.lang.String newMSISDN,
           java.lang.String oldIMSI,
           com.xius.billing.AccountManagement_xsd.NAMType NAMType,
           java.lang.String oldmsisdnCCNDC,
           java.lang.String newMSISDNCCNDC,
           java.lang.Long accountId,
           java.lang.String accountType) {
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.oldIMSI = oldIMSI;
           this.NAMType = NAMType;
           this.oldmsisdnCCNDC = oldmsisdnCCNDC;
           this.newMSISDNCCNDC = newMSISDNCCNDC;
           this.accountId = accountId;
           this.accountType = accountType;
    }


    /**
     * Gets the oldMSISDN value for this ChangeMSISDNResponse.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this ChangeMSISDNResponse.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this ChangeMSISDNResponse.
     * 
     * @return newMSISDN
     */
    public java.lang.String getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this ChangeMSISDNResponse.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.String newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the oldIMSI value for this ChangeMSISDNResponse.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this ChangeMSISDNResponse.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the NAMType value for this ChangeMSISDNResponse.
     * 
     * @return NAMType
     */
    public com.xius.billing.AccountManagement_xsd.NAMType getNAMType() {
        return NAMType;
    }


    /**
     * Sets the NAMType value for this ChangeMSISDNResponse.
     * 
     * @param NAMType
     */
    public void setNAMType(com.xius.billing.AccountManagement_xsd.NAMType NAMType) {
        this.NAMType = NAMType;
    }


    /**
     * Gets the oldmsisdnCCNDC value for this ChangeMSISDNResponse.
     * 
     * @return oldmsisdnCCNDC
     */
    public java.lang.String getOldmsisdnCCNDC() {
        return oldmsisdnCCNDC;
    }


    /**
     * Sets the oldmsisdnCCNDC value for this ChangeMSISDNResponse.
     * 
     * @param oldmsisdnCCNDC
     */
    public void setOldmsisdnCCNDC(java.lang.String oldmsisdnCCNDC) {
        this.oldmsisdnCCNDC = oldmsisdnCCNDC;
    }


    /**
     * Gets the newMSISDNCCNDC value for this ChangeMSISDNResponse.
     * 
     * @return newMSISDNCCNDC
     */
    public java.lang.String getNewMSISDNCCNDC() {
        return newMSISDNCCNDC;
    }


    /**
     * Sets the newMSISDNCCNDC value for this ChangeMSISDNResponse.
     * 
     * @param newMSISDNCCNDC
     */
    public void setNewMSISDNCCNDC(java.lang.String newMSISDNCCNDC) {
        this.newMSISDNCCNDC = newMSISDNCCNDC;
    }


    /**
     * Gets the accountId value for this ChangeMSISDNResponse.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ChangeMSISDNResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountType value for this ChangeMSISDNResponse.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ChangeMSISDNResponse.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMSISDNResponse)) return false;
        ChangeMSISDNResponse other = (ChangeMSISDNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.NAMType==null && other.getNAMType()==null) || 
             (this.NAMType!=null &&
              this.NAMType.equals(other.getNAMType()))) &&
            ((this.oldmsisdnCCNDC==null && other.getOldmsisdnCCNDC()==null) || 
             (this.oldmsisdnCCNDC!=null &&
              this.oldmsisdnCCNDC.equals(other.getOldmsisdnCCNDC()))) &&
            ((this.newMSISDNCCNDC==null && other.getNewMSISDNCCNDC()==null) || 
             (this.newMSISDNCCNDC!=null &&
              this.newMSISDNCCNDC.equals(other.getNewMSISDNCCNDC()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType())));
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
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNAMType() != null) {
            _hashCode += getNAMType().hashCode();
        }
        if (getOldmsisdnCCNDC() != null) {
            _hashCode += getOldmsisdnCCNDC().hashCode();
        }
        if (getNewMSISDNCCNDC() != null) {
            _hashCode += getNewMSISDNCCNDC().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeMSISDNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAMType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NAMType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NAMType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldmsisdnCCNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldmsisdnCCNDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDNCCNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newMSISDNCCNDC"));
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
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountType"));
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
