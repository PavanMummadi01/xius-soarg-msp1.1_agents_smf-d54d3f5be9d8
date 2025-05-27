package com.xius.smf.webservices.smfservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


import com.xius.agent.smf.smfmanagement.BulkStateChangeListType;
import com.xius.agent.smf.smfmanagement.BulkStateChangeReportsListType;
import com.xius.agent.smf.smfmanagement.BulkStateChangeReportsRequest;
import com.xius.agent.smf.smfmanagement.BulkStateChangeReportsResponse;
import com.xius.smf.domaindata.BulkStateChanegReportsCursorData;
import com.xius.smf.domaindata.BulkStateChanegReportsData;
import com.xius.smf.domaindata.ViewStateChanegReportsCursorData;
import com.xius.smf.domaindata.ViewStateChanegReportsData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.DateUtil;
import com.xius.smf.utils.HeaderDetails;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

@Service("BulkStateChangeReportsImpl")
public class BulkStateChangeReportsImpl {
private  static final Logger logger = LogManager.getLogger(BulkStateChangeReportsImpl.class.getSimpleName());

	private Object setRequest(BulkStateChangeReportsRequest request, HeaderDetails headerDetails) {


		BulkStateChanegReportsData bulkStateChanegReportsData = null;
		ViewStateChanegReportsData ViewStateChanegReportsData = null;


		if(null != request.getTransdates()) {

			bulkStateChanegReportsData = new BulkStateChanegReportsData();
			Date date = null;


		if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getStartDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkStateChanegReportsData.setPi_start_date( dateAsString );
			}
		/*	XMLGregorianCalendar xmlGregorianCalendar = request.getTransdates().getStartDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkStateChanegReportsData.setPi_start_date( dateAsString );
			}*/



			if( null != (date = DateUtil.getCalendarToDate( request.getTransdates().getEndDate())) ) {

				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkStateChanegReportsData.setPi_end_date( dateAsString );
			}
		/*	xmlGregorianCalendar = request.getTransdates().getEndDate();
			date = xmlGregorianCalendar.toGregorianCalendar().getTime();
			if (date != null) {
				String dateAsString  = DateUtil.getMMDDYYYYFormatedDate( date );
				bulkStateChanegReportsData.setPi_end_date( dateAsString );
			}*/
			bulkStateChanegReportsData.setPi_network_id(headerDetails.getNetworkID());
			bulkStateChanegReportsData.setPi_username(headerDetails.getLoginID().trim() );
			if(logger.isDebugEnabled()){

				logger.debug( bulkStateChanegReportsData.toString( bulkStateChanegReportsData ));
			}
			logger.info("date setting==========");
			return bulkStateChanegReportsData;
			
		} else if( null != request.getTransNumber() && request.getTransNumber().trim().length() > 0) {

			ViewStateChanegReportsData = new ViewStateChanegReportsData();
			ViewStateChanegReportsData.setPi_trans_id(request.getTransNumber());
			ViewStateChanegReportsData.setPi_network_id(headerDetails.getNetworkID());
			ViewStateChanegReportsData.setPi_username(headerDetails.getLoginID().trim() );
			logger.info("getTransNumber setting==========");
			return ViewStateChanegReportsData;
			
		}
		return null;
	}

	public BulkStateChangeReportsResponse  bulkStateChangeReports(BulkStateChangeReportsRequest request, HeaderDetails headerDetails) 
	throws SMFAgentException{

		/**
		 * Populate domain object with the data from web service request		
		 */

		BulkStateChangeReportsResponse bulkStateChangeReportsResponse = null;
		Object domainDataObj = setRequest(request, headerDetails);
		logger.info("setRequest completed ================>");
		if( domainDataObj instanceof BulkStateChanegReportsData ) {

			BulkStateChanegReportsData domainData = ( BulkStateChanegReportsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */
			logger.info("pro_state_change_report_dtls start ================>");
			ServiceUtils._executeStoredProcedure("pro_state_change_report_dtls", domainData, domainData);
			logger.info("pro_state_change_report_dtls  end ================>");
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
			bulkStateChangeReportsResponse = setWebserviceResponse(domainData, request);


		} else if( domainDataObj instanceof ViewStateChanegReportsData ) {

			ViewStateChanegReportsData domainData = ( ViewStateChanegReportsData )domainDataObj;
			/**
			 * invoke Stored Procedure.
			 */logger.info("state_change_start ================>");
			ServiceUtils._executeStoredProcedure("bulk_statechang_dtls_transno", domainData, domainData);
			logger.info("state_change_end ================>");
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
			bulkStateChangeReportsResponse = setWebserviceResponse(domainData, request);

		}
		return bulkStateChangeReportsResponse;
	}

	/**
	 * This method is used to map webservices response object from domain(DB) object
	 * @param domainData ViewSimSwapDetailsData
	 * @param request BulkSimSwapStatusReportsRequest
	 * @return BulkSimSwapStatusReports BulkSimSwapStatusReportsResponse
	 */
	private BulkStateChangeReportsResponse setWebserviceResponse(Object domainDataObject, BulkStateChangeReportsRequest request) {

		BulkStateChangeReportsResponse bulkStateChangeReportsResponse = new BulkStateChangeReportsResponse();

		if( domainDataObject instanceof ViewStateChanegReportsData ) {

			ViewStateChanegReportsData domainData = (ViewStateChanegReportsData) domainDataObject;

			List<ViewStateChanegReportsCursorData> cursorData  = domainData.getPo_statechange_details();
			
			logger.info("setWebserviceResponse ================>");
			
			//String[] commaSaparatedStrings = new String[cursorData.size()];
			BulkStateChangeListType bulkStateChangeList = new BulkStateChangeListType();

			if( null != cursorData && cursorData.size() > 0 ) {

			/*	for( int i = 0; i < cursorData.size(); i++) {
					logger.info("ViewStateChanegReportsData ================>");

					ViewStateChanegReportsCursorData viewStateChanegReportsCursorData = cursorData.get( i );

					if( null != viewStateChanegReportsCursorData.getState_change_details() ) {
						
						commaSaparatedStrings[i] = viewStateChanegReportsCursorData.getState_change_details();
					}
				}*/
				   for (ViewStateChanegReportsCursorData viewStateChanegReportsCursorData : cursorData) {
					   logger.info("ViewStateChanegReportsData ================>");
				        if (viewStateChanegReportsCursorData.getState_change_details() != null) {
				        	 bulkStateChangeList.getBulkStateChangeList().add(viewStateChanegReportsCursorData.getState_change_details());
				        }
				    }
			}
			bulkStateChangeReportsResponse.setBulkStateChangeLists(bulkStateChangeList);
			//bulkStateChangeReportsResponse.setBulkStateChangeLists(commaSaparatedStrings);
			
			if(logger.isDebugEnabled()){
				logger.debug( domainData.toString( domainData ));
			}

		} else if( domainDataObject instanceof BulkStateChanegReportsData ) {
			logger.info("setWebserviceResponse ================>");
			
			BulkStateChanegReportsData domainData = (BulkStateChanegReportsData) domainDataObject;

			List <BulkStateChanegReportsCursorData>cursorData  = domainData.getPo_state_change_details();
			//BulkStateChangeReportsListType[] bulkStateChangeReportsListType = new BulkStateChangeReportsListType[ cursorData.size() ];
			List<BulkStateChangeReportsListType> bulkStateChangeReportsListTypeList = new ArrayList<BulkStateChangeReportsListType>();

			if( null != cursorData && cursorData.size() > 0 ) {

				/*for( int i = 0; i < cursorData.size(); i++) {
					logger.info("BulkStateChanegReportsData ================>");
					BulkStateChanegReportsCursorData bulkStateChanegReportsCursorData = cursorData.get( i );

					if( null != bulkStateChanegReportsCursorData ) {
						
						bulkStateChangeReportsListType[i] = new BulkStateChangeReportsListType();
						bulkStateChangeReportsListType[i].setStatus(bulkStateChanegReportsCursorData.getFile_status());
						bulkStateChangeReportsListType[i].setTransNumber(bulkStateChanegReportsCursorData.getFile_trans_id());
						bulkStateChangeReportsListType[i].setUserId(bulkStateChanegReportsCursorData.getUser_id());
						bulkStateChangeReportsListType[i].setSubmissionDate(bulkStateChanegReportsCursorData.getTransation_date());
					}
				}*/
				 for (BulkStateChanegReportsCursorData bulkStateChanegReportsCursorData : cursorData) {
					 logger.info("BulkStateChanegReportsData ================>");
				        if (bulkStateChanegReportsCursorData != null) {
				            BulkStateChangeReportsListType stateChangeReportsListType = new BulkStateChangeReportsListType();
				            stateChangeReportsListType.setStatus(bulkStateChanegReportsCursorData.getFile_status());
				            stateChangeReportsListType.setTransNumber(bulkStateChanegReportsCursorData.getFile_trans_id());
				            stateChangeReportsListType.setUserId(bulkStateChanegReportsCursorData.getUser_id());
				            stateChangeReportsListType.setSubmissionDate(bulkStateChanegReportsCursorData.getTransation_date());

				            bulkStateChangeReportsListTypeList.add(stateChangeReportsListType);
				        }
				    }
				logger.info("bulkStateChangeReportsListType ================>");
			}

			//bulkStateChangeReportsResponse.getBulkStateChangeReportsList(bulkStateChangeReportsListType);
			bulkStateChangeReportsResponse.getBulkStateChangeReportsList().addAll(bulkStateChangeReportsListTypeList);
			if(logger.isDebugEnabled()){

				logger.debug( domainData.toString( domainData ));
			}
		} 

		return bulkStateChangeReportsResponse;
	}

}



