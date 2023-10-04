package com.rest.integration.util.service.impl;

import com.rest.integration.util.model.RequestLogModel;
import com.rest.integration.util.service.RequestLogService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.util.Utilities;

import javax.annotation.Resource;
import javax.ws.rs.core.Response;
import java.util.Objects;
import java.util.UUID;

public class DefaultRequestLogService implements RequestLogService {

    @Resource
    private ModelService modelService;

    @Override
    public RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, String method) {
        final RequestLogModel requestLog = modelService.create(RequestLogModel.class);
        requestLog.setCode(UUID.randomUUID().toString());
        requestLog.setRequestBody(requestBody);
        requestLog.setUri(uri);
        requestLog.setResponseBody(responseBody);
        requestLog.setMethod(method);
        return requestLog;
    }

    @Override
    public RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, Integer statusCode, String method) {
        final RequestLogModel requestLog = createRequestLog(requestBody, uri, responseBody, method);
        if (Objects.nonNull(statusCode)) {
            requestLog.setStatusCode(statusCode);
            Response.Status status = Response.Status.fromStatusCode(statusCode);
            requestLog.setIsSuccess(Objects.nonNull(status) && Response.Status.Family.SUCCESSFUL.equals(status.getFamily()));
        }
        return requestLog;
    }

    @Override
    public RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, Integer statusCode, String method, Exception exception) {
        final RequestLogModel requestLog = createRequestLog(requestBody, uri, responseBody, statusCode, method);
        if (Objects.nonNull(exception)) {
            requestLog.setErrorStackTrace(Utilities.getStackTraceAsString(exception));
        }
        return requestLog;
    }

    @Override
    public RequestLogModel createRequestLog(String requestBody, String uri, String responseBody, String method, Boolean isSuccess, Exception exception) {
        RequestLogModel requestLog = createRequestLog(requestBody, uri, responseBody, method);
        requestLog.setIsSuccess(isSuccess);
        if (Objects.nonNull(exception)) {
            requestLog.setErrorStackTrace(Utilities.getStackTraceAsString(exception));
        }
        return requestLog;
    }
}
