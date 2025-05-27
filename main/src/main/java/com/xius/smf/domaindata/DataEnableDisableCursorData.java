package com.xius.smf.domaindata;

public class DataEnableDisableCursorData {
	private Long network_id;
	private Long account_id;	
	private Long msisdn;	
	private Long imsi;
	private String set_gprs_to;	
	private Long evt_code;
	private String transaction_id;
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}
	public Long getImsi() {
		return imsi;
	}
	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}
	public String getSet_gprs_to() {
		return set_gprs_to;
	}
	public void setSet_gprs_to(String set_gprs_to) {
		this.set_gprs_to = set_gprs_to;
	}
	public Long getEvt_code() {
		return evt_code;
	}
	public void setEvt_code(Long evt_code) {
		this.evt_code = evt_code;
	}
	
}
