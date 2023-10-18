package com.paazl.command.requestlog.impl;

import com.rest.integration.util.command.requestlog.impl.AbstractSaveRequestLogCommand;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;

import java.util.Objects;

public class PaazlGetCheckoutRequestLogSaveCommand extends AbstractSaveRequestLogCommand<AbstractOrderModel> {
    @Override
    public void execute(RequestLogModel requestLog, AbstractOrderModel order) {
        final RequestLogModel oldRequestLog = order.getPaazlGetCheckoutRequestLog();
        order.setPaazlGetCheckoutRequestLog(requestLog);
        getModelService().saveAll(requestLog, order);
        if (Objects.nonNull(oldRequestLog)) {
            getModelService().remove(oldRequestLog);
        }
    }
}
