package com.xius.smf.domaindata;

import java.util.ArrayList;

public class BulkSimSwapProcessData extends DomainDataBase{
	
	private Long pi_max_records ;
	private ArrayList<GetBulkSimSwapDtlsCursorData> po_sim_swap_cursor;
	private Long pi_trans_id ;

	public Long getPi_trans_id() {
		return pi_trans_id;
	}

	public void setPi_trans_id(Long pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}

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
	public ArrayList<GetBulkSimSwapDtlsCursorData> getPo_sim_swap_cursor() {
		return po_sim_swap_cursor;
	}
	public void setPo_sim_swap_cursor(
			ArrayList<GetBulkSimSwapDtlsCursorData> po_sim_swap_cursor) {
		this.po_sim_swap_cursor = po_sim_swap_cursor;
	}
	
	
}
