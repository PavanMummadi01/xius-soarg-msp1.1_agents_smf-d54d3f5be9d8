/**
 * PlansType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_xsd;

public class PlansType  implements java.io.Serializable {
    private java.lang.String publicityId;

    private com.xius.billing.BalanceManagement_xsd.AirTimeType airTime;

    private com.xius.billing.BalanceManagement_xsd.BenefitType[] benefits;

    private com.xius.billing.BalanceManagement_xsd.WalletInfoType[] wallet;

    private java.lang.String description;

    private java.lang.String charge;

    private java.lang.String mrp;

    private java.lang.String[] channel;

    public PlansType() {
    }

    public PlansType(
           java.lang.String publicityId,
           com.xius.billing.BalanceManagement_xsd.AirTimeType airTime,
           com.xius.billing.BalanceManagement_xsd.BenefitType[] benefits,
           com.xius.billing.BalanceManagement_xsd.WalletInfoType[] wallet,
           java.lang.String description,
           java.lang.String charge,
           java.lang.String mrp,
           java.lang.String[] channel) {
           this.publicityId = publicityId;
           this.airTime = airTime;
           this.benefits = benefits;
           this.wallet = wallet;
           this.description = description;
           this.charge = charge;
           this.mrp = mrp;
           this.channel = channel;
    }


    /**
     * Gets the publicityId value for this PlansType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this PlansType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the airTime value for this PlansType.
     * 
     * @return airTime
     */
    public com.xius.billing.BalanceManagement_xsd.AirTimeType getAirTime() {
        return airTime;
    }


    /**
     * Sets the airTime value for this PlansType.
     * 
     * @param airTime
     */
    public void setAirTime(com.xius.billing.BalanceManagement_xsd.AirTimeType airTime) {
        this.airTime = airTime;
    }


    /**
     * Gets the benefits value for this PlansType.
     * 
     * @return benefits
     */
    public com.xius.billing.BalanceManagement_xsd.BenefitType[] getBenefits() {
        return benefits;
    }


    /**
     * Sets the benefits value for this PlansType.
     * 
     * @param benefits
     */
    public void setBenefits(com.xius.billing.BalanceManagement_xsd.BenefitType[] benefits) {
        this.benefits = benefits;
    }

    public com.xius.billing.BalanceManagement_xsd.BenefitType getBenefits(int i) {
        return this.benefits[i];
    }

    public void setBenefits(int i, com.xius.billing.BalanceManagement_xsd.BenefitType _value) {
        this.benefits[i] = _value;
    }


    /**
     * Gets the wallet value for this PlansType.
     * 
     * @return wallet
     */
    public com.xius.billing.BalanceManagement_xsd.WalletInfoType[] getWallet() {
        return wallet;
    }


    /**
     * Sets the wallet value for this PlansType.
     * 
     * @param wallet
     */
    public void setWallet(com.xius.billing.BalanceManagement_xsd.WalletInfoType[] wallet) {
        this.wallet = wallet;
    }

    public com.xius.billing.BalanceManagement_xsd.WalletInfoType getWallet(int i) {
        return this.wallet[i];
    }

    public void setWallet(int i, com.xius.billing.BalanceManagement_xsd.WalletInfoType _value) {
        this.wallet[i] = _value;
    }


    /**
     * Gets the description value for this PlansType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PlansType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the charge value for this PlansType.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this PlansType.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the mrp value for this PlansType.
     * 
     * @return mrp
     */
    public java.lang.String getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this PlansType.
     * 
     * @param mrp
     */
    public void setMrp(java.lang.String mrp) {
        this.mrp = mrp;
    }


    /**
     * Gets the channel value for this PlansType.
     * 
     * @return channel
     */
    public java.lang.String[] getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this PlansType.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String[] channel) {
        this.channel = channel;
    }

    public java.lang.String getChannel(int i) {
        return this.channel[i];
    }

    public void setChannel(int i, java.lang.String _value) {
        this.channel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlansType)) return false;
        PlansType other = (PlansType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.airTime==null && other.getAirTime()==null) || 
             (this.airTime!=null &&
              this.airTime.equals(other.getAirTime()))) &&
            ((this.benefits==null && other.getBenefits()==null) || 
             (this.benefits!=null &&
              java.util.Arrays.equals(this.benefits, other.getBenefits()))) &&
            ((this.wallet==null && other.getWallet()==null) || 
             (this.wallet!=null &&
              java.util.Arrays.equals(this.wallet, other.getWallet()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              this.mrp.equals(other.getMrp()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              java.util.Arrays.equals(this.channel, other.getChannel())));
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
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getAirTime() != null) {
            _hashCode += getAirTime().hashCode();
        }
        if (getBenefits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBenefits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBenefits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWallet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWallet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWallet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getMrp() != null) {
            _hashCode += getMrp().hashCode();
        }
        if (getChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannel(), i);
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
        new org.apache.axis.description.TypeDesc(PlansType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "plansType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "airTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "airTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "benefits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "benefitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wallet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "wallet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "walletInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "mrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
