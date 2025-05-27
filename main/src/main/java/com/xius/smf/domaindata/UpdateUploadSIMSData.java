package com.xius.smf.domaindata;

public class UpdateUploadSIMSData extends DomainDataBase {

	private String pi_tx_number;	
	private String pi_tx_status;		
	private String pi_remarks;	
	private String po_error_desc;
	
	public String getPi_tx_number() {
		return pi_tx_number;
	}
	public void setPi_tx_number(String pi_tx_number) {
		this.pi_tx_number = pi_tx_number;
	}
	public String getPi_tx_status() {
		return pi_tx_status;
	}
	public void setPi_tx_status(String pi_tx_status) {
		this.pi_tx_status = pi_tx_status;
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
