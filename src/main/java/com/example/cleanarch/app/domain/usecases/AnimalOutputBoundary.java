package com.example.cleanarch.app.domain.usecases;

import com.example.cleanarch.app.adapters.controllers.v1.request.AnimalRequestModel;
import com.example.cleanarch.app.adapters.controllers.v1.response.AnimalResponseModel;

import java.util.List;

public interface AnimalOutputBoundary {
    List<AnimalResponseModel>  get();
}
