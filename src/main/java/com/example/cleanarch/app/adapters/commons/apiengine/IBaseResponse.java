package com.example.cleanarch.app.adapters.commons.apiengine;

import io.swagger.models.Response;

public interface IBaseResponse<T> {
    public T getBody();

    public String getContent();

    public int getStatusCode();

    public boolean isSuccessful();

    public String getStatusDescription();

    public Response getResponse();

    public Exception getException();
}
