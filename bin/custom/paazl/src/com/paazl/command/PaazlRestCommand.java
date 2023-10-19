package com.paazl.command;

import com.rest.integration.util.command.rest.IRestCommand;
import com.rest.integration.util.command.rest.request.IRequest;
import de.hybris.platform.store.BaseStoreModel;

public interface PaazlRestCommand<REQUEST extends IRequest, RESPONSE> extends IRestCommand<REQUEST, RESPONSE> {
    BaseStoreModel getBaseStore();

    void setBaseStore(BaseStoreModel baseStore);
}
