package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.BulkDetailsType;
import com.xius.agent.smf.smfmanagement.BulkSplcreditDtlsType;
import com.xius.agent.smf.smfmanagement.GetBulkSplCreditTransDtlsRequest;
import com.xius.agent.smf.smfmanagement.GetBulkSplCreditTransDtlsResponse;
import com.xius.smf.domaindata.GetBulkSplCreditTransCursorData;
import com.xius.smf.domaindata.GetBulkSplCreditTransDetails;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("GetBulkSplCreditTransDtlsImpl")
public class GetBulkSplCreditTransDtlsImpl {

	private  static final Logger logger = LogManager.getLogger(GetBulkSplCreditTransDtlsImpl.class.getSimpleName());

	public GetBulkSplCreditTransDtlsResponse getBulkSplCreditTransDtls(GetBulkSplCreditTransDtlsRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException {
		GetBulkSplCreditTransDtlsResponse response = new GetBulkSplCreditTransDtlsResponse();
		GetBulkSplCreditTransDetails domainData = null;
		domainData = setRequestData(request, headerDetails);

		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_spl_credit_trans_dtls", domainData,
				domainData);

		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() != 0) {

			throw Utilities.setSMFAgentException(String.valueOf(domainData.getPo_error_code()),
					domainData.getPo_error_desc());
		} else {
			response = setWebserviceResponse(domainData);
		}

		return response;

	}

	private GetBulkSplCreditTransDetails setRequestData(GetBulkSplCreditTransDtlsRequest request,
			HeaderDetails headerDetails2) {
		GetBulkSplCreditTransDetails domainData = new GetBulkSplCreditTransDetails();

		if (headerDetails2.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails2.getNetworkID());

		if (request.getStartDate() != null)
			domainData.setPi_startdate(request.getStartDate());

		if (request.getEndDate() != null)
			domainData.setPi_enddate(request.getEndDate());

		if (request.getBatchId() != null)
			domainData.setPi_batch_id(request.getBatchId());

		return domainData;
	}

	private GetBulkSplCreditTransDtlsResponse setWebserviceResponse(GetBulkSplCreditTransDetails domainData) {
		GetBulkSplCreditTransDtlsResponse response = new GetBulkSplCreditTransDtlsResponse();

		if (domainData != null) {

			BulkSplcreditDtlsType[] bulkTPSubDetails = null;
			BulkSplcreditDtlsType det = null;
			GetBulkSplCreditTransCursorData cur = null;
			List<BulkSplcreditDtlsType> sl = new ArrayList<BulkSplcreditDtlsType>();
			if (domainData.getPo_spl_credit_trans_dtls() != null
					&& domainData.getPo_spl_credit_trans_dtls().size() > 0) {

				bulkTPSubDetails = new BulkSplcreditDtlsType[domainData.getPo_spl_credit_trans_dtls().size()];

				for (int iter = 0; iter < domainData.getPo_spl_credit_trans_dtls().size(); iter++) {
					cur = domainData.getPo_spl_credit_trans_dtls().get(iter);
					det = new BulkSplcreditDtlsType();

					if (cur.getTransaction_id() != null)
						det.setTransactionId(cur.getTransaction_id());

					if (cur.getMsisdn_no() != null)
						det.setMsisdn(cur.getMsisdn_no().toString());

					if (cur.getReason() != null)
						det.setReason(cur.getReason());
					if (cur.getValidity_date() != null)
						det.setValidityDate(cur.getValidity_date());
					if (cur.getGp_end_date() != null)
						det.setNewGracePeriodEndDate(cur.getGp_end_date());
					if (cur.getExpiry_date() != null)
						det.setExpiryDate(cur.getExpiry_date());

					if (cur.getStatus() != null)
						det.setStatus(cur.getStatus());

					if (cur.getTransactionDate() != null)
						det.setTransactionDate(cur.getTransactionDate());

					if (cur.getCredit_amount() != null)
						det.setAmount(cur.getCredit_amount().toString());

					bulkTPSubDetails[iter] = det;
				}

			}

			if (domainData.getPo_spl_credit_batch_ids() != null && domainData.getPo_spl_credit_batch_ids().size() > 0) {

				bulkTPSubDetails = new BulkSplcreditDtlsType[domainData.getPo_spl_credit_batch_ids().size()];

				for (int iter = 0; iter < domainData.getPo_spl_credit_batch_ids().size(); iter++) {
					cur = domainData.getPo_spl_credit_batch_ids().get(iter);
					det = new BulkSplcreditDtlsType();

					if (cur.getBatchId() != null)
						det.setBatchId(cur.getBatchId().toString());

					if (cur.getTransactionDate() != null)
						det.setTransactionDate(cur.getTransactionDate());
					sl.add(det);
				}

			}
			for (int i = 0; i < sl.size(); i++) {
				bulkTPSubDetails[i] = sl.get(i);
			}
			if (bulkTPSubDetails != null) {
				// response.setBulkCreditDetails(bulkTPSubDetails) ;
				response.getBulkCreditDetails().addAll(Arrays.asList(bulkTPSubDetails));
			}

		}

		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

}
