package com.example.cleanarch.app.domain.usecases;

import com.example.cleanarch.app.adapters.controllers.v1.request.AnimalRequestModel;
import com.example.cleanarch.app.adapters.controllers.v1.response.AnimalResponseModel;


/*
 * output boundary in order to use external layers
 */
public interface AnimalInputBoundary {
    AnimalResponseModel create(AnimalRequestModel requestModel);
}
