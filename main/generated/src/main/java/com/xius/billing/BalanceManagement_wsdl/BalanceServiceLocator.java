/**
 * BalanceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.BalanceManagement_wsdl;

public class BalanceServiceLocator extends org.apache.axis.client.Service implements com.xius.billing.BalanceManagement_wsdl.BalanceService {

    public BalanceServiceLocator() {
    }


    public BalanceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BalanceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BalanceManagementPort
    private java.lang.String BalanceManagementPort_address = "http://localhost:8080/infinet/services/v1/balanceServices";

    public java.lang.String getBalanceManagementPortAddress() {
        return BalanceManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BalanceManagementPortWSDDServiceName = "BalanceManagementPort";

    public java.lang.String getBalanceManagementPortWSDDServiceName() {
        return BalanceManagementPortWSDDServiceName;
    }

    public void setBalanceManagementPortWSDDServiceName(java.lang.String name) {
        BalanceManagementPortWSDDServiceName = name;
    }

    public com.xius.billing.BalanceManagement_wsdl.BalanceManagementPortType getBalanceManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BalanceManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBalanceManagementPort(endpoint);
    }

    public com.xius.billing.BalanceManagement_wsdl.BalanceManagementPortType getBalanceManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.billing.BalanceManagement_wsdl.BalanceManagementBindingStub _stub = new com.xius.billing.BalanceManagement_wsdl.BalanceManagementBindingStub(portAddress, this);
            _stub.setPortName(getBalanceManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBalanceManagementPortEndpointAddress(java.lang.String address) {
        BalanceManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.billing.BalanceManagement_wsdl.BalanceManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.billing.BalanceManagement_wsdl.BalanceManagementBindingStub _stub = new com.xius.billing.BalanceManagement_wsdl.BalanceManagementBindingStub(new java.net.URL(BalanceManagementPort_address), this);
                _stub.setPortName(getBalanceManagementPortWSDDServiceName());
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
        if ("BalanceManagementPort".equals(inputPortName)) {
            return getBalanceManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.wsdl", "BalanceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.wsdl", "BalanceManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BalanceManagementPort".equals(portName)) {
            setBalanceManagementPortEndpointAddress(address);
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
