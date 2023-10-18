package com.rest.integration.util.command.rest.request;

import de.hybris.platform.core.model.ItemModel;

import java.util.Map;

public interface IRequest {

    Map<String, String> getPathVariables();

    void setPathVariables(Map<String, String> pathVariables);

    ItemModel getSaveRequestLogCommandItem();

    void setSaveRequestLogCommandItem(ItemModel item);

}
