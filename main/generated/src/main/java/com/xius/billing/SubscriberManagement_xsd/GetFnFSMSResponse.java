/**
 * GetFnFSMSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetFnFSMSResponse  implements java.io.Serializable {
    private java.lang.Long accountId;

    private com.xius.billing.SubscriberManagement_xsd.ProvisionType provision;

    private java.lang.String[] fnFSMSList;

    private java.lang.String isServiceAvlbl;

    private java.lang.String isSubscribed;

    public GetFnFSMSResponse() {
    }

    public GetFnFSMSResponse(
           java.lang.Long accountId,
           com.xius.billing.SubscriberManagement_xsd.ProvisionType provision,
           java.lang.String[] fnFSMSList,
           java.lang.String isServiceAvlbl,
           java.lang.String isSubscribed) {
           this.accountId = accountId;
           this.provision = provision;
           this.fnFSMSList = fnFSMSList;
           this.isServiceAvlbl = isServiceAvlbl;
           this.isSubscribed = isSubscribed;
    }


    /**
     * Gets the accountId value for this GetFnFSMSResponse.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetFnFSMSResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the provision value for this GetFnFSMSResponse.
     * 
     * @return provision
     */
    public com.xius.billing.SubscriberManagement_xsd.ProvisionType getProvision() {
        return provision;
    }


    /**
     * Sets the provision value for this GetFnFSMSResponse.
     * 
     * @param provision
     */
    public void setProvision(com.xius.billing.SubscriberManagement_xsd.ProvisionType provision) {
        this.provision = provision;
    }


    /**
     * Gets the fnFSMSList value for this GetFnFSMSResponse.
     * 
     * @return fnFSMSList
     */
    public java.lang.String[] getFnFSMSList() {
        return fnFSMSList;
    }


    /**
     * Sets the fnFSMSList value for this GetFnFSMSResponse.
     * 
     * @param fnFSMSList
     */
    public void setFnFSMSList(java.lang.String[] fnFSMSList) {
        this.fnFSMSList = fnFSMSList;
    }


    /**
     * Gets the isServiceAvlbl value for this GetFnFSMSResponse.
     * 
     * @return isServiceAvlbl
     */
    public java.lang.String getIsServiceAvlbl() {
        return isServiceAvlbl;
    }


    /**
     * Sets the isServiceAvlbl value for this GetFnFSMSResponse.
     * 
     * @param isServiceAvlbl
     */
    public void setIsServiceAvlbl(java.lang.String isServiceAvlbl) {
        this.isServiceAvlbl = isServiceAvlbl;
    }


    /**
     * Gets the isSubscribed value for this GetFnFSMSResponse.
     * 
     * @return isSubscribed
     */
    public java.lang.String getIsSubscribed() {
        return isSubscribed;
    }


    /**
     * Sets the isSubscribed value for this GetFnFSMSResponse.
     * 
     * @param isSubscribed
     */
    public void setIsSubscribed(java.lang.String isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFnFSMSResponse)) return false;
        GetFnFSMSResponse other = (GetFnFSMSResponse) obj;
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
            ((this.provision==null && other.getProvision()==null) || 
             (this.provision!=null &&
              this.provision.equals(other.getProvision()))) &&
            ((this.fnFSMSList==null && other.getFnFSMSList()==null) || 
             (this.fnFSMSList!=null &&
              java.util.Arrays.equals(this.fnFSMSList, other.getFnFSMSList()))) &&
            ((this.isServiceAvlbl==null && other.getIsServiceAvlbl()==null) || 
             (this.isServiceAvlbl!=null &&
              this.isServiceAvlbl.equals(other.getIsServiceAvlbl()))) &&
            ((this.isSubscribed==null && other.getIsSubscribed()==null) || 
             (this.isSubscribed!=null &&
              this.isSubscribed.equals(other.getIsSubscribed())));
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
        if (getProvision() != null) {
            _hashCode += getProvision().hashCode();
        }
        if (getFnFSMSList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFnFSMSList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFnFSMSList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsServiceAvlbl() != null) {
            _hashCode += getIsServiceAvlbl().hashCode();
        }
        if (getIsSubscribed() != null) {
            _hashCode += getIsSubscribed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFnFSMSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFnFSMSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Provision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ProvisionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fnFSMSList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FnFSMSList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Number"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isServiceAvlbl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IsServiceAvlbl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSubscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IsSubscribed"));
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
