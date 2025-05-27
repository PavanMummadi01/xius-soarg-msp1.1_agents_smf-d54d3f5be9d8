/**
 * ManageBundleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ManageBundleRequest  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String[] MSISDNList;

    private com.xius.billing.SubscriberManagement_xsd.BundleType[] bundleList;

    private java.lang.String validationFlag;

    public ManageBundleRequest() {
    }

    public ManageBundleRequest(
           java.lang.String action,
           java.lang.String[] MSISDNList,
           com.xius.billing.SubscriberManagement_xsd.BundleType[] bundleList,
           java.lang.String validationFlag) {
           this.action = action;
           this.MSISDNList = MSISDNList;
           this.bundleList = bundleList;
           this.validationFlag = validationFlag;
    }


    /**
     * Gets the action value for this ManageBundleRequest.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ManageBundleRequest.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the MSISDNList value for this ManageBundleRequest.
     * 
     * @return MSISDNList
     */
    public java.lang.String[] getMSISDNList() {
        return MSISDNList;
    }


    /**
     * Sets the MSISDNList value for this ManageBundleRequest.
     * 
     * @param MSISDNList
     */
    public void setMSISDNList(java.lang.String[] MSISDNList) {
        this.MSISDNList = MSISDNList;
    }


    /**
     * Gets the bundleList value for this ManageBundleRequest.
     * 
     * @return bundleList
     */
    public com.xius.billing.SubscriberManagement_xsd.BundleType[] getBundleList() {
        return bundleList;
    }


    /**
     * Sets the bundleList value for this ManageBundleRequest.
     * 
     * @param bundleList
     */
    public void setBundleList(com.xius.billing.SubscriberManagement_xsd.BundleType[] bundleList) {
        this.bundleList = bundleList;
    }


    /**
     * Gets the validationFlag value for this ManageBundleRequest.
     * 
     * @return validationFlag
     */
    public java.lang.String getValidationFlag() {
        return validationFlag;
    }


    /**
     * Sets the validationFlag value for this ManageBundleRequest.
     * 
     * @param validationFlag
     */
    public void setValidationFlag(java.lang.String validationFlag) {
        this.validationFlag = validationFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageBundleRequest)) return false;
        ManageBundleRequest other = (ManageBundleRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.MSISDNList==null && other.getMSISDNList()==null) || 
             (this.MSISDNList!=null &&
              java.util.Arrays.equals(this.MSISDNList, other.getMSISDNList()))) &&
            ((this.bundleList==null && other.getBundleList()==null) || 
             (this.bundleList!=null &&
              java.util.Arrays.equals(this.bundleList, other.getBundleList()))) &&
            ((this.validationFlag==null && other.getValidationFlag()==null) || 
             (this.validationFlag!=null &&
              this.validationFlag.equals(other.getValidationFlag())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
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
        if (getBundleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundleList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidationFlag() != null) {
            _hashCode += getValidationFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageBundleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBundleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "validationFlag"));
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
