package com.xius.smf.domaindata;

import java.util.ArrayList;

public class BulkStateChangeProcessData extends DomainDataBase{
	
	private  Long pi_max_records;     
	
    private ArrayList<BulkStateChangeProcessCursorData>  po_state_change_cursor;

	public Long getPi_max_records() {
		return pi_max_records;
	}

	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}

	public ArrayList<BulkStateChangeProcessCursorData> getPo_state_change_cursor() {
		return po_state_change_cursor;
	}

	public void setPo_state_change_cursor(
			ArrayList<BulkStateChangeProcessCursorData> po_state_change_cursor) {
		this.po_state_change_cursor = po_state_change_cursor;
	}
	
	
}
