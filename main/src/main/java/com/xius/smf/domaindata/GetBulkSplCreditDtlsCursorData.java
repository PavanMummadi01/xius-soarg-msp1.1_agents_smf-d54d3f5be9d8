package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class GetBulkSplCreditDtlsCursorData {
	private String reason;   
	private BigDecimal credit_amount;
	private Long msisdn_no  ;
	private String transaction_id ;
	private String validity_date   ;
	private String gp_end_date   ;
	private String  expiry_date   ;
	private String channel_id;
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getValidity_date() {
		return validity_date;
	}
	public void setValidity_date(String validity_date) {
		this.validity_date = validity_date;
	}
	public String getGp_end_date() {
		return gp_end_date;
	}
	public void setGp_end_date(String gp_end_date) {
		this.gp_end_date = gp_end_date;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public BigDecimal getCredit_amount() {
		return credit_amount;
	}
	public void setCredit_amount(BigDecimal credit_amount) {
		this.credit_amount = credit_amount;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	private Long network_id;
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
}
