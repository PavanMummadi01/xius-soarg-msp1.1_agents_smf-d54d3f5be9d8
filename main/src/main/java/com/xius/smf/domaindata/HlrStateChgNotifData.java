package com.xius.smf.domaindata;

import java.util.ArrayList;

public class HlrStateChgNotifData extends DomainDataBase {

	private String[] network_id;
	private Long pi_max_rows;
	private String[] pi_to_status;
	private String pi_instance_id;
	private ArrayList<HlrStateChngCurData> po_trans_details;

	public String[] getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(String[] network_id) {
		this.network_id = network_id;
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

	public String getPi_instance_id() {
		return pi_instance_id;
	}

	public void setPi_instance_id(String pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}

	public ArrayList<HlrStateChngCurData> getPo_trans_details() {
		return po_trans_details;
	}

	public void setPo_trans_details(
			ArrayList<HlrStateChngCurData> po_trans_details) {
		this.po_trans_details = po_trans_details;
	}

}
