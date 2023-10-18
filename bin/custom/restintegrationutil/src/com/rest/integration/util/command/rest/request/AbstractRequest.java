package com.rest.integration.util.command.rest.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rest.integration.util.model.RequestLogModel;
import de.hybris.platform.core.model.ItemModel;

import java.util.Map;

public abstract class AbstractRequest implements IRequest {
    @JsonIgnore
    private Map<String, String> pathVariables;
    @JsonIgnore
    private ItemModel saveRequestLogCommandItem;

    public Map<String, String> getPathVariables() {
        return pathVariables;
    }

    public void setPathVariables(Map<String, String> pathVariables) {
        this.pathVariables = pathVariables;
    }

    @Override
    public ItemModel getSaveRequestLogCommandItem() {
        return saveRequestLogCommandItem;
    }

    public void setSaveRequestLogCommandItem(ItemModel saveRequestLogCommandItem) {
        this.saveRequestLogCommandItem = saveRequestLogCommandItem;
    }
}
