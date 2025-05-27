/**
 * IProvisioningApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public interface IProvisioningApp extends javax.xml.rpc.Service {
    public java.lang.String getProvisioningAppAddress();

    public soap_binding.servicemix.IProvisioningAppPortType getProvisioningApp() throws javax.xml.rpc.ServiceException;

    public soap_binding.servicemix.IProvisioningAppPortType getProvisioningApp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
