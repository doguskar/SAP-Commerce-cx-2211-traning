package com.rest.integration.util.command.requestlog;

import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.ItemModel;

public interface ISaveRequestLogCommand<O extends ItemModel> {
    void execute(RequestLogModel requestLog, O item);
}
