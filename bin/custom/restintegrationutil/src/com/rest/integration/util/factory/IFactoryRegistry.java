package com.rest.integration.util.factory;

import com.rest.integration.util.exception.NotSupportedException;

public interface IFactoryRegistry {
    IFactory getFactory(String key) throws NotSupportedException;
}
