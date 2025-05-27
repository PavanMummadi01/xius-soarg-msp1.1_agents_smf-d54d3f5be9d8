/**
 * UserDefinedInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.selfcare.services;

public class UserDefinedInfo  implements java.io.Serializable {
    private java.lang.String accountStatus;

    private java.lang.String oldIC;

    private java.lang.String gmpc;

    private java.lang.String sourceOfInfo;

    private java.lang.String orderBooking;

    private java.lang.String orderDate;

    private java.lang.String ethnic;

    private java.lang.String orderExpiryDate;

    private java.lang.String iccno;

    private java.lang.String orderStatus;

    public UserDefinedInfo() {
    }

    public UserDefinedInfo(
           java.lang.String accountStatus,
           java.lang.String oldIC,
           java.lang.String gmpc,
           java.lang.String sourceOfInfo,
           java.lang.String orderBooking,
           java.lang.String orderDate,
           java.lang.String ethnic,
           java.lang.String orderExpiryDate,
           java.lang.String iccno,
           java.lang.String orderStatus) {
           this.accountStatus = accountStatus;
           this.oldIC = oldIC;
           this.gmpc = gmpc;
           this.sourceOfInfo = sourceOfInfo;
           this.orderBooking = orderBooking;
           this.orderDate = orderDate;
           this.ethnic = ethnic;
           this.orderExpiryDate = orderExpiryDate;
           this.iccno = iccno;
           this.orderStatus = orderStatus;
    }


    /**
     * Gets the accountStatus value for this UserDefinedInfo.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this UserDefinedInfo.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the oldIC value for this UserDefinedInfo.
     * 
     * @return oldIC
     */
    public java.lang.String getOldIC() {
        return oldIC;
    }


    /**
     * Sets the oldIC value for this UserDefinedInfo.
     * 
     * @param oldIC
     */
    public void setOldIC(java.lang.String oldIC) {
        this.oldIC = oldIC;
    }


    /**
     * Gets the gmpc value for this UserDefinedInfo.
     * 
     * @return gmpc
     */
    public java.lang.String getGmpc() {
        return gmpc;
    }


    /**
     * Sets the gmpc value for this UserDefinedInfo.
     * 
     * @param gmpc
     */
    public void setGmpc(java.lang.String gmpc) {
        this.gmpc = gmpc;
    }


    /**
     * Gets the sourceOfInfo value for this UserDefinedInfo.
     * 
     * @return sourceOfInfo
     */
    public java.lang.String getSourceOfInfo() {
        return sourceOfInfo;
    }


    /**
     * Sets the sourceOfInfo value for this UserDefinedInfo.
     * 
     * @param sourceOfInfo
     */
    public void setSourceOfInfo(java.lang.String sourceOfInfo) {
        this.sourceOfInfo = sourceOfInfo;
    }


    /**
     * Gets the orderBooking value for this UserDefinedInfo.
     * 
     * @return orderBooking
     */
    public java.lang.String getOrderBooking() {
        return orderBooking;
    }


    /**
     * Sets the orderBooking value for this UserDefinedInfo.
     * 
     * @param orderBooking
     */
    public void setOrderBooking(java.lang.String orderBooking) {
        this.orderBooking = orderBooking;
    }


    /**
     * Gets the orderDate value for this UserDefinedInfo.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this UserDefinedInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the ethnic value for this UserDefinedInfo.
     * 
     * @return ethnic
     */
    public java.lang.String getEthnic() {
        return ethnic;
    }


    /**
     * Sets the ethnic value for this UserDefinedInfo.
     * 
     * @param ethnic
     */
    public void setEthnic(java.lang.String ethnic) {
        this.ethnic = ethnic;
    }


    /**
     * Gets the orderExpiryDate value for this UserDefinedInfo.
     * 
     * @return orderExpiryDate
     */
    public java.lang.String getOrderExpiryDate() {
        return orderExpiryDate;
    }


    /**
     * Sets the orderExpiryDate value for this UserDefinedInfo.
     * 
     * @param orderExpiryDate
     */
    public void setOrderExpiryDate(java.lang.String orderExpiryDate) {
        this.orderExpiryDate = orderExpiryDate;
    }


    /**
     * Gets the iccno value for this UserDefinedInfo.
     * 
     * @return iccno
     */
    public java.lang.String getIccno() {
        return iccno;
    }


    /**
     * Sets the iccno value for this UserDefinedInfo.
     * 
     * @param iccno
     */
    public void setIccno(java.lang.String iccno) {
        this.iccno = iccno;
    }


    /**
     * Gets the orderStatus value for this UserDefinedInfo.
     * 
     * @return orderStatus
     */
    public java.lang.String getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this UserDefinedInfo.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(java.lang.String orderStatus) {
        this.orderStatus = orderStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedInfo)) return false;
        UserDefinedInfo other = (UserDefinedInfo) obj;
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
            ((this.oldIC==null && other.getOldIC()==null) || 
             (this.oldIC!=null &&
              this.oldIC.equals(other.getOldIC()))) &&
            ((this.gmpc==null && other.getGmpc()==null) || 
             (this.gmpc!=null &&
              this.gmpc.equals(other.getGmpc()))) &&
            ((this.sourceOfInfo==null && other.getSourceOfInfo()==null) || 
             (this.sourceOfInfo!=null &&
              this.sourceOfInfo.equals(other.getSourceOfInfo()))) &&
            ((this.orderBooking==null && other.getOrderBooking()==null) || 
             (this.orderBooking!=null &&
              this.orderBooking.equals(other.getOrderBooking()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.ethnic==null && other.getEthnic()==null) || 
             (this.ethnic!=null &&
              this.ethnic.equals(other.getEthnic()))) &&
            ((this.orderExpiryDate==null && other.getOrderExpiryDate()==null) || 
             (this.orderExpiryDate!=null &&
              this.orderExpiryDate.equals(other.getOrderExpiryDate()))) &&
            ((this.iccno==null && other.getIccno()==null) || 
             (this.iccno!=null &&
              this.iccno.equals(other.getIccno()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus())));
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
        if (getOldIC() != null) {
            _hashCode += getOldIC().hashCode();
        }
        if (getGmpc() != null) {
            _hashCode += getGmpc().hashCode();
        }
        if (getSourceOfInfo() != null) {
            _hashCode += getSourceOfInfo().hashCode();
        }
        if (getOrderBooking() != null) {
            _hashCode += getOrderBooking().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getEthnic() != null) {
            _hashCode += getEthnic().hashCode();
        }
        if (getOrderExpiryDate() != null) {
            _hashCode += getOrderExpiryDate().hashCode();
        }
        if (getIccno() != null) {
            _hashCode += getIccno().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "UserDefinedInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "oldIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gmpc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "gmpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceOfInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "sourceOfInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBooking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "orderBooking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "ethnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "orderExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "iccno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/selfcare/services", "orderStatus"));
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
