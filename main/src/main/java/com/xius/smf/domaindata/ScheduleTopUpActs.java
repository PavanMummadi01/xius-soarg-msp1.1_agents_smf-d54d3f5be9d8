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
* @version $Id: //depot/xb/MSP1.0/MSP-AWS/agents/smf/main/src/main/java/com/xius/smf/domaindata/ScheduleTopUpActs.java#2 $ 
* $DateTime: 2023/12/08 12:29:41 $Change:  $
*/

package com.xius.smf.domaindata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ScheduleTopUpActs {
	
	private Long networkId;
	
	private List<GroupTopUpAct> groupTopupActs;
	
	private List<Long> success_parent_msisdn_list;
	private List<Long> failure_parent_msisdn_list;
	private List<Long> success_parent_groupId_list;
	private List<Long> failure_parent_groupId_list;
	private Long transId;
	private BigDecimal[] transIds;
	
	public BigDecimal[] getTransIds() {
		return transIds;
	}
	public void setTransIds(BigDecimal[] transIds) {
		this.transIds = transIds;
	}
	public Long getTransId() {
		return transId;
	}
	public void setTransId(Long transId) {
		this.transId = transId;
	}
	public Long getNetworkId() {
		return networkId;
	}
	public void setNetworkId(Long networkId) {
		this.networkId = networkId;
	}
	public List<GroupTopUpAct> getGroupTopupActs() {
        if (groupTopupActs == null) {
        	groupTopupActs = new ArrayList<GroupTopUpAct>();
        }
        return this.groupTopupActs;
    }
	public List<Long> getSuccess_parent_msisdn_list() {
        if (success_parent_msisdn_list == null) {
        	success_parent_msisdn_list = new ArrayList<Long>();
        }
        return this.success_parent_msisdn_list;
    }
	public List<Long> getFailure_parent_msisdn_list() {
        if (failure_parent_msisdn_list == null) {
        	failure_parent_msisdn_list = new ArrayList<Long>();
        }
        return this.failure_parent_msisdn_list;
    }
	
	public List<Long> getSuccess_parent_groupId_list() {
        if (success_parent_groupId_list == null) {
        	success_parent_groupId_list = new ArrayList<Long>();
        }
        return this.success_parent_groupId_list;
    }
	public List<Long> getFailure_parent_groupId_list() {
        if (failure_parent_groupId_list == null) {
        	failure_parent_groupId_list = new ArrayList<Long>();
        }
        return this.failure_parent_groupId_list;
    }
}

