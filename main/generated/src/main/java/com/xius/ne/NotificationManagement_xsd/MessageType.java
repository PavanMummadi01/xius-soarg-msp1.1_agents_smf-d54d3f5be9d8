/**
 * MessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.ne.NotificationManagement_xsd;

public class MessageType  implements java.io.Serializable {
    private java.math.BigInteger networkId;

    private java.lang.String eventReferenceCode;

    private java.lang.String loginId;

    private java.lang.String loginPassword;

    private java.lang.String syncFlag;

    private java.math.BigInteger languageId;

    private java.lang.String username;

    private java.lang.String password;

    private java.math.BigInteger idtype;

    private java.lang.String idvalue;

    private java.lang.Long msisdn1;

    private java.lang.Long msisdn2;

    private java.math.BigDecimal amount1;

    private java.math.BigDecimal amount2;

    private java.lang.String ordernumber;

    private java.util.Date date1;

    private java.util.Date date2;

    private java.lang.String sim1;

    private java.lang.String sim2;

    private java.lang.String portid;

    private java.lang.String portrequestformid;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    private java.lang.String userDefined3;

    private java.lang.String userDefined4;

    private java.lang.String userDefined5;

    private java.lang.String userDefined6;

    private java.lang.String userDefined7;

    private java.lang.String userDefined8;

    private java.lang.String emailTo;

    private java.lang.String emailFrom;

    private java.lang.String cc;

    private java.lang.String bcc;

    private java.lang.String subject;

    private java.lang.String destMSISDNs;

    private java.lang.String IMSIs;

    private java.lang.String clientTransId;

    public MessageType() {
    }

    public MessageType(
           java.math.BigInteger networkId,
           java.lang.String eventReferenceCode,
           java.lang.String loginId,
           java.lang.String loginPassword,
           java.lang.String syncFlag,
           java.math.BigInteger languageId,
           java.lang.String username,
           java.lang.String password,
           java.math.BigInteger idtype,
           java.lang.String idvalue,
           java.lang.Long msisdn1,
           java.lang.Long msisdn2,
           java.math.BigDecimal amount1,
           java.math.BigDecimal amount2,
           java.lang.String ordernumber,
           java.util.Date date1,
           java.util.Date date2,
           java.lang.String sim1,
           java.lang.String sim2,
           java.lang.String portid,
           java.lang.String portrequestformid,
           java.lang.String userDefined1,
           java.lang.String userDefined2,
           java.lang.String userDefined3,
           java.lang.String userDefined4,
           java.lang.String userDefined5,
           java.lang.String userDefined6,
           java.lang.String userDefined7,
           java.lang.String userDefined8,
           java.lang.String emailTo,
           java.lang.String emailFrom,
           java.lang.String cc,
           java.lang.String bcc,
           java.lang.String subject,
           java.lang.String destMSISDNs,
           java.lang.String IMSIs,
           java.lang.String clientTransId) {
           this.networkId = networkId;
           this.eventReferenceCode = eventReferenceCode;
           this.loginId = loginId;
           this.loginPassword = loginPassword;
           this.syncFlag = syncFlag;
           this.languageId = languageId;
           this.username = username;
           this.password = password;
           this.idtype = idtype;
           this.idvalue = idvalue;
           this.msisdn1 = msisdn1;
           this.msisdn2 = msisdn2;
           this.amount1 = amount1;
           this.amount2 = amount2;
           this.ordernumber = ordernumber;
           this.date1 = date1;
           this.date2 = date2;
           this.sim1 = sim1;
           this.sim2 = sim2;
           this.portid = portid;
           this.portrequestformid = portrequestformid;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
           this.userDefined3 = userDefined3;
           this.userDefined4 = userDefined4;
           this.userDefined5 = userDefined5;
           this.userDefined6 = userDefined6;
           this.userDefined7 = userDefined7;
           this.userDefined8 = userDefined8;
           this.emailTo = emailTo;
           this.emailFrom = emailFrom;
           this.cc = cc;
           this.bcc = bcc;
           this.subject = subject;
           this.destMSISDNs = destMSISDNs;
           this.IMSIs = IMSIs;
           this.clientTransId = clientTransId;
    }


    /**
     * Gets the networkId value for this MessageType.
     * 
     * @return networkId
     */
    public java.math.BigInteger getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this MessageType.
     * 
     * @param networkId
     */
    public void setNetworkId(java.math.BigInteger networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the eventReferenceCode value for this MessageType.
     * 
     * @return eventReferenceCode
     */
    public java.lang.String getEventReferenceCode() {
        return eventReferenceCode;
    }


    /**
     * Sets the eventReferenceCode value for this MessageType.
     * 
     * @param eventReferenceCode
     */
    public void setEventReferenceCode(java.lang.String eventReferenceCode) {
        this.eventReferenceCode = eventReferenceCode;
    }


    /**
     * Gets the loginId value for this MessageType.
     * 
     * @return loginId
     */
    public java.lang.String getLoginId() {
        return loginId;
    }


    /**
     * Sets the loginId value for this MessageType.
     * 
     * @param loginId
     */
    public void setLoginId(java.lang.String loginId) {
        this.loginId = loginId;
    }


    /**
     * Gets the loginPassword value for this MessageType.
     * 
     * @return loginPassword
     */
    public java.lang.String getLoginPassword() {
        return loginPassword;
    }


    /**
     * Sets the loginPassword value for this MessageType.
     * 
     * @param loginPassword
     */
    public void setLoginPassword(java.lang.String loginPassword) {
        this.loginPassword = loginPassword;
    }


    /**
     * Gets the syncFlag value for this MessageType.
     * 
     * @return syncFlag
     */
    public java.lang.String getSyncFlag() {
        return syncFlag;
    }


    /**
     * Sets the syncFlag value for this MessageType.
     * 
     * @param syncFlag
     */
    public void setSyncFlag(java.lang.String syncFlag) {
        this.syncFlag = syncFlag;
    }


    /**
     * Gets the languageId value for this MessageType.
     * 
     * @return languageId
     */
    public java.math.BigInteger getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this MessageType.
     * 
     * @param languageId
     */
    public void setLanguageId(java.math.BigInteger languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the username value for this MessageType.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this MessageType.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this MessageType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this MessageType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the idtype value for this MessageType.
     * 
     * @return idtype
     */
    public java.math.BigInteger getIdtype() {
        return idtype;
    }


    /**
     * Sets the idtype value for this MessageType.
     * 
     * @param idtype
     */
    public void setIdtype(java.math.BigInteger idtype) {
        this.idtype = idtype;
    }


    /**
     * Gets the idvalue value for this MessageType.
     * 
     * @return idvalue
     */
    public java.lang.String getIdvalue() {
        return idvalue;
    }


    /**
     * Sets the idvalue value for this MessageType.
     * 
     * @param idvalue
     */
    public void setIdvalue(java.lang.String idvalue) {
        this.idvalue = idvalue;
    }


    /**
     * Gets the msisdn1 value for this MessageType.
     * 
     * @return msisdn1
     */
    public java.lang.Long getMsisdn1() {
        return msisdn1;
    }


    /**
     * Sets the msisdn1 value for this MessageType.
     * 
     * @param msisdn1
     */
    public void setMsisdn1(java.lang.Long msisdn1) {
        this.msisdn1 = msisdn1;
    }


    /**
     * Gets the msisdn2 value for this MessageType.
     * 
     * @return msisdn2
     */
    public java.lang.Long getMsisdn2() {
        return msisdn2;
    }


    /**
     * Sets the msisdn2 value for this MessageType.
     * 
     * @param msisdn2
     */
    public void setMsisdn2(java.lang.Long msisdn2) {
        this.msisdn2 = msisdn2;
    }


    /**
     * Gets the amount1 value for this MessageType.
     * 
     * @return amount1
     */
    public java.math.BigDecimal getAmount1() {
        return amount1;
    }


    /**
     * Sets the amount1 value for this MessageType.
     * 
     * @param amount1
     */
    public void setAmount1(java.math.BigDecimal amount1) {
        this.amount1 = amount1;
    }


    /**
     * Gets the amount2 value for this MessageType.
     * 
     * @return amount2
     */
    public java.math.BigDecimal getAmount2() {
        return amount2;
    }


    /**
     * Sets the amount2 value for this MessageType.
     * 
     * @param amount2
     */
    public void setAmount2(java.math.BigDecimal amount2) {
        this.amount2 = amount2;
    }


    /**
     * Gets the ordernumber value for this MessageType.
     * 
     * @return ordernumber
     */
    public java.lang.String getOrdernumber() {
        return ordernumber;
    }


    /**
     * Sets the ordernumber value for this MessageType.
     * 
     * @param ordernumber
     */
    public void setOrdernumber(java.lang.String ordernumber) {
        this.ordernumber = ordernumber;
    }


    /**
     * Gets the date1 value for this MessageType.
     * 
     * @return date1
     */
    public java.util.Date getDate1() {
        return date1;
    }


    /**
     * Sets the date1 value for this MessageType.
     * 
     * @param date1
     */
    public void setDate1(java.util.Date date1) {
        this.date1 = date1;
    }


    /**
     * Gets the date2 value for this MessageType.
     * 
     * @return date2
     */
    public java.util.Date getDate2() {
        return date2;
    }


    /**
     * Sets the date2 value for this MessageType.
     * 
     * @param date2
     */
    public void setDate2(java.util.Date date2) {
        this.date2 = date2;
    }


    /**
     * Gets the sim1 value for this MessageType.
     * 
     * @return sim1
     */
    public java.lang.String getSim1() {
        return sim1;
    }


    /**
     * Sets the sim1 value for this MessageType.
     * 
     * @param sim1
     */
    public void setSim1(java.lang.String sim1) {
        this.sim1 = sim1;
    }


    /**
     * Gets the sim2 value for this MessageType.
     * 
     * @return sim2
     */
    public java.lang.String getSim2() {
        return sim2;
    }


    /**
     * Sets the sim2 value for this MessageType.
     * 
     * @param sim2
     */
    public void setSim2(java.lang.String sim2) {
        this.sim2 = sim2;
    }


    /**
     * Gets the portid value for this MessageType.
     * 
     * @return portid
     */
    public java.lang.String getPortid() {
        return portid;
    }


    /**
     * Sets the portid value for this MessageType.
     * 
     * @param portid
     */
    public void setPortid(java.lang.String portid) {
        this.portid = portid;
    }


    /**
     * Gets the portrequestformid value for this MessageType.
     * 
     * @return portrequestformid
     */
    public java.lang.String getPortrequestformid() {
        return portrequestformid;
    }


    /**
     * Sets the portrequestformid value for this MessageType.
     * 
     * @param portrequestformid
     */
    public void setPortrequestformid(java.lang.String portrequestformid) {
        this.portrequestformid = portrequestformid;
    }


    /**
     * Gets the userDefined1 value for this MessageType.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this MessageType.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this MessageType.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this MessageType.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }


    /**
     * Gets the userDefined3 value for this MessageType.
     * 
     * @return userDefined3
     */
    public java.lang.String getUserDefined3() {
        return userDefined3;
    }


    /**
     * Sets the userDefined3 value for this MessageType.
     * 
     * @param userDefined3
     */
    public void setUserDefined3(java.lang.String userDefined3) {
        this.userDefined3 = userDefined3;
    }


    /**
     * Gets the userDefined4 value for this MessageType.
     * 
     * @return userDefined4
     */
    public java.lang.String getUserDefined4() {
        return userDefined4;
    }


    /**
     * Sets the userDefined4 value for this MessageType.
     * 
     * @param userDefined4
     */
    public void setUserDefined4(java.lang.String userDefined4) {
        this.userDefined4 = userDefined4;
    }


    /**
     * Gets the userDefined5 value for this MessageType.
     * 
     * @return userDefined5
     */
    public java.lang.String getUserDefined5() {
        return userDefined5;
    }


    /**
     * Sets the userDefined5 value for this MessageType.
     * 
     * @param userDefined5
     */
    public void setUserDefined5(java.lang.String userDefined5) {
        this.userDefined5 = userDefined5;
    }


    /**
     * Gets the userDefined6 value for this MessageType.
     * 
     * @return userDefined6
     */
    public java.lang.String getUserDefined6() {
        return userDefined6;
    }


    /**
     * Sets the userDefined6 value for this MessageType.
     * 
     * @param userDefined6
     */
    public void setUserDefined6(java.lang.String userDefined6) {
        this.userDefined6 = userDefined6;
    }


    /**
     * Gets the userDefined7 value for this MessageType.
     * 
     * @return userDefined7
     */
    public java.lang.String getUserDefined7() {
        return userDefined7;
    }


    /**
     * Sets the userDefined7 value for this MessageType.
     * 
     * @param userDefined7
     */
    public void setUserDefined7(java.lang.String userDefined7) {
        this.userDefined7 = userDefined7;
    }


    /**
     * Gets the userDefined8 value for this MessageType.
     * 
     * @return userDefined8
     */
    public java.lang.String getUserDefined8() {
        return userDefined8;
    }


    /**
     * Sets the userDefined8 value for this MessageType.
     * 
     * @param userDefined8
     */
    public void setUserDefined8(java.lang.String userDefined8) {
        this.userDefined8 = userDefined8;
    }


    /**
     * Gets the emailTo value for this MessageType.
     * 
     * @return emailTo
     */
    public java.lang.String getEmailTo() {
        return emailTo;
    }


    /**
     * Sets the emailTo value for this MessageType.
     * 
     * @param emailTo
     */
    public void setEmailTo(java.lang.String emailTo) {
        this.emailTo = emailTo;
    }


    /**
     * Gets the emailFrom value for this MessageType.
     * 
     * @return emailFrom
     */
    public java.lang.String getEmailFrom() {
        return emailFrom;
    }


    /**
     * Sets the emailFrom value for this MessageType.
     * 
     * @param emailFrom
     */
    public void setEmailFrom(java.lang.String emailFrom) {
        this.emailFrom = emailFrom;
    }


    /**
     * Gets the cc value for this MessageType.
     * 
     * @return cc
     */
    public java.lang.String getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this MessageType.
     * 
     * @param cc
     */
    public void setCc(java.lang.String cc) {
        this.cc = cc;
    }


    /**
     * Gets the bcc value for this MessageType.
     * 
     * @return bcc
     */
    public java.lang.String getBcc() {
        return bcc;
    }


    /**
     * Sets the bcc value for this MessageType.
     * 
     * @param bcc
     */
    public void setBcc(java.lang.String bcc) {
        this.bcc = bcc;
    }


    /**
     * Gets the subject value for this MessageType.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this MessageType.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the destMSISDNs value for this MessageType.
     * 
     * @return destMSISDNs
     */
    public java.lang.String getDestMSISDNs() {
        return destMSISDNs;
    }


    /**
     * Sets the destMSISDNs value for this MessageType.
     * 
     * @param destMSISDNs
     */
    public void setDestMSISDNs(java.lang.String destMSISDNs) {
        this.destMSISDNs = destMSISDNs;
    }


    /**
     * Gets the IMSIs value for this MessageType.
     * 
     * @return IMSIs
     */
    public java.lang.String getIMSIs() {
        return IMSIs;
    }


    /**
     * Sets the IMSIs value for this MessageType.
     * 
     * @param IMSIs
     */
    public void setIMSIs(java.lang.String IMSIs) {
        this.IMSIs = IMSIs;
    }


    /**
     * Gets the clientTransId value for this MessageType.
     * 
     * @return clientTransId
     */
    public java.lang.String getClientTransId() {
        return clientTransId;
    }


    /**
     * Sets the clientTransId value for this MessageType.
     * 
     * @param clientTransId
     */
    public void setClientTransId(java.lang.String clientTransId) {
        this.clientTransId = clientTransId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageType)) return false;
        MessageType other = (MessageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.eventReferenceCode==null && other.getEventReferenceCode()==null) || 
             (this.eventReferenceCode!=null &&
              this.eventReferenceCode.equals(other.getEventReferenceCode()))) &&
            ((this.loginId==null && other.getLoginId()==null) || 
             (this.loginId!=null &&
              this.loginId.equals(other.getLoginId()))) &&
            ((this.loginPassword==null && other.getLoginPassword()==null) || 
             (this.loginPassword!=null &&
              this.loginPassword.equals(other.getLoginPassword()))) &&
            ((this.syncFlag==null && other.getSyncFlag()==null) || 
             (this.syncFlag!=null &&
              this.syncFlag.equals(other.getSyncFlag()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.idtype==null && other.getIdtype()==null) || 
             (this.idtype!=null &&
              this.idtype.equals(other.getIdtype()))) &&
            ((this.idvalue==null && other.getIdvalue()==null) || 
             (this.idvalue!=null &&
              this.idvalue.equals(other.getIdvalue()))) &&
            ((this.msisdn1==null && other.getMsisdn1()==null) || 
             (this.msisdn1!=null &&
              this.msisdn1.equals(other.getMsisdn1()))) &&
            ((this.msisdn2==null && other.getMsisdn2()==null) || 
             (this.msisdn2!=null &&
              this.msisdn2.equals(other.getMsisdn2()))) &&
            ((this.amount1==null && other.getAmount1()==null) || 
             (this.amount1!=null &&
              this.amount1.equals(other.getAmount1()))) &&
            ((this.amount2==null && other.getAmount2()==null) || 
             (this.amount2!=null &&
              this.amount2.equals(other.getAmount2()))) &&
            ((this.ordernumber==null && other.getOrdernumber()==null) || 
             (this.ordernumber!=null &&
              this.ordernumber.equals(other.getOrdernumber()))) &&
            ((this.date1==null && other.getDate1()==null) || 
             (this.date1!=null &&
              this.date1.equals(other.getDate1()))) &&
            ((this.date2==null && other.getDate2()==null) || 
             (this.date2!=null &&
              this.date2.equals(other.getDate2()))) &&
            ((this.sim1==null && other.getSim1()==null) || 
             (this.sim1!=null &&
              this.sim1.equals(other.getSim1()))) &&
            ((this.sim2==null && other.getSim2()==null) || 
             (this.sim2!=null &&
              this.sim2.equals(other.getSim2()))) &&
            ((this.portid==null && other.getPortid()==null) || 
             (this.portid!=null &&
              this.portid.equals(other.getPortid()))) &&
            ((this.portrequestformid==null && other.getPortrequestformid()==null) || 
             (this.portrequestformid!=null &&
              this.portrequestformid.equals(other.getPortrequestformid()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2()))) &&
            ((this.userDefined3==null && other.getUserDefined3()==null) || 
             (this.userDefined3!=null &&
              this.userDefined3.equals(other.getUserDefined3()))) &&
            ((this.userDefined4==null && other.getUserDefined4()==null) || 
             (this.userDefined4!=null &&
              this.userDefined4.equals(other.getUserDefined4()))) &&
            ((this.userDefined5==null && other.getUserDefined5()==null) || 
             (this.userDefined5!=null &&
              this.userDefined5.equals(other.getUserDefined5()))) &&
            ((this.userDefined6==null && other.getUserDefined6()==null) || 
             (this.userDefined6!=null &&
              this.userDefined6.equals(other.getUserDefined6()))) &&
            ((this.userDefined7==null && other.getUserDefined7()==null) || 
             (this.userDefined7!=null &&
              this.userDefined7.equals(other.getUserDefined7()))) &&
            ((this.userDefined8==null && other.getUserDefined8()==null) || 
             (this.userDefined8!=null &&
              this.userDefined8.equals(other.getUserDefined8()))) &&
            ((this.emailTo==null && other.getEmailTo()==null) || 
             (this.emailTo!=null &&
              this.emailTo.equals(other.getEmailTo()))) &&
            ((this.emailFrom==null && other.getEmailFrom()==null) || 
             (this.emailFrom!=null &&
              this.emailFrom.equals(other.getEmailFrom()))) &&
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc()))) &&
            ((this.bcc==null && other.getBcc()==null) || 
             (this.bcc!=null &&
              this.bcc.equals(other.getBcc()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.destMSISDNs==null && other.getDestMSISDNs()==null) || 
             (this.destMSISDNs!=null &&
              this.destMSISDNs.equals(other.getDestMSISDNs()))) &&
            ((this.IMSIs==null && other.getIMSIs()==null) || 
             (this.IMSIs!=null &&
              this.IMSIs.equals(other.getIMSIs()))) &&
            ((this.clientTransId==null && other.getClientTransId()==null) || 
             (this.clientTransId!=null &&
              this.clientTransId.equals(other.getClientTransId())));
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
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getEventReferenceCode() != null) {
            _hashCode += getEventReferenceCode().hashCode();
        }
        if (getLoginId() != null) {
            _hashCode += getLoginId().hashCode();
        }
        if (getLoginPassword() != null) {
            _hashCode += getLoginPassword().hashCode();
        }
        if (getSyncFlag() != null) {
            _hashCode += getSyncFlag().hashCode();
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getIdtype() != null) {
            _hashCode += getIdtype().hashCode();
        }
        if (getIdvalue() != null) {
            _hashCode += getIdvalue().hashCode();
        }
        if (getMsisdn1() != null) {
            _hashCode += getMsisdn1().hashCode();
        }
        if (getMsisdn2() != null) {
            _hashCode += getMsisdn2().hashCode();
        }
        if (getAmount1() != null) {
            _hashCode += getAmount1().hashCode();
        }
        if (getAmount2() != null) {
            _hashCode += getAmount2().hashCode();
        }
        if (getOrdernumber() != null) {
            _hashCode += getOrdernumber().hashCode();
        }
        if (getDate1() != null) {
            _hashCode += getDate1().hashCode();
        }
        if (getDate2() != null) {
            _hashCode += getDate2().hashCode();
        }
        if (getSim1() != null) {
            _hashCode += getSim1().hashCode();
        }
        if (getSim2() != null) {
            _hashCode += getSim2().hashCode();
        }
        if (getPortid() != null) {
            _hashCode += getPortid().hashCode();
        }
        if (getPortrequestformid() != null) {
            _hashCode += getPortrequestformid().hashCode();
        }
        if (getUserDefined1() != null) {
            _hashCode += getUserDefined1().hashCode();
        }
        if (getUserDefined2() != null) {
            _hashCode += getUserDefined2().hashCode();
        }
        if (getUserDefined3() != null) {
            _hashCode += getUserDefined3().hashCode();
        }
        if (getUserDefined4() != null) {
            _hashCode += getUserDefined4().hashCode();
        }
        if (getUserDefined5() != null) {
            _hashCode += getUserDefined5().hashCode();
        }
        if (getUserDefined6() != null) {
            _hashCode += getUserDefined6().hashCode();
        }
        if (getUserDefined7() != null) {
            _hashCode += getUserDefined7().hashCode();
        }
        if (getUserDefined8() != null) {
            _hashCode += getUserDefined8().hashCode();
        }
        if (getEmailTo() != null) {
            _hashCode += getEmailTo().hashCode();
        }
        if (getEmailFrom() != null) {
            _hashCode += getEmailFrom().hashCode();
        }
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        if (getBcc() != null) {
            _hashCode += getBcc().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getDestMSISDNs() != null) {
            _hashCode += getDestMSISDNs().hashCode();
        }
        if (getIMSIs() != null) {
            _hashCode += getIMSIs().hashCode();
        }
        if (getClientTransId() != null) {
            _hashCode += getClientTransId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "MessageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "eventReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "loginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "loginPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "syncFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "idtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "idvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "msisdn1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "msisdn2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "amount1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "amount2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordernumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "ordernumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "date1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "date2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "sim1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "sim2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "portid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portrequestformid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "portrequestformid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "userDefined8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "emailTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "emailFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "bcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destMSISDNs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "destMSISDNs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "IMSIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.xsd", "ClientTransId"));
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
