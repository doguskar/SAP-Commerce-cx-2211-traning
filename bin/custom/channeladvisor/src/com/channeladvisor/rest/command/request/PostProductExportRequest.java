package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostProductExportRequest extends AbstractChanneladvisorRequest {
    @JsonProperty("profileid")
    private Integer profileId;
    @JsonProperty("$filter")
    private String filter;
    @JsonIgnore
    private String textBody;

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }
}
