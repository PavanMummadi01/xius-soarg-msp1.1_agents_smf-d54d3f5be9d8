package com.xius.smf.domaindata;

public class InsertExternalDetailsData extends DomainDataBase{
/*
 * pi_msisdn_no           IN       NUMBER,
      pi_sim_no              IN       VARCHAR2,
      pi_tpid                IN       VARCHAR2,
      pi_id_type             IN       VARCHAR2,
      pi_id_value            IN       VARCHAR2,
      pi_original_trans_id   IN       VARCHAR2,
      pi_invoker_id          IN       VARCHAR2,
      pi_network_id          IN       NUMBER,
      pi_user_id             IN       VARCHAR2,
      pi_channel             IN       VARCHAR2,
       pi_external_id         IN       NUMBER,
      po_trans_ref_id        OUT      VARCHAR
 */

	private Long pi_msisdn_no;
	private  String pi_sim_no;
	private  String pi_id_value;
	private  String pi_tpid;
	private  String pi_id_type;
	private  String pi_original_trans_id;
	private String  pi_invoker_id;
	private String pi_channel;
	private String pi_external_id;
	private String po_trans_ref_id;
	
	public String getPi_external_id() {
		return pi_external_id;
	}
	public void setPi_external_id(String pi_external_id) {
		this.pi_external_id = pi_external_id;
	}
	public String getPo_trans_ref_id() {
		return po_trans_ref_id;
	}
	public void setPo_trans_ref_id(String po_trans_ref_id) {
		this.po_trans_ref_id = po_trans_ref_id;
	}
	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public String getPi_sim_no() {
		return pi_sim_no;
	}
	public void setPi_sim_no(String pi_sim_no) {
		this.pi_sim_no = pi_sim_no;
	}
	public String getPi_id_value() {
		return pi_id_value;
	}
	public void setPi_id_value(String pi_id_value) {
		this.pi_id_value = pi_id_value;
	}
	public String getPi_tpid() {
		return pi_tpid;
	}
	public void setPi_tpid(String pi_tpid) {
		this.pi_tpid = pi_tpid;
	}
	public String getPi_id_type() {
		return pi_id_type;
	}
	public void setPi_id_type(String pi_id_type) {
		this.pi_id_type = pi_id_type;
	}
	public String getPi_original_trans_id() {
		return pi_original_trans_id;
	}
	public void setPi_original_trans_id(String pi_original_trans_id) {
		this.pi_original_trans_id = pi_original_trans_id;
	}
	public String getPi_invoker_id() {
		return pi_invoker_id;
	}
	public void setPi_invoker_id(String pi_invoker_id) {
		this.pi_invoker_id = pi_invoker_id;
	}
	public String getPi_channel() {
		return pi_channel;
	}
	public void setPi_channel(String pi_channel) {
		this.pi_channel = pi_channel;
	}
	
}

