package com.channeladvisor.service.impl;

import com.channeladvisor.model.DeliveryStatusMappingModel;
import com.channeladvisor.service.DeliveryStatusMappingService;
import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import org.apache.commons.collections4.CollectionUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultDeliveryStatusMappingService implements DeliveryStatusMappingService {
    @Resource
    private GenericDao<DeliveryStatusMappingModel> deliveryStatusMappingDao;

    @Override
    public DeliveryStatusMappingModel findByCode(String code) {
        final Map<String, Object> paramMap = new HashMap<>();
        paramMap.put(DeliveryStatusMappingModel.CODE, code);
        final List<DeliveryStatusMappingModel> resultList = deliveryStatusMappingDao.find(paramMap);
        return CollectionUtils.isNotEmpty(resultList) ? resultList.get(0) : null;
    }
}
