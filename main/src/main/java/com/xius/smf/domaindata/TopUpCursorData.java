package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class TopUpCursorData {
	private Long network_id;
	private Long account_id;
	private Long imsi;
	private Long msisdn_no;
	private String sim;
	private String transaction_id;
	private BigDecimal topupamnt;
	private String dateTime;
	private BigDecimal prevBalance;
	private BigDecimal currBalance;
	private String sourceType;
	private Long old_msisdn_no;
	private Long voucherSerial;
	private String userId;
	
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Long getImsi() {
		return imsi;
	}
	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public BigDecimal getTopupamnt() {
		return topupamnt;
	}
	public void setTopupamnt(BigDecimal topupamnt) {
		this.topupamnt = topupamnt;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getCurrBalance() {
		return currBalance;
	}
	public void setCurrBalance(BigDecimal currBalance) {
		this.currBalance = currBalance;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public Long getOld_msisdn_no() {
		return old_msisdn_no;
	}
	public void setOld_msisdn_no(Long old_msisdn_no) {
		this.old_msisdn_no = old_msisdn_no;
	}
	public Long getVoucherSerial() {
		return voucherSerial;
	}
	public void setVoucherSerial(Long voucherSerial) {
		this.voucherSerial = voucherSerial;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
