package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class GetBulkDebitTransCursorData {
	private BigDecimal debit_amount;
	private Long msisdn_no;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getDebit_amount() {
		return debit_amount;
	}
	public void setDebit_amount(BigDecimal debit_amount) {
		this.debit_amount = debit_amount;
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
