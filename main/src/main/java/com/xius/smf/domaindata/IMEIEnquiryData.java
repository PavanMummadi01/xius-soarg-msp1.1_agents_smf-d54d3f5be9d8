package com.xius.smf.domaindata;

import java.util.ArrayList;

public class IMEIEnquiryData extends DomainDataBase {

	private String pi_deviceid;
	private String pi_partnerid;
	private String pi_branchid;
	private String pi_recordidentifier;
	private String po_response;
	private ArrayList<Imei_enq_dtls_cursor_dtls> po_imei_enq_dtls;
	private ArrayList<Imei_His_dtls_cursor_dtls> po_imei_his_dtls;
	public String getPi_deviceid() {
		return pi_deviceid;
	}
	public void setPi_deviceid(String pi_deviceid) {
		this.pi_deviceid = pi_deviceid;
	}
	public String getPi_partnerid() {
		return pi_partnerid;
	}
	public void setPi_partnerid(String pi_partnerid) {
		this.pi_partnerid = pi_partnerid;
	}
	public String getPi_branchid() {
		return pi_branchid;
	}
	public void setPi_branchid(String pi_branchid) {
		this.pi_branchid = pi_branchid;
	}
	public String getPi_recordidentifier() {
		return pi_recordidentifier;
	}
	public void setPi_recordidentifier(String pi_recordidentifier) {
		this.pi_recordidentifier = pi_recordidentifier;
	}
	public String getPo_response() {
		return po_response;
	}
	public void setPo_response(String po_response) {
		this.po_response = po_response;
	}
	public ArrayList<Imei_enq_dtls_cursor_dtls> getPo_imei_enq_dtls() {
		return po_imei_enq_dtls;
	}
	public void setPo_imei_enq_dtls(
			ArrayList<Imei_enq_dtls_cursor_dtls> po_imei_enq_dtls) {
		this.po_imei_enq_dtls = po_imei_enq_dtls;
	}
	public ArrayList<Imei_His_dtls_cursor_dtls> getPo_imei_his_dtls() {
		return po_imei_his_dtls;
	}
	public void setPo_imei_his_dtls(
			ArrayList<Imei_His_dtls_cursor_dtls> po_imei_his_dtls) {
		this.po_imei_his_dtls = po_imei_his_dtls;
	}

}
