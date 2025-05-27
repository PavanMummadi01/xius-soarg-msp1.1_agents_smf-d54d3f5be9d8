package com.xius.smf.webservices;

import javax.xml.bind.JAXBElement;

import org.apache.logging.log4j.LogManager;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.server.endpoint.annotation.SoapHeader;

import com.xius.agent.smf.pingservice.Faultmessage;
import com.xius.agent.smf.pingservice.ObjectFactory;
import com.xius.agent.smf.pingservice.PingResponse;
import com.xius.agent.smf.pingservice.PingServiceRequest;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.log.LogExecutionTime;

import org.apache.logging.log4j.Logger;


@Endpoint
public class PingServiceEndPoint {

	private  static final Logger lOGGER = LogManager.getLogger(PingServiceEndPoint.class.getSimpleName());

	private static final String NAME_SPACE = "http://smf.agent.xius.com/PingService.xsd";

	private static final String HEADER_DETAILS = "{"
			+ "http://smf.agent.xius.com/common/header/HeaderDetails.xsd" + "}messageHeader";

	ObjectFactory factory = new ObjectFactory();

	@PayloadRoot(namespace = NAME_SPACE, localPart = "pingService")
	@ResponsePayload
	@LogExecutionTime
	public JAXBElement<PingResponse> pingService(@RequestPayload PingServiceRequest body,
			@SoapHeader(HEADER_DETAILS) SoapHeaderElement headers) throws Faultmessage, SMFAgentException {

		lOGGER.info("PingServiceEndPoint-PingService");
		PingResponse pingResponse = factory.createPingResponse();
		pingResponse.setMessage("1");

		return factory.createPingResponse(pingResponse);
	}

}

