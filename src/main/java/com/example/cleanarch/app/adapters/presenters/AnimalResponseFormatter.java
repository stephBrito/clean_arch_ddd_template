package com.example.cleanarch.app.adapters.presenters;

import com.example.cleanarch.app.adapters.controllers.v1.response.AnimalResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class AnimalResponseFormatter implements AnimalPresenter{

    @Override
    public AnimalResponseModel prepareSuccessView(AnimalResponseModel response) {
        return response;
    }

    @Override
    public AnimalResponseModel prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

}
