package com.channeladvisor.models;

public class Oauth2Callback {
    private String access_token;
    private String token_type;
    private Integer expires_in;
    private String state;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
