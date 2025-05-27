/**
 * ChangeIMSIRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChangeIMSIRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.AccountType account;

    private java.lang.String newSerialNo;

    private java.lang.String newIMSI;

    private java.lang.Double locationId;

    private java.lang.String operator;

    private java.math.BigDecimal charges;

    private java.lang.Boolean HLRFlag;

    public ChangeIMSIRequest() {
    }

    public ChangeIMSIRequest(
           com.xius.billing.AccountManagement_xsd.AccountType account,
           java.lang.String newSerialNo,
           java.lang.String newIMSI,
           java.lang.Double locationId,
           java.lang.String operator,
           java.math.BigDecimal charges,
           java.lang.Boolean HLRFlag) {
           this.account = account;
           this.newSerialNo = newSerialNo;
           this.newIMSI = newIMSI;
           this.locationId = locationId;
           this.operator = operator;
           this.charges = charges;
           this.HLRFlag = HLRFlag;
    }


    /**
     * Gets the account value for this ChangeIMSIRequest.
     * 
     * @return account
     */
    public com.xius.billing.AccountManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ChangeIMSIRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.AccountManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the newSerialNo value for this ChangeIMSIRequest.
     * 
     * @return newSerialNo
     */
    public java.lang.String getNewSerialNo() {
        return newSerialNo;
    }


    /**
     * Sets the newSerialNo value for this ChangeIMSIRequest.
     * 
     * @param newSerialNo
     */
    public void setNewSerialNo(java.lang.String newSerialNo) {
        this.newSerialNo = newSerialNo;
    }


    /**
     * Gets the newIMSI value for this ChangeIMSIRequest.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this ChangeIMSIRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the locationId value for this ChangeIMSIRequest.
     * 
     * @return locationId
     */
    public java.lang.Double getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this ChangeIMSIRequest.
     * 
     * @param locationId
     */
    public void setLocationId(java.lang.Double locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the operator value for this ChangeIMSIRequest.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ChangeIMSIRequest.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the charges value for this ChangeIMSIRequest.
     * 
     * @return charges
     */
    public java.math.BigDecimal getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this ChangeIMSIRequest.
     * 
     * @param charges
     */
    public void setCharges(java.math.BigDecimal charges) {
        this.charges = charges;
    }


    /**
     * Gets the HLRFlag value for this ChangeIMSIRequest.
     * 
     * @return HLRFlag
     */
    public java.lang.Boolean getHLRFlag() {
        return HLRFlag;
    }


    /**
     * Sets the HLRFlag value for this ChangeIMSIRequest.
     * 
     * @param HLRFlag
     */
    public void setHLRFlag(java.lang.Boolean HLRFlag) {
        this.HLRFlag = HLRFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeIMSIRequest)) return false;
        ChangeIMSIRequest other = (ChangeIMSIRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.newSerialNo==null && other.getNewSerialNo()==null) || 
             (this.newSerialNo!=null &&
              this.newSerialNo.equals(other.getNewSerialNo()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.charges==null && other.getCharges()==null) || 
             (this.charges!=null &&
              this.charges.equals(other.getCharges()))) &&
            ((this.HLRFlag==null && other.getHLRFlag()==null) || 
             (this.HLRFlag!=null &&
              this.HLRFlag.equals(other.getHLRFlag())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getNewSerialNo() != null) {
            _hashCode += getNewSerialNo().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getCharges() != null) {
            _hashCode += getCharges().hashCode();
        }
        if (getHLRFlag() != null) {
            _hashCode += getHLRFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeIMSIRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeIMSIRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HLRFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
