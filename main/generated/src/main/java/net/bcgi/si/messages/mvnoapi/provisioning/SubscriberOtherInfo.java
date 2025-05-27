/**
 * SubscriberOtherInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class SubscriberOtherInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String ethic;

    private java.lang.String orderBooking;

    private java.lang.String orderInfo;

    private java.lang.String pleaseSpecify;

    private java.lang.String sourceofInfo;

    private org.apache.axis.message.MessageElement [] _any;

    public SubscriberOtherInfo() {
    }

    public SubscriberOtherInfo(
           java.lang.String ethic,
           java.lang.String orderBooking,
           java.lang.String orderInfo,
           java.lang.String pleaseSpecify,
           java.lang.String sourceofInfo,
           org.apache.axis.message.MessageElement [] _any) {
           this.ethic = ethic;
           this.orderBooking = orderBooking;
           this.orderInfo = orderInfo;
           this.pleaseSpecify = pleaseSpecify;
           this.sourceofInfo = sourceofInfo;
           this._any = _any;
    }


    /**
     * Gets the ethic value for this SubscriberOtherInfo.
     * 
     * @return ethic
     */
    public java.lang.String getEthic() {
        return ethic;
    }


    /**
     * Sets the ethic value for this SubscriberOtherInfo.
     * 
     * @param ethic
     */
    public void setEthic(java.lang.String ethic) {
        this.ethic = ethic;
    }


    /**
     * Gets the orderBooking value for this SubscriberOtherInfo.
     * 
     * @return orderBooking
     */
    public java.lang.String getOrderBooking() {
        return orderBooking;
    }


    /**
     * Sets the orderBooking value for this SubscriberOtherInfo.
     * 
     * @param orderBooking
     */
    public void setOrderBooking(java.lang.String orderBooking) {
        this.orderBooking = orderBooking;
    }


    /**
     * Gets the orderInfo value for this SubscriberOtherInfo.
     * 
     * @return orderInfo
     */
    public java.lang.String getOrderInfo() {
        return orderInfo;
    }


    /**
     * Sets the orderInfo value for this SubscriberOtherInfo.
     * 
     * @param orderInfo
     */
    public void setOrderInfo(java.lang.String orderInfo) {
        this.orderInfo = orderInfo;
    }


    /**
     * Gets the pleaseSpecify value for this SubscriberOtherInfo.
     * 
     * @return pleaseSpecify
     */
    public java.lang.String getPleaseSpecify() {
        return pleaseSpecify;
    }


    /**
     * Sets the pleaseSpecify value for this SubscriberOtherInfo.
     * 
     * @param pleaseSpecify
     */
    public void setPleaseSpecify(java.lang.String pleaseSpecify) {
        this.pleaseSpecify = pleaseSpecify;
    }


    /**
     * Gets the sourceofInfo value for this SubscriberOtherInfo.
     * 
     * @return sourceofInfo
     */
    public java.lang.String getSourceofInfo() {
        return sourceofInfo;
    }


    /**
     * Sets the sourceofInfo value for this SubscriberOtherInfo.
     * 
     * @param sourceofInfo
     */
    public void setSourceofInfo(java.lang.String sourceofInfo) {
        this.sourceofInfo = sourceofInfo;
    }


    /**
     * Gets the _any value for this SubscriberOtherInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SubscriberOtherInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberOtherInfo)) return false;
        SubscriberOtherInfo other = (SubscriberOtherInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ethic==null && other.getEthic()==null) || 
             (this.ethic!=null &&
              this.ethic.equals(other.getEthic()))) &&
            ((this.orderBooking==null && other.getOrderBooking()==null) || 
             (this.orderBooking!=null &&
              this.orderBooking.equals(other.getOrderBooking()))) &&
            ((this.orderInfo==null && other.getOrderInfo()==null) || 
             (this.orderInfo!=null &&
              this.orderInfo.equals(other.getOrderInfo()))) &&
            ((this.pleaseSpecify==null && other.getPleaseSpecify()==null) || 
             (this.pleaseSpecify!=null &&
              this.pleaseSpecify.equals(other.getPleaseSpecify()))) &&
            ((this.sourceofInfo==null && other.getSourceofInfo()==null) || 
             (this.sourceofInfo!=null &&
              this.sourceofInfo.equals(other.getSourceofInfo()))) &&
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
        if (getEthic() != null) {
            _hashCode += getEthic().hashCode();
        }
        if (getOrderBooking() != null) {
            _hashCode += getOrderBooking().hashCode();
        }
        if (getOrderInfo() != null) {
            _hashCode += getOrderInfo().hashCode();
        }
        if (getPleaseSpecify() != null) {
            _hashCode += getPleaseSpecify().hashCode();
        }
        if (getSourceofInfo() != null) {
            _hashCode += getSourceofInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubscriberOtherInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "subscriberOtherInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ethic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBooking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "orderBooking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "orderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pleaseSpecify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "pleaseSpecify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceofInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "sourceofInfo"));
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
