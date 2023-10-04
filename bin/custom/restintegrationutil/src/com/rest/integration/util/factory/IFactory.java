package com.rest.integration.util.factory;

import com.rest.integration.util.exception.NotSupportedException;

public interface IFactory<T> {
    T create(Class<? extends T> tClass) throws NotSupportedException;

    String getKey();
}
