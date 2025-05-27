package com.xius.smf.job;

import java.math.BigDecimal;
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

import com.xius.smf.domaindata.StChgExpDelMSISDNUpdate;
import com.xius.smf.domaindata.StateChangeExpiryPrimCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.GetNetworkName;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
import com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationBindingStub;
import com.xius.tia.SorianacardIntegration_wsdl.SorianacardIntegrationLocator;
import com.xius.tia.SorianacardIntegration_xsd.RequestType;
import com.xius.tia.SorianacardIntegration_xsd.ResponseType;

public class DeleteMSISDNProcressor implements Runnable {
	private	 static final Logger logger = LogManager.getLogger(DeleteMSISDNProcressor.class.getSimpleName());

	CountDownLatch latch = null;
	StateChangeExpiryPrimCursorData cursorData=null;
	
	public DeleteMSISDNProcressor(CountDownLatch latch,StateChangeExpiryPrimCursorData curData)
	{
		this.latch=latch;
		this.cursorData=curData;
		
	}
	public void run() {
		logger.info("---------In DeleteMSISDNProcressor run------------");
		RequestType request=null;
		ResponseType response=null;
		
		request=setRequest(cursorData);
		
		try {
			response=callTia(request);
			
			if(response!=null)
				try {
					
						
					updateStatusDb(response,cursorData);
					
					
					
				} catch (SMFAgentException e) {
					
					logger.error("SMFAgentException in DeleteMSISDNProcressor "+Utilities.getStackTrace(e));
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
			logger.error("MalformedURLException in DeleteMSISDNProcressor "+Utilities.getStackTrace(e));
		} catch (RemoteException e) {
			logger.error("RemoteException in DeleteMSISDNProcressor "+Utilities.getStackTrace(e));
		} catch (SOAPException e) {
			logger.error("SOAPException in DeleteMSISDNProcressor "+Utilities.getStackTrace(e));
		}
		finally {			
			latch.countDown();
		}
		
		
	}
	public RequestType setRequest(StateChangeExpiryPrimCursorData cursorData)
	{
		RequestType request=new RequestType();
		logger.info("Setting Request For TIA DeleteMSISDNProcressor with "+cursorData.toString());
		
		request.setCardnumber(new BigDecimal(cursorData.getCardnumber()));
		
		request.setCustomerid(Integer.parseInt(cursorData.getCustomerid()));
		
		if(cursorData.getIsPrimary().equalsIgnoreCase("Y"))
		request.setIsPrimary(true);
		else
		request.setIsPrimary(false);	
		
		request.setMSISDN(cursorData.getExp_MSISDN().toString());
		
		request.setTransactionId(cursorData.getTransactionId_del());
		
		

		return request;
		
	}
	
	public ResponseType callTia(RequestType request) throws AxisFault,MalformedURLException, RemoteException, SOAPException
	{
		ResponseType response=new ResponseType();
		SorianacardIntegrationLocator service=new SorianacardIntegrationLocator();
		String url=InitiateAll.getSMFProps().getProperty(SMFAgentConstants.TIA_SORIANA_URL);
		logger.info("Hitting TIA with the url from DeleteMSISDNProcressor"+url);
		SorianacardIntegrationBindingStub stub=new SorianacardIntegrationBindingStub(new URL(url),service);
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
			logger.info("NetworkName read from Property File DeleteMSISDNProcressor "+nwName);
			c_node3 = node1.addChildElement("networkName");
			c_node3.addTextNode(nwName);

			
			c_node4 = node1.addChildElement("userId");
			c_node4.addTextNode("SMF");
			
			c_node5 = node1.addChildElement("password");
			c_node5.addTextNode("11111111");
			
			stub.setHeader(header);
		
		response=stub.deleteMSISDN(request);
		
		
		
		
		
		
		return response;
	}
	
	public void updateStatusDb(ResponseType response,StateChangeExpiryPrimCursorData cursorData) throws SMFAgentException
	{
		StChgExpDelMSISDNUpdate data=null;
		
		data=setData(response,cursorData);
		
		logger.info("Setting Data to DeleteMSISDNProcressor pro_ext_transaction_update"+data.toString());
		SPFactory spfactory=ServiceUtils.executeSPWithOutCommit("pro_ext_transaction_update", data, data);
		
		Long errorcode=data.getPo_error_code();
		Utilities.commitOrRollback(spfactory, errorcode);
	
		
		
		
	}
	
	public StChgExpDelMSISDNUpdate setData(ResponseType response,StateChangeExpiryPrimCursorData cursorData)
	{
		StChgExpDelMSISDNUpdate data=new StChgExpDelMSISDNUpdate(); 
		
		
		
		if (response.getSuccess() != null
				&& response.getSuccess()) {
			data.setPi_trans_status("SUCCESS");
		} else
			data.setPi_trans_status("FAIL");

		if (response.getError()!= null)
			data.setPi_remarks(response.getError());

		if (cursorData.getTransactionId_del() != null)
			data.setPi_transaction_id(cursorData.getTransactionId_del());
		if (cursorData.getNetwork_id() != null)
			data.setPi_network_id(cursorData.getNetwork_id().longValue());

		return data;
	}
	
	
	public void failUpdate(StateChangeExpiryPrimCursorData cursorData,String msg)
	{
		
		
		StChgExpDelMSISDNUpdate data = new StChgExpDelMSISDNUpdate();
		
		data.setPi_transaction_id(cursorData.getTransactionId_del());
		data.setPi_network_id(cursorData.getNetwork_id().longValue());
		data.setPi_trans_status("FAIL");
		data.setPi_remarks(msg);
		
		try {
			SPFactory spfactory= ServiceUtils.executeSPWithOutCommit("pro_ext_transaction_update", data, data);
		

			Long errorcode = data.getPo_error_code();
			Utilities.commitOrRollback(spfactory, errorcode);
			
		
		} catch (SMFAgentException e) {
			
			e.printStackTrace();
		}

		
	}
	

}
