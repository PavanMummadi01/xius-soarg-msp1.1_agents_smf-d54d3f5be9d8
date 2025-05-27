/**
 * ChangeMSISDNsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ChangeMSISDNsResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String countryCode;

    private long[] transNo;

    private java.lang.String[] MSISDNIMSIType;

    private java.lang.String[] oldIMSI;

    private java.lang.String subscriberState;

    private java.lang.String[] oldCCNDCMsisdn;

    private java.lang.String[] newCCNDCMsisdn;

    public ChangeMSISDNsResponse() {
    }

    public ChangeMSISDNsResponse(
           java.lang.String message,
           java.lang.String countryCode,
           long[] transNo,
           java.lang.String[] MSISDNIMSIType,
           java.lang.String[] oldIMSI,
           java.lang.String subscriberState,
           java.lang.String[] oldCCNDCMsisdn,
           java.lang.String[] newCCNDCMsisdn) {
           this.message = message;
           this.countryCode = countryCode;
           this.transNo = transNo;
           this.MSISDNIMSIType = MSISDNIMSIType;
           this.oldIMSI = oldIMSI;
           this.subscriberState = subscriberState;
           this.oldCCNDCMsisdn = oldCCNDCMsisdn;
           this.newCCNDCMsisdn = newCCNDCMsisdn;
    }


    /**
     * Gets the message value for this ChangeMSISDNsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ChangeMSISDNsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the countryCode value for this ChangeMSISDNsResponse.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this ChangeMSISDNsResponse.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the transNo value for this ChangeMSISDNsResponse.
     * 
     * @return transNo
     */
    public long[] getTransNo() {
        return transNo;
    }


    /**
     * Sets the transNo value for this ChangeMSISDNsResponse.
     * 
     * @param transNo
     */
    public void setTransNo(long[] transNo) {
        this.transNo = transNo;
    }

    public long getTransNo(int i) {
        return this.transNo[i];
    }

    public void setTransNo(int i, long _value) {
        this.transNo[i] = _value;
    }


    /**
     * Gets the MSISDNIMSIType value for this ChangeMSISDNsResponse.
     * 
     * @return MSISDNIMSIType
     */
    public java.lang.String[] getMSISDNIMSIType() {
        return MSISDNIMSIType;
    }


    /**
     * Sets the MSISDNIMSIType value for this ChangeMSISDNsResponse.
     * 
     * @param MSISDNIMSIType
     */
    public void setMSISDNIMSIType(java.lang.String[] MSISDNIMSIType) {
        this.MSISDNIMSIType = MSISDNIMSIType;
    }

    public java.lang.String getMSISDNIMSIType(int i) {
        return this.MSISDNIMSIType[i];
    }

    public void setMSISDNIMSIType(int i, java.lang.String _value) {
        this.MSISDNIMSIType[i] = _value;
    }


    /**
     * Gets the oldIMSI value for this ChangeMSISDNsResponse.
     * 
     * @return oldIMSI
     */
    public java.lang.String[] getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this ChangeMSISDNsResponse.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String[] oldIMSI) {
        this.oldIMSI = oldIMSI;
    }

    public java.lang.String getOldIMSI(int i) {
        return this.oldIMSI[i];
    }

    public void setOldIMSI(int i, java.lang.String _value) {
        this.oldIMSI[i] = _value;
    }


    /**
     * Gets the subscriberState value for this ChangeMSISDNsResponse.
     * 
     * @return subscriberState
     */
    public java.lang.String getSubscriberState() {
        return subscriberState;
    }


    /**
     * Sets the subscriberState value for this ChangeMSISDNsResponse.
     * 
     * @param subscriberState
     */
    public void setSubscriberState(java.lang.String subscriberState) {
        this.subscriberState = subscriberState;
    }


    /**
     * Gets the oldCCNDCMsisdn value for this ChangeMSISDNsResponse.
     * 
     * @return oldCCNDCMsisdn
     */
    public java.lang.String[] getOldCCNDCMsisdn() {
        return oldCCNDCMsisdn;
    }


    /**
     * Sets the oldCCNDCMsisdn value for this ChangeMSISDNsResponse.
     * 
     * @param oldCCNDCMsisdn
     */
    public void setOldCCNDCMsisdn(java.lang.String[] oldCCNDCMsisdn) {
        this.oldCCNDCMsisdn = oldCCNDCMsisdn;
    }


    /**
     * Gets the newCCNDCMsisdn value for this ChangeMSISDNsResponse.
     * 
     * @return newCCNDCMsisdn
     */
    public java.lang.String[] getNewCCNDCMsisdn() {
        return newCCNDCMsisdn;
    }


    /**
     * Sets the newCCNDCMsisdn value for this ChangeMSISDNsResponse.
     * 
     * @param newCCNDCMsisdn
     */
    public void setNewCCNDCMsisdn(java.lang.String[] newCCNDCMsisdn) {
        this.newCCNDCMsisdn = newCCNDCMsisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMSISDNsResponse)) return false;
        ChangeMSISDNsResponse other = (ChangeMSISDNsResponse) obj;
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
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.transNo==null && other.getTransNo()==null) || 
             (this.transNo!=null &&
              java.util.Arrays.equals(this.transNo, other.getTransNo()))) &&
            ((this.MSISDNIMSIType==null && other.getMSISDNIMSIType()==null) || 
             (this.MSISDNIMSIType!=null &&
              java.util.Arrays.equals(this.MSISDNIMSIType, other.getMSISDNIMSIType()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              java.util.Arrays.equals(this.oldIMSI, other.getOldIMSI()))) &&
            ((this.subscriberState==null && other.getSubscriberState()==null) || 
             (this.subscriberState!=null &&
              this.subscriberState.equals(other.getSubscriberState()))) &&
            ((this.oldCCNDCMsisdn==null && other.getOldCCNDCMsisdn()==null) || 
             (this.oldCCNDCMsisdn!=null &&
              java.util.Arrays.equals(this.oldCCNDCMsisdn, other.getOldCCNDCMsisdn()))) &&
            ((this.newCCNDCMsisdn==null && other.getNewCCNDCMsisdn()==null) || 
             (this.newCCNDCMsisdn!=null &&
              java.util.Arrays.equals(this.newCCNDCMsisdn, other.getNewCCNDCMsisdn())));
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getTransNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransNo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMSISDNIMSIType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSISDNIMSIType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSISDNIMSIType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOldIMSI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOldIMSI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOldIMSI(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberState() != null) {
            _hashCode += getSubscriberState().hashCode();
        }
        if (getOldCCNDCMsisdn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOldCCNDCMsisdn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOldCCNDCMsisdn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewCCNDCMsisdn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewCCNDCMsisdn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewCCNDCMsisdn(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeMSISDNsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ChangeMSISDNsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "transNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDNIMSIType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNIMSIType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "subscriberState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCCNDCMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldCCNDCMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDN"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCCNDCMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newCCNDCMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "MSISDN"));
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
