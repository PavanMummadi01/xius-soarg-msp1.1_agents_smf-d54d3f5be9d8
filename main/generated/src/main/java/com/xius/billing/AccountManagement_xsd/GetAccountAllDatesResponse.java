/**
 * GetAccountAllDatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class GetAccountAllDatesResponse  implements java.io.Serializable {
    private java.lang.String accountstatus;

    private java.lang.String registrationdate;

    private java.lang.String activationdate;

    private java.lang.String validityDate;

    private java.lang.String gracePeriod1EndDate;

    private java.lang.String gracePeriod2EndDate;

    private java.lang.String gracePeriod3EndDate;

    private java.lang.String gracePeriod4EndDate;

    private java.lang.String expiryDate;

    public GetAccountAllDatesResponse() {
    }

    public GetAccountAllDatesResponse(
           java.lang.String accountstatus,
           java.lang.String registrationdate,
           java.lang.String activationdate,
           java.lang.String validityDate,
           java.lang.String gracePeriod1EndDate,
           java.lang.String gracePeriod2EndDate,
           java.lang.String gracePeriod3EndDate,
           java.lang.String gracePeriod4EndDate,
           java.lang.String expiryDate) {
           this.accountstatus = accountstatus;
           this.registrationdate = registrationdate;
           this.activationdate = activationdate;
           this.validityDate = validityDate;
           this.gracePeriod1EndDate = gracePeriod1EndDate;
           this.gracePeriod2EndDate = gracePeriod2EndDate;
           this.gracePeriod3EndDate = gracePeriod3EndDate;
           this.gracePeriod4EndDate = gracePeriod4EndDate;
           this.expiryDate = expiryDate;
    }


    /**
     * Gets the accountstatus value for this GetAccountAllDatesResponse.
     * 
     * @return accountstatus
     */
    public java.lang.String getAccountstatus() {
        return accountstatus;
    }


    /**
     * Sets the accountstatus value for this GetAccountAllDatesResponse.
     * 
     * @param accountstatus
     */
    public void setAccountstatus(java.lang.String accountstatus) {
        this.accountstatus = accountstatus;
    }


    /**
     * Gets the registrationdate value for this GetAccountAllDatesResponse.
     * 
     * @return registrationdate
     */
    public java.lang.String getRegistrationdate() {
        return registrationdate;
    }


    /**
     * Sets the registrationdate value for this GetAccountAllDatesResponse.
     * 
     * @param registrationdate
     */
    public void setRegistrationdate(java.lang.String registrationdate) {
        this.registrationdate = registrationdate;
    }


    /**
     * Gets the activationdate value for this GetAccountAllDatesResponse.
     * 
     * @return activationdate
     */
    public java.lang.String getActivationdate() {
        return activationdate;
    }


    /**
     * Sets the activationdate value for this GetAccountAllDatesResponse.
     * 
     * @param activationdate
     */
    public void setActivationdate(java.lang.String activationdate) {
        this.activationdate = activationdate;
    }


    /**
     * Gets the validityDate value for this GetAccountAllDatesResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this GetAccountAllDatesResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the gracePeriod1EndDate value for this GetAccountAllDatesResponse.
     * 
     * @return gracePeriod1EndDate
     */
    public java.lang.String getGracePeriod1EndDate() {
        return gracePeriod1EndDate;
    }


    /**
     * Sets the gracePeriod1EndDate value for this GetAccountAllDatesResponse.
     * 
     * @param gracePeriod1EndDate
     */
    public void setGracePeriod1EndDate(java.lang.String gracePeriod1EndDate) {
        this.gracePeriod1EndDate = gracePeriod1EndDate;
    }


    /**
     * Gets the gracePeriod2EndDate value for this GetAccountAllDatesResponse.
     * 
     * @return gracePeriod2EndDate
     */
    public java.lang.String getGracePeriod2EndDate() {
        return gracePeriod2EndDate;
    }


    /**
     * Sets the gracePeriod2EndDate value for this GetAccountAllDatesResponse.
     * 
     * @param gracePeriod2EndDate
     */
    public void setGracePeriod2EndDate(java.lang.String gracePeriod2EndDate) {
        this.gracePeriod2EndDate = gracePeriod2EndDate;
    }


    /**
     * Gets the gracePeriod3EndDate value for this GetAccountAllDatesResponse.
     * 
     * @return gracePeriod3EndDate
     */
    public java.lang.String getGracePeriod3EndDate() {
        return gracePeriod3EndDate;
    }


    /**
     * Sets the gracePeriod3EndDate value for this GetAccountAllDatesResponse.
     * 
     * @param gracePeriod3EndDate
     */
    public void setGracePeriod3EndDate(java.lang.String gracePeriod3EndDate) {
        this.gracePeriod3EndDate = gracePeriod3EndDate;
    }


    /**
     * Gets the gracePeriod4EndDate value for this GetAccountAllDatesResponse.
     * 
     * @return gracePeriod4EndDate
     */
    public java.lang.String getGracePeriod4EndDate() {
        return gracePeriod4EndDate;
    }


    /**
     * Sets the gracePeriod4EndDate value for this GetAccountAllDatesResponse.
     * 
     * @param gracePeriod4EndDate
     */
    public void setGracePeriod4EndDate(java.lang.String gracePeriod4EndDate) {
        this.gracePeriod4EndDate = gracePeriod4EndDate;
    }


    /**
     * Gets the expiryDate value for this GetAccountAllDatesResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetAccountAllDatesResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountAllDatesResponse)) return false;
        GetAccountAllDatesResponse other = (GetAccountAllDatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountstatus==null && other.getAccountstatus()==null) || 
             (this.accountstatus!=null &&
              this.accountstatus.equals(other.getAccountstatus()))) &&
            ((this.registrationdate==null && other.getRegistrationdate()==null) || 
             (this.registrationdate!=null &&
              this.registrationdate.equals(other.getRegistrationdate()))) &&
            ((this.activationdate==null && other.getActivationdate()==null) || 
             (this.activationdate!=null &&
              this.activationdate.equals(other.getActivationdate()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.gracePeriod1EndDate==null && other.getGracePeriod1EndDate()==null) || 
             (this.gracePeriod1EndDate!=null &&
              this.gracePeriod1EndDate.equals(other.getGracePeriod1EndDate()))) &&
            ((this.gracePeriod2EndDate==null && other.getGracePeriod2EndDate()==null) || 
             (this.gracePeriod2EndDate!=null &&
              this.gracePeriod2EndDate.equals(other.getGracePeriod2EndDate()))) &&
            ((this.gracePeriod3EndDate==null && other.getGracePeriod3EndDate()==null) || 
             (this.gracePeriod3EndDate!=null &&
              this.gracePeriod3EndDate.equals(other.getGracePeriod3EndDate()))) &&
            ((this.gracePeriod4EndDate==null && other.getGracePeriod4EndDate()==null) || 
             (this.gracePeriod4EndDate!=null &&
              this.gracePeriod4EndDate.equals(other.getGracePeriod4EndDate()))) &&
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
        if (getAccountstatus() != null) {
            _hashCode += getAccountstatus().hashCode();
        }
        if (getRegistrationdate() != null) {
            _hashCode += getRegistrationdate().hashCode();
        }
        if (getActivationdate() != null) {
            _hashCode += getActivationdate().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getGracePeriod1EndDate() != null) {
            _hashCode += getGracePeriod1EndDate().hashCode();
        }
        if (getGracePeriod2EndDate() != null) {
            _hashCode += getGracePeriod2EndDate().hashCode();
        }
        if (getGracePeriod3EndDate() != null) {
            _hashCode += getGracePeriod3EndDate().hashCode();
        }
        if (getGracePeriod4EndDate() != null) {
            _hashCode += getGracePeriod4EndDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountAllDatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "getAccountAllDatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "registrationdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "activationdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("gracePeriod3EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "gracePeriod3EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod4EndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "gracePeriod4EndDate"));
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
