package com.xius.smf.job.service;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.si.messages.mvnoapi.common.ErrorData;
import net.bcgi.si.messages.mvnoapi.common.SecurityId;
import net.bcgi.si.messages.mvnoapi.common.ServiceContext;
import net.bcgi.si.messages.mvnoapi.common.StatusCode;
import net.bcgi.si.messages.mvnoapi.provisioning.AccountIdKeyType;
import net.bcgi.si.messages.mvnoapi.subscriber.AccountId;
import net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoRequest;
import net.bcgi.si.messages.mvnoapi.subscriber.UpdateSubscriberInfoResponse;
import net.bcgi.util.db.SPFactory;

import com.xius.smf.client.ws.XBusSubscriberAppClient;
import com.xius.smf.domaindata.BulkIdReplaceDetailsActs;
import com.xius.smf.domaindata.UpdateDummyIdData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.GetDummySimDetRefCursorData;
import com.xius.smf.job.task.UploadBulkIDReplacementTask;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;



public class UploadDummySIMSThread implements Runnable {
	private Logger logger = LogManager.getLogger("UploadDummySIMSThread");

	private String txNumber;
	private String sim;

	
	public void run() {

		startDummyUploadPrcocess();
	}

	public void startDummyUploadPrcocess() {
		UpdateSubscriberInfoResponse response = null;
		StringBuffer xBusInvocationException = null;
		
		// Step 1: get entire record of a particular SIM from DB
		GetDummySimDetRefCursorData uploadDummySIMInfo = getDetailRecInfo();

		// Step 2: invoke xBus for UpdateSubscriberInfo

		if( null != uploadDummySIMInfo ) {
			try {
				
				response = invokeXBusGet( uploadDummySIMInfo );
				
			}catch (Exception e) {
				logger.error("Exception while invokeXBusGet \n" + Utilities.getStackTrace(e));
				xBusInvocationException = new StringBuffer(  "FAILED - invokeXBusGet Error Code: ");
			}
		} else {

			logger.info("No Record found for txNumber: " + txNumber + ", SIM : " + sim  );
		}

		// Step 3: update tx/sim status;
		if( null != response && response.getStatusCode().toString().equalsIgnoreCase("SUCCESS")) {
			updateSIMStatus(response, uploadDummySIMInfo);
		}else if( null != response && response.getStatusCode().toString().equalsIgnoreCase("ERROR")) {
			logger.debug("***>>> xBus Response getting Error : " + sim + " tx Number : " + txNumber);
			updateSIMStatus(response, uploadDummySIMInfo);
		}else {
			logger.info("xBus resonse null for txNumber: " + txNumber + ", SIM : " + sim  );
			UpdateDummyIdData domainData = new UpdateDummyIdData();
			domainData.setPi_sim_no(uploadDummySIMInfo.getSim_serial_num());
			domainData.setPi_msisdn(uploadDummySIMInfo.getMsisdn());
			domainData.setPi_trans_status(uploadDummySIMInfo.getTxstatus());
			domainData.setPi_sim_status( SMFAgentConstants.FAILURE + " - General Exception" );
			if( null != xBusInvocationException ) {
				domainData.setPi_sim_status( SMFAgentConstants.FAILURE + " - " + xBusInvocationException.toString());
			}
			updateSIMStatus(domainData, uploadDummySIMInfo);
		}
	}

	private GetDummySimDetRefCursorData getDetailRecInfo() {

		long startTime = System.currentTimeMillis();
		logger.info(">>> Calling Fat Get for SIM : " + sim + ", Tx Number: " + txNumber);

		BulkIdReplaceDetailsActs domainData = new BulkIdReplaceDetailsActs();
		domainData.setPio_trans_num(txNumber );
		domainData.setPi_sim_num(sim);

		try {

			//invoke Stored Procedure.
			com.xius.smf.utils.ServiceUtils._executeStoredProcedure("pro_get_upload_dummysim_dtls", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in pro_get_upload_dummysim_dtls \n" + Utilities.getStackTrace(e));
		}

		logger.info( "Error Code from pro_get_upload_dummysim_dtls ==>"+domainData.getPo_error_code());
		logger.info("Error desc from pro_get_upload_dummysim_dtls ==>"+domainData.getPo_error_mesg());
		logger.info("**** **** Time taken for getDetailedRecInfo for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return domainData.getRefcursData().get(0);

	}

	private UpdateSubscriberInfoResponse invokeXBusGet(GetDummySimDetRefCursorData uploadDummySIMInfo) {
		
		// Invoke xBus UpdateSubscriberInfo API
		long startTime = System.currentTimeMillis();
		logger.info(">>> Calling invokeXBusGet for SIM : " + sim + ", Tx Number: " + txNumber);
		
		UpdateSubscriberInfoRequest request = new UpdateSubscriberInfoRequest();
		AccountId newAcctId = new AccountId();
		
		AccountId oldAcctId = new AccountId();
		
		
		if ( SMFAgentConstants.MYKAD_ID.equals( uploadDummySIMInfo.getId_type().toString() ) ) {
			newAcctId.setKeyType(AccountIdKeyType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadDummySIMInfo.getId_type().toString() )) {
			newAcctId.setKeyType(AccountIdKeyType.PASSPORT_NO);
		}

		if ( uploadDummySIMInfo.getId_type().toString() !=null) {
			newAcctId.setKeyType(AccountIdKeyType.PASSPORT_NO);
			newAcctId.setAccountIdkeyType( uploadDummySIMInfo.getId_type().toString());
		}
		
		newAcctId.setId( uploadDummySIMInfo.getId_val().trim());
		
		if (uploadDummySIMInfo.getDummy_id_type().toString() !=null ) {
			oldAcctId.setKeyType(AccountIdKeyType.PASSPORT_NO);
			oldAcctId.setAccountIdkeyType(uploadDummySIMInfo.getDummy_id_type().toString());
		} 
		
		if ( SMFAgentConstants.MYKAD_ID.equals( uploadDummySIMInfo.getDummy_id_type().toString() ) ) {
			oldAcctId.setKeyType(AccountIdKeyType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadDummySIMInfo.getDummy_id_type().toString() )) {
			oldAcctId.setKeyType(AccountIdKeyType.PASSPORT_NO);
		}
		oldAcctId.setId(uploadDummySIMInfo.getDummy_id_val());
		
		request.setOldAccountId(oldAcctId);
		request.setNewAccountId(newAcctId);
		request.setSimNumber( uploadDummySIMInfo.getSim_serial_num().trim());
		request.setNetworkName( uploadDummySIMInfo.getNetwork_name().trim() );
		
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId( uploadDummySIMInfo.getNetwork_id().toString() );
		request.setServiceContext( serviceContext );
		
		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName( uploadDummySIMInfo.getUser_id() );
		securityId.setUserAccountPassword( SMFAgentConstants.ACCOUNT_PASSWORD );
		request.setSecurityId(securityId);
		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);
		request.getSecurityId().setUserAccountName(uploadDummySIMInfo.getUser_id());
		
		UpdateSubscriberInfoResponse response = null;
		
		XBusSubscriberAppClient xClient = null;
		try {
			
			xClient = new XBusSubscriberAppClient();
		} catch (MalformedURLException e) {
			
			logger.error( "MalformedURLException in invokeXBusGet \n" + Utilities.getStackTrace(e));
		} catch (ServiceException e) {
			
			logger.error( "ServiceException in invokeXBusGet \n" + Utilities.getStackTrace(e) );
		} catch (InstantiationException e) {
			
			logger.error( "InstantiationException in invokeXBusGet \n" + Utilities.getStackTrace(e));
		}
		try {
			
			response = xClient.updateSubscriberInfo(request);
		} catch (RemoteException e) {
			
			logger.error( "RemoteException in invokeXBusGet \n" + Utilities.getStackTrace(e) );
		}
		
		logger.info("**** **** Time taken invokeXBus for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return response;
		
	}
	private void updateSIMStatus( UpdateDummyIdData  domainData, GetDummySimDetRefCursorData uploadDummyInfo ) {
		logger.info(">>> Calling updateSIMStatus for SIM : " + sim + ", Tx Number: " + txNumber);
		SPFactory spFactory = null;

		domainData.setPi_id_no( uploadDummyInfo.getId_val() );
		domainData.setPi_dummy_id_no(uploadDummyInfo.getDummy_id_val());
		domainData.setPi_network_id(uploadDummyInfo.getNetwork_id());
		if( null !=  uploadDummyInfo.getId_type() ) {

			domainData.setPi_id_type( uploadDummyInfo.getId_type().toString() );
		}
		domainData.setPi_trans_number( txNumber );
		domainData.setPi_trans_status(SMFAgentConstants.COMPLETED);

		/**
		 * invoke Stored Procedure.
		 */
		try {
			spFactory =  ServiceUtils.executeSPWithOutCommit( "dummyid_update", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in CLC_DUMMYID_REPLACE.dummyid_update \n" + Utilities.getStackTrace(e));
		}
		if( UploadBulkIDReplacementTask.isAllActivationsDone ) {

			UploadBulkIDReplacementTask.isAllActivationsDone = false;
		}

		if(logger.isInfoEnabled()) {

			logger.info( "Error Code ==>"+domainData.getPo_error_code());
		}
		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
	}
	private void updateSIMStatus( UpdateSubscriberInfoResponse  xBusResponse, GetDummySimDetRefCursorData uploadDummyInfo ) {

		UpdateDummyIdData domainData = null;
		if( null != xBusResponse ) {

			domainData = setMOSRequest( xBusResponse  );
			domainData.setPi_dummy_id_no(uploadDummyInfo.getDummy_id_val());
			domainData.setPi_id_no( uploadDummyInfo.getId_val() );
			domainData.setPi_network_id(uploadDummyInfo.getNetwork_id());
			if( null !=  uploadDummyInfo.getId_type() ) {

				domainData.setPi_id_type( uploadDummyInfo.getId_type().toString() );
			}
			domainData.setPi_trans_number( txNumber );
		}

		SPFactory spFactory = null;
		try {
			/*System.out.println(".UDPATESIMSTATUS....simNo.>>>>>"+domainData.getPi_sim_no());
			System.out.println(".UDPATESIMSTATUS....Id Type.>>>>>>"+domainData.getPi_id_type());
			System.out.println(".UPDATESIMSTATUS....Dummy ID value.>>>>"+domainData.getPi_dummy_id_no());
			System.out.println(".UDPATESIMSTATUS....Id value.>>>>>"+domainData.getPi_id_no());
			System.out.println(".UDPATESIMSTATUS....MSISDN.>>>>>"+domainData.getPi_msisdn());
			System.out.println(".UDPATESIMSTATUS....txNo.....>>>>>"+domainData.getPi_trans_number());
			System.out.println(".UDPATESIMSTATUS..sim status..>>>>"+domainData.getPi_sim_status());
			System.out.println(".UDPATESIMSTATUS..tx status..>>>>"+domainData.getPi_trans_status());*/
			spFactory = ServiceUtils.executeSPWithOutCommit("dummyid_update", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in CLC_DUMMYID_REPLACE.dummyid_update \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();

		if (logger.isInfoEnabled()) {
			logger.info("CLC_DUMMYID_REPLACE.dummyid_update Error Code ==>" + errCode);
		}

		Utilities.commitOrRollback(spFactory, errCode);
	}

	private UpdateDummyIdData setMOSRequest( UpdateSubscriberInfoResponse xBusResponse) {

		UpdateDummyIdData domainData = null;
		if( null != xBusResponse ) {

			domainData = new UpdateDummyIdData();
			domainData.setPi_sim_no(sim);

			logger.debug("xBus response Status : " + xBusResponse.getStatusCode() );

			if(  StatusCode.SUCCESS  == xBusResponse.getStatusCode() 
					|| StatusCode.WARNING  == xBusResponse.getStatusCode()) {


					domainData.setPi_sim_status(SMFAgentConstants.SUCCESS );
					domainData.setPi_msisdn(xBusResponse.getMsisdn());

					logger.debug("***>>> DummyID Replacement : " + SMFAgentConstants.SUCCESS +" for SIM: " + sim + " tx Number : " + txNumber  + " MSISDN : " + xBusResponse.getMsisdn() );

			} else if( StatusCode.ERROR == xBusResponse.getStatusCode() ) {

				ErrorData[] errorData = xBusResponse.getErrors();

				StringBuffer sb = new StringBuffer();
				sb.append( SMFAgentConstants.FAILURE );
				sb.append( " - " );

				if( null != errorData && errorData.length > 0 ) {

					for(ErrorData ed : errorData) {

						sb.append( ed.getErrorCode() );
						sb.append( ":" );
						//sb.append( ed.getErrorCode() );
						sb.append( ed.getErrorMessage() );
					}
				}

				logger.debug("***>>> DummySim replacement : " + sb.toString() +" for SIM: " + sim + " tx Number : " + txNumber  );

				domainData.setPi_sim_status(sb.toString());
				/**
				 *  if this flag set to false already then do nothing.
				 *  By default this flag is set to true
				 */
				if( UploadBulkIDReplacementTask.isAllActivationsDone ) {

					UploadBulkIDReplacementTask.isAllActivationsDone = false;
				}
			}
		}

		return domainData;
	}

	public String getTxNumber() {
		return txNumber;
	}

	public void setTxNumber(String txNumber) {
		this.txNumber = txNumber;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public UploadDummySIMSThread(){

	}

	public UploadDummySIMSThread(String txNumber, String sim){

		this.txNumber = txNumber;
		this.sim = sim;
	}
}
