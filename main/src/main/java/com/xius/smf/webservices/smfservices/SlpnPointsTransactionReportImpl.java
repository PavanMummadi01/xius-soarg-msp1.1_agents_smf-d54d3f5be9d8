package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;



import com.xius.agent.smfreport.smfreportsmanagement.SlpnPointsTransactionReportRequest;
import com.xius.agent.smfreport.smfreportsmanagement.SlpnPointsTransactionReportResponse;
import com.xius.agent.smfreport.smfreportsmanagement.SlpnPointsTransactionsType;
import com.xius.smf.domaindata.SlpnPointsTransactionReportCusorData;
import com.xius.smf.domaindata.SlpnPointsTransactionReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("SlpnPointsTransactionReportImpl")
public class SlpnPointsTransactionReportImpl {
	private  static final Logger logger = LogManager.getLogger(SlpnPointsTransactionReportImpl.class.getSimpleName());

	public SlpnPointsTransactionReportResponse getslpnPointsTransactionReport(
			SlpnPointsTransactionReportRequest request,HeaderDetails headerdetails) throws SMFAgentException
			{
		SlpnPointsTransactionReportResponse response;
		
		SlpnPointsTransactionReportData data=formMosfException(request,headerdetails);
		
		/**
		 * calling db proc using mosf
		 */
		ServiceUtils._executeStoredProcedure("pro_slpn_points_redem_rpt",data,data);
		Long errorCode = data.getPo_error_code();
		if(null!=errorCode && errorCode!=0){
			logger.info("The error code retuned from db is"+errorCode);
			logger.info("The error Message  retuned from db is"+data.getPo_error_desc());
			
			throw Utilities.setSMFAgentException( errorCode.toString(), data.getPo_error_desc());
		}
		
		response=formWebServiceResponse(data);
				
		
		return response;
			}

	private SlpnPointsTransactionReportResponse formWebServiceResponse(SlpnPointsTransactionReportData data) {
		// TODO Auto-generated method stub
		
		SlpnPointsTransactionReportResponse webresponse= new SlpnPointsTransactionReportResponse();
		
		logger.info("Forming the SlpnPointsTransactionReportResponse");
		if(null!=data.getTotalRecords())
		webresponse.setTotalRecords(data.getTotalRecords());
		
		if(null!=data.getSlpnPointsTransactionReportCusorData()){
		ArrayList<SlpnPointsTransactionReportCusorData>  cusordata=data.getSlpnPointsTransactionReportCusorData();
		
		
		
		SlpnPointsTransactionsType[] responsearray=new SlpnPointsTransactionsType[cusordata.size()]; 
		SlpnPointsTransactionsType transactiontype;
		for(int count=0;count<cusordata.size();count++){
			transactiontype=new SlpnPointsTransactionsType();
			if(!Utilities.isNull(cusordata.get(count).getClientid()))
			transactiontype.setClientId(cusordata.get(count).getClientid());
			if(null!=cusordata.get(count).getExtErrorCode())
			transactiontype.setExtErrorCode(cusordata.get(count).getExtErrorCode());
			if(null!=cusordata.get(count).getMSISDN())
			transactiontype.setMSISDN(cusordata.get(count).getMSISDN());
			if(!Utilities.isNull(cusordata.get(count).getOperation()))
			transactiontype.setOperation(cusordata.get(count).getOperation());
			if(!Utilities.isNull(cusordata.get(count).getPublicityId()))
			transactiontype.setPublicityId(cusordata.get(count).getPublicityId());
			if(null!=cusordata.get(count).getRedeemptiondenomination())  
			transactiontype.setRedeemptionDenomination(cusordata.get(count).getRedeemptiondenomination());
			if(!Utilities.isNull(cusordata.get(count).getRemarks()))
			transactiontype.setRemarks(cusordata.get(count).getRemarks());
			if(null!=cusordata.get(count).getRowCount())
			transactiontype.setRowCount(cusordata.get(count).getRowCount());
			if(!Utilities.isNull(cusordata.get(count).getReverseReffNum()))
			transactiontype.setReverseReffNum(cusordata.get(count).getReverseReffNum());
			if(null!=cusordata.get(count).getSlpnpoints())
			transactiontype.setSlpnPoints(cusordata.get(count).getSlpnpoints());
			if(!Utilities.isNull(cusordata.get(count).getStatus()))
			transactiontype.setStatus(cusordata.get(count).getStatus());
			if(!Utilities.isNull(cusordata.get(count).getTransactionDate()))
			transactiontype.setTransactionDate(cusordata.get(count).getTransactionDate());
			if(!Utilities.isNull(cusordata.get(count).getTransactionId()))
			transactiontype.setTransactionId(cusordata.get(count).getTransactionId());
			responsearray[count]=transactiontype;
		}
		
		if(responsearray!=null && responsearray.length>0) {
		webresponse.getSlpnPointsTransactions().addAll(Arrays.asList(responsearray));	
		}
		}
				
		return webresponse;
	}

	

	private SlpnPointsTransactionReportData formMosfException(
			SlpnPointsTransactionReportRequest request,
			HeaderDetails headerdetails) {
		// TODO Auto-generated method stub
		logger.info("setting the request");
		SlpnPointsTransactionReportData data=new SlpnPointsTransactionReportData();
		
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
		
		
		
		
		return data;
	}
	
}
