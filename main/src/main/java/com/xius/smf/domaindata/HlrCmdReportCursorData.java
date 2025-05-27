package com.xius.smf.domaindata;

public class HlrCmdReportCursorData {

	@Override
	public String toString() {
		return "HlrCmdReportCursorData [status=" + status + ", transaction_id="
				+ transaction_id + ", transaction_date=" + transaction_date
				+ ", command_name=" + command_name + ", command=" + command
				+ ", reason=" + reason + ", userId=" + userId + ", msisdn_no="
				+ msisdn_no + ", flow_name=" + flow_name + "]";
	}

	private String status;
	private String transaction_id;
	private String transaction_date;
	private String command_name;
	private String command;
	private String reason;
	private String userId;
	private String msisdn_no;
	private String flow_name;

	public String getFlow_name() {
		return flow_name;
	}

	public void setFlow_name(String flow_name) {
		this.flow_name = flow_name;
	}

	public String getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(String msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getCommand_name() {
		return command_name;
	}

	public void setCommand_name(String command_name) {
		this.command_name = command_name;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
