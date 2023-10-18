package com.paazl.command;

import com.paazl.command.request.PutOrderRequest;
import com.paazl.command.response.PutOrderResponse;
import com.rest.integration.util.command.rest.IRestCommand;

public interface PutOrderCommand extends IRestCommand<PutOrderRequest, PutOrderResponse> {
}
