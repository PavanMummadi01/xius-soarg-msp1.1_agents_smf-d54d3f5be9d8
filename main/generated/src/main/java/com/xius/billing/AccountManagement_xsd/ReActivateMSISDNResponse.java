/**
 * ReActivateMSISDNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.AccountManagement_xsd;

public class ReActivateMSISDNResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String oldIMSI;

    private java.lang.String oldMSISDN;

    private java.lang.String oldMSISDNWithCCNDC;

    private java.lang.String newMSISDNWithCCNDC;

    public ReActivateMSISDNResponse() {
    }

    public ReActivateMSISDNResponse(
           java.lang.String message,
           java.lang.String oldIMSI,
           java.lang.String oldMSISDN,
           java.lang.String oldMSISDNWithCCNDC,
           java.lang.String newMSISDNWithCCNDC) {
           this.message = message;
           this.oldIMSI = oldIMSI;
           this.oldMSISDN = oldMSISDN;
           this.oldMSISDNWithCCNDC = oldMSISDNWithCCNDC;
           this.newMSISDNWithCCNDC = newMSISDNWithCCNDC;
    }


    /**
     * Gets the message value for this ReActivateMSISDNResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ReActivateMSISDNResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the oldIMSI value for this ReActivateMSISDNResponse.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this ReActivateMSISDNResponse.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the oldMSISDN value for this ReActivateMSISDNResponse.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this ReActivateMSISDNResponse.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the oldMSISDNWithCCNDC value for this ReActivateMSISDNResponse.
     * 
     * @return oldMSISDNWithCCNDC
     */
    public java.lang.String getOldMSISDNWithCCNDC() {
        return oldMSISDNWithCCNDC;
    }


    /**
     * Sets the oldMSISDNWithCCNDC value for this ReActivateMSISDNResponse.
     * 
     * @param oldMSISDNWithCCNDC
     */
    public void setOldMSISDNWithCCNDC(java.lang.String oldMSISDNWithCCNDC) {
        this.oldMSISDNWithCCNDC = oldMSISDNWithCCNDC;
    }


    /**
     * Gets the newMSISDNWithCCNDC value for this ReActivateMSISDNResponse.
     * 
     * @return newMSISDNWithCCNDC
     */
    public java.lang.String getNewMSISDNWithCCNDC() {
        return newMSISDNWithCCNDC;
    }


    /**
     * Sets the newMSISDNWithCCNDC value for this ReActivateMSISDNResponse.
     * 
     * @param newMSISDNWithCCNDC
     */
    public void setNewMSISDNWithCCNDC(java.lang.String newMSISDNWithCCNDC) {
        this.newMSISDNWithCCNDC = newMSISDNWithCCNDC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReActivateMSISDNResponse)) return false;
        ReActivateMSISDNResponse other = (ReActivateMSISDNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.oldMSISDNWithCCNDC==null && other.getOldMSISDNWithCCNDC()==null) || 
             (this.oldMSISDNWithCCNDC!=null &&
              this.oldMSISDNWithCCNDC.equals(other.getOldMSISDNWithCCNDC()))) &&
            ((this.newMSISDNWithCCNDC==null && other.getNewMSISDNWithCCNDC()==null) || 
             (this.newMSISDNWithCCNDC!=null &&
              this.newMSISDNWithCCNDC.equals(other.getNewMSISDNWithCCNDC())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getOldMSISDNWithCCNDC() != null) {
            _hashCode += getOldMSISDNWithCCNDC().hashCode();
        }
        if (getNewMSISDNWithCCNDC() != null) {
            _hashCode += getNewMSISDNWithCCNDC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReActivateMSISDNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "ReActivateMSISDNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDNWithCCNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "oldMSISDNWithCCNDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDNWithCCNDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "newMSISDNWithCCNDC"));
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
