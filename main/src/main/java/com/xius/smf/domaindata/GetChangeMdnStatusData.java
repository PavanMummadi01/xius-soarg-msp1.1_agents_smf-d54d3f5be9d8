package com.xius.smf.domaindata;

public class GetChangeMdnStatusData extends DomainDataBase{
	private Long pi_network_id;
	private String pi_userid;
	private String pi_trans_id ;   
	private String pi_ext_trans_id;
	private String po_status ;
	
	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}
	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}
	public Long getPi_network_id() {
		return pi_network_id;
	}
	public void setPi_network_id(Long pi_network_id) {
		this.pi_network_id = pi_network_id;
	}
	public String getPi_userid() {
		return pi_userid;
	}
	public void setPi_userid(String pi_userid) {
		this.pi_userid = pi_userid;
	}
	public String getPi_trans_id() {
		return pi_trans_id;
	}
	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}
	public String getPo_status() {
		return po_status;
	}
	public void setPo_status(String po_status) {
		this.po_status = po_status;
	}      
    
	
}
