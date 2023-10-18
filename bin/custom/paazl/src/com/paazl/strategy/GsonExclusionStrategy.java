package com.paazl.strategy;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class GsonExclusionStrategy implements ExclusionStrategy {
    @Override
    public boolean shouldSkipField(FieldAttributes field) {
        return field.getName().startsWith("__");
    }
    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
}
