package com.xius.smf.domaindata;

public class UpdateUploadDmgpTransStatusData extends DomainDataBase {

	private String pi_transaction_no;
	private String pi_trans_status;
	private String pi_remarks;
	private String po_error_desc;
	
	public String getPi_transaction_no() {
		return pi_transaction_no;
	}
	public void setPi_transaction_no(String pi_transaction_no) {
		this.pi_transaction_no = pi_transaction_no;
	}
	public String getPi_trans_status() {
		return pi_trans_status;
	}
	public void setPi_trans_status(String pi_trans_status) {
		this.pi_trans_status = pi_trans_status;
	}
	public String getPi_remarks() {
		return pi_remarks;
	}
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	public String getPo_error_desc() {
		return po_error_desc;
	}
	public void setPo_error_desc(String po_error_desc) {
		this.po_error_desc = po_error_desc;
	}
	
}
