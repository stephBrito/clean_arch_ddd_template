package com.example.cleanarch.app.adapters.controllers.v1.response;

import java.time.LocalDate;

public class AnimalResponseModel {

    private Integer code;
    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public AnimalResponseModel(Integer code, String name, LocalDate birthDate, String breed, String color, String kind) {
        this.code = code;
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    public Integer getCode() {
        return code;
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
