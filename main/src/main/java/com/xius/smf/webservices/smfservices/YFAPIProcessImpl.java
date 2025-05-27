package com.xius.smf.webservices.smfservices;

import javax.xml.soap.SOAPException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import com.xius.smf.client.invoker.TIACCInvoker;
import com.xius.smf.client.invoker.TIAMngmtInvoker;
import com.xius.smf.client.invoker.TIAWalletInvoker;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.tia.TIAManagement_xsd.YFCreateInvoiceRequest;
import com.xius.tia.TIAManagement_xsd.YFCreateInvoiceResponse;
import com.xius.tia.WalletManagement_xsd.CreateWalletRequest;
import com.xius.tia.WalletManagement_xsd.CreateWalletResponse;
import com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCRequest;
import com.xius.tia.ccard.CreditCardManagment_xsd.RegisterCCResponse;


public class YFAPIProcessImpl {
	private  static final Logger logger = LogManager.getLogger(YFAPIProcessImpl.class.getSimpleName());
	
	public RegisterCCResponse registerCC(
			RegisterCCRequest request, HeaderDetails headerDetails) throws SMFAgentException, SOAPException {
		
		logger.info("YFAPIProcessImpl---> registerCC Method called ...");
		
		RegisterCCResponse response = null;
		
		TIACCInvoker invoker=new TIACCInvoker();
		response=invoker.registerCC(headerDetails, request);
		if(response!=null && response.getResult().getRespStatus().equals("0")){
			logger.info("YFAPIProcessImpl---> registerCC response is success ...");
		}else{
			logger.info("YFAPIProcessImpl---> registerCC response is failure ...");
		}
		logger.info("YFAPIProcessImpl---> registerCC response called ...");
		return response;
	}

	public CreateWalletResponse createWallet(CreateWalletRequest request,
			HeaderDetails headerDetails) throws SMFAgentException, SOAPException {

		logger.info("YFAPIProcessImpl---> createWallet Method called ...");
		
		CreateWalletResponse response = null;
		
		TIAWalletInvoker invoker=new TIAWalletInvoker();
		response=invoker.createWallet(headerDetails, request);
		if(response!=null && response.getResponseData().getReturnCode().equals("0")){
			logger.info("YFAPIProcessImpl---> createWallet response is success ...");
		}else{
			logger.info("YFAPIProcessImpl---> createWallet response is failure ...");
		}
		logger.info("YFAPIProcessImpl---> createWallet response called ...");
		return response;
	}

	public YFCreateInvoiceResponse invoice(YFCreateInvoiceRequest request,
			HeaderDetails headerDetails) throws SMFAgentException, SOAPException {
		
		logger.info("YFAPIProcessImpl---> invoice Method called ...");
		
		YFCreateInvoiceResponse response = null;
		
		TIAMngmtInvoker invoker=new TIAMngmtInvoker();
		response=invoker.invoice(headerDetails, request);
		if(response!=null && response.getResponseData().getReturnCode().equals("0")){
			logger.info("YFAPIProcessImpl---> invoice response is success ...");
		}else{
			logger.info("YFAPIProcessImpl---> invoice response is failure ...");
		}
		logger.info("YFAPIProcessImpl---> invoice response called ...");
		return response;
	}

	
	
	
	
	
	
}


