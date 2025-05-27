package com.xius.smf.domaindata;

public class GetNotificationCursorData {

	private Long account_id;
	private Long msisdn_no;
	private String sim;
	private Long imsi_no;
	private String personal_id;
	private String email_id;
	
	private Integer email_notification_lang;
	private Integer sms_notification_lang; 
	private Integer ussd_notification_lang;
	private Integer ivr_notification_lang;
	
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public Long getImsi_no() {
		return imsi_no;
	}
	public void setImsi_no(Long imsi_no) {
		this.imsi_no = imsi_no;
	}
	public String getPersonal_id() {
		return personal_id;
	}
	public void setPersonal_id(String personal_id) {
		this.personal_id = personal_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public Integer getEmail_notification_lang() {
		return email_notification_lang;
	}
	public void setEmail_notification_lang(Integer email_notification_lang) {
		this.email_notification_lang = email_notification_lang;
	}
	public Integer getSms_notification_lang() {
		return sms_notification_lang;
	}
	public void setSms_notification_lang(Integer sms_notification_lang) {
		this.sms_notification_lang = sms_notification_lang;
	}
	public Integer getUssd_notification_lang() {
		return ussd_notification_lang;
	}
	public void setUssd_notification_lang(Integer ussd_notification_lang) {
		this.ussd_notification_lang = ussd_notification_lang;
	}
	public Integer getIvr_notification_lang() {
		return ivr_notification_lang;
	}
	public void setIvr_notification_lang(Integer ivr_notification_lang) {
		this.ivr_notification_lang = ivr_notification_lang;
	}
}
