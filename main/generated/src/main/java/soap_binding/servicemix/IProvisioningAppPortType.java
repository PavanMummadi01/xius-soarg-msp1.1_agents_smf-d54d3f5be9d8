/**
 * IProvisioningAppPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap_binding.servicemix;

public interface IProvisioningAppPortType extends java.rmi.Remote {
    public net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogResponse getProvisioningLog(net.bcgi.si.messages.mvnoapi.provisioning.GetProvisioningLogRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDResponse changePersonalIdentity(net.bcgi.si.messages.mvnoapi.provisioning.ChangePersonalIDRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInResponse initiatePortIn(net.bcgi.si.messages.mvnoapi.provisioning.InitiatePortInRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsResponse getAssociatedMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.GetAssociatedMSISDNsRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationResponse simRegistration(net.bcgi.si.messages.mvnoapi.provisioning.SIMRegistrationRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse abandonOrCancelPortIn(net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsResponse getOrderDetails(net.bcgi.si.messages.mvnoapi.provisioning.GetOrderDetailsRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationResponse l4AdNotification(net.bcgi.si.messages.mvnoapi.provisioning.L4AdNotificationRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInResponse acceptPortIn(net.bcgi.si.messages.mvnoapi.provisioning.AcceptPortInRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsResponse initiateMNPNotifications(net.bcgi.si.messages.mvnoapi.provisioning.InitiateMNPNotificationsRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetESNResponse getESN(net.bcgi.si.messages.mvnoapi.provisioning.GetESNRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationResponse validatePortOut(net.bcgi.si.messages.mvnoapi.provisioning.PortOutValidationRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusResponse getPortInStatus(net.bcgi.si.messages.mvnoapi.provisioning.GetPortInStatusRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse modifyPortIn(net.bcgi.si.messages.mvnoapi.provisioning.PortInRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetCSAResponse getCSA(net.bcgi.si.messages.mvnoapi.provisioning.GetCSARequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNResponse changeMDN(net.bcgi.si.messages.mvnoapi.provisioning.ChangeMDNRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerResponse portOutReseller(net.bcgi.si.messages.mvnoapi.provisioning.PortOutResellerRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResponse updateSIMRecStatus(net.bcgi.si.messages.mvnoapi.provisioning.UpdateRecStatusResquest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountResponse activateAccount(net.bcgi.si.messages.mvnoapi.provisioning.ActivateAccountRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryResponse getTransactionHistory(net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionHistoryRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapResponse swapSIM(net.bcgi.si.messages.mvnoapi.provisioning.SIMSwapRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsResponse updateSubDemographicDetails(net.bcgi.si.messages.mvnoapi.provisioning.UpdateSubDemographicDetailsRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNResponse getPreferredMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.GetPreferredMSISDNRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountResponse registerAccount(net.bcgi.si.messages.mvnoapi.provisioning.RegisterAccountRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusResponse updateAccountStatus(net.bcgi.si.messages.mvnoapi.provisioning.UpdateAccountStatusRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsResponse getDesiredMSISDNs(net.bcgi.si.messages.mvnoapi.provisioning.GetDesiredMSISDNsRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationResponse postpaidActivation(net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataResponse getPortInData(net.bcgi.si.messages.mvnoapi.provisioning.GetPortInDataRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationResponse portOutDeactivation(net.bcgi.si.messages.mvnoapi.provisioning.PortOutDeactivationRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNResponse changeESN(net.bcgi.si.messages.mvnoapi.provisioning.ChangeESNRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.common.PingResponse ping(net.bcgi.si.messages.mvnoapi.common.PingRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationResponse prepaidRegistration(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidRegistrationRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PortStatusResponse portStatusRequestDac(net.bcgi.si.messages.mvnoapi.provisioning.PortStatusRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PortInResponse portIn(net.bcgi.si.messages.mvnoapi.provisioning.PortInRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderResponse disassociateOrder(net.bcgi.si.messages.mvnoapi.provisioning.DisassociateOrderRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsResponse uploadSIMs(net.bcgi.si.messages.mvnoapi.provisioning.UploadSIMsRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInResponse cancelPortIn(net.bcgi.si.messages.mvnoapi.provisioning.CancelPortInRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationResponse prepaidActivation(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestResponse prepaidActivationRest(net.bcgi.si.messages.mvnoapi.provisioning.PrepaidActivationRestRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestResponse postpaidActivationRest(net.bcgi.si.messages.mvnoapi.provisioning.PostpaidActivationRestRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.ChangeDueDateResponse changePortInDueDate(net.bcgi.si.messages.mvnoapi.provisioning.PortInDueDateChangeRequest in0) throws java.rmi.RemoteException;
    public net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsResponse getTransactionDetails(net.bcgi.si.messages.mvnoapi.provisioning.GetTransactionDetailsRequest in0) throws java.rmi.RemoteException;
}
