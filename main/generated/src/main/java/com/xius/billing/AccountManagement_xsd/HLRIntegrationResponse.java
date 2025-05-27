/**
 * HLRIntegrationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class HLRIntegrationResponse  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String technology;

    private java.lang.String sim;

    private java.lang.String networkName;

    private com.xius.billing.AccountManagement_xsd.AccountDetailsInfoType[] accountDetailsList;

    private java.lang.Long errorCode;

    private java.lang.String errorMessage;

    public HLRIntegrationResponse() {
    }

    public HLRIntegrationResponse(
           java.lang.String transactionId,
           java.lang.String technology,
           java.lang.String sim,
           java.lang.String networkName,
           com.xius.billing.AccountManagement_xsd.AccountDetailsInfoType[] accountDetailsList,
           java.lang.Long errorCode,
           java.lang.String errorMessage) {
           this.transactionId = transactionId;
           this.technology = technology;
           this.sim = sim;
           this.networkName = networkName;
           this.accountDetailsList = accountDetailsList;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the transactionId value for this HLRIntegrationResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this HLRIntegrationResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the technology value for this HLRIntegrationResponse.
     * 
     * @return technology
     */
    public java.lang.String getTechnology() {
        return technology;
    }


    /**
     * Sets the technology value for this HLRIntegrationResponse.
     * 
     * @param technology
     */
    public void setTechnology(java.lang.String technology) {
        this.technology = technology;
    }


    /**
     * Gets the sim value for this HLRIntegrationResponse.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this HLRIntegrationResponse.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the networkName value for this HLRIntegrationResponse.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this HLRIntegrationResponse.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the accountDetailsList value for this HLRIntegrationResponse.
     * 
     * @return accountDetailsList
     */
    public com.xius.billing.AccountManagement_xsd.AccountDetailsInfoType[] getAccountDetailsList() {
        return accountDetailsList;
    }


    /**
     * Sets the accountDetailsList value for this HLRIntegrationResponse.
     * 
     * @param accountDetailsList
     */
    public void setAccountDetailsList(com.xius.billing.AccountManagement_xsd.AccountDetailsInfoType[] accountDetailsList) {
        this.accountDetailsList = accountDetailsList;
    }


    /**
     * Gets the errorCode value for this HLRIntegrationResponse.
     * 
     * @return errorCode
     */
    public java.lang.Long getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this HLRIntegrationResponse.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Long errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this HLRIntegrationResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this HLRIntegrationResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HLRIntegrationResponse)) return false;
        HLRIntegrationResponse other = (HLRIntegrationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.technology==null && other.getTechnology()==null) || 
             (this.technology!=null &&
              this.technology.equals(other.getTechnology()))) &&
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.accountDetailsList==null && other.getAccountDetailsList()==null) || 
             (this.accountDetailsList!=null &&
              java.util.Arrays.equals(this.accountDetailsList, other.getAccountDetailsList()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTechnology() != null) {
            _hashCode += getTechnology().hashCode();
        }
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getAccountDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountDetailsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HLRIntegrationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "technology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetailsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "accountDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "errorMessage"));
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
