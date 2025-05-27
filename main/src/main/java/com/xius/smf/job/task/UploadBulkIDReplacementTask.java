package com.xius.smf.job.task;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.domaindata.BulkIdReplaceDetailsActs;
import com.xius.smf.domaindata.UpdateDummySIMSTxData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.GetDummySimDetRefCursorData;
import com.xius.smf.job.service.UploadDummySIMSThread;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class UploadBulkIDReplacementTask {
	/**
	 *  if at least one Updation of BulkSim Replacement Info failed then this boolean value becomes false.
	 *  default is true;
	 */
	public static boolean isAllActivationsDone = true;
	static Logger logger = LogManager.getLogger("UploadBulkIDReplacementTask");
	public void doJob() {
		do{

			long startTime = System.currentTimeMillis();
			//step1: call to get light weight transId and its associated sims 
			BulkIdReplaceDetailsActs domainData = callDBToGetBulkIdReplaceDetailsRecords();
			String maxRetrysStr =InitiateAll.getSMFProps().getProperty( "UPLOAD_DUMMY_SIMS_RETRY_MAX");
			int maxRetrys = 1;
			if( Utilities.isNull( maxRetrysStr ) == false ) {
				try {
					maxRetrys = Integer.parseInt( maxRetrysStr );
				} catch(Exception e) {

					logger.error( "Exception while parsing property UPLOAD_DUMMY_SIMS_RETRY_MAX. so taking default value 1" );
				}
			} else {
				logger.info( "Property UPLOAD_DUMMY_SIMS_RETRY_MAX is null. so taking default value 1");
			}
			// Step2: Implementing ThreadPool
			if( domainData != null && domainData.getPo_error_code() == 0 && 
					domainData.getRefcursData() != null && domainData.getRefcursData().size() > 0 
					) {

				domainData.setPo_retry_count(domainData.getPo_retry_count());
				if( domainData.getPo_retry_count() < maxRetrys ) {

					// Call for Thread pooling
					startThreadPool(domainData.getPio_trans_num(),domainData);

					// Step3: Update transaction status.

					updateTxStatus( domainData.getPio_trans_num(), null , null );

				} else {
					logger.error("### callDBToGetBulkIdReplaceDetailsRecords failed with RetrayCounter reached its max ");
					updateTxStatus( domainData.getPio_trans_num(), SMFAgentConstants.COMPLETED , SMFAgentConstants.TX_STATUS_FAILED_AFTER_MAX_RETRYS + maxRetrys  );
				}

			} else {
				logger.error("### callDBToGetBulkIdReplaceDetailsRecords failed with error code : " + domainData.getPo_error_code() + "\t: Error Msg : " + domainData.getPo_error_mesg());
				break;
			}

			logger.info("**** **** Total Time taken for Upload BulkID replacements (Tx No: "+ domainData.getPio_trans_num()+") in (milli secons): " + (System.currentTimeMillis() - startTime)  );
		}while(true);
	} //end of method execute

	private BulkIdReplaceDetailsActs callDBToGetBulkIdReplaceDetailsRecords() {
		long startTime = System.currentTimeMillis();
		BulkIdReplaceDetailsActs domainData = new BulkIdReplaceDetailsActs();
		logger.info(">>> Calling Bulk ID Replacement - Light weight get method>>>");
		try{
			/**
			 * calling db proc
			 */
			com.xius.smf.utils.ServiceUtils._executeStoredProcedure("pro_get_upload_dummysim_dtls", domainData, domainData);
		} catch (SMFAgentException e) {
			logger.error( "Exception in pro_get_upload_dummysim_dtls proc \n"+Utilities.getStackTrace(e));
		}
		logger.info( "Error Code from pro_get_upload_dummysim_dtls ==>"+domainData.getPo_error_code());
		logger.info( "Error desc from pro_get_upload_dummysim_dtls ==>"+domainData.getPo_error_mesg());

		logger.info("**** **** Time taken for callDBToGetBulkIdReplaceDetailsRecords in (milli secons): " + (System.currentTimeMillis() - startTime)  );

		return domainData;

	}


	public void startThreadPool(String trans_num, BulkIdReplaceDetailsActs domainData) {
		logger.info(">>> Starting ThreadPool >>>");
		List<GetDummySimDetRefCursorData> txDataList = domainData.getRefcursData();
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor tpExecutor;

		String maxThreadsStr = InitiateAll.getSMFProps().getProperty( "UPLOAD_DUMMY_SIMS_MAX_THREDS_IN_POOL");
		int maxThreads = 5;
		if( Utilities.isNull( maxThreadsStr ) == false ) {

			try {

				maxThreads = Integer.parseInt( maxThreadsStr );
			} catch(Exception e) {

				logger.error( "Exception while parsing property UPLOAD_DUMMY_SIMS_MAX_THREDS_IN_POOL. so taking default value 5" );
			}
		} else {
			logger.info( "Property UPLOAD_DUMMY_SIMS_MAX_THREDS_IN_POOL is null. so taking default value 5 ");
		}

		long startTimeTotal = System.currentTimeMillis();
		tpExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		UploadDummySIMSThread worker = null;
		for(final GetDummySimDetRefCursorData txItem:  txDataList) {
			if( null != txItem ) {
				if(logger.isInfoEnabled())
					logger.info( "Starting process (get from DB, xbus invocation, status update) SIM :" + txItem.getSim_serial_num() );

				worker = new UploadDummySIMSThread( trans_num, txItem.getSim_serial_num() );
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
		logger.info( "<<<### ### ###>>>Total Time taken for Processing Upload DummySIMS (Count: "+ txDataList.size() +") : " + totalTime );
	}
	/**
	 * TODO: need to change as per new proc
	 * 
	 * @param txNumber
	 * @param status
	 * @param remarks
	 */
	private void updateTxStatus(String txNumber, String txstatus, String remarks ) {

		logger.info(">>> updating transaction stauts for txNumber: " + txNumber + " status : " + txstatus + " remarks : " + remarks );
		UpdateDummySIMSTxData domainData = new UpdateDummySIMSTxData();
		domainData.setPi_tx_number( txNumber );
		domainData.setPi_tx_status( txstatus );
		domainData.setPi_remarks( remarks );

		SPFactory spFactory = null;
		try {

			spFactory = ServiceUtils.executeSPWithOutCommit("update_upload_dummysim_dtls", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error("SMFAgentException in update_upload_dummysim_dtls \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();

		if (logger.isInfoEnabled()) {
			logger.info("Error Code ==>" + errCode);
		}

		Utilities.commitOrRollback(spFactory, errCode);
	}
}