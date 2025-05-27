/**
 * ProductDetailsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.billing.ProductManagement_wsdl;

public class ProductDetailsLocator extends org.apache.axis.client.Service implements com.xius.billing.ProductManagement_wsdl.ProductDetails {

    public ProductDetailsLocator() {
    }


    public ProductDetailsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductDetailsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductPort
    private java.lang.String ProductPort_address = "http://localhost:8080/mspgwservices/services/ProductPort";

    public java.lang.String getProductPortAddress() {
        return ProductPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductPortWSDDServiceName = "ProductPort";

    public java.lang.String getProductPortWSDDServiceName() {
        return ProductPortWSDDServiceName;
    }

    public void setProductPortWSDDServiceName(java.lang.String name) {
        ProductPortWSDDServiceName = name;
    }

    public com.xius.billing.ProductManagement_wsdl.ProductPortType getProductPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductPort(endpoint);
    }

    public com.xius.billing.ProductManagement_wsdl.ProductPortType getProductPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.billing.ProductManagement_wsdl.ProductBindingStub _stub = new com.xius.billing.ProductManagement_wsdl.ProductBindingStub(portAddress, this);
            _stub.setPortName(getProductPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductPortEndpointAddress(java.lang.String address) {
        ProductPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.billing.ProductManagement_wsdl.ProductPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.billing.ProductManagement_wsdl.ProductBindingStub _stub = new com.xius.billing.ProductManagement_wsdl.ProductBindingStub(new java.net.URL(ProductPort_address), this);
                _stub.setPortName(getProductPortWSDDServiceName());
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
        if ("ProductPort".equals(inputPortName)) {
            return getProductPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.wsdl", "ProductDetails");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://billing.xius.com/ProductManagement.wsdl", "ProductPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductPort".equals(portName)) {
            setProductPortEndpointAddress(address);
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
