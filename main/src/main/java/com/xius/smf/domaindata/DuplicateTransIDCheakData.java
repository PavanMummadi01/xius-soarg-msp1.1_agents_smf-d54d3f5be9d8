package com.xius.smf.domaindata;

public class DuplicateTransIDCheakData  extends DomainDataBase{

//	pro_ttsa_check_exttransid (
//			   pi_network_id   IN       NUMBER,
//			   pi_exttransid   IN       VARCHAR2,
//			   pi_orderid      IN       VARCHAR2,
//			   pi_new_msisdn   IN       NUMBER,
//			   pi_new_sim      IN       VARCHAR2,
//			   pi_old_msisdn   IN       NUMBER,
//			   pi_old_sim      IN       VARCHAR2,
//			   pi_flag         IN       VARCHAR2,
//			   po_error_code   OUT      NUMBER,
//			   po_error_desc   OUT      VARCHAR2
//			)
	
	
	 private String pi_exttransid;
	 private String pi_orderid;
	 private Long pi_new_msisdn;
	 private String pi_new_sim;
	 private Long pi_old_msisdn;
	 private String pi_old_sim;
	 private String pi_flag;

	public Long getPi_new_msisdn() {
		return pi_new_msisdn;
	}
	public void setPi_new_msisdn(Long pi_new_msisdn) {
		this.pi_new_msisdn = pi_new_msisdn;
	}
	public String getPi_new_sim() {
		return pi_new_sim;
	}
	public void setPi_new_sim(String pi_new_sim) {
		this.pi_new_sim = pi_new_sim;
	}
	public Long getPi_old_msisdn() {
		return pi_old_msisdn;
	}
	public void setPi_old_msisdn(Long pi_old_msisdn) {
		this.pi_old_msisdn = pi_old_msisdn;
	}
	public String getPi_old_sim() {
		return pi_old_sim;
	}
	public void setPi_old_sim(String pi_old_sim) {
		this.pi_old_sim = pi_old_sim;
	}
	public String getPi_orderid() {
		return pi_orderid;
	}
	public void setPi_orderid(String pi_orderid) {
		this.pi_orderid = pi_orderid;
	}
	public String getPi_exttransid() {
		return pi_exttransid;
	}
	public void setPi_exttransid(String pi_exttransid) {
		this.pi_exttransid = pi_exttransid;
	}
	public String getPi_flag() {
		return pi_flag;
	}
	public void setPi_flag(String pi_flag) {
		this.pi_flag = pi_flag;
	}
}
