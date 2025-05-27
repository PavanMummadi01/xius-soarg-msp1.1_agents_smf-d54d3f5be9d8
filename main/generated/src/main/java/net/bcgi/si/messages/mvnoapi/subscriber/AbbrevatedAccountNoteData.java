/**
 * AbbrevatedAccountNoteData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AbbrevatedAccountNoteData  implements java.io.Serializable {
    private java.lang.Integer accountNumber;

    private java.lang.String criticalNote;

    private java.lang.String noteText;

    public AbbrevatedAccountNoteData() {
    }

    public AbbrevatedAccountNoteData(
           java.lang.Integer accountNumber,
           java.lang.String criticalNote,
           java.lang.String noteText) {
           this.accountNumber = accountNumber;
           this.criticalNote = criticalNote;
           this.noteText = noteText;
    }


    /**
     * Gets the accountNumber value for this AbbrevatedAccountNoteData.
     * 
     * @return accountNumber
     */
    public java.lang.Integer getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this AbbrevatedAccountNoteData.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.Integer accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the criticalNote value for this AbbrevatedAccountNoteData.
     * 
     * @return criticalNote
     */
    public java.lang.String getCriticalNote() {
        return criticalNote;
    }


    /**
     * Sets the criticalNote value for this AbbrevatedAccountNoteData.
     * 
     * @param criticalNote
     */
    public void setCriticalNote(java.lang.String criticalNote) {
        this.criticalNote = criticalNote;
    }


    /**
     * Gets the noteText value for this AbbrevatedAccountNoteData.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this AbbrevatedAccountNoteData.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbbrevatedAccountNoteData)) return false;
        AbbrevatedAccountNoteData other = (AbbrevatedAccountNoteData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.criticalNote==null && other.getCriticalNote()==null) || 
             (this.criticalNote!=null &&
              this.criticalNote.equals(other.getCriticalNote()))) &&
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCriticalNote() != null) {
            _hashCode += getCriticalNote().hashCode();
        }
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbbrevatedAccountNoteData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AbbrevatedAccountNoteData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criticalNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "criticalNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "noteText"));
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
