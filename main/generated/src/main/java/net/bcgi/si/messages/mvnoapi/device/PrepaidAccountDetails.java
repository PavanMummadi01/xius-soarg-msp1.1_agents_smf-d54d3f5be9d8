/**
 * PrepaidAccountDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class PrepaidAccountDetails  implements java.io.Serializable {
    private java.util.Calendar cancelDate;

    private java.util.Calendar expDate;

    private java.lang.Integer gracePeriod;

    private java.lang.String internationalAllowed;

    private java.lang.String language;

    private java.lang.String messageLevel;

    private java.lang.Integer passCode;

    private java.lang.String roamingAllowed;

    public PrepaidAccountDetails() {
    }

    public PrepaidAccountDetails(
           java.util.Calendar cancelDate,
           java.util.Calendar expDate,
           java.lang.Integer gracePeriod,
           java.lang.String internationalAllowed,
           java.lang.String language,
           java.lang.String messageLevel,
           java.lang.Integer passCode,
           java.lang.String roamingAllowed) {
           this.cancelDate = cancelDate;
           this.expDate = expDate;
           this.gracePeriod = gracePeriod;
           this.internationalAllowed = internationalAllowed;
           this.language = language;
           this.messageLevel = messageLevel;
           this.passCode = passCode;
           this.roamingAllowed = roamingAllowed;
    }


    /**
     * Gets the cancelDate value for this PrepaidAccountDetails.
     * 
     * @return cancelDate
     */
    public java.util.Calendar getCancelDate() {
        return cancelDate;
    }


    /**
     * Sets the cancelDate value for this PrepaidAccountDetails.
     * 
     * @param cancelDate
     */
    public void setCancelDate(java.util.Calendar cancelDate) {
        this.cancelDate = cancelDate;
    }


    /**
     * Gets the expDate value for this PrepaidAccountDetails.
     * 
     * @return expDate
     */
    public java.util.Calendar getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this PrepaidAccountDetails.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Calendar expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the gracePeriod value for this PrepaidAccountDetails.
     * 
     * @return gracePeriod
     */
    public java.lang.Integer getGracePeriod() {
        return gracePeriod;
    }


    /**
     * Sets the gracePeriod value for this PrepaidAccountDetails.
     * 
     * @param gracePeriod
     */
    public void setGracePeriod(java.lang.Integer gracePeriod) {
        this.gracePeriod = gracePeriod;
    }


    /**
     * Gets the internationalAllowed value for this PrepaidAccountDetails.
     * 
     * @return internationalAllowed
     */
    public java.lang.String getInternationalAllowed() {
        return internationalAllowed;
    }


    /**
     * Sets the internationalAllowed value for this PrepaidAccountDetails.
     * 
     * @param internationalAllowed
     */
    public void setInternationalAllowed(java.lang.String internationalAllowed) {
        this.internationalAllowed = internationalAllowed;
    }


    /**
     * Gets the language value for this PrepaidAccountDetails.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this PrepaidAccountDetails.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the messageLevel value for this PrepaidAccountDetails.
     * 
     * @return messageLevel
     */
    public java.lang.String getMessageLevel() {
        return messageLevel;
    }


    /**
     * Sets the messageLevel value for this PrepaidAccountDetails.
     * 
     * @param messageLevel
     */
    public void setMessageLevel(java.lang.String messageLevel) {
        this.messageLevel = messageLevel;
    }


    /**
     * Gets the passCode value for this PrepaidAccountDetails.
     * 
     * @return passCode
     */
    public java.lang.Integer getPassCode() {
        return passCode;
    }


    /**
     * Sets the passCode value for this PrepaidAccountDetails.
     * 
     * @param passCode
     */
    public void setPassCode(java.lang.Integer passCode) {
        this.passCode = passCode;
    }


    /**
     * Gets the roamingAllowed value for this PrepaidAccountDetails.
     * 
     * @return roamingAllowed
     */
    public java.lang.String getRoamingAllowed() {
        return roamingAllowed;
    }


    /**
     * Sets the roamingAllowed value for this PrepaidAccountDetails.
     * 
     * @param roamingAllowed
     */
    public void setRoamingAllowed(java.lang.String roamingAllowed) {
        this.roamingAllowed = roamingAllowed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepaidAccountDetails)) return false;
        PrepaidAccountDetails other = (PrepaidAccountDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelDate==null && other.getCancelDate()==null) || 
             (this.cancelDate!=null &&
              this.cancelDate.equals(other.getCancelDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.gracePeriod==null && other.getGracePeriod()==null) || 
             (this.gracePeriod!=null &&
              this.gracePeriod.equals(other.getGracePeriod()))) &&
            ((this.internationalAllowed==null && other.getInternationalAllowed()==null) || 
             (this.internationalAllowed!=null &&
              this.internationalAllowed.equals(other.getInternationalAllowed()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.messageLevel==null && other.getMessageLevel()==null) || 
             (this.messageLevel!=null &&
              this.messageLevel.equals(other.getMessageLevel()))) &&
            ((this.passCode==null && other.getPassCode()==null) || 
             (this.passCode!=null &&
              this.passCode.equals(other.getPassCode()))) &&
            ((this.roamingAllowed==null && other.getRoamingAllowed()==null) || 
             (this.roamingAllowed!=null &&
              this.roamingAllowed.equals(other.getRoamingAllowed())));
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
        if (getCancelDate() != null) {
            _hashCode += getCancelDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getGracePeriod() != null) {
            _hashCode += getGracePeriod().hashCode();
        }
        if (getInternationalAllowed() != null) {
            _hashCode += getInternationalAllowed().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getMessageLevel() != null) {
            _hashCode += getMessageLevel().hashCode();
        }
        if (getPassCode() != null) {
            _hashCode += getPassCode().hashCode();
        }
        if (getRoamingAllowed() != null) {
            _hashCode += getRoamingAllowed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepaidAccountDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "PrepaidAccountDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "cancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "expDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "gracePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "internationalAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "messageLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "passCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "roamingAllowed"));
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
