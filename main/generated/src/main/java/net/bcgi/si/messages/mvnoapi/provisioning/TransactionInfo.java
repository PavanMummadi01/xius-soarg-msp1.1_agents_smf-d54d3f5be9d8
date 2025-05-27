/**
 * TransactionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class TransactionInfo  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String completedDate;

    private java.lang.Integer noOfRecords;

    private java.lang.String submittedDate;

    private java.lang.String transactionId;

    private java.lang.String transactionStatus;

    private java.lang.String userId;

    private org.apache.axis.message.MessageElement [] _any;

    public TransactionInfo() {
    }

    public TransactionInfo(
           java.lang.String completedDate,
           java.lang.Integer noOfRecords,
           java.lang.String submittedDate,
           java.lang.String transactionId,
           java.lang.String transactionStatus,
           java.lang.String userId,
           org.apache.axis.message.MessageElement [] _any) {
           this.completedDate = completedDate;
           this.noOfRecords = noOfRecords;
           this.submittedDate = submittedDate;
           this.transactionId = transactionId;
           this.transactionStatus = transactionStatus;
           this.userId = userId;
           this._any = _any;
    }


    /**
     * Gets the completedDate value for this TransactionInfo.
     * 
     * @return completedDate
     */
    public java.lang.String getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this TransactionInfo.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.lang.String completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the noOfRecords value for this TransactionInfo.
     * 
     * @return noOfRecords
     */
    public java.lang.Integer getNoOfRecords() {
        return noOfRecords;
    }


    /**
     * Sets the noOfRecords value for this TransactionInfo.
     * 
     * @param noOfRecords
     */
    public void setNoOfRecords(java.lang.Integer noOfRecords) {
        this.noOfRecords = noOfRecords;
    }


    /**
     * Gets the submittedDate value for this TransactionInfo.
     * 
     * @return submittedDate
     */
    public java.lang.String getSubmittedDate() {
        return submittedDate;
    }


    /**
     * Sets the submittedDate value for this TransactionInfo.
     * 
     * @param submittedDate
     */
    public void setSubmittedDate(java.lang.String submittedDate) {
        this.submittedDate = submittedDate;
    }


    /**
     * Gets the transactionId value for this TransactionInfo.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TransactionInfo.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionStatus value for this TransactionInfo.
     * 
     * @return transactionStatus
     */
    public java.lang.String getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this TransactionInfo.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(java.lang.String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the userId value for this TransactionInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this TransactionInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the _any value for this TransactionInfo.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this TransactionInfo.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionInfo)) return false;
        TransactionInfo other = (TransactionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.noOfRecords==null && other.getNoOfRecords()==null) || 
             (this.noOfRecords!=null &&
              this.noOfRecords.equals(other.getNoOfRecords()))) &&
            ((this.submittedDate==null && other.getSubmittedDate()==null) || 
             (this.submittedDate!=null &&
              this.submittedDate.equals(other.getSubmittedDate()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
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
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getNoOfRecords() != null) {
            _hashCode += getNoOfRecords().hashCode();
        }
        if (getSubmittedDate() != null) {
            _hashCode += getSubmittedDate().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
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
        new org.apache.axis.description.TypeDesc(TransactionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "TransactionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "noOfRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "submittedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
