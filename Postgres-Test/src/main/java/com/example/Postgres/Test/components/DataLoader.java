package com.example.Postgres.Test.components;

import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.Recipe;
import com.example.Postgres.Test.models.RecipeIngredient;
import com.example.Postgres.Test.repositories.IngredientRepository;
import com.example.Postgres.Test.repositories.RecipeIngredientRepository;
import com.example.Postgres.Test.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        RawIngredient milk = new RawIngredient("Milk", "https://i.imgur.com/49CWlbF.jpg", Boolean.FALSE, "");
        ingredientRepository.save(milk);

        RawIngredient groundEspresso = new RawIngredient("Ground Espresso", "https://i.imgur.com/KhZQ9Oq.jpg", Boolean.FALSE, "" );
        ingredientRepository.save(groundEspresso);

        RawIngredient drinkingChocolate = new RawIngredient("Drinking Chocolate", "https://i.imgur.com/o0KXhGQ.jpg", Boolean.FALSE, "Drinking chocolate, or sipping chocolate, is exactly what it sounds like – luxurious, melted chocolate you can drink!");
        ingredientRepository.save(drinkingChocolate);

        RecipeIngredient recipeIngredient1 = new RecipeIngredient(milk, 100, "ml");
        recipeIngredientRepository.save(recipeIngredient1);
        RecipeIngredient recipeIngredient2 = new RecipeIngredient(groundEspresso, 18, "g");
        recipeIngredientRepository.save(recipeIngredient2);
        RecipeIngredient recipeIngredient3 = new RecipeIngredient(milk, 250, "ml");
        recipeIngredientRepository.save(recipeIngredient3);
        RecipeIngredient recipeIngredient4 = new RecipeIngredient(drinkingChocolate, 1, "tsp");
        recipeIngredientRepository.save(recipeIngredient4);

//
        Recipe recipe1 = new Recipe(
                "Flat White",
                "Coffee",
                0,
                "https://i.imgur.com/vWWmMbP.jpg",
                "Easy",
                3,
                "Placeholder Instructions Postgres Test",
                "https://youtu.be/-50tS3d2Yao"
        );


        recipe1.addIngredients(recipeIngredient1);
        recipe1.addIngredients(recipeIngredient2);
        recipeRepository.save(recipe1);

        Recipe recipe2 = new Recipe(
                "Mocha",
                "Coffee",
                0,
                "https://i.imgur.com/jiN9sSV.jpg",
                "Easy",
                3,
                "Placeholder Instructions",
                "https://youtu.be/g86JjlpegIM"
        );

        recipe2.addIngredients(recipeIngredient2);
        recipe2.addIngredients(recipeIngredient3);
        recipe2.addIngredients(recipeIngredient4);
        recipeRepository.save(recipe2);
    }
}
