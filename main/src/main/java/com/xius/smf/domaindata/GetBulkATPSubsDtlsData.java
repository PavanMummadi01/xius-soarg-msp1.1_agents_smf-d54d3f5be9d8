package com.xius.smf.domaindata;

import java.util.ArrayList;

public class GetBulkATPSubsDtlsData extends DomainDataBase {

	private String pi_transaction_id;
	private String pi_startdate;    
	private String pi_enddate ;
	private ArrayList<GetBulkATPSubsCursorData> po_trans_dtls;
	
	
	
	
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	public String getPi_startdate() {
		return pi_startdate;
	}
	public void setPi_startdate(String pi_startdate) {
		this.pi_startdate = pi_startdate;
	}
	public String getPi_enddate() {
		return pi_enddate;
	}
	public void setPi_enddate(String pi_enddate) {
		this.pi_enddate = pi_enddate;
	}
	public ArrayList<GetBulkATPSubsCursorData> getPo_trans_dtls() {
		return po_trans_dtls;
	}
	public void setPo_trans_dtls(ArrayList<GetBulkATPSubsCursorData> po_trans_dtls) {
		this.po_trans_dtls = po_trans_dtls;
	}
	@Override
	public String toString() {
		return "GetBulkATPSubsDtlsData [pi_transaction_id=" + pi_transaction_id
				+ ", pi_startdate=" + pi_startdate + ", pi_enddate="
				+ pi_enddate + ", po_trans_dtls=" + po_trans_dtls + "]";
	}
	
	
	
	
	
	
}
