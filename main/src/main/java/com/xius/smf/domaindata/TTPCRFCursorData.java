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

public class TTPCRFCursorData {

	/*
	 * network_id, account_id, imsi, msisdn_no, old_status, new_status,
	 * odb_value, status_change_date, status_change_reason, process_flag,
	 * processed_date, remarks, transaction_id, row_num
	 */
	private Long transation_id;
	private Long msisdn;
	private Long imsi;
	private Long activity_type;
	private Long failure_count;
	private String product_list;
	private String notify_status;
	private String start_date;
	private String end_date;
	private Long networkid;
	private String user_type;
	private String threeg_indicator;
	private String ema_processed_status;

	public String getEma_processed_status() {
		return ema_processed_status;
	}

	public void setEma_processed_status(String ema_processed_status) {
		this.ema_processed_status = ema_processed_status;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getThreeg_indicator() {
		return threeg_indicator;
	}

	public void setThreeg_indicator(String threeg_indicator) {
		this.threeg_indicator = threeg_indicator;
	}

	/**
	 * @return the transation_id
	 */
	public Long getTransation_id() {
		return transation_id;
	}

	/**
	 * @param transation_id
	 *            the transation_id to set
	 */
	public void setTransation_id(Long transation_id) {
		this.transation_id = transation_id;
	}

	/**
	 * @return the msisdn
	 */
	public Long getMsisdn() {
		return msisdn;
	}

	/**
	 * @param msisdn
	 *            the msisdn to set
	 */
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}

	/**
	 * @return the imsi
	 */
	public Long getImsi() {
		return imsi;
	}

	/**
	 * @param imsi
	 *            the imsi to set
	 */
	public void setImsi(Long imsi) {
		this.imsi = imsi;
	}

	/**
	 * @return the activity_type
	 */
	public Long getActivity_type() {
		return activity_type;
	}

	/**
	 * @param activity_type
	 *            the activity_type to set
	 */
	public void setActivity_type(Long activity_type) {
		this.activity_type = activity_type;
	}

	/**
	 * @return the failure_count
	 */
	public Long getFailure_count() {
		return failure_count;
	}

	/**
	 * @param failure_count
	 *            the failure_count to set
	 */
	public void setFailure_count(Long failure_count) {
		this.failure_count = failure_count;
	}

	/**
	 * @return the product_list
	 */
	public String getProduct_list() {
		return product_list;
	}

	/**
	 * @param product_list
	 *            the product_list to set
	 */
	public void setProduct_list(String product_list) {
		this.product_list = product_list;
	}

	/**
	 * @return the notify_status
	 */
	public String getNotify_status() {
		return notify_status;
	}

	/**
	 * @param notify_status
	 *            the notify_status to set
	 */
	public void setNotify_status(String notify_status) {
		this.notify_status = notify_status;
	}

	/**
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}

	/**
	 * @param start_date
	 *            the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	/**
	 * @return the end_date
	 */
	public String getEnd_date() {
		return end_date;
	}

	/**
	 * @param end_date
	 *            the end_date to set
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	/**
	 * @return the networkid
	 */
	public Long getNetworkid() {
		return networkid;
	}

	/**
	 * @param networkid
	 *            the networkid to set
	 */
	public void setNetworkid(Long networkid) {
		this.networkid = networkid;
	}

	@Override
	public String toString() {
		return "HLRCursorData [transation_id" + transation_id + ", msisdn="
				+ msisdn + ", imsi=" + imsi + ", activity_type="
				+ activity_type + ", failure_count=" + failure_count
				+ ", product_list=" + product_list + ", notify_status="
				+ notify_status + ", start_date=" + start_date + ", end_date="
				+ end_date + ", networkid=" + networkid + "]";
	}

}
