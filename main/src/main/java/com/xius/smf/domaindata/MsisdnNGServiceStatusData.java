package com.xius.smf.domaindata;

import java.util.ArrayList;

public class MsisdnNGServiceStatusData extends DomainDataBase{
	
	private String pi_msisdn_no;
	private ArrayList<MsisdnNGServiceStatusCursorData> po_mblservice_add_detch_dtls;
	public String getPi_msisdn_no() {
		return pi_msisdn_no;
	}
	public void setPi_msisdn_no(String pi_msisdn_no) {
		this.pi_msisdn_no = pi_msisdn_no;
	}
	public ArrayList<MsisdnNGServiceStatusCursorData> getPo_mblservice_add_detch_dtls() {
		return po_mblservice_add_detch_dtls;
	}
	public void setPo_mblservice_add_detch_dtls(ArrayList<MsisdnNGServiceStatusCursorData> po_mblservice_add_detch_dtls) {
		this.po_mblservice_add_detch_dtls = po_mblservice_add_detch_dtls;
	}
	@Override
	public String toString() {
		return "MsisdnNGServiceStatusData [pi_msisdn_no=" + pi_msisdn_no + ", po_mblservice_add_detch_dtls="
				+ po_mblservice_add_detch_dtls + "]";
	}
	
	
}
