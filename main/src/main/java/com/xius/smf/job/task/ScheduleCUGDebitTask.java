package com.xius.smf.job.task;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.BalanceType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.CarrierIdType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.DebitRequest;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.DebitRequestE;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.DebitResponse;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.MSISDNType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.MessageIdType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.OperatorType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.ReasonType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.TrackingMessageHeaderType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.UserIdType;
import com.xius.smf.client.ws.IBAWebserviceClient;
import com.xius.smf.domaindata.GroupTopUpAct;
import com.xius.smf.domaindata.ScheduleCUGGetGroupActsData;
import com.xius.smf.domaindata.ScheduleTopUpActs;
import com.xius.smf.domaindata.UpdateScheduleDebitListStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class ScheduleCUGDebitTask {

	static Logger logger = LogManager.getLogger("ScheduleCUGDebitTask");

	private static String userName = null;
	private static String password = null;
	private static String networkId = null;
	private static int defaultThreadPoolSize = 10;
	private static String threadPoolSize = null;
	private static int intThreadPoolSize = 10;
	
	static {

		Properties SMFProp = InitiateAll.getSMFProps();
		userName=SMFProp.getProperty(SMFAgentConstants.SMF_AGENT_USER_NAME);
		password=SMFAgentConstants.SMF_AGENT_USER_PASSWORD;
		networkId=SMFProp.getProperty(SMFAgentConstants.NETWORKID_PROP);
		threadPoolSize=SMFProp.getProperty(SMFAgentConstants.SCHEDULE_CUG_THREAD_POOL_SIZE);

		if(Utilities.isEmpty(networkId)) {
			logger.error( "### smfagent's properties network id should not be null or empty");
			System.exit(1);
		}
		if(Utilities.isNotEmpty(threadPoolSize)) {
			intThreadPoolSize = Integer.parseInt(threadPoolSize); 
		} else {
			intThreadPoolSize = defaultThreadPoolSize;
		}
		
		if( Utilities.isNull( userName ) || 
				Utilities.isNull( password )) {

			logger.error( "### smfagent's properties SMF_USER_NAME should not be null or empty");
			System.exit(1);
		}
	}
	
	private ScheduleCUGDebitTask() {
		
	}

	public static ScheduleTopUpActs executeScheduleCUGJobForParentDebits(ScheduleTopUpActs scheduleCUGDebitdata,HeaderDetails headerDetails) {
		
		ScheduleTopUpActs scheduleDebitRespData = ScheduleCUGDebitTask.doScheduleCUGDebitActs(scheduleCUGDebitdata,headerDetails);
		
		//Update the Success and (or) failure list of Parent MSISNDs Debit to Database
		BigDecimal[] transIds = ScheduleCUGDebitTask.callDBToUpdateMsisdnsDebitStatus(scheduleDebitRespData,headerDetails);
		
		if(transIds != null &&  transIds.length>0)
			scheduleDebitRespData.setTransIds(transIds);
		
		return scheduleDebitRespData;
	}
	/**
	 * This method is used to set the result of database procedure to a ScheduleDebitActs DTO object 
	 * 
	 * @return
	 */
	public static ScheduleTopUpActs callDBToGetScheduleGroupActs() {
		
		//just for safety adding this
		Integer intMaxRecords = 10;
		String maxRecords = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SCHEDULE_CUG_MAXRECORDS );
		if(Utilities.isNotEmpty(maxRecords)) {
			intMaxRecords = new Integer(maxRecords).intValue();
		}
		
		ScheduleCUGGetGroupActsData domainData = new ScheduleCUGGetGroupActsData();
		
		/**
		 * Setting the input
		 */
		domainData.setPi_network_id(new Long(networkId));
		domainData.setPi_maxRecords(intMaxRecords);
		
		try {
			/**
			 * calling db proc using mosf
			 */
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_get_sched_cug_groups_dtls", domainData, domainData);
			
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code in pro_get_sched_cug_groups_dtls==>"+domainData.getPo_error_code());
			}

		} catch (SMFAgentException e) {
			logger.error( "Exception in callDBToGetScheduleGroupActs \n"+Utilities.getStackTrace(e));
		}
		if(logger.isDebugEnabled()) {
			logger.debug( "Logging pro_get_sched_cug_groups_dtls procedure values >>>>");
			printGetScheduleGroupActs(domainData);
		}
		//Setting Data to DTO Object
		ScheduleTopUpActs groupTopUpActs = setScheduleCUGGroupActsData(domainData);
		
		return groupTopUpActs;
	}
	
	private static void printGetScheduleGroupActs(ScheduleCUGGetGroupActsData domainData) {
		
		if(domainData != null && domainData.getPo_parent_msisdns() != null && domainData.getPo_parent_msisdns().length > 0) {
			
			//lengths of all the arrays
			int custGroupIdArrLen = 0;
			int parentMsisdnsArrLen	= 0;
			int debitAmountsArrLen	= 0;
			
			BigDecimal[] custGroupIdArr = domainData.getPo_customerGroupId();
			BigDecimal[] parentMsisdnsArr = domainData.getPo_parent_msisdns();
			BigDecimal[] debitAmountsArr = domainData.getPo_debitAmounts();
			
			if(custGroupIdArr!= null && custGroupIdArr.length >0)
				custGroupIdArrLen = custGroupIdArr.length;
			
			if(parentMsisdnsArr!= null && parentMsisdnsArr.length >0)
				parentMsisdnsArrLen = parentMsisdnsArr.length;
			
			if(debitAmountsArr!= null)
				debitAmountsArrLen = debitAmountsArr.length;
	
			if(parentMsisdnsArrLen > 0)
			{
				if((custGroupIdArrLen == parentMsisdnsArrLen) &&
						(parentMsisdnsArrLen == debitAmountsArrLen)) {
	
					if(logger.isDebugEnabled())
						logger.debug("got data from database for schedule cug debit, No. of Parent MSISDNs:" + parentMsisdnsArrLen);
	
					logger.debug("NetWorkId:" + domainData.getPi_network_id());
					
					for(int i=0;i<parentMsisdnsArrLen ; i++) {
	
						logger.debug("Iteration:" + i);
						if(custGroupIdArr[i] != null) {
							logger.debug("GroupId:" + custGroupIdArr[i].longValue());
						}
						if(parentMsisdnsArr[i] != null) {
							logger.debug("parentMsisdn:" + parentMsisdnsArr[i].longValue());
						}
						logger.debug("debitAmount:" + debitAmountsArr[i]);
						
					}// End of for loop
				} else {
					logger.error("Inconsistent data from database for schedule cug debit");
				}
			} else {
				logger.error("Found no data from database for schedule cug debit");
			}
		} else {
			logger.error("domainData for schedule cug debit is NULL or Zero length");
		}
	}
	
	/**
	 * This method is used to Update Parent Msisdns Success or Failure List to database procedure from ScheduleTopUpActs DTO object 
	 * 
	 * @return
	 */
	public static BigDecimal[] callDBToUpdateMsisdnsDebitStatus(ScheduleTopUpActs scheduleDebitRespData,HeaderDetails headerDetails) {
		BigDecimal[] transIdArr = null;
		UpdateScheduleDebitListStatusData domainData = new UpdateScheduleDebitListStatusData();
		if(headerDetails != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());
		else
			domainData.setPi_network_id(new Long(networkId));
		
		if(scheduleDebitRespData.getSuccess_parent_msisdn_list() != null && 
				scheduleDebitRespData.getSuccess_parent_msisdn_list().size() > 0)
		{
			domainData.setPi_success_msisdn_list(Utilities.convertLongListToBigDecimalArray(scheduleDebitRespData.getSuccess_parent_msisdn_list()));
		}
		if(scheduleDebitRespData.getFailure_parent_msisdn_list() != null && 
				scheduleDebitRespData.getFailure_parent_msisdn_list().size() > 0)
		{
			domainData.setPi_failure_msisdn_list(Utilities.convertLongListToBigDecimalArray(scheduleDebitRespData.getFailure_parent_msisdn_list()));
		}
		
		if(scheduleDebitRespData.getTransId() != null)//from UI only single element comes
			domainData.setPi_trans_id(scheduleDebitRespData.getTransId());
		
		try {
			/**
			 * calling db proc using mosf
			 */
			SPFactory spFactory = ServiceUtils.executeSPWithOutCommit("pro_upd_sched_debit_status", domainData, domainData);
			
			Long errorCode = domainData.getPo_error_code();
			Utilities.commitOrRollback(spFactory, errorCode);
			
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code in pro_upd_sched_debit_status==>"+errorCode);
			}
			if(errorCode != null && errorCode == 0)
			{
				transIdArr = domainData.getPo_trans_id();
	
				if(transIdArr != null && transIdArr.length >0)
				{
					if(logger.isInfoEnabled()) {
		
						logger.info( "Found no of trans ids in out put==>"+transIdArr.length);
					}
				}
				else
					logger.error( "Found no trans ids in out put");
			}
		} catch (SMFAgentException e) {
			logger.error( "Exception in callDBToUpdateMsisdnsDebitStatus \n"+Utilities.getStackTrace(e));
		}
		return transIdArr;
	}
	
	private static ScheduleTopUpActs setScheduleCUGGroupActsData(ScheduleCUGGetGroupActsData domainData) {
		//Setting Data to DTO Object
		ScheduleTopUpActs groupTopUpActs = null;
		if(domainData != null && domainData.getPo_parent_msisdns() != null && domainData.getPo_parent_msisdns().length > 0) {
			
			//lengths of all the arrays
			int custGroupIdArrLen = 0;
			int parentMsisdnsArrLen	= 0;
			int debitAmountsArrLen	= 0;
			
			BigDecimal[] custGroupIdArr = domainData.getPo_customerGroupId();
			BigDecimal[] parentMsisdnsArr = domainData.getPo_parent_msisdns();
			BigDecimal[] debitAmountsArr = domainData.getPo_debitAmounts();
			
			if(custGroupIdArr!= null && custGroupIdArr.length >0)
				custGroupIdArrLen = custGroupIdArr.length;
			
			if(parentMsisdnsArr!= null && parentMsisdnsArr.length >0)
				parentMsisdnsArrLen = parentMsisdnsArr.length;
			
			if(debitAmountsArr!= null)
				debitAmountsArrLen = debitAmountsArr.length;
	
			if(parentMsisdnsArrLen > 0)
			{
				if((custGroupIdArrLen == parentMsisdnsArrLen) &&
						(parentMsisdnsArrLen == debitAmountsArrLen)) {
	
					if(logger.isDebugEnabled())
						logger.debug("got data from database for schedule cug debit, No. of Parent MSISDNs:" + parentMsisdnsArrLen);
	
					groupTopUpActs = new ScheduleTopUpActs();
					groupTopUpActs.setNetworkId(domainData.getPi_network_id());
					
					for(int i=0;i<parentMsisdnsArrLen ; i++) {
						if(custGroupIdArr[i] != null && parentMsisdnsArr[i] != null && debitAmountsArr[i] != null) {
							GroupTopUpAct groupTopupAct = new GroupTopUpAct();
							groupTopupAct.setCustGroupId(custGroupIdArr[i].longValue());
							groupTopupAct.setParentMsisdn(parentMsisdnsArr[i].longValue());
							groupTopupAct.setDebitAmount(debitAmountsArr[i]);
							groupTopUpActs.getGroupTopupActs().add(groupTopupAct);
						} else {
							
							 /* As discused with ProjectLead, 
							 * If all arrays are not equal then break the For Loop and make groupTopUpActs as null */
							 
							logger.error("Inconsistent data from database for schedule cug debit");
							groupTopUpActs = null;
							break;
						}
					}// End of for loop
				} else {
					logger.error("Inconsistent data from database for schedule cug debit");
				}
			} else {
				logger.error("Found no data from database for schedule cug debit");
			}
		} else {
			logger.error("domainData for schedule cug debit is NULL or Zero length");
		}
		
		return groupTopUpActs;
	}
	
	public static ScheduleTopUpActs doScheduleCUGDebitActs(final ScheduleTopUpActs scheduleCUGTopUpdata,final HeaderDetails headerDetails) {

		if(scheduleCUGTopUpdata != null && 
				scheduleCUGTopUpdata.getGroupTopupActs() != null && 
				scheduleCUGTopUpdata.getGroupTopupActs().size() > 0) {
			final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
			final ThreadPoolExecutor tpExecutor = new ThreadPoolExecutor(intThreadPoolSize, intThreadPoolSize, 100000, TimeUnit.SECONDS, queue);
			for(final GroupTopUpAct groupTopUpAct : scheduleCUGTopUpdata.getGroupTopupActs()) {
				//class Inner implements Runnable{
				synchronized (groupTopUpAct) {
					tpExecutor.execute(new Thread(){	       	  
						public void run(){
							if(groupTopUpAct != null && groupTopUpAct.getParentMsisdn() != null) {
								if(doDebitForParentMsisdn(groupTopUpAct,headerDetails)) {
									logger.debug("Debit Success for Parent MSISDNs:" + groupTopUpAct.getParentMsisdn());
									scheduleCUGTopUpdata.getSuccess_parent_msisdn_list().add(groupTopUpAct.getParentMsisdn());
									scheduleCUGTopUpdata.getSuccess_parent_groupId_list().add(groupTopUpAct.getCustGroupId());
								} else {
									logger.debug("Debit Failure for Parent MSISDNs:" + groupTopUpAct.getParentMsisdn());
									scheduleCUGTopUpdata.getFailure_parent_msisdn_list().add(groupTopUpAct.getParentMsisdn());
									scheduleCUGTopUpdata.getFailure_parent_groupId_list().add(groupTopUpAct.getCustGroupId());
								}
							}
						}
					});
				}		
			}
			tpExecutor.shutdown();
			// Wait until all threads are finish
			while (!tpExecutor.isTerminated());
		}

		return scheduleCUGTopUpdata;
	}
	
	/**
     * Method setDebitReqest
     *
     *
     * @param scheduleCUGTopUpAct
     *
     * @return
     */
    private static DebitRequestE setDebitReqest(GroupTopUpAct scheduleCUGTopUpAct) throws Exception {

        DebitRequestE requestE = new DebitRequestE();
        DebitRequest  request  = new DebitRequest();
        
        Long parentMsisdn = scheduleCUGTopUpAct.getParentMsisdn();
		BigDecimal debitAmount = scheduleCUGTopUpAct.getDebitAmount();
		
		if(parentMsisdn != null) {
			MSISDNType msisdn = new MSISDNType();
			msisdn.setMSISDNType(String.valueOf(parentMsisdn));
			request.setMSISDN(msisdn);
		}
        
        BalanceType balType = new BalanceType();
      //
        balType.setBalanceType(debitAmount);
        request.setDebitAmount(balType);
        
		String operator=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.OPERATOR);
		OperatorType operatorType = new OperatorType();
		operatorType.setOperatorType(operator);
		request.setOperator(operatorType);
		
		String reason=  SMFAgentConstants.DEFAULT_CUG_PARENT_DEBIT_REASON + " for parent msisdn " + 
						parentMsisdn + " of groupId " + scheduleCUGTopUpAct.getCustGroupId();
		
		ReasonType reasonType = new ReasonType();
		reasonType.setReasonType(reason);
		request.setReason(reasonType);
		
        requestE.setDebitRequest(request);

        return requestE;
    }
    /**
     * @return
     */
    private static TrackingMessageHeaderType setIBAHeader(HeaderDetails headerDetails) {

    	TrackingMessageHeaderType headerType = new TrackingMessageHeaderType();
    	if(headerDetails == null)
    	{
	        CarrierIdType carrierId  = new CarrierIdType();
	        MessageIdType messageIdType = new MessageIdType();
	        UserIdType userId = new UserIdType();
	       
	       	carrierId.setCarrierIdType(networkId);
	       	headerType.setCarrierId(carrierId);
	        
	       	headerType.setMessageDateTimeStamp(Calendar.getInstance());
	        
	        messageIdType.setMessageIdType(new Date().getTime() + "");
	        headerType.setMessageId(messageIdType);
	        
	       	userId.setUserIdType(userName);
	        headerType.setUserId(userId);
    	}
    	else
    	{
	        CarrierIdType carrierId  = new CarrierIdType();
	        MessageIdType messageIdType = new MessageIdType();
	        UserIdType userId = new UserIdType();
	       
	       	carrierId.setCarrierIdType(headerDetails.getNetworkID().toString());
	       	headerType.setCarrierId(carrierId);
	        
	       	headerType.setMessageDateTimeStamp(Calendar.getInstance());
	        
	        messageIdType.setMessageIdType(headerDetails.getRequestID());
	        headerType.setMessageId(messageIdType);
	        
	       	userId.setUserIdType(headerDetails.getLoginID().toString());
	        headerType.setUserId(userId);

    	}
        return headerType;
    }
    
	private static boolean doDebitForParentMsisdn(GroupTopUpAct scheduleCUGTopUpAct,HeaderDetails headerDetails) {
		boolean returnValue = false;

		Long parentMsisdn = scheduleCUGTopUpAct.getParentMsisdn();
		
		if(parentMsisdn != null) {
			
			if(logger.isDebugEnabled()) {
				logger.debug( "InvokeService for doDebit From Parent Msisdn: " + parentMsisdn);
			}
	
			Long startTime  = System.currentTimeMillis();
	
			IBAWebserviceClient ibaDebitclient = new IBAWebserviceClient();
			TrackingMessageHeaderType headerType = null;
			DebitRequestE requestE   = null;
			
			try{
				
				headerType = setIBAHeader(headerDetails);
				
				requestE   = setDebitReqest(scheduleCUGTopUpAct);
	
				DebitResponse response = ibaDebitclient.invokeDebit(requestE, headerType);
	
				if (response != null) {
					logger.info( "Response success for parent MSISDN[" + parentMsisdn + "]");
					returnValue = true;
					
				} else { // for exceptions
					logger.error( "Response null(may be communication error) for parent MSISDN[" + parentMsisdn + "]");
					returnValue = false;
				}
			}catch(Exception e){
				logger.error( "Exception occured while processing bebit from parent MSISDN["+ parentMsisdn + "]");
				logger.error( "Exception \n" + Utilities.getStackTrace(e));
				returnValue = false;
			}
			if(returnValue) {
				logger.info("DebitForParentMsisdn success"+(int) (System.currentTimeMillis() - startTime)+"ms");
			} else {
				logger.info("DebitForParentMsisdn failure"+(int) (System.currentTimeMillis() - startTime)+"ms");
			}
		} else {
			logger.info("parent MSISDN is NULL");
			returnValue = false;
		}
		return returnValue;
	}
	
	
}