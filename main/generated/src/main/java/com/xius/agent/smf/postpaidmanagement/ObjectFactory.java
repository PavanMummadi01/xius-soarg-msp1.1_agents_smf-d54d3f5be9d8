
package com.xius.agent.smf.postpaidmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xius.agent.smf.postpaidmanagement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PostPaidPmtUpdRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "PostPaidPmtUpdRequest");
    private final static QName _PasswordUpdateRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "passwordUpdateRequest");
    private final static QName _PostPaidPmtUpdResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "PostPaidPmtUpdResponse");
    private final static QName _PasswordUpdateStatusUpdateRes_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "passwordUpdateStatusUpdateRes");
    private final static QName _ConvertPostToPreRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPostToPreRequest");
    private final static QName _PaymentInquiryRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "paymentInquiryRequest");
    private final static QName _PostpaidRegistrationRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "postpaidRegistrationRequest");
    private final static QName _ConvertPreToPostUpdRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPreToPostUpdRequest");
    private final static QName _ConvertPostToPreUpdResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPostToPreUpdResponse");
    private final static QName _DoPostPaidPaymentRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "doPostPaidPaymentRequest");
    private final static QName _ConvertPostToPreResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPostToPreResponse");
    private final static QName _PostpaidRegStatusResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "postpaidRegStatusResponse");
    private final static QName _ConvertPreToPostResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPreToPostResponse");
    private final static QName _ConvertPostToPreUpdRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPostToPreUpdRequest");
    private final static QName _PasswordUpdateStatusUpdateReq_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "passwordUpdateStatusUpdateReq");
    private final static QName _DoPostPaidPaymentResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "doPostPaidPaymentResponse");
    private final static QName _PaymentInquiryResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "paymentInquiryResponse");
    private final static QName _ConvertPreToPostRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPreToPostRequest");
    private final static QName _PostpaidRegStatusRequest_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "postpaidRegStatusRequest");
    private final static QName _PasswordUpdateResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "passwordUpdateResponse");
    private final static QName _ConvertPreToPostUpdResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "convertPreToPostUpdResponse");
    private final static QName _PostpaidRegistrationResponse_QNAME = new QName("http://smf.agent.xius.com/PostPaidManagement.xsd", "postpaidRegistrationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xius.agent.smf.postpaidmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostPaidPmtUpdResponse }
     * 
     */
    public PostPaidPmtUpdResponse createPostPaidPmtUpdResponse() {
        return new PostPaidPmtUpdResponse();
    }

    /**
     * Create an instance of {@link PostPaidPmtUpdRequest }
     * 
     */
    public PostPaidPmtUpdRequest createPostPaidPmtUpdRequest() {
        return new PostPaidPmtUpdRequest();
    }

    /**
     * Create an instance of {@link PaymentInquiryRequest }
     * 
     */
    public PaymentInquiryRequest createPaymentInquiryRequest() {
        return new PaymentInquiryRequest();
    }

    /**
     * Create an instance of {@link PasswordUpdateStatusUpdateReq }
     * 
     */
    public PasswordUpdateStatusUpdateReq createPasswordUpdateStatusUpdateReq() {
        return new PasswordUpdateStatusUpdateReq();
    }

    /**
     * Create an instance of {@link ConvertPostToPreUpdResponse }
     * 
     */
    public ConvertPostToPreUpdResponse createConvertPostToPreUpdResponse() {
        return new ConvertPostToPreUpdResponse();
    }

    /**
     * Create an instance of {@link MSISDNInfotype }
     * 
     */
    public MSISDNInfotype createMSISDNInfotype() {
        return new MSISDNInfotype();
    }

    /**
     * Create an instance of {@link PostpaidRegStatusRequest }
     * 
     */
    public PostpaidRegStatusRequest createPostpaidRegStatusRequest() {
        return new PostpaidRegStatusRequest();
    }

    /**
     * Create an instance of {@link DoPostPaidPaymentResponse }
     * 
     */
    public DoPostPaidPaymentResponse createDoPostPaidPaymentResponse() {
        return new DoPostPaidPaymentResponse();
    }

    /**
     * Create an instance of {@link EnquiryDetailsType }
     * 
     */
    public EnquiryDetailsType createEnquiryDetailsType() {
        return new EnquiryDetailsType();
    }

    /**
     * Create an instance of {@link SubLineInfoListType }
     * 
     */
    public SubLineInfoListType createSubLineInfoListType() {
        return new SubLineInfoListType();
    }

    /**
     * Create an instance of {@link ChildAddAccType }
     * 
     */
    public ChildAddAccType createChildAddAccType() {
        return new ChildAddAccType();
    }

    /**
     * Create an instance of {@link PasswordUpdateStatusUpdateRes }
     * 
     */
    public PasswordUpdateStatusUpdateRes createPasswordUpdateStatusUpdateRes() {
        return new PasswordUpdateStatusUpdateRes();
    }

    /**
     * Create an instance of {@link ConvertPostToPreResponse }
     * 
     */
    public ConvertPostToPreResponse createConvertPostToPreResponse() {
        return new ConvertPostToPreResponse();
    }

    /**
     * Create an instance of {@link DoPostPaidPaymentRequest }
     * 
     */
    public DoPostPaidPaymentRequest createDoPostPaidPaymentRequest() {
        return new DoPostPaidPaymentRequest();
    }

    /**
     * Create an instance of {@link ConvertPreToPostUpdRequest }
     * 
     */
    public ConvertPreToPostUpdRequest createConvertPreToPostUpdRequest() {
        return new ConvertPreToPostUpdRequest();
    }

    /**
     * Create an instance of {@link ConvertPreToPostRequest }
     * 
     */
    public ConvertPreToPostRequest createConvertPreToPostRequest() {
        return new ConvertPreToPostRequest();
    }

    /**
     * Create an instance of {@link ConvertPostToPreUpdRequest }
     * 
     */
    public ConvertPostToPreUpdRequest createConvertPostToPreUpdRequest() {
        return new ConvertPostToPreUpdRequest();
    }

    /**
     * Create an instance of {@link PostpaidRegistrationResponse }
     * 
     */
    public PostpaidRegistrationResponse createPostpaidRegistrationResponse() {
        return new PostpaidRegistrationResponse();
    }

    /**
     * Create an instance of {@link PostpaidRegistrationRequest }
     * 
     */
    public PostpaidRegistrationRequest createPostpaidRegistrationRequest() {
        return new PostpaidRegistrationRequest();
    }

    /**
     * Create an instance of {@link RegStatusInfoListtype }
     * 
     */
    public RegStatusInfoListtype createRegStatusInfoListtype() {
        return new RegStatusInfoListtype();
    }

    /**
     * Create an instance of {@link SubcriberPersonalInfotype }
     * 
     */
    public SubcriberPersonalInfotype createSubcriberPersonalInfotype() {
        return new SubcriberPersonalInfotype();
    }

    /**
     * Create an instance of {@link PostpaidDetails }
     * 
     */
    public PostpaidDetails createPostpaidDetails() {
        return new PostpaidDetails();
    }

    /**
     * Create an instance of {@link SubcriberAddressInfotype }
     * 
     */
    public SubcriberAddressInfotype createSubcriberAddressInfotype() {
        return new SubcriberAddressInfotype();
    }

    /**
     * Create an instance of {@link PasswordUpdateResponse }
     * 
     */
    public PasswordUpdateResponse createPasswordUpdateResponse() {
        return new PasswordUpdateResponse();
    }

    /**
     * Create an instance of {@link PostpaidRegStatusResponse }
     * 
     */
    public PostpaidRegStatusResponse createPostpaidRegStatusResponse() {
        return new PostpaidRegStatusResponse();
    }

    /**
     * Create an instance of {@link ConvertPostToPreRequest }
     * 
     */
    public ConvertPostToPreRequest createConvertPostToPreRequest() {
        return new ConvertPostToPreRequest();
    }

    /**
     * Create an instance of {@link PasswordUpdateRequest }
     * 
     */
    public PasswordUpdateRequest createPasswordUpdateRequest() {
        return new PasswordUpdateRequest();
    }

    /**
     * Create an instance of {@link PaymentInquiryResponse }
     * 
     */
    public PaymentInquiryResponse createPaymentInquiryResponse() {
        return new PaymentInquiryResponse();
    }

    /**
     * Create an instance of {@link ConvertPreToPostResponse }
     * 
     */
    public ConvertPreToPostResponse createConvertPreToPostResponse() {
        return new ConvertPreToPostResponse();
    }

    /**
     * Create an instance of {@link ConvertPreToPostUpdResponse }
     * 
     */
    public ConvertPreToPostUpdResponse createConvertPreToPostUpdResponse() {
        return new ConvertPreToPostUpdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostPaidPmtUpdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "PostPaidPmtUpdRequest")
    public JAXBElement<PostPaidPmtUpdRequest> createPostPaidPmtUpdRequest(PostPaidPmtUpdRequest value) {
        return new JAXBElement<PostPaidPmtUpdRequest>(_PostPaidPmtUpdRequest_QNAME, PostPaidPmtUpdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordUpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "passwordUpdateRequest")
    public JAXBElement<PasswordUpdateRequest> createPasswordUpdateRequest(PasswordUpdateRequest value) {
        return new JAXBElement<PasswordUpdateRequest>(_PasswordUpdateRequest_QNAME, PasswordUpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostPaidPmtUpdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "PostPaidPmtUpdResponse")
    public JAXBElement<PostPaidPmtUpdResponse> createPostPaidPmtUpdResponse(PostPaidPmtUpdResponse value) {
        return new JAXBElement<PostPaidPmtUpdResponse>(_PostPaidPmtUpdResponse_QNAME, PostPaidPmtUpdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordUpdateStatusUpdateRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "passwordUpdateStatusUpdateRes")
    public JAXBElement<PasswordUpdateStatusUpdateRes> createPasswordUpdateStatusUpdateRes(PasswordUpdateStatusUpdateRes value) {
        return new JAXBElement<PasswordUpdateStatusUpdateRes>(_PasswordUpdateStatusUpdateRes_QNAME, PasswordUpdateStatusUpdateRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPostToPreRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPostToPreRequest")
    public JAXBElement<ConvertPostToPreRequest> createConvertPostToPreRequest(ConvertPostToPreRequest value) {
        return new JAXBElement<ConvertPostToPreRequest>(_ConvertPostToPreRequest_QNAME, ConvertPostToPreRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInquiryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "paymentInquiryRequest")
    public JAXBElement<PaymentInquiryRequest> createPaymentInquiryRequest(PaymentInquiryRequest value) {
        return new JAXBElement<PaymentInquiryRequest>(_PaymentInquiryRequest_QNAME, PaymentInquiryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostpaidRegistrationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "postpaidRegistrationRequest")
    public JAXBElement<PostpaidRegistrationRequest> createPostpaidRegistrationRequest(PostpaidRegistrationRequest value) {
        return new JAXBElement<PostpaidRegistrationRequest>(_PostpaidRegistrationRequest_QNAME, PostpaidRegistrationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPreToPostUpdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPreToPostUpdRequest")
    public JAXBElement<ConvertPreToPostUpdRequest> createConvertPreToPostUpdRequest(ConvertPreToPostUpdRequest value) {
        return new JAXBElement<ConvertPreToPostUpdRequest>(_ConvertPreToPostUpdRequest_QNAME, ConvertPreToPostUpdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPostToPreUpdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPostToPreUpdResponse")
    public JAXBElement<ConvertPostToPreUpdResponse> createConvertPostToPreUpdResponse(ConvertPostToPreUpdResponse value) {
        return new JAXBElement<ConvertPostToPreUpdResponse>(_ConvertPostToPreUpdResponse_QNAME, ConvertPostToPreUpdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPostPaidPaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "doPostPaidPaymentRequest")
    public JAXBElement<DoPostPaidPaymentRequest> createDoPostPaidPaymentRequest(DoPostPaidPaymentRequest value) {
        return new JAXBElement<DoPostPaidPaymentRequest>(_DoPostPaidPaymentRequest_QNAME, DoPostPaidPaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPostToPreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPostToPreResponse")
    public JAXBElement<ConvertPostToPreResponse> createConvertPostToPreResponse(ConvertPostToPreResponse value) {
        return new JAXBElement<ConvertPostToPreResponse>(_ConvertPostToPreResponse_QNAME, ConvertPostToPreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostpaidRegStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "postpaidRegStatusResponse")
    public JAXBElement<PostpaidRegStatusResponse> createPostpaidRegStatusResponse(PostpaidRegStatusResponse value) {
        return new JAXBElement<PostpaidRegStatusResponse>(_PostpaidRegStatusResponse_QNAME, PostpaidRegStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPreToPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPreToPostResponse")
    public JAXBElement<ConvertPreToPostResponse> createConvertPreToPostResponse(ConvertPreToPostResponse value) {
        return new JAXBElement<ConvertPreToPostResponse>(_ConvertPreToPostResponse_QNAME, ConvertPreToPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPostToPreUpdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPostToPreUpdRequest")
    public JAXBElement<ConvertPostToPreUpdRequest> createConvertPostToPreUpdRequest(ConvertPostToPreUpdRequest value) {
        return new JAXBElement<ConvertPostToPreUpdRequest>(_ConvertPostToPreUpdRequest_QNAME, ConvertPostToPreUpdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordUpdateStatusUpdateReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "passwordUpdateStatusUpdateReq")
    public JAXBElement<PasswordUpdateStatusUpdateReq> createPasswordUpdateStatusUpdateReq(PasswordUpdateStatusUpdateReq value) {
        return new JAXBElement<PasswordUpdateStatusUpdateReq>(_PasswordUpdateStatusUpdateReq_QNAME, PasswordUpdateStatusUpdateReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPostPaidPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "doPostPaidPaymentResponse")
    public JAXBElement<DoPostPaidPaymentResponse> createDoPostPaidPaymentResponse(DoPostPaidPaymentResponse value) {
        return new JAXBElement<DoPostPaidPaymentResponse>(_DoPostPaidPaymentResponse_QNAME, DoPostPaidPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "paymentInquiryResponse")
    public JAXBElement<PaymentInquiryResponse> createPaymentInquiryResponse(PaymentInquiryResponse value) {
        return new JAXBElement<PaymentInquiryResponse>(_PaymentInquiryResponse_QNAME, PaymentInquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPreToPostRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPreToPostRequest")
    public JAXBElement<ConvertPreToPostRequest> createConvertPreToPostRequest(ConvertPreToPostRequest value) {
        return new JAXBElement<ConvertPreToPostRequest>(_ConvertPreToPostRequest_QNAME, ConvertPreToPostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostpaidRegStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "postpaidRegStatusRequest")
    public JAXBElement<PostpaidRegStatusRequest> createPostpaidRegStatusRequest(PostpaidRegStatusRequest value) {
        return new JAXBElement<PostpaidRegStatusRequest>(_PostpaidRegStatusRequest_QNAME, PostpaidRegStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "passwordUpdateResponse")
    public JAXBElement<PasswordUpdateResponse> createPasswordUpdateResponse(PasswordUpdateResponse value) {
        return new JAXBElement<PasswordUpdateResponse>(_PasswordUpdateResponse_QNAME, PasswordUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertPreToPostUpdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "convertPreToPostUpdResponse")
    public JAXBElement<ConvertPreToPostUpdResponse> createConvertPreToPostUpdResponse(ConvertPreToPostUpdResponse value) {
        return new JAXBElement<ConvertPreToPostUpdResponse>(_ConvertPreToPostUpdResponse_QNAME, ConvertPreToPostUpdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostpaidRegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smf.agent.xius.com/PostPaidManagement.xsd", name = "postpaidRegistrationResponse")
    public JAXBElement<PostpaidRegistrationResponse> createPostpaidRegistrationResponse(PostpaidRegistrationResponse value) {
        return new JAXBElement<PostpaidRegistrationResponse>(_PostpaidRegistrationResponse_QNAME, PostpaidRegistrationResponse.class, null, value);
    }

}
