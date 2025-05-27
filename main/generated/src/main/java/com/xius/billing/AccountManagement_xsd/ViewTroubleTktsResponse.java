/**
 * ViewTroubleTktsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ViewTroubleTktsResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.billing.AccountManagement_xsd.TrblTktsType[] tktList;

    private java.lang.Long totalTkts;

    public ViewTroubleTktsResponse() {
    }

    public ViewTroubleTktsResponse(
           java.lang.String message,
           com.xius.billing.AccountManagement_xsd.TrblTktsType[] tktList,
           java.lang.Long totalTkts) {
           this.message = message;
           this.tktList = tktList;
           this.totalTkts = totalTkts;
    }


    /**
     * Gets the message value for this ViewTroubleTktsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ViewTroubleTktsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the tktList value for this ViewTroubleTktsResponse.
     * 
     * @return tktList
     */
    public com.xius.billing.AccountManagement_xsd.TrblTktsType[] getTktList() {
        return tktList;
    }


    /**
     * Sets the tktList value for this ViewTroubleTktsResponse.
     * 
     * @param tktList
     */
    public void setTktList(com.xius.billing.AccountManagement_xsd.TrblTktsType[] tktList) {
        this.tktList = tktList;
    }


    /**
     * Gets the totalTkts value for this ViewTroubleTktsResponse.
     * 
     * @return totalTkts
     */
    public java.lang.Long getTotalTkts() {
        return totalTkts;
    }


    /**
     * Sets the totalTkts value for this ViewTroubleTktsResponse.
     * 
     * @param totalTkts
     */
    public void setTotalTkts(java.lang.Long totalTkts) {
        this.totalTkts = totalTkts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewTroubleTktsResponse)) return false;
        ViewTroubleTktsResponse other = (ViewTroubleTktsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.tktList==null && other.getTktList()==null) || 
             (this.tktList!=null &&
              java.util.Arrays.equals(this.tktList, other.getTktList()))) &&
            ((this.totalTkts==null && other.getTotalTkts()==null) || 
             (this.totalTkts!=null &&
              this.totalTkts.equals(other.getTotalTkts())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getTktList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTktList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTktList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalTkts() != null) {
            _hashCode += getTotalTkts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewTroubleTktsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ViewTroubleTktsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TrblTktsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tkts"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTkts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "totalTkts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
