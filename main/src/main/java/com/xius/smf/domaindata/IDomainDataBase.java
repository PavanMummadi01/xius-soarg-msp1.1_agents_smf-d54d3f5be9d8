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
public interface IDomainDataBase {

	public Long getPi_network_id();
	public void setPi_network_id(Long pi_network_id);
	public String getPi_login_id();
	public void setPi_login_id(String pi_login_id);
	public String getPi_password();
	public void setPi_password(String pi_password);
	public Long getPo_error_code();
	public void setPo_error_code(Long po_error_code); 

	
}
