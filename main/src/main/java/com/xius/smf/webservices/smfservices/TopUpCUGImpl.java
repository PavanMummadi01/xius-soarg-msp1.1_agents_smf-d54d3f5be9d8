/**
 * Copyright   2006 New Wireless Services, Inc.
 *
 * All rights reserved. These computer programs, listings, and
 * specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.webservices.smfservices;


import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.TopUpCUGDataType;
import com.xius.agent.smf.smfmanagement.TopUpCUGRequest;
import com.xius.agent.smf.smfmanagement.TopUpCUGResponse;
import com.xius.smf.domaindata.GroupTopUpAct;
import com.xius.smf.domaindata.ScheduleTopUpActs;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.task.ScheduleCUGDebitTask;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.Utilities;


/**	
@Author : srikanthm
@Date : May 1, 2009
 */
@Service("TopUpCUGImpl")
public class TopUpCUGImpl {

	private  static final Logger logger = LogManager.getLogger(TopUpCUGImpl.class.getSimpleName());

	public TopUpCUGResponse topUpCUG(TopUpCUGRequest topUpCUGRequest, HeaderDetails headerDetails) throws SMFAgentException {

		TopUpCUGResponse response = new TopUpCUGResponse();
		
		ScheduleTopUpActs scheduleCUGTopUpdata = setScheduleTopUpActsData(topUpCUGRequest, headerDetails);

		if( null != scheduleCUGTopUpdata && 
				scheduleCUGTopUpdata.getGroupTopupActs() != null &&
				scheduleCUGTopUpdata.getGroupTopupActs().size() > 0) {
			logger.info( "Number of CUG schedule debit GroupActs(parent msisdns) found : " + scheduleCUGTopUpdata.getGroupTopupActs().size() );
			
			scheduleCUGTopUpdata = ScheduleCUGDebitTask.executeScheduleCUGJobForParentDebits(scheduleCUGTopUpdata,headerDetails);
			
			if(scheduleCUGTopUpdata != null ) {
				if(scheduleCUGTopUpdata.getSuccess_parent_msisdn_list()!=null && 
						scheduleCUGTopUpdata.getSuccess_parent_msisdn_list().size()>0) {
					String[] successMSISDNs = Utilities.convertLongListToStringArray(scheduleCUGTopUpdata.getSuccess_parent_msisdn_list());
					List<String> successMSISDNsList = Arrays.asList(successMSISDNs);
					//response.getSuccessMSISDNs(Utilities.convertLongListToStringArray(scheduleCUGTopUpdata.getSuccess_parent_msisdn_list()));
					response.getSuccessMSISDNs().addAll(successMSISDNsList);
				}
				
				if(scheduleCUGTopUpdata.getFailure_parent_msisdn_list()!=null && 
						scheduleCUGTopUpdata.getFailure_parent_msisdn_list().size()>0) {
					String[] FailedMSISDN = Utilities.convertLongListToStringArray(scheduleCUGTopUpdata.getFailure_parent_msisdn_list());
					List<String> FailedMSISDNList = Arrays.asList(FailedMSISDN);
					response.getFailedMSISDN().addAll(FailedMSISDNList);
				} 
			}
		} else {
			logger.info( "*** *** *** Found No CUG schedule debit GroupActs(parent msisdns)");
			response.setMessage("Found No CUG schedule debit GroupActs(parent msisdns)");
		}
		
		return response;
	}
	
	/*public TopUpCUGResponse topUpCUG(TopUpCUGRequest topUpCUGRequest, HeaderDetails headerDetails) throws SMFAgentException {

		TopUpCUGResponse response = new TopUpCUGResponse();
		
		final ScheduleTopUpActs scheduleCUGTopUpdata = setScheduleTopUpActsData(topUpCUGRequest, headerDetails);

		if( null != scheduleCUGTopUpdata && 
				scheduleCUGTopUpdata.getGroupTopupActs() != null &&
				scheduleCUGTopUpdata.getGroupTopupActs().size() > 0) {
			response.setMessage("Request Under Processing");
			logger.log(BCGLevel.INFO, "Number of CUG schedule debit GroupActs(parent msisdns) found : " + scheduleCUGTopUpdata.getGroupTopupActs().size() );

			new Thread() {
				public void run() {
					ScheduleCUGDebitTask.executeScheduleCUGJobForParentDebits(scheduleCUGTopUpdata);
				}
			}.start();

		} else {
			logger.log(BCGLevel.INFO, "*** *** *** Found No CUG schedule debit GroupActs(parent msisdns)");
			response.setMessage("Found No CUG schedule debit GroupActs(parent msisdns)");
		}
		
		return response;
	}*/

	private ScheduleTopUpActs setScheduleTopUpActsData(TopUpCUGRequest topUpRequest, HeaderDetails headerDetails) {
		//Setting Data to DTO Object
		ScheduleTopUpActs groupTopUpActs = null;
		if(topUpRequest != null && topUpRequest.getTopUpCUGList() != null && topUpRequest.getTopUpCUGList().getTopUpCUGData().size() > 0) {
			groupTopUpActs = new ScheduleTopUpActs();
			if(headerDetails != null) {
				groupTopUpActs.setNetworkId(headerDetails.getNetworkID());
			}
			if(logger.isDebugEnabled())
				logger.debug("got data from TopUpCUGRequest for schedule cug debit, No. of Parent MSISDNs:" + topUpRequest.getTopUpCUGList().getTopUpCUGData().size());
		
			for(int i=0; i<topUpRequest.getTopUpCUGList().getTopUpCUGData().size(); i++) {
				TopUpCUGDataType topUpDataType = topUpRequest.getTopUpCUGList().getTopUpCUGData().get(i);
				if(topUpDataType != null) {
					GroupTopUpAct groupTopupAct = new GroupTopUpAct();

					if(Utilities.isNotEmpty(topUpDataType.getParentMSISDN())) {
						groupTopupAct.setParentMsisdn(Long.parseLong(topUpDataType.getParentMSISDN()));
					}
					groupTopupAct.setDebitAmount(topUpDataType.getTopUpAmt());

//					just to maintan the list as it is using this in list
					if(topUpDataType.getTransId() != null)
					{
						groupTopUpActs.setTransId(topUpDataType.getTransId());
					}
					
					if(topUpDataType.getGroupId() != null)
						groupTopupAct.setCustGroupId(topUpDataType.getGroupId());
					
					groupTopUpActs.getGroupTopupActs().add(groupTopupAct);

				} else {
					logger.error("Inconsistent TopUpCUGRequest data for schedule cug debit");
				}
			}
		} else {
			logger.error("topUpRequest for schedule cug debit us NULL or Zero length");
		}

		return groupTopUpActs;
	}

}