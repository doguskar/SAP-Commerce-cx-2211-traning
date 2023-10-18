package com.paazl.command;

import com.paazl.command.request.GetCheckoutRequest;
import com.paazl.command.response.GetCheckoutResponse;
import com.rest.integration.util.command.rest.IRestCommand;

public interface GetCheckoutCommand extends IRestCommand<GetCheckoutRequest, GetCheckoutResponse> {
}
