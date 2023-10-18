package com.paazl.command.requestlog.impl;

import com.rest.integration.util.command.requestlog.impl.AbstractSaveRequestLogCommand;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.order.OrderModel;

import java.util.ArrayList;
import java.util.List;

public class PaazlOrderShipmentsRequestLogsSaveCommand extends AbstractSaveRequestLogCommand<OrderModel> {
    @Override
    public void execute(RequestLogModel requestLog, OrderModel order) {
        List<RequestLogModel> requestLogs = new ArrayList<>(order.getPaazlOrderShipmentsRequestLogs());
        requestLogs.add(0, requestLog);
        order.setPaazlOrderShipmentsRequestLogs(requestLogs);
        getModelService().saveAll(requestLog, order);
    }
}
