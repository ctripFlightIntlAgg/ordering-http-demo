package com.ctrip.intlflight.ordering.tokenmanager.http;

public enum HttpMethod {
    GET(false),
    POST(true),
    PUT(true);

    boolean entityRequired;

    HttpMethod(boolean entityRequired) {
        this.entityRequired = entityRequired;
    }

    public boolean isEntityRequired() {
        return entityRequired;
    }
}
