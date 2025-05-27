package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class SlpnPointsTransactionReportCusorData {

	private String clientid;
	private Long MSISDN;
	private BigDecimal redeemptiondenomination;
	private BigDecimal slpnpoints;
	private String transactionId;
	private String transactionDate;
	private String operation;
	private Long extErrorCode;
	private String remarks;
	private String status;
	private String reverseReffNum;
	private String publicityId;
	
	
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public Long getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(Long mSISDN) {
		MSISDN = mSISDN;
	}
	public BigDecimal getRedeemptiondenomination() {
		return redeemptiondenomination;
	}
	public void setRedeemptiondenomination(BigDecimal redeemptiondenomination) {
		this.redeemptiondenomination = redeemptiondenomination;
	}
	public BigDecimal getSlpnpoints() {
		return slpnpoints;
	}
	public void setSlpnpoints(BigDecimal slpnpoints) {
		this.slpnpoints = slpnpoints;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public Long getExtErrorCode() {
		return extErrorCode;
	}
	public void setExtErrorCode(Long extErrorCode) {
		this.extErrorCode = extErrorCode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReverseReffNum() {
		return reverseReffNum;
	}
	public void setReverseReffNum(String reverseReffNum) {
		this.reverseReffNum = reverseReffNum;
	}
	public String getPublicityId() {
		return publicityId;
	}
	public void setPublicityId(String publicityId) {
		this.publicityId = publicityId;
	}
	
	public Long getRowCount() {
		return rowCount;
	}
	public void setRowCount(Long rowCount) {
		this.rowCount = rowCount;
	}

	private Long rowCount;
	
	
	
	
}
