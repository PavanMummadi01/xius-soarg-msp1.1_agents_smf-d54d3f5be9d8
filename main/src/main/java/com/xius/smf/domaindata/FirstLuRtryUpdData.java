package com.xius.smf.domaindata;

public class FirstLuRtryUpdData  extends DomainDataBase{
	
	private String pi_trans_id;
	private String pi_status;
	private String pi_remarks;
	private String pi_ext_error_code; 
	private Long pi_msisdn_no;
	private String pi_bussines_account_id;
	private String po_link_transaction_id;
	
	
	public String getPo_link_transaction_id() {
		return po_link_transaction_id;
	}
	public void setPo_link_transaction_id(String po_link_transaction_id) {
		this.po_link_transaction_id = po_link_transaction_id;
	}
	public String getPi_trans_id() {
		return pi_trans_id;
	}
	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
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
	public String getPi_ext_error_code() {
		return pi_ext_error_code;
	}
	public void setPi_ext_error_code(String pi_ext_error_code) {
		this.pi_ext_error_code = pi_ext_error_code;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getPi_bussines_account_id() {
		return pi_bussines_account_id;
	}
	public void setPi_bussines_account_id(String pi_bussines_account_id) {
		this.pi_bussines_account_id = pi_bussines_account_id;
	}
	@Override
	public String toString() {
		return "FirstLuRtryUpdData [pi_trans_id=" + pi_trans_id
				+ ", pi_status=" + pi_status + ", pi_remarks=" + pi_remarks
				+ ", pi_ext_error_code=" + pi_ext_error_code
				+ ", pi_msisdn_no=" + pi_msisdn_no
				+ ", pi_bussines_account_id=" + pi_bussines_account_id + "]";
	} 
	
	
	
	
}
