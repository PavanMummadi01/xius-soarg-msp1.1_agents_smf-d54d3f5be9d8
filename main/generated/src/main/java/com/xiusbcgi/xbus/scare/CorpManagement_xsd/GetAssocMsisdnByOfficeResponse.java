/**
 * GetAssocMsisdnByOfficeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetAssocMsisdnByOfficeResponse  implements java.io.Serializable {
    private long[] MSISDNList;

    private long[] accountIdList;

    private java.lang.String[] statusList;

    private java.math.BigDecimal[] accountBalanceList;

    private java.util.Calendar[] lastRechargeDateList;

    private java.lang.String[] isCorpList;

    public GetAssocMsisdnByOfficeResponse() {
    }

    public GetAssocMsisdnByOfficeResponse(
           long[] MSISDNList,
           long[] accountIdList,
           java.lang.String[] statusList,
           java.math.BigDecimal[] accountBalanceList,
           java.util.Calendar[] lastRechargeDateList,
           java.lang.String[] isCorpList) {
           this.MSISDNList = MSISDNList;
           this.accountIdList = accountIdList;
           this.statusList = statusList;
           this.accountBalanceList = accountBalanceList;
           this.lastRechargeDateList = lastRechargeDateList;
           this.isCorpList = isCorpList;
    }


    /**
     * Gets the MSISDNList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @return MSISDNList
     */
    public long[] getMSISDNList() {
        return MSISDNList;
    }


    /**
     * Sets the MSISDNList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @param MSISDNList
     */
    public void setMSISDNList(long[] MSISDNList) {
        this.MSISDNList = MSISDNList;
    }


    /**
     * Gets the accountIdList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @return accountIdList
     */
    public long[] getAccountIdList() {
        return accountIdList;
    }


    /**
     * Sets the accountIdList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @param accountIdList
     */
    public void setAccountIdList(long[] accountIdList) {
        this.accountIdList = accountIdList;
    }


    /**
     * Gets the statusList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @return statusList
     */
    public java.lang.String[] getStatusList() {
        return statusList;
    }


    /**
     * Sets the statusList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @param statusList
     */
    public void setStatusList(java.lang.String[] statusList) {
        this.statusList = statusList;
    }


    /**
     * Gets the accountBalanceList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @return accountBalanceList
     */
    public java.math.BigDecimal[] getAccountBalanceList() {
        return accountBalanceList;
    }


    /**
     * Sets the accountBalanceList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @param accountBalanceList
     */
    public void setAccountBalanceList(java.math.BigDecimal[] accountBalanceList) {
        this.accountBalanceList = accountBalanceList;
    }


    /**
     * Gets the lastRechargeDateList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @return lastRechargeDateList
     */
    public java.util.Calendar[] getLastRechargeDateList() {
        return lastRechargeDateList;
    }


    /**
     * Sets the lastRechargeDateList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @param lastRechargeDateList
     */
    public void setLastRechargeDateList(java.util.Calendar[] lastRechargeDateList) {
        this.lastRechargeDateList = lastRechargeDateList;
    }


    /**
     * Gets the isCorpList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @return isCorpList
     */
    public java.lang.String[] getIsCorpList() {
        return isCorpList;
    }


    /**
     * Sets the isCorpList value for this GetAssocMsisdnByOfficeResponse.
     * 
     * @param isCorpList
     */
    public void setIsCorpList(java.lang.String[] isCorpList) {
        this.isCorpList = isCorpList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssocMsisdnByOfficeResponse)) return false;
        GetAssocMsisdnByOfficeResponse other = (GetAssocMsisdnByOfficeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDNList==null && other.getMSISDNList()==null) || 
             (this.MSISDNList!=null &&
              java.util.Arrays.equals(this.MSISDNList, other.getMSISDNList()))) &&
            ((this.accountIdList==null && other.getAccountIdList()==null) || 
             (this.accountIdList!=null &&
              java.util.Arrays.equals(this.accountIdList, other.getAccountIdList()))) &&
            ((this.statusList==null && other.getStatusList()==null) || 
             (this.statusList!=null &&
              java.util.Arrays.equals(this.statusList, other.getStatusList()))) &&
            ((this.accountBalanceList==null && other.getAccountBalanceList()==null) || 
             (this.accountBalanceList!=null &&
              java.util.Arrays.equals(this.accountBalanceList, other.getAccountBalanceList()))) &&
            ((this.lastRechargeDateList==null && other.getLastRechargeDateList()==null) || 
             (this.lastRechargeDateList!=null &&
              java.util.Arrays.equals(this.lastRechargeDateList, other.getLastRechargeDateList()))) &&
            ((this.isCorpList==null && other.getIsCorpList()==null) || 
             (this.isCorpList!=null &&
              java.util.Arrays.equals(this.isCorpList, other.getIsCorpList())));
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
        if (getMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSISDNList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountBalanceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastRechargeDateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastRechargeDateList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastRechargeDateList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsCorpList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsCorpList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsCorpList(), i);
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
        new org.apache.axis.description.TypeDesc(GetAssocMsisdnByOfficeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetAssocMsisdnByOfficeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "MSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "MSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "accountIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "accountId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "statusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "status"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "accountBalanceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "accountBalance"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRechargeDateList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "lastRechargeDateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "lastRechargeDate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCorpList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "isCorpList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "isCorpOffice"));
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
