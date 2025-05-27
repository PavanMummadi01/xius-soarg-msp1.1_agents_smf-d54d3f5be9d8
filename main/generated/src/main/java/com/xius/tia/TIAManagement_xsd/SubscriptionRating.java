/**
 * SubscriptionRating.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class SubscriptionRating  implements java.io.Serializable {
    private java.lang.Long primaryPricePlanID;

    private java.lang.Long pricePlanVersion;

    private java.lang.Long contractID;

    private java.lang.Long secondaryPricePlanID;

    private java.util.Date secondaryPricePlanStartDate;

    private java.util.Date secondaryPricePlanEndDate;

    private java.util.Date contractStartDate;

    private long[] enabledOptionalServices;

    private long[] enabledOptionalBundles;

    private long[] enabledOptionalPackages;

    private long[] enabledAuxiliaryServices;

    private long[] enabledAuxiliaryBundles;

    private java.lang.String userdefinedtype1;

    private java.lang.String userdefinedtype2;

    private java.lang.String userdefinedtype3;

    private java.lang.String userdefinedtype4;

    private java.lang.String userdefinedtype5;

    public SubscriptionRating() {
    }

    public SubscriptionRating(
           java.lang.Long primaryPricePlanID,
           java.lang.Long pricePlanVersion,
           java.lang.Long contractID,
           java.lang.Long secondaryPricePlanID,
           java.util.Date secondaryPricePlanStartDate,
           java.util.Date secondaryPricePlanEndDate,
           java.util.Date contractStartDate,
           long[] enabledOptionalServices,
           long[] enabledOptionalBundles,
           long[] enabledOptionalPackages,
           long[] enabledAuxiliaryServices,
           long[] enabledAuxiliaryBundles,
           java.lang.String userdefinedtype1,
           java.lang.String userdefinedtype2,
           java.lang.String userdefinedtype3,
           java.lang.String userdefinedtype4,
           java.lang.String userdefinedtype5) {
           this.primaryPricePlanID = primaryPricePlanID;
           this.pricePlanVersion = pricePlanVersion;
           this.contractID = contractID;
           this.secondaryPricePlanID = secondaryPricePlanID;
           this.secondaryPricePlanStartDate = secondaryPricePlanStartDate;
           this.secondaryPricePlanEndDate = secondaryPricePlanEndDate;
           this.contractStartDate = contractStartDate;
           this.enabledOptionalServices = enabledOptionalServices;
           this.enabledOptionalBundles = enabledOptionalBundles;
           this.enabledOptionalPackages = enabledOptionalPackages;
           this.enabledAuxiliaryServices = enabledAuxiliaryServices;
           this.enabledAuxiliaryBundles = enabledAuxiliaryBundles;
           this.userdefinedtype1 = userdefinedtype1;
           this.userdefinedtype2 = userdefinedtype2;
           this.userdefinedtype3 = userdefinedtype3;
           this.userdefinedtype4 = userdefinedtype4;
           this.userdefinedtype5 = userdefinedtype5;
    }


    /**
     * Gets the primaryPricePlanID value for this SubscriptionRating.
     * 
     * @return primaryPricePlanID
     */
    public java.lang.Long getPrimaryPricePlanID() {
        return primaryPricePlanID;
    }


    /**
     * Sets the primaryPricePlanID value for this SubscriptionRating.
     * 
     * @param primaryPricePlanID
     */
    public void setPrimaryPricePlanID(java.lang.Long primaryPricePlanID) {
        this.primaryPricePlanID = primaryPricePlanID;
    }


    /**
     * Gets the pricePlanVersion value for this SubscriptionRating.
     * 
     * @return pricePlanVersion
     */
    public java.lang.Long getPricePlanVersion() {
        return pricePlanVersion;
    }


    /**
     * Sets the pricePlanVersion value for this SubscriptionRating.
     * 
     * @param pricePlanVersion
     */
    public void setPricePlanVersion(java.lang.Long pricePlanVersion) {
        this.pricePlanVersion = pricePlanVersion;
    }


    /**
     * Gets the contractID value for this SubscriptionRating.
     * 
     * @return contractID
     */
    public java.lang.Long getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this SubscriptionRating.
     * 
     * @param contractID
     */
    public void setContractID(java.lang.Long contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the secondaryPricePlanID value for this SubscriptionRating.
     * 
     * @return secondaryPricePlanID
     */
    public java.lang.Long getSecondaryPricePlanID() {
        return secondaryPricePlanID;
    }


    /**
     * Sets the secondaryPricePlanID value for this SubscriptionRating.
     * 
     * @param secondaryPricePlanID
     */
    public void setSecondaryPricePlanID(java.lang.Long secondaryPricePlanID) {
        this.secondaryPricePlanID = secondaryPricePlanID;
    }


    /**
     * Gets the secondaryPricePlanStartDate value for this SubscriptionRating.
     * 
     * @return secondaryPricePlanStartDate
     */
    public java.util.Date getSecondaryPricePlanStartDate() {
        return secondaryPricePlanStartDate;
    }


    /**
     * Sets the secondaryPricePlanStartDate value for this SubscriptionRating.
     * 
     * @param secondaryPricePlanStartDate
     */
    public void setSecondaryPricePlanStartDate(java.util.Date secondaryPricePlanStartDate) {
        this.secondaryPricePlanStartDate = secondaryPricePlanStartDate;
    }


    /**
     * Gets the secondaryPricePlanEndDate value for this SubscriptionRating.
     * 
     * @return secondaryPricePlanEndDate
     */
    public java.util.Date getSecondaryPricePlanEndDate() {
        return secondaryPricePlanEndDate;
    }


    /**
     * Sets the secondaryPricePlanEndDate value for this SubscriptionRating.
     * 
     * @param secondaryPricePlanEndDate
     */
    public void setSecondaryPricePlanEndDate(java.util.Date secondaryPricePlanEndDate) {
        this.secondaryPricePlanEndDate = secondaryPricePlanEndDate;
    }


    /**
     * Gets the contractStartDate value for this SubscriptionRating.
     * 
     * @return contractStartDate
     */
    public java.util.Date getContractStartDate() {
        return contractStartDate;
    }


    /**
     * Sets the contractStartDate value for this SubscriptionRating.
     * 
     * @param contractStartDate
     */
    public void setContractStartDate(java.util.Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }


    /**
     * Gets the enabledOptionalServices value for this SubscriptionRating.
     * 
     * @return enabledOptionalServices
     */
    public long[] getEnabledOptionalServices() {
        return enabledOptionalServices;
    }


    /**
     * Sets the enabledOptionalServices value for this SubscriptionRating.
     * 
     * @param enabledOptionalServices
     */
    public void setEnabledOptionalServices(long[] enabledOptionalServices) {
        this.enabledOptionalServices = enabledOptionalServices;
    }

    public long getEnabledOptionalServices(int i) {
        return this.enabledOptionalServices[i];
    }

    public void setEnabledOptionalServices(int i, long _value) {
        this.enabledOptionalServices[i] = _value;
    }


    /**
     * Gets the enabledOptionalBundles value for this SubscriptionRating.
     * 
     * @return enabledOptionalBundles
     */
    public long[] getEnabledOptionalBundles() {
        return enabledOptionalBundles;
    }


    /**
     * Sets the enabledOptionalBundles value for this SubscriptionRating.
     * 
     * @param enabledOptionalBundles
     */
    public void setEnabledOptionalBundles(long[] enabledOptionalBundles) {
        this.enabledOptionalBundles = enabledOptionalBundles;
    }

    public long getEnabledOptionalBundles(int i) {
        return this.enabledOptionalBundles[i];
    }

    public void setEnabledOptionalBundles(int i, long _value) {
        this.enabledOptionalBundles[i] = _value;
    }


    /**
     * Gets the enabledOptionalPackages value for this SubscriptionRating.
     * 
     * @return enabledOptionalPackages
     */
    public long[] getEnabledOptionalPackages() {
        return enabledOptionalPackages;
    }


    /**
     * Sets the enabledOptionalPackages value for this SubscriptionRating.
     * 
     * @param enabledOptionalPackages
     */
    public void setEnabledOptionalPackages(long[] enabledOptionalPackages) {
        this.enabledOptionalPackages = enabledOptionalPackages;
    }

    public long getEnabledOptionalPackages(int i) {
        return this.enabledOptionalPackages[i];
    }

    public void setEnabledOptionalPackages(int i, long _value) {
        this.enabledOptionalPackages[i] = _value;
    }


    /**
     * Gets the enabledAuxiliaryServices value for this SubscriptionRating.
     * 
     * @return enabledAuxiliaryServices
     */
    public long[] getEnabledAuxiliaryServices() {
        return enabledAuxiliaryServices;
    }


    /**
     * Sets the enabledAuxiliaryServices value for this SubscriptionRating.
     * 
     * @param enabledAuxiliaryServices
     */
    public void setEnabledAuxiliaryServices(long[] enabledAuxiliaryServices) {
        this.enabledAuxiliaryServices = enabledAuxiliaryServices;
    }

    public long getEnabledAuxiliaryServices(int i) {
        return this.enabledAuxiliaryServices[i];
    }

    public void setEnabledAuxiliaryServices(int i, long _value) {
        this.enabledAuxiliaryServices[i] = _value;
    }


    /**
     * Gets the enabledAuxiliaryBundles value for this SubscriptionRating.
     * 
     * @return enabledAuxiliaryBundles
     */
    public long[] getEnabledAuxiliaryBundles() {
        return enabledAuxiliaryBundles;
    }


    /**
     * Sets the enabledAuxiliaryBundles value for this SubscriptionRating.
     * 
     * @param enabledAuxiliaryBundles
     */
    public void setEnabledAuxiliaryBundles(long[] enabledAuxiliaryBundles) {
        this.enabledAuxiliaryBundles = enabledAuxiliaryBundles;
    }

    public long getEnabledAuxiliaryBundles(int i) {
        return this.enabledAuxiliaryBundles[i];
    }

    public void setEnabledAuxiliaryBundles(int i, long _value) {
        this.enabledAuxiliaryBundles[i] = _value;
    }


    /**
     * Gets the userdefinedtype1 value for this SubscriptionRating.
     * 
     * @return userdefinedtype1
     */
    public java.lang.String getUserdefinedtype1() {
        return userdefinedtype1;
    }


    /**
     * Sets the userdefinedtype1 value for this SubscriptionRating.
     * 
     * @param userdefinedtype1
     */
    public void setUserdefinedtype1(java.lang.String userdefinedtype1) {
        this.userdefinedtype1 = userdefinedtype1;
    }


    /**
     * Gets the userdefinedtype2 value for this SubscriptionRating.
     * 
     * @return userdefinedtype2
     */
    public java.lang.String getUserdefinedtype2() {
        return userdefinedtype2;
    }


    /**
     * Sets the userdefinedtype2 value for this SubscriptionRating.
     * 
     * @param userdefinedtype2
     */
    public void setUserdefinedtype2(java.lang.String userdefinedtype2) {
        this.userdefinedtype2 = userdefinedtype2;
    }


    /**
     * Gets the userdefinedtype3 value for this SubscriptionRating.
     * 
     * @return userdefinedtype3
     */
    public java.lang.String getUserdefinedtype3() {
        return userdefinedtype3;
    }


    /**
     * Sets the userdefinedtype3 value for this SubscriptionRating.
     * 
     * @param userdefinedtype3
     */
    public void setUserdefinedtype3(java.lang.String userdefinedtype3) {
        this.userdefinedtype3 = userdefinedtype3;
    }


    /**
     * Gets the userdefinedtype4 value for this SubscriptionRating.
     * 
     * @return userdefinedtype4
     */
    public java.lang.String getUserdefinedtype4() {
        return userdefinedtype4;
    }


    /**
     * Sets the userdefinedtype4 value for this SubscriptionRating.
     * 
     * @param userdefinedtype4
     */
    public void setUserdefinedtype4(java.lang.String userdefinedtype4) {
        this.userdefinedtype4 = userdefinedtype4;
    }


    /**
     * Gets the userdefinedtype5 value for this SubscriptionRating.
     * 
     * @return userdefinedtype5
     */
    public java.lang.String getUserdefinedtype5() {
        return userdefinedtype5;
    }


    /**
     * Sets the userdefinedtype5 value for this SubscriptionRating.
     * 
     * @param userdefinedtype5
     */
    public void setUserdefinedtype5(java.lang.String userdefinedtype5) {
        this.userdefinedtype5 = userdefinedtype5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionRating)) return false;
        SubscriptionRating other = (SubscriptionRating) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryPricePlanID==null && other.getPrimaryPricePlanID()==null) || 
             (this.primaryPricePlanID!=null &&
              this.primaryPricePlanID.equals(other.getPrimaryPricePlanID()))) &&
            ((this.pricePlanVersion==null && other.getPricePlanVersion()==null) || 
             (this.pricePlanVersion!=null &&
              this.pricePlanVersion.equals(other.getPricePlanVersion()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID()))) &&
            ((this.secondaryPricePlanID==null && other.getSecondaryPricePlanID()==null) || 
             (this.secondaryPricePlanID!=null &&
              this.secondaryPricePlanID.equals(other.getSecondaryPricePlanID()))) &&
            ((this.secondaryPricePlanStartDate==null && other.getSecondaryPricePlanStartDate()==null) || 
             (this.secondaryPricePlanStartDate!=null &&
              this.secondaryPricePlanStartDate.equals(other.getSecondaryPricePlanStartDate()))) &&
            ((this.secondaryPricePlanEndDate==null && other.getSecondaryPricePlanEndDate()==null) || 
             (this.secondaryPricePlanEndDate!=null &&
              this.secondaryPricePlanEndDate.equals(other.getSecondaryPricePlanEndDate()))) &&
            ((this.contractStartDate==null && other.getContractStartDate()==null) || 
             (this.contractStartDate!=null &&
              this.contractStartDate.equals(other.getContractStartDate()))) &&
            ((this.enabledOptionalServices==null && other.getEnabledOptionalServices()==null) || 
             (this.enabledOptionalServices!=null &&
              java.util.Arrays.equals(this.enabledOptionalServices, other.getEnabledOptionalServices()))) &&
            ((this.enabledOptionalBundles==null && other.getEnabledOptionalBundles()==null) || 
             (this.enabledOptionalBundles!=null &&
              java.util.Arrays.equals(this.enabledOptionalBundles, other.getEnabledOptionalBundles()))) &&
            ((this.enabledOptionalPackages==null && other.getEnabledOptionalPackages()==null) || 
             (this.enabledOptionalPackages!=null &&
              java.util.Arrays.equals(this.enabledOptionalPackages, other.getEnabledOptionalPackages()))) &&
            ((this.enabledAuxiliaryServices==null && other.getEnabledAuxiliaryServices()==null) || 
             (this.enabledAuxiliaryServices!=null &&
              java.util.Arrays.equals(this.enabledAuxiliaryServices, other.getEnabledAuxiliaryServices()))) &&
            ((this.enabledAuxiliaryBundles==null && other.getEnabledAuxiliaryBundles()==null) || 
             (this.enabledAuxiliaryBundles!=null &&
              java.util.Arrays.equals(this.enabledAuxiliaryBundles, other.getEnabledAuxiliaryBundles()))) &&
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
        if (getPrimaryPricePlanID() != null) {
            _hashCode += getPrimaryPricePlanID().hashCode();
        }
        if (getPricePlanVersion() != null) {
            _hashCode += getPricePlanVersion().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        if (getSecondaryPricePlanID() != null) {
            _hashCode += getSecondaryPricePlanID().hashCode();
        }
        if (getSecondaryPricePlanStartDate() != null) {
            _hashCode += getSecondaryPricePlanStartDate().hashCode();
        }
        if (getSecondaryPricePlanEndDate() != null) {
            _hashCode += getSecondaryPricePlanEndDate().hashCode();
        }
        if (getContractStartDate() != null) {
            _hashCode += getContractStartDate().hashCode();
        }
        if (getEnabledOptionalServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnabledOptionalServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnabledOptionalServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnabledOptionalBundles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnabledOptionalBundles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnabledOptionalBundles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnabledOptionalPackages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnabledOptionalPackages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnabledOptionalPackages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnabledAuxiliaryServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnabledAuxiliaryServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnabledAuxiliaryServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnabledAuxiliaryBundles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnabledAuxiliaryBundles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnabledAuxiliaryBundles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(SubscriptionRating.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionRating"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPricePlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "primaryPricePlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "pricePlanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "contractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryPricePlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "secondaryPricePlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryPricePlanStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "secondaryPricePlanStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryPricePlanEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "secondaryPricePlanEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "contractStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledOptionalServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "enabledOptionalServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledOptionalBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "enabledOptionalBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledOptionalPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "enabledOptionalPackages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledAuxiliaryServices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "enabledAuxiliaryServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledAuxiliaryBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "enabledAuxiliaryBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
