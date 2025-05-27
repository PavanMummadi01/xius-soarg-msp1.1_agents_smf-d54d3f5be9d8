package com.xius.smf.domaindata;

import java.util.ArrayList;

public class TTPCRFSelectDATA extends DomainDataBase {

	private Long[] pi_network;
	private Long pi_failure_count;
	private Long pi_max_records;
	private ArrayList<TTPCRFCursorData> po_cursor_data;

	public void setPi_failure_count(Long pi_failure_count) {
		this.pi_failure_count = pi_failure_count;
	}

	public Long getPi_failure_count() {
		return pi_failure_count;
	}

	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}

	public Long getPi_max_records() {
		return pi_max_records;
	}

	 
	public ArrayList<TTPCRFCursorData> getPo_cursor_data() {
		return po_cursor_data;
	}

	public void setPo_cursor_data(ArrayList<TTPCRFCursorData> po_cursor_data) {
		this.po_cursor_data = po_cursor_data;
	}

	public Long[] getPi_network() {
		return pi_network;
	}

	public void setPi_network(Long[] pi_network) {
		this.pi_network = pi_network;
	}

}
