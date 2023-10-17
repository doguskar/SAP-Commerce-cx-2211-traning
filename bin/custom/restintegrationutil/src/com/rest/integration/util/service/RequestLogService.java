package com.rest.integration.util.service;


import com.rest.integration.util.model.RequestLogModel;

public interface RequestLogService {
    RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, String method, boolean isPersistent);
    RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, Integer statusCode, String method, boolean isPersistent);
    RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, Integer statusCode, String method, Exception exception, boolean isPersistent);
    RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, String method, Boolean isSuccess, Exception exception, boolean isPersistent);
}
