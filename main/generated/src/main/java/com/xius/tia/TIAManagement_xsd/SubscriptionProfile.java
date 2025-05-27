/**
 * SubscriptionProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.tia.TIAManagement_xsd;

public class SubscriptionProfile  implements java.io.Serializable {
    private java.lang.String created;

    private java.lang.String lastmodified;

    private java.lang.String additionalMSISDNS;

    private java.lang.String identifier;

    private java.lang.Integer subscriptionType;

    private java.lang.Long subscriptionClass;

    private java.lang.Long accountID;

    private java.math.BigInteger spID;

    private java.lang.String paidType;

    private java.lang.String MSISDN;

    private java.lang.String ICCID;

    private java.lang.String technologyType;

    private java.lang.Long hlrID;

    private java.lang.Long poolLimitStrategy;

    private java.lang.Double poolLimit;

    private java.lang.String notificationPreference;

    private java.lang.String userdefinedtype1;

    private java.lang.String userdefinedtype2;

    private java.lang.String userdefinedtype3;

    private java.lang.String userdefinedtype4;

    private java.lang.String userdefinedtype5;

    public SubscriptionProfile() {
    }

    public SubscriptionProfile(
           java.lang.String created,
           java.lang.String lastmodified,
           java.lang.String additionalMSISDNS,
           java.lang.String identifier,
           java.lang.Integer subscriptionType,
           java.lang.Long subscriptionClass,
           java.lang.Long accountID,
           java.math.BigInteger spID,
           java.lang.String paidType,
           java.lang.String MSISDN,
           java.lang.String ICCID,
           java.lang.String technologyType,
           java.lang.Long hlrID,
           java.lang.Long poolLimitStrategy,
           java.lang.Double poolLimit,
           java.lang.String notificationPreference,
           java.lang.String userdefinedtype1,
           java.lang.String userdefinedtype2,
           java.lang.String userdefinedtype3,
           java.lang.String userdefinedtype4,
           java.lang.String userdefinedtype5) {
           this.created = created;
           this.lastmodified = lastmodified;
           this.additionalMSISDNS = additionalMSISDNS;
           this.identifier = identifier;
           this.subscriptionType = subscriptionType;
           this.subscriptionClass = subscriptionClass;
           this.accountID = accountID;
           this.spID = spID;
           this.paidType = paidType;
           this.MSISDN = MSISDN;
           this.ICCID = ICCID;
           this.technologyType = technologyType;
           this.hlrID = hlrID;
           this.poolLimitStrategy = poolLimitStrategy;
           this.poolLimit = poolLimit;
           this.notificationPreference = notificationPreference;
           this.userdefinedtype1 = userdefinedtype1;
           this.userdefinedtype2 = userdefinedtype2;
           this.userdefinedtype3 = userdefinedtype3;
           this.userdefinedtype4 = userdefinedtype4;
           this.userdefinedtype5 = userdefinedtype5;
    }


    /**
     * Gets the created value for this SubscriptionProfile.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this SubscriptionProfile.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the lastmodified value for this SubscriptionProfile.
     * 
     * @return lastmodified
     */
    public java.lang.String getLastmodified() {
        return lastmodified;
    }


    /**
     * Sets the lastmodified value for this SubscriptionProfile.
     * 
     * @param lastmodified
     */
    public void setLastmodified(java.lang.String lastmodified) {
        this.lastmodified = lastmodified;
    }


    /**
     * Gets the additionalMSISDNS value for this SubscriptionProfile.
     * 
     * @return additionalMSISDNS
     */
    public java.lang.String getAdditionalMSISDNS() {
        return additionalMSISDNS;
    }


    /**
     * Sets the additionalMSISDNS value for this SubscriptionProfile.
     * 
     * @param additionalMSISDNS
     */
    public void setAdditionalMSISDNS(java.lang.String additionalMSISDNS) {
        this.additionalMSISDNS = additionalMSISDNS;
    }


    /**
     * Gets the identifier value for this SubscriptionProfile.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this SubscriptionProfile.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the subscriptionType value for this SubscriptionProfile.
     * 
     * @return subscriptionType
     */
    public java.lang.Integer getSubscriptionType() {
        return subscriptionType;
    }


    /**
     * Sets the subscriptionType value for this SubscriptionProfile.
     * 
     * @param subscriptionType
     */
    public void setSubscriptionType(java.lang.Integer subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    /**
     * Gets the subscriptionClass value for this SubscriptionProfile.
     * 
     * @return subscriptionClass
     */
    public java.lang.Long getSubscriptionClass() {
        return subscriptionClass;
    }


    /**
     * Sets the subscriptionClass value for this SubscriptionProfile.
     * 
     * @param subscriptionClass
     */
    public void setSubscriptionClass(java.lang.Long subscriptionClass) {
        this.subscriptionClass = subscriptionClass;
    }


    /**
     * Gets the accountID value for this SubscriptionProfile.
     * 
     * @return accountID
     */
    public java.lang.Long getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this SubscriptionProfile.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Long accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the spID value for this SubscriptionProfile.
     * 
     * @return spID
     */
    public java.math.BigInteger getSpID() {
        return spID;
    }


    /**
     * Sets the spID value for this SubscriptionProfile.
     * 
     * @param spID
     */
    public void setSpID(java.math.BigInteger spID) {
        this.spID = spID;
    }


    /**
     * Gets the paidType value for this SubscriptionProfile.
     * 
     * @return paidType
     */
    public java.lang.String getPaidType() {
        return paidType;
    }


    /**
     * Sets the paidType value for this SubscriptionProfile.
     * 
     * @param paidType
     */
    public void setPaidType(java.lang.String paidType) {
        this.paidType = paidType;
    }


    /**
     * Gets the MSISDN value for this SubscriptionProfile.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this SubscriptionProfile.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the ICCID value for this SubscriptionProfile.
     * 
     * @return ICCID
     */
    public java.lang.String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this SubscriptionProfile.
     * 
     * @param ICCID
     */
    public void setICCID(java.lang.String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the technologyType value for this SubscriptionProfile.
     * 
     * @return technologyType
     */
    public java.lang.String getTechnologyType() {
        return technologyType;
    }


    /**
     * Sets the technologyType value for this SubscriptionProfile.
     * 
     * @param technologyType
     */
    public void setTechnologyType(java.lang.String technologyType) {
        this.technologyType = technologyType;
    }


    /**
     * Gets the hlrID value for this SubscriptionProfile.
     * 
     * @return hlrID
     */
    public java.lang.Long getHlrID() {
        return hlrID;
    }


    /**
     * Sets the hlrID value for this SubscriptionProfile.
     * 
     * @param hlrID
     */
    public void setHlrID(java.lang.Long hlrID) {
        this.hlrID = hlrID;
    }


    /**
     * Gets the poolLimitStrategy value for this SubscriptionProfile.
     * 
     * @return poolLimitStrategy
     */
    public java.lang.Long getPoolLimitStrategy() {
        return poolLimitStrategy;
    }


    /**
     * Sets the poolLimitStrategy value for this SubscriptionProfile.
     * 
     * @param poolLimitStrategy
     */
    public void setPoolLimitStrategy(java.lang.Long poolLimitStrategy) {
        this.poolLimitStrategy = poolLimitStrategy;
    }


    /**
     * Gets the poolLimit value for this SubscriptionProfile.
     * 
     * @return poolLimit
     */
    public java.lang.Double getPoolLimit() {
        return poolLimit;
    }


    /**
     * Sets the poolLimit value for this SubscriptionProfile.
     * 
     * @param poolLimit
     */
    public void setPoolLimit(java.lang.Double poolLimit) {
        this.poolLimit = poolLimit;
    }


    /**
     * Gets the notificationPreference value for this SubscriptionProfile.
     * 
     * @return notificationPreference
     */
    public java.lang.String getNotificationPreference() {
        return notificationPreference;
    }


    /**
     * Sets the notificationPreference value for this SubscriptionProfile.
     * 
     * @param notificationPreference
     */
    public void setNotificationPreference(java.lang.String notificationPreference) {
        this.notificationPreference = notificationPreference;
    }


    /**
     * Gets the userdefinedtype1 value for this SubscriptionProfile.
     * 
     * @return userdefinedtype1
     */
    public java.lang.String getUserdefinedtype1() {
        return userdefinedtype1;
    }


    /**
     * Sets the userdefinedtype1 value for this SubscriptionProfile.
     * 
     * @param userdefinedtype1
     */
    public void setUserdefinedtype1(java.lang.String userdefinedtype1) {
        this.userdefinedtype1 = userdefinedtype1;
    }


    /**
     * Gets the userdefinedtype2 value for this SubscriptionProfile.
     * 
     * @return userdefinedtype2
     */
    public java.lang.String getUserdefinedtype2() {
        return userdefinedtype2;
    }


    /**
     * Sets the userdefinedtype2 value for this SubscriptionProfile.
     * 
     * @param userdefinedtype2
     */
    public void setUserdefinedtype2(java.lang.String userdefinedtype2) {
        this.userdefinedtype2 = userdefinedtype2;
    }


    /**
     * Gets the userdefinedtype3 value for this SubscriptionProfile.
     * 
     * @return userdefinedtype3
     */
    public java.lang.String getUserdefinedtype3() {
        return userdefinedtype3;
    }


    /**
     * Sets the userdefinedtype3 value for this SubscriptionProfile.
     * 
     * @param userdefinedtype3
     */
    public void setUserdefinedtype3(java.lang.String userdefinedtype3) {
        this.userdefinedtype3 = userdefinedtype3;
    }


    /**
     * Gets the userdefinedtype4 value for this SubscriptionProfile.
     * 
     * @return userdefinedtype4
     */
    public java.lang.String getUserdefinedtype4() {
        return userdefinedtype4;
    }


    /**
     * Sets the userdefinedtype4 value for this SubscriptionProfile.
     * 
     * @param userdefinedtype4
     */
    public void setUserdefinedtype4(java.lang.String userdefinedtype4) {
        this.userdefinedtype4 = userdefinedtype4;
    }


    /**
     * Gets the userdefinedtype5 value for this SubscriptionProfile.
     * 
     * @return userdefinedtype5
     */
    public java.lang.String getUserdefinedtype5() {
        return userdefinedtype5;
    }


    /**
     * Sets the userdefinedtype5 value for this SubscriptionProfile.
     * 
     * @param userdefinedtype5
     */
    public void setUserdefinedtype5(java.lang.String userdefinedtype5) {
        this.userdefinedtype5 = userdefinedtype5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionProfile)) return false;
        SubscriptionProfile other = (SubscriptionProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.lastmodified==null && other.getLastmodified()==null) || 
             (this.lastmodified!=null &&
              this.lastmodified.equals(other.getLastmodified()))) &&
            ((this.additionalMSISDNS==null && other.getAdditionalMSISDNS()==null) || 
             (this.additionalMSISDNS!=null &&
              this.additionalMSISDNS.equals(other.getAdditionalMSISDNS()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.subscriptionType==null && other.getSubscriptionType()==null) || 
             (this.subscriptionType!=null &&
              this.subscriptionType.equals(other.getSubscriptionType()))) &&
            ((this.subscriptionClass==null && other.getSubscriptionClass()==null) || 
             (this.subscriptionClass!=null &&
              this.subscriptionClass.equals(other.getSubscriptionClass()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.spID==null && other.getSpID()==null) || 
             (this.spID!=null &&
              this.spID.equals(other.getSpID()))) &&
            ((this.paidType==null && other.getPaidType()==null) || 
             (this.paidType!=null &&
              this.paidType.equals(other.getPaidType()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.technologyType==null && other.getTechnologyType()==null) || 
             (this.technologyType!=null &&
              this.technologyType.equals(other.getTechnologyType()))) &&
            ((this.hlrID==null && other.getHlrID()==null) || 
             (this.hlrID!=null &&
              this.hlrID.equals(other.getHlrID()))) &&
            ((this.poolLimitStrategy==null && other.getPoolLimitStrategy()==null) || 
             (this.poolLimitStrategy!=null &&
              this.poolLimitStrategy.equals(other.getPoolLimitStrategy()))) &&
            ((this.poolLimit==null && other.getPoolLimit()==null) || 
             (this.poolLimit!=null &&
              this.poolLimit.equals(other.getPoolLimit()))) &&
            ((this.notificationPreference==null && other.getNotificationPreference()==null) || 
             (this.notificationPreference!=null &&
              this.notificationPreference.equals(other.getNotificationPreference()))) &&
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
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getLastmodified() != null) {
            _hashCode += getLastmodified().hashCode();
        }
        if (getAdditionalMSISDNS() != null) {
            _hashCode += getAdditionalMSISDNS().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getSubscriptionType() != null) {
            _hashCode += getSubscriptionType().hashCode();
        }
        if (getSubscriptionClass() != null) {
            _hashCode += getSubscriptionClass().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getSpID() != null) {
            _hashCode += getSpID().hashCode();
        }
        if (getPaidType() != null) {
            _hashCode += getPaidType().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
        }
        if (getTechnologyType() != null) {
            _hashCode += getTechnologyType().hashCode();
        }
        if (getHlrID() != null) {
            _hashCode += getHlrID().hashCode();
        }
        if (getPoolLimitStrategy() != null) {
            _hashCode += getPoolLimitStrategy().hashCode();
        }
        if (getPoolLimit() != null) {
            _hashCode += getPoolLimit().hashCode();
        }
        if (getNotificationPreference() != null) {
            _hashCode += getNotificationPreference().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubscriptionProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "SubscriptionProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastmodified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "lastmodified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalMSISDNS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "additionalMSISDNS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "subscriptionClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "spID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "paidType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "ICCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technologyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "technologyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlrID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "hlrID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poolLimitStrategy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "poolLimitStrategy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poolLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "poolLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tia.xius.com/TIAManagement.xsd", "notificationPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
