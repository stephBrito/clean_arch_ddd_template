package com.example.cleanarch.app.domain.gateway;

import com.example.cleanarch.app.domain.gateway.request.AnimalDsRequestModel;
import com.example.cleanarch.app.domain.gateway.response.AnimalDsResponseModel;

public interface AnimalRegisterDsGateway {
    AnimalDsResponseModel save(AnimalDsRequestModel requestModel);
}
