package com.paazl.command;

import com.paazl.command.request.PostCheckoutTokenRequest;
import com.paazl.command.response.PostCheckoutTokenResponse;
import com.rest.integration.util.command.rest.IRestCommand;

public interface PostCheckoutTokenCommand extends IRestCommand<PostCheckoutTokenRequest, PostCheckoutTokenResponse> {
}
