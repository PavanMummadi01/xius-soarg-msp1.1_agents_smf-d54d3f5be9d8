/**
 * IProvisioningAppLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public class IProvisioningAppLocator extends org.apache.axis.client.Service implements soap_binding.servicemix.IProvisioningApp {

    public IProvisioningAppLocator() {
    }


    public IProvisioningAppLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IProvisioningAppLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProvisioningApp
    private java.lang.String ProvisioningApp_address = "http://192.168.149.179:8295/mspapi/provisioning/";

    public java.lang.String getProvisioningAppAddress() {
        return ProvisioningApp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProvisioningAppWSDDServiceName = "ProvisioningApp";

    public java.lang.String getProvisioningAppWSDDServiceName() {
        return ProvisioningAppWSDDServiceName;
    }

    public void setProvisioningAppWSDDServiceName(java.lang.String name) {
        ProvisioningAppWSDDServiceName = name;
    }

    public soap_binding.servicemix.IProvisioningAppPortType getProvisioningApp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProvisioningApp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProvisioningApp(endpoint);
    }

    public soap_binding.servicemix.IProvisioningAppPortType getProvisioningApp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soap_binding.servicemix.ProvisioningAppBindingStub _stub = new soap_binding.servicemix.ProvisioningAppBindingStub(portAddress, this);
            _stub.setPortName(getProvisioningAppWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProvisioningAppEndpointAddress(java.lang.String address) {
        ProvisioningApp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soap_binding.servicemix.IProvisioningAppPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                soap_binding.servicemix.ProvisioningAppBindingStub _stub = new soap_binding.servicemix.ProvisioningAppBindingStub(new java.net.URL(ProvisioningApp_address), this);
                _stub.setPortName(getProvisioningAppWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProvisioningApp".equals(inputPortName)) {
            return getProvisioningApp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:servicemix:soap-binding", "IProvisioningApp");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "ProvisioningApp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProvisioningApp".equals(portName)) {
            setProvisioningAppEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
