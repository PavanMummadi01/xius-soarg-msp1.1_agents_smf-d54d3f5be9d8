/**
 * UpateCAGrpCreditLimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class UpateCAGrpCreditLimitRequest  implements java.io.Serializable {
    private java.lang.Long grpID;

    private java.lang.Long parntAcctID;

    private java.lang.String[] childMDN;

    private java.lang.String[] updateCreditFlag;

    private java.lang.String undefined1;

    private java.lang.String undefined2;

    public UpateCAGrpCreditLimitRequest() {
    }

    public UpateCAGrpCreditLimitRequest(
           java.lang.Long grpID,
           java.lang.Long parntAcctID,
           java.lang.String[] childMDN,
           java.lang.String[] updateCreditFlag,
           java.lang.String undefined1,
           java.lang.String undefined2) {
           this.grpID = grpID;
           this.parntAcctID = parntAcctID;
           this.childMDN = childMDN;
           this.updateCreditFlag = updateCreditFlag;
           this.undefined1 = undefined1;
           this.undefined2 = undefined2;
    }


    /**
     * Gets the grpID value for this UpateCAGrpCreditLimitRequest.
     * 
     * @return grpID
     */
    public java.lang.Long getGrpID() {
        return grpID;
    }


    /**
     * Sets the grpID value for this UpateCAGrpCreditLimitRequest.
     * 
     * @param grpID
     */
    public void setGrpID(java.lang.Long grpID) {
        this.grpID = grpID;
    }


    /**
     * Gets the parntAcctID value for this UpateCAGrpCreditLimitRequest.
     * 
     * @return parntAcctID
     */
    public java.lang.Long getParntAcctID() {
        return parntAcctID;
    }


    /**
     * Sets the parntAcctID value for this UpateCAGrpCreditLimitRequest.
     * 
     * @param parntAcctID
     */
    public void setParntAcctID(java.lang.Long parntAcctID) {
        this.parntAcctID = parntAcctID;
    }


    /**
     * Gets the childMDN value for this UpateCAGrpCreditLimitRequest.
     * 
     * @return childMDN
     */
    public java.lang.String[] getChildMDN() {
        return childMDN;
    }


    /**
     * Sets the childMDN value for this UpateCAGrpCreditLimitRequest.
     * 
     * @param childMDN
     */
    public void setChildMDN(java.lang.String[] childMDN) {
        this.childMDN = childMDN;
    }

    public java.lang.String getChildMDN(int i) {
        return this.childMDN[i];
    }

    public void setChildMDN(int i, java.lang.String _value) {
        this.childMDN[i] = _value;
    }


    /**
     * Gets the updateCreditFlag value for this UpateCAGrpCreditLimitRequest.
     * 
     * @return updateCreditFlag
     */
    public java.lang.String[] getUpdateCreditFlag() {
        return updateCreditFlag;
    }


    /**
     * Sets the updateCreditFlag value for this UpateCAGrpCreditLimitRequest.
     * 
     * @param updateCreditFlag
     */
    public void setUpdateCreditFlag(java.lang.String[] updateCreditFlag) {
        this.updateCreditFlag = updateCreditFlag;
    }

    public java.lang.String getUpdateCreditFlag(int i) {
        return this.updateCreditFlag[i];
    }

    public void setUpdateCreditFlag(int i, java.lang.String _value) {
        this.updateCreditFlag[i] = _value;
    }


    /**
     * Gets the undefined1 value for this UpateCAGrpCreditLimitRequest.
     * 
     * @return undefined1
     */
    public java.lang.String getUndefined1() {
        return undefined1;
    }


    /**
     * Sets the undefined1 value for this UpateCAGrpCreditLimitRequest.
     * 
     * @param undefined1
     */
    public void setUndefined1(java.lang.String undefined1) {
        this.undefined1 = undefined1;
    }


    /**
     * Gets the undefined2 value for this UpateCAGrpCreditLimitRequest.
     * 
     * @return undefined2
     */
    public java.lang.String getUndefined2() {
        return undefined2;
    }


    /**
     * Sets the undefined2 value for this UpateCAGrpCreditLimitRequest.
     * 
     * @param undefined2
     */
    public void setUndefined2(java.lang.String undefined2) {
        this.undefined2 = undefined2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpateCAGrpCreditLimitRequest)) return false;
        UpateCAGrpCreditLimitRequest other = (UpateCAGrpCreditLimitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grpID==null && other.getGrpID()==null) || 
             (this.grpID!=null &&
              this.grpID.equals(other.getGrpID()))) &&
            ((this.parntAcctID==null && other.getParntAcctID()==null) || 
             (this.parntAcctID!=null &&
              this.parntAcctID.equals(other.getParntAcctID()))) &&
            ((this.childMDN==null && other.getChildMDN()==null) || 
             (this.childMDN!=null &&
              java.util.Arrays.equals(this.childMDN, other.getChildMDN()))) &&
            ((this.updateCreditFlag==null && other.getUpdateCreditFlag()==null) || 
             (this.updateCreditFlag!=null &&
              java.util.Arrays.equals(this.updateCreditFlag, other.getUpdateCreditFlag()))) &&
            ((this.undefined1==null && other.getUndefined1()==null) || 
             (this.undefined1!=null &&
              this.undefined1.equals(other.getUndefined1()))) &&
            ((this.undefined2==null && other.getUndefined2()==null) || 
             (this.undefined2!=null &&
              this.undefined2.equals(other.getUndefined2())));
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
        if (getGrpID() != null) {
            _hashCode += getGrpID().hashCode();
        }
        if (getParntAcctID() != null) {
            _hashCode += getParntAcctID().hashCode();
        }
        if (getChildMDN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildMDN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildMDN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpdateCreditFlag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateCreditFlag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateCreditFlag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUndefined1() != null) {
            _hashCode += getUndefined1().hashCode();
        }
        if (getUndefined2() != null) {
            _hashCode += getUndefined2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpateCAGrpCreditLimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "UpateCAGrpCreditLimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "grpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntAcctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "parntAcctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childMDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "childMDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateCreditFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "updateCreditFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "undefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "undefined2"));
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
