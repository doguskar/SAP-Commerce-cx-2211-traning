package com.channeladvisor.rest.command.impl;

import com.channeladvisor.rest.command.PostCreateOrderCommand;
import com.channeladvisor.rest.command.request.PostCreateOrderRequest;
import com.channeladvisor.rest.command.response.PostCreateOrderResponse;
import com.channeladvisor.rest.requestlogs.command.impl.OrderCARequestLogsCommand;
import com.rest.integration.util.command.requestlog.ISaveRequestLogCommand;
import com.rest.integration.util.exception.RestCommandException;
import org.springframework.http.HttpMethod;

public class DefaultPostCreateOrderCommand extends AbstractChanneladvisorRestCommand<PostCreateOrderRequest, PostCreateOrderResponse> implements PostCreateOrderCommand {
    @Override
    public PostCreateOrderRequest createRequest() {
        return new PostCreateOrderRequest();
    }

    @Override
    public Class<PostCreateOrderResponse> getResponseClass() {
        return PostCreateOrderResponse.class;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }

    @Override
    public String getPath() throws RestCommandException {
        return getConfigurationModel().getCreateOrderPath();
    }

    @Override
    public boolean isCreateRequestLogActive(PostCreateOrderRequest request, boolean isFailed) {
        return true;
    }

    @Override
    public boolean isPersistent(PostCreateOrderRequest request) {
        return true;
    }

    @Override
    public Class<? extends ISaveRequestLogCommand> getSaveRequestLogCommand() {
        return OrderCARequestLogsCommand.class;
    }
}
