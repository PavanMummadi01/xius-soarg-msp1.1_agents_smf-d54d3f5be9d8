/**
 * UpdateBillingTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class UpdateBillingTypeResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.billing.AccountManagement_xsd.AccountType[] successList;

    private com.xius.billing.AccountManagement_xsd.AccountType[] failedList;

    private java.lang.String[] successCurentStatusList;

    private java.lang.String[] successnewStatusList;

    private java.lang.String[] failedStatusList;

    public UpdateBillingTypeResponse() {
    }

    public UpdateBillingTypeResponse(
           java.lang.String message,
           com.xius.billing.AccountManagement_xsd.AccountType[] successList,
           com.xius.billing.AccountManagement_xsd.AccountType[] failedList,
           java.lang.String[] successCurentStatusList,
           java.lang.String[] successnewStatusList,
           java.lang.String[] failedStatusList) {
           this.message = message;
           this.successList = successList;
           this.failedList = failedList;
           this.successCurentStatusList = successCurentStatusList;
           this.successnewStatusList = successnewStatusList;
           this.failedStatusList = failedStatusList;
    }


    /**
     * Gets the message value for this UpdateBillingTypeResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this UpdateBillingTypeResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the successList value for this UpdateBillingTypeResponse.
     * 
     * @return successList
     */
    public com.xius.billing.AccountManagement_xsd.AccountType[] getSuccessList() {
        return successList;
    }


    /**
     * Sets the successList value for this UpdateBillingTypeResponse.
     * 
     * @param successList
     */
    public void setSuccessList(com.xius.billing.AccountManagement_xsd.AccountType[] successList) {
        this.successList = successList;
    }

    public com.xius.billing.AccountManagement_xsd.AccountType getSuccessList(int i) {
        return this.successList[i];
    }

    public void setSuccessList(int i, com.xius.billing.AccountManagement_xsd.AccountType _value) {
        this.successList[i] = _value;
    }


    /**
     * Gets the failedList value for this UpdateBillingTypeResponse.
     * 
     * @return failedList
     */
    public com.xius.billing.AccountManagement_xsd.AccountType[] getFailedList() {
        return failedList;
    }


    /**
     * Sets the failedList value for this UpdateBillingTypeResponse.
     * 
     * @param failedList
     */
    public void setFailedList(com.xius.billing.AccountManagement_xsd.AccountType[] failedList) {
        this.failedList = failedList;
    }

    public com.xius.billing.AccountManagement_xsd.AccountType getFailedList(int i) {
        return this.failedList[i];
    }

    public void setFailedList(int i, com.xius.billing.AccountManagement_xsd.AccountType _value) {
        this.failedList[i] = _value;
    }


    /**
     * Gets the successCurentStatusList value for this UpdateBillingTypeResponse.
     * 
     * @return successCurentStatusList
     */
    public java.lang.String[] getSuccessCurentStatusList() {
        return successCurentStatusList;
    }


    /**
     * Sets the successCurentStatusList value for this UpdateBillingTypeResponse.
     * 
     * @param successCurentStatusList
     */
    public void setSuccessCurentStatusList(java.lang.String[] successCurentStatusList) {
        this.successCurentStatusList = successCurentStatusList;
    }

    public java.lang.String getSuccessCurentStatusList(int i) {
        return this.successCurentStatusList[i];
    }

    public void setSuccessCurentStatusList(int i, java.lang.String _value) {
        this.successCurentStatusList[i] = _value;
    }


    /**
     * Gets the successnewStatusList value for this UpdateBillingTypeResponse.
     * 
     * @return successnewStatusList
     */
    public java.lang.String[] getSuccessnewStatusList() {
        return successnewStatusList;
    }


    /**
     * Sets the successnewStatusList value for this UpdateBillingTypeResponse.
     * 
     * @param successnewStatusList
     */
    public void setSuccessnewStatusList(java.lang.String[] successnewStatusList) {
        this.successnewStatusList = successnewStatusList;
    }

    public java.lang.String getSuccessnewStatusList(int i) {
        return this.successnewStatusList[i];
    }

    public void setSuccessnewStatusList(int i, java.lang.String _value) {
        this.successnewStatusList[i] = _value;
    }


    /**
     * Gets the failedStatusList value for this UpdateBillingTypeResponse.
     * 
     * @return failedStatusList
     */
    public java.lang.String[] getFailedStatusList() {
        return failedStatusList;
    }


    /**
     * Sets the failedStatusList value for this UpdateBillingTypeResponse.
     * 
     * @param failedStatusList
     */
    public void setFailedStatusList(java.lang.String[] failedStatusList) {
        this.failedStatusList = failedStatusList;
    }

    public java.lang.String getFailedStatusList(int i) {
        return this.failedStatusList[i];
    }

    public void setFailedStatusList(int i, java.lang.String _value) {
        this.failedStatusList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBillingTypeResponse)) return false;
        UpdateBillingTypeResponse other = (UpdateBillingTypeResponse) obj;
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
            ((this.successList==null && other.getSuccessList()==null) || 
             (this.successList!=null &&
              java.util.Arrays.equals(this.successList, other.getSuccessList()))) &&
            ((this.failedList==null && other.getFailedList()==null) || 
             (this.failedList!=null &&
              java.util.Arrays.equals(this.failedList, other.getFailedList()))) &&
            ((this.successCurentStatusList==null && other.getSuccessCurentStatusList()==null) || 
             (this.successCurentStatusList!=null &&
              java.util.Arrays.equals(this.successCurentStatusList, other.getSuccessCurentStatusList()))) &&
            ((this.successnewStatusList==null && other.getSuccessnewStatusList()==null) || 
             (this.successnewStatusList!=null &&
              java.util.Arrays.equals(this.successnewStatusList, other.getSuccessnewStatusList()))) &&
            ((this.failedStatusList==null && other.getFailedStatusList()==null) || 
             (this.failedStatusList!=null &&
              java.util.Arrays.equals(this.failedStatusList, other.getFailedStatusList())));
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
        if (getSuccessList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessCurentStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessCurentStatusList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessCurentStatusList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccessnewStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessnewStatusList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessnewStatusList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedStatusList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedStatusList(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateBillingTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "UpdateBillingTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "successList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "failedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successCurentStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "successCurentStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successnewStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "successnewStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "failedStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
