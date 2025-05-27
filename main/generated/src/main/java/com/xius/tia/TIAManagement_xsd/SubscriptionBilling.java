/**
 * SubscriptionBilling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class SubscriptionBilling  implements java.io.Serializable {
    private java.util.Date depositDate;

    private java.util.Date nextDepositReleaseDate;

    private java.lang.Long initialBalance;

    private java.lang.Integer initialExpiryDateExtension;

    private java.lang.Long creditLimit;

    private java.lang.Long deposit;

    private java.lang.String billingLanguage;

    private java.lang.String billingOption;

    private java.lang.Long discountClass;

    private java.lang.Long category;

    private java.lang.String userdefinedtype1;

    private java.lang.String userdefinedtype2;

    private java.lang.String userdefinedtype3;

    private java.lang.String userdefinedtype4;

    private java.lang.String userdefinedtype5;

    public SubscriptionBilling() {
    }

    public SubscriptionBilling(
           java.util.Date depositDate,
           java.util.Date nextDepositReleaseDate,
           java.lang.Long initialBalance,
           java.lang.Integer initialExpiryDateExtension,
           java.lang.Long creditLimit,
           java.lang.Long deposit,
           java.lang.String billingLanguage,
           java.lang.String billingOption,
           java.lang.Long discountClass,
           java.lang.Long category,
           java.lang.String userdefinedtype1,
           java.lang.String userdefinedtype2,
           java.lang.String userdefinedtype3,
           java.lang.String userdefinedtype4,
           java.lang.String userdefinedtype5) {
           this.depositDate = depositDate;
           this.nextDepositReleaseDate = nextDepositReleaseDate;
           this.initialBalance = initialBalance;
           this.initialExpiryDateExtension = initialExpiryDateExtension;
           this.creditLimit = creditLimit;
           this.deposit = deposit;
           this.billingLanguage = billingLanguage;
           this.billingOption = billingOption;
           this.discountClass = discountClass;
           this.category = category;
           this.userdefinedtype1 = userdefinedtype1;
           this.userdefinedtype2 = userdefinedtype2;
           this.userdefinedtype3 = userdefinedtype3;
           this.userdefinedtype4 = userdefinedtype4;
           this.userdefinedtype5 = userdefinedtype5;
    }


    /**
     * Gets the depositDate value for this SubscriptionBilling.
     * 
     * @return depositDate
     */
    public java.util.Date getDepositDate() {
        return depositDate;
    }


    /**
     * Sets the depositDate value for this SubscriptionBilling.
     * 
     * @param depositDate
     */
    public void setDepositDate(java.util.Date depositDate) {
        this.depositDate = depositDate;
    }


    /**
     * Gets the nextDepositReleaseDate value for this SubscriptionBilling.
     * 
     * @return nextDepositReleaseDate
     */
    public java.util.Date getNextDepositReleaseDate() {
        return nextDepositReleaseDate;
    }


    /**
     * Sets the nextDepositReleaseDate value for this SubscriptionBilling.
     * 
     * @param nextDepositReleaseDate
     */
    public void setNextDepositReleaseDate(java.util.Date nextDepositReleaseDate) {
        this.nextDepositReleaseDate = nextDepositReleaseDate;
    }


    /**
     * Gets the initialBalance value for this SubscriptionBilling.
     * 
     * @return initialBalance
     */
    public java.lang.Long getInitialBalance() {
        return initialBalance;
    }


    /**
     * Sets the initialBalance value for this SubscriptionBilling.
     * 
     * @param initialBalance
     */
    public void setInitialBalance(java.lang.Long initialBalance) {
        this.initialBalance = initialBalance;
    }


    /**
     * Gets the initialExpiryDateExtension value for this SubscriptionBilling.
     * 
     * @return initialExpiryDateExtension
     */
    public java.lang.Integer getInitialExpiryDateExtension() {
        return initialExpiryDateExtension;
    }


    /**
     * Sets the initialExpiryDateExtension value for this SubscriptionBilling.
     * 
     * @param initialExpiryDateExtension
     */
    public void setInitialExpiryDateExtension(java.lang.Integer initialExpiryDateExtension) {
        this.initialExpiryDateExtension = initialExpiryDateExtension;
    }


    /**
     * Gets the creditLimit value for this SubscriptionBilling.
     * 
     * @return creditLimit
     */
    public java.lang.Long getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this SubscriptionBilling.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Long creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the deposit value for this SubscriptionBilling.
     * 
     * @return deposit
     */
    public java.lang.Long getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this SubscriptionBilling.
     * 
     * @param deposit
     */
    public void setDeposit(java.lang.Long deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the billingLanguage value for this SubscriptionBilling.
     * 
     * @return billingLanguage
     */
    public java.lang.String getBillingLanguage() {
        return billingLanguage;
    }


    /**
     * Sets the billingLanguage value for this SubscriptionBilling.
     * 
     * @param billingLanguage
     */
    public void setBillingLanguage(java.lang.String billingLanguage) {
        this.billingLanguage = billingLanguage;
    }


    /**
     * Gets the billingOption value for this SubscriptionBilling.
     * 
     * @return billingOption
     */
    public java.lang.String getBillingOption() {
        return billingOption;
    }


    /**
     * Sets the billingOption value for this SubscriptionBilling.
     * 
     * @param billingOption
     */
    public void setBillingOption(java.lang.String billingOption) {
        this.billingOption = billingOption;
    }


    /**
     * Gets the discountClass value for this SubscriptionBilling.
     * 
     * @return discountClass
     */
    public java.lang.Long getDiscountClass() {
        return discountClass;
    }


    /**
     * Sets the discountClass value for this SubscriptionBilling.
     * 
     * @param discountClass
     */
    public void setDiscountClass(java.lang.Long discountClass) {
        this.discountClass = discountClass;
    }


    /**
     * Gets the category value for this SubscriptionBilling.
     * 
     * @return category
     */
    public java.lang.Long getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SubscriptionBilling.
     * 
     * @param category
     */
    public void setCategory(java.lang.Long category) {
        this.category = category;
    }


    /**
     * Gets the userdefinedtype1 value for this SubscriptionBilling.
     * 
     * @return userdefinedtype1
     */
    public java.lang.String getUserdefinedtype1() {
        return userdefinedtype1;
    }


    /**
     * Sets the userdefinedtype1 value for this SubscriptionBilling.
     * 
     * @param userdefinedtype1
     */
    public void setUserdefinedtype1(java.lang.String userdefinedtype1) {
        this.userdefinedtype1 = userdefinedtype1;
    }


    /**
     * Gets the userdefinedtype2 value for this SubscriptionBilling.
     * 
     * @return userdefinedtype2
     */
    public java.lang.String getUserdefinedtype2() {
        return userdefinedtype2;
    }


    /**
     * Sets the userdefinedtype2 value for this SubscriptionBilling.
     * 
     * @param userdefinedtype2
     */
    public void setUserdefinedtype2(java.lang.String userdefinedtype2) {
        this.userdefinedtype2 = userdefinedtype2;
    }


    /**
     * Gets the userdefinedtype3 value for this SubscriptionBilling.
     * 
     * @return userdefinedtype3
     */
    public java.lang.String getUserdefinedtype3() {
        return userdefinedtype3;
    }


    /**
     * Sets the userdefinedtype3 value for this SubscriptionBilling.
     * 
     * @param userdefinedtype3
     */
    public void setUserdefinedtype3(java.lang.String userdefinedtype3) {
        this.userdefinedtype3 = userdefinedtype3;
    }


    /**
     * Gets the userdefinedtype4 value for this SubscriptionBilling.
     * 
     * @return userdefinedtype4
     */
    public java.lang.String getUserdefinedtype4() {
        return userdefinedtype4;
    }


    /**
     * Sets the userdefinedtype4 value for this SubscriptionBilling.
     * 
     * @param userdefinedtype4
     */
    public void setUserdefinedtype4(java.lang.String userdefinedtype4) {
        this.userdefinedtype4 = userdefinedtype4;
    }


    /**
     * Gets the userdefinedtype5 value for this SubscriptionBilling.
     * 
     * @return userdefinedtype5
     */
    public java.lang.String getUserdefinedtype5() {
        return userdefinedtype5;
    }


    /**
     * Sets the userdefinedtype5 value for this SubscriptionBilling.
     * 
     * @param userdefinedtype5
     */
    public void setUserdefinedtype5(java.lang.String userdefinedtype5) {
        this.userdefinedtype5 = userdefinedtype5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionBilling)) return false;
        SubscriptionBilling other = (SubscriptionBilling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositDate==null && other.getDepositDate()==null) || 
             (this.depositDate!=null &&
              this.depositDate.equals(other.getDepositDate()))) &&
            ((this.nextDepositReleaseDate==null && other.getNextDepositReleaseDate()==null) || 
             (this.nextDepositReleaseDate!=null &&
              this.nextDepositReleaseDate.equals(other.getNextDepositReleaseDate()))) &&
            ((this.initialBalance==null && other.getInitialBalance()==null) || 
             (this.initialBalance!=null &&
              this.initialBalance.equals(other.getInitialBalance()))) &&
            ((this.initialExpiryDateExtension==null && other.getInitialExpiryDateExtension()==null) || 
             (this.initialExpiryDateExtension!=null &&
              this.initialExpiryDateExtension.equals(other.getInitialExpiryDateExtension()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.billingLanguage==null && other.getBillingLanguage()==null) || 
             (this.billingLanguage!=null &&
              this.billingLanguage.equals(other.getBillingLanguage()))) &&
            ((this.billingOption==null && other.getBillingOption()==null) || 
             (this.billingOption!=null &&
              this.billingOption.equals(other.getBillingOption()))) &&
            ((this.discountClass==null && other.getDiscountClass()==null) || 
             (this.discountClass!=null &&
              this.discountClass.equals(other.getDiscountClass()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.userdefinedtype1==null && other.getUserdefinedtype1()==null) || 
             (this.userdefinedtype1!=null &&
              this.userdefinedtype1.equals(other.getUserdefinedtype1()))) &&
            ((this.userdefinedtype2==null && other.getUserdefinedtype2()==null) || 
             (this.userdefinedtype2!=null &&
              this.userdefinedtype2.equals(other.getUserdefinedtype2()))) &&
            ((this.userdefinedtype3==null && other.getUserdefinedtype3()==null) || 
             (this.userdefinedtype3!=null &&
              this.userdefinedtype3.equals(other.getUserdefinedtype3()))) &&
            ((this.userdefinedtype4==null && other.getUserdefinedtype4()==null) || 
             (this.userdefinedtype4!=null &&
              this.userdefinedtype4.equals(other.getUserdefinedtype4()))) &&
            ((this.userdefinedtype5==null && other.getUserdefinedtype5()==null) || 
             (this.userdefinedtype5!=null &&
              this.userdefinedtype5.equals(other.getUserdefinedtype5())));
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
        if (getDepositDate() != null) {
            _hashCode += getDepositDate().hashCode();
        }
        if (getNextDepositReleaseDate() != null) {
            _hashCode += getNextDepositReleaseDate().hashCode();
        }
        if (getInitialBalance() != null) {
            _hashCode += getInitialBalance().hashCode();
        }
        if (getInitialExpiryDateExtension() != null) {
            _hashCode += getInitialExpiryDateExtension().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getBillingLanguage() != null) {
            _hashCode += getBillingLanguage().hashCode();
        }
        if (getBillingOption() != null) {
            _hashCode += getBillingOption().hashCode();
        }
        if (getDiscountClass() != null) {
            _hashCode += getDiscountClass().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getUserdefinedtype1() != null) {
            _hashCode += getUserdefinedtype1().hashCode();
        }
        if (getUserdefinedtype2() != null) {
            _hashCode += getUserdefinedtype2().hashCode();
        }
        if (getUserdefinedtype3() != null) {
            _hashCode += getUserdefinedtype3().hashCode();
        }
        if (getUserdefinedtype4() != null) {
            _hashCode += getUserdefinedtype4().hashCode();
        }
        if (getUserdefinedtype5() != null) {
            _hashCode += getUserdefinedtype5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriptionBilling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionBilling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "depositDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextDepositReleaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "nextDepositReleaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "initialBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialExpiryDateExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "initialExpiryDateExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "billingLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "billingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "discountClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedtype5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "userdefinedtype5"));
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
