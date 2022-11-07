package com.example.cleanarch.app.domain.entities;


import java.time.LocalDate;

public interface AnimalFactory {
    Animal create(String name, LocalDate birthDate, String breed, String color, String kind) throws Exception;
}
