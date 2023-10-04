package com.rest.integration.util.command.rest.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rest.integration.util.model.RequestLogModel;

import java.util.Map;

public abstract class AbstractRequest implements IRequest {
    @JsonIgnore
    private RequestLogModel requestLog;
    @JsonIgnore
    private Map<String, String> pathVariables;

    public RequestLogModel getRequestLog() {
        return requestLog;
    }

    public void setRequestLog(RequestLogModel requestLog) {
        this.requestLog = requestLog;
    }

    public Map<String, String> getPathVariables() {
        return pathVariables;
    }

    public void setPathVariables(Map<String, String> pathVariables) {
        this.pathVariables = pathVariables;
    }

}
