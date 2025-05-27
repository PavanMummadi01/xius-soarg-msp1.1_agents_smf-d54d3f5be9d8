/**
 * AccountNoteData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.subscriber;

public class AccountNoteData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.Integer accountId;

    private boolean corporateNote;

    private int criticalNote;

    private java.lang.String noteCompleted;

    private java.util.Calendar noteDate;

    private java.lang.String noteText;

    private java.lang.String noteType;

    private java.lang.String noteTypeDescription;

    private java.lang.String reviewBy;

    private java.util.Calendar reviewDate;

    private int seqNumber;

    private java.lang.String userName;

    private org.apache.axis.message.MessageElement [] _any;

    public AccountNoteData() {
    }

    public AccountNoteData(
           java.lang.Integer accountId,
           boolean corporateNote,
           int criticalNote,
           java.lang.String noteCompleted,
           java.util.Calendar noteDate,
           java.lang.String noteText,
           java.lang.String noteType,
           java.lang.String noteTypeDescription,
           java.lang.String reviewBy,
           java.util.Calendar reviewDate,
           int seqNumber,
           java.lang.String userName,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountId = accountId;
           this.corporateNote = corporateNote;
           this.criticalNote = criticalNote;
           this.noteCompleted = noteCompleted;
           this.noteDate = noteDate;
           this.noteText = noteText;
           this.noteType = noteType;
           this.noteTypeDescription = noteTypeDescription;
           this.reviewBy = reviewBy;
           this.reviewDate = reviewDate;
           this.seqNumber = seqNumber;
           this.userName = userName;
           this._any = _any;
    }


    /**
     * Gets the accountId value for this AccountNoteData.
     * 
     * @return accountId
     */
    public java.lang.Integer getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AccountNoteData.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Integer accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the corporateNote value for this AccountNoteData.
     * 
     * @return corporateNote
     */
    public boolean isCorporateNote() {
        return corporateNote;
    }


    /**
     * Sets the corporateNote value for this AccountNoteData.
     * 
     * @param corporateNote
     */
    public void setCorporateNote(boolean corporateNote) {
        this.corporateNote = corporateNote;
    }


    /**
     * Gets the criticalNote value for this AccountNoteData.
     * 
     * @return criticalNote
     */
    public int getCriticalNote() {
        return criticalNote;
    }


    /**
     * Sets the criticalNote value for this AccountNoteData.
     * 
     * @param criticalNote
     */
    public void setCriticalNote(int criticalNote) {
        this.criticalNote = criticalNote;
    }


    /**
     * Gets the noteCompleted value for this AccountNoteData.
     * 
     * @return noteCompleted
     */
    public java.lang.String getNoteCompleted() {
        return noteCompleted;
    }


    /**
     * Sets the noteCompleted value for this AccountNoteData.
     * 
     * @param noteCompleted
     */
    public void setNoteCompleted(java.lang.String noteCompleted) {
        this.noteCompleted = noteCompleted;
    }


    /**
     * Gets the noteDate value for this AccountNoteData.
     * 
     * @return noteDate
     */
    public java.util.Calendar getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this AccountNoteData.
     * 
     * @param noteDate
     */
    public void setNoteDate(java.util.Calendar noteDate) {
        this.noteDate = noteDate;
    }


    /**
     * Gets the noteText value for this AccountNoteData.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this AccountNoteData.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the noteType value for this AccountNoteData.
     * 
     * @return noteType
     */
    public java.lang.String getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this AccountNoteData.
     * 
     * @param noteType
     */
    public void setNoteType(java.lang.String noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the noteTypeDescription value for this AccountNoteData.
     * 
     * @return noteTypeDescription
     */
    public java.lang.String getNoteTypeDescription() {
        return noteTypeDescription;
    }


    /**
     * Sets the noteTypeDescription value for this AccountNoteData.
     * 
     * @param noteTypeDescription
     */
    public void setNoteTypeDescription(java.lang.String noteTypeDescription) {
        this.noteTypeDescription = noteTypeDescription;
    }


    /**
     * Gets the reviewBy value for this AccountNoteData.
     * 
     * @return reviewBy
     */
    public java.lang.String getReviewBy() {
        return reviewBy;
    }


    /**
     * Sets the reviewBy value for this AccountNoteData.
     * 
     * @param reviewBy
     */
    public void setReviewBy(java.lang.String reviewBy) {
        this.reviewBy = reviewBy;
    }


    /**
     * Gets the reviewDate value for this AccountNoteData.
     * 
     * @return reviewDate
     */
    public java.util.Calendar getReviewDate() {
        return reviewDate;
    }


    /**
     * Sets the reviewDate value for this AccountNoteData.
     * 
     * @param reviewDate
     */
    public void setReviewDate(java.util.Calendar reviewDate) {
        this.reviewDate = reviewDate;
    }


    /**
     * Gets the seqNumber value for this AccountNoteData.
     * 
     * @return seqNumber
     */
    public int getSeqNumber() {
        return seqNumber;
    }


    /**
     * Sets the seqNumber value for this AccountNoteData.
     * 
     * @param seqNumber
     */
    public void setSeqNumber(int seqNumber) {
        this.seqNumber = seqNumber;
    }


    /**
     * Gets the userName value for this AccountNoteData.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this AccountNoteData.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the _any value for this AccountNoteData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountNoteData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountNoteData)) return false;
        AccountNoteData other = (AccountNoteData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            this.corporateNote == other.isCorporateNote() &&
            this.criticalNote == other.getCriticalNote() &&
            ((this.noteCompleted==null && other.getNoteCompleted()==null) || 
             (this.noteCompleted!=null &&
              this.noteCompleted.equals(other.getNoteCompleted()))) &&
            ((this.noteDate==null && other.getNoteDate()==null) || 
             (this.noteDate!=null &&
              this.noteDate.equals(other.getNoteDate()))) &&
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              this.noteType.equals(other.getNoteType()))) &&
            ((this.noteTypeDescription==null && other.getNoteTypeDescription()==null) || 
             (this.noteTypeDescription!=null &&
              this.noteTypeDescription.equals(other.getNoteTypeDescription()))) &&
            ((this.reviewBy==null && other.getReviewBy()==null) || 
             (this.reviewBy!=null &&
              this.reviewBy.equals(other.getReviewBy()))) &&
            ((this.reviewDate==null && other.getReviewDate()==null) || 
             (this.reviewDate!=null &&
              this.reviewDate.equals(other.getReviewDate()))) &&
            this.seqNumber == other.getSeqNumber() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        _hashCode += (isCorporateNote() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getCriticalNote();
        if (getNoteCompleted() != null) {
            _hashCode += getNoteCompleted().hashCode();
        }
        if (getNoteDate() != null) {
            _hashCode += getNoteDate().hashCode();
        }
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        if (getNoteType() != null) {
            _hashCode += getNoteType().hashCode();
        }
        if (getNoteTypeDescription() != null) {
            _hashCode += getNoteTypeDescription().hashCode();
        }
        if (getReviewBy() != null) {
            _hashCode += getReviewBy().hashCode();
        }
        if (getReviewDate() != null) {
            _hashCode += getReviewDate().hashCode();
        }
        _hashCode += getSeqNumber();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountNoteData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "AccountNoteData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "CorporateNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criticalNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "criticalNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "noteCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "noteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "noteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "noteTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "reviewBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "reviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "seqNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://subscriber.mvnoapi.messages.si.bcgi.net", "userName"));
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
