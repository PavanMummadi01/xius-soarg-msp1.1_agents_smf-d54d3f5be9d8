package com.xius.smf.job;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.ne.NotificationManagement_xsd.NotifyMessageResponse;
import com.xius.smf.domaindata.ThresholdLimitCurData;
import com.xius.smf.domaindata.TopUpData;
import com.xius.smf.domaindata.UsageThresholdLimitCursorData;
import com.xius.smf.domaindata.UsageThresholdLimitData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class UsageThresholdLimitSMSProcessor implements Runnable{
	private static final Logger logger = LogManager.getLogger(UsageThresholdLimitSMSProcessor.class.getSimpleName());
	CountDownLatch latch = null;
	UsageThresholdLimitCursorData cursorData = null;
	String DestMsisdns= null;
	String SmsEventID= null;

	public UsageThresholdLimitSMSProcessor(CountDownLatch latch,UsageThresholdLimitCursorData curData,String DestMsisdns,String SmsEventID) {
		this.latch = latch;
		this.cursorData = curData;
		this.DestMsisdns = DestMsisdns;
		this.SmsEventID = SmsEventID;


	}
	public void run() {
		NotifyMessageResponse neResponse=null;
		try {
		
			neResponse=neRequest(cursorData,DestMsisdns,SmsEventID);
			if (neResponse.getTransID() != null) {
				String reason = "SUCCESS";
				callDBToUpdate(cursorData, neResponse, reason);
			} else {
				String reason = "neResponse is null ";
				callDBToUpdate(cursorData, neResponse, reason);
			}
		}
			catch (Exception e) {
				String reason = e.getMessage();
				callDBToUpdate(cursorData, neResponse, reason);

			logger.error("SMFAgentException in UsageThresholdLimitSMSProcessor "+Utilities.getStackTrace(e));
			}
		finally {			
				latch.countDown();
			}
		
	}
	
	
	
	
	public NotifyMessageResponse  neRequest(UsageThresholdLimitCursorData curData,String DestMsisdns,String SmsEventID)
	{
		UsageThresholdLimitData data = null;
	NotifyMessageResponse neResponse=null;
	String resp=null;
		NPRsmsConfirmationHelper helper=new NPRsmsConfirmationHelper();
		TempMessageInfo replyToSubscriber=new TempMessageInfo();
		try{
		if(DestMsisdns!=null){
		replyToSubscriber.setEventReferenceCode(Utilities.getSmsEventRefCode(cursorData.getPi_network_id().toString(),SmsEventID));
		replyToSubscriber.setUserDefined1(cursorData.getService_category().toString());
		replyToSubscriber.setUserDefined2(cursorData.getAverage_value().toString());
		replyToSubscriber.setUserDefined3(cursorData.getNo_of_active_subs().toString());
		replyToSubscriber.setUserDefined4(cursorData.getTotal_value().toString());
		replyToSubscriber.setUserDefined5(cursorData.getTransaction_id().toString());
		replyToSubscriber.setUserDefined6(cursorData.getAvg_cal_to_date());
		replyToSubscriber.setUserDefined7(cursorData.getPeriod());
		replyToSubscriber.setNetworkId(cursorData.getPi_network_id().toString());
		String getLoginIdPass = Utilities.getNetworkId(cursorData.getPi_network_id().toString());
		if(getLoginIdPass!=null){
			
		String getAllMsisdns = Utilities.getMsisdnNir(cursorData.getPi_network_id().toString(),DestMsisdns);
		String getMsisdn[] = getAllMsisdns.split(",");
		for(int i=0 ; i<getMsisdn.length;i++){
			replyToSubscriber.setDestMSISDNs(getMsisdn[i]);
			neResponse=helper.sendMsgToNE(replyToSubscriber,getLoginIdPass);
		}
		} else {
			logger.info("The Given Network Id related Properties are not configured in Property File.");
		}
		} else {
			logger.info("Destination msisdn related Properties are not configured in Property File.");
		}
		}
		catch(Exception e){
			logger.debug( "Exception from NE");
		
			logger.error( "Error Trace:"+Utilities.getStackTrace(e));
		}
		
		return neResponse;

	}
	
	public void callDBToUpdate(UsageThresholdLimitCursorData curData,NotifyMessageResponse neResponse,String reason) {
		UsageThresholdLimitData domainData = new UsageThresholdLimitData();
		domainData.setPi_flag("UPDATE");
		domainData.setPi_transaction_id(curData.getTransaction_id());
		domainData.setPi_network_id(curData.getPi_network_id());
		domainData.setPi_reason(reason);
		if(reason!=null&& reason.equalsIgnoreCase("SUCCESS"))
			domainData.setPi_status("SUCCESS");
		else
			domainData.setPi_status("FAIL");
			
		domainData.setPi_app_id(InitiateAll.getSMFProps().getProperty(
				SMFAgentConstants.APP_ID_PROP));
		try {
			SPFactory factory = ServiceUtils.executeSPWithOutCommit(
					"pro_nw_avg_threshold_notif_mng", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());

			if (logger.isInfoEnabled()) {
				logger.info(
						"ScheduleTopUpThread:Error Code in pro_nw_avg_threshold_notif_mng==>"
								+ domainData.getPo_error_code());
			}
		} catch (SMFAgentException e) {
			logger.error(
					"ScheduleTopUpThread:Exception in pro_nw_avg_threshold_notif_mng \n"
							+ Utilities.getStackTrace(e));
		}
	}
	
}
