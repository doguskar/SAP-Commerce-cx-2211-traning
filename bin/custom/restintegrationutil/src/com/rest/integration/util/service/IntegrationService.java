package com.rest.integration.util.service;

import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.command.rest.IRestCommand;
import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import de.hybris.platform.core.model.ItemModel;

public interface IntegrationService {
    IResponse request(IRequest request, Class<? extends IRestCommand> commandClass, Class<? extends ISaveRequestLogCommand> saveRequestLogCommandClass, ItemModel itemModel);
    IResponse request(IRequest request, Class commandClass);
}
