package com.xius.smf.job;

import java.util.concurrent.CountDownLatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.domaindata.InsertSubsFlowTrackerData;
import com.xius.smf.domaindata.VOLTECursorData;
import com.xius.smf.domaindata.VolteInsertData;
import com.xius.smf.domaindata.VolteUpdateData;
import com.xius.smf.exception.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class VOLTE5GDeProvisionProcessor implements Runnable {
	
	private static final Logger logger = LogManager.getLogger(VOLTE5GDeProvisionProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	String flowid = null;
	String extflowId=null;
	VOLTECursorData cursorData = null;
	VolteInsertData InsertData = new VolteInsertData();
	VolteUpdateData Updateddata = new VolteUpdateData();
	VOLTEUpdateProcessor updateProcessor = new VOLTEUpdateProcessor();
	VOLTEInsertProcessor insertProcessor = new VOLTEInsertProcessor();
	String nwId = InitiateAll.getSMFProps().getProperty(
			SMFAgentConstants.VOLTE_EXTERNAL_NW_ID);

	public VOLTE5GDeProvisionProcessor(CountDownLatch latch,
			VOLTECursorData curData, String flowid,String extflowId) {
		this.latch = latch;
		this.cursorData = curData;
		this.flowid = flowid;
		this.extflowId=extflowId;
	}

	public VOLTE5GDeProvisionProcessor(VOLTECursorData curData) {
		this.cursorData = curData;
	}

	@Override
	public void run() {
		logger.debug(">>>>> VOLTEProvisionProcessor run called ...");
		try {
			callProvision();
		} finally {
			if (latch != null)
				latch.countDown();
		}
	}

	public void callProvision() {

		logger.debug(">>>>> VOLTEProvisionProcessor callProvisionVOLTE called ...");

		InsertSubsFlowTrackerData domainData = new InsertSubsFlowTrackerData();
		String requestData = "";

		if (cursorData.getNetwork_id() != null)
			domainData.setPi_network_id(cursorData.getNetwork_id());

		requestData = cursorData.getMsisdn_no() + "~" + "~" + "~" + "~";

		domainData.setPi_flow_id(flowid);
		
		if(extflowId!=null && extflowId.length()>0){
			domainData.setPi_flow_id(extflowId);
		}
		
		domainData.setPi_channel("VOLTE5GJOB");

		domainData.setPi_user_id("VOLTE5GJOB");

		domainData.setPi_request_data(requestData);

		if (cursorData.getACCOUNT_TYPE() != null)
			domainData.setPi_acc_type(Long.parseLong(cursorData
					.getACCOUNT_TYPE()));

		domainData.setPi_account_id(cursorData.getAccount_id());

		domainData.setPi_imsi_no(cursorData.getImsi());

		domainData.setPi_msisdn_no(cursorData.getMsisdn_no());

		domainData.setPi_acct_status(cursorData.getNEW_STATUS());

		domainData.setPi_sim_serial_no(cursorData.getSim_serial_no());
		
		domainData.setPi_publicity_id(cursorData.getPublicity_id());


		SPFactory factory = null;
		try {
			factory = ServiceUtils.executeSPWithOutCommit("pro_subs_bulk_flow_tracker_insert", domainData,domainData);
		} catch (com.xius.smf.exceptions.SMFAgentException e) {
			logger.error(
					"Exception in VOLTE5GDeProvisionProcessor while getsubdata for MSISDN="
							+ cursorData.getMsisdn_no());
		}
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code from  pro_subs_bulk_flow_tracker_insert  ==>"
							+ domainData.getPo_error_code());
			logger.info(
					"Error Msg from  pro_subs_bulk_flow_tracker_insert  ==>"
							+ domainData.getPo_error_desc());
		}

	}

}
