/**
 * FiveGProvisionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TTprovisioning_xsd;

public class FiveGProvisionRequest  implements java.io.Serializable {
    private java.lang.String IMSI;

    private java.lang.String MSISDN;

    private java.lang.String accountType;

    private com.xius.tia.TTprovisioning_xsd.ProductType[] prodList;

    private java.lang.String billCycleDate;

    private java.lang.String transNumber;

    public FiveGProvisionRequest() {
    }

    public FiveGProvisionRequest(
           java.lang.String IMSI,
           java.lang.String MSISDN,
           java.lang.String accountType,
           com.xius.tia.TTprovisioning_xsd.ProductType[] prodList,
           java.lang.String billCycleDate,
           java.lang.String transNumber) {
           this.IMSI = IMSI;
           this.MSISDN = MSISDN;
           this.accountType = accountType;
           this.prodList = prodList;
           this.billCycleDate = billCycleDate;
           this.transNumber = transNumber;
    }


    /**
     * Gets the IMSI value for this FiveGProvisionRequest.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this FiveGProvisionRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the MSISDN value for this FiveGProvisionRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this FiveGProvisionRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the accountType value for this FiveGProvisionRequest.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this FiveGProvisionRequest.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the prodList value for this FiveGProvisionRequest.
     * 
     * @return prodList
     */
    public com.xius.tia.TTprovisioning_xsd.ProductType[] getProdList() {
        return prodList;
    }


    /**
     * Sets the prodList value for this FiveGProvisionRequest.
     * 
     * @param prodList
     */
    public void setProdList(com.xius.tia.TTprovisioning_xsd.ProductType[] prodList) {
        this.prodList = prodList;
    }

    public com.xius.tia.TTprovisioning_xsd.ProductType getProdList(int i) {
        return this.prodList[i];
    }

    public void setProdList(int i, com.xius.tia.TTprovisioning_xsd.ProductType _value) {
        this.prodList[i] = _value;
    }


    /**
     * Gets the billCycleDate value for this FiveGProvisionRequest.
     * 
     * @return billCycleDate
     */
    public java.lang.String getBillCycleDate() {
        return billCycleDate;
    }


    /**
     * Sets the billCycleDate value for this FiveGProvisionRequest.
     * 
     * @param billCycleDate
     */
    public void setBillCycleDate(java.lang.String billCycleDate) {
        this.billCycleDate = billCycleDate;
    }


    /**
     * Gets the transNumber value for this FiveGProvisionRequest.
     * 
     * @return transNumber
     */
    public java.lang.String getTransNumber() {
        return transNumber;
    }


    /**
     * Sets the transNumber value for this FiveGProvisionRequest.
     * 
     * @param transNumber
     */
    public void setTransNumber(java.lang.String transNumber) {
        this.transNumber = transNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FiveGProvisionRequest)) return false;
        FiveGProvisionRequest other = (FiveGProvisionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.prodList==null && other.getProdList()==null) || 
             (this.prodList!=null &&
              java.util.Arrays.equals(this.prodList, other.getProdList()))) &&
            ((this.billCycleDate==null && other.getBillCycleDate()==null) || 
             (this.billCycleDate!=null &&
              this.billCycleDate.equals(other.getBillCycleDate()))) &&
            ((this.transNumber==null && other.getTransNumber()==null) || 
             (this.transNumber!=null &&
              this.transNumber.equals(other.getTransNumber())));
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
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getProdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCycleDate() != null) {
            _hashCode += getBillCycleDate().hashCode();
        }
        if (getTransNumber() != null) {
            _hashCode += getTransNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FiveGProvisionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "fiveGProvisionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "prodList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "ProductType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "billCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TTprovisioning.xsd", "transNumber"));
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
