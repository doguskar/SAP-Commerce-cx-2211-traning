package com.rest.integration.util.command.requestlog.impl;

import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.ItemModel;

import java.util.Objects;

public class DefaultSaveRequestLogCommand extends AbstractSaveRequestLogCommand<ItemModel> {
    @Override
    public void execute(IRequest request, IResponse response, ItemModel obj) {
        final RequestLogModel requestLog = getRequestLog(request, response);
        if (Objects.nonNull(requestLog)) {
            getModelService().save(requestLog);
        }
    }
}
