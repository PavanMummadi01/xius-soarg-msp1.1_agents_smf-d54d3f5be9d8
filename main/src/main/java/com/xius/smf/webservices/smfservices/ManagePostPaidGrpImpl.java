package com.xius.smf.webservices.smfservices;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.AccountManagement_xsd.GrpDtlsType;
import com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpRequest;
import com.xius.billing.AccountManagement_xsd.ManagePostPaidGrpResponse;
import com.xius.smf.client.invoker.ManagePostPaidGrpInvoker;
import com.xius.smf.domaindata.BulkSIMSUploadCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse;
import net.bcgi.util.db.SPFactory;


public class ManagePostPaidGrpImpl {
	private  static final Logger logger = LogManager.getLogger(ManagePostPaidGrpImpl.class.getSimpleName());

public 	ManagePostPaidGrpResponse managePostPaidGrp(PostpaidActivationResponse xbresponse , BulkSIMSUploadCursorData dbData ){
		logger.info("managePostPaidGrp invoked from BulkUploadSIMSThread >>>>>");
		HeaderDetails headerDetails =null;
		ManagePostPaidGrpRequest ibaRequest=null;
		ManagePostPaidGrpResponse response=null;
		GrpDtlsType[] dtlType=null;
		ManagePostPaidGrpInvoker invoker=null;
		
		
		try{
			dtlType=new GrpDtlsType[1];
			invoker= new ManagePostPaidGrpInvoker();
			headerDetails=new HeaderDetails();
			ibaRequest= new ManagePostPaidGrpRequest();
			response= new ManagePostPaidGrpResponse();
			
			if ( dbData.getId_type().toString() !=null ) {
				ibaRequest.setIdValue( dbData.getId_no().trim() );
				}
			
			logger.info("ManagePostPaidGrpImpl  --IdValue :"+dbData.getId_no().trim());
			
			if(xbresponse.getAccountId()!=null){
				dtlType[0].setAccountId(xbresponse.getAccountId());
			
				logger.info("ManagePostPaidGrpImpl  --AccountId :"+xbresponse.getAccountId());
			}
			
			if(xbresponse.getStatusFlag()!=null)
				ibaRequest.setFlag(xbresponse.getStatusFlag());
			
			if((dbData.getIs_main_line()!=null))
				if(dbData.getIs_main_line().equalsIgnoreCase("Y"))
					dtlType[0].setMainSubFlag("MAINLINE");
			else dtlType[0].setMainSubFlag("SUBLINE");
			
			ibaRequest.setGrpListDtls(dtlType);
			
					/*
					 * HeaderDeatils
					 */
			if(dbData.getUser_id()!=null)
				headerDetails.setLoginID(dbData.getUser_id());
			
			if(dbData.getNetwork_id()!=null)
				headerDetails.setNetworkID(dbData.getNetwork_id());
			
			headerDetails.setPassword(SMFAgentConstants.ACCOUNT_PASSWORD);
			
			
			/*
			 *calling   ManagePostPaidGrpInvoker
			 */
			response=invoker.managePostPaidGrp(ibaRequest, headerDetails);
			
			if(response!=null && response.getMessage()!=null){
				logger.info("ManagePostPaidGrpResponse  is success  message :"+response.getMessage());
				updateGrp(response,dbData);
			}
			else  logger.info("ManagePostPaidGrpResponse  is Null");
			
		}
		catch (SMFAgentException e) {
			 
		
			 String erroMsg=SMFAgentConstants.INTERNAL_ERROR_MSG;
			 if(e.getErrorMessage()!=null){
				 erroMsg=e.getErrorMessage();
			 }
			 response.setMessage(e.getErrorCode()+"#"+erroMsg);
		}
		return response;
		
	}

	private void updateGrp(ManagePostPaidGrpResponse response, BulkSIMSUploadCursorData domainData) {
		SPFactory spFactory = null;
		
	try {
		domainData.setStatus("GROUP_CREATION_DONE");
		spFactory = ServiceUtils.executeSPWithOutCommit("sim_update", domainData, domainData);
	} catch (SMFAgentException e) {

		logger.error( "SMFAgentException in CLC_SIM_BULKUPLOAD.sim_update \n" + Utilities.getStackTrace(e));
	}
	Long  errCode   = domainData.getPo_error_code();

	if (logger.isInfoEnabled()) {
		logger.info( "Error Code ==>" + errCode);
	}

	Utilities.commitOrRollback(spFactory, errCode);
	
}
}
