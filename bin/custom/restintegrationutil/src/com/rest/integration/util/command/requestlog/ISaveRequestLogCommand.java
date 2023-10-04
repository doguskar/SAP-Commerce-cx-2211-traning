package com.rest.integration.util.command.requestlog;

import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import de.hybris.platform.core.model.ItemModel;

public interface ISaveRequestLogCommand<O extends ItemModel> {
    void execute(IRequest request, IResponse response, O obj);
}
