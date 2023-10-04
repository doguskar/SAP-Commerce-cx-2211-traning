package com.rest.integration.util.command.requestlog.impl;

import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;
import java.util.Objects;

public abstract class AbstractSaveRequestLogCommand<O extends ItemModel> implements ISaveRequestLogCommand<O> {
    @Resource
    private ModelService modelService;

    public RequestLogModel getRequestLog(IRequest request, IResponse response) {
        return Objects.nonNull(response) ? response.getRequestLog() : request.getRequestLog();
    }

    public ModelService getModelService() {
        return modelService;
    }
}
