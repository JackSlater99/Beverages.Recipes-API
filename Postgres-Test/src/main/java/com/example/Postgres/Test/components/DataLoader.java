package com.example.Postgres.Test.components;

import com.example.Postgres.Test.models.Instructions;
import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.Recipe;
import com.example.Postgres.Test.models.RecipeIngredient;
import com.example.Postgres.Test.repositories.IngredientRepository;
import com.example.Postgres.Test.repositories.InstructionRepository;
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

    @Autowired
    InstructionRepository instructionRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        RawIngredient milk = new RawIngredient("Milk", "https://i.imgur.com/49CWlbF.jpg", Boolean.FALSE, "");
        ingredientRepository.save(milk);
        RawIngredient groundEspresso = new RawIngredient("Ground Espresso", "https://i.imgur.com/KhZQ9Oq.jpg", Boolean.FALSE, "" );
        ingredientRepository.save(groundEspresso);
        RawIngredient drinkingChocolate = new RawIngredient("Drinking Chocolate", "https://i.imgur.com/o0KXhGQ.jpg", Boolean.TRUE, "Drinking chocolate, or sipping chocolate, is exactly what it sounds like – luxurious, melted chocolate you can drink!");
        ingredientRepository.save(drinkingChocolate);


        // COFFEE

        RecipeIngredient recipeIngredient1 = new RecipeIngredient(milk, 100, "ml");
        recipeIngredientRepository.save(recipeIngredient1);
        RecipeIngredient recipeIngredient2 = new RecipeIngredient(groundEspresso, 18, "g");
        recipeIngredientRepository.save(recipeIngredient2);
        RecipeIngredient recipeIngredient3 = new RecipeIngredient(milk, 250, "ml");
        recipeIngredientRepository.save(recipeIngredient3);
        RecipeIngredient recipeIngredient4 = new RecipeIngredient(drinkingChocolate, 1, "tsp");
        recipeIngredientRepository.save(recipeIngredient4);

        Recipe recipe1 = new Recipe(
                "Flat White",
                "Jack",
                true,
                "Coffee",
                0,
                "https://i.imgur.com/vWWmMbP.jpg",
                "Easy",
                3,
                "https://youtu.be/-50tS3d2Yao"
        );

        recipe1.addIngredients(recipeIngredient1);
        recipe1.addIngredients(recipeIngredient2);
        recipeRepository.save(recipe1);
        Instructions recipeOneInstruction1 = new Instructions("Make around 35ml espresso using your coffee machine and pour into the base of your cup.", recipe1);
        instructionRepository.save(recipeOneInstruction1);
        Instructions recipeOneInstruction2 = new Instructions("Steam the milk with the steamer attachment so that it has around 1-2cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming to pour into the centre. Once the milk jug is almost touching the surface of the coffee, tilt the jug to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.", recipe1);
        instructionRepository.save(recipeOneInstruction2);


        Recipe recipe2 = new Recipe(
                "Mocha",
                "John",
                false,
                "Beer",
                0,
                "https://i.imgur.com/jiN9sSV.jpg",
                "Medium",
                5,
                "https://youtu.be/g86JjlpegIM"
        );

        recipe2.addIngredients(recipeIngredient2);
        recipe2.addIngredients(recipeIngredient3);
        recipe2.addIngredients(recipeIngredient4);
        recipeRepository.save(recipe2);
        Instructions recipeTwoInstruction1 = new Instructions("Make around 35ml espresso using a coffee machine and pour into the base of your cup. Add the drinking chocolate and mix well until smooth.", recipe2);
        instructionRepository.save(recipeTwoInstruction1);
        Instructions recipeTwoInstruction2 = new Instructions("Steam the milk with the steamer attachment so that it has around 4-6cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming into the centre. Once the milk jug is almost touching the surface of the coffee, tilt to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.", recipe2);
        instructionRepository.save(recipeTwoInstruction2);


        // MOCKTAILS

    }
}
