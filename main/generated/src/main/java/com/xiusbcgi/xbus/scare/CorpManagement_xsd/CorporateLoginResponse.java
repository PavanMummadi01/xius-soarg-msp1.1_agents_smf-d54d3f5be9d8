/**
 * CorporateLoginResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class CorporateLoginResponse  implements java.io.Serializable {
    private java.lang.String IDNo;

    private java.lang.String idType;

    private java.math.BigInteger netWorkId;

    private java.lang.Boolean isAdmin;

    private java.math.BigDecimal balance;

    private java.lang.Boolean forceChangePassword;

    public CorporateLoginResponse() {
    }

    public CorporateLoginResponse(
           java.lang.String IDNo,
           java.lang.String idType,
           java.math.BigInteger netWorkId,
           java.lang.Boolean isAdmin,
           java.math.BigDecimal balance,
           java.lang.Boolean forceChangePassword) {
           this.IDNo = IDNo;
           this.idType = idType;
           this.netWorkId = netWorkId;
           this.isAdmin = isAdmin;
           this.balance = balance;
           this.forceChangePassword = forceChangePassword;
    }


    /**
     * Gets the IDNo value for this CorporateLoginResponse.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this CorporateLoginResponse.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the idType value for this CorporateLoginResponse.
     * 
     * @return idType
     */
    public java.lang.String getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this CorporateLoginResponse.
     * 
     * @param idType
     */
    public void setIdType(java.lang.String idType) {
        this.idType = idType;
    }


    /**
     * Gets the netWorkId value for this CorporateLoginResponse.
     * 
     * @return netWorkId
     */
    public java.math.BigInteger getNetWorkId() {
        return netWorkId;
    }


    /**
     * Sets the netWorkId value for this CorporateLoginResponse.
     * 
     * @param netWorkId
     */
    public void setNetWorkId(java.math.BigInteger netWorkId) {
        this.netWorkId = netWorkId;
    }


    /**
     * Gets the isAdmin value for this CorporateLoginResponse.
     * 
     * @return isAdmin
     */
    public java.lang.Boolean getIsAdmin() {
        return isAdmin;
    }


    /**
     * Sets the isAdmin value for this CorporateLoginResponse.
     * 
     * @param isAdmin
     */
    public void setIsAdmin(java.lang.Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    /**
     * Gets the balance value for this CorporateLoginResponse.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CorporateLoginResponse.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the forceChangePassword value for this CorporateLoginResponse.
     * 
     * @return forceChangePassword
     */
    public java.lang.Boolean getForceChangePassword() {
        return forceChangePassword;
    }


    /**
     * Sets the forceChangePassword value for this CorporateLoginResponse.
     * 
     * @param forceChangePassword
     */
    public void setForceChangePassword(java.lang.Boolean forceChangePassword) {
        this.forceChangePassword = forceChangePassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorporateLoginResponse)) return false;
        CorporateLoginResponse other = (CorporateLoginResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.netWorkId==null && other.getNetWorkId()==null) || 
             (this.netWorkId!=null &&
              this.netWorkId.equals(other.getNetWorkId()))) &&
            ((this.isAdmin==null && other.getIsAdmin()==null) || 
             (this.isAdmin!=null &&
              this.isAdmin.equals(other.getIsAdmin()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.forceChangePassword==null && other.getForceChangePassword()==null) || 
             (this.forceChangePassword!=null &&
              this.forceChangePassword.equals(other.getForceChangePassword())));
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
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getNetWorkId() != null) {
            _hashCode += getNetWorkId().hashCode();
        }
        if (getIsAdmin() != null) {
            _hashCode += getIsAdmin().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getForceChangePassword() != null) {
            _hashCode += getForceChangePassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorporateLoginResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "CorporateLoginResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "IdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netWorkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "netWorkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "isAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceChangePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "forceChangePassword"));
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
