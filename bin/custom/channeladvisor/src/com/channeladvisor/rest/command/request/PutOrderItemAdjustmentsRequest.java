package com.channeladvisor.rest.command.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutOrderItemAdjustmentsRequest extends AbstractChanneladvisorRequest {
    @JsonProperty("PublicNotes")
    private String publicNotes;

    public String getPublicNotes() {
        return publicNotes;
    }

    public void setPublicNotes(String publicNotes) {
        this.publicNotes = publicNotes;
    }
}
