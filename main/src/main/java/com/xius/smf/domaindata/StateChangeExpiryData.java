package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class StateChangeExpiryData  extends DomainDataBase{

	private String[] network_id;
	private Long pi_max_rows;
	private String[] pi_to_status;
	private String pi_instance_id;
	private ArrayList<StateChangeExpiryPrimCursorData> po_prim_msisdn_details;
	//private ArrayList<StateChangeExpiryNpCursorData> po_non_prim_msisdn_details;
	
	
	
	/*public ArrayList<StateChangeExpiryNpCursorData> getPo_non_prim_msisdn_details() {
		return po_non_prim_msisdn_details;
	}
	public void setPo_non_prim_msisdn_details(
			ArrayList<StateChangeExpiryNpCursorData> po_non_prim_msisdn_details) {
		this.po_non_prim_msisdn_details = po_non_prim_msisdn_details;
	}*/
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
	public ArrayList<StateChangeExpiryPrimCursorData> getPo_prim_msisdn_details() {
		return po_prim_msisdn_details;
	}
	public void setPo_prim_msisdn_details(
			ArrayList<StateChangeExpiryPrimCursorData> po_prim_msisdn_details) {
		this.po_prim_msisdn_details = po_prim_msisdn_details;
	}
	
	
	
	@Override
	public String toString() {
		return "StateChangeExpiryData [network_id="
				+ Arrays.toString(network_id) + ", pi_max_rows=" + pi_max_rows
				+ ", pi_to_status=" + Arrays.toString(pi_to_status)
				+ ", pi_instance_id=" + pi_instance_id
				+ ", po_prim_msisdn_details=" + po_prim_msisdn_details + "]";
	}
	
	
	
	
	
	
}
