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
* @author srikanthm $Author: kiranmai.kode $
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/domaindata/SubscriberDemographicDetails.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.domaindata;

import java.util.ArrayList;
import java.util.List;

public class SubscriberDemographicDetails {
	
	private String transId;
	private String sim;
	private Long retryCount;
	private List<DemographicCursorData> subTransDmgpActs;
	private Long errorCode;
	private String errorMsg;
	
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public Long getRetryCount() {
		return retryCount;
	}
	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}
	public List<DemographicCursorData> getSubTransDmgpActs() {
        if (subTransDmgpActs == null) {
        	subTransDmgpActs = new ArrayList<DemographicCursorData>();
        }
        return this.subTransDmgpActs;
    }
	public Long getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}

