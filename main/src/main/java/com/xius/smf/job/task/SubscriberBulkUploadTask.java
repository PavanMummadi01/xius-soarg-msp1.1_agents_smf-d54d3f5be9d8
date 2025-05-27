package com.xius.smf.job.task;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.smf.ftp.FTPFactory;
import com.xius.smf.ftp.FTPProxy;
import com.xius.smf.ftp.FTPProxy.UploadType;
import com.xius.smf.job.service.PersonalDetailsUpload;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class SubscriberBulkUploadTask {

	static Logger logger = LogManager.getLogger("SubscriberBulkUploadTask");

	/*
	 * from smfagent.properties value of BULK_UPLOAD_SUBSCRIBER_XBUS_OR_DB
	 * 1=call xBus for Upload 
	 * 2=call DB for Upload
	 * any value other than '1' or '2', default will be '1' 
	 */
	static final String UPLOAD_API_XBUS_CALL="1";
	static final String UPLOAD_API_DB_CALL="2";
	
	static String uploadAPICall=UPLOAD_API_XBUS_CALL;
	
	
	static {
		
		uploadAPICall = InitiateAll.getSMFProps().getProperty( "BULK_UPLOAD_SUBSCRIBER_XBUS_OR_DB");
		
		if ( !(UPLOAD_API_XBUS_CALL.equals(uploadAPICall) ||
				UPLOAD_API_DB_CALL.equals(uploadAPICall))) {
			logger.error( "------- FTP Bulk Subscriber Upload: 'BULK_UPLOAD_SUBSCRIBER_XBUS_OR_DB' Configured Property value:" + uploadAPICall);
			logger.error( "------- FTP Bulk Subscriber Upload: 'BULK_UPLOAD_SUBSCRIBER_XBUS_OR_DB' Property value should be either of 1 or 2---------");
			logger.error( "------- FTP Bulk Subscriber Upload: Setting default 'BULK_UPLOAD_SUBSCRIBER_XBUS_OR_DB' Property value as:" + UPLOAD_API_XBUS_CALL);
			uploadAPICall=UPLOAD_API_XBUS_CALL;
		}
	}
	
	public static void doJob() {

		long startTime = System.currentTimeMillis();
		
		if( logger.isDebugEnabled() ) {

			logger.debug( "*** Invoking SubscriberBulkUploadTask");
		}

		List<String> validLines = null;
		String txId  = null;
		List<String> lines = null;
		String ftpFileName = null;

		FTPProxy ftpProxy = null;
		PersonalDetailsUpload pdu = null;

		try {

			ftpProxy = FTPFactory.getInstance();

			// connecting to FTP
			if( ftpProxy.connect() ) {

				if(ftpProxy.checkLocalDirectories() && ftpProxy.checkFTPDirectories(ftpProxy.getFTPClientInstance())) {

					//logger.log(BCGLevel.DEBUG,"#### Other-ftpClient: "+ ftpProxy.getFTPClientInstance() );
					// down loading form FTP
					while(ftpProxy.download()) {

						ftpFileName = ftpProxy.getDownloadFile();
						logger.debug("ftpFileName: " + ftpFileName);
						// transforming files to list of lines ( Strings)
						if( Utilities.isNotEmpty(ftpFileName)) {

							String userId = ftpProxy.getUserIdFromFileName(ftpFileName);
							logger.debug("userId: " + userId);
							if(Utilities.isNotEmpty(userId)) {

								pdu = new PersonalDetailsUpload(userId);

								// for time being we are processing single file at a time
								lines = pdu.transform(ftpFileName, ftpProxy);

								//validating lines
								if( null != lines && lines.size() > 0 ) {

									validLines = pdu.doValidations( lines, ftpFileName, ftpProxy);

									//Invoking xBus
									if( null != validLines && validLines.size() > 0 ) {

										if(UPLOAD_API_XBUS_CALL.equals(uploadAPICall)) {
											txId = pdu.invokeXBus( validLines );
										} else if(UPLOAD_API_DB_CALL.equals(uploadAPICall)) {
											txId = pdu.callDB( validLines );
										}

										if( Utilities.isNotEmpty( txId )) {

											/*
											 * Write valid line to SuccessFiles folder, 
											 * Delete from ProcessingFiles folder,
											 * Log information to AuditFiles folder.
											 */
											logger.debug("Got Success transaction id " + txId); 
											//String logContent = "Got Success transaction id " + txId; 
											String logContent = null;
											if(Utilities.isEmpty(pdu.getBadFileName())) {
												logContent = SMFAgentConstants.SUCCESS + " - " + txId;
											} else {
												logContent = SMFAgentConstants.PARTIAL + " - " + txId;
											}
											ftpProxy.logToAuditFile(ftpProxy.getFTPClientInstance(), ftpFileName, logContent);
											if(ftpProxy.upload( UploadType.SUCCESS_FILES, pdu.getSuccessFileName(), validLines) ) {

												logger.debug("FTP Upload succeeded for Success file:" + pdu.getSuccessFileName());
											} else {
												logger.debug("FTP Upload falied for Success file:" + pdu.getSuccessFileName());
											}
											ftpProxy.deleteFTPFileFromProcessing(ftpProxy.getFTPClientInstance(), ftpFileName);
											ftpProxy.deleteLocalFile(ftpFileName);
										} else {
											//logger.log(BCGLevel.DEBUG,"Empty Tranx Id from XBUS from step 4, So writing valid lines to BadFiles folder's file:" + pdu.getSuccessFileName());
											/*
											 * Write valid line to BadFiles folder, 
											 * Delete from ProcessingFiles folder,
											 * Log information to AuditFiles folder.
											 */
											String logContent = null;
											if(UPLOAD_API_XBUS_CALL.equals(uploadAPICall)) {
												logger.debug("Empty Tranx Id from XBUS from step 4, So writing valid lines to BadFiles folder's file:" + pdu.getSuccessFileName());
												logContent = SMFAgentConstants.FAILURE + " - " + "Empty Tranx Id from XBUS";
											} else if(UPLOAD_API_DB_CALL.equals(uploadAPICall)) {
												logger.debug("Empty Tranx Id from DB from step 4, So writing valid lines to BadFiles folder's file:" + pdu.getSuccessFileName());
												logContent = SMFAgentConstants.FAILURE + " - " + "Empty Tranx Id from DB";
											}
											
											//String logContent = SMFAgentConstants.FAILURE + " - ";
											ftpProxy.logToAuditFile(ftpProxy.getFTPClientInstance(), ftpFileName, logContent);
											if(ftpProxy.upload( UploadType.BAD_FILES, pdu.getSuccessFileName(), validLines)) {
												logger.debug("FTP Upload succeeded for Failed file:" + pdu.getSuccessFileName());
											} else {
												logger.debug("FTP Upload falied for Failed file:" + pdu.getSuccessFileName());
											}
											ftpProxy.deleteFTPFileFromProcessing(ftpProxy.getFTPClientInstance(), ftpFileName);
											ftpProxy.deleteLocalFile(ftpFileName);
											
											/*if( logger.isInfoEnabled() ) {
												logTimeIntervals(ftpProxy, pdu);
											}*/
										}
									} else {
										logger.debug("Empty Valid Lines  from step 3");

										/*
										 * Delete from ProcessingFiles folder,
										 * Log information to AuditFiles folder.
										 */
										String logContent = SMFAgentConstants.FAILURE + " - " + "Empty Valid Lines";
										//String logContent = SMFAgentConstants.FAILURE + " - ";
										ftpProxy.logToAuditFile(ftpProxy.getFTPClientInstance(), ftpFileName, logContent);
										ftpProxy.deleteFTPFileFromProcessing(ftpProxy.getFTPClientInstance(), ftpFileName);
										ftpProxy.deleteLocalFile(ftpFileName);

										/*if( logger.isInfoEnabled() ) {
											logTimeIntervals(ftpProxy, pdu);
										}*/
									}
								} else {
									logger.debug("Empty read lines  from step 2");
									/*
									 * Delete from BadFiles folder,
									 * Log information to AuditFiles folder.
									 */
									//String logContent = "Empty lines"; 
									String logContent = SMFAgentConstants.FAILURE + " - " + "Empty lines";
									ftpProxy.moveToBadFilesAndLog(ftpProxy.getFTPClientInstance(), ftpFileName, logContent);
									ftpProxy.deleteLocalFile(ftpFileName);

									/*if( logger.isInfoEnabled() ) {
										logTimeIntervals(ftpProxy, pdu);
									}*/
								}
							} else {
								logger.debug("Invalid File name:" + ftpFileName + ", format should be <USERID>" + ftpProxy.getUserIdSepChar() + "<TimeStamp>.txt or <USERID>" + ftpProxy.getUserIdSepChar() + "<TimeStamp>.csv");
								/*
								 * Delete from BadFiles folder,
								 * Log information to AuditFiles folder.
								 */
								String logContent = SMFAgentConstants.FAILURE + " - " + "Invalid File name, format should be <USERID>" + ftpProxy.getUserIdSepChar() + "<TimeStamp>.txt or <USERID>" + ftpProxy.getUserIdSepChar() + "<TimeStamp>.csv";
								//String logContent = SMFAgentConstants.FAILURE + " - ";
								ftpProxy.moveToBadFilesAndLog(ftpProxy.getFTPClientInstance(), ftpFileName, logContent);
								ftpProxy.deleteLocalFile(ftpFileName);

								/*if( logger.isInfoEnabled() ) {
									logTimeIntervals(ftpProxy, pdu);
								}*/
							}

						} else {
							logger.debug("Downloaded file name found as Empty");
						}
					}
				} else {
					logger.debug("All predefined(configured) FTP/Local directories does not exists.... ");
					/*if( logger.isInfoEnabled() ) {
						logTimeIntervals(ftpProxy, pdu);
					}*/
				}
			} else {
				logger.debug("FTP connection failure.... ");
				
				/*if( logger.isInfoEnabled() ) {
					logTimeIntervals(ftpProxy, pdu);
				}*/
			}

		} catch (Exception e) {
			logger.error( "Exception in SubscriberBulkUploadTask " + Utilities.getStackTrace( e ));
			
			/*if( logger.isInfoEnabled() ) {
				logTimeIntervals(ftpProxy, pdu);
			}*/
		} finally {

			// Disconnecting FTP
			if(ftpProxy != null) {
				if(ftpProxy.isConnected()){
					ftpProxy.disconnect();
				}
				//ftpProxy = null;
			}
		}

	}

	/*private static String getUserIdFromFileName(String ftpFileName, String userIdSeperator) {
		String userId = null;

		int lastIndex = ftpFileName.lastIndexOf(userIdSeperator);
		if(lastIndex > 0) {
			userId = ftpFileName.substring(0, lastIndex);
		}
		return userId;
	}*/

	private static void logTimeIntervals(FTPProxy ftpProxy, PersonalDetailsUpload pdu ) {

		long ftpTime = 0;
		logger.debug("####### ####### Time Report (milli secons) ####### ####### ");
		logger.debug("Time taken to connect FTP : "+ ftpProxy.getConnectionTime() );
		logger.debug("Time taken to download FTP : "+ ftpProxy.getDownloadingTime() );
		ftpTime = ftpProxy.getConnectionTime() + ftpProxy.getDownloadingTime();
		long pduTime = 0;
		if( null != pdu ) {

			logger.debug("Time taken to transform file to list of lines: "+ pdu.getTransformTime() );
			logger.debug("Time taken to validate lines: "+ pdu.getValidationTime() );
			logger.debug("Time taken to invoke XBus: "+ pdu.getInvokeXbusTime() );

			pduTime = pdu.getTransformTime() + pdu.getValidationTime() + pdu.getInvokeXbusTime();
		} else {

			logger.debug("Time not logged due zero files from ftp or no ftp connection ");
		}
		logger.debug("Time taken to upload to FTP: "+ ftpProxy.getUploadTime() );

		ftpTime = ftpTime + ftpProxy.getUploadTime(); 
		logger.debug("**** **** Total Time taken : "+ (ftpTime + pduTime) );

		logger.debug("####### ####### ####### ####### ####### ####### ####### ");
	}

}
