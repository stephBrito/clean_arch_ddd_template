package com.example.cleanarch.app.domain.entities;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CommonAnimalFactory implements AnimalFactory {

    @Override
    public Animal create(String name, LocalDate birthDate, String breed, String color, String kind) throws Exception {
        return new CommonAnimal(name, birthDate, breed, color, kind);
    }

}
