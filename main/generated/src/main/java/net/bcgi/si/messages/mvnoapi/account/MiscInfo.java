/**
 * MiscInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.account;

public class MiscInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private net.bcgi.si.messages.mvnoapi.account.AdjustmentDetail[] miscDetail;

    private java.lang.String name;

    private org.apache.axis.message.MessageElement [] _any;

    public MiscInfo() {
    }

    public MiscInfo(
           net.bcgi.si.messages.mvnoapi.account.AdjustmentDetail[] miscDetail,
           java.lang.String name,
           org.apache.axis.message.MessageElement [] _any) {
           this.miscDetail = miscDetail;
           this.name = name;
           this._any = _any;
    }


    /**
     * Gets the miscDetail value for this MiscInfo.
     * 
     * @return miscDetail
     */
    public net.bcgi.si.messages.mvnoapi.account.AdjustmentDetail[] getMiscDetail() {
        return miscDetail;
    }


    /**
     * Sets the miscDetail value for this MiscInfo.
     * 
     * @param miscDetail
     */
    public void setMiscDetail(net.bcgi.si.messages.mvnoapi.account.AdjustmentDetail[] miscDetail) {
        this.miscDetail = miscDetail;
    }


    /**
     * Gets the name value for this MiscInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MiscInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the _any value for this MiscInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this MiscInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MiscInfo)) return false;
        MiscInfo other = (MiscInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.miscDetail==null && other.getMiscDetail()==null) || 
             (this.miscDetail!=null &&
              java.util.Arrays.equals(this.miscDetail, other.getMiscDetail()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
        if (getMiscDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiscDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiscDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        new org.apache.axis.description.TypeDesc(MiscInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "MiscInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "miscDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "AdjustmentDetail"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "AdjustmentDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
