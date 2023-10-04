package com.rest.integration.util.command.rest.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rest.integration.util.model.RequestLogModel;

public abstract class AbstractResponse implements IResponse {
    @JsonIgnore
    private RequestLogModel requestLog;

    public RequestLogModel getRequestLog() {
        return requestLog;
    }

    public void setRequestLog(RequestLogModel requestLog) {
        this.requestLog = requestLog;
    }
}
