package com.xius.smf.job.task;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.domaindata.DemographicCursorData;
import com.xius.smf.domaindata.DemographicDetailsData;
import com.xius.smf.domaindata.SubscriberDemographicDetails;
import com.xius.smf.domaindata.UpdateUploadDmgpTransStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.service.UploadUpdateDmgpInfoThread;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class UploadDemographicDetailsTask {

	/**
	 *  if at least one Updation of SIM(Subscriber) Demographic Info failed then this boolean value becomes false.
	 *  default is true;
	 */
	public static boolean areAllTxActsUpdated = true;
	static Logger logger = LogManager.getLogger("UploadDemographicDetailsTask");

	//private static BCGLogger logger = BCGLogger.getBCGLogger(this.getClass().getName());
	private static int maxThreadPoolSize = 5;
	private static int configuredRetryCount = 1;

	static {

		Properties smfProp = InitiateAll.getSMFProps();
		//String threadPoolSize=smfProp.getProperty(SMFAgentConstants.UPDATE_DMGP_INFO_MAX_THREADS_IN_POOL);
		String threadPoolSize = smfProp.getProperty("UPDATE_DMGP_INFO_MAX_THREADS_IN_POOL");

		if( Utilities.isNull( threadPoolSize ) == false ) {

			try {

				maxThreadPoolSize = Integer.parseInt(threadPoolSize);
			} catch(Exception e) {

				logger.error( "Exception while parsing property UPDATE_DMGP_INFO_MAX_THREADS_IN_POOL. so taking default value " + maxThreadPoolSize );
			}
		} else {
			logger.info( "Property UPDATE_DMGP_INFO_MAX_THREADS_IN_POOL is null. so taking default value " +  maxThreadPoolSize );
		}
		
		//just for safety adding this
		String maxRetrysStr =InitiateAll.getSMFProps().getProperty( "UPLOAD_DMGP_INFO_RETRY_MAX");
		
		if( Utilities.isNull( maxRetrysStr ) == false ) {

			try {

				configuredRetryCount = Integer.parseInt( maxRetrysStr );
			} catch(Exception e) {

				logger.error( "Exception while parsing property UPLOAD_DMGP_INFO_RETRY_MAX. so taking default value " + configuredRetryCount );
			}
		} else {
			logger.info( "Property UPLOAD_DMGP_INFO_RETRY_MAX is null. so taking default value " + configuredRetryCount );
		}

	}

	public void doJob() {

		long startTime = System.currentTimeMillis();

		if( logger.isDebugEnabled() ) {

			logger.debug("*** Invoking UploadDemographicDetailsTask");
		}

		processSecheduleUpdateDmgpDetails();

		logger.debug("**** **** Total Time for Upload Demographic Details taken in (milli secons): " + (System.currentTimeMillis() - startTime)  );
	}
	
	/**
	 * Step1: Get a Transaction with sims,
	 * Step2: Process UpdateDmptDetails for above information
	 */
	private void processSecheduleUpdateDmgpDetails() {
		
		do {
			
			long startTime = System.currentTimeMillis();
			// Step 1: Get the Transaction with Sims for Update Demographic Details 
			SubscriberDemographicDetails subDmgpDetailsActs = callDBGetDemographicTransaction();
			
			if( null != subDmgpDetailsActs && 
					subDmgpDetailsActs.getSubTransDmgpActs() != null &&
					subDmgpDetailsActs.getSubTransDmgpActs().size() > 0) {

				logger.info( ">>>>Retry Count : " + subDmgpDetailsActs.getRetryCount() );
				
				if(null != subDmgpDetailsActs.getRetryCount() && 
						subDmgpDetailsActs.getRetryCount().intValue() < configuredRetryCount) {
					
					logger.info( "Number of Subscribers to Update Demographic Details found : " + 
							subDmgpDetailsActs.getSubTransDmgpActs().size() );
					
					// Step 2: Start Thread Pool for above transaction
					startThreadPoolUpdateDmgpTxActs(subDmgpDetailsActs);
					
					// Step 3: Update transaction status.
					/**
					 * Here, call the DB Procedure for a transactionId then 
					 * DB will update the Transaction status based on SIMs statuses
					 * condn 1: If all "SUCCESS" then Transaction Status will be "COMPLETED".
					 * condn 2: If at least one is empty then DONT UPDATE the TRANSACTION status (i.e., Keep in "PENDING" status).
					 * condn 2: If all not empty and all may not in "SUCCESS" status then Transaction Status will be "COMPLETED".
					 */
					logger.info("Subscriber Demographic Info: Call DB Procedure for a transactionId: " + subDmgpDetailsActs.getTransId());
					updateTransactionStatus( subDmgpDetailsActs.getTransId(), null, null  );
				} else {
					/*
					 * Update the Transaction STATUS as COMPLETED and updated the remarks
					 */
					logger.error("### LightGet failed with RetrayCounter null / reached its max ");
					updateTransactionStatus( subDmgpDetailsActs.getTransId(), SMFAgentConstants.COMPLETED , SMFAgentConstants.TX_STATUS_FAILED_AFTER_MAX_RETRYS  );
				}
			} else {
				logger.info( "*** *** *** Found No Subscribers to Update Demographic Details");
				break;
			}
			
			logger.debug("**** **** Total Time for Upload Demographic Details (Tx No: "+ subDmgpDetailsActs.getTransId() +")taken in (milli secons): " + (System.currentTimeMillis() - startTime)  );
		} while(true); // Here provide appropriate condition
	}
	
	private void startThreadPoolUpdateDmgpTxActs(SubscriberDemographicDetails subDmgpDetailsActs) {

		logger.info(">>> Starting ThreadPool >>>");
		List<DemographicCursorData> txDataList = subDmgpDetailsActs.getSubTransDmgpActs();
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor tpExecutor;

		long startTimeTotal = System.currentTimeMillis();
		tpExecutor = new ThreadPoolExecutor(maxThreadPoolSize, maxThreadPoolSize, 100000, TimeUnit.SECONDS, queue);
		UploadUpdateDmgpInfoThread worker = null;

		for( DemographicCursorData txItem:  txDataList) {

			if( null != txItem ) {

				if(logger.isInfoEnabled())
					logger.info( "Starting Update Dmgp Info process (get from DB, call xbus invocation, txStatus update) for SIM :" + txItem.getSim() );

				//Create a worker of UploadUpdateDmgpInfoThread and execute()
				worker = new UploadUpdateDmgpInfoThread( subDmgpDetailsActs.getTransId(), txItem.getSim() );
				tpExecutor.execute(worker);
			} 
		}

		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		tpExecutor.shutdown();
		// Wait until all threads are finish
		while (!tpExecutor.isTerminated()) {

		}

		tpExecutor = null;
		long totalTime = System.currentTimeMillis() - startTimeTotal;
		logger.info( "<<<### ### ###>>>Total Time taken for Processing Update Dmgp Info for a transactionId: "+ subDmgpDetailsActs.getTransId() + " and its count: "+ txDataList.size() +" is: " + totalTime );
		
	}
	
	/*private SubscriberDemographicDetails getDemographicTransaction() {
		
		SubscriberDemographicDetails subDmgpDetailsActs = callDBGetDemographicTransaction();
		
		if( null != subDmgpDetailsActs && 
				subDmgpDetailsActs.getSubTransDmgpActs() != null &&
				subDmgpDetailsActs.getSubTransDmgpActs().size() > 0) {
			
			logger.log(BCGLevel.INFO, "Number of Subscribers to Update Demographic Details found : " + 
					subDmgpDetailsActs.getSubTransDmgpActs().size() );

		} else {
			
			logger.log(BCGLevel.INFO, "*** *** *** Found No Subscribers to Update Demographic Details");
			subDmgpDetailsActs = null;
		}
		
		return subDmgpDetailsActs;
	}*/
	
	private SubscriberDemographicDetails callDBGetDemographicTransaction() {

		logger.info( "Calling DB to get Least Demographic Transaction to Update Demographic Details");
				
		DemographicDetailsData domainData = new DemographicDetailsData();
		
		long startTime = System.currentTimeMillis();
		
		try {
			/**
			 * calling db proc using mosf
			 */
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_get_upload_sub_trans_dtls", domainData, domainData);

			Utilities.commitOrRollback(factory, domainData.getPo_error_code());
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code in pro_get_upload_sub_trans_dtls==>"+domainData.getPo_error_code());
			}

		} catch (SMFAgentException e) {
			logger.error( "Exception in callDBToGetDemographicDetailsRecords \n"+Utilities.getStackTrace(e));
		}
		if(logger.isDebugEnabled()) {
			logger.debug( "Logging pro_get_upload_sub_trans_dtls procedure values >>>>");
			//printGetScheduleGroupActs(domainData);
		}
		
		logger.info("Error Code from pro_get_upload_sub_trans_dtls ==>" + domainData.getPo_error_code());
		logger.info( "Error desc from pro_get_upload_sub_trans_dtls ==>" + domainData.getPo_error_desc());

		logger.info("**** **** Time taken for Light Get pro_get_upload_sub_trans_dtls in (milli secons): " + (System.currentTimeMillis() - startTime) );
		
		//Setting Data to DTO Object
		SubscriberDemographicDetails subDmgpTransactionActs = setSubscriberDmgpDetData(domainData);

		return subDmgpTransactionActs;

	}
	
	private SubscriberDemographicDetails setSubscriberDmgpDetData(DemographicDetailsData domainData) {
		SubscriberDemographicDetails subDemographicInfo = null;
		
		if(null != domainData) {
			subDemographicInfo = new SubscriberDemographicDetails();
			
			subDemographicInfo.setTransId(domainData.getPio_transaction_no());
			subDemographicInfo.setRetryCount(domainData.getPo_retry_cnt());
			
			if(null != domainData.getPo_sub_trans_det_ref_cursor() &&
					domainData.getPo_sub_trans_det_ref_cursor().size() > 0) {

				for(DemographicCursorData dmgpCursorDomainData : domainData.getPo_sub_trans_det_ref_cursor()) {
					subDemographicInfo.getSubTransDmgpActs().add(dmgpCursorDomainData);
				}
			}
			
			subDemographicInfo.setErrorCode(domainData.getPo_error_code());
			subDemographicInfo.setErrorMsg(domainData.getPo_error_desc());
			
		}
		
		return subDemographicInfo;
	}

	private void updateTransactionStatus(String txNumber, String status, String remarks ) {

		logger.info(">>> Started updating transaction status for txNumber: " + txNumber + " status : " + status + " remarks : " + remarks );
		
		UpdateUploadDmgpTransStatusData domainData = new UpdateUploadDmgpTransStatusData();
		
		domainData.setPi_transaction_no(txNumber);
		domainData.setPi_trans_status(status);
		domainData.setPi_remarks( remarks );

		SPFactory spFactory = null;
		try {

			spFactory = ServiceUtils.executeSPWithOutCommit("update_upload_sub_trans_dtls", domainData, domainData);
			
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in update_upload_sub_trans_dtls \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();

		if (logger.isInfoEnabled()) {
			
			logger.info( "Error Code from update_upload_sub_trans_dtls ==>" + domainData.getPo_error_code());
			logger.info( "Error desc from update_upload_sub_trans_dtls ==>" + domainData.getPo_error_desc());
		}

		Utilities.commitOrRollback(spFactory, errCode);
	}
}
