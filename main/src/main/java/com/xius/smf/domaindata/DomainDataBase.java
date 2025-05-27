/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.domaindata;
/**
File Name:
Description:
@Author : srikanthm
@Created Date : Jul 28, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class DomainDataBase implements IDomainDataBase{

	protected Long pi_network_id; 
	protected String pi_login_id;   
	protected String pi_password;
	protected String pi_username;
	protected Long po_error_code;
	protected String pi_app_id;
	protected String po_error_desc;
	
	
	public Long getPi_network_id() {
		return pi_network_id;
	}
	public void setPi_network_id(Long pi_network_id) {
		this.pi_network_id = pi_network_id;
	}
	public String getPi_login_id() {
		return pi_login_id;
	}
	public void setPi_login_id(String pi_login_id) {
		this.pi_login_id = pi_login_id;
	}
	public String getPi_password() {
		return pi_password;
	}
	public void setPi_password(String pi_password) {
		this.pi_password = pi_password;
	}
	public Long getPo_error_code() {
		return po_error_code;
	}
	public void setPo_error_code(Long po_error_code) {
		this.po_error_code = po_error_code;
	}
	/**
	 * @return Returns the pi_username
	 */
	public String getPi_username() {
		return pi_username;
	}
	/**
	 * @param pi_username the pi_username to set.
	 */
	public void setPi_username(String pi_username) {
		this.pi_username = pi_username;
	} 	
	
	public void setPi_app_id(String pi_app_id) {
		this.pi_app_id = pi_app_id;
	}
	public String getPi_app_id() {
		return pi_app_id;
	}
	public String getPo_error_desc() {
		return po_error_desc;
	}
	public void setPo_error_desc(String po_error_desc) {
		this.po_error_desc = po_error_desc;
	} 	
	
}
