package com.xius.smf.domaindata;

public class StChgExpDelMSISDNUpdate extends DomainDataBase {
	
	private String pi_transaction_id;
	private String pi_trans_status;
	private String pi_remarks;
	private String extErrorCode;

	public String getExtErrorCode() {
		return extErrorCode;
	}

	public void setExtErrorCode(String extErrorCode) {
		this.extErrorCode = extErrorCode;
	}

	public String getPi_transaction_id() {
		return pi_transaction_id;
	}

	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
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

	

}
