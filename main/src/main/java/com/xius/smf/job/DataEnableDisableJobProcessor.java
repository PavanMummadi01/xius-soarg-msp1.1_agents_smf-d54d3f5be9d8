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

import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdRequest;
import com.xius.smf.client.invoker.MDNbasedGetNwIdInvoker;
import com.xius.smf.domaindata.DataEnableDisableCursorData;
import com.xius.smf.domaindata.BulkCorpRctUpdateData;
import com.xius.smf.domaindata.DataEnableDisableData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.GetNetworkName;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.tia.TMobile_wsdl.TMobileBindingStub;
import com.xius.tia.TMobile_wsdl.TMobileLocator;
import com.xius.tia.TMobile_xsd.AddProductRequest;
import com.xius.tia.TMobile_xsd.AddProductResponse;
import com.xius.tia.TMobile_xsd.RemoveProductRequest;
import com.xius.tia.TMobile_xsd.RemoveProductResponse;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.ETopUpDetailsType;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.common.UserType;
import com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdRequest;
import com.xius.xbus.messages.selfcare.corpcustomerservice.ActivateCorpRCProdResponse;
import com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceBindingStub;
import com.xius.xbus.services.selfcare.corpcustomerservice.CorpCustomerServiceLocator;

public class DataEnableDisableJobProcessor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(DataEnableDisableJobProcessor.class.getSimpleName());
	CountDownLatch latch=null;
	DataEnableDisableCursorData cursorData=null;
	public DataEnableDisableJobProcessor(CountDownLatch latch,DataEnableDisableCursorData curData){
		this.latch=latch;
		this.cursorData=curData;
	}
	public void run() {
		logger.info("---------In DataEnableDisableJobProcessor run------------ transid "+cursorData.getTransaction_id());
	
	AddProductRequest request = null;
	AddProductResponse response = null;
		RemoveProductRequest removeReq=null;
		RemoveProductResponse removeRes=null;

		MDNbasedGetNwIdInvoker getNwIdInvoker=new MDNbasedGetNwIdInvoker();
		
		HeaderDetails details=new HeaderDetails();
		details.setLoginID("chief"); //dummy
		details.setNetworkID(cursorData.getNetwork_id());
		details.setRequestID("123"); //dummy
		details.setPassword("12345678"); //dummy
		
		MDNBasedGetNwIdRequest idRequest=new MDNBasedGetNwIdRequest();
		
		idRequest.setMSISDN(cursorData.getMsisdn().toString());
		
		 String sim=null;
		try {
			
			sim = getNwIdInvoker.MDNbasedGetNwId(details, idRequest).getSIM();
			
		} catch (SMFAgentException e1) {
			logger.error("SMFAgentException in DataEnableDisableJobProcessor while getting Sim transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e1));
		}
		
	
		try {
			if(cursorData.getSet_gprs_to().equalsIgnoreCase("E")){
				removeReq = setRemoveRequest(cursorData,sim);
				removeRes = callTIAForRemove(removeReq, cursorData);
				updateStatusDb(response,removeRes, cursorData);
					
			}else if(cursorData.getSet_gprs_to().equalsIgnoreCase("D")){
				request = setAddRequest(cursorData,sim);
				response = callTIAForAdd(request, cursorData);
				updateStatusDb(response,removeRes, cursorData);
			}
			
		}
			catch (AxisFault e) {

			String errormsg=InitiateAll.getErrorProps().getProperty(SMFAgentConstants.INTERNAL_ERROR_CODE_STR);
			String errorcode=SMFAgentConstants.INTERNAL_ERROR_CODE_STR;

			logger.error("Communication error from TIA:: transid "+cursorData.getTransaction_id()+" "+errorcode+":"+errormsg);
			failUpdate(cursorData,errormsg);

			logger.error(""+Utilities.getStackTrace( e ) );


		}

		catch (MalformedURLException e) {

		logger.error("MalformedURLException in DataEnableDisableJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (RemoteException e) {

			logger.error("RemoteException in DataEnableDisableJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SOAPException e) {

			logger.error("SOAPException in DataEnableDisableJobProcessor transid "+cursorData.getTransaction_id()+Utilities.getStackTrace(e));
		} catch (SMFAgentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			latch.countDown();
		}

	}


	public AddProductRequest setAddRequest(DataEnableDisableCursorData cursorData, String sim) {
		AddProductRequest addProductReqst = new AddProductRequest();
		if(cursorData.getMsisdn()!=null){
	
			addProductReqst.setMSISDN(cursorData.getMsisdn().toString());
		}
		addProductReqst.setICCID(sim);
		addProductReqst.setIsBaseProduct(InitiateAll.getSMFProps().getProperty("Baseproduct"));
		addProductReqst.setPartnerTransactionID(cursorData.getTransaction_id());
		addProductReqst.setProductID(InitiateAll.getSMFProps().getProperty("ProductID"));
		
		
		return addProductReqst;
	}
	
	public RemoveProductRequest setRemoveRequest(DataEnableDisableCursorData cursorData, String sim) {
		RemoveProductRequest RemoveProductReqst = new RemoveProductRequest();
		if(cursorData.getMsisdn()!=null){
	
			RemoveProductReqst.setMSISDN(cursorData.getMsisdn().toString());
		}
		RemoveProductReqst.setICCID(sim);
		RemoveProductReqst.setIsBaseProduct(InitiateAll.getSMFProps().getProperty("Baseproduct"));
		RemoveProductReqst.setPartnerTransactionID(cursorData.getTransaction_id());
		RemoveProductReqst.setProductID(InitiateAll.getSMFProps().getProperty("ProductID"));
		
		
		return RemoveProductReqst;
	}


	public RemoveProductResponse callTIAForRemove(
			RemoveProductRequest request, DataEnableDisableCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		RemoveProductResponse response=null;
		TMobileLocator service = null;
		TMobileBindingStub stub=null;
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_ENABLE_DISABLE_TIA_URL);
		SOAPHeaderElement header=  headerform( cursorData);

		

		if (logger.isInfoEnabled())
			logger.info("Calling TIA with the url for RemoveProductResponse  ===> : "+ url);
	       
			 response=new RemoveProductResponse();
			 service=new TMobileLocator();
			 stub = new TMobileBindingStub(new URL(url), service);
			 stub.setHeader(header);
			 response = stub.removeProduct(request);
		return response;
	}

	
	public AddProductResponse callTIAForAdd(
			AddProductRequest request, DataEnableDisableCursorData cursorData)
			throws AxisFault,MalformedURLException, RemoteException, SOAPException {
		AddProductResponse response=null;
		TMobileLocator service = null;
		TMobileBindingStub stub=null;
		SOAPHeaderElement header =  headerform( cursorData);
		String url = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.DATA_ENABLE_DISABLE_TIA_URL);
		if (logger.isInfoEnabled())
			logger.info("Calling TIA with the url for AddProductResponse  ===> : "+ url);
	       
			 response=new AddProductResponse();                
			 service=new TMobileLocator();
			 stub = new TMobileBindingStub(new URL(url), service);
				stub.setHeader(header);
			 response = stub.addProduct(request);
		return response;
	}



	public void updateStatusDb(AddProductResponse response,RemoveProductResponse rresponse,
			DataEnableDisableCursorData cursorData) throws SMFAgentException {
		DataEnableDisableData data = null;
		
		data = setData(response,rresponse,cursorData);
		try {
		logger.info("Setting Data to DataEnableDisableJobProcessor pro_switch_gprs_manage"+data.toString());
		SPFactory factory= ServiceUtils.executeSPWithOutCommit("pro_switch_gprs_manage", data, data);

		Long errorcode = data.getPo_error_code();
		Utilities.commitOrRollback(factory, errorcode);
	} catch (SMFAgentException e) {
		e.printStackTrace();
	}

	}

	public DataEnableDisableData setData(AddProductResponse response, RemoveProductResponse rresponse,DataEnableDisableCursorData cursorData) {
		DataEnableDisableData data = new DataEnableDisableData();

		data.setPi_network_id(cursorData.getNetwork_id());

		data.setPi_transaction_id(cursorData.getTransaction_id());
		data.setPi_flag("UPDATE");
	   data.setPi_set_gprs_to(cursorData.getSet_gprs_to());
	
		data.setPi_account_id(cursorData.getAccount_id());
      data.setPi_event_code(cursorData.getEvt_code());
		if(response!=null)
		{
		if(response.getStatus().equalsIgnoreCase("SUCCESS"))
		{
		
			data.setPi_status("SUCCESS");
			data.setPi_reason(response.getResult()+":"+response.getResultStatus());
		}else
		{
			
			data.setPi_status("FAIL");
			data.setPi_reason(response.getResult()+":"+response.getResultStatus());
			
		}
		}else if(rresponse!=null){
			if(rresponse.getStatus().equalsIgnoreCase("success"))
			{
			
				data.setPi_status("SUCCESS");
				data.setPi_reason(rresponse.getResult()+":"+rresponse.getResultStatus());
			}else
			{
				
				data.setPi_status("FAIL");
				data.setPi_reason(rresponse.getResult()+":"+rresponse.getResultStatus());
				
			}
		}
		return data;
	}

	public void failUpdate(DataEnableDisableCursorData cursorData,String msg)
	{
		DataEnableDisableData data = new DataEnableDisableData();

		data.setPi_transaction_id(cursorData.getTransaction_id());
		
		data.setPi_set_gprs_to(cursorData.getSet_gprs_to());
			data.setPi_account_id(cursorData.getAccount_id());
		
		data.setPi_network_id(cursorData.getNetwork_id());
		data.setPi_reason("FAIL");
		data.setPi_status("FAIL");
		data.setPi_flag("UPDATE");

		try {
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_switch_gprs_manage", data, data);
			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);

		} catch (SMFAgentException e) {
			e.printStackTrace();
		}



	}
	
	public SOAPHeaderElement headerform(DataEnableDisableCursorData cursorData)
	{
		SOAPHeaderElement header = new SOAPHeaderElement("http://tia.xius.com/common/header/HeaderDetails.xsd","messageHeader");
		header.setActor(null);
		header.setPrefix("head");
		SOAPElement node1;
		SOAPElement c_node1;
		SOAPElement c_node2;
		SOAPElement c_node3;
		SOAPElement c_node4;
		SOAPElement c_node5;
		try {
			node1 = header.addChildElement("trackingMessageHeader");
		
		c_node1 = node1.addChildElement("messageId");
		c_node1.addTextNode("23023"); // dummy value

		c_node2 = node1.addChildElement("carrierId");
		c_node2.addTextNode(cursorData.getNetwork_id().toString());

		String nwName = GetNetworkName.getName(cursorData.getNetwork_id().toString());
		logger.info("NetworkName read from Property File : "+nwName);
		c_node3 = node1.addChildElement("networkName");
		c_node3.addTextNode(nwName);

		c_node4 = node1.addChildElement("userId");
		c_node4.addTextNode("SMF");

		c_node5 = node1.addChildElement("password");
		c_node5.addTextNode("11111111");
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return header;
	}
	
}
