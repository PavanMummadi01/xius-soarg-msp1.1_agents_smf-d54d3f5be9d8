package com.xius.smf.job.task;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.BalanceType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.CarrierIdType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.DDMONYYYYFormat;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.MSISDNType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.MessageIdType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.ReasonType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.SpecialTopUpRequest;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.SpecialTopUpRequestE;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.SpecialTopUpResponse;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.TrackingMessageHeaderType;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.UserIdType;
import com.xius.smf.client.ws.IBAWebserviceClient;
import com.xius.smf.domaindata.ChildTopUpAccount;
import com.xius.smf.domaindata.GroupTopUpAct;
import com.xius.smf.domaindata.ScheduleCUGGetChildActsData;
import com.xius.smf.domaindata.ScheduleTopUpActs;
import com.xius.smf.domaindata.UpdateScheduleTopUpListStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class ScheduleCUGTopUpTask {

	static Logger logger = LogManager.getLogger("ScheduleCUGTopUpTask");

	private static String userName = null;
	private static String password = null;
	private static String networkId = null;
	//private static int defaultThreadPoolSize = 10;
	//private static String threadPoolSize = null;
	//private static int intThreadPoolSize = 10;

	static {

		Properties SMFProp = InitiateAll.getSMFProps();
		userName=SMFProp.getProperty(SMFAgentConstants.SMF_AGENT_USER_NAME);
		password=SMFAgentConstants.SMF_AGENT_USER_PASSWORD;
		networkId=SMFProp.getProperty(SMFAgentConstants.NETWORKID_PROP);
		//threadPoolSize=SMFProp.getProperty(SMFAgentConstants.SCHEDULE_CUG_THREAD_POOL_SIZE);

		if(Utilities.isEmpty(networkId)) {
			logger.error( "### smfagent's properties network id should not be null or empty");
			System.exit(1);
		}

		/*if(Utilities.isNotEmpty(threadPoolSize)) {
			intThreadPoolSize = Integer.parseInt(threadPoolSize); 
		} else {
			intThreadPoolSize = defaultThreadPoolSize;
		}*/

		if( Utilities.isNull( userName ) || 
				Utilities.isNull( password )) {

			logger.error( "### smfagent's properties SMF_USER_NAME should not be null or empty");
			System.exit(1);
		}
	}

	private ScheduleCUGTopUpTask() {

	}

	public static ScheduleTopUpActs executeSchedCUGJobForParentChilds(ScheduleTopUpActs scheduleCUGDebitdata) {
		
		ScheduleTopUpActs scheduleTopUpRespData = null;
		
		ScheduleTopUpActs scheduleCUGTopUpdata = ScheduleCUGTopUpTask.callDBToGetScheduleChildActs(scheduleCUGDebitdata);
		
		if( null != scheduleCUGTopUpdata && 
				scheduleCUGTopUpdata.getGroupTopupActs() != null &&
				scheduleCUGTopUpdata.getGroupTopupActs().size() > 0 
				) {
			logger.info( "Number of CUG schedule GroupActs(parent msisdns) found for topUp of respective child msisdns : " + scheduleCUGTopUpdata.getGroupTopupActs().size() );

			scheduleTopUpRespData = ScheduleCUGTopUpTask.doScheduleTopupForChildMsisdns(scheduleCUGTopUpdata);
			
			//Update the Success or failure list of child MSISNDs Topup to Database
			ScheduleCUGTopUpTask.callDBToUpdateMsisdnsTopUpStatus(scheduleTopUpRespData);
			
		} else {
			logger.info( "*** *** *** Found No CUG schedule GroupActs(parent msisdns) for topUp of respective child msisdns");
		}
		
		return scheduleTopUpRespData;
	}
	
	/**
	 * This method is used to set the result of database procedure to a ScheduleTopUpActs DTO object 
	 * 
	 * @return
	 */
	public static ScheduleTopUpActs callDBToGetScheduleChildActs(ScheduleTopUpActs scheduleCUGDebitdata) {

		//just for safety adding this
		Integer intMaxRecords = 10;
		String maxRecords = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.SCHEDULE_CUG_MAXRECORDS );
		ScheduleTopUpActs schedTopUpActs = null;
		Long errorCode = null;
		if(Utilities.isNull(maxRecords) == false) {
			intMaxRecords = new Integer(maxRecords).intValue();
		}

		ScheduleCUGGetChildActsData domainData = new ScheduleCUGGetChildActsData();

		/**
		 * Setting the input
		 */
		domainData.setPi_network_id(new Long(networkId));
		domainData.setPi_maxRecords(intMaxRecords);
//		adding this to get only to get tranid related children
		if(scheduleCUGDebitdata != null) {
			domainData.setPo_transId(scheduleCUGDebitdata.getTransIds());
		
			if(scheduleCUGDebitdata.getSuccess_parent_msisdn_list() != null &&
					scheduleCUGDebitdata.getSuccess_parent_msisdn_list().size() >0 &&
					scheduleCUGDebitdata.getSuccess_parent_groupId_list() != null &&
					scheduleCUGDebitdata.getSuccess_parent_groupId_list().size() >0 &&
					scheduleCUGDebitdata.getSuccess_parent_msisdn_list().size() == scheduleCUGDebitdata.getSuccess_parent_groupId_list().size()) {
				domainData.setPio_parent_msisdns(Utilities.convertLongListToBigDecimalArray(scheduleCUGDebitdata.getSuccess_parent_msisdn_list()));
				domainData.setPio_customerGroupId(Utilities.convertLongListToBigDecimalArray(scheduleCUGDebitdata.getSuccess_parent_groupId_list()));
			}
		}

		try {
			/**
			 * calling db proc using mosf
			 */
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_get_sched_cug_child_dtls", domainData, domainData);

			errorCode = domainData.getPo_error_code() ;
			Utilities.commitOrRollback(factory, errorCode);
			if(logger.isInfoEnabled()) {
				logger.info( "Error Code in pro_get_sched_cug_child_dtls==>"+domainData.getPo_error_code());
			}

		} catch (SMFAgentException e) {
			logger.error("Exception in callDBToGetScheduleChildActs \n"+Utilities.getStackTrace(e));
		}

		if(logger.isDebugEnabled()) {
			logger.debug( "Logging pro_get_sched_cug_child_dtls procedure values >>>>");
			printScheduleCUGChildActsData(domainData);
		}
		
		//Setting Data to DTO Object
		if(errorCode != null &&  errorCode == 0)
			schedTopUpActs = setScheduleCUGChildActsData(domainData);

		return schedTopUpActs;
	}
	
	/**
	 * This method is used to set the result of database procedure to a ScheduleTopUpActs DTO object 
	 * 
	 * @return
	 */
	public static ScheduleTopUpActs callDBToGetScheduleChildActs() {

		return callDBToGetScheduleChildActs(null);
	}
	
	private static void printScheduleCUGChildActsData(ScheduleCUGGetChildActsData domainData) {
		if(domainData != null && domainData.getPio_parent_msisdns() != null && domainData.getPio_parent_msisdns().length > 0) {

			//lengths of all the arrys
			int custGroupIdArrLen = 0;
			int parentMsisdnsArrLen	= 0;
			int transIdArrLen = 0;
			int childMsisdnsCommaArrLen		= 0;
			int topUpAmountsCommaArrLen	= 0;
			int validityDatesCommaArrLen	= 0;
			int expiryDatesCommaArrLen	= 0;
			int gracePeriodIEndDatesCommaArrLen = 0;

			BigDecimal[] custGroupIdArr = domainData.getPio_customerGroupId();
			BigDecimal[] parentMsisdnsArr = domainData.getPio_parent_msisdns();
			BigDecimal[] transIdArr = domainData.getPo_transId();
			String[] childMsisdnsCommaArr = domainData.getPo_child_msisdns();
			String[] topUpAmountsCommaArr = domainData.getPo_topUpAmounts();
			String[] validityDatesCommaArr = domainData.getPo_validityDates();
			String[] expiryDatesCommaArr = domainData.getPo_expiryDates();
			String[] gracePeriodIEndDatesCommaArr = domainData.getPo_gracePeriodIEndDate();

			if(custGroupIdArr!= null && custGroupIdArr.length >0)
				custGroupIdArrLen = custGroupIdArr.length;

			if(parentMsisdnsArr!= null && parentMsisdnsArr.length >0)
				parentMsisdnsArrLen = parentMsisdnsArr.length;

			if(transIdArr!= null)
				transIdArrLen = transIdArr.length;
			
			if(childMsisdnsCommaArr!= null)
				childMsisdnsCommaArrLen = childMsisdnsCommaArr.length;

			if(topUpAmountsCommaArr!= null)
				topUpAmountsCommaArrLen = topUpAmountsCommaArr.length;

			if(validityDatesCommaArr!= null)
				validityDatesCommaArrLen = validityDatesCommaArr.length;

			if(expiryDatesCommaArr!= null)
				expiryDatesCommaArrLen = expiryDatesCommaArr.length;

			if(gracePeriodIEndDatesCommaArr!= null)
				gracePeriodIEndDatesCommaArrLen = gracePeriodIEndDatesCommaArr.length;

			if(parentMsisdnsArrLen > 0)
			{
				if((custGroupIdArrLen == parentMsisdnsArrLen) &&
						(parentMsisdnsArrLen == transIdArrLen) &&
						(transIdArrLen == childMsisdnsCommaArrLen) && 
						(childMsisdnsCommaArrLen == topUpAmountsCommaArrLen) &&
						(topUpAmountsCommaArrLen == validityDatesCommaArrLen) &&
						(validityDatesCommaArrLen == expiryDatesCommaArrLen) &&
						(expiryDatesCommaArrLen == gracePeriodIEndDatesCommaArrLen)) {

					if(logger.isDebugEnabled())
						logger.debug("got data from database for schedule cug topup, No. of Parent MSISDNs:" + parentMsisdnsArrLen);

					for(int i=0;i<parentMsisdnsArrLen ; i++) {
						if(parentMsisdnsArr[i] != null && custGroupIdArr[i] != null && transIdArr[i] != null &&
								Utilities.isNotEmpty(childMsisdnsCommaArr[i]) && Utilities.isNotEmpty(topUpAmountsCommaArr[i]) &&
								Utilities.isNotEmpty(validityDatesCommaArr[i]) && Utilities.isNotEmpty(expiryDatesCommaArr[i]) &&
								Utilities.isNotEmpty(gracePeriodIEndDatesCommaArr[i])) {
							
							logger.debug("===============================");
							logger.debug("Iteration ("+i+") of CustGroup:" + custGroupIdArr[i]);
							logger.debug("parentMsisdnsArr :" + parentMsisdnsArr[i]);
							logger.debug("custGroupIdArr :" + custGroupIdArr[i]);
							logger.debug("transIdArr :" + transIdArr[i]);
							
							int childMsisdnsArrLen		= 0;
							int childTopUpAmountsArrLen	= 0;
							int childValidityDatesArrLen= 0;
							int childExpiryDatesArrLen	= 0;
							int childGracePIEndDatesArrLen	= 0;

							String[] childMsisdnsArr = null;
							String[] childTopUpAmountsArr = null;
							String[] childValidityDatesArr = null;
							String[] childExpiryDatesArr = null;
							String[] childGracePIEndDatesArr = null;

							childMsisdnsArr = childMsisdnsCommaArr[i].split(",");
							childTopUpAmountsArr = topUpAmountsCommaArr[i].split(",");
							childValidityDatesArr = validityDatesCommaArr[i].split(",");
							childExpiryDatesArr = expiryDatesCommaArr[i].split(",");
							childGracePIEndDatesArr= gracePeriodIEndDatesCommaArr[i].split(",");

							if(childMsisdnsArr != null && childMsisdnsArr.length > 0) {
								childMsisdnsArrLen = childMsisdnsArr.length;
							}
							if(childTopUpAmountsArr!= null) {
								childTopUpAmountsArrLen = childTopUpAmountsArr.length;
							}
							if(childValidityDatesArr!= null) {
								childValidityDatesArrLen = childValidityDatesArr.length;
							}
							if(childExpiryDatesArr!= null) {
								childExpiryDatesArrLen = childExpiryDatesArr.length;
							}
							if(childGracePIEndDatesArr!= null) {
								childGracePIEndDatesArrLen = childGracePIEndDatesArr.length;
							}

							if(childMsisdnsArrLen > 0) {

								if((childMsisdnsArrLen == childTopUpAmountsArrLen) && 
										(childTopUpAmountsArrLen == childValidityDatesArrLen) &&
										(childValidityDatesArrLen == childExpiryDatesArrLen) &&
										(childExpiryDatesArrLen == childGracePIEndDatesArrLen)) {

									if(logger.isDebugEnabled()) {
										logger.debug("got data from database for schedule cug topup for a parent MSISDN " + parentMsisdnsArr[i] + ", No. of Child MSISDNs:" + childMsisdnsArrLen);
									}

									for(int j=0; j<childMsisdnsArrLen; j++) {
										if(Utilities.isNotEmpty(childMsisdnsArr[j]) && Utilities.isNotEmpty(childTopUpAmountsArr[j]) &&
												Utilities.isNotEmpty(childValidityDatesArr[j]) && Utilities.isNotEmpty(childExpiryDatesArr[j]) &&
												Utilities.isNotEmpty(childGracePIEndDatesArr[j])) {
											logger.debug("-------------");
											logger.debug("Iteration ("+j+") of childMsisdns:");
											logger.debug("childMsisdnsArr :" + childMsisdnsArr[j]);
											logger.debug("childTopUpAmountsArr :" + childTopUpAmountsArr[j]);
											logger.debug("childValidityDatesArr :" + childValidityDatesArr[j]);
											logger.debug("childExpiryDatesArr :" + childExpiryDatesArr[j]);
											logger.debug("childGracePIEndDatesArr :" + childGracePIEndDatesArr[j]);
										}else {
											
											 /* As discused with ProjectLead, 
											  If all arrays are not equal then break the For Loop and make groupTopUpActs as null*/ 
											 
											logger.error("Inconsistent data from database for schedule cug topup for a child " + childMsisdnsArr[j] + " of the parent MSISDN:" + parentMsisdnsArr[i]);
											//groupTopUpActs = null;
											break;
										}
									}
								}
								else {
									logger.error("Inconsistent data from database for schedule cug topup for a parent MSISDN" + parentMsisdnsArr[i]);
								}
							} else {
								logger.error("Found no data (childMsisdns) from database for schedule cug topup for a parent MSISDN" + parentMsisdnsArr[i]);
							}
						} else {
							logger.error("Inconsistent data from database for schedule cug topup for a parent MSISDN" + parentMsisdnsArr[i]);
						}
					}// End of for loop
				} else {
					logger.error("Inconsistent data from database for schedule cug topup");
				}
			} else {
				logger.error("Found no data from database for schedule cug topup");
			}
		} else {
			logger.error("domainData for schedule cug topup is NULL or Zero length");
		}
	}
	

	/**
	 * This method is used to Update Child Msisdns Success or Failure List to database procedure from ScheduleTopUpActs DTO object 
	 * 
	 * @return
	 */
	public static void callDBToUpdateMsisdnsTopUpStatus(ScheduleTopUpActs scheduleTopUpRespData) {

		//just for safety adding this

		UpdateScheduleTopUpListStatusData domainData = new UpdateScheduleTopUpListStatusData();

		/**
		 * Setting the input
		 */
		domainData.setPi_network_id(new Long(networkId));

		domainData = setInputsForTopUpListStatus(domainData, scheduleTopUpRespData);

		try {
			/**
			 * calling db proc using mosf
			 */
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_upd_sched_topup_status", domainData, domainData);
			Utilities.commitOrRollback(factory, domainData.getPo_error_code());

			if(logger.isInfoEnabled()) {
				logger.info( "Error Code in pro_upd_sched_topup_status==>"+domainData.getPo_error_code());
			}

		} catch (SMFAgentException e) {
			logger.error( "Exception in callDBToUpdateMsisdnsTopUpStatus \n"+Utilities.getStackTrace(e));
		}
	}

	private static UpdateScheduleTopUpListStatusData setInputsForTopUpListStatus(UpdateScheduleTopUpListStatusData domainData, ScheduleTopUpActs scheduleTopUpRespData) {

		List<Long> parentMsisdns = new ArrayList<Long>();
		List<Long> transIds = new ArrayList<Long>();
		List<String> successMsisdnsList = new ArrayList<String>();
		List<String> failureMsisdnsList = new ArrayList<String>();
		List<String> failureMsisdnsTopUpsList = new ArrayList<String>();
		String strEmptyValue = SMFAgentConstants.EMPTY_STRING_VALUE;//"NA";

		if(scheduleTopUpRespData != null && 
				scheduleTopUpRespData.getGroupTopupActs() != null &&
				scheduleTopUpRespData.getGroupTopupActs().size() > 0) {

			for (GroupTopUpAct groupTopUpAct :scheduleTopUpRespData.getGroupTopupActs()) {
				
				if(groupTopUpAct.getParentMsisdn() != null ) {
					
					parentMsisdns.add(groupTopUpAct.getParentMsisdn());
					transIds.add(groupTopUpAct.getTransId());
					
					if(groupTopUpAct.getSuccess_child_msisdn_list() != null &&
							groupTopUpAct.getSuccess_child_msisdn_list().size() > 0) {
						String succMsisdnsWithComma = Utilities.convertLongListToString(groupTopUpAct.getSuccess_child_msisdn_list(), ",");
						if(Utilities.isNotEmpty(succMsisdnsWithComma)) {
							successMsisdnsList.add(succMsisdnsWithComma);
						} else {
							successMsisdnsList.add(strEmptyValue);
						}
					} else {
						successMsisdnsList.add(strEmptyValue);
					}
					
					if(groupTopUpAct.getFailure_child_msisdn_list() != null &&
							groupTopUpAct.getFailure_child_msisdn_list().size() > 0) {
						String failMsisdnsWithComma = Utilities.convertLongListToString(groupTopUpAct.getFailure_child_msisdn_list(), ",");
						if(Utilities.isNotEmpty(failMsisdnsWithComma)) {
							failureMsisdnsList.add(failMsisdnsWithComma);
						} else {
							failureMsisdnsList.add(strEmptyValue);
						}
					} else {
						failureMsisdnsList.add(strEmptyValue);
					}
					
					if(groupTopUpAct.getFailure_child_msisdn_topup_list() != null &&
							groupTopUpAct.getFailure_child_msisdn_topup_list().size() > 0) {
						String failireMsisdnsTopUpsWithComma = Utilities.convertBigDecimalListToString(groupTopUpAct.getFailure_child_msisdn_topup_list(), ",");
						if(Utilities.isNotEmpty(failireMsisdnsTopUpsWithComma)) {
							failureMsisdnsTopUpsList.add(failireMsisdnsTopUpsWithComma);
						} else {
							failureMsisdnsTopUpsList.add(strEmptyValue);
						}
					} else {
						failureMsisdnsTopUpsList.add(strEmptyValue);
					}
				}
			}
		}
		if(parentMsisdns != null && parentMsisdns.size() > 0 &&
				transIds != null && transIds.size() > 0 &&
				successMsisdnsList != null && successMsisdnsList.size() > 0 &&
				failureMsisdnsList != null && failureMsisdnsList.size() > 0 &&
				failureMsisdnsTopUpsList != null && failureMsisdnsTopUpsList.size() > 0 &&
				(parentMsisdns.size() == transIds.size()) &&
				(transIds.size() == successMsisdnsList.size()) &&
				(successMsisdnsList.size() == failureMsisdnsList.size()) &&
				(failureMsisdnsList.size() == failureMsisdnsTopUpsList.size())
				) {
			domainData.setPi_parent_msisdns(Utilities.convertLongListToBigDecimalArray(parentMsisdns));
			domainData.setPi_transIds(Utilities.convertLongListToBigDecimalArray(transIds));
			domainData.setPi_success_msisdn_list(successMsisdnsList.toArray(new String[successMsisdnsList.size()]));
			domainData.setPi_failure_msisdn_list(failureMsisdnsList.toArray(new String[failureMsisdnsList.size()]));
			domainData.setPi_failure_msisdn_topup_list(failureMsisdnsTopUpsList.toArray(new String[failureMsisdnsTopUpsList.size()]));
		} else {
			if(logger.isInfoEnabled()) {
				logger.info( "Missing values: Not able to set the values to domaindata for pro_upd_sched_topup_status==>");
			}
		}

		return domainData;
	}

	private static ScheduleTopUpActs setScheduleCUGChildActsData(ScheduleCUGGetChildActsData domainData) {
		//Setting Data to DTO Object
		ScheduleTopUpActs schedTopUpActs = null;
		if(domainData != null && domainData.getPio_parent_msisdns() != null && domainData.getPio_parent_msisdns().length > 0) {

			//lengths of all the arrys
			int custGroupIdArrLen = 0;
			int parentMsisdnsArrLen	= 0;
			int transIdArrLen = 0;
			int childMsisdnsCommaArrLen		= 0;
			int topUpAmountsCommaArrLen	= 0;
			int validityDatesCommaArrLen	= 0;
			int expiryDatesCommaArrLen	= 0;
			int gracePeriodIEndDatesCommaArrLen = 0;

			BigDecimal[] custGroupIdArr = domainData.getPio_customerGroupId();
			BigDecimal[] parentMsisdnsArr = domainData.getPio_parent_msisdns();
			BigDecimal[] transIdArr = domainData.getPo_transId();
			String[] childMsisdnsCommaArr = domainData.getPo_child_msisdns();
			String[] topUpAmountsCommaArr = domainData.getPo_topUpAmounts();
			String[] validityDatesCommaArr = domainData.getPo_validityDates();
			String[] expiryDatesCommaArr = domainData.getPo_expiryDates();
			String[] gracePeriodIEndDatesCommaArr = domainData.getPo_gracePeriodIEndDate();

			if(custGroupIdArr!= null && custGroupIdArr.length >0)
				custGroupIdArrLen = custGroupIdArr.length;

			if(parentMsisdnsArr!= null && parentMsisdnsArr.length >0)
				parentMsisdnsArrLen = parentMsisdnsArr.length;

			if(transIdArr!= null)
				transIdArrLen = transIdArr.length;
			
			if(childMsisdnsCommaArr!= null)
				childMsisdnsCommaArrLen = childMsisdnsCommaArr.length;

			if(topUpAmountsCommaArr!= null)
				topUpAmountsCommaArrLen = topUpAmountsCommaArr.length;

			if(validityDatesCommaArr!= null)
				validityDatesCommaArrLen = validityDatesCommaArr.length;

			if(expiryDatesCommaArr!= null)
				expiryDatesCommaArrLen = expiryDatesCommaArr.length;

			if(gracePeriodIEndDatesCommaArr!= null)
				gracePeriodIEndDatesCommaArrLen = gracePeriodIEndDatesCommaArr.length;

			if(parentMsisdnsArrLen > 0)
			{
				if((custGroupIdArrLen == parentMsisdnsArrLen) &&
						(parentMsisdnsArrLen == transIdArrLen) &&
						(transIdArrLen == childMsisdnsCommaArrLen) && 
						(childMsisdnsCommaArrLen == topUpAmountsCommaArrLen) &&
						(topUpAmountsCommaArrLen == validityDatesCommaArrLen) &&
						(validityDatesCommaArrLen == expiryDatesCommaArrLen) &&
						(expiryDatesCommaArrLen == gracePeriodIEndDatesCommaArrLen)) {

					if(logger.isDebugEnabled())
						logger.debug("got data from database for schedule cug topup, No. of Parent MSISDNs:" + parentMsisdnsArrLen);

					schedTopUpActs = new ScheduleTopUpActs();

					for(int i=0;i<parentMsisdnsArrLen ; i++) {
						if(parentMsisdnsArr[i] != null && custGroupIdArr[i] != null && transIdArr[i] != null &&
								Utilities.isNotEmpty(childMsisdnsCommaArr[i]) && Utilities.isNotEmpty(topUpAmountsCommaArr[i]) &&
								Utilities.isNotEmpty(validityDatesCommaArr[i]) && Utilities.isNotEmpty(expiryDatesCommaArr[i]) &&
								Utilities.isNotEmpty(gracePeriodIEndDatesCommaArr[i])) {
							
							GroupTopUpAct groupTopupAct = new GroupTopUpAct();
							
							groupTopupAct.setParentMsisdn(parentMsisdnsArr[i].longValue());
							groupTopupAct.setCustGroupId(custGroupIdArr[i].longValue());
							groupTopupAct.setTransId(transIdArr[i].longValue());

							int childMsisdnsArrLen		= 0;
							int childTopUpAmountsArrLen	= 0;
							int childValidityDatesArrLen= 0;
							int childExpiryDatesArrLen	= 0;
							int childGracePIEndDatesArrLen	= 0;

							String[] childMsisdnsArr = null;
							String[] childTopUpAmountsArr = null;
							String[] childValidityDatesArr = null;
							String[] childExpiryDatesArr = null;
							String[] childGracePIEndDatesArr = null;

							childMsisdnsArr = childMsisdnsCommaArr[i].split(",");
							childTopUpAmountsArr = topUpAmountsCommaArr[i].split(",");
							childValidityDatesArr = validityDatesCommaArr[i].split(",");
							childExpiryDatesArr = expiryDatesCommaArr[i].split(",");
							childGracePIEndDatesArr= gracePeriodIEndDatesCommaArr[i].split(",");

							if(childMsisdnsArr != null && childMsisdnsArr.length > 0) {
								childMsisdnsArrLen = childMsisdnsArr.length;
							}
							if(childTopUpAmountsArr!= null) {
								childTopUpAmountsArrLen = childTopUpAmountsArr.length;
							}
							if(childValidityDatesArr!= null) {
								childValidityDatesArrLen = childValidityDatesArr.length;
							}
							if(childExpiryDatesArr!= null) {
								childExpiryDatesArrLen = childExpiryDatesArr.length;
							}
							if(childGracePIEndDatesArr!= null) {
								childGracePIEndDatesArrLen = childGracePIEndDatesArr.length;
							}

							if(childMsisdnsArrLen > 0) {

								if((childMsisdnsArrLen == childTopUpAmountsArrLen) && 
										(childTopUpAmountsArrLen == childValidityDatesArrLen) &&
										(childValidityDatesArrLen == childExpiryDatesArrLen) &&
										(childExpiryDatesArrLen == childGracePIEndDatesArrLen)) {

									if(logger.isDebugEnabled()) {
										logger.debug("got data from database for schedule cug topup for a parent MSISDN:" + parentMsisdnsArr[i] + ", No. of Child MSISDNs:" + childMsisdnsArrLen);
									}

									for(int j=0; j<childMsisdnsArrLen; j++) {
										if(Utilities.isNotEmpty(childMsisdnsArr[j]) && Utilities.isNotEmpty(childTopUpAmountsArr[j]) &&
												Utilities.isNotEmpty(childValidityDatesArr[j]) && Utilities.isNotEmpty(childExpiryDatesArr[j]) &&
												Utilities.isNotEmpty(childGracePIEndDatesArr[j])) {
											ChildTopUpAccount childTopUpAct = new ChildTopUpAccount();
											childTopUpAct.setMsisdn(Long.parseLong(childMsisdnsArr[j]));
											childTopUpAct.setTopUpAmount(new BigDecimal(childTopUpAmountsArr[j]));
											childTopUpAct.setValidityDate(childValidityDatesArr[j]);
											childTopUpAct.setExpiryDate(childExpiryDatesArr[j]);
											childTopUpAct.setGracePeriodIEndDate(childGracePIEndDatesArr[j]);

											groupTopupAct.getChildTopUpActs().add(childTopUpAct);
										} else {
											logger.error("Inconsistent data from database for schedule cug topup for a child " + childMsisdnsArr[j] + " of the parent MSISDN:" + parentMsisdnsArr[i]);
											
											 /* As discused with ProjectLead, 
											  If all arrays are not equal then break the For Loop and make groupTopUpActs as null */
											 
											schedTopUpActs = null;
											break;
										}
									}
								}
								else {
									logger.error("Inconsistent data from database for schedule cug topup for a parent MSISDN:" + parentMsisdnsArr[i]);
									
									 /* As discused with ProjectLead, 
									 *If all arrays are not equal then break the For Loop and make groupTopUpActs as null */
									 
									schedTopUpActs = null;
									break;
								}
							} else {
								
								 /* As discused with ProjectLead, 
								 * If all arrays are not equal then break the For Loop and make groupTopUpActs as null */
								 
								logger.error("Found no data (childMsisdns) from database for schedule cug topup for a parent MSISDN:" + parentMsisdnsArr[i]);
								schedTopUpActs = null;
								break;
							}
							schedTopUpActs.getGroupTopupActs().add(groupTopupAct);
						} else {
							
							 /* As discused with ProjectLead, 
							 * If all arrays are not equal then break the For Loop and make groupTopUpActs as null */
							 
							logger.error("Inconsistent data from database for schedule cug topup for a parent MSISDN:" + parentMsisdnsArr[i] + ", got child msisdnsArr NULL.");
							schedTopUpActs = null;
							break;
						}
					}// End of for loop
				} else {
					logger.error("Inconsistent data from database for schedule cug topup");
				}
			} else {
				logger.error("Found no data from database for schedule cug topup");
			}
		} else {
			logger.error("domainData for schedule cug topup is NULL or Zero length");
		}

		return schedTopUpActs;
	}

	/**
	 * Method setSpecialTopUpReqest
	 *
	 *
	 * @param scheduleChildTopUpAct
	 *
	 * @return
	 */
	private static SpecialTopUpRequestE setSpecialTopUpReqest(ChildTopUpAccount scheduleChildTopUpAct, 
			Long parentMsisdn, Long custGroupId) throws Exception {

		SpecialTopUpRequestE requestE = new SpecialTopUpRequestE();
		SpecialTopUpRequest  request  = new SpecialTopUpRequest();

		Long childMsisdn = scheduleChildTopUpAct.getMsisdn();
		BigDecimal topUpAmount = scheduleChildTopUpAct.getTopUpAmount();
		String expiryDate = scheduleChildTopUpAct.getExpiryDate();
		String gracePeriodIEndDate = scheduleChildTopUpAct.getGracePeriodIEndDate();
		String validityDate = scheduleChildTopUpAct.getValidityDate();

		if(childMsisdn != null) {
			MSISDNType msisdn = new MSISDNType();
			msisdn.setMSISDNType(String.valueOf(childMsisdn));
			request.setMSISDN(msisdn);
		}

		if(topUpAmount != null) {
			BalanceType balType = new BalanceType();
			balType.setBalanceType(topUpAmount);
			request.setAmountToCredit(balType);
		}

		String reason=  SMFAgentConstants.DEFAULT_CUG_CHILD_SPECIAL_TOPUP_REASON + " from parent msisdn " + 
						parentMsisdn + " of groupId " + custGroupId;

		ReasonType reasonType = new ReasonType();
		reasonType.setReasonType(reason);
		request.setReason(reasonType);

		if(expiryDate != null && !("".equals(expiryDate))) {
			DDMONYYYYFormat newExpiryDate = new DDMONYYYYFormat();
			newExpiryDate.setDDMONYYYYFormat(expiryDate);
			request.setNewExpiryDate(newExpiryDate);
		}

		if(gracePeriodIEndDate != null && !("".equals(gracePeriodIEndDate))) {
			DDMONYYYYFormat newGracePeriodIEndDate = new DDMONYYYYFormat();
			newGracePeriodIEndDate.setDDMONYYYYFormat(gracePeriodIEndDate);
			request.setNewGracePeriodIEndDate(newGracePeriodIEndDate);
		}

		if(validityDate != null && !("".equals(validityDate))) {
			DDMONYYYYFormat newValidityDate = new DDMONYYYYFormat();
			newValidityDate.setDDMONYYYYFormat(validityDate);
			request.setNewValidityDate(newValidityDate);
		}

		requestE.setSpecialTopUpRequest(request);

		return requestE;
	}

	/**
	 * @return
	 */
	private static TrackingMessageHeaderType setIBAHeader() {

		TrackingMessageHeaderType headerType = new TrackingMessageHeaderType();
		CarrierIdType             carrierId  = new CarrierIdType();
		MessageIdType messageIdType = new MessageIdType();
		UserIdType userId = new UserIdType();

		carrierId.setCarrierIdType(networkId);
		headerType.setCarrierId(carrierId);

		headerType.setMessageDateTimeStamp(Calendar.getInstance());

		messageIdType.setMessageIdType(new Date().getTime() + "");
		headerType.setMessageId(messageIdType);

		userId.setUserIdType(userName);
		headerType.setUserId(userId);

		return headerType;
	}

	public static ScheduleTopUpActs doScheduleTopupForChildMsisdns(ScheduleTopUpActs scheduleCUGTopUpdata) {

		if(scheduleCUGTopUpdata != null && 
				scheduleCUGTopUpdata.getGroupTopupActs() != null && 
				scheduleCUGTopUpdata.getGroupTopupActs().size() > 0) {
			for(GroupTopUpAct groupTopUpAct : scheduleCUGTopUpdata.getGroupTopupActs()) {
//				need to check this with partha
				if(groupTopUpAct != null && groupTopUpAct.getParentMsisdn() != null) {
					doScheduleTopupForChildMsisdns(groupTopUpAct);
				}
			}
		}
		return scheduleCUGTopUpdata;
	}

	private static void doScheduleTopupForChildMsisdns(final GroupTopUpAct groupTopupAct) {

		if(groupTopupAct != null && 
				groupTopupAct.getChildTopUpActs() != null && 
				groupTopupAct.getChildTopUpActs().size() > 0) {
			//final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
			//final ThreadPoolExecutor tpExecutor = new ThreadPoolExecutor(intThreadPoolSize, intThreadPoolSize, 100000, TimeUnit.SECONDS, queue);
		
//			calling for each child 
			for(final ChildTopUpAccount childTopupAct : groupTopupAct.getChildTopUpActs()) {
				//synchronized (childTopupAct) {
					//tpExecutor.execute(new Thread(){	       	  
						//public void run(){
							if(childTopupAct != null && childTopupAct.getMsisdn() != null) {
								if(doSpecialTopupForChildMsisdn(childTopupAct, groupTopupAct.getParentMsisdn(), groupTopupAct.getCustGroupId())) {
									groupTopupAct.getSuccess_child_msisdn_list().add(childTopupAct.getMsisdn());
								} else {
									groupTopupAct.getFailure_child_msisdn_list().add(childTopupAct.getMsisdn());
									groupTopupAct.getFailure_child_msisdn_topup_list().add(childTopupAct.getTopUpAmount());
								}
						//	}
					//	}
				//	});
				}// end of if loop
			}// end of for loop
			//tpExecutor.shutdown();
			// Wait until all threads are finish
			//while (!tpExecutor.isTerminated());
		}
	}

	/*private static void doScheduleTopupForChildMsisdns(GroupTopUpAct groupTopupAct) {

		if(groupTopupAct != null && 
				groupTopupAct.getChildTopUpActs() != null && 
				groupTopupAct.getChildTopUpActs().size() > 0) {
			for(ChildTopUpAccount childTopupAct : groupTopupAct.getChildTopUpActs()) {
				if(childTopupAct != null && childTopupAct.getMsisdn() != null) {
					if(doSpecialTopupForChildMsisdn(childTopupAct)) {
						groupTopupAct.getSuccess_child_msisdn_list().add(childTopupAct.getMsisdn());
					} else {
						groupTopupAct.getFailure_child_msisdn_list().add(childTopupAct.getMsisdn());
					}
				}
			}
		}
	}*/

	private static boolean doSpecialTopupForChildMsisdn(ChildTopUpAccount scheduleChildTopUpAct, 
			Long parentMsisdn, Long custGroupId) {
		boolean returnValue = false;

		Long childMsisdn = scheduleChildTopUpAct.getMsisdn();

		if(childMsisdn != null) {

			if(logger.isDebugEnabled()) {
				logger.debug( "InvokeService for SpecialTopup to Child Msisdn:" + childMsisdn);
			}

			Long startTime  = System.currentTimeMillis();

			IBAWebserviceClient ibaclient = new IBAWebserviceClient();
			TrackingMessageHeaderType headerType = null;
			SpecialTopUpRequestE requestE   = null;

			try{
				headerType = setIBAHeader();
				requestE   = setSpecialTopUpReqest(scheduleChildTopUpAct, parentMsisdn, custGroupId);

				SpecialTopUpResponse response = ibaclient.invokeSpecialTopUp(requestE, headerType);

				if (response != null) {
					logger.info( "Response success for child MSISDN[" + childMsisdn + "]");
					returnValue = true;

				} else { // for exceptions
					logger.error( "Response null(may be communication error) for child MSISDN[" + childMsisdn + "]");
					returnValue = false;
				}
			}catch(Exception e){
				logger.error( "Exception occured while processing Topup to child MSISDN["+ childMsisdn + "]");
				logger.error( "Exception \n" + Utilities.getStackTrace(e));
				returnValue = false;
			}
			if(returnValue) {
				logger.info("SpecialTopup for ChildMsisdn success"+(int) (System.currentTimeMillis() - startTime)+" ms");
			} else {
				logger.info("SpecialTopup for ChildMsisdn failure"+(int) (System.currentTimeMillis() - startTime)+" ms");
			}
		} else {
			logger.info( "child MSISDN is NULL");
			returnValue = false;
		}

		return returnValue;
	}

}