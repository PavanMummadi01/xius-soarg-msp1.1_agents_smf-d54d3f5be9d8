package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class StateChangeRetryData extends DomainDataBase {

	private Integer[] network_id;
	private Long pi_max_records;
	private String pi_instance_id;
	private ArrayList<StateChangeRetryCursorData> po_state_chng_dets_ref;

	public Integer[] getNetwork_id() {
		return network_id;
	}

	

	public ArrayList<StateChangeRetryCursorData> getPo_state_chng_dets_ref() {
		return po_state_chng_dets_ref;
	}



	public void setPo_state_chng_dets_ref(
			ArrayList<StateChangeRetryCursorData> po_state_chng_dets_ref) {
		this.po_state_chng_dets_ref = po_state_chng_dets_ref;
	}



	public void setNetwork_id(Integer[] network_id) {
		this.network_id = network_id;
	}

	public Long getPi_max_records() {
		return pi_max_records;
	}

	public void setPi_max_records(Long pi_max_records) {
		this.pi_max_records = pi_max_records;
	}

	public String getPi_instance_id() {
		return pi_instance_id;
	}

	public void setPi_instance_id(String pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}

	@Override
	public String toString() {
		return "StateChangeRetryData [network_id=" + Arrays.toString(network_id)
				+ ", pi_max_records=" + pi_max_records + ", pi_instance_id="
				+ pi_instance_id + ", po_state_chng_dets_ref="
				+ po_state_chng_dets_ref + "]";
	}
	
	
}
