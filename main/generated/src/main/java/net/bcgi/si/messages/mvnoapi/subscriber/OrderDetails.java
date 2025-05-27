/**
 * OrderDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class OrderDetails  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String iccno;

    private java.lang.String oldIC;

    private java.lang.String orderBooking;

    private java.lang.String orderDate;

    private java.lang.String orderExpiryDate;

    private java.lang.String orderStatus;

    private org.apache.axis.message.MessageElement [] _any;

    public OrderDetails() {
    }

    public OrderDetails(
           java.lang.String iccno,
           java.lang.String oldIC,
           java.lang.String orderBooking,
           java.lang.String orderDate,
           java.lang.String orderExpiryDate,
           java.lang.String orderStatus,
           org.apache.axis.message.MessageElement [] _any) {
           this.iccno = iccno;
           this.oldIC = oldIC;
           this.orderBooking = orderBooking;
           this.orderDate = orderDate;
           this.orderExpiryDate = orderExpiryDate;
           this.orderStatus = orderStatus;
           this._any = _any;
    }


    /**
     * Gets the iccno value for this OrderDetails.
     * 
     * @return iccno
     */
    public java.lang.String getIccno() {
        return iccno;
    }


    /**
     * Sets the iccno value for this OrderDetails.
     * 
     * @param iccno
     */
    public void setIccno(java.lang.String iccno) {
        this.iccno = iccno;
    }


    /**
     * Gets the oldIC value for this OrderDetails.
     * 
     * @return oldIC
     */
    public java.lang.String getOldIC() {
        return oldIC;
    }


    /**
     * Sets the oldIC value for this OrderDetails.
     * 
     * @param oldIC
     */
    public void setOldIC(java.lang.String oldIC) {
        this.oldIC = oldIC;
    }


    /**
     * Gets the orderBooking value for this OrderDetails.
     * 
     * @return orderBooking
     */
    public java.lang.String getOrderBooking() {
        return orderBooking;
    }


    /**
     * Sets the orderBooking value for this OrderDetails.
     * 
     * @param orderBooking
     */
    public void setOrderBooking(java.lang.String orderBooking) {
        this.orderBooking = orderBooking;
    }


    /**
     * Gets the orderDate value for this OrderDetails.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this OrderDetails.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderExpiryDate value for this OrderDetails.
     * 
     * @return orderExpiryDate
     */
    public java.lang.String getOrderExpiryDate() {
        return orderExpiryDate;
    }


    /**
     * Sets the orderExpiryDate value for this OrderDetails.
     * 
     * @param orderExpiryDate
     */
    public void setOrderExpiryDate(java.lang.String orderExpiryDate) {
        this.orderExpiryDate = orderExpiryDate;
    }


    /**
     * Gets the orderStatus value for this OrderDetails.
     * 
     * @return orderStatus
     */
    public java.lang.String getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this OrderDetails.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(java.lang.String orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the _any value for this OrderDetails.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this OrderDetails.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDetails)) return false;
        OrderDetails other = (OrderDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iccno==null && other.getIccno()==null) || 
             (this.iccno!=null &&
              this.iccno.equals(other.getIccno()))) &&
            ((this.oldIC==null && other.getOldIC()==null) || 
             (this.oldIC!=null &&
              this.oldIC.equals(other.getOldIC()))) &&
            ((this.orderBooking==null && other.getOrderBooking()==null) || 
             (this.orderBooking!=null &&
              this.orderBooking.equals(other.getOrderBooking()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderExpiryDate==null && other.getOrderExpiryDate()==null) || 
             (this.orderExpiryDate!=null &&
              this.orderExpiryDate.equals(other.getOrderExpiryDate()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
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
        if (getIccno() != null) {
            _hashCode += getIccno().hashCode();
        }
        if (getOldIC() != null) {
            _hashCode += getOldIC().hashCode();
        }
        if (getOrderBooking() != null) {
            _hashCode += getOrderBooking().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderExpiryDate() != null) {
            _hashCode += getOrderExpiryDate().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(OrderDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "OrderDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "iccno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "oldIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBooking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "orderBooking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "orderExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "orderStatus"));
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
