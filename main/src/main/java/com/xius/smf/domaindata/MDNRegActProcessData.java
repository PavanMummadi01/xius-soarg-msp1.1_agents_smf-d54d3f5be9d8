package com.xius.smf.domaindata;

import java.util.ArrayList;

public class MDNRegActProcessData extends DomainDataBase{
	
	
	private Long pi_max_records ;
	private String[] pi_action_flag;
	private ArrayList<MDNRegActCursorDtlsData> po_msdn_dtls_cursor;
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
	 * @return the pi_action_flag
	 */
	public String[] getPi_action_flag() {
		return pi_action_flag;
	}
	/**
	 * @param pi_action_flag the pi_action_flag to set
	 */
	public void setPi_action_flag(String[] pi_action_flag) {
		this.pi_action_flag = pi_action_flag;
	}
	/**
	 * @return the po_msdn_dtls_cursor
	 */
	public ArrayList<MDNRegActCursorDtlsData> getPo_msdn_dtls_cursor() {
		return po_msdn_dtls_cursor;
	}
	/**
	 * @param po_msdn_dtls_cursor the po_msdn_dtls_cursor to set
	 */
	public void setPo_msdn_dtls_cursor(
			ArrayList<MDNRegActCursorDtlsData> po_msdn_dtls_cursor) {
		this.po_msdn_dtls_cursor = po_msdn_dtls_cursor;
	}
	

	
}
