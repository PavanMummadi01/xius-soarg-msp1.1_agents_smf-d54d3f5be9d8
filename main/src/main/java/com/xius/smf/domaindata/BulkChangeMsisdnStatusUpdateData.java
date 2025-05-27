package com.xius.smf.domaindata;

public class BulkChangeMsisdnStatusUpdateData extends DomainDataBase{
	
	
	
	private String pi_trans_id;
	private String pi_status ;
	private String pi_remarks;
	
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
	
	@Override
	public String toString() {
		return "BulkChangeMsisdnStatusUpdateData [pi_trans_id=" + pi_trans_id
				+ ", pi_status=" + pi_status + ", pi_remarks=" + pi_remarks + "]";
	}
	
	
	
	
}
