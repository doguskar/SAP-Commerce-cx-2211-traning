package com.paazl.command;

import com.paazl.command.request.PostCheckoutRequest;
import com.paazl.command.response.PostCheckoutResponse;
import com.rest.integration.util.command.rest.IRestCommand;

public interface PostCheckoutCommand extends IRestCommand<PostCheckoutRequest, PostCheckoutResponse> {
}
