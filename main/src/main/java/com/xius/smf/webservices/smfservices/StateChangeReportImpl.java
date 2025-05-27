package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smfreport.smfreportsmanagement.StateChangeReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.StateChangeReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.StateChangeReportType;
import com.xius.smf.domaindata.StateChangeReportCusorData;
import com.xius.smf.domaindata.StateChangeReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;



@Service("StateChangeReportImpl")
public class StateChangeReportImpl {

private  static final Logger logger = LogManager.getLogger(StateChangeReportImpl.class.getSimpleName());

public StateChangeReportResponse stateChangeReport(StateChangeReportRequest request,HeaderDetails headerdetails)  throws SMFAgentException {
		
	logger.info("The call reached the smf StateChangeReportimpl");
	StateChangeReportResponse response=null;
	     
	StateChangeReportData data=formMosfRequest(request,headerdetails);
	

	/**
	 * calling db proc using mosf
	 */
	ServiceUtils._executeStoredProcedure("pro_state_change_track_report",data,data);
	Long errorCode = data.getPo_error_code();
	if(null!=errorCode && errorCode!=0){
		logger.info("The error code retuned from db is"+errorCode);
		logger.info("The error Message  retuned from db is"+data.getPo_error_desc());
		
		throw Utilities.setSMFAgentException(errorCode.toString(), data.getPo_error_desc());
	}
	
	response=formWebServiceResponse(data);
	
	
	return response;
	
}


private StateChangeReportResponse formWebServiceResponse(StateChangeReportData data) {
	// TODO Auto-generated method stub
	
	StateChangeReportResponse  webresponse=new StateChangeReportResponse();
	
	logger.info("Forming the StateChangeReportResponse");
	if(null!=data.getTotalRecords())
	webresponse.setTotalRecords(data.getTotalRecords());
	logger.debug("Forming the StateChangeReportResponse no of records are"+data.getTotalRecords());
	
	if(null!=data.getPo_state_chng_cursor()){
		
	ArrayList<StateChangeReportCusorData>  cusordata=data.getPo_state_chng_cursor();
	StateChangeReportType[] statechangeReport=new StateChangeReportType[cusordata.size()]; 
	StateChangeReportType stateChangeReportType;
	
	logger.info("The cusor size returned is"+cusordata.size());
	
	for(int count=0;count<cusordata.size();count++){
		stateChangeReportType=new StateChangeReportType();
		
		if(null!=cusordata.get(count).getNew_subscr_status())
			stateChangeReportType.setNewSubscrStatus(cusordata.get(count).getNew_subscr_status());
		logger.info("The setNewSubscrStatus is"+cusordata.get(count).getNew_subscr_status());
		
		if(!Utilities.isNull(cusordata.get(count).getTransaction_id()))
			stateChangeReportType.setTransactionId(cusordata.get(count).getTransaction_id());
		logger.info("The TransactionId is"+cusordata.get(count).getTransaction_id());
		
		if(!Utilities.isNull(cusordata.get(count).getTransaction_date()))
			stateChangeReportType.setTransactionDate(cusordata.get(count).getTransaction_date());
		logger.info("The TransactionDate is"+cusordata.get(count).getTransaction_date());
		
		if(null!=cusordata.get(count).getReason())  
			stateChangeReportType.setReason(cusordata.get(count).getReason());
		logger.info("The Reason is"+cusordata.get(count).getReason());
		
		if(!Utilities.isNull(cusordata.get(count).getUser_id()))
			stateChangeReportType.setUserId(cusordata.get(count).getUser_id());
		logger.info("The Userid is"+cusordata.get(count).getUser_id());
		
		if(!Utilities.isNull(cusordata.get(count).getChannel_id()))
			stateChangeReportType.setCHANNELID(cusordata.get(count).getChannel_id());
		logger.info("The channel id is"+cusordata.get(count).getChannel_id());
		
		
		if(null!=cusordata.get(count).getTransaction_ref_num())
			stateChangeReportType.setTransactionRefNum(cusordata.get(count).getTransaction_ref_num());
		logger.info("The TransactionRefNum is"+cusordata.get(count).getTransaction_ref_num());
		
		if(null!=cusordata.get(count).getOld_subscr_status())
			stateChangeReportType.setOldSubcrStatus(cusordata.get(count).getOld_subscr_status());
		logger.info("The oldSubcrStatus is"+cusordata.get(count).getOld_subscr_status());
		
		if(null!=cusordata.get(count).getRemarks())  
			stateChangeReportType.setRemarks(cusordata.get(count).getRemarks());
		logger.info("The remarks is"+cusordata.get(count).getRemarks());
		
		if(null!=cusordata.get(count).getStatus())
			stateChangeReportType.setStatus(cusordata.get(count).getStatus());
		logger.info("The status is"+cusordata.get(count).getStatus());
		
		statechangeReport[count]=stateChangeReportType;
	}
	if(statechangeReport!=null && statechangeReport.length>0) {
	webresponse.getStateChangeTransactions().addAll(Arrays.asList(statechangeReport));
	}
	}
	
	return webresponse;
}


private StateChangeReportData formMosfRequest(
		StateChangeReportRequest request,HeaderDetails headerdetails) {
	// TODO Auto-generated method stub
	logger.info("setting the request");
	StateChangeReportData data=new StateChangeReportData();
	
	if(null!=headerdetails.getNetworkID())
	data.setPi_network_id(headerdetails.getNetworkID());
	
	if(!Utilities.isNull(request.getMSISDN()))
	data.setPi_msisdn(Long.parseLong(request.getMSISDN()));

	if(!Utilities.isNull(request.getFromDate()))
	data.setFromDate(request.getFromDate());
	
	if(!Utilities.isNull(request.getToDate()))
	data.setToDate(request.getToDate());
	
	if(null!=request.getMaxRecords())
	data.setMaxRecords(request.getMaxRecords());
	
	if(null!=request.getNextRecordIndex())
	data.setNextRecordIndex(request.getNextRecordIndex());

	
	return data;

}



}
