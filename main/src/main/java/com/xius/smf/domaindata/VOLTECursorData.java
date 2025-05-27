/**
 * Copyright   2012 XIUS.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of XIUS.
 * And may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of XIUS.
 *
 */

/**
 * 	@company	XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 *	@package	com.xius.smf.domaindata
 * 	@author		SaiRajesh.g
 *	@Date		Jan 29, 2014,6:38:51 PM
 */

package com.xius.smf.domaindata;

public class VOLTECursorData {

	/*
	 * network_id, account_id, imsi, msisdn_no, NEW_STATUS,
	 * PROCESS_SEQ_NUMBER,ACCOUNT_TYPE
	 */
	private Long network_id;
	private Long account_id;
	private Long imsi;
	private Long msisdn_no;
	private String NEW_STATUS;
	private Long PROCESS_SEQ_NUMBER;
	private String ACCOUNT_TYPE;
	private String sim_serial_no;
	private String publicity_id;
	
	
	public String getPublicity_id() {
		return publicity_id;
	}

	public void setPublicity_id(String publicity_id) {
		this.publicity_id = publicity_id;
	}

	public String getNEW_STATUS() {
		return NEW_STATUS;
	}

	public void setNEW_STATUS(String nEW_STATUS) {
		NEW_STATUS = nEW_STATUS;
	}

	public Long getPROCESS_SEQ_NUMBER() {
		return PROCESS_SEQ_NUMBER;
	}

	public void setPROCESS_SEQ_NUMBER(Long pROCESS_SEQ_NUMBER) {
		PROCESS_SEQ_NUMBER = pROCESS_SEQ_NUMBER;
	}

	public String getACCOUNT_TYPE() {
		return ACCOUNT_TYPE;
	}

	public void setACCOUNT_TYPE(String aCCOUNT_TYPE) {
		ACCOUNT_TYPE = aCCOUNT_TYPE;
	}

	public Long getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Long getImsi() {
		return imsi;
	}

	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}

	public Long getMsisdn_no() {
		return msisdn_no;
	}

	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}

	/**
	 * @param sim_serial_no
	 *            the sim_serial_no to set
	 */
	public void setSim_serial_no(String sim_serial_no) {
		this.sim_serial_no = sim_serial_no;
	}

	/**
	 * @return the sim_serial_no
	 */
	public String getSim_serial_no() {
		return sim_serial_no;
	}

	@Override
	public String toString() {
		return "VOLTECursorData [network_id" + network_id + ", account_id="
				+ account_id + ", imsi=" + imsi + ", msisdn_no=" + msisdn_no
				+ ", NEW_STATUS=" + NEW_STATUS + ", PROCESS_SEQ_NUMBER="
				+ PROCESS_SEQ_NUMBER + ", ACCOUNT_TYPE=" + ACCOUNT_TYPE
				+ " , sim_serial_no=" + sim_serial_no + "]";
	}

}
