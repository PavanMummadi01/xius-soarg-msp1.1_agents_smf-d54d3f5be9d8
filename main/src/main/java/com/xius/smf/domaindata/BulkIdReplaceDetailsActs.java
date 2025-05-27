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
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/domaindata/BulkIdReplaceDetailsActs.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.domaindata;

import java.util.List;

import com.xius.smf.job.GetDummySimDetRefCursorData;


public class BulkIdReplaceDetailsActs extends DomainDataBase{
	
 	private String pio_trans_num;
 	private String pi_sim_num;
 	private List<GetDummySimDetRefCursorData> refcursData;
 	private Long po_retry_count;
	private Long po_error_code;
	private String po_error_mesg;
	
	public Long getPo_retry_count() {
		return po_retry_count;
	}
	public void setPo_retry_count(Long po_retry_count) {
		this.po_retry_count = po_retry_count;
	}
	public Long getPo_error_code() {
		return po_error_code;
	}
	public void setPo_error_code(Long po_error_code) {
		this.po_error_code = po_error_code;
	}
	public String getPo_error_mesg() {
		return po_error_mesg;
	}
	public void setPo_error_mesg(String po_error_mesg) {
		this.po_error_mesg = po_error_mesg;
	}
	public List<GetDummySimDetRefCursorData> getRefcursData() {
		return refcursData;
	}
	public void setRefcursData(List<GetDummySimDetRefCursorData> refcursData) {
		this.refcursData = refcursData;
	}
	public String getPi_sim_num() {
		return pi_sim_num;
	}
	public void setPi_sim_num(String pi_sim_num) {
		this.pi_sim_num = pi_sim_num;
	}
	public String getPio_trans_num() {
		return pio_trans_num;
	}
	public void setPio_trans_num(String pio_trans_num) {
		this.pio_trans_num = pio_trans_num;
	}

}


