package com.channeladvisor.service;

import com.channeladvisor.model.DeliveryStatusMappingModel;

public interface DeliveryStatusMappingService {
    DeliveryStatusMappingModel findByCode(String code);
}
