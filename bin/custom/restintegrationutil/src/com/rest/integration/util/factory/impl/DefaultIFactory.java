package com.rest.integration.util.factory.impl;

import com.rest.integration.util.factory.IFactory;
import com.rest.integration.util.exception.NotSupportedException;

import java.util.Map;

public class DefaultIFactory<T> implements IFactory<T> {
    private Map<Class<T>, T> map;
    private String key;

    @Override
    public T create(Class<? extends T> tClass) throws NotSupportedException {
        T obj = this.map.get(tClass);
        if (obj == null) {
            throw new NotSupportedException("not implemented: " + tClass.getClass());
        } else {
            return obj;
        }
    }

    public void setMap(Map<Class<T>, T> map) {
        this.map = map;
    }

    @Override
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
