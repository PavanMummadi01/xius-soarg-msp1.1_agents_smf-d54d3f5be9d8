package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class GetBulkCreditDtlsCursorData extends DomainDataBase {
	private String reason;   
	private BigDecimal credit_amount;
	private Long msisdn_no  ;
	private String transaction_id ;
	
	private String 	channel_id;
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	private Long network_id;
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
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
}
