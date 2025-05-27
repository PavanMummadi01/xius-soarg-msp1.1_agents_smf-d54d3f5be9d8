package com.xius.smf.ne;

import java.math.BigInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.ne.NotificationManagement_xsd.MessageType;
import com.xius.ne.NotificationManagement_xsd.NotifyMessageRequest;
import com.xius.ne.NotificationManagement_xsd.NotifyMessageResponse;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

public class NPRsmsConfirmationHelper {

	
	static Logger logger = LogManager.getLogger("NPRsmsConfirmationHelper");
	//static String CommunicationMode=InitiateAll.getSMFProps().getProperty("ne.modeofcomm");
	
	/*public NPRsmsConfirmationData getMsisdnsAndExpectedTimes(MVNOMessage message) throws MNPGatewayException{
		
		NPRsmsConfirmationData data = setMOSRequest(message);
		try{
			SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_po_sms_comfirm_insert", data, data);			
			
			Long errorCode = data.getPo_error_code();		
			String errorMessage = data.getPo_error_desc();
			
			Utilities.commitOrRollback(factory, errorCode);	
			
				if(logger.isDebugEnabled()){
					logger.log(BCGLevel.DEBUG, "ErrorCode from pro_po_sms_comfirm_insert at  NPRsmsConfirmationHelper = "+errorCode);
					logger.log(BCGLevel.DEBUG, "errorMessage from pro_po_sms_comfirm_insert at NPRsmsConfirmationHelper = "+errorMessage);
				}
			}catch(Exception e){
				logger.log(BCGLevel.ERROR,"In Exception at getMsisdnsAndExpectedTimes of class NPRsmsConfirmationHelper )");
				logger.log(BCGLevel.ERROR,Utilities.getStackTrace(e));
				throw Utilities.setRejectDetails(MNPGatewayConstants.DB_INTERNAL_ERROR_CODE, null);
		}	
		
		return data;
	}

	private NPRsmsConfirmationData setMOSRequest(MVNOMessage message) {
		
		NPRsmsConfirmationData requestData=new NPRsmsConfirmationData();
		
		requestData.setMpgsPortId(message.getPortingData().getPortMessage().getPortId());
		
		NumberDataType[] numbertoPort= message.getPortingData().getPortMessage().getNumbersToPort();
		BigDecimal[] msisdns=new BigDecimal[numbertoPort.length];
		for (int i=0;i<numbertoPort.length;i++){
			msisdns[i]=BigDecimal.valueOf(Long.parseLong(numbertoPort[i].getMsisdn()));
		}
		requestData.setPortOutMsisdns(msisdns);
		
		Long networkID = Long.parseLong((String)InitiateAll.getMNPProps().get("networkid"));
		if(networkID == null ) {
			networkID = 1L; 
		}
		requestData.setPi_network_id(networkID);
		return requestData;
	}
	
	
	public void sendToMVNOServiceQueue(MVNOMessage message) throws MNPGatewayException{
		MPGSMDBCommunicator mpgsMDCommunicator=new MPGSMDBCommunicator();
		MPGSMessage mpgsmessage=new MPGSMessage();
		mpgsmessage.setDataObj(message);
		mpgsmessage.setMessageCode(MNPGatewayConstants.NPR_NE);
		mpgsMDCommunicator.sendMessageToMPGSQueue(mpgsmessage);
	}
	
	public void askSubscriberForNPRConfirmation(MPGSMessage message ) {
		NPRsmsConfirmationData smsData=null;
		MVNOMessage mvnoMsg=(MVNOMessage)message.getDataObj();
		try{
			smsData=getMsisdnsAndExpectedTimes(mvnoMsg);
		}catch(Exception e){
			e.printStackTrace();
		}
		BigDecimal[] msisdnsToConfirm=smsData.getPortOutMsisdns();
		String msisdnsExptRespTime=smsData.getExpectedTimestamp();
		for (int i=0;i<msisdnsToConfirm.length;i++){
			TempMessageInfo temp=new TempMessageInfo();
			temp.setDestMSISDNs(msisdnsToConfirm[i].toString());
			if(msisdnsExptRespTime!=null)
				//temp.setDate1(new Date(msisdnsExptRespTime));
				//Changed target variable from date1 to userdefined2 cause NE date field(via websevice) doesnt support time along with date
				temp.setUserDefined2(msisdnsExptRespTime);
			temp.setEventReferenceCode(InitiateAll.getMNPProps().getProperty("AskForPortOutConfimation_Event"));
			temp.setUserDefined1(InitiateAll.getMNPProps().getProperty("DynamicContentForNE"));
			sendMsgToSubscriber(temp);
		}
	}*/
	public NotifyMessageResponse sendMsgToSubscriber(TempMessageInfo smsData ) {
		if(logger.isDebugEnabled()){
			logger.debug( "Sending msg to msisdn:"+smsData.getDestMSISDNs()+" for Event refCode="+smsData.getEventReferenceCode());
		}
			//NEMDBCommunicator comm=null;
			NotifyMessageRequest request=null;
			NotifyMessageResponse response=null;
			try{
				
				
					smsData.setLoginId(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.loginid));
					smsData.setLoginPassword(InitiateAll.getSMFProps().getProperty(SMFAgentConstants.password));
				/*if(logger.isDebugEnabled()){
					logger.log(BCGLevel.DEBUG, "Mode of Communication to NE queue(0)/webservice(1):: "+CommunicationMode);
				}
				if("0".equalsIgnoreCase(CommunicationMode)){
					if(logger.isDebugEnabled()){
						logger.log(BCGLevel.DEBUG, "Communication to NE via External Queue");
					}
					//comm=new NEMDBCommunicator();
					//comm.sendMessageToNEQueue(smsData);
				}else {*/
					if(logger.isDebugEnabled()){
						logger.debug( "Communication to NE via webservice");
					}
					request=setNEWebServiceRequest(smsData);
					
						response=NEServiceInvoker.invokeNotifyMessageFromNE(request,smsData);
						if(logger.isDebugEnabled()){
							if(response!=null)
								logger.debug( "TransId from NE via Websevice:"+response.getTransID());
						}
				//}
						
						
			} 
			catch(Exception e){
				logger.debug( "Exception from NE");
				logger.error( "Error in sending msg to msisdn:"+smsData.getDestMSISDNs()+" for Event refCode="+smsData.getEventReferenceCode());
				logger.error( "Error Trace:"+Utilities.getStackTrace(e));
			}
			
			return response;
	}
	
	
	public NotifyMessageResponse sendEmailToNE(TempMessageInfo smsData,String getLoginIdPass) {
		if(logger.isDebugEnabled()){
			logger.debug( "Sending email to emailId:"+smsData.getEmailTo()+" for Event refCode="+smsData.getEventReferenceCode());
		}
			NotifyMessageRequest request=null;
			NotifyMessageResponse response=null;
			try{
				
				String getLoginId[] = getLoginIdPass.split(",");
				smsData.setLoginId(getLoginId[0]);
				smsData.setPassword(getLoginId[1]);
				smsData.setLoginPassword(getLoginId[1]);
					if(logger.isDebugEnabled()){
						logger.debug( "Communication to NE via webservice");
					}
					request=setNEWebServiceRequest(smsData);
					
						response=NEServiceInvoker.invokeNotifyMessageFromNE(request,smsData);
						if(logger.isDebugEnabled()){
							if(response!=null)
								logger.debug( "TransId from NE via Websevice:"+response.getTransID());
						}
			} 
			catch(Exception e){
				logger.debug( "Exception from NE");
				logger.error( "Error in sending email to emailId:"+smsData.getEmailTo()+" for Event refCode="+smsData.getEventReferenceCode());
				logger.error( "Error Trace:"+Utilities.getStackTrace(e));
			}
			
			return response;
	}
	
	public NotifyMessageResponse sendMsgToNE(TempMessageInfo smsData,String getLoginIdPass) {
		if(logger.isDebugEnabled()){
			logger.debug( "Sending msg to msisdn:"+smsData.getDestMSISDNs()+" for Event refCode="+smsData.getEventReferenceCode());
		}
			NotifyMessageRequest request=null;
			NotifyMessageResponse response=null;
			try{
				
				String getLoginId[] = getLoginIdPass.split(",");
				smsData.setLoginId(getLoginId[0]);
				smsData.setPassword(getLoginId[1]);
				smsData.setLoginPassword(getLoginId[1]);
					if(logger.isDebugEnabled()){
						logger.debug( "Communication to NE via webservice");
					}
					request=setNEWebServiceRequest(smsData);
					
						response=NEServiceInvoker.invokeNotifyMessageFromNE(request,smsData);
						if(logger.isDebugEnabled()){
							if(response!=null)
								logger.debug( "TransId from NE via Websevice:"+response.getTransID());
						}
			} 
			catch(Exception e){
				logger.debug( "Exception from NE");
				logger.error( "Error in sending msg to msisdn:"+smsData.getDestMSISDNs()+" for Event refCode="+smsData.getEventReferenceCode());
				logger.error( "Error Trace:"+Utilities.getStackTrace(e));
			}
			
			return response;
	}
	
	private NotifyMessageRequest setNEWebServiceRequest(TempMessageInfo smsData) {
		NotifyMessageRequest request=new NotifyMessageRequest();
		MessageType messageType=new MessageType();
		if(smsData.getUserDefined2()!=null){
			messageType.setUserDefined2(smsData.getUserDefined2());
		}
		if(Utilities.isNull(smsData.getDestMSISDNs())==false){
			messageType.setDestMSISDNs(smsData.getDestMSISDNs());
		}
		if(Utilities.isNull(smsData.getEventReferenceCode())==false){
			messageType.setEventReferenceCode(smsData.getEventReferenceCode());
		}
		
		if(Utilities.isNull(smsData.getUserDefined1())==false){
			messageType.setUserDefined1(smsData.getUserDefined1());
		}
		if(Utilities.isNull(smsData.getLoginId())==false){
			messageType.setLoginId(smsData.getLoginId());
		}
		if(Utilities.isNull(smsData.getLoginId())==false){
			messageType.setLoginPassword(smsData.getLoginPassword());
		}
		
		if(smsData.getNetworkId()!=null)
		messageType.setNetworkId(new BigInteger(smsData.getNetworkId()));
		
		if(smsData.getMsisdn1()!=0){
			messageType.setMsisdn1(smsData.getMsisdn1());
		}
		if(smsData.getIMSIs()!=null)
			messageType.setIMSIs(smsData.getIMSIs());
		
		if(smsData.getSim1()!=null)
			messageType.setSim1(smsData.getSim1());
		
		
		if(smsData.getMsisdn2()!=0)
			messageType.setMsisdn2(smsData.getMsisdn2());
		
		if(smsData.getSim2()!=null)
			messageType.setSim2(smsData.getSim2());
		
		if(smsData.getEmailTo() !=null)
			messageType.setEmailTo(smsData.getEmailTo());
		
		if(smsData.getEmailFrom() !=null)
			messageType.setEmailFrom(smsData.getEmailFrom());
		
		if(smsData.getUserDefined4() !=null)
			messageType.setUserDefined4(smsData.getUserDefined4());
		
		if(smsData.getSubject()!=null)
			messageType.setSubject(smsData.getSubject());
		if(smsData.getUserDefined3() !=null)
			messageType.setUserDefined3(smsData.getUserDefined3());
		if(smsData.getUserDefined5() !=null)
			messageType.setUserDefined5(smsData.getUserDefined5());
		if(smsData.getUserDefined6() !=null)
			messageType.setUserDefined6(smsData.getUserDefined6());
		if(smsData.getUserDefined7() !=null)
			messageType.setUserDefined7(smsData.getUserDefined7());
		
		messageType.setSyncFlag("A");
		request.setMessageType(messageType);
		
		return request;
	}

	/*public void sendPortOutFailSmsToSubscribers(NPRsmsConfirmationData message ) {
		BigDecimal[] msisdns=message.getPortOutMsisdns();
		TempMessageInfo temp=new TempMessageInfo();
		if(msisdns.length > 1)
			temp.setEventReferenceCode(InitiateAll.getMNPProps().getProperty("CancellingPortOut_MultipleMsisdn_Event"));
		else
			temp.setEventReferenceCode(InitiateAll.getMNPProps().getProperty("CancellingPortOut_SingleMsisdn_Event"));
		for (int i=0;i<msisdns.length;i++){
			temp.setDestMSISDNs(msisdns[i].toString());
			temp.setUserDefined1(InitiateAll.getMNPProps().getProperty("DynamicContentForNE"));
			sendMsgToSubscriber(temp);
		}
	}*/
	
}
