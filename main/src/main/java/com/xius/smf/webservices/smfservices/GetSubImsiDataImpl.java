package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.GetSubIMSIDataRequest;
import com.xius.agent.smf.smfmanagement.GetSubIMSIDataResponse;
import com.xius.smf.domaindata.GetSubImsiData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;
@Service("GetSubImsiDataImpl")
public class GetSubImsiDataImpl {

	private  static final Logger logger = LogManager.getLogger(GetSubImsiDataImpl.class.getSimpleName());


	public GetSubIMSIDataResponse getSubIMSIData(GetSubIMSIDataRequest request,
			HeaderDetails headerDetails) throws RemoteException,
			 SMFAgentException, com.xius.smf.exceptions.SMFAgentException {

		GetSubIMSIDataResponse response = new GetSubIMSIDataResponse();

		GetSubImsiData domainData = null;
		logger.info("setRequestData........................");

		domainData = setRequestData(request, headerDetails);
		SPFactory factory = ServiceUtils.executeSPWithOutCommit(
				"pro_get_sub_info", domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info(
					"Error Code from  pro_get_sub_info  ==>"
							+ domainData.getPo_error_code());
			logger.info(
					"Error Msg from  pro_get_sub_info  ==>"
							+ domainData.getPo_error_desc());
		}
		if (domainData.getPo_error_code() == 0) {
			response = setWebserviceResponse(domainData);
		}

		else {
			throw new SMFAgentException(domainData.getPo_error_code().toString(),
					domainData.getPo_error_desc());
		}

		return response;

	}

	public GetSubImsiData setRequestData(GetSubIMSIDataRequest request,
			HeaderDetails headerDetails) {

		GetSubImsiData data = new GetSubImsiData();
		if (headerDetails.getNetworkID() != null)
			data.setPi_network_id(headerDetails.getNetworkID());

		if (request.getMsisdnNo() != null)
			data.setPio_msisdn_no(Long.parseLong(request.getMsisdnNo()));

		if (request.getSimNo() != null)
			data.setPio_sim_no(request.getSimNo());

		if (request.getAccountid() != null)
			data.setPio_accountid(Long.parseLong(request.getAccountid()));

		return data;
	}

	private GetSubIMSIDataResponse setWebserviceResponse(
			GetSubImsiData domainData) {
		GetSubIMSIDataResponse response = new GetSubIMSIDataResponse();
		if (domainData.getPo_account_type() != null)
			response.setAccountType(domainData.getPo_account_type() + "");
		if (domainData.getPo_billcycle_day() != null)
			response.setBillcycleDay(domainData.getPo_billcycle_day() + "");
		if (domainData.getPo_imsi() != null)
			response.setImsi(domainData.getPo_imsi() + "");
		if (domainData.getPo_tariff_package_id() != null)
			response.setTariffPackageId(domainData.getPo_tariff_package_id()
					+ "");
		return response;

	}

}
