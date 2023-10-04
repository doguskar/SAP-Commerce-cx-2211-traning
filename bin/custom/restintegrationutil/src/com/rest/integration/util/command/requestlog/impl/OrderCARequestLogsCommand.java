package com.rest.integration.util.command.requestlog.impl;

import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.order.OrderModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderCARequestLogsCommand extends AbstractSaveRequestLogCommand<OrderModel> {
    @Override
    public void execute(IRequest request, IResponse response, OrderModel order) {
        final RequestLogModel requestLog = getRequestLog(request, response);
        if (Objects.nonNull(requestLog)) {
            List<RequestLogModel> requestLogs = new ArrayList<>();
            requestLogs.add(0, requestLog);
            //order.setCaOrderRequestLogs(requestLogs);
            //getModelService().saveAll(requestLog, order);
        }
    }
}
