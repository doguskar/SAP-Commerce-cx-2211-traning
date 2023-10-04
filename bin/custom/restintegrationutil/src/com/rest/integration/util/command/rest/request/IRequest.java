package com.rest.integration.util.command.rest.request;


import com.rest.integration.util.model.RequestLogModel;

import java.util.Map;

public interface IRequest {
    RequestLogModel getRequestLog();
    void setRequestLog(RequestLogModel requestLog);
    Map<String, String> getPathVariables();
    void setPathVariables(Map<String, String> pathVariables);
}
