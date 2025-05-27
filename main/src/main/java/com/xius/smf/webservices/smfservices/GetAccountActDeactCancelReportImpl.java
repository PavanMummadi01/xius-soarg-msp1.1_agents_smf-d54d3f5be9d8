package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smfreport.smfreportsmanagement.ActDeactCancelTransactionsType;
import com.xius.agent.smfreport.smfreportsmanagement.GetAccountActDeactCancelReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.GetAccountActDeactCancelReportResponse;
import com.xius.smf.domaindata.GetAccountActDeactCancelReportCusorData;
import com.xius.smf.domaindata.GetAccountActDeactCancelReportData;
import com.xius.smf.domaindata.SlpnPointsTransactionReportCusorData;
import com.xius.smf.domaindata.SlpnPointsTransactionReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;



@Service("GetAccountActDeactCancelReportImpl")
public class GetAccountActDeactCancelReportImpl {
	private  static final Logger logger = LogManager.getLogger(GetAccountActDeactCancelReportImpl.class.getSimpleName());


public GetAccountActDeactCancelReportResponse getAccountActDeactCancelReport(GetAccountActDeactCancelReportRequest request,HeaderDetails headerdetails)  throws SMFAgentException {
		
	logger.info("The call reached the smf getAccountActDeactCancelReport");
	GetAccountActDeactCancelReportResponse response=null;
	     
	GetAccountActDeactCancelReportData data=formMosfRequest(request,headerdetails);
	

	/**
	 * calling db proc using mosf
	 */
	ServiceUtils._executeStoredProcedure("pro_account_act_deact_report",data,data);
	Long errorCode = data.getPo_error_code();
	if(null!=errorCode && errorCode!=0){
		logger.info("The error code retuned from db is"+errorCode);
		logger.info("The error Message  retuned from db is"+data.getPo_error_desc());
		
		throw Utilities.setSMFAgentException(errorCode.toString(), data.getPo_error_desc());
	}
	
	response=formWebServiceResponse(data);
	
	
	return response;
	
}




private GetAccountActDeactCancelReportResponse formWebServiceResponse(GetAccountActDeactCancelReportData data) {
	// TODO Auto-generated method stub
	
	GetAccountActDeactCancelReportResponse  webresponse=new GetAccountActDeactCancelReportResponse();
	
	logger.info("Forming the GetAccountActDeactCancelReportResponse");
	if(null!=data.getTotalRecords())
	webresponse.setTotalRecords(data.getTotalRecords());
	logger.debug("Forming the GetAccountActDeactCancelReportResponse no of records are"+data.getTotalRecords());
	
	if(null!=data.getGetaccountActDeactCancelReportCusorData()){
		
	ArrayList<GetAccountActDeactCancelReportCusorData>  cusordata=data.getGetaccountActDeactCancelReportCusorData();
	ActDeactCancelTransactionsType[] actDeactCancelTransactions=new ActDeactCancelTransactionsType[cusordata.size()]; 
	ActDeactCancelTransactionsType actDeactCancelTransactionsType;
	
	logger.info("The cusor size returned is"+cusordata.size());
	
	for(int count=0;count<cusordata.size();count++){
		actDeactCancelTransactionsType=new ActDeactCancelTransactionsType();
		
		if(null!=cusordata.get(count).getMSISDN())
		actDeactCancelTransactionsType.setMSISDN(cusordata.get(count).getMSISDN());
		
		if(!Utilities.isNull(cusordata.get(count).getChannelid()))
			actDeactCancelTransactionsType.setChannelId(cusordata.get(count).getChannelid());
		logger.info("The channel id is"+cusordata.get(count).getChannelid());
		if(!Utilities.isNull(cusordata.get(count).getLoginid()))
			actDeactCancelTransactionsType.setLoginId(cusordata.get(count).getLoginid());
		logger.info("The Loginid is"+cusordata.get(count).getLoginid());
		
		if(null!=cusordata.get(count).getReason())  
			actDeactCancelTransactionsType.setReason(cusordata.get(count).getReason());
		
		logger.info("The Reason is"+cusordata.get(count).getReason());
		
		if(null!=cusordata.get(count).getRowCount())
			actDeactCancelTransactionsType.setRowCount(cusordata.get(count).getRowCount());
		
		logger.info("The RowCount is"+cusordata.get(count).getRowCount());
		
		if(!Utilities.isNull(cusordata.get(count).getTransactionDate()))
			actDeactCancelTransactionsType.setTransactionDate(cusordata.get(count).getTransactionDate());
		
		logger.info("The TransactionDate is"+cusordata.get(count).getTransactionDate());
		
		if(!Utilities.isNull(cusordata.get(count).getTransactionId()))
			actDeactCancelTransactionsType.setTransactionId(cusordata.get(count).getTransactionId());
		
		logger.info("The TransactionId is"+cusordata.get(count).getTransactionId());
		
		if(!Utilities.isNull(cusordata.get(count).getOperation()))
				actDeactCancelTransactionsType.setOperation(cusordata.get(count).getOperation());
		
	
		
		
		
		actDeactCancelTransactions[count]=actDeactCancelTransactionsType;
	}
	
	if(actDeactCancelTransactions!=null && actDeactCancelTransactions.length>0) {
	webresponse.getActDeactCancelTransactions().addAll(Arrays.asList(actDeactCancelTransactions));	
	}
	}
	
	
	return webresponse;
}




private GetAccountActDeactCancelReportData formMosfRequest(
		GetAccountActDeactCancelReportRequest request,HeaderDetails headerdetails) {
	// TODO Auto-generated method stub
	logger.info("setting the request");
	GetAccountActDeactCancelReportData data=new GetAccountActDeactCancelReportData();
	
	if(null!=headerdetails.getNetworkID())
	data.setPi_network_id(headerdetails.getNetworkID());
	
	if(!Utilities.isNull(request.getFromDate()))
	data.setFromDate(request.getFromDate());
	
	if(!Utilities.isNull(request.getToDate()))
	data.setToDate(request.getToDate());
	
	if(null!=request.getMaxRecords())
	data.setMaxRecords(request.getMaxRecords());
	
	if(null!=request.getNextRecordIndex())
	data.setNextRecordIndex(request.getNextRecordIndex());
	
	if(!Utilities.isNull(request.getOperationType()))
	data.setOperationtype(request.getOperationType().toUpperCase());
	
	if(!Utilities.isNull(request.getMSISDN()))
	data.setPi_msisdn_no(Long.parseLong(request.getMSISDN()));
	
	if(request.getAccount()!=null)
		data.setPi_account_no(request.getAccount());
	
	
	return data;

}



}
