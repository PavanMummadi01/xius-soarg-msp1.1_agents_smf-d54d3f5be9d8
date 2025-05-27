package com.xius.smf.job.service;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.si.messages.mvnoapi.common.ErrorData;
import net.bcgi.si.messages.mvnoapi.common.GenderType;
import net.bcgi.si.messages.mvnoapi.common.SecurityId;
import net.bcgi.si.messages.mvnoapi.common.ServiceContext;
import net.bcgi.si.messages.mvnoapi.common.StatusCode;
import net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse;
import net.bcgi.util.db.SPFactory;

import com.xius.smf.client.ws.XBusProvisiongAppClient;
import com.xius.smf.domaindata.DemographicCursorData;
import com.xius.smf.domaindata.DemographicDetailsData;
import com.xius.smf.domaindata.UpdateUploadDmgpStatusData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.task.UploadDemographicDetailsTask;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class UploadUpdateDmgpInfoThread implements Runnable {

	private Logger logger = LogManager.getLogger("UploadUpdateDmgpInfoThread");

	private String txNumber;
	private String sim;

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

	public UploadUpdateDmgpInfoThread(){

	}

	public UploadUpdateDmgpInfoThread(String txNumber, String sim){

		this.txNumber = txNumber;
		this.sim = sim;
	}

	public void run() {

		startUpdateDmgpInfoPrcocess();
	}

	public void startUpdateDmgpInfoPrcocess() {

		UpdateSubDemographicDetailsResponse response = null;
		StringBuffer xBusInvocationException = null;
		
		// Step 3.1: get entire upload SIMs info record from DB
		DemographicCursorData subDmgpInfo = getUploadUpdateDmgpInfo();
		
		// Step 3.2: invoke xBus for updateDemographicDetails
		if( null != subDmgpInfo ) {
			try {
				response = invokeXBus( subDmgpInfo );
			
			} catch (MalformedURLException e) {
	
				logger.error( "MalformedURLException while invokeXBus \n" + Utilities.getStackTrace(e));
				xBusInvocationException = new StringBuffer(  Utilities.getStackTrace(e) );
			} catch (RemoteException e) {
	
				logger.error( "RemoteException while invokeXBus \n" + Utilities.getStackTrace(e));
				xBusInvocationException = new StringBuffer( Utilities.getStackTrace(e) );
			} catch (ServiceException e) {
	
				logger.error( "ServiceException while invokeXBus \n" + Utilities.getStackTrace(e));
				xBusInvocationException = new StringBuffer(  Utilities.getStackTrace(e) );
			} catch (InstantiationException e) {
	
				logger.error( "InstantiationException while invokeXBus \n" + Utilities.getStackTrace(e));
				xBusInvocationException = new StringBuffer( Utilities.getStackTrace(e) );
			} catch (Exception e) {
	
				logger.error( "Exception while invokeXBus \n" + Utilities.getStackTrace(e));
				xBusInvocationException = new StringBuffer( Utilities.getStackTrace(e) );
			}
			
			// Step 3.3: update tx/sim status;
			if( null != response ) {

				UpdateUploadDmgpStatusData domainData = null;
				domainData = setMOSRequest( subDmgpInfo, response );
				updateDmgpInfoStatus(domainData);
				
			}else {
				
				logger.info("xBus resonse null for txNumber: " + txNumber + ", SIM : " + sim  );
				UpdateUploadDmgpStatusData domainData = new UpdateUploadDmgpStatusData();
				domainData.setPi_billing_status( SMFAgentConstants.FAILURE + "General Exception" );
				if( null != xBusInvocationException ) {
					domainData.setPi_billing_status( SMFAgentConstants.FAILURE + " - " + xBusInvocationException.toString());
				}
				updateDmgpInfoStatus(domainData);
				
				logger.info("xBus resonse is NULL for txNumber: " + txNumber + ", SIM : " + sim  );
			}
			
		} else {

			/**
			 * TODO: What happens here, Handle this if needed check whether to update Main transaction as FAILURE or Don't do anything.
			 */
			logger.info("No Record found for txNumber: " + txNumber + ", SIM : " + sim  );
		}
		
	}

	private DemographicCursorData getUploadUpdateDmgpInfo() {

		DemographicCursorData dmgpCursorData = null;
		long startTime = System.currentTimeMillis();
		logger.info(">>> Calling Fat Get to Update DMGP Info for SIM : " + sim + ", Tx Number: " + txNumber);

		DemographicDetailsData domainData = new DemographicDetailsData();
		domainData.setPio_transaction_no( txNumber );
		domainData.setPi_sim_no( sim );

		try {

			//invoke Stored Procedure.
			com.xius.smf.utils.ServiceUtils._executeStoredProcedure("pro_get_upload_sub_trans_dtls", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in pro_get_upload_sub_trans_dtls \n" + Utilities.getStackTrace(e));
		}

		logger.info( "Error Code from pro_get_upload_sub_trans_dtls ==>"+domainData.getPo_error_code());
		logger.info( "Error desc from pro_get_upload_sub_trans_dtls ==>"+domainData.getPo_error_desc());

		logger.info("**** **** Time taken for Fat Get for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		
		if(null != domainData.getPo_sub_trans_det_ref_cursor() && 
				domainData.getPo_sub_trans_det_ref_cursor().size() > 0 && 
				null != domainData.getPo_sub_trans_det_ref_cursor().get(0)) {
			dmgpCursorData = domainData.getPo_sub_trans_det_ref_cursor().get(0);
		}
		return dmgpCursorData;
	}

	private UpdateSubDemographicDetailsResponse invokeXBus(DemographicCursorData subDmgpInfo) 
		throws MalformedURLException, ServiceException, InstantiationException, RemoteException {

		long startTime = System.currentTimeMillis();

		logger.info(">>> invoking XBus to update subscriber demographic details for SIM : " + sim + ", Tx Number: " + txNumber);
		
		UpdateSubDemographicDetailsRequest request = new UpdateSubDemographicDetailsRequest();

		//printCursorData(subDmgpInfo);
		
		// Set required data to UpdateSubDemographicDetailsRequest
		if(Utilities.isNotEmpty(subDmgpInfo.getId_type())) {
			request.setIdType(subDmgpInfo.getId_type());
		}
		if(Utilities.isNotEmpty(subDmgpInfo.getId_no())) {
			request.setIdValue(subDmgpInfo.getId_no());
		}
		if(Utilities.isNotEmpty(subDmgpInfo.getSim())) {
			request.setIccId(subDmgpInfo.getSim().trim());
		}
		
		if(Utilities.isNotEmpty(subDmgpInfo.getGender())) {
			String gender = subDmgpInfo.getGender().trim();
			if("M".equalsIgnoreCase(gender))
			{
				request.setGender(GenderType.MALE);
			}
			else if("F".equalsIgnoreCase(gender))
			{
				request.setGender(GenderType.FEMALE);
			}
		}
		if(Utilities.isNotEmpty(subDmgpInfo.getDate_of_birth())) {
			request.setDob(subDmgpInfo.getDate_of_birth().trim());
		}

		request.setFirstName(subDmgpInfo.getFirst_name());
		request.setLastName(subDmgpInfo.getLast_name());
		request.setAddress1(subDmgpInfo.getFirst_address());
		if(Utilities.isNotEmpty(subDmgpInfo.getSecond_address()))	{
			request.setAddress2(subDmgpInfo.getSecond_address().trim());
		}
		request.setCity(subDmgpInfo.getCity());
		request.setState(subDmgpInfo.getState());
		request.setCountry(subDmgpInfo.getCountry());
		request.setPostal_code(subDmgpInfo.getPostcode());

		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);
		
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId(subDmgpInfo.getNetwork_id());  
		request.setServiceContext(serviceContext);

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName(subDmgpInfo.getUser_id());
		securityId.setUserAccountPassword(SMFAgentConstants.ACCOUNT_PASSWORD);	
		request.setSecurityId(securityId);    	        
		
		request.setNetworkName(subDmgpInfo.getNetwork_name());
		request.setUserType( subDmgpInfo.getUser_type());
		request.setUserId( subDmgpInfo.getUser_id());
		request.setNetworkId( subDmgpInfo.getNetwork_id());
		
		UpdateSubDemographicDetailsResponse response = null;
		
		XBusProvisiongAppClient xClient = null;
		

		xClient = new XBusProvisiongAppClient();
		
		response = xClient.updateSubDemographicDetails(request);
		
		logger.info("**** **** Time taken invokeXBus for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		
		return response;
	}
	
	/*private void printCursorData(DemographicCursorData subDmgpInfo) {
		
		logger.log(BCGLevel.INFO, "subDmgpInfo.getCity():" + subDmgpInfo.getCity());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getCountry():" + subDmgpInfo.getCountry());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getDate_of_birth():" + subDmgpInfo.getDate_of_birth());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getFirst_address():" + subDmgpInfo.getFirst_address());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getFirst_name():" + subDmgpInfo.getFirst_name());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getGender():" + subDmgpInfo.getGender());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getId_no():" + subDmgpInfo.getId_no());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getId_type():" + subDmgpInfo.getId_type());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getLast_name():" + subDmgpInfo.getLast_name());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getMsisdn():" + subDmgpInfo.getMsisdn());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getNetwork_id():" + subDmgpInfo.getNetwork_id());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getNetwork_name():" + subDmgpInfo.getNetwork_name());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getPostcode():" + subDmgpInfo.getPostcode());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getSecond_address():" + subDmgpInfo.getSecond_address());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getSim():" + subDmgpInfo.getSim());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getSimstatus():" + subDmgpInfo.getSimstatus());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getState():" + subDmgpInfo.getState());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getUser_id():" + subDmgpInfo.getUser_id());
		logger.log(BCGLevel.INFO, "subDmgpInfo.getUser_type():" + subDmgpInfo.getUser_type());
		
	}*/

	private void updateDmgpInfoStatus( UpdateUploadDmgpStatusData domainData ) {

		domainData.setPi_icc_num( sim );
		
		SPFactory spFactory = null;
		try {

			spFactory = ServiceUtils.executeSPWithOutCommit("update_sub_trans_details_proc", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in update_sub_trans_details_proc \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();
		String  errMessage   = domainData.getPo_error_desc();

		if (logger.isInfoEnabled()) {
			logger.info( "Error Code ==>" + errCode);
		}
		if (logger.isInfoEnabled()) {
			logger.info( "Error Message ==>" + errMessage);
		}

		Utilities.commitOrRollback(spFactory, errCode);
	}

	private UpdateUploadDmgpStatusData setMOSRequest( DemographicCursorData subDmgpInfo, UpdateSubDemographicDetailsResponse xBusResponse) {

		UpdateUploadDmgpStatusData domainData = null;
		if( null != xBusResponse ) {

			domainData = new UpdateUploadDmgpStatusData();
			
			/*
			private String pi_id_no;
			private String pi_id_type;
			private String pi_sim;
			private String pi_billing_status;
			private String pi_trans_id;
			private String pi_trans_status;
			private String pi_remarks; // Future Purpose
			private String po_error_desc; // Only for logging DB error Info
			*/
			
			domainData.setPi_network_id(Long.parseLong(subDmgpInfo.getNetwork_id()));
			domainData.setPi_trans_id(txNumber);
			domainData.setPi_icc_num( sim );
			domainData.setPi_id_no(subDmgpInfo.getId_no());
			domainData.setPi_id_type(subDmgpInfo.getId_type());
			
			logger.debug("xBus response Status : " + xBusResponse.getStatusCode() );

			if(  StatusCode.SUCCESS  == xBusResponse.getStatusCode() 
					|| StatusCode.WARNING  == xBusResponse.getStatusCode()) {
				
				domainData.setPi_billing_status( SMFAgentConstants.SUCCESS );
				

			} else if( StatusCode.ERROR == xBusResponse.getStatusCode() ) {

				ErrorData[] errorData = xBusResponse.getErrors();

				StringBuffer sb = new StringBuffer();
				sb.append( SMFAgentConstants.FAILURE );
				sb.append( " - " );

				if( null != errorData && errorData.length > 0 ) {
					boolean isAppendComma = false;
					for(ErrorData ed : errorData) {
						if(isAppendComma) {
							sb.append( "," );
						}
						sb.append( ed.getErrorMessage() );
						sb.append( "(" );
						sb.append( ed.getErrorCode() );
						sb.append( ")" );
						isAppendComma = true;
					}
				}

				logger.debug("***>>> Update Demographic Details : " + sb.toString() +" for SIM: " + sim + " tx Number : " + txNumber  );

				domainData.setPi_billing_status( sb.toString() );
				/**
				 *  if this flag set to false already then do nothing.
				 *  By default this flag is set to true
				 */
				//if( UploadDemographicDetailsTask.areAllTxActsUpdated ) {

				UploadDemographicDetailsTask.areAllTxActsUpdated = false;
				//} 
			}
		}

		return domainData;
	}
	
}
