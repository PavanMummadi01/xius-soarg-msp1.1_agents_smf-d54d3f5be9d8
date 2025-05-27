/**
 * GetUsersOfficesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiusbcgi.xbus.scare.CorpManagement_xsd;

public class GetUsersOfficesResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] newUserOffices;

    private com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] assignedUserOffices;

    public GetUsersOfficesResponse() {
    }

    public GetUsersOfficesResponse(
           java.lang.String message,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] newUserOffices,
           com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] assignedUserOffices) {
           this.message = message;
           this.newUserOffices = newUserOffices;
           this.assignedUserOffices = assignedUserOffices;
    }


    /**
     * Gets the message value for this GetUsersOfficesResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetUsersOfficesResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the newUserOffices value for this GetUsersOfficesResponse.
     * 
     * @return newUserOffices
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] getNewUserOffices() {
        return newUserOffices;
    }


    /**
     * Sets the newUserOffices value for this GetUsersOfficesResponse.
     * 
     * @param newUserOffices
     */
    public void setNewUserOffices(com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] newUserOffices) {
        this.newUserOffices = newUserOffices;
    }

    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType getNewUserOffices(int i) {
        return this.newUserOffices[i];
    }

    public void setNewUserOffices(int i, com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType _value) {
        this.newUserOffices[i] = _value;
    }


    /**
     * Gets the assignedUserOffices value for this GetUsersOfficesResponse.
     * 
     * @return assignedUserOffices
     */
    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] getAssignedUserOffices() {
        return assignedUserOffices;
    }


    /**
     * Sets the assignedUserOffices value for this GetUsersOfficesResponse.
     * 
     * @param assignedUserOffices
     */
    public void setAssignedUserOffices(com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType[] assignedUserOffices) {
        this.assignedUserOffices = assignedUserOffices;
    }

    public com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType getAssignedUserOffices(int i) {
        return this.assignedUserOffices[i];
    }

    public void setAssignedUserOffices(int i, com.xiusbcgi.xbus.scare.CorpManagement_xsd.UserOfficeType _value) {
        this.assignedUserOffices[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsersOfficesResponse)) return false;
        GetUsersOfficesResponse other = (GetUsersOfficesResponse) obj;
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
            ((this.newUserOffices==null && other.getNewUserOffices()==null) || 
             (this.newUserOffices!=null &&
              java.util.Arrays.equals(this.newUserOffices, other.getNewUserOffices()))) &&
            ((this.assignedUserOffices==null && other.getAssignedUserOffices()==null) || 
             (this.assignedUserOffices!=null &&
              java.util.Arrays.equals(this.assignedUserOffices, other.getAssignedUserOffices())));
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
        if (getNewUserOffices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewUserOffices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewUserOffices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignedUserOffices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedUserOffices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedUserOffices(), i);
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
        new org.apache.axis.description.TypeDesc(GetUsersOfficesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "GetUsersOfficesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUserOffices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "newUserOffices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "UserOfficeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedUserOffices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "assignedUserOffices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/CorpManagement.xsd", "UserOfficeType"));
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
