package com.xius.smf.domaindata;

import java.util.ArrayList;

public class BulkChangeMsisdnProcessData extends DomainDataBase{
	
	private Long pi_max_rows ;
	private ArrayList<GetBulkChangeMsisdnDtlsCursorData> po_chg_msisdn_dtls;
	private String pi_transaction_id ;
	
	
	public Long getPi_max_rows() {
		return pi_max_rows;
	}
	public void setPi_max_rows(Long pi_max_rows) {
		this.pi_max_rows = pi_max_rows;
	}
	
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	public ArrayList<GetBulkChangeMsisdnDtlsCursorData> getPo_chg_msisdn_dtls() {
		return po_chg_msisdn_dtls;
	}
	public void setPo_chg_msisdn_dtls(
			ArrayList<GetBulkChangeMsisdnDtlsCursorData> po_chg_msisdn_dtls) {
		this.po_chg_msisdn_dtls = po_chg_msisdn_dtls;
	}
	
	
	
}
