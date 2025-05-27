package com.xius.smf.job.task;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.util.concurrent.CountDownLatch;
import net.bcgi.util.db.SPFactory;
import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tunetalk.topup.notification.NotificationError;
import com.tunetalk.topup.notification.NotificationServiceStub.AccountNumber;
import com.tunetalk.topup.notification.NotificationServiceStub.AccountStatus;
import com.tunetalk.topup.notification.NotificationServiceStub.AccountType;
import com.tunetalk.topup.notification.NotificationServiceStub.BalanceNotification;
import com.tunetalk.topup.notification.NotificationServiceStub.BalanceNotificationE;
import com.tunetalk.topup.notification.NotificationServiceStub.Datetime;
import com.tunetalk.topup.notification.NotificationServiceStub.DecimalType;
import com.tunetalk.topup.notification.NotificationServiceStub.Response;
import com.tunetalk.topup.notification.NotificationServiceStub.Result;
import com.xius.smf.client.ws.BalanceNotificationClient;
import com.xius.smf.domaindata.UpdateBalNotificationData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class ScheduleBalNotifThread implements Runnable{
	private Logger logger = LogManager.getLogger("ScheduleBalNotifThread");

	private BalanceNotificationE balNotifData;
	private CountDownLatch latch;
	private String transId;
	private String acctID;
	private String MSISDN;
	private String balDateTime;
	private String balExpDate;
	private BigDecimal balance; 
	private String acctType;
	private String actStatus;

	public ScheduleBalNotifThread(BalanceNotificationE balNotifData) {
		this.balNotifData = balNotifData;
	}

	public ScheduleBalNotifThread(BalanceNotificationE balNotifData, CountDownLatch latch, String transId) {
		this.balNotifData = balNotifData;
		this.latch= latch;
		this.transId = transId;
	}
	public ScheduleBalNotifThread(CountDownLatch latch, String transId,String acctID,String MSISDN
			,String balDateTime, String balExpDate, BigDecimal balance 
			,String acctType,String actStatus) {
		this.latch= latch;
		this.transId = transId;
		this.acctID = acctID;
		this.MSISDN = MSISDN;
		this.balDateTime=balDateTime;
		this.balExpDate=balExpDate;
		this.balance=balance; 
		this.acctType=acctType;
		this.actStatus=actStatus;

	}
	
	public void run() {
		BalanceNotificationE APIobj = null;
		try{
			APIobj = buildAPIobject();
			processAPICall(APIobj,transId);
		}catch (Exception e) {
			logger.error("Error in ScheduleTopUpThread run():"+Utilities.getStackTrace( e ) );
		}finally {			
			latch.countDown();
			APIobj=null;
		}
	}
	
	
	private BalanceNotificationE buildAPIobject() {
		BalanceNotification bal = null;
		BalanceNotificationE balE = null;
		
		bal = new BalanceNotification();

		AccountNumber accountNumber = new AccountNumber();
		if( acctID!= null)
			accountNumber.setAccountNumber( acctID );

		com.tunetalk.topup.notification.NotificationServiceStub.MSISDN msisdn = new com.tunetalk.topup.notification.NotificationServiceStub.MSISDN();
		if( MSISDN!= null)
			msisdn.setMSISDN( MSISDN );
		bal.setMSISDN( msisdn );

		Datetime balanceDateTime = new Datetime();
		if(balDateTime!= null)
			balanceDateTime.setDatetime( balDateTime );
		bal.setBalanceDatetime( balanceDateTime );

		Datetime balanceExpiryDatetime = new Datetime();
		if(balExpDate!= null)
			balanceExpiryDatetime.setDatetime( balExpDate );
		bal.setBalanceExpiryDatetime( balanceExpiryDatetime );

		bal.setAccountNumber( accountNumber );

		/*
	AC-Activated
	G1-Grace Period One
	TR-Transit
	DA-Deactivated
	EX-Expired
		 */
		if("AC".equals(actStatus))
			bal.setAccountStatus(AccountStatus.value1);//Activated
		else
			if("TR".equals(actStatus))
				bal.setAccountStatus(AccountStatus.value2);//Transit
			else
				if("G1".equals(actStatus))
					bal.setAccountStatus(AccountStatus.value3);//Grace Period One
				else
					if("DA".equals(actStatus))
						bal.setAccountStatus(AccountStatus.value4);//Deactivated
					else
						if("EX".equals(actStatus))
							bal.setAccountStatus(AccountStatus.value5);//Expired


		if(balance!= null) {

			DecimalType decimalType = new DecimalType();
			BigDecimal roundedAmount =balance.setScale(2, balance.ROUND_HALF_DOWN);
			decimalType.setDecimalType( roundedAmount );
			bal.setBalanceAmount(decimalType);
		}

		if("PR".equals(acctType))
			bal.setAccountType(AccountType.PREPAID );

		//				printing the data
		if(!Utilities.isNull(transId))
			printData(bal, transId);
		else
			printData(bal, "");
		balE = new BalanceNotificationE();
		balE.setBalanceNotification( bal );
		bal = null;
		return balE;
	}

	/**
	 * this method is used to call ext API with balance notification data and transId
	 * @param bal 
	 * @param transId 
	 */
	private void processAPICall(BalanceNotificationE bal, String transId) throws AxisFault
	{
		String status 		= null;
		String description 	= null;
		String MSISDN = "";
		Response response 	= null;
		BalanceNotificationClient client = null;

		Long startTime  = System.currentTimeMillis();

			client = new BalanceNotificationClient();

			try {

				if(null != bal.getBalanceNotification() && null != bal.getBalanceNotification().getMSISDN())
					MSISDN = bal.getBalanceNotification().getMSISDN().getMSISDN();

				logger.debug( (new StringBuilder()).append("Sending request to External System for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString());

				//calling TT external API
				response = client.invokeService(bal, transId);
				if( null != response ) {

					logger.debug( (new StringBuilder()).append("<<< Response from External System: ").append(response.getDescription()).append("for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString());

					Result extResult = response.getResult();

					if( null != extResult ) {
						String extResultValue = extResult.getValue();

						if( Utilities.isNull( extResultValue )== false) {

							if( "Success".equalsIgnoreCase( extResultValue )) {

								logger.debug( (new StringBuilder()).append("External System response result: Success for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString());

								status = SMFAgentConstants.NOTIFICATION_SUCCESS_FLAG;
								description = response.getDescription();

							} else {
								// do fail log into DB
								logger.debug( (new StringBuilder()).append("External System response result: Fail for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString());
								status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
								description = response.getDescription();
							}
						} else {
							status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
							description = (new StringBuilder()).append("External System response's result(Enum) value is NULL for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString();
							logger.error(description);
						}
					} else {
						status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
						description = (new StringBuilder()).append("External System response's result Obj is NULL for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString();
						logger.error(description);
					}

				} else {
					status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
					description = (new StringBuilder()).append("No response from External System for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString();
					logger.error(description);
				}

			} catch (AxisFault af) {

				logger.error( (new StringBuilder()).append("Axis Fault for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString());
				status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
				description = af.getMessage();

			} catch (NotificationError e) {

				logger.error( (new StringBuilder()).append("Caught in NotificationError for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).append(".....").append(Utilities.getStackTrace(e)).toString());
				status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
				description = e.getMessage();

			} catch (RemoteException e) {

				logger.error( (new StringBuilder()).append("Caught in RemoteException for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).append(".....").append(Utilities.getStackTrace(e)).toString());
				status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
				description = e.getMessage();
			} catch (MalformedURLException e) {

				logger.error( (new StringBuilder()).append("Caught in MalformedURLException for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).append(".....").append(Utilities.getStackTrace(e)).toString());
				status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
				description = e.getMessage();
			} catch (GeneralSecurityException e) {

				logger.error( (new StringBuilder()).append("Caught in GeneralSecurityException for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).append(".....").append(Utilities.getStackTrace(e)).toString());
				status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
				description = e.getMessage();
			} catch (IOException e) {

				logger.error( (new StringBuilder()).append("Caught in IOException for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).append(".....").append(Utilities.getStackTrace(e)).toString());
				status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
				description = e.getMessage();
			} catch (Exception e) {

				logger.error( (new StringBuilder()).append("Caught in Exception for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).append(".....").append(Utilities.getStackTrace(e)).toString());
				status = SMFAgentConstants.NOTIFICATION_FAIL_FLAG;
				description = e.getMessage();
			}

			//	calling the db to update the notification status
			logger.debug( (new StringBuilder()).append("Calling DB update proc for transId:").append(transId).append(" and MSISDN : ").append(MSISDN).toString());

			if(Utilities.isNull(transId) == false)
				updateNotification(transId, status, description);
			else
				logger.error("ooooooooooops cudnt get trasnid");
			client = null;

		logger.info( "Time Taken for completing Notification process for transaction id "+transId+" in (seconds):"+((System.currentTimeMillis() - startTime)/1000));
	}// end of method processAPICall()

	/**
	 * This method is used to call db for update the status.
	 * @param tranxNumber
	 * @param status
	 * @param description
	 */
	private void updateNotification( String tranxNumber, String status, String description){

		Long startTime  = System.currentTimeMillis();

		logger.debug( ">>> Updating notification for sequence: " + tranxNumber);

		Long networkID = 1L;
		String networkId = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.NETWORKID_PROP );
		String consumerType = InitiateAll.getSMFProps().getProperty( SMFAgentConstants.CONSUMER_TYPE );
		UpdateBalNotificationData domainData = new UpdateBalNotificationData();
		/**
		 * Setting the input
		 */

		// network id
		if(Utilities.isNull(networkId) == false )
			domainData.setPi_network_id(new Long(networkId));
		else {
			logger.error("No netwrok id found taking default value 1");
			domainData.setPi_network_id(networkID);
		}
		// source ID
		domainData.setPi_source(SMFAgentConstants.SOURCE_NOTIFICAITON);

		// consumer type           
		if( Utilities.isNull( consumerType )== false )
			domainData.setPi_consumer_type(consumerType);
		else {
			logger.debug( "Default Consumer Type (A) selected");
			domainData.setPi_consumer_type( SMFAgentConstants.CONSUMER_TYPE );
		}

		// Status
		if( Utilities.isNull( status ) == false )
			domainData.setPi_status( status );

		//	failure_reason	if any
		if( Utilities.isNull( description ) == false )
			domainData.setPi_failure_reason( description );

		// seq_no   
		if( null != tranxNumber )
			domainData.setPi_seq_no( tranxNumber );

		Long errorCode = null;
		SPFactory spFactory = null;

		try {
			spFactory = ServiceUtils.executeSPWithOutCommit("PRO_AMS_LOWBAL_NOTIFY_UPD", domainData, domainData);
			logger.debug( "PRO_AMS_LOWBAL_NOTIFY_UPD Error Code==>"+domainData.getPo_error_code());

			errorCode = domainData.getPo_error_code();

			//Depending upon the result  either roll back(Failure) or commit(Success)
			Utilities.commitOrRollback(spFactory, errorCode);

			//If return value is zero then success else throwing the error back to user
			if(errorCode != null && errorCode !=0)
				throw Utilities.setRejectDetails(errorCode.toString(),null);

		} catch (SMFAgentException e) {

			logger.error( "SMFAgentException in updateNotification() \n"+Utilities.getStackTrace(e));
		}
		catch (Exception e) {

			logger.error("Exception in updateNotification() \n"+Utilities.getStackTrace(e));
		}
		logger.info("BalanceNotification Update success"+(int) (System.currentTimeMillis() - startTime)+"ms");
	} // end of method updateNotification
	
	private void printData(BalanceNotification balNotifDat,String txId) {


		StringBuilder builder = new StringBuilder(300);

		builder.append("\n ============= Low Balance Notification Data =============");
		builder.append("\n msisdn : "+ balNotifDat.getMSISDN().getMSISDN());
		builder.append("\n accountStatus : "+ balNotifDat.getAccountStatus());
		builder.append("\n accoutNumber : "+ balNotifDat.getAccountNumber().getAccountNumber());
		builder.append("\n balance Amount: "+ balNotifDat.getBalanceAmount());
		builder.append("\n balance Date: "+ balNotifDat.getBalanceDatetime());
		builder.append("\n balance Exp Date: "+ balNotifDat.getBalanceExpiryDatetime());
		builder.append("\n Tx Sequence ID: "+ txId );

		builder.append("\n ============= End of Low Balance Notification Data =============");
		logger.debug("data sending to ext sys " + builder.toString() );	
	} // end of method printData()

}
