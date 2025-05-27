/**
 * GetSubDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.SubscriberManagement_xsd;

public class GetSubDataResponse  implements java.io.Serializable {
    private java.lang.String activationDate;

    private java.lang.String accountStatus;

    private java.lang.String prepaidAccountBalance;

    private java.lang.String SIM;

    private java.lang.Long IMSI;

    private java.lang.String MSISDN;

    private java.lang.String expirationDate;

    private java.lang.String cancelationDate;

    private java.lang.String graceperiod1;

    private java.lang.String graceperiod2;

    private java.lang.String USSDLangId;

    private java.lang.String USSDLangName;

    private java.lang.String IVRLangId;

    private java.lang.String IVRLangName;

    private java.lang.String validityDate;

    private java.lang.String isPorted;

    private java.lang.String postpaidAccountBalance;

    private java.lang.String idValue;

    private java.lang.String networkId;

    private java.lang.String lowBalThreshold1;

    private java.lang.String lowBalThreshold2;

    private java.lang.String lowBalThreshold3;

    private java.lang.String lowBalThreshold4;

    private java.lang.String accountType;

    private java.lang.String creditLimit;

    private java.lang.String availableCredit;

    private java.lang.Long accountID;

    private java.lang.String tpName;

    public GetSubDataResponse() {
    }

    public GetSubDataResponse(
           java.lang.String activationDate,
           java.lang.String accountStatus,
           java.lang.String prepaidAccountBalance,
           java.lang.String SIM,
           java.lang.Long IMSI,
           java.lang.String MSISDN,
           java.lang.String expirationDate,
           java.lang.String cancelationDate,
           java.lang.String graceperiod1,
           java.lang.String graceperiod2,
           java.lang.String USSDLangId,
           java.lang.String USSDLangName,
           java.lang.String IVRLangId,
           java.lang.String IVRLangName,
           java.lang.String validityDate,
           java.lang.String isPorted,
           java.lang.String postpaidAccountBalance,
           java.lang.String idValue,
           java.lang.String networkId,
           java.lang.String lowBalThreshold1,
           java.lang.String lowBalThreshold2,
           java.lang.String lowBalThreshold3,
           java.lang.String lowBalThreshold4,
           java.lang.String accountType,
           java.lang.String creditLimit,
           java.lang.String availableCredit,
           java.lang.Long accountID,
           java.lang.String tpName) {
           this.activationDate = activationDate;
           this.accountStatus = accountStatus;
           this.prepaidAccountBalance = prepaidAccountBalance;
           this.SIM = SIM;
           this.IMSI = IMSI;
           this.MSISDN = MSISDN;
           this.expirationDate = expirationDate;
           this.cancelationDate = cancelationDate;
           this.graceperiod1 = graceperiod1;
           this.graceperiod2 = graceperiod2;
           this.USSDLangId = USSDLangId;
           this.USSDLangName = USSDLangName;
           this.IVRLangId = IVRLangId;
           this.IVRLangName = IVRLangName;
           this.validityDate = validityDate;
           this.isPorted = isPorted;
           this.postpaidAccountBalance = postpaidAccountBalance;
           this.idValue = idValue;
           this.networkId = networkId;
           this.lowBalThreshold1 = lowBalThreshold1;
           this.lowBalThreshold2 = lowBalThreshold2;
           this.lowBalThreshold3 = lowBalThreshold3;
           this.lowBalThreshold4 = lowBalThreshold4;
           this.accountType = accountType;
           this.creditLimit = creditLimit;
           this.availableCredit = availableCredit;
           this.accountID = accountID;
           this.tpName = tpName;
    }


    /**
     * Gets the activationDate value for this GetSubDataResponse.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this GetSubDataResponse.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the accountStatus value for this GetSubDataResponse.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this GetSubDataResponse.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the prepaidAccountBalance value for this GetSubDataResponse.
     * 
     * @return prepaidAccountBalance
     */
    public java.lang.String getPrepaidAccountBalance() {
        return prepaidAccountBalance;
    }


    /**
     * Sets the prepaidAccountBalance value for this GetSubDataResponse.
     * 
     * @param prepaidAccountBalance
     */
    public void setPrepaidAccountBalance(java.lang.String prepaidAccountBalance) {
        this.prepaidAccountBalance = prepaidAccountBalance;
    }


    /**
     * Gets the SIM value for this GetSubDataResponse.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this GetSubDataResponse.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the IMSI value for this GetSubDataResponse.
     * 
     * @return IMSI
     */
    public java.lang.Long getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this GetSubDataResponse.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.Long IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the MSISDN value for this GetSubDataResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetSubDataResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the expirationDate value for this GetSubDataResponse.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this GetSubDataResponse.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the cancelationDate value for this GetSubDataResponse.
     * 
     * @return cancelationDate
     */
    public java.lang.String getCancelationDate() {
        return cancelationDate;
    }


    /**
     * Sets the cancelationDate value for this GetSubDataResponse.
     * 
     * @param cancelationDate
     */
    public void setCancelationDate(java.lang.String cancelationDate) {
        this.cancelationDate = cancelationDate;
    }


    /**
     * Gets the graceperiod1 value for this GetSubDataResponse.
     * 
     * @return graceperiod1
     */
    public java.lang.String getGraceperiod1() {
        return graceperiod1;
    }


    /**
     * Sets the graceperiod1 value for this GetSubDataResponse.
     * 
     * @param graceperiod1
     */
    public void setGraceperiod1(java.lang.String graceperiod1) {
        this.graceperiod1 = graceperiod1;
    }


    /**
     * Gets the graceperiod2 value for this GetSubDataResponse.
     * 
     * @return graceperiod2
     */
    public java.lang.String getGraceperiod2() {
        return graceperiod2;
    }


    /**
     * Sets the graceperiod2 value for this GetSubDataResponse.
     * 
     * @param graceperiod2
     */
    public void setGraceperiod2(java.lang.String graceperiod2) {
        this.graceperiod2 = graceperiod2;
    }


    /**
     * Gets the USSDLangId value for this GetSubDataResponse.
     * 
     * @return USSDLangId
     */
    public java.lang.String getUSSDLangId() {
        return USSDLangId;
    }


    /**
     * Sets the USSDLangId value for this GetSubDataResponse.
     * 
     * @param USSDLangId
     */
    public void setUSSDLangId(java.lang.String USSDLangId) {
        this.USSDLangId = USSDLangId;
    }


    /**
     * Gets the USSDLangName value for this GetSubDataResponse.
     * 
     * @return USSDLangName
     */
    public java.lang.String getUSSDLangName() {
        return USSDLangName;
    }


    /**
     * Sets the USSDLangName value for this GetSubDataResponse.
     * 
     * @param USSDLangName
     */
    public void setUSSDLangName(java.lang.String USSDLangName) {
        this.USSDLangName = USSDLangName;
    }


    /**
     * Gets the IVRLangId value for this GetSubDataResponse.
     * 
     * @return IVRLangId
     */
    public java.lang.String getIVRLangId() {
        return IVRLangId;
    }


    /**
     * Sets the IVRLangId value for this GetSubDataResponse.
     * 
     * @param IVRLangId
     */
    public void setIVRLangId(java.lang.String IVRLangId) {
        this.IVRLangId = IVRLangId;
    }


    /**
     * Gets the IVRLangName value for this GetSubDataResponse.
     * 
     * @return IVRLangName
     */
    public java.lang.String getIVRLangName() {
        return IVRLangName;
    }


    /**
     * Sets the IVRLangName value for this GetSubDataResponse.
     * 
     * @param IVRLangName
     */
    public void setIVRLangName(java.lang.String IVRLangName) {
        this.IVRLangName = IVRLangName;
    }


    /**
     * Gets the validityDate value for this GetSubDataResponse.
     * 
     * @return validityDate
     */
    public java.lang.String getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this GetSubDataResponse.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.lang.String validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the isPorted value for this GetSubDataResponse.
     * 
     * @return isPorted
     */
    public java.lang.String getIsPorted() {
        return isPorted;
    }


    /**
     * Sets the isPorted value for this GetSubDataResponse.
     * 
     * @param isPorted
     */
    public void setIsPorted(java.lang.String isPorted) {
        this.isPorted = isPorted;
    }


    /**
     * Gets the postpaidAccountBalance value for this GetSubDataResponse.
     * 
     * @return postpaidAccountBalance
     */
    public java.lang.String getPostpaidAccountBalance() {
        return postpaidAccountBalance;
    }


    /**
     * Sets the postpaidAccountBalance value for this GetSubDataResponse.
     * 
     * @param postpaidAccountBalance
     */
    public void setPostpaidAccountBalance(java.lang.String postpaidAccountBalance) {
        this.postpaidAccountBalance = postpaidAccountBalance;
    }


    /**
     * Gets the idValue value for this GetSubDataResponse.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this GetSubDataResponse.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the networkId value for this GetSubDataResponse.
     * 
     * @return networkId
     */
    public java.lang.String getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this GetSubDataResponse.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.String networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the lowBalThreshold1 value for this GetSubDataResponse.
     * 
     * @return lowBalThreshold1
     */
    public java.lang.String getLowBalThreshold1() {
        return lowBalThreshold1;
    }


    /**
     * Sets the lowBalThreshold1 value for this GetSubDataResponse.
     * 
     * @param lowBalThreshold1
     */
    public void setLowBalThreshold1(java.lang.String lowBalThreshold1) {
        this.lowBalThreshold1 = lowBalThreshold1;
    }


    /**
     * Gets the lowBalThreshold2 value for this GetSubDataResponse.
     * 
     * @return lowBalThreshold2
     */
    public java.lang.String getLowBalThreshold2() {
        return lowBalThreshold2;
    }


    /**
     * Sets the lowBalThreshold2 value for this GetSubDataResponse.
     * 
     * @param lowBalThreshold2
     */
    public void setLowBalThreshold2(java.lang.String lowBalThreshold2) {
        this.lowBalThreshold2 = lowBalThreshold2;
    }


    /**
     * Gets the lowBalThreshold3 value for this GetSubDataResponse.
     * 
     * @return lowBalThreshold3
     */
    public java.lang.String getLowBalThreshold3() {
        return lowBalThreshold3;
    }


    /**
     * Sets the lowBalThreshold3 value for this GetSubDataResponse.
     * 
     * @param lowBalThreshold3
     */
    public void setLowBalThreshold3(java.lang.String lowBalThreshold3) {
        this.lowBalThreshold3 = lowBalThreshold3;
    }


    /**
     * Gets the lowBalThreshold4 value for this GetSubDataResponse.
     * 
     * @return lowBalThreshold4
     */
    public java.lang.String getLowBalThreshold4() {
        return lowBalThreshold4;
    }


    /**
     * Sets the lowBalThreshold4 value for this GetSubDataResponse.
     * 
     * @param lowBalThreshold4
     */
    public void setLowBalThreshold4(java.lang.String lowBalThreshold4) {
        this.lowBalThreshold4 = lowBalThreshold4;
    }


    /**
     * Gets the accountType value for this GetSubDataResponse.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this GetSubDataResponse.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the creditLimit value for this GetSubDataResponse.
     * 
     * @return creditLimit
     */
    public java.lang.String getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this GetSubDataResponse.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.String creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the availableCredit value for this GetSubDataResponse.
     * 
     * @return availableCredit
     */
    public java.lang.String getAvailableCredit() {
        return availableCredit;
    }


    /**
     * Sets the availableCredit value for this GetSubDataResponse.
     * 
     * @param availableCredit
     */
    public void setAvailableCredit(java.lang.String availableCredit) {
        this.availableCredit = availableCredit;
    }


    /**
     * Gets the accountID value for this GetSubDataResponse.
     * 
     * @return accountID
     */
    public java.lang.Long getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this GetSubDataResponse.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.Long accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the tpName value for this GetSubDataResponse.
     * 
     * @return tpName
     */
    public java.lang.String getTpName() {
        return tpName;
    }


    /**
     * Sets the tpName value for this GetSubDataResponse.
     * 
     * @param tpName
     */
    public void setTpName(java.lang.String tpName) {
        this.tpName = tpName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubDataResponse)) return false;
        GetSubDataResponse other = (GetSubDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.prepaidAccountBalance==null && other.getPrepaidAccountBalance()==null) || 
             (this.prepaidAccountBalance!=null &&
              this.prepaidAccountBalance.equals(other.getPrepaidAccountBalance()))) &&
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.cancelationDate==null && other.getCancelationDate()==null) || 
             (this.cancelationDate!=null &&
              this.cancelationDate.equals(other.getCancelationDate()))) &&
            ((this.graceperiod1==null && other.getGraceperiod1()==null) || 
             (this.graceperiod1!=null &&
              this.graceperiod1.equals(other.getGraceperiod1()))) &&
            ((this.graceperiod2==null && other.getGraceperiod2()==null) || 
             (this.graceperiod2!=null &&
              this.graceperiod2.equals(other.getGraceperiod2()))) &&
            ((this.USSDLangId==null && other.getUSSDLangId()==null) || 
             (this.USSDLangId!=null &&
              this.USSDLangId.equals(other.getUSSDLangId()))) &&
            ((this.USSDLangName==null && other.getUSSDLangName()==null) || 
             (this.USSDLangName!=null &&
              this.USSDLangName.equals(other.getUSSDLangName()))) &&
            ((this.IVRLangId==null && other.getIVRLangId()==null) || 
             (this.IVRLangId!=null &&
              this.IVRLangId.equals(other.getIVRLangId()))) &&
            ((this.IVRLangName==null && other.getIVRLangName()==null) || 
             (this.IVRLangName!=null &&
              this.IVRLangName.equals(other.getIVRLangName()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.isPorted==null && other.getIsPorted()==null) || 
             (this.isPorted!=null &&
              this.isPorted.equals(other.getIsPorted()))) &&
            ((this.postpaidAccountBalance==null && other.getPostpaidAccountBalance()==null) || 
             (this.postpaidAccountBalance!=null &&
              this.postpaidAccountBalance.equals(other.getPostpaidAccountBalance()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.lowBalThreshold1==null && other.getLowBalThreshold1()==null) || 
             (this.lowBalThreshold1!=null &&
              this.lowBalThreshold1.equals(other.getLowBalThreshold1()))) &&
            ((this.lowBalThreshold2==null && other.getLowBalThreshold2()==null) || 
             (this.lowBalThreshold2!=null &&
              this.lowBalThreshold2.equals(other.getLowBalThreshold2()))) &&
            ((this.lowBalThreshold3==null && other.getLowBalThreshold3()==null) || 
             (this.lowBalThreshold3!=null &&
              this.lowBalThreshold3.equals(other.getLowBalThreshold3()))) &&
            ((this.lowBalThreshold4==null && other.getLowBalThreshold4()==null) || 
             (this.lowBalThreshold4!=null &&
              this.lowBalThreshold4.equals(other.getLowBalThreshold4()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.availableCredit==null && other.getAvailableCredit()==null) || 
             (this.availableCredit!=null &&
              this.availableCredit.equals(other.getAvailableCredit()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.tpName==null && other.getTpName()==null) || 
             (this.tpName!=null &&
              this.tpName.equals(other.getTpName())));
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
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getPrepaidAccountBalance() != null) {
            _hashCode += getPrepaidAccountBalance().hashCode();
        }
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getCancelationDate() != null) {
            _hashCode += getCancelationDate().hashCode();
        }
        if (getGraceperiod1() != null) {
            _hashCode += getGraceperiod1().hashCode();
        }
        if (getGraceperiod2() != null) {
            _hashCode += getGraceperiod2().hashCode();
        }
        if (getUSSDLangId() != null) {
            _hashCode += getUSSDLangId().hashCode();
        }
        if (getUSSDLangName() != null) {
            _hashCode += getUSSDLangName().hashCode();
        }
        if (getIVRLangId() != null) {
            _hashCode += getIVRLangId().hashCode();
        }
        if (getIVRLangName() != null) {
            _hashCode += getIVRLangName().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getIsPorted() != null) {
            _hashCode += getIsPorted().hashCode();
        }
        if (getPostpaidAccountBalance() != null) {
            _hashCode += getPostpaidAccountBalance().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getLowBalThreshold1() != null) {
            _hashCode += getLowBalThreshold1().hashCode();
        }
        if (getLowBalThreshold2() != null) {
            _hashCode += getLowBalThreshold2().hashCode();
        }
        if (getLowBalThreshold3() != null) {
            _hashCode += getLowBalThreshold3().hashCode();
        }
        if (getLowBalThreshold4() != null) {
            _hashCode += getLowBalThreshold4().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getAvailableCredit() != null) {
            _hashCode += getAvailableCredit().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getTpName() != null) {
            _hashCode += getTpName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ActivationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PrepaidAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "CancelationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graceperiod1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Graceperiod1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graceperiod2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Graceperiod2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USSDLangId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "USSDLangId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USSDLangName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "USSDLangName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRLangId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IVRLangId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRLangName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IVRLangName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "validityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPorted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "isPorted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostpaidAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IdValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowBalThreshold1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lowBalThreshold1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowBalThreshold2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lowBalThreshold2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowBalThreshold3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lowBalThreshold3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowBalThreshold4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "lowBalThreshold4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availableCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tpName"));
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
