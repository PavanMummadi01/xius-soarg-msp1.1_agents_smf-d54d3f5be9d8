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
File Name:BalNotificationData.java
Description:
@Author : srikanthm
@Created Date : Jul 29, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class UpdateBalNotificationData extends DomainDataBase{
	
	private String pi_source;
	private String pi_consumer_type;
	private String pi_status;                  
	private String pi_failure_reason;
	private String pi_seq_no;
	public String getPi_source() {
		return pi_source;
	}
	public void setPi_source(String pi_source) {
		this.pi_source = pi_source;
	}
	public String getPi_consumer_type() {
		return pi_consumer_type;
	}
	public void setPi_consumer_type(String pi_consumer_type) {
		this.pi_consumer_type = pi_consumer_type;
	}
	public String getPi_status() {
		return pi_status;
	}
	public void setPi_status(String pi_status) {
		this.pi_status = pi_status;
	}
	public String getPi_failure_reason() {
		return pi_failure_reason;
	}
	public void setPi_failure_reason(String pi_failure_reason) {
		this.pi_failure_reason = pi_failure_reason;
	}
	public String getPi_seq_no() {
		return pi_seq_no;
	}
	public void setPi_seq_no(String pi_seq_no) {
		this.pi_seq_no = pi_seq_no;
	}
}