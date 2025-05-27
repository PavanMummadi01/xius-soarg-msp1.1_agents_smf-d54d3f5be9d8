
package com.xius.smf.client.ws;

import java.rmi.RemoteException;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.SpecialTopUpResponse;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.DebitResponse;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.DebitRequestE;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.DebitResponseE;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.MessageHeader;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.SpecialTopUpRequestE;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.SpecialTopUpResponseE;
import com.xius.billing.balancemanagement_wsdl.BalanceServiceStub.TrackingMessageHeaderType;
import com.xius.billing.balancemanagement_wsdl.FaultMessage;
import com.xius.smf.utils.InitiateAll;
import com.xius.smf.utils.SMFAgentConstants;
import com.xius.smf.utils.Utilities;

/**
 * Class IBADebitWebserviceClient
 *
 *
 * @version        1.1, 16 Nov 2012
 * @author         Naveen Dasyam
 *
 */
public class IBAWebserviceClient {
    private static String    IBA_BAL_MGMT_URL      = null;
    private static final Logger logger = LogManager.getLogger("IBAWebserviceClient");

    static {
        //Properties SMFProp = InitiateAll.getSMFProps();

    	IBA_BAL_MGMT_URL = InitiateAll.getSMFProps().getProperty(SMFAgentConstants.IBA_BAL_MGMT_URL);
    }

    /**
     * Method invokeDebit
     *
     *
     * @param requestE
     * @param headerType
     *
     * @return DebitResponse
     */
    public DebitResponse invokeDebit(DebitRequestE requestE, TrackingMessageHeaderType headerType) {
        try {
        	DebitResponseE balResponse = null;

            if (logger.isInfoEnabled()) {
            	logger.info( "Invoking IBA DebitRequest Service");
            }

            Long                startTime = System.currentTimeMillis();
            DebitResponse response  = null;
            MessageHeader       header    = new MessageHeader();

            header.setTrackingMessageHeader(headerType);

            EndpointReference                epr  = new EndpointReference(IBA_BAL_MGMT_URL);
            
            BalanceServiceStub stub = new BalanceServiceStub();

            stub._getServiceClient().getOptions().setTo(epr);

            if (logger.isInfoEnabled()) {
                logger.info( ">>> Sending request to URL : " + IBA_BAL_MGMT_URL);
            }

            balResponse = stub.debit(requestE, header);

            // stub.notifyBalance (bal, authE);
            if (null != balResponse) {
                response = balResponse.getDebitResponse();
            }

            if (logger.isInfoEnabled()) {
                logger.info("webservice returned >> " + response.getCurrentBalance());
            }
            logger.info("Debit success"+(int) (System.currentTimeMillis() - startTime)+" ms");

            return response;
            
        } catch (RemoteException e) {
            logger.error( "Exception in call IBA Service \n" + Utilities.getStackTrace(e));
            return null;
        } catch (FaultMessage e) {
            logger.error("Exception in call IBA Service \n" + Utilities.getStackTrace(e));
            return null;
        }
    }
    
    /**
     * Method invokeSpecialTopUp
     *
     *
     * @param requestE
     * @param headerType
     *
     * @return SpecialTopUpResponse
     */
    public SpecialTopUpResponse invokeSpecialTopUp(SpecialTopUpRequestE requestE, TrackingMessageHeaderType headerType) {
    //public DebitResponse invokeService(DebitRequestE requestE, TrackingMessageHeaderType headerType) {
        try {
        	SpecialTopUpResponseE specialTopUpResponseE = null;

            if (logger.isInfoEnabled()) {
                logger.info( "Invoking IBA SpecialTopUpRequest Service");
            }

            Long                startTime = System.currentTimeMillis();
            SpecialTopUpResponse response  = null;
            MessageHeader       header    = new MessageHeader();

            header.setTrackingMessageHeader(headerType);

            EndpointReference                epr  = new EndpointReference(IBA_BAL_MGMT_URL);
            
            BalanceServiceStub stub = new BalanceServiceStub();

            stub._getServiceClient().getOptions().setTo(epr);

            if (logger.isInfoEnabled()) {
                logger.info(">>> Sending request to URL : " + IBA_BAL_MGMT_URL);
            }

            specialTopUpResponseE = stub.specialTopUp(requestE, header);

            // stub.notifyBalance (bal, authE);
            if (null != specialTopUpResponseE) {
                response = specialTopUpResponseE.getSpecialTopUpResponse();
            }

            if (logger.isInfoEnabled()) {
                logger.info("webservice returned >> " + response.getCurrentBalance());
            }
            logger.info("SpecialTopUp success"+(int) (System.currentTimeMillis() - startTime)+" ms");

            return response;
            
        } catch (RemoteException e) {
            logger.error( "Exception in call IBA Service \n" + Utilities.getStackTrace(e));
            return null;
        } catch (FaultMessage e) {
            logger.error( "Exception in call IBA Service \n" + Utilities.getStackTrace(e));
            return null;
        }
    }
}