/**
 * RegisterAccountBillingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class RegisterAccountBillingData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String billContactPhoneNo;

    private java.lang.String billCountry;

    private java.lang.String billCounty;

    private java.lang.String country;

    private java.lang.String emailAddress;

    private org.apache.axis.message.MessageElement [] _any;

    public RegisterAccountBillingData() {
    }

    public RegisterAccountBillingData(
           java.lang.String billContactPhoneNo,
           java.lang.String billCountry,
           java.lang.String billCounty,
           java.lang.String country,
           java.lang.String emailAddress,
           org.apache.axis.message.MessageElement [] _any) {
           this.billContactPhoneNo = billContactPhoneNo;
           this.billCountry = billCountry;
           this.billCounty = billCounty;
           this.country = country;
           this.emailAddress = emailAddress;
           this._any = _any;
    }


    /**
     * Gets the billContactPhoneNo value for this RegisterAccountBillingData.
     * 
     * @return billContactPhoneNo
     */
    public java.lang.String getBillContactPhoneNo() {
        return billContactPhoneNo;
    }


    /**
     * Sets the billContactPhoneNo value for this RegisterAccountBillingData.
     * 
     * @param billContactPhoneNo
     */
    public void setBillContactPhoneNo(java.lang.String billContactPhoneNo) {
        this.billContactPhoneNo = billContactPhoneNo;
    }


    /**
     * Gets the billCountry value for this RegisterAccountBillingData.
     * 
     * @return billCountry
     */
    public java.lang.String getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this RegisterAccountBillingData.
     * 
     * @param billCountry
     */
    public void setBillCountry(java.lang.String billCountry) {
        this.billCountry = billCountry;
    }


    /**
     * Gets the billCounty value for this RegisterAccountBillingData.
     * 
     * @return billCounty
     */
    public java.lang.String getBillCounty() {
        return billCounty;
    }


    /**
     * Sets the billCounty value for this RegisterAccountBillingData.
     * 
     * @param billCounty
     */
    public void setBillCounty(java.lang.String billCounty) {
        this.billCounty = billCounty;
    }


    /**
     * Gets the country value for this RegisterAccountBillingData.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this RegisterAccountBillingData.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the emailAddress value for this RegisterAccountBillingData.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this RegisterAccountBillingData.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the _any value for this RegisterAccountBillingData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this RegisterAccountBillingData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterAccountBillingData)) return false;
        RegisterAccountBillingData other = (RegisterAccountBillingData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billContactPhoneNo==null && other.getBillContactPhoneNo()==null) || 
             (this.billContactPhoneNo!=null &&
              this.billContactPhoneNo.equals(other.getBillContactPhoneNo()))) &&
            ((this.billCountry==null && other.getBillCountry()==null) || 
             (this.billCountry!=null &&
              this.billCountry.equals(other.getBillCountry()))) &&
            ((this.billCounty==null && other.getBillCounty()==null) || 
             (this.billCounty!=null &&
              this.billCounty.equals(other.getBillCounty()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
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
        if (getBillContactPhoneNo() != null) {
            _hashCode += getBillContactPhoneNo().hashCode();
        }
        if (getBillCountry() != null) {
            _hashCode += getBillCountry().hashCode();
        }
        if (getBillCounty() != null) {
            _hashCode += getBillCounty().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
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
        new org.apache.axis.description.TypeDesc(RegisterAccountBillingData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "RegisterAccountBillingData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billContactPhoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billContactPhoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
