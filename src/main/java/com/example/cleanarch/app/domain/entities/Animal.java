package com.example.cleanarch.app.domain.entities;

import java.time.LocalDate;

public interface Animal {

    String getName();
    LocalDate getBirthDate();
    String getBreed();
    String getColor();
    Integer getAge();
    String getKind();

}
