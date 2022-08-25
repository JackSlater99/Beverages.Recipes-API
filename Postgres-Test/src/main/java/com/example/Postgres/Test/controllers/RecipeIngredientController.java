package com.example.Postgres.Test.controllers;

import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.RecipeIngredient;
import com.example.Postgres.Test.repositories.RecipeIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeIngredientController {

    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    @GetMapping("/recipe-ingredients")
    public ResponseEntity<List<RecipeIngredient>> getAllRecipeIngredients() {
        return new ResponseEntity<>(recipeIngredientRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/recipe-ingredients/{id}")
    public ResponseEntity<RawIngredient> getIngredient(@PathVariable Long id) {
        return new ResponseEntity(recipeIngredientRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/recipe-ingredients")
    public ResponseEntity<RecipeIngredient> postRecipeIngredient(@RequestBody RecipeIngredient ingredient){
        recipeIngredientRepository.save(ingredient);
        return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
    }

    @PutMapping(value="/recipe-ingredients/{id}")
    public ResponseEntity<RecipeIngredient> putRecipeIngredient(@RequestBody RecipeIngredient ingredient, @PathVariable Long id){
        RecipeIngredient RecipeIngredientToUpdate = recipeIngredientRepository.findById(id).get();
        RecipeIngredientToUpdate.setRawIngredient(ingredient.getRawIngredient());
        RecipeIngredientToUpdate.setQuantity(ingredient.getQuantity());
        RecipeIngredientToUpdate.setUnits(ingredient.getUnits());
        recipeIngredientRepository.save(RecipeIngredientToUpdate);
        return new ResponseEntity<>(RecipeIngredientToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/recipe-ingredients/{id}")
    public ResponseEntity<Long> deleteRecipeIngredient(@PathVariable Long id){
        recipeIngredientRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
