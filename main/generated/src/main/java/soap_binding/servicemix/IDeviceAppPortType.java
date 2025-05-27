/**
 * IDeviceAppPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public interface IDeviceAppPortType extends java.rmi.Remote {
    public net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressResponse updateDeviceAddress(net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAddressRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.device.GetDeviceAllResponse getDeviceAll(net.bcgi.si.messages.mvnoapi.device.GetDeviceAllRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.device.GetDeviceResponse getDevice(net.bcgi.si.messages.mvnoapi.device.GetDeviceRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataResponse getDeviceNetworkData(net.bcgi.si.messages.mvnoapi.device.GetDeviceNetworkDataRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllResponse updateDeviceAll(net.bcgi.si.messages.mvnoapi.device.UpdateDeviceAllRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryResponse prepaidActivationRetry(net.bcgi.si.messages.mvnoapi.device.PrepaidActivationRetryRequest in0) throws java.rmi.RemoteException;
}
