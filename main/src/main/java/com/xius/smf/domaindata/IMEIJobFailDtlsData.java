package com.xius.smf.domaindata;


public class IMEIJobFailDtlsData extends DomainDataBase {

	/* pi_filename              IN       VARCHAR2,
     pi_networkid             IN       NUMBER,
     pi_imei_array            IN       arr_varchar,
     pi_gsme_error_code_arr   IN       arr_varchar,
     pi_remarks_arr           IN       arr_varchar,
     po_error_code            OUT      NUMBER,
     po_error_desc            OUT      VARCHAR2*/
     
	private String pi_file_name;
	private String[] pi_imei_array;
	private String[] pi_gsme_error_code_arr;
	private String[] pi_remarks_arr;
	/**
	 * @return the pi_file_name
	 */
	public String getPi_file_name() {
		return pi_file_name;
	}
	/**
	 * @param pi_file_name the pi_file_name to set
	 */
	public void setPi_file_name(String pi_file_name) {
		this.pi_file_name = pi_file_name;
	}
	/**
	 * @return the pi_imei_array
	 */
	public String[] getPi_imei_array() {
		return pi_imei_array;
	}
	/**
	 * @param pi_imei_array the pi_imei_array to set
	 */
	public void setPi_imei_array(String[] pi_imei_array) {
		this.pi_imei_array = pi_imei_array;
	}
	/**
	 * @return the pi_gsme_error_code_arr
	 */
	public String[] getPi_gsme_error_code_arr() {
		return pi_gsme_error_code_arr;
	}
	/**
	 * @param pi_gsme_error_code_arr the pi_gsme_error_code_arr to set
	 */
	public void setPi_gsme_error_code_arr(String[] pi_gsme_error_code_arr) {
		this.pi_gsme_error_code_arr = pi_gsme_error_code_arr;
	}
	/**
	 * @return the pi_remarks_arr
	 */
	public String[] getPi_remarks_arr() {
		return pi_remarks_arr;
	}
	/**
	 * @param pi_remarks_arr the pi_remarks_arr to set
	 */
	public void setPi_remarks_arr(String[] pi_remarks_arr) {
		this.pi_remarks_arr = pi_remarks_arr;
	}
	
	
	
}
