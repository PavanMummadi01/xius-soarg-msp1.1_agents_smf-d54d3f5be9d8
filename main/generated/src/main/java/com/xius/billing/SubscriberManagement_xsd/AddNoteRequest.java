/**
 * AddNoteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class AddNoteRequest  implements java.io.Serializable {
    private com.xius.billing.SubscriberManagement_xsd.ActionFlagType flag;

    private long accountId;

    private com.xius.billing.SubscriberManagement_xsd.NotesListType addNote;

    public AddNoteRequest() {
    }

    public AddNoteRequest(
           com.xius.billing.SubscriberManagement_xsd.ActionFlagType flag,
           long accountId,
           com.xius.billing.SubscriberManagement_xsd.NotesListType addNote) {
           this.flag = flag;
           this.accountId = accountId;
           this.addNote = addNote;
    }


    /**
     * Gets the flag value for this AddNoteRequest.
     * 
     * @return flag
     */
    public com.xius.billing.SubscriberManagement_xsd.ActionFlagType getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this AddNoteRequest.
     * 
     * @param flag
     */
    public void setFlag(com.xius.billing.SubscriberManagement_xsd.ActionFlagType flag) {
        this.flag = flag;
    }


    /**
     * Gets the accountId value for this AddNoteRequest.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AddNoteRequest.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the addNote value for this AddNoteRequest.
     * 
     * @return addNote
     */
    public com.xius.billing.SubscriberManagement_xsd.NotesListType getAddNote() {
        return addNote;
    }


    /**
     * Sets the addNote value for this AddNoteRequest.
     * 
     * @param addNote
     */
    public void setAddNote(com.xius.billing.SubscriberManagement_xsd.NotesListType addNote) {
        this.addNote = addNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddNoteRequest)) return false;
        AddNoteRequest other = (AddNoteRequest) obj;
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
            this.accountId == other.getAccountId() &&
            ((this.addNote==null && other.getAddNote()==null) || 
             (this.addNote!=null &&
              this.addNote.equals(other.getAddNote())));
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
        _hashCode += new Long(getAccountId()).hashCode();
        if (getAddNote() != null) {
            _hashCode += getAddNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddNoteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddNoteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ActionFlagType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesListType"));
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
