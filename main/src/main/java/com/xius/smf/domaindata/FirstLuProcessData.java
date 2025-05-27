package com.xius.smf.domaindata;

import java.util.ArrayList;

public class FirstLuProcessData extends DomainDataBase{
	
	
	private Long pi_max_records ;
	private ArrayList<GetBulkFluDtlsCursorData> po_bulk_flu_dtls;
	
	
	/**
	 * @return the pi_max_records
	 */
	public Long getPi_max_records() {
		return pi_max_records;
	}
	/**
	 * @param pi_max_records the pi_max_records to set
	 */
	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}
	/**
	 * @return the po_bulk_flu_dtls
	 */
	public ArrayList<GetBulkFluDtlsCursorData> getPo_bulk_flu_dtls() {
		return po_bulk_flu_dtls;
	}
	/**
	 * @param po_bulk_flu_dtls the po_bulk_flu_dtls to set
	 */
	public void setPo_bulk_flu_dtls(
			ArrayList<GetBulkFluDtlsCursorData> po_bulk_flu_dtls) {
		this.po_bulk_flu_dtls = po_bulk_flu_dtls;
	}
	
	
	
}
