/**
 * AdjustmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.account;

public class AdjustmentDetail  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.account.DetailRecord[] detailRecord;

    private org.apache.axis.message.MessageElement [] _any;

    public AdjustmentDetail() {
    }

    public AdjustmentDetail(
           net.bcgi.si.messages.mvnoapi.account.DetailRecord[] detailRecord,
           org.apache.axis.message.MessageElement [] _any) {
           this.detailRecord = detailRecord;
           this._any = _any;
    }


    /**
     * Gets the detailRecord value for this AdjustmentDetail.
     * 
     * @return detailRecord
     */
    public net.bcgi.si.messages.mvnoapi.account.DetailRecord[] getDetailRecord() {
        return detailRecord;
    }


    /**
     * Sets the detailRecord value for this AdjustmentDetail.
     * 
     * @param detailRecord
     */
    public void setDetailRecord(net.bcgi.si.messages.mvnoapi.account.DetailRecord[] detailRecord) {
        this.detailRecord = detailRecord;
    }


    /**
     * Gets the _any value for this AdjustmentDetail.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AdjustmentDetail.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustmentDetail)) return false;
        AdjustmentDetail other = (AdjustmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailRecord==null && other.getDetailRecord()==null) || 
             (this.detailRecord!=null &&
              java.util.Arrays.equals(this.detailRecord, other.getDetailRecord()))) &&
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
        if (getDetailRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailRecord(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(AdjustmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "AdjustmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "detailRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "DetailRecord"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "DetailRecord"));
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
