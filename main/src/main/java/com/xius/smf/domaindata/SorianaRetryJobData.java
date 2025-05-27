package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.Arrays;

public class SorianaRetryJobData  extends DomainDataBase{
	
	
	private Integer[] network_id;
	private Long pi_max_records;
	private String pi_instance_id;
	private Integer[] pi_activity_id;
	private ArrayList<SorianaRetryCurData> cursor_data;
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
	public String getPi_instance_id() {
		return pi_instance_id;
	}
	public void setPi_instance_id(String pi_instance_id) {
		this.pi_instance_id = pi_instance_id;
	}
	public Integer[] getPi_activity_id() {
		return pi_activity_id;
	}
	public void setPi_activity_id(Integer[] pi_activity_id) {
		this.pi_activity_id = pi_activity_id;
	}
	public ArrayList<SorianaRetryCurData> getCursor_data() {
		return cursor_data;
	}
	public void setCursor_data(ArrayList<SorianaRetryCurData> cursor_data) {
		this.cursor_data = cursor_data;
	}
	@Override
	public String toString() {
		return "SorianaRetryJobData [network_id=" + Arrays.toString(network_id)
				+ ", pi_max_records=" + pi_max_records + ", pi_instance_id="
				+ pi_instance_id + ", pi_activity_id="
				+ Arrays.toString(pi_activity_id) + ", cursor_data="
				+ cursor_data + "]";
	}
	
	
	

	
	
}
