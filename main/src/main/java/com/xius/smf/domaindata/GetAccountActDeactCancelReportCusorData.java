package com.xius.smf.domaindata;


public class GetAccountActDeactCancelReportCusorData {

	private String loginid;
	private Long MSISDN;
	private String transactionId;
	private String transactionDate;
	private String reason;
	private String channelid;
	private Long rowCount;
	private String operation;
	
	
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public Long getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(Long mSISDN) {
		MSISDN = mSISDN;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getChannelid() {
		return channelid;
	}
	public void setChannelid(String channelid) {
		this.channelid = channelid;
	}
	public Long getRowCount() {
		return rowCount;
	}
	public void setRowCount(Long rowCount) {
		this.rowCount = rowCount;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	@Override
	public String toString() {
		return "GetAccountActDeactCancelReportCusorData [loginid=" + loginid
				+ ", MSISDN=" + MSISDN + ", transactionId=" + transactionId
				+ ", transactionDate=" + transactionDate + ", reason=" + reason
				+ ", channelid=" + channelid + ", rowCount=" + rowCount
				+ ", operation=" + operation + "]";
	}
	
	
	
	
}
