package com.example.cleanarch.app.infrastructure.database.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "Animal")
@Table(name = "animal", schema = "public")
public class AnimalDataMapper implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    public AnimalDataMapper(String name, LocalDate birthDate, String breed, String color, String kind) {
        this.id = null;
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
