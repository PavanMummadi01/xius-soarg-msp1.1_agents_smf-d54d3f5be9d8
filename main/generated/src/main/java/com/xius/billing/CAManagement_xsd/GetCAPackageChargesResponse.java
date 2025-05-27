/**
 * GetCAPackageChargesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.CAManagement_xsd;

public class GetCAPackageChargesResponse  implements java.io.Serializable {
    private java.math.BigDecimal pkgRentalAmmount;

    private java.math.BigDecimal addonCharge;

    private java.math.BigDecimal addnlLineCharge;

    private java.lang.String parentMSISDN;

    private java.math.BigDecimal topUpCharge;

    private java.lang.Long debitActivityId;

    private java.lang.Long creditActivityId;

    private java.lang.String debitActivityReason;

    private java.lang.String creditActivityReason;

    private java.lang.String transactionId;

    public GetCAPackageChargesResponse() {
    }

    public GetCAPackageChargesResponse(
           java.math.BigDecimal pkgRentalAmmount,
           java.math.BigDecimal addonCharge,
           java.math.BigDecimal addnlLineCharge,
           java.lang.String parentMSISDN,
           java.math.BigDecimal topUpCharge,
           java.lang.Long debitActivityId,
           java.lang.Long creditActivityId,
           java.lang.String debitActivityReason,
           java.lang.String creditActivityReason,
           java.lang.String transactionId) {
           this.pkgRentalAmmount = pkgRentalAmmount;
           this.addonCharge = addonCharge;
           this.addnlLineCharge = addnlLineCharge;
           this.parentMSISDN = parentMSISDN;
           this.topUpCharge = topUpCharge;
           this.debitActivityId = debitActivityId;
           this.creditActivityId = creditActivityId;
           this.debitActivityReason = debitActivityReason;
           this.creditActivityReason = creditActivityReason;
           this.transactionId = transactionId;
    }


    /**
     * Gets the pkgRentalAmmount value for this GetCAPackageChargesResponse.
     * 
     * @return pkgRentalAmmount
     */
    public java.math.BigDecimal getPkgRentalAmmount() {
        return pkgRentalAmmount;
    }


    /**
     * Sets the pkgRentalAmmount value for this GetCAPackageChargesResponse.
     * 
     * @param pkgRentalAmmount
     */
    public void setPkgRentalAmmount(java.math.BigDecimal pkgRentalAmmount) {
        this.pkgRentalAmmount = pkgRentalAmmount;
    }


    /**
     * Gets the addonCharge value for this GetCAPackageChargesResponse.
     * 
     * @return addonCharge
     */
    public java.math.BigDecimal getAddonCharge() {
        return addonCharge;
    }


    /**
     * Sets the addonCharge value for this GetCAPackageChargesResponse.
     * 
     * @param addonCharge
     */
    public void setAddonCharge(java.math.BigDecimal addonCharge) {
        this.addonCharge = addonCharge;
    }


    /**
     * Gets the addnlLineCharge value for this GetCAPackageChargesResponse.
     * 
     * @return addnlLineCharge
     */
    public java.math.BigDecimal getAddnlLineCharge() {
        return addnlLineCharge;
    }


    /**
     * Sets the addnlLineCharge value for this GetCAPackageChargesResponse.
     * 
     * @param addnlLineCharge
     */
    public void setAddnlLineCharge(java.math.BigDecimal addnlLineCharge) {
        this.addnlLineCharge = addnlLineCharge;
    }


    /**
     * Gets the parentMSISDN value for this GetCAPackageChargesResponse.
     * 
     * @return parentMSISDN
     */
    public java.lang.String getParentMSISDN() {
        return parentMSISDN;
    }


    /**
     * Sets the parentMSISDN value for this GetCAPackageChargesResponse.
     * 
     * @param parentMSISDN
     */
    public void setParentMSISDN(java.lang.String parentMSISDN) {
        this.parentMSISDN = parentMSISDN;
    }


    /**
     * Gets the topUpCharge value for this GetCAPackageChargesResponse.
     * 
     * @return topUpCharge
     */
    public java.math.BigDecimal getTopUpCharge() {
        return topUpCharge;
    }


    /**
     * Sets the topUpCharge value for this GetCAPackageChargesResponse.
     * 
     * @param topUpCharge
     */
    public void setTopUpCharge(java.math.BigDecimal topUpCharge) {
        this.topUpCharge = topUpCharge;
    }


    /**
     * Gets the debitActivityId value for this GetCAPackageChargesResponse.
     * 
     * @return debitActivityId
     */
    public java.lang.Long getDebitActivityId() {
        return debitActivityId;
    }


    /**
     * Sets the debitActivityId value for this GetCAPackageChargesResponse.
     * 
     * @param debitActivityId
     */
    public void setDebitActivityId(java.lang.Long debitActivityId) {
        this.debitActivityId = debitActivityId;
    }


    /**
     * Gets the creditActivityId value for this GetCAPackageChargesResponse.
     * 
     * @return creditActivityId
     */
    public java.lang.Long getCreditActivityId() {
        return creditActivityId;
    }


    /**
     * Sets the creditActivityId value for this GetCAPackageChargesResponse.
     * 
     * @param creditActivityId
     */
    public void setCreditActivityId(java.lang.Long creditActivityId) {
        this.creditActivityId = creditActivityId;
    }


    /**
     * Gets the debitActivityReason value for this GetCAPackageChargesResponse.
     * 
     * @return debitActivityReason
     */
    public java.lang.String getDebitActivityReason() {
        return debitActivityReason;
    }


    /**
     * Sets the debitActivityReason value for this GetCAPackageChargesResponse.
     * 
     * @param debitActivityReason
     */
    public void setDebitActivityReason(java.lang.String debitActivityReason) {
        this.debitActivityReason = debitActivityReason;
    }


    /**
     * Gets the creditActivityReason value for this GetCAPackageChargesResponse.
     * 
     * @return creditActivityReason
     */
    public java.lang.String getCreditActivityReason() {
        return creditActivityReason;
    }


    /**
     * Sets the creditActivityReason value for this GetCAPackageChargesResponse.
     * 
     * @param creditActivityReason
     */
    public void setCreditActivityReason(java.lang.String creditActivityReason) {
        this.creditActivityReason = creditActivityReason;
    }


    /**
     * Gets the transactionId value for this GetCAPackageChargesResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GetCAPackageChargesResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCAPackageChargesResponse)) return false;
        GetCAPackageChargesResponse other = (GetCAPackageChargesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pkgRentalAmmount==null && other.getPkgRentalAmmount()==null) || 
             (this.pkgRentalAmmount!=null &&
              this.pkgRentalAmmount.equals(other.getPkgRentalAmmount()))) &&
            ((this.addonCharge==null && other.getAddonCharge()==null) || 
             (this.addonCharge!=null &&
              this.addonCharge.equals(other.getAddonCharge()))) &&
            ((this.addnlLineCharge==null && other.getAddnlLineCharge()==null) || 
             (this.addnlLineCharge!=null &&
              this.addnlLineCharge.equals(other.getAddnlLineCharge()))) &&
            ((this.parentMSISDN==null && other.getParentMSISDN()==null) || 
             (this.parentMSISDN!=null &&
              this.parentMSISDN.equals(other.getParentMSISDN()))) &&
            ((this.topUpCharge==null && other.getTopUpCharge()==null) || 
             (this.topUpCharge!=null &&
              this.topUpCharge.equals(other.getTopUpCharge()))) &&
            ((this.debitActivityId==null && other.getDebitActivityId()==null) || 
             (this.debitActivityId!=null &&
              this.debitActivityId.equals(other.getDebitActivityId()))) &&
            ((this.creditActivityId==null && other.getCreditActivityId()==null) || 
             (this.creditActivityId!=null &&
              this.creditActivityId.equals(other.getCreditActivityId()))) &&
            ((this.debitActivityReason==null && other.getDebitActivityReason()==null) || 
             (this.debitActivityReason!=null &&
              this.debitActivityReason.equals(other.getDebitActivityReason()))) &&
            ((this.creditActivityReason==null && other.getCreditActivityReason()==null) || 
             (this.creditActivityReason!=null &&
              this.creditActivityReason.equals(other.getCreditActivityReason()))) &&
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
        if (getPkgRentalAmmount() != null) {
            _hashCode += getPkgRentalAmmount().hashCode();
        }
        if (getAddonCharge() != null) {
            _hashCode += getAddonCharge().hashCode();
        }
        if (getAddnlLineCharge() != null) {
            _hashCode += getAddnlLineCharge().hashCode();
        }
        if (getParentMSISDN() != null) {
            _hashCode += getParentMSISDN().hashCode();
        }
        if (getTopUpCharge() != null) {
            _hashCode += getTopUpCharge().hashCode();
        }
        if (getDebitActivityId() != null) {
            _hashCode += getDebitActivityId().hashCode();
        }
        if (getCreditActivityId() != null) {
            _hashCode += getCreditActivityId().hashCode();
        }
        if (getDebitActivityReason() != null) {
            _hashCode += getDebitActivityReason().hashCode();
        }
        if (getCreditActivityReason() != null) {
            _hashCode += getCreditActivityReason().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCAPackageChargesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "GetCAPackageChargesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkgRentalAmmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "pkgRentalAmmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addonCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "addonCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addnlLineCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "addnlLineCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "parentMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "topUpCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "debitActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "creditActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitActivityReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "debitActivityReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditActivityReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "creditActivityReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/CAManagement.xsd", "transactionId"));
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
