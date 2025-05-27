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
import com.xius.tia.TIAManagement_xsd.ActivateSubscriberRequest;
import com.xius.tia.TIAManagement_xsd.ActivateSubscriberResponse;
import com.xius.tia.TIAManagement_xsd.RequestData;
import com.xius.tia.TIAManagement_xsd.SubscriberRequestType;

public class ActivateSubscriberRetryProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(ActivateSubscriberRetryProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	StateChangeRetryCursorData cursorData = null;

	public ActivateSubscriberRetryProcessor(CountDownLatch latch,
			StateChangeRetryCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;

	}

	public void run() {
		
		
		logger.info("---------In ActivateSubscriberRetryProcessor run------------");
		ActivateSubscriberRequest request = null;
		ActivateSubscriberResponse response = null;

		request = setRequest(cursorData);

		try {
			response = callTia(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData);

				} catch (SMFAgentException e) {
					
					logger.error("SMFAgentException in ActivateSubscriberRetryProcessor "+Utilities.getStackTrace(e));
				}

		}
			catch (AxisFault e) {
			
			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.TIA_ERRCODE);
			String errorcode=SMFAgentConstants.TIA_ERRCODE;
			
			logger.error("Communication error from TIA:: "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg);
			
			logger.error(""+Utilities.getStackTrace( e ) );
			
			
		} 
		
		catch (MalformedURLException e) {
			
		logger.error("MalformedURLException in ActivateSubscriberRetryProcessor "+Utilities.getStackTrace(e));
		} catch (RemoteException e) {
			
			logger.error("RemoteException in ActivateSubscriberRetryProcessor "+Utilities.getStackTrace(e));
		} catch (SOAPException e) {
			
			logger.error("SOAPException in ActivateSubscriberRetryProcessor "+Utilities.getStackTrace(e));
		}
		finally {			
			latch.countDown();
		}

	}

	public ActivateSubscriberRequest setRequest(StateChangeRetryCursorData cursorData) {
		ActivateSubscriberRequest request = new ActivateSubscriberRequest();
		logger.info("Setting Request For TIA ActivateSubscriberRetryProcessor with "+cursorData.toString());
		
		SubscriberRequestType subreq=new SubscriberRequestType();
		RequestData reqdata=new RequestData();
		if (cursorData.getImsi_no() != null)
			subreq.setNewIMSI(cursorData.getImsi_no().toString());
		if (cursorData.getMsisdn_no() != null)
			subreq.setNewMSISDN(cursorData.getMsisdn_no().toString());
		if (cursorData.getSim_serial_no() != null)
			subreq.setNewICC(cursorData.getSim_serial_no());
		if (cursorData.getTechnology() != null)
			reqdata.setTechnology(cursorData.getTechnology());
		if (cursorData.getRetry_transaction_ext_id() != null)
			reqdata.setTransactionId(cursorData.getRetry_transaction_ext_id());
		if (cursorData.getAccount_id() != null)
			reqdata.setExtenalAccountId(cursorData.getAccount_id().toString());
			subreq.setRequestData(reqdata);
			request.setSubscriberData(subreq);
		
		if (cursorData.getImsi_no() != null)
			request.setIMSI(cursorData.getImsi_no().toString());

		if (cursorData.getMsisdn_no() != null)
			request.setMSISDN(cursorData.getMsisdn_no().toString());
		
		if (cursorData.getSim_serial_no() != null)
			request.setICC(cursorData.getSim_serial_no());
		
		

		return request;

	}

	public ActivateSubscriberResponse callTia(
			ActivateSubscriberRequest request, StateChangeRetryCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		ActivateSubscriberResponse response = new ActivateSubscriberResponse();
		TIAManagementLocator service = new TIAManagementLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_URL);
		logger.info("Hitting TIA with the url from ActivateSubscriberRetryProcessor"+url);
		TIAManagementBindingStub stub = new TIAManagementBindingStub(new URL(url), service);
		SOAPHeaderElement header = new SOAPHeaderElement("http://tia.xius.com/common/header/HeaderDetails.xsd","messageHeader");
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
		c_node1.addTextNode("23023"); // dummy value

		c_node2 = node1.addChildElement("carrierId");
		c_node2.addTextNode(cursorData.getNetwork_id().toString());

		String nwName = GetNetworkName.getName(cursorData.getNetwork_id().toString());
		logger.info("NetworkName read from Property File ActivateSubscriberRetryProcessor: "+nwName);
		c_node3 = node1.addChildElement("networkName");
		c_node3.addTextNode(nwName);

		c_node4 = node1.addChildElement("userId");
		c_node4.addTextNode("SMF");

		c_node5 = node1.addChildElement("password");
		c_node5.addTextNode("11111111");

		stub.setHeader(header);

		response = stub.activateSubscriber(request);

		return response;
	}

	public void updateStatusDb(ActivateSubscriberResponse response,
			StateChangeRetryCursorData cursorData) throws SMFAgentException {
		StateChangeRetryUpdataData data = null;
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
			replyToSubscriber.setMsisdn1(cursorData.getMsisdn_no());
			replyToSubscriber.setIMSIs(cursorData.getImsi_no().toString());
			replyToSubscriber.setSim1(cursorData.getSim_serial_no());
			 
			
			 neResponse=helper.sendMsgToSubscriber(replyToSubscriber);
			  resp=response.getResponseData().getRespdescription()+"::"+neResponse;
			
		}
		
		data = setData(response, cursorData);
		
		if(!response.getResponseData().getReturnCode().equalsIgnoreCase("0") && cursorData.getNotification_flag().equalsIgnoreCase("Y") )
		{
			data.setPi_remarks(resp);
		}
		logger.info("Setting Data to ActivateSubscriberRetryProcessor pro_state_change_retry_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_state_change_retry_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}

	public StateChangeRetryUpdataData setData(
			ActivateSubscriberResponse response, StateChangeRetryCursorData cursorData) {
		StateChangeRetryUpdataData data = new StateChangeRetryUpdataData();
		if (response.getResponseData().getReturnCode() != null
				&& response.getResponseData().getReturnCode().equalsIgnoreCase("0")) {
			data.setPi_status("SUCCESS");
		} else
			data.setPi_status("FAIL");

		if (response.getResponseData().getRespdescription() != null)
			data.setPi_remarks(response.getResponseData().getRespdescription());

		if (cursorData.getRetry_transaction_ext_id() != null)
			data.setPi_transaction_id(cursorData.getRetry_transaction_ext_id());
		if (cursorData.getNetwork_id() != null)
			data.setPi_network_id(cursorData.getNetwork_id().longValue());

		return data;
	}
	
	
	public void failUpdate(StateChangeRetryCursorData cursorData,String msg)
	{
		
		
		StateChangeRetryUpdataData data = new StateChangeRetryUpdataData();
		
		data.setPi_transaction_id(cursorData.getRetry_transaction_ext_id());
		data.setPi_network_id(cursorData.getNetwork_id().longValue());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);
		
		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_state_change_retry_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);
		
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
