/**
 * ChangeAddnlServicePlanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ChangeAddnlServicePlanRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.Long msisdn;

    private com.xius.billing.SubscriberManagement_xsd.AddnlServiceType[] addnlService;

    private java.lang.String internalTransId;

    private java.lang.String externalTransId;

    public ChangeAddnlServicePlanRequest() {
    }

    public ChangeAddnlServicePlanRequest(
           java.lang.Long accountId,
           java.lang.Long msisdn,
           com.xius.billing.SubscriberManagement_xsd.AddnlServiceType[] addnlService,
           java.lang.String internalTransId,
           java.lang.String externalTransId) {
           this.accountId = accountId;
           this.msisdn = msisdn;
           this.addnlService = addnlService;
           this.internalTransId = internalTransId;
           this.externalTransId = externalTransId;
    }


    /**
     * Gets the accountId value for this ChangeAddnlServicePlanRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ChangeAddnlServicePlanRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the msisdn value for this ChangeAddnlServicePlanRequest.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this ChangeAddnlServicePlanRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the addnlService value for this ChangeAddnlServicePlanRequest.
     * 
     * @return addnlService
     */
    public com.xius.billing.SubscriberManagement_xsd.AddnlServiceType[] getAddnlService() {
        return addnlService;
    }


    /**
     * Sets the addnlService value for this ChangeAddnlServicePlanRequest.
     * 
     * @param addnlService
     */
    public void setAddnlService(com.xius.billing.SubscriberManagement_xsd.AddnlServiceType[] addnlService) {
        this.addnlService = addnlService;
    }

    public com.xius.billing.SubscriberManagement_xsd.AddnlServiceType getAddnlService(int i) {
        return this.addnlService[i];
    }

    public void setAddnlService(int i, com.xius.billing.SubscriberManagement_xsd.AddnlServiceType _value) {
        this.addnlService[i] = _value;
    }


    /**
     * Gets the internalTransId value for this ChangeAddnlServicePlanRequest.
     * 
     * @return internalTransId
     */
    public java.lang.String getInternalTransId() {
        return internalTransId;
    }


    /**
     * Sets the internalTransId value for this ChangeAddnlServicePlanRequest.
     * 
     * @param internalTransId
     */
    public void setInternalTransId(java.lang.String internalTransId) {
        this.internalTransId = internalTransId;
    }


    /**
     * Gets the externalTransId value for this ChangeAddnlServicePlanRequest.
     * 
     * @return externalTransId
     */
    public java.lang.String getExternalTransId() {
        return externalTransId;
    }


    /**
     * Sets the externalTransId value for this ChangeAddnlServicePlanRequest.
     * 
     * @param externalTransId
     */
    public void setExternalTransId(java.lang.String externalTransId) {
        this.externalTransId = externalTransId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeAddnlServicePlanRequest)) return false;
        ChangeAddnlServicePlanRequest other = (ChangeAddnlServicePlanRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.addnlService==null && other.getAddnlService()==null) || 
             (this.addnlService!=null &&
              java.util.Arrays.equals(this.addnlService, other.getAddnlService()))) &&
            ((this.internalTransId==null && other.getInternalTransId()==null) || 
             (this.internalTransId!=null &&
              this.internalTransId.equals(other.getInternalTransId()))) &&
            ((this.externalTransId==null && other.getExternalTransId()==null) || 
             (this.externalTransId!=null &&
              this.externalTransId.equals(other.getExternalTransId())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAddnlService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddnlService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddnlService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalTransId() != null) {
            _hashCode += getInternalTransId().hashCode();
        }
        if (getExternalTransId() != null) {
            _hashCode += getExternalTransId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeAddnlServicePlanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeAddnlServicePlanRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addnlService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addnlService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addnlServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "internalTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "externalTransId"));
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
