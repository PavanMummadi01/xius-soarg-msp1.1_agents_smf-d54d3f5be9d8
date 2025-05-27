package com.xius.smf.webservices.smfservices;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import net.bcgi.util.db.SPFactory;

import com.xius.agent.smf.smfmanagement.UpdatePersonalDetailsInsertRequest;
import com.xius.agent.smf.smfmanagement.UpdatePersonalDetailsInsertResponse;
import com.xius.smf.domaindata.UpdatePersonalDetailsInsertData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("UpdatePersonalDetailsInsertImpl")
public class UpdatePersonalDetailsInsertImpl {
	private  static final Logger logger = LogManager.getLogger(UpdatePersonalDetailsInsertImpl.class.getSimpleName());
	
	public UpdatePersonalDetailsInsertResponse updatePersonalDetailsInsert(UpdatePersonalDetailsInsertRequest request,
			HeaderDetails headerDetails) throws SMFAgentException {
		UpdatePersonalDetailsInsertResponse response = new UpdatePersonalDetailsInsertResponse();
		UpdatePersonalDetailsInsertData domainData = null;

		domainData = setRequestData(request, headerDetails);
		SPFactory factory=ServiceUtils.executeSPWithOutCommit("updatePersonalDetailsInsert",domainData, domainData);
		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}
		Utilities.commitOrRollback(factory, domainData.getPo_error_code());
		if (logger.isInfoEnabled()) {

			logger.info( "Error Code from  pro_payment_req_insrt  ==>" + domainData.getPo_error_code());
			logger.info( "Error Msg from  pro_payment_req_insrt  ==>" + domainData.getPo_error_desc());
		}
		if(domainData.getPo_error_code()==0)
		{
			response=setWebserviceResponse(domainData);
		}
		
		else
		{
			throw new SMFAgentException(String.valueOf(domainData.getPo_error_code()), domainData.getPo_error_desc());
		}
		
		return response;
	}
	
	private UpdatePersonalDetailsInsertData setRequestData(UpdatePersonalDetailsInsertRequest request,
			HeaderDetails headerDetails) {
		UpdatePersonalDetailsInsertData domainData = new UpdatePersonalDetailsInsertData();
		
		domainData.setPi_network_id(headerDetails.getNetworkID());
		
		 if (Utilities.isNull(request.getOldIDValue()) == false) {
	            domainData.setPi_old_id_no(request.getOldIDValue());
	        }

	        if (Utilities.isNull(request.getOldIDType()) == false) {
	            domainData.setPi_old_id_type(Long.parseLong(request.getOldIDType()));
	        }

	        
	        if (Utilities.isNull(request.getNewIDValue()) == false) {
	            domainData.setPi_new_id_no(request.getNewIDValue());
	        }

	        if (Utilities.isNull(request.getNewIDType()) == false) {
	            domainData.setPi_new_id_type(Long.parseLong(request.getNewIDType()));
	        }
	        
	        if (Utilities.isNull(request.getTransRefNumber()) == false) {
	            domainData.setPi_tran_ref_no(request.getTransRefNumber());
	        }

	        if (Utilities.isNull(request.getAddress1()) == false) {
	            domainData.setPi_first_address(request.getAddress1().trim());
	        }
	        if (Utilities.isNull(request.getAddress2()) == false) {
	            domainData.setPi_second_address(request.getAddress2().trim());
	        }
	        if (Utilities.isNull(request.getCity()) == false) {
	            domainData.setPi_city(request.getCity().trim());
	        }
	        if (Utilities.isNull(request.getCountry()) == false) {
	            domainData.setPi_country(request.getCountry().trim());
	        }
	        if (Utilities.isNull(request.getFirstname()) == false) {
	            domainData.setPi_first_name(request.getFirstname().trim());
	        }
	        if (Utilities.isNull(request.getLastName()) == false) {
	            domainData.setPi_last_name(request.getLastName().trim());
	        }
	        if (Utilities.isNull(request.getPostalCode()) == false) {
	            domainData.setPi_postcode(request.getPostalCode().trim());
	        }
	        if (Utilities.isNull(request.getState()) == false) {
	            domainData.setPi_state(request.getState().trim());
	        }
	        //added for 1029 changes Phase III
	        if (Utilities.isNull(request.getDateOfBirth()) == false) {
	            domainData.setPi_date_of_birth(request.getDateOfBirth().trim());
	        }
	        if (Utilities.isNull(request.getGender()) == false) {
	            domainData.setPi_gender(request.getGender().trim());
	        }
	        
	        if (Utilities.isNull(request.getMiddleName()) == false) {
	            domainData.setPi_surname(request.getMiddleName());
	        }
	        
	        if (Utilities.isNull(request.getEmailId()) == false) {
	            domainData.setPi_email_id(request.getEmailId());
	        }
	        
	        if (Utilities.isNull(request.getHomePhone()) == false) {
	            domainData.setPi_home_phone(Long.parseLong(request.getHomePhone()));
	        }
	        
	        if (Utilities.isNull(request.getOfficePhone()) == false) {
	            domainData.setPi_office_phone(Long.parseLong(request.getOfficePhone()));
	        }
	        
	        if (Utilities.isNull(request.getMunicipality()) == false) {
	            domainData.setPi_municipality(request.getMunicipality());
	        }
	        
	        if (Utilities.isNull(request.getOccupation()) == false) {
	            domainData.setPi_occupation(request.getOccupation());
	        }
	        
	        if (Utilities.isNull(request.getIndustry()) == false) {
	            domainData.setPi_industry(request.getIndustry());
	        }
	        
	        if (Utilities.isNull(request.getAnnualIncome()) == false) {
	            domainData.setPi_annual_income(request.getAnnualIncome());
	        }
	        
	        if (Utilities.isNull(request.getSecurityQuestion()) == false) {
	            domainData.setPi_sec_question(request.getSecurityQuestion());
	        }
	        
	        if (Utilities.isNull(request.getSecurityAnswer()) == false) {
	            domainData.setPi_sec_answer(request.getSecurityAnswer());
	        }
	        
	        domainData.setPi_user_id(headerDetails.getLoginID());
		
		return domainData;
	}

	private UpdatePersonalDetailsInsertResponse setWebserviceResponse(
			UpdatePersonalDetailsInsertData domainData) {
		UpdatePersonalDetailsInsertResponse response = new UpdatePersonalDetailsInsertResponse();
		
		if(domainData.getPo_transaction_id() != null)
			response.setTransactionId(domainData.getPo_transaction_id());
		
		return response;
	}

}
