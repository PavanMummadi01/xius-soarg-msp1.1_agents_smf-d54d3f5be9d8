/**
 * UploadTopUpScheduleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class UploadTopUpScheduleRequest  implements java.io.Serializable {
    private java.math.BigInteger officeCode;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType flag;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] uploadDetails;

    public UploadTopUpScheduleRequest() {
    }

    public UploadTopUpScheduleRequest(
           java.math.BigInteger officeCode,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType flag,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] uploadDetails) {
           this.officeCode = officeCode;
           this.flag = flag;
           this.uploadDetails = uploadDetails;
    }


    /**
     * Gets the officeCode value for this UploadTopUpScheduleRequest.
     * 
     * @return officeCode
     */
    public java.math.BigInteger getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this UploadTopUpScheduleRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.math.BigInteger officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the flag value for this UploadTopUpScheduleRequest.
     * 
     * @return flag
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this UploadTopUpScheduleRequest.
     * 
     * @param flag
     */
    public void setFlag(com.xiusbcgi.xbus.scare.CorpManagement_xsd.ActionFlagType flag) {
        this.flag = flag;
    }


    /**
     * Gets the uploadDetails value for this UploadTopUpScheduleRequest.
     * 
     * @return uploadDetails
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] getUploadDetails() {
        return uploadDetails;
    }


    /**
     * Sets the uploadDetails value for this UploadTopUpScheduleRequest.
     * 
     * @param uploadDetails
     */
    public void setUploadDetails(com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails[] uploadDetails) {
        this.uploadDetails = uploadDetails;
    }

    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails getUploadDetails(int i) {
        return this.uploadDetails[i];
    }

    public void setUploadDetails(int i, com.xiusbcgi.xbus.scare.CorpManagement_xsd.UploadDetails _value) {
        this.uploadDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadTopUpScheduleRequest)) return false;
        UploadTopUpScheduleRequest other = (UploadTopUpScheduleRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.uploadDetails==null && other.getUploadDetails()==null) || 
             (this.uploadDetails!=null &&
              java.util.Arrays.equals(this.uploadDetails, other.getUploadDetails())));
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
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getUploadDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUploadDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUploadDetails(), i);
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
        new org.apache.axis.description.TypeDesc(UploadTopUpScheduleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "UploadTopUpScheduleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "uploadDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "UploadDetails"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
