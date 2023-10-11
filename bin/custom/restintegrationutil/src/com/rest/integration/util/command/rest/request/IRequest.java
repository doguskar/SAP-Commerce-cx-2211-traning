package com.rest.integration.util.command.rest.request;

import java.util.Map;

public interface IRequest {

    Map<String, String> getPathVariables();

    void setPathVariables(Map<String, String> pathVariables);

}
