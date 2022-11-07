package com.example.cleanarch.app.infrastructure.database.repository;

import com.example.cleanarch.app.infrastructure.database.model.AnimalDataMapper;
import com.example.cleanarch.app.domain.gateway.request.AnimalDsRequestModel;
import com.example.cleanarch.app.domain.gateway.AnimalRegisterDsGateway;
import com.example.cleanarch.app.domain.gateway.response.AnimalDsResponseModel;
import org.springframework.stereotype.Component;

@Component
public class JpaAnimal implements AnimalRegisterDsGateway {

    private final AnimalRepository animalRepository;

    public JpaAnimal(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public AnimalDsResponseModel save(AnimalDsRequestModel requestModel) {

        AnimalDataMapper animalDataMapper = new AnimalDataMapper(requestModel.getName(), requestModel.getBirthDate(),
                requestModel.getBreed(), requestModel.getColor(), requestModel.getKind());

        animalRepository.save(animalDataMapper);

        return new AnimalDsResponseModel(animalDataMapper.getId(), animalDataMapper.getName(), animalDataMapper.getBirthDate(),
                animalDataMapper.getBreed(), animalDataMapper.getColor(), animalDataMapper.getKind());

    }
}
