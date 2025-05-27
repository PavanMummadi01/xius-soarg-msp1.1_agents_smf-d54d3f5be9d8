/**
 * SIMValidationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class SIMValidationStatus  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String[] failedSIMList;

    private java.lang.String[] successSIMList;

    private org.apache.axis.message.MessageElement [] _any;

    public SIMValidationStatus() {
    }

    public SIMValidationStatus(
           java.lang.String[] failedSIMList,
           java.lang.String[] successSIMList,
           org.apache.axis.message.MessageElement [] _any) {
           this.failedSIMList = failedSIMList;
           this.successSIMList = successSIMList;
           this._any = _any;
    }


    /**
     * Gets the failedSIMList value for this SIMValidationStatus.
     * 
     * @return failedSIMList
     */
    public java.lang.String[] getFailedSIMList() {
        return failedSIMList;
    }


    /**
     * Sets the failedSIMList value for this SIMValidationStatus.
     * 
     * @param failedSIMList
     */
    public void setFailedSIMList(java.lang.String[] failedSIMList) {
        this.failedSIMList = failedSIMList;
    }


    /**
     * Gets the successSIMList value for this SIMValidationStatus.
     * 
     * @return successSIMList
     */
    public java.lang.String[] getSuccessSIMList() {
        return successSIMList;
    }


    /**
     * Sets the successSIMList value for this SIMValidationStatus.
     * 
     * @param successSIMList
     */
    public void setSuccessSIMList(java.lang.String[] successSIMList) {
        this.successSIMList = successSIMList;
    }


    /**
     * Gets the _any value for this SIMValidationStatus.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SIMValidationStatus.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMValidationStatus)) return false;
        SIMValidationStatus other = (SIMValidationStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedSIMList==null && other.getFailedSIMList()==null) || 
             (this.failedSIMList!=null &&
              java.util.Arrays.equals(this.failedSIMList, other.getFailedSIMList()))) &&
            ((this.successSIMList==null && other.getSuccessSIMList()==null) || 
             (this.successSIMList!=null &&
              java.util.Arrays.equals(this.successSIMList, other.getSuccessSIMList()))) &&
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
        if (getFailedSIMList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedSIMList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedSIMList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessSIMList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessSIMList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessSIMList(), i);
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
        new org.apache.axis.description.TypeDesc(SIMValidationStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "SIMValidationStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedSIMList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "failedSIMList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successSIMList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "successSIMList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "string"));
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
