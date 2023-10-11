package com.rest.integration.util.command.rest.impl;

import com.rest.integration.util.command.rest.request.IRequest;

public abstract class AbstractMockRestCommand<REQUEST extends IRequest, RESPONSE> extends AbstractRestCommand<REQUEST, RESPONSE> {
    @Override
    public String getBaseUrl(){
        return "https://56b81610-890a-4f33-9b6c-01a4dc89277c.mock.pstmn.io";
    }
}
