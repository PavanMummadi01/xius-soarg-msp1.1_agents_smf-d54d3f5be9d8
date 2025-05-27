package com.xius.smf.webservices.smfservices;

import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import net.bcgi.util.db.SPFactory;
import com.xius.smf.domaindata.MDNRegActUpdateData;
import com.xius.smf.exceptions.SMFAgentException;
import com.xius.smf.utils.ServiceUtils;
import com.xius.smf.utils.Utilities;

public class MDNRegActUpdateImpl {
	private  static final Logger logger = LogManager.getLogger(MDNRegActUpdateImpl.class.getSimpleName());


	public void mdnRegActUpdate(MDNRegActUpdateData domainData) throws RemoteException,
			SMFAgentException {
		logger.info("MDNRegActUpdateImpl-mdnRegActUpdate called");
		
		SPFactory factory = ServiceUtils.executeSPWithOutCommit("pro_get_msdn_action_dtls_upd", domainData, domainData);

		if (logger.isInfoEnabled()) {
			logger.info( domainData.toString());
		}

		Utilities.commitOrRollback(factory, domainData.getPo_error_code());

		if (logger.isInfoEnabled()) {
			logger.info("Error Code from pro_get_msdn_action_dtls_upd  ==>"+ domainData.getPo_error_code());
			logger.info("Error Msg from pro_get_msdn_action_dtls_upd  ==>"+ domainData.getPo_error_desc());
		}
	}
}
