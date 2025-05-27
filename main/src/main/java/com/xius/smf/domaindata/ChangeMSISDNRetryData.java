package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeMSISDNRetryData extends DomainDataBase {
	private Integer[] network_id;
	private Long pi_max_records;
	private String pi_instance_id;
	private ArrayList<ChangeMSISDNCursorData> po_msisdn_list_ref;

	public String getPi_instance_id() {
		return pi_instance_id;
	}

	public void setPi_instance_id(String pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}

	

	public Integer[] getNetwork_id() {
		return network_id;
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

	public ArrayList<ChangeMSISDNCursorData> getPo_msisdn_list_ref() {
		return po_msisdn_list_ref;
	}

	public void setPo_msisdn_list_ref(
			ArrayList<ChangeMSISDNCursorData> po_msisdn_list_ref) {
		this.po_msisdn_list_ref = po_msisdn_list_ref;
	}

	@Override
	public String toString() {
		return "ChangeMSISDNRetryData [network_id="
				+ Arrays.toString(network_id) + ", pi_max_records="
				+ pi_max_records + ", po_msisdn_list_ref=" + po_msisdn_list_ref
				+ "]";
	}

}
