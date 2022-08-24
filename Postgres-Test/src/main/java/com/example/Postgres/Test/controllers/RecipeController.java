package com.example.Postgres.Test.controllers;

import com.example.Postgres.Test.models.Recipe;
import com.example.Postgres.Test.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        return new ResponseEntity<>(recipeRepository.findAll(), HttpStatus.OK);
    }
}
