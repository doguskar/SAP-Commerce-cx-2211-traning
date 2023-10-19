package com.paazl.command;

import com.paazl.command.request.PostOrderRequest;
import com.paazl.command.response.PostOrderResponse;

public interface PostOrderCommand extends PaazlRestCommand<PostOrderRequest, PostOrderResponse> {
}
