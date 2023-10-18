package com.paazl.command.requestlog.impl;

import com.rest.integration.util.command.requestlog.impl.AbstractSaveRequestLogCommand;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.order.OrderModel;

import java.util.ArrayList;
import java.util.List;

public class PaazlOrderRequestLogsSaveCommand extends AbstractSaveRequestLogCommand<OrderModel> {
    @Override
    public void execute(RequestLogModel requestLog, OrderModel order) {
        List<RequestLogModel> requestLogs = new ArrayList<>(order.getPaazlOrderRequestLogs());
        requestLogs.add(0, requestLog);
        order.setPaazlOrderRequestLogs(requestLogs);
        getModelService().saveAll(requestLog, order);
    }
}
