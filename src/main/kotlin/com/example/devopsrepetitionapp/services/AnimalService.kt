package com.example.devopsrepetitionapp.services

import com.example.devopsrepetitionapp.models.Animal
import org.springframework.stereotype.Service

@Service
class AnimalService {



    fun getAllAnimals(){
        print("Here are all your animals");

    }

    fun addNewAnimal(){

        print("New animal added");
    }

}