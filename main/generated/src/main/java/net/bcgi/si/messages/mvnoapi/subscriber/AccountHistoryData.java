/**
 * AccountHistoryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AccountHistoryData  implements java.io.Serializable {
    private java.util.Calendar SODate;

    private java.lang.String SOType;

    private java.lang.String accountId;

    private java.lang.String description;

    private java.lang.String dialableNumber;

    private java.util.Calendar effectiveDate;

    private java.lang.String marketId;

    private java.util.Calendar serviceOrderDate;

    private java.lang.String serviceOrderNumber;

    private java.lang.String serviceOrderSectionNumber;

    private java.lang.String userName;

    public AccountHistoryData() {
    }

    public AccountHistoryData(
           java.util.Calendar SODate,
           java.lang.String SOType,
           java.lang.String accountId,
           java.lang.String description,
           java.lang.String dialableNumber,
           java.util.Calendar effectiveDate,
           java.lang.String marketId,
           java.util.Calendar serviceOrderDate,
           java.lang.String serviceOrderNumber,
           java.lang.String serviceOrderSectionNumber,
           java.lang.String userName) {
           this.SODate = SODate;
           this.SOType = SOType;
           this.accountId = accountId;
           this.description = description;
           this.dialableNumber = dialableNumber;
           this.effectiveDate = effectiveDate;
           this.marketId = marketId;
           this.serviceOrderDate = serviceOrderDate;
           this.serviceOrderNumber = serviceOrderNumber;
           this.serviceOrderSectionNumber = serviceOrderSectionNumber;
           this.userName = userName;
    }


    /**
     * Gets the SODate value for this AccountHistoryData.
     * 
     * @return SODate
     */
    public java.util.Calendar getSODate() {
        return SODate;
    }


    /**
     * Sets the SODate value for this AccountHistoryData.
     * 
     * @param SODate
     */
    public void setSODate(java.util.Calendar SODate) {
        this.SODate = SODate;
    }


    /**
     * Gets the SOType value for this AccountHistoryData.
     * 
     * @return SOType
     */
    public java.lang.String getSOType() {
        return SOType;
    }


    /**
     * Sets the SOType value for this AccountHistoryData.
     * 
     * @param SOType
     */
    public void setSOType(java.lang.String SOType) {
        this.SOType = SOType;
    }


    /**
     * Gets the accountId value for this AccountHistoryData.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AccountHistoryData.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the description value for this AccountHistoryData.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountHistoryData.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dialableNumber value for this AccountHistoryData.
     * 
     * @return dialableNumber
     */
    public java.lang.String getDialableNumber() {
        return dialableNumber;
    }


    /**
     * Sets the dialableNumber value for this AccountHistoryData.
     * 
     * @param dialableNumber
     */
    public void setDialableNumber(java.lang.String dialableNumber) {
        this.dialableNumber = dialableNumber;
    }


    /**
     * Gets the effectiveDate value for this AccountHistoryData.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this AccountHistoryData.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the marketId value for this AccountHistoryData.
     * 
     * @return marketId
     */
    public java.lang.String getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this AccountHistoryData.
     * 
     * @param marketId
     */
    public void setMarketId(java.lang.String marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the serviceOrderDate value for this AccountHistoryData.
     * 
     * @return serviceOrderDate
     */
    public java.util.Calendar getServiceOrderDate() {
        return serviceOrderDate;
    }


    /**
     * Sets the serviceOrderDate value for this AccountHistoryData.
     * 
     * @param serviceOrderDate
     */
    public void setServiceOrderDate(java.util.Calendar serviceOrderDate) {
        this.serviceOrderDate = serviceOrderDate;
    }


    /**
     * Gets the serviceOrderNumber value for this AccountHistoryData.
     * 
     * @return serviceOrderNumber
     */
    public java.lang.String getServiceOrderNumber() {
        return serviceOrderNumber;
    }


    /**
     * Sets the serviceOrderNumber value for this AccountHistoryData.
     * 
     * @param serviceOrderNumber
     */
    public void setServiceOrderNumber(java.lang.String serviceOrderNumber) {
        this.serviceOrderNumber = serviceOrderNumber;
    }


    /**
     * Gets the serviceOrderSectionNumber value for this AccountHistoryData.
     * 
     * @return serviceOrderSectionNumber
     */
    public java.lang.String getServiceOrderSectionNumber() {
        return serviceOrderSectionNumber;
    }


    /**
     * Sets the serviceOrderSectionNumber value for this AccountHistoryData.
     * 
     * @param serviceOrderSectionNumber
     */
    public void setServiceOrderSectionNumber(java.lang.String serviceOrderSectionNumber) {
        this.serviceOrderSectionNumber = serviceOrderSectionNumber;
    }


    /**
     * Gets the userName value for this AccountHistoryData.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this AccountHistoryData.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountHistoryData)) return false;
        AccountHistoryData other = (AccountHistoryData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SODate==null && other.getSODate()==null) || 
             (this.SODate!=null &&
              this.SODate.equals(other.getSODate()))) &&
            ((this.SOType==null && other.getSOType()==null) || 
             (this.SOType!=null &&
              this.SOType.equals(other.getSOType()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dialableNumber==null && other.getDialableNumber()==null) || 
             (this.dialableNumber!=null &&
              this.dialableNumber.equals(other.getDialableNumber()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.marketId==null && other.getMarketId()==null) || 
             (this.marketId!=null &&
              this.marketId.equals(other.getMarketId()))) &&
            ((this.serviceOrderDate==null && other.getServiceOrderDate()==null) || 
             (this.serviceOrderDate!=null &&
              this.serviceOrderDate.equals(other.getServiceOrderDate()))) &&
            ((this.serviceOrderNumber==null && other.getServiceOrderNumber()==null) || 
             (this.serviceOrderNumber!=null &&
              this.serviceOrderNumber.equals(other.getServiceOrderNumber()))) &&
            ((this.serviceOrderSectionNumber==null && other.getServiceOrderSectionNumber()==null) || 
             (this.serviceOrderSectionNumber!=null &&
              this.serviceOrderSectionNumber.equals(other.getServiceOrderSectionNumber()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getSODate() != null) {
            _hashCode += getSODate().hashCode();
        }
        if (getSOType() != null) {
            _hashCode += getSOType().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDialableNumber() != null) {
            _hashCode += getDialableNumber().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getMarketId() != null) {
            _hashCode += getMarketId().hashCode();
        }
        if (getServiceOrderDate() != null) {
            _hashCode += getServiceOrderDate().hashCode();
        }
        if (getServiceOrderNumber() != null) {
            _hashCode += getServiceOrderNumber().hashCode();
        }
        if (getServiceOrderSectionNumber() != null) {
            _hashCode += getServiceOrderSectionNumber().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountHistoryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountHistoryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SODate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SODate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "SOType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "description"));
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
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "serviceOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "serviceOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOrderSectionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "serviceOrderSectionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userName"));
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
