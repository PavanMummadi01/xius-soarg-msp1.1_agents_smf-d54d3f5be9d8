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
* ${todo}
* @author srikanthm $Author: kiranmai.kode $sumalatha.muri $
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/domaindata/UpdateBulkIdReplaceSingleRecData.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.domaindata;

public class UpdateBulkIdReplaceSingleRecData extends DomainDataBase{
	
 	private String pi_sim_num;
 	private Long pi_id_type;
 	private String pi_id_val;
 	private Long pi_dummy_id_type;
 	private String pi_dummy_id_val;
 	private String pi_user_id;
 	private Long pi_network_id;
 	private String pi_network_name;
 	private String pi_msisdn;
 	private String pi_icc_num;
 	private String pi_sim_status;
 	private String po_trans_num;
 	private Long po_error_code;
	public String getPi_sim_num() {
		return pi_sim_num;
	}
	public void setPi_sim_num(String pi_sim_num) {
		this.pi_sim_num = pi_sim_num;
	}
	public String getPi_id_val() {
		return pi_id_val;
	}
	public void setPi_id_val(String pi_id_val) {
		this.pi_id_val = pi_id_val;
	}
	public String getPi_dummy_id_val() {
		return pi_dummy_id_val;
	}
	public void setPi_dummy_id_val(String pi_dummy_id_val) {
		this.pi_dummy_id_val = pi_dummy_id_val;
	}
	public Long getPi_network_id() {
		return pi_network_id;
	}
	public void setPi_network_id(Long pi_network_id) {
		this.pi_network_id = pi_network_id;
	}
	public String getPi_network_name() {
		return pi_network_name;
	}
	public void setPi_network_name(String pi_network_name) {
		this.pi_network_name = pi_network_name;
	}
	public String getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(String pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public String getPi_icc_num() {
		return pi_icc_num;
	}
	public void setPi_icc_num(String pi_icc_num) {
		this.pi_icc_num = pi_icc_num;
	}
	public String getPi_sim_status() {
		return pi_sim_status;
	}
	public void setPi_sim_status(String pi_sim_status) {
		this.pi_sim_status = pi_sim_status;
	}
	public String getPo_trans_num() {
		return po_trans_num;
	}
	public void setPo_trans_num(String po_trans_num) {
		this.po_trans_num = po_trans_num;
	}
	public Long getPo_error_code() {
		return po_error_code;
	}
	public void setPo_error_code(Long po_error_code) {
		this.po_error_code = po_error_code;
	}
	public String getPi_user_id() {
		return pi_user_id;
	}
	public void setPi_user_id(String pi_user_id) {
		this.pi_user_id = pi_user_id;
	}
	public Long getPi_id_type() {
		return pi_id_type;
	}
	public void setPi_id_type(Long pi_id_type) {
		this.pi_id_type = pi_id_type;
	}
	public Long getPi_dummy_id_type() {
		return pi_dummy_id_type;
	}
	public void setPi_dummy_id_type(Long pi_dummy_id_type) {
		this.pi_dummy_id_type = pi_dummy_id_type;
	}
 	
}