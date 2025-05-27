/**
 * GetLicenseInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TTprovisioning_xsd;

public class GetLicenseInfoResponse  implements java.io.Serializable {
    private java.lang.String mvnoName;

    private java.lang.String status;

    private java.lang.String serviceType;

    private java.lang.String remainingLicense;

    private java.lang.String licenseUsed;

    private java.lang.String totalActiveLicense;

    private java.lang.String licenseType;

    private com.xius.tia.TTprovisioning_xsd.ResponseDataType responseData;

    public GetLicenseInfoResponse() {
    }

    public GetLicenseInfoResponse(
           java.lang.String mvnoName,
           java.lang.String status,
           java.lang.String serviceType,
           java.lang.String remainingLicense,
           java.lang.String licenseUsed,
           java.lang.String totalActiveLicense,
           java.lang.String licenseType,
           com.xius.tia.TTprovisioning_xsd.ResponseDataType responseData) {
           this.mvnoName = mvnoName;
           this.status = status;
           this.serviceType = serviceType;
           this.remainingLicense = remainingLicense;
           this.licenseUsed = licenseUsed;
           this.totalActiveLicense = totalActiveLicense;
           this.licenseType = licenseType;
           this.responseData = responseData;
    }


    /**
     * Gets the mvnoName value for this GetLicenseInfoResponse.
     * 
     * @return mvnoName
     */
    public java.lang.String getMvnoName() {
        return mvnoName;
    }


    /**
     * Sets the mvnoName value for this GetLicenseInfoResponse.
     * 
     * @param mvnoName
     */
    public void setMvnoName(java.lang.String mvnoName) {
        this.mvnoName = mvnoName;
    }


    /**
     * Gets the status value for this GetLicenseInfoResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetLicenseInfoResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the serviceType value for this GetLicenseInfoResponse.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this GetLicenseInfoResponse.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the remainingLicense value for this GetLicenseInfoResponse.
     * 
     * @return remainingLicense
     */
    public java.lang.String getRemainingLicense() {
        return remainingLicense;
    }


    /**
     * Sets the remainingLicense value for this GetLicenseInfoResponse.
     * 
     * @param remainingLicense
     */
    public void setRemainingLicense(java.lang.String remainingLicense) {
        this.remainingLicense = remainingLicense;
    }


    /**
     * Gets the licenseUsed value for this GetLicenseInfoResponse.
     * 
     * @return licenseUsed
     */
    public java.lang.String getLicenseUsed() {
        return licenseUsed;
    }


    /**
     * Sets the licenseUsed value for this GetLicenseInfoResponse.
     * 
     * @param licenseUsed
     */
    public void setLicenseUsed(java.lang.String licenseUsed) {
        this.licenseUsed = licenseUsed;
    }


    /**
     * Gets the totalActiveLicense value for this GetLicenseInfoResponse.
     * 
     * @return totalActiveLicense
     */
    public java.lang.String getTotalActiveLicense() {
        return totalActiveLicense;
    }


    /**
     * Sets the totalActiveLicense value for this GetLicenseInfoResponse.
     * 
     * @param totalActiveLicense
     */
    public void setTotalActiveLicense(java.lang.String totalActiveLicense) {
        this.totalActiveLicense = totalActiveLicense;
    }


    /**
     * Gets the licenseType value for this GetLicenseInfoResponse.
     * 
     * @return licenseType
     */
    public java.lang.String getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this GetLicenseInfoResponse.
     * 
     * @param licenseType
     */
    public void setLicenseType(java.lang.String licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the responseData value for this GetLicenseInfoResponse.
     * 
     * @return responseData
     */
    public com.xius.tia.TTprovisioning_xsd.ResponseDataType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this GetLicenseInfoResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.xius.tia.TTprovisioning_xsd.ResponseDataType responseData) {
        this.responseData = responseData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLicenseInfoResponse)) return false;
        GetLicenseInfoResponse other = (GetLicenseInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mvnoName==null && other.getMvnoName()==null) || 
             (this.mvnoName!=null &&
              this.mvnoName.equals(other.getMvnoName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.remainingLicense==null && other.getRemainingLicense()==null) || 
             (this.remainingLicense!=null &&
              this.remainingLicense.equals(other.getRemainingLicense()))) &&
            ((this.licenseUsed==null && other.getLicenseUsed()==null) || 
             (this.licenseUsed!=null &&
              this.licenseUsed.equals(other.getLicenseUsed()))) &&
            ((this.totalActiveLicense==null && other.getTotalActiveLicense()==null) || 
             (this.totalActiveLicense!=null &&
              this.totalActiveLicense.equals(other.getTotalActiveLicense()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData())));
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
        if (getMvnoName() != null) {
            _hashCode += getMvnoName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getRemainingLicense() != null) {
            _hashCode += getRemainingLicense().hashCode();
        }
        if (getLicenseUsed() != null) {
            _hashCode += getLicenseUsed().hashCode();
        }
        if (getTotalActiveLicense() != null) {
            _hashCode += getTotalActiveLicense().hashCode();
        }
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLicenseInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "getLicenseInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mvnoName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "mvnoName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "remainingLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "licenseUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalActiveLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "totalActiveLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "licenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ResponseDataType"));
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
