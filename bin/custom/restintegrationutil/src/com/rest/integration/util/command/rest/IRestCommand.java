package com.rest.integration.util.command.rest;

import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import com.rest.integration.util.exception.RestCommandException;
import org.apache.http.HttpResponse;
import org.springframework.http.HttpMethod;

public interface IRestCommand<REQUEST extends IRequest, RESPONSE extends IResponse> {

    RESPONSE perform(REQUEST request) throws RestCommandException;

    Class<RESPONSE> getResponseClass();

    RESPONSE processResponse(HttpResponse response, String responseBody) throws RestCommandException;

    String getUri() throws RestCommandException;

    String getBaseUrl();

    String getPath();

    HttpMethod getMethod();
}