package com.xius.smf.domaindata;

import java.util.Date;


public class NotificationDetailsCursorData {

	
	private Long msisdn_no  = null;	
	private Long lv_notification_type = null;
	private Long invoice_id         = null;
	private String invoice_date       = null;
	private Long total_amount_due   = null;
	private String payment_due_date   = null;
	private Long remindertype       = null;
	private Long network_id         = null;
	/**
	 * @return the network_id
	 */
	public Long getNetwork_id() {
		return network_id;
	}
	/**
	 * @param network_id the network_id to set
	 */
	public void setNetwork_id(Long network_id) {
		this.network_id = network_id;
	}
	/**
	 * @return the invoice_id
	 */
	public Long getInvoice_id() {
		return invoice_id;
	}
	/**
	 * @param invoice_id the invoice_id to set
	 */
	public void setInvoice_id(Long invoice_id) {
		this.invoice_id = invoice_id;
	}
	/**
	 * @return the invoice_date
	 */
	public String getInvoice_date() {
		return invoice_date;
	}
	/**
	 * @param invoice_date the invoice_date to set
	 */
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	/**
	 * @return the total_amount_due
	 */
	public Long getTotal_amount_due() {
		return total_amount_due;
	}
	/**
	 * @param total_amount_due the total_amount_due to set
	 */
	public void setTotal_amount_due(Long total_amount_due) {
		this.total_amount_due = total_amount_due;
	}
	/**
	 * @return the payment_due_date
	 */
	public String getPayment_due_date() {
		return payment_due_date;
	}
	/**
	 * @param payment_due_date the payment_due_date to set
	 */
	public void setPayment_due_date(String payment_due_date) {
		this.payment_due_date = payment_due_date;
	}
	/**
	 * @return the remindertype
	 */
	public Long getRemindertype() {
		return remindertype;
	}
	/**
	 * @param remindertype the remindertype to set
	 */
	public void setRemindertype(Long remindertype) {
		this.remindertype = remindertype;
	}		
	/**
	 * @return the lv_notification_type
	 */
	public Long getLv_notification_type() {
		return lv_notification_type;
	}
	/**
	 * @param lv_notification_type the lv_notification_type to set
	 */
	public void setLv_notification_type(Long lv_notification_type) {
		this.lv_notification_type = lv_notification_type;
	}
	public Long getMsisdn_no() {
		return msisdn_no;
	}
	public void setMsisdn_no(Long msisdn_no) {
		this.msisdn_no = msisdn_no;
	}
	
}
