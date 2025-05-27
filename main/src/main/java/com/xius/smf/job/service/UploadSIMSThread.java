package com.xius.smf.job.service;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.bcgi.si.messages.mvnoapi.common.ErrorData;
import net.bcgi.si.messages.mvnoapi.common.GenderType;
import net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType;
import net.bcgi.si.messages.mvnoapi.common.PostpaidDetails;
import net.bcgi.si.messages.mvnoapi.common.SecurityId;
import net.bcgi.si.messages.mvnoapi.common.ServiceContext;
import net.bcgi.si.messages.mvnoapi.common.StatusCode;
import net.bcgi.si.messages.mvnoapi.common.UserType;
import net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo;
import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo;
import net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo;
import net.bcgi.util.db.SPFactory;

import com.xius.smf.client.ws.XBusProvisiongAppClient;
import com.xius.smf.domaindata.GetUploadSIMSData;
import com.xius.smf.domaindata.ManageOfficeDetailsData;
import com.xius.smf.domaindata.UpdateDispensedSIMData;
import com.xius.smf.domaindata.UploadSIMSCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class UploadSIMSThread implements Runnable {
	private Logger logger = LogManager.getLogger("UploadSIMSThread");

	private String txNumber;
	private String sim;
  

	public void run() {

		startUploadPrcocess();
	}

	public void startUploadPrcocess() {

		PrepaidActivationResponse preResponse = null;
		PostpaidActivationResponse postResponse = null;
		StringBuffer xBusInvocationException = null;
		// Step 1: get entaire upload SIMs info record from DB
		UploadSIMSCursorData uploadSIMInfo = getUplodadInfo();

		// Step 2: invoke xBus for pre-paid activation

		if( null != uploadSIMInfo ) {

			try {

				if( null != uploadSIMInfo.getUserType() && 
						uploadSIMInfo.getUserType().equals( SMFAgentConstants.USER_TYPE_CORP)) {

					// invoke xBus' corporate pre-paid activation

					GetOfficeDetails getOfficeInfo = new GetOfficeDetails();
					ManageOfficeDetailsData officeInfo = null;
					try {

						officeInfo = getOfficeInfo.getOfficeDetails(sim,txNumber, uploadSIMInfo.getOfficeCode(), uploadSIMInfo.getNetworkId() );
					} catch(Exception e) {

						logger.error( "SMFAgentException while CHANNEL_READ \n" + Utilities.getStackTrace(e));

						Long eC = null;
						if( null != officeInfo ) {

							eC = officeInfo.getPo_error_code();
						}
						xBusInvocationException = new StringBuffer(  "FAILED - GetOfficeDetails office code: " + uploadSIMInfo.getOfficeCode() + "Error Code: " +  eC );
					}

					if( null != uploadSIMInfo.getAcctType() && 
							uploadSIMInfo.getAcctType().equals( SMFAgentConstants.POSTPAID_ACCOUNT ) ) {

						// invoke xBus' general post-paid activation
						postResponse = invokeCorpPostPaidActivation( uploadSIMInfo, officeInfo  );
					} else {

						preResponse = invokeCorpPrePaidActivation( uploadSIMInfo, officeInfo );
					}
				} else {

					// check for account type "prepaid or postpaid"
					if( null != uploadSIMInfo.getAcctType() && 
							uploadSIMInfo.getAcctType().equals( SMFAgentConstants.POSTPAID_ACCOUNT ) ) {

						// invoke xBus' general post-paid activation
						postResponse = invokeNormalPostPaidActivation( uploadSIMInfo );
					} else {

						// invoke xBus' general pre-paid activation
						preResponse = invokeNormalPrePaidActivation( uploadSIMInfo );
					}
				}
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
		} else {

			logger.info("No Record found for txNumber: " + txNumber + ", SIM : " + sim  );
		}

		// Step 3: update tx/sim status;
		if( null != preResponse  || null != postResponse ) {

			if( null != postResponse ) {

				updateSIMStatus( postResponse, uploadSIMInfo );
			} else if( null != preResponse ) {

				updateSIMStatus( preResponse, uploadSIMInfo );
			} 

		} else {

			logger.info("xBus response is null for txNumber: " + txNumber + ", SIM : " + sim  );
			UpdateDispensedSIMData domainData = new UpdateDispensedSIMData();
			domainData.setPi_sim_status( SMFAgentConstants.FAILURE + "General Exception" );
			if( null != xBusInvocationException ) {
				domainData.setPi_sim_status( SMFAgentConstants.FAILURE + " - " + xBusInvocationException.toString());
			}
			updateSIMStatus(domainData, uploadSIMInfo);
		}
	}

	private PostpaidActivationResponse invokeCorpPostPaidActivation( UploadSIMSCursorData uploadSIMInfo, ManageOfficeDetailsData officedetails)throws 
	MalformedURLException, ServiceException, InstantiationException, RemoteException {

		// Invoke xBus pre-paid activation API

		long startTime = System.currentTimeMillis();

		logger.info(">>> Calling invokeCorpPostPaidActivation for SIM : " + sim + ", Tx Number: " + txNumber);

		PostpaidActivationRequest request = new PostpaidActivationRequest();

		// Set required data to PrepaidActivationRequest
		SubcriberPersonalInfo personalInfo = new SubcriberPersonalInfo();
		
		
		

		if ( SMFAgentConstants.MYKAD_ID.equals( uploadSIMInfo.getIDType().toString() ) ) {

			personalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadSIMInfo.getIDType().toString() )) {

			personalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
		}

		if ( uploadSIMInfo.getIDType().toString() !=null ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getIDType().toString());
		}
		
		
		
		personalInfo.setIdValue( uploadSIMInfo.getIDNo().trim() );

		if( Utilities.isNull( uploadSIMInfo.getFirstName() ) == false ){

			personalInfo.setFirstName( uploadSIMInfo.getFirstName() );
		}

		if( Utilities.isNull( uploadSIMInfo.getLastName() ) == false ){

			personalInfo.setLastName( uploadSIMInfo.getLastName() );
		}

		if( Utilities.isNull( uploadSIMInfo.getGender() ) == false ){

			String gender = uploadSIMInfo.getGender().trim();

			if( Utilities.isNull( gender ) == false ) {

				if("M".equalsIgnoreCase(gender) ) {

					personalInfo.setGender(GenderType.MALE);
				}
				else if("F".equalsIgnoreCase(gender) ) {

					personalInfo.setGender(GenderType.FEMALE);
				}
			} else {

				logger.info("Gender feild from DB is NUL for SIM : " + sim + ", Tx Number: " + txNumber);
			}
		}
		if( Utilities.isNull( uploadSIMInfo.getDob() ) == false ){

			personalInfo.setDateOfBirth(Utilities.covertStringToCalendar(uploadSIMInfo.getDob().trim(), "GMT"));
		}


		SubcriberAddressInfo subscriberAddressInfo = new SubcriberAddressInfo();

		if( officedetails != null){

			if( Utilities.isNull( officedetails.getAddress() ) == false )
				subscriberAddressInfo.setAddress1( officedetails.getAddress());

			if( Utilities.isNull( officedetails.getPostal_code() ) == false )
				subscriberAddressInfo.setPostalCode( officedetails.getPostal_code() );

			if( Utilities.isNull( officedetails.getState() ) == false )
				subscriberAddressInfo.setState(officedetails.getState());

			if( Utilities.isNull( officedetails.getCity() ) == false )
				subscriberAddressInfo.setCity(officedetails.getCity());

			if( Utilities.isNull( officedetails.getCountry() ) == false )
				subscriberAddressInfo.setCountry(officedetails.getCountry());
		}

		request.setAddressInfo(subscriberAddressInfo);

		MSISDNInfo msisdnInfo = new MSISDNInfo();

		msisdnInfo.setSimNumber( uploadSIMInfo.getSIM().trim() );
		request.setMsisdnInfo(msisdnInfo);

		request.setPersonalInfo(personalInfo);
		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);
		request.setNetworkName( uploadSIMInfo.getNetworkName().trim() );
		request.setIsCorp( Boolean.TRUE );
		request.setOfficeCode( uploadSIMInfo.getOfficeCode() );

		//Postpaid details for mobily
		PostpaidDetails postpaidDetails = new PostpaidDetails();
		/***
		 * This null value check placed to enable reading a record from off line folder
		 * when Setting as empty value its throwing an error.
		 */

		if( Utilities.isNull( uploadSIMInfo.getBillType() ) == false ) { 

			postpaidDetails.setBillingType( uploadSIMInfo.getBillType() );
		}

		if( Utilities.isNull( uploadSIMInfo.getBillFrequency() ) == false ) { 

			postpaidDetails.setBillingFrequency( uploadSIMInfo.getBillFrequency() );
		}

		if(  Utilities.isNull(  uploadSIMInfo.getCreditLimit() ) == false ){
			postpaidDetails.setCreditLimit(new BigDecimal( uploadSIMInfo.getCreditLimit() ));   
		}
		if( null != officedetails.getBillingDate() ) {
			postpaidDetails.setBillingDate( officedetails.getBillingDate() );
		}	

		request.setPostpaidDetails( postpaidDetails );

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId( uploadSIMInfo.getNetworkId().toString() );
		request.setServiceContext( serviceContext );

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName( uploadSIMInfo.getTxUserID() );
		securityId.setUserAccountPassword( SMFAgentConstants.ACCOUNT_PASSWORD );
		request.setSecurityId(securityId);

		if ((UserType.TTCARE.getValue()).equals( uploadSIMInfo.getUserType() )){

			request.setUserType(UserType.TTCARE);  
		} else {
			request.setUserType(UserType.DEALER);
		}
		request.getSecurityId().setUserAccountName( uploadSIMInfo.getTxUserID() );


		XBusProvisiongAppClient xClient = new XBusProvisiongAppClient();
		PostpaidActivationResponse response = xClient.postPaidActivation( request );

		logger.info("**** **** Time taken invokeCorpPostPaidActivation for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return response;
	}

	private void updateSIMStatus(PostpaidActivationResponse xBusResponse, UploadSIMSCursorData uploadSIMInfo) {

		UpdateDispensedSIMData domainData = null;
		if( null != xBusResponse ) {

			domainData = setMOSRequest( xBusResponse  );
			domainData.setPi_id_no( uploadSIMInfo.getIDNo() );
			if( null !=  uploadSIMInfo.getIDType() ) {

				domainData.setPi_id_type( uploadSIMInfo.getIDType().toString() );
			}
			domainData.setPi_trans_number( txNumber );
		}

		SPFactory spFactory = null;
		try {

			spFactory = ServiceUtils.executeSPWithOutCommit("update_dispensed_sim", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in CLC_SIM_BULKUPLOAD.sim_update \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();

		if (logger.isInfoEnabled()) {
			logger.info("Error Code ==>" + errCode);
		}

		Utilities.commitOrRollback(spFactory, errCode);
	}

	private PostpaidActivationResponse invokeNormalPostPaidActivation(UploadSIMSCursorData uploadSIMInfo) 
			throws MalformedURLException, ServiceException, InstantiationException, RemoteException {


		// Invoke xBus pre-paid activation API

		long startTime = System.currentTimeMillis();

		logger.info(">>> Calling invokeNormalPostPaidActivation for SIM : " + sim + ", Tx Number: " + txNumber);

		PostpaidActivationRequest request = new PostpaidActivationRequest();

		// Set required data to PrepaidActivationRequest
		SubcriberPersonalInfo personalInfo = new SubcriberPersonalInfo();
		
		
		
		

		if ( SMFAgentConstants.MYKAD_ID.equals( uploadSIMInfo.getIDType().toString() ) ) {

			personalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadSIMInfo.getIDType().toString() )) {

			personalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
		}
		
		if ( uploadSIMInfo.getIDType().toString() !=null ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getIDType().toString());
		}
		
		

		personalInfo.setIdValue( uploadSIMInfo.getIDNo().trim() );

		SubcriberAddressInfo subscriberAddressInfo = new SubcriberAddressInfo();
		request.setAddressInfo( subscriberAddressInfo );

		MSISDNInfo msisdnInfo = new MSISDNInfo();
		msisdnInfo.setSimNumber( uploadSIMInfo.getSIM().trim() );
		request.setMsisdnInfo(msisdnInfo);

		request.setPersonalInfo(personalInfo);
		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);
		request.setNetworkName( uploadSIMInfo.getNetworkName().trim() );


		//Postpaid details for mobily
		PostpaidDetails postpaidDetails = new PostpaidDetails();
		/***
		 * This null value check placed to enable reading a record from off line folder
		 * when Setting as empty value its throwing an error.
		 */

		if( Utilities.isNull( uploadSIMInfo.getBillType() ) == false )
			postpaidDetails.setBillingType( uploadSIMInfo.getBillType() );

		if( Utilities.isNull( uploadSIMInfo.getBillFrequency() ) == false )
			postpaidDetails.setBillingFrequency( uploadSIMInfo.getBillFrequency() );        

		request.setPostpaidDetails( postpaidDetails );

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId( uploadSIMInfo.getNetworkId().toString() );
		request.setServiceContext( serviceContext );

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName( uploadSIMInfo.getTxUserID() );
		securityId.setUserAccountPassword( SMFAgentConstants.ACCOUNT_PASSWORD );
		request.setSecurityId(securityId);


		if ((UserType.TTCARE.getValue()).equals( uploadSIMInfo.getUserType() )){

			request.setUserType(UserType.TTCARE);  
		} else {
			request.setUserType(UserType.DEALER);
		}

		request.getSecurityId().setUserAccountName( uploadSIMInfo.getTxUserID() );
		request.setOfficeCode( uploadSIMInfo.getOfficeCode() );

		XBusProvisiongAppClient xClient = new XBusProvisiongAppClient();
		PostpaidActivationResponse response = xClient.postPaidActivation( request );

		logger.info("**** **** Time taken invokeXBus for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return response;

	}

	private PrepaidActivationResponse invokeCorpPrePaidActivation( UploadSIMSCursorData uploadSIMInfo, ManageOfficeDetailsData officedetails)  throws MalformedURLException, ServiceException, InstantiationException, RemoteException {

		// Invoke xBus pre-paid activation API

		long startTime = System.currentTimeMillis();

		logger.info(">>> Calling invokeCorpPrePaidActivation for SIM : " + sim + ", Tx Number: " + txNumber);

		PrepaidActivationRequest request = new PrepaidActivationRequest();

		// Set required data to PrepaidActivationRequest
		SubcriberPersonalInfo personalInfo = new SubcriberPersonalInfo();
		
		
		
		
		
		
		

		if ( SMFAgentConstants.MYKAD_ID.equals( uploadSIMInfo.getIDType().toString() ) ) {

			personalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadSIMInfo.getIDType().toString() )) {

			personalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
		}
		
		if ( uploadSIMInfo.getIDType().toString() !=null ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getIDType().toString());
		}
		
		
		

		personalInfo.setIdValue( uploadSIMInfo.getIDNo().trim() );

		if( Utilities.isNull( uploadSIMInfo.getFirstName() ) == false ){

			personalInfo.setFirstName( uploadSIMInfo.getFirstName() );
		}

		if( Utilities.isNull( uploadSIMInfo.getLastName() ) == false ){

			personalInfo.setLastName( uploadSIMInfo.getLastName() );
		}

		if( Utilities.isNull( uploadSIMInfo.getGender() ) == false ){

			String gender = uploadSIMInfo.getGender().trim();
			if( Utilities.isNull( gender ) == false ) {

				if( "M".equalsIgnoreCase(gender) ) {

					personalInfo.setGender(GenderType.MALE);
				}
				else if("F".equalsIgnoreCase(gender) ) {

					personalInfo.setGender(GenderType.FEMALE);
				}
			} else {

				logger.info("Gender feild from DB is NUL for SIM : " + sim + ", Tx Number: " + txNumber);
			}
		}
		if( Utilities.isNull( uploadSIMInfo.getDob() ) == false ){

			personalInfo.setDateOfBirth(Utilities.covertStringToCalendar(uploadSIMInfo.getDob().trim(), "GMT"));
		}


		SubcriberAddressInfo subscriberAddressInfo = new SubcriberAddressInfo();

		if( officedetails != null){

			if( Utilities.isNull( officedetails.getAddress() ) == false )
				subscriberAddressInfo.setAddress1( officedetails.getAddress());

			if( Utilities.isNull( officedetails.getPostal_code() ) == false )
				subscriberAddressInfo.setPostalCode( officedetails.getPostal_code() );

			if( Utilities.isNull( officedetails.getState() ) == false )
				subscriberAddressInfo.setState(officedetails.getState());

			if( Utilities.isNull( officedetails.getCity() ) == false )
				subscriberAddressInfo.setCity(officedetails.getCity());

			if( Utilities.isNull( officedetails.getCountry() ) == false )
				subscriberAddressInfo.setCountry(officedetails.getCountry());
		}

		request.setAddressInfo(subscriberAddressInfo);

		MSISDNInfo msisdnInfo = new MSISDNInfo();

		msisdnInfo.setSimNumber( uploadSIMInfo.getSIM().trim() );
		request.setMsisdnInfo(msisdnInfo);

		request.setPersonalInfo(personalInfo);
		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);
		request.setIsCorp( Boolean.TRUE );

		request.setNetworkName( uploadSIMInfo.getNetworkName().trim() );

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId( uploadSIMInfo.getNetworkId().toString() );
		request.setServiceContext( serviceContext );

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName( uploadSIMInfo.getTxUserID() );
		securityId.setUserAccountPassword( SMFAgentConstants.ACCOUNT_PASSWORD );
		request.setSecurityId(securityId);

		request.setUserType( UserType.DEALER );
		request.getSecurityId().setUserAccountName( uploadSIMInfo.getTxUserID() );
		request.setOfficeCode( uploadSIMInfo.getOfficeCode() );

		XBusProvisiongAppClient xClient = new XBusProvisiongAppClient();
		PrepaidActivationResponse response = xClient.prePaidActivation( request );

		logger.info("**** **** Time taken invokeXBus for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return response;
	}

	private UploadSIMSCursorData getUplodadInfo() {

		long startTime = System.currentTimeMillis();
		logger.info(">>> Calling Fat Get for SIM : " + sim + ", Tx Number: " + txNumber);

		GetUploadSIMSData domainData = new GetUploadSIMSData();
		domainData.setPi_tx_number( txNumber );
		domainData.setPi_sim( sim );

		try {

			//invoke Stored Procedure.
			com.xius.smf.utils.ServiceUtils._executeStoredProcedure("pro_get_upload_sim_dtls", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in pro_get_upload_sim_dtls \n" + Utilities.getStackTrace(e));
		}

		logger.info( "Error Code from pro_get_upload_sim_dtls ==>"+domainData.getPo_error_code());
		logger.info( "Error desc from pro_get_upload_sim_dtls ==>"+domainData.getPo_error_desc());

		logger.info("**** **** Time taken for FatGet for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return domainData.getCursor().get(0);

	}

	private PrepaidActivationResponse invokeNormalPrePaidActivation(UploadSIMSCursorData uploadSIMInfo) throws MalformedURLException, ServiceException, InstantiationException, RemoteException {

		// Invoke xBus pre-paid activation API

		long startTime = System.currentTimeMillis();

		logger.info(">>> Calling invokeNormalPrePaidActivation for SIM : " + sim + ", Tx Number: " + txNumber);

		PrepaidActivationRequest request = new PrepaidActivationRequest();

		// Set required data to PrepaidActivationRequest
		SubcriberPersonalInfo personalInfo = new SubcriberPersonalInfo();
		
		

		if (  uploadSIMInfo.getIDType().toString() !=null  ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getIDType().toString());
		}
		
		
		if ( SMFAgentConstants.MYKAD_ID.equals( uploadSIMInfo.getIDType().toString() ) ) {

			personalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadSIMInfo.getIDType().toString() )) {

			personalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
		}
		
		if (  uploadSIMInfo.getIDType().toString() !=null  ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getIDType().toString());
		}
		
		
		
		

		personalInfo.setIdValue( uploadSIMInfo.getIDNo().trim() );

		SubcriberAddressInfo subscriberAddressInfo = new SubcriberAddressInfo();
		request.setAddressInfo(subscriberAddressInfo);

		MSISDNInfo msisdnInfo = new MSISDNInfo();

		msisdnInfo.setSimNumber( uploadSIMInfo.getSIM().trim() );
		request.setMsisdnInfo(msisdnInfo);

		request.setPersonalInfo(personalInfo);
		request.setMessageID( Utilities.getAUid() );
		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);

		request.setNetworkName( uploadSIMInfo.getNetworkName().trim() );

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId( uploadSIMInfo.getNetworkId().toString() );
		request.setServiceContext( serviceContext );

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName( uploadSIMInfo.getTxUserID() );
		securityId.setUserAccountPassword( SMFAgentConstants.ACCOUNT_PASSWORD );
		request.setSecurityId(securityId);

		request.setUserType( UserType.TTCARE );
		request.getSecurityId().setUserAccountName( uploadSIMInfo.getTxUserID() );

		XBusProvisiongAppClient xClient = new XBusProvisiongAppClient();
		PrepaidActivationResponse response = xClient.prePaidActivation( request );

		logger.info("**** **** Time taken invokeXBus for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return response;
	}
	
	
	

	private void updateSIMStatus( UpdateDispensedSIMData domainData, UploadSIMSCursorData uploadSIMInfo ) {

		logger.info(">>> Calling updateSIMStatus for SIM : " + sim + ", Tx Number: " + txNumber);
		SPFactory spFactory = null;

		domainData.setPi_id_no( uploadSIMInfo.getIDNo() );
		if( null !=  uploadSIMInfo.getIDType() ) {

			domainData.setPi_id_type( uploadSIMInfo.getIDType().toString() );
		}
		domainData.setPi_trans_number( txNumber );

		/**
		 * invoke Stored Procedure.
		 */
		try {
			spFactory =  ServiceUtils.executeSPWithOutCommit( "update_dispensed_sim", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error("SMFAgentException in CLC_SIM_BULKUPLOAD.sim_update \n" + Utilities.getStackTrace(e));
		}

		if(logger.isInfoEnabled()) {

			logger.info( "Error Code ==>"+domainData.getPo_error_code());
		}
		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
	}

	private void updateSIMStatus( PrepaidActivationResponse  xBusResponse, UploadSIMSCursorData uploadSIMInfo ) {

		UpdateDispensedSIMData domainData = null;
		if( null != xBusResponse ) {

			domainData = setMOSRequest( xBusResponse  );
			domainData.setPi_id_no( uploadSIMInfo.getIDNo() );
			if( null !=  uploadSIMInfo.getIDType() ) {

				domainData.setPi_id_type( uploadSIMInfo.getIDType().toString() );
			}
			domainData.setPi_trans_number( txNumber );
		}

		SPFactory spFactory = null;
		try {

			spFactory = ServiceUtils.executeSPWithOutCommit("update_dispensed_sim", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in CLC_SIM_BULKUPLOAD.sim_update \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();

		if (logger.isInfoEnabled()) {
			logger.info( "Error Code ==>" + errCode);
		}

		Utilities.commitOrRollback(spFactory, errCode);
	}

	private UpdateDispensedSIMData setMOSRequest( PostpaidActivationResponse xBusResponse) {

		UpdateDispensedSIMData domainData = null;
		if( null != xBusResponse ) {

			domainData = new UpdateDispensedSIMData();
			domainData.setPi_sim_no( sim );

			logger.debug("xBus response Status : " + xBusResponse.getStatusCode() );

			if(  StatusCode.SUCCESS  == xBusResponse.getStatusCode() 
					|| StatusCode.WARNING  == xBusResponse.getStatusCode()) {

				if( Utilities.isNull( xBusResponse.getMsisdn() ) == false ) {

					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_ALLOCATION );
					domainData.setPi_msisdn( xBusResponse.getMsisdn() );

					logger.debug("***>>> Prepaid Activaton : " + SMFAgentConstants.SUCCESS_ALLOCATION +" for SIM: " + sim + " tx Number : " + txNumber  + " MSISDN : " + xBusResponse.getMsisdn() );
				} else {

					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_NOT_ALLOCATED );
					logger.debug("***>>> Prepaid Activaton : " + SMFAgentConstants.SUCCESS_NOT_ALLOCATED +" for SIM: " + sim + " tx Number : " + txNumber  );
				}

				if( Utilities.isNull( xBusResponse.getIccNo() ) == false ) {

					domainData.setPi_order_no( xBusResponse.getIccNo() );
				}

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

				logger.debug("***>>> Prepaid Activaton Failed for SIM: " + sim + " tx Number : " + txNumber + "Reason : "  + sb.toString() );
				domainData.setPi_sim_status( sb.toString() );
			}  
		}

		return domainData;
	}

	private UpdateDispensedSIMData setMOSRequest( PrepaidActivationResponse xBusResponse) {

		UpdateDispensedSIMData domainData = null;
		if( null != xBusResponse ) {

			domainData = new UpdateDispensedSIMData();
			domainData.setPi_sim_no( sim );

			logger.debug("xBus response Status : " + xBusResponse.getStatusCode() );

			if(  StatusCode.SUCCESS  == xBusResponse.getStatusCode() 
					|| StatusCode.WARNING  == xBusResponse.getStatusCode()) {

				if( Utilities.isNull( xBusResponse.getMsisdn() ) == false ) {

					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_ALLOCATION );
					domainData.setPi_msisdn( xBusResponse.getMsisdn() );

					logger.debug("***>>> Prepaid Activaton : " + SMFAgentConstants.SUCCESS_ALLOCATION +" for SIM: " + sim + " tx Number : " + txNumber  + " MSISDN : " + xBusResponse.getMsisdn() );
				} else {

					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_NOT_ALLOCATED );
					logger.debug("***>>> Prepaid Activaton : " + SMFAgentConstants.SUCCESS_NOT_ALLOCATED +" for SIM: " + sim + " tx Number : " + txNumber  );
				}

				if( Utilities.isNull( xBusResponse.getIccNo() ) == false ) {

					domainData.setPi_order_no( xBusResponse.getIccNo() );
				}

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

				logger.debug("***>>> Prepaid Activaton Failed for SIM: " + sim + " tx Number : " + txNumber + "Reason : "  + sb.toString() );
				domainData.setPi_sim_status( sb.toString() );
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

	public UploadSIMSThread(){

	}

	public UploadSIMSThread(String txNumber, String sim){

		this.txNumber = txNumber;
		this.sim = sim;
	}
}
