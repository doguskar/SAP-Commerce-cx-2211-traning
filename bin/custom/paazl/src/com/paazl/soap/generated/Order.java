/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public interface Order extends java.rmi.Remote {
    public com.paazl.soap.generated.OrderSaveResponseType changeOrder(com.paazl.soap.generated.ChangeOrderRequest changeOrderRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.OrderDetailsResponse orderDetails(com.paazl.soap.generated.OrderDetailsRequest orderDetailsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GoogleMapSearchstringResponse googleMapSearchstring(com.paazl.soap.generated.GoogleMapSearchstringRequest googleMapSearchstringRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.OrderSaveResponseType order(com.paazl.soap.generated.OrderRequest orderRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.DeliveryEstimateResponse deliveryEstimate(com.paazl.soap.generated.DeliveryEstimateRequest deliveryEstimateRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.BatchStatusResponse batchStatus(com.paazl.soap.generated.BatchStatusRequest batchStatusRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GetExistingZplLabelResponse getExistingZplLabel(com.paazl.soap.generated.GetExistingZplLabelRequest getExistingZplLabelRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateAdditionalImageDocumentResponse generateAdditionalImageDocument(com.paazl.soap.generated.GenerateAdditionalDocumentType generateAdditionalImageDocumentRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GeneratePdfLabelsResponse generatePdfLabels(com.paazl.soap.generated.GeneratePdfLabelsRequest generatePdfLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.OrderSaveResponseType commitOrder(com.paazl.soap.generated.CommitOrderRequest commitOrderRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GeneratePdfCustomsDocumentsResponse generatePdfCustomsDocuments(com.paazl.soap.generated.GeneratePdfCustomsDocumentsRequest generatePdfCustomsDocumentsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateZplLabelsResponse generateZplLabels(com.paazl.soap.generated.GenerateZplLabelsRequest generateZplLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GetExistingPdfLabelResponse getExistingPdfLabel(com.paazl.soap.generated.GetExistingPdfLabelRequest getExistingPdfLabelRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ActiveShippingOptionResponse activeShippingOption(com.paazl.soap.generated.ActiveShippingOptionRequest activeShippingOptionRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.CancelShipmentsResponse cancelShipments(com.paazl.soap.generated.CancelShipmentsRequest cancelShipmentsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.AddressResponse address(com.paazl.soap.generated.AddressRequest addressRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateExtraPdfReturnLabelResponse generateExtraPdfReturnLabel(com.paazl.soap.generated.GenerateExtraPdfReturnLabelRequest generateExtraPdfReturnLabelRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GetExistingPdfLabelsResponse getExistingPdfLabels(com.paazl.soap.generated.GetExistingPdfLabelsRequest getExistingPdfLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.CreatePickupRequestResponse createPickupRequest(com.paazl.soap.generated.CreatePickupRequestRequest createPickupRequestRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateImageReturnLabelsResponse generateImageReturnLabels(com.paazl.soap.generated.GenerateReturnLabelsType generateImageReturnLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateImageLabelsResponse generateImageLabels(com.paazl.soap.generated.GenerateImageLabelsRequest generateImageLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateExtraImageLabelResponse generateExtraImageLabel(com.paazl.soap.generated.GenerateExtraImageLabelRequest generateExtraImageLabelRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ProofOfDeliveryResponse proofOfDelivery(com.paazl.soap.generated.ProofOfDeliveryRequest proofOfDeliveryRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ServicePointsResponse servicePoints(com.paazl.soap.generated.ServicePointsRequest servicePointsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateExtraPdfLabelResponse generateExtraPdfLabel(com.paazl.soap.generated.GenerateExtraPdfLabelRequest generateExtraPdfLabelRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ListOrdersResponse listOrders(com.paazl.soap.generated.ListOrdersRequest listOrdersRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GetExistingImageLabelResponse getExistingImageLabel(com.paazl.soap.generated.GetExistingLabelType getExistingImageLabelRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateAdditionalPdfDocumentResponse generateAdditionalPdfDocument(com.paazl.soap.generated.GenerateAdditionalPdfDocumentRequest generateAdditionalPdfDocumentRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.PickupRequestDetailsResponse pickupRequestDetails(com.paazl.soap.generated.PickupRequestQueryType pickupRequestDetailsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ChangeStoresResponseType createStores(com.paazl.soap.generated.ChangeStoresRequestType createStoresRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ListOpenBatchesResponse listOpenBatches(com.paazl.soap.generated.ListOpenBatchesRequest listOpenBatchesRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ListStoresResponse listStores(com.paazl.soap.generated.ListStoresRequest listStoresRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.OrdersToShipResponse ordersToShip(com.paazl.soap.generated.OrdersToShipRequest ordersToShipRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.CloseBatchResponse closeBatch(com.paazl.soap.generated.CloseBatchRequest closeBatchRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.OpenBatchResponse openBatch(com.paazl.soap.generated.OpenBatchRequest openBatchRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.CheckoutStatusResponse checkoutStatus(com.paazl.soap.generated.BaseCheckoutRequestType checkoutStatusRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.PickupRequestStatusResponse pickupRequestStatus(com.paazl.soap.generated.PickupRequestQueryType pickupRequestStatusRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.CancelPickupRequestResponse cancelPickupRequest(com.paazl.soap.generated.PickupRequestQueryType cancelPickupRequestRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.DeleteStoresResponse deleteStores(com.paazl.soap.generated.DeleteStoresRequest deleteStoresRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ShippingOptionResponse shippingOption(com.paazl.soap.generated.ShippingOptionRequest shippingOptionRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateLabelsResponse generateLabels(com.paazl.soap.generated.GenerateLabelsRequest generateLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.OrderSaveResponseType updateOrder(com.paazl.soap.generated.UpdateOrderRequest updateOrderRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateExtraImageReturnLabelResponse generateExtraImageReturnLabel(com.paazl.soap.generated.GenerateReturnLabelType generateExtraImageReturnLabelRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ValidateOrderResponseType validateOrder(com.paazl.soap.generated.ValidateOrderRequest validateOrderRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GenerateShippingManifestResponse generateShippingManifest(com.paazl.soap.generated.GenerateShippingManifestRequest generateShippingManifestRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.PickupRequestOptionsResponse pickupRequestOptions(com.paazl.soap.generated.PickupRequestOptionsRequest pickupRequestOptionsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GetExistingImageLabelsResponse getExistingImageLabels(com.paazl.soap.generated.GetExistingLabelsType getExistingImageLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.AddExistingShipmentResponse addExistingShipment(com.paazl.soap.generated.AddExistingShipmentRequest addExistingShipmentRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.OrderStatusResponse orderStatus(com.paazl.soap.generated.OrderStatusRequest orderStatusRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GetExistingZplLabelsResponse getExistingZplLabels(com.paazl.soap.generated.GetExistingZplLabelsRequest getExistingZplLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.TriggerCarrierRegistrationResponse triggerCarrierRegistration(com.paazl.soap.generated.TriggerCarrierRegistrationRequest triggerCarrierRegistrationRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.RateResponse rate(com.paazl.soap.generated.RateRequest rateRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.GeneratePdfReturnLabelsResponse generatePdfReturnLabels(com.paazl.soap.generated.GeneratePdfReturnLabelsRequest generatePdfReturnLabelsRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.CheckoutResponse checkout(com.paazl.soap.generated.BaseCheckoutRequestType checkoutRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.ChangeStoresResponseType updateStores(com.paazl.soap.generated.ChangeStoresRequestType updateStoresRequest) throws java.rmi.RemoteException;
    public com.paazl.soap.generated.DeleteOrderResponse deleteOrder(com.paazl.soap.generated.DeleteOrderRequest deleteOrderRequest) throws java.rmi.RemoteException;
}
