/**
 * Copyright   2006 New Wireless Services, Inc.
 * All rights reserved. These computer programs, listings, and
 * Specificaions are the property of New Wireless Services,
 * Inc. and may not be copied, stored, used or transmitted, in
 * whole or in part, in any for or by any means, without the
 * prior written permission of New Wireless Services, Inc.
 *
 */
package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import com.xius.agent.smf.smfmanagement.BulkSimSwapStatusReportsRequest;
import com.xius.agent.smf.smfmanagement.BulkSimSwapStatusReportsResponse;
import com.xius.agent.smf.smfmanagement.BulkStateChangeReportsListType;
import com.xius.agent.smf.smfmanagement.SimSwapListType;
import com.xius.agent.smf.smfmanagement.SimSwapStatusReportsListType;
import com.xius.smf.domaindata.BulkSimSwapStatusData;
import com.xius.smf.domaindata.BulkSimSwapStatusRefCursorData;
import com.xius.smf.domaindata.BulkStateChanegReportsCursorData;
import com.xius.smf.domaindata.ViewSimSwapDetailsData;
import com.xius.smf.domaindata.ViewSimSwapDetailsRefCursorData;
import com.xius.smf.domaindata.ViewStateChanegReportsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.DateUtil;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Service("BulkSimSwapStatusReportsImpl")
public class BulkSimSwapStatusReportsImpl {

	private  static final Logger logger = LogManager.getLogger(BulkSimSwapStatusReportsImpl.class.getSimpleName());

	private Object setMOSRequest(BulkSimSwapStatusReportsRequest request, HeaderDetails headerDetails) {


		BulkSimSwapStatusData bulkSimSwapStatusData = null;
		ViewSimSwapDetailsData viewSimSwapDetailsData = null;


		if(null != request.getTransdates()) {

			bulkSimSwapStatusData = new BulkSimSwapStatusData();
			Date date = null;


			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getStartDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkSimSwapStatusData.setPi_start_date( dateAsString );
			}
			/*XMLGregorianCalendar xmlGregorianCalendar = request.getTransdates().getStartDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkSimSwapStatusData.setPi_start_date( dateAsString );
			}*/

			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getEndDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkSimSwapStatusData.setPi_end_date( dateAsString );
			}
			/*xmlGregorianCalendar = request.getTransdates().getEndDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkSimSwapStatusData.setPi_end_date( dateAsString );
			}*/
			bulkSimSwapStatusData.setPi_network_id(headerDetails.getNetworkID());
			bulkSimSwapStatusData.setPi_username(headerDetails.getLoginID().trim() );
			if(logger.isDebugEnabled()){

				logger.debug( bulkSimSwapStatusData.toString( bulkSimSwapStatusData ));
			}

			return bulkSimSwapStatusData;
			
		} else if( null != request.getTransNumber() && request.getTransNumber().trim().length() > 0) {

			viewSimSwapDetailsData = new ViewSimSwapDetailsData();
			viewSimSwapDetailsData.setPi_trans_no(request.getTransNumber());
			viewSimSwapDetailsData.setPi_network_id(headerDetails.getNetworkID());
			viewSimSwapDetailsData.setPi_username(headerDetails.getLoginID().trim() );
			return viewSimSwapDetailsData;
		}
		return null;
	}

	/**
	 * This method is used for View TransDetails based on input has given. 
	 * This would be done with 3 steps
	 * 		1. Construct Domain(DB) object from webservice request objcet
	 * 		2. invoke SP(Stored Procedure)
	 *  	3. Constuct webservice response object form domain object. 
	 *  
	 * @param request BulkSimSwapStatusReportsRequest
	 * @param headerDetails HeaderDetails
	 * @return BulkSimSwapStatusReports BulkSimSwapStatusReportsResponse
	 * @throws  SMFAgentException
	 */
	public BulkSimSwapStatusReportsResponse  BulkSimSwapStatusReports(BulkSimSwapStatusReportsRequest request, HeaderDetails headerDetails) 
	throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request		
		 */

		BulkSimSwapStatusReportsResponse BulkSimSwapStatusReports = null;
		Object domainDataObj = setMOSRequest(request, headerDetails);

		if( domainDataObj instanceof BulkSimSwapStatusData ) {

			BulkSimSwapStatusData domainData = ( BulkSimSwapStatusData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("pro_sim_swap_report_dtls", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code());
			}

			/**
			 * Set response
			 */
			BulkSimSwapStatusReports = setWebserviceResponse(domainData, request);


		} else if( domainDataObj instanceof ViewSimSwapDetailsData ) {

			ViewSimSwapDetailsData domainData = ( ViewSimSwapDetailsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("simswapdetails_transno", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code());
			}

			/**
			 * Set response
			 */
			BulkSimSwapStatusReports = setWebserviceResponse(domainData, request);

		}
		return BulkSimSwapStatusReports;
	}

	/**
	 * This method is used to map webservices response object from domain(DB) object
	 * @param domainData ViewSimSwapDetailsData
	 * @param request BulkSimSwapStatusReportsRequest
	 * @return BulkSimSwapStatusReports BulkSimSwapStatusReportsResponse
	 */
	private BulkSimSwapStatusReportsResponse setWebserviceResponse(Object domainDataObject, BulkSimSwapStatusReportsRequest request) {

		BulkSimSwapStatusReportsResponse bulkSimSwapStatusReports = new BulkSimSwapStatusReportsResponse();

		if( domainDataObject instanceof ViewSimSwapDetailsData ) {

			ViewSimSwapDetailsData domainData = (ViewSimSwapDetailsData) domainDataObject;

			List<ViewSimSwapDetailsRefCursorData> cursorData  = domainData.getPo_simswapdetails();
			
			
			//String[] commaSaparatedStrings = new String[cursorData.size()];
			SimSwapListType commaSaparatedStrings=new SimSwapListType();
			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					ViewSimSwapDetailsRefCursorData viewSimSwapDetailsRefCursorData = cursorData.get( i );

					if( null != viewSimSwapDetailsRefCursorData.getSimswap_details() ) {
						
						commaSaparatedStrings[i] = viewSimSwapDetailsRefCursorData.getSimswap_details();
					}
				}*/
				for (ViewSimSwapDetailsRefCursorData viewSimSwapDetailsRefCursorData : cursorData) {
					   logger.info("ViewStateChanegReportsData ================>");
				        if (viewSimSwapDetailsRefCursorData.getSimswap_details() != null) {
				        	commaSaparatedStrings.getSimSwapList().add(viewSimSwapDetailsRefCursorData.getSimswap_details());
				        }
				    }
			}
			bulkSimSwapStatusReports.setSimSwapList( commaSaparatedStrings );
			
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}

		} else if( domainDataObject instanceof BulkSimSwapStatusData ) {


			BulkSimSwapStatusData domainData = (BulkSimSwapStatusData) domainDataObject;

			List <BulkSimSwapStatusRefCursorData>cursorData  = domainData.getPo_simswap_transdetails();
			//SimSwapStatusReportsListType[] simSwapStatusReportsListType = new SimSwapStatusReportsListType[ cursorData.size() ];
			List<SimSwapStatusReportsListType> simSwapStatusReportsListTypelist = new ArrayList<SimSwapStatusReportsListType>();
			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					BulkSimSwapStatusRefCursorData bulkSimSwapStatusRefCursorData = cursorData.get( i );

					if( null != bulkSimSwapStatusRefCursorData ) {
						
						simSwapStatusReportsListType[i] = new SimSwapStatusReportsListType();

						simSwapStatusReportsListType[i].setTransNumber( bulkSimSwapStatusRefCursorData.getTransaction_no());
						simSwapStatusReportsListType[i].setSubmissionDate( bulkSimSwapStatusRefCursorData.getSubmission_date() );
						simSwapStatusReportsListType[i].setUserId( bulkSimSwapStatusRefCursorData.getUser_id());
						simSwapStatusReportsListType[i].setStatus( bulkSimSwapStatusRefCursorData.getStatus() );
					}
				}*/
				 for (BulkSimSwapStatusRefCursorData bulkSimSwapStatusRefCursorData : cursorData) {
					 logger.info("BulkStateChanegReportsData ================>");
				        if (bulkSimSwapStatusRefCursorData != null) {
				        	SimSwapStatusReportsListType simSwapStatusReportsListType = new SimSwapStatusReportsListType();
				        	simSwapStatusReportsListType.setTransNumber( bulkSimSwapStatusRefCursorData.getTransaction_no());
				        	simSwapStatusReportsListType.setSubmissionDate( bulkSimSwapStatusRefCursorData.getSubmission_date());
				        	simSwapStatusReportsListType.setUserId(bulkSimSwapStatusRefCursorData.getUser_id());
				        	simSwapStatusReportsListType.setStatus(bulkSimSwapStatusRefCursorData.getStatus());

				        	simSwapStatusReportsListTypelist.add(simSwapStatusReportsListType);
				        }
				    }
			}

			bulkSimSwapStatusReports.getSimSwapStatusReportsList().addAll(simSwapStatusReportsListTypelist);

			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}
		} 

		return bulkSimSwapStatusReports;
	}

}
