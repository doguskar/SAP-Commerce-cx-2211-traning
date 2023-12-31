package com.channeladvisor.models;

import java.io.Serializable;

public class CustomAttribute implements Serializable {
    private String name;
    private String value;

    public CustomAttribute() {
    }

    public CustomAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
