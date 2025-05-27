package com.xius.smf.domaindata;

import java.util.ArrayList;

public class Imei_file_dtls extends DomainDataBase {
	
	private String  pio_fileid;
	private Long pi_instanceid;
	ArrayList<Imei_file_dtls_cursor_dtls> po_emi_file_dtls;
	private String po_date;
	
	/**
	 * @return the pio_fileid
	 */
	public String getPio_fileid() {
		return pio_fileid;
	}
	/**
	 * @param pio_fileid the pio_fileid to set
	 */
	public void setPio_fileid(String pio_fileid) {
		this.pio_fileid = pio_fileid;
	}
	/**
	 * @return the pi_instanceid
	 */
	public Long getPi_instanceid() {
		return pi_instanceid;
	}
	/**
	 * @param pi_instanceid the pi_instanceid to set
	 */
	public void setPi_instanceid(Long pi_instanceid) {
		this.pi_instanceid = pi_instanceid;
	}
	/**
	 * @return the po_emi_file_dtls
	 */
	public ArrayList<Imei_file_dtls_cursor_dtls> getPo_emi_file_dtls() {
		return po_emi_file_dtls;
	}
	/**
	 * @param po_emi_file_dtls the po_emi_file_dtls to set
	 */
	public void setPo_emi_file_dtls(
			ArrayList<Imei_file_dtls_cursor_dtls> po_emi_file_dtls) {
		this.po_emi_file_dtls = po_emi_file_dtls;
	}
	/**
	 * @param po_date the po_date to set
	 */
	public void setPo_date(String po_date) {
		this.po_date = po_date;
	}
	/**
	 * @return the po_date
	 */
	public String getPo_date() {
		return po_date;
	}
	
   
      
}
