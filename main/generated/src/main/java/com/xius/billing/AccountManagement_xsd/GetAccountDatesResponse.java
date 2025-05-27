/**
 * GetAccountDatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetAccountDatesResponse  implements java.io.Serializable {
    private java.lang.String validityDate;

    private java.lang.String gracePeriod1EndDate;

    private java.lang.String gracePeriod2EndDate;

    private java.lang.String expiryDate;

    public GetAccountDatesResponse() {
    }

    public GetAccountDatesResponse(
           java.lang.String validityDate,
           java.lang.String gracePeriod1EndDate,
           java.lang.String gracePeriod2EndDate,
           java.lang.String expiryDate) {
           this.validityDate = validityDate;
           this.gracePeriod1EndDate = gracePeriod1EndDate;
           this.gracePeriod2EndDate = gracePeriod2EndDate;
           this.expiryDate = expiryDate;
    }


    /**
     * Gets the validityDate value for this GetAccountDatesResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this GetAccountDatesResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriod1EndDate value for this GetAccountDatesResponse.
     * 
     * @return gracePeriod1EndDate
     */
    public java.lang.String getGracePeriod1EndDate() {
        return gracePeriod1EndDate;
    }


    /**
     * Sets the gracePeriod1EndDate value for this GetAccountDatesResponse.
     * 
     * @param gracePeriod1EndDate
     */
    public void setGracePeriod1EndDate(java.lang.String gracePeriod1EndDate) {
        this.gracePeriod1EndDate = gracePeriod1EndDate;
    }


    /**
     * Gets the gracePeriod2EndDate value for this GetAccountDatesResponse.
     * 
     * @return gracePeriod2EndDate
     */
    public java.lang.String getGracePeriod2EndDate() {
        return gracePeriod2EndDate;
    }


    /**
     * Sets the gracePeriod2EndDate value for this GetAccountDatesResponse.
     * 
     * @param gracePeriod2EndDate
     */
    public void setGracePeriod2EndDate(java.lang.String gracePeriod2EndDate) {
        this.gracePeriod2EndDate = gracePeriod2EndDate;
    }


    /**
     * Gets the expiryDate value for this GetAccountDatesResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetAccountDatesResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountDatesResponse)) return false;
        GetAccountDatesResponse other = (GetAccountDatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.gracePeriod1EndDate==null && other.getGracePeriod1EndDate()==null) || 
             (this.gracePeriod1EndDate!=null &&
              this.gracePeriod1EndDate.equals(other.getGracePeriod1EndDate()))) &&
            ((this.gracePeriod2EndDate==null && other.getGracePeriod2EndDate()==null) || 
             (this.gracePeriod2EndDate!=null &&
              this.gracePeriod2EndDate.equals(other.getGracePeriod2EndDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate())));
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
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getGracePeriod1EndDate() != null) {
            _hashCode += getGracePeriod1EndDate().hashCode();
        }
        if (getGracePeriod2EndDate() != null) {
            _hashCode += getGracePeriod2EndDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountDatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod1EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "gracePeriod1EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod2EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "gracePeriod2EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "expiryDate"));
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
