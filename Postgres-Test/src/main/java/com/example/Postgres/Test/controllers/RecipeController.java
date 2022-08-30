package com.example.Postgres.Test.controllers;

import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.Recipe;
import com.example.Postgres.Test.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public ResponseEntity<List<Recipe>> getAllRecipes(
            @RequestParam(name = "name", required = false)String name,
            @RequestParam(name = "author", required = false) String author,
            @RequestParam(name = "type", required = false) String type,
            @RequestParam(name = "difficulty", required = false) String difficulty,
            @RequestParam(name = "preptime", required = false) Integer prepTime
    ){
        if (name != null) {
            return new ResponseEntity<>(recipeRepository.findByNameIgnoreCase(name), HttpStatus.OK);
        } else if (author != null) {
            return new ResponseEntity<>(recipeRepository.findAllByAuthorIgnoreCase(author), HttpStatus.OK);
        } else if (type != null) {
            return new ResponseEntity<>(recipeRepository.findAllByTypeIgnoreCase(type), HttpStatus.OK);
        } else if (difficulty != null) {
            return new ResponseEntity<>(recipeRepository.findAllByDifficultyIgnoreCase(difficulty), HttpStatus.OK);
        } else if (prepTime != null) {
            return new ResponseEntity<>(recipeRepository.findAllByPrepTimeLessThanEqual(prepTime), HttpStatus.OK);
        }
        return new ResponseEntity<>(recipeRepository.findAllByApprovedTrueOrderByTypeAsc(), HttpStatus.OK);
    }

    @GetMapping(value="/recipes/alcoholic")
    public ResponseEntity<Recipe> getRecipeIfAlcoholic() {
        return new ResponseEntity(recipeRepository.findDistinctByIngredientsRawIngredientAlcoholicIsTrue(), HttpStatus.OK);
    }

    @GetMapping(value="/recipes/search/{name}")
    public ResponseEntity<Recipe> getRecipeId(@PathVariable String name) {
        return new ResponseEntity(recipeRepository.findIdByNameIgnoreCase(name), HttpStatus.OK);
    }

    @GetMapping(value="/recipes/{id}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable Long id) {
        return new ResponseEntity(recipeRepository.findById(id), HttpStatus.OK);
    }
    @PostMapping("/recipes")
    public ResponseEntity<Recipe> postRecipe(@RequestBody Recipe recipe){
        recipeRepository.save(recipe);
        return new ResponseEntity<>(recipe, HttpStatus.CREATED);
    }

    @PutMapping(value="/recipes/{id}")
    public ResponseEntity<Recipe> putRecipe(@RequestBody Recipe recipe, @PathVariable Long id){
        Recipe recipeToUpdate = recipeRepository.findById(id).get();
        recipeToUpdate.setName(recipe.getName());
        recipeToUpdate.setAuthor(recipe.getAuthor());
        recipeToUpdate.setApproved(recipe.getApproved());
        recipeToUpdate.setType(recipe.getType());
        recipeToUpdate.setRating(recipe.getRating());
        recipeToUpdate.setAccumulatedRating(recipe.getAccumulatedRating());
        recipeToUpdate.setNumberOfRatings(recipe.getNumberOfRatings());
        recipeToUpdate.setImage(recipe.getImage());
        recipeToUpdate.setDifficulty(recipe.getDifficulty());
        recipeToUpdate.setPrepTime(recipe.getPrepTime());
        recipeToUpdate.setVideo(recipe.getVideo());
        recipeRepository.save(recipeToUpdate);
        return new ResponseEntity<>(recipeToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/recipes/{id}")
    public ResponseEntity<Long> deleteRecipe(@PathVariable Long id){
        recipeRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
