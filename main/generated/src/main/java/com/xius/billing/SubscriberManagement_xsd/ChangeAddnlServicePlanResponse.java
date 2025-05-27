/**
 * ChangeAddnlServicePlanResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ChangeAddnlServicePlanResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String acctValidityExtend;

    private com.xius.billing.SubscriberManagement_xsd.AccountDatesList accountDates;

    public ChangeAddnlServicePlanResponse() {
    }

    public ChangeAddnlServicePlanResponse(
           java.lang.String message,
           java.lang.String acctValidityExtend,
           com.xius.billing.SubscriberManagement_xsd.AccountDatesList accountDates) {
           this.message = message;
           this.acctValidityExtend = acctValidityExtend;
           this.accountDates = accountDates;
    }


    /**
     * Gets the message value for this ChangeAddnlServicePlanResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ChangeAddnlServicePlanResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the acctValidityExtend value for this ChangeAddnlServicePlanResponse.
     * 
     * @return acctValidityExtend
     */
    public java.lang.String getAcctValidityExtend() {
        return acctValidityExtend;
    }


    /**
     * Sets the acctValidityExtend value for this ChangeAddnlServicePlanResponse.
     * 
     * @param acctValidityExtend
     */
    public void setAcctValidityExtend(java.lang.String acctValidityExtend) {
        this.acctValidityExtend = acctValidityExtend;
    }


    /**
     * Gets the accountDates value for this ChangeAddnlServicePlanResponse.
     * 
     * @return accountDates
     */
    public com.xius.billing.SubscriberManagement_xsd.AccountDatesList getAccountDates() {
        return accountDates;
    }


    /**
     * Sets the accountDates value for this ChangeAddnlServicePlanResponse.
     * 
     * @param accountDates
     */
    public void setAccountDates(com.xius.billing.SubscriberManagement_xsd.AccountDatesList accountDates) {
        this.accountDates = accountDates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAddnlServicePlanResponse)) return false;
        ChangeAddnlServicePlanResponse other = (ChangeAddnlServicePlanResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.acctValidityExtend==null && other.getAcctValidityExtend()==null) || 
             (this.acctValidityExtend!=null &&
              this.acctValidityExtend.equals(other.getAcctValidityExtend()))) &&
            ((this.accountDates==null && other.getAccountDates()==null) || 
             (this.accountDates!=null &&
              this.accountDates.equals(other.getAccountDates())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getAcctValidityExtend() != null) {
            _hashCode += getAcctValidityExtend().hashCode();
        }
        if (getAccountDates() != null) {
            _hashCode += getAccountDates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAddnlServicePlanResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeAddnlServicePlanResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctValidityExtend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "acctValidityExtend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountDatesList"));
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
