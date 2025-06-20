/**
 * IDeviceAppLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public class IDeviceAppLocator extends org.apache.axis.client.Service implements soap_binding.servicemix.IDeviceApp {

    public IDeviceAppLocator() {
    }


    public IDeviceAppLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IDeviceAppLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DeviceApp
    private java.lang.String DeviceApp_address = "http://192.168.149.57:8192/mspapi/device/";

    public java.lang.String getDeviceAppAddress() {
        return DeviceApp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DeviceAppWSDDServiceName = "DeviceApp";

    public java.lang.String getDeviceAppWSDDServiceName() {
        return DeviceAppWSDDServiceName;
    }

    public void setDeviceAppWSDDServiceName(java.lang.String name) {
        DeviceAppWSDDServiceName = name;
    }

    public soap_binding.servicemix.IDeviceAppPortType getDeviceApp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DeviceApp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDeviceApp(endpoint);
    }

    public soap_binding.servicemix.IDeviceAppPortType getDeviceApp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soap_binding.servicemix.DeviceAppBindingStub _stub = new soap_binding.servicemix.DeviceAppBindingStub(portAddress, this);
            _stub.setPortName(getDeviceAppWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDeviceAppEndpointAddress(java.lang.String address) {
        DeviceApp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soap_binding.servicemix.IDeviceAppPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                soap_binding.servicemix.DeviceAppBindingStub _stub = new soap_binding.servicemix.DeviceAppBindingStub(new java.net.URL(DeviceApp_address), this);
                _stub.setPortName(getDeviceAppWSDDServiceName());
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
        if ("DeviceApp".equals(inputPortName)) {
            return getDeviceApp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:servicemix:soap-binding", "IDeviceApp");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:servicemix:soap-binding", "DeviceApp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DeviceApp".equals(portName)) {
            setDeviceAppEndpointAddress(address);
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
