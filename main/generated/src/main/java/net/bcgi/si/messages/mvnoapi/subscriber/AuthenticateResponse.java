/**
 * AuthenticateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AuthenticateResponse  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.Boolean isBareBoneAccount;

    private java.lang.String carrierId;

    private java.lang.String correlationID;

    private net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors;

    private java.lang.String firstName;

    private java.lang.String idNumber;

    private java.lang.String idType;

    private java.lang.Boolean isAdmin;

    private java.util.Calendar lastLoginTime;

    private java.lang.Boolean passwordChangeReq;

    private net.bcgi.si.messages.mvnoapi.common.ServiceContext mServiceContext;

    private net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode;

    private java.util.Calendar timeStamp;

    private java.lang.String userAccountName;

    private java.lang.String userAccountPassword;

    private java.lang.String version;

    private org.apache.axis.message.MessageElement [] _any;

    public AuthenticateResponse() {
    }

    public AuthenticateResponse(
           java.lang.Boolean isBareBoneAccount,
           java.lang.String carrierId,
           java.lang.String correlationID,
           net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors,
           java.lang.String firstName,
           java.lang.String idNumber,
           java.lang.String idType,
           java.lang.Boolean isAdmin,
           java.util.Calendar lastLoginTime,
           java.lang.Boolean passwordChangeReq,
           net.bcgi.si.messages.mvnoapi.common.ServiceContext mServiceContext,
           net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String userAccountName,
           java.lang.String userAccountPassword,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any) {
           this.isBareBoneAccount = isBareBoneAccount;
           this.carrierId = carrierId;
           this.correlationID = correlationID;
           this.errors = errors;
           this.firstName = firstName;
           this.idNumber = idNumber;
           this.idType = idType;
           this.isAdmin = isAdmin;
           this.lastLoginTime = lastLoginTime;
           this.passwordChangeReq = passwordChangeReq;
           this.mServiceContext = mServiceContext;
           this.statusCode = statusCode;
           this.timeStamp = timeStamp;
           this.userAccountName = userAccountName;
           this.userAccountPassword = userAccountPassword;
           this.version = version;
           this._any = _any;
    }


    /**
     * Gets the isBareBoneAccount value for this AuthenticateResponse.
     * 
     * @return isBareBoneAccount
     */
    public java.lang.Boolean getIsBareBoneAccount() {
        return isBareBoneAccount;
    }


    /**
     * Sets the isBareBoneAccount value for this AuthenticateResponse.
     * 
     * @param isBareBoneAccount
     */
    public void setIsBareBoneAccount(java.lang.Boolean isBareBoneAccount) {
        this.isBareBoneAccount = isBareBoneAccount;
    }


    /**
     * Gets the carrierId value for this AuthenticateResponse.
     * 
     * @return carrierId
     */
    public java.lang.String getCarrierId() {
        return carrierId;
    }


    /**
     * Sets the carrierId value for this AuthenticateResponse.
     * 
     * @param carrierId
     */
    public void setCarrierId(java.lang.String carrierId) {
        this.carrierId = carrierId;
    }


    /**
     * Gets the correlationID value for this AuthenticateResponse.
     * 
     * @return correlationID
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this AuthenticateResponse.
     * 
     * @param correlationID
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the errors value for this AuthenticateResponse.
     * 
     * @return errors
     */
    public net.bcgi.si.messages.mvnoapi.common.ErrorData[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this AuthenticateResponse.
     * 
     * @param errors
     */
    public void setErrors(net.bcgi.si.messages.mvnoapi.common.ErrorData[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the firstName value for this AuthenticateResponse.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this AuthenticateResponse.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the idNumber value for this AuthenticateResponse.
     * 
     * @return idNumber
     */
    public java.lang.String getIdNumber() {
        return idNumber;
    }


    /**
     * Sets the idNumber value for this AuthenticateResponse.
     * 
     * @param idNumber
     */
    public void setIdNumber(java.lang.String idNumber) {
        this.idNumber = idNumber;
    }


    /**
     * Gets the idType value for this AuthenticateResponse.
     * 
     * @return idType
     */
    public java.lang.String getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this AuthenticateResponse.
     * 
     * @param idType
     */
    public void setIdType(java.lang.String idType) {
        this.idType = idType;
    }


    /**
     * Gets the isAdmin value for this AuthenticateResponse.
     * 
     * @return isAdmin
     */
    public java.lang.Boolean getIsAdmin() {
        return isAdmin;
    }


    /**
     * Sets the isAdmin value for this AuthenticateResponse.
     * 
     * @param isAdmin
     */
    public void setIsAdmin(java.lang.Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    /**
     * Gets the lastLoginTime value for this AuthenticateResponse.
     * 
     * @return lastLoginTime
     */
    public java.util.Calendar getLastLoginTime() {
        return lastLoginTime;
    }


    /**
     * Sets the lastLoginTime value for this AuthenticateResponse.
     * 
     * @param lastLoginTime
     */
    public void setLastLoginTime(java.util.Calendar lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }


    /**
     * Gets the passwordChangeReq value for this AuthenticateResponse.
     * 
     * @return passwordChangeReq
     */
    public java.lang.Boolean getPasswordChangeReq() {
        return passwordChangeReq;
    }


    /**
     * Sets the passwordChangeReq value for this AuthenticateResponse.
     * 
     * @param passwordChangeReq
     */
    public void setPasswordChangeReq(java.lang.Boolean passwordChangeReq) {
        this.passwordChangeReq = passwordChangeReq;
    }


    /**
     * Gets the mServiceContext value for this AuthenticateResponse.
     * 
     * @return mServiceContext
     */
    public net.bcgi.si.messages.mvnoapi.common.ServiceContext getMServiceContext() {
        return mServiceContext;
    }


    /**
     * Sets the mServiceContext value for this AuthenticateResponse.
     * 
     * @param mServiceContext
     */
    public void setMServiceContext(net.bcgi.si.messages.mvnoapi.common.ServiceContext mServiceContext) {
        this.mServiceContext = mServiceContext;
    }


    /**
     * Gets the statusCode value for this AuthenticateResponse.
     * 
     * @return statusCode
     */
    public net.bcgi.si.messages.mvnoapi.common.StatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this AuthenticateResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(net.bcgi.si.messages.mvnoapi.common.StatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the timeStamp value for this AuthenticateResponse.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this AuthenticateResponse.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the userAccountName value for this AuthenticateResponse.
     * 
     * @return userAccountName
     */
    public java.lang.String getUserAccountName() {
        return userAccountName;
    }


    /**
     * Sets the userAccountName value for this AuthenticateResponse.
     * 
     * @param userAccountName
     */
    public void setUserAccountName(java.lang.String userAccountName) {
        this.userAccountName = userAccountName;
    }


    /**
     * Gets the userAccountPassword value for this AuthenticateResponse.
     * 
     * @return userAccountPassword
     */
    public java.lang.String getUserAccountPassword() {
        return userAccountPassword;
    }


    /**
     * Sets the userAccountPassword value for this AuthenticateResponse.
     * 
     * @param userAccountPassword
     */
    public void setUserAccountPassword(java.lang.String userAccountPassword) {
        this.userAccountPassword = userAccountPassword;
    }


    /**
     * Gets the version value for this AuthenticateResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AuthenticateResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the _any value for this AuthenticateResponse.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AuthenticateResponse.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticateResponse)) return false;
        AuthenticateResponse other = (AuthenticateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isBareBoneAccount==null && other.getIsBareBoneAccount()==null) || 
             (this.isBareBoneAccount!=null &&
              this.isBareBoneAccount.equals(other.getIsBareBoneAccount()))) &&
            ((this.carrierId==null && other.getCarrierId()==null) || 
             (this.carrierId!=null &&
              this.carrierId.equals(other.getCarrierId()))) &&
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.idNumber==null && other.getIdNumber()==null) || 
             (this.idNumber!=null &&
              this.idNumber.equals(other.getIdNumber()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.isAdmin==null && other.getIsAdmin()==null) || 
             (this.isAdmin!=null &&
              this.isAdmin.equals(other.getIsAdmin()))) &&
            ((this.lastLoginTime==null && other.getLastLoginTime()==null) || 
             (this.lastLoginTime!=null &&
              this.lastLoginTime.equals(other.getLastLoginTime()))) &&
            ((this.passwordChangeReq==null && other.getPasswordChangeReq()==null) || 
             (this.passwordChangeReq!=null &&
              this.passwordChangeReq.equals(other.getPasswordChangeReq()))) &&
            ((this.mServiceContext==null && other.getMServiceContext()==null) || 
             (this.mServiceContext!=null &&
              this.mServiceContext.equals(other.getMServiceContext()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.userAccountName==null && other.getUserAccountName()==null) || 
             (this.userAccountName!=null &&
              this.userAccountName.equals(other.getUserAccountName()))) &&
            ((this.userAccountPassword==null && other.getUserAccountPassword()==null) || 
             (this.userAccountPassword!=null &&
              this.userAccountPassword.equals(other.getUserAccountPassword()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getIsBareBoneAccount() != null) {
            _hashCode += getIsBareBoneAccount().hashCode();
        }
        if (getCarrierId() != null) {
            _hashCode += getCarrierId().hashCode();
        }
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getIdNumber() != null) {
            _hashCode += getIdNumber().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getIsAdmin() != null) {
            _hashCode += getIsAdmin().hashCode();
        }
        if (getLastLoginTime() != null) {
            _hashCode += getLastLoginTime().hashCode();
        }
        if (getPasswordChangeReq() != null) {
            _hashCode += getPasswordChangeReq().hashCode();
        }
        if (getMServiceContext() != null) {
            _hashCode += getMServiceContext().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getUserAccountName() != null) {
            _hashCode += getUserAccountName().hashCode();
        }
        if (getUserAccountPassword() != null) {
            _hashCode += getUserAccountPassword().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AuthenticateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBareBoneAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "isBareBoneAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "carrierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "correlationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ErrorData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "idNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "isAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastLoginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordChangeReq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "passwordChangeReq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MServiceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "mServiceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "ServiceContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "StatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userAccountPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
