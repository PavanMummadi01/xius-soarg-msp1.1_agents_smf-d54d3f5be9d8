package com.xius.smf.job.task;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.util.db.SPFactory;

import com.xius.smf.domaindata.GetUploadSIMSData;
import com.xius.smf.domaindata.UpdateUploadSIMSData;
import com.xius.smf.domaindata.UploadSIMSCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.service.UploadSIMSThread;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class UploadSIMSTask {
	static Logger logger = LogManager.getLogger("UploadSIMSTask");

	public void doJob() {

		do {

			logger.debug( "*** Invoking UploadSIMSTask");
			long startTime = System.currentTimeMillis();

			/**
			 *  if at least one SIM activation failed then this boolean value becomes false.
			 *  default is true;
			 */


			if( logger.isDebugEnabled() ) {

				logger.info("### >> Checking for pending trasactions from DB");
			}

			// Step1: call for light weight get from DB;
			GetUploadSIMSData domainData = getLightGet();


			String maxRetrysStr =InitiateAll.getSMFProps().getProperty( "UPLOAD_SIMS_RETRY_MAX");
			int maxRetrys = 1;
			if( Utilities.isNull( maxRetrysStr ) == false ) {

				try {

					maxRetrys = Integer.parseInt( maxRetrysStr );
				} catch(Exception e) {

					logger.error( "Exception while parsing property UPLOAD_SIMS_RETRY_MAX. so taking default value 1" );
				}
			} else {
				logger.info( "Property UPLOAD_SIMS_RETRY_MAX is null. so taking default value 1");
			}

			// Step2: Implement ThreadPool;


			if( domainData != null && domainData.getPo_error_code() == 0 ) {

				List<UploadSIMSCursorData> cursor = domainData.getCursor();
				if(  cursor != null && cursor.size() > 0 ) {

					UploadSIMSCursorData cursorItem = cursor.get(0);
					if( null !=  cursorItem ){ 

						logger.info("### >> Found pending trasactions from DB");
						if( null != domainData && domainData.getRetrayCounter() < maxRetrys ) {

							// Call for Thread pooling
							startThreadPool( domainData );


							// Step3: Update transaction status.

							updateTxStatus( cursorItem.getTxNumber(), null , null );
						} else {

							logger.info("### >> Skip process because retray counter reached max value : " + maxRetrys );
							updateTxStatus( cursorItem.getTxNumber(), SMFAgentConstants.COMPLETED , SMFAgentConstants.TX_STATUS_FAILED_AFTER_MAX_RETRYS + maxRetrys );
						}
					} else {

						logger.error("### No data found from LightGet");
					}

				} else {

					//TODO: Need A write a Call to Update tx status as "FAILED"

					logger.info("### No data from LightGet");
				}
			} else {

				logger.info("### No data from LightGet sP CLC_SIM_BULKUPLOAD.pro_get_upload_sim_dtls");
				break;
			}

			logger.info("**** **** Total Time taken for UploadSIMs ( Tx No: "+ domainData.getPo_txNumber() +")in (milli secons): " + (System.currentTimeMillis() - startTime)  );

		} while( true );

	}

	private void updateTxStatus(String txNumber, String status, String remarks ) {

		logger.info(">>> stated upadting transaction stauts for txNumber: " + txNumber + " status : " + status + " remarks : " + remarks );
		UpdateUploadSIMSData domainData = new UpdateUploadSIMSData();
		domainData.setPi_tx_number( txNumber );
		domainData.setPi_tx_status( status );
		domainData.setPi_remarks( remarks );

		SPFactory spFactory = null;
		try {

			spFactory = ServiceUtils.executeSPWithOutCommit("update_upload_sim_dtls", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in update_upload_sim_dtls \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();

		if (logger.isInfoEnabled()) {
			logger.info( "Error Code ==>" + errCode);
		}

		Utilities.commitOrRollback(spFactory, errCode);
	}

	public GetUploadSIMSData getLightGet(){

		long startTime = System.currentTimeMillis();
		GetUploadSIMSData domainData = new GetUploadSIMSData();
		logger.info(">>> Calling Light Get >>>");
		try {

			//invoke Stored Procedure.
			com.xius.smf.utils.ServiceUtils._executeStoredProcedure("pro_get_upload_sim_dtls", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in pro_get_upload_sim_dtls \n" + Utilities.getStackTrace(e));
		}

		logger.info( "Error Code from pro_get_upload_sim_dtls ==>"+domainData.getPo_error_code());
		logger.info( "Error desc from pro_get_upload_sim_dtls ==>"+domainData.getPo_error_desc());

		logger.info("**** **** Time taken for LightGet in (milli secons): " + (System.currentTimeMillis() - startTime)  );
		return domainData;
	}

	public void startThreadPool(GetUploadSIMSData domainData) {

		logger.info(">>> Starting ThreadPool >>>");
		List<UploadSIMSCursorData> txDataList = domainData.getCursor();
		final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(100000);
		ThreadPoolExecutor tpExecutor;

		String maxThreadsStr = InitiateAll.getSMFProps().getProperty( "UPLOAD_SIMS_MAX_THREDS_IN_POOL");
		int maxThreads = 5;
		if( Utilities.isNull( maxThreadsStr ) == false ) {

			try {

				maxThreads = Integer.parseInt( maxThreadsStr );
			} catch(Exception e) {

				logger.error( "Exception while parsing property UPLOAD_SIMS_MAX_THREDS_IN_POOL. so taking default value 5" );
			}
		} else {
			logger.info( "Property UPLOAD_SIMS_MAX_THREDS_IN_POOL is null. so taking default value 5 ");
		}

		long startTimeTotal = System.currentTimeMillis();
		tpExecutor = new ThreadPoolExecutor(maxThreads, maxThreads, 100000, TimeUnit.SECONDS, queue);
		UploadSIMSThread worker = null;

		for( UploadSIMSCursorData txItem:  txDataList) {

			if( null != txItem ) {

				if(logger.isInfoEnabled())
					logger.info( "Starting process (get from DB, xbus invocation, status update) SIM :" + txItem.getSIM() );

				worker = new UploadSIMSThread( domainData.getPo_txNumber(), txItem.getSIM() );
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
		logger.info( "<<<### ### ###>>>Total Time taken for Processing UploadSIMS (Count: "+ txDataList.size() +") : " + totalTime );
	}
}
