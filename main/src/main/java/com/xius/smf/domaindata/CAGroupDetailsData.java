package com.xius.smf.domaindata;

import java.util.ArrayList;

public class CAGroupDetailsData extends DomainDataBase{
	
	
	private Long pi_max_records ;
	private ArrayList<CAGroupCursorDtlsData> po_ca_group_dtls_cursor;
	
	
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
	 * @return the po_ca_group_dtls_cursor
	 */
	public ArrayList<CAGroupCursorDtlsData> getPo_ca_group_dtls_cursor() {
		return po_ca_group_dtls_cursor;
	}
	/**
	 * @param po_ca_group_dtls_cursor the po_ca_group_dtls_cursor to set
	 */
	public void setPo_ca_group_dtls_cursor(
			ArrayList<CAGroupCursorDtlsData> po_ca_group_dtls_cursor) {
		this.po_ca_group_dtls_cursor = po_ca_group_dtls_cursor;
	}
	
	
	
}
