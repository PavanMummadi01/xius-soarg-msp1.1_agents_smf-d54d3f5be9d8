package com.xius.smf.domaindata;

public class BulkAtpSubsCursorData {
	
	private Long network_id;
	private String transaction_id; 
	private String publicity_id;
	private Long msisdn_no;
	
	
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getPublicity_id() {
		return publicity_id;
	}
	public Long getNetwork_id() {
		return network_id;
	}
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
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
	@Override
	public String toString() {
		return "BulkAtpSubsCursorData [transaction_id=" + transaction_id
				+ ", publicity_id=" + publicity_id + ", msisdn_no=" + msisdn_no
				+ "]";
	}
	
	
	

}
