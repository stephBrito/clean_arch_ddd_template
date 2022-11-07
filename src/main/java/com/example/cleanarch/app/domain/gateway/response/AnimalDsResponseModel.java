package com.example.cleanarch.app.domain.gateway.response;

import java.time.LocalDate;

public class AnimalDsResponseModel {

    private Integer id;
    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public AnimalDsResponseModel(Integer id, String name, LocalDate birthDate, String breed, String color, String kind) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    public Integer getId() {
        return id;
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
