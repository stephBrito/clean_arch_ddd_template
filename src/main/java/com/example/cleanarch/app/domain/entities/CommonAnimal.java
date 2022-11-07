package com.example.cleanarch.app.domain.entities;

import com.example.cleanarch.app.domain.exceptions.InvalidAnimalAtributteException;

import java.time.LocalDate;
import java.util.Objects;

/*
 * this class will be created using the factory AnimalFactory
 */
public class CommonAnimal implements Animal{

    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

    private CommonAnimal(){

    }

    protected CommonAnimal(String name, LocalDate birthDate, String breed, String color, String kind) throws Exception {
        validate(name, birthDate, breed, color, kind);
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
        this.kind = kind;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidAnimalAtributteException {
        validateStringFields(name);
        this.name = name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws Exception {
        validateBirthDate(birthDate);
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) throws InvalidAnimalAtributteException {
        validateStringFields(breed);
        this.breed = breed;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) throws InvalidAnimalAtributteException {
        validateStringFields(color);
        this.color = color;
    }

    @Override
    public Integer getAge(){
        return LocalDate.now().getYear() - this.birthDate.getYear();
    }

    @Override
    public String getKind() {
        return kind;
    }

    private void validate(String name, LocalDate birthDate, String breed, String color, String kind) throws InvalidAnimalAtributteException {
        validateBirthDate(birthDate);
        validateStringFields(name);
        validateStringFields(breed);
        validateStringFields(color);
        validateStringFields(kind);
    }

    private void validateBirthDate(LocalDate birthDate) throws InvalidAnimalAtributteException {
        if (birthDate.isAfter(LocalDate.now()))
            throw new InvalidAnimalAtributteException("birthDate cannot be after now");
    }

    private void validateStringFields(String attribute) throws InvalidAnimalAtributteException {
        if (attribute == null || attribute.isEmpty() || attribute.isBlank())
            throw new InvalidAnimalAtributteException("invalid, null or blank attribute");
    }

    @Override
    public String toString() {
        return "CommonAnimal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonAnimal that = (CommonAnimal) o;
        return Objects.equals(name, that.name) && Objects.equals(birthDate, that.birthDate) && Objects.equals(breed, that.breed) && Objects.equals(color, that.color) && Objects.equals(kind, that.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, breed, color, kind);
    }

}
