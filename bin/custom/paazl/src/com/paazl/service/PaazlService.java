package com.paazl.service;

import com.paazl.command.response.*;
import com.paazl.model.PaazlConfigurationModel;
import com.paazl.soap.generated.AddExistingShipmentResponse;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.store.BaseStoreModel;

public interface PaazlService
{
	PostCheckoutTokenResponse requestCheckoutToken(final AbstractOrderModel order);
	PaazlConfigurationModel getPaazlConfiguration();
	PaazlConfigurationModel getPaazlConfiguration(BaseStoreModel baseStore);
	GetCheckoutResponse requestGetCheckout(final AbstractOrderModel order);
	PostCheckoutResponse requestPostCheckout(final GetCheckoutResponse getCheckoutResponse);
	boolean saveCheckout(CartModel cart);
	PostOrderResponse requestPostOrder(OrderModel order);
	boolean checkOrder(OrderModel order);
	PutOrderResponse requestPutOrder(OrderModel order);
	PostOrderShipmentsResponse requestPostOrderShipments(OrderModel order);
	AddExistingShipmentResponse requestAddExistingShipment(OrderModel order);
	GetCheckoutResponse getGetCheckoutResponse(AbstractOrderModel order);
	boolean setDeliveryCost(CartModel cart);
	boolean afterPlaceOrder(AbstractOrderModel order);
}
