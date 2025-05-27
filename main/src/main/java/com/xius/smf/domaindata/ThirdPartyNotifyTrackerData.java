package com.xius.smf.domaindata;

public class ThirdPartyNotifyTrackerData extends DomainDataBase {
	
	
	private String pi_msisdn_no;             
	private Long pi_account_id;           
	private String pi_notif_trans_id;     
	private String pi_notification_type;  
	private String pi_notification_msg ;  
	private String pi_trans_status ;      
	private String pi_response_code ;
	private String pi_remarks ;
	
	/**
	 * @return the pi_msisdn_no
	 */
	public String getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	/**
	 * @param pi_msisdn_no the pi_msisdn_no to set
	 */
	public void setPi_msisdn_no(String pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	/**
	 * @return the pi_account_id
	 */
	public Long getPi_account_id() {
		return pi_account_id;
	}
	/**
	 * @param pi_account_id the pi_account_id to set
	 */
	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	/**
	 * @return the pi_notif_trans_id
	 */
	public String getPi_notif_trans_id() {
		return pi_notif_trans_id;
	}
	/**
	 * @param pi_notif_trans_id the pi_notif_trans_id to set
	 */
	public void setPi_notif_trans_id(String pi_notif_trans_id) {
		this.pi_notif_trans_id = pi_notif_trans_id;
	}
	/**
	 * @return the pi_notification_type
	 */
	public String getPi_notification_type() {
		return pi_notification_type;
	}
	/**
	 * @param pi_notification_type the pi_notification_type to set
	 */
	public void setPi_notification_type(String pi_notification_type) {
		this.pi_notification_type = pi_notification_type;
	}
	/**
	 * @return the pi_notification_msg
	 */
	public String getPi_notification_msg() {
		return pi_notification_msg;
	}
	/**
	 * @param pi_notification_msg the pi_notification_msg to set
	 */
	public void setPi_notification_msg(String pi_notification_msg) {
		this.pi_notification_msg = pi_notification_msg;
	}
	/**
	 * @return the pi_trans_status
	 */
	public String getPi_trans_status() {
		return pi_trans_status;
	}
	/**
	 * @param pi_trans_status the pi_trans_status to set
	 */
	public void setPi_trans_status(String pi_trans_status) {
		this.pi_trans_status = pi_trans_status;
	}
	/**
	 * @return the pi_response_code
	 */
	public String getPi_response_code() {
		return pi_response_code;
	}
	/**
	 * @param pi_response_code the pi_response_code to set
	 */
	public void setPi_response_code(String pi_response_code) {
		this.pi_response_code = pi_response_code;
	}     
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	public String getPi_remarks() {
		return pi_remarks;
	}
	
	@Override
	public String toString() {
		return "ThirdPartyNotifyTrackerData " +
				"[pi_msisdn_no="+ pi_msisdn_no 
				+ ", pi_account_id=" + pi_account_id
				+ ", pi_notif_trans_id=" + pi_notif_trans_id
				+ ", pi_notification_type="+ pi_notification_type 
				+ ", pi_notification_msg=" + pi_notification_msg
				+ ", pi_trans_status=" + pi_trans_status 
				+ ", pi_response_code="+ pi_response_code 
				+ ", pi_remarks="+ pi_remarks 
				+ "]";
	}
	
	
	
}
