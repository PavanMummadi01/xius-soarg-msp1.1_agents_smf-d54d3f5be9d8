/**
 * LoginAuthenticateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class LoginAuthenticateResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String password;

    private java.lang.String carrierId;

    private java.lang.String idNumber;

    private java.lang.String idType;

    private java.lang.Boolean isPasswordChgReq;

    private java.lang.Boolean isAdmin;

    private java.lang.String firstName;

    private java.lang.String lastLoginTime;

    private java.lang.Boolean isBareBoneAct;

    public LoginAuthenticateResponse() {
    }

    public LoginAuthenticateResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String userName,
           java.lang.String password,
           java.lang.String carrierId,
           java.lang.String idNumber,
           java.lang.String idType,
           java.lang.Boolean isPasswordChgReq,
           java.lang.Boolean isAdmin,
           java.lang.String firstName,
           java.lang.String lastLoginTime,
           java.lang.Boolean isBareBoneAct) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.userName = userName;
        this.password = password;
        this.carrierId = carrierId;
        this.idNumber = idNumber;
        this.idType = idType;
        this.isPasswordChgReq = isPasswordChgReq;
        this.isAdmin = isAdmin;
        this.firstName = firstName;
        this.lastLoginTime = lastLoginTime;
        this.isBareBoneAct = isBareBoneAct;
    }


    /**
     * Gets the userName value for this LoginAuthenticateResponse.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this LoginAuthenticateResponse.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this LoginAuthenticateResponse.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this LoginAuthenticateResponse.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the carrierId value for this LoginAuthenticateResponse.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this LoginAuthenticateResponse.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the idNumber value for this LoginAuthenticateResponse.
     * 
     * @return idNumber
     */
    public java.lang.String getIdNumber() {
        return idNumber;
    }


    /**
     * Sets the idNumber value for this LoginAuthenticateResponse.
     * 
     * @param idNumber
     */
    public void setIdNumber(java.lang.String idNumber) {
        this.idNumber = idNumber;
    }


    /**
     * Gets the idType value for this LoginAuthenticateResponse.
     * 
     * @return idType
     */
    public java.lang.String getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this LoginAuthenticateResponse.
     * 
     * @param idType
     */
    public void setIdType(java.lang.String idType) {
        this.idType = idType;
    }


    /**
     * Gets the isPasswordChgReq value for this LoginAuthenticateResponse.
     * 
     * @return isPasswordChgReq
     */
    public java.lang.Boolean getIsPasswordChgReq() {
        return isPasswordChgReq;
    }


    /**
     * Sets the isPasswordChgReq value for this LoginAuthenticateResponse.
     * 
     * @param isPasswordChgReq
     */
    public void setIsPasswordChgReq(java.lang.Boolean isPasswordChgReq) {
        this.isPasswordChgReq = isPasswordChgReq;
    }


    /**
     * Gets the isAdmin value for this LoginAuthenticateResponse.
     * 
     * @return isAdmin
     */
    public java.lang.Boolean getIsAdmin() {
        return isAdmin;
    }


    /**
     * Sets the isAdmin value for this LoginAuthenticateResponse.
     * 
     * @param isAdmin
     */
    public void setIsAdmin(java.lang.Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    /**
     * Gets the firstName value for this LoginAuthenticateResponse.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this LoginAuthenticateResponse.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastLoginTime value for this LoginAuthenticateResponse.
     * 
     * @return lastLoginTime
     */
    public java.lang.String getLastLoginTime() {
        return lastLoginTime;
    }


    /**
     * Sets the lastLoginTime value for this LoginAuthenticateResponse.
     * 
     * @param lastLoginTime
     */
    public void setLastLoginTime(java.lang.String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }


    /**
     * Gets the isBareBoneAct value for this LoginAuthenticateResponse.
     * 
     * @return isBareBoneAct
     */
    public java.lang.Boolean getIsBareBoneAct() {
        return isBareBoneAct;
    }


    /**
     * Sets the isBareBoneAct value for this LoginAuthenticateResponse.
     * 
     * @param isBareBoneAct
     */
    public void setIsBareBoneAct(java.lang.Boolean isBareBoneAct) {
        this.isBareBoneAct = isBareBoneAct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginAuthenticateResponse)) return false;
        LoginAuthenticateResponse other = (LoginAuthenticateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.idNumber==null && other.getIdNumber()==null) || 
             (this.idNumber!=null &&
              this.idNumber.equals(other.getIdNumber()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.isPasswordChgReq==null && other.getIsPasswordChgReq()==null) || 
             (this.isPasswordChgReq!=null &&
              this.isPasswordChgReq.equals(other.getIsPasswordChgReq()))) &&
            ((this.isAdmin==null && other.getIsAdmin()==null) || 
             (this.isAdmin!=null &&
              this.isAdmin.equals(other.getIsAdmin()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastLoginTime==null && other.getLastLoginTime()==null) || 
             (this.lastLoginTime!=null &&
              this.lastLoginTime.equals(other.getLastLoginTime()))) &&
            ((this.isBareBoneAct==null && other.getIsBareBoneAct()==null) || 
             (this.isBareBoneAct!=null &&
              this.isBareBoneAct.equals(other.getIsBareBoneAct())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getIdNumber() != null) {
            _hashCode += getIdNumber().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getIsPasswordChgReq() != null) {
            _hashCode += getIsPasswordChgReq().hashCode();
        }
        if (getIsAdmin() != null) {
            _hashCode += getIsAdmin().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastLoginTime() != null) {
            _hashCode += getLastLoginTime().hashCode();
        }
        if (getIsBareBoneAct() != null) {
            _hashCode += getIsBareBoneAct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginAuthenticateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", ">loginAuthenticateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "idNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPasswordChgReq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "isPasswordChgReq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "isAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "lastLoginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBareBoneAct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "isBareBoneAct"));
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
