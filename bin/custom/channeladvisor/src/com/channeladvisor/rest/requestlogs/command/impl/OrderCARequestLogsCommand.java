package com.channeladvisor.rest.requestlogs.command.impl;

import com.rest.integration.util.command.requestlog.impl.AbstractSaveRequestLogCommand;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.order.OrderModel;

import java.util.ArrayList;
import java.util.List;

public class OrderCARequestLogsCommand extends AbstractSaveRequestLogCommand<OrderModel> {

    @Override
    public void execute(RequestLogModel requestLog, OrderModel order) {
        List<RequestLogModel> requestLogs = new ArrayList<>(order.getCaOrderRequestLogs());
        requestLogs.add(0, requestLog);
        order.setCaOrderRequestLogs(requestLogs);
        getModelService().saveAll(requestLog, order);
    }
}
