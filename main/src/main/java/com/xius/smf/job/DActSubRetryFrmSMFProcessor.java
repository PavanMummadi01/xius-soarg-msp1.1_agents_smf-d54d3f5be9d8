package com.xius.smf.job;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.concurrent.CountDownLatch;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import net.bcgi.util.db.SPFactory;

import org.apache.axis.AxisFault;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.ne.NotificationManagement_xsd.NotifyMessageResponse;
import com.xius.smf.domaindata.RetryFromSMFCursorData;
import com.xius.smf.domaindata.StateChangeRetryCursorData;
import com.xius.smf.domaindata.StateChangeRetryUpdataData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.ne.NPRsmsConfirmationHelper;
import com.xius.smf.ne.TempMessageInfo;
import com.xius.smf.utils.GetNetworkName;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.tia.TIAManagement_wsdl.TIAManagementBindingStub;
import com.xius.tia.TIAManagement_wsdl.TIAManagementLocator;
import com.xius.tia.TIAManagement_xsd.DeactivateSubscriberRequest;
import com.xius.tia.TIAManagement_xsd.DeactivateSubscriberResponse;
import com.xius.tia.TIAManagement_xsd.RequestData;
import com.xius.tia.TIAManagement_xsd.SubscriberRequestType;

public class DActSubRetryFrmSMFProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(DActSubRetryFrmSMFProcessor.class.getSimpleName());

	CountDownLatch latch=null;
	
	
	RetryFromSMFCursorData cursorData=null;
	
	
	public DActSubRetryFrmSMFProcessor(CountDownLatch latch,RetryFromSMFCursorData curData){
		
		this.latch=latch;
		this.cursorData=curData;
		
	}
	public void run() {
		logger.info("---------In DActSubRetryFrmSMFProcessor run------------transid "+cursorData.getRetry_transaction_id());
		DeactivateSubscriberRequest request=null;
		DeactivateSubscriberResponse response=null;
		
		request=setRequest(cursorData);
		
		try {
			response=callTia(request);
			
			if(response!=null)
				try {
					updateStatusDb(response,cursorData);
					
					
					
				} catch (SMFAgentException e) {
					
					logger.error("SMFAgentException in DActSubRetryFrmSMFProcessor transid "+cursorData.getRetry_transaction_id()+Utilities.getStackTrace(e));
				}
			
			
			
		}
		catch (AxisFault e) {
			
			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.TIA_ERRCODE);
			String errorcode=SMFAgentConstants.TIA_ERRCODE;
			
			logger.error("Communication error from TIA:: transid "+cursorData.getRetry_transaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg);
			
			logger.error(""+Utilities.getStackTrace( e ) );
			
			
		} 
		catch (MalformedURLException e) {
			logger.error("MalformedURLException in DActSubRetryFrmSMFProcessor transid "+cursorData.getRetry_transaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {
			logger.error("RemoteException in DActSubRetryFrmSMFProcessor transid "+cursorData.getRetry_transaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {
			logger.error("SOAPException in DActSubRetryFrmSMFProcessor transid "+cursorData.getRetry_transaction_id()+Utilities.getStackTrace(e));
		}
		finally {			
			latch.countDown();
		}
		
		
	}
	
	public DeactivateSubscriberRequest setRequest(RetryFromSMFCursorData cursorData)
	{
		DeactivateSubscriberRequest request=new DeactivateSubscriberRequest();
		logger.info("Setting Request For TIA DActSubRetryFrmSMFProcessor with transid "+cursorData.getRetry_transaction_id()+cursorData.toString());
		
		SubscriberRequestType subreq=new SubscriberRequestType();
		RequestData reqdata=new RequestData();
		if (cursorData.getNew_imsi() != null)
			subreq.setNewIMSI(cursorData.getNew_imsi().toString());
		if (cursorData.getNew_msisdn() != null)
			subreq.setNewMSISDN(cursorData.getNew_msisdn().toString());
		if (cursorData.getNew_sim() != null)
			subreq.setNewICC(cursorData.getNew_sim());
		if (cursorData.getTechnology() != null)
			reqdata.setTechnology(cursorData.getTechnology());
		if (cursorData.getRetry_transaction_id() != null)
			reqdata.setTransactionId(cursorData.getRetry_transaction_id());
		if (cursorData.getOld_account_id() != null)
			reqdata.setExtenalAccountId(cursorData.getOld_account_id().toString());
			subreq.setRequestData(reqdata);
			request.setSubscriberData(subreq);
		
		if (cursorData.getNew_imsi() != null)
			request.setIMSI(cursorData.getNew_imsi().toString());

		if (cursorData.getNew_msisdn() != null)
			request.setMSISDN(cursorData.getNew_msisdn().toString());
		
		if (cursorData.getNew_sim() != null)
			request.setICC(cursorData.getNew_sim());
		
		

		return request;
		
	}
	
	public DeactivateSubscriberResponse callTia(DeactivateSubscriberRequest request) throws AxisFault,MalformedURLException, RemoteException, SOAPException
	{
		DeactivateSubscriberResponse response=new DeactivateSubscriberResponse();
		TIAManagementLocator service=new TIAManagementLocator();
		String url=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_URL);
		logger.info("Hitting TIA with the url from DActSubRetryFrmSMFProcessor"+url);
		TIAManagementBindingStub stub=new TIAManagementBindingStub(new URL(url),service);
		 SOAPHeaderElement header = new SOAPHeaderElement("http://tia.xius.com/common/header/HeaderDetails.xsd", "messageHeader");
		 header.setActor(null);
			header.setPrefix("head");						
			SOAPElement node1;
			SOAPElement c_node1;
			SOAPElement c_node2;
			SOAPElement c_node3;
			SOAPElement c_node4;
			SOAPElement c_node5;
			node1 = header.addChildElement("trackingMessageHeader");

			c_node1 = node1.addChildElement("messageId");
			c_node1.addTextNode("23023"); //dummy value

			c_node2 = node1.addChildElement("carrierId");
			c_node2.addTextNode(cursorData.getNetwork_id().toString());
			

			String nwName = GetNetworkName.getName(cursorData.getNetwork_id().toString());
			logger.info("NetworkName read from Property File DActSubRetryFrmSMFProcessor "+nwName);
			c_node3 = node1.addChildElement("networkName");
			c_node3.addTextNode(nwName);

			
			c_node4 = node1.addChildElement("userId");
			c_node4.addTextNode("SMF");
			
			c_node5 = node1.addChildElement("password");
			c_node5.addTextNode("11111111");
			
			stub.setHeader(header);
		
		response=stub.deactivateSubscriber(request);
		
		
		
		
		
		
		return response;
	}
	
	
	public void updateStatusDb(DeactivateSubscriberResponse response,RetryFromSMFCursorData cursorData) throws SMFAgentException
	{
		StateChangeRetryUpdataData data=null;
		NotifyMessageResponse neResponse=null;
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
			
			if(cursorData.getNew_msisdn()!=null)
			replyToSubscriber.setMsisdn1(cursorData.getNew_msisdn());
			if(cursorData.getNew_imsi()!=null)
			replyToSubscriber.setIMSIs(cursorData.getNew_imsi().toString());
			if(cursorData.getNew_sim()!=null)
			replyToSubscriber.setSim1(cursorData.getNew_sim());
			
			if(cursorData.getTechnology()!=null)
			replyToSubscriber.setUserDefined2(cursorData.getTechnology());
			
			
			 neResponse=helper.sendMsgToSubscriber(replyToSubscriber);
			  resp=response.getResponseData().getRespdescription()+"::"+neResponse.getTransID();
			
		}
		
		
		data=setData(response,cursorData);

		if(!response.getResponseData().getReturnCode().equalsIgnoreCase("0") && cursorData.getNotification_flag().equalsIgnoreCase("Y") )
		{
			data.setPi_remarks(resp);
		}
		logger.info("Setting Data to DActSubRetryFrmSMFProcessor pro_mdn_imsi_statchng_rtry_upd"+data.toString());
		SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_mdn_imsi_statchng_rtry_upd", data, data);
		
		Long errorcode=data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);
	
		
		
		
	}
	
	public StateChangeRetryUpdataData setData(DeactivateSubscriberResponse response,RetryFromSMFCursorData cursorData)
	{
		StateChangeRetryUpdataData data=new StateChangeRetryUpdataData(); 
		if (response.getResponseData().getReturnCode() != null
				&& response.getResponseData().getReturnCode().equalsIgnoreCase("0")) {
			data.setPi_status("SUCCESS");
		} else
			data.setPi_status("FAIL");

		if (response.getResponseData().getRespdescription() != null)
			data.setPi_remarks(response.getResponseData().getRespdescription());

		if(response.getResponseData().getResponsecode()!=null)
			data.setPi_ext_error_code(response.getResponseData().getResponsecode());
		
		
		if (cursorData.getRetry_transaction_id() != null)
			data.setPi_retry_trans_id(cursorData.getRetry_transaction_id());
		if (cursorData.getNetwork_id() != null)
			data.setPi_network_id(cursorData.getNetwork_id().longValue());

		return data;
	}

	
	public void failUpdate(RetryFromSMFCursorData cursorData,String msg)
	{
		
		
		StateChangeRetryUpdataData data = new StateChangeRetryUpdataData();
		
		data.setPi_retry_trans_id(cursorData.getRetry_transaction_id());
		data.setPi_network_id(cursorData.getNetwork_id().longValue());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);
		
		try {
			SPFactory spfactory= ServiceUtils.executeSPWithOutCommit("pro_mdn_imsi_statchng_rtry_upd", data, data);
		

			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);
			
		
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	

}
