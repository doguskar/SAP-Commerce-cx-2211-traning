package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.channeladvisor.data.OrderData;
import de.hybris.platform.core.model.ItemModel;

import java.util.Map;

/**
 * Updatable order properties
 * https://knowledge.channeladvisor.com/kc?id=kb_article_view&sysparm_article=KB0018091
 */
public class PatchOrderRequest extends OrderData implements ChannelAdvisorIRequest {
    @JsonIgnore
    private Map<String, String> pathVariables;
    @JsonIgnore
    private ItemModel saveRequestLogCommandItem;
    @JsonIgnore
    private String accessToken;

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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getApplicationId() {
        return null;
    }

    public void setApplicationId(String applicationId) {
    }

    public String getSharedSecret() {
        return null;
    }

    public void setSharedSecret(String sharedSecret) {
    }
}
