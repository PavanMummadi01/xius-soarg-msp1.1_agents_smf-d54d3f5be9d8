package com.xius.smf.domaindata;

public class SIMSaleData extends DomainDataBase {
	
	  private String pi_activity_type;
	  private Long pi_old_msisdn;
	  private Long pi_new_msisdn;
	  private String pi_old_sim;
	  private String  pi_new_sim;
	  private Long pi_old_imsi;
	  private Long pi_new_imsi;
	  private Long pi_curr_state_id;
	  private String pi_custom_field1;
	  private String pi_old_account_id;
	  private String pi_new_account_id;
	  private String pi_STATUS_CHANGE_DATE;
	  private String pi_OLD_STATE;
	  private String pi_NEW_STATE;
	  private String pi_technology;
	
	private String po_trans_id;
	  
	private String pi_ext_trans_id2;
	private String pi_channel;
	private String pi_custom_field2;
	private String pi_custom_field3;
	private String pi_custom_field4;
	private String pi_custom_field5;
	private String pi_custom_field6;
  //added for roaming related changes
	 private Long pi_service;
	 private String pi_baseserviceid;
	 private String pi_derivedserviceid;
	 private String pi_ATPids;
	 private String pi_chargeid;
	 private String pi_publicityid;
	 private String pi_activationfee;
	 private String pi_ATPUniqueid;
	 private String pi_unsub_atp_yn;
	 private Long pi_NIR;
	 
	public String getPi_unsub_atp_yn() {
		return pi_unsub_atp_yn;
	}
	public void setPi_unsub_atp_yn(String pi_unsub_atp_yn) {
		this.pi_unsub_atp_yn = pi_unsub_atp_yn;
	}
	public String getPi_old_account_id() {
		return pi_old_account_id;
	}
	public void setPi_old_account_id(String pi_old_account_id) {
		this.pi_old_account_id = pi_old_account_id;
	}
	public String getPi_new_account_id() {
		return pi_new_account_id;
	}
	public void setPi_new_account_id(String pi_new_account_id) {
		this.pi_new_account_id = pi_new_account_id;
	}
	public String getPi_STATUS_CHANGE_DATE() {
		return pi_STATUS_CHANGE_DATE;
	}
	public void setPi_STATUS_CHANGE_DATE(String pi_STATUS_CHANGE_DATE) {
		this.pi_STATUS_CHANGE_DATE = pi_STATUS_CHANGE_DATE;
	}
	public String getPi_OLD_STATE() {
		return pi_OLD_STATE;
	}
	public void setPi_OLD_STATE(String pi_OLD_STATE) {
		this.pi_OLD_STATE = pi_OLD_STATE;
	}
	public String getPi_NEW_STATE() {
		return pi_NEW_STATE;
	}
	public void setPi_NEW_STATE(String pi_NEW_STATE) {
		this.pi_NEW_STATE = pi_NEW_STATE;
	}
	public Long getPi_curr_state_id() {
		return pi_curr_state_id;
	}
	public void setPi_curr_state_id(Long pi_curr_state_id) {
		this.pi_curr_state_id = pi_curr_state_id;
	}
	public String getPi_custom_field1() {
		return pi_custom_field1;
	}
	public void setPi_custom_field1(String pi_custom_field1) {
		this.pi_custom_field1 = pi_custom_field1;
	}
	public String getPo_trans_id() {
		return po_trans_id;
	}
	public void setPo_trans_id(String po_trans_id) {
		this.po_trans_id = po_trans_id;
	}
	public String getPi_activity_type() {
		return pi_activity_type;
	}
	public void setPi_activity_type(String pi_activity_type) {
		this.pi_activity_type = pi_activity_type;
	}
	public Long getPi_old_msisdn() {
		return pi_old_msisdn;
	}
	public void setPi_old_msisdn(Long pi_old_msisdn) {
		this.pi_old_msisdn = pi_old_msisdn;
	}
	public Long getPi_new_msisdn() {
		return pi_new_msisdn;
	}
	public void setPi_new_msisdn(Long pi_new_msisdn) {
		this.pi_new_msisdn = pi_new_msisdn;
	}
	public String getPi_old_sim() {
		return pi_old_sim;
	}
	public void setPi_old_sim(String pi_old_sim) {
		this.pi_old_sim = pi_old_sim;
	}
	public String getPi_new_sim() {
		return pi_new_sim;
	}
	public void setPi_new_sim(String pi_new_sim) {
		this.pi_new_sim = pi_new_sim;
	}
	public Long getPi_old_imsi() {
		return pi_old_imsi;
	}
	public void setPi_old_imsi(Long pi_old_imsi) {
		this.pi_old_imsi = pi_old_imsi;
	}
	public Long getPi_new_imsi() {
		return pi_new_imsi;
	}
	public void setPi_new_imsi(Long pi_new_imsi) {
		this.pi_new_imsi = pi_new_imsi;
	}
	
	  public String getPi_technology() {
			return pi_technology;
		}
		public void setPi_technology(String pi_technology) {
			this.pi_technology = pi_technology;
		}

		public String getPi_ext_trans_id2() {
			return pi_ext_trans_id2;
		}
		public void setPi_ext_trans_id2(String pi_ext_trans_id2) {
			this.pi_ext_trans_id2 = pi_ext_trans_id2;
		}
		public String getPi_channel() {
			return pi_channel;
		}
		public void setPi_channel(String pi_channel) {
			this.pi_channel = pi_channel;
		}
		public String getPi_custom_field2() {
			return pi_custom_field2;
		}
		public void setPi_custom_field2(String pi_custom_field2) {
			this.pi_custom_field2 = pi_custom_field2;
		}
		public String getPi_custom_field3() {
			return pi_custom_field3;
		}
		public void setPi_custom_field3(String pi_custom_field3) {
			this.pi_custom_field3 = pi_custom_field3;
		}
		public String getPi_custom_field4() {
			return pi_custom_field4;
		}
		public void setPi_custom_field4(String pi_custom_field4) {
			this.pi_custom_field4 = pi_custom_field4;
		}
		public String getPi_custom_field5() {
			return pi_custom_field5;
		}
		public void setPi_custom_field5(String pi_custom_field5) {
			this.pi_custom_field5 = pi_custom_field5;
		}
		public String getPi_custom_field6() {
			return pi_custom_field6;
		}
		public void setPi_custom_field6(String pi_custom_field6) {
			this.pi_custom_field6 = pi_custom_field6;
		}
	
		
		
	
		public Long getPi_service() {
			return pi_service;
		}
		public void setPi_service(Long pi_service) {
			this.pi_service = pi_service;
		}
		public String getPi_baseserviceid() {
			return pi_baseserviceid;
		}
		public void setPi_baseserviceid(String pi_baseserviceid) {
			this.pi_baseserviceid = pi_baseserviceid;
		}
		public String getPi_derivedserviceid() {
			return pi_derivedserviceid;
		}
		public void setPi_derivedserviceid(String pi_derivedserviceid) {
			this.pi_derivedserviceid = pi_derivedserviceid;
		}
		public String getPi_ATPids() {
			return pi_ATPids;
		}
		public void setPi_ATPids(String pi_ATPids) {
			this.pi_ATPids = pi_ATPids;
		}
		public String getPi_chargeid() {
			return pi_chargeid;
		}
		public void setPi_chargeid(String pi_chargeid) {
			this.pi_chargeid = pi_chargeid;
		}
		public String getPi_publicityid() {
			return pi_publicityid;
		}
		public void setPi_publicityid(String pi_publicityid) {
			this.pi_publicityid = pi_publicityid;
		}
		public String getPi_activationfee() {
			return pi_activationfee;
		}
		public void setPi_activationfee(String pi_activationfee) {
			this.pi_activationfee = pi_activationfee;
		}
		
		public String getPi_ATPUniqueid() {
			return pi_ATPUniqueid;
		}
		public void setPi_ATPUniqueid(String pi_ATPUniqueid) {
			this.pi_ATPUniqueid = pi_ATPUniqueid;
		}
		public Long getPi_NIR() {
			return pi_NIR;
		}
		public void setPi_NIR(Long pi_NIR) {
			this.pi_NIR = pi_NIR;
		}
		@Override
		public String toString() {
			return "SIMSaleData [pi_activity_type=" + pi_activity_type
					+ ", pi_old_msisdn=" + pi_old_msisdn + ", pi_new_msisdn="
					+ pi_new_msisdn + ", pi_old_sim=" + pi_old_sim
					+ ", pi_new_sim=" + pi_new_sim + ", pi_old_imsi="
					+ pi_old_imsi + ", pi_new_imsi=" + pi_new_imsi
					+ ", pi_curr_state_id=" + pi_curr_state_id
					+ ", pi_custom_field1=" + pi_custom_field1
					+ ", pi_old_account_id=" + pi_old_account_id
					+ ", pi_new_account_id=" + pi_new_account_id
					+ ", pi_STATUS_CHANGE_DATE=" + pi_STATUS_CHANGE_DATE
					+ ", pi_OLD_STATE=" + pi_OLD_STATE + ", pi_NEW_STATE="
					+ pi_NEW_STATE + ", pi_technology=" + pi_technology
					+ ", po_trans_id=" + po_trans_id + ", pi_ext_trans_id2="
					+ pi_ext_trans_id2 + ", pi_channel=" + pi_channel
					+ ", pi_custom_field2=" + pi_custom_field2
					+ ", pi_custom_field3=" + pi_custom_field3
					+ ", pi_custom_field4=" + pi_custom_field4
					+ ", pi_custom_field5=" + pi_custom_field5
					+ ", pi_custom_field6=" + pi_custom_field6
					+ ", pi_service=" + pi_service + ", pi_baseserviceid="
					+ pi_baseserviceid + ", pi_derivedserviceid="
					+ pi_derivedserviceid + ", pi_ATPids=" + pi_ATPids
					+ ", pi_chargeid=" + pi_chargeid + ", pi_publicityid="
					+ pi_publicityid + ", pi_activationfee=" + pi_activationfee
					+ ", pi_ATPUniqueid=" + pi_ATPUniqueid
					+ ", pi_unsub_atp_yn=" + pi_unsub_atp_yn + ", pi_NIR="
					+ pi_NIR + ", pi_network_id=" + pi_network_id
					+ ", pi_login_id=" + pi_login_id + ", pi_password="
					+ pi_password + ", pi_username=" + pi_username
					+ ", po_error_code=" + po_error_code + ", pi_app_id="
					+ pi_app_id + ", po_error_desc=" + po_error_desc + "]";
		}
	
}
