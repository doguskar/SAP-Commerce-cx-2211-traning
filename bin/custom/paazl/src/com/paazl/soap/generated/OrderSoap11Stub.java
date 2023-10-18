/**
 * OrderSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public class OrderSoap11Stub extends org.apache.axis.client.Stub implements com.paazl.soap.generated.Order {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[56];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeOrderRequest"), com.paazl.soap.generated.ChangeOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderSaveResponseType"));
        oper.setReturnClass(com.paazl.soap.generated.OrderSaveResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderDetailsRequest"), com.paazl.soap.generated.OrderDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderDetailsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.OrderDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("googleMapSearchstring");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "googleMapSearchstringRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">googleMapSearchstringRequest"), com.paazl.soap.generated.GoogleMapSearchstringRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">googleMapSearchstringResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GoogleMapSearchstringResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "googleMapSearchstringResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("order");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderRequest"), com.paazl.soap.generated.OrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderSaveResponseType"));
        oper.setReturnClass(com.paazl.soap.generated.OrderSaveResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deliveryEstimate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deliveryEstimateRequest"), com.paazl.soap.generated.DeliveryEstimateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deliveryEstimateResponse"));
        oper.setReturnClass(com.paazl.soap.generated.DeliveryEstimateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batchStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batchStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">batchStatusRequest"), com.paazl.soap.generated.BatchStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">batchStatusResponse"));
        oper.setReturnClass(com.paazl.soap.generated.BatchStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batchStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExistingZplLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingZplLabelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelRequest"), com.paazl.soap.generated.GetExistingZplLabelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GetExistingZplLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingZplLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateAdditionalImageDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateAdditionalImageDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateAdditionalDocumentType"), com.paazl.soap.generated.GenerateAdditionalDocumentType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateAdditionalImageDocumentResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateAdditionalImageDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateAdditionalImageDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePdfLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generatePdfLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfLabelsRequest"), com.paazl.soap.generated.GeneratePdfLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GeneratePdfLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generatePdfLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commitOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "commitOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">commitOrderRequest"), com.paazl.soap.generated.CommitOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderSaveResponseType"));
        oper.setReturnClass(com.paazl.soap.generated.OrderSaveResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "commitOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePdfCustomsDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generatePdfCustomsDocumentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfCustomsDocumentsRequest"), com.paazl.soap.generated.GeneratePdfCustomsDocumentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfCustomsDocumentsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GeneratePdfCustomsDocumentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generatePdfCustomsDocumentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateZplLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateZplLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateZplLabelsRequest"), com.paazl.soap.generated.GenerateZplLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateZplLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateZplLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateZplLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExistingPdfLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingPdfLabelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelRequest"), com.paazl.soap.generated.GetExistingPdfLabelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GetExistingPdfLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingPdfLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activeShippingOption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "activeShippingOptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">activeShippingOptionRequest"), com.paazl.soap.generated.ActiveShippingOptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">activeShippingOptionResponse"));
        oper.setReturnClass(com.paazl.soap.generated.ActiveShippingOptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "activeShippingOptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelShipments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "cancelShipmentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">cancelShipmentsRequest"), com.paazl.soap.generated.CancelShipmentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">cancelShipmentsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.CancelShipmentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "cancelShipmentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("address");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addressRequest"), com.paazl.soap.generated.AddressRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addressResponse"));
        oper.setReturnClass(com.paazl.soap.generated.AddressResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateExtraPdfReturnLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraPdfReturnLabelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfReturnLabelRequest"), com.paazl.soap.generated.GenerateExtraPdfReturnLabelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfReturnLabelResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateExtraPdfReturnLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraPdfReturnLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExistingPdfLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingPdfLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelsRequest"), com.paazl.soap.generated.GetExistingPdfLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GetExistingPdfLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingPdfLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPickupRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createPickupRequestRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">createPickupRequestRequest"), com.paazl.soap.generated.CreatePickupRequestRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">createPickupRequestResponse"));
        oper.setReturnClass(com.paazl.soap.generated.CreatePickupRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createPickupRequestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateImageReturnLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateImageReturnLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateReturnLabelsType"), com.paazl.soap.generated.GenerateReturnLabelsType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateImageReturnLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateImageReturnLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateImageReturnLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateImageLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateImageLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateImageLabelsRequest"), com.paazl.soap.generated.GenerateImageLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateImageLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateImageLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateImageLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateExtraImageLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraImageLabelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraImageLabelRequest"), com.paazl.soap.generated.GenerateExtraImageLabelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraImageLabelResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateExtraImageLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraImageLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("proofOfDelivery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "proofOfDeliveryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">proofOfDeliveryRequest"), com.paazl.soap.generated.ProofOfDeliveryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">proofOfDeliveryResponse"));
        oper.setReturnClass(com.paazl.soap.generated.ProofOfDeliveryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "proofOfDeliveryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("servicePoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsRequest"), com.paazl.soap.generated.ServicePointsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.ServicePointsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateExtraPdfLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraPdfLabelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfLabelRequest"), com.paazl.soap.generated.GenerateExtraPdfLabelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfLabelResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateExtraPdfLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraPdfLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "listOrdersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOrdersRequest"), com.paazl.soap.generated.ListOrdersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOrdersResponse"));
        oper.setReturnClass(com.paazl.soap.generated.ListOrdersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "listOrdersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExistingImageLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingImageLabelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingLabelType"), com.paazl.soap.generated.GetExistingLabelType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingImageLabelResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GetExistingImageLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingImageLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateAdditionalPdfDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateAdditionalPdfDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateAdditionalPdfDocumentRequest"), com.paazl.soap.generated.GenerateAdditionalPdfDocumentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateAdditionalPdfDocumentResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateAdditionalPdfDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateAdditionalPdfDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pickupRequestDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestQueryType"), com.paazl.soap.generated.PickupRequestQueryType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestDetailsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.PickupRequestDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createStores");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createStoresRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoresRequestType"), com.paazl.soap.generated.ChangeStoresRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoresResponseType"));
        oper.setReturnClass(com.paazl.soap.generated.ChangeStoresResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "createStoresResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listOpenBatches");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "listOpenBatchesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOpenBatchesRequest"), com.paazl.soap.generated.ListOpenBatchesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOpenBatchesResponse"));
        oper.setReturnClass(com.paazl.soap.generated.ListOpenBatchesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "listOpenBatchesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listStores");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "listStoresRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listStoresRequest"), com.paazl.soap.generated.ListStoresRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listStoresResponse"));
        oper.setReturnClass(com.paazl.soap.generated.ListStoresResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "listStoresResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ordersToShip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "ordersToShipRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersToShipRequest"), com.paazl.soap.generated.OrdersToShipRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersToShipResponse"));
        oper.setReturnClass(com.paazl.soap.generated.OrdersToShipResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "ordersToShipResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("closeBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "closeBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">closeBatchRequest"), com.paazl.soap.generated.CloseBatchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">closeBatchResponse"));
        oper.setReturnClass(com.paazl.soap.generated.CloseBatchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "closeBatchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">openBatchRequest"), com.paazl.soap.generated.OpenBatchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">openBatchResponse"));
        oper.setReturnClass(com.paazl.soap.generated.OpenBatchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openBatchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkoutStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "checkoutStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "baseCheckoutRequestType"), com.paazl.soap.generated.BaseCheckoutRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">checkoutStatusResponse"));
        oper.setReturnClass(com.paazl.soap.generated.CheckoutStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "checkoutStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pickupRequestStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestQueryType"), com.paazl.soap.generated.PickupRequestQueryType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestStatusResponse"));
        oper.setReturnClass(com.paazl.soap.generated.PickupRequestStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelPickupRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "cancelPickupRequestRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestQueryType"), com.paazl.soap.generated.PickupRequestQueryType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">cancelPickupRequestResponse"));
        oper.setReturnClass(com.paazl.soap.generated.CancelPickupRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "cancelPickupRequestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteStores");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deleteStoresRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteStoresRequest"), com.paazl.soap.generated.DeleteStoresRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteStoresResponse"));
        oper.setReturnClass(com.paazl.soap.generated.DeleteStoresResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deleteStoresResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shippingOption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingOptionRequest"), com.paazl.soap.generated.ShippingOptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingOptionResponse"));
        oper.setReturnClass(com.paazl.soap.generated.ShippingOptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateLabelsRequest"), com.paazl.soap.generated.GenerateLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "updateOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">updateOrderRequest"), com.paazl.soap.generated.UpdateOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderSaveResponseType"));
        oper.setReturnClass(com.paazl.soap.generated.OrderSaveResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "updateOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateExtraImageReturnLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraImageReturnLabelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateReturnLabelType"), com.paazl.soap.generated.GenerateReturnLabelType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraImageReturnLabelResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateExtraImageReturnLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateExtraImageReturnLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "validateOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">validateOrderRequest"), com.paazl.soap.generated.ValidateOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "validateOrderResponseType"));
        oper.setReturnClass(com.paazl.soap.generated.ValidateOrderResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "validateOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateShippingManifest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateShippingManifestRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateShippingManifestRequest"), com.paazl.soap.generated.GenerateShippingManifestRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateShippingManifestResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GenerateShippingManifestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateShippingManifestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pickupRequestOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestOptionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestOptionsRequest"), com.paazl.soap.generated.PickupRequestOptionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestOptionsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.PickupRequestOptionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestOptionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExistingImageLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingImageLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingLabelsType"), com.paazl.soap.generated.GetExistingLabelsType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingImageLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GetExistingImageLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingImageLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addExistingShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addExistingShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addExistingShipmentRequest"), com.paazl.soap.generated.AddExistingShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addExistingShipmentResponse"));
        oper.setReturnClass(com.paazl.soap.generated.AddExistingShipmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addExistingShipmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderStatusRequest"), com.paazl.soap.generated.OrderStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderStatusResponse"));
        oper.setReturnClass(com.paazl.soap.generated.OrderStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExistingZplLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingZplLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelsRequest"), com.paazl.soap.generated.GetExistingZplLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GetExistingZplLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingZplLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("triggerCarrierRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "triggerCarrierRegistrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">triggerCarrierRegistrationRequest"), com.paazl.soap.generated.TriggerCarrierRegistrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">triggerCarrierRegistrationResponse"));
        oper.setReturnClass(com.paazl.soap.generated.TriggerCarrierRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "triggerCarrierRegistrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "rateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">rateRequest"), com.paazl.soap.generated.RateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">rateResponse"));
        oper.setReturnClass(com.paazl.soap.generated.RateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "rateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePdfReturnLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generatePdfReturnLabelsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfReturnLabelsRequest"), com.paazl.soap.generated.GeneratePdfReturnLabelsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfReturnLabelsResponse"));
        oper.setReturnClass(com.paazl.soap.generated.GeneratePdfReturnLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generatePdfReturnLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "checkoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "baseCheckoutRequestType"), com.paazl.soap.generated.BaseCheckoutRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">checkoutResponse"));
        oper.setReturnClass(com.paazl.soap.generated.CheckoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "checkoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateStores");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "updateStoresRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoresRequestType"), com.paazl.soap.generated.ChangeStoresRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoresResponseType"));
        oper.setReturnClass(com.paazl.soap.generated.ChangeStoresResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "updateStoresResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deleteOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteOrderRequest"), com.paazl.soap.generated.DeleteOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteOrderResponse"));
        oper.setReturnClass(com.paazl.soap.generated.DeleteOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deleteOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

    }

    public OrderSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OrderSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OrderSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>activeShippingOptionResponse>activeShippingOptions>activeShippingOption");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>products>product>matrix");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>servicePointsType>servicePoint>openingTimes>time");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointsTypeServicePointOpeningTimesTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>shippingOptionResponse>shippingOptions>shippingOption");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingOptionResponseShippingOptionsShippingOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>activeShippingOptionResponse>activeShippingOptions");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ActiveShippingOptionResponseActiveShippingOptionsActiveShippingOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>activeShippingOptionResponse>activeShippingOptions>activeShippingOption");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "activeShippingOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>addressResponse>address");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AddressResponseAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>availableStores>store");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AvailableStoresStore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>changeOrderRequest>customerPhoneNumber");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>checkoutStatusResponse>consignee");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CheckoutStatusResponseConsignee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>checkoutStatusResponse>delivery");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CheckoutStatusResponseDelivery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>checkoutStatusResponse>notification");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CheckoutStatusResponseNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>commitOrderRequest>customerPhoneNumber");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>orderDetailsResponse>products");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ProductType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "productType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "product");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>orderDetailsResponse>vatNumber");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>orderStatusContainerType>shippingLabels>shippingLabel");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderStatusContainerTypeShippingLabelsShippingLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>ordersType>order>label");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrdersTypeOrderLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>ordersType>order>vatNumber");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>products>product");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ProductsProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>rateResponse>rate");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.RateResponseRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>servicePointsResponse>shippingOption");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointsResponseShippingOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>servicePointsType>servicePoint>openingTimes");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointsTypeServicePointOpeningTimesTime[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>servicePointsType>servicePoint>openingTimes>time");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "time");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>shippingAddress>companyName");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>shippingAddress>customerName");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>shippingAddress>nameOther");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>shippingAddress>vatNumber");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>shippingMethod>customsValue");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>shippingOptionResponse>shippingOptions");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingOptionResponseShippingOptionsShippingOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>>shippingOptionResponse>shippingOptions>shippingOption");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>triggerCarrierRegistrationResponse>shippingLabels");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.TriggerBarcodeResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "triggerBarcodeResponseType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingLabel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>validateOrderRequest>customerPhoneNumber");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">activeShippingOptionRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ActiveShippingOptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">activeShippingOptionResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ActiveShippingOptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addExistingShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AddExistingShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addExistingShipmentResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AddExistingShipmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addressRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AddressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">addressResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AddressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">availableStores");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AvailableStoresStore[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>availableStores>store");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "store");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">batchStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BatchStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">batchStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BatchStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">cancelPickupRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CancelPickupRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">cancelShipmentsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CancelShipmentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">cancelShipmentsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CancelShipmentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">carrierStatusHistoryType>history");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CarrierStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatusType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "status");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeOrderRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeProducts>product");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeProductsProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeShippingAddress>companyName");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeShippingAddress>customerName");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeShippingAddress>nameOther");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeShippingAddress>vatNumber");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeShippingMethod>customsValue");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">checkoutResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CheckoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">checkoutStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CheckoutStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">closeBatchRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CloseBatchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">closeBatchResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CloseBatchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">commitOrderRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CommitOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">createPickupRequestRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CreatePickupRequestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">createPickupRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CreatePickupRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteOrderRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeleteOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeleteOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteStoresRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeleteStoresRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deleteStoresResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeleteStoresResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deliveryEstimateRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryEstimateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">deliveryEstimateResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryEstimateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateAdditionalImageDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateAdditionalImageDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateAdditionalPdfDocumentRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateAdditionalPdfDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateAdditionalPdfDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateAdditionalPdfDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraImageLabelRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateExtraImageLabelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraImageLabelResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateExtraImageLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraImageReturnLabelResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateExtraImageReturnLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfLabelRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateExtraPdfLabelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfLabelResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateExtraPdfLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfReturnLabelRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateExtraPdfReturnLabelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateExtraPdfReturnLabelResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateExtraPdfReturnLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateImageLabelsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateImageLabelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateImageLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateImageLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateImageReturnLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateImageReturnLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateLabelsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateLabelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfCustomsDocumentsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GeneratePdfCustomsDocumentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfCustomsDocumentsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GeneratePdfCustomsDocumentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfLabelsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GeneratePdfLabelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GeneratePdfLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfReturnLabelsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GeneratePdfReturnLabelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generatePdfReturnLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GeneratePdfReturnLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateShippingManifestRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateShippingManifestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateShippingManifestResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateShippingManifestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateZplLabelsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateZplLabelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">generateZplLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateZplLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingImageLabelResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingImageLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingImageLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingImageLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingPdfLabelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingPdfLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingPdfLabelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingPdfLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingPdfLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingZplLabelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingZplLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingZplLabelsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">getExistingZplLabelsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingZplLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">googleMapSearchstringRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GoogleMapSearchstringRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">googleMapSearchstringResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GoogleMapSearchstringResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">labelProducts>labelProduct");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelProductsLabelProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOpenBatchesRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ListOpenBatchesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOpenBatchesResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ListOpenBatchesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOrdersRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ListOrdersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listOrdersResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ListOrdersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listStoresRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ListStoresRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">listStoresResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ListStoresResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">openBatchRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OpenBatchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">openBatchResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OpenBatchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderStatusContainerType>shippingLabels");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderStatusContainerTypeShippingLabelsShippingLabel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>orderStatusContainerType>shippingLabels>shippingLabel");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingLabel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">orderStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersToShipRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrdersToShipRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersToShipResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrdersToShipResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">ordersType>order");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrdersTypeOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestOptionsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestOptionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestOptionsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestOptionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">pickupRequestStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">products");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ProductsProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">>products>product");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "product");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">proofOfDeliveryRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ProofOfDeliveryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">proofOfDeliveryResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ProofOfDeliveryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">rateRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.RateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">rateResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.RateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsType>servicePoint");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointsTypeServicePoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingAddress");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingMethod");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingOptionRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingOptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">shippingOptionResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingOptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">source>country");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">source>postCode");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">triggerCarrierRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.TriggerCarrierRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">triggerCarrierRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.TriggerCarrierRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">updateOrderRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.UpdateOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">validateOrderRequest");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ValidateOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalDocumentContainerType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AdditionalDocumentContainerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "additionalDocumentType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AdditionalDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "addressType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "baseCheckoutRequestType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BaseCheckoutRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "baseWebshopElement");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BaseWebshopElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batchStatusLabelType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BatchStatusLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batchStatusOrderType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BatchStatusLabelType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batchStatusLabelType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "label");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batchStatusType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BatchStatusLabelType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "batchStatusOrderType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "order");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "businessHoursType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.BusinessHoursType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatusHistoryType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CarrierStatusHistoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "carrierStatusType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CarrierStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeProducts");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeProductsProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">changeProducts>product");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "product");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeProductsModeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeProductsModeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeSenderAddress");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeSenderAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeShippingAddress");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeShippingAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeShippingMethod");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeShippingMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoreDetailsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeStoreDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoresRequestType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeStoresRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "changeStoresResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ChangeStoresResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "coordinatesType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.CoordinatesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "countriesType");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "country");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "currencyCode");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dateRangeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DateRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dayOfWeekRangeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DayOfWeekRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dayType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deleteStoreType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeleteStoreType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDateOptionType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryDateOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesBySourceType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryDatesBySourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryDatesType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryDatesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimateDestination");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryEstimateDestination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryEstimateType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryEstimateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "deliveryTypeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DeliveryTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dimensionsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DimensionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "directionType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DirectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "disambiguationCandidateType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DisambiguationCandidateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "documentType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "dutiesPaymentType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.DutiesPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ErrorType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "errorType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "existingLabelType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ExistingLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateAdditionalDocumentType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateAdditionalDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateReturnLabelsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateReturnLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "generateReturnLabelType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GenerateReturnLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingLabelsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "getExistingLabelType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.GetExistingLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelFormatType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelMetaDataType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelMetaDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelProducts");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelProductsLabelProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">labelProducts>labelProduct");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelProductsModeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelProductsModeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelStatusType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "labelType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.LabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nonNegativeDecimal");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "nonNegativeIntegerRangeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.NonNegativeIntegerRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "openOrClosedTimeRangeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OpenOrClosedTimeRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderSaveResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderSaveResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusContainerType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderStatusContainerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderStatusType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "ordersType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrdersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderToShipType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderToShipType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "orderType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.OrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "packagingTypeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PackagingTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcelRequestType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ParcelRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcelResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ParcelResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcelsRequestType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ParcelRequestType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcelRequestType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcelsResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ParcelResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcelResponseType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "parcel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "partOfDayType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PartOfDayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestOptionType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestParcelType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestParcelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestQueryType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusEntryType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestStatusEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusHistoryType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestStatusEntryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusEntryType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "statusEntry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "pickupRequestStatusType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PickupRequestStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "printerType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.PrinterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "productType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "proofOfDeliveryDocumentType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ProofOfDeliveryDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnContractType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ReturnContractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnContractTypeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ReturnContractTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnLabelsOrderType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ReturnLabelsOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "returnLabelType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ReturnLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "senderAddress");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.SenderAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointDetailsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointExtraDetails");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointExtraDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointExtraDetailsStatus");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointExtraDetailsStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointsTypeServicePoint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", ">servicePointsType>servicePoint");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePoint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "servicePointType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ServicePointType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipmentRequestType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShipmentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipmentResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShipmentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipmentsRequestType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShipmentRequestType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipmentRequestType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipmentsResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShipmentResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipmentResponseType");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotificationType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShipperNotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shipperNotificationTypeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShipperNotificationTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingOptionDetailsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingOptionDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "shippingPaymentType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ShippingPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.Source.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "sources");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.Source[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "source");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "storeDetailsType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.StoreDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "String1024");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "String255");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "String64");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "stringRangeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.StringRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "timeRangeType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.TimeRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "triggerBarcodeRequestType");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "barcode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "triggerBarcodeResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.TriggerBarcodeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "triggerResponseStatus");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.TriggerResponseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.paazl.com/schemas/matrix", "validateOrderResponseType");
            cachedSerQNames.add(qName);
            cls = com.paazl.soap.generated.ValidateOrderResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.paazl.soap.generated.OrderSaveResponseType changeOrder(com.paazl.soap.generated.ChangeOrderRequest changeOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {changeOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OrderSaveResponseType) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OrderSaveResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OrderSaveResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.OrderDetailsResponse orderDetails(com.paazl.soap.generated.OrderDetailsRequest orderDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "orderDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {orderDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OrderDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OrderDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OrderDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GoogleMapSearchstringResponse googleMapSearchstring(com.paazl.soap.generated.GoogleMapSearchstringRequest googleMapSearchstringRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "googleMapSearchstring"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {googleMapSearchstringRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GoogleMapSearchstringResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GoogleMapSearchstringResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GoogleMapSearchstringResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.OrderSaveResponseType order(com.paazl.soap.generated.OrderRequest orderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "order"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {orderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OrderSaveResponseType) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OrderSaveResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OrderSaveResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.DeliveryEstimateResponse deliveryEstimate(com.paazl.soap.generated.DeliveryEstimateRequest deliveryEstimateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deliveryEstimate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deliveryEstimateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.DeliveryEstimateResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.DeliveryEstimateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.DeliveryEstimateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.BatchStatusResponse batchStatus(com.paazl.soap.generated.BatchStatusRequest batchStatusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "batchStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {batchStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.BatchStatusResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.BatchStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.BatchStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GetExistingZplLabelResponse getExistingZplLabel(com.paazl.soap.generated.GetExistingZplLabelRequest getExistingZplLabelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getExistingZplLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getExistingZplLabelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GetExistingZplLabelResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GetExistingZplLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GetExistingZplLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateAdditionalImageDocumentResponse generateAdditionalImageDocument(com.paazl.soap.generated.GenerateAdditionalDocumentType generateAdditionalImageDocumentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateAdditionalImageDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateAdditionalImageDocumentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateAdditionalImageDocumentResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateAdditionalImageDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateAdditionalImageDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GeneratePdfLabelsResponse generatePdfLabels(com.paazl.soap.generated.GeneratePdfLabelsRequest generatePdfLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generatePdfLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generatePdfLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GeneratePdfLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GeneratePdfLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GeneratePdfLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.OrderSaveResponseType commitOrder(com.paazl.soap.generated.CommitOrderRequest commitOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commitOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {commitOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OrderSaveResponseType) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OrderSaveResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OrderSaveResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GeneratePdfCustomsDocumentsResponse generatePdfCustomsDocuments(com.paazl.soap.generated.GeneratePdfCustomsDocumentsRequest generatePdfCustomsDocumentsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generatePdfCustomsDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generatePdfCustomsDocumentsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GeneratePdfCustomsDocumentsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GeneratePdfCustomsDocumentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GeneratePdfCustomsDocumentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateZplLabelsResponse generateZplLabels(com.paazl.soap.generated.GenerateZplLabelsRequest generateZplLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateZplLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateZplLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateZplLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateZplLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateZplLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GetExistingPdfLabelResponse getExistingPdfLabel(com.paazl.soap.generated.GetExistingPdfLabelRequest getExistingPdfLabelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getExistingPdfLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getExistingPdfLabelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GetExistingPdfLabelResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GetExistingPdfLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GetExistingPdfLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ActiveShippingOptionResponse activeShippingOption(com.paazl.soap.generated.ActiveShippingOptionRequest activeShippingOptionRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activeShippingOption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {activeShippingOptionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ActiveShippingOptionResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ActiveShippingOptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ActiveShippingOptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.CancelShipmentsResponse cancelShipments(com.paazl.soap.generated.CancelShipmentsRequest cancelShipmentsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelShipments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {cancelShipmentsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.CancelShipmentsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.CancelShipmentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.CancelShipmentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.AddressResponse address(com.paazl.soap.generated.AddressRequest addressRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "address"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addressRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.AddressResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.AddressResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.AddressResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateExtraPdfReturnLabelResponse generateExtraPdfReturnLabel(com.paazl.soap.generated.GenerateExtraPdfReturnLabelRequest generateExtraPdfReturnLabelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateExtraPdfReturnLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateExtraPdfReturnLabelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateExtraPdfReturnLabelResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateExtraPdfReturnLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateExtraPdfReturnLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GetExistingPdfLabelsResponse getExistingPdfLabels(com.paazl.soap.generated.GetExistingPdfLabelsRequest getExistingPdfLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getExistingPdfLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getExistingPdfLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GetExistingPdfLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GetExistingPdfLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GetExistingPdfLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.CreatePickupRequestResponse createPickupRequest(com.paazl.soap.generated.CreatePickupRequestRequest createPickupRequestRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createPickupRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {createPickupRequestRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.CreatePickupRequestResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.CreatePickupRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.CreatePickupRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateImageReturnLabelsResponse generateImageReturnLabels(com.paazl.soap.generated.GenerateReturnLabelsType generateImageReturnLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateImageReturnLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateImageReturnLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateImageReturnLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateImageReturnLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateImageReturnLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateImageLabelsResponse generateImageLabels(com.paazl.soap.generated.GenerateImageLabelsRequest generateImageLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateImageLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateImageLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateImageLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateImageLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateImageLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateExtraImageLabelResponse generateExtraImageLabel(com.paazl.soap.generated.GenerateExtraImageLabelRequest generateExtraImageLabelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateExtraImageLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateExtraImageLabelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateExtraImageLabelResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateExtraImageLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateExtraImageLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ProofOfDeliveryResponse proofOfDelivery(com.paazl.soap.generated.ProofOfDeliveryRequest proofOfDeliveryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "proofOfDelivery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {proofOfDeliveryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ProofOfDeliveryResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ProofOfDeliveryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ProofOfDeliveryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ServicePointsResponse servicePoints(com.paazl.soap.generated.ServicePointsRequest servicePointsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "servicePoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {servicePointsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ServicePointsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ServicePointsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ServicePointsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateExtraPdfLabelResponse generateExtraPdfLabel(com.paazl.soap.generated.GenerateExtraPdfLabelRequest generateExtraPdfLabelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateExtraPdfLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateExtraPdfLabelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateExtraPdfLabelResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateExtraPdfLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateExtraPdfLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ListOrdersResponse listOrders(com.paazl.soap.generated.ListOrdersRequest listOrdersRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {listOrdersRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ListOrdersResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ListOrdersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ListOrdersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GetExistingImageLabelResponse getExistingImageLabel(com.paazl.soap.generated.GetExistingLabelType getExistingImageLabelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getExistingImageLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getExistingImageLabelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GetExistingImageLabelResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GetExistingImageLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GetExistingImageLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateAdditionalPdfDocumentResponse generateAdditionalPdfDocument(com.paazl.soap.generated.GenerateAdditionalPdfDocumentRequest generateAdditionalPdfDocumentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateAdditionalPdfDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateAdditionalPdfDocumentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateAdditionalPdfDocumentResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateAdditionalPdfDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateAdditionalPdfDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.PickupRequestDetailsResponse pickupRequestDetails(com.paazl.soap.generated.PickupRequestQueryType pickupRequestDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pickupRequestDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {pickupRequestDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.PickupRequestDetailsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.PickupRequestDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.PickupRequestDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ChangeStoresResponseType createStores(com.paazl.soap.generated.ChangeStoresRequestType createStoresRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createStores"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {createStoresRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ChangeStoresResponseType) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ChangeStoresResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ChangeStoresResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ListOpenBatchesResponse listOpenBatches(com.paazl.soap.generated.ListOpenBatchesRequest listOpenBatchesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listOpenBatches"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {listOpenBatchesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ListOpenBatchesResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ListOpenBatchesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ListOpenBatchesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ListStoresResponse listStores(com.paazl.soap.generated.ListStoresRequest listStoresRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listStores"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {listStoresRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ListStoresResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ListStoresResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ListStoresResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.OrdersToShipResponse ordersToShip(com.paazl.soap.generated.OrdersToShipRequest ordersToShipRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ordersToShip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {ordersToShipRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OrdersToShipResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OrdersToShipResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OrdersToShipResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.CloseBatchResponse closeBatch(com.paazl.soap.generated.CloseBatchRequest closeBatchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "closeBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {closeBatchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.CloseBatchResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.CloseBatchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.CloseBatchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.OpenBatchResponse openBatch(com.paazl.soap.generated.OpenBatchRequest openBatchRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "openBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {openBatchRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OpenBatchResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OpenBatchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OpenBatchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.CheckoutStatusResponse checkoutStatus(com.paazl.soap.generated.BaseCheckoutRequestType checkoutStatusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkoutStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {checkoutStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.CheckoutStatusResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.CheckoutStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.CheckoutStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.PickupRequestStatusResponse pickupRequestStatus(com.paazl.soap.generated.PickupRequestQueryType pickupRequestStatusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pickupRequestStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {pickupRequestStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.PickupRequestStatusResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.PickupRequestStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.PickupRequestStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.CancelPickupRequestResponse cancelPickupRequest(com.paazl.soap.generated.PickupRequestQueryType cancelPickupRequestRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelPickupRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {cancelPickupRequestRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.CancelPickupRequestResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.CancelPickupRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.CancelPickupRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.DeleteStoresResponse deleteStores(com.paazl.soap.generated.DeleteStoresRequest deleteStoresRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteStores"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deleteStoresRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.DeleteStoresResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.DeleteStoresResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.DeleteStoresResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ShippingOptionResponse shippingOption(com.paazl.soap.generated.ShippingOptionRequest shippingOptionRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "shippingOption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {shippingOptionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ShippingOptionResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ShippingOptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ShippingOptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateLabelsResponse generateLabels(com.paazl.soap.generated.GenerateLabelsRequest generateLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.OrderSaveResponseType updateOrder(com.paazl.soap.generated.UpdateOrderRequest updateOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OrderSaveResponseType) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OrderSaveResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OrderSaveResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateExtraImageReturnLabelResponse generateExtraImageReturnLabel(com.paazl.soap.generated.GenerateReturnLabelType generateExtraImageReturnLabelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateExtraImageReturnLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateExtraImageReturnLabelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateExtraImageReturnLabelResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateExtraImageReturnLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateExtraImageReturnLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ValidateOrderResponseType validateOrder(com.paazl.soap.generated.ValidateOrderRequest validateOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {validateOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ValidateOrderResponseType) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ValidateOrderResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ValidateOrderResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GenerateShippingManifestResponse generateShippingManifest(com.paazl.soap.generated.GenerateShippingManifestRequest generateShippingManifestRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateShippingManifest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generateShippingManifestRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GenerateShippingManifestResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GenerateShippingManifestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GenerateShippingManifestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.PickupRequestOptionsResponse pickupRequestOptions(com.paazl.soap.generated.PickupRequestOptionsRequest pickupRequestOptionsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pickupRequestOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {pickupRequestOptionsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.PickupRequestOptionsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.PickupRequestOptionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.PickupRequestOptionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GetExistingImageLabelsResponse getExistingImageLabels(com.paazl.soap.generated.GetExistingLabelsType getExistingImageLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getExistingImageLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getExistingImageLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GetExistingImageLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GetExistingImageLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GetExistingImageLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.AddExistingShipmentResponse addExistingShipment(com.paazl.soap.generated.AddExistingShipmentRequest addExistingShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addExistingShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addExistingShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.AddExistingShipmentResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.AddExistingShipmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.AddExistingShipmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.OrderStatusResponse orderStatus(com.paazl.soap.generated.OrderStatusRequest orderStatusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "orderStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {orderStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.OrderStatusResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.OrderStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.OrderStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GetExistingZplLabelsResponse getExistingZplLabels(com.paazl.soap.generated.GetExistingZplLabelsRequest getExistingZplLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getExistingZplLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getExistingZplLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GetExistingZplLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GetExistingZplLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GetExistingZplLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.TriggerCarrierRegistrationResponse triggerCarrierRegistration(com.paazl.soap.generated.TriggerCarrierRegistrationRequest triggerCarrierRegistrationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "triggerCarrierRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {triggerCarrierRegistrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.TriggerCarrierRegistrationResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.TriggerCarrierRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.TriggerCarrierRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.RateResponse rate(com.paazl.soap.generated.RateRequest rateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {rateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.RateResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.RateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.RateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.GeneratePdfReturnLabelsResponse generatePdfReturnLabels(com.paazl.soap.generated.GeneratePdfReturnLabelsRequest generatePdfReturnLabelsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generatePdfReturnLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {generatePdfReturnLabelsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.GeneratePdfReturnLabelsResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.GeneratePdfReturnLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.GeneratePdfReturnLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.CheckoutResponse checkout(com.paazl.soap.generated.BaseCheckoutRequestType checkoutRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {checkoutRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.CheckoutResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.CheckoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.CheckoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.ChangeStoresResponseType updateStores(com.paazl.soap.generated.ChangeStoresRequestType updateStoresRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateStores"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {updateStoresRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.ChangeStoresResponseType) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.ChangeStoresResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.ChangeStoresResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.paazl.soap.generated.DeleteOrderResponse deleteOrder(com.paazl.soap.generated.DeleteOrderRequest deleteOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deleteOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.paazl.soap.generated.DeleteOrderResponse) _resp;
            } catch (Exception _exception) {
                return (com.paazl.soap.generated.DeleteOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.paazl.soap.generated.DeleteOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
