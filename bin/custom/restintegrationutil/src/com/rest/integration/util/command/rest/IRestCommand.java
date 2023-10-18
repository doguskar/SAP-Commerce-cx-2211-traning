package com.rest.integration.util.command.rest;

import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.exception.RestCommandException;
import de.hybris.platform.core.model.ItemModel;
import org.apache.http.HttpResponse;
import org.springframework.http.HttpMethod;

public interface IRestCommand<REQUEST extends IRequest, RESPONSE> {

    RESPONSE perform(REQUEST request) throws RestCommandException;

    REQUEST createRequest();

    Class getResponseClass();

    RESPONSE processResponse(HttpResponse response, String responseBody) throws RestCommandException;

    String getUri() throws RestCommandException;

    String getBaseUrl() throws RestCommandException;

    String getPath() throws RestCommandException;

    HttpMethod getMethod();

    Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand();

    ItemModel getSaveRequestLogCommandItem(REQUEST request);

    boolean isPersistent(REQUEST request);
}