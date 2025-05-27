package com.xius.smf.domaindata;

import java.math.BigDecimal;


public class DataRenewalDataThresholdCursorData {
	private Long network_id;
	private Long account_id;
	private Long imsi;
	private Long msisdn_no;
	private String sim;
	private Long transaction_id;
	private String dateTime;
	private BigDecimal currBalance;
	private String eventType;
	private String publicityId;
	private BigDecimal volumeTotal;
	private BigDecimal volumeRemain;
	private BigDecimal volumeUsed;
	private Long threshold;
	private Long tariffId;
	private String status;
	private String  lac_sac;
	private String notify_api_flag;
	
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
	public Long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public String getPublicityId() {
		return publicityId;
	}
	public void setPublicityId(String publicityId) {
		this.publicityId = publicityId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getCurrBalance() {
		return currBalance;
	}
	public void setCurrBalance(BigDecimal currBalance) {
		this.currBalance = currBalance;
	}
	public BigDecimal getVolumeTotal() {
		return volumeTotal;
	}
	public void setVolumeTotal(BigDecimal volumeTotal) {
		this.volumeTotal = volumeTotal;
	}
	public BigDecimal getVolumeRemain() {
		return volumeRemain;
	}
	public void setVolumeRemain(BigDecimal volumeRemain) {
		this.volumeRemain = volumeRemain;
	}
	public BigDecimal getVolumeUsed() {
		return volumeUsed;
	}
	public void setVolumeUsed(BigDecimal volumeUsed) {
		this.volumeUsed = volumeUsed;
	}
	public Long getThreshold() {
		return threshold;
	}
	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}
	public Long getTariffId() {
		return tariffId;
	}
	public void setTariffId(Long tariffId) {
		this.tariffId = tariffId;
	}
	public String getLac_sac() {
		return lac_sac;
	}
	public void setLac_sac(String lac_sac) {
		this.lac_sac = lac_sac;
	}
	public String getNotify_api_flag() {
		return notify_api_flag;
	}
	public void setNotify_api_flag(String notify_api_flag) {
		this.notify_api_flag = notify_api_flag;
	}
}
