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
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/domaindata/GroupTopUpAct.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GroupTopUpAct {
	
	private Long custGroupId;
	private Long parentMsisdn;
	private Long transId;
	private BigDecimal debitAmount;
	
	private List<Long> success_child_msisdn_list;
	private List<Long> failure_child_msisdn_list;
	private List<BigDecimal> failure_child_msisdn_topup_list;
	
	private List<ChildTopUpAccount> childTopUpActs;
	
	public Long getCustGroupId() {
		return custGroupId;
	}
	public void setCustGroupId(Long custGroupId) {
		this.custGroupId = custGroupId;
	}
	public Long getParentMsisdn() {
		return parentMsisdn;
	}
	public void setParentMsisdn(Long parentMsisdn) {
		this.parentMsisdn = parentMsisdn;
	}
	public Long getTransId() {
		return transId;
	}
	public void setTransId(Long transId) {
		this.transId = transId;
	}
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}
	public List<Long> getSuccess_child_msisdn_list() {
        if (success_child_msisdn_list == null) {
        	success_child_msisdn_list = new ArrayList<Long>();
        }
        return this.success_child_msisdn_list;
    }
	public List<Long> getFailure_child_msisdn_list() {
        if (failure_child_msisdn_list == null) {
        	failure_child_msisdn_list = new ArrayList<Long>();
        }
        return this.failure_child_msisdn_list;
    }
	public List<ChildTopUpAccount> getChildTopUpActs() {
        if (childTopUpActs == null) {
        	childTopUpActs = new ArrayList<ChildTopUpAccount>();
        }
        return this.childTopUpActs;
    }
	
	public List<BigDecimal> getFailure_child_msisdn_topup_list() {
        if (failure_child_msisdn_topup_list == null) {
        	failure_child_msisdn_topup_list = new ArrayList<BigDecimal>();
        }
        return this.failure_child_msisdn_topup_list;
    }
}

