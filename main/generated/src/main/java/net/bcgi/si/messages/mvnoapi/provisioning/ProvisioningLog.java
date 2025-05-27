/**
 * ProvisioningLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class ProvisioningLog  implements java.io.Serializable {
    private java.lang.String action;

    private net.bcgi.si.messages.mvnoapi.provisioning.DialableNumberData dialableNumber;

    private java.util.Calendar effectiveDate;

    private java.lang.String newValue;

    private java.lang.String oldValue;

    private net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningJournal[] provisioningJournal;

    private java.lang.String requestType;

    private java.lang.Long seqNumber;

    private java.lang.String serviceId;

    private java.lang.String transactionId;

    public ProvisioningLog() {
    }

    public ProvisioningLog(
           java.lang.String action,
           net.bcgi.si.messages.mvnoapi.provisioning.DialableNumberData dialableNumber,
           java.util.Calendar effectiveDate,
           java.lang.String newValue,
           java.lang.String oldValue,
           net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningJournal[] provisioningJournal,
           java.lang.String requestType,
           java.lang.Long seqNumber,
           java.lang.String serviceId,
           java.lang.String transactionId) {
           this.action = action;
           this.dialableNumber = dialableNumber;
           this.effectiveDate = effectiveDate;
           this.newValue = newValue;
           this.oldValue = oldValue;
           this.provisioningJournal = provisioningJournal;
           this.requestType = requestType;
           this.seqNumber = seqNumber;
           this.serviceId = serviceId;
           this.transactionId = transactionId;
    }


    /**
     * Gets the action value for this ProvisioningLog.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ProvisioningLog.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the dialableNumber value for this ProvisioningLog.
     * 
     * @return dialableNumber
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.DialableNumberData getDialableNumber() {
        return dialableNumber;
    }


    /**
     * Sets the dialableNumber value for this ProvisioningLog.
     * 
     * @param dialableNumber
     */
    public void setDialableNumber(net.bcgi.si.messages.mvnoapi.provisioning.DialableNumberData dialableNumber) {
        this.dialableNumber = dialableNumber;
    }


    /**
     * Gets the effectiveDate value for this ProvisioningLog.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ProvisioningLog.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the newValue value for this ProvisioningLog.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this ProvisioningLog.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the oldValue value for this ProvisioningLog.
     * 
     * @return oldValue
     */
    public java.lang.String getOldValue() {
        return oldValue;
    }


    /**
     * Sets the oldValue value for this ProvisioningLog.
     * 
     * @param oldValue
     */
    public void setOldValue(java.lang.String oldValue) {
        this.oldValue = oldValue;
    }


    /**
     * Gets the provisioningJournal value for this ProvisioningLog.
     * 
     * @return provisioningJournal
     */
    public net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningJournal[] getProvisioningJournal() {
        return provisioningJournal;
    }


    /**
     * Sets the provisioningJournal value for this ProvisioningLog.
     * 
     * @param provisioningJournal
     */
    public void setProvisioningJournal(net.bcgi.si.messages.mvnoapi.provisioning.ProvisioningJournal[] provisioningJournal) {
        this.provisioningJournal = provisioningJournal;
    }


    /**
     * Gets the requestType value for this ProvisioningLog.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this ProvisioningLog.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the seqNumber value for this ProvisioningLog.
     * 
     * @return seqNumber
     */
    public java.lang.Long getSeqNumber() {
        return seqNumber;
    }


    /**
     * Sets the seqNumber value for this ProvisioningLog.
     * 
     * @param seqNumber
     */
    public void setSeqNumber(java.lang.Long seqNumber) {
        this.seqNumber = seqNumber;
    }


    /**
     * Gets the serviceId value for this ProvisioningLog.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ProvisioningLog.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the transactionId value for this ProvisioningLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ProvisioningLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvisioningLog)) return false;
        ProvisioningLog other = (ProvisioningLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.dialableNumber==null && other.getDialableNumber()==null) || 
             (this.dialableNumber!=null &&
              this.dialableNumber.equals(other.getDialableNumber()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            ((this.oldValue==null && other.getOldValue()==null) || 
             (this.oldValue!=null &&
              this.oldValue.equals(other.getOldValue()))) &&
            ((this.provisioningJournal==null && other.getProvisioningJournal()==null) || 
             (this.provisioningJournal!=null &&
              java.util.Arrays.equals(this.provisioningJournal, other.getProvisioningJournal()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.seqNumber==null && other.getSeqNumber()==null) || 
             (this.seqNumber!=null &&
              this.seqNumber.equals(other.getSeqNumber()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getDialableNumber() != null) {
            _hashCode += getDialableNumber().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        if (getOldValue() != null) {
            _hashCode += getOldValue().hashCode();
        }
        if (getProvisioningJournal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProvisioningJournal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProvisioningJournal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getSeqNumber() != null) {
            _hashCode += getSeqNumber().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProvisioningLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dialableNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "dialableNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "DialableNumberData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "newValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "oldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningJournal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "provisioningJournal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningJournal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "ProvisioningJournal"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "seqNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "transactionId"));
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
