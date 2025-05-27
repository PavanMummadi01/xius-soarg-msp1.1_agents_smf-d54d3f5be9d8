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
 * 	@company	XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 *	@package	com.xius.smf.domaindata
 * 	@author		SaiRajesh.g
 *	@Date		Jan 30, 2014,11:25:47 AM
*/

package com.xius.smf.domaindata;
public class HlrUpdateData extends DomainDataBase{
	
	private String transaction_id;
	private String process_flag;
	private String remarks;
	private String po_error_desc;
	
	
	
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getProcess_flag() {
		return process_flag;
	}
	public void setProcess_flag(String process_flag) {
		this.process_flag = process_flag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getPo_error_desc() {
		return po_error_desc;
	}
	public void setPo_error_desc(String po_error_desc) {
		this.po_error_desc = po_error_desc;
	}
	
}
