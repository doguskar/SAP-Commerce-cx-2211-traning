package com.paazl.command;

import com.paazl.command.request.PostOrderRequest;
import com.paazl.command.response.PostOrderResponse;
import com.rest.integration.util.command.rest.IRestCommand;

public interface PostOrderCommand extends IRestCommand<PostOrderRequest, PostOrderResponse> {
}
