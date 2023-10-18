package com.paazl.command;

import com.paazl.command.request.PostOrderShipmentsRequest;
import com.paazl.command.response.PostOrderShipmentsResponse;
import com.rest.integration.util.command.rest.IRestCommand;

public interface PostOrderShipmentsCommand extends IRestCommand<PostOrderShipmentsRequest, PostOrderShipmentsResponse> {
}
