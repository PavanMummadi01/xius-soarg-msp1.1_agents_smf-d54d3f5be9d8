package com.xius.smf.ne;

import java.util.Date;

public class TempMessageInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long transactionId;
	private Integer eventId;
	private String eventReferenceCode;
	private String loginId;
	private String loginPassword;
	private String syncFlag;
	private Integer languageId;
	private String username;
	private String password;
	private String idtype;
	private String idvalue;
	private long msisdn1;
	private long msisdn2;
	private double amount1;
	private double amount2;
	private String ordernumber;
	private Date date1;
	private Date date2;
	private String sim1;
	private String sim2;
	private String portid;
	private String portrequestformid;
	private String userDefined1;
	private String userDefined2;
	private String userDefined3;
	private String userDefined4;
	private String userDefined5;
	private String userDefined6;
	private String userDefined7;
	private String userDefined8;
	private String emailTo;
	private String emailFrom;
	private String cc;
	private String bcc;
	private String subject;
	private String destMSISDNs;
	private String IMSIs;
	private String clientTransactionId;
	
	private String networkId;// added for sending networkId to set as carrierId in NE ws request
	
	public String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public String getEventReferenceCode() {
		return eventReferenceCode;
	}
	public void setEventReferenceCode(String eventReferenceCode) {
		this.eventReferenceCode = eventReferenceCode;
	}
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getSyncFlag() {
		return syncFlag;
	}
	public void setSyncFlag(String syncFlag) {
		this.syncFlag = syncFlag;
	}
	public Integer getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getIdvalue() {
		return idvalue;
	}
	public void setIdvalue(String idvalue) {
		this.idvalue = idvalue;
	}
	public long getMsisdn1() {
		return msisdn1;
	}
	public void setMsisdn1(long msisdn1) {
		this.msisdn1 = msisdn1;
	}
	public long getMsisdn2() {
		return msisdn2;
	}
	public void setMsisdn2(long msisdn2) {
		this.msisdn2 = msisdn2;
	}
	public double getAmount1() {
		return amount1;
	}
	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}
	public double getAmount2() {
		return amount2;
	}
	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	}
	public String getSim1() {
		return sim1;
	}
	public void setSim1(String sim1) {
		this.sim1 = sim1;
	}
	public String getSim2() {
		return sim2;
	}
	public void setSim2(String sim2) {
		this.sim2 = sim2;
	}
	public String getPortid() {
		return portid;
	}
	public void setPortid(String portid) {
		this.portid = portid;
	}
	public String getPortrequestformid() {
		return portrequestformid;
	}
	public void setPortrequestformid(String portrequestformid) {
		this.portrequestformid = portrequestformid;
	}
	public String getUserDefined1() {
		return userDefined1;
	}
	public void setUserDefined1(String userDefined1) {
		this.userDefined1 = userDefined1;
	}
	public String getUserDefined2() {
		return userDefined2;
	}
	public void setUserDefined2(String userDefined2) {
		this.userDefined2 = userDefined2;
	}
	public String getUserDefined3() {
		return userDefined3;
	}
	public void setUserDefined3(String userDefined3) {
		this.userDefined3 = userDefined3;
	}
	public String getUserDefined4() {
		return userDefined4;
	}
	public void setUserDefined4(String userDefined4) {
		this.userDefined4 = userDefined4;
	}
	public String getUserDefined5() {
		return userDefined5;
	}
	public void setUserDefined5(String userDefined5) {
		this.userDefined5 = userDefined5;
	}
	public String getUserDefined6() {
		return userDefined6;
	}
	public void setUserDefined6(String userDefined6) {
		this.userDefined6 = userDefined6;
	}
	public String getUserDefined7() {
		return userDefined7;
	}
	public void setUserDefined7(String userDefined7) {
		this.userDefined7 = userDefined7;
	}
	public String getUserDefined8() {
		return userDefined8;
	}
	public void setUserDefined8(String userDefined8) {
		this.userDefined8 = userDefined8;
	}
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getBcc() {
		return bcc;
	}
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDestMSISDNs() {
		return destMSISDNs;
	}
	public void setDestMSISDNs(String destMSISDNs) {
		this.destMSISDNs = destMSISDNs;
	}
	public String getIMSIs() {
		return IMSIs;
	}
	public void setIMSIs(String iMSIs) {
		IMSIs = iMSIs;
	}
	public String getClientTransactionId() {
		return clientTransactionId;
	}
	public void setClientTransactionId(String clientTransactionId) {
		this.clientTransactionId = clientTransactionId;
	}
}
