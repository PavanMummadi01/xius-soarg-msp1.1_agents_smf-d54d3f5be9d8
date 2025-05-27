/**
 * GetBalanceDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetBalanceDetailsResponse  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.BalanceDetailsType balanceDetails;

    public GetBalanceDetailsResponse() {
    }

    public GetBalanceDetailsResponse(
           com.xius.billing.SubscriberManagement_xsd.BalanceDetailsType balanceDetails) {
           this.balanceDetails = balanceDetails;
    }


    /**
     * Gets the balanceDetails value for this GetBalanceDetailsResponse.
     * 
     * @return balanceDetails
     */
    public com.xius.billing.SubscriberManagement_xsd.BalanceDetailsType getBalanceDetails() {
        return balanceDetails;
    }


    /**
     * Sets the balanceDetails value for this GetBalanceDetailsResponse.
     * 
     * @param balanceDetails
     */
    public void setBalanceDetails(com.xius.billing.SubscriberManagement_xsd.BalanceDetailsType balanceDetails) {
        this.balanceDetails = balanceDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBalanceDetailsResponse)) return false;
        GetBalanceDetailsResponse other = (GetBalanceDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceDetails==null && other.getBalanceDetails()==null) || 
             (this.balanceDetails!=null &&
              this.balanceDetails.equals(other.getBalanceDetails())));
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
        if (getBalanceDetails() != null) {
            _hashCode += getBalanceDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBalanceDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBalanceDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceDetailsType"));
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
