package com.xius.smf.domaindata;

public class SIMRegTrackerUpdateData extends DomainDataBase {

	private String pi_trans_ref_number ;          
	private String pi_status ;                    
	private String pi_remarks ;                                  
	private String pi_failednode ;                
	private String pi_initiated_from  ;           
	private String pi_account_mdn  ;              
	private String pi_sim_number  ;               
	private String pi_event_flag  ;               
	private String pi_new_password    ;           
	private String pi_registration_required   ;   
	private String pi_icc_no   ;                  
	private String pi_registration_type   ;       
	private String pi_account_status   ;          
	private String pi_sc_iccno      ;             
	private String pi_golden_icc_no  ;            
	private String pi_normal_order_id  ;          
	private String pi_sub_account_status  ;       
	private String pi_hlr_fr_connection   ;       
	private String pi_hlrfr_connection_on  ;      
	private String pi_is_corp   ;                 
	private String pi_order_list    ;             
	private String pi_msisdn_list_long ;          
	private String pi_util_list   ;               
	private String pi_charges     ;               
	private String pi_msisdn_list    ;            
	private String pi_device_id_key   ;           
	private String pi_new_value     ;             
	private String pi_authenticate_carrierid;
	private String pi_dt_failure_error_code ;     
	private String pi_denominations;              
	private String pi_tax_id   ;                  
	private String pi_email_id;                   
	private String pi_balance_amount ;            
	private String pi_order_date ;                
	private String pi_new_validity_date;          
	private String pi_port_req_form_id  ;         
	private String pi_port_id   ;                 
	private String pi_rejected_data ;             
	private String pi_npr_subm_time;              
	private String pi_threshold_time ;            
	private String pi_comp_email_id ;             
	private String pi_notification_data_email ;   
	private String pi_mdn ;                       
	private String pi_new_mdn ;                   
	private String pi_fr_trn_no;                  
	private String pi_new_cc_msisdn ;             
	private String pi_old_cc_msisdn;              
	private String pi_old_imsi ;                  
	private String pi_service_type ;              
	private String pi_imsi_sim_registration ;     
	private String pi_old_imsi_sim_registration ; 
	private String pi_actual_msisdn;              
	private String pi_account_id ;                
	private String pi_blocked_msisdn ;            
	private String pi_credit_limti;               
	private String pi_old_cc_mdn_list ;           
	private String pi_new_cc_mdn_list;            
	private String pi_promo_code  ;               
	private String pi_ussd_mdn ;                  
	private String pi_dealer_user_id  ;           
	private String pi_input_icc_no;               
	private String pi_account_type  ;             
	private String pi_location_code ;             
	private String pi_tariff_id    ;              
	private String pi_workgroup_id ;              
	private String pi_imei   ;                    
	private String pi_sale_type;                  
	private String pi_price  ;
	
	private String pi_sim_is_actual;
    private String pi_sim_psuedo;
    private String pi_invalid_account_state;
    private String pi_reason;
    private String pi_update_product_status;
    private String pi_no_kad_id_code;
    private String pi_get_order_details;
    private String pi_error_code;
    private String pi_input_personal_data;
    private String pi_get_account_details;
    private String pi_request_type;
    private String pi_user_name;
    private String pi_network_name;
    private String pi_middle_name;
    private String pi_post_paid;
    private String pi_old_mdn;
    private String pi_zipcode;
    private String pi_old_value;
    private String pi_new_imsi;
    private String pi_transaction_id;
    private String pi_sub_transaction_id;
    private String pi_icc_id;
    private String pi_audit_old_sim;
    private String pi_imsi;
    private String pi_msisdn;
    private String pi_office_code;
    private String pi_audit_old_msisdn;
    private String pi_audit_new_msisdn;
    private String pi_audit_imsi;
    private String pi_audit_action;
    private String pi_audit_icc_id;
    private String pi_data;
    private String pi_audit_new_sim;
    private String pi_audit_msisdn;
    private String pi_old_msisdn;
    private String pi_new_msisdn;
    private String pi_failed_msisdns_list_old;
    private String pi_failed_msisdns_list_new;
    private String pi_is_subscribed;
    private String pi_flag_5g;
    private String pi_return_code;
    private String pi_response_code;
    private String pi_new_sim;
    private String pi_old_sim;
    private String pi_external_trans_id_2;
    private String pi_login_id;
    private String pi_active;
    private String pi_user_id;
    private String pi_content;
    private String pi_errorcode;
    
    
    
	public String getPi_errorcode() {
		return pi_errorcode;
	}
	public void setPi_errorcode(String pi_errorcode) {
		this.pi_errorcode = pi_errorcode;
	}
	public String getPi_sim_is_actual() {
		return pi_sim_is_actual;
	}
	public void setPi_sim_is_actual(String pi_sim_is_actual) {
		this.pi_sim_is_actual = pi_sim_is_actual;
	}
	public String getPi_sim_psuedo() {
		return pi_sim_psuedo;
	}
	public void setPi_sim_psuedo(String pi_sim_psuedo) {
		this.pi_sim_psuedo = pi_sim_psuedo;
	}
	public String getPi_invalid_account_state() {
		return pi_invalid_account_state;
	}
	public void setPi_invalid_account_state(String pi_invalid_account_state) {
		this.pi_invalid_account_state = pi_invalid_account_state;
	}
	public String getPi_reason() {
		return pi_reason;
	}
	public void setPi_reason(String pi_reason) {
		this.pi_reason = pi_reason;
	}
	public String getPi_update_product_status() {
		return pi_update_product_status;
	}
	public void setPi_update_product_status(String pi_update_product_status) {
		this.pi_update_product_status = pi_update_product_status;
	}
	public String getPi_no_kad_id_code() {
		return pi_no_kad_id_code;
	}
	public void setPi_no_kad_id_code(String pi_no_kad_id_code) {
		this.pi_no_kad_id_code = pi_no_kad_id_code;
	}
	public String getPi_get_order_details() {
		return pi_get_order_details;
	}
	public void setPi_get_order_details(String pi_get_order_details) {
		this.pi_get_order_details = pi_get_order_details;
	}
	public String getPi_error_code() {
		return pi_error_code;
	}
	public void setPi_error_code(String pi_error_code) {
		this.pi_error_code = pi_error_code;
	}
	public String getPi_input_personal_data() {
		return pi_input_personal_data;
	}
	public void setPi_input_personal_data(String pi_input_personal_data) {
		this.pi_input_personal_data = pi_input_personal_data;
	}
	public String getPi_get_account_details() {
		return pi_get_account_details;
	}
	public void setPi_get_account_details(String pi_get_account_details) {
		this.pi_get_account_details = pi_get_account_details;
	}
	public String getPi_request_type() {
		return pi_request_type;
	}
	public void setPi_request_type(String pi_request_type) {
		this.pi_request_type = pi_request_type;
	}
	public String getPi_user_name() {
		return pi_user_name;
	}
	public void setPi_user_name(String pi_user_name) {
		this.pi_user_name = pi_user_name;
	}
	public String getPi_network_name() {
		return pi_network_name;
	}
	public void setPi_network_name(String pi_network_name) {
		this.pi_network_name = pi_network_name;
	}
	public String getPi_middle_name() {
		return pi_middle_name;
	}
	public void setPi_middle_name(String pi_middle_name) {
		this.pi_middle_name = pi_middle_name;
	}
	public String getPi_post_paid() {
		return pi_post_paid;
	}
	public void setPi_post_paid(String pi_post_paid) {
		this.pi_post_paid = pi_post_paid;
	}
	public String getPi_old_mdn() {
		return pi_old_mdn;
	}
	public void setPi_old_mdn(String pi_old_mdn) {
		this.pi_old_mdn = pi_old_mdn;
	}
	public String getPi_zipcode() {
		return pi_zipcode;
	}
	public void setPi_zipcode(String pi_zipcode) {
		this.pi_zipcode = pi_zipcode;
	}
	public String getPi_old_value() {
		return pi_old_value;
	}
	public void setPi_old_value(String pi_old_value) {
		this.pi_old_value = pi_old_value;
	}
	public String getPi_new_imsi() {
		return pi_new_imsi;
	}
	public void setPi_new_imsi(String pi_new_imsi) {
		this.pi_new_imsi = pi_new_imsi;
	}
	public String getPi_transaction_id() {
		return pi_transaction_id;
	}
	public void setPi_transaction_id(String pi_transaction_id) {
		this.pi_transaction_id = pi_transaction_id;
	}
	public String getPi_sub_transaction_id() {
		return pi_sub_transaction_id;
	}
	public void setPi_sub_transaction_id(String pi_sub_transaction_id) {
		this.pi_sub_transaction_id = pi_sub_transaction_id;
	}
	public String getPi_icc_id() {
		return pi_icc_id;
	}
	public void setPi_icc_id(String pi_icc_id) {
		this.pi_icc_id = pi_icc_id;
	}
	public String getPi_audit_old_sim() {
		return pi_audit_old_sim;
	}
	public void setPi_audit_old_sim(String pi_audit_old_sim) {
		this.pi_audit_old_sim = pi_audit_old_sim;
	}
	public String getPi_imsi() {
		return pi_imsi;
	}
	public void setPi_imsi(String pi_imsi) {
		this.pi_imsi = pi_imsi;
	}
	public String getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(String pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public String getPi_office_code() {
		return pi_office_code;
	}
	public void setPi_office_code(String pi_office_code) {
		this.pi_office_code = pi_office_code;
	}
	public String getPi_audit_old_msisdn() {
		return pi_audit_old_msisdn;
	}
	public void setPi_audit_old_msisdn(String pi_audit_old_msisdn) {
		this.pi_audit_old_msisdn = pi_audit_old_msisdn;
	}
	public String getPi_audit_new_msisdn() {
		return pi_audit_new_msisdn;
	}
	public void setPi_audit_new_msisdn(String pi_audit_new_msisdn) {
		this.pi_audit_new_msisdn = pi_audit_new_msisdn;
	}
	public String getPi_audit_imsi() {
		return pi_audit_imsi;
	}
	public void setPi_audit_imsi(String pi_audit_imsi) {
		this.pi_audit_imsi = pi_audit_imsi;
	}
	public String getPi_audit_action() {
		return pi_audit_action;
	}
	public void setPi_audit_action(String pi_audit_action) {
		this.pi_audit_action = pi_audit_action;
	}
	public String getPi_audit_icc_id() {
		return pi_audit_icc_id;
	}
	public void setPi_audit_icc_id(String pi_audit_icc_id) {
		this.pi_audit_icc_id = pi_audit_icc_id;
	}
	public String getPi_data() {
		return pi_data;
	}
	public void setPi_data(String pi_data) {
		this.pi_data = pi_data;
	}
	public String getPi_audit_new_sim() {
		return pi_audit_new_sim;
	}
	public void setPi_audit_new_sim(String pi_audit_new_sim) {
		this.pi_audit_new_sim = pi_audit_new_sim;
	}
	public String getPi_audit_msisdn() {
		return pi_audit_msisdn;
	}
	public void setPi_audit_msisdn(String pi_audit_msisdn) {
		this.pi_audit_msisdn = pi_audit_msisdn;
	}
	public String getPi_old_msisdn() {
		return pi_old_msisdn;
	}
	public void setPi_old_msisdn(String pi_old_msisdn) {
		this.pi_old_msisdn = pi_old_msisdn;
	}
	public String getPi_new_msisdn() {
		return pi_new_msisdn;
	}
	public void setPi_new_msisdn(String pi_new_msisdn) {
		this.pi_new_msisdn = pi_new_msisdn;
	}
	public String getPi_failed_msisdns_list_old() {
		return pi_failed_msisdns_list_old;
	}
	public void setPi_failed_msisdns_list_old(String pi_failed_msisdns_list_old) {
		this.pi_failed_msisdns_list_old = pi_failed_msisdns_list_old;
	}
	public String getPi_failed_msisdns_list_new() {
		return pi_failed_msisdns_list_new;
	}
	public void setPi_failed_msisdns_list_new(String pi_failed_msisdns_list_new) {
		this.pi_failed_msisdns_list_new = pi_failed_msisdns_list_new;
	}
	public String getPi_is_subscribed() {
		return pi_is_subscribed;
	}
	public void setPi_is_subscribed(String pi_is_subscribed) {
		this.pi_is_subscribed = pi_is_subscribed;
	}
	public String getPi_flag_5g() {
		return pi_flag_5g;
	}
	public void setPi_flag_5g(String pi_flag_5g) {
		this.pi_flag_5g = pi_flag_5g;
	}
	public String getPi_return_code() {
		return pi_return_code;
	}
	public void setPi_return_code(String pi_return_code) {
		this.pi_return_code = pi_return_code;
	}
	public String getPi_response_code() {
		return pi_response_code;
	}
	public void setPi_response_code(String pi_response_code) {
		this.pi_response_code = pi_response_code;
	}
	public String getPi_new_sim() {
		return pi_new_sim;
	}
	public void setPi_new_sim(String pi_new_sim) {
		this.pi_new_sim = pi_new_sim;
	}
	public String getPi_old_sim() {
		return pi_old_sim;
	}
	public void setPi_old_sim(String pi_old_sim) {
		this.pi_old_sim = pi_old_sim;
	}
	public String getPi_external_trans_id_2() {
		return pi_external_trans_id_2;
	}
	public void setPi_external_trans_id_2(String pi_external_trans_id_2) {
		this.pi_external_trans_id_2 = pi_external_trans_id_2;
	}
	public String getPi_login_id() {
		return pi_login_id;
	}
	public void setPi_login_id(String pi_login_id) {
		this.pi_login_id = pi_login_id;
	}
	public String getPi_active() {
		return pi_active;
	}
	public void setPi_active(String pi_active) {
		this.pi_active = pi_active;
	}
	public String getPi_user_id() {
		return pi_user_id;
	}
	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}
	public String getPi_content() {
		return pi_content;
	}
	public void setPi_content(String pi_content) {
		this.pi_content = pi_content;
	}
	public String getPi_trans_ref_number() {
		return pi_trans_ref_number;
	}
	public void setPi_trans_ref_number(String pi_trans_ref_number) {
		this.pi_trans_ref_number = pi_trans_ref_number;
	}
	public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	public String getPi_remarks() {
		return pi_remarks;
	}
	public void setPi_remarks(String pi_remarks) {
		this.pi_remarks = pi_remarks;
	}
	public String getPi_failednode() {
		return pi_failednode;
	}
	public void setPi_failednode(String pi_failednode) {
		this.pi_failednode = pi_failednode;
	}
	public String getPi_initiated_from() {
		return pi_initiated_from;
	}
	public void setPi_initiated_from(String pi_initiated_from) {
		this.pi_initiated_from = pi_initiated_from;
	}
	
	public String getPi_account_mdn() {
		return pi_account_mdn;
	}
	public void setPi_account_mdn(String pi_account_mdn) {
		this.pi_account_mdn = pi_account_mdn;
	}
	public String getPi_sim_number() {
		return pi_sim_number;
	}
	public void setPi_sim_number(String pi_sim_number) {
		this.pi_sim_number = pi_sim_number;
	}
	public String getPi_event_flag() {
		return pi_event_flag;
	}
	public void setPi_event_flag(String pi_event_flag) {
		this.pi_event_flag = pi_event_flag;
	}
	public String getPi_new_password() {
		return pi_new_password;
	}
	public void setPi_new_password(String pi_new_password) {
		this.pi_new_password = pi_new_password;
	}
	public String getPi_registration_required() {
		return pi_registration_required;
	}
	public void setPi_registration_required(String pi_registration_required) {
		this.pi_registration_required = pi_registration_required;
	}
	public String getPi_icc_no() {
		return pi_icc_no;
	}
	public void setPi_icc_no(String pi_icc_no) {
		this.pi_icc_no = pi_icc_no;
	}
	public String getPi_registration_type() {
		return pi_registration_type;
	}
	public void setPi_registration_type(String pi_registration_type) {
		this.pi_registration_type = pi_registration_type;
	}
	public String getPi_account_status() {
		return pi_account_status;
	}
	public void setPi_account_status(String pi_account_status) {
		this.pi_account_status = pi_account_status;
	}
	public String getPi_sc_iccno() {
		return pi_sc_iccno;
	}
	public void setPi_sc_iccno(String pi_sc_iccno) {
		this.pi_sc_iccno = pi_sc_iccno;
	}
	public String getPi_golden_icc_no() {
		return pi_golden_icc_no;
	}
	public void setPi_golden_icc_no(String pi_golden_icc_no) {
		this.pi_golden_icc_no = pi_golden_icc_no;
	}
	public String getPi_normal_order_id() {
		return pi_normal_order_id;
	}
	public void setPi_normal_order_id(String pi_normal_order_id) {
		this.pi_normal_order_id = pi_normal_order_id;
	}
	public String getPi_sub_account_status() {
		return pi_sub_account_status;
	}
	public void setPi_sub_account_status(String pi_sub_account_status) {
		this.pi_sub_account_status = pi_sub_account_status;
	}
	public String getPi_hlr_fr_connection() {
		return pi_hlr_fr_connection;
	}
	public void setPi_hlr_fr_connection(String pi_hlr_fr_connection) {
		this.pi_hlr_fr_connection = pi_hlr_fr_connection;
	}
	public String getPi_hlrfr_connection_on() {
		return pi_hlrfr_connection_on;
	}
	public void setPi_hlrfr_connection_on(String pi_hlrfr_connection_on) {
		this.pi_hlrfr_connection_on = pi_hlrfr_connection_on;
	}
	public String getPi_is_corp() {
		return pi_is_corp;
	}
	public void setPi_is_corp(String pi_is_corp) {
		this.pi_is_corp = pi_is_corp;
	}
	public String getPi_order_list() {
		return pi_order_list;
	}
	public void setPi_order_list(String pi_order_list) {
		this.pi_order_list = pi_order_list;
	}
	public String getPi_msisdn_list_long() {
		return pi_msisdn_list_long;
	}
	public void setPi_msisdn_list_long(String pi_msisdn_list_long) {
		this.pi_msisdn_list_long = pi_msisdn_list_long;
	}
	public String getPi_util_list() {
		return pi_util_list;
	}
	public void setPi_util_list(String pi_util_list) {
		this.pi_util_list = pi_util_list;
	}
	public String getPi_charges() {
		return pi_charges;
	}
	public void setPi_charges(String pi_charges) {
		this.pi_charges = pi_charges;
	}
	public String getPi_msisdn_list() {
		return pi_msisdn_list;
	}
	public void setPi_msisdn_list(String pi_msisdn_list) {
		this.pi_msisdn_list = pi_msisdn_list;
	}
	public String getPi_device_id_key() {
		return pi_device_id_key;
	}
	public void setPi_device_id_key(String pi_device_id_key) {
		this.pi_device_id_key = pi_device_id_key;
	}
	public String getPi_new_value() {
		return pi_new_value;
	}
	public void setPi_new_value(String pi_new_value) {
		this.pi_new_value = pi_new_value;
	}
	public String getPi_authenticate_carrierid() {
		return pi_authenticate_carrierid;
	}
	public void setPi_authenticate_carrierid(String pi_authenticate_carrierid) {
		this.pi_authenticate_carrierid = pi_authenticate_carrierid;
	}
	public String getPi_dt_failure_error_code() {
		return pi_dt_failure_error_code;
	}
	public void setPi_dt_failure_error_code(String pi_dt_failure_error_code) {
		this.pi_dt_failure_error_code = pi_dt_failure_error_code;
	}
	public String getPi_denominations() {
		return pi_denominations;
	}
	public void setPi_denominations(String pi_denominations) {
		this.pi_denominations = pi_denominations;
	}
	public String getPi_tax_id() {
		return pi_tax_id;
	}
	public void setPi_tax_id(String pi_tax_id) {
		this.pi_tax_id = pi_tax_id;
	}
	public String getPi_email_id() {
		return pi_email_id;
	}
	public void setPi_email_id(String pi_email_id) {
		this.pi_email_id = pi_email_id;
	}
	public String getPi_balance_amount() {
		return pi_balance_amount;
	}
	public void setPi_balance_amount(String pi_balance_amount) {
		this.pi_balance_amount = pi_balance_amount;
	}
	public String getPi_order_date() {
		return pi_order_date;
	}
	public void setPi_order_date(String pi_order_date) {
		this.pi_order_date = pi_order_date;
	}
	public String getPi_new_validity_date() {
		return pi_new_validity_date;
	}
	public void setPi_new_validity_date(String pi_new_validity_date) {
		this.pi_new_validity_date = pi_new_validity_date;
	}
	public String getPi_port_req_form_id() {
		return pi_port_req_form_id;
	}
	public void setPi_port_req_form_id(String pi_port_req_form_id) {
		this.pi_port_req_form_id = pi_port_req_form_id;
	}
	public String getPi_port_id() {
		return pi_port_id;
	}
	public void setPi_port_id(String pi_port_id) {
		this.pi_port_id = pi_port_id;
	}
	public String getPi_rejected_data() {
		return pi_rejected_data;
	}
	public void setPi_rejected_data(String pi_rejected_data) {
		this.pi_rejected_data = pi_rejected_data;
	}
	public String getPi_npr_subm_time() {
		return pi_npr_subm_time;
	}
	public void setPi_npr_subm_time(String pi_npr_subm_time) {
		this.pi_npr_subm_time = pi_npr_subm_time;
	}
	public String getPi_threshold_time() {
		return pi_threshold_time;
	}
	public void setPi_threshold_time(String pi_threshold_time) {
		this.pi_threshold_time = pi_threshold_time;
	}
	public String getPi_comp_email_id() {
		return pi_comp_email_id;
	}
	public void setPi_comp_email_id(String pi_comp_email_id) {
		this.pi_comp_email_id = pi_comp_email_id;
	}
	public String getPi_notification_data_email() {
		return pi_notification_data_email;
	}
	public void setPi_notification_data_email(String pi_notification_data_email) {
		this.pi_notification_data_email = pi_notification_data_email;
	}
	public String getPi_mdn() {
		return pi_mdn;
	}
	public void setPi_mdn(String pi_mdn) {
		this.pi_mdn = pi_mdn;
	}
	public String getPi_new_mdn() {
		return pi_new_mdn;
	}
	public void setPi_new_mdn(String pi_new_mdn) {
		this.pi_new_mdn = pi_new_mdn;
	}
	public String getPi_fr_trn_no() {
		return pi_fr_trn_no;
	}
	public void setPi_fr_trn_no(String pi_fr_trn_no) {
		this.pi_fr_trn_no = pi_fr_trn_no;
	}
	public String getPi_new_cc_msisdn() {
		return pi_new_cc_msisdn;
	}
	public void setPi_new_cc_msisdn(String pi_new_cc_msisdn) {
		this.pi_new_cc_msisdn = pi_new_cc_msisdn;
	}
	public String getPi_old_cc_msisdn() {
		return pi_old_cc_msisdn;
	}
	public void setPi_old_cc_msisdn(String pi_old_cc_msisdn) {
		this.pi_old_cc_msisdn = pi_old_cc_msisdn;
	}
	public String getPi_old_imsi() {
		return pi_old_imsi;
	}
	public void setPi_old_imsi(String pi_old_imsi) {
		this.pi_old_imsi = pi_old_imsi;
	}
	public String getPi_service_type() {
		return pi_service_type;
	}
	public void setPi_service_type(String pi_service_type) {
		this.pi_service_type = pi_service_type;
	}
	public String getPi_imsi_sim_registration() {
		return pi_imsi_sim_registration;
	}
	public void setPi_imsi_sim_registration(String pi_imsi_sim_registration) {
		this.pi_imsi_sim_registration = pi_imsi_sim_registration;
	}
	public String getPi_old_imsi_sim_registration() {
		return pi_old_imsi_sim_registration;
	}
	public void setPi_old_imsi_sim_registration(String pi_old_imsi_sim_registration) {
		this.pi_old_imsi_sim_registration = pi_old_imsi_sim_registration;
	}
	public String getPi_actual_msisdn() {
		return pi_actual_msisdn;
	}
	public void setPi_actual_msisdn(String pi_actual_msisdn) {
		this.pi_actual_msisdn = pi_actual_msisdn;
	}
	public String getPi_account_id() {
		return pi_account_id;
	}
	public void setPi_account_id(String pi_account_id) {
		this.pi_account_id = pi_account_id;
	}
	public String getPi_blocked_msisdn() {
		return pi_blocked_msisdn;
	}
	public void setPi_blocked_msisdn(String pi_blocked_msisdn) {
		this.pi_blocked_msisdn = pi_blocked_msisdn;
	}
	public String getPi_credit_limti() {
		return pi_credit_limti;
	}
	public void setPi_credit_limti(String pi_credit_limti) {
		this.pi_credit_limti = pi_credit_limti;
	}
	public String getPi_old_cc_mdn_list() {
		return pi_old_cc_mdn_list;
	}
	public void setPi_old_cc_mdn_list(String pi_old_cc_mdn_list) {
		this.pi_old_cc_mdn_list = pi_old_cc_mdn_list;
	}
	public String getPi_new_cc_mdn_list() {
		return pi_new_cc_mdn_list;
	}
	public void setPi_new_cc_mdn_list(String pi_new_cc_mdn_list) {
		this.pi_new_cc_mdn_list = pi_new_cc_mdn_list;
	}
	public String getPi_promo_code() {
		return pi_promo_code;
	}
	public void setPi_promo_code(String pi_promo_code) {
		this.pi_promo_code = pi_promo_code;
	}
	public String getPi_ussd_mdn() {
		return pi_ussd_mdn;
	}
	public void setPi_ussd_mdn(String pi_ussd_mdn) {
		this.pi_ussd_mdn = pi_ussd_mdn;
	}
	public String getPi_dealer_user_id() {
		return pi_dealer_user_id;
	}
	public void setPi_dealer_user_id(String pi_dealer_user_id) {
		this.pi_dealer_user_id = pi_dealer_user_id;
	}
	public String getPi_input_icc_no() {
		return pi_input_icc_no;
	}
	public void setPi_input_icc_no(String pi_input_icc_no) {
		this.pi_input_icc_no = pi_input_icc_no;
	}
	public String getPi_account_type() {
		return pi_account_type;
	}
	public void setPi_account_type(String pi_account_type) {
		this.pi_account_type = pi_account_type;
	}
	public String getPi_location_code() {
		return pi_location_code;
	}
	public void setPi_location_code(String pi_location_code) {
		this.pi_location_code = pi_location_code;
	}
	public String getPi_tariff_id() {
		return pi_tariff_id;
	}
	public void setPi_tariff_id(String pi_tariff_id) {
		this.pi_tariff_id = pi_tariff_id;
	}
	public String getPi_workgroup_id() {
		return pi_workgroup_id;
	}
	public void setPi_workgroup_id(String pi_workgroup_id) {
		this.pi_workgroup_id = pi_workgroup_id;
	}
	public String getPi_imei() {
		return pi_imei;
	}
	public void setPi_imei(String pi_imei) {
		this.pi_imei = pi_imei;
	}
	public String getPi_sale_type() {
		return pi_sale_type;
	}
	public void setPi_sale_type(String pi_sale_type) {
		this.pi_sale_type = pi_sale_type;
	}
	public String getPi_price() {
		return pi_price;
	}
	public void setPi_price(String pi_price) {
		this.pi_price = pi_price;
	}
	
}                    
	                  