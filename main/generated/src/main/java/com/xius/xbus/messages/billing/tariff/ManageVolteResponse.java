/**
 * ManageVolteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class ManageVolteResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String reTransId;

    private java.lang.String userdefined1;

    private java.lang.String userdefined2;

    private java.lang.String userdefined3;

    public ManageVolteResponse() {
    }

    public ManageVolteResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String transactionId,
           java.lang.String reTransId,
           java.lang.String userdefined1,
           java.lang.String userdefined2,
           java.lang.String userdefined3) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.transactionId = transactionId;
        this.reTransId = reTransId;
        this.userdefined1 = userdefined1;
        this.userdefined2 = userdefined2;
        this.userdefined3 = userdefined3;
    }


    /**
     * Gets the transactionId value for this ManageVolteResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ManageVolteResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the reTransId value for this ManageVolteResponse.
     * 
     * @return reTransId
     */
    public java.lang.String getReTransId() {
        return reTransId;
    }


    /**
     * Sets the reTransId value for this ManageVolteResponse.
     * 
     * @param reTransId
     */
    public void setReTransId(java.lang.String reTransId) {
        this.reTransId = reTransId;
    }


    /**
     * Gets the userdefined1 value for this ManageVolteResponse.
     * 
     * @return userdefined1
     */
    public java.lang.String getUserdefined1() {
        return userdefined1;
    }


    /**
     * Sets the userdefined1 value for this ManageVolteResponse.
     * 
     * @param userdefined1
     */
    public void setUserdefined1(java.lang.String userdefined1) {
        this.userdefined1 = userdefined1;
    }


    /**
     * Gets the userdefined2 value for this ManageVolteResponse.
     * 
     * @return userdefined2
     */
    public java.lang.String getUserdefined2() {
        return userdefined2;
    }


    /**
     * Sets the userdefined2 value for this ManageVolteResponse.
     * 
     * @param userdefined2
     */
    public void setUserdefined2(java.lang.String userdefined2) {
        this.userdefined2 = userdefined2;
    }


    /**
     * Gets the userdefined3 value for this ManageVolteResponse.
     * 
     * @return userdefined3
     */
    public java.lang.String getUserdefined3() {
        return userdefined3;
    }


    /**
     * Sets the userdefined3 value for this ManageVolteResponse.
     * 
     * @param userdefined3
     */
    public void setUserdefined3(java.lang.String userdefined3) {
        this.userdefined3 = userdefined3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageVolteResponse)) return false;
        ManageVolteResponse other = (ManageVolteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.reTransId==null && other.getReTransId()==null) || 
             (this.reTransId!=null &&
              this.reTransId.equals(other.getReTransId()))) &&
            ((this.userdefined1==null && other.getUserdefined1()==null) || 
             (this.userdefined1!=null &&
              this.userdefined1.equals(other.getUserdefined1()))) &&
            ((this.userdefined2==null && other.getUserdefined2()==null) || 
             (this.userdefined2!=null &&
              this.userdefined2.equals(other.getUserdefined2()))) &&
            ((this.userdefined3==null && other.getUserdefined3()==null) || 
             (this.userdefined3!=null &&
              this.userdefined3.equals(other.getUserdefined3())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getReTransId() != null) {
            _hashCode += getReTransId().hashCode();
        }
        if (getUserdefined1() != null) {
            _hashCode += getUserdefined1().hashCode();
        }
        if (getUserdefined2() != null) {
            _hashCode += getUserdefined2().hashCode();
        }
        if (getUserdefined3() != null) {
            _hashCode += getUserdefined3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageVolteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">ManageVolteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "reTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Userdefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Userdefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "Userdefined3"));
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
