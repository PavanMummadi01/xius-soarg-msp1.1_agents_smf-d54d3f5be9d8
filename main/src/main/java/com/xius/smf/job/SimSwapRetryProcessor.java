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
import com.xius.smf.domaindata.SimSwapRetryCursorData;
import com.xius.smf.domaindata.SimSwapRetryUpdateData;
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
import com.xius.tia.TIAManagement_xsd.RequestData;
import com.xius.tia.TIAManagement_xsd.SIMSwapRequest;
import com.xius.tia.TIAManagement_xsd.SIMSwapResponse;
import com.xius.tia.TIAManagement_xsd.SimDataType;

/******************************************************************
 * Company XIUS (Megasoft Pvt Ltd Hyderabad,INDIA)
 * � Copyright 2006 MEGASOFT. 
 *
 * Package      : com.xius.smf.job;
 * Name of File : SimSwapRetryProcessor.java
 * Date /Year   : Dec 22, 2016
 * Author       : Aditya Thumma
 * Discription  : Based on the cursor data of SimSwap,  
 * 				  This data is sent to TIA and the response from TIA is stored in DB.
 * 
 *
 * Method names : 
 * 
 * Modifications
 * Method Name  |  Date   |  Author  | Explanation
 * -------------------------------------------------------------              
 *              |         |          |
 *              |         |          | 
 *             
 ********************************************************************/ 
public class SimSwapRetryProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(SimSwapRetryProcessor.class.getSimpleName());


	CountDownLatch latch = null;
	SimSwapRetryCursorData cursorData = null;

	public SimSwapRetryProcessor(CountDownLatch latch,
			SimSwapRetryCursorData curData) {
		this.latch = latch;
		this.cursorData = curData;

	}

	
	
	
	public void run() {
		
		SIMSwapRequest request=null;
		SIMSwapResponse response=null;
		
		
		request=setRequest(cursorData);
		
		
		try {
			response=callTia(request,cursorData);
			
			if (response != null)
				try {
					updateStatusDb(response, cursorData);

				} catch (SMFAgentException e) {
					
					logger.error("SMFAgentException in SimSwapRetryProcessor "+Utilities.getStackTrace(e));
				}
			
			
			
			
		} catch (AxisFault e) {
			
			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.TIA_ERRCODE);
			String errorcode=SMFAgentConstants.TIA_ERRCODE;
			
			logger.error("Communication error from TIA:: "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg);
			
			logger.error(""+Utilities.getStackTrace( e ) );
			
			
		} 
		
		catch (MalformedURLException e) {
			
		logger.error("MalformedURLException in SimSwapRetryProcessor "+Utilities.getStackTrace(e));
		} catch (RemoteException e) {
			
			logger.error("RemoteException in SimSwapRetryProcessor "+Utilities.getStackTrace(e));
		} catch (SOAPException e) {
			
			logger.error("SOAPException in SimSwapRetryProcessor "+Utilities.getStackTrace(e));
		}
		finally {			
			latch.countDown();
		}
		
	}
	public SIMSwapRequest setRequest(SimSwapRetryCursorData cursordata)
	{
		SIMSwapRequest request=new SIMSwapRequest();
		SimDataType simdata=new SimDataType();
		RequestData reqdata=new RequestData();
		if(cursordata.getNew_sim()!=null)
		request.setNewICC(cursordata.getNew_sim().toString());
		if(cursordata.getNew_imsi()!=null)
		request.setNewIMSI(cursordata.getNew_imsi().toString());
		if(cursordata.getOld_msisdn_no()!=null)
		request.setOldMSISDN(cursordata.getOld_msisdn_no().toString());
		if(cursordata.getNew_msisdn_no()!=null)
		simdata.setNewMSISDN(cursordata.getNew_msisdn_no().toString());
		if(cursordata.getOld_sim()!=null)
		simdata.setOldICC(cursordata.getOld_sim().toString());
		if(cursordata.getOld_imsi()!=null)
		simdata.setOldIMSI(cursordata.getOld_imsi().toString());
		if(cursordata.getTechnology()!=null)
		reqdata.setTechnology(cursordata.getTechnology());
		if(cursordata.getRetry_transaction_id()!=null)
		reqdata.setTransactionId(cursordata.getRetry_transaction_id());
		simdata.setRequestData(reqdata);
		
		request.setSimData(simdata);
		
		
		
		return request;
	}
	public SIMSwapResponse callTia(
			SIMSwapRequest request, SimSwapRetryCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		SIMSwapResponse response = new SIMSwapResponse();
		TIAManagementLocator service = new TIAManagementLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_URL);
		logger.info("Hitting TIA with the url from SimSwapRetryProcessor"+url);
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
		logger.info("NetworkName read from Property File SimSwapRetryProcessor: "+nwName);
		c_node3 = node1.addChildElement("networkName");
		c_node3.addTextNode(nwName);

		c_node4 = node1.addChildElement("userId");
		c_node4.addTextNode("SMF");

		c_node5 = node1.addChildElement("password");
		c_node5.addTextNode("11111111");

		stub.setHeader(header);

		response = stub.simSwap(request);

		return response;
	}
	public void updateStatusDb(SIMSwapResponse response,
			SimSwapRetryCursorData cursorData) throws SMFAgentException {
		SimSwapRetryUpdateData data = null;
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
			
			if(cursorData.getOld_msisdn_no()!=null)
			replyToSubscriber.setMsisdn1(cursorData.getOld_msisdn_no());
			
			if(cursorData.getNew_msisdn_no()!=null)
				replyToSubscriber.setMsisdn1(cursorData.getNew_msisdn_no());
				
			if(cursorData.getOld_imsi()!=null)
			replyToSubscriber.setIMSIs(cursorData.getOld_imsi().toString());
			
			if(cursorData.getNew_imsi()!=null)
				replyToSubscriber.setIMSIs(cursorData.getNew_imsi().toString());
				
			if(cursorData.getNew_sim()!=null)
			replyToSubscriber.setSim1(cursorData.getNew_sim().toString());
			
			if(cursorData.getOld_sim()!=null)
				replyToSubscriber.setSim1(cursorData.getOld_sim().toString());
				
			
			
			neResponse=helper.sendMsgToSubscriber(replyToSubscriber);
			  resp=response.getResponseData().getRespdescription()+"::"+neResponse;
			
		}
		
		data = setData(response, cursorData);
		
		if(!response.getResponseData().getReturnCode().equalsIgnoreCase("0") && cursorData.getNotification_flag().equalsIgnoreCase("Y") )
		{
			data.setPi_remarks(resp);
		}
		
		logger.info("Setting Data to SimSwapRetryProcessor pro_simswap_msisdn_retry_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_simswap_msisdn_retry_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);

	}
	
	public SimSwapRetryUpdateData setData(
			SIMSwapResponse response, SimSwapRetryCursorData cursorData) {
		SimSwapRetryUpdateData data = new SimSwapRetryUpdateData();
		if (response.getResponseData().getReturnCode() != null
				&& response.getResponseData().getReturnCode().equalsIgnoreCase("0")) {
			data.setPi_status("SUCCESS");
		} else
			data.setPi_status("FAIL");

		if (response.getResponseData().getRespdescription() != null)
			data.setPi_remarks(response.getResponseData().getRespdescription());

		if (cursorData.getRetry_transaction_id() != null)
			data.setPi_trans_id(cursorData.getRetry_transaction_id());
		if (cursorData.getNetwork_id() != null)
			data.setPi_network_id(cursorData.getNetwork_id().longValue());

		return data;
	}
	
	public void failUpdate(SimSwapRetryCursorData cursorData,String msg)
	{
		
		
		SimSwapRetryUpdateData data = new SimSwapRetryUpdateData();
		
		data.setPi_trans_id(cursorData.getRetry_transaction_id());
		data.setPi_network_id(cursorData.getNetwork_id().longValue());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);
		
		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_simswap_msisdn_retry_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);
		
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	

}
