package com.xius.smf.domaindata;

public class InvokeEmaCmdinsertData extends DomainDataBase{

	private long pi_msisdn;
	private String pi_command_name;
	private String pi_status;
	private String pi_new_imsi;
	private long pi_new_msisdn;
	private String pi_imsi;
	private String po_cmd;
	private String pi_external_trans_id;
	private String po_transaction_id;
	private String po_error_msg;
	private String pi_reason;
	
	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPi_external_trans_id() {
		return pi_external_trans_id;
	}
	public void setPi_external_trans_id(String pi_external_trans_id) {
		this.pi_external_trans_id = pi_external_trans_id;
	}
	public long getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(long pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public String getPi_command_name() {
		return pi_command_name;
	}
	public void setPi_command_name(String pi_command_name) {
		this.pi_command_name = pi_command_name;
	}
	public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	public String getPi_new_imsi() {
		return pi_new_imsi;
	}
	public void setPi_new_imsi(String pi_new_imsi) {
		this.pi_new_imsi = pi_new_imsi;
	}
	public long getPi_new_msisdn() {
		return pi_new_msisdn;
	}
	public void setPi_new_msisdn(long pi_new_msisdn) {
		this.pi_new_msisdn = pi_new_msisdn;
	}
	public String getPi_imsi() {
		return pi_imsi;
	}
	public void setPi_imsi(String pi_imsi) {
		this.pi_imsi = pi_imsi;
	}
	public String getPo_cmd() {
		return po_cmd;
	}
	public void setPo_cmd(String po_cmd) {
		this.po_cmd = po_cmd;
	}
	public String getPo_transaction_id() {
		return po_transaction_id;
	}
	public void setPo_transaction_id(String po_transaction_id) {
		this.po_transaction_id = po_transaction_id;
	}
	public String getPo_error_msg() {
		return po_error_msg;
	}
	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}
}
