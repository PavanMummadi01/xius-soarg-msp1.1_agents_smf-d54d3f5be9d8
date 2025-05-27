package com.xius.smf.domaindata;

public class EmaFlowProcessCursorData{
	
	private Long network_id;
	private String msisdn;
	private String new_msisdn;
	private String imsi;
	private String new_imsi;
	private String status;
	private String flow_name;
	private String command_name;
	private String command;
	private Long priority;
	private String trans_id;
	private String int_trans_id;
	
	
	public String getInt_trans_id() {
		return int_trans_id;
	}
	public void setInt_trans_id(String int_trans_id) {
		this.int_trans_id = int_trans_id;
	}
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getNew_msisdn() {
		return new_msisdn;
	}
	public void setNew_msisdn(String new_msisdn) {
		this.new_msisdn = new_msisdn;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getNew_imsi() {
		return new_imsi;
	}
	public void setNew_imsi(String new_imsi) {
		this.new_imsi = new_imsi;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFlow_name() {
		return flow_name;
	}
	public void setFlow_name(String flow_name) {
		this.flow_name = flow_name;
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
	public Long getPriority() {
		return priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	
	

}
