package com.xius.smf.domaindata;

import java.util.ArrayList;

public class VOLTESelectDATA extends DomainDataBase {

	private Long pi_network_id;
	private Long pi_max_rows;
	private String[] pi_to_status;
	private ArrayList<VOLTECursorData> po_trans_details;
	
	
	public Long getPi_network_id() {
		return pi_network_id;
	}
	public void setPi_network_id(Long pi_network_id) {
		this.pi_network_id = pi_network_id;
	}
	public Long getPi_max_rows() {
		return pi_max_rows;
	}
	public void setPi_max_rows(Long pi_max_rows) {
		this.pi_max_rows = pi_max_rows;
	}
	public String[] getPi_to_status() {
		return pi_to_status;
	}
	public void setPi_to_status(String[] pi_to_status) {
		this.pi_to_status = pi_to_status;
	}
	public ArrayList<VOLTECursorData> getPo_trans_details() {
		return po_trans_details;
	}
	public void setPo_trans_details(ArrayList<VOLTECursorData> po_trans_details) {
		this.po_trans_details = po_trans_details;
	}

	

}
