/**
 * SubscriberProfileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class SubscriberProfileInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus;

    private net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData;

    private net.bcgi.si.messages.mvnoapi.subscriber.OrderDetails orderDetails;

    private net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData;

    private org.apache.axis.message.MessageElement [] _any;

    public SubscriberProfileInfo() {
    }

    public SubscriberProfileInfo(
           net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus,
           net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData,
           net.bcgi.si.messages.mvnoapi.subscriber.OrderDetails orderDetails,
           net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountStatus = accountStatus;
           this.billingAddressData = billingAddressData;
           this.orderDetails = orderDetails;
           this.personalData = personalData;
           this._any = _any;
    }


    /**
     * Gets the accountStatus value for this SubscriberProfileInfo.
     * 
     * @return accountStatus
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this SubscriberProfileInfo.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(net.bcgi.si.messages.mvnoapi.subscriber.AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the billingAddressData value for this SubscriberProfileInfo.
     * 
     * @return billingAddressData
     */
    public net.bcgi.si.messages.mvnoapi.common.BillingAddressData getBillingAddressData() {
        return billingAddressData;
    }


    /**
     * Sets the billingAddressData value for this SubscriberProfileInfo.
     * 
     * @param billingAddressData
     */
    public void setBillingAddressData(net.bcgi.si.messages.mvnoapi.common.BillingAddressData billingAddressData) {
        this.billingAddressData = billingAddressData;
    }


    /**
     * Gets the orderDetails value for this SubscriberProfileInfo.
     * 
     * @return orderDetails
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.OrderDetails getOrderDetails() {
        return orderDetails;
    }


    /**
     * Sets the orderDetails value for this SubscriberProfileInfo.
     * 
     * @param orderDetails
     */
    public void setOrderDetails(net.bcgi.si.messages.mvnoapi.subscriber.OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }


    /**
     * Gets the personalData value for this SubscriberProfileInfo.
     * 
     * @return personalData
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.PersonalData getPersonalData() {
        return personalData;
    }


    /**
     * Sets the personalData value for this SubscriberProfileInfo.
     * 
     * @param personalData
     */
    public void setPersonalData(net.bcgi.si.messages.mvnoapi.provisioning.PersonalData personalData) {
        this.personalData = personalData;
    }


    /**
     * Gets the _any value for this SubscriberProfileInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SubscriberProfileInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberProfileInfo)) return false;
        SubscriberProfileInfo other = (SubscriberProfileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.billingAddressData==null && other.getBillingAddressData()==null) || 
             (this.billingAddressData!=null &&
              this.billingAddressData.equals(other.getBillingAddressData()))) &&
            ((this.orderDetails==null && other.getOrderDetails()==null) || 
             (this.orderDetails!=null &&
              this.orderDetails.equals(other.getOrderDetails()))) &&
            ((this.personalData==null && other.getPersonalData()==null) || 
             (this.personalData!=null &&
              this.personalData.equals(other.getPersonalData()))) &&
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
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getBillingAddressData() != null) {
            _hashCode += getBillingAddressData().hashCode();
        }
        if (getOrderDetails() != null) {
            _hashCode += getOrderDetails().hashCode();
        }
        if (getPersonalData() != null) {
            _hashCode += getPersonalData().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubscriberProfileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SubscriberProfileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddressData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "billingAddressData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.mvnoapi.messages.si.bcgi.net", "BillingAddressData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "orderDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "OrderDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "personalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "PersonalData"));
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
