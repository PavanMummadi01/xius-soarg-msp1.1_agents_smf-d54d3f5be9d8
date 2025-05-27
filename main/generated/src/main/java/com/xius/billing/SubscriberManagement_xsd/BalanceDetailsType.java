/**
 * BalanceDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class BalanceDetailsType  implements java.io.Serializable {
    private java.lang.Double prepaidAccountBalance;

    private java.math.BigDecimal bucketAccountBalance;

    private java.math.BigInteger airTimeMinutes;

    private java.math.BigInteger smsMessages;

    private java.math.BigInteger mmsMessages;

    private java.lang.String data;

    private java.lang.String calls;

    private java.math.BigDecimal postPaidBalance;

    private java.lang.String airTimeUnlimitedYN;

    private java.lang.String smsUnlimitedYN;

    private java.lang.String mmsUnlimitedYN;

    private java.lang.String dataUnlimitedYN;

    public BalanceDetailsType() {
    }

    public BalanceDetailsType(
           java.lang.Double prepaidAccountBalance,
           java.math.BigDecimal bucketAccountBalance,
           java.math.BigInteger airTimeMinutes,
           java.math.BigInteger smsMessages,
           java.math.BigInteger mmsMessages,
           java.lang.String data,
           java.lang.String calls,
           java.math.BigDecimal postPaidBalance,
           java.lang.String airTimeUnlimitedYN,
           java.lang.String smsUnlimitedYN,
           java.lang.String mmsUnlimitedYN,
           java.lang.String dataUnlimitedYN) {
           this.prepaidAccountBalance = prepaidAccountBalance;
           this.bucketAccountBalance = bucketAccountBalance;
           this.airTimeMinutes = airTimeMinutes;
           this.smsMessages = smsMessages;
           this.mmsMessages = mmsMessages;
           this.data = data;
           this.calls = calls;
           this.postPaidBalance = postPaidBalance;
           this.airTimeUnlimitedYN = airTimeUnlimitedYN;
           this.smsUnlimitedYN = smsUnlimitedYN;
           this.mmsUnlimitedYN = mmsUnlimitedYN;
           this.dataUnlimitedYN = dataUnlimitedYN;
    }


    /**
     * Gets the prepaidAccountBalance value for this BalanceDetailsType.
     * 
     * @return prepaidAccountBalance
     */
    public java.lang.Double getPrepaidAccountBalance() {
        return prepaidAccountBalance;
    }


    /**
     * Sets the prepaidAccountBalance value for this BalanceDetailsType.
     * 
     * @param prepaidAccountBalance
     */
    public void setPrepaidAccountBalance(java.lang.Double prepaidAccountBalance) {
        this.prepaidAccountBalance = prepaidAccountBalance;
    }


    /**
     * Gets the bucketAccountBalance value for this BalanceDetailsType.
     * 
     * @return bucketAccountBalance
     */
    public java.math.BigDecimal getBucketAccountBalance() {
        return bucketAccountBalance;
    }


    /**
     * Sets the bucketAccountBalance value for this BalanceDetailsType.
     * 
     * @param bucketAccountBalance
     */
    public void setBucketAccountBalance(java.math.BigDecimal bucketAccountBalance) {
        this.bucketAccountBalance = bucketAccountBalance;
    }


    /**
     * Gets the airTimeMinutes value for this BalanceDetailsType.
     * 
     * @return airTimeMinutes
     */
    public java.math.BigInteger getAirTimeMinutes() {
        return airTimeMinutes;
    }


    /**
     * Sets the airTimeMinutes value for this BalanceDetailsType.
     * 
     * @param airTimeMinutes
     */
    public void setAirTimeMinutes(java.math.BigInteger airTimeMinutes) {
        this.airTimeMinutes = airTimeMinutes;
    }


    /**
     * Gets the smsMessages value for this BalanceDetailsType.
     * 
     * @return smsMessages
     */
    public java.math.BigInteger getSmsMessages() {
        return smsMessages;
    }


    /**
     * Sets the smsMessages value for this BalanceDetailsType.
     * 
     * @param smsMessages
     */
    public void setSmsMessages(java.math.BigInteger smsMessages) {
        this.smsMessages = smsMessages;
    }


    /**
     * Gets the mmsMessages value for this BalanceDetailsType.
     * 
     * @return mmsMessages
     */
    public java.math.BigInteger getMmsMessages() {
        return mmsMessages;
    }


    /**
     * Sets the mmsMessages value for this BalanceDetailsType.
     * 
     * @param mmsMessages
     */
    public void setMmsMessages(java.math.BigInteger mmsMessages) {
        this.mmsMessages = mmsMessages;
    }


    /**
     * Gets the data value for this BalanceDetailsType.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this BalanceDetailsType.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the calls value for this BalanceDetailsType.
     * 
     * @return calls
     */
    public java.lang.String getCalls() {
        return calls;
    }


    /**
     * Sets the calls value for this BalanceDetailsType.
     * 
     * @param calls
     */
    public void setCalls(java.lang.String calls) {
        this.calls = calls;
    }


    /**
     * Gets the postPaidBalance value for this BalanceDetailsType.
     * 
     * @return postPaidBalance
     */
    public java.math.BigDecimal getPostPaidBalance() {
        return postPaidBalance;
    }


    /**
     * Sets the postPaidBalance value for this BalanceDetailsType.
     * 
     * @param postPaidBalance
     */
    public void setPostPaidBalance(java.math.BigDecimal postPaidBalance) {
        this.postPaidBalance = postPaidBalance;
    }


    /**
     * Gets the airTimeUnlimitedYN value for this BalanceDetailsType.
     * 
     * @return airTimeUnlimitedYN
     */
    public java.lang.String getAirTimeUnlimitedYN() {
        return airTimeUnlimitedYN;
    }


    /**
     * Sets the airTimeUnlimitedYN value for this BalanceDetailsType.
     * 
     * @param airTimeUnlimitedYN
     */
    public void setAirTimeUnlimitedYN(java.lang.String airTimeUnlimitedYN) {
        this.airTimeUnlimitedYN = airTimeUnlimitedYN;
    }


    /**
     * Gets the smsUnlimitedYN value for this BalanceDetailsType.
     * 
     * @return smsUnlimitedYN
     */
    public java.lang.String getSmsUnlimitedYN() {
        return smsUnlimitedYN;
    }


    /**
     * Sets the smsUnlimitedYN value for this BalanceDetailsType.
     * 
     * @param smsUnlimitedYN
     */
    public void setSmsUnlimitedYN(java.lang.String smsUnlimitedYN) {
        this.smsUnlimitedYN = smsUnlimitedYN;
    }


    /**
     * Gets the mmsUnlimitedYN value for this BalanceDetailsType.
     * 
     * @return mmsUnlimitedYN
     */
    public java.lang.String getMmsUnlimitedYN() {
        return mmsUnlimitedYN;
    }


    /**
     * Sets the mmsUnlimitedYN value for this BalanceDetailsType.
     * 
     * @param mmsUnlimitedYN
     */
    public void setMmsUnlimitedYN(java.lang.String mmsUnlimitedYN) {
        this.mmsUnlimitedYN = mmsUnlimitedYN;
    }


    /**
     * Gets the dataUnlimitedYN value for this BalanceDetailsType.
     * 
     * @return dataUnlimitedYN
     */
    public java.lang.String getDataUnlimitedYN() {
        return dataUnlimitedYN;
    }


    /**
     * Sets the dataUnlimitedYN value for this BalanceDetailsType.
     * 
     * @param dataUnlimitedYN
     */
    public void setDataUnlimitedYN(java.lang.String dataUnlimitedYN) {
        this.dataUnlimitedYN = dataUnlimitedYN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceDetailsType)) return false;
        BalanceDetailsType other = (BalanceDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prepaidAccountBalance==null && other.getPrepaidAccountBalance()==null) || 
             (this.prepaidAccountBalance!=null &&
              this.prepaidAccountBalance.equals(other.getPrepaidAccountBalance()))) &&
            ((this.bucketAccountBalance==null && other.getBucketAccountBalance()==null) || 
             (this.bucketAccountBalance!=null &&
              this.bucketAccountBalance.equals(other.getBucketAccountBalance()))) &&
            ((this.airTimeMinutes==null && other.getAirTimeMinutes()==null) || 
             (this.airTimeMinutes!=null &&
              this.airTimeMinutes.equals(other.getAirTimeMinutes()))) &&
            ((this.smsMessages==null && other.getSmsMessages()==null) || 
             (this.smsMessages!=null &&
              this.smsMessages.equals(other.getSmsMessages()))) &&
            ((this.mmsMessages==null && other.getMmsMessages()==null) || 
             (this.mmsMessages!=null &&
              this.mmsMessages.equals(other.getMmsMessages()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.calls==null && other.getCalls()==null) || 
             (this.calls!=null &&
              this.calls.equals(other.getCalls()))) &&
            ((this.postPaidBalance==null && other.getPostPaidBalance()==null) || 
             (this.postPaidBalance!=null &&
              this.postPaidBalance.equals(other.getPostPaidBalance()))) &&
            ((this.airTimeUnlimitedYN==null && other.getAirTimeUnlimitedYN()==null) || 
             (this.airTimeUnlimitedYN!=null &&
              this.airTimeUnlimitedYN.equals(other.getAirTimeUnlimitedYN()))) &&
            ((this.smsUnlimitedYN==null && other.getSmsUnlimitedYN()==null) || 
             (this.smsUnlimitedYN!=null &&
              this.smsUnlimitedYN.equals(other.getSmsUnlimitedYN()))) &&
            ((this.mmsUnlimitedYN==null && other.getMmsUnlimitedYN()==null) || 
             (this.mmsUnlimitedYN!=null &&
              this.mmsUnlimitedYN.equals(other.getMmsUnlimitedYN()))) &&
            ((this.dataUnlimitedYN==null && other.getDataUnlimitedYN()==null) || 
             (this.dataUnlimitedYN!=null &&
              this.dataUnlimitedYN.equals(other.getDataUnlimitedYN())));
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
        if (getPrepaidAccountBalance() != null) {
            _hashCode += getPrepaidAccountBalance().hashCode();
        }
        if (getBucketAccountBalance() != null) {
            _hashCode += getBucketAccountBalance().hashCode();
        }
        if (getAirTimeMinutes() != null) {
            _hashCode += getAirTimeMinutes().hashCode();
        }
        if (getSmsMessages() != null) {
            _hashCode += getSmsMessages().hashCode();
        }
        if (getMmsMessages() != null) {
            _hashCode += getMmsMessages().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getCalls() != null) {
            _hashCode += getCalls().hashCode();
        }
        if (getPostPaidBalance() != null) {
            _hashCode += getPostPaidBalance().hashCode();
        }
        if (getAirTimeUnlimitedYN() != null) {
            _hashCode += getAirTimeUnlimitedYN().hashCode();
        }
        if (getSmsUnlimitedYN() != null) {
            _hashCode += getSmsUnlimitedYN().hashCode();
        }
        if (getMmsUnlimitedYN() != null) {
            _hashCode += getMmsUnlimitedYN().hashCode();
        }
        if (getDataUnlimitedYN() != null) {
            _hashCode += getDataUnlimitedYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "prepaidAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucketAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTimeMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "airTimeMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "smsMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mmsMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "mmsMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "calls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postPaidBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "postPaidBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTimeUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "airTimeUnlimitedYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "smsUnlimitedYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mmsUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "mmsUnlimitedYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "dataUnlimitedYN"));
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
