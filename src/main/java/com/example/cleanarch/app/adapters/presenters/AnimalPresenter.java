package com.example.cleanarch.app.adapters.presenters;

import com.example.cleanarch.app.adapters.controllers.v1.response.AnimalResponseModel;

public interface AnimalPresenter {
    AnimalResponseModel prepareSuccessView(AnimalResponseModel animalResponseModel);
    AnimalResponseModel prepareFailView(String error);
}
