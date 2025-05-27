/**
 * ManageNoteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class ManageNoteRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.ActionFlagType flag;

    private com.xius.billing.SubscriberManagement_xsd.AccountType account;

    private com.xius.billing.SubscriberManagement_xsd.NotesType note;

    public ManageNoteRequest() {
    }

    public ManageNoteRequest(
           com.xius.billing.SubscriberManagement_xsd.ActionFlagType flag,
           com.xius.billing.SubscriberManagement_xsd.AccountType account,
           com.xius.billing.SubscriberManagement_xsd.NotesType note) {
           this.flag = flag;
           this.account = account;
           this.note = note;
    }


    /**
     * Gets the flag value for this ManageNoteRequest.
     * 
     * @return flag
     */
    public com.xius.billing.SubscriberManagement_xsd.ActionFlagType getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this ManageNoteRequest.
     * 
     * @param flag
     */
    public void setFlag(com.xius.billing.SubscriberManagement_xsd.ActionFlagType flag) {
        this.flag = flag;
    }


    /**
     * Gets the account value for this ManageNoteRequest.
     * 
     * @return account
     */
    public com.xius.billing.SubscriberManagement_xsd.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ManageNoteRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.billing.SubscriberManagement_xsd.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the note value for this ManageNoteRequest.
     * 
     * @return note
     */
    public com.xius.billing.SubscriberManagement_xsd.NotesType getNote() {
        return note;
    }


    /**
     * Sets the note value for this ManageNoteRequest.
     * 
     * @param note
     */
    public void setNote(com.xius.billing.SubscriberManagement_xsd.NotesType note) {
        this.note = note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageNoteRequest)) return false;
        ManageNoteRequest other = (ManageNoteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote())));
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
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageNoteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageNoteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesType"));
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
