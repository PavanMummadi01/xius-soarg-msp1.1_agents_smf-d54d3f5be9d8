/**
 * ChangeSubMSISDNBulkRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ttsa.hlr.HLRManagement_xsd;

public class ChangeSubMSISDNBulkRequest  implements java.io.Serializable {
    private long[] oldMSISDN;

    private long[] newMSISDN;

    private long[] oldIMSI;

    public ChangeSubMSISDNBulkRequest() {
    }

    public ChangeSubMSISDNBulkRequest(
           long[] oldMSISDN,
           long[] newMSISDN,
           long[] oldIMSI) {
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the oldMSISDN value for this ChangeSubMSISDNBulkRequest.
     * 
     * @return oldMSISDN
     */
    public long[] getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this ChangeSubMSISDNBulkRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(long[] oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }

    public long getOldMSISDN(int i) {
        return this.oldMSISDN[i];
    }

    public void setOldMSISDN(int i, long _value) {
        this.oldMSISDN[i] = _value;
    }


    /**
     * Gets the newMSISDN value for this ChangeSubMSISDNBulkRequest.
     * 
     * @return newMSISDN
     */
    public long[] getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this ChangeSubMSISDNBulkRequest.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(long[] newMSISDN) {
        this.newMSISDN = newMSISDN;
    }

    public long getNewMSISDN(int i) {
        return this.newMSISDN[i];
    }

    public void setNewMSISDN(int i, long _value) {
        this.newMSISDN[i] = _value;
    }


    /**
     * Gets the oldIMSI value for this ChangeSubMSISDNBulkRequest.
     * 
     * @return oldIMSI
     */
    public long[] getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this ChangeSubMSISDNBulkRequest.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(long[] oldIMSI) {
        this.oldIMSI = oldIMSI;
    }

    public long getOldIMSI(int i) {
        return this.oldIMSI[i];
    }

    public void setOldIMSI(int i, long _value) {
        this.oldIMSI[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubMSISDNBulkRequest)) return false;
        ChangeSubMSISDNBulkRequest other = (ChangeSubMSISDNBulkRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              java.util.Arrays.equals(this.oldMSISDN, other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              java.util.Arrays.equals(this.newMSISDN, other.getNewMSISDN()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              java.util.Arrays.equals(this.oldIMSI, other.getOldIMSI())));
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
        if (getOldMSISDN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOldMSISDN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOldMSISDN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewMSISDN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewMSISDN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewMSISDN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOldIMSI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOldIMSI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOldIMSI(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeSubMSISDNBulkRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "ChangeSubMSISDNBulkRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://hlr.ttsa.xius.com/HLRManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
