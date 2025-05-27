package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class Imei_His_dtls_cursor_dtls extends DomainDataBase {
	private Long NETWORK_ID;
	private String USER_ID;
	private String IMEI;
	private String TASKP_ERFOMED;
	private String TASK_ASSIGNEDON;
	private String TASK_PERFOMEDBY;
	private String COUNTRY;
	
	public Long getNETWORK_ID() {
		return NETWORK_ID;
	}
	public void setNETWORK_ID(Long nETWORK_ID) {
		NETWORK_ID = nETWORK_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public String getTASKP_ERFOMED() {
		return TASKP_ERFOMED;
	}
	public void setTASKP_ERFOMED(String tASKP_ERFOMED) {
		TASKP_ERFOMED = tASKP_ERFOMED;
	}
	public String getTASK_ASSIGNEDON() {
		return TASK_ASSIGNEDON;
	}
	public void setTASK_ASSIGNEDON(String tASK_ASSIGNEDON) {
		TASK_ASSIGNEDON = tASK_ASSIGNEDON;
	}
	public String getTASK_PERFOMEDBY() {
		return TASK_PERFOMEDBY;
	}
	public void setTASK_PERFOMEDBY(String tASK_PERFOMEDBY) {
		TASK_PERFOMEDBY = tASK_PERFOMEDBY;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	
}
