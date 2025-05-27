/**
 * BalanceDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class BalanceDetails  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.subscriber.BucketBalances bucketBalances;

    private java.util.Calendar lastRechargeDate;

    private java.lang.Double prepaidAccountBalance;

    private org.apache.axis.message.MessageElement [] _any;

    public BalanceDetails() {
    }

    public BalanceDetails(
           net.bcgi.si.messages.mvnoapi.subscriber.BucketBalances bucketBalances,
           java.util.Calendar lastRechargeDate,
           java.lang.Double prepaidAccountBalance,
           org.apache.axis.message.MessageElement [] _any) {
           this.bucketBalances = bucketBalances;
           this.lastRechargeDate = lastRechargeDate;
           this.prepaidAccountBalance = prepaidAccountBalance;
           this._any = _any;
    }


    /**
     * Gets the bucketBalances value for this BalanceDetails.
     * 
     * @return bucketBalances
     */
    public net.bcgi.si.messages.mvnoapi.subscriber.BucketBalances getBucketBalances() {
        return bucketBalances;
    }


    /**
     * Sets the bucketBalances value for this BalanceDetails.
     * 
     * @param bucketBalances
     */
    public void setBucketBalances(net.bcgi.si.messages.mvnoapi.subscriber.BucketBalances bucketBalances) {
        this.bucketBalances = bucketBalances;
    }


    /**
     * Gets the lastRechargeDate value for this BalanceDetails.
     * 
     * @return lastRechargeDate
     */
    public java.util.Calendar getLastRechargeDate() {
        return lastRechargeDate;
    }


    /**
     * Sets the lastRechargeDate value for this BalanceDetails.
     * 
     * @param lastRechargeDate
     */
    public void setLastRechargeDate(java.util.Calendar lastRechargeDate) {
        this.lastRechargeDate = lastRechargeDate;
    }


    /**
     * Gets the prepaidAccountBalance value for this BalanceDetails.
     * 
     * @return prepaidAccountBalance
     */
    public java.lang.Double getPrepaidAccountBalance() {
        return prepaidAccountBalance;
    }


    /**
     * Sets the prepaidAccountBalance value for this BalanceDetails.
     * 
     * @param prepaidAccountBalance
     */
    public void setPrepaidAccountBalance(java.lang.Double prepaidAccountBalance) {
        this.prepaidAccountBalance = prepaidAccountBalance;
    }


    /**
     * Gets the _any value for this BalanceDetails.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this BalanceDetails.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceDetails)) return false;
        BalanceDetails other = (BalanceDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bucketBalances==null && other.getBucketBalances()==null) || 
             (this.bucketBalances!=null &&
              this.bucketBalances.equals(other.getBucketBalances()))) &&
            ((this.lastRechargeDate==null && other.getLastRechargeDate()==null) || 
             (this.lastRechargeDate!=null &&
              this.lastRechargeDate.equals(other.getLastRechargeDate()))) &&
            ((this.prepaidAccountBalance==null && other.getPrepaidAccountBalance()==null) || 
             (this.prepaidAccountBalance!=null &&
              this.prepaidAccountBalance.equals(other.getPrepaidAccountBalance()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getBucketBalances() != null) {
            _hashCode += getBucketBalances().hashCode();
        }
        if (getLastRechargeDate() != null) {
            _hashCode += getLastRechargeDate().hashCode();
        }
        if (getPrepaidAccountBalance() != null) {
            _hashCode += getPrepaidAccountBalance().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(BalanceDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "BalanceDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketBalances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "bucketBalances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "BucketBalances"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRechargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "lastRechargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "prepaidAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
