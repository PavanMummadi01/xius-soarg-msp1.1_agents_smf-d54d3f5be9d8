package com.xius.smf.domaindata;

import java.math.BigDecimal;

public class SMSNotifierData extends DomainDataBase{

	private Long[] pi_network_id_arr;
	private Long pi_record_process;       
	 private String []  po_msisdn_arr ;           
	 private String [] po_data_arr ;           
	 private String [] po_flag_arr ;           
	   private String  [] po_expiration_date_arr; 
	   private BigDecimal[] po_threshold_amnt_arr ;   
	   private BigDecimal[]  po_current_bal_arr;
	   private BigDecimal[]   po_network_id;

	   
	   
	   
	/**
	 * @return the pi_network_id_arr
	 */
	public Long[] getPi_network_id_arr() {
		return pi_network_id_arr;
	}
	/**
	 * @param pi_network_id_arr the pi_network_id_arr to set
	 */
	public void setPi_network_id_arr(Long[] pi_network_id_arr) {
		this.pi_network_id_arr = pi_network_id_arr;
	}
	/**
	 * @return the pi_record_process
	 */
	public Long getPi_record_process() {
		return pi_record_process;
	}
	/**
	 * @param pi_record_process the pi_record_process to set
	 */
	public void setPi_record_process(Long pi_record_process) {
		this.pi_record_process = pi_record_process;
	}
	/**
	 * @return the po_msisdn_arr
	 */
	public String[] getPo_msisdn_arr() {
		return po_msisdn_arr;
	}
	/**
	 * @param po_msisdn_arr the po_msisdn_arr to set
	 */
	public void setPo_msisdn_arr(String[] po_msisdn_arr) {
		this.po_msisdn_arr = po_msisdn_arr;
	}
	/**
	 * @return the po_data_arr
	 */
	public String[] getPo_data_arr() {
		return po_data_arr;
	}
	/**
	 * @param po_data_arr the po_data_arr to set
	 */
	public void setPo_data_arr(String[] po_data_arr) {
		this.po_data_arr = po_data_arr;
	}
	/**
	 * @return the po_flag_arr
	 */
	public String[] getPo_flag_arr() {
		return po_flag_arr;
	}
	/**
	 * @param po_flag_arr the po_flag_arr to set
	 */
	public void setPo_flag_arr(String[] po_flag_arr) {
		this.po_flag_arr = po_flag_arr;
	}
	/**
	 * @return the po_expiration_date_arr
	 */
	public String[] getPo_expiration_date_arr() {
		return po_expiration_date_arr;
	}
	/**
	 * @param po_expiration_date_arr the po_expiration_date_arr to set
	 */
	public void setPo_expiration_date_arr(String[] po_expiration_date_arr) {
		this.po_expiration_date_arr = po_expiration_date_arr;
	}
	/**
	 * @return the po_threshold_amnt_arr
	 */
	public BigDecimal[] getPo_threshold_amnt_arr() {
		return po_threshold_amnt_arr;
	}
	/**
	 * @param po_threshold_amnt_arr the po_threshold_amnt_arr to set
	 */
	public void setPo_threshold_amnt_arr(BigDecimal[] po_threshold_amnt_arr) {
		this.po_threshold_amnt_arr = po_threshold_amnt_arr;
	}
	/**
	 * @return the po_current_bal_arr
	 */
	public BigDecimal[] getPo_current_bal_arr() {
		return po_current_bal_arr;
	}
	/**
	 * @param po_current_bal_arr the po_current_bal_arr to set
	 */
	public void setPo_current_bal_arr(BigDecimal[] po_current_bal_arr) {
		this.po_current_bal_arr = po_current_bal_arr;
	}
	/**
	 * @return the po_network_id
	 */
	public BigDecimal[] getPo_network_id() {
		return po_network_id;
	}
	/**
	 * @param po_network_id the po_network_id to set
	 */
	public void setPo_network_id(BigDecimal[] po_network_id) {
		this.po_network_id = po_network_id;
	}

	   
	
}
