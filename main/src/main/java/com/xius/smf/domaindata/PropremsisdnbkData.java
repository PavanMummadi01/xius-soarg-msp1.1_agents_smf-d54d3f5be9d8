package com.xius.smf.domaindata;

public class PropremsisdnbkData extends DomainDataBase{

//	pro_pre_msisdn_bk (
//			   pi_network_id      IN       NUMBER,
//			   pi_old_msisdn_no   IN       NUMBER,
//			   pi_new_msisdn_no   IN       NUMBER,
//			   po_error_code      OUT      NUMBER,
//			   po_error_desc      OUT      VARCHAR2
	
	 private Long pi_old_msisdn_no;
	 private Long pi_new_msisdn_no;
	 
	public Long getPi_old_msisdn_no() {
		return pi_old_msisdn_no;
	}
	public void setPi_old_msisdn_no(Long pi_old_msisdn_no) {
		this.pi_old_msisdn_no = pi_old_msisdn_no;
	}
	public Long getPi_new_msisdn_no() {
		return pi_new_msisdn_no;
	}
	public void setPi_new_msisdn_no(Long pi_new_msisdn_no) {
		this.pi_new_msisdn_no = pi_new_msisdn_no;
	}
}
