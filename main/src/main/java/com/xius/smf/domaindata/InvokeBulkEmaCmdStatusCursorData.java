package com.xius.smf.domaindata;

public class InvokeBulkEmaCmdStatusCursorData {

	private String LoginId;
	private String Internal_TranId;
	private Long MSISDN;
	private String CMD_NAME;
	private String CREATED_DATE;
	private String STATUS;
	private String REMARKS;
	private String reason;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getMSISDN() {
		return MSISDN;
	}

	public void setMSISDN(Long mSISDN) {
		MSISDN = mSISDN;
	}

	public String getLoginId() {
		return LoginId;
	}

	public void setLoginId(String loginId) {
		LoginId = loginId;
	}

	public String getInternal_TranId() {
		return Internal_TranId;
	}

	public void setInternal_TranId(String internal_TranId) {
		Internal_TranId = internal_TranId;
	}

	public String getCMD_NAME() {
		return CMD_NAME;
	}

	public void setCMD_NAME(String cMD_NAME) {
		CMD_NAME = cMD_NAME;
	}

	public String getCREATED_DATE() {
		return CREATED_DATE;
	}

	public void setCREATED_DATE(String cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

}
