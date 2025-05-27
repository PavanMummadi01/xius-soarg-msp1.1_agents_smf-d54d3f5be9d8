package com.xius.smf.domaindata;

import java.util.List;

import com.xius.smf.domaindata.DomainDataBase;

public class GetNotificationData extends DomainDataBase {

	private Long pi_account_id;                
	private Long pi_msisdn_no;      
	private Long pi_imsi_no;
	private String pi_sim;
	private String pi_personal_id;   

	private String   po_def_lang_desc;
	private Integer   po_def_lang_id;

	private List<GetNotificationCursorData> notifCursor;
	private List<GetLanguagesCursorData> langCursor;

	public String getPo_def_lang_desc() {
		return po_def_lang_desc;
	}

	public void setPo_def_lang_desc(String po_def_lang_desc) {
		this.po_def_lang_desc = po_def_lang_desc;
	}

	public Integer getPo_def_lang_id() {
		return po_def_lang_id;
	}

	public void setPo_def_lang_id(Integer po_def_lang_id) {
		this.po_def_lang_id = po_def_lang_id;
	}

	public Long getPi_account_id() {
		return pi_account_id;
	}

	public void setPi_account_id(Long pi_account_id) {
		this.pi_account_id = pi_account_id;
	}

	public Long getPi_msisdn_no() {
		return pi_msisdn_no;
	}

	public void setPi_msisdn_no(Long pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}

	public Long getPi_imsi_no() {
		return pi_imsi_no;
	}

	public void setPi_imsi_no(Long pi_imsi_no) {
		this.pi_imsi_no = pi_imsi_no;
	}

	public String getPi_sim() {
		return pi_sim;
	}

	public void setPi_sim(String pi_sim) {
		this.pi_sim = pi_sim;
	}

	public String getPi_personal_id() {
		return pi_personal_id;
	}

	public void setPi_personal_id(String pi_personal_id) {
		this.pi_personal_id = pi_personal_id;
	}

	public List<GetNotificationCursorData> getNotifCursor() {
		return notifCursor;
	}

	public void setNotifCursor(List<GetNotificationCursorData> notifCursor) {
		this.notifCursor = notifCursor;
	}

	public List<GetLanguagesCursorData> getLangCursor() {
		return langCursor;
	}

	public void setLangCursor(List<GetLanguagesCursorData> langCursor) {
		this.langCursor = langCursor;
	}
}
