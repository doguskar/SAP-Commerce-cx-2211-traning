package com.rest.integration.util.command.requestlog.impl;

import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.ItemModel;

import java.util.Objects;

public class DefaultSaveRequestLogCommand extends AbstractSaveRequestLogCommand<ItemModel> {
    @Override
    public void execute(RequestLogModel requestLog, ItemModel item) {
        if (Objects.nonNull(requestLog)) {
            getModelService().save(requestLog);
        }
    }
}
