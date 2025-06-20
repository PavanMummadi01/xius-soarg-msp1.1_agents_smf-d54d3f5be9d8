
package com.xius.agent.smf.smfmanagement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SMFManagementServices", targetNamespace = "http://smf.agent.xius.com/SMFManagement.wsdl", wsdlLocation = "file:/D:/containerize--SMF/xius-soarg-msp1.1_agents_smf-d54d3f5be9d8/xius-soarg-msp1.1_agents_smf-d54d3f5be9d8/main/src/main/resources/wsdls/server/SMFManagement.wsdl")
public class SMFManagementServices
    extends Service
{

    private final static URL SMFMANAGEMENTSERVICES_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.xius.agent.smf.smfmanagement.SMFManagementServices.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.xius.agent.smf.smfmanagement.SMFManagementServices.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/containerize--SMF/xius-soarg-msp1.1_agents_smf-d54d3f5be9d8/xius-soarg-msp1.1_agents_smf-d54d3f5be9d8/main/src/main/resources/wsdls/server/SMFManagement.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/containerize--SMF/xius-soarg-msp1.1_agents_smf-d54d3f5be9d8/xius-soarg-msp1.1_agents_smf-d54d3f5be9d8/main/src/main/resources/wsdls/server/SMFManagement.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SMFMANAGEMENTSERVICES_WSDL_LOCATION = url;
    }

    public SMFManagementServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SMFManagementServices() {
        super(SMFMANAGEMENTSERVICES_WSDL_LOCATION, new QName("http://smf.agent.xius.com/SMFManagement.wsdl", "SMFManagementServices"));
    }

    /**
     * 
     * @return
     *     returns SMFManagementPortType
     */
    @WebEndpoint(name = "SMFManagementServicesPort")
    public SMFManagementPortType getSMFManagementServicesPort() {
        return super.getPort(new QName("http://smf.agent.xius.com/SMFManagement.wsdl", "SMFManagementServicesPort"), SMFManagementPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SMFManagementPortType
     */
    @WebEndpoint(name = "SMFManagementServicesPort")
    public SMFManagementPortType getSMFManagementServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://smf.agent.xius.com/SMFManagement.wsdl", "SMFManagementServicesPort"), SMFManagementPortType.class, features);
    }

}
