package com.xius.smf.domaindata;

import java.util.ArrayList;

public class UpdateSIMSaleData extends DomainDataBase {

	private String pi_trans_id;
	private String pi_ext_trans_id;
	private Long pi_curr_state_id;
	private String pi_status;
	private String pi_remarks;
	private Long pi_new_msisdn;
	private String pi_ext_trans_status;
	private String pi_response_code;
	private String pi_response_message;
	private String pi_external_details;
	private Long pio_old_msisdn;
	private String pio_old_sim;
	private String po_activity_type;
	private String pio_old_imsi;
	private String pio_new_imsi;
	private String pio_new_sim;
	private Long po_new_msisdn;
	public String getPo_unsub_atp_yn() {
		return po_unsub_atp_yn;
	}

	public void setPo_unsub_atp_yn(String po_unsub_atp_yn) {
		this.po_unsub_atp_yn = po_unsub_atp_yn;
	}

	private String pi_ext_error_code;
	private String pi_service;
	private String  po_unsub_atp_yn    ;
	
	private ArrayList<UpdateSIMSaleCusorData> cursor_data;
	

	public String getPi_ext_error_code() {
		return pi_ext_error_code;
	}

	public void setPi_ext_error_code(String pi_ext_error_code) {
		this.pi_ext_error_code = pi_ext_error_code;
	}

	public Long getPo_new_msisdn() {
		return po_new_msisdn;
	}

	public void setPo_new_msisdn(Long po_new_msisdn) {
		this.po_new_msisdn = po_new_msisdn;
	}

	public String getPi_ext_trans_status() {
		return pi_ext_trans_status;
	}

	public void setPi_ext_trans_status(String pi_ext_trans_status) {
		this.pi_ext_trans_status = pi_ext_trans_status;
	}

	public String getPi_response_code() {
		return pi_response_code;
	}

	public void setPi_response_code(String pi_response_code) {
		this.pi_response_code = pi_response_code;
	}

	public String getPi_response_message() {
		return pi_response_message;
	}

	public void setPi_response_message(String pi_response_message) {
		this.pi_response_message = pi_response_message;
	}

	public String getPo_activity_type() {
		return po_activity_type;
	}

	public void setPo_activity_type(String po_activity_type) {
		this.po_activity_type = po_activity_type;
	}

	public String getPi_external_details() {
		return pi_external_details;
	}

	public void setPi_external_details(String pi_external_details) {
		this.pi_external_details = pi_external_details;
	}

	public String getPi_status() {
		return pi_status;
	}

	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}

	public Long getPi_curr_state_id() {
		return pi_curr_state_id;
	}

	public void setPi_curr_state_id(Long pi_curr_state_id) {
		this.pi_curr_state_id = pi_curr_state_id;
	}

	public String getPi_trans_id() {
		return pi_trans_id;
	}

	public void setPi_trans_id(String pi_trans_id) {
		this.pi_trans_id = pi_trans_id;
	}

	public String getPi_remarks() {
		return pi_remarks;
	}

	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}

	public String getPi_ext_trans_id() {
		return pi_ext_trans_id;
	}

	public void setPi_ext_trans_id(String pi_ext_trans_id) {
		this.pi_ext_trans_id = pi_ext_trans_id;
	}

	public String getPio_old_imsi() {
		return pio_old_imsi;
	}

	public void setPio_old_imsi(String pio_old_imsi) {
		this.pio_old_imsi = pio_old_imsi;
	}

	public String getPio_new_imsi() {
		return pio_new_imsi;
	}

	public void setPio_new_imsi(String pio_new_imsi) {
		this.pio_new_imsi = pio_new_imsi;
	}

	public String getPio_new_sim() {
		return pio_new_sim;
	}

	public void setPio_new_sim(String pio_new_sim) {
		this.pio_new_sim = pio_new_sim;
	}

	public Long getPio_old_msisdn() {
		return pio_old_msisdn;
	}

	public void setPio_old_msisdn(Long pio_old_msisdn) {
		this.pio_old_msisdn = pio_old_msisdn;
	}

	public Long getPi_new_msisdn() {
		return pi_new_msisdn;
	}

	public void setPi_new_msisdn(Long pi_new_msisdn) {
		this.pi_new_msisdn = pi_new_msisdn;
	}

	public String getPio_old_sim() {
		return pio_old_sim;
	}

	public void setPio_old_sim(String pio_old_sim) {
		this.pio_old_sim = pio_old_sim;
	}

	public String getPi_service() {
		return pi_service;
	}

	public void setPi_service(String pi_service) {
		this.pi_service = pi_service;
	}

	
	
	
	public ArrayList<UpdateSIMSaleCusorData> getCursor_data() {
		return cursor_data;
	}

	public void setCursor_data(ArrayList<UpdateSIMSaleCusorData> cursor_data) {
		this.cursor_data = cursor_data;
	}

	@Override
	public String toString() {
		return "UpdateSIMSaleData [pi_trans_id=" + pi_trans_id
				+ ", pi_ext_trans_id=" + pi_ext_trans_id
				+ ", pi_curr_state_id=" + pi_curr_state_id + ", pi_status="
				+ pi_status + ", pi_remarks=" + pi_remarks + ", pi_new_msisdn="
				+ pi_new_msisdn + ", pi_ext_trans_status="
				+ pi_ext_trans_status + ", pi_response_code="
				+ pi_response_code + ", pi_response_message="
				+ pi_response_message + ", pi_external_details="
				+ pi_external_details + ", pio_old_msisdn=" + pio_old_msisdn
				+ ", pio_old_sim=" + pio_old_sim + ", po_activity_type="
				+ po_activity_type + ", pio_old_imsi=" + pio_old_imsi
				+ ", pio_new_imsi=" + pio_new_imsi + ", pio_new_sim="
				+ pio_new_sim + ", po_new_msisdn=" + po_new_msisdn
				+ ", pi_ext_error_code=" + pi_ext_error_code + ", pi_service="
				+ pi_service + "]";
	}

	

}
