package com.paazl.facede;

import com.paazl.data.PaazlCheckoutInitializationData;
import org.springframework.ui.Model;

public interface PaazlFacade {
    PaazlCheckoutInitializationData getPaazlCheckoutInitializationData();
    void configureDeliveryStep(final Model model);
    boolean saveCheckout();
    boolean setDeliveryCost();
}
