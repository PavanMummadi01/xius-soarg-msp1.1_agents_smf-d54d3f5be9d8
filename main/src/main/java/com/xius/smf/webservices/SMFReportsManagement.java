package com.xius.smf.webservices;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.server.endpoint.annotation.SoapHeader;

import com.xius.agent.smf.common.error.errordetails.ErrorDetailsType;
import com.xius.agent.smfreport.smfreportsmanagement.CaGroupTransactionReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.CaGroupTransactionReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.FiveGReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.FiveGReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.GetAccountActDeactCancelReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.GetAccountActDeactCancelReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.ObjectFactory;
import com.xius.agent.smfreport.smfreportsmanagement.SlpnPointsTransactionReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.SlpnPointsTransactionReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.StateChangeReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.StateChangeReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.VolteProcessReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.VolteProcessReportResponse;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.log.LogExecutionTime;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.CaGroupTransactionReportImpl;
import com.xius.smf.webservices.smfservices.FiveGReportImpl;
import com.xius.smf.webservices.smfservices.GetAccountActDeactCancelReportImpl;
import com.xius.smf.webservices.smfservices.SlpnPointsTransactionReportImpl;
import com.xius.smf.webservices.smfservices.StateChangeReportImpl;
import com.xius.smf.webservices.smfservices.VolteProcessReportImpl;

@Endpoint
public class SMFReportsManagement {
	private  static final Logger logger = LogManager.getLogger(SMFReportsManagement.class.getSimpleName());

	@Autowired
	private ApplicationContext context;

	@Autowired
	private Utilities Utilities;

	private static final String NAME_SPACE = "http://smfreport.agent.xius.com/SMFReportsManagement.xsd";

	private static final String HEADER_DETAILS = "{" + "http://smf.agent.xius.com/common/header/HeaderDetails.xsd"
			+ "}messageHeader";

	ObjectFactory factory = new ObjectFactory();

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SlpnPointsTransactionReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SlpnPointsTransactionReportResponse> slpnPointsTransactionReport(@RequestPayload SlpnPointsTransactionReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		logger.info("The call reached the smfrepoprt slpn reports");
		long startTime = System.currentTimeMillis();
        long endTime   = 0;
        SlpnPointsTransactionReportResponse response=new SlpnPointsTransactionReportResponse();
        try{
        	SlpnPointsTransactionReportImpl impl=(SlpnPointsTransactionReportImpl) context.getBean("SlpnPointsTransactionReportImpl");
           response= impl.getslpnPointsTransactionReport(request, headerDetails);
        }
        catch (SMFAgentException selfCareException) {
            ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(selfCareException);
            endTime = System.currentTimeMillis();
            logger.error( " slpnPointsTransactionReport request failed..." + Utilities.getStackTrace(selfCareException));

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        } catch (Exception exception) {
            endTime = System.currentTimeMillis();
            logger.error( "slpnPointsTransactionReport request failed..." + Utilities.getStackTrace(exception));

            ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        }
        
		// TODO Auto-generated method stub
		return factory.createSlpnPointsTransactionReportResponse(response);
	}

	/**
	 * This api is used for getting reactivation deactivation cancelation to ui 
	 * @req param  fromdate and todate should be given or else msisdn or operationtype or maxrecords or nextrecord index shoul be given
	 * @resp 
	 * 
	 * */
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "getAccountActDeactCancelReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetAccountActDeactCancelReportResponse> getAccountActDeactCancelReport(@RequestPayload GetAccountActDeactCancelReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		logger.info("The call reached the smfreport getAccountActDeactCancelReport");
		long startTime = System.currentTimeMillis();
        long endTime   = 0;
        GetAccountActDeactCancelReportResponse response=null;
        try{
        	GetAccountActDeactCancelReportImpl  getaccountactdeactcancelReportImpl=(GetAccountActDeactCancelReportImpl) context.getBean("GetAccountActDeactCancelReportImpl");
        	response=getaccountactdeactcancelReportImpl.getAccountActDeactCancelReport(request, headerDetails);
        	
        }catch (SMFAgentException selfAgentException) {
            ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(selfAgentException);

            endTime = System.currentTimeMillis();
            logger.error( " getAccountActDeactCancelReport request failed..." + Utilities.getStackTrace(selfAgentException));

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        } catch (Exception exception) {
            endTime = System.currentTimeMillis();
            logger.error( "getAccountActDeactCancelReport request failed..." + Utilities.getStackTrace(exception));

            ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        }	
		
		return factory.createGetAccountActDeactCancelReportResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "caGroupTransactionReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<CaGroupTransactionReportResponse> caGroupTransactionReport(@RequestPayload CaGroupTransactionReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		logger.info("The call reached the smfreport caGroupTransactionReport");
		long startTime = System.currentTimeMillis();
        long endTime   = 0;
        CaGroupTransactionReportResponse response=null;
        try{
        	CaGroupTransactionReportImpl  caGroupTransactionReportImpl=(CaGroupTransactionReportImpl) context.getBean("CaGroupTransactionReportImpl");
        	response=caGroupTransactionReportImpl.caGroupTransactionReport(request, headerDetails);
        	
        }catch (SMFAgentException selfAgentException) {
            ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(selfAgentException);

            endTime = System.currentTimeMillis();
            logger.error( " caGroupTransactionReport request failed..." + Utilities.getStackTrace(selfAgentException));

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        } catch (Exception exception) {
            endTime = System.currentTimeMillis();
            logger.error( "caGroupTransactionReport request failed..." + Utilities.getStackTrace(exception));

            ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        }
		
		
		return factory.createCaGroupTransactionReportResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "stateChangeReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<StateChangeReportResponse> stateChangeReport(@RequestPayload StateChangeReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		logger.info("The call reached the smfreport StateChangeReport");
		long startTime = System.currentTimeMillis();
        long endTime   = 0;
        StateChangeReportResponse response=null;
        try{
        	StateChangeReportImpl Impl=(StateChangeReportImpl) context.getBean("StateChangeReportImpl");
        	response=Impl.stateChangeReport(request, headerDetails);
        	
        }catch (SMFAgentException selfAgentException) {
            ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(selfAgentException);

            endTime = System.currentTimeMillis();
            logger.error( " StateChangeReport request failed..." + Utilities.getStackTrace(selfAgentException));

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        } catch (Exception exception) {
            endTime = System.currentTimeMillis();
            logger.error( "StateChangeReport request failed..." + Utilities.getStackTrace(exception));

            ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        }	
		return factory.createStateChangeReportResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "volteProcessReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<VolteProcessReportResponse> volteProcessReport(@RequestPayload VolteProcessReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
        long endTime   = 0;
       
        VolteProcessReportResponse response=null;
        try{
        	VolteProcessReportImpl Impl=(VolteProcessReportImpl) context.getBean("VolteProcessReportImpl");
        	response=Impl.volteProcessReport(request, headerDetails);
        	
        }catch (SMFAgentException selfAgentException) {
            ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(selfAgentException);

            endTime = System.currentTimeMillis();
            logger.error( " VolteProcessReport request failed..." + Utilities.getStackTrace(selfAgentException));

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        } catch (Exception exception) {
            endTime = System.currentTimeMillis();
            logger.error( "VolteProcessReport request failed..." + Utilities.getStackTrace(exception));

            ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);

            throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
        }

		
		
		return factory.createVolteProcessReportResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "fiveGReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<FiveGReportResponse> fiveGreport(@RequestPayload FiveGReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		logger.info("The call reached the SMFREPORTMANAGEMENT fiveGReport");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		FiveGReportResponse response = new FiveGReportResponse();
		try {
			FiveGReportImpl Impl=(FiveGReportImpl) context.getBean("FiveGReportImpl");
			response = Impl.fiveGreport(request, headerDetails);

		} catch (SMFAgentException selfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities
					.setErrorDetailsType(selfAgentException);

			endTime = System.currentTimeMillis();
			logger.error( " fiveGReport request failed..."
					+ Utilities.getStackTrace(selfAgentException));

			 throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "fiveGReport request failed..."
					+ Utilities.getStackTrace(exception));

			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType(
					"40000", null);

			 throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}

		return factory.createFiveGReportResponse(response);
	}
}
