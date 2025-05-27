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



import com.xius.agent.smf.smfmanagement.BlkCorpRCStatusReportsListType;
import com.xius.agent.smf.smfmanagement.UploadSimsListType;
import com.xius.agent.smf.smfmanagement.ViewTransDetailsListType;
import com.xius.agent.smf.smfmanagement.ViewTransDetailsRequest;
import com.xius.agent.smf.smfmanagement.ViewTransDetailsResponse;
import com.xius.smf.domaindata.BlkCorpRCRefCursorData;
import com.xius.smf.domaindata.ViewBlkCorpRCDetailsRefCursorData;
import com.xius.smf.domaindata.ViewSIMDetailsData;
import com.xius.smf.domaindata.ViewSIMDetailsRefCursorData;
import com.xius.smf.domaindata.ViewTransDetailsData;
import com.xius.smf.domaindata.ViewTransDetailsRefCursorData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.DateUtil;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;


@Service("ViewTransDetailsImpl")
public class ViewTransDetailsImpl {

	private  static final Logger logger = LogManager.getLogger(ViewTransDetailsImpl.class.getSimpleName());
	
	private Object setMOSRequest(ViewTransDetailsRequest request, HeaderDetails headerDetails) {


		ViewTransDetailsData viewTransDetailsData = null;
		ViewSIMDetailsData viewSIMDetailsData = null;


		if( null != request.getTransdates() ) {

			viewTransDetailsData = new ViewTransDetailsData();
			Date date = null;


			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getStartDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				viewTransDetailsData.setPi_start_date( dateAsString );
			}
			/*XMLGregorianCalendar xmlGregorianCalendar = request.getTransdates().getStartDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				viewTransDetailsData.setPi_start_date( dateAsString );
			}*/

			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getEndDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				viewTransDetailsData.setPi_end_date( dateAsString );
			}
			/*xmlGregorianCalendar = request.getTransdates().getEndDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				viewTransDetailsData.setPi_end_date( dateAsString );
			}*/


			viewTransDetailsData.setPi_network_id(headerDetails.getNetworkID());
			viewTransDetailsData.setPi_username(headerDetails.getLoginID().trim() );
			if(logger.isDebugEnabled()){

				logger.debug( viewTransDetailsData.toString( viewTransDetailsData ));
			}

			return viewTransDetailsData;
		} else if( null != request.getTransNumber() && request.getTransNumber().trim().length() > 0) {

			viewSIMDetailsData = new ViewSIMDetailsData();
			viewSIMDetailsData.setPi_trans_no( request.getTransNumber() );
			viewSIMDetailsData.setPi_network_id(headerDetails.getNetworkID());
			viewSIMDetailsData.setPi_username(headerDetails.getLoginID().trim() );
			return viewSIMDetailsData;
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
	 * @param request ViewTransDetailsRequest
	 * @param headerDetails HeaderDetails
	 * @return ViewTransDetailsResponse ViewTransDetailsResponse
	 * @throws  SMFAgentException
	 */
	public ViewTransDetailsResponse  viewTransDetails(ViewTransDetailsRequest request, HeaderDetails headerDetails) 
	throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request		
		 */

		ViewTransDetailsResponse viewTransDetailsResponse = null;
		Object domainDataObj = setMOSRequest(request, headerDetails);

		if( domainDataObj instanceof ViewTransDetailsData ) {

			ViewTransDetailsData domainData = ( ViewTransDetailsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("transdetails_duration", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),null);
			}

			/**
			 * Set response
			 */
			viewTransDetailsResponse = setWebserviceResponse(domainData, request);


		} else if( domainDataObj instanceof ViewSIMDetailsData ) {

			ViewSIMDetailsData domainData = ( ViewSIMDetailsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			ServiceUtils._executeStoredProcedure("simdetails_transno", domainData, domainData);
			if(logger.isInfoEnabled()) {

				logger.info( "Error Code ==>"+domainData.getPo_error_code());
			}
			//Utilities.commitOrRollback(spFactory, domainData.getPo_error_code());
			if(domainData.getPo_error_code() !=0) {

				throw Utilities.setSMFAgentException(domainData.getPo_error_code().toString(),null);
			}

			/**
			 * Set response
			 */
			viewTransDetailsResponse = setWebserviceResponse(domainData, request);

		}
		return viewTransDetailsResponse;
	}

	/**
	 * This method is used to map webservices response object from domain(DB) object
	 * @param domainData ViewTransDetailsData
	 * @param request ViewTransDetailsRequest
	 * @return viewTransDetailsResponse ViewTransDetailsResponse
	 */
	private ViewTransDetailsResponse setWebserviceResponse(Object domainDataObject, ViewTransDetailsRequest request) {

		ViewTransDetailsResponse viewTransDetailsResponse = new ViewTransDetailsResponse();

		if( domainDataObject instanceof ViewSIMDetailsData ) {

			ViewSIMDetailsData domainData = (ViewSIMDetailsData) domainDataObject;

			List<ViewSIMDetailsRefCursorData> cursorData  = domainData.getPo_simdetails();

			//String[] commaSaparatedStrings = null;
			UploadSimsListType commaSaparatedStrings=new UploadSimsListType();

			if( null != cursorData && cursorData.size() > 0 ) {

			/*	commaSaparatedStrings = new String[ cursorData.size() ];

				for( int i = 0; i < cursorData.size(); i++) {

					ViewSIMDetailsRefCursorData viewSIMDetailsRefCursorData = cursorData.get( i );

					if( null != viewSIMDetailsRefCursorData.getSim_details() ) {

						
						commaSaparatedStrings[i] = viewSIMDetailsRefCursorData.getSim_details();
					}
				}*/
				for (ViewSIMDetailsRefCursorData viewSIMDetailsRefCursorData : cursorData) {
			        if (viewSIMDetailsRefCursorData.getSim_details() != null) {
			        	commaSaparatedStrings.getCommaSeparatedSIMSList().add(viewSIMDetailsRefCursorData.getSim_details());
			        }
			    }

			}
			viewTransDetailsResponse.setDispensedSIMSList( commaSaparatedStrings );
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}

		} else if( domainDataObject instanceof ViewTransDetailsData ) {


			ViewTransDetailsData domainData = (ViewTransDetailsData) domainDataObject;

			List <ViewTransDetailsRefCursorData>cursorData  = domainData.getPo_sim_transdetails();
			//ViewTransDetailsListType[] viewTransDetailsListType = null;
			List<ViewTransDetailsListType> ViewTransDetailsListTypelist = new ArrayList<ViewTransDetailsListType>();

			if( null != cursorData && cursorData.size() > 0 ) {

				/*viewTransDetailsListType = new ViewTransDetailsListType[ cursorData.size() ];

				for( int i = 0; i < cursorData.size(); i++) {

					ViewTransDetailsRefCursorData transDetailsRefCursorData = cursorData.get( i );

					if( null != transDetailsRefCursorData ) {
						
						viewTransDetailsListType[i] = new ViewTransDetailsListType();

						viewTransDetailsListType[i].setTransNumber( transDetailsRefCursorData.getTransaction_no() );
						viewTransDetailsListType[i].setTransactionDate( transDetailsRefCursorData.getTransaction_date() );
						viewTransDetailsListType[i].setUserId( transDetailsRefCursorData.getUser_id());
						viewTransDetailsListType[i].setStatus( transDetailsRefCursorData.getStatus() );
					}
				}*/
				for (ViewTransDetailsRefCursorData viewTransDetailsRefCursorData : cursorData) {
					 logger.info("BulkStateChanegReportsData ================>");
				        if (viewTransDetailsRefCursorData != null) {
				        	ViewTransDetailsListType viewTransDetailsListType=new ViewTransDetailsListType();
				        	viewTransDetailsListType.setTransNumber( viewTransDetailsRefCursorData.getTransaction_no());
				        	viewTransDetailsListType.setTransactionDate( viewTransDetailsRefCursorData.getTransaction_date());
				        	viewTransDetailsListType.setUserId( viewTransDetailsRefCursorData.getUser_id());
				        	viewTransDetailsListType.setStatus( viewTransDetailsRefCursorData.getStatus());

				        	ViewTransDetailsListTypelist.add(viewTransDetailsListType);
				        }
				    }

			}
			if( null != ViewTransDetailsListTypelist && ViewTransDetailsListTypelist.size() > 0 ) {

				viewTransDetailsResponse.getViewTransDetailsList().addAll(ViewTransDetailsListTypelist);
			}

			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}
		} 

		return viewTransDetailsResponse;
	}

}
