/**
 * AccountDetailsInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class AccountDetailsInfoType  implements java.io.Serializable {
    private java.lang.Long oldAccountId;

    private java.lang.Long newAccountId;

    private java.lang.Long oldMSISDN;

    private java.lang.Long newMSISDN;

    private java.lang.Long oldIMSI;

    private java.lang.Long newIMSI;

    private java.lang.String oldSIM;

    private java.lang.String newSIM;

    public AccountDetailsInfoType() {
    }

    public AccountDetailsInfoType(
           java.lang.Long oldAccountId,
           java.lang.Long newAccountId,
           java.lang.Long oldMSISDN,
           java.lang.Long newMSISDN,
           java.lang.Long oldIMSI,
           java.lang.Long newIMSI,
           java.lang.String oldSIM,
           java.lang.String newSIM) {
           this.oldAccountId = oldAccountId;
           this.newAccountId = newAccountId;
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.oldSIM = oldSIM;
           this.newSIM = newSIM;
    }


    /**
     * Gets the oldAccountId value for this AccountDetailsInfoType.
     * 
     * @return oldAccountId
     */
    public java.lang.Long getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this AccountDetailsInfoType.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(java.lang.Long oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the newAccountId value for this AccountDetailsInfoType.
     * 
     * @return newAccountId
     */
    public java.lang.Long getNewAccountId() {
        return newAccountId;
    }


    /**
     * Sets the newAccountId value for this AccountDetailsInfoType.
     * 
     * @param newAccountId
     */
    public void setNewAccountId(java.lang.Long newAccountId) {
        this.newAccountId = newAccountId;
    }


    /**
     * Gets the oldMSISDN value for this AccountDetailsInfoType.
     * 
     * @return oldMSISDN
     */
    public java.lang.Long getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this AccountDetailsInfoType.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.Long oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this AccountDetailsInfoType.
     * 
     * @return newMSISDN
     */
    public java.lang.Long getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this AccountDetailsInfoType.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.Long newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the oldIMSI value for this AccountDetailsInfoType.
     * 
     * @return oldIMSI
     */
    public java.lang.Long getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this AccountDetailsInfoType.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.Long oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this AccountDetailsInfoType.
     * 
     * @return newIMSI
     */
    public java.lang.Long getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this AccountDetailsInfoType.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.Long newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the oldSIM value for this AccountDetailsInfoType.
     * 
     * @return oldSIM
     */
    public java.lang.String getOldSIM() {
        return oldSIM;
    }


    /**
     * Sets the oldSIM value for this AccountDetailsInfoType.
     * 
     * @param oldSIM
     */
    public void setOldSIM(java.lang.String oldSIM) {
        this.oldSIM = oldSIM;
    }


    /**
     * Gets the newSIM value for this AccountDetailsInfoType.
     * 
     * @return newSIM
     */
    public java.lang.String getNewSIM() {
        return newSIM;
    }


    /**
     * Sets the newSIM value for this AccountDetailsInfoType.
     * 
     * @param newSIM
     */
    public void setNewSIM(java.lang.String newSIM) {
        this.newSIM = newSIM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountDetailsInfoType)) return false;
        AccountDetailsInfoType other = (AccountDetailsInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.newAccountId==null && other.getNewAccountId()==null) || 
             (this.newAccountId!=null &&
              this.newAccountId.equals(other.getNewAccountId()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.oldSIM==null && other.getOldSIM()==null) || 
             (this.oldSIM!=null &&
              this.oldSIM.equals(other.getOldSIM()))) &&
            ((this.newSIM==null && other.getNewSIM()==null) || 
             (this.newSIM!=null &&
              this.newSIM.equals(other.getNewSIM())));
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
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getNewAccountId() != null) {
            _hashCode += getNewAccountId().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getOldSIM() != null) {
            _hashCode += getOldSIM().hashCode();
        }
        if (getNewSIM() != null) {
            _hashCode += getNewSIM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountDetailsInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetailsInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newSIM"));
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
