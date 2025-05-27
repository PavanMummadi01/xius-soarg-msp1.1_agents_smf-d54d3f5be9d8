package com.xius.smf.domaindata;

import java.util.ArrayList;

public class BulkTpSubsData  extends DomainDataBase{
	
     private Integer network_id [];
 	
 	private Long pi_max_rows;            
 	private String  pi_instance_id;
 	
	private ArrayList<BulkTpSubsCursorData> po_tarrifpack_dtls;
 	
	public ArrayList<BulkTpSubsCursorData> getPo_tarrifpack_dtls() {
		return po_tarrifpack_dtls;
	}
	public void setPo_tarrifpack_dtls(
			ArrayList<BulkTpSubsCursorData> po_tarrifpack_dtls) {
		this.po_tarrifpack_dtls = po_tarrifpack_dtls;
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
}
