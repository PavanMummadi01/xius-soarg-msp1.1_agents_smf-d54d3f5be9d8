/**
 * ManageBannerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class ManageBannerRequest  implements java.io.Serializable {
    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.OptionFlagType actionFlag;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.BannerDetailsType bannerDetails;

    public ManageBannerRequest() {
    }

    public ManageBannerRequest(
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.OptionFlagType actionFlag,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.BannerDetailsType bannerDetails) {
           this.actionFlag = actionFlag;
           this.bannerDetails = bannerDetails;
    }


    /**
     * Gets the actionFlag value for this ManageBannerRequest.
     * 
     * @return actionFlag
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.OptionFlagType getActionFlag() {
        return actionFlag;
    }


    /**
     * Sets the actionFlag value for this ManageBannerRequest.
     * 
     * @param actionFlag
     */
    public void setActionFlag(com.xiusbcgi.xbus.scare.CorpManagement_xsd.OptionFlagType actionFlag) {
        this.actionFlag = actionFlag;
    }


    /**
     * Gets the bannerDetails value for this ManageBannerRequest.
     * 
     * @return bannerDetails
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.BannerDetailsType getBannerDetails() {
        return bannerDetails;
    }


    /**
     * Sets the bannerDetails value for this ManageBannerRequest.
     * 
     * @param bannerDetails
     */
    public void setBannerDetails(com.xiusbcgi.xbus.scare.CorpManagement_xsd.BannerDetailsType bannerDetails) {
        this.bannerDetails = bannerDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageBannerRequest)) return false;
        ManageBannerRequest other = (ManageBannerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionFlag==null && other.getActionFlag()==null) || 
             (this.actionFlag!=null &&
              this.actionFlag.equals(other.getActionFlag()))) &&
            ((this.bannerDetails==null && other.getBannerDetails()==null) || 
             (this.bannerDetails!=null &&
              this.bannerDetails.equals(other.getBannerDetails())));
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
        if (getActionFlag() != null) {
            _hashCode += getActionFlag().hashCode();
        }
        if (getBannerDetails() != null) {
            _hashCode += getBannerDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageBannerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ManageBannerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "actionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "OptionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "bannerDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "BannerDetailsType"));
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
