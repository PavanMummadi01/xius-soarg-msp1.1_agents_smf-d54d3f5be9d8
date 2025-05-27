package com.xius.smf.domaindata;

public class CancelLocationDatainsert extends DomainDataBase{
	
	private String pi_login_id ;
	private long pi_msisdn;
	private String po_cmd;
	private String po_transaction_id;
	private long po_error_code;
	private String po_error_msg;
	
	
	public String getPi_login_id() {
		return pi_login_id;
	}
	public void setPi_login_id(String pi_login_id) {
		this.pi_login_id = pi_login_id;
	}
	public long getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(long pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
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
	public Long getPo_error_code() {
		return po_error_code;
	}
	public void setPo_error_code(long po_error_code) {
		this.po_error_code = po_error_code;
	}
	public String getPo_error_msg() {
		return po_error_msg;
	}
	public void setPo_error_msg(String po_error_msg) {
		this.po_error_msg = po_error_msg;
	}
}
