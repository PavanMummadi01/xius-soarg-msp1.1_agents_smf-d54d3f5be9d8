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
import com.xius.agent.smf.smfmanagement.GetBulkDebitTransDtlsRequest;
import com.xius.agent.smf.smfmanagement.GetBulkDebitTransDtlsResponse;
import com.xius.smf.domaindata.GetBulkDebitTransCursorData;
import com.xius.smf.domaindata.GetBulkDebitTransDetails;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("GetBulkDebitTransDtlsImpl")
public class GetBulkDebitTransDtlsImpl {
	private  static final Logger logger = LogManager.getLogger(GetBulkDebitTransDtlsImpl.class.getSimpleName());

	public GetBulkDebitTransDtlsResponse getBulkDebitTransDtls(GetBulkDebitTransDtlsRequest request,
			HeaderDetails headerDetails) throws RemoteException, SMFAgentException {
		GetBulkDebitTransDtlsResponse response = new GetBulkDebitTransDtlsResponse();
		GetBulkDebitTransDetails domainData = null;
		domainData = setRequestData(request, headerDetails);

		SPFactory spfactory = ServiceUtils.executeSPWithOutCommit("pro_bulk_debit_trans_dtls", domainData, domainData);

		Utilities.commitOrRollback(spfactory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() != 0) {

			throw Utilities.setSMFAgentException(String.valueOf(domainData.getPo_error_code()),
					domainData.getPo_error_desc());
		} else {
			response = setWebserviceResponse(domainData);
		}

		return response;

	}

	private GetBulkDebitTransDetails setRequestData(GetBulkDebitTransDtlsRequest request,
			HeaderDetails headerDetails2) {
		GetBulkDebitTransDetails domainData = new GetBulkDebitTransDetails();

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

	private GetBulkDebitTransDtlsResponse setWebserviceResponse(GetBulkDebitTransDetails domainData) {
		GetBulkDebitTransDtlsResponse response = new GetBulkDebitTransDtlsResponse();

		if (domainData != null) {

			BulkDetailsType[] bulkTPSubDetails = null;
			BulkDetailsType det = null;
			GetBulkDebitTransCursorData cur = null;
			List<BulkDetailsType> sl = new ArrayList<BulkDetailsType>();
			if (domainData.getPo_debit_trans_dtls() != null && domainData.getPo_debit_trans_dtls().size() > 0) {

				bulkTPSubDetails = new BulkDetailsType[domainData.getPo_debit_trans_dtls().size()];

				for (int iter = 0; iter < domainData.getPo_debit_trans_dtls().size(); iter++) {
					cur = domainData.getPo_debit_trans_dtls().get(iter);
					det = new BulkDetailsType();

					if (cur.getTransaction_id() != null)
						det.setTransactionId(cur.getTransaction_id());

					if (cur.getMsisdn_no() != null)
						det.setMsisdn(cur.getMsisdn_no().toString());

					if (cur.getReason() != null)
						det.setReason(cur.getReason());

					if (cur.getStatus() != null)
						det.setStatus(cur.getStatus());

					if (cur.getTransactionDate() != null)
						det.setTransactionDate(cur.getTransactionDate());

					if (cur.getDebit_amount() != null)
						det.setAmount(cur.getDebit_amount().toString());

					bulkTPSubDetails[iter] = det;
				}

			}

			if (domainData.getPo_debit_batch_ids() != null && domainData.getPo_debit_batch_ids().size() > 0) {

				bulkTPSubDetails = new BulkDetailsType[domainData.getPo_debit_batch_ids().size()];

				for (int iter = 0; iter < domainData.getPo_debit_batch_ids().size(); iter++) {
					cur = domainData.getPo_debit_batch_ids().get(iter);
					det = new BulkDetailsType();

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

				// response.setBulkDebitDetails(bulkTPSubDetails) ;
				response.getBulkDebitDetails().addAll(Arrays.asList(bulkTPSubDetails));
			}
		}

		response.setMessage(SMFAgentConstants.SUCCESS);
		return response;
	}

}
