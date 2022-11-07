package com.example.cleanarch.app.adapters.services;

import com.example.cleanarch.app.adapters.controllers.v1.request.AnimalRequestModel;
import com.example.cleanarch.app.adapters.controllers.v1.response.AnimalResponseModel;
import com.example.cleanarch.app.adapters.presenters.AnimalPresenter;
import com.example.cleanarch.app.domain.entities.Animal;
import com.example.cleanarch.app.domain.entities.AnimalFactory;
import com.example.cleanarch.app.domain.gateway.AnimalRegisterDsGateway;
import com.example.cleanarch.app.domain.gateway.request.AnimalDsRequestModel;
import com.example.cleanarch.app.domain.usecases.AnimalInputBoundary;
import org.springframework.stereotype.Component;

/*
 * this class knows the technologies and concret concepts
 * that's because if you want to change some technology like
 * a queue, database, etc the domain layer will not be affected
 */
@Component
public class AnimalRegisterInteractor implements AnimalInputBoundary {

    private final AnimalRegisterDsGateway animalRegisterDsGateway;
    private final AnimalFactory animalFactory;
    private final AnimalPresenter animalPresenter;

    public AnimalRegisterInteractor(AnimalRegisterDsGateway animalRegisterDsGateway, AnimalFactory animalFactory, AnimalPresenter animalPresenter) {
        this.animalRegisterDsGateway = animalRegisterDsGateway;
        this.animalFactory = animalFactory;
        this.animalPresenter = animalPresenter;
    }

    @Override
    public AnimalResponseModel create(AnimalRequestModel requestModel) {

        try {

            Animal animal = animalFactory.create(requestModel.getName(),
                    requestModel.getBirthDate(), requestModel.getBreed(), requestModel.getColor(),
                    requestModel.getKind());

            AnimalDsRequestModel animalDsRequestModel = new AnimalDsRequestModel(animal.getName(),
                    animal.getBirthDate(), animal.getBreed(), animal.getColor(),
                    animal.getKind());

            var savedAnimal = animalRegisterDsGateway.save(animalDsRequestModel);

            var animalResponseModel = new AnimalResponseModel(savedAnimal.getId(), savedAnimal.getName(), savedAnimal.getBirthDate(), savedAnimal.getBreed(),
                    savedAnimal.getColor(), savedAnimal.getKind());

            return animalPresenter.prepareSuccessView(animalResponseModel);

        } catch (Exception e) {
            //log something here
            return animalPresenter.prepareFailView(e.getMessage());
        }
    }
}
