/**
 * FindAccountFilterData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class FindAccountFilterData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String ICCDid;

    private java.lang.String MSID;

    private java.lang.String accountNumber;

    private java.lang.String deviceId;

    private java.lang.String dialableNumber;

    private java.lang.String emailAddress;

    private java.lang.Integer indexToFetchFrom;

    private java.lang.String name;

    private java.lang.String socialSecurityNumber;

    private net.bcgi.si.messages.mvnoapi.subscriber.SpecificSubscriber mSpecificSubscriber;

    private org.apache.axis.message.MessageElement [] _any;

    public FindAccountFilterData() {
    }

    public FindAccountFilterData(
           java.lang.String ICCDid,
           java.lang.String MSID,
           java.lang.String accountNumber,
           java.lang.String deviceId,
           java.lang.String dialableNumber,
           java.lang.String emailAddress,
           java.lang.Integer indexToFetchFrom,
           java.lang.String name,
           java.lang.String socialSecurityNumber,
           net.bcgi.si.messages.mvnoapi.subscriber.SpecificSubscriber mSpecificSubscriber,
           org.apache.axis.message.MessageElement [] _any) {
           this.ICCDid = ICCDid;
           this.MSID = MSID;
           this.accountNumber = accountNumber;
           this.deviceId = deviceId;
           this.dialableNumber = dialableNumber;
           this.emailAddress = emailAddress;
           this.indexToFetchFrom = indexToFetchFrom;
           this.name = name;
           this.socialSecurityNumber = socialSecurityNumber;
           this.mSpecificSubscriber = mSpecificSubscriber;
           this._any = _any;
    }


    /**
     * Gets the ICCDid value for this FindAccountFilterData.
     * 
     * @return ICCDid
     */
    public java.lang.String getICCDid() {
        return ICCDid;
    }


    /**
     * Sets the ICCDid value for this FindAccountFilterData.
     * 
     * @param ICCDid
     */
    public void setICCDid(java.lang.String ICCDid) {
        this.ICCDid = ICCDid;
    }


    /**
     * Gets the MSID value for this FindAccountFilterData.
     * 
     * @return MSID
     */
    public java.lang.String getMSID() {
        return MSID;
    }


    /**
     * Sets the MSID value for this FindAccountFilterData.
     * 
     * @param MSID
     */
    public void setMSID(java.lang.String MSID) {
        this.MSID = MSID;
    }


    /**
     * Gets the accountNumber value for this FindAccountFilterData.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this FindAccountFilterData.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the deviceId value for this FindAccountFilterData.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this FindAccountFilterData.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the dialableNumber value for this FindAccountFilterData.
     * 
     * @return dialableNumber
     */
    public java.lang.String getDialableNumber() {
        return dialableNumber;
    }


    /**
     * Sets the dialableNumber value for this FindAccountFilterData.
     * 
     * @param dialableNumber
     */
    public void setDialableNumber(java.lang.String dialableNumber) {
        this.dialableNumber = dialableNumber;
    }


    /**
     * Gets the emailAddress value for this FindAccountFilterData.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this FindAccountFilterData.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the indexToFetchFrom value for this FindAccountFilterData.
     * 
     * @return indexToFetchFrom
     */
    public java.lang.Integer getIndexToFetchFrom() {
        return indexToFetchFrom;
    }


    /**
     * Sets the indexToFetchFrom value for this FindAccountFilterData.
     * 
     * @param indexToFetchFrom
     */
    public void setIndexToFetchFrom(java.lang.Integer indexToFetchFrom) {
        this.indexToFetchFrom = indexToFetchFrom;
    }


    /**
     * Gets the name value for this FindAccountFilterData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FindAccountFilterData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the socialSecurityNumber value for this FindAccountFilterData.
     * 
     * @return socialSecurityNumber
     */
    public java.lang.String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this FindAccountFilterData.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(java.lang.String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the mSpecificSubscriber value for this FindAccountFilterData.
     * 
     * @return mSpecificSubscriber
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.SpecificSubscriber getMSpecificSubscriber() {
        return mSpecificSubscriber;
    }


    /**
     * Sets the mSpecificSubscriber value for this FindAccountFilterData.
     * 
     * @param mSpecificSubscriber
     */
    public void setMSpecificSubscriber(net.bcgi.si.messages.mvnoapi.subscriber.SpecificSubscriber mSpecificSubscriber) {
        this.mSpecificSubscriber = mSpecificSubscriber;
    }


    /**
     * Gets the _any value for this FindAccountFilterData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this FindAccountFilterData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindAccountFilterData)) return false;
        FindAccountFilterData other = (FindAccountFilterData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ICCDid==null && other.getICCDid()==null) || 
             (this.ICCDid!=null &&
              this.ICCDid.equals(other.getICCDid()))) &&
            ((this.MSID==null && other.getMSID()==null) || 
             (this.MSID!=null &&
              this.MSID.equals(other.getMSID()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.dialableNumber==null && other.getDialableNumber()==null) || 
             (this.dialableNumber!=null &&
              this.dialableNumber.equals(other.getDialableNumber()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.indexToFetchFrom==null && other.getIndexToFetchFrom()==null) || 
             (this.indexToFetchFrom!=null &&
              this.indexToFetchFrom.equals(other.getIndexToFetchFrom()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.mSpecificSubscriber==null && other.getMSpecificSubscriber()==null) || 
             (this.mSpecificSubscriber!=null &&
              this.mSpecificSubscriber.equals(other.getMSpecificSubscriber()))) &&
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
        if (getICCDid() != null) {
            _hashCode += getICCDid().hashCode();
        }
        if (getMSID() != null) {
            _hashCode += getMSID().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDialableNumber() != null) {
            _hashCode += getDialableNumber().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getIndexToFetchFrom() != null) {
            _hashCode += getIndexToFetchFrom().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getMSpecificSubscriber() != null) {
            _hashCode += getMSpecificSubscriber().hashCode();
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
        new org.apache.axis.description.TypeDesc(FindAccountFilterData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "FindAccountFilterData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCDid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "ICCDid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "MSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dialableNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "dialableNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexToFetchFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "indexToFetchFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "socialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSpecificSubscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "mSpecificSubscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SpecificSubscriber"));
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
