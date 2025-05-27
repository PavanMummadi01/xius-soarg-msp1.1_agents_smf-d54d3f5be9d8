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



import com.xius.agent.smf.smfmanagement.BulkStateChangeReportsListType;
import com.xius.agent.smf.smfmanagement.ForceActivationListType;
import com.xius.agent.smf.smfmanagement.ForceActivationStatusReportsListType;
import com.xius.agent.smf.smfmanagement.ForceSimActivationStatusReportsRequest;
import com.xius.agent.smf.smfmanagement.ForceSimActivationStatusReportsResponse;
import com.xius.smf.domaindata.BulkStateChanegReportsCursorData;
import com.xius.smf.domaindata.ForceSimActStatusData;
import com.xius.smf.domaindata.ForceSimActStatusRefCursorData;
import com.xius.smf.domaindata.ViewForceSimActDetailsData;
import com.xius.smf.domaindata.ViewForceSimActDetailsRefCursorData;
import com.xius.smf.domaindata.ViewStateChanegReportsCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.DateUtil;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Service("ForceSimActStatusReportsImpl")
public class ForceSimActStatusReportsImpl {

	private  static final Logger logger = LogManager.getLogger(ForceSimActStatusReportsImpl.class.getSimpleName());
	
	private Object setMOSRequest(ForceSimActivationStatusReportsRequest request, HeaderDetails headerDetails) {


		ForceSimActStatusData forceSimActStatusData = null;
		ViewForceSimActDetailsData viewForceSimActDtlsData = null;


		if(null != request.getTransdates()) {

			forceSimActStatusData = new ForceSimActStatusData();
			Date date = null;


			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getStartDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				forceSimActStatusData.setPi_start_date( dateAsString );
			}
			/*XMLGregorianCalendar xmlGregorianCalendar = request.getTransdates().getStartDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				forceSimActStatusData.setPi_start_date( dateAsString );
			}*/


			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getEndDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				forceSimActStatusData.setPi_end_date( dateAsString );
			}
			/*xmlGregorianCalendar = request.getTransdates().getEndDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				forceSimActStatusData.setPi_end_date( dateAsString );
			}*/
			
			if (null != headerDetails.getNetworkID()){
			forceSimActStatusData.setPi_network_id(headerDetails.getNetworkID());
			}
			if(null != headerDetails.getLoginID()){
			forceSimActStatusData.setPi_username(headerDetails.getLoginID().trim() );
			}
			if(logger.isDebugEnabled()){

				logger.debug( forceSimActStatusData.toString( forceSimActStatusData ));
			}

			return forceSimActStatusData;
			
		} else if( null != request.getTransNumber() && request.getTransNumber().trim().length() > 0) {

			viewForceSimActDtlsData = new ViewForceSimActDetailsData();
			
			viewForceSimActDtlsData.setPi_trans_no(request.getTransNumber());
			if (null != headerDetails.getNetworkID()){
			viewForceSimActDtlsData.setPi_network_id(headerDetails.getNetworkID());
			}if(null != headerDetails.getLoginID()){
			viewForceSimActDtlsData.setPi_username(headerDetails.getLoginID().trim() );
			}
			return viewForceSimActDtlsData;
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
	 * @param request ForceSimActivationStatusReportsRequest
	 * @param headerDetails HeaderDetails
	 * @return ForceSimActStatusReports ForceSimActivationStatusReportsResponse
	 * @throws  SMFAgentException
	 */
	public ForceSimActivationStatusReportsResponse  forceSimActStatusReports(ForceSimActivationStatusReportsRequest request, HeaderDetails headerDetails) 
	throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request		
		 */

		ForceSimActivationStatusReportsResponse forceSimActStatusReports = null;
		Object domainDataObj = setMOSRequest(request, headerDetails);

		if( domainDataObj instanceof ForceSimActStatusData ) {

			ForceSimActStatusData domainData = ( ForceSimActStatusData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("pro_force_sim_report_dtls", domainData, domainData);
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
			forceSimActStatusReports = setWebserviceResponse(domainData, request);


		} else if( domainDataObj instanceof ViewForceSimActDetailsData ) {

			ViewForceSimActDetailsData domainData = ( ViewForceSimActDetailsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("forcesimActdetails_transno", domainData, domainData);
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
			forceSimActStatusReports = setWebserviceResponse(domainData, request);

		}
		return forceSimActStatusReports;
	}

	/**
	 * This method is used to map webservices response object from domain(DB) object
	 * @param domainData ViewForceSimActDetailsData , ForceSimActStatusData
	 * @param request ForceSimActivationStatusReportsRequest
	 * @return ForceSimActStatusReports ForceSimActivationStatusReportsResponse
	 */
	private ForceSimActivationStatusReportsResponse setWebserviceResponse(Object domainDataObject,
			ForceSimActivationStatusReportsRequest request) {

		ForceSimActivationStatusReportsResponse forceSimActStatusReports = new ForceSimActivationStatusReportsResponse();

		if( domainDataObject instanceof ViewForceSimActDetailsData ) {

			ViewForceSimActDetailsData domainData = (ViewForceSimActDetailsData) domainDataObject;

			List<ViewForceSimActDetailsRefCursorData> cursorData  = domainData.getPo_forcesimdetails();
			
			
			//String[] commaSaparatedStrings = new String[cursorData.size()];
			ForceActivationListType commaSaparatedStrings=new ForceActivationListType();
			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					ViewForceSimActDetailsRefCursorData viewForceSimActDetailsCursorData = cursorData.get( i );

					if( null != viewForceSimActDetailsCursorData.getForce_sim_details()) {
						
						commaSaparatedStrings[i] = viewForceSimActDetailsCursorData.getForce_sim_details();
					}
				}*/
				for (ViewForceSimActDetailsRefCursorData viewForceSimActDetailsRefCursorData : cursorData) {
				        if (viewForceSimActDetailsRefCursorData.getForce_sim_details() != null) {
				        	commaSaparatedStrings.getForceActivationList().add(viewForceSimActDetailsRefCursorData.getForce_sim_details());
				        }
				    }
			}
			//forceSimActStatusReports.setForceSimActivationLists(commaSaparatedStrings );
			forceSimActStatusReports.setForceSimActivationLists(commaSaparatedStrings );
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}

		} else if( domainDataObject instanceof ForceSimActStatusData ) {


			ForceSimActStatusData domainData = (ForceSimActStatusData) domainDataObject;

			List <ForceSimActStatusRefCursorData>cursorData  = domainData.getPo_forcesim_details();
			//ForceActivationStatusReportsListType[] forceActStatusReportsListType = new ForceActivationStatusReportsListType[ cursorData.size() ];
			List<ForceActivationStatusReportsListType> forceActivationStatusReportsListType = new ArrayList<ForceActivationStatusReportsListType>();

			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {

					ForceSimActStatusRefCursorData forceSimActStatusRefCursorData = cursorData.get( i );

					if( null != forceSimActStatusRefCursorData ) {
						
						forceActStatusReportsListType[i] = new ForceActivationStatusReportsListType();

						forceActStatusReportsListType[i].setTransNumber( forceSimActStatusRefCursorData.getTransaction_no());
						forceActStatusReportsListType[i].setSubmissionDate( forceSimActStatusRefCursorData.getSubmission_date() );
						forceActStatusReportsListType[i].setUserId( forceSimActStatusRefCursorData.getUser_id());
						forceActStatusReportsListType[i].setStatus( forceSimActStatusRefCursorData.getStatus() );
					}
				}*/
				for (ForceSimActStatusRefCursorData forceSimActStatusRefCursorData : cursorData) {
					 logger.info("BulkStateChanegReportsData ================>");
				        if (forceSimActStatusRefCursorData != null) {
				        	ForceActivationStatusReportsListType forceActivationStatusReportsListTypelist = new ForceActivationStatusReportsListType();
				        	forceActivationStatusReportsListTypelist.setTransNumber( forceSimActStatusRefCursorData.getTransaction_no());
				        	forceActivationStatusReportsListTypelist.setSubmissionDate( forceSimActStatusRefCursorData.getSubmission_date());
				        	forceActivationStatusReportsListTypelist.setUserId( forceSimActStatusRefCursorData.getUser_id());
				        	forceActivationStatusReportsListTypelist.setStatus( forceSimActStatusRefCursorData.getStatus());

				        	forceActivationStatusReportsListType.add(forceActivationStatusReportsListTypelist);
				        }
				    }
			}
			//forceSimActStatusReports.getForceSimActivationStatusReportsList( forceActStatusReportsListType);
			forceSimActStatusReports.getForceSimActivationStatusReportsList().addAll(forceActivationStatusReportsListType);
			
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}
		} 

		return forceSimActStatusReports;
	}

}
