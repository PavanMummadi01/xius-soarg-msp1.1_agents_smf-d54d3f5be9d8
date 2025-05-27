package com.xius.smf.domaindata;

public class EmaCMDCursorData {
	
	private long msisdn_no;
	private String transaction_id;
	private String command;
	private long network_id;
	
	public long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(long network_id) {
		this.network_id = network_id;
	}
}
