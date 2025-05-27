/**
 * NotesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class NotesType  implements java.io.Serializable {
    private java.lang.Long seqNumber;

    private java.lang.String noteType;

    private java.lang.String noteDate;

    private java.lang.String username;

    private java.lang.String noterevieBy;

    private java.lang.String description;

    private java.lang.String reviewDate;

    private java.lang.String noteCompleted;

    private java.lang.String noteText;

    public NotesType() {
    }

    public NotesType(
           java.lang.Long seqNumber,
           java.lang.String noteType,
           java.lang.String noteDate,
           java.lang.String username,
           java.lang.String noterevieBy,
           java.lang.String description,
           java.lang.String reviewDate,
           java.lang.String noteCompleted,
           java.lang.String noteText) {
           this.seqNumber = seqNumber;
           this.noteType = noteType;
           this.noteDate = noteDate;
           this.username = username;
           this.noterevieBy = noterevieBy;
           this.description = description;
           this.reviewDate = reviewDate;
           this.noteCompleted = noteCompleted;
           this.noteText = noteText;
    }


    /**
     * Gets the seqNumber value for this NotesType.
     * 
     * @return seqNumber
     */
    public java.lang.Long getSeqNumber() {
        return seqNumber;
    }


    /**
     * Sets the seqNumber value for this NotesType.
     * 
     * @param seqNumber
     */
    public void setSeqNumber(java.lang.Long seqNumber) {
        this.seqNumber = seqNumber;
    }


    /**
     * Gets the noteType value for this NotesType.
     * 
     * @return noteType
     */
    public java.lang.String getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this NotesType.
     * 
     * @param noteType
     */
    public void setNoteType(java.lang.String noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the noteDate value for this NotesType.
     * 
     * @return noteDate
     */
    public java.lang.String getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this NotesType.
     * 
     * @param noteDate
     */
    public void setNoteDate(java.lang.String noteDate) {
        this.noteDate = noteDate;
    }


    /**
     * Gets the username value for this NotesType.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this NotesType.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the noterevieBy value for this NotesType.
     * 
     * @return noterevieBy
     */
    public java.lang.String getNoterevieBy() {
        return noterevieBy;
    }


    /**
     * Sets the noterevieBy value for this NotesType.
     * 
     * @param noterevieBy
     */
    public void setNoterevieBy(java.lang.String noterevieBy) {
        this.noterevieBy = noterevieBy;
    }


    /**
     * Gets the description value for this NotesType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this NotesType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the reviewDate value for this NotesType.
     * 
     * @return reviewDate
     */
    public java.lang.String getReviewDate() {
        return reviewDate;
    }


    /**
     * Sets the reviewDate value for this NotesType.
     * 
     * @param reviewDate
     */
    public void setReviewDate(java.lang.String reviewDate) {
        this.reviewDate = reviewDate;
    }


    /**
     * Gets the noteCompleted value for this NotesType.
     * 
     * @return noteCompleted
     */
    public java.lang.String getNoteCompleted() {
        return noteCompleted;
    }


    /**
     * Sets the noteCompleted value for this NotesType.
     * 
     * @param noteCompleted
     */
    public void setNoteCompleted(java.lang.String noteCompleted) {
        this.noteCompleted = noteCompleted;
    }


    /**
     * Gets the noteText value for this NotesType.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this NotesType.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotesType)) return false;
        NotesType other = (NotesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqNumber==null && other.getSeqNumber()==null) || 
             (this.seqNumber!=null &&
              this.seqNumber.equals(other.getSeqNumber()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              this.noteType.equals(other.getNoteType()))) &&
            ((this.noteDate==null && other.getNoteDate()==null) || 
             (this.noteDate!=null &&
              this.noteDate.equals(other.getNoteDate()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.noterevieBy==null && other.getNoterevieBy()==null) || 
             (this.noterevieBy!=null &&
              this.noterevieBy.equals(other.getNoterevieBy()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.reviewDate==null && other.getReviewDate()==null) || 
             (this.reviewDate!=null &&
              this.reviewDate.equals(other.getReviewDate()))) &&
            ((this.noteCompleted==null && other.getNoteCompleted()==null) || 
             (this.noteCompleted!=null &&
              this.noteCompleted.equals(other.getNoteCompleted()))) &&
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
        if (getSeqNumber() != null) {
            _hashCode += getSeqNumber().hashCode();
        }
        if (getNoteType() != null) {
            _hashCode += getNoteType().hashCode();
        }
        if (getNoteDate() != null) {
            _hashCode += getNoteDate().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getNoterevieBy() != null) {
            _hashCode += getNoterevieBy().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getReviewDate() != null) {
            _hashCode += getReviewDate().hashCode();
        }
        if (getNoteCompleted() != null) {
            _hashCode += getNoteCompleted().hashCode();
        }
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "seqNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "noteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noterevieBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "noterevieBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "reviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "noteCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "noteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
