package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.HlrCmdReportRequest;
import com.xius.agent.smf.smfmanagement.HlrCmdReportResponse;
import com.xius.agent.smf.smfmanagement.HlrCmdReportType;
import com.xius.billing.AccountManagement_xsd.MDNBasedGetNwIdResponse;
import com.xius.smf.domaindata.HlrCmdReportCursorData;
import com.xius.smf.domaindata.HlrCmdReportData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

import net.bcgi.util.db.SPFactory;

@Service("HlrCmdReportImpl")
public class HlrCmdReportImpl {
	
	@Autowired
	private ApplicationContext context;

	private  static final Logger logger = LogManager.getLogger(HlrCmdReportImpl.class.getSimpleName());


	public HlrCmdReportResponse HlrCmdReport(HlrCmdReportRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException  {

		HlrCmdReportResponse response = new HlrCmdReportResponse();
		HlrCmdReportData domainData = null;
		
			if (request.getSIM() != null) {

				HlrCmdReportGetMDNImpl hlrCmdReportGetMDNImpl = (HlrCmdReportGetMDNImpl)context.getBean("HlrCmdReportGetMDNImpl");
				MDNBasedGetNwIdResponse mDNBasedGetNwIdResponse = hlrCmdReportGetMDNImpl.getSimDetails(request, headerDetails);

				request.setMsisdn(mDNBasedGetNwIdResponse.getMSISDN());
			}

			domainData = setRequestData(request, headerDetails);

			// RECIVED
			SPFactory spfactory = ServiceUtils.executeSPWithOutCommit(
					"pro_get_msisdn_ema_cmd_his", domainData, domainData);

			if (logger.isInfoEnabled()) {

				logger.info(
						"pro_get_msisdn_ema_cmd_his for msisdn" + ">>"
								+ request.getMsisdn() + "Error Code ==>"
								+ domainData.getPo_error_code());
				logger.info(
						"pro_get_msisdn_ema_cmd_his for msisdn" + ">>"
								+ request.getMsisdn() + "Error Msg ==>"
								+ domainData.getPo_error_desc());
			}

			Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

			if (domainData.getPo_error_code() != 0) {
				throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
			} else {
				response = setWebserviceResponse(domainData);
			}
	

		return response;
	}

	private HlrCmdReportResponse setWebserviceResponse(
			HlrCmdReportData domainData) {

		HlrCmdReportResponse response = new HlrCmdReportResponse();
		HlrCmdReportType[] commandlistType = null;
		HlrCmdReportType obj = null;
		HlrCmdReportCursorData cur = null;

		if (domainData != null) {

			if (domainData.getPo_hlr_his_cursor() != null
					&& domainData.getPo_hlr_his_cursor().size() > 0) {

				commandlistType = new HlrCmdReportType[domainData.getPo_hlr_his_cursor().size()];

				for (int i = 0; i < domainData.getPo_hlr_his_cursor().size(); i++) {
					cur = domainData.getPo_hlr_his_cursor().get(i);
					obj = new HlrCmdReportType();

					if (cur.getCommand() != null) {
						obj.setCommand(cur.getCommand());
					}

					if (cur.getCommand_name() != null) {
						//obj.setCommand_name(cur.getCommand_name());
						obj.setCommandName(cur.getCommand_name());
					}

					if (cur.getReason() != null) {
						obj.setReason(cur.getReason());
					}

					if (cur.getStatus() != null) {
						obj.setStatus(cur.getStatus());
					}

					if (cur.getTransaction_date() != null) {
						//obj.setTransaction_date(cur.getTransaction_date());
						obj.setTransactionDate(cur.getTransaction_date());
					}

					if (cur.getTransaction_id() != null) {
						//obj.setTransaction_id(cur.getTransaction_id());
						obj.setTransactionId(cur.getTransaction_id());
					}

					if (cur.getUserId() != null) {
						obj.setUserId(cur.getUserId());
					}

					if (cur.getMsisdn_no() != null) {
						//obj.setMsisdn_no(cur.getMsisdn_no());.
						obj.setMsisdnNo(cur.getMsisdn_no());						
					}
					if (cur.getFlow_name() != null) {
						obj.setFlowName(cur.getFlow_name());
					}

					commandlistType[i] = obj;
				}
			}
			//response.setHlrCmdReportDetails(commandlistType);
			if(commandlistType!=null) {
				response.getHlrCmdReportDetails().addAll(Arrays.asList(commandlistType));
			}
		}
		response.setMessage(domainData.getPo_error_desc());

		return response;
	}

	private HlrCmdReportData setRequestData(HlrCmdReportRequest request,
			HeaderDetails headerDetails) throws 
			RemoteException, SMFAgentException {

		HlrCmdReportData data = new HlrCmdReportData();

		if (headerDetails.getNetworkID() != null) {
			data.setPi_network_id(headerDetails.getNetworkID());
		}
		if (request.getMsisdn() != null) {
			data.setPi_msisdn_no(Long.parseLong(request.getMsisdn()));
		}

		if (request.getStartDate() != null) {
			data.setPi_fromdate(request.getStartDate());
		}
		if (request.getEndDate() != null) {
			data.setPi_todate(request.getEndDate());
		}
		
		if (request.getFlag()!= null) {
			data.setPi_flag_type(request.getFlag());
		}
		if (request.getGetFlag()!= null) {
			data.setPi_get_flag(request.getGetFlag());
		}

		return data;
	}

}
