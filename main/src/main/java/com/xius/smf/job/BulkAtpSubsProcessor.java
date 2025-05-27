package com.xius.smf.job;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import javax.xml.soap.SOAPException;

import net.bcgi.util.db.SPFactory;

import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.billing.ProductManagement_wsdl.ProductBindingStub;
import com.xius.billing.ProductManagement_wsdl.ProductDetailsLocator;
import com.xius.billing.ProductManagement_xsd.ProductPurchageRequest;
import com.xius.billing.ProductManagement_xsd.ProductPurchageResponse;
import com.xius.smf.domaindata.BulkAtpSubsCursorData;
import com.xius.smf.domaindata.BulkAtpSubsUpdataData;
import com.xius.smf.domaindata.RetryFromSMFCursorData;
import com.xius.smf.domaindata.StateChangeRetryUpdataData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.services.billing.tariff.TariffServiceBindingStub;
import com.xius.xbus.services.billing.tariff.TariffServiceLocator;

public class BulkAtpSubsProcessor implements Runnable {

	private	 static final Logger logger = LogManager.getLogger(BulkAtpSubsProcessor.class.getSimpleName());

	CountDownLatch latch=null;


	BulkAtpSubsCursorData cursorData=null;

	


	public BulkAtpSubsProcessor(CountDownLatch latch,BulkAtpSubsCursorData curData){

		this.latch=latch;
		this.cursorData=curData;
		


	}
	public void run() {


		logger.info("---------In BulkAtpSubsProcessor run------------ transid "+cursorData.getTransaction_id());
		ProductPurchageRequest request = null;
		ProductPurchageResponse response = null;

		request = setRequest(cursorData);

		try {
			response = callIBA(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData);

				} catch (SMFAgentException e) {

					logger.error("SMFAgentException in BulkAtpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
					failUpdate(cursorData,e.getErrorMessage());
				}

		}
			catch (AxisFault e) {

			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.INTERNAL_ERROR_MSG);
			String errorcode=SMFAgentConstants.INTERNAL_ERROR_CODE_STR;

			logger.error("Communication error from IBA:: transid "+cursorData.getTransaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg);

			logger.error(""+Utilities.getStackTrace( e ) );


		}

		catch (MalformedURLException e) {

		logger.error("MalformedURLException in BulkAtpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in BulkAtpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in BulkAtpSubsProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		}
		finally {
			latch.countDown();
		}

	}
	

	/*public ATPSubscriptionRequest setRequest(BulkAtpSubsCursorData cursorData) {
		ATPSubscriptionRequest request = new ATPSubscriptionRequest();
		logger.info("Setting Request For xbus BulkAtpSubsProcessor with transid "+cursorData.getTransaction_id()+cursorData.toString());

		SecurityId securityId=new SecurityId();

		securityId.setUserAccountName("smfjob");
		securityId.setUserAccountPassword("11111111");



		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(cursorData.getNetwork_id().toString());

		if(cursorData.getMsisdn_no()!=null)
		request.setMsisdn(cursorData.getMsisdn_no().toString());

		if(cursorData.getPublicity_id()!=null)
		request.setPublicityId(cursorData.getPublicity_id());

		if(cursorData.getTransaction_id()!=null)
		request.setTransationId(cursorData.getTransaction_id());
		request.setSecurityId(securityId);
		request.setUserType(UserType.CCUSER);
		request.setServiceContext(serviceContext);
		request.setMessageID("123");//dummy
		request.setServiceFlag("SUBSCRIBED");

		return request;

	}*/
	public ProductPurchageRequest setRequest(BulkAtpSubsCursorData cursorData) {
		ProductPurchageRequest request = new ProductPurchageRequest();
		logger.info("Setting Request For xbus BulkAtpSubsProcessor with transid "+cursorData.getTransaction_id()+cursorData.toString());

		
	//	cursorData.getNetwork_id().toString()
		if(cursorData.getMsisdn_no()!=null)
		request.setMSISDN(cursorData.getMsisdn_no().toString());

		if(cursorData.getPublicity_id()!=null)
		request.setProductId(cursorData.getPublicity_id());

		if(cursorData.getTransaction_id()!=null)
		request.setExternalTransId(cursorData.getTransaction_id());
	

		return request;

	}


	public ProductPurchageResponse callIBA(
			ProductPurchageRequest request, BulkAtpSubsCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		ProductPurchageResponse response = new ProductPurchageResponse();
		ProductDetailsLocator service = new ProductDetailsLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.BULK_ATP_SUBSCRIPTION_IBA_URL);
		logger.info("Hitting IBA with the url from BulkAtpSubsProcessor "+url);
		ProductBindingStub stub = new ProductBindingStub(new URL(url), service);
		HeaderDetails headerDetails=new HeaderDetails();
		headerDetails.setNetworkID(cursorData.getNetwork_id());
		headerDetails.setLoginID("Chief");
		headerDetails.setRequestID("1");
		headerDetails.setPassword("11111111");
		SOAPHeaderElement header = Utilities.getSoapHeader(headerDetails);
		stub.setHeader(header);
	
		response = stub.productPurchage(request);

		return response;
	}



	public void updateStatusDb(ProductPurchageResponse response,
			BulkAtpSubsCursorData cursorData) throws SMFAgentException {
		BulkAtpSubsUpdataData data = null;
		/*NotifyMessageResponse neResponse=null;
		String resp=null;
		if(!response.getResponseData().getReturnCode().equalsIgnoreCase("0") && cursorData.getNotification_flag().equalsIgnoreCase("Y") )
		{
			NPRsmsConfirmationHelper helper=new NPRsmsConfirmationHelper();
			TempMessageInfo replyToSubscriber=new TempMessageInfo();

			replyToSubscriber.setEventReferenceCode(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EmailNotificationEvent));
			//replyToSubscriber.setDestMSISDNs(data.getPortoutMsisdn().toString());
			replyToSubscriber.setEmailTo(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EmailTo));
			replyToSubscriber.setEmailFrom(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.EmailFrom));

			replyToSubscriber.setUserDefined1(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DynamicContentForNE));
			replyToSubscriber.setNetworkId(cursorData.getNetwork_id().toString());
			replyToSubscriber.setMsisdn1(cursorData.getOld_msisdn());
			replyToSubscriber.setIMSIs(cursorData.getOld_imsi().toString());
			replyToSubscriber.setSim1(cursorData.getOld_sim());

			neResponse=helper.sendMsgToSubscriber(replyToSubscriber);
			  resp=response.getResponseData().getRespdescription()+"::"+neResponse;

		}*/

		data = setData(response, cursorData);

		/*if(!response.getResponseData().getReturnCode().equalsIgnoreCase("0") && cursorData.getNotification_flag().equalsIgnoreCase("Y") )
		{
			data.setPi_remarks(resp);
		}*/
		logger.info("Setting Data to BulkAtpSubsProcessor pro_bulkatp_subscription_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulkatp_subscription_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public BulkAtpSubsUpdataData setData(
			ProductPurchageResponse response, BulkAtpSubsCursorData cursorData) {
		BulkAtpSubsUpdataData data = new BulkAtpSubsUpdataData();

		data.setPi_network_id(cursorData.getNetwork_id());

		data.setPi_transaction_id(cursorData.getTransaction_id());

	/*	if(response.getChargeId()!=null)
		data.setPi_charge_id(response.getChargeId());

		if(response.getCharge()!=null)
		data.setPi_charge(response.getCharge());
*/
		if(response.getProductPurchageData().getResponseCode().equalsIgnoreCase("0")){
		data.setPi_status("SUCCESS");
		}else
		{
			data.setPi_status("FAIL");
		}
		data.setPi_remarks(response.getProductPurchageData().getResponseDescription());
		data.setPi_ext_error_code(response.getProductPurchageData().getResponseCode());

		return data;
	}



	public void failUpdate(BulkAtpSubsCursorData cursorData,String msg)
	{


		BulkAtpSubsUpdataData data = new BulkAtpSubsUpdataData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);

		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulkatp_subscription_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	
}
