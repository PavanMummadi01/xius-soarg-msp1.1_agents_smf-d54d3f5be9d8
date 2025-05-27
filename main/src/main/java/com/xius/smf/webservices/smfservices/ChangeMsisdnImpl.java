package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xius.agent.smf.smfmanagement.ChangeMsisdnRequest;
import com.xius.agent.smf.smfmanagement.ChangeMsisdnResponse;
import com.xius.smf.domaindata.ChangeMsisdnData;
import com.xius.smf.domaindata.PropremsisdnbkData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


import net.bcgi.util.db.SPFactory;

@Service("ChangeMsisdnImpl")
public class ChangeMsisdnImpl {
	private  static final Logger logger = LogManager.getLogger(ChangeMsisdnImpl.class.getSimpleName());

	SPFactory spFactory = null;

	public ChangeMsisdnResponse ChangeMsisdn(ChangeMsisdnRequest request, HeaderDetails headerDetails)

			throws RemoteException, SMFAgentException {

		ChangeMsisdnResponse response = new ChangeMsisdnResponse();

		ChangeMsisdnData domainData = null;

		String[] split = request.getProvComp().split("~");

		if (request.getProvComp() != null && split != null && split.length > 0
				&& split[0].equalsIgnoreCase("RESTAPI")) {

			PropremsisdnbkData propremsisdnbkData = new PropremsisdnbkData();

			propremsisdnbkData.setPi_network_id(headerDetails.getNetworkID());

			propremsisdnbkData.setPi_old_msisdn_no(Long.parseLong(request.getMSISDN()));

			propremsisdnbkData.setPi_new_msisdn_no(Long.parseLong(request.getNewValue()));

			spFactory = ServiceUtils.executeSPWithOutCommit("pro_pre_msisdn_bk", propremsisdnbkData,
					propremsisdnbkData);

			if (logger.isInfoEnabled()) {

				logger.info( "pro_pre_msisdn_bk Error Code ==>" + propremsisdnbkData.getPo_error_code());
				logger.info( "pro_pre_msisdn_bk Error Msg ==>" + propremsisdnbkData.getPo_error_desc());
			}
			Utilities.commitOrRollback(spFactory, propremsisdnbkData.getPo_error_code());

			if (propremsisdnbkData.getPo_error_code() != 0) {

				throw new SMFAgentException(propremsisdnbkData.getPo_error_code().toString(),
						propremsisdnbkData.getPo_error_desc());
			}
		}

		domainData = setRequestData(request, headerDetails);

		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_change_msisdn_upload", domainData, domainData);

		if (logger.isDebugEnabled()) {
			logger.debug("ChangeMsisdnImpl pro_change_msisdn_upload-ERRORCODE :::" + domainData.getPo_error_code());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		} else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(), domainData.getPo_error_desc());
		}
		return response;
	}

	private ChangeMsisdnData setRequestData(ChangeMsisdnRequest request, HeaderDetails headerDetails) {

		ChangeMsisdnData domainData = new ChangeMsisdnData();

		if (headerDetails.getNetworkID() != null)
			domainData.setPi_network_id(headerDetails.getNetworkID());

		if (headerDetails.getLoginID() != null)
			domainData.setPi_userid(headerDetails.getLoginID());

		if (request.getMSISDN() != null) {
			domainData.setPi_msisdn(request.getMSISDN());
		} else if (request.getAccountId() != null) {
			domainData.setPi_accountid(request.getAccountId());
		}
		if (request.getDeviceType() != null) {
			domainData.setPi_devicetype(request.getDeviceType());
		}
		if (request.getCharge() != null) {
			domainData.setPi_charge(request.getCharge().toString());
		}
		if (request.getIdValue() != null) {
			domainData.setPi_idvalue(request.getIdValue());
		}
		if (request.getNewValue() != null) {
			domainData.setPi_newvalue(request.getNewValue());
		}
		if (request.getOldValue() != null) {
			domainData.setPi_oldvalue(request.getOldValue());
		}
		if (request.getNewSerialNo() != null) {
			domainData.setPi_newserialno(request.getNewSerialNo());
		}
		if (request.getZipCode() != null) {
			domainData.setPi_zipcode(request.getZipCode());
		}
		if (request.getProvComp() != null) {
			domainData.setPi_provcomp(request.getProvComp());
		}
		if (request.getTransactionId() != null) {
			domainData.setPi_ext_trans_id(request.getTransactionId());
		}
		return domainData;
	}

	private ChangeMsisdnResponse setWebserviceResponse(ChangeMsisdnData domainData) {
		ChangeMsisdnResponse response = new ChangeMsisdnResponse();

		if (domainData.getPo_trans_id() != null)
			response.setTransID(domainData.getPo_trans_id());

		if (logger.isDebugEnabled()) {
			logger.debug("TransactionNumber ==> " + response.getTransID());
		}
		return response;
	}
}
