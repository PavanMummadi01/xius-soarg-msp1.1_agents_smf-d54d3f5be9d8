package com.xius.smf.domaindata;

public class EmaFlowCMDSInsertData extends DomainDataBase {
	
	private String pi_msisdn ;      
	private String pi_new_msisdn  ; 
	private String pi_imsi   ;      
	private String pi_new_imsi ;  
	private String pi_status;
	private String pi_flow_name ;   
	private String po_trans_id ;
	private String[] pi_cmd_names;
	private Long[] pi_priorities;
	
	public String[] getPi_cmd_names() {
		return pi_cmd_names;
	}
	public void setPi_cmd_names(String[] pi_cmd_names) {
		this.pi_cmd_names = pi_cmd_names;
	}
	public Long[] getPi_priorities() {
		return pi_priorities;
	}
	public void setPi_priorities(Long[] pi_priorities) {
		this.pi_priorities = pi_priorities;
	}
	public String getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(String pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public String getPi_new_msisdn() {
		return pi_new_msisdn;
	}
	public void setPi_new_msisdn(String pi_new_msisdn) {
		this.pi_new_msisdn = pi_new_msisdn;
	}
	public String getPi_imsi() {
		return pi_imsi;
	}
	public void setPi_imsi(String pi_imsi) {
		this.pi_imsi = pi_imsi;
	}
	public String getPi_new_imsi() {
		return pi_new_imsi;
	}
	public void setPi_new_imsi(String pi_new_imsi) {
		this.pi_new_imsi = pi_new_imsi;
	}
	public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	public String getPi_flow_name() {
		return pi_flow_name;
	}
	public void setPi_flow_name(String pi_flow_name) {
		this.pi_flow_name = pi_flow_name;
	}
	public String getPo_trans_id() {
		return po_trans_id;
	}
	public void setPo_trans_id(String po_trans_id) {
		this.po_trans_id = po_trans_id;
	}
	
	

}

