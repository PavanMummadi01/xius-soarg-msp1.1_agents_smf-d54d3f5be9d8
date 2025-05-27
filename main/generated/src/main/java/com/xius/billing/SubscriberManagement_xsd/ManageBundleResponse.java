/**
 * ManageBundleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ManageBundleResponse  implements java.io.Serializable {
    private java.lang.String[] succesNumberList;

    private java.lang.String[] failureNumberList;

    private java.lang.String totalBundleCharge;

    private java.lang.String totalActivationFee;

    public ManageBundleResponse() {
    }

    public ManageBundleResponse(
           java.lang.String[] succesNumberList,
           java.lang.String[] failureNumberList,
           java.lang.String totalBundleCharge,
           java.lang.String totalActivationFee) {
           this.succesNumberList = succesNumberList;
           this.failureNumberList = failureNumberList;
           this.totalBundleCharge = totalBundleCharge;
           this.totalActivationFee = totalActivationFee;
    }


    /**
     * Gets the succesNumberList value for this ManageBundleResponse.
     * 
     * @return succesNumberList
     */
    public java.lang.String[] getSuccesNumberList() {
        return succesNumberList;
    }


    /**
     * Sets the succesNumberList value for this ManageBundleResponse.
     * 
     * @param succesNumberList
     */
    public void setSuccesNumberList(java.lang.String[] succesNumberList) {
        this.succesNumberList = succesNumberList;
    }


    /**
     * Gets the failureNumberList value for this ManageBundleResponse.
     * 
     * @return failureNumberList
     */
    public java.lang.String[] getFailureNumberList() {
        return failureNumberList;
    }


    /**
     * Sets the failureNumberList value for this ManageBundleResponse.
     * 
     * @param failureNumberList
     */
    public void setFailureNumberList(java.lang.String[] failureNumberList) {
        this.failureNumberList = failureNumberList;
    }


    /**
     * Gets the totalBundleCharge value for this ManageBundleResponse.
     * 
     * @return totalBundleCharge
     */
    public java.lang.String getTotalBundleCharge() {
        return totalBundleCharge;
    }


    /**
     * Sets the totalBundleCharge value for this ManageBundleResponse.
     * 
     * @param totalBundleCharge
     */
    public void setTotalBundleCharge(java.lang.String totalBundleCharge) {
        this.totalBundleCharge = totalBundleCharge;
    }


    /**
     * Gets the totalActivationFee value for this ManageBundleResponse.
     * 
     * @return totalActivationFee
     */
    public java.lang.String getTotalActivationFee() {
        return totalActivationFee;
    }


    /**
     * Sets the totalActivationFee value for this ManageBundleResponse.
     * 
     * @param totalActivationFee
     */
    public void setTotalActivationFee(java.lang.String totalActivationFee) {
        this.totalActivationFee = totalActivationFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageBundleResponse)) return false;
        ManageBundleResponse other = (ManageBundleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.succesNumberList==null && other.getSuccesNumberList()==null) || 
             (this.succesNumberList!=null &&
              java.util.Arrays.equals(this.succesNumberList, other.getSuccesNumberList()))) &&
            ((this.failureNumberList==null && other.getFailureNumberList()==null) || 
             (this.failureNumberList!=null &&
              java.util.Arrays.equals(this.failureNumberList, other.getFailureNumberList()))) &&
            ((this.totalBundleCharge==null && other.getTotalBundleCharge()==null) || 
             (this.totalBundleCharge!=null &&
              this.totalBundleCharge.equals(other.getTotalBundleCharge()))) &&
            ((this.totalActivationFee==null && other.getTotalActivationFee()==null) || 
             (this.totalActivationFee!=null &&
              this.totalActivationFee.equals(other.getTotalActivationFee())));
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
        if (getSuccesNumberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccesNumberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccesNumberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailureNumberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailureNumberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailureNumberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalBundleCharge() != null) {
            _hashCode += getTotalBundleCharge().hashCode();
        }
        if (getTotalActivationFee() != null) {
            _hashCode += getTotalActivationFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageBundleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBundleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("succesNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "succesNumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "successMSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "failureNumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "failureMSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBundleCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "totalBundleCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalActivationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "totalActivationFee"));
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
