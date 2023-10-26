package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.requestlogs.command.impl.IntegrationJobRequestLogListCommand;
import com.channeladvisor.rest.command.PostProductExportCommand;
import com.channeladvisor.rest.command.request.PostProductExportRequest;
import com.channeladvisor.rest.command.response.PostProductExportResponse;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class DefaultPostProductExportCommand extends AbstractChanneladvisorRestCommand<PostProductExportRequest, PostProductExportResponse> implements PostProductExportCommand {
    @Override
    public PostProductExportRequest createRequest() {
        return new PostProductExportRequest();
    }

    @Override
    public Class<PostProductExportResponse> getResponseClass() {
        return PostProductExportResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getProductExportPath();
    }

    @Override
    public void addBody(HttpRequestBase baseRequest, PostProductExportRequest request) {
        if (StringUtils.isNotBlank(request.getTextBody())) {
            HttpEntity entity = new ByteArrayEntity(request.getTextBody().getBytes(StandardCharsets.UTF_8));
            ((HttpPost) baseRequest).setEntity(entity);
        }
    }

    @Override
    public void addQueryString(HttpRequestBase baseRequest, PostProductExportRequest request) throws URISyntaxException {
        addQueryStringToUri(baseRequest, request);
    }

    @Override
    public String getContentType() {
        return MediaType.TEXT_PLAIN_VALUE;
    }

    @Override
    public boolean isCreateRequestLogActive(PostProductExportRequest request, boolean isFailed) {
        return true;
    }

    @Override
    public boolean isPersistent(PostProductExportRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return IntegrationJobRequestLogListCommand.class;
    }
}
