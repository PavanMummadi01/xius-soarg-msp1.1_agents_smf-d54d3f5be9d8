package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class GetBulkCreditTransCursorData {
	private BigDecimal credit_amount;
	private Long msisdn_no;
	private String status;
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
