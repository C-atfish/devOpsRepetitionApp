package com.example.devopsrepetitionapp.controller

import com.example.devopsrepetitionapp.services.AnimalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpResponse


@RestController
class AnimalController(
    @Autowired private val animalService: AnimalService
) {


    @GetMapping("/animals")
    fun getAnimals(): String{

        animalService.getAllAnimals();

        return "All your animals";

    }

    @PostMapping("/animals")
    fun addAnimal(){
        animalService.addNewAnimal();
    }

}