/**
 * IdentityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class IdentityData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String BRN;

    private java.lang.String armedForcesId;

    private java.lang.String companyName;

    private java.lang.String customerName;

    private java.lang.String newNRIC;

    private java.lang.String oldNRIC;

    private java.lang.String passportNumber;

    private org.apache.axis.message.MessageElement [] _any;

    public IdentityData() {
    }

    public IdentityData(
           java.lang.String BRN,
           java.lang.String armedForcesId,
           java.lang.String companyName,
           java.lang.String customerName,
           java.lang.String newNRIC,
           java.lang.String oldNRIC,
           java.lang.String passportNumber,
           org.apache.axis.message.MessageElement [] _any) {
           this.BRN = BRN;
           this.armedForcesId = armedForcesId;
           this.companyName = companyName;
           this.customerName = customerName;
           this.newNRIC = newNRIC;
           this.oldNRIC = oldNRIC;
           this.passportNumber = passportNumber;
           this._any = _any;
    }


    /**
     * Gets the BRN value for this IdentityData.
     * 
     * @return BRN
     */
    public java.lang.String getBRN() {
        return BRN;
    }


    /**
     * Sets the BRN value for this IdentityData.
     * 
     * @param BRN
     */
    public void setBRN(java.lang.String BRN) {
        this.BRN = BRN;
    }


    /**
     * Gets the armedForcesId value for this IdentityData.
     * 
     * @return armedForcesId
     */
    public java.lang.String getArmedForcesId() {
        return armedForcesId;
    }


    /**
     * Sets the armedForcesId value for this IdentityData.
     * 
     * @param armedForcesId
     */
    public void setArmedForcesId(java.lang.String armedForcesId) {
        this.armedForcesId = armedForcesId;
    }


    /**
     * Gets the companyName value for this IdentityData.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this IdentityData.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the customerName value for this IdentityData.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this IdentityData.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the newNRIC value for this IdentityData.
     * 
     * @return newNRIC
     */
    public java.lang.String getNewNRIC() {
        return newNRIC;
    }


    /**
     * Sets the newNRIC value for this IdentityData.
     * 
     * @param newNRIC
     */
    public void setNewNRIC(java.lang.String newNRIC) {
        this.newNRIC = newNRIC;
    }


    /**
     * Gets the oldNRIC value for this IdentityData.
     * 
     * @return oldNRIC
     */
    public java.lang.String getOldNRIC() {
        return oldNRIC;
    }


    /**
     * Sets the oldNRIC value for this IdentityData.
     * 
     * @param oldNRIC
     */
    public void setOldNRIC(java.lang.String oldNRIC) {
        this.oldNRIC = oldNRIC;
    }


    /**
     * Gets the passportNumber value for this IdentityData.
     * 
     * @return passportNumber
     */
    public java.lang.String getPassportNumber() {
        return passportNumber;
    }


    /**
     * Sets the passportNumber value for this IdentityData.
     * 
     * @param passportNumber
     */
    public void setPassportNumber(java.lang.String passportNumber) {
        this.passportNumber = passportNumber;
    }


    /**
     * Gets the _any value for this IdentityData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this IdentityData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentityData)) return false;
        IdentityData other = (IdentityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BRN==null && other.getBRN()==null) || 
             (this.BRN!=null &&
              this.BRN.equals(other.getBRN()))) &&
            ((this.armedForcesId==null && other.getArmedForcesId()==null) || 
             (this.armedForcesId!=null &&
              this.armedForcesId.equals(other.getArmedForcesId()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.newNRIC==null && other.getNewNRIC()==null) || 
             (this.newNRIC!=null &&
              this.newNRIC.equals(other.getNewNRIC()))) &&
            ((this.oldNRIC==null && other.getOldNRIC()==null) || 
             (this.oldNRIC!=null &&
              this.oldNRIC.equals(other.getOldNRIC()))) &&
            ((this.passportNumber==null && other.getPassportNumber()==null) || 
             (this.passportNumber!=null &&
              this.passportNumber.equals(other.getPassportNumber()))) &&
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
        if (getBRN() != null) {
            _hashCode += getBRN().hashCode();
        }
        if (getArmedForcesId() != null) {
            _hashCode += getArmedForcesId().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getNewNRIC() != null) {
            _hashCode += getNewNRIC().hashCode();
        }
        if (getOldNRIC() != null) {
            _hashCode += getOldNRIC().hashCode();
        }
        if (getPassportNumber() != null) {
            _hashCode += getPassportNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(IdentityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "IdentityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "BRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armedForcesId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "armedForcesId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNRIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "newNRIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldNRIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "oldNRIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "passportNumber"));
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
