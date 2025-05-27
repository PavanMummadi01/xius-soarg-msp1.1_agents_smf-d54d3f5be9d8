/**
 * CARenwlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.communityaccountservice;

public class CARenwlType  implements java.io.Serializable {
    private long grpId;

    private java.lang.String grpName;

    private java.lang.Long pkgId;

    private java.lang.String pkgName;

    private java.math.BigDecimal pkgRentalAmt;

    private java.lang.Long acctId;

    private java.lang.Long msisdn;

    public CARenwlType() {
    }

    public CARenwlType(
           long grpId,
           java.lang.String grpName,
           java.lang.Long pkgId,
           java.lang.String pkgName,
           java.math.BigDecimal pkgRentalAmt,
           java.lang.Long acctId,
           java.lang.Long msisdn) {
           this.grpId = grpId;
           this.grpName = grpName;
           this.pkgId = pkgId;
           this.pkgName = pkgName;
           this.pkgRentalAmt = pkgRentalAmt;
           this.acctId = acctId;
           this.msisdn = msisdn;
    }


    /**
     * Gets the grpId value for this CARenwlType.
     * 
     * @return grpId
     */
    public long getGrpId() {
        return grpId;
    }


    /**
     * Sets the grpId value for this CARenwlType.
     * 
     * @param grpId
     */
    public void setGrpId(long grpId) {
        this.grpId = grpId;
    }


    /**
     * Gets the grpName value for this CARenwlType.
     * 
     * @return grpName
     */
    public java.lang.String getGrpName() {
        return grpName;
    }


    /**
     * Sets the grpName value for this CARenwlType.
     * 
     * @param grpName
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }


    /**
     * Gets the pkgId value for this CARenwlType.
     * 
     * @return pkgId
     */
    public java.lang.Long getPkgId() {
        return pkgId;
    }


    /**
     * Sets the pkgId value for this CARenwlType.
     * 
     * @param pkgId
     */
    public void setPkgId(java.lang.Long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * Gets the pkgName value for this CARenwlType.
     * 
     * @return pkgName
     */
    public java.lang.String getPkgName() {
        return pkgName;
    }


    /**
     * Sets the pkgName value for this CARenwlType.
     * 
     * @param pkgName
     */
    public void setPkgName(java.lang.String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * Gets the pkgRentalAmt value for this CARenwlType.
     * 
     * @return pkgRentalAmt
     */
    public java.math.BigDecimal getPkgRentalAmt() {
        return pkgRentalAmt;
    }


    /**
     * Sets the pkgRentalAmt value for this CARenwlType.
     * 
     * @param pkgRentalAmt
     */
    public void setPkgRentalAmt(java.math.BigDecimal pkgRentalAmt) {
        this.pkgRentalAmt = pkgRentalAmt;
    }


    /**
     * Gets the acctId value for this CARenwlType.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this CARenwlType.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the msisdn value for this CARenwlType.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this CARenwlType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CARenwlType)) return false;
        CARenwlType other = (CARenwlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.grpId == other.getGrpId() &&
            ((this.grpName==null && other.getGrpName()==null) || 
             (this.grpName!=null &&
              this.grpName.equals(other.getGrpName()))) &&
            ((this.pkgId==null && other.getPkgId()==null) || 
             (this.pkgId!=null &&
              this.pkgId.equals(other.getPkgId()))) &&
            ((this.pkgName==null && other.getPkgName()==null) || 
             (this.pkgName!=null &&
              this.pkgName.equals(other.getPkgName()))) &&
            ((this.pkgRentalAmt==null && other.getPkgRentalAmt()==null) || 
             (this.pkgRentalAmt!=null &&
              this.pkgRentalAmt.equals(other.getPkgRentalAmt()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn())));
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
        _hashCode += new Long(getGrpId()).hashCode();
        if (getGrpName() != null) {
            _hashCode += getGrpName().hashCode();
        }
        if (getPkgId() != null) {
            _hashCode += getPkgId().hashCode();
        }
        if (getPkgName() != null) {
            _hashCode += getPkgName().hashCode();
        }
        if (getPkgRentalAmt() != null) {
            _hashCode += getPkgRentalAmt().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CARenwlType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "CARenwlType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "grpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgRentalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "pkgRentalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/communityaccountservice", "msisdn"));
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
