package com.xius.smf.client.ws.stubs;

import java.util.Iterator;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNode;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis.AxisFault;

import com.tunetalk.topup.notification.NotificationServiceStub;

public class BalanceNotifiCustomStub extends NotificationServiceStub {

	public BalanceNotifiCustomStub() throws AxisFault, org.apache.axis2.AxisFault{
		super();

	}

	protected void addHeader(OMElement omElementToadd, SOAPEnvelope envelop, boolean mustUnderstand)
	{
		SOAPHeaderBlock soapHeaderBlock = envelop.getHeader().addHeaderBlock(omElementToadd.getLocalName(), omElementToadd.getNamespace());


		// My fix.
		if ( mustUnderstand ) {
			soapHeaderBlock.setMustUnderstand(mustUnderstand);
		}

		OMNode omNode = null;
		for(Iterator iter = omElementToadd.getChildren(); iter.hasNext(); soapHeaderBlock.addChild(omNode))
			omNode = (OMNode)iter.next();

		OMAttribute omatribute = null;
		for(Iterator iter = omElementToadd.getAllAttributes(); iter.hasNext(); soapHeaderBlock.addAttribute(omatribute))
			omatribute = (OMAttribute)iter.next();

	}
}
