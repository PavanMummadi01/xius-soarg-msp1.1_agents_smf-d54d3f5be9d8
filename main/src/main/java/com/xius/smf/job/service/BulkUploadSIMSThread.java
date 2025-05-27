package com.xius.smf.job.service;

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
import net.bcgi.si.messages.mvnoapi.provisioning.ChildAddAccType;
import net.bcgi.si.messages.mvnoapi.provisioning.MSISDNInfo;
import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest;
import net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse;
import net.bcgi.si.messages.mvnoapi.provisioning.SubcriberAddressInfo;
import net.bcgi.si.messages.mvnoapi.provisioning.SubcriberPersonalInfo;
import net.bcgi.si.messages.mvnoapi.provisioning.SubscriberOtherInfo;
import net.bcgi.util.db.SPFactory;

import com.xius.smf.client.invoker.TIARegNotificationInvoker;
import com.xius.smf.client.ws.XBusProvisiongAppClient;
import com.xius.smf.domaindata.BulkSIMSUploadCursorData;
import com.xius.smf.domaindata.BulkSIMSUploadData;
import com.xius.smf.domaindata.UpdateDispensedSIMData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.job.YFQueryProcessor;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.smf.utils.getNetworknameforBulkUpload;
import com.xius.tia.TTprovisioning_xsd.TtRegNotificationRequest;
import com.xius.tia.TTprovisioning_xsd.TtRegNotificationResponse;

public class BulkUploadSIMSThread implements Runnable {

	private static final Logger logger = LogManager.getLogger("BulkUploadSIMSThread");

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
		BulkSIMSUploadCursorData uploadSIMInfo = getUplodadInfo();
		
		// Step 2: invoke xBus for pre-paid activation
		if( null != uploadSIMInfo ) {

			try {

				
					// check for account type "prepaid or postpaid"
					if( null != uploadSIMInfo.getAccount_type() && 
							uploadSIMInfo.getAccount_type().equals( SMFAgentConstants.POSTPAID_ACCOUNT ) ) {

						// invoke xBus' general post-paid activation
						
						postResponse = invokeNormalPostPaidActivation( uploadSIMInfo );
						
					} else {

						// invoke xBus' general pre-paid activation
						logger.info("******** Before PrePaidActivation ************");
						preResponse = invokeNormalPrePaidActivation( uploadSIMInfo );
						logger.info("******** After PrePaidActivation ************");
					}
				}
			 catch (MalformedURLException e) {

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
	    if ((null != preResponse) || (null != postResponse))
	    {
	      if (null != postResponse)
	      {
	        updateSIMStatus(postResponse, uploadSIMInfo); } else {
	        if (null == preResponse)
	          return;
	        updateSIMStatus(preResponse, uploadSIMInfo);
	      }
	    } else {

	    	 this.logger.info( "xBus response is null for txNumber: " + this.txNumber + ", SIM : " + this.sim);
			UpdateDispensedSIMData domainData = new UpdateDispensedSIMData();
			domainData.setPi_sim_status( SMFAgentConstants.FAILURE + "General Exception" );
			if( null != xBusInvocationException ) {
				domainData.setPi_sim_status( SMFAgentConstants.FAILURE + " - " + "XBUS INVOCATION ERROR");
			}
			updateSIMStatus(domainData, uploadSIMInfo);
		}
	}

	
	private void updateSIMStatus(PostpaidActivationResponse xBusResponse, BulkSIMSUploadCursorData uploadSIMInfo) {
		UpdateDispensedSIMData domainData = null;
		if( null != xBusResponse ) {

			domainData = setMOSRequest( xBusResponse  );
			domainData.setPi_id_no( uploadSIMInfo.getId_no() );
			if( null !=  uploadSIMInfo.getId_type() ) {

				domainData.setPi_id_type( uploadSIMInfo.getId_type().toString() );
			}
			domainData.setPi_trans_number( this.txNumber );
		}

	    SPFactory spFactory = null;
	    try
	    {
	      spFactory = ServiceUtils.executeSPWithOutCommit("sim_update", domainData, domainData);
	    }
	    catch (SMFAgentException e) {
	      this.logger.error( "SMFAgentException in CLC_SIM_BULKUPLOAD.sim_update \n" + Utilities.getStackTrace(e));
	    }
	    Long errCode = domainData.getPo_error_code();

	    if (this.logger.isInfoEnabled()) {
	      this.logger.info( "Error Code ==>" + errCode);
	    }

	    Utilities.commitOrRollback(spFactory, errCode);
		
//		// ================= calling  ManagePostPaidGrpImpl=============
//		
//		logger.info("ManagePostPaidGrpImpl  calling from  BulkUploadSIMSThread");
//		ManagePostPaidGrpImpl grpIml= new ManagePostPaidGrpImpl();
//		ManagePostPaidGrpResponse response=new  ManagePostPaidGrpResponse();
//	
//			response=grpIml.managePostPaidGrp(xBusResponse, uploadSIMInfo);
//			if(response.getMessage()!=null)
//				logger.info("BulkUploadSIMSThread ---> ManagePostPaidGrpResponse -->Message:"+response.getMessage());
//		
//		// =================   ManagePostPaidGrpImpl  End=============
	}

	private PostpaidActivationResponse invokeNormalPostPaidActivation(BulkSIMSUploadCursorData uploadSIMInfo) 
			throws MalformedURLException, ServiceException, InstantiationException, RemoteException {


		// Invoke xBus pre-paid activation API

		long startTime = System.currentTimeMillis();

		this.logger.info( ">>> Calling invokeNormalPostPaidActivation for SIM : " + this.sim + ", Tx Number: " + this.txNumber);

		PostpaidActivationRequest request = new PostpaidActivationRequest();

		// Set required data to PrepaidActivationRequest
		SubcriberPersonalInfo personalInfo = new SubcriberPersonalInfo();
		
		SubscriberOtherInfo info =new  SubscriberOtherInfo();
		// Added as part of tt recquirement
		if(uploadSIMInfo.getIs_main_line()!=null)
		request.setIsMainLine(uploadSIMInfo.getIs_main_line());
		
		if(uploadSIMInfo.getIs_sub_line()!=null)
		request.setIsSubLine(uploadSIMInfo.getIs_sub_line());
		
		ChildAddAccType  childAddAccType=new ChildAddAccType();
		if(uploadSIMInfo.getMain_line_msisdn()!=null)
		childAddAccType.setMainLineMSISDN(uploadSIMInfo.getMain_line_msisdn()+"");
		
		if(uploadSIMInfo.getOpt_grp_bill()!=null)
		childAddAccType.setOptGrpBill(uploadSIMInfo.getOpt_grp_bill());
		
		if(uploadSIMInfo.getOpt_grp_credit()!=null)
		childAddAccType.setOptGRPCredit(uploadSIMInfo.getOpt_grp_credit());
		
		request.setLineInfo(childAddAccType);
		
		if(uploadSIMInfo.getIs_corp()!=null)
		{
			if(uploadSIMInfo.getIs_corp().equalsIgnoreCase("Y"))
			{
			request.setIsCorp(true);
			
			if(uploadSIMInfo.getOffice_code()!=null)
			request.setOfficeCode(uploadSIMInfo.getOffice_code());
			
			}
			else
			request.setIsCorp(false);	
		}
		else
			request.setIsCorp(false);
		
		
		if ( SMFAgentConstants.MYKAD_ID.equals( uploadSIMInfo.getId_type().toString() ) ) {

			personalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadSIMInfo.getId_type().toString() )) {

			personalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
		}
		
		if ( uploadSIMInfo.getId_type().toString() !=null ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getId_type().toString());
		}
		
		
		if ( uploadSIMInfo.getId_type().toString() !=null ) {
		personalInfo.setIdValue( uploadSIMInfo.getId_no().trim() );
		}
		SubcriberAddressInfo subscriberAddressInfo = new SubcriberAddressInfo();

		
		if( Utilities.isNull( uploadSIMInfo.getPostal_code().toString() ) == false )
			subscriberAddressInfo.setPostalCode( uploadSIMInfo.getPostal_code().toString() );
		if( Utilities.isNull( uploadSIMInfo.getAlternate_contact_no().toString() ) == false )
		subscriberAddressInfo.setHomePhone(uploadSIMInfo.getAlternate_contact_no().toString());
		if( Utilities.isNull( uploadSIMInfo.getState() ) == false )
			subscriberAddressInfo.setState(uploadSIMInfo.getState());

		if( Utilities.isNull( uploadSIMInfo.getCity() ) == false )
			subscriberAddressInfo.setCity(uploadSIMInfo.getCity());
		
		if( Utilities.isNull( uploadSIMInfo.getEmail() ) == false )
			subscriberAddressInfo.setEmailId(uploadSIMInfo.getEmail());
		
		if( Utilities.isNull( uploadSIMInfo.getCountry() ) == false )
			subscriberAddressInfo.setCountry(uploadSIMInfo.getCountry());
		if( Utilities.isNull( uploadSIMInfo.getGender() ) == false ){

			String gender = uploadSIMInfo.getGender().trim();
			if( Utilities.isNull( gender ) == false ) {

				if( "M".equalsIgnoreCase(gender) || "MALE".equalsIgnoreCase(gender)) {

					personalInfo.setGender(GenderType.MALE);
				}
				else if("F".equalsIgnoreCase(gender) || "FEMALE".equalsIgnoreCase(gender)) {

					personalInfo.setGender(GenderType.FEMALE);
				}
			} else {

				this.logger.info( "Gender feild from DB is NUL for SIM : " + this.sim + ", Tx Number: " + this.txNumber);
			}
		}
		if( Utilities.isNull( uploadSIMInfo.getDate_of_birth() ) == false ){
			personalInfo.setDateOfBirth(Utilities.covertStringToCalendar(uploadSIMInfo.getDate_of_birth().trim(), "GMT"));
		}
		
		if( Utilities.isNull( uploadSIMInfo.getFirst_name() ) == false ){
			personalInfo.setFirstName(uploadSIMInfo.getFirst_name());
		}
		if( Utilities.isNull( uploadSIMInfo.getLast_name()) == false ){
			personalInfo.setLastName(uploadSIMInfo.getLast_name());
		}
		
		request.setAddressInfo(subscriberAddressInfo);
	

		MSISDNInfo msisdnInfo = new MSISDNInfo();
		msisdnInfo.setSimNumber( uploadSIMInfo.getSim_serial_no().trim() );
		if(uploadSIMInfo.getExternal_number()!=null)
		msisdnInfo.setBlockedMSISDN(uploadSIMInfo.getExternal_number());
		
		request.setMsisdnInfo(msisdnInfo);

		request.setPersonalInfo(personalInfo);
		
		/*
		 * Added By Samba
		 * */
		
		if (uploadSIMInfo.getLocation_code()!=null) {
			request.setLocationCode(uploadSIMInfo.getLocation_code().toString());
		}
	
		if (Utilities.isNull(uploadSIMInfo.getDealer_id()) == false) {
			request.setDealerUserId(uploadSIMInfo.getDealer_id());
		}
		
		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);
	//	request.setNetworkName( uploadSIMInfo.getNetworkName().trim() );
		 String networkName = getNetworknameforBulkUpload.getName(uploadSIMInfo.getNetwork_id().toString());
		 request.setNetworkName(networkName);
		 
		 
		

		//Postpaid details for mobily
		PostpaidDetails postpaidDetails = new PostpaidDetails();
		/***
		 * This null value check placed to enable reading a record from off line folder
		 * when Setting as empty value its throwing an error.
		 */

		if( Utilities.isNull( uploadSIMInfo.getBill_type() ) == false )
			postpaidDetails.setBillingType( uploadSIMInfo.getBill_type() );

		if( Utilities.isNull( uploadSIMInfo.getBill_frequency()) == false )
			postpaidDetails.setBillingFrequency( uploadSIMInfo.getBill_frequency() );   
	
		
	/*	if( Utilities.isNull( uploadSIMInfo.getUser_input_field1()) == false )
			postpaidDetails.setBillingDate(uploadSIMInfo.getUser_input_field1()); */ 
		
		if( Utilities.isNull( uploadSIMInfo.getBill_cycleday() .toString()) == false )
			postpaidDetails.setBillingDate( uploadSIMInfo.getBill_cycleday().toString() );        

		if( Utilities.isNull( uploadSIMInfo.getCredit_limit().toString() ) == false )
			postpaidDetails.setCreditLimit( uploadSIMInfo.getCredit_limit() );      
		if( Utilities.isNull(uploadSIMInfo.getStreet() ) == false )
		{
		subscriberAddressInfo.setAddress1( uploadSIMInfo.getStreet());
		}
		
		
		if( Utilities.isNull(uploadSIMInfo.getStreet_limits() ) == false )
		{
		subscriberAddressInfo.setStreetLimits(uploadSIMInfo.getStreet_limits());
		}
		
		if( Utilities.isNull(uploadSIMInfo.getMunicipoality() ) == false )
		{
		subscriberAddressInfo.setMunicipality( uploadSIMInfo.getMunicipoality());
		}
		
		if( Utilities.isNull( uploadSIMInfo.getColony() ) == false ){

			info.setEthic(uploadSIMInfo.getColony());
		}
		if( Utilities.isNull(uploadSIMInfo.getInternal_number() ) == false )
		{
		subscriberAddressInfo.setInternalNumber( uploadSIMInfo.getInternal_number() );
		}
		
		if( Utilities.isNull( uploadSIMInfo.getExternal_number() ) == false )
		{
		subscriberAddressInfo.setExternalNumber( uploadSIMInfo.getExternal_number());
		}
		
		request.setPostpaidDetails( postpaidDetails );
		if (null != uploadSIMInfo.getTariff_plan_id()
				&& !uploadSIMInfo.getTariff_plan_id().toString().equals("0")) {
			request.setTariffPackageId(uploadSIMInfo.getTariff_plan_id()
					.toString());
		} else {
			request.setTariffPackageId(null);
		}
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId( uploadSIMInfo.getNetwork_id().toString() );
		request.setServiceContext( serviceContext );

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName(uploadSIMInfo.getUser_id()  );
		securityId.setUserAccountPassword( SMFAgentConstants.ACCOUNT_PASSWORD );
		request.setSecurityId(securityId);


		
			request.setUserType(UserType.CCUI);  
		

		request.getSecurityId().setUserAccountName( uploadSIMInfo.getUser_id()  );
	//	request.setOfficeCode( uploadSIMInfo.getOfficeCode() );

		XBusProvisiongAppClient xClient = new XBusProvisiongAppClient();
		PostpaidActivationResponse response = xClient.postPaidActivation( request );

		logger.info("**** **** Time taken invokeXBus for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return response;

	}

	

	private BulkSIMSUploadCursorData getUplodadInfo() {

		long startTime = System.currentTimeMillis();
		logger.info(">>> Calling Fat Get for SIM : " + sim + ", Tx Number: " + txNumber);

		BulkSIMSUploadData domainData = new BulkSIMSUploadData();
		domainData.setPi_transaction_no( txNumber );
		domainData.setPi_sim_no( sim );

		try {

			//invoke Stored Procedure.
			com.xius.smf.utils.ServiceUtils._executeStoredProcedure("pro_get_upload_sim_dtls", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in pro_get_upload_sim_dtls \n" + Utilities.getStackTrace(e));
		}

		logger.info( "Error Code from pro_get_upload_sim_dtls ==>"+domainData.getPo_error_code());
		logger.info( "Error desc from pro_get_upload_sim_dtls ==>"+domainData.getPo_error_desc());

		logger.info("**** **** Time taken for FatGet for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		
		if(domainData.getPo_sim_upload_data().size()>0)
			return domainData.getPo_sim_upload_data().get(0);
		
		return null;

	}

	private PrepaidActivationResponse invokeNormalPrePaidActivation(BulkSIMSUploadCursorData uploadSIMInfo) throws MalformedURLException, ServiceException, InstantiationException, RemoteException {

		// Invoke xBus pre-paid activation API

		long startTime = System.currentTimeMillis();

		logger.info(">>> Calling invokeNormalPrePaidActivation for SIM : " + sim + ", Tx Number: " + txNumber);

		PrepaidActivationRequest request = new PrepaidActivationRequest();

		// Set required data to PrepaidActivationRequest
		SubcriberPersonalInfo personalInfo = new SubcriberPersonalInfo();
		SubscriberOtherInfo info =new  SubscriberOtherInfo();
		MSISDNInfo msisdnInfo = new MSISDNInfo();
		if(uploadSIMInfo!=null)
		{
		
			
		if (  uploadSIMInfo.getId_type() !=null  ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getId_type().toString());
		}
		
		
		if ( SMFAgentConstants.MYKAD_ID.equals( uploadSIMInfo.getId_type().toString() ) ) {

			personalInfo.setIdType(PersonalIdentityType.MYKAD_ID);
		} else if (SMFAgentConstants.PASSPORT_NO.equals( uploadSIMInfo.getId_type().toString() )) {

			personalInfo.setIdType(PersonalIdentityType.PASSPORT_NO);
		}
		
		if (  uploadSIMInfo.getId_type().toString() !=null  ) {

			personalInfo.setPersonalIdType(uploadSIMInfo.getId_type().toString());
		}
		
		if( Utilities.isNull(uploadSIMInfo.getFirst_name() ) == false )
		{
		personalInfo.setFirstName(uploadSIMInfo.getFirst_name());
		}else {
			personalInfo.setFirstName("PREREG");
		}
		
		
		if( Utilities.isNull( uploadSIMInfo.getLast_name() ) == false )
		{		
			personalInfo.setLastName(uploadSIMInfo.getLast_name());
		}
		
		if( Utilities.isNull(uploadSIMInfo.getSur_name() ) == false )
		{
		personalInfo.setSurName(uploadSIMInfo.getSur_name());
		}
		
		if( Utilities.isNull(uploadSIMInfo.getId_no().trim() ) == false )
		{
		personalInfo.setIdValue( uploadSIMInfo.getId_no().trim() );
		}
		if( Utilities.isNull( uploadSIMInfo.getGender() ) == false ){

			String gender = uploadSIMInfo.getGender().trim();
			if( Utilities.isNull( gender ) == false ) {

				if( "M".equalsIgnoreCase(gender) || gender.equalsIgnoreCase("MALE")) {

					personalInfo.setGender(GenderType.MALE);
				}
				else if("F".equalsIgnoreCase(gender) || gender.equalsIgnoreCase("FEMALE")) {

					personalInfo.setGender(GenderType.FEMALE);
				}
			} else {

				logger.info("Gender feild from DB is NUL for SIM : " + sim + ", Tx Number: " + txNumber);
			}
		}
		if( Utilities.isNull( uploadSIMInfo.getDate_of_birth() ) == false ){

			personalInfo.setDateOfBirth(Utilities.covertStringToCalendar(uploadSIMInfo.getDate_of_birth().trim(), "GMT"));
		}
		
		SubcriberAddressInfo subscriberAddressInfo = new SubcriberAddressInfo();
		
		if( Utilities.isNull( uploadSIMInfo.getPostal_code() ) == false )
			subscriberAddressInfo.setPostalCode( uploadSIMInfo.getPostal_code() );
		if( Utilities.isNull( uploadSIMInfo.getAlternate_contact_no().toString() ) == false )
		subscriberAddressInfo.setHomePhone(uploadSIMInfo.getAlternate_contact_no().toString());
		if( Utilities.isNull( uploadSIMInfo.getState() ) == false )
			subscriberAddressInfo.setState(uploadSIMInfo.getState());

		if( Utilities.isNull( uploadSIMInfo.getCity() ) == false )
			subscriberAddressInfo.setCity(uploadSIMInfo.getCity());
		
		if( Utilities.isNull( uploadSIMInfo.getEmail() ) == false )
			subscriberAddressInfo.setEmailId(uploadSIMInfo.getEmail());
		
		if( Utilities.isNull( uploadSIMInfo.getCountry() ) == false )
			subscriberAddressInfo.setCountry(uploadSIMInfo.getCountry());
		
		if( Utilities.isNull(uploadSIMInfo.getStreet() ) == false )
		{
		subscriberAddressInfo.setAddress1( uploadSIMInfo.getStreet());
		}
		
		
		if( Utilities.isNull(uploadSIMInfo.getStreet_limits() ) == false )
		{
		subscriberAddressInfo.setStreetLimits( uploadSIMInfo.getStreet_limits());
		}
		
		if( Utilities.isNull(uploadSIMInfo.getMunicipoality() ) == false )
		{
		subscriberAddressInfo.setMunicipality( uploadSIMInfo.getMunicipoality());
		}
		
		if( Utilities.isNull( uploadSIMInfo.getColony() ) == false ){

			info.setEthic(uploadSIMInfo.getColony());
		}
		if( Utilities.isNull(uploadSIMInfo.getInternal_number() ) == false )
		{
		subscriberAddressInfo.setInternalNumber( uploadSIMInfo.getInternal_number() );
		}
		
		if( Utilities.isNull( uploadSIMInfo.getExternal_number() ) == false )
		{
		subscriberAddressInfo.setExternalNumber( uploadSIMInfo.getExternal_number());
		}
		
		request.setAddressInfo(subscriberAddressInfo);
	
		request.setOtherInfo(info);
		
		
		/*
		 * Added By Samba
		 * */
		
			if (uploadSIMInfo.getLocation_code() != null) {
				request.setLocationCode(uploadSIMInfo.getLocation_code().toString());
			}
		
			if (Utilities.isNull(uploadSIMInfo.getDealer_id()) == false) {
				request.setDealerUserId(uploadSIMInfo.getDealer_id());
			}
	

		msisdnInfo.setSimNumber( uploadSIMInfo.getSim_serial_no().trim() );
		request.setMsisdnInfo(msisdnInfo);

		request.setPersonalInfo(personalInfo);
		request.setMessageID( Utilities.getAUid() );
		request.setMessageID( Utilities.getAUid() );
		request.setVersion( SMFAgentConstants.DEFAULT_VERSION);
		request.setOrderID(uploadSIMInfo.getOrder_no());
			
		 String networkName = getNetworknameforBulkUpload.getName(uploadSIMInfo.getNetwork_id().toString());
		 request.setNetworkName(networkName);
		 
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId( uploadSIMInfo.getNetwork_id().toString() );
		request.setServiceContext( serviceContext );
		
		
		if(null!=uploadSIMInfo.getTariff_plan_id() && !uploadSIMInfo.getTariff_plan_id().toString().equals("0") ){
	        request.setTariffPackageId(uploadSIMInfo.getTariff_plan_id().toString());
		}
		
		else{
	        request.setTariffPackageId(null);
		}
		
		
		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName(uploadSIMInfo.getUser_id()  );
		securityId.setUserAccountPassword( SMFAgentConstants.ACCOUNT_PASSWORD );
		request.setSecurityId(securityId);

		request.setUserType( UserType.CCUI);
		request.getSecurityId().setUserAccountName(uploadSIMInfo.getUser_id());
		

		if(uploadSIMInfo.getIs_corp()!=null)
		{
			if(uploadSIMInfo.getIs_corp().equalsIgnoreCase("Y"))
			{
			request.setIsCorp(true);
			
			if(uploadSIMInfo.getOffice_code()!=null)
			request.setOfficeCode(uploadSIMInfo.getOffice_code());
			
			}
			else
			request.setIsCorp(false);	
		}
		else
			request.setIsCorp(false);
		
		}

		XBusProvisiongAppClient xClient = new XBusProvisiongAppClient();
		PrepaidActivationResponse response = xClient.prePaidActivation( request );

		logger.info("**** **** Time taken invokeXBus for SIM : " + sim + ", Tx Number: " + txNumber + " in (milli secons): " + (System.currentTimeMillis() - startTime) );
		return response;
	}
	
	
	

	private void updateSIMStatus( UpdateDispensedSIMData domainData, BulkSIMSUploadCursorData uploadSIMInfo ) {

		logger.info(">>> Calling updateSIMStatus for SIM : " + sim + ", Tx Number: " + txNumber);
		SPFactory spFactory = null;
		
		if(sim!=null){
			domainData.setPi_sim_no(sim );
			}
		if(uploadSIMInfo!=null)
		{
		if( null !=  uploadSIMInfo.getId_no() ) {

		domainData.setPi_id_no( uploadSIMInfo.getId_no() );
		}
		if( null !=  uploadSIMInfo.getId_type() ) {

			domainData.setPi_id_type( uploadSIMInfo.getId_type().toString() );
		}
		}
		domainData.setPi_trans_number( txNumber );

		/**
		 * invoke Stored Procedure.
		 */
		try {
			spFactory =  ServiceUtils.executeSPWithOutCommit( "sim_update", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in CLC_SIM_BULKUPLOAD.sim_update \n" + Utilities.getStackTrace(e));
		}

		if(logger.isInfoEnabled()) {

			logger.info( "Error Code ==>"+domainData.getPo_error_code());
			logger.info( "Error Code ==>" + domainData.getPo_error_desc());
		}
		Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
	}

	private void updateSIMStatus( PrepaidActivationResponse  xBusResponse, BulkSIMSUploadCursorData uploadSIMInfo ) {

		UpdateDispensedSIMData domainData = null;
		if( null != xBusResponse ) {

			domainData = setMOSRequest( xBusResponse );
			domainData.setPi_id_no( uploadSIMInfo.getId_no() );
			if( null !=  uploadSIMInfo.getId_type() ) {

				domainData.setPi_id_type( uploadSIMInfo.getId_type().toString() );
			}
			domainData.setPi_trans_number( txNumber );
		}

		SPFactory spFactory = null;
		try {

			spFactory = ServiceUtils.executeSPWithOutCommit("sim_update", domainData, domainData);
		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in CLC_SIM_BULKUPLOAD.sim_update \n" + Utilities.getStackTrace(e));
		}
		Long  errCode   = domainData.getPo_error_code();
		String  errmsg   = domainData.getPo_error_desc();
		if (logger.isInfoEnabled()) {
			logger.info( "Error Code ==>" + errCode);
			logger.info( "Error Code ==>" + errmsg);
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

				/*TIARegNotificationInvoker	tiaRegNotificationInvoker=new TIARegNotificationInvoker();

				HeaderDetails headerDetails=new HeaderDetails();
				headerDetails.setNetworkID(uploadSIMInfo.getNetwork_id());
				headerDetails.setLoginID(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME));
				headerDetails.setRequestID("1");
				headerDetails.setPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD));
				
				TtRegNotificationRequest request=new TtRegNotificationRequest();
				if(xBusResponse.getMsisdn()!=null)
				request.setMSISDN(xBusResponse.getMsisdn()+"");
				request.setSimData(uploadSIMInfo.getSim_serial_no()+"");
				request.setTransId(txNumber+"");
				request.setRemarks("");
				request.setStatus("SUCCESS");
				TtRegNotificationResponse ttRegNotificationResponse =null;
				try {
					  ttRegNotificationResponse = tiaRegNotificationInvoker.regnotification(headerDetails, request);
					  if(ttRegNotificationResponse !=null && ttRegNotificationResponse.getMessage()!=null)
					  domainData.setPi_notif_status(ttRegNotificationResponse.getMessage());
				} catch (SMFAgentException e) {
					logger.log(BCGLevel.ERROR, "SMFAgentException in invoking tiaRegNotificationInvoker \n" + Utilities.getStackTrace(e));
				}*/
				
				if( Utilities.isNull( xBusResponse.getMsisdn() ) == false ) {
					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_ALLOCATION );
					domainData.setPi_msisdn( xBusResponse.getMsisdn() );

					logger.debug("***>>> postpaid Activaton : " + SMFAgentConstants.SUCCESS_ALLOCATION +" for SIM: " + sim + " tx Number : " + txNumber  + " MSISDN : " + xBusResponse.getMsisdn() );
				} else {

					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_NOT_ALLOCATED );
					logger.debug("***>>> postpaid Activaton : " + SMFAgentConstants.SUCCESS_NOT_ALLOCATED +" for SIM: " + sim + " tx Number : " + txNumber  );
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
				
	/*			//commented as for failure case will not invoke the reg and also for retry mechanism
	  			TIARegNotificationInvoker	tiaRegNotificationInvoker=new TIARegNotificationInvoker();

				HeaderDetails headerDetails=new HeaderDetails();
				headerDetails.setNetworkID(uploadSIMInfo.getNetwork_id());
				headerDetails.setLoginID(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_USERNAME));
				headerDetails.setRequestID("1");
				headerDetails.setPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_THRESHOLD_NOTIFICATION_JOB_TTSA_PASSWORD));
				
				TtRegNotificationRequest request=new TtRegNotificationRequest();
				if(xBusResponse.getMsisdn()!=null)
				request.setMSISDN(xBusResponse.getMsisdn()+"");
				request.setSimData(uploadSIMInfo.getSim_serial_no()+"");
				request.setTransId(txNumber+"");
				request.setRemarks(sb.toString());
				request.setStatus("FAILED");
				
				try {
					tiaRegNotificationInvoker.regnotification(headerDetails, request);
				} catch (SMFAgentException e) {
					logger.log(BCGLevel.ERROR, "SMFAgentException in invoking tiaRegNotificationInvoker \n" + Utilities.getStackTrace(e));
				}
				
			}  
		}

		return domainData;
	}

	private UpdateDispensedSIMData setMOSRequest( PrepaidActivationResponse xBusResponse) {

		UpdateDispensedSIMData domainData = null;
		if( null != xBusResponse ) {

			domainData = new UpdateDispensedSIMData();
			domainData.setPi_sim_no( sim );

			logger.log(BCGLevel.DEBUG,"xBus response Status : " + xBusResponse.getStatusCode() );

			if(  StatusCode.SUCCESS  == xBusResponse.getStatusCode() 
					|| StatusCode.WARNING  == xBusResponse.getStatusCode()) {

				if( Utilities.isNull( xBusResponse.getMsisdn() ) == false ) {

					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_ALLOCATION );
					domainData.setPi_msisdn( xBusResponse.getMsisdn() );

					logger.log(BCGLevel.DEBUG,"***>>> Prepaid Activaton : " + SMFAgentConstants.SUCCESS_ALLOCATION +" for SIM: " + sim + " tx Number : " + txNumber  + " MSISDN : " + xBusResponse.getMsisdn() );
				} else {

					domainData.setPi_sim_status( SMFAgentConstants.SUCCESS_NOT_ALLOCATED );
					logger.log(BCGLevel.DEBUG,"***>>> Prepaid Activaton : " + SMFAgentConstants.SUCCESS_NOT_ALLOCATED +" for SIM: " + sim + " tx Number : " + txNumber  );
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

				logger.log(BCGLevel.DEBUG,"***>>> Prepaid Activaton Failed for SIM: " + sim + " tx Number : " + txNumber + "Reason : "  + sb.toString() );
				domainData.setPi_sim_status( sb.toString() );*/
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

	public BulkUploadSIMSThread(){

	}

	public BulkUploadSIMSThread(String txNumber, String sim){

		this.txNumber = txNumber;
		this.sim = sim;
	}
}
