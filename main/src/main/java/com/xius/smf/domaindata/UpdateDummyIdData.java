/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * Specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.domaindata;


public class UpdateDummyIdData extends DomainDataBase {

	// IN params
	String pi_sim_no;
	String pi_id_type;
	String pi_dummy_id_no;
	String pi_id_no;
	String pi_trans_status;
	String pi_sim_status;       
	String pi_trans_number;
	String pi_msisdn;
	String po_err_code;
	
	public String toString(UpdateDummyIdData updateDummyIdData){

		StringBuilder builder = new StringBuilder();

		if( null != updateDummyIdData ) {

			if( null != updateDummyIdData.getPi_sim_no() ) {
				builder.append("SIM ==>").append( updateDummyIdData.getPi_sim_no());
			}
			if( null != updateDummyIdData.getPi_id_type() ) {

				builder.append(":ID Type ==>").append(updateDummyIdData.getPi_id_type());
			}
			if( null != updateDummyIdData.getPi_dummy_id_no() ) {

				builder.append(":Dummy ID Num ==>").append(updateDummyIdData.getPi_dummy_id_no());
			}
			if( null != updateDummyIdData.getPi_id_no()) {

				builder.append(":ID Num ==>").append(updateDummyIdData.getPi_id_no());
			}
			if( null != updateDummyIdData.getPi_trans_status()) {

				builder.append(":TxStatus ==>").append(updateDummyIdData.getPi_trans_status());
			}
			if( null != updateDummyIdData.getPi_sim_status()) {

				builder.append(":SIM Status ==>").append(updateDummyIdData.getPi_sim_status());
			}
			if( null != updateDummyIdData.getPi_trans_number() ) {

				builder.append(":TxNum ==>").append(updateDummyIdData.getPi_trans_number());
			}
			
			if( null != updateDummyIdData.getPi_msisdn() ) {

				builder.append(":MSISDN ==>").append(updateDummyIdData.getPi_msisdn());
			}
		}

		return builder.toString();
	}




	public String getPi_sim_no() {
		return pi_sim_no;
	}




	public void setPi_sim_no(String pi_sim_no) {
		this.pi_sim_no = pi_sim_no;
	}




	public String getPi_id_type() {
		return pi_id_type;
	}




	public void setPi_id_type(String pi_id_type) {
		this.pi_id_type = pi_id_type;
	}




	public String getPi_dummy_id_no() {
		return pi_dummy_id_no;
	}




	public void setPi_dummy_id_no(String pi_dummy_id_no) {
		this.pi_dummy_id_no = pi_dummy_id_no;
	}




	public String getPi_id_no() {
		return pi_id_no;
	}




	public void setPi_id_no(String pi_id_no) {
		this.pi_id_no = pi_id_no;
	}




	public String getPi_trans_status() {
		return pi_trans_status;
	}




	public void setPi_trans_status(String pi_trans_status) {
		this.pi_trans_status = pi_trans_status;
	}




	public String getPi_sim_status() {
		return pi_sim_status;
	}




	public void setPi_sim_status(String pi_sim_status) {
		this.pi_sim_status = pi_sim_status;
	}




	public String getPi_trans_number() {
		return pi_trans_number;
	}




	public void setPi_trans_number(String pi_trans_number) {
		this.pi_trans_number = pi_trans_number;
	}




	public String getPi_msisdn() {
		return pi_msisdn;
	}




	public void setPi_msisdn(String pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}




	public String getPo_err_code() {
		return po_err_code;
	}




	public void setPo_err_code(String po_err_code) {
		this.po_err_code = po_err_code;
	}
}
