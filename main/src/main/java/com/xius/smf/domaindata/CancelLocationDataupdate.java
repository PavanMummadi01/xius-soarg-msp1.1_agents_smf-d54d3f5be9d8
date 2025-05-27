package com.xius.smf.domaindata;

public class CancelLocationDataupdate extends DomainDataBase{
	
	private String pi_transaction_id;
	private String pi_status;
	private String pi_remarks;
	private long po_error_code;
	private String po_error_msg;
	
	
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	public String getPi_remarks() {
		return pi_remarks;
	}
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
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
