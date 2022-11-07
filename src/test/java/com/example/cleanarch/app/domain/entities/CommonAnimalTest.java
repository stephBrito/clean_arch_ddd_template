package com.example.cleanarch.app.domain.entities;

import com.example.cleanarch.app.domain.exceptions.InvalidAnimalAtributteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CommonAnimalTest {

    @Test
    public void createNewAnimalRightWay(){
        Assertions.assertDoesNotThrow(() -> new CommonAnimal("rex", LocalDate.now(), "pitbull", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidBirthDate(){
        var birthDate = LocalDate.now().plusDays(1);
        Assertions.assertThrows(InvalidAnimalAtributteException.class, () -> new CommonAnimal("rex", birthDate, "pitbull", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidName(){
        Assertions.assertThrows(InvalidAnimalAtributteException.class, () -> new CommonAnimal("", LocalDate.now().minusYears(1), "pitbull", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidColor(){
        Assertions.assertThrows(InvalidAnimalAtributteException.class, () -> new CommonAnimal("rex", LocalDate.now(), "pitbull", "    ", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidBreed(){
        Assertions.assertThrows(InvalidAnimalAtributteException.class, () -> new CommonAnimal("rex", LocalDate.now().minusYears(1), "", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidKind(){
        Assertions.assertThrows(InvalidAnimalAtributteException.class, () -> new CommonAnimal("rex", LocalDate.now().minusYears(1), "pitbull", "black", null));
    }

}
