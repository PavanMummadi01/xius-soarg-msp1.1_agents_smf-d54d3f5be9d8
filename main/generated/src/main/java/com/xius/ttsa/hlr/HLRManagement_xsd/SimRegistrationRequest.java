/**
 * SimRegistrationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class SimRegistrationRequest  implements java.io.Serializable {
    private long oldMSISDN;

    private long newMSISDN;

    private long newIMSI;

    private java.lang.Long disableODBValue;

    private java.lang.Integer subscriberState;

    private java.lang.String orderNo;

    private int MSISDNType;

    public SimRegistrationRequest() {
    }

    public SimRegistrationRequest(
           long oldMSISDN,
           long newMSISDN,
           long newIMSI,
           java.lang.Long disableODBValue,
           java.lang.Integer subscriberState,
           java.lang.String orderNo,
           int MSISDNType) {
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.newIMSI = newIMSI;
           this.disableODBValue = disableODBValue;
           this.subscriberState = subscriberState;
           this.orderNo = orderNo;
           this.MSISDNType = MSISDNType;
    }


    /**
     * Gets the oldMSISDN value for this SimRegistrationRequest.
     * 
     * @return oldMSISDN
     */
    public long getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this SimRegistrationRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(long oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this SimRegistrationRequest.
     * 
     * @return newMSISDN
     */
    public long getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this SimRegistrationRequest.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(long newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the newIMSI value for this SimRegistrationRequest.
     * 
     * @return newIMSI
     */
    public long getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this SimRegistrationRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(long newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the disableODBValue value for this SimRegistrationRequest.
     * 
     * @return disableODBValue
     */
    public java.lang.Long getDisableODBValue() {
        return disableODBValue;
    }


    /**
     * Sets the disableODBValue value for this SimRegistrationRequest.
     * 
     * @param disableODBValue
     */
    public void setDisableODBValue(java.lang.Long disableODBValue) {
        this.disableODBValue = disableODBValue;
    }


    /**
     * Gets the subscriberState value for this SimRegistrationRequest.
     * 
     * @return subscriberState
     */
    public java.lang.Integer getSubscriberState() {
        return subscriberState;
    }


    /**
     * Sets the subscriberState value for this SimRegistrationRequest.
     * 
     * @param subscriberState
     */
    public void setSubscriberState(java.lang.Integer subscriberState) {
        this.subscriberState = subscriberState;
    }


    /**
     * Gets the orderNo value for this SimRegistrationRequest.
     * 
     * @return orderNo
     */
    public java.lang.String getOrderNo() {
        return orderNo;
    }


    /**
     * Sets the orderNo value for this SimRegistrationRequest.
     * 
     * @param orderNo
     */
    public void setOrderNo(java.lang.String orderNo) {
        this.orderNo = orderNo;
    }


    /**
     * Gets the MSISDNType value for this SimRegistrationRequest.
     * 
     * @return MSISDNType
     */
    public int getMSISDNType() {
        return MSISDNType;
    }


    /**
     * Sets the MSISDNType value for this SimRegistrationRequest.
     * 
     * @param MSISDNType
     */
    public void setMSISDNType(int MSISDNType) {
        this.MSISDNType = MSISDNType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimRegistrationRequest)) return false;
        SimRegistrationRequest other = (SimRegistrationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.oldMSISDN == other.getOldMSISDN() &&
            this.newMSISDN == other.getNewMSISDN() &&
            this.newIMSI == other.getNewIMSI() &&
            ((this.disableODBValue==null && other.getDisableODBValue()==null) || 
             (this.disableODBValue!=null &&
              this.disableODBValue.equals(other.getDisableODBValue()))) &&
            ((this.subscriberState==null && other.getSubscriberState()==null) || 
             (this.subscriberState!=null &&
              this.subscriberState.equals(other.getSubscriberState()))) &&
            ((this.orderNo==null && other.getOrderNo()==null) || 
             (this.orderNo!=null &&
              this.orderNo.equals(other.getOrderNo()))) &&
            this.MSISDNType == other.getMSISDNType();
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
        _hashCode += new Long(getOldMSISDN()).hashCode();
        _hashCode += new Long(getNewMSISDN()).hashCode();
        _hashCode += new Long(getNewIMSI()).hashCode();
        if (getDisableODBValue() != null) {
            _hashCode += getDisableODBValue().hashCode();
        }
        if (getSubscriberState() != null) {
            _hashCode += getSubscriberState().hashCode();
        }
        if (getOrderNo() != null) {
            _hashCode += getOrderNo().hashCode();
        }
        _hashCode += getMSISDNType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimRegistrationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "SimRegistrationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "newIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableODBValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "disableODBValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "subscriberState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "orderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDNType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "MSISDNType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
