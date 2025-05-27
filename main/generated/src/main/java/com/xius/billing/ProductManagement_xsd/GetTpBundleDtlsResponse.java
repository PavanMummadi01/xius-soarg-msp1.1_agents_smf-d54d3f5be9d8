/**
 * GetTpBundleDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_xsd;

public class GetTpBundleDtlsResponse  implements java.io.Serializable {
    private com.xius.billing.ProductManagement_xsd.SubscribedTPType subscribedTPs;

    private com.xius.billing.ProductManagement_xsd.AttachedATPType[] attachedATPs;

    private com.xius.billing.ProductManagement_xsd.AvailableATPType[] availableATPs;

    public GetTpBundleDtlsResponse() {
    }

    public GetTpBundleDtlsResponse(
           com.xius.billing.ProductManagement_xsd.SubscribedTPType subscribedTPs,
           com.xius.billing.ProductManagement_xsd.AttachedATPType[] attachedATPs,
           com.xius.billing.ProductManagement_xsd.AvailableATPType[] availableATPs) {
           this.subscribedTPs = subscribedTPs;
           this.attachedATPs = attachedATPs;
           this.availableATPs = availableATPs;
    }


    /**
     * Gets the subscribedTPs value for this GetTpBundleDtlsResponse.
     * 
     * @return subscribedTPs
     */
    public com.xius.billing.ProductManagement_xsd.SubscribedTPType getSubscribedTPs() {
        return subscribedTPs;
    }


    /**
     * Sets the subscribedTPs value for this GetTpBundleDtlsResponse.
     * 
     * @param subscribedTPs
     */
    public void setSubscribedTPs(com.xius.billing.ProductManagement_xsd.SubscribedTPType subscribedTPs) {
        this.subscribedTPs = subscribedTPs;
    }


    /**
     * Gets the attachedATPs value for this GetTpBundleDtlsResponse.
     * 
     * @return attachedATPs
     */
    public com.xius.billing.ProductManagement_xsd.AttachedATPType[] getAttachedATPs() {
        return attachedATPs;
    }


    /**
     * Sets the attachedATPs value for this GetTpBundleDtlsResponse.
     * 
     * @param attachedATPs
     */
    public void setAttachedATPs(com.xius.billing.ProductManagement_xsd.AttachedATPType[] attachedATPs) {
        this.attachedATPs = attachedATPs;
    }

    public com.xius.billing.ProductManagement_xsd.AttachedATPType getAttachedATPs(int i) {
        return this.attachedATPs[i];
    }

    public void setAttachedATPs(int i, com.xius.billing.ProductManagement_xsd.AttachedATPType _value) {
        this.attachedATPs[i] = _value;
    }


    /**
     * Gets the availableATPs value for this GetTpBundleDtlsResponse.
     * 
     * @return availableATPs
     */
    public com.xius.billing.ProductManagement_xsd.AvailableATPType[] getAvailableATPs() {
        return availableATPs;
    }


    /**
     * Sets the availableATPs value for this GetTpBundleDtlsResponse.
     * 
     * @param availableATPs
     */
    public void setAvailableATPs(com.xius.billing.ProductManagement_xsd.AvailableATPType[] availableATPs) {
        this.availableATPs = availableATPs;
    }

    public com.xius.billing.ProductManagement_xsd.AvailableATPType getAvailableATPs(int i) {
        return this.availableATPs[i];
    }

    public void setAvailableATPs(int i, com.xius.billing.ProductManagement_xsd.AvailableATPType _value) {
        this.availableATPs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTpBundleDtlsResponse)) return false;
        GetTpBundleDtlsResponse other = (GetTpBundleDtlsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscribedTPs==null && other.getSubscribedTPs()==null) || 
             (this.subscribedTPs!=null &&
              this.subscribedTPs.equals(other.getSubscribedTPs()))) &&
            ((this.attachedATPs==null && other.getAttachedATPs()==null) || 
             (this.attachedATPs!=null &&
              java.util.Arrays.equals(this.attachedATPs, other.getAttachedATPs()))) &&
            ((this.availableATPs==null && other.getAvailableATPs()==null) || 
             (this.availableATPs!=null &&
              java.util.Arrays.equals(this.availableATPs, other.getAvailableATPs())));
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
        if (getSubscribedTPs() != null) {
            _hashCode += getSubscribedTPs().hashCode();
        }
        if (getAttachedATPs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachedATPs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachedATPs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableATPs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableATPs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableATPs(), i);
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
        new org.apache.axis.description.TypeDesc(GetTpBundleDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "getTpBundleDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribedTPs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "SubscribedTPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "SubscribedTPType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedATPs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AttachedATPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AttachedATPType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableATPs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AvailableATPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.xsd", "AvailableATPType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
