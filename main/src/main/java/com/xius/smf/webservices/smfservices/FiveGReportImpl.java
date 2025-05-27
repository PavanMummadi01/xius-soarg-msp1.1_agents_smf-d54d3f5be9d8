package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smfreport.smfreportsmanagement.FiveGReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.FiveGReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.FiveGReportType;
import com.xius.smf.domaindata.FiveGReportCusorData;
import com.xius.smf.domaindata.FiveGReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("FiveGReportImpl")
public class FiveGReportImpl {
	
	private  static final Logger logger = LogManager.getLogger(FiveGReportImpl.class.getSimpleName());
	
	public FiveGReportResponse fiveGreport(FiveGReportRequest request , HeaderDetails headerdetails) throws SMFAgentException, com.xius.smf.exceptions.SMFAgentException {
		
		logger.info("The call reached the smfReport FiveGReportImpl");
		
		FiveGReportResponse response = new FiveGReportResponse();
		
		FiveGReportData data = new FiveGReportData();
		data= formMosfRequest(request,headerdetails);
		
		ServiceUtils._executeStoredProcedure("pro_subs_bulk_flw_trcr_report", data, data);
		Long errorCode = data.getPo_error_code();
		if (null != errorCode && errorCode != 0) {
			logger.info("The error code retuned from db is" + errorCode);
			logger.info("The error Message  retuned from db is" + data.getPo_error_desc());

			throw Utilities.setSMFAgentException(errorCode.toString(), data.getPo_error_desc());
		}
		response = fiveGwebResponse(data);
		
		return response;
	}
		
	public FiveGReportResponse fiveGwebResponse(FiveGReportData data) {
		
		FiveGReportResponse webResponse = new FiveGReportResponse();
		
		logger.info("Forming the FiveGReportResponse");
		if(null!=data.getTotalRecords()) {
			webResponse.setTotalRecords(data.getTotalRecords());
		}
		logger.debug("Forming the FiveGReportResponse no of records are" + data.getTotalRecords());
		
		if(null!=data.getPo_fiveG_cursor()) {
			
			ArrayList<FiveGReportCusorData> fiveGCursorData = data.getPo_fiveG_cursor();
			FiveGReportType[] fiveG = new FiveGReportType[fiveGCursorData.size()];
			FiveGReportType type;
			
	// msisdn_no; internal_transaction_id;ext_transaction_id;provision_type;transaction_date;process_status;process_remarks;row_update_time;		
			
			logger.info("The cusor size returned is" + fiveGCursorData.size());
			
			for(int i =0; i<fiveGCursorData.size(); i++) {
				 type= new FiveGReportType();
				 if(fiveGCursorData.get(i).getMsisdn_no()!=null) 
					 type.setMsisdnNo(fiveGCursorData.get(i).getMsisdn_no().toString());
				 logger.info("The Msisdn_no is" + fiveGCursorData.get(i).getMsisdn_no());
				 
				 if(fiveGCursorData.get(i).getInternal_transaction_id()!=null)
					 type.setInternalTransId(fiveGCursorData.get(i).getInternal_transaction_id().toString());
				 
				 logger.info("The Internal_transaction_id is" + fiveGCursorData.get(i).getInternal_transaction_id());
				 
				 if(!Utilities.isNull(fiveGCursorData.get(i).getTransaction_id()))
					 type.setTransactionId(fiveGCursorData.get(i).getTransaction_id());
				 logger.info("The Transaction_id is" + fiveGCursorData.get(i).getTransaction_id());	 
				 
				 if(!Utilities.isNull(fiveGCursorData.get(i).getProvision_type()))
					 type.setProvisionType(fiveGCursorData.get(i).getProvision_type());
				 logger.info("The Provision_type is" + fiveGCursorData.get(i).getProvision_type());	 
				 
				 if(!Utilities.isNull(fiveGCursorData.get(i).getTransaction_date()))
					 type.setTransactionDate(fiveGCursorData.get(i).getTransaction_date());
				 logger.info("The Transaction_date is" + fiveGCursorData.get(i).getTransaction_date());	 
				 
				 if (!Utilities.isNull(fiveGCursorData.get(i).getStatus()))
						type.setStatus(fiveGCursorData.get(i).getStatus());
					logger.info("The getProcess_status  is" + fiveGCursorData.get(i).getStatus());
					
				if (!Utilities.isNull(fiveGCursorData.get(i).getRemarks()))
						type.setRemarks(fiveGCursorData.get(i).getRemarks());
					logger.info("The Process_remarks is" + fiveGCursorData.get(i).getRemarks());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getRow_update_time()))
					type.setRowUpdateTime(fiveGCursorData.get(i).getRow_update_time());
				logger.info("The Row_update_time is" + fiveGCursorData.get(i).getRow_update_time());
			 
												   
				if(!Utilities.isNull(fiveGCursorData.get(i).getUser_id()))
					type.setUserId(fiveGCursorData.get(i).getUser_id());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getAccount_type()))
					type.setAccountType(fiveGCursorData.get(i).getAccount_type());

				if(!Utilities.isNull(fiveGCursorData.get(i).getChannel()))
					type.setChannel(fiveGCursorData.get(i).getChannel());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getService_flag()))
					type.setServiceFlag(fiveGCursorData.get(i).getService_flag());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getActivity_id()))
					type.setActivityId(fiveGCursorData.get(i).getActivity_id());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getAccount_id()))
					type.setAccountId(fiveGCursorData.get(i).getAccount_id());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getSim_serial_no()))
					type.setSimSerialNo(fiveGCursorData.get(i).getSim_serial_no());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getImsi_no()))
					type.setImsiNo(fiveGCursorData.get(i).getImsi_no());
				
				if(!Utilities.isNull(fiveGCursorData.get(i).getAcct_status()))
					type.setAcctStatus(fiveGCursorData.get(i).getAcct_status());

				
				
				
				fiveG[i]=type;
			}
			if(fiveG!=null&&fiveG.length>0){
				/*webResponse.setFiveGTransactions(fiveG);*/
				webResponse.getFiveGTransactions().addAll(Arrays.asList(fiveG));
			}
		}
		
		return webResponse;
		
	}
	
	public FiveGReportData formMosfRequest(FiveGReportRequest request, HeaderDetails headerdetails) {
		
		logger.info("setting the request");
		
	//	MSISDN ,fromDate,toDate,maxRecords,nextRecordIndex
		
		FiveGReportData data = new FiveGReportData();
		
		if (null != headerdetails.getNetworkID()) {
			data.setPi_network_id(headerdetails.getNetworkID());
		}
		if(!Utilities.isNull(request.getMSISDN())) {
			data.setMsisdn_no(Long.valueOf(request.getMSISDN()));
		}
		if(!Utilities.isNull(request.getFromDate())) {
			data.setFromDate(request.getFromDate());
		}
		if(!Utilities.isNull(request.getToDate())) {
			data.setToDate(request.getToDate());
		}
		if (null != request.getMaxRecords()) {
			data.setMaxRecords(request.getMaxRecords());
		}
		if (null != request.getNextRecordIndex()) {
			data.setNextRecordIndex(request.getNextRecordIndex());
			}
			
		return data;
		
	}

}
