package com.xius.smf.domaindata;

public class GetBulkATPSubsCursorData {

	
	private String publicity_id;
	private Long msisdn_no;
	private String status;
	
	private String pi_transaction_id;
	private Long batchId;
	
	
	
	
	
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	
	public String getPublicity_id() {
		return publicity_id;
	}
	public void setPublicity_id(String publicity_id) {
		this.publicity_id = publicity_id;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "GetBulkATPSubsCursorData [publicity_id=" + publicity_id
				+ ", msisdn_no=" + msisdn_no + ", status=" + status
				+ ", pi_transaction_id=" + pi_transaction_id + "]";
	}
	
	
	
	
	
	
	
}
