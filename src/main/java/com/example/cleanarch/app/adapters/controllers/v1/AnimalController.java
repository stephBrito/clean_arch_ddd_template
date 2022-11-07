package com.example.cleanarch.app.adapters.controllers.v1;

import com.example.cleanarch.app.adapters.controllers.v1.request.AnimalRequestModel;
import com.example.cleanarch.app.domain.usecases.AnimalInputBoundary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/animals")
public class AnimalController {

    private final AnimalInputBoundary inputBoundary;

    public AnimalController(AnimalInputBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }

    @PostMapping
    public ResponseEntity<?> createAnimal(@RequestBody AnimalRequestModel animalRequestModel){
        //change to created
        return ResponseEntity.ok(inputBoundary.create(animalRequestModel));
    }

    @GetMapping
    public ResponseEntity<?> getAnimal(){
        //change to get
        return ResponseEntity.ok().build();
    }
}
