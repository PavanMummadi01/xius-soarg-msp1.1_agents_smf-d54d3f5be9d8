/**
 * PathInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class PathInfoType  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.RangeType range;

    private java.lang.String location;

    private java.lang.String userName;

    private java.lang.String password;

    private java.lang.String networkId;

    private java.lang.String fileType;

    private java.lang.String createdDate;

    private java.lang.String updatedBy;

    private java.lang.String updatedDate;

    private java.lang.String purpose;

    private java.lang.String validation1_user;

    private java.lang.String validation1_date;

    private java.lang.String validation2_user;

    private java.lang.String validation2_date;

    private java.lang.String validationStatus;

    public PathInfoType() {
    }

    public PathInfoType(
           com.xius.billing.AccountManagement_xsd.RangeType range,
           java.lang.String location,
           java.lang.String userName,
           java.lang.String password,
           java.lang.String networkId,
           java.lang.String fileType,
           java.lang.String createdDate,
           java.lang.String updatedBy,
           java.lang.String updatedDate,
           java.lang.String purpose,
           java.lang.String validation1_user,
           java.lang.String validation1_date,
           java.lang.String validation2_user,
           java.lang.String validation2_date,
           java.lang.String validationStatus) {
           this.range = range;
           this.location = location;
           this.userName = userName;
           this.password = password;
           this.networkId = networkId;
           this.fileType = fileType;
           this.createdDate = createdDate;
           this.updatedBy = updatedBy;
           this.updatedDate = updatedDate;
           this.purpose = purpose;
           this.validation1_user = validation1_user;
           this.validation1_date = validation1_date;
           this.validation2_user = validation2_user;
           this.validation2_date = validation2_date;
           this.validationStatus = validationStatus;
    }


    /**
     * Gets the range value for this PathInfoType.
     * 
     * @return range
     */
    public com.xius.billing.AccountManagement_xsd.RangeType getRange() {
        return range;
    }


    /**
     * Sets the range value for this PathInfoType.
     * 
     * @param range
     */
    public void setRange(com.xius.billing.AccountManagement_xsd.RangeType range) {
        this.range = range;
    }


    /**
     * Gets the location value for this PathInfoType.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PathInfoType.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the userName value for this PathInfoType.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this PathInfoType.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this PathInfoType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PathInfoType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the networkId value for this PathInfoType.
     * 
     * @return networkId
     */
    public java.lang.String getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this PathInfoType.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.String networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the fileType value for this PathInfoType.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this PathInfoType.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the createdDate value for this PathInfoType.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PathInfoType.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the updatedBy value for this PathInfoType.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this PathInfoType.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the updatedDate value for this PathInfoType.
     * 
     * @return updatedDate
     */
    public java.lang.String getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this PathInfoType.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.lang.String updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the purpose value for this PathInfoType.
     * 
     * @return purpose
     */
    public java.lang.String getPurpose() {
        return purpose;
    }


    /**
     * Sets the purpose value for this PathInfoType.
     * 
     * @param purpose
     */
    public void setPurpose(java.lang.String purpose) {
        this.purpose = purpose;
    }


    /**
     * Gets the validation1_user value for this PathInfoType.
     * 
     * @return validation1_user
     */
    public java.lang.String getValidation1_user() {
        return validation1_user;
    }


    /**
     * Sets the validation1_user value for this PathInfoType.
     * 
     * @param validation1_user
     */
    public void setValidation1_user(java.lang.String validation1_user) {
        this.validation1_user = validation1_user;
    }


    /**
     * Gets the validation1_date value for this PathInfoType.
     * 
     * @return validation1_date
     */
    public java.lang.String getValidation1_date() {
        return validation1_date;
    }


    /**
     * Sets the validation1_date value for this PathInfoType.
     * 
     * @param validation1_date
     */
    public void setValidation1_date(java.lang.String validation1_date) {
        this.validation1_date = validation1_date;
    }


    /**
     * Gets the validation2_user value for this PathInfoType.
     * 
     * @return validation2_user
     */
    public java.lang.String getValidation2_user() {
        return validation2_user;
    }


    /**
     * Sets the validation2_user value for this PathInfoType.
     * 
     * @param validation2_user
     */
    public void setValidation2_user(java.lang.String validation2_user) {
        this.validation2_user = validation2_user;
    }


    /**
     * Gets the validation2_date value for this PathInfoType.
     * 
     * @return validation2_date
     */
    public java.lang.String getValidation2_date() {
        return validation2_date;
    }


    /**
     * Sets the validation2_date value for this PathInfoType.
     * 
     * @param validation2_date
     */
    public void setValidation2_date(java.lang.String validation2_date) {
        this.validation2_date = validation2_date;
    }


    /**
     * Gets the validationStatus value for this PathInfoType.
     * 
     * @return validationStatus
     */
    public java.lang.String getValidationStatus() {
        return validationStatus;
    }


    /**
     * Sets the validationStatus value for this PathInfoType.
     * 
     * @param validationStatus
     */
    public void setValidationStatus(java.lang.String validationStatus) {
        this.validationStatus = validationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PathInfoType)) return false;
        PathInfoType other = (PathInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.range==null && other.getRange()==null) || 
             (this.range!=null &&
              this.range.equals(other.getRange()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate()))) &&
            ((this.purpose==null && other.getPurpose()==null) || 
             (this.purpose!=null &&
              this.purpose.equals(other.getPurpose()))) &&
            ((this.validation1_user==null && other.getValidation1_user()==null) || 
             (this.validation1_user!=null &&
              this.validation1_user.equals(other.getValidation1_user()))) &&
            ((this.validation1_date==null && other.getValidation1_date()==null) || 
             (this.validation1_date!=null &&
              this.validation1_date.equals(other.getValidation1_date()))) &&
            ((this.validation2_user==null && other.getValidation2_user()==null) || 
             (this.validation2_user!=null &&
              this.validation2_user.equals(other.getValidation2_user()))) &&
            ((this.validation2_date==null && other.getValidation2_date()==null) || 
             (this.validation2_date!=null &&
              this.validation2_date.equals(other.getValidation2_date()))) &&
            ((this.validationStatus==null && other.getValidationStatus()==null) || 
             (this.validationStatus!=null &&
              this.validationStatus.equals(other.getValidationStatus())));
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
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        if (getPurpose() != null) {
            _hashCode += getPurpose().hashCode();
        }
        if (getValidation1_user() != null) {
            _hashCode += getValidation1_user().hashCode();
        }
        if (getValidation1_date() != null) {
            _hashCode += getValidation1_date().hashCode();
        }
        if (getValidation2_user() != null) {
            _hashCode += getValidation2_user().hashCode();
        }
        if (getValidation2_date() != null) {
            _hashCode += getValidation2_date().hashCode();
        }
        if (getValidationStatus() != null) {
            _hashCode += getValidationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PathInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "PathInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "RangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "updatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purpose");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "purpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation1_user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validation1_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation1_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validation1_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation2_user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validation2_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation2_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validation2_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validationStatus"));
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
