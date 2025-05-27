package com.xius.smf.domaindata;

import java.util.ArrayList;

public class BulkActDeactData  extends DomainDataBase{
	
     private Integer network_id [];
 	
 	private Long pi_max_rows;            
 	private String  pi_instance_id;
 	
	private ArrayList<BulkActDeactCursorData> po_deact_react_dtls;

	public Integer[] getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer[] network_id) {
		this.network_id = network_id;
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

	public ArrayList<BulkActDeactCursorData> getPo_deact_react_dtls() {
		return po_deact_react_dtls;
	}

	public void setPo_deact_react_dtls(
			ArrayList<BulkActDeactCursorData> po_deact_react_dtls) {
		this.po_deact_react_dtls = po_deact_react_dtls;
	}
 	
	
}
