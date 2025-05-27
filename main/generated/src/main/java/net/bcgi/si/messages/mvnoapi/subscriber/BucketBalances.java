/**
 * BucketBalances.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class BucketBalances  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.Double sMSMessages;

    private java.lang.Double airtimeMinutes;

    private org.apache.axis.message.MessageElement [] _any;

    public BucketBalances() {
    }

    public BucketBalances(
           java.lang.Double sMSMessages,
           java.lang.Double airtimeMinutes,
           org.apache.axis.message.MessageElement [] _any) {
           this.sMSMessages = sMSMessages;
           this.airtimeMinutes = airtimeMinutes;
           this._any = _any;
    }


    /**
     * Gets the sMSMessages value for this BucketBalances.
     * 
     * @return sMSMessages
     */
    public java.lang.Double getSMSMessages() {
        return sMSMessages;
    }


    /**
     * Sets the sMSMessages value for this BucketBalances.
     * 
     * @param sMSMessages
     */
    public void setSMSMessages(java.lang.Double sMSMessages) {
        this.sMSMessages = sMSMessages;
    }


    /**
     * Gets the airtimeMinutes value for this BucketBalances.
     * 
     * @return airtimeMinutes
     */
    public java.lang.Double getAirtimeMinutes() {
        return airtimeMinutes;
    }


    /**
     * Sets the airtimeMinutes value for this BucketBalances.
     * 
     * @param airtimeMinutes
     */
    public void setAirtimeMinutes(java.lang.Double airtimeMinutes) {
        this.airtimeMinutes = airtimeMinutes;
    }


    /**
     * Gets the _any value for this BucketBalances.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this BucketBalances.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BucketBalances)) return false;
        BucketBalances other = (BucketBalances) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sMSMessages==null && other.getSMSMessages()==null) || 
             (this.sMSMessages!=null &&
              this.sMSMessages.equals(other.getSMSMessages()))) &&
            ((this.airtimeMinutes==null && other.getAirtimeMinutes()==null) || 
             (this.airtimeMinutes!=null &&
              this.airtimeMinutes.equals(other.getAirtimeMinutes()))) &&
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
        if (getSMSMessages() != null) {
            _hashCode += getSMSMessages().hashCode();
        }
        if (getAirtimeMinutes() != null) {
            _hashCode += getAirtimeMinutes().hashCode();
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
        new org.apache.axis.description.TypeDesc(BucketBalances.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "BucketBalances"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "sMSMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "airtimeMinutes"));
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
