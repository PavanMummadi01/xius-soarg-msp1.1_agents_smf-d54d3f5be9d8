/**
 * DeviceNetworkData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.device;

public class DeviceNetworkData  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.math.BigDecimal ESNDecimal;

    private java.lang.String ESNHex;

    private java.lang.String IXC;

    private java.lang.String LRN;

    private java.lang.String MDN;

    private java.lang.String MSID;

    private java.util.Calendar activationDate;

    private java.lang.String customerGroup;

    private java.lang.String deactSalesPerson;

    private java.util.Calendar deactivateDate;

    private java.lang.String deactivateReason;

    private java.lang.String equipmentStatus;

    private java.lang.String extension1;

    private java.util.Calendar finalDate;

    private java.util.Calendar reactDate;

    private java.lang.String roamICPT;

    private org.apache.axis.message.MessageElement [] _any;

    public DeviceNetworkData() {
    }

    public DeviceNetworkData(
           java.math.BigDecimal ESNDecimal,
           java.lang.String ESNHex,
           java.lang.String IXC,
           java.lang.String LRN,
           java.lang.String MDN,
           java.lang.String MSID,
           java.util.Calendar activationDate,
           java.lang.String customerGroup,
           java.lang.String deactSalesPerson,
           java.util.Calendar deactivateDate,
           java.lang.String deactivateReason,
           java.lang.String equipmentStatus,
           java.lang.String extension1,
           java.util.Calendar finalDate,
           java.util.Calendar reactDate,
           java.lang.String roamICPT,
           org.apache.axis.message.MessageElement [] _any) {
           this.ESNDecimal = ESNDecimal;
           this.ESNHex = ESNHex;
           this.IXC = IXC;
           this.LRN = LRN;
           this.MDN = MDN;
           this.MSID = MSID;
           this.activationDate = activationDate;
           this.customerGroup = customerGroup;
           this.deactSalesPerson = deactSalesPerson;
           this.deactivateDate = deactivateDate;
           this.deactivateReason = deactivateReason;
           this.equipmentStatus = equipmentStatus;
           this.extension1 = extension1;
           this.finalDate = finalDate;
           this.reactDate = reactDate;
           this.roamICPT = roamICPT;
           this._any = _any;
    }


    /**
     * Gets the ESNDecimal value for this DeviceNetworkData.
     * 
     * @return ESNDecimal
     */
    public java.math.BigDecimal getESNDecimal() {
        return ESNDecimal;
    }


    /**
     * Sets the ESNDecimal value for this DeviceNetworkData.
     * 
     * @param ESNDecimal
     */
    public void setESNDecimal(java.math.BigDecimal ESNDecimal) {
        this.ESNDecimal = ESNDecimal;
    }


    /**
     * Gets the ESNHex value for this DeviceNetworkData.
     * 
     * @return ESNHex
     */
    public java.lang.String getESNHex() {
        return ESNHex;
    }


    /**
     * Sets the ESNHex value for this DeviceNetworkData.
     * 
     * @param ESNHex
     */
    public void setESNHex(java.lang.String ESNHex) {
        this.ESNHex = ESNHex;
    }


    /**
     * Gets the IXC value for this DeviceNetworkData.
     * 
     * @return IXC
     */
    public java.lang.String getIXC() {
        return IXC;
    }


    /**
     * Sets the IXC value for this DeviceNetworkData.
     * 
     * @param IXC
     */
    public void setIXC(java.lang.String IXC) {
        this.IXC = IXC;
    }


    /**
     * Gets the LRN value for this DeviceNetworkData.
     * 
     * @return LRN
     */
    public java.lang.String getLRN() {
        return LRN;
    }


    /**
     * Sets the LRN value for this DeviceNetworkData.
     * 
     * @param LRN
     */
    public void setLRN(java.lang.String LRN) {
        this.LRN = LRN;
    }


    /**
     * Gets the MDN value for this DeviceNetworkData.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this DeviceNetworkData.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the MSID value for this DeviceNetworkData.
     * 
     * @return MSID
     */
    public java.lang.String getMSID() {
        return MSID;
    }


    /**
     * Sets the MSID value for this DeviceNetworkData.
     * 
     * @param MSID
     */
    public void setMSID(java.lang.String MSID) {
        this.MSID = MSID;
    }


    /**
     * Gets the activationDate value for this DeviceNetworkData.
     * 
     * @return activationDate
     */
    public java.util.Calendar getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this DeviceNetworkData.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.util.Calendar activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the customerGroup value for this DeviceNetworkData.
     * 
     * @return customerGroup
     */
    public java.lang.String getCustomerGroup() {
        return customerGroup;
    }


    /**
     * Sets the customerGroup value for this DeviceNetworkData.
     * 
     * @param customerGroup
     */
    public void setCustomerGroup(java.lang.String customerGroup) {
        this.customerGroup = customerGroup;
    }


    /**
     * Gets the deactSalesPerson value for this DeviceNetworkData.
     * 
     * @return deactSalesPerson
     */
    public java.lang.String getDeactSalesPerson() {
        return deactSalesPerson;
    }


    /**
     * Sets the deactSalesPerson value for this DeviceNetworkData.
     * 
     * @param deactSalesPerson
     */
    public void setDeactSalesPerson(java.lang.String deactSalesPerson) {
        this.deactSalesPerson = deactSalesPerson;
    }


    /**
     * Gets the deactivateDate value for this DeviceNetworkData.
     * 
     * @return deactivateDate
     */
    public java.util.Calendar getDeactivateDate() {
        return deactivateDate;
    }


    /**
     * Sets the deactivateDate value for this DeviceNetworkData.
     * 
     * @param deactivateDate
     */
    public void setDeactivateDate(java.util.Calendar deactivateDate) {
        this.deactivateDate = deactivateDate;
    }


    /**
     * Gets the deactivateReason value for this DeviceNetworkData.
     * 
     * @return deactivateReason
     */
    public java.lang.String getDeactivateReason() {
        return deactivateReason;
    }


    /**
     * Sets the deactivateReason value for this DeviceNetworkData.
     * 
     * @param deactivateReason
     */
    public void setDeactivateReason(java.lang.String deactivateReason) {
        this.deactivateReason = deactivateReason;
    }


    /**
     * Gets the equipmentStatus value for this DeviceNetworkData.
     * 
     * @return equipmentStatus
     */
    public java.lang.String getEquipmentStatus() {
        return equipmentStatus;
    }


    /**
     * Sets the equipmentStatus value for this DeviceNetworkData.
     * 
     * @param equipmentStatus
     */
    public void setEquipmentStatus(java.lang.String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }


    /**
     * Gets the extension1 value for this DeviceNetworkData.
     * 
     * @return extension1
     */
    public java.lang.String getExtension1() {
        return extension1;
    }


    /**
     * Sets the extension1 value for this DeviceNetworkData.
     * 
     * @param extension1
     */
    public void setExtension1(java.lang.String extension1) {
        this.extension1 = extension1;
    }


    /**
     * Gets the finalDate value for this DeviceNetworkData.
     * 
     * @return finalDate
     */
    public java.util.Calendar getFinalDate() {
        return finalDate;
    }


    /**
     * Sets the finalDate value for this DeviceNetworkData.
     * 
     * @param finalDate
     */
    public void setFinalDate(java.util.Calendar finalDate) {
        this.finalDate = finalDate;
    }


    /**
     * Gets the reactDate value for this DeviceNetworkData.
     * 
     * @return reactDate
     */
    public java.util.Calendar getReactDate() {
        return reactDate;
    }


    /**
     * Sets the reactDate value for this DeviceNetworkData.
     * 
     * @param reactDate
     */
    public void setReactDate(java.util.Calendar reactDate) {
        this.reactDate = reactDate;
    }


    /**
     * Gets the roamICPT value for this DeviceNetworkData.
     * 
     * @return roamICPT
     */
    public java.lang.String getRoamICPT() {
        return roamICPT;
    }


    /**
     * Sets the roamICPT value for this DeviceNetworkData.
     * 
     * @param roamICPT
     */
    public void setRoamICPT(java.lang.String roamICPT) {
        this.roamICPT = roamICPT;
    }


    /**
     * Gets the _any value for this DeviceNetworkData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this DeviceNetworkData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceNetworkData)) return false;
        DeviceNetworkData other = (DeviceNetworkData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ESNDecimal==null && other.getESNDecimal()==null) || 
             (this.ESNDecimal!=null &&
              this.ESNDecimal.equals(other.getESNDecimal()))) &&
            ((this.ESNHex==null && other.getESNHex()==null) || 
             (this.ESNHex!=null &&
              this.ESNHex.equals(other.getESNHex()))) &&
            ((this.IXC==null && other.getIXC()==null) || 
             (this.IXC!=null &&
              this.IXC.equals(other.getIXC()))) &&
            ((this.LRN==null && other.getLRN()==null) || 
             (this.LRN!=null &&
              this.LRN.equals(other.getLRN()))) &&
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            ((this.MSID==null && other.getMSID()==null) || 
             (this.MSID!=null &&
              this.MSID.equals(other.getMSID()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.customerGroup==null && other.getCustomerGroup()==null) || 
             (this.customerGroup!=null &&
              this.customerGroup.equals(other.getCustomerGroup()))) &&
            ((this.deactSalesPerson==null && other.getDeactSalesPerson()==null) || 
             (this.deactSalesPerson!=null &&
              this.deactSalesPerson.equals(other.getDeactSalesPerson()))) &&
            ((this.deactivateDate==null && other.getDeactivateDate()==null) || 
             (this.deactivateDate!=null &&
              this.deactivateDate.equals(other.getDeactivateDate()))) &&
            ((this.deactivateReason==null && other.getDeactivateReason()==null) || 
             (this.deactivateReason!=null &&
              this.deactivateReason.equals(other.getDeactivateReason()))) &&
            ((this.equipmentStatus==null && other.getEquipmentStatus()==null) || 
             (this.equipmentStatus!=null &&
              this.equipmentStatus.equals(other.getEquipmentStatus()))) &&
            ((this.extension1==null && other.getExtension1()==null) || 
             (this.extension1!=null &&
              this.extension1.equals(other.getExtension1()))) &&
            ((this.finalDate==null && other.getFinalDate()==null) || 
             (this.finalDate!=null &&
              this.finalDate.equals(other.getFinalDate()))) &&
            ((this.reactDate==null && other.getReactDate()==null) || 
             (this.reactDate!=null &&
              this.reactDate.equals(other.getReactDate()))) &&
            ((this.roamICPT==null && other.getRoamICPT()==null) || 
             (this.roamICPT!=null &&
              this.roamICPT.equals(other.getRoamICPT()))) &&
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
        if (getESNDecimal() != null) {
            _hashCode += getESNDecimal().hashCode();
        }
        if (getESNHex() != null) {
            _hashCode += getESNHex().hashCode();
        }
        if (getIXC() != null) {
            _hashCode += getIXC().hashCode();
        }
        if (getLRN() != null) {
            _hashCode += getLRN().hashCode();
        }
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        if (getMSID() != null) {
            _hashCode += getMSID().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getCustomerGroup() != null) {
            _hashCode += getCustomerGroup().hashCode();
        }
        if (getDeactSalesPerson() != null) {
            _hashCode += getDeactSalesPerson().hashCode();
        }
        if (getDeactivateDate() != null) {
            _hashCode += getDeactivateDate().hashCode();
        }
        if (getDeactivateReason() != null) {
            _hashCode += getDeactivateReason().hashCode();
        }
        if (getEquipmentStatus() != null) {
            _hashCode += getEquipmentStatus().hashCode();
        }
        if (getExtension1() != null) {
            _hashCode += getExtension1().hashCode();
        }
        if (getFinalDate() != null) {
            _hashCode += getFinalDate().hashCode();
        }
        if (getReactDate() != null) {
            _hashCode += getReactDate().hashCode();
        }
        if (getRoamICPT() != null) {
            _hashCode += getRoamICPT().hashCode();
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
        new org.apache.axis.description.TypeDesc(DeviceNetworkData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "DeviceNetworkData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESNDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ESNDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESNHex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "ESNHex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IXC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "IXC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LRN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "LRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "MSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "customerGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deactSalesPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deactSalesPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deactivateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deactivateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deactivateReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "deactivateReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "equipmentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "extension1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "finalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reactDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "reactDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamICPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://device.mvnoapi.messages.si.bcgi.net", "roamICPT"));
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
