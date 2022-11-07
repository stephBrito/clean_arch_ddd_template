package com.example.cleanarch.app.adapters.controllers.v1.request;

import java.time.LocalDate;

public class AnimalRequestModel {

    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public AnimalRequestModel(String name, LocalDate birthDate, String breed, String color, String kind) {
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }
}
