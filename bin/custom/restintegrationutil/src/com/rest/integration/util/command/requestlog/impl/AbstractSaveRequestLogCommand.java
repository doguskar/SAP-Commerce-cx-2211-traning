package com.rest.integration.util.command.requestlog.impl;

import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

public abstract class AbstractSaveRequestLogCommand<O extends ItemModel> implements ISaveRequestLogCommand<O> {
    @Resource
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }
}
