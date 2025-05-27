package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import com.xius.agent.smfreport.smfreportsmanagement.CaGroupTransactionReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.CaGroupTransactionReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.CaGroupTransactionsType;
import com.xius.smf.domaindata.CaGroupTransactionReportCusorData;
import com.xius.smf.domaindata.CaGroupTransactionReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("CaGroupTransactionReportImpl")
public class CaGroupTransactionReportImpl {
	private  static final Logger logger = LogManager.getLogger(CaGroupTransactionReportImpl.class.getSimpleName());


public CaGroupTransactionReportResponse caGroupTransactionReport(CaGroupTransactionReportRequest request,HeaderDetails headerdetails)  throws SMFAgentException {
		
	logger.info("The call reached the smf caGroupTransactionReport");
	CaGroupTransactionReportResponse response=null;
	     
	CaGroupTransactionReportData data=formMosfRequest(request,headerdetails);
	

	/**
	 * calling db proc using mosf
	 */
	ServiceUtils._executeStoredProcedure("pro_ca_group_transdetails",data,data);
	Long errorCode = data.getPo_error_code();
	if(null!=errorCode && errorCode!=0){
		logger.info("The error code retuned from db is"+errorCode);
		logger.info("The error Message  retuned from db is"+data.getPo_error_desc());
		
		throw Utilities.setSMFAgentException(errorCode.toString(), data.getPo_error_desc());
	}
	
	response=formWebServiceResponse(data);
	
	
	return response;
	
}


private CaGroupTransactionReportResponse formWebServiceResponse(CaGroupTransactionReportData data) {
	// TODO Auto-generated method stub
	
	CaGroupTransactionReportResponse  webresponse=new CaGroupTransactionReportResponse();
	
	logger.info("Forming the CaGroupTransactionReportResponse");
	if(null!=data.getTotalRecords())
	webresponse.setTotalRecords(data.getTotalRecords());
	logger.debug("Forming the CaGroupTransactionReportResponse no of records are"+data.getTotalRecords());
	
	if(null!=data.getPo_transdetails()){
		
	ArrayList<CaGroupTransactionReportCusorData>  cusordata=data.getPo_transdetails();
	CaGroupTransactionsType[] caGroupTransactionsTypes=new CaGroupTransactionsType[cusordata.size()]; 
	CaGroupTransactionsType caGroupTransactionsType;
	
	logger.info("The cusor size returned is"+cusordata.size());
	
	for(int count=0;count<cusordata.size();count++){
		caGroupTransactionsType=new CaGroupTransactionsType();
		
		if(null!=cusordata.get(count).getGrp_name())
			caGroupTransactionsType.setGrpName(cusordata.get(count).getGrp_name());
		
		if(!Utilities.isNull(cusordata.get(count).getUser_name()))
			caGroupTransactionsType.setUserName(cusordata.get(count).getUser_name());
		
		if(!Utilities.isNull(cusordata.get(count).getStatus()))
			caGroupTransactionsType.setStatus(cusordata.get(count).getStatus());
		if(!Utilities.isNull(cusordata.get(count).getRemarks()))
			caGroupTransactionsType.setRemarks(cusordata.get(count).getRemarks());
		
		if(null!=cusordata.get(count).getGrp_parent_msisdn_no())  
			caGroupTransactionsType.setGrpParentMsisdnNO(cusordata.get(count).getGrp_parent_msisdn_no());
		if(null!=cusordata.get(count).getParntacct_id())  
			caGroupTransactionsType.setParntAcctID(cusordata.get(count).getParntacct_id());
		
		
		if(null!=cusordata.get(count).getChild_msisdns())
			caGroupTransactionsType.setChildMSISDN(cusordata.get(count).getChild_msisdns());
		
		
		if(cusordata.get(count).getTransaction_date()!=null)
			caGroupTransactionsType.setTransactionDate(cusordata.get(count).getTransaction_date());
		
		
		if(cusordata.get(count).getInernal_transaction_id()!=null)
			caGroupTransactionsType.setInternalTransactionId(String.valueOf(cusordata.get(count).getInernal_transaction_id()));
		
		if(cusordata.get(count).getExternal_trans_id()!=null)
			caGroupTransactionsType.setExternalTransactionId(String.valueOf(cusordata.get(count).getExternal_trans_id()));
		
		if(cusordata.get(count).getStatus_updated_date()!=null)
			caGroupTransactionsType.setStatusUpdatedDate(cusordata.get(count).getStatus_updated_date());
		
		if(cusordata.get(count).getRowCount()!=null)
			caGroupTransactionsType.setRowCount(cusordata.get(count).getRowCount());
		
		caGroupTransactionsTypes[count]=caGroupTransactionsType;
	}
	if(caGroupTransactionsTypes!=null && caGroupTransactionsTypes.length>0) {
	webresponse.getCaGroupTransactions().addAll(Arrays.asList(caGroupTransactionsTypes));	
	}
	}
	return webresponse;
}




private CaGroupTransactionReportData formMosfRequest(
		CaGroupTransactionReportRequest request,HeaderDetails headerdetails) {
	
	logger.info("setting the request");
	CaGroupTransactionReportData data=new CaGroupTransactionReportData();
	
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
	
	if(null!=request.getExternalTransactionId())
		data.setPi_ext_transaction_id(Long.valueOf(request.getExternalTransactionId()));
	
	
	return data;

}



}
