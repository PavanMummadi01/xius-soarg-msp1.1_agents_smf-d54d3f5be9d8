/**
 * UploadDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class UploadDetails  implements java.io.Serializable {
    private java.lang.String msisdn;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.ScheduleType scheduleType;

    private java.lang.String lbValue;

    private java.lang.String dmValue;

    private java.math.BigDecimal amout;

    public UploadDetails() {
    }

    public UploadDetails(
           java.lang.String msisdn,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.ScheduleType scheduleType,
           java.lang.String lbValue,
           java.lang.String dmValue,
           java.math.BigDecimal amout) {
           this.msisdn = msisdn;
           this.scheduleType = scheduleType;
           this.lbValue = lbValue;
           this.dmValue = dmValue;
           this.amout = amout;
    }


    /**
     * Gets the msisdn value for this UploadDetails.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this UploadDetails.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the scheduleType value for this UploadDetails.
     * 
     * @return scheduleType
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.ScheduleType getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this UploadDetails.
     * 
     * @param scheduleType
     */
    public void setScheduleType(com.xiusbcgi.xbus.scare.CorpManagement_xsd.ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the lbValue value for this UploadDetails.
     * 
     * @return lbValue
     */
    public java.lang.String getLbValue() {
        return lbValue;
    }


    /**
     * Sets the lbValue value for this UploadDetails.
     * 
     * @param lbValue
     */
    public void setLbValue(java.lang.String lbValue) {
        this.lbValue = lbValue;
    }


    /**
     * Gets the dmValue value for this UploadDetails.
     * 
     * @return dmValue
     */
    public java.lang.String getDmValue() {
        return dmValue;
    }


    /**
     * Sets the dmValue value for this UploadDetails.
     * 
     * @param dmValue
     */
    public void setDmValue(java.lang.String dmValue) {
        this.dmValue = dmValue;
    }


    /**
     * Gets the amout value for this UploadDetails.
     * 
     * @return amout
     */
    public java.math.BigDecimal getAmout() {
        return amout;
    }


    /**
     * Sets the amout value for this UploadDetails.
     * 
     * @param amout
     */
    public void setAmout(java.math.BigDecimal amout) {
        this.amout = amout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadDetails)) return false;
        UploadDetails other = (UploadDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.scheduleType==null && other.getScheduleType()==null) || 
             (this.scheduleType!=null &&
              this.scheduleType.equals(other.getScheduleType()))) &&
            ((this.lbValue==null && other.getLbValue()==null) || 
             (this.lbValue!=null &&
              this.lbValue.equals(other.getLbValue()))) &&
            ((this.dmValue==null && other.getDmValue()==null) || 
             (this.dmValue!=null &&
              this.dmValue.equals(other.getDmValue()))) &&
            ((this.amout==null && other.getAmout()==null) || 
             (this.amout!=null &&
              this.amout.equals(other.getAmout())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getScheduleType() != null) {
            _hashCode += getScheduleType().hashCode();
        }
        if (getLbValue() != null) {
            _hashCode += getLbValue().hashCode();
        }
        if (getDmValue() != null) {
            _hashCode += getDmValue().hashCode();
        }
        if (getAmout() != null) {
            _hashCode += getAmout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "UploadDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "scheduleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "ScheduleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "lbValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "dmValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "amout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
