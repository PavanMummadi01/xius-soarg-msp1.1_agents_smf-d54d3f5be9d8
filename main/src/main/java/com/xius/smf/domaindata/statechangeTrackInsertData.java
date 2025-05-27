package com.xius.smf.domaindata;

public class statechangeTrackInsertData extends DomainDataBase {

	private Long pi_MSISDN;
	private String pi_newSubscrStatus;
	private String pi_transactionId;
	private String pi_reason;
	private String pi_CHANNELID;
	private String po_transactionRefNum;

	public Long getPi_MSISDN() {
		return pi_MSISDN;
	}

	public void setPi_MSISDN(Long pi_MSISDN) {
		this.pi_MSISDN = pi_MSISDN;
	}

	public String getPi_newSubscrStatus() {
		return pi_newSubscrStatus;
	}

	public void setPi_newSubscrStatus(String pi_newSubscrStatus) {
		this.pi_newSubscrStatus = pi_newSubscrStatus;
	}

	public String getPi_transactionId() {
		return pi_transactionId;
	}

	public void setPi_transactionId(String pi_transactionId) {
		this.pi_transactionId = pi_transactionId;
	}

	public String getPi_reason() {
		return pi_reason;
	}

	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}

	public String getPi_CHANNELID() {
		return pi_CHANNELID;
	}

	public void setPi_CHANNELID(String pi_CHANNELID) {
		this.pi_CHANNELID = pi_CHANNELID;
	}

	public String getPo_transactionRefNum() {
		return po_transactionRefNum;
	}

	public void setPo_transactionRefNum(String po_transactionRefNum) {
		this.po_transactionRefNum = po_transactionRefNum;
	}

}
