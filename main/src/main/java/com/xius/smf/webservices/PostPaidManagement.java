package com.xius.smf.webservices;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBElement;
import org.apache.axis.AxisEngine;
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
import com.xius.agent.smf.postpaidmanagement.ConvertPostToPreRequest;
import com.xius.agent.smf.postpaidmanagement.ConvertPostToPreResponse;
import com.xius.agent.smf.postpaidmanagement.ConvertPostToPreUpdRequest;
import com.xius.agent.smf.postpaidmanagement.ConvertPostToPreUpdResponse;
import com.xius.agent.smf.postpaidmanagement.ConvertPreToPostRequest;
import com.xius.agent.smf.postpaidmanagement.ConvertPreToPostResponse;
import com.xius.agent.smf.postpaidmanagement.ConvertPreToPostUpdRequest;
import com.xius.agent.smf.postpaidmanagement.ConvertPreToPostUpdResponse;
import com.xius.agent.smf.postpaidmanagement.DoPostPaidPaymentRequest;
import com.xius.agent.smf.postpaidmanagement.DoPostPaidPaymentResponse;
import com.xius.agent.smf.postpaidmanagement.ObjectFactory;
import com.xius.agent.smf.postpaidmanagement.PasswordUpdateRequest;
import com.xius.agent.smf.postpaidmanagement.PasswordUpdateResponse;
import com.xius.agent.smf.postpaidmanagement.PasswordUpdateStatusUpdateReq;
import com.xius.agent.smf.postpaidmanagement.PasswordUpdateStatusUpdateRes;
import com.xius.agent.smf.postpaidmanagement.PaymentInquiryRequest;
import com.xius.agent.smf.postpaidmanagement.PaymentInquiryResponse;
import com.xius.agent.smf.postpaidmanagement.PostPaidPmtUpdRequest;
import com.xius.agent.smf.postpaidmanagement.PostPaidPmtUpdResponse;
import com.xius.agent.smf.postpaidmanagement.PostpaidRegStatusRequest;
import com.xius.agent.smf.postpaidmanagement.PostpaidRegStatusResponse;
import com.xius.agent.smf.postpaidmanagement.PostpaidRegistrationRequest;
import com.xius.agent.smf.postpaidmanagement.PostpaidRegistrationResponse;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.log.LogExecutionTime;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.ConvertPostToPreImpl;
import com.xius.smf.webservices.smfservices.ConvertPostToPreUpdImpl;
import com.xius.smf.webservices.smfservices.ConvertPreToPostImpl;
import com.xius.smf.webservices.smfservices.ConvertPreToPostUpdImpl;
import com.xius.smf.webservices.smfservices.DoPostPaidPaymentImpl;
import com.xius.smf.webservices.smfservices.PasswordUpdateImpl;
import com.xius.smf.webservices.smfservices.PasswordUpdateStatusUpdateImpl;
import com.xius.smf.webservices.smfservices.PaymentInquiryImpl;
import com.xius.smf.webservices.smfservices.PostPaidPmtUpdImpl;
import com.xius.smf.webservices.smfservices.PostPaidRegStatusImpl;
import com.xius.smf.webservices.smfservices.PostPaidRegistrationImpl;

@Endpoint
public class PostPaidManagement {
	private  static final Logger logger = LogManager.getLogger(PostPaidManagement.class.getSimpleName());

	@Autowired
	private ApplicationContext context; 

	@Autowired
	private Utilities Utilities;

	private static final String NAME_SPACE = "http://smf.agent.xius.com/PostPaidManagement.xsd";

	private static final String HEADER_DETAILS = "{"
			+ "http://smf.agent.xius.com/common/header/HeaderDetails.xsd" + "}messageHeader";

	ObjectFactory factory = new ObjectFactory();
	
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "paymentInquiryRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PaymentInquiryResponse> paymentInquiry(@RequestPayload PaymentInquiryRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		PaymentInquiryResponse response = new PaymentInquiryResponse();
		try{
			PaymentInquiryImpl impl = (PaymentInquiryImpl) context.getBean("PaymentInquiryImpl");
			response = impl.paymentInquiry(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("PaymentInquiry request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "PaymentInquiry request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PaymentInquiry request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createPaymentInquiryResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "PostPaidPmtUpdRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PostPaidPmtUpdResponse> postPaidPmtUpd(@RequestPayload PostPaidPmtUpdRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		PostPaidPmtUpdResponse response = new PostPaidPmtUpdResponse();
		try{
			PostPaidPmtUpdImpl impl = (PostPaidPmtUpdImpl) context.getBean("PostPaidPmtUpdImpl");
			response = impl.postPaidPmtUpd(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "PostPaidPmtUpd request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "PostPaidPmtUpd request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PostPaidPmtUpd request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createPostPaidPmtUpdResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "convertPreToPostRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ConvertPreToPostResponse> convertPreToPost(@RequestPayload ConvertPreToPostRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		ConvertPreToPostResponse response = new ConvertPreToPostResponse();
		try{
			ConvertPreToPostImpl impl = (ConvertPreToPostImpl) context.getBean("ConvertPreToPostImpl");
			response = impl.ConvertPreToPost(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("ConvertPreToPost request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPreToPost request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPreToPost request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createConvertPreToPostResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "doPostPaidPaymentRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<DoPostPaidPaymentResponse> doPostPaidPayment(@RequestPayload DoPostPaidPaymentRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		DoPostPaidPaymentResponse response = new DoPostPaidPaymentResponse();
		try{
			DoPostPaidPaymentImpl impl = (DoPostPaidPaymentImpl) context.getBean("DoPostPaidPaymentImpl");
			response = impl.doPostPaidPayment(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "DoPostPaidPayment request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "DoPostPaidPayment request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "DoPostPaidPayment request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createDoPostPaidPaymentResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "convertPostToPreRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ConvertPostToPreResponse> convertPostToPre(@RequestPayload ConvertPostToPreRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		ConvertPostToPreResponse response = new ConvertPostToPreResponse();
		try{
			ConvertPostToPreImpl impl = (ConvertPostToPreImpl) context.getBean("ConvertPostToPreImpl");
			response = impl.convertPostToPre(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ConvertPreToPost request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPreToPost request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPreToPost request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createConvertPostToPreResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "convertPostToPreUpdRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ConvertPostToPreUpdResponse> convertPostToPreUpd(@RequestPayload ConvertPostToPreUpdRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		ConvertPostToPreUpdResponse response = new ConvertPostToPreUpdResponse();
		try{
			ConvertPostToPreUpdImpl impl = (ConvertPostToPreUpdImpl) context.getBean("ConvertPostToPreUpdImpl");
			response = impl.convertPostToPreUpd(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ConvertPostToPreUpd request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPostToPreUpd request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPostToPreUpd request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createConvertPostToPreUpdResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "convertPreToPostUpdRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ConvertPreToPostUpdResponse> convertPreToPostUpd(@RequestPayload ConvertPreToPostUpdRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		ConvertPreToPostUpdResponse response = new ConvertPreToPostUpdResponse();
		try{
			ConvertPreToPostUpdImpl impl = (ConvertPreToPostUpdImpl) context.getBean("ConvertPreToPostUpdImpl");
			response = impl.convertPreToPostUpd(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ConvertPreToPostUpd request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPreToPostUpd request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "ConvertPreToPostUpd request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createConvertPreToPostUpdResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "passwordUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PasswordUpdateResponse> passwordUpdate(@RequestPayload PasswordUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		PasswordUpdateResponse response = new PasswordUpdateResponse();
		try{
			PasswordUpdateImpl impl = (PasswordUpdateImpl) context.getBean("PasswordUpdateImpl");
			response = impl.updatePassword(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "passwordUpdate request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "passwordUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "passwordUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createPasswordUpdateResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "passwordUpdateStatusUpdateReq")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PasswordUpdateStatusUpdateRes> passwordUpdateStatusUpdate(@RequestPayload PasswordUpdateStatusUpdateReq request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		PasswordUpdateStatusUpdateRes response = new PasswordUpdateStatusUpdateRes();
		try{
			PasswordUpdateStatusUpdateImpl impl = (PasswordUpdateStatusUpdateImpl) context.getBean("PasswordUpdateStatusUpdateImpl");
			response = impl.passwordUpdateStatusUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "PasswordUpdateStatusUpdate request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "PasswordUpdateStatusUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PasswordUpdateStatusUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createPasswordUpdateStatusUpdateRes(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "postpaidRegistrationRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PostpaidRegistrationResponse> postpaidRegistration(@RequestPayload PostpaidRegistrationRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		// TODO Auto-generated method stub
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		PostpaidRegistrationResponse response = new PostpaidRegistrationResponse();
		try{
			PostPaidRegistrationImpl impl = (PostPaidRegistrationImpl) context.getBean("PostPaidRegistrationImpl");
			response = impl.postpaidRegistration(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "PostpaidRegistrationRequest  Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "PostpaidRegistration request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PostpaidRegistration request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createPostpaidRegistrationResponse(response);
	}

	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "postpaidRegStatusRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PostpaidRegStatusResponse> postpaidRegStatus(@RequestPayload PostpaidRegStatusRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails=Utilities.getHeader(headers);
		// TODO Auto-generated method stub
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		PostpaidRegStatusResponse response = new PostpaidRegStatusResponse();
		try{
			PostPaidRegStatusImpl impl = (PostPaidRegStatusImpl) context.getBean("PostPaidRegStatusImpl");
			response = impl.postpaidRegStatus(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "PostpaidRegStatusRequest  Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "PostpaidRegStatus request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PostpaidRegStatus request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(),errorDetailsType.getErrorMessage());
		}
		return factory.createPostpaidRegStatusResponse(response);

	}
}









