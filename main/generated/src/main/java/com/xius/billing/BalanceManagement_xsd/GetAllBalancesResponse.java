/**
 * GetAllBalancesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class GetAllBalancesResponse  implements java.io.Serializable {
    private java.math.BigDecimal coreBalance;

    private java.lang.String coreBalanceValidity;

    private java.math.BigDecimal initialBalance;

    private java.lang.String initialBalanceValidity;

    private java.math.BigDecimal parkingBalance;

    private java.lang.String parkingBalanceValidity;

    private java.math.BigDecimal promoBalance;

    private java.lang.String promoBalanceValidity;

    private java.math.BigDecimal globalAmount;

    public GetAllBalancesResponse() {
    }

    public GetAllBalancesResponse(
           java.math.BigDecimal coreBalance,
           java.lang.String coreBalanceValidity,
           java.math.BigDecimal initialBalance,
           java.lang.String initialBalanceValidity,
           java.math.BigDecimal parkingBalance,
           java.lang.String parkingBalanceValidity,
           java.math.BigDecimal promoBalance,
           java.lang.String promoBalanceValidity,
           java.math.BigDecimal globalAmount) {
           this.coreBalance = coreBalance;
           this.coreBalanceValidity = coreBalanceValidity;
           this.initialBalance = initialBalance;
           this.initialBalanceValidity = initialBalanceValidity;
           this.parkingBalance = parkingBalance;
           this.parkingBalanceValidity = parkingBalanceValidity;
           this.promoBalance = promoBalance;
           this.promoBalanceValidity = promoBalanceValidity;
           this.globalAmount = globalAmount;
    }


    /**
     * Gets the coreBalance value for this GetAllBalancesResponse.
     * 
     * @return coreBalance
     */
    public java.math.BigDecimal getCoreBalance() {
        return coreBalance;
    }


    /**
     * Sets the coreBalance value for this GetAllBalancesResponse.
     * 
     * @param coreBalance
     */
    public void setCoreBalance(java.math.BigDecimal coreBalance) {
        this.coreBalance = coreBalance;
    }


    /**
     * Gets the coreBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @return coreBalanceValidity
     */
    public java.lang.String getCoreBalanceValidity() {
        return coreBalanceValidity;
    }


    /**
     * Sets the coreBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @param coreBalanceValidity
     */
    public void setCoreBalanceValidity(java.lang.String coreBalanceValidity) {
        this.coreBalanceValidity = coreBalanceValidity;
    }


    /**
     * Gets the initialBalance value for this GetAllBalancesResponse.
     * 
     * @return initialBalance
     */
    public java.math.BigDecimal getInitialBalance() {
        return initialBalance;
    }


    /**
     * Sets the initialBalance value for this GetAllBalancesResponse.
     * 
     * @param initialBalance
     */
    public void setInitialBalance(java.math.BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }


    /**
     * Gets the initialBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @return initialBalanceValidity
     */
    public java.lang.String getInitialBalanceValidity() {
        return initialBalanceValidity;
    }


    /**
     * Sets the initialBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @param initialBalanceValidity
     */
    public void setInitialBalanceValidity(java.lang.String initialBalanceValidity) {
        this.initialBalanceValidity = initialBalanceValidity;
    }


    /**
     * Gets the parkingBalance value for this GetAllBalancesResponse.
     * 
     * @return parkingBalance
     */
    public java.math.BigDecimal getParkingBalance() {
        return parkingBalance;
    }


    /**
     * Sets the parkingBalance value for this GetAllBalancesResponse.
     * 
     * @param parkingBalance
     */
    public void setParkingBalance(java.math.BigDecimal parkingBalance) {
        this.parkingBalance = parkingBalance;
    }


    /**
     * Gets the parkingBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @return parkingBalanceValidity
     */
    public java.lang.String getParkingBalanceValidity() {
        return parkingBalanceValidity;
    }


    /**
     * Sets the parkingBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @param parkingBalanceValidity
     */
    public void setParkingBalanceValidity(java.lang.String parkingBalanceValidity) {
        this.parkingBalanceValidity = parkingBalanceValidity;
    }


    /**
     * Gets the promoBalance value for this GetAllBalancesResponse.
     * 
     * @return promoBalance
     */
    public java.math.BigDecimal getPromoBalance() {
        return promoBalance;
    }


    /**
     * Sets the promoBalance value for this GetAllBalancesResponse.
     * 
     * @param promoBalance
     */
    public void setPromoBalance(java.math.BigDecimal promoBalance) {
        this.promoBalance = promoBalance;
    }


    /**
     * Gets the promoBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @return promoBalanceValidity
     */
    public java.lang.String getPromoBalanceValidity() {
        return promoBalanceValidity;
    }


    /**
     * Sets the promoBalanceValidity value for this GetAllBalancesResponse.
     * 
     * @param promoBalanceValidity
     */
    public void setPromoBalanceValidity(java.lang.String promoBalanceValidity) {
        this.promoBalanceValidity = promoBalanceValidity;
    }


    /**
     * Gets the globalAmount value for this GetAllBalancesResponse.
     * 
     * @return globalAmount
     */
    public java.math.BigDecimal getGlobalAmount() {
        return globalAmount;
    }


    /**
     * Sets the globalAmount value for this GetAllBalancesResponse.
     * 
     * @param globalAmount
     */
    public void setGlobalAmount(java.math.BigDecimal globalAmount) {
        this.globalAmount = globalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllBalancesResponse)) return false;
        GetAllBalancesResponse other = (GetAllBalancesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coreBalance==null && other.getCoreBalance()==null) || 
             (this.coreBalance!=null &&
              this.coreBalance.equals(other.getCoreBalance()))) &&
            ((this.coreBalanceValidity==null && other.getCoreBalanceValidity()==null) || 
             (this.coreBalanceValidity!=null &&
              this.coreBalanceValidity.equals(other.getCoreBalanceValidity()))) &&
            ((this.initialBalance==null && other.getInitialBalance()==null) || 
             (this.initialBalance!=null &&
              this.initialBalance.equals(other.getInitialBalance()))) &&
            ((this.initialBalanceValidity==null && other.getInitialBalanceValidity()==null) || 
             (this.initialBalanceValidity!=null &&
              this.initialBalanceValidity.equals(other.getInitialBalanceValidity()))) &&
            ((this.parkingBalance==null && other.getParkingBalance()==null) || 
             (this.parkingBalance!=null &&
              this.parkingBalance.equals(other.getParkingBalance()))) &&
            ((this.parkingBalanceValidity==null && other.getParkingBalanceValidity()==null) || 
             (this.parkingBalanceValidity!=null &&
              this.parkingBalanceValidity.equals(other.getParkingBalanceValidity()))) &&
            ((this.promoBalance==null && other.getPromoBalance()==null) || 
             (this.promoBalance!=null &&
              this.promoBalance.equals(other.getPromoBalance()))) &&
            ((this.promoBalanceValidity==null && other.getPromoBalanceValidity()==null) || 
             (this.promoBalanceValidity!=null &&
              this.promoBalanceValidity.equals(other.getPromoBalanceValidity()))) &&
            ((this.globalAmount==null && other.getGlobalAmount()==null) || 
             (this.globalAmount!=null &&
              this.globalAmount.equals(other.getGlobalAmount())));
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
        if (getCoreBalance() != null) {
            _hashCode += getCoreBalance().hashCode();
        }
        if (getCoreBalanceValidity() != null) {
            _hashCode += getCoreBalanceValidity().hashCode();
        }
        if (getInitialBalance() != null) {
            _hashCode += getInitialBalance().hashCode();
        }
        if (getInitialBalanceValidity() != null) {
            _hashCode += getInitialBalanceValidity().hashCode();
        }
        if (getParkingBalance() != null) {
            _hashCode += getParkingBalance().hashCode();
        }
        if (getParkingBalanceValidity() != null) {
            _hashCode += getParkingBalanceValidity().hashCode();
        }
        if (getPromoBalance() != null) {
            _hashCode += getPromoBalance().hashCode();
        }
        if (getPromoBalanceValidity() != null) {
            _hashCode += getPromoBalanceValidity().hashCode();
        }
        if (getGlobalAmount() != null) {
            _hashCode += getGlobalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllBalancesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "GetAllBalancesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "coreBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBalanceValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "coreBalanceValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "initialBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialBalanceValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "initialBalanceValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parkingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "parkingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parkingBalanceValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "parkingBalanceValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "promoBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoBalanceValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "promoBalanceValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "globalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
