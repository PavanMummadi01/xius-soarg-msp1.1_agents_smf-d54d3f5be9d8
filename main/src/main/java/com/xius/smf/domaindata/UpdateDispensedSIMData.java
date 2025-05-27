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


public class UpdateDispensedSIMData extends DomainDataBase {

	// IN params
	String pi_sim_no;
	String pi_trans_number;
	String pi_trans_status;
	String pi_sim_status;       
	String pi_id_type;
	String pi_id_no;
	String pi_msisdn;
	String pi_order_no;
	String pi_notif_status;
	
	// OUT params
	String po_message;
	
	
	public String getPi_notif_status() {
		return pi_notif_status;
	}
	public void setPi_notif_status(String pi_notif_status) {
		this.pi_notif_status = pi_notif_status;
	}
	public String getPi_sim_no() {
		return pi_sim_no;
	}
	public void setPi_sim_no(String pi_sim_no) {
		this.pi_sim_no = pi_sim_no;
	}
	public String getPi_trans_number() {
		return pi_trans_number;
	}
	public void setPi_trans_number(String pi_trans_number) {
		this.pi_trans_number = pi_trans_number;
	}
	public String getPi_sim_status() {
		return pi_sim_status;
	}
	public void setPi_sim_status(String pi_sim_status) {
		this.pi_sim_status = pi_sim_status;
	}
	public String getPi_trans_status() {
		return pi_trans_status;
	}
	public void setPi_trans_status(String pi_trans_status) {
		this.pi_trans_status = pi_trans_status;
	}
	public String getPi_id_type() {
		return pi_id_type;
	}
	public void setPi_id_type(String pi_id_type) {
		this.pi_id_type = pi_id_type;
	}
	public String getPi_id_no() {
		return pi_id_no;
	}
	public void setPi_id_no(String pi_id_no) {
		this.pi_id_no = pi_id_no;
	}
	public String getPi_msisdn() {
		return pi_msisdn;
	}
	public void setPi_msisdn(String pi_msisdn) {
		this.pi_msisdn = pi_msisdn;
	}
	public String getPi_order_no() {
		return pi_order_no;
	}
	public void setPi_order_no(String pi_order_no) {
		this.pi_order_no = pi_order_no;
	}
	public String getPo_message() {
		return po_message;
	}
	public void setPo_message(String po_message) {
		this.po_message = po_message;
	}
	
	public String toString(UpdateDispensedSIMData updateDispensedSIMData){

		StringBuilder builder = new StringBuilder();

		if( null != updateDispensedSIMData ) {

			if( null != updateDispensedSIMData.getPi_sim_no() ) {
				builder.append("SIM ==>").append( updateDispensedSIMData.getPi_sim_no());
			}
			if( null != updateDispensedSIMData.getPi_id_no() ) {

				builder.append(":ID No ==>").append(updateDispensedSIMData.getPi_id_no());
			}
			if( null != updateDispensedSIMData.getPi_id_type() ) {

				builder.append(":ID Type ==>").append(updateDispensedSIMData.getPi_id_type());
			}
			if( null != updateDispensedSIMData.getPi_msisdn() ) {

				builder.append(":MSISDN ==>").append(updateDispensedSIMData.getPi_msisdn());
			}
			if( null != updateDispensedSIMData.getPi_order_no() ) {

				builder.append(":OrderID ==>").append(updateDispensedSIMData.getPi_order_no());
			}
			if( null != updateDispensedSIMData.getPi_trans_number() ) {

				builder.append(":Trans Number ==>").append(updateDispensedSIMData.getPi_trans_number());
			}
			if( null != updateDispensedSIMData.getPi_trans_status() ) {

				builder.append(":Status ==>").append(updateDispensedSIMData.getPi_trans_status());
			}
			
			if( null != updateDispensedSIMData.getPo_message() ) {

				builder.append(":Message ==>").append(updateDispensedSIMData.getPo_message());
			}
		}

		return builder.toString();
	}
}
