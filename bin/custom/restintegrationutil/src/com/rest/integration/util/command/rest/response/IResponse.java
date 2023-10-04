package com.rest.integration.util.command.rest.response;


import com.rest.integration.util.model.RequestLogModel;

public interface IResponse {
    RequestLogModel getRequestLog();
    void setRequestLog(RequestLogModel requestLog);
}
