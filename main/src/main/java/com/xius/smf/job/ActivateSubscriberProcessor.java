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

import com.xius.smf.domaindata.HlrStateChangeNotifUpdate;
import com.xius.smf.domaindata.HlrStateChngCurData;
import com.xius.smf.domaindata.SIMSaleData;
import com.xius.smf.domaindata.UpdateSIMSaleData;
import com.xius.smf.exceptions.SMFAgentException;
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

public class ActivateSubscriberProcessor implements Runnable {
	private static final Logger logger = LogManager.getLogger(ActivateSubscriberProcessor.class.getSimpleName());

	CountDownLatch latch = null;
	HlrStateChngCurData cursorData = null;
	boolean smfflag;
	SIMSaleData simSaleData=null;
	
	public ActivateSubscriberProcessor(CountDownLatch latch,
			HlrStateChngCurData curData,boolean smfflag) {
		this.latch = latch;
		this.cursorData = curData;
        this.smfflag=smfflag;  
	}

	public void run() {
	
SMFSimSaleInsertProcessor  smfsimsaleinsertprocessor=new SMFSimSaleInsertProcessor(cursorData);
logger.info("---------In ActivateSubscriberProcessor run------------");
ActivateSubscriberRequest request = null;
ActivateSubscriberResponse response = null;



   if(smfflag){
	 simSaleData=smfsimsaleinsertprocessor.callSIMSaleInsert();
	 
	 request=setSMFRequest(simSaleData);             
		
     } else{
	 request = setRequest(cursorData);
     }
		
		try {
			response = callTia(request, cursorData);

			if (response != null)
				try {
					updateStatusDb(response, cursorData,smfflag,smfsimsaleinsertprocessor);

				} catch (SMFAgentException e) {
					
					logger.error("SMFAgentException in ActivateSubscriberProcessor "+Utilities.getStackTrace(e));
				}

		}
			catch (AxisFault e) {
			
			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.TIA_ERRCODE);
			String errorcode=SMFAgentConstants.TIA_ERRCODE;
			
			logger.error("Communication error from TIA:: "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg,smfsimsaleinsertprocessor,smfflag);
			
			logger.error(""+Utilities.getStackTrace( e ) );
			
			
		} 
		
		catch (MalformedURLException e) {
			
		logger.error("MalformedURLException in ActivateSubscriberProcessor "+Utilities.getStackTrace(e));
		} catch (RemoteException e) {
			
			logger.error("RemoteException in ActivateSubscriberProcessor "+Utilities.getStackTrace(e));
		} catch (SOAPException e) {
			
			logger.error("SOAPException in ActivateSubscriberProcessor "+Utilities.getStackTrace(e));
		}
		finally {			
			latch.countDown();
		}

	}

	public ActivateSubscriberRequest setRequest(HlrStateChngCurData cursorData) {
		ActivateSubscriberRequest request = new ActivateSubscriberRequest();
		logger.info("Setting Request For TIA ActivateSubscriberProcessor with "+cursorData.toString());
		
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
		if (cursorData.getExt_trans_id() != null)
			reqdata.setTransactionId(cursorData.getExt_trans_id());
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
	
	public ActivateSubscriberRequest setSMFRequest(SIMSaleData simSaleData) {
		ActivateSubscriberRequest request = new ActivateSubscriberRequest();
		logger.info("Setting Request For TIA ActivateSubscriberProcessor with "+simSaleData.toString());
		
		SubscriberRequestType subreq=new SubscriberRequestType();
		RequestData reqdata=new RequestData();
		if (simSaleData.getPi_new_imsi() != null)
			subreq.setNewIMSI(simSaleData.getPi_new_imsi().toString());
		
		if (simSaleData.getPi_new_msisdn()!= null)
			subreq.setNewMSISDN(simSaleData.getPi_new_msisdn().toString());
		
		if (simSaleData.getPi_new_sim() != null)
			subreq.setNewICC(simSaleData.getPi_new_sim());
		
		if (simSaleData.getPi_technology() != null)
			reqdata.setTechnology(simSaleData.getPi_technology());
		
		if (simSaleData.getPo_trans_id() != null)
			reqdata.setTransactionId(simSaleData.getPo_trans_id());
		
		if (simSaleData.getPi_new_account_id() != null)
			reqdata.setExtenalAccountId(simSaleData.getPi_new_account_id().toString());
			subreq.setRequestData(reqdata);
			request.setSubscriberData(subreq);
		
		if (simSaleData.getPi_new_imsi() != null)
			request.setIMSI(simSaleData.getPi_new_imsi().toString());

		if (simSaleData.getPi_new_msisdn() != null)
			request.setMSISDN(simSaleData.getPi_new_msisdn().toString());
		
		if (simSaleData.getPi_new_sim()  != null)
			request.setICC(simSaleData.getPi_new_sim());
		
		

		return request;

	}
	
	

	public ActivateSubscriberResponse callTia(
			ActivateSubscriberRequest request, HlrStateChngCurData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		ActivateSubscriberResponse response = new ActivateSubscriberResponse();
		TIAManagementLocator service = new TIAManagementLocator();
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_URL);
		logger.info("Hitting TIA with the url from ActivateSubscriberProcessor"+url);
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
		if(smfflag){
		c_node2.addTextNode(simSaleData.getPi_network_id().toString());
		}else{
		c_node2.addTextNode(cursorData.getNetwork_id().toString());	
		}
		String nwName=null;
		if(smfflag){
		 nwName = GetNetworkName.getName(simSaleData.getPi_network_id().toString());		
		}else{
	     nwName = GetNetworkName.getName(cursorData.getNetwork_id().toString());
		}
	     logger.info("NetworkName read from Property File ActivateSubscriberProcessor: "+nwName);
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
			HlrStateChngCurData cursorData,boolean smfflag,SMFSimSaleInsertProcessor  smfsimsaleinsertprocessor) throws SMFAgentException {
		
		HlrStateChangeNotifUpdate data = null;
           if(smfflag){
       UpdateSIMSaleData    updateSIMSaleData=setSMFData(response);
       logger.info("Setting Data to ActivateSubscriberProcessor sim_sale_update"+updateSIMSaleData.toString());
       smfsimsaleinsertprocessor.SIMSaleUpdate(updateSIMSaleData); 
        	   
           }else{
		data = setData(response, cursorData);
		logger.info("Setting Data to ActivateSubscriberProcessor pro_hlr_statechange_notif_upd"+data.toString());
		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_hlr_statechange_notif_upd", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);
           }
	}
	
	
	public UpdateSIMSaleData setSMFData(ActivateSubscriberResponse response) {
		UpdateSIMSaleData data = new UpdateSIMSaleData();
		if (response.getResponseData().getReturnCode() != null
				&& response.getResponseData().getReturnCode().equalsIgnoreCase("0")) {
			data.setPi_status("SUCCESS");
		} else
			data.setPi_status("FAIL");

		if (response.getResponseData().getRespdescription() != null)
			data.setPi_remarks(response.getResponseData().getRespdescription());

		if (simSaleData.getPo_trans_id() != null)
			data.setPi_trans_id(simSaleData.getPo_trans_id());
		if (simSaleData.getPi_network_id() != null)
			data.setPi_network_id(simSaleData.getPi_network_id().longValue());
		if(null!=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMF_CURRENTSTATE_ID))
		data.setPi_curr_state_id(new Long(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMF_CURRENTSTATE_ID)));
		
		
		if(response.getResponseData().getResponsecode()!=null)
		{
		 data.setPi_response_code( response.getResponseData().getResponsecode());
		 data.setPi_ext_error_code(response.getResponseData().getResponsecode());
		}   
		
		
		return data;
	}
	
		
	
	public HlrStateChangeNotifUpdate setData(
			ActivateSubscriberResponse response, HlrStateChngCurData cursorData) {
		HlrStateChangeNotifUpdate data = new HlrStateChangeNotifUpdate();
		if (response.getResponseData().getReturnCode() != null
				&& response.getResponseData().getReturnCode().equalsIgnoreCase("0")) {
			data.setPi_status("SUCCESS");
		} else
			data.setPi_status("FAIL");

		if (response.getResponseData().getRespdescription() != null)
			data.setPi_remarks(response.getResponseData().getRespdescription());

		if (cursorData.getExt_trans_id() != null)
			data.setPi_transaction_id(cursorData.getExt_trans_id());
		if (cursorData.getNetwork_id() != null)
			data.setPi_network_id(cursorData.getNetwork_id().longValue());

		return data;
	}
	
	
	public void failUpdate(HlrStateChngCurData cursorData,String msg,SMFSimSaleInsertProcessor  smfsimsaleinsertprocessor,boolean smfflag)
	{
		if(smfflag){
			logger.error("Setting Failure status to ActivateSubscriberProcessor");
			UpdateSIMSaleData updateSIMSaleData = new UpdateSIMSaleData();
			updateSIMSaleData.setPi_trans_id(simSaleData.getPo_trans_id());
			updateSIMSaleData.setPi_network_id(simSaleData.getPi_network_id());
			updateSIMSaleData.setPi_status("FAIL");
			updateSIMSaleData.setPi_remarks(msg);
			updateSIMSaleData.setPi_ext_error_code("40000");
			if(null!=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMF_CURRENTSTATE_ID))
			updateSIMSaleData.setPi_curr_state_id(new Long(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.SMF_CURRENTSTATE_ID)));
		//	updateSIMSaleData.setPi_ext_trans_id(pi_ext_trans_id);
		smfsimsaleinsertprocessor.SIMSaleUpdate(updateSIMSaleData);
		}else{
		HlrStateChangeNotifUpdate data = new HlrStateChangeNotifUpdate();
		
		data.setPi_transaction_id(cursorData.getExt_trans_id());
		data.setPi_network_id(cursorData.getNetwork_id().longValue());
		data.setPi_status("FAIL");
		data.setPi_remarks(msg);
		
		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_hlr_statechange_notif_upd", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);
		
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		
	}

}
