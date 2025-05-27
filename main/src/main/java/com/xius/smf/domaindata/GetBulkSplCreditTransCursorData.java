package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class GetBulkSplCreditTransCursorData {

	private BigDecimal credit_amount;
	private Long msisdn_no;
	private String status;
	private String validity_date   ;
	private String gp_end_date   ;
	private String  expiry_date   ;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	private String reason;
	private String transaction_id;
	private Long batchId;
	
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	private String transactionDate;
}