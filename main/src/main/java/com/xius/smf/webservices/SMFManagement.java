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
import com.xius.agent.smf.smfmanagement.*;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.log.LogExecutionTime;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.Utilities;
import com.xius.smf.webservices.smfservices.*;



/**
 * Copyright 2012 XIUS.
 *
 * All rights reserved. These computer programs, listings, and specifications
 * are the property of New Wireless Services, Inc. and may not be copied,
 * stored, used or transmitted, in whole or in part, in any for or by any means,
 * without the prior written permission of XIUS.
 *
 */
@Endpoint
public class SMFManagement {
	private  static final Logger logger = LogManager.getLogger(SMFManagement.class.getSimpleName());

	@Autowired
	private ApplicationContext context;

	@Autowired
	private Utilities Utilities;

	private static final String NAME_SPACE = "http://smf.agent.xius.com/SMFManagement.xsd";

	private static final String HEADER_DETAILS = "{" + "http://smf.agent.xius.com/common/header/HeaderDetails.xsd"
			+ "}messageHeader";

	private static final ObjectFactory factory = new ObjectFactory();

	@PayloadRoot(namespace = NAME_SPACE, localPart = "insertExternalDetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<InsertExternalDetailsResponse> insertExternalDetails(
			@RequestPayload InsertExternalDetailsRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);

		long startTime = System.currentTimeMillis();
		long endTime = 0;
		InsertExternalDetailsResponse response = new InsertExternalDetailsResponse();
		try {
			InsertExternalDetailsImpl insertExternalDetailsImpl = (InsertExternalDetailsImpl) context.getBean("InsertExternalDetailsImpl");
			response = insertExternalDetailsImpl.insertExternalDetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "InsertExternalDetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error("InsertExternalDetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error("InsertExternalDetails request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createInsertExternalDetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "getExternalDetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetExternalDetailsResponse> getExternalDetails(@RequestPayload GetExternalDetailsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);

		long startTime = System.currentTimeMillis();
		long endTime = 0;
		GetExternalDetailsResponse response = new GetExternalDetailsResponse();
		GetExternalDetailsImpl impl = null;

		try {
			impl = (GetExternalDetailsImpl) context.getBean("GetExternalDetailsImpl");
			response = impl.getExternalDetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("GetExternalDetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error("GetExternalDetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "GetExternalDetails request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetExternalDetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "deleteExternalDetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<DeleteExternalDetailsResponse> deleteExternalDetails(
			@RequestPayload DeleteExternalDetailsRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		DeleteExternalDetailsResponse response = new DeleteExternalDetailsResponse();
		DeleteExternalDetailsImpl impl = null;

		try {
			impl = (DeleteExternalDetailsImpl) context.getBean("DeleteExternalDetailsImpl");
			response = impl.deleteExternalDetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "DeleteExternalDetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"DeleteExternalDetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "DeleteExternalDetails request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createDeleteExternalDetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "updateExternalDetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UpdateExternalDetailsResponse> updateExternalDetails(
			@RequestPayload UpdateExternalDetailsRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);

		long startTime = System.currentTimeMillis();
		long endTime = 0;
		UpdateExternalDetailsResponse response = new UpdateExternalDetailsResponse();
		UpdateExternalDetailsImpl impl = null;

		try {
			impl = (UpdateExternalDetailsImpl) context.getBean("UpdateExternalDetailsImpl");
			response = impl.updateExternalDetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "updateExternalDetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"updateExternalDetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "updateExternalDetails request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createUpdateExternalDetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkStateChangeInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkStateChangeInsertResponse> BulkStateChangeInsert(
			@RequestPayload BulkStateChangeInsertRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkStateChangeInsertResponse response = new BulkStateChangeInsertResponse();
		BulkStateChangeInsertImpl impl = null;

		try {
			impl = (BulkStateChangeInsertImpl) context.getBean("BulkStateChangeInsertImpl");
			response = impl.BulkStateChangeInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkStateChangeInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error("BulkStateChangeInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkStateChangeInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkStateChangeInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkStateChangeReportsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkStateChangeReportsResponse> bulkStateChangeReports(
			@RequestPayload BulkStateChangeReportsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkStateChangeReportsResponse response = new BulkStateChangeReportsResponse();
		BulkStateChangeReportsImpl impl = null;
		try {
			impl = (BulkStateChangeReportsImpl) context.getBean("BulkStateChangeReportsImpl");
			response = impl.bulkStateChangeReports(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("BulkStateChangeReports request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error("BulkStateChangeReports request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkStateChangeReports request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkStateChangeReportsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "blkCorpRCStatusReportsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BlkCorpRCStatusReportsResponse> blkCorpRCStatusReports(
			@RequestPayload BlkCorpRCStatusReportsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);

		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BlkCorpRCStatusReportsResponse response = new BlkCorpRCStatusReportsResponse();
		BlkCorpRCStatusReportsImpl impl = null;
		try {
			impl = (BlkCorpRCStatusReportsImpl) context.getBean("BlkCorpRCStatusReportsImpl");
			response = impl.blkCorpRCStatusReports(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "blkCorpRCStatusReports request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"blkCorpRCStatusReports request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error("blkCorpRCStatusReports request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBlkCorpRCStatusReportsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "ForceSimActivationInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ForceSimActivationInsertResponse> forceSimActivation(
			@RequestPayload ForceSimActivationInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ForceSimActivationInsertResponse response = new ForceSimActivationInsertResponse();
		ForceSimActivationInsertImpl impl = null;
		try {
			impl = (ForceSimActivationInsertImpl) context.getBean("ForceSimActivationInsertImpl");
			response = impl.forceSimActivation(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ForceSimActivationInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"ForceSimActivationInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error("ForceSimActivationInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createForceSimActivationInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "ForceSimActivationStatusReportsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ForceSimActivationStatusReportsResponse> forceSimActStatusReports(
			@RequestPayload ForceSimActivationStatusReportsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ForceSimActivationStatusReportsResponse response = new ForceSimActivationStatusReportsResponse();
		ForceSimActStatusReportsImpl impl = null;
		try {
			impl = (ForceSimActStatusReportsImpl) context.getBean("ForceSimActStatusReportsImpl");
			response = impl.forceSimActStatusReports(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkSimSwapStatusReports request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"BulkSimSwapStatusReports request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error("BulkSimSwapStatusReports request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createForceSimActivationStatusReportsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BulkSimSwapInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkSimSwapInsertResponse> BulkSimSwapInsert(@RequestPayload BulkSimSwapInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkSimSwapInsertResponse response = new BulkSimSwapInsertResponse();
		BulkSimSwapInsertImpl impl = null;

		try {
			impl = (BulkSimSwapInsertImpl) context.getBean("BulkSimSwapInsertImpl");
			response = impl.BulkSimSwapInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkSimSwapInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"BulkSimSwapInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkSimSwapInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createBulkSimSwapInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BulkSimSwapStatusReportsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkSimSwapStatusReportsResponse> BulkSimSwapStatusReports(
			@RequestPayload BulkSimSwapStatusReportsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);

		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkSimSwapStatusReportsResponse response = new BulkSimSwapStatusReportsResponse();
		BulkSimSwapStatusReportsImpl impl = null;

		try {
			impl = (BulkSimSwapStatusReportsImpl) context.getBean("BulkSimSwapStatusReportsImpl");
			response = impl.BulkSimSwapStatusReports(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkSimSwapStatusReports request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"BulkSimSwapStatusReports request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error(
					"BulkSimSwapStatusReports request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkSimSwapStatusReportsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "topUpCUGRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<TopUpCUGResponse> topUpCUG(@RequestPayload TopUpCUGRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		TopUpCUGResponse topUpCUGResponse = null;
		TopUpCUGImpl topUpCUGImpl = null;
		try {
			topUpCUGImpl = (TopUpCUGImpl) context.getBean("TopUpCUGImpl");
			topUpCUGResponse = topUpCUGImpl.topUpCUG(request, headerDetails);
			logger.info( "topUpCUG request success...");
		} catch (SMFAgentException selfCareException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(selfCareException);

			endTime = System.currentTimeMillis();
			logger.error("topUpCUG request failed..." + Utilities.getStackTrace(selfCareException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "topUpCUG request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);

			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createTopUpCUGResponse(topUpCUGResponse);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "MsisdnVsTariffIdInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<MsisdnvstariffIdInsertResponse> msisdnvstariffIdInsert(
			@RequestPayload MsisdnvstariffIdInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		MsisdnvstariffIdInsertResponse response = new MsisdnvstariffIdInsertResponse();
		MsisdnvstariffIdInsertImpl impl = null;
		try {
			impl = (MsisdnvstariffIdInsertImpl) context.getBean("MsisdnvstariffIdInsertImpl");
			response = impl.msisdnvstariffIdInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "MsisdnvstariffIdInsert request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"MsisdnvstariffIdInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "MsisdnvstariffIdInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createMsisdnVsTariffIdInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "MsisdnVsTariffIdViewRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<MsisdnvstariffIdViewResponse> msisdnvstariffIdView(
			@RequestPayload MsisdnvstariffIdViewRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		MsisdnvstariffIdViewResponse response = new MsisdnvstariffIdViewResponse();
		MsisdnvstariffIdViewImpl impl = null;
		try {
			impl = (MsisdnvstariffIdViewImpl) context.getBean("MsisdnvstariffIdViewImpl");
			response = impl.msisdnvstariffIdView(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "MsisdnvstariffIdView request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"MsisdnvstariffIdView request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "MsisdnvstariffIdView  failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createMsisdnVsTariffIdViewResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "stateChangeTrackInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<StateChangeTrackInsertResponse> StateChangeTrackInsert(
			@RequestPayload StateChangeTrackInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		StateChangeTrackInsertResponse response = new StateChangeTrackInsertResponse();
		statechangeTrackInsertImpl impl = null;
		try {
			impl = (statechangeTrackInsertImpl) context.getBean("statechangeTrackInsertImpl");
			response = impl.StateChangeTrackInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "StateChangeTrackInsert request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"StateChangeTrackInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "StateChangeTrackInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createStateChangeTrackInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "stateChangeTrackUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<StateChangeTrackUpdateResponse> StateChangeTrackUpdate(
			@RequestPayload StateChangeTrackUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		StateChangeTrackUpdateResponse response = new StateChangeTrackUpdateResponse();
		statechangeTrackUpdateImpl impl = null;
		try {
			impl = (statechangeTrackUpdateImpl) context.getBean("statechangeTrackUpdateImpl");
			response = impl.StateChangeTrackUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("StateChangeTrackUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"StateChangeTrackUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "StateChangeTrackUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createStateChangeTrackUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "persistenceManageRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PersistenceManageResponse> persistenceManage(@RequestPayload PersistenceManageRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		PersistenceManageResponse response = new PersistenceManageResponse();
		PersistenceManageImpl impl = null;

		try {
			impl = (PersistenceManageImpl) context.getBean("PersistenceManageImpl");
			response = impl.persistenceManage(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "persistenceManage request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"persistenceManage request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "persistenceManage request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createPersistenceManageResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SIMActivationRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SIMActivationResponse> SIMActivation(@RequestPayload SIMActivationRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SIMActivationResponse response = new SIMActivationResponse();
		SIMActivationImpl impl = null;

		try {
			impl = (SIMActivationImpl) context.getBean("SIMActivationImpl");
			response = impl.SIMActivation(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "SIMActivation request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "SIMActivation request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "SIMActivation request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSIMActivationResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "IMEIEnquiryRequest")
	@ResponsePayload
	@LogExecutionTime
	public IMEIEnquiryResponse imeiEnquiry(@RequestPayload IMEIEnquiryRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		IMEIEnquiryResponse response = new IMEIEnquiryResponse();
		try {
			IMEIEnquiryImpl impl = (IMEIEnquiryImpl) context.getBean("IMEIEnquiryImpl");
			response = impl.imeiEnquiry(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "IMEIEnquiry request Success...");

		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error("IMEIEnquiry request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());

		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "IMEIEnquiry request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return response;
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "IMEILockRequest")
	@ResponsePayload
	@LogExecutionTime
	public IMEILockResponse imeiLock(@RequestPayload IMEILockRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		IMEILockResponse response = new IMEILockResponse();
		try {
			IMEILockImpl impl = (IMEILockImpl) context.getBean("IMEILockImpl");
			response = impl.imeiLock(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "IMEILock request Success...");

		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "IMEILock request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());

		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "IMEILock request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return response;
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "IMEIUnlockRequest")
	@ResponsePayload
	@LogExecutionTime
	public IMEIUnlockResponse imeiUnlock(@RequestPayload IMEIUnlockRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		IMEIUnlockResponse response = new IMEIUnlockResponse();
		try {
			IMEIUnLockImpl impl = (IMEIUnLockImpl) context.getBean("IMEIUnLockImpl");
			response = impl.imeiUnlock(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "IMEIUnlock request Success...");

		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "IMEIUnlock request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());

		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "IMEIUnlock request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return response;
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SIMActivationUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SIMActivationUpdateResponse> UpdateSIMActivation(
			@RequestPayload SIMActivationUpdateRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SIMActivationUpdateResponse response = new SIMActivationUpdateResponse();
		UpdateSIMActivationImpl impl = null;
		try {
			impl = (UpdateSIMActivationImpl) context.getBean("UpdateSIMActivationImpl");
			response = impl.UpdateSIMActivation(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("UpdateSIMActivation request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"UpdateSIMActivation request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "UpdateSIMActivation request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSIMActivationUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SIMSaleRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SIMSaleResponse> SIMSale(@RequestPayload SIMSaleRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SIMSaleResponse response = new SIMSaleResponse();
		SIMSaleImpl impl = null;
		try {
			impl = (SIMSaleImpl) context.getBean("SIMSaleImpl");
			response = impl.SIMSale(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "SIMSale request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "SIMSale request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "SIMSale request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSIMSaleResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SIMSaleUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SIMSaleUpdateResponse> UpdateSIMSale(@RequestPayload SIMSaleUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SIMSaleUpdateResponse response = new SIMSaleUpdateResponse();
		UpdateSIMSaleImpl impl = null;
		try {
			impl = (UpdateSIMSaleImpl) context.getBean("UpdateSIMSaleImpl");
			response = impl.UpdateSIMSale(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "SIMSaleUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "SIMSaleUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "SIMSaleUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSIMSaleUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "loginLogoutTrackingRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<LoginLogoutTrackingResponse> loginLogoutTracking(
			@RequestPayload LoginLogoutTrackingRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		LoginLogoutTrackingResponse response = new LoginLogoutTrackingResponse();

		try {
			LoginLogoutTrackingImpl impl = (LoginLogoutTrackingImpl) context.getBean("LoginLogoutTrackingImpl");
			response = impl.loginLogoutTracking(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "loginLogoutTracking request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"loginLogoutTracking request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "loginLogoutTracking request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createLoginLogoutTrackingResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkTPChangeUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkTPChangeUpdateResponse> bulkTPChangeUpdate(@RequestPayload BulkTPChangeUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		BulkTPChangeUpdateResponse response = new BulkTPChangeUpdateResponse();
		try {
			BulkTPChangeUpdateImpl impl = (BulkTPChangeUpdateImpl) context.getBean("BulkTPChangeUpdateImpl");
			response = impl.bulkTPChangeUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "bulkTPChangeUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"bulkTPChangeUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "bulkTPChangeUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkTPChangeUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkATPSubscriptionUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkATPSubscriptionUpdateResponse> bulkATPSubscriptionUpdate(
			@RequestPayload BulkATPSubscriptionUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		BulkATPSubscriptionUpdateResponse response = new BulkATPSubscriptionUpdateResponse();
		try {
			BulkATPSubscriptionUpdateImpl impl = (BulkATPSubscriptionUpdateImpl) context
					.getBean("BulkATPSubscriptionUpdateImpl");
			response = impl.bulkATPSubscriptionUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("bulkATPSubscriptionUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"bulkATPSubscriptionUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error(
					"bulkATPSubscriptionUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkATPSubscriptionUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "changeTPRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ChangeTPResponse> changeTP(@RequestPayload ChangeTPRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {

		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		ChangeTPResponse response = new ChangeTPResponse();
		try {
			ChangeTPImpl impl = (ChangeTPImpl) context.getBean("ChangeTPImpl");
			response = impl.changeTP(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "changeTP request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "changeTP request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "changeTP request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createChangeTPResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "ATPSubscriptionRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ATPSubscriptionResponse> ATPSubscription(@RequestPayload ATPSubscriptionRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		ATPSubscriptionResponse response = new ATPSubscriptionResponse();
		try {
			ATPSubscriptionImpl impl = (ATPSubscriptionImpl) context.getBean("ATPSubscriptionImpl");
			response = impl.ATPSubscription(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ATPSubscription request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"ATPSubscription request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "ATPSubscription request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createATPSubscriptionResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "generateTokenRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GenerateTokenResponse> generateToken(@RequestPayload GenerateTokenRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		GenerateTokenResponse response = new GenerateTokenResponse();
		try {
			GenerateTokenImpl impl = (GenerateTokenImpl) context.getBean("GenerateTokenImpl");
			response = impl.generateToken(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "generateToken request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "generateToken request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "generateToken request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGenerateTokenResponse(response);

	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "validateTokenRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ValidateTokenResponse> validateToken(@RequestPayload ValidateTokenRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		ValidateTokenResponse response = new ValidateTokenResponse();
		try {
			ValidateTokenImpl impl = (ValidateTokenImpl) context.getBean("ValidateTokenImpl");
			response = impl.validateToken(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "validateToken request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "validateToken request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "validateToken request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createValidateTokenResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "VolteInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<VolteInsertResponse> volteInsert(@RequestPayload VolteInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		VolteInsertResponse response = new VolteInsertResponse();
		VolteInsertImpl impl = (VolteInsertImpl) context.getBean("VolteInsertImpl");
		try {
			response = impl.volteInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "volteInsert request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "volteInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "volteInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createVolteInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "VolteUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<VolteUpdateResponse> volteUpdate(@RequestPayload VolteUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		VolteUpdateResponse response = new VolteUpdateResponse();
		VolteUpdateImpl impl = (VolteUpdateImpl) context.getBean("VolteUpdateImpl");
		try {

			response = impl.volteUpdate(request, headerDetails);

			endTime = System.currentTimeMillis();
			logger.info( "volteUpdate request Success...");
		} catch (SMFAgentException infinetException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(infinetException);
			endTime = System.currentTimeMillis();
			logger.error(
					"volteUpdate request failed..." + Utilities.getStackTrace(infinetException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "volteUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createVolteUpdateResponse(response);

	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "paymentInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PaymentInsertResponse> paymentInsert(@RequestPayload PaymentInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		PaymentInsertResponse response = new PaymentInsertResponse();
		try {
			PaymentInsertImpl impl = (PaymentInsertImpl) context.getBean("PaymentInsertImpl");
			response = impl.paymentInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "PaymentInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "PaymentInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PaymentInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createPaymentInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "paymentUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PaymentUpdateResponse> paymentUpdate(@RequestPayload PaymentUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		PaymentUpdateResponse response = new PaymentUpdateResponse();
		try {
			PaymentUpdateImpl impl = (PaymentUpdateImpl) context.getBean("PaymentUpdateImpl");
			response = impl.paymentUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "PaymentUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "PaymentUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PaymentUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createPaymentUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "paymentTransReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PaymentTransReportResponse> paymentTransReport(@RequestPayload PaymentTransReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		PaymentTransReportResponse response = new PaymentTransReportResponse();
		try {
			PaymentTransReportImpl impl = (PaymentTransReportImpl) context.getBean("PaymentTransReportImpl");
			response = impl.paymentTransReport(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "PaymentTransReport request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"PaymentTransReport request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "PaymentTransReport request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createPaymentTransReportResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkSpecialCreditUpldRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkSpecialCreditUpldResponse> bulkSpecialCreditUpld(
			@RequestPayload BulkSpecialCreditUpldRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		BulkSpecialCreditUpldResponse response = new BulkSpecialCreditUpldResponse();
		try {
			BulkSplCreditUpldImpl impl = (BulkSplCreditUpldImpl) context.getBean("BulkSplCreditUpldImpl");
			response = impl.bulkSpecialCreditUpld(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkSplCreditUpld request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"BulkSplCreditUpld request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkSplCreditUpld request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkSpecialCreditUpldResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkCreditUpldRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkCreditUpldResponse> bulkCreditUpld(@RequestPayload BulkCreditUpldRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		BulkCreditUpldResponse response = new BulkCreditUpldResponse();
		try {
			BulkCreditUpldImpl impl = (BulkCreditUpldImpl) context.getBean("BulkCreditUpldImpl");
			response = impl.bulkCreditUpld(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkCreditUpld request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "BulkCreditUpld request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkCreditUpld request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkCreditUpldResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkDebitUpldRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkDebitUpldResponse> bulkDebitUpld(@RequestPayload BulkDebitUpldRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		BulkDebitUpldResponse response = new BulkDebitUpldResponse();
		try {
			BulkDebitUpldImpl impl = (BulkDebitUpldImpl) context.getBean("BulkDebitUpldImpl");
			response = impl.BulkDebitUpld(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("BulkDebitUpld request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "BulkDebitUpld request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkDebitUpld request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkDebitUpldResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "getBulkCreditTransDtlsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetBulkCreditTransDtlsResponse> getBulkCreditTransDtls(
			@RequestPayload GetBulkCreditTransDtlsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		GetBulkCreditTransDtlsResponse response = new GetBulkCreditTransDtlsResponse();
		try {
			GetBulkCreditTransDtlsImpl impl = (GetBulkCreditTransDtlsImpl) context
					.getBean("GetBulkCreditTransDtlsImpl");
			response = impl.getBulkCreditTransDtls(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "GetBulkCreditTransDtls request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"GetBulkCreditTransDtls request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "GetBulkCreditTransDtls request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetBulkCreditTransDtlsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "getBulkDebitTransDtlsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetBulkDebitTransDtlsResponse> getBulkDebitTransDtls(
			@RequestPayload GetBulkDebitTransDtlsRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		GetBulkDebitTransDtlsResponse response = new GetBulkDebitTransDtlsResponse();
		try {
			GetBulkDebitTransDtlsImpl impl = (GetBulkDebitTransDtlsImpl) context.getBean("GetBulkDebitTransDtlsImpl");
			response = impl.getBulkDebitTransDtls(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "GetBulkDebitTransDtls request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"GetBulkDebitTransDtls request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "GetBulkDebitTransDtls request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetBulkDebitTransDtlsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "getBulkSplCreditTransDtlsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetBulkSplCreditTransDtlsResponse> getBulkSplCreditTransDtls(
			@RequestPayload GetBulkSplCreditTransDtlsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		GetBulkSplCreditTransDtlsResponse response = new GetBulkSplCreditTransDtlsResponse();
		try {
			GetBulkSplCreditTransDtlsImpl impl = (GetBulkSplCreditTransDtlsImpl) context
					.getBean("GetBulkSplCreditTransDtlsImpl");
			response = impl.getBulkSplCreditTransDtls(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "GetBulkSplCreditTransDtls request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"GetBulkSplCreditTransDtls request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error(
					"GetBulkSplCreditTransDtls request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetBulkSplCreditTransDtlsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "updatePersonalDetailsInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UpdatePersonalDetailsInsertResponse> updatePersonalDetailsInsert(
			@RequestPayload UpdatePersonalDetailsInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		UpdatePersonalDetailsInsertResponse response = new UpdatePersonalDetailsInsertResponse();
		try {
			UpdatePersonalDetailsInsertImpl impl = (UpdatePersonalDetailsInsertImpl) context
					.getBean("UpdatePersonalDetailsInsertImpl");
			response = impl.updatePersonalDetailsInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "updatePersonalDetailsInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"updatePersonalDetailsInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error(
					"updatePersonalDetailsInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createUpdatePersonalDetailsInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "updtPrsnlDtlsUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UpdtPrsnlDtlsUpdateResponse> updtPrsnlDtlsUpdate(
			@RequestPayload UpdtPrsnlDtlsUpdateRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		UpdtPrsnlDtlsUpdateResponse response = new UpdtPrsnlDtlsUpdateResponse();
		UpdtPrsnlDtlsUpdateImpl impl = (UpdtPrsnlDtlsUpdateImpl) context.getBean("UpdtPrsnlDtlsUpdateImpl");

		try {

			response = impl.updtPrsnlDtlsUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "updtPrsnlDtlsUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"updtPrsnlDtlsUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "updtPrsnlDtlsUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createUpdtPrsnlDtlsUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "blkCorpActDeActInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BlkCorpActDeActInsertResponse> blkCorpActDeActInsert(
			@RequestPayload BlkCorpActDeActInsertRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		BlkCorpActDeActInsertResponse response = new BlkCorpActDeActInsertResponse();
		try {
			BlkCorpActDeActInsertImpl impl = (BlkCorpActDeActInsertImpl) context.getBean("BlkCorpActDeActInsertImpl");
			response = impl.blkCorpActDeActInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "blkCorpActDeActInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"blkCorpActDeActInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "blkCorpActDeActInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBlkCorpActDeActInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "blkActDeActReportsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BlkActDeActReportsResponse> blkActDeActReports(@RequestPayload BlkActDeActReportsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		BlkActDeActReportsResponse response = new BlkActDeActReportsResponse();
		BlkActDeactReportsImpl impl = (BlkActDeactReportsImpl) context.getBean("BlkActDeactReportsImpl");

		try {
			response = impl.blkActDeActReports(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BlkActDeActReports request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"BlkActDeActReports request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BlkActDeActReports request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBlkActDeActReportsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "blkCorpRCInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BlkCorpRCInsertResponse> blkCorpRCInsert(@RequestPayload BlkCorpRCInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		BlkCorpRCInsertResponse response = new BlkCorpRCInsertResponse();
		try {
			BlkCorpRCInsertImpl impl = (BlkCorpRCInsertImpl) context.getBean("BlkCorpRCInsertImpl");
			response = impl.blkCorpRCInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "blkCorpRCInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"blkCorpRCInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "blkCorpRCInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBlkCorpRCInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "getBalanceTransStatusRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetBalanceTransStatusResponse> getBalanceTransStatus(
			@RequestPayload GetBalanceTransStatusRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		GetBalanceTransStatusResponse response = new GetBalanceTransStatusResponse();
		try {
			BalanceTransStatusImpl impl = (BalanceTransStatusImpl) context.getBean("BalanceTransStatusImpl");
			response = impl.getBalanceTransStatus(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("getBalanceTransStatus request Success...");

		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"getBalanceTransStatus request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());

		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "getBalanceTransStatus request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetBalanceTransStatusResponse(response);

	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "firstLUInsertCheckRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<FirstLUInsertCheckResponse> firstLUInsertCheck(@RequestPayload FirstLUInsertCheckRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		FirstLUInsertCheckResponse response = new FirstLUInsertCheckResponse();
		try {
			FirstLUInsertCheckImpl impl = (FirstLUInsertCheckImpl) context.getBean("FirstLUInsertCheckImpl");
			response = impl.firstLUInsertCheck(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "FirstLUInsertCheck request Success...");

		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"FirstLUInsertCheck request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());

		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "FirstLUInsertCheck request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createFirstLUInsertCheckResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "YFAPIInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<YFAPIInsertResponse> YFAPIInsert(@RequestPayload YFAPIInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);

		YFAPIInsertResponse response = new YFAPIInsertResponse();
		try {
			YFAPIInsertImpl impl = (YFAPIInsertImpl) context.getBean("YFAPIInsertImpl");
			response = impl.YFAPIInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "YFAPIInsert request Success...");

		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "YFAPIInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());

		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "YFAPIInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createYFAPIInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "bulkCAGroupInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkCAGroupInsertResponse> bulkCAGroupInsert(@RequestPayload BulkCAGroupInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws SMFAgentException {
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		BulkCAGroupInsertResponse response = new BulkCAGroupInsertResponse();
		try {
			BulkCAGroupInsertImpl impl = (BulkCAGroupInsertImpl) context.getBean("BulkCAGroupInsertImpl");
			response = impl.bulkCAGroupInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkCAGroupInsert request Success...");

		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"BulkCAGroupInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());

		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkCAGroupInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkCAGroupInsertResponse(response);
	}

	// chikkanna

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BulkATPSubscriptionUploadRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkATPSubscriptionUploadResponse> bulkATPSubscriptionUpload(
			@RequestPayload BulkATPSubscriptionUploadRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);

		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkATPSubscriptionUploadResponse response = new BulkATPSubscriptionUploadResponse();
		BulkATPSubscriptionUploadImpl impl = null;

		try {
			impl = (BulkATPSubscriptionUploadImpl) context.getBean("BulkATPSubscriptionUploadImpl");
			response = impl.bulkATPSubscriptionUpload(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "bulkATPSubscriptionUpload request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"bulkATPSubscriptionUpload request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error(
					"bulkATPSubscriptionUpload request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkATPSubscriptionUploadResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "productPurchageRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ProductPurchageResponse> productPurchage(@RequestPayload ProductPurchageRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		ProductPurchageResponse response = new ProductPurchageResponse();
		ProductPurchageImpl impl = null;

		try {
			impl = (ProductPurchageImpl) context.getBean("ProductPurchageImpl");
			response = impl.productPurchage(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ProductPurchage request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"ProductPurchage request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "ProductPurchage request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createProductPurchageResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "manageProvsngRetryRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ManageProvsngRetryResponse> manageRollback(@RequestPayload ManageProvsngRetryRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ManageProvsngRetryResponse response = null;
		ManageProvsngRetryImpl impl = null;

		try {
			impl = (ManageProvsngRetryImpl) context.getBean("ManageProvsngRetryImpl");
			response = impl.manageRollback(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "manageProvsngRetry request Success...");
		} catch (SMFAgentException infinetException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(infinetException);
			endTime = System.currentTimeMillis();
			logger.error(
					"manageProvsngRetry request failed..." + Utilities.getStackTrace(infinetException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "manageProvsngRetry request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createManageProvsngRetryResponse(response);

	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "productPurchaseUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ProductPurchaseUpdateResponse> productPurchaseupdate(
			@RequestPayload ProductPurchaseUpdateRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ProductPurchaseUpdateResponse response = new ProductPurchaseUpdateResponse();
		ProductPurchaseUpdateImpl impl = null;

		try {
			impl = (ProductPurchaseUpdateImpl) context.getBean("ProductPurchaseUpdateImpl");
			response = impl.productPurchaseupdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ProductPurchage request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"ProductPurchage request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "ProductPurchage request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createProductPurchaseUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "UploadSimsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UploadSimsResponse> uploadSims(@RequestPayload UploadSimsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		UploadSimsResponse response = new UploadSimsResponse();
		UploadSIMsImpl impl = null;
		try {
			impl = (UploadSIMsImpl) context.getBean("UploadSIMsImpl");
			response = impl.uploadSims(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "UploadSIMs request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "UploadSIMs request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "UploadSIMs request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createUploadSimsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BulkMDNRegistartionRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkMDNRegistartionResponse> BulkMDNRegistartion(
			@RequestPayload BulkMDNRegistartionRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkMDNRegistartionResponse response = new BulkMDNRegistartionResponse();
		BulkMDNRegistrationImpl impl = null;

		try {
			impl = (BulkMDNRegistrationImpl) context.getBean("BulkMDNRegistrationImpl");
			response = impl.BulkMDNRegistartion(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "BulkMDNRegistartion request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"BulkMDNRegistartion request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "BulkMDNRegistartion request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		return factory.createBulkMDNRegistartionResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BulkMDNRegActStatusReportsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkMDNRegActStatusReportsResponse> BulkMDNRegActStatusReports(
			@RequestPayload com.xius.agent.smf.smfmanagement.BulkMDNRegActStatusReportsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkMDNRegActStatusReportsResponse response = new BulkMDNRegActStatusReportsResponse();
		BulkMDNRegActStatusReportsImpl impl = null;
		try {
			impl = (BulkMDNRegActStatusReportsImpl) context.getBean("BulkMDNRegActStatusReportsImpl");
			response = impl.BulkMDNRegActStatusReports(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "bulkMDNRegActStatusReports request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"bulkMDNRegActStatusReports request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error(
					"bulkMDNRegActStatusReports request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkMDNRegActStatusReportsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "ViewTransDetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ViewTransDetailsResponse> viewTransDetails(@RequestPayload ViewTransDetailsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ViewTransDetailsResponse response = new ViewTransDetailsResponse();
		ViewTransDetailsImpl impl = null;
		try {
			impl = (ViewTransDetailsImpl) context.getBean("ViewTransDetailsImpl");
			response = impl.viewTransDetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "ViewTransDetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			// ErrorDetailsType errorDetailsType =
			// Utilities.fillErrorDetailsType(smfAgentException.getErrorCode(),
			// smfAgentException.getErrorMessage());

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"ViewTransDetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "ViewTransDetails request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createViewTransDetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "GetBulkATPSubsDtlsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetBulkATPSubsDtlsResponse> getBulkATPSubsDtls(@RequestPayload GetBulkATPSubsDtlsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		GetBulkATPSubsDtlsResponse response = new GetBulkATPSubsDtlsResponse();
		GetBulkATPSubsDtlsImpl impl = null;
		try {
			impl = (GetBulkATPSubsDtlsImpl) context.getBean("GetBulkATPSubsDtlsImpl");
			response = impl.getBulkATPSubsDtls(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "getBulkATPSubsDtls request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"getBulkATPSubsDtls request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "getBulkATPSubsDtls request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetBulkATPSubsDtlsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SlpnPointsTrackerRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SlpnPointsTrackerResponse> slpnPointsTracker(@RequestPayload SlpnPointsTrackerRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SlpnPointsTrackerResponse response = new SlpnPointsTrackerResponse();
		SlpnPointsTrackerImpl impl = null;
		try {
			impl = (SlpnPointsTrackerImpl) context.getBean("SlpnPointsTrackerImpl");
			response = impl.slpnPointsTracker(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "slpnPointsTracker request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"slpnPointsTracker request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "slpnPointsTracker request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSlpnPointsTrackerResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SlpnPointsTrackerUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SlpnPointsTrackerUpdateResponse> slpnPointsTrackerUpdate(
			@RequestPayload com.xius.agent.smf.smfmanagement.SlpnPointsTrackerUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SlpnPointsTrackerUpdateResponse response = new SlpnPointsTrackerUpdateResponse();
		SlpnPointsTrackerUpdateImpl impl = null;
		try {
			impl = (SlpnPointsTrackerUpdateImpl) context.getBean("SlpnPointsTrackerUpdateImpl");
			response = impl.slpnPointsTrackerUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "slpnPointsTrackerUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"slpnPointsTrackerUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error(
					"slpnPointsTrackerUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSlpnPointsTrackerUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "DebitTransactionRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<DebitTransactionResponse> debitTransaction(@RequestPayload DebitTransactionRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		DebitTransactionResponse response = new DebitTransactionResponse();
		DebitTransactionImpl impl = null;
		try {
			impl = (DebitTransactionImpl) context.getBean("DebitTransactionImpl");
			response = impl.debitTransaction(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "debitTransaction request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"debitTransaction request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error("debitTransaction request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createDebitTransactionResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "DebitTransactionUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<DebitTransactionUpdateResponse> debitTransactionUpdate(
			@RequestPayload DebitTransactionUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		DebitTransactionUpdateResponse response = new DebitTransactionUpdateResponse();
		DebitTransactionUpdateImpl impl = null;
		try {
			impl = (DebitTransactionUpdateImpl) context.getBean("DebitTransactionUpdateImpl");
			response = impl.debitTransactionUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "debitTransactionUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"debitTransactionUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "debitTransactionUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createDebitTransactionUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "APITrackerRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<APITrackerResponse> APITracker(@RequestPayload APITrackerRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		APITrackerResponse response = new APITrackerResponse();
		APITrackerImpl impl = null;
		try {
			impl = (APITrackerImpl) context.getBean("APITrackerImpl");
			response = impl.APITracker(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "APITracker request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "APITracker request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "APITracker request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createAPITrackerResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SimRegistrationRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SimRegistrationResponse> simRegistration(@RequestPayload SimRegistrationRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SimRegistrationResponse response = new SimRegistrationResponse();
		SimRegistrationImpl impl = null;
		try {
			impl = (SimRegistrationImpl) context.getBean("SimRegistrationImpl");
			response = impl.simRegistration(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "SimRegistration request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"SimRegistration request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "SimRegistration request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSimRegistrationResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "SimRegistrationUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SimRegistrationUpdateResponse> simRegistrationUpdate(
			@RequestPayload SimRegistrationUpdateRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		SimRegistrationUpdateResponse response = new SimRegistrationUpdateResponse();
		SimRegistrationUpdateImpl impl = null;
		try {
			impl = (SimRegistrationUpdateImpl) context.getBean("SimRegistrationUpdateImpl");
			response = impl.simRegistrationUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "SimRegistrationUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"SimRegistrationUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "SimRegistrationUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSimRegistrationUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BulkTPSubscriptionUploadRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BulkTPSubscriptionUploadResponse> bulkTPSubscriptionUpload(
			@RequestPayload com.xius.agent.smf.smfmanagement.BulkTPSubscriptionUploadRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BulkTPSubscriptionUploadResponse response = new BulkTPSubscriptionUploadResponse();
		BulkTPSubscriptionUploadImpl impl = null;
		try {
			impl = (BulkTPSubscriptionUploadImpl) context.getBean("BulkTPSubscriptionUploadImpl");
			response = impl.bulkTPSubscriptionUpload(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "bulkTPSubscriptionUpload request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"bulkTPSubscriptionUpload request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error(
					"bulkTPSubscriptionUpload request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBulkTPSubscriptionUploadResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "GetBulkTPSubsDtlsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetBulkTPSubsDtlsResponse> getBulkTPSubsDtls(@RequestPayload GetBulkTPSubsDtlsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		GetBulkTPSubsDtlsResponse response = new GetBulkTPSubsDtlsResponse();
		GetBulkTPSubsDtlsImpl impl = null;
		try {
			impl = (GetBulkTPSubsDtlsImpl) context.getBean("GetBulkTPSubsDtlsImpl");
			response = impl.getBulkTPSubsDtls(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "getBulkTPSubsDtls request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"getBulkTPSubsDtls request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "getBulkTPSubsDtls request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetBulkTPSubsDtlsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "TransactionTrackerRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<TransactionTrackerResponse> transactionTracker(@RequestPayload TransactionTrackerRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		TransactionTrackerResponse response = new TransactionTrackerResponse();
		TransactionTrackerImpl impl = new TransactionTrackerImpl();
		try {
			impl = (TransactionTrackerImpl) context.getBean("TransactionTrackerImpl");
			response = impl.transactionTracker(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "TransactionTracker request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"TransactionTracker request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "TransactionTracker request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createTransactionTrackerResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "TransactionTrackerUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<TransactionTrackerUpdateResponse> transactionTrackerUpdate(
			@RequestPayload com.xius.agent.smf.smfmanagement.TransactionTrackerUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		TransactionTrackerUpdateResponse response = new TransactionTrackerUpdateResponse();
		TransactionTrackerUpdateImpl impl = null;
		try {
			impl = (TransactionTrackerUpdateImpl) context.getBean("TransactionTrackerUpdateImpl");
			response = impl.transactionTrackerUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "TransactionTrackerUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"TransactionTrackerUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error(
					"TransactionTrackerUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createTransactionTrackerUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "FirstLUUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<FirstLUUpdateResponse> firstLUUpdate(@RequestPayload FirstLUUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		FirstLUUpdateResponse response = new FirstLUUpdateResponse();
		FirstLUUpdateImpl impl = null;
		try {
			impl = (FirstLUUpdateImpl) context.getBean("FirstLUUpdateImpl");
			response = impl.firstLUUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "firstLUUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "firstLUUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "firstLUUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createFirstLUUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "firstLUBulkInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<FirstLUBulkInsertResponse> firstLUBulkUpdate(@RequestPayload FirstLUBulkInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		FirstLUBulkInsertResponse response = new FirstLUBulkInsertResponse();
		FirstLUBulkUpdateImpl impl = null;
		try {
			impl = (FirstLUBulkUpdateImpl) context.getBean("FirstLUBulkUpdateImpl");
			response = impl.firstLUBulkUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "firstLUBulkUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"firstLUBulkUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "firstLUBulkUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createFirstLUBulkInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BucketsSummaryInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BucketsSummaryInsertResponse> bucketsSummaryInsert(
			@RequestPayload BucketsSummaryInsertRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BucketsSummaryInsertResponse response = new BucketsSummaryInsertResponse();
		BucketsSummaryInsertImpl impl = null;
		try {
			impl = (BucketsSummaryInsertImpl) context.getBean("BucketsSummaryInsertImpl");
			response = impl.bucketsSummaryInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "bucketsSummaryInsert request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"bucketsSummaryInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "bucketsSummaryInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBucketsSummaryInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "BucketsSummaryUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<BucketsSummaryUpdateResponse> bucketsSummaryUpdate(
			@RequestPayload BucketsSummaryUpdateRequest request, @SoapHeader(HEADER_DETAILS) SoapHeaderElement headers)
			throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		BucketsSummaryUpdateResponse response = new BucketsSummaryUpdateResponse();
		BucketsSummaryUpdateImpl impl = null;
		try {
			impl = (BucketsSummaryUpdateImpl) context.getBean("BucketsSummaryUpdateImpl");
			response = impl.bucketsSummaryUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "bucketsSummaryUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error(
					"bucketsSummaryUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "bucketsSummaryUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createBucketsSummaryUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "firstLuRtryUpdRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<FirstLuRtryUpdResponse> firstLuRtryUpd(@RequestPayload FirstLuRtryUpdRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		FirstLuRtryUpdResponse response = new FirstLuRtryUpdResponse();
		FirstLuRtryUpdImpl impl = null;
		try {
			impl = (FirstLuRtryUpdImpl) context.getBean("FirstLuRtryUpdImpl");
			response = impl.firstLuRtryUpd(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "firstLuRtryUpd request Success...");
		} catch (SMFAgentException smfAgentException) {

			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error("firstLuRtryUpd request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {

			endTime = System.currentTimeMillis();
			logger.error( "firstLuRtryUpd request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createFirstLuRtryUpdResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "getMsisdnNGServiceStatusRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetMsisdnNGServiceStatusResponse> getMsisdnNGServiceStatus(@RequestPayload GetMsisdnNGServiceStatusRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		MsisdnNGServiceStatusImpl impl =null;
		GetMsisdnNGServiceStatusResponse response = new GetMsisdnNGServiceStatusResponse();
		try{
			impl = (MsisdnNGServiceStatusImpl) context.getBean("MsisdnNGServiceStatusImpl");
			response = impl.getMsisdnNGServiceStatus(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "getMsisdnNGServiceStatus request Success..." );
			
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "getMsisdnNGServiceStatus request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
			
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "getMsisdnNGServiceStatus request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetMsisdnNGServiceStatusResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "insertSubsFlowTrackerRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<InsertSubsFlowTrackerResponse> InsertSubsFlowTracker(@RequestPayload InsertSubsFlowTrackerRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		
		logger.info( "InsertSubsFlowTracker API called..." );
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		InsertSubsFlowTrackerResponse response=new InsertSubsFlowTrackerResponse();
		InsertSubsFlowTrackerImpl impl = null;

		try {
			impl = (InsertSubsFlowTrackerImpl) context.getBean("InsertSubsFlowTrackerImpl");
			response = impl.InsertSubsFlowTracker(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "InsertSubsFlowTracker request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "InsertSubsFlowTracker request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "InsertSubsFlowTracker request failed..." + Utilities.getStackTrace(exception));
			
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createInsertSubsFlowTrackerResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "updateSubsFlowTrackerRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UpdateSubsFlowTrackerResponse> UpdateSubsFlowTracker(@RequestPayload UpdateSubsFlowTrackerRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		
		logger.info( "UpdateSubsFlowTracker API called..." );
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		UpdateSubsFlowTrackerResponse response=new UpdateSubsFlowTrackerResponse();
		UpdateSubsFlowTrackerImpl impl = null;

		try {
			impl = (UpdateSubsFlowTrackerImpl) context.getBean("UpdateSubsFlowTrackerImpl");
			response = impl.UpdateSubsFlowTracker(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "UpdateSubsFlowTracker request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "UpdateSubsFlowTracker request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "UpdateSubsFlowTracker request failed..." + Utilities.getStackTrace(exception));
			
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}

		
		return factory.createUpdateSubsFlowTrackerResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "getSubIMSIDataRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetSubIMSIDataResponse> getSubIMSIData(@RequestPayload GetSubIMSIDataRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException {
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		
		logger.info( "UpdateSubsFlowTracker API called..." );
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetSubIMSIDataResponse response=new GetSubIMSIDataResponse();
		GetSubImsiDataImpl impl = null;

		try {
			impl = (GetSubImsiDataImpl) context.getBean("GetSubImsiDataImpl");
			response = impl.getSubIMSIData(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "GetSubIMSIData request Success..." );
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "GetSubIMSIData request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "GetSubIMSIData request failed..." + Utilities.getStackTrace(exception));
			
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetSubIMSIDataResponse(response);
	}
	
	
	/*
	 * ===========================20-01-25===========SMF_AGENT_TECH_UPGRADE===============
	 * 
	 */
	
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "getEMADetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetEMADetailsResponse> getEMADetails(@RequestPayload GetEMADetailsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		logger.info( "getEMADetails API called...");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		GetEMADetailsResponse response =factory.createGetEMADetailsResponse();
		GetEMADetailsImpl impl = (GetEMADetailsImpl)context.getBean("GetEMADetailsImpl");
		try {
			response = impl.getEMADetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "getEMADetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "getEMADetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "getEMADetails request failed..." + Utilities.getStackTrace(exception));
			
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetEMADetailsResponse(response);
	}
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "updateEMADetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UpdateEMADetailsResponse> updateEMADetails(@RequestPayload UpdateEMADetailsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		logger.info( "updateEMADetails API called...");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		UpdateEMADetailsResponse response = factory.createUpdateEMADetailsResponse();
		UpdateEMADetailsImpl impl = (UpdateEMADetailsImpl)context.getBean("UpdateEMADetailsImpl");
		try {
			response = impl.updateEMADetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "updateEMADetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "updateEMADetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "updateEMADetails request failed..." + Utilities.getStackTrace(exception));
			
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createUpdateEMADetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "CancelLocationRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<CancelLocationResponse> cancelLocation(@RequestPayload CancelLocationRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		logger.info( "cancelLocation API called...");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		CancelLocationResponse response = factory.createCancelLocationResponse();
		CancelLocationimpl impl = (CancelLocationimpl)context.getBean("CancelLocationimpl");
		try {
			response = impl.CancelLocation(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "cancelLocation request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "cancelLocation request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "cancelLocation request failed..." + Utilities.getStackTrace(exception));
			
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createCancelLocationResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "InvokeEmaCmdRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<InvokeEmaCmdResponse> invokeEmaCmd(@RequestPayload InvokeEmaCmdRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		logger.info( "invokeEmaCmd API called...");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		HeaderDetails headerDetails = Utilities.getHeader(headers);
		InvokeEmaCmdResponse response = factory.createInvokeEmaCmdResponse();
		invokeEmaCmdimpl impl = (invokeEmaCmdimpl)context.getBean("invokeEmaCmdimpl");
		try {
			response = impl.invokeEmaCmd(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "invokeEmaCmd request Success...");
		}catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "invokeEmaCmd request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "invokeEmaCmd request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createInvokeEmaCmdResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "ChangeMsisdnRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<ChangeMsisdnResponse> changeMsisdn(@RequestPayload ChangeMsisdnRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "changeMsisdn API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		ChangeMsisdnResponse response =factory.createChangeMsisdnResponse();
		ChangeMsisdnImpl impl = (ChangeMsisdnImpl)context.getBean("ChangeMsisdnImpl");
		try {
			response = impl.ChangeMsisdn(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "changeMsisdn request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "changeMsisdn request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "changeMsisdn request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createChangeMsisdnResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "GetChangeMdnStatusRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetChangeMdnStatusResponse> getChangeMdnStatus(@RequestPayload GetChangeMdnStatusRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "getChangeMdnStatus API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		GetChangeMdnStatusResponse response = factory.createGetChangeMdnStatusResponse();
		GetChangeMdnStatusImpl impl = (GetChangeMdnStatusImpl)context.getBean("GetChangeMdnStatusImpl");
		try {
			response = impl.GetChangeMdnStatus(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "getChangeMdnStatus request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "getChangeMdnStatus request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error("getChangeMdnStatus request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetChangeMdnStatusResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "PrepaidActivationinsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PrepaidActivationinsertResponse> prepaidActivationinsert(@RequestPayload PrepaidActivationinsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		logger.info( "prepaidActivationinsert API called...");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		PrepaidActivationinsertResponse response = factory.createPrepaidActivationinsertResponse();
		PrepaidActivationinsertimpl impl = (PrepaidActivationinsertimpl)context.getBean("PrepaidActivationinsertimpl");
		try {
			response = impl.prepaidActivationinsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("PrepaidActivationinsertimpl request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "prepaidActivationinsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "prepaidActivationinsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createPrepaidActivationinsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "GetInvokeEmaCmdStatusRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetInvokeEmaCmdStatusResponse> getInvokeEmaCmdStatus(@RequestPayload GetInvokeEmaCmdStatusRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "getInvokeEmaCmdStatus API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		GetInvokeEmaCmdStatusResponse response = factory.createGetInvokeEmaCmdStatusResponse();
		GetInvokeEmaCmdStatusimpl impl = (GetInvokeEmaCmdStatusimpl)context.getBean("GetInvokeEmaCmdStatusimpl");
		try {
			response = impl.getEmaCmdStatus(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("getInvokeEmaCmdStatus request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "getInvokeEmaCmdStatus request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "getInvokeEmaCmdStatus request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetInvokeEmaCmdStatusResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "EmaCmdRetryUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<EmaCmdRetryUpdateResponse> emaCmdRetryUpdate(@RequestPayload EmaCmdRetryUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "emaCmdRetryUpdate API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		EmaCmdRetryUpdateResponse response = factory.createEmaCmdRetryUpdateResponse();
		EmaCmdRetryUpdateimpl impl = (EmaCmdRetryUpdateimpl)context.getBean("EmaCmdRetryUpdateimpl");
		try {
			response = impl.emaCmdRetryUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "emaCmdRetryUpdate request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "emaCmdRetryUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "emaCmdRetryUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createEmaCmdRetryUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "emaFlowInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<EmaFlowInsertResponse> emaFlowInsert(@RequestPayload EmaFlowInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		EmaFlowInsertResponse response = factory.createEmaFlowInsertResponse();
		EmaFlowInsertImpl impl = (EmaFlowInsertImpl)context.getBean("EmaFlowInsertImpl");
		try {
			response = impl.EmaFlowInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "emaFlowInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "emaFlowInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "emaFlowInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createEmaFlowInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "simRegTrackerInsertRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SimRegTrackerInsertResponse> simRegTrackerInsert(@RequestPayload SimRegTrackerInsertRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		logger.info("simRegTrackerInsert API called...");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		SimRegTrackerInsertResponse response = factory.createSimRegTrackerInsertResponse();
		SimRegTrackerInsertImpl impl = (SimRegTrackerInsertImpl)context.getBean("SimRegTrackerInsertImpl");
		try {
			response = impl.simRegTrackerInsert(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "simRegTrackerInsert request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "simRegTrackerInsert request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "simRegTrackerInsert request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSimRegTrackerInsertResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "simRegTrackerUpdateRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<SimRegTrackerUpdateResponse> simRegTrackerUpdate(@RequestPayload SimRegTrackerUpdateRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		logger.info( "simRegTrackerUpdate API called...");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		SimRegTrackerUpdateResponse response = factory.createSimRegTrackerUpdateResponse();
		SimRegTrackerUpdateImpl impl = (SimRegTrackerUpdateImpl)context.getBean("SimRegTrackerUpdateImpl");
		try {
			response = impl.simRegTrackerUpdate(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "simRegTrackerUpdate request Success...");
		}catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "simRegTrackerUpdate request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "simRegTrackerUpdate request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createSimRegTrackerUpdateResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "getCMDDetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetCMDDetailsResponse> getCMDDetails(@RequestPayload GetCMDDetailsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{	
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "getCMDDetails API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		GetCMDDetailsResponse response = factory.createGetCMDDetailsResponse();
		GetCMDDetailsImpl impl =(GetCMDDetailsImpl)context.getBean("GetCMDDetailsImpl");
		try {
			response = impl.getCMDDetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "getCMDDetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "getCMDDetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "getCMDDetails request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetCMDDetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "updCMDDetailsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UpdCMDDetailsResponse> updCMDDetails(@RequestPayload UpdCMDDetailsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{	
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "updCMDDetails API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		UpdCMDDetailsResponse response =factory.createUpdCMDDetailsResponse();
		UpdCMDDetailsImpl impl =(UpdCMDDetailsImpl)context.getBean("UpdCMDDetailsImpl");
		try {
			response = impl.UpdCMDDetails(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "updCMDDetails request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "updCMDDetails request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "updCMDDetails request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createUpdCMDDetailsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "PrepaidRegStatusRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PrepaidRegStatusResponse> prepaidRegStatus(@RequestPayload PrepaidRegStatusRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{	
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "prepaidRegStatus API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		PrepaidRegStatusResponse response = factory.createPrepaidRegStatusResponse();
		PrepaidRegStatusImpl impl =(PrepaidRegStatusImpl)context.getBean("PrepaidRegStatusImpl");
		try {
			response = impl.PrepaidRegStatus(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "prepaidRegStatus request Success...");
		}catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "prepaidRegStatus request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "prepaidRegStatus request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createPrepaidRegStatusResponse(response);
	}
	

	@PayloadRoot(namespace = NAME_SPACE, localPart = "RestAPIUserAuthRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<RestAPIUserAuthResponse> restAPIUserAuth(@RequestPayload RestAPIUserAuthRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info("restAPIUserAuth API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		RestAPIUserAuthResponse response =factory.createRestAPIUserAuthResponse();
		RestAPIUserAuthImpl impl = (RestAPIUserAuthImpl)context.getBean("RestAPIUserAuthImpl");
		try {
			response = impl.restAPIUserAuth(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "restAPIUserAuth request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "restAPIUserAuth request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "restAPIUserAuth request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createRestAPIUserAuthResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "DuplicateTransIDCheakRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<DuplicateTransIDCheakResponse> duplicateTransIDCheak(@RequestPayload DuplicateTransIDCheakRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "duplicateTransIDCheak API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		DuplicateTransIDCheakResponse response =factory.createDuplicateTransIDCheakResponse();
		DuplicateTransIDCheakImpl impl =(DuplicateTransIDCheakImpl)context.getBean("DuplicateTransIDCheakImpl");
		try {
			response = impl.duplicateTransIDCheak(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("duplicateTransIDCheak request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "duplicateTransIDCheak request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "duplicateTransIDCheak request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createDuplicateTransIDCheakResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "InvokeBulkEmaCmdRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<InvokeBulkEmaCmdResponse> invokeBulkEmaCmd(@RequestPayload InvokeBulkEmaCmdRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		logger.info( "invokeBulkEmaCmd API called...");
		InvokeBulkEmaCmdResponse response =factory.createInvokeBulkEmaCmdResponse();
		InvokeBulkEmaCmdImpl impl =(InvokeBulkEmaCmdImpl)context.getBean("InvokeBulkEmaCmdImpl");
		try {
			response = impl.InvokeBulkEmaCmd(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "invokeBulkEmaCmd request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error("invokeBulkEmaCmd request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "invokeBulkEmaCmd request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createInvokeBulkEmaCmdResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "InvokeBulkEmaCmdStatusRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<InvokeBulkEmaCmdStatusResponse> invokeBulkEmaCmdStatus(@RequestPayload InvokeBulkEmaCmdStatusRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "invokeBulkEmaCmdStatus API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		InvokeBulkEmaCmdStatusResponse response =factory.createInvokeBulkEmaCmdStatusResponse();
		try {
			if (request.getFlag() != null&& request.getFlag().equalsIgnoreCase("S")) {
				InvokeBulkEmaStatusTransImpl impl =(InvokeBulkEmaStatusTransImpl)context.getBean("InvokeBulkEmaStatusTransImpl");
				response = impl.invokeBulkEmaCmdStatus(request, headerDetails);
			} else {
				InvokeBulkEmaCmdStatusImpl impl =(InvokeBulkEmaCmdStatusImpl)context.getBean("InvokeBulkEmaCmdStatusImpl");;
				response = impl.invokeBulkEmaCmdStatus(request, headerDetails);
			}
			endTime = System.currentTimeMillis();
			logger.info("invokeBulkEmaCmdStatus request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "invokeBulkEmaCmdStatus request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "invokeBulkEmaCmdStatus request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createInvokeBulkEmaCmdStatusResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "GetTpIdBasedCommandsRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<GetTpIdBasedCommandsResponse> getTpIdBasedCommands(@RequestPayload GetTpIdBasedCommandsRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "getTpIdBasedCommands API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		GetTpIdBasedCommandsResponse response = factory.createGetTpIdBasedCommandsResponse();
		GetTpIdBasedCommandsImpl impl =(GetTpIdBasedCommandsImpl)context.getBean("GetTpIdBasedCommandsImpl");
		try {
			response = impl.getTpIdBasedCommands(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "getTpIdBasedCommands request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "getTpIdBasedCommands request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "getTpIdBasedCommands request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createGetTpIdBasedCommandsResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "InsertCMDAuditRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<InsertCMDAuditResponse> insertCMDAudit(@RequestPayload InsertCMDAuditRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "insertCMDAudit API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		InsertCMDAuditResponse response =factory.createInsertCMDAuditResponse();
		InsertCMDAuditImpl impl =(InsertCMDAuditImpl)context.getBean("InsertCMDAuditImpl");
		try {
			response = impl.insertCMDAudit(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "insertCMDAudit request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "insertCMDAudit request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "insertCMDAudit request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createInsertCMDAuditResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "UpdateCMDAuditRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<UpdateCMDAuditResponse> updateCMDAudit(@RequestPayload UpdateCMDAuditRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "updateCMDAudit API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		UpdateCMDAuditResponse response =factory.createUpdateCMDAuditResponse();
		updateCMDAuditImpl impl =(updateCMDAuditImpl)context.getBean("updateCMDAuditImpl");
		try {
			response = impl.updateCMDAudit(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "updateCMDAudit request Success...");
		}catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "updateCMDAudit request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "updateCMDAudit request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createUpdateCMDAuditResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "HlrCmdReportRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<HlrCmdReportResponse> hlrCmdReport(@RequestPayload HlrCmdReportRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "hlrCmdReport API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		HlrCmdReportResponse response =factory.createHlrCmdReportResponse();
		HlrCmdReportImpl impl =(HlrCmdReportImpl)context.getBean("HlrCmdReportImpl");
		try {
			response = impl.HlrCmdReport(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info("HlrCmdReport request Success...");
		}catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "HlrCmdReport request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "HlrCmdReport request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createHlrCmdReportResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "HlrCmdRetryRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<HlrCmdRetryResponse> hlrCmdRetry(@RequestPayload HlrCmdRetryRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info("hlrCmdRetry API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		HlrCmdRetryResponse response =factory.createHlrCmdRetryResponse();
		HlrCmdRetryImpl impl =(HlrCmdRetryImpl)context.getBean("HlrCmdRetryImpl");
		try {
			response = impl.hlrCmdRetry(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "hlrCmdRetry request Success...");
		}catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "hlrCmdRetry request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "hlrCmdRetry request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createHlrCmdRetryResponse(response);
	}

	@PayloadRoot(namespace = NAME_SPACE, localPart = "HlrCmdEmaFlowRetryRequest")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<HlrCmdEmaFlowRetryResponse> hlrCmdEmaFlowRetry(@RequestPayload HlrCmdEmaFlowRetryRequest request,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws RemoteException, SMFAgentException{
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		logger.info( "hlrCmdEmaFlowRetry API called...");
		HeaderDetails headerDetails = Utilities.getHeader(headers);
		HlrCmdEmaFlowRetryResponse response =factory.createHlrCmdEmaFlowRetryResponse();
		HlrCmdEmaFlowRetryImpl impl =(HlrCmdEmaFlowRetryImpl)context.getBean("HlrCmdEmaFlowRetryImpl");
		try {
			response = impl.hlrCmdEmaFlow(request, headerDetails);
			endTime = System.currentTimeMillis();
			logger.info( "hlrCmdEmaFlowRetry request Success...");
		} catch (SMFAgentException smfAgentException) {
			ErrorDetailsType errorDetailsType = Utilities.setErrorDetailsType(smfAgentException);
			endTime = System.currentTimeMillis();
			logger.error( "hlrCmdEmaFlowRetry request failed..." + Utilities.getStackTrace(smfAgentException));
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		} catch (Exception exception) {
			endTime = System.currentTimeMillis();
			logger.error( "hlrCmdEmaFlowRetry request failed..." + Utilities.getStackTrace(exception));
			ErrorDetailsType errorDetailsType = Utilities.fillErrorDetailsType("40000", null);
			throw new SMFAgentException(errorDetailsType.getErrorCode(), errorDetailsType.getErrorMessage());
		}
		return factory.createHlrCmdEmaFlowRetryResponse(response);
	}
}
