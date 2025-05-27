package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smfreport.smfreportsmanagement.VolteProcessReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.VolteProcessReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.VolteProcessReportType;
import com.xius.smf.domaindata.VolteProcessReportCusorData;
import com.xius.smf.domaindata.VolteProcessReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;



@Service("VolteProcessReportImpl")
public class VolteProcessReportImpl {
private  static final Logger logger = LogManager.getLogger(VolteProcessReportImpl.class.getSimpleName());


public VolteProcessReportResponse volteProcessReport(VolteProcessReportRequest request,HeaderDetails headerdetails)  throws SMFAgentException {
		
	logger.info("The call reached the smf VolteProcessReportimpl");
	VolteProcessReportResponse response=null;
	     
	VolteProcessReportData data=formMosfRequest(request,headerdetails);
	

	/**
	 * calling db proc using mosf
	 */
	ServiceUtils._executeStoredProcedure("pro_lte_srvc_volte_report",data,data);
	Long errorCode = data.getPo_error_code();
	if(null!=errorCode && errorCode!=0){
		logger.info("The error code retuned from db is"+errorCode);
		logger.info("The error Message  retuned from db is"+data.getPo_error_desc());
		
		throw Utilities.setSMFAgentException(errorCode.toString(), data.getPo_error_desc());
	}
	
	response=formWebServiceResponse(data);
	
	
	return response;
	
}


private VolteProcessReportResponse formWebServiceResponse(VolteProcessReportData data) {
	// TODO Auto-generated method stub
	
	VolteProcessReportResponse  webresponse=new VolteProcessReportResponse();
	
	logger.info("Forming the VolteProcessReportResponse");
	if(null!=data.getTotalRecords())
	webresponse.setTotalRecords(data.getTotalRecords());
	logger.debug("Forming the VolteProcessReportResponse no of records are"+data.getTotalRecords());
	
	if(null!=data.getPo_volte_cursor()){
		
	ArrayList<VolteProcessReportCusorData>  cusordata=data.getPo_volte_cursor();
	VolteProcessReportType[] volteProcessReport=new VolteProcessReportType[cusordata.size()]; 
	VolteProcessReportType volteProcessReportType;
	
	logger.info("The cusor size returned is"+cusordata.size());
	
	for(int count=0;count<cusordata.size();count++){
		volteProcessReportType=new VolteProcessReportType();
		
		if(null!=cusordata.get(count).getMsisdn_no())  
			volteProcessReportType.setMsisdnNo(cusordata.get(count).getMsisdn_no().toString());
		logger.info("The Msisdn_no is"+cusordata.get(count).getMsisdn_no());

		if(null!=(cusordata.get(count).getInternal_transaction_id()))
			volteProcessReportType.setInternalTransactionId(cusordata.get(count).getInternal_transaction_id().toString());
		logger.info("The Internal_transaction_id is"+cusordata.get(count).getInternal_transaction_id());
		
		if(!Utilities.isNull(cusordata.get(count).getExt_transaction_id()))
			volteProcessReportType.setExtTransactionId(cusordata.get(count).getExt_transaction_id());
		logger.info("The Ext_transaction_id is"+cusordata.get(count).getExt_transaction_id());
		
		
		if(!Utilities.isNull(cusordata.get(count).getUser_id()))
			volteProcessReportType.setUserId(cusordata.get(count).getUser_id());
		logger.info("The Userid is"+cusordata.get(count).getUser_id());
		
		if(!Utilities.isNull(cusordata.get(count).getProcess_date()))
			volteProcessReportType.setProcessDate(cusordata.get(count).getProcess_date());
		logger.info("The Process_date  is"+cusordata.get(count).getProcess_date());
		
		
		if(!Utilities.isNull(cusordata.get(count).getChannel_name()))
			volteProcessReportType.setChannelID(cusordata.get(count).getChannel_name());
		logger.info("The Channel_name is"+cusordata.get(count).getChannel_name());
		
		
		if(!Utilities.isNull(cusordata.get(count).getProcess_remarks()))
			volteProcessReportType.setRemarks(cusordata.get(count).getProcess_remarks());
		logger.info("The Process_remarks is"+cusordata.get(count).getProcess_remarks());
		
		if(!Utilities.isNull(cusordata.get(count).getProcess_status()))
			volteProcessReportType.setStatus(cusordata.get(count).getProcess_status());
		logger.info("The getProcess_status  is"+cusordata.get(count).getProcess_status());
		
		if(!Utilities.isNull(cusordata.get(count).getService_flag()))
			volteProcessReportType.setServiceFlag(cusordata.get(count).getService_flag());
		logger.info("The Service_flag is"+cusordata.get(count).getService_flag());
		
		if(null!=(cusordata.get(count).getAccount_type()))
			volteProcessReportType.setAccountType(cusordata.get(count).getAccount_type().toString());
		logger.info("The Account_type  is"+cusordata.get(count).getAccount_type());
		
		if(null!=cusordata.get(count).getRow_num())
			volteProcessReportType.setUserDefined1(cusordata.get(count).getRow_num().toString());
		logger.info("The getRow_num is"+cusordata.get(count).getRow_num());
		
	//	if(null!=cusordata.get(count).getStatus())
	//		volteProcessReportType.setStatus(cusordata.get(count).getStatus());
	//	logger.info("The status is"+cusordata.get(count).getStatus());
		
		if(null!=cusordata.get(count).getActivity_id())
			volteProcessReportType.setActivityId(cusordata.get(count).getActivity_id().toString());
		logger.info(" The getActivity_id is:"+cusordata.get(count).getActivity_id());
				
		if(null!=cusordata.get(count).getAccount_id())	
			volteProcessReportType.setAccountId(cusordata.get(count).getAccount_id().toString());
		logger.info(" The getAccount_id is: "+cusordata.get(count).getAccount_id());
				
		if(null!=cusordata.get(count).getSim_serial_no())	
			volteProcessReportType.setICCID(cusordata.get(count).getSim_serial_no());
		logger.info(" The  getSim_serial_no is:"+cusordata.get(count).getSim_serial_no());
		
		if(null!=cusordata.get(count).getImsi_no())
				volteProcessReportType.setIMSI(cusordata.get(count).getImsi_no().toString());
		logger.info(" The  getImsi_no is:"+cusordata.get(count).getImsi_no());
		
		if(null!=cusordata.get(count).getAcct_status())
			volteProcessReportType.setAccountStatus(cusordata.get(count).getAcct_status());
		logger.info(" The getAcct_status :"+cusordata.get(count).getAcct_status());
		
		
		volteProcessReport[count]=volteProcessReportType;
	}
	if(volteProcessReport!=null && volteProcessReport.length>0) {
	webresponse.getVolteProcessTransactions().addAll(Arrays.asList(volteProcessReport));	
	}
	}
	
	return webresponse;
}


private VolteProcessReportData formMosfRequest(
		VolteProcessReportRequest request,HeaderDetails headerdetails) {
	// TODO Auto-generated method stub
	logger.info("setting the request");
	VolteProcessReportData data=new VolteProcessReportData();
	
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
