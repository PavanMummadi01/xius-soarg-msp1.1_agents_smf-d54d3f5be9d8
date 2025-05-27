package com.xius.smf.domaindata;

import java.util.ArrayList;



public class BulkAtpSubsData extends DomainDataBase {
	
	private Integer network_id [];
	
	private Long pi_max_rows;            
	private String  pi_instance_id;
	private ArrayList<BulkAtpSubsCursorData> po_subscription_dtls;
	
	
	
	public ArrayList<BulkAtpSubsCursorData> getPo_subscription_dtls() {
		return po_subscription_dtls;
	}
	public void setPo_subscription_dtls(
			ArrayList<BulkAtpSubsCursorData> po_subscription_dtls) {
		this.po_subscription_dtls = po_subscription_dtls;
	}
	public Long getPi_max_rows() {
		return pi_max_rows;
	}
	public void setPi_max_rows(Long pi_max_rows) {
		this.pi_max_rows = pi_max_rows;
	}
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
	@Override
	public String toString() {
		return "BulkAtpSubsData [pi_max_rows=" + pi_max_rows
				+ ", pi_instance_id=" + pi_instance_id
				+ ", po_subscription_dtls=" + po_subscription_dtls + "]";
	}
	
	
	
	

}
