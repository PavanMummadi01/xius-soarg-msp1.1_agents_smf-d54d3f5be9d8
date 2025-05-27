/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * specifications are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.job.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.smf.domaindata.ManageOfficeDetailsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.ServiceUtils;

/**
File Name:GetOfficeDetailsImpl.java
Description:This class is used to have actual implementation of get office details.
@Author : srikanthm
@Created Date : Nov 23, 2011
@Modified By:
@Modified Date:
@Modifications:
@Reason for Modification
 */
public class GetOfficeDetails {
	private static final Logger logger = LogManager.getLogger(GetOfficeDetails.class.getSimpleName());

	public ManageOfficeDetailsData getOfficeDetails(String sim, String txNumber, String officeCode, Long networkId) throws SMFAgentException {

		logger.info(">>> Calling getOfficeDetails Get for SIM : " + sim + ", tx Number: "+ txNumber +", officeCode: " + officeCode);
		// Populate domain object with the data from web service request, header details		
		ManageOfficeDetailsData domainData = new ManageOfficeDetailsData();

		domainData.setPi_network_id( networkId );
		domainData.setOffice_code(new Long( officeCode ));
		//invoke Stored Procedure.
		ServiceUtils._executeStoredProcedure("CHANNEL_READ", domainData, domainData);
		Long errCode = domainData.getPo_error_code();

		if(logger.isInfoEnabled())
			logger.info( "Error Code from CHANNEL_READ ==>"+errCode);

		return domainData;
	} // end of getOfficeDetails

}
