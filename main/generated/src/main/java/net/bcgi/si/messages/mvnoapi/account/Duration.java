/**
 * Duration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.account;

public class Duration  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String carrierSpecificTimeZone;

    private java.lang.Integer days;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private org.apache.axis.message.MessageElement [] _any;

    public Duration() {
    }

    public Duration(
           java.lang.String carrierSpecificTimeZone,
           java.lang.Integer days,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           org.apache.axis.message.MessageElement [] _any) {
           this.carrierSpecificTimeZone = carrierSpecificTimeZone;
           this.days = days;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this._any = _any;
    }


    /**
     * Gets the carrierSpecificTimeZone value for this Duration.
     * 
     * @return carrierSpecificTimeZone
     */
    public java.lang.String getCarrierSpecificTimeZone() {
        return carrierSpecificTimeZone;
    }


    /**
     * Sets the carrierSpecificTimeZone value for this Duration.
     * 
     * @param carrierSpecificTimeZone
     */
    public void setCarrierSpecificTimeZone(java.lang.String carrierSpecificTimeZone) {
        this.carrierSpecificTimeZone = carrierSpecificTimeZone;
    }


    /**
     * Gets the days value for this Duration.
     * 
     * @return days
     */
    public java.lang.Integer getDays() {
        return days;
    }


    /**
     * Sets the days value for this Duration.
     * 
     * @param days
     */
    public void setDays(java.lang.Integer days) {
        this.days = days;
    }


    /**
     * Gets the fromDate value for this Duration.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this Duration.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this Duration.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this Duration.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the _any value for this Duration.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this Duration.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Duration)) return false;
        Duration other = (Duration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrierSpecificTimeZone==null && other.getCarrierSpecificTimeZone()==null) || 
             (this.carrierSpecificTimeZone!=null &&
              this.carrierSpecificTimeZone.equals(other.getCarrierSpecificTimeZone()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
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
        if (getCarrierSpecificTimeZone() != null) {
            _hashCode += getCarrierSpecificTimeZone().hashCode();
        }
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(Duration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "Duration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierSpecificTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "carrierSpecificTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.mvnoapi.messages.si.bcgi.net", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
