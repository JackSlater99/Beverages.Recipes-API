package com.example.Postgres.Test.controllers;

import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {
    @Autowired
    IngredientRepository ingredientRepository;

    @GetMapping("/ingredients")
    public ResponseEntity<List<RawIngredient>> getAllIngredients(
            @RequestParam(name = "name", required = false) String name){
               if (name != null) {
                   return new ResponseEntity<>(ingredientRepository.findAllByNameIgnoreCase(name), HttpStatus.OK);
               }
               return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/ingredients/{id}")
    public ResponseEntity<RawIngredient> getIngredient(@PathVariable Long id) {
        return new ResponseEntity(ingredientRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/ingredients")
    public ResponseEntity<RawIngredient> postIngredient(@RequestBody RawIngredient ingredient){
        ingredientRepository.save(ingredient);
        return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
    }

    @PutMapping(value="/ingredients/{id}")
    public ResponseEntity<RawIngredient> putIngredient(@RequestBody RawIngredient ingredient, @PathVariable Long id){
        RawIngredient ingredientToUpdate = ingredientRepository.findById(id).get();
        ingredientToUpdate.setName(ingredient.getName());
        ingredientToUpdate.setImage(ingredient.getImage());
        ingredientToUpdate.setAlcoholic(ingredient.getAlcoholic());
        ingredientToUpdate.setDescription(ingredient.getDescription());
        ingredientRepository.save(ingredientToUpdate);
        return new ResponseEntity<>(ingredientToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/ingredients/{id}")
    public ResponseEntity<Long> deleteIngredient(@PathVariable Long id){
        ingredientRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
