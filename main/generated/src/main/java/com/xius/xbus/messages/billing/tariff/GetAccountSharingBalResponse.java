/**
 * GetAccountSharingBalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.tariff;

public class GetAccountSharingBalResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    /* Balance information */
    private com.xius.xbus.messages.billing.tariff.BalanceUnitsInfoType[] balanceInfo;

    public GetAccountSharingBalResponse() {
    }

    public GetAccountSharingBalResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.billing.tariff.BalanceUnitsInfoType[] balanceInfo) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.balanceInfo = balanceInfo;
    }


    /**
     * Gets the balanceInfo value for this GetAccountSharingBalResponse.
     * 
     * @return balanceInfo   * Balance information
     */
    public com.xius.xbus.messages.billing.tariff.BalanceUnitsInfoType[] getBalanceInfo() {
        return balanceInfo;
    }


    /**
     * Sets the balanceInfo value for this GetAccountSharingBalResponse.
     * 
     * @param balanceInfo   * Balance information
     */
    public void setBalanceInfo(com.xius.xbus.messages.billing.tariff.BalanceUnitsInfoType[] balanceInfo) {
        this.balanceInfo = balanceInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountSharingBalResponse)) return false;
        GetAccountSharingBalResponse other = (GetAccountSharingBalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balanceInfo==null && other.getBalanceInfo()==null) || 
             (this.balanceInfo!=null &&
              java.util.Arrays.equals(this.balanceInfo, other.getBalanceInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBalanceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetAccountSharingBalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", ">getAccountSharingBalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "balanceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "BalanceUnitsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/tariff", "balanceServUnits"));
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
