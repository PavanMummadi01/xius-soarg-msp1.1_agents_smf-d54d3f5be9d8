/**
 * DeviceLockData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class DeviceLockData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.Integer contentRestriction;

    private java.lang.String dialableNumber;

    private java.lang.String ownerStatus;

    private java.lang.Integer pin;

    private java.lang.Integer pin2;

    private java.lang.String puk1;

    private java.lang.String puk2;

    private java.lang.String unlockCode;

    private org.apache.axis.message.MessageElement [] _any;

    public DeviceLockData() {
    }

    public DeviceLockData(
           java.lang.Integer contentRestriction,
           java.lang.String dialableNumber,
           java.lang.String ownerStatus,
           java.lang.Integer pin,
           java.lang.Integer pin2,
           java.lang.String puk1,
           java.lang.String puk2,
           java.lang.String unlockCode,
           org.apache.axis.message.MessageElement [] _any) {
           this.contentRestriction = contentRestriction;
           this.dialableNumber = dialableNumber;
           this.ownerStatus = ownerStatus;
           this.pin = pin;
           this.pin2 = pin2;
           this.puk1 = puk1;
           this.puk2 = puk2;
           this.unlockCode = unlockCode;
           this._any = _any;
    }


    /**
     * Gets the contentRestriction value for this DeviceLockData.
     * 
     * @return contentRestriction
     */
    public java.lang.Integer getContentRestriction() {
        return contentRestriction;
    }


    /**
     * Sets the contentRestriction value for this DeviceLockData.
     * 
     * @param contentRestriction
     */
    public void setContentRestriction(java.lang.Integer contentRestriction) {
        this.contentRestriction = contentRestriction;
    }


    /**
     * Gets the dialableNumber value for this DeviceLockData.
     * 
     * @return dialableNumber
     */
    public java.lang.String getDialableNumber() {
        return dialableNumber;
    }


    /**
     * Sets the dialableNumber value for this DeviceLockData.
     * 
     * @param dialableNumber
     */
    public void setDialableNumber(java.lang.String dialableNumber) {
        this.dialableNumber = dialableNumber;
    }


    /**
     * Gets the ownerStatus value for this DeviceLockData.
     * 
     * @return ownerStatus
     */
    public java.lang.String getOwnerStatus() {
        return ownerStatus;
    }


    /**
     * Sets the ownerStatus value for this DeviceLockData.
     * 
     * @param ownerStatus
     */
    public void setOwnerStatus(java.lang.String ownerStatus) {
        this.ownerStatus = ownerStatus;
    }


    /**
     * Gets the pin value for this DeviceLockData.
     * 
     * @return pin
     */
    public java.lang.Integer getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this DeviceLockData.
     * 
     * @param pin
     */
    public void setPin(java.lang.Integer pin) {
        this.pin = pin;
    }


    /**
     * Gets the pin2 value for this DeviceLockData.
     * 
     * @return pin2
     */
    public java.lang.Integer getPin2() {
        return pin2;
    }


    /**
     * Sets the pin2 value for this DeviceLockData.
     * 
     * @param pin2
     */
    public void setPin2(java.lang.Integer pin2) {
        this.pin2 = pin2;
    }


    /**
     * Gets the puk1 value for this DeviceLockData.
     * 
     * @return puk1
     */
    public java.lang.String getPuk1() {
        return puk1;
    }


    /**
     * Sets the puk1 value for this DeviceLockData.
     * 
     * @param puk1
     */
    public void setPuk1(java.lang.String puk1) {
        this.puk1 = puk1;
    }


    /**
     * Gets the puk2 value for this DeviceLockData.
     * 
     * @return puk2
     */
    public java.lang.String getPuk2() {
        return puk2;
    }


    /**
     * Sets the puk2 value for this DeviceLockData.
     * 
     * @param puk2
     */
    public void setPuk2(java.lang.String puk2) {
        this.puk2 = puk2;
    }


    /**
     * Gets the unlockCode value for this DeviceLockData.
     * 
     * @return unlockCode
     */
    public java.lang.String getUnlockCode() {
        return unlockCode;
    }


    /**
     * Sets the unlockCode value for this DeviceLockData.
     * 
     * @param unlockCode
     */
    public void setUnlockCode(java.lang.String unlockCode) {
        this.unlockCode = unlockCode;
    }


    /**
     * Gets the _any value for this DeviceLockData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this DeviceLockData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceLockData)) return false;
        DeviceLockData other = (DeviceLockData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentRestriction==null && other.getContentRestriction()==null) || 
             (this.contentRestriction!=null &&
              this.contentRestriction.equals(other.getContentRestriction()))) &&
            ((this.dialableNumber==null && other.getDialableNumber()==null) || 
             (this.dialableNumber!=null &&
              this.dialableNumber.equals(other.getDialableNumber()))) &&
            ((this.ownerStatus==null && other.getOwnerStatus()==null) || 
             (this.ownerStatus!=null &&
              this.ownerStatus.equals(other.getOwnerStatus()))) &&
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.pin2==null && other.getPin2()==null) || 
             (this.pin2!=null &&
              this.pin2.equals(other.getPin2()))) &&
            ((this.puk1==null && other.getPuk1()==null) || 
             (this.puk1!=null &&
              this.puk1.equals(other.getPuk1()))) &&
            ((this.puk2==null && other.getPuk2()==null) || 
             (this.puk2!=null &&
              this.puk2.equals(other.getPuk2()))) &&
            ((this.unlockCode==null && other.getUnlockCode()==null) || 
             (this.unlockCode!=null &&
              this.unlockCode.equals(other.getUnlockCode()))) &&
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
        if (getContentRestriction() != null) {
            _hashCode += getContentRestriction().hashCode();
        }
        if (getDialableNumber() != null) {
            _hashCode += getDialableNumber().hashCode();
        }
        if (getOwnerStatus() != null) {
            _hashCode += getOwnerStatus().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getPin2() != null) {
            _hashCode += getPin2().hashCode();
        }
        if (getPuk1() != null) {
            _hashCode += getPuk1().hashCode();
        }
        if (getPuk2() != null) {
            _hashCode += getPuk2().hashCode();
        }
        if (getUnlockCode() != null) {
            _hashCode += getUnlockCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(DeviceLockData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceLockData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "contentRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dialableNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "dialableNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ownerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "pin2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puk1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "puk1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puk2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "puk2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlockCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "unlockCode"));
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
