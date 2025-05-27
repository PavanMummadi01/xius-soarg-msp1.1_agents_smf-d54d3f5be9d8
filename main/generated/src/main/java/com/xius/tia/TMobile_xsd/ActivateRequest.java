/**
 * ActivateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TMobile_xsd;

public class ActivateRequest  implements java.io.Serializable {
    private java.lang.String partnerTransactionID;

    private java.lang.String ICCID;

    private java.lang.String mktZip;

    private java.lang.String NGP;

    private java.lang.String productID;

    private java.lang.String isBaseProduct;

    private java.lang.String isCallBackUrlRequired;

    public ActivateRequest() {
    }

    public ActivateRequest(
           java.lang.String partnerTransactionID,
           java.lang.String ICCID,
           java.lang.String mktZip,
           java.lang.String NGP,
           java.lang.String productID,
           java.lang.String isBaseProduct,
           java.lang.String isCallBackUrlRequired) {
           this.partnerTransactionID = partnerTransactionID;
           this.ICCID = ICCID;
           this.mktZip = mktZip;
           this.NGP = NGP;
           this.productID = productID;
           this.isBaseProduct = isBaseProduct;
           this.isCallBackUrlRequired = isCallBackUrlRequired;
    }


    /**
     * Gets the partnerTransactionID value for this ActivateRequest.
     * 
     * @return partnerTransactionID
     */
    public java.lang.String getPartnerTransactionID() {
        return partnerTransactionID;
    }


    /**
     * Sets the partnerTransactionID value for this ActivateRequest.
     * 
     * @param partnerTransactionID
     */
    public void setPartnerTransactionID(java.lang.String partnerTransactionID) {
        this.partnerTransactionID = partnerTransactionID;
    }


    /**
     * Gets the ICCID value for this ActivateRequest.
     * 
     * @return ICCID
     */
    public java.lang.String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this ActivateRequest.
     * 
     * @param ICCID
     */
    public void setICCID(java.lang.String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the mktZip value for this ActivateRequest.
     * 
     * @return mktZip
     */
    public java.lang.String getMktZip() {
        return mktZip;
    }


    /**
     * Sets the mktZip value for this ActivateRequest.
     * 
     * @param mktZip
     */
    public void setMktZip(java.lang.String mktZip) {
        this.mktZip = mktZip;
    }


    /**
     * Gets the NGP value for this ActivateRequest.
     * 
     * @return NGP
     */
    public java.lang.String getNGP() {
        return NGP;
    }


    /**
     * Sets the NGP value for this ActivateRequest.
     * 
     * @param NGP
     */
    public void setNGP(java.lang.String NGP) {
        this.NGP = NGP;
    }


    /**
     * Gets the productID value for this ActivateRequest.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this ActivateRequest.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the isBaseProduct value for this ActivateRequest.
     * 
     * @return isBaseProduct
     */
    public java.lang.String getIsBaseProduct() {
        return isBaseProduct;
    }


    /**
     * Sets the isBaseProduct value for this ActivateRequest.
     * 
     * @param isBaseProduct
     */
    public void setIsBaseProduct(java.lang.String isBaseProduct) {
        this.isBaseProduct = isBaseProduct;
    }


    /**
     * Gets the isCallBackUrlRequired value for this ActivateRequest.
     * 
     * @return isCallBackUrlRequired
     */
    public java.lang.String getIsCallBackUrlRequired() {
        return isCallBackUrlRequired;
    }


    /**
     * Sets the isCallBackUrlRequired value for this ActivateRequest.
     * 
     * @param isCallBackUrlRequired
     */
    public void setIsCallBackUrlRequired(java.lang.String isCallBackUrlRequired) {
        this.isCallBackUrlRequired = isCallBackUrlRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateRequest)) return false;
        ActivateRequest other = (ActivateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partnerTransactionID==null && other.getPartnerTransactionID()==null) || 
             (this.partnerTransactionID!=null &&
              this.partnerTransactionID.equals(other.getPartnerTransactionID()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.mktZip==null && other.getMktZip()==null) || 
             (this.mktZip!=null &&
              this.mktZip.equals(other.getMktZip()))) &&
            ((this.NGP==null && other.getNGP()==null) || 
             (this.NGP!=null &&
              this.NGP.equals(other.getNGP()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.isBaseProduct==null && other.getIsBaseProduct()==null) || 
             (this.isBaseProduct!=null &&
              this.isBaseProduct.equals(other.getIsBaseProduct()))) &&
            ((this.isCallBackUrlRequired==null && other.getIsCallBackUrlRequired()==null) || 
             (this.isCallBackUrlRequired!=null &&
              this.isCallBackUrlRequired.equals(other.getIsCallBackUrlRequired())));
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
        if (getPartnerTransactionID() != null) {
            _hashCode += getPartnerTransactionID().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
        }
        if (getMktZip() != null) {
            _hashCode += getMktZip().hashCode();
        }
        if (getNGP() != null) {
            _hashCode += getNGP().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getIsBaseProduct() != null) {
            _hashCode += getIsBaseProduct().hashCode();
        }
        if (getIsCallBackUrlRequired() != null) {
            _hashCode += getIsCallBackUrlRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "activateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "partnerTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ICCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mktZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "mktZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NGP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "NGP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBaseProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "isBaseProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCallBackUrlRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TMobile.xsd", "isCallBackUrlRequired"));
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
