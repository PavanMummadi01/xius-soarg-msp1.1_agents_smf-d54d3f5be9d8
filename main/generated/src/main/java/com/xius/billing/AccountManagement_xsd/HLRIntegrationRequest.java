/**
 * HLRIntegrationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class HLRIntegrationRequest  implements java.io.Serializable {
    private com.xius.billing.AccountManagement_xsd.EventIdType eventId;

    private java.lang.Long oldAccountId;

    private java.lang.Long newAccountId;

    private java.lang.String newMSISDNNo;

    private java.lang.String oldMSISDNNo;

    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.String oldSIM;

    private java.lang.String newSIM;

    public HLRIntegrationRequest() {
    }

    public HLRIntegrationRequest(
           com.xius.billing.AccountManagement_xsd.EventIdType eventId,
           java.lang.Long oldAccountId,
           java.lang.Long newAccountId,
           java.lang.String newMSISDNNo,
           java.lang.String oldMSISDNNo,
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.String oldSIM,
           java.lang.String newSIM) {
           this.eventId = eventId;
           this.oldAccountId = oldAccountId;
           this.newAccountId = newAccountId;
           this.newMSISDNNo = newMSISDNNo;
           this.oldMSISDNNo = oldMSISDNNo;
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.oldSIM = oldSIM;
           this.newSIM = newSIM;
    }


    /**
     * Gets the eventId value for this HLRIntegrationRequest.
     * 
     * @return eventId
     */
    public com.xius.billing.AccountManagement_xsd.EventIdType getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this HLRIntegrationRequest.
     * 
     * @param eventId
     */
    public void setEventId(com.xius.billing.AccountManagement_xsd.EventIdType eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the oldAccountId value for this HLRIntegrationRequest.
     * 
     * @return oldAccountId
     */
    public java.lang.Long getOldAccountId() {
        return oldAccountId;
    }


    /**
     * Sets the oldAccountId value for this HLRIntegrationRequest.
     * 
     * @param oldAccountId
     */
    public void setOldAccountId(java.lang.Long oldAccountId) {
        this.oldAccountId = oldAccountId;
    }


    /**
     * Gets the newAccountId value for this HLRIntegrationRequest.
     * 
     * @return newAccountId
     */
    public java.lang.Long getNewAccountId() {
        return newAccountId;
    }


    /**
     * Sets the newAccountId value for this HLRIntegrationRequest.
     * 
     * @param newAccountId
     */
    public void setNewAccountId(java.lang.Long newAccountId) {
        this.newAccountId = newAccountId;
    }


    /**
     * Gets the newMSISDNNo value for this HLRIntegrationRequest.
     * 
     * @return newMSISDNNo
     */
    public java.lang.String getNewMSISDNNo() {
        return newMSISDNNo;
    }


    /**
     * Sets the newMSISDNNo value for this HLRIntegrationRequest.
     * 
     * @param newMSISDNNo
     */
    public void setNewMSISDNNo(java.lang.String newMSISDNNo) {
        this.newMSISDNNo = newMSISDNNo;
    }


    /**
     * Gets the oldMSISDNNo value for this HLRIntegrationRequest.
     * 
     * @return oldMSISDNNo
     */
    public java.lang.String getOldMSISDNNo() {
        return oldMSISDNNo;
    }


    /**
     * Sets the oldMSISDNNo value for this HLRIntegrationRequest.
     * 
     * @param oldMSISDNNo
     */
    public void setOldMSISDNNo(java.lang.String oldMSISDNNo) {
        this.oldMSISDNNo = oldMSISDNNo;
    }


    /**
     * Gets the oldIMSI value for this HLRIntegrationRequest.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this HLRIntegrationRequest.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this HLRIntegrationRequest.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this HLRIntegrationRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the oldSIM value for this HLRIntegrationRequest.
     * 
     * @return oldSIM
     */
    public java.lang.String getOldSIM() {
        return oldSIM;
    }


    /**
     * Sets the oldSIM value for this HLRIntegrationRequest.
     * 
     * @param oldSIM
     */
    public void setOldSIM(java.lang.String oldSIM) {
        this.oldSIM = oldSIM;
    }


    /**
     * Gets the newSIM value for this HLRIntegrationRequest.
     * 
     * @return newSIM
     */
    public java.lang.String getNewSIM() {
        return newSIM;
    }


    /**
     * Sets the newSIM value for this HLRIntegrationRequest.
     * 
     * @param newSIM
     */
    public void setNewSIM(java.lang.String newSIM) {
        this.newSIM = newSIM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HLRIntegrationRequest)) return false;
        HLRIntegrationRequest other = (HLRIntegrationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.oldAccountId==null && other.getOldAccountId()==null) || 
             (this.oldAccountId!=null &&
              this.oldAccountId.equals(other.getOldAccountId()))) &&
            ((this.newAccountId==null && other.getNewAccountId()==null) || 
             (this.newAccountId!=null &&
              this.newAccountId.equals(other.getNewAccountId()))) &&
            ((this.newMSISDNNo==null && other.getNewMSISDNNo()==null) || 
             (this.newMSISDNNo!=null &&
              this.newMSISDNNo.equals(other.getNewMSISDNNo()))) &&
            ((this.oldMSISDNNo==null && other.getOldMSISDNNo()==null) || 
             (this.oldMSISDNNo!=null &&
              this.oldMSISDNNo.equals(other.getOldMSISDNNo()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.oldSIM==null && other.getOldSIM()==null) || 
             (this.oldSIM!=null &&
              this.oldSIM.equals(other.getOldSIM()))) &&
            ((this.newSIM==null && other.getNewSIM()==null) || 
             (this.newSIM!=null &&
              this.newSIM.equals(other.getNewSIM())));
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
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getOldAccountId() != null) {
            _hashCode += getOldAccountId().hashCode();
        }
        if (getNewAccountId() != null) {
            _hashCode += getNewAccountId().hashCode();
        }
        if (getNewMSISDNNo() != null) {
            _hashCode += getNewMSISDNNo().hashCode();
        }
        if (getOldMSISDNNo() != null) {
            _hashCode += getOldMSISDNNo().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getOldSIM() != null) {
            _hashCode += getOldSIM().hashCode();
        }
        if (getNewSIM() != null) {
            _hashCode += getNewSIM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HLRIntegrationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "HLRIntegrationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "eventIdType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OldAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDNNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewMSISDNNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDNNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OldMSISDNNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "OldSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "NewSIM"));
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
