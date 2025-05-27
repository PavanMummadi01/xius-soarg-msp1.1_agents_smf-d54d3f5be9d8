/**
 * MSISDNValidationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class MSISDNValidationStatus  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String[] failedMSISDNList;

    private java.lang.String[] successMSISDNList;

    private org.apache.axis.message.MessageElement [] _any;

    public MSISDNValidationStatus() {
    }

    public MSISDNValidationStatus(
           java.lang.String[] failedMSISDNList,
           java.lang.String[] successMSISDNList,
           org.apache.axis.message.MessageElement [] _any) {
           this.failedMSISDNList = failedMSISDNList;
           this.successMSISDNList = successMSISDNList;
           this._any = _any;
    }


    /**
     * Gets the failedMSISDNList value for this MSISDNValidationStatus.
     * 
     * @return failedMSISDNList
     */
    public java.lang.String[] getFailedMSISDNList() {
        return failedMSISDNList;
    }


    /**
     * Sets the failedMSISDNList value for this MSISDNValidationStatus.
     * 
     * @param failedMSISDNList
     */
    public void setFailedMSISDNList(java.lang.String[] failedMSISDNList) {
        this.failedMSISDNList = failedMSISDNList;
    }


    /**
     * Gets the successMSISDNList value for this MSISDNValidationStatus.
     * 
     * @return successMSISDNList
     */
    public java.lang.String[] getSuccessMSISDNList() {
        return successMSISDNList;
    }


    /**
     * Sets the successMSISDNList value for this MSISDNValidationStatus.
     * 
     * @param successMSISDNList
     */
    public void setSuccessMSISDNList(java.lang.String[] successMSISDNList) {
        this.successMSISDNList = successMSISDNList;
    }


    /**
     * Gets the _any value for this MSISDNValidationStatus.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this MSISDNValidationStatus.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSISDNValidationStatus)) return false;
        MSISDNValidationStatus other = (MSISDNValidationStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedMSISDNList==null && other.getFailedMSISDNList()==null) || 
             (this.failedMSISDNList!=null &&
              java.util.Arrays.equals(this.failedMSISDNList, other.getFailedMSISDNList()))) &&
            ((this.successMSISDNList==null && other.getSuccessMSISDNList()==null) || 
             (this.successMSISDNList!=null &&
              java.util.Arrays.equals(this.successMSISDNList, other.getSuccessMSISDNList()))) &&
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
        if (getFailedMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedMSISDNList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessMSISDNList(), i);
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
        new org.apache.axis.description.TypeDesc(MSISDNValidationStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "MSISDNValidationStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedMSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "failedMSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successMSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "successMSISDNList"));
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
