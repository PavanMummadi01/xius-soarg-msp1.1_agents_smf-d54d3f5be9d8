package com.xius.smf.domaindata;

import java.util.ArrayList;

public class GetMDNRetryData extends DomainDataBase {

	private String pi_retry_trans_id ;
	private String pi_user_type;
	private ArrayList<GetMDNRetryCursorData> po_retry_trans_details;
	
	
	public ArrayList<GetMDNRetryCursorData> getPo_retry_trans_details() {
		return po_retry_trans_details;
	}
	public void setPo_retry_trans_details(
			ArrayList<GetMDNRetryCursorData> po_retry_trans_details) {
		this.po_retry_trans_details = po_retry_trans_details;
	}
	public String getPi_retry_trans_id() {
		return pi_retry_trans_id;
	}
	public void setPi_retry_trans_id(String pi_retry_trans_id) {
		this.pi_retry_trans_id = pi_retry_trans_id;
	}
	
	public String getPi_user_type() {
		return pi_user_type;
	}
	public void setPi_user_type(String pi_user_type) {
		this.pi_user_type = pi_user_type;
	}
	@Override
	public String toString() {
		return "GetMDNRetryData [pi_retry_trans_id=" + pi_retry_trans_id
				+ ", po_retry_trans_details=" + po_retry_trans_details
				+ ", pi_user_type=" + pi_user_type + "]";
	}
	
}
